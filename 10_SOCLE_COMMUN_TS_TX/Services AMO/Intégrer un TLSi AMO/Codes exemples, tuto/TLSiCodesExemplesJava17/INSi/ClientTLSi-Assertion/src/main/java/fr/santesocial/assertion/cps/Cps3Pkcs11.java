/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.util.Conversion;
import fr.santesocial.mica.jnamica.output.ByteArray;
import iaik.pkcs.pkcs11.objects.Object.ObjectClass;
import iaik.pkcs.pkcs11.wrapper.CK_ATTRIBUTE;
import iaik.pkcs.pkcs11.wrapper.CK_INFO;
import iaik.pkcs.pkcs11.wrapper.CK_MECHANISM;
import iaik.pkcs.pkcs11.wrapper.CK_MECHANISM_INFO;
import iaik.pkcs.pkcs11.wrapper.CK_SLOT_INFO;
import iaik.pkcs.pkcs11.wrapper.CK_TOKEN_INFO;
import iaik.pkcs.pkcs11.wrapper.PKCS11;
import iaik.pkcs.pkcs11.wrapper.PKCS11Connector;
import iaik.pkcs.pkcs11.wrapper.PKCS11Constants;
import iaik.pkcs.pkcs11.wrapper.PKCS11Exception;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLTaggedObject;

/**
 * Classe singleton qui encapsule les appels &agrave; la librairie
 * cps3_pkcs11_w32.dll
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class Cps3Pkcs11 {
    private static final Logger log = LogManager.getLogger(Cps3Pkcs11.class);

    /**
     * Variable statique privée du singleton
     */
    private static Cps3Pkcs11 instance = null;

    /**
     * Librairie cps3 pkcs11 sur laquelle le wrapper se connecte à l'instanciation
     * du singleton
     */
    private PKCS11 lib;
    /**
     * Indicateur d'initialisation de la librairie PKCS#11 CPS
     */
    boolean init;

    /**
     * Constructeur privé
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @throws IOException en cas de problème de chargement de la cryptolib
     */
    private Cps3Pkcs11(String cpsLibPath) throws IOException {
	lib = PKCS11Connector.connectToPKCS11Module(cpsLibPath);
	try {
	    if (lib != null) {
		try {
		    lib.C_Initialize(null, false);
		    CK_INFO info = lib.C_GetInfo();
		    if (info != null) {
			log.info("Description : " + new String(info.libraryDescription));
			log.info("Manufacturer : " + new String(info.manufacturerID));
			log.info("cryptoki Version : " + info.cryptokiVersion.toString());
			log.info("Library version : " + info.libraryVersion.toString());
		    }
		    init = true;
		    instance = this;
		} catch (PKCS11Exception e) {
		    log.error("Operation C_Initialize echouee : " + e.getErrorCode());
		}
	    }
//      // Si la librairie est nulle il est impossible de réaliser l'opération
//      log.error("La librairie est nulle");
//      throw new Exception("La librairie est inaccessible");
	} catch (Throwable t) {
	    // Si une erreur inattendue est survenue on la logue et on la lève
	    log.error("Une erreur inattendue est survenue : " + t.getStackTrace());
	}
    }

    /**
     * valeur de l'alorithme de signature RSA-SHA1
     */
    public static long RSA_SHA1 = 6;

    /**
     * Valeur de l'algorithme de signature RSA-SHA256
     */
    public static long RSA_SHA256 = 64;

    /**
     * Fournit l'instance du wrapper connect&eacute; &agrave; la PKCS#11 CPS3
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @return l'instance du wrapper PKCS11
     * @throws IOException en cas de problème de chargement de la cryptolib
     */
    public static Cps3Pkcs11 getInstance(String cpsLibPath) throws IOException {
	if (instance == null) {
	    instance = new Cps3Pkcs11(cpsLibPath);
	    log.debug("Instanciation du singleton Cps3Pkcs11");
	}

	log.debug("Acces au singleton Cps3Pkcs11");
	return instance;
    }

    /**
     * Terminaison de la PKCS#11
     */
    public void finalize() {
	try {
	    if (lib != null) {
		try {
		    lib.C_Finalize(null);
		    init = false;
		} catch (PKCS11Exception e) {
		    log.error("Operation echouee : " + e.getErrorCode());
		}
		return;
	    }
	    // Si la librairie est nulle il est impossible de réaliser l'opération
	    log.error("La librairie est nulle");
	    throw new Exception("La librairie est inaccessible");
	} catch (Throwable t) {
	    // Si une erreur inattendue est survenue on la logue et on la lève
	    log.error("Une erreur inattendue est survenue : " + t.getStackTrace());
	}
    }

    /**
     * Retourne la liste des CPS pr&eacute;sentes sur le poste de travail
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @return le tableau des infos des slots et CPS correspondantes
     */
    public CpsInfo[] getCpsList(String cpsLibPath) {
	try {
	    if (lib != null) {
		try {
		    // retourne la liste des slots qui contiennent une CPS
		    long[] slotList = lib.C_GetSlotList(true);
		    if (slotList.length != 0) {
			CpsInfo[] cpsInfos = new CpsInfo[slotList.length];
			for (int i = 0; i < slotList.length; i++) {
			    cpsInfos[i] = getCpsInfo(cpsLibPath, slotList[i]);
			}
			return cpsInfos;
		    }
		    return null;
		} catch (PKCS11Exception e) {
		    log.error("Operation echouee : " + e.getErrorCode());
		    return null;
		}
	    }
	    // Si la librairie est nulle il est impossible de réaliser l'opération
	    log.error("La librairie est nulle");
	    throw new Exception("La librairie est inaccessible");
	} catch (Throwable t) {
	    // Si une erreur inattendue est survenue on la logue et on la lève
	    log.error("Une erreur inattendue est survenue : " + t.getStackTrace());
	}
	return null;
    }

    /**
     * Retourne les caractéristiques de la CPS d'un slot
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot
     * @return
     * @throws PKCS11Exception en cas de problème d'accès à la carte CPS
     */
    private CpsInfo getCpsInfo(String cpsLibPath, long slot) throws PKCS11Exception {
	CK_SLOT_INFO slotInfo = lib.C_GetSlotInfo(slot);
	CK_TOKEN_INFO tokenInfo = lib.C_GetTokenInfo(slot);
	log.debug("model = [" + new String(tokenInfo.model) + "]");
	return new CpsInfo(cpsLibPath, slot, new String(slotInfo.slotDescription), new String(tokenInfo.label),
		new String(tokenInfo.serialNumber));
    }

    /**
     * Retourne la liste des m&eacute;canismes cryptographiques du token d'un slot
     * 
     * @param slotID l'identifiant du slot
     * @return le tableau des infos des m&eacute;canismes cryptographiques
     */
    public CK_MECHANISM_INFO[] getMechanismInfo(long slotID) {
	try {
	    if (lib != null) {
		try {
		    long[] types = lib.C_GetMechanismList(slotID);
		    CK_MECHANISM_INFO[] mec_infos = new CK_MECHANISM_INFO[types.length];
		    log.debug(types.length + " mecanismes\n");
		    for (int i = 0; i < types.length; i++) {
			mec_infos[i] = lib.C_GetMechanismInfo(slotID, types[i]);
			log.debug("type " + types[i] + " -> " + mec_infos[i]);
		    }
		    return mec_infos;
		} catch (PKCS11Exception e) {
		    log.error("Operation echouee : " + e.getErrorCode());
		}
	    }
	    // Si la librairie est nulle il est impossible de réaliser l'opération
	    log.error("La librairie est nulle");
	    throw new Exception("La librairie est inaccessible");
	} catch (Throwable t) {
	    // Si une erreur inattendue est survenue on la logue et on la lève
	    log.error("Une erreur inattendue est survenue : " + t.getStackTrace());
	}
	return null;
    }

    /**
     * retourne le certificat de signature X509 de la CPS
     * 
     * @param slot slot o&ugrave; se trouve la CPS
     * @return le certificat X509
     * @throws AssertionException   en cas de problème de génération de l'assertion
     * @throws PKCS11Exception      en cas de problème d'accès à la carte CPS
     * @throws CertificateException en cas de problème de lecture du certificat
     */
    public X509Certificate getCertificate(long slot) throws AssertionException, PKCS11Exception, CertificateException {
	if (!init)
	    throw new AssertionException("PKCS#11 CPS non initialisee");
	// on ferme les potentielles sessions sur le slot de la CPS
	lib.C_CloseAllSessions(slot);
	// on ouvre la session de travail
	long session = lib.C_OpenSession(slot,
		PKCS11Constants.CKF_SERIAL_SESSION | PKCS11Constants.CKS_RO_PUBLIC_SESSION, null, null);
	// initialisation de la recherche
	CK_ATTRIBUTE a1 = new CK_ATTRIBUTE(); // classe certificat
	a1.type = PKCS11Constants.CKA_CLASS;
	a1.pValue = ObjectClass.CERTIFICATE;
	CK_ATTRIBUTE a2 = new CK_ATTRIBUTE(); // classe label
	a2.type = PKCS11Constants.CKA_LABEL;
	a2.pValue = "Certificat de Signature CPS";
	CK_ATTRIBUTE[] attributsRecherche = { a1, a2 };
	lib.C_FindObjectsInit(session, attributsRecherche, false);
	// recherche du certificat de signature
	long[] objHandle = lib.C_FindObjects(session, 1L);
	lib.C_FindObjectsFinal(session);
	if ((objHandle == null) || (objHandle.length == 0)) {
	    throw new AssertionException("Objet Certificat de Signature non trouve dans PKCS#11 CPS");
	}
	// recuperation de la valeur du certificat de signature
	CK_ATTRIBUTE[] attribsRecup = new CK_ATTRIBUTE[1];
	attribsRecup[0] = new CK_ATTRIBUTE();
	attribsRecup[0].type = PKCS11Constants.CKA_VALUE;
	lib.C_GetAttributeValue(session, objHandle[0], attribsRecup, false);

	byte[] binCert = (byte[]) attribsRecup[0].pValue;

	CertificateFactory cf = CertificateFactory.getInstance("X509");
	X509Certificate certificat = (X509Certificate) cf.generateCertificate(new ByteArrayInputStream(binCert));
	lib.C_CloseSession(session);
	return certificat;
    }

    /**
     * retourne le secteur d'activite de la CPS
     * 
     * @param slot slot o&ugrave; se trouve la CPS
     * @return le secteur d'activite
     * @throws AssertionException en cas de problème de génération de l'assertion
     * @throws PKCS11Exception    en cas de problème d'accès à la carte CPS
     */
    public String getSecteurActivite(long slot) throws AssertionException, PKCS11Exception {
	if (!init)
	    throw new AssertionException("PKCS#11 CPS non initialisee");
	// on ferme les potentielles sessions sur le slot de la CPS
	lib.C_CloseAllSessions(slot);
	// on ouvre la session de travail
	long session = lib.C_OpenSession(slot,
		PKCS11Constants.CKF_SERIAL_SESSION | PKCS11Constants.CKS_RO_PUBLIC_SESSION, null, null);
	// TODO : passer le code porteur en argument
	String codePorteur = "1234";
	lib.C_Login(session, PKCS11Constants.CKU_USER, codePorteur.toCharArray(), false);
	// initialisation de la recherche
	CK_ATTRIBUTE a1 = new CK_ATTRIBUTE(); // classe data
	a1.type = PKCS11Constants.CKA_CLASS;
	a1.pValue = ObjectClass.DATA;
	CK_ATTRIBUTE a2 = new CK_ATTRIBUTE(); // classe token
	a2.type = PKCS11Constants.CKA_TOKEN;
	a2.pValue = true;
	CK_ATTRIBUTE a3 = new CK_ATTRIBUTE(); // classe private
	a3.type = PKCS11Constants.CKA_PRIVATE;
	a3.pValue = false;
	CK_ATTRIBUTE a4 = new CK_ATTRIBUTE(); // classe label
	a4.type = PKCS11Constants.CKA_LABEL;
	a4.pValue = "CPS_INFO_PS";
	CK_ATTRIBUTE[] attributsRecherche = { a1, a2, a3, a4 };
	lib.C_FindObjectsInit(session, attributsRecherche, false);
	// recherche du certificat de signature
	long[] objHandle = lib.C_FindObjects(session, 1L);
	lib.C_FindObjectsFinal(session);
	if ((objHandle == null) || (objHandle.length == 0)) {
	    throw new AssertionException("Objet Secteur d'activite CPS non trouvé");
	}
	// recuperation de la valeur du certificat de signature
	CK_ATTRIBUTE[] attribsRecup = new CK_ATTRIBUTE[1];
	attribsRecup[0] = new CK_ATTRIBUTE();
	attribsRecup[0].type = PKCS11Constants.CKA_VALUE;
	lib.C_GetAttributeValue(session, objHandle[0], attribsRecup, false);

	byte[] sectAct = (byte[]) attribsRecup[0].pValue;
	String value = new String(sectAct, StandardCharsets.UTF_8);
	value = value.substring(value.length() - 4);

	lib.C_CloseSession(session);
	log.debug("Value secteur activite :" + value);
	return value;
    }

    /**
     * retourne le numéro de facturation de la CPS
     * 
     * @param slot slot o&ugrave; se trouve la CPS
     * @return le secteur d'activite
     * @throws AssertionException en cas de problème de génération de l'assertion
     * @throws PKCS11Exception    en cas de problème d'accès à la carte CPS
     */
    public String getNumeroFacturation(long slot) throws AssertionException, PKCS11Exception {
	if (!init)
	    throw new AssertionException("PKCS#11 CPS non initialisee");
	// on ferme les potentielles sessions sur le slot de la CPS
	lib.C_CloseAllSessions(slot);
	// on ouvre la session de travail
	long session = lib.C_OpenSession(slot,
		PKCS11Constants.CKF_SERIAL_SESSION | PKCS11Constants.CKS_RO_PUBLIC_SESSION, null, null);
	// TODO : passer le code porteur en argument
	String codePorteur = "1234";
	lib.C_Login(session, PKCS11Constants.CKU_USER, codePorteur.toCharArray(), false);
	// initialisation de la recherche
	CK_ATTRIBUTE a1 = new CK_ATTRIBUTE(); // classe data
	a1.type = PKCS11Constants.CKA_CLASS;
	a1.pValue = ObjectClass.DATA;
	CK_ATTRIBUTE a2 = new CK_ATTRIBUTE(); // classe label
	a2.type = PKCS11Constants.CKA_LABEL;
	a2.pValue = "CPS_SIT_FACT";
	CK_ATTRIBUTE[] attributsRecherche = { a1, a2 };
	lib.C_FindObjectsInit(session, attributsRecherche, false);
	// recherche du certificat de signature
	long[] objHandle = lib.C_FindObjects(session, 1L);
	lib.C_FindObjectsFinal(session);
	if ((objHandle == null) || (objHandle.length == 0)) {
	    throw new AssertionException("Objet numéro facturation CPS non trouvé");
	}
	// recuperation de la valeur du certificat de signature
	CK_ATTRIBUTE[] attribsRecup = new CK_ATTRIBUTE[1];
	attribsRecup[0] = new CK_ATTRIBUTE();
	attribsRecup[0].type = PKCS11Constants.CKA_VALUE;
	lib.C_GetAttributeValue(session, objHandle[0], attribsRecup, false);

	byte[] numeroFacturation = (byte[]) attribsRecup[0].pValue;

	String value = "";
	try (ASN1InputStream is = new ASN1InputStream(numeroFacturation)) {
	    ASN1Primitive prim = is.readObject();
	    // L'objet lu a le format suivant :
	    // ..Tagged [PRIVATE 0]
	    // ....Tagged [CONTEXT 0] IMPLICIT
	    // ......Sequence
	    // ........Tagged [CONTEXT 0] IMPLICIT
	    // ..........DER Octet String[1]
	    // ........Tagged [CONTEXT 1] IMPLICIT
	    // ..........DER Octet String[5]..........<= numéro de facturation
	    // ........Tagged [CONTEXT 2] IMPLICIT
	    // ..........DER Octet String[3]
	    // ........Tagged [CONTEXT 3] IMPLICIT
	    // ..........DER Octet String[3]
	    // ........Tagged [CONTEXT 4] IMPLICIT
	    // ..........DER Octet String[1]

	    // => pour voir son contenu, utiliser
	    // "org.bouncycastle.asn1.util.ASN1Dump.dumpAsString(prim)"
	    ASN1TaggedObject as = DLTaggedObject.getInstance(prim);
	    ASN1TaggedObject ato1 = ASN1TaggedObject.getInstance(as.getBaseObject());
	    ASN1Sequence asn1 = ASN1Sequence.getInstance(ato1.getBaseObject());
	    ASN1TaggedObject ato11 = ASN1TaggedObject.getInstance(asn1.getObjectAt(1));
	    value = Conversion
		    .BufToAscii(new ByteArray(DEROctetString.getInstance(ato11.getBaseObject()).getOctets()), 5)
		    .substring(1);
	} catch (IOException e) {
	    throw new AssertionException("Problème d'extraction du numéro facturation CPS");
	}

	lib.C_CloseSession(session);
	log.debug("Value numero facturation :" + value);
	return value;
    }

    /**
     * retourne le secteur d'activite de la CPS
     * 
     * @param slot slot o&ugrave; se trouve la CPS
     * @return le secteur d'activite
     * @throws AssertionException en cas de problème de génération de l'assertion
     * @throws PKCS11Exception    en cas de problème d'accès à la carte CPS
     */
    public String getCodeSpecialite(long slot) throws AssertionException, PKCS11Exception {
	if (!init)
	    throw new AssertionException("PKCS#11 CPS non initialisee");
	// on ferme les potentielles sessions sur le slot de la CPS
	lib.C_CloseAllSessions(slot);
	// on ouvre la session de travail
	long session = lib.C_OpenSession(slot,
		PKCS11Constants.CKF_SERIAL_SESSION | PKCS11Constants.CKS_RO_PUBLIC_SESSION, null, null);
	// TODO : passer le code porteur en argument
	String codePorteur = "1234";
	lib.C_Login(session, PKCS11Constants.CKU_USER, codePorteur.toCharArray(), false);

	long[] objHandle = null;
	for (int i = 1; i < 16; i++) {
	    String label = "CPS_ACTIVITY_" + String.format("%02d", i) + "_PS";
	    log.debug("label=" + label);
	    // initialisation de la recherche
	    CK_ATTRIBUTE a1 = new CK_ATTRIBUTE(); // classe data
	    a1.type = PKCS11Constants.CKA_CLASS;
	    a1.pValue = ObjectClass.DATA;
	    CK_ATTRIBUTE a2 = new CK_ATTRIBUTE(); // classe token
	    a2.type = PKCS11Constants.CKA_TOKEN;
	    a2.pValue = true;
	    CK_ATTRIBUTE a3 = new CK_ATTRIBUTE(); // classe private
	    a3.type = PKCS11Constants.CKA_PRIVATE;
	    a3.pValue = true;
	    CK_ATTRIBUTE a4 = new CK_ATTRIBUTE(); // classe label
	    a4.type = PKCS11Constants.CKA_LABEL;
	    a4.pValue = label;
	    CK_ATTRIBUTE[] attributsRecherche = { a1, a2, a3, a4 };
	    lib.C_FindObjectsInit(session, attributsRecherche, false);
	    // recherche du certificat de signature
	    objHandle = lib.C_FindObjects(session, 1L);
	    lib.C_FindObjectsFinal(session);
	    if (objHandle.length != 0)
		break;

	}
	if ((objHandle == null) || (objHandle.length == 0)) {
	    throw new AssertionException("Objet code spécialité CPS non trouvé");
	}
	// recuperation de la valeur du certificat de signature
	CK_ATTRIBUTE[] attribsRecup = new CK_ATTRIBUTE[1];
	attribsRecup[0] = new CK_ATTRIBUTE();
	attribsRecup[0].type = PKCS11Constants.CKA_VALUE;
	lib.C_GetAttributeValue(session, objHandle[0], attribsRecup, false);

	byte[] sectAct = (byte[]) attribsRecup[0].pValue;
	String value = new String(sectAct, StandardCharsets.UTF_8);
	value = value.substring(value.length() - 4);

	lib.C_CloseSession(session);
	log.debug("Value codeSpecialite :" + value);
	return value;
    }

    /**
     * Signature d'un buffer de donn&eacute;e par une CPS
     * 
     * @param slot        slot sur lequel se trouve la CPS devant signer
     * @param buffer      buffer de donn&eacute;es &agrave; signer
     * @param algo        algorithme de signature (Cps3Pkcs11.RSA_SHA1 ou
     *                    Cps3Pkcs11.RSA_SHA256)
     * @param codePorteur code porteur de la CPS
     * @return la signature du buffer encod&eacute; en base 64
     * @throws AssertionException lev&eacute;e si PKCS11 non initialis&eacute;e ou
     *                            si algorithme invalide
     * @throws PKCS11Exception    en cas de problème d'accès à la carte CPS
     */
    public byte[] sign(long slot, byte[] buffer, long algo, String codePorteur)
	    throws AssertionException, PKCS11Exception {
	if (!init)
	    throw new AssertionException("PKCS#11 CPS non initialisée");
	if ((algo != Cps3Pkcs11.RSA_SHA1) && (algo != Cps3Pkcs11.RSA_SHA256))
	    throw new AssertionException("Algorithme de signature incorrect");

	// on ferme les potentielles sessions sur le slot de la CPS
	lib.C_CloseAllSessions(slot);
	// on ouvre la session de travail sur la CPS du slot
	long session = lib.C_OpenSession(slot,
		PKCS11Constants.CKF_SERIAL_SESSION | PKCS11Constants.CKS_RO_PUBLIC_SESSION, "Cps3Pkcs11", null);
	lib.C_Login(session, PKCS11Constants.CKU_USER, codePorteur.toCharArray(), false);
	// initialisation de la recherche
	CK_ATTRIBUTE a1 = new CK_ATTRIBUTE(); // classe certificat
	a1.type = PKCS11Constants.CKA_CLASS;
	a1.pValue = ObjectClass.PRIVATE_KEY;
	CK_ATTRIBUTE a2 = new CK_ATTRIBUTE(); // classe label
	a2.type = PKCS11Constants.CKA_LABEL;
	a2.pValue = "CPS_PRIV_SIG";
	CK_ATTRIBUTE[] attribsRecherche = { a1, a2 };
	lib.C_FindObjectsInit(session, attribsRecherche, false);
	// recherche de la clé privée
	long[] objHandle = lib.C_FindObjects(session, 1L);
	lib.C_FindObjectsFinal(session);
	if ((objHandle == null) || (objHandle.length == 0)) {
	    throw new AssertionException("Objet Clé privée de Signature non trouvé dans PKCS#11 CPS");
	}
	// choix mécanisme de signature en fonction de l'algo
	CK_MECHANISM mechanism = new CK_MECHANISM();
	mechanism.mechanism = algo;
	mechanism.pParameter = null;
	lib.C_SignInit(session, mechanism, objHandle[0], false);

	// signature
	log.debug("Avant C_Sign");
	byte[] signature = lib.C_Sign(session, buffer);

	lib.C_Logout(session);
	lib.C_CloseSession(session);

	return signature;
	// return Base64Coder.encodeLines(signature);
    }
}
