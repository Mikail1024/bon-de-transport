/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import fr.santesocial.util.CertificateUtil;
import iaik.pkcs.pkcs11.wrapper.CK_MECHANISM_INFO;
import iaik.pkcs.pkcs11.wrapper.PKCS11Constants;

import java.io.FileInputStream;
import java.security.cert.X509Certificate;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Cps3Pkcs11Test {
    private static final Logger log = LogManager.getLogger(Cps3Pkcs11Test.class);

    private static final String CPS_LIB_PATH = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";

    @Test
    public void testCps3Pkcs11() throws Exception {

	Cps3Pkcs11 pkcs11 = Cps3Pkcs11.getInstance(CPS_LIB_PATH);

	CpsInfo[] cpsInfos = pkcs11.getCpsList(CPS_LIB_PATH);
	log.debug("getCpsList : " + cpsInfos.length + " slots contenant une CPS.");
	for (int i = 0; i < cpsInfos.length; i++) {
	    log.debug("slot : " + cpsInfos[i].getSlot());
	    log.debug("Description : " + cpsInfos[i].getDescription());
	    log.debug("label : " + cpsInfos[i].getLabel());
	    log.debug("serial number : " + cpsInfos[i].getSerialNumber());
	    log.debug("PKCS11Constants.CKM_RSA_PKCS = " + PKCS11Constants.CKM_RSA_PKCS);
	    log.debug("PKCS11Constants.CKM_RSA_X_509 = " + PKCS11Constants.CKM_RSA_X_509);
	    log.debug("PKCS11Constants.CKM_SHA1_RSA_PKCS = " + PKCS11Constants.CKM_SHA1_RSA_PKCS);
	    log.debug("PKCS11Constants.CKM_SHA_1 = " + PKCS11Constants.CKM_SHA_1);
	    CK_MECHANISM_INFO mechanismInfo[] = pkcs11.getMechanismInfo(cpsInfos[i].getSlot());
	    X509Certificate cert = pkcs11.getCertificate(cpsInfos[i].getSlot());
	    // Recuperation du DN
	    log.debug("DN = " + CertificateUtil.getCertificateDN(cert));
	    log.debug("CN=" + CertificateUtil.getCertificateCN(cert));

	    // test de signature RSA-SHA256
	    try (FileInputStream fis = new FileInputStream("SignedInfoC14.xml")) {
		byte[] buf = new byte[(int) fis.getChannel().size()];
		fis.read(buf);
		log.debug("Signature RSA-SHA256 :\n" + Base64.getEncoder()
			.encodeToString(pkcs11.sign(cpsInfos[i].getSlot(), buf, Cps3Pkcs11.RSA_SHA256, "1234")));

		// test de signature RSA seul (SHA256 fait avant)
		// ne marche qu'avec 6 = SHA1-RSA
//      byte[] digestValue;
//      MessageDigest md = MessageDigest.getInstance("SHA-256");
//      digestValue = md.digest(buf);
//      log.debug("digest = " + new String(Base64.encode(digestValue)));
//      log.debug("Signature RSA seul avec SHA256 préliminaire :\n" +
//          Base64.encode(pkcs11.sign(cpsInfos[i].getSlot(), digestValue, 1 , "1234")));
	    }
	}

	pkcs11.finalize();
	log.debug("finalize OK");
    }
}
