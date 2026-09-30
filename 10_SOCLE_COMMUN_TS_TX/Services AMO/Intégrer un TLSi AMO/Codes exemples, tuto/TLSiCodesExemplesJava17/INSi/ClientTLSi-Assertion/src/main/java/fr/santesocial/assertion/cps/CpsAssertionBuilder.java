/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

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

/**
 * Construction d'une Assertion CPS au standard SAML.
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class CpsAssertionBuilder extends AbstractAssertionBuilder {

    /** Gestion des traces */
    private static final Logger log = LogManager.getLogger(CpsAssertionBuilder.class);
    /**
     * Chemin de la cryptolib (64 bits).<br>
     * La cryptolib 32 bits est "C:\\Windows\\SysWOW64\\cps3_pkcs11_w32.dll"
     */
    public static final String CRYPTOLIB_DIR = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";

    private Cps3Pkcs11 pkcs11;
    private long cpsSlot;

    /**
     * Constructeur par d&eacute;faut
     * 
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsAssertionBuilder() throws AssertionException {
	this(CRYPTOLIB_DIR);
    }

    /**
     * Constructeur
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsAssertionBuilder(String cpsLibPath) throws AssertionException {
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
    public CpsAssertionBuilder(String cpsLibPath, String name, String value) throws IOException {
	super(name, value);
	log.debug(">>CpsAssertionBuilder");
	// Initialisation de la cryptolib
	// => À personnaliser pour le LPS
	pkcs11 = Cps3Pkcs11.getInstance(cpsLibPath);
	cpsSlot = -1;
    }

    /**
     * restitue la liste des infos des slots contenant une CPS
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @return la liste des infos CPS
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsInfo[] getCpsSlotInfo(String cpsLibPath) throws AssertionException {
	log.debug(">>getCpsSlotInfo");
	try {
	    return pkcs11.getCpsList(cpsLibPath);
	} catch (Exception e) {
	    throw new AssertionException("Erreur initialisation et lecture slots CPS pkcs11 : ", e);
	}
    }

    /**
     * S&eacute;lectionne le lecteur de la CPS &agrave; utiliser
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot       le lecteur
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public void selectCpsSlot(String cpsLibPath, long slot) throws AssertionException {
	log.debug("selectCpsSlot(" + slot + ")");
	this.cpsSlot = slot;
	// instanciation de la fabrique de signature CPS sur le slot souhaité
	signFac = new CpsSignatureFactory(cpsLibPath, slot);
    }

    /**
     * Construction d'une assertion PS
     * 
     * @param pin code porteur de la CPS.
     * @return le noeud XML contenant l'assertion PS sign&eacute;e
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public Node createAssertion(String pin) throws AssertionException {
	log.debug(">> createAssertion");
	if (cpsSlot == -1) {
	    throw new AssertionException("Slot CPS non sélectionné");
	}

	try {
	    X509Certificate cert = pkcs11.getCertificate(cpsSlot);

	    log.debug("X509Certificate :\n" + new String(Base64.getEncoder().encodeToString(cert.getEncoded())));

	    // Récuperation du DN à renseigner dans l'Issuer de l'assertion
	    issuer = cert.getSubjectX500Principal().getName(X500Principal.RFC1779);
	    log.info("DN = " + issuer);

	    // valorisation de Issuer@Format
	    issuerFormat = "urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName";

	    // Recuperation du CN du DN à renseigner dans le NameID de l'assertion
	    LdapName ln = new LdapName(issuer);
	    for (Rdn rdn : ln.getRdns()) {
		if (rdn.getType().equalsIgnoreCase("CN")) {
		    nameID = (String) rdn.getValue();
		    log.debug("CN = " + nameID);
		}
	    }
	    // Valorisation de NameID@NameQualifier
	    nameQualifier = null;
	    byte[] bytes = cert.getExtensionValue("1.2.250.1.71.1.2.2");
	    if (bytes == null || bytes.length == 0) {
		log.debug("Extension GipCardType non trouvée");
	    } else if (bytes.length != 5) {
		log.error("Ext GipCardType invalide");
	    } else {
		switch (bytes[4]) {
		case 0:
		    nameQualifier = "CPS";
		    break;
		case 1:
		    nameQualifier = "CPF";
		    break;
		case 2:
		    nameQualifier = "CDE-CPE";
		    break;
		case 3:
		    nameQualifier = "CPA";
		    break;
		default:
		    log.error("GipCardType inconnu " + bytes[4]);
		    break;
		}
	    }

	    // Construction de l'assertion SAML + XML-Signature
	    // ------------------------------------------------
	    log.warn("Début Assertion CPS");
	    Document doc = buildAssertion(true, pin);
	    log.warn("Fin assertion CPS");

	    if (log.isDebugEnabled()) {
		// Enregistrement du document après signature
		saveInFile(new DOMSource(doc), "AssertionPS.xml");
	    }
	    log.debug("<< createAssertion");
	    return doc.getFirstChild();
	} catch (Exception e) {
	    throw new AssertionException("Erreur creation assertion PS", e);
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
