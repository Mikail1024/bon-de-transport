package fr.sesamvitale.lps;

/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

import javax.security.auth.x500.X500Principal;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
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
import org.apache.log4j.PropertyConfigurator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import oasis.names.tc.saml._2_0.assertion.AssertionType;
import oasis.names.tc.saml._2_0.assertion.NameIDType;
import oasis.names.tc.saml._2_0.assertion.ObjectFactory;
import oasis.names.tc.saml._2_0.assertion.SubjectType;

/**
 * Construction d'une Assertion CPS au standard SAML.
 * 
 * @author boucliee
 *
 */
public class AssertionPSBuilder {

	/** Gestion des traces */
	private static final Logger log = LogManager.getLogger(AssertionPSBuilder.class);

	/** Provider name */
	private Provider provider;

	/**
	 * Chemin vers le fichier de configuration de l'interface PKCS11
	 */
	private static final String PKCS11_CONFIG_PATH = ".\\Config\\pkcs11w64.p11";

	/**
	 * Construction d'une assertion PS à l'aide des classes générées par JAX-WS et
	 * XMLSignature (DOM)
	 * 
	 * @param pin code porteur de la CPS.
	 * @return le noeud de l'assertion
	 * @throws AssertionException en cas de problème de génération de l'assertion
	 */
	public Node buildAssertionPS(String pin) throws AssertionException {
		log.debug(">> buildAssertionPS");

		// Enregistrement du provider cryptoLib CPS
		// ----------------------------------------
		log.warn("-DEB- Enregistrement cryptolib");

		try {
			this.provider = Security.getProvider("SunPKCS11");
			this.provider = this.provider.configure(PKCS11_CONFIG_PATH);
			Security.addProvider(provider);
		} catch (ProviderException e) {
			log.error(
					"Problème de compatibilité entre la version de la JVM et la version de la Cryptolib (32 bits / 64 bits ?)");
			throw e;
		}
		// Ajout la liste des providers du poste
		if (Security.getProvider(provider.getName()) != null) {
			Security.removeProvider(provider.getName());
		}
		Security.insertProviderAt(provider, 0);

		log.warn("-FIN- Enregistrement cryptolib");

		try {

			// Chargement du keystore PKCS11
			// -----------------------------
			log.warn("-DEB- Lecture Keystore CPS");
			KeyStore keystorePkcs11 = KeyStore.getInstance("PKCS11", provider);
			keystorePkcs11.load(null, pin.toCharArray());
			/*
			 * keystorePkcs11 = KeyStore.getInstance("PKCS11", provider.getName());
			 * keystorePkcs11.load(null, pin.toCharArray());
			 */
			log.warn("-FIN- Lecture Keystore CPS");

			log.warn("-DEB- Lecture du certificat de signature");

			// Recherche du certificat X509 de signature dans le keyStore
			// -----------------------------------------------------------
			String aliasSignature = null;
			X509Certificate cert = null;
			Enumeration<String> aliases = keystorePkcs11.aliases();
			while (aliases.hasMoreElements() && aliasSignature == null) {
				String alias = aliases.nextElement();
				log.info("#### Alias=" + alias);
				cert = (X509Certificate) keystorePkcs11.getCertificate(alias);
				if (cert.getExtendedKeyUsage().get(0).endsWith("4")) {
					log.info("Certificat de signature chargé");
					// log.warn(cert);
					aliasSignature = alias;
				}
			}
			if (aliasSignature == null)
				throw new AssertionException("Certificat de signature CPS absent!");

			// Recuperation de la cle privee du certificat de signature
			// --------------------------------------------------------
			PrivateKey privateKey = (PrivateKey) keystorePkcs11.getKey(aliasSignature, pin.toCharArray());
			log.info("Clé privée du certificat chargée");
			log.warn("-FIN- Lecture du certificat de signature");

			// Construction de l'assertion
			// ---------------------------

			ObjectFactory oasisFactory = new ObjectFactory();
			AssertionType assertionType = oasisFactory.createAssertionType();

			// Mise à jour ID
			UUID uuid = UUID.randomUUID();
			String id = "_" + uuid.toString();
			assertionType.setID(id);

			// Issue Instant --> Date du jour
			GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			assertionType.setIssueInstant(date);

			// Mise à jour de la version
			assertionType.setVersion("2.0");

			// Recuperation du DN
			String dn = cert.getSubjectX500Principal().getName(X500Principal.RFC1779);
			log.info("dn=" + cert.getSubjectX500Principal().getName());

			// Valorisation de Issuer
			// ----------------------
			NameIDType issuer = oasisFactory.createNameIDType();
			issuer.setFormat("urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName");
			issuer.setValue(dn);
			assertionType.setIssuer(issuer);

			// Valorisation de NameID (= Identifiant national)
			// -----------------------------------------------

			// Recuperation de l'issuer
			String dnIssuer = null;
			if (dn != null) {
				int indexDeb = dn.indexOf("CN=");
				if (indexDeb != -1) {
					indexDeb += 3;
					int indexFin = dn.indexOf(" ", indexDeb);
					if (indexFin != -1) {
						dnIssuer = dn.substring(indexDeb, indexFin);
					}
				}
			}
			if (dnIssuer != null) {
				SubjectType subject = oasisFactory.createSubjectType();
				NameIDType nameIDType = oasisFactory.createNameIDType();

				// Valorisation de NameID@NameQualifier
				String gipCardType = null;
				byte[] bytes = cert.getExtensionValue("1.2.250.1.71.1.2.2");
				if (bytes == null || bytes.length == 0) {
					log.debug("Ext GipCardType non trouvé");
				} else if (bytes.length != 5) {
					log.error("Ext GipCardType invalide");
				} else {
					switch (bytes[4]) {
					case 0:
						gipCardType = "CPS";
						break;
					case 1:
						gipCardType = "CPF";
						break;
					case 2:
						gipCardType = "CDE-CPE";
						break;
					case 3:
						gipCardType = "CPA";
						break;
					default:
						log.error("GipCardType inconnu " + bytes[4]);
						gipCardType = null;
						break;
					}
					if (gipCardType != null) {
						nameIDType.setNameQualifier(gipCardType);
						nameIDType.setValue(dnIssuer);
						JAXBElement<NameIDType> nameID = oasisFactory.createNameID(nameIDType);
						subject.getContent().add(nameID);
						assertionType.setSubject(subject);
					}
				}
			}

			// Marshall en document DOM pour Signature
			log.info("Marshall de l'assertion en document DOM pour Signature");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			doc.normalize();

			// XMLSignature
			// ------------
			log.warn("-DEB- signature CPS");

			// Chargement du provider
			final XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

			// Element <Reference> de <SignedInfo>
			List<Transform> transforms = new ArrayList<Transform>();
			transforms.add(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
			transforms.add(fac.newTransform(CanonicalizationMethod.EXCLUSIVE, (TransformParameterSpec) null));
			Reference ref = fac.newReference("#" + id, fac.newDigestMethod(DigestMethod.SHA1, null), transforms, null,
					null);

			// Element <SignedInfo>
			CanonicalizationMethod canoMethod = fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE,
					(C14NMethodParameterSpec) null);
			SignatureMethod signMethod = fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null);
			SignedInfo signedInfo = fac.newSignedInfo(canoMethod, signMethod, Collections.singletonList(ref));

			// Element <KeyInfo> avec ajout de <X509Data>
			KeyInfoFactory keyInfoFactory = fac.getKeyInfoFactory();
			X509Data x509Data = keyInfoFactory.newX509Data(Collections.singletonList(cert));
			KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));

			// Element <Signature> avant <saml:Subject>
			NodeList nodeList = doc.getElementsByTagNameNS("urn:oasis:names:tc:SAML:2.0:assertion", "Assertion");
			final Element elAssertion = (Element) nodeList.item(0);

			NodeList nodeList2 = doc.getElementsByTagNameNS("urn:oasis:names:tc:SAML:2.0:assertion", "Subject");
			final Element elSubject = (Element) nodeList2.item(0);

			DOMSignContext valContext = new DOMSignContext(privateKey, elAssertion, elSubject);

			XMLSignature sig = fac.newXMLSignature(signedInfo, keyInfo);
			sig.sign(valContext);

			// Enregistrement du document après signature
			OutputStream os = new FileOutputStream("assertions/AssertionPS_Temp.xml");
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer trans = tf.newTransformer();
			trans.transform(new DOMSource(doc), new StreamResult(os));

			log.warn("-FIN- signature CPS");

			log.debug("<< buildAssertionPS");

			return doc.getFirstChild();

		} catch (Throwable e) {
			log.error("", e);
			throw new AssertionException(e);
		}
	}

	/**
	 * Construction d'une assertion PS à l'aide des classes générées par JAX-WS.
	 * 
	 * @param pin code porteur de la CPS.
	 * @return le noeud de l'assertion
	 * @throws AssertionException en cas de problème de génération de l'assertion
	 */
	public Node buildAssertionPSFromWSDLObjects(String pin) throws AssertionException {

		// Enregistrement du provider cryptoLib CPS
		// ----------------------------------------
		log.warn("-DEB- Enregistrement cryptolib");
		log.info("Loading Sun PKCS11 security provider...");
		try {
			this.provider = Security.getProvider("SunPKCS11");
			this.provider = this.provider.configure(PKCS11_CONFIG_PATH);
			Security.addProvider(provider);
		} catch (ProviderException e) {
			log.error(
					"Problème de compatibilité entre la version de la JVM et la version de la Cryptolib (32 bits / 64 bits ?)");
			throw e;
		}
		// Ajout la liste des providers du poste
		if (Security.getProvider(provider.getName()) != null) {
			Security.removeProvider(provider.getName());
		}
		Security.insertProviderAt(provider, 0);

		log.warn("-FIN- Enregistrement cryptolib");

		try {

			// Chargement du keystore PKCS11
			// -----------------------------
			log.warn("-DEB- Lecture Keystore CPS");
			KeyStore keystorePkcs11 = KeyStore.getInstance("PKCS11", provider);
			keystorePkcs11.load(null, pin.toCharArray());
			log.warn("-FIN- Lecture Keystore CPS");

			log.warn("-DEB- Lecture du certificat de signature");
			// Recherche du certificat X509 de signature dans le keyStore
			// -----------------------------------------------------------
			String aliasSignature = null;
			X509Certificate cert = null;
			Enumeration<String> aliases = keystorePkcs11.aliases();
			while (aliases.hasMoreElements() && aliasSignature == null) {
				String alias = aliases.nextElement();
				log.info("#### Alias=" + alias);
				cert = (X509Certificate) keystorePkcs11.getCertificate(alias);
				if (cert.getExtendedKeyUsage().get(0).endsWith("4")) {
					log.info("Certificat de signature chargé");
					aliasSignature = alias;
				}
			}
			if (aliasSignature == null)
				throw new AssertionException("Certificat de signature CPS absent!");

			// Recuperation de la cle privee du certificat de signature
			// --------------------------------------------------------
			PrivateKey privateKey = (PrivateKey) keystorePkcs11.getKey(aliasSignature, pin.toCharArray());
			log.info("Clé privée du certificat chargée");
			log.warn("-FIN- Lecture du certificat de signature");

			// Construction de l'assertion
			// ---------------------------

			ObjectFactory oasisFactory = new ObjectFactory();
			AssertionType assertionType = oasisFactory.createAssertionType();

			// Mise à jour ID
			UUID uuid = UUID.randomUUID();
			String id = "_" + uuid.toString();
			assertionType.setID(id);

			// Issue Instant --> Date du jour
			GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
			XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			assertionType.setIssueInstant(date);

			// Mise à jour de la version
			assertionType.setVersion("2.0");

			// Recuperation du DN
			String dn = cert.getSubjectX500Principal().getName(X500Principal.RFC1779);

			// Valorisation de Issuer
			// ----------------------
			NameIDType issuer = oasisFactory.createNameIDType();
			issuer.setFormat("urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName");
			issuer.setValue(dn);
			assertionType.setIssuer(issuer);

			// Valorisation de NameID (= Identifiant national)
			// -----------------------------------------------

			// Recuperation de l'issuer
			String dnIssuer = null;
			if (dn != null) {
				int indexDeb = dn.indexOf("CN=");
				if (indexDeb != -1) {
					indexDeb += 3;
					int indexFin = dn.indexOf(" ", indexDeb);
					if (indexFin != -1) {
						dnIssuer = dn.substring(indexDeb, indexFin);
					}
				}
			}
			if (dnIssuer != null) {
				SubjectType subject = oasisFactory.createSubjectType();
				NameIDType nameIDType = oasisFactory.createNameIDType();

				// Valorisation de NameID@NameQualifier
				String gipCardType = null;
				byte[] bytes = cert.getExtensionValue("1.2.250.1.71.1.2.2");
				if (bytes == null || bytes.length == 0) {
					log.debug("Ext GipCardType non trouvé");
				} else if (bytes.length != 5) {
					log.error("Ext GipCardType invalide");
				} else {
					switch (bytes[4]) {
					case 0:
						gipCardType = "CPS";
						break;
					case 1:
						gipCardType = "CPF";
						break;
					case 2:
						gipCardType = "CDE-CPE";
						break;
					case 3:
						gipCardType = "CPA";
						break;
					default:
						log.error("GipCardType inconnu " + bytes[4]);
						gipCardType = null;
						break;
					}
					if (gipCardType != null) {
						nameIDType.setNameQualifier(gipCardType);
						nameIDType.setValue(dnIssuer);
						JAXBElement<NameIDType> nameID = oasisFactory.createNameID(nameIDType);
						subject.getContent().add(nameID);
						assertionType.setSubject(subject);
					}
				}
			}

			// Fabrication de l'assertion PS
			JAXBElement<AssertionType> assertion = oasisFactory.createAssertion(assertionType);

			// Sérialisation de l'assertion dans un fichier XML pour visu avant signature
			// marshalObjectToXMLFile(assertion, "oasis.names.tc.saml._2_0.assertion",
			// "assertions/AssertionPS_Unsigned.xml" );

			// Marshall en document DOM pour Signature
			JAXBContext jc = JAXBContext.newInstance("oasis.names.tc.saml._2_0.assertion");

			// peut-être une piste ????
			// Marshaller m = XKMSUtil.getNamespacePrefixMappedMarshaller(jc);

			Marshaller m = jc.createMarshaller();
			// m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"urn:oasis:names:tc:SAML:2.0:assertion
			// http://docs.oasis-open.org/security/saml/v2.0/saml-schema-assertion-2.0.xsd");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			dbf.setExpandEntityReferences(false); // <---test
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.newDocument();
			doc.normalize();
			m.marshal(assertion, doc);

			// XMLSignature
			// ------------
			log.warn("-DEB- signature CPS");

			// Chargement du provider
			final XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

			// Element <Reference> de <SignedInfo>
			List<Transform> transforms = new ArrayList<Transform>();
			transforms.add(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null));
			transforms.add(fac.newTransform(CanonicalizationMethod.EXCLUSIVE, (TransformParameterSpec) null));
			Reference ref = fac.newReference("#" + id, fac.newDigestMethod(DigestMethod.SHA1, null), transforms, null,
					null);

			// Element <SignedInfo>
			CanonicalizationMethod canoMethod = fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE,
					(C14NMethodParameterSpec) null);
			SignatureMethod signMethod = fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null);
			SignedInfo signedInfo = fac.newSignedInfo(canoMethod, signMethod, Collections.singletonList(ref));

			// Element <KeyInfo> avec ajout de <X509Data>
			KeyInfoFactory keyInfoFactory = fac.getKeyInfoFactory();
			X509Data x509Data = keyInfoFactory.newX509Data(Collections.singletonList(cert));
			KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));

			// Element <Signature> avant <saml:Subject>
			NodeList nodeList = doc.getElementsByTagNameNS("urn:oasis:names:tc:SAML:2.0:assertion", "NameID");
			final Element elNameID = (Element) nodeList.item(0);

			// Enregistrement du document avant signature
			OutputStream os2 = new FileOutputStream("assertions/AssertionPS_non_signee.xml");
			TransformerFactory tf2 = TransformerFactory.newInstance();
			Transformer trans2 = tf2.newTransformer();
			trans2.transform(new DOMSource(doc), new StreamResult(os2));

			DOMSignContext valContext = new DOMSignContext(privateKey, doc.getDocumentElement(),
					elNameID.getParentNode());
			// ((Element) elNameID.getParentNode()).setIdAttribute("ID", true);
			valContext.setIdAttributeNS((Element) elNameID.getParentNode().getParentNode(), null, "ID");
			// valContext.setIdAttributeNS(elNameID,
			// "urn:oasis:names:tc:SAML:2.0:assertion", "ID");
			XMLSignature sig = fac.newXMLSignature(signedInfo, keyInfo);
			sig.sign(valContext);

			// Enregistrement du document après signature
			OutputStream os = new FileOutputStream("assertions/AssertionPS_signee.xml");
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer trans = tf.newTransformer();
			trans.transform(new DOMSource(doc), new StreamResult(os));

			log.warn("-FIN- signature CPS");

			return doc.getFirstChild();
		} catch (Throwable e) {
			log.error("", e);
			throw new AssertionException(e);
		}

	}

	/**
	 * Sauvegarde au format XML.
	 * 
	 * @param obj            objet à sérialiser.
	 * @param packageName    nom du package de l'objet.
	 * @param outputFileName nom du fichier de sauvegarde.
	 * @throws JAXBException
	 * @throws IOException
	 */
	public static void marshalObjectToXMLFile(Object obj, String packageName, String outputFileName)
			throws JAXBException, IOException {
		log.debug(">> marshalObjectToXMLFile(" + outputFileName + ")");

		JAXBContext context = JAXBContext.newInstance(packageName);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		// marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
		// "urn:oasis:names:tc:SAML:2.0:assertion
		// http://docs.oasis-open.org/security/saml/v2.0/saml-schema-assertion-2.0.xsd");
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFileName), "UTF-8");
		marshaller.marshal(obj, writer);

		log.debug("<< marshalObjectToXMLFile: OK");
	}

	/**
	 * Fonction main de test.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			PropertyConfigurator.configure("log4j.properties");
			new AssertionPSBuilder().buildAssertionPS("1234");

		} catch (AssertionException e) {
			log.error("", e);
		}
	}

}
