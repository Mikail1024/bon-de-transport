/*******************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2015
 *  Project......: ClientTLSi_Assertion
 *  Summary......: package de génération d'assertions PS et Vitale
 *  Date.........: 15 janvier 2014
 *******************************************************************/

package fr.santesocial.assertion.structure;

import java.io.File;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.opensaml.saml.common.SAMLVersion;
import org.opensaml.saml.saml2.core.Assertion;
import org.opensaml.saml.saml2.core.AttributeStatement;
import org.opensaml.saml.saml2.core.Audience;
import org.opensaml.saml.saml2.core.AudienceRestriction;
import org.opensaml.saml.saml2.core.AuthnContext;
import org.opensaml.saml.saml2.core.AuthnContextClassRef;
import org.opensaml.saml.saml2.core.AuthnStatement;
import org.opensaml.saml.saml2.core.Conditions;
import org.opensaml.saml.saml2.core.Issuer;
import org.opensaml.saml.saml2.core.NameID;
import org.opensaml.saml.saml2.core.Subject;
import org.opensaml.saml.saml2.core.SubjectConfirmation;
import org.opensaml.saml.saml2.core.SubjectConfirmationData;
import org.opensaml.saml.saml2.core.impl.AssertionBuilder;
import org.opensaml.saml.saml2.core.impl.AudienceBuilder;
import org.opensaml.saml.saml2.core.impl.AudienceRestrictionBuilder;
import org.opensaml.saml.saml2.core.impl.AuthnContextBuilder;
import org.opensaml.saml.saml2.core.impl.AuthnContextClassRefBuilder;
import org.opensaml.saml.saml2.core.impl.AuthnStatementBuilder;
import org.opensaml.saml.saml2.core.impl.ConditionsBuilder;
import org.opensaml.saml.saml2.core.impl.IssuerBuilder;
import org.opensaml.saml.saml2.core.impl.NameIDBuilder;
import org.opensaml.saml.saml2.core.impl.SubjectBuilder;
import org.opensaml.saml.saml2.core.impl.SubjectConfirmationBuilder;
import org.opensaml.saml.saml2.core.impl.SubjectConfirmationDataBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.santesocial.assertion.commun.AbstractAssertionSigneeBuilder;
import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.util.ChiffrementUtil;

/**
 * Construction d'une Assertion Structure au standard SAML.
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class StructureAssertionBuilder extends AbstractAssertionSigneeBuilder {

    /**
     * Gestion des traces
     */
    private static final Logger LOG = LogManager.getLogger(StructureAssertionBuilder.class);

    /**
     * Nombre d'heures de validité de l'assertion et minutes de tolerance (decalage
     * serveur)
     */
    private static final int NB_JOURS_VALIDITE_ASSERTION = 7;

    private static final int NB_MINUTES_TOLERANCE = 5;

    /**
     * Nom de l'attribut pour l'identifiant de facturation
     */
    private static final String ATTRIBUT_IDENTIFIANT_FACTURATION = "identifiantFacturation";

    /**
     * Nom de l'attribut "identifiantDeleguant"
     */
    private static final String ATTRIBUT_IDENTIFIANT_DELEGUANT = "identifiantDeleguant";

    /**
     * Nom de l'attribut "PAGM"
     */
    private static final String ATTRIBUT_PAGM = "PAGM";

    /**
     * PGAM
     */
    private String pagm;

    /**
     * Identifiant de facturation
     */
    private String identifiantFacturation;

    /**
     * Identifiant déléguant
     */
    private String identifiantDeleguant;

    /**
     * "NameId"
     */
    private String nameId;

    /**
     * Format du subject
     */
    private String subjectFormat;

    /**
     * Valeur de l'Issuer
     */
    private String issuerValue;

    /**
     * "Recipient" du "SubjectConfirmationData"
     */
    private String subjectConfirmationDataRecipient;

    /**
     * URI de l'Audience
     */
    private String audienceURI;

    static {
	Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    @Override
    protected Assertion creerAssertion(String id) throws AssertionException {
	Instant dateTimeAssertion = Instant.now();
	Assertion assertionStruct = new AssertionBuilder().buildObject();

	assertionStruct.setSchemaLocation(
		"urn:oasis:names:tc:SAML:2.0:assertion http://docs.oasis-open.org/security/saml/v2.0/saml-schema-assertion-2.0.xsd");
	assertionStruct.setID(id);
	assertionStruct.setIssueInstant(Instant.now());
	assertionStruct.setVersion(SAMLVersion.VERSION_20);
	assertionStruct.setIssuer(this.creerIssuer());
	assertionStruct.setSubject(this.creerSubject(dateTimeAssertion));
	assertionStruct.setConditions(this.creerConditions(dateTimeAssertion));
	assertionStruct.getAuthnStatements().add(this.creerAuthnStatements(dateTimeAssertion, id));
	assertionStruct.getAttributeStatements().add(this.creerAttributeStatementPagm());
	assertionStruct.getAttributeStatements().add(this.creerAttributeStatementIdentifiantDeleguant());
	assertionStruct.getAttributeStatements().add(this.creerAttributeStatementIdentifiantFacturation());
	return assertionStruct;
    }

    /**
     * Valorisation de l'identifiant de facturation
     * 
     * @param identifiantFacturation l'identifiant de facturation
     * @return l'instance du builder
     */
    public StructureAssertionBuilder withIdentifiantFacturation(String identifiantFacturation) {
	this.identifiantFacturation = identifiantFacturation;
	return this;
    }

    /**
     * Valorisation de l'identifiant du déléguant
     * 
     * @param identifiantDeleguant l'identifiant du déléguant
     * @return l'instance du builder
     */
    public StructureAssertionBuilder withIdentifiantDeleguant(String identifiantDeleguant) {
	this.identifiantDeleguant = identifiantDeleguant;
	return this;
    }

    /**
     * Valorisation du "NameId"
     * 
     * @param nameId le "NameId"
     * @return l'instance du builder
     */
    public StructureAssertionBuilder withNameId(String nameId) {
	this.nameId = nameId;
	return this;
    }

    /**
     * Valorisation du fichier de convention technique
     * 
     * @param documentConventionFilename le chemin vers le fichier de convention
     *                                   technique
     * @return l'instance du builder
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public StructureAssertionBuilder withConventionTechnique(String documentConventionFilename)
	    throws AssertionException {
	Document documentConventionTechnique = this.creerDocumentConvention(documentConventionFilename);
	this.subjectFormat = this.creerValueTag(documentConventionTechnique, "conv:NameIDFormat");
	this.subjectConfirmationDataRecipient = this.creerValue(documentConventionTechnique, "entityID",
		"conv:SPSSODescriptor");
	this.issuerValue = this.creerValue(documentConventionTechnique, "entityID", "conv:IDPSSODescriptor") + ":"
		+ this.creerValue(documentConventionTechnique, "version", "conv:Convention");
	this.audienceURI = this.creerValue(documentConventionTechnique, "serviceURI", "conv:ServiceBinding");
	// Recuperation de la valeur du PAGM dans la convention
	NodeList nodeList = documentConventionTechnique.getElementsByTagName("conv:RequestedAttribute");
	if (nodeList != null && nodeList.getLength() > 0) {
	    for (int i = 0; i < nodeList.getLength(); i++) {
		for (int j = 0; j < nodeList.getLength(); j++) {
		    String attr = nodeList.item(i).getAttributes().item(j).toString();
		    String expression = "name=\"PAGM\"";
		    if (attr.equals(expression)) {
			Node n = nodeList.item(i);

			this.pagm = n.getTextContent();
			break;
		    }
		}
	    }
	}
	return this;
    }

    /**
     * Valorisation du certificat pour la signature de l'assertion
     * 
     * @param certificateFilename le chemin vers le fichier contenant le certificat
     *                            pour la signature de l'assertion
     * @return l'instance du builder
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public StructureAssertionBuilder withCertificat(String certificateFilename) throws AssertionException {
	return (StructureAssertionBuilder) this.withCertificate(this.obtenirCertificat(certificateFilename));
    }

    /**
     * Valorisation de la clé privée
     * 
     * @param privateKeyFilename le chemin vers le fichier contenant la clé privée
     * @param passphrase         le mot de passe pour accéder à la clé privée
     * @return l'instance du builder
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public StructureAssertionBuilder withPrivateKey(String privateKeyFilename, String passphrase)
	    throws AssertionException {
	return (StructureAssertionBuilder) this.withPrivateKey(this.obtenirClePrivee(privateKeyFilename, passphrase));
    }

    /**
     * Création du document XML dans lequel la convention technique sera copiée
     * 
     * @return le document créée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private Document creerDocumentConvention(String documentConventionFilename) throws AssertionException {
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	dbf.setNamespaceAware(true);
	dbf.setExpandEntityReferences(false);
	;
	try {
	    DocumentBuilder db = dbf.newDocumentBuilder();
	    Document docConvtech = null;
	    docConvtech = db.parse(new File(documentConventionFilename));
	    docConvtech.normalize();
	    return docConvtech;
	} catch (ParserConfigurationException | SAXException | IOException e) {
	    LOG.error("Problème de lecture du fichier de convention technique", e);
	    throw new AssertionException("Problème de lecture du fichier de convention technique");
	}
    }

    /**
     * Création de la valeur à partir de la convention technique
     * 
     * @return la valeur créée
     */
    private String creerValue(Document documentConventionTechnique, String attribut, String tagName) {
	String value = null;

	NodeList nodeList = documentConventionTechnique.getElementsByTagName(tagName);
	if (nodeList != null && nodeList.getLength() > 0) {
	    final Element elValue = (Element) nodeList.item(nodeList.getLength() - 1);
	    value = elValue.getAttribute(attribut);
	} else {
	    LOG.error(attribut + " et/ou " + tagName + " non présent dans la convention technique");
	}

	return value;
    }

    /**
     * Création de la valeur à partir de la convention technique
     * 
     * @return la valeur créée
     */
    private String creerValueTag(Document documentConventionTechnique, String tagName) {
	String value = null;

	NodeList nodeList = documentConventionTechnique.getElementsByTagName(tagName);
	if (nodeList != null && nodeList.getLength() > 0) {

	    final Element elValue = (Element) nodeList.item(nodeList.getLength() - 1);
	    value = elValue.getTextContent();
	} else {
	    LOG.debug(tagName + " non présent dans la convention technique");
	}

	return value;
    }

    /**
     * Renvoie le "NameQualifier" du "Subject"
     * 
     * @return le "NameQualifier" du "Subject"
     */
    private String creerNameQualifier() {
	// Non-renseigné pour cette assertion
	return "";
    }

    /**
     * Renvoie la valeur du "NameId" du "Subject"
     * 
     * @return la valeur du "NameId" du "Subject"
     */
    private String creerNameIdValue() {
	return this.nameId;
    }

    /**
     * Création de l'"Issuer" de l'assertion
     * 
     * @return l'"Issuer" créé
     */
    private Issuer creerIssuer() {
	Issuer issuer = new IssuerBuilder().buildObject();
	issuer.setNameQualifier(this.creerNameQualifier());
	issuer.setValue(this.issuerValue);
	return issuer;
    }

    /**
     * Lecture du certificat nécessaire pour la signature de l'assertion
     * 
     * @return le certificat chargé
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private X509Certificate obtenirCertificat(String certificateFilename) throws AssertionException {
	return ChiffrementUtil.chargerCertificat(certificateFilename);
    }

    /**
     * Lecture de la clé privée
     * 
     * @param privateKeyFilename le chemin vers le fichier contenant la clé privée
     * @param passphrase         le mot de passe pour accéder à la clé privée
     * @return la clé privée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private PrivateKey obtenirClePrivee(String keyFilename, String passphrase) throws AssertionException {
	return ChiffrementUtil.chargerClePrivee(keyFilename, passphrase);
    }

    /**
     * Création du sujet de l'assertion
     * 
     * @param dateTime le timestamp courant
     * @return le sujet créé
     */
    private Subject creerSubject(Instant dateTime) {
	Subject subject = this.creerSubject();
	subject.getSubjectConfirmations().add(this.creerSubjectConfirmation(dateTime));
	return subject;
    }

    /**
     * Création du "Subject" de l'assertion
     * 
     * @return le "Subject" créé
     */
    private Subject creerSubject() {
	NameID ident = new NameIDBuilder().buildObject();
	ident.setValue(this.creerNameIdValue());
	ident.setFormat(this.subjectFormat);
	ident.setNameQualifier(this.creerNameQualifier());

	Subject subject = new SubjectBuilder().buildObject(Subject.DEFAULT_ELEMENT_NAME);
	subject.setNameID(ident);
	return subject;
    }

    /**
     * Création de la confirmation sur le sujet
     * 
     * @param dateTime le timestamp courant
     * @return la confirmation créée
     */
    private SubjectConfirmation creerSubjectConfirmation(Instant dateTime) {
	SubjectConfirmation subjectConfirmation = new SubjectConfirmationBuilder().buildObject();
	subjectConfirmation.setSubjectConfirmationData(this.creerSubjectConfirmationData(dateTime));
	subjectConfirmation.setMethod("urn:oasis:names:tc:SAML:2.0:cm:sender-vouches");
	return subjectConfirmation;
    }

    /**
     * Création des données de la confirmation sur le sujet
     * 
     * @param dateTime le timestamp courant
     * @return les données créées
     */
    private SubjectConfirmationData creerSubjectConfirmationData(Instant dateTime) {
	SubjectConfirmationData subjectConfirmationData = new SubjectConfirmationDataBuilder().buildObject();
	subjectConfirmationData.setNotOnOrAfter(dateTime.plus(NB_JOURS_VALIDITE_ASSERTION, ChronoUnit.DAYS));
	subjectConfirmationData.setRecipient(this.subjectConfirmationDataRecipient);
	return subjectConfirmationData;
    }

    /**
     * Création de l'attribut "identifiant déléguant" de l'assertion
     * 
     * @return les attributs créés
     */
    private AttributeStatement creerAttributeStatementIdentifiantDeleguant() {
	if (null == this.identifiantDeleguant) {
	    return null;
	}

	return this.creerAttributeStatement(ATTRIBUT_IDENTIFIANT_DELEGUANT, this.identifiantDeleguant);
    }

    /**
     * Création de l'attribut "PAGM" de l'assertion
     * 
     * @return les attributs créés
     */
    private AttributeStatement creerAttributeStatementPagm() {
	return this.creerAttributeStatement(ATTRIBUT_PAGM, this.pagm);
    }

    /**
     * Création des attributs de l'assertion
     * 
     * @return les attributs créés
     */
    AttributeStatement creerAttributeStatementIdentifiantFacturation() {
	return this.creerAttributeStatement(ATTRIBUT_IDENTIFIANT_FACTURATION, this.identifiantFacturation);
    }

    /**
     * Renvoie le "AuthnStatement"
     * 
     * @return le "AuthnStatement"
     */
    private AuthnStatement creerAuthnStatements(Instant dateTime, String id) {
	AuthnStatement authnStatement = new AuthnStatementBuilder().buildObject();
	authnStatement.setAuthnInstant(dateTime);
	authnStatement.setSessionIndex(id);
	authnStatement.setAuthnContext(this.creerAuthnContext());
	return authnStatement;
    }

    /**
     * Renvoie le "AuthnContext"
     * 
     * @return le "AuthnContext"
     */
    private AuthnContext creerAuthnContext() {
	AuthnContext authnContext = new AuthnContextBuilder().buildObject();
	authnContext.setAuthnContextClassRef(this.creerAuthnContextClassRef());
	return authnContext;
    }

    /**
     * Renvoie le "AuthnContextClassRef"
     * 
     * @return le "AuthnContextClassRef"
     */
    private AuthnContextClassRef creerAuthnContextClassRef() {
	AuthnContextClassRef authnContextClassRef = new AuthnContextClassRefBuilder().buildObject();
	authnContextClassRef.setURI("urn:oasis:names:tc:SAML:2.0:ac:classes:Password");
	return authnContextClassRef;
    }

    /**
     * Renvoie les "Conditions"
     * 
     * @return les "Conditions"
     * @throws AssertionException
     */
    private Conditions creerConditions(Instant dateTime) throws AssertionException {
	Conditions conditions = new ConditionsBuilder().buildObject();
	conditions.setNotBefore(dateTime.minus(NB_MINUTES_TOLERANCE, ChronoUnit.MINUTES));
	conditions.setNotOnOrAfter(dateTime.plus(NB_JOURS_VALIDITE_ASSERTION, ChronoUnit.HOURS)
		.plus(NB_MINUTES_TOLERANCE, ChronoUnit.MINUTES));
	conditions.getAudienceRestrictions().add(this.creerAudienceRestriction());
	return conditions;
    }

    /**
     * Renvoie les "AudienceRestriction"
     * 
     * @return les "AudienceRestriction"
     * @throws AssertionException
     */
    private AudienceRestriction creerAudienceRestriction() throws AssertionException {
	AudienceRestriction audienceRestriction = new AudienceRestrictionBuilder().buildObject();
	audienceRestriction.getAudiences().add(this.creerAudience());
	return audienceRestriction;
    }

    /**
     * Renvoie le "Audience"
     * 
     * @return le "Audience"
     * @throws AssertionException
     */
    private Audience creerAudience() throws AssertionException {
	Audience audience = new AudienceBuilder().buildObject();
	audience.setURI(this.audienceURI);
	return audience;
    }
}
