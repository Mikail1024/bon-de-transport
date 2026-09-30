/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Base64;

import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.commun.ISignatureFactory;

/**
 * Fabrique de signature CPS
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class CpsSignatureFactory implements ISignatureFactory {
    private Cps3Pkcs11 pkcs11;
    private long slot;

    /**
     * Construction de la fabrique de signature CPS
     * 
     * @param cpsLibPath le chemin vers la cryptolib
     * @param slot       le lecteur de la CPS &agrave; utiliser
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public CpsSignatureFactory(String cpsLibPath, long slot) throws AssertionException {
	this.slot = slot;
	try {
	    pkcs11 = Cps3Pkcs11.getInstance(cpsLibPath);
	} catch (IOException e) {
	    throw new AssertionException("librairie cps3pkcs11 non trouvée : ", e);
	}
    }

    @Override
    public String getKeyInfo() throws AssertionException {
	X509Certificate cert;
	byte[] certEncoded;
	try {
	    cert = pkcs11.getCertificate(slot);
	    certEncoded = cert.getEncoded();
	} catch (Exception e) {
	    throw new AssertionException("Erreur lecture certificat X509 CPS : ", e);
	}
	StringBuilder keyInfo = new StringBuilder("<X509Data><X509Certificate>");
	keyInfo.append(Base64.getEncoder().encodeToString(certEncoded));
	keyInfo.append("</X509Certificate></X509Data>");
	return keyInfo.toString();
    }

    @Override
    public String getSignatureAlgorithm() {
	return "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256";
    }

    @Override
    public byte[] sign(byte[] buf, String password) throws AssertionException {
	try {
	    return pkcs11.sign(slot, buf, Cps3Pkcs11.RSA_SHA256, password);
	} catch (Exception e) {
	    throw new AssertionException("Erreur de signature CPS : ", e);
	}
    }
}
