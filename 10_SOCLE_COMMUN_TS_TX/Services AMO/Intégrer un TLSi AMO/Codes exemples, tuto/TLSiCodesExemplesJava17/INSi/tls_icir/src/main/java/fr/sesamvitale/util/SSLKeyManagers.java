/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/

package fr.sesamvitale.util;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509ExtendedKeyManager;

/**
 * Gestionnaire de cle pour l'etablissement du canal SSL
 * 
 */
public class SSLKeyManagers extends X509ExtendedKeyManager {
	String aliasForAuthentification = "authentification";
	X509Certificate[] authentificationCertificateChain;
	PrivateKey privateKey;

	/**
	 * constructeur
	 * 
	 * @param authentificationCertificateChain la chaîne de certificats
	 * @param privateKey                       la clé privée
	 */
	public SSLKeyManagers(X509Certificate[] authentificationCertificateChain, PrivateKey privateKey) {
		this.authentificationCertificateChain = authentificationCertificateChain;
		this.privateKey = privateKey;
	}

	/**
	 * @param keyType
	 * @param issuers
	 * @param socket
	 */
	public String chooseClientAlias(String[] keyType, Principal[] issuers, Socket socket) {
		return aliasForAuthentification;

	}

	/**
	 * @param keyType
	 * @param issuers
	 * @param socket
	 */
	public String chooseServerAlias(String keyType, Principal[] issuers, Socket socket) {
		return null;
	}

	/**
	 * 
	 * @param alias
	 */
	public X509Certificate[] getCertificateChain(String alias) {
		return authentificationCertificateChain;
	}


	/**
	 * 
	 * @param keyType
	 * @param issuers
	 */
	public String[] getClientAliases(String keyType, Principal[] issuers) {
		return new String[] { aliasForAuthentification };
	}

	/**
	 * 
	 * @param alias
	 */
	public PrivateKey getPrivateKey(String alias) {
		return privateKey;
	}

	/**
	 * 
	 * @param keyType
	 * @param issuers
	 */
	public String[] getServerAliases(String keyType, Principal[] issuers) {
		// TODO Auto-generated method stub
		return null;
	}

}
