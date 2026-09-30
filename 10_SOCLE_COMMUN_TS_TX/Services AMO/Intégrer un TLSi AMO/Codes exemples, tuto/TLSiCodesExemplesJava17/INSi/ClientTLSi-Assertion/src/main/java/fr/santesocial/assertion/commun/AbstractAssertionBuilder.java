/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * Classe de base de cr&eacute;ation d'une assertion SAML
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public abstract class AbstractAssertionBuilder {
    /** Gestion des traces */
    private static final Logger log = LogManager.getLogger(AbstractAssertionBuilder.class);

    /** AttributeStatement &agrave; ajouter à l'assertion */
    private AssertionAttributeStatement attributeStatement;

    // les attributs valorisés par les classe dérivées (CpsAssertionBuilder ou
    // VitaleAssertionBuilder)
    /** Fabrique de signature */
    protected ISignatureFactory signFac;

    /** Valeur de l'&eacute;l&eacute;ment Issuer de l'assertion */
    protected String issuer;

    /** Valeur de l'attribut Format de l'Issuer de l'assertion */
    protected String issuerFormat;

    /** valeur du NameID de l'&eacute;l&eacute;ment Subject de l'assertion */
    protected String nameID;

    /**
     * valeur de l'attribut NameQualifier de l'&eacute;l&eacute;ment NameID de
     * l'assertion
     */
    protected String nameQualifier;

    /**
     * Constructeur par d&eacute;faut
     */
    protected AbstractAssertionBuilder() {
	attributeStatement = null;
    }

    /**
     * Constructeur avec un attribut SAML
     * 
     * @param name  nom de l'attribut SAML
     * @param value valeur de l'attribut SAML
     */
    protected AbstractAssertionBuilder(String name, String value) {
	attributeStatement = new AssertionAttributeStatement(new AssertionAttribute(name, value));
    }

    /**
     * ajoute un attribut SAML &agrave; l'AttributeStatement pour les futures
     * assertions
     * 
     * @param name  nom de l'attribut SAML
     * @param value valeur de l'attribut SAML
     */
    public void addAttribute(String name, String value) {
	if (attributeStatement == null) {
	    attributeStatement = new AssertionAttributeStatement();
	}
	attributeStatement.add(new AssertionAttribute(name, value));
    }

    /**
     * supprime un attribut SAML &agrave; l'AttributeStatement pour les futures
     * assertions
     * 
     * @param name nom de l'attribut SAML
     */
    public void delAttribute(String name) {
	if (attributeStatement != null) {
	    attributeStatement.del(name);
	}
    }

    // le suqlette de l'assertion
    private static final String ASSERTION_BASE = "<Assertion xmlns=\"urn:oasis:names:tc:SAML:2.0:assertion\" ID=\"$ID$\" IssueInstant=\"$IssueInstant$\" Version=\"2.0\">"
	    + "<Issuer$IssuerFormat$>$Issuer$</Issuer>"
	    + "<Subject><NameID NameQualifier=\"$NameQualifier$\">$NameID$</NameID></Subject>" + "$AttributeStatement$"
	    + "</Assertion>";

    /**
     * construit une assertion SAML
     * 
     * @param withSignature avec l'&eacute;l&eacute;ment XML-Signature si true,
     *                      sinon sans XML-Signature
     * @param password      le code d'autorisation de signature
     * @return le document contenant l'assertion
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    protected Document buildAssertion(boolean withSignature, String password) throws AssertionException {
	StringBuilder assertion = new StringBuilder(ASSERTION_BASE);
	String id = "_" + UUID.randomUUID().toString();
	remplace(assertion, "$ID$", id);

	GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
	try {
	    XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
	    remplace(assertion, "$IssueInstant$", date.toString());
	} catch (DatatypeConfigurationException e) {
	    log.error("", e);
	    throw new AssertionException(e);
	}

	String attributFormat = "";
	if (issuerFormat != null) {
	    attributFormat = " Format=\"" + issuerFormat + "\"";
	}
	remplace(assertion, "$IssuerFormat$", attributFormat);
	remplace(assertion, "$Issuer$", issuer);
	remplace(assertion, "$NameQualifier$", nameQualifier);
	remplace(assertion, "$NameID$", nameID);

	if ((attributeStatement != null) && (attributeStatement.getAttributeNumber() > 0)) {
	    remplace(assertion, "$AttributeStatement$", attributeStatement.get());
	} else {
	    remplace(assertion, "$AttributeStatement$", "");
	}
	log.debug("Assertion avant signature : " + assertion.toString());

	String completeAssertion;
	// signature si demandé
	if (withSignature) {
	    AssertionSignature signature = new AssertionSignature(assertion.toString(), id, signFac);
	    completeAssertion = signature.signDocument(password);
	} else {
	    completeAssertion = assertion.toString();
	}

	// désérialisation de l'assertion dans un Document
	Document docAssertion = null;
	try {
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    dbf.setNamespaceAware(true);
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    // on parse l'assertion dans un Document
	    docAssertion = db.parse(new InputSource(new StringReader(completeAssertion)));
	    docAssertion.normalize();
	    return docAssertion;
	} catch (Throwable e) {
	    log.error("", e);
	    throw new AssertionException(e);
	}
    }

    /**
     * Sauvegarde un document dans un fichier
     * 
     * @param src le document à sauvegarder
     * @param fileName le nom du fichier de sauvegarde
     */
    protected void saveInFile(DOMSource src, String fileName) {
	try {
	    OutputStream os = new FileOutputStream(fileName);
	    TransformerFactory tf = TransformerFactory.newInstance();
	    Transformer trans = tf.newTransformer();
	    trans.transform(src, new StreamResult(os));
	} catch (Exception e) {
	    log.error("", e);
	}
    }

    /**
     * remplace une chaine par une autre dans un texte
     * 
     * @param texte
     * @param aRemplacer
     * @param nouveau
     */
    private void remplace(StringBuilder texte, String aRemplacer, String nouveau) {
	int indexARemplacer = texte.indexOf(aRemplacer);
	int indexFinAremplacer = indexARemplacer + aRemplacer.length();
	texte.replace(indexARemplacer, indexFinAremplacer, nouveau);
    }
}
