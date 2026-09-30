package fr.sesamvitale.psc;

import java.io.FileInputStream;
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

import org.apache.log4j.Logger;

/**
 * Trust-manager pour l'authentification mutuelle Pro Sant Connect
 */
public class PscTrustManager implements X509TrustManager {
	private String certificatName = null;

	/** Trace */
	private static final Logger log = Logger.getLogger(PscTrustManager.class);

	public PscTrustManager(String certificatName) {
		this.certificatName = certificatName;
	}

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		// Aucune controle ici
	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		log.info("Reponse du serveur Type d'authentification : " + authType);

		if (chain == null) {
			String message = "chaine de certificats nulle";
			log.error(message);
			throw new CertificateException(message);
		}

		// Controle de validite de la chaine de certification
		// --------------------------------------------------

		for (int i = 0; i < chain.length; i++) {
			try {
				// Controle dates
				chain[i].checkValidity();
			} catch (CertificateExpiredException cee) {
				log.error("", cee);
				throw cee;
			} catch (CertificateNotYetValidException cnye) {
				log.error("", cnye);
				throw cnye;
			}
		}
		log.info("Controle de validite de la chaine de certification OK");

		// Recuperation du certificat serveur (par convention le premier de la chaine)
		// ---------------------------------------------------------------------------
		X509Certificate certServer = chain[0];

		// Lecture du DN
		// -------------
		String tlsDN = certServer.getSubjectX500Principal().getName();
		log.debug("DN recu du serveur= " + tlsDN);

		// Chargement des certificats des autorites de certification
		// ---------------------------------------------------------
		try (FileInputStream fis = new FileInputStream(certificatName)) {
			CertificateFactory cf = CertificateFactory.getInstance("X.509");
			X509Certificate caAut = (X509Certificate) cf.generateCertificate(fis);

			log.debug("Chargement des certificats des autorites de certification OK");

			// Controle de signature du certificat serveur a l'aide de la cle publique de
			// l'autorite
			// -------------------------------------------------------------------------------------
			certServer.verify(caAut.getPublicKey());
			log.debug("Controle de la signature du certificat serveur OK");
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
		} catch (Exception ex) {
			log.error("Exception " + ex.getMessage());
			log.error("", ex);
		}
	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
}
