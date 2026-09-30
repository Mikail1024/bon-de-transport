/********************************************************
 *  CopyRight....: GIE SESAM VITALE - 2021              *
 *  projet.......: ICIRv1                *
 *  Summary......: Appele au service ICIR *
 *  Date.........: 16 juillet 2021                     *
 ********************************************************/

package fr.sesamvitale.lps;

import java.io.FileOutputStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import fr.santesocial.assertion.cps.CpsAssertionBuilder;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

/**
 * Handler pour l'intégration d'une assertion PS dans une requête de webservice
 */
public class AssertionPSHandler implements SOAPHandler<SOAPMessageContext> {
	private static final Logger log = LogManager.getLogger(AssertionPSHandler.class);

	public Set<QName> getHeaders() {
		return null;
	}

	public boolean handleFault(SOAPMessageContext context) {
		if (log.isDebugEnabled()) {
			try {
				Element requete = context.getMessage().getSOAPPart().getDocumentElement();

				TransformerFactory factory = TransformerFactory.newInstance();
				Transformer t = factory.newTransformer();
				Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
				if (isRequest) {
					log.debug("Requête");
					t.transform(new DOMSource(requete), new StreamResult(new FileOutputStream("req-faute.xml")));
				} else {
					log.debug("Réponse");
					t.transform(new DOMSource(requete), new StreamResult(new FileOutputStream("rep-faute.xml")));
				}
			} catch (Exception e) {
				log.error("", e);
			}
		}
		return true;
	}

	public boolean handleMessage(SOAPMessageContext context) {
		try {
			Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
			if (isRequest) {
				log.debug("Requête");
				if (GetINS.isCPS() == true) {
					SOAPHeader header = context.getMessage().getSOAPPart().getEnvelope().getHeader();
					NodeList listeHeaders = header.getChildNodes();

					// Parcours des éléments présents dans le flux XML de la requête pour
					// positionner l'assertion sur l'élément "Security"
					for (int i = 0; i < listeHeaders.getLength(); i++) {
						org.w3c.dom.Element elHeader = (org.w3c.dom.Element) listeHeaders.item(i);
						log.debug("Elément " + elHeader.getLocalName());
						if (elHeader.getLocalName().equals("Security")) {
							log.debug("Ajout assertion PS");
							// Génération de l'assertion CPS et positionnement dans le flux XML
							// => À personnaliser pour le LPS
							CpsAssertionBuilder builder = new CpsAssertionBuilder(GetINS.CRYPTOLIB_DIR);
							builder.selectCpsSlot(GetINS.CRYPTOLIB_DIR, GetINS.CPS_SLOT);
							Node elAssertionPS = builder.createAssertion(GetINS.CODE_PORTEUR);
							elHeader.appendChild(context.getMessage().getSOAPPart().importNode(elAssertionPS, true));

						}
					}
				}
				if (log.isDebugEnabled()) {
					Element requete = context.getMessage().getSOAPPart().getDocumentElement();
					TransformerFactory factory = TransformerFactory.newInstance();
					Transformer t = factory.newTransformer();
					t.transform(new DOMSource(requete), new StreamResult(new FileOutputStream("req.xml")));
				}
			} else {
				log.debug("Réponse");
				if (log.isDebugEnabled()) {
					Element reponse = context.getMessage().getSOAPPart().getDocumentElement();
					TransformerFactory factory = TransformerFactory.newInstance();
					Transformer t = factory.newTransformer();
					t.transform(new DOMSource(reponse), new StreamResult(new FileOutputStream("rep.xml")));
				}
			}
		} catch (Exception e) {
			log.error("", e);
		}

		return true;
	}

	public void close(MessageContext context) {
	}
}
