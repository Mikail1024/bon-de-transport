package fr.santesocial.assertion.psc;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Base64;

import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.security.auth.x500.X500Principal;
import javax.xml.transform.dom.DOMSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import fr.santesocial.assertion.commun.AbstractAssertionBuilder;
import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.cps.Cps3Pkcs11;
import fr.santesocial.assertion.cps.CpsAssertionBuilder;
import fr.santesocial.assertion.cps.CpsInfo;
import fr.santesocial.assertion.cps.CpsSignatureFactory;

/**
 * Construction d'une Assertion Pro Santé Connect au standard SAML.
 */
public class PscAssertionBuilder extends AbstractAssertionBuilder {

    /** Gestion des traces */
    private static final Logger log = LogManager.getLogger(CpsAssertionBuilder.class);
    /**
     * Chemin de la cryptolib (64 bits).<br>
     * La cryptolib 32 bits est "C:\\Windows\\SysWOW64\\cps3_pkcs11_w32.dll"
     */
    public static final String CRYPTOLIB_DIR = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";

    /**
     * name-qualifier pour Pro Santé Connect
     */
    public static final String PSC_NAME_QUALIFIER = "PSC";

    private Cps3Pkcs11 pkcs11;
    private long cpsSlot;

    /**
     * Constructeur par d&eacute;faut
     * 
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public PscAssertionBuilder() throws AssertionException {
	this(CRYPTOLIB_DIR);
    }

    /**
     * Constructeur
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public PscAssertionBuilder(String cpsLibPath) throws AssertionException {
	super();
	try {
	    // Initialisation de la cryptolib
	    // => À personnaliser pour le LPS
	    pkcs11 = Cps3Pkcs11.getInstance(cpsLibPath);
	} catch (IOException e) {
	    throw new AssertionException("Librairie Cps3pkcs11 introuvable", e);
	}
	cpsSlot = -1;
    }

    /**
     * Constructeur avec un attribut SAML
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param name       nom de l'attribut SAML
     * @param value      valeur de l'attribut SAML
     * @throws IOException en cas de problème de chargement de la cryptolib
     */
    public PscAssertionBuilder(String cpsLibPath, String name, String value) throws IOException {
	super(name, value);
	log.debug(">>CpsAssertionBuilder");
	// Initialisation de la cryptolib
	// => À personnaliser pour le LPS
	pkcs11 = Cps3Pkcs11.getInstance(cpsLibPath);
	cpsSlot = -1;
    }

    /**
     * restitue la liste des infos des slots contenant une PSC
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @return la liste des infos PSC
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsInfo[] getCpsSlotInfo(String cpsLibPath) throws AssertionException {
	log.debug(">>getCpsSlotInfo");
	try {
	    return pkcs11.getCpsList(cpsLibPath);
	} catch (Exception e) {
	    throw new AssertionException("Erreur initialisation et lecture slots PSC pkcs11 : ", e);
	}
    }

    /**
     * S&eacute;lectionne le lecteur de la PSC &agrave; utiliser
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot       le lecteur
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public void selectCpsSlot(String cpsLibPath, long slot) throws AssertionException {
	log.debug("selectCpsSlot(" + slot + ")");
	this.cpsSlot = slot;
	// instanciation de la fabrique de signature PSC sur le slot souhaité
	signFac = new CpsSignatureFactory(cpsLibPath, slot);
    }

    /**
     * Construction d'une assertion PSC
     * 
     * @param pin code porteur de la CPS.
     * @return le noeud XML contenant l'assertion PSC
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node createAssertion(String pin) throws AssertionException {
	log.debug(">> createAssertion");
	if (cpsSlot == -1) {
	    throw new AssertionException("Slot PSC non sélectionné");
	}

	try {
	    X509Certificate cert = pkcs11.getCertificate(cpsSlot);

	    log.debug("X509Certificate :\n" + new String(Base64.getEncoder().encodeToString(cert.getEncoded())));

	    // Récuperation du DN à renseigner dans l'Issuer de l'assertion
	    issuer = cert.getSubjectX500Principal().getName(X500Principal.RFC2253);
	    log.info("DN = " + issuer);
	    
	    // valorisation de Issuer@Format
	    issuerFormat = "urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName";

	    // Recuperation du CN du DN à renseigner dans le NameID de l'assertion
	    LdapName ln = new LdapName(cert.getSubjectX500Principal().getName(X500Principal.RFC1779));
	    for (Rdn rdn : ln.getRdns()) {
		if (rdn.getType().equalsIgnoreCase("CN")) {
		    nameID = (String) rdn.getValue();
		    log.debug("CN = " + nameID);
		}
	    }
	    // Valorisation de NameID@NameQualifier
	    nameQualifier = PSC_NAME_QUALIFIER;

	    // Construction de l'assertion SAML
	    // ------------------------------------------------
	    log.warn("Début Assertion PSC");
	    Document doc = this.buildAssertion(false, pin);
	    log.warn("Fin assertion PSC");

	    if (log.isDebugEnabled()) {
		// Enregistrement du document après signature
		saveInFile(new DOMSource(doc), "AssertionPSC.xml");
	    }
	    log.debug("<< createAssertion");
	    return doc.getFirstChild();
	} catch (Exception e) {
	    throw new AssertionException("Erreur creation assertion PSC", e);
	}
    }

    /**
     * restitue le NameID de l'assertion PS pour l'&eacute;ventuel Issuer de
     * l'assertion Vitale
     * 
     * @return le NameID
     */
    public String getNameID() {
	return nameID;
    }
}
