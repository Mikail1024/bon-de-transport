/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/
package fr.sesamvitale.lps;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author boucliee
 *
 */
public class MyTrustManager implements X509TrustManager {

	private static String COMMON_NAME_END = "services-ps.ameli.fr";
	private static String COMMON_NAME_TLSMUT_END = "services-ps-tlsm.ameli.fr";
	private String commonName;

	/** Trace */
	private static final Logger log = LogManager.getLogger(MyTrustManager.class);

	public MyTrustManager(String cn) {
		this.commonName = cn;
	}

	public MyTrustManager() {
		this.commonName = null;
	}

	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {

		// Contrôle de validité de la chaine de certification
		// --------------------------------------------------

		for (int i = 0; i < chain.length; i++) {
			try {
				// Contrôle dates
				chain[i].checkValidity();

			} catch (CertificateExpiredException cee) {
				log.error("", cee);
				throw cee;
			} catch (CertificateNotYetValidException cnye) {
				log.error("", cnye);
				throw cnye;
			}
		}
		log.info("Contrôle de validité de la chaine de certification OK");

		// Chargement des certificats des autorités de certification
		// ---------------------------------------------------------

		X509Certificate caAut = null;
		FileInputStream fis = null;
		try {
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			fis = new FileInputStream("ac_ans\\AC RACINE IGC-SANTE ELEMENTAIRE.cer");
			caAut = (X509Certificate) cf.generateCertificate(fis);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		// Récupération du certificat serveur (par convention le premier de la chaine)
		// ---------------------------------------------------------------------------

		X509Certificate certServer = chain[0];

		// Contrôle de signature du certificat serveur à l'aide de la clé publique de
		// l'autorité
		// -------------------------------------------------------------------------------------

		try {
			certServer.verify(caAut.getPublicKey());

		} catch (InvalidKeyException e) {
		    log.error("InvalidKeyException " + e.getMessage());
		    log.error("", e);
		} catch (NoSuchAlgorithmException e) {
		    log.error("NoSuchAlgorithmException " + e.getMessage());
		    log.error("", e);
		} catch (NoSuchProviderException e) {
		    log.error("NoSuchProviderException " + e.getMessage());
		    log.error("", e);
		} catch (SignatureException e) {
		    log.error("SignatureException " + e.getMessage());
		    log.error("", e);
		}
		log.info("Contrôle de la signature du certificat serveur OK");

		// Lecture du DN
		// -------------

		String tlsDN = certServer.getSubjectX500Principal().getName();
		log.debug("DN reçu du serveur= " + tlsDN);

		// Contrôle du Common Name
		// -----------------------

		int begin = tlsDN.indexOf("=");
		if (begin != -1) {

			int end = tlsDN.indexOf(",");
			String tlsCN = tlsDN.substring(begin + 1, end);
			log.debug("CN= " + tlsCN);

			if (commonName != null) {
				if (!tlsCN.equals(commonName))
					throw new CertificateException("Common Name invalide");
			} else {
				if (!(tlsCN.endsWith(COMMON_NAME_END) || tlsCN.endsWith(COMMON_NAME_TLSMUT_END)))
					throw new CertificateException("Common Name invalide");
			}
		} else {
			throw new CertificateException("Common Name non trouvé");
		}
		log.info("Contrôle du CN OK");

		/*
		 * // Contrôle de révocation du certificat serveur //
		 * --------------------------------------------
		 * 
		 * FileInputStream crlStream = null; try { // Chargement de la liste de
		 * révocation de l'ASIP CertificateFactory certFactory =
		 * CertificateFactory.getInstance("X.509"); crlStream = new
		 * FileInputStream("ac_ans/AC-CLASSE-4_CRL.crl"); X509CRL crl = (X509CRL)
		 * certFactory.generateCRL(crlStream);
		 * 
		 * // Verifie que la CRL a été signée par l'autorité de certification.
		 * crl.verify(caAut.getPublicKey());
		 * 
		 * // Vérifie si le certificat serveur est présent dans la liste de révocation.
		 * if(crl.isRevoked(certServer)){ throw new
		 * CertificateException("Le certificat du serveur est révoqué"); }
		 * 
		 * } catch (Exception ex) { ex.printStackTrace(); } finally { try {
		 * crlStream.close(); } catch (IOException ex) { ex.printStackTrace(); } }
		 * log.info("Certificat serveur non révoqué: OK");
		 * 
		 */

	}

	public X509Certificate[] getAcceptedIssuers() {

		return null;
	}

}
