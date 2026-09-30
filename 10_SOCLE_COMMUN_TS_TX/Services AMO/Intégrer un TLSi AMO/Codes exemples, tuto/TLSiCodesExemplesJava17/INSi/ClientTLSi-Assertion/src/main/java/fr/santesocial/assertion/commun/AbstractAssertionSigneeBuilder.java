/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2017
 *  Project......: AssertionTLSi
 *  Author.......: DELAUNAN
 *  Summary......: Représentation d'un composant pour la création d'assertion
 *  Date.........: 10 mai 2017 - 10:10:23
 *****************************************************************************/
package fr.santesocial.assertion.commun;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensaml.saml.saml2.core.Assertion;
import org.opensaml.saml.saml2.core.Attribute;
import org.opensaml.saml.saml2.core.AttributeStatement;
import org.opensaml.saml.saml2.core.AttributeValue;
import org.opensaml.saml.saml2.core.impl.AttributeBuilder;
import org.opensaml.saml.saml2.core.impl.AttributeStatementBuilder;
import org.opensaml.core.xml.config.XMLObjectProviderRegistrySupport;
import org.opensaml.core.xml.io.Marshaller;
import org.opensaml.core.xml.io.MarshallerFactory;
import org.opensaml.core.xml.schema.XSString;
import org.opensaml.core.xml.schema.impl.XSStringBuilder;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Représentation d'un composant pour la création d'assertion signée
 */
public abstract class AbstractAssertionSigneeBuilder {
    /**
     * Gestion des traces
     */
    private static final Logger LOG = LogManager.getLogger(AbstractAssertionSigneeBuilder.class);

    /**
     * Certificat pour réaliser la signature de l'assertion.
     */
    private X509Certificate certificate;

    /**
     * Clé privée pour réaliser la signature de l'assertion.
     */
    private PrivateKey privateKey;

    /**
     * Création de l'assertion
     * 
     * @param id l'id de l'assertion
     * @return l'assertion créée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    protected abstract Assertion creerAssertion(String id) throws AssertionException;

    /**
     * Valorisation du certificat nécessaire pour réaliser l'assertion
     * 
     * @param certificate le certificat
     * @return l'instance en cours
     */
    public AbstractAssertionSigneeBuilder withCertificate(X509Certificate certificate) {
	this.certificate = certificate;
	return this;
    }

    /**
     * Valorisation de la clé privée nécessaire pour réaliser l'assertion
     * 
     * @param privateKey la clé privée
     * @return l'instance en cours
     */
    public AbstractAssertionSigneeBuilder withPrivateKey(PrivateKey privateKey) {
	this.privateKey = privateKey;
	return this;
    }

    /**
     * Création d'un noeud XML contenant l'assertion structure attendue
     * 
     * @return le noeud XML créé
     */
    public Node build() {
	try {
	    String id = this.creerId();
	    Assertion assertion = this.creerAssertion(id);
	    Document doc = this.creerDocument();
	    MarshallerFactory marshallerFactory = XMLObjectProviderRegistrySupport.getMarshallerFactory();
	    Marshaller marshaller = marshallerFactory.getMarshaller(assertion);
	    marshaller.marshall(assertion, doc);

	    if (this.withSignature()) {
		this.signerAssertion(id, doc);
	    }

	    LOG.warn("Fin assertion Structure");

	    if (LOG.isDebugEnabled()) {
		// Enregistrement du document après signature
		saveInFile(new DOMSource(doc), "Assertion.xml");
	    }
	    LOG.debug("<< createAssertionStructure");
	    return doc.getFirstChild();

	} catch (Exception e) {
	    LOG.error("", e);
	}

	return null;
    }

    /**
     * Indique que l'assertion est générée ou non avec sa signature
     * 
     * @return l'indicateur
     */
    protected boolean withSignature() {
	return true;
    }

    /**
     * Création du document XML dans lequel l'assertion sera générée
     * 
     * @return le document créée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    protected Document creerDocument() throws AssertionException {
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	dbf.setNamespaceAware(true);
	dbf.setExpandEntityReferences(false);
	try {
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    Document doc = db.newDocument();
	    doc.normalize();
	    return doc;
	} catch (ParserConfigurationException e) {
	    LOG.error("Problème de création du document XML pour créer l'assertion", e);
	    throw new AssertionException("Problème de création du document XML pour créer l'assertion");
	}
    }

    /**
     * Création d'un attribut de type "string" de l'assertion
     * 
     * @param nom    la nom de l'attribut
     * @param valeur la valeur de l'attribut
     * @return l'attribut créé
     */
    protected AttributeStatement creerAttributeStatement(String nom, String valeur) {
	XSString xsString = new XSStringBuilder().buildObject(AttributeValue.DEFAULT_ELEMENT_NAME, XSString.TYPE_NAME);
	xsString.setValue(valeur);

	Attribute attribute = new AttributeBuilder().buildObject();
	attribute.setName(nom);
	attribute.getAttributeValues().add(xsString);

	AttributeStatement attributeStatement = new AttributeStatementBuilder().buildObject();
	attributeStatement.getAttributes().add(attribute);
	return attributeStatement;
    }

    /**
     * Création d'un attribut de type "string" de l'assertion
     * 
     * @param nom    la nom de l'attribut
     * @param valeur la valeur de l'attribut
     * @return l'attribut créé
     */
    protected Attribute creerAttribute(String nom, String valeur) {
	XSString xsString = new XSStringBuilder().buildObject(AttributeValue.DEFAULT_ELEMENT_NAME, XSString.TYPE_NAME);
	xsString.setValue(valeur);

	Attribute attribute = new AttributeBuilder().buildObject();
	attribute.setName(nom);
	attribute.getAttributeValues().add(xsString);

	return attribute;
    }

    /**
     * Renvoie l'algorithme utilisé pour le "digest"
     * 
     * @return l'algorithme utilisé pour le "digest"
     */
    protected String getDigestMethod() {
	return DigestMethod.SHA256;
    }

    /**
     * Renvoie l'algorithme utilisé pour la signature
     * 
     * @return l'algorithme utilisé pour la signature
     */
    protected String getSignatureMethod() {
	return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    }

    /**
     * Permet de signer une assertion Structure
     * 
     * @param id  l'id de l'assertion
     * @param doc le document XML qui contientl'assertion
     * @throws Exception
     */
    private void signerAssertion(String id, Document doc) throws Exception {
	XMLSignatureFactory fac = this.getXmlSignatureFactory();

	// Element <Reference> de <SignedInfo>
	List<Transform> transforms = new ArrayList<Transform>();
	transforms.add(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
	transforms.add(fac.newTransform(CanonicalizationMethod.EXCLUSIVE, (TransformParameterSpec) null));
	Reference ref = fac.newReference("#" + id, fac.newDigestMethod(this.getDigestMethod(), null), transforms, null,
		null);

	// Element <SignedInfo>
	CanonicalizationMethod canoMethod = fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE,
		(C14NMethodParameterSpec) null);
	SignatureMethod signMethod = fac.newSignatureMethod(this.getSignatureMethod(), null);
	SignedInfo signedInfo = fac.newSignedInfo(canoMethod, signMethod, Collections.singletonList(ref));

	// Parcours du document et tagguage de tous les élément avec un ID en attribut
	// dans le xml
	XPath xpath = XPathFactory.newInstance().newXPath();
	XPathExpression expr = xpath.compile("//*[@ID]");
	NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
	for (int i = 0; i < nodeList.getLength(); i++) {
	    Element elem = (Element) nodeList.item(i);
	    Attr attr = (Attr) elem.getAttributes().getNamedItem("ID");
	    elem.setIdAttributeNode(attr, true);
	}

	NodeList nodeListNameID = doc.getElementsByTagNameNS("urn:oasis:names:tc:SAML:2.0:assertion", "NameID");
	Element elNameID = (Element) nodeListNameID.item(0);

	DOMSignContext dsc = new DOMSignContext(this.privateKey, doc.getDocumentElement(), elNameID.getParentNode());

	KeyInfoFactory kif = fac.getKeyInfoFactory();
	X509Data kv = kif.newX509Data(Collections.singletonList(this.certificate));
	KeyInfo ki = kif.newKeyInfo(Collections.singletonList(kv));

	XMLSignature signature = fac.newXMLSignature(signedInfo, ki);
	signature.sign(dsc);
    }

    /**
     * Création de l'id de l'assertion
     * 
     * @return l'id créé
     */
    private String creerId() {
	return "_" + UUID.randomUUID();
    }

    /**
     * Instanciation de la fabrique pour les signatures XML
     * 
     * @return la fabrique créée
     */
    private XMLSignatureFactory getXmlSignatureFactory() {
	return XMLSignatureFactory.getInstance("DOM");
    }

    /**
     * Sauvegarde un document dans un fichier
     * 
     * @param src      le document à sauvegarder
     * @param fileName le nom du fichier de sauvegarde
     */
    protected void saveInFile(DOMSource src, String fileName) {
	try {
	    OutputStream os = new FileOutputStream(fileName);
	    TransformerFactory tf = TransformerFactory.newInstance();
	    Transformer trans = tf.newTransformer();
	    trans.transform(src, new StreamResult(os));
	} catch (Exception e) {
	    LOG.error("", e);
	}
    }
}
