package fr.sesamvitale.util;

import java.util.Set;

import javax.xml.namespace.QName;

import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

/**
 * Assertion SOAP pour la gestion des traces d'une appel à un webservice
 */
public class AssertionSoapLogger implements SOAPHandler<SOAPMessageContext>
{
  @Override
  public boolean handleMessage(SOAPMessageContext context)
  {
    Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
    if (isRequest)
    {
      Log.requete(context);
    }
    else
    {
      Log.reponse(context);
    }
    return true;
  }

  @Override
  public boolean handleFault(SOAPMessageContext context)
  {
    Log.fauteSoap(context);
    return true;
  }

  @Override
  public void close(MessageContext context)
  {
    // Aucune action
  }

  @Override
  public Set<QName> getHeaders()
  {
    return null;
  }
}
