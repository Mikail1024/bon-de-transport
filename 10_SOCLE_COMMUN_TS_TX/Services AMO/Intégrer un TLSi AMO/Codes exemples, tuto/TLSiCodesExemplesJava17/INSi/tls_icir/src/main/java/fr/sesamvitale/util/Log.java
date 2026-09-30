package fr.sesamvitale.util;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jakarta.xml.soap.DetailEntry;
import jakarta.xml.soap.SOAPBodyElement;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPFault;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import jakarta.xml.ws.soap.SOAPFaultException;

/**
 * @author dubreilg
 *
 */
public final class Log {

	private static final Logger LOG = LogManager.getLogger(Log.class);

	/**
	 * Format de date pour horodater un fichier
	 */
	private static final String DATE_FORMAT = "yyyyMMdd_HHmmssSSS_";

	/**
	 * Constructeur privé
	 */
	private Log() {
	}

	private static String obtenirNomMessageSoap(SOAPMessageContext context) {
		StringBuilder name = new StringBuilder();

		// si les noms du service et de l'opération sont renseignés, on constitut le nom
		// du message avec
		QName svcn = (QName) context.get(MessageContext.WSDL_SERVICE);

		if (svcn != null && svcn.getLocalPart() != null) {
			name.append(svcn.getLocalPart());
		}

		QName opn = (QName) context.get(MessageContext.WSDL_OPERATION);

		if (opn != null && opn.getLocalPart() != null) {
			name.append(".").append(opn.getLocalPart());
			return name.toString();
		}

		// si les informations précédentes ne sont pas renseignées, on constitut le nom
		// du message avec le nom de la balise principale du body
		try {
			NodeList nodes = context.getMessage().getSOAPPart().getEnvelope().getBody().getChildNodes();

			for (int i = 0; i < nodes.getLength(); i++) {
				Node item = nodes.item(i);

				if (item instanceof SOAPBodyElement) {
					name.append(".").append(item.getLocalName());
					break;
				}
			}
		} catch (SOAPException e) {
			LOG.error("", e);
		}
		return name.toString();
	}

	public static void requete(SOAPMessageContext context) {
		if (LOG.isDebugEnabled()) {
			Element requete = context.getMessage().getSOAPPart().getDocumentElement();

			String fileName = obtenirNomMessageSoap(context) + ".request.xml";

			Log.ecrireElementDans(requete, fileName);

			LOG.debug("Requete du Web Service en cours d'emission");
		}
	}

	public static void reponse(SOAPMessageContext context) {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Reponse du Web Service recue");

			if (context.getMessage() != null && context.getMessage().getContentDescription() != null) {
				LOG.debug("Content Description : " + context.getMessage().getContentDescription());
			}

			Element reponse = context.getMessage().getSOAPPart().getDocumentElement();
			try {
				String fileName = obtenirNomMessageSoap(context) + ".response.xml";
				Log.ecrireElementDans(reponse, fileName);
			} catch (TransformerFactoryConfigurationError e) {
				LOG.error("", e);
			}
		}
	}

	public static void fauteSoap(SOAPMessageContext context) {
		if (LOG.isDebugEnabled()) {
			try {
				Element requete = context.getMessage().getSOAPPart().getDocumentElement();
				Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
				String fileName = null;

				if (isRequest) {
					LOG.debug("Requete avec faute");
					fileName = obtenirNomMessageSoap(context) + ".request-soap-fault.xml";
				} else {
					LOG.debug("Reponse avec faute");
					fileName = obtenirNomMessageSoap(context) + ".response-soap-fault.xml";
				}

				Log.ecrireElementDans(requete, fileName);
			} catch (Exception e) {
				LOG.error("", e);
			}
		}
	}

	public static String obtenirErreurFauteSoap(SOAPFaultException e) {
		StringBuilder detail = new StringBuilder("");
		String erreur = erreurSoapSupprimeDebutEtFin(e.getMessage());
		SOAPFault soapFault = e.getFault();

		if (soapFault != null) {
			try {
				if (soapFault.getDetail() != null && soapFault.getDetail().hasChildNodes()) {
					Iterator<?> listeDetail = soapFault.getDetail().getDetailEntries();

					while (listeDetail.hasNext()) {
						DetailEntry d = (DetailEntry) listeDetail.next();
						Iterator<?> le = d.getChildElements();

						while (le.hasNext()) {
							Node se = (Node) le.next();
							detail.append(se.getNodeValue());
						}
					}
				}
			} catch (Exception ex) {
				LOG.debug("Erreur sur détail faute SOAP", ex);
			}
		}

		if (detail.length() > 0 && !detail.toString().contentEquals(erreur)) {
			erreur += "<br>" + detail.toString();
		}

		return "<br>" + erreur;
	}

	/**
	 * Trace un élément XML dans un fichier de trace
	 * 
	 * @param element  l'élément à tracer
	 * @param filename le nom du fichier
	 */
	private static void ecrireElementDans(Element element, String filename) {
		String filenameHorodate = new SimpleDateFormat(DATE_FORMAT).format(new Date()) + filename;

		try (FileOutputStream fos = new FileOutputStream("log/" + filenameHorodate)) {
			Transformer t = TransformerFactory.newInstance().newTransformer();

			ByteArrayOutputStream req = new ByteArrayOutputStream();
			t.transform(new DOMSource(element), new StreamResult(req));
			fos.write(req.toString().getBytes());
		} catch (TransformerException | IOException e) {
			LOG.error("Probleme de traces webservice :", e);
		}
	}

	private static String erreurSoapSupprimeDebutEtFin(String erreur) {
		String ch = erreur;
		ch = ch.replace("Client received SOAP Fault from server: ", "");
		ch = ch.replace(" Please see the server log to find more detail regarding exact cause of the failure.", "");
		return ch;
	}
}
