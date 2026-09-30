/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * G&eacute;n&eacute;ration de l'objet XML-Signature d'un document
 * 
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class AssertionSignature {
    /** Gestion des traces */
    private static final Logger log = LogManager.getLogger(AssertionSignature.class);

    private String doc; /* le document à signer */
    private String id; /* l'ID du document à signer */
    private ISignatureFactory sFac; /* la fabrique de signature */

    /**
     * Constructeur de la Signature d'assertion
     * 
     * @param d  le document &agrave; signer
     * @param id l'ID du document &agrave; signer
     * @param sf la fabrique de signature
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public AssertionSignature(String d, String id, ISignatureFactory sf) throws AssertionException {
	if (sf == null)
	    throw new AssertionException("Fabrique de signature nulle");
	this.doc = d;
	this.id = id;
	this.sFac = sf;
    }

    /**
     * Signe le document
     * 
     * @param password le code d'autorisation de signature
     * @return le document sign&eacute;
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public String signDocument(String password) throws AssertionException {
	log.debug(">> signDocument");
	// calcul du Digest du document à signer
	byte[] digestValue;
	try {
	    MessageDigest md = MessageDigest.getInstance("SHA-256");
	    digestValue = md.digest(doc.getBytes());
	} catch (NoSuchAlgorithmException e) {
	    throw new AssertionException("Digest Algorithm SHA-256 non suporté");
	}

	// construction de l'élément SignedInfo
	AssertionSignedInfo signedInfo = new AssertionSignedInfo(doc, id, sFac.getSignatureAlgorithm(),
		"http://www.w3.org/2001/04/xmlenc#sha256", digestValue);
	log.debug("signedInfo : " + signedInfo.get());
	// signature du SignedInfo canonisé c14n
	byte[] sign = sFac.sign(signedInfo.getC14n().getBytes(), password);
	// construction de l'élément SignatureValue
	String signatureValue = "<SignatureValue>" + Base64.getEncoder().encodeToString(sign) + "</SignatureValue>";

	// construction de l'élément KeyInfo
	String keyInfo = "<KeyInfo>" + sFac.getKeyInfo() + "</KeyInfo>";

	// Construction de l'élément Signature
	String signature = "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">" + signedInfo.get()
		+ signatureValue + keyInfo + "</Signature>";
	log.debug("XML Signature : " + signature);

	// insertion de l'élément Signature avant l'élément Subject de l'assertion
	StringBuilder signedDoc = new StringBuilder(doc);
	signedDoc.insert(signedDoc.indexOf("<Subject>"), signature);
	log.debug("Document signé : " + signedDoc.toString());
	log.debug("<< signDocument");
	return signedDoc.toString();
    }

}
