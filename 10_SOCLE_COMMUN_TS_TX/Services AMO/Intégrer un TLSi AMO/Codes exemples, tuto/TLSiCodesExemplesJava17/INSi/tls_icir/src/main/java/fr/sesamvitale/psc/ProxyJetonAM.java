package fr.sesamvitale.psc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.sesamvitale.lps.GetINS;

/**
 * Proxy pour obtenir le jeton AM nécessaire pour le mode d'authentification via
 * Pro Santé Connect
 */
public class ProxyJetonAM {

	/**
	 * Logger
	 */
	private static final Logger LOG = Logger.getLogger(ProxyJetonAM.class);

	/**
	 * URL pour le Token PSC
	 */
	private static final String URL_GET_TOKEN = "https://qualiflps-auth-services-ps-tlsm.ameli.fr/token-exchange";

	/**
	 * Obtention d'un jeton AM dans le cadre d'une authentification en mode Pro
	 * Santé Connect
	 * 
	 * @param subjectToken le subject-token obtenu dans le cadre du processus
	 *                     d'authentification en mode Pro Santé Connect
	 * @return
	 * @throws InterruptedException
	 */
	public String getToken(String subjectToken) throws InterruptedException {
		try {
			HttpClient httpclient = this.creerHttpClient();
			HttpRequest httpPost = this.creerHttpRequestGetToken(subjectToken, URL_GET_TOKEN);
			HttpResponse<String> response = httpclient.send(httpPost, BodyHandlers.ofString());
			return this.traiterReponseHttpGetToken(response);
		} catch (IOException | NoSuchAlgorithmException | KeyStoreException | CertificateException
				| UnrecoverableKeyException | KeyManagementException e) {
			LOG.error("Erreur lors de l'appel à getToken AMO : ", e);
			throw new IllegalStateException("Erreur lors de l'appel à getToken AMO : ", e);
		}
	}

	/**
	 * Création du client HTTP
	 * 
	 * @return
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws CertificateException
	 * @throws IOException
	 */
	private HttpClient creerHttpClient() throws UnrecoverableKeyException, KeyManagementException,
			NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
		System.setProperty("jsse.enableSNIExtension", "false");
		System.setProperty("jdk.internal.httpclient.disableHostnameVerification", "true");

		// Allow TLSv1 protocol only
		return HttpClient.newBuilder().sslContext(this.getSSLContext()).build();
	}

	/**
	 * Création de la requête HTTP à transmettre
	 * 
	 * @param subjectToken le token issu de Pro Santé Connect
	 * @param url          l'URL de l'API REST
	 * @return la requête créée
	 * @throws IOException
	 * @throws CertificateException
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 */
	private HttpRequest creerHttpRequestGetToken(String subjectToken, String url)
			throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
		Map<String, String> params = new HashMap<>();
		params.put("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange");
		params.put("subject_token", subjectToken);
		params.put("subject_token_type", "urn:ietf:params:oauth:token-type:access_token");
		params.put("scope", "all");
		// => À personnaliser pour le LPS
		params.put("client_id", GetINS.PSC_CLIENT_ID);

		return HttpRequest.newBuilder().uri(URI.create(URL_GET_TOKEN))
				.header("Content-Type", "application/x-www-form-urlencoded")
				.POST(BodyPublishers.ofString(getFormDataAsString(params))).build();
	}

	/**
	 * Renvoie les paramètres de la requêtes
	 * 
	 * @param formData les paramètres à prendre en compte
	 * @return la chaîne créée
	 */
	private static String getFormDataAsString(Map<String, String> formData) {
		StringBuilder formBodyBuilder = new StringBuilder();
		for (Map.Entry<String, String> singleEntry : formData.entrySet()) {
			if (formBodyBuilder.length() > 0) {
				formBodyBuilder.append("&");
			}
			formBodyBuilder.append(URLEncoder.encode(singleEntry.getKey(), StandardCharsets.UTF_8));
			formBodyBuilder.append("=");
			formBodyBuilder.append(URLEncoder.encode(singleEntry.getValue(), StandardCharsets.UTF_8));
		}
		return formBodyBuilder.toString();
	}

	/**
	 * Traitement d'une réponse HTTP pour l'API REST "/demanderauthapcves"
	 * 
	 * @param response la réponse de l'API
	 * @return le résultat du traitement
	 * @throws IOException
	 * @throws JsonProcessingException
	 * @throws EcvException
	 */
	private String traiterReponseHttpGetToken(HttpResponse<String> response)
			throws JsonProcessingException, IOException {
		// Dans le cadre du code exemple, les réponses sont gérées de deux manières
		// différentes :
		// - soit le code retour de la réponse est "200 OK" et le jeton AM est récupérée
		// dans la réponse
		// - soit le code retour est traité comme une erreur et une exception Java est
		// levée
		// => À personnaliser pour le LPS
		switch (response.statusCode()) {
		case HttpURLConnection.HTTP_OK:
			return this.extraireJetonAM(response.body());
		case HttpURLConnection.HTTP_BAD_REQUEST:
		case HttpURLConnection.HTTP_UNAUTHORIZED:
		case HttpURLConnection.HTTP_FORBIDDEN:
			String erreur = this.extraireErreur(response.body());
			throw new IllegalStateException(erreur);
		default:
			LOG.error("Code réponse inconnu '" + response.statusCode() + "'");
			throw new IllegalStateException("Code réponse inconnu '" + response.statusCode() + "'");
		}
	}

	/**
	 * Traitement d'une réponse HTTP pour l'API REST "/getToken AMO"
	 * 
	 * @param responseBody le corps de la réponse de l'API
	 * @return le résultat du traitement
	 * @throws IOException
	 * @throws JsonProcessingException
	 */
	private String extraireJetonAM(String responseBody) throws JsonProcessingException, IOException {
		LOG.debug("Réponse du service acces token AMO à traiter : " + responseBody);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode token = mapper.readTree(responseBody);

		String accessToken = token.get("access_token").asText();

		LOG.debug("acces_token AMO : " + accessToken);

		return accessToken;
	}

	/**
	 * Traitement d'une réponse HTTP pour l'API REST "getToken AMO" en erreur
	 * 
	 * @param responseBody le corps de la réponse de l'API
	 * @return le résultat du traitement
	 * @throws IOException
	 * @throws JsonProcessingException
	 */
	private String extraireErreur(String responseBody) throws JsonProcessingException, IOException {
		LOG.debug("Réponse du service acces token AMO à traiter en erreur : " + responseBody);

		ObjectMapper mapper = new ObjectMapper();
		JsonNode erreur = mapper.readTree(responseBody);

		String message = erreur.get("error_description").asText() + " (code \"" + erreur.get("error").asText() + "\")";
		LOG.error(message);
		return message;
	}

	/**
	 * Création du contexte SSL pour la gestion de l'authentification mutuelle
	 * 
	 * @return le contexte créé
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws CertificateException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	private SSLContext getSSLContext() throws NoSuchAlgorithmException, KeyStoreException, CertificateException,
			IOException, UnrecoverableKeyException, KeyManagementException {
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(this.getKeyManagers(), this.getTrustManagers(), null);
		return sslContext;
	}

	/**
	 * Création du keystore
	 * 
	 * @return les "key manager"
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws CertificateException
	 * @throws IOException
	 * @throws UnrecoverableKeyException
	 * @throws KeyManagementException
	 */
	private KeyManager[] getKeyManagers() throws NoSuchAlgorithmException, KeyStoreException, CertificateException,
			IOException, UnrecoverableKeyException, KeyManagementException {
		KeyStore ks = KeyStore.getInstance("PKCS12");
		// Création du keystore à partir d'un fichier *.p12 présent dans le code exemple
		// et de son mot de passe
		// => À personnaliser pour le LPS
		File ksFile = new File(GetINS.CERTIFICAT_LOGICIEL_PSC);
		String motDePasse = GetINS.CERTIFICAT_LOGICIEL_PSC_MOT_DE_PASSE;
		LOG.info("Fichier pour le keystore : " + ksFile.getAbsolutePath());
		InputStream ksIs = new FileInputStream(ksFile);
		try {
			ks.load(ksIs, motDePasse.toCharArray());
		} finally {
			ksIs.close();
		}

		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(ks, motDePasse.toCharArray());

		return kmf.getKeyManagers();
	}

	/**
	 * Création du truststore
	 * 
	 * @return les "trust manager"
	 * 
	 * @throws KeyStoreException
	 * @throws IOException
	 * @throws CertificateException
	 * @throws NoSuchAlgorithmException
	 */
	private TrustManager[] getTrustManagers() {
		List<TrustManager> trustManagers = new ArrayList<>();

		// Initialisation du truststore à partir de certificats présents sous forme de
		// fichiers dans le code exemple
		// => À personnaliser pour le LPS
		for (String fichierCertificatAutorite : GetINS.CERTIFICATS_AUTORITE) {
			trustManagers.add(new PscTrustManager(fichierCertificatAutorite));
		}

		return trustManagers.toArray(new TrustManager[] {});
	}
}
