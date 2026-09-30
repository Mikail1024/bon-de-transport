/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2017
 *  Project......: AssertionTLSi
 *  Author.......: DELAUNAN
 *  Summary......:  Classe utilitaire concernant le chiffrement.
 *  Date.........: 10 mai 2017 - 13:23:26
 *****************************************************************************/
package fr.santesocial.assertion.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.openssl.jcajce.JceOpenSSLPKCS8DecryptorProviderBuilder;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.pkcs.PKCSException;

import fr.santesocial.assertion.commun.AssertionException;

/**
 * Classe utilitaire concernant le chiffrement.<br>
 * <b style="color:red">IMPORTANT</b> : Le composant "UnlimitedJCEPolicy" doit
 * être installé dans la JVM utilisée (nécessaire pour charger une clé privée
 * avec BouncyCastle).
 */
public final class ChiffrementUtil {
    /**
     * Gestion des traces
     */
    private static final Logger LOG = LogManager.getLogger(ChiffrementUtil.class);

    /**
     * Lecture du certificat présent dans un fichier
     * 
     * @param certificateFilename le chemin vers le fichier contenant le certificat
     * @return le certificat chargé
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public static X509Certificate chargerCertificat(String certificateFilename) throws AssertionException {
	InputStream inStream = null;
	try {
	    inStream = new FileInputStream(new File(certificateFilename));
	    CertificateFactory cf = CertificateFactory.getInstance("X.509");
	    X509Certificate cert = (X509Certificate) cf.generateCertificate(inStream);
	    return cert;
	} catch (IOException | CertificateException e) {
	    LOG.error("Problème de lecture du certificat", e);
	    throw new AssertionException("Problème de lecture du certificat");
	} finally {
	    if (inStream != null) {
		try {
		    inStream.close();
		} catch (IOException e) {
		    LOG.error("Problème de fermerture du fichier du certificat", e);
		    throw new AssertionException("Problème de fermerture du fichier du certificat");
		}
	    }
	}
    }

    /**
     * Chargement d'un certificat de signature depuis un magasin de clés
     * 
     * @param keystoreFilename le nom du fichier du magasin de clés
     * @param password         le mot de passe du magasin de clés
     * @return le certificat identifié
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public static X509Certificate chargerCertificatSignatureDepuis(String keystoreFilename, String password)
	    throws AssertionException {
	try {
	    KeyStore keystore = ChiffrementUtil.chargerKeystore(keystoreFilename, password);
	    String alias = ChiffrementUtil.getSignatureCertificate(keystore);
	    return (X509Certificate) keystore.getCertificate(alias);
	} catch (KeyStoreException e) {
	    throw new AssertionException(e);
	}
    }

    /**
     * Lecture de la clé privée présente dans un fichier
     * 
     * @param keyFilename le chemin vers le fichier contenant la clé privée
     * @param passphrase  le mot de passe pour accéder à la clé privée
     * @return la clé privée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public static PrivateKey chargerClePrivee(String keyFilename, String passphrase) throws AssertionException {
	PEMParser pemParser = null;
	try {
	    pemParser = new PEMParser(new FileReader(new File(keyFilename)));
	    Object object = pemParser.readObject();
	    JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider(BouncyCastleProvider.PROVIDER_NAME);
	    PKCS8EncryptedPrivateKeyInfo pair = (PKCS8EncryptedPrivateKeyInfo) object;
	    JceOpenSSLPKCS8DecryptorProviderBuilder jce = new JceOpenSSLPKCS8DecryptorProviderBuilder()
		    .setProvider(BouncyCastleProvider.PROVIDER_NAME);
	    InputDecryptorProvider decProv = jce.build(passphrase.toCharArray());
	    PrivateKeyInfo info = pair.decryptPrivateKeyInfo(decProv);

	    return converter.getPrivateKey(info);
	} catch (IOException | OperatorCreationException | PKCSException e) {
	    throw new AssertionException("Problème de lecture de la clé privée " + e);

	} finally {
	    if (null != pemParser) {
		try {
		    pemParser.close();
		} catch (IOException e) {
		    throw new AssertionException("Problème de fermeture du fichier contenant la clé privée");
		}
	    }
	}
    }

    /**
     * Chargement d'une clé privée présente dans un magasin de clés
     * 
     * @param keystoreFilename le chemin vers le magasin de clés
     * @param password         le mot de passe du magasin de clés
     * @return la clé privée chargée
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    public static PrivateKey chargerClePriveeDepuis(String keystoreFilename, String password)
	    throws AssertionException {
	try {
	    KeyStore keystore = ChiffrementUtil.chargerKeystore(keystoreFilename, password);
	    String alias = ChiffrementUtil.getSignatureCertificate(keystore);
	    return (PrivateKey) keystore.getKey(alias, password.toCharArray());
	} catch (UnrecoverableKeyException | KeyStoreException | NoSuchAlgorithmException e) {
	    throw new AssertionException(e);
	}
    }

    /**
     * Chargement d'un magasin de clés
     * 
     * @param keystoreFilename le chemin vers le magasin de clés
     * @param password         le mot de passe du magasin de clés
     * @return le magasin de clés
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private static KeyStore chargerKeystore(String keystoreFilename, String password) throws AssertionException {
	FileInputStream fis = null;
	try {
	    fis = new FileInputStream(keystoreFilename);
	    KeyStore keystore = KeyStore.getInstance("pkcs12");
	    keystore.load(fis, password.toCharArray());
	    return keystore;
	} catch (NoSuchAlgorithmException | CertificateException | IOException | KeyStoreException e) {
	    throw new AssertionException(e);
	} finally {
	    if (null != fis) {
		try {
		    fis.close();
		} catch (IOException e) {
		    throw new AssertionException(e);
		}
	    }
	}
    }

    /**
     * 
     * @param keystore
     * @return
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private static String getSignatureCertificate(KeyStore keystore) throws AssertionException {
	try {
	    Enumeration<String> aliases = keystore.aliases();
	    while (aliases.hasMoreElements()) {
		String alias = aliases.nextElement();
		if (isSignatureAlias(keystore, alias)) {
		    return alias;
		}
	    }
	} catch (KeyStoreException e) {
	    throw new AssertionException(e);
	}
	throw new AssertionException("Aucun certificat trouvé");
    }

    /**
     * @param ks
     * @param alias
     * @return
     * @throws AssertionException en cas de problème de génération de l'assertion
     */
    private static boolean isSignatureAlias(KeyStore ks, String alias) throws AssertionException {
	try {
	    X509Certificate certificat = (X509Certificate) ks.getCertificate(alias);
	    if (certificat == null) {
		return false;
	    }

	    return ((null != certificat.getKeyUsage()) && (certificat.getKeyUsage()[0]));
	} catch (KeyStoreException e) {
	    throw new AssertionException(e);
	}
    }
}
