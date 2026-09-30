package fr.sesamvitale.lps;

/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.naming.ConfigurationException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.soap.DetailEntry;
import jakarta.xml.soap.SOAPFault;

import javax.xml.namespace.QName;
import javax.xml.parsers.FactoryConfigurationError;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.TypeSecurity;
import org.w3._2005._08.addressing.AttributedURIType;

import fr.cnamts.insirecsans.ObjectFactory;
import fr.cnamts.insirecsans.TraitsDIdentite;
import fr.cnamts.insirecvit.Beneficiaire;
import fr.cnamts.insiresultat.Resultat;
import fr.cnamts.webservice.ICIRService;
import fr.cnamts.webservice.ICIRV1;
import fr.santesocial.assertion.cps.Cps3Pkcs11;
import fr.sesamvitale.pkcs12.Pkcs12Impl;
import fr.sesamvitale.psc.ProxyJetonAM;
import fr.sesamvitale.util.AssertionSoapLogger;
import fr.sesamvitale.util.SSLKeyManagers;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.soap.AddressingFeature;
import jakarta.xml.ws.soap.SOAPFaultException;
import siram.bam.ctxbam.ContexteBAM;
import siram.lps.ctxlps.ContexteLPS;

public class GetINS {
	private static final Logger log = LogManager.getLogger(GetINS.class);
	/**
	 * Chemin de la cryptolib (64 bits).<br>
	 * La cryptolib 32 bits est "C:\\Windows\\SysWOW64\\cps3_pkcs11_w32.dll"
	 */
	public static final String CRYPTOLIB_DIR = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";
	/**
	 * Répertoire d'installation de MICA (64 bits).<br>
	 * Le répertoire 32 bits est "C:\\Program Files (x86)\\santesocial\\mica\\"
	 */
	public static final String MICA_DIR = "C:\\Program Files\\santesocial\\mica\\";
	/**
	 * Slot de connexion de la carte CPS
	 */
	public static final int CPS_SLOT = 4;
	/**
	 * Code porteur de la carte CPS
	 */
	public static final String CODE_PORTEUR = "1234";

	/**
	 * Certificat INSI-AUTO utilis pour l'authentification mutuelle INSi pour
	 * "TLS-Mutuelle".<br>
	 * Dans le cadre du dveloppement du code exemple, il faut utiliser pour les
	 * tests :
	 * <ul>
	 * <li>"Certificates/INSI-AUTO/asip-p12-EL-TEST-ORG-AUTH_CLI-20240328-112447.p12"
	 * pour les tests "TLS-Mutuelle"</li>
	 * <li>"Certificates/INSI-PSC/asip-p12-EL-TEST-ORG-AUTH_CLI-20230412-102311.p12"
	 * pour les tests "Pro Sant Connect"</li>
	 * </ul>
	 */
	public static final String CERTIFICAT_LOGICIEL_INSI_AUTO_FICHIER = "Certificates/INSI-AUTO/XXXX.p12";

	/**
	 * Mot de passe du certificat INSI-AUTO
	 */
	public static final String CERTIFICAT_LOGICIEL_INSI_AUTO_MOT_DE_PASSE = "password";

	/**
	 * Certificat PSC utilis pour l'authentification mutuelle pour les API REST de
	 * Pro Sant Connect.<br>
	 * Dans le cadre du dveloppement du code exemple, il faut utiliser pour les
	 * tests un certificat identique celui utilis dans ADEMIS
	 */
	public static final String CERTIFICAT_LOGICIEL_PSC = "Certificates/INSI-PSC/XXXXX.p12";

	/**
	 * Mot de passe du certificat PSC
	 */
	public static final String CERTIFICAT_LOGICIEL_PSC_MOT_DE_PASSE = "password";

	/**
	 * "client_id" transmis dans une requte HTTP Pro Sant Connect
	 */
	public static final String PSC_CLIENT_ID = "id client PSC";

	/**
	 * Liste des certificats d'autorit ncessaires pour la ralisation d'une
	 * authentification en mode Pro Sant Connect
	 */
	public static final List<String> CERTIFICATS_AUTORITE = Arrays.asList("Certificates\\AC_SERVICES_APPLICATIFS.pem",
			"Certificates\\OSI-XXX.pem", "Certificates\\OSI-XXXX_AC-SERVEUR.pem",
			"Certificates\\ACR-A_XXXX.pem");

	private static boolean CPS = false;

	/**
	 * Mode d'authentification via Pro Sant Connect
	 */
	private static boolean PSC = false;

	/**
	 * Initialise l'application.
	 * 
	 * @throws FactoryConfigurationError
	 * @throws MalformedURLException
	 * @throws ConfigurationException
	 * @throws LocationException
	 */

	private static void init() throws MalformedURLException, FactoryConfigurationError {
		log.debug(">>main");
	}

	private static void setUpProxySSL() throws Exception {
		System.setProperty("java.net.useSystemProxies", "true");

		// keyManager pour l'authentification TLS
		KeyManager[] managers = null;
		if (isPSC() || (isCPS() == false)) {
			managers = new KeyManager[1];
			X509Certificate[] certificatesChain = new X509Certificate[1];
			// if ("P12".equalsIgnoreCase(Properties.load("CERTIFICATE_TYPE"))) {
			// gestion TLS avec certificat serveur (P12)
			Pkcs12Impl pkcs12 = new Pkcs12Impl();
			pkcs12.login(CERTIFICAT_LOGICIEL_INSI_AUTO_FICHIER, CERTIFICAT_LOGICIEL_INSI_AUTO_MOT_DE_PASSE);
			certificatesChain[0] = pkcs12.getCertificate();
			managers[0] = new SSLKeyManagers(certificatesChain, pkcs12.getKey());
		}
		TrustManager[] trustCerts = new TrustManager[] { new MyTrustManager() // s'assure que le cn se termine bien par
																				// ...services-ps.ameli.fr
		};

		SSLContext sc = null;
		try {
			sc = SSLContext.getInstance(isPSC() ? "TLSv1.2" : "TLS");
			sc.init(managers, trustCerts, /* new java.security.SecureRandom() */null);
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			log.error("", e);
			throw e;
		}
	}

	private static void logSoapFault(SOAPFaultException e) {
		if (e.getFault().getFaultRole() != null) {
			log.debug("Role : " + e.getFault().getFaultRole());
		}
		if (e.getFault().getFaultCode() != null) {
			log.debug("Code : " + e.getFault().getFaultCode());
		}
		Iterator<QName> subCodeList = e.getFault().getFaultSubcodes();
		while (subCodeList.hasNext()) {
			String subCodeText = subCodeList.next().toString();
			if (subCodeText != null) {
				log.debug("subCode : " + subCodeText);
			}
		}
		if (e.getFault().getFaultString() != null) {
			log.debug("texte : " + e.getFault().getFaultString());
		}
		if (e.getCause() != null) {
			log.debug("Cause : " + e.getCause());
		}
		try {
			SOAPFault faute = e.getFault();
			log.debug("SOAPFaultException : Code = " + faute.getFaultCode() + " - Reason text = "
					+ faute.getFaultString());

			Iterator<QName> subCodeList1 = faute.getFaultSubcodes();
			while (subCodeList1.hasNext()) {
				String subCodeText = subCodeList1.next().toString();
				if (subCodeText != null) {
					log.debug("                     - subCodeText = " + subCodeText);
				}
			}

			// recuperation de l'élément Erreur dans le détail de la faute soap
			if (faute.getDetail().hasChildNodes()) {
				Iterator<DetailEntry> listeDetail = faute.getDetail().getDetailEntries();
				while (listeDetail.hasNext()) {
					DetailEntry d = listeDetail.next();
					log.debug("DetailEntry = " + d.getElementName().getLocalName());
					if (d.getElementName().getLocalName().equals("Erreur")) {
						String code = d.getAttributeValue(new QName("code"));
						String messageID = d.getAttributeValue(new QName("messageID"));
						String severite = d.getAttributeValue(new QName("severite"));
						String value = d.getValue();
						log.debug("value = " + value);
						log.debug("code = " + code + ", messageID = " + messageID + ", severite = " + severite);
					}
				}
			}

		} catch (Exception ex) {
			log.debug("Erreur sur détail faute SOAP", ex);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static TraitsDIdentite getInsiRecSansVitale(String fileName) {
		log.debug(">>getInsiRecSansVitale(" + fileName + ")");

		TraitsDIdentite assertion = new ObjectFactory().createTraitsDIdentite();
		try {
			JAXBContext context = JAXBContext.newInstance("fr.cnamts.insirecsans");
			Unmarshaller u = context.createUnmarshaller();
			JAXBElement<TraitsDIdentite> jbEl = new JAXBElement(
					new QName("http://www.cnamts.fr/INSiRecSans", "RECSANSVITALE"), assertion.getClass(), assertion);
			jbEl = (JAXBElement<TraitsDIdentite>) u.unmarshal(new FileInputStream(fileName));
			assertion = jbEl.getValue();
		} catch (FileNotFoundException e) {
			log.debug("FileNotFoundException " + e);
			assertion = null;
		} catch (JAXBException e) {
			// On encapsule dans une exception non contrôlée
			log.debug("RECSANSVITALE : JAXBException " + e);
			assertion = null;
		}
		log.debug("<<getInsiRecSansVitale");
		return assertion;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static ContexteLPS getContexteLPS(String fileName) {
		log.debug(">>getContexteLPS(" + fileName + ")");
		ContexteLPS assertion = new ContexteLPS();
		try {
			JAXBContext context = JAXBContext.newInstance("siram.lps.ctxlps");
			Unmarshaller u = context.createUnmarshaller();
			JAXBElement<ContexteLPS> jbEl = new JAXBElement(new QName("urn:siram.lps.ctxlps", "ContexteLPS"),
					assertion.getClass(), assertion);
			jbEl = (JAXBElement<ContexteLPS>) u.unmarshal(new FileInputStream(fileName));
			assertion = jbEl.getValue();
		} catch (FileNotFoundException e) {
			log.debug("FileNotFoundException " + e);
			assertion = null;
		} catch (JAXBException e) {
			// On encapsule dans une exception non contrôlée
			log.debug("ContexteLPS : JAXBException " + e);
			assertion = null;
		}
		log.debug("<<getContexteLPS");
		return assertion;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static ContexteBAM getContexteBAM(String fileName) {
		log.debug(">>getContexteBAM(" + fileName + ")");
		ContexteBAM assertion = new ContexteBAM();
		try {
			JAXBContext context = JAXBContext.newInstance("siram.bam.ctxbam");
			Unmarshaller u = context.createUnmarshaller();
			JAXBElement<ContexteBAM> jbEl = new JAXBElement(new QName("urn:siram.bam.ctxbam", "ContexteBAM"),
					assertion.getClass(), assertion);
			jbEl = (JAXBElement<ContexteBAM>) u.unmarshal(new FileInputStream(fileName));
			assertion = jbEl.getValue();
		} catch (FileNotFoundException e) {
			log.debug("FileNotFoundException " + e);
			assertion = null;
		} catch (JAXBException e) {
			// On encapsule dans une exception non contrôlée
			log.debug("ContexteBAM : JAXBException " + e);
			assertion = null;
		}
		log.debug("<<getContexteBAM");
		return assertion;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Beneficiaire getInsRecVitale(String fileName) {
		log.debug(">>getInsRecVitale(" + fileName + ")");
		Beneficiaire assertion = new fr.cnamts.insirecvit.ObjectFactory().createBeneficiaire();
		try {
			JAXBContext context = JAXBContext.newInstance("fr.cnamts.insirecvit");
			Unmarshaller u = context.createUnmarshaller();
			JAXBElement<Beneficiaire> jbEl = new JAXBElement(new QName("http://www.cnamts.fr/INSiRecVit", "RECVITALE"),
					assertion.getClass(), assertion);
			jbEl = (JAXBElement<Beneficiaire>) u.unmarshal(new FileInputStream(fileName));
			assertion = jbEl.getValue();
		} catch (FileNotFoundException e) {
			log.debug("FileNotFoundException " + e);
			assertion = null;
		} catch (JAXBException e) {
			// On encapsule dans une exception non contrôlée
			log.debug("RECVITALE : JAXBException " + e);
			assertion = null;
		}
		log.debug("<<getInsRecVitale");
		return assertion;
	}

	/**
	 * Fonction principale du code exemple
	 * 
	 * @param args le arguments fournis dans la ligne de commande, ici il est
	 *             possible de positionner un argument avec les valeurs suivantes :
	 *             <ul>
	 *             <li><code>a</code> : Rechercher INS par Traits d'Identité avec
	 *             une authentification par assertion CPS</li>
	 *             <li><code>b</code> : Rechercher INS par carte Vitale avec une
	 *             authentification par assertion CPS</li>
	 *             <li><code>c</code> : Rechercher INS par Traits d'Identité avec
	 *             une authentification par assertion TLS-Mutuelle</li>
	 *             <li><code>d</code> : Rechercher INS par carte Vitale avec une
	 *             authentification par assertion TLS-Mutuelle</li>
	 *             <li><code>e</code> : Rechercher INS par Traits d'Identité avec
	 *             une authentification par assertion Pro Santé Connect</li>
	 *             <li><code>f</code> : Rechercher INS par carte Vitale avec une
	 *             authentification par assertion Pro Santé Connect</li>
	 *             </ul>
	 */
	public static void main(String[] args) {
		System.out.println("Début du main");
		try {
			// Initialisation du composant
			init();

			// Chargement d'un contexte LPS depuis un fichier
			// => À personnaliser pour le LPS
			ContexteLPS contextelps = getContexteLPS("ContexteLPS.xml");
			try {
				log.debug("Id = " + contextelps.getId());
			} catch (NullPointerException att10) {
			}
			try {
				log.debug("Temps().toString = " + contextelps.getTemps().toString());
			} catch (NullPointerException att11) {
			}
			try {
				log.debug("Emetteur = " + contextelps.getEmetteur());
			} catch (NullPointerException att12) {
			}
			try {
				log.debug("Value = " + contextelps.getLPS().getIDAM().getValue());
			} catch (NullPointerException att13) {
			}
			try {
				log.debug("Version = " + contextelps.getLPS().getVersion());
			} catch (NullPointerException att14) {
			}

			// Chargement d'un contexte BAM depuis un fichier
			// => À personnaliser pour le LPS
			ContexteBAM contextebam = getContexteBAM("ContexteBAM.xml");
			try {
				log.debug("Id = " + contextebam.getId());
			} catch (NullPointerException att20) {
			}
			try {
				log.debug("Temps().toString = " + contextebam.getTemps().toString());
			} catch (NullPointerException att21) {
			}
			try {
				log.debug("Emetteur = " + contextebam.getEmetteur());
			} catch (NullPointerException att22) {
			}
			try {
				log.debug("GrandRegime = " + contextebam.getCOUVERTURE().getGrandRegime());
			} catch (NullPointerException att23) {
			}
			try {
				log.debug("Organisme = " + contextebam.getCOUVERTURE().getOrganisme());
			} catch (NullPointerException att24) {
			}
			try {
				log.debug("CodeCentre = " + contextebam.getCOUVERTURE().getCodeCentre());
			} catch (NullPointerException att25) {
			}
			boolean continu = true;
			try {

				// Initialisation du composant pour l'appel au webservice
				ICIRV1 monService = new ICIRV1();

				ICIRService monInterfaceService = monService.getICIRService(new AddressingFeature());

				TypeSecurity security = new TypeSecurity();

				AttributedURIType messageId = new AttributedURIType();

				// Initialisation des URL pour les webservices
				// => À personnaliser pour le LPS
				String monURL = "https://qualiflps.services-ps.ameli.fr/lps";
				String monURLmutuelle = "https://qualiflps-services-ps-tlsm.ameli.fr/lps";
				String argumentSaisi;

				while (continu) {

					if (args.length == 0) {
						System.out.println("********************************************************");
						System.out.println("* Veuillez saisir un argument et appuyez sur entrée    *");
						System.out.println("********************************************************");
						System.out.println("**********************par CPS***************************");
						System.out.println("Rechercher INS par Traits d'Identité: tapez a");
						System.out.println("Rechercher INS par carte Vitale: tapez b");
						System.out.println("**********************par TLS-Mutuelle******************");
						System.out.println("Rechercher INS par Traits d'Identité: tapez c");
						System.out.println("Rechercher INS par carte Vitale: tapez d");
						System.out.println("**********************par Pro Sant Connect*************");
						System.out.println("Rechercher INS par Traits d'Identité: tapez e");
						System.out.println("Rechercher INS par carte Vitale: tapez f");
						System.out.println("********************************************************");
						System.out.println("Quitter: tapez q");
						System.out.println("********************************************************");

						BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

						argumentSaisi = entree.readLine();
					} else {
						argumentSaisi = args[0];
						continu = false;
					}

					switch (argumentSaisi.charAt(0)) {

					case 'a':
						setCPS(true);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURL);

						try {
							log.debug("Appel opération rechercherInsAvecTraitsIdentite");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion CPS
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<>(2);
							handlersChain.add(new AssertionPSHandler());
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							TraitsDIdentite Req = getInsiRecSansVitale(
									"WS_INS2_rechercherInsAvecTraitsIdentite_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecTraitsIdentite(Req, security,
									contextelps, messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'b':
						setCPS(true);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURL);

						try {
							log.debug("Appel opération rechercherInsAvecCarteVitale");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion CPS
							// - un handler pour l'assertion Vitale
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<>(3);
							handlersChain.add(new AssertionPSHandler());
							handlersChain.add(new AssertionVitaleHandler(
									Cps3Pkcs11.getInstance(CRYPTOLIB_DIR).getNumeroFacturation(CPS_SLOT), false));
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							Beneficiaire Req = getInsRecVitale("WS_INS1_rechercherInsAvecCarteVitale_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecCarteVitale(Req, security, contextelps,
									messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'c':
						setCPS(false);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURLmutuelle);

						try {
							log.debug("Appel opération rechercherInsAvecTraitsIdentite");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion CPS
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<Handler>(2);
							handlersChain.add(new AssertionPSHandler());
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							TraitsDIdentite Req = getInsiRecSansVitale(
									"WS_INS2_rechercherInsAvecTraitsIdentite_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecTraitsIdentite(Req, security,
									contextelps, messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'd':
						setCPS(false);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURLmutuelle);

						try {
							log.debug("Appel opération rechercherInsAvecCarteVitale");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion CPS
							// - un handler pour l'assertion Vitale
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<>(3);
							handlersChain.add(new AssertionPSHandler());
							handlersChain.add(new AssertionVitaleHandler(
									Cps3Pkcs11.getInstance(CRYPTOLIB_DIR).getNumeroFacturation(CPS_SLOT), false));
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							Beneficiaire Req = getInsRecVitale("WS_INS1_rechercherInsAvecCarteVitale_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecCarteVitale(Req, security, contextelps,
									messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'e':
						setPSC(true);
						setCPS(true);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURLmutuelle);

						try {
							// Dans le cadre de Pro Santé Connect :
							// - obtention d'un jeton AM
							// - positionnement du jeton AM dans l'entête de la requête au webservice INSi
							// => À personnaliser pour le LPS
							log.debug("Obtention d'un jeton AM");
							String jetonPsc = obtenirJetonAm();
							log.debug("Accès avec PSC avec le jeton : " + jetonPsc);
							((BindingProvider) monInterfaceService).getRequestContext()
									.put(MessageContext.HTTP_REQUEST_HEADERS, Collections.singletonMap("Authorization",
											Collections.singletonList("Bearer " + jetonPsc)));

							log.debug("Appel opération rechercherInsAvecTraitsIdentite");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion Pro Santé Connect
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<Handler>(2);
							handlersChain.add(new AssertionPSCHandler());
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							TraitsDIdentite Req = getInsiRecSansVitale(
									"WS_INS2_rechercherInsAvecTraitsIdentite_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecTraitsIdentite(Req, security,
									contextelps, messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'f':
						setPSC(true);
						setCPS(true);
						setUpProxySSL();
						((BindingProvider) monInterfaceService).getRequestContext()
								.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, monURLmutuelle);

						try {
							// Dans le cadre de Pro Santé Connect :
							// - obtention d'un jeton AM
							// - positionnement du jeton AM dans l'entête de la requête au webservice INSi
							// => À personnaliser pour le LPS
							log.debug("Obtention d'un jeton AM");
							String jetonPsc = obtenirJetonAm();
							log.debug("Accès avec PSC avec le jeton : " + jetonPsc);
							((BindingProvider) monInterfaceService).getRequestContext()
									.put(MessageContext.HTTP_REQUEST_HEADERS, Collections.singletonMap("Authorization",
											Collections.singletonList("Bearer " + jetonPsc)));

							log.debug("Appel opération rechercherInsAvecCarteVitale");
							messageId.setValue("uuid:9f31eb3b-e39f-4518-a13f-07fdc262f925");

							// Renseignement des handlers pour le webservice
							// - un handler pour l'assertion Pro Santé Connect
							// - un handler pour l'assertion Vitale
							// - un handler pour la gestion des traces
							// => À personnaliser pour le LPS
							@SuppressWarnings("rawtypes")
							List<Handler> handlersChain = new ArrayList<>(3);
							handlersChain.add(new AssertionPSCHandler());
							handlersChain.add(new AssertionVitaleHandler(
									Cps3Pkcs11.getInstance(CRYPTOLIB_DIR).getNumeroFacturation(CPS_SLOT), false));
							handlersChain.add(new AssertionSoapLogger());
							((BindingProvider) monInterfaceService).getBinding().setHandlerChain(handlersChain);

							// Valorisation du body à partir d'un fichier
							// => À personnaliser pour le LPS
							Beneficiaire Req = getInsRecVitale("WS_INS1_rechercherInsAvecCarteVitale_requete.xml");

							// Appel du webservice et récupération de la réponse
							Resultat rep = monInterfaceService.rechercherInsAvecCarteVitale(Req, security, contextelps,
									messageId, contextebam);

							// Traitement de la réponse du webservice
							// => À personnaliser pour le LPS
							log.debug("Opération OK ");
							try {
								log.debug("RESULTAT = ");
								log.debug("insActif"
										+ rep.getINDIVIDU().getINSACTIF().getIdIndividu().getNumIdentifiant());
								log.debug("libelleCR" + rep.getCR().getLibelleCR());

							} catch (NullPointerException reponse) {
							}
						} catch (SOAPFaultException se) {
							log.error("Faute SOAP opération getINS - " + se.toString());
							logSoapFault(se);
							log.error("", se);
						}
						break;

					case 'q':
						continu = false;
						System.out.println("fin...");
						break;

					}

				}

				log.debug("<<main");
			}

			catch (Exception e) {
				log.debug("Exception", e);
			}
		} catch (Exception e) {
			log.debug("Exception", e);
		}
	}

	public static boolean isCPS() {
		return CPS;
	}

	public static void setCPS(boolean cPS) {
		CPS = cPS;
	}

	public static boolean isPSC() {
		return PSC;
	}

	public static void setPSC(boolean pSC) {
		PSC = pSC;
	}

	/**
<<<<<<< HEAD
	 * Rcupration du jeton PSC, actuellement via saisie par l'utilisateur
=======
	 * Récupération du jeton AM, actuellement via saisie par l'utilisateur
	 * d'informations sur le jeton Pro Santé Connect.<br>
	 * <br>
	 * Dans le cadre du code exemple, il est convenu de ne pas intégrer l'ensemble
	 * des mécanismes d'une authentification Pro Santé Connect.
>>>>>>> stash
	 * 
	 * @return le jeton PSC obtenu
	 * @throws IOException
	 * @throws InterruptedException
	 */
	private static String obtenirJetonAm() throws IOException, InterruptedException {
		System.out.println("Tapez la valeur du jeton access_token PSC: ");
		String subjectToken = new BufferedReader(new InputStreamReader(System.in)).readLine();
		return new ProxyJetonAM().getToken(subjectToken);
	}

}
