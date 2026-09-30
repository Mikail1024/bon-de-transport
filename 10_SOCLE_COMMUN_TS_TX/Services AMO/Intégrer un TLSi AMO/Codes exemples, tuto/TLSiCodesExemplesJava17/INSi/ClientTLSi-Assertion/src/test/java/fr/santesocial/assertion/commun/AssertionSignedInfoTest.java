/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


public class AssertionSignedInfoTest {
  private static final Logger log = LogManager.getLogger(AssertionSignedInfoTest.class);

  @Test
  public void testAssertionSignedInfo() throws Exception {
    String assertion = "<Assertion xmlns=\"urn:oasis:names:tc:SAML:2.0:assertion\" ID=\"_38cfd30f-7ef7-467d-9f43-872deea61263\" IssueInstant=\"2014-09-10T16:04:41.190Z\" Version=\"2.0\"><Issuer Format=\"urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName\"> GN=JEAN+SN=BIDE RPPS+CN=899900018054,OU=Médecin,O=TEST,C=FR</Issuer>" +
                "<Subject><NameID NameQualifier=\"CPS\">899900018054</NameID></Subject></Assertion>";
    
    String digestB64 = "HOyTsx6TKwW4wDZFMs/ZSzidLOGfy/9CYOZChVjbExI=";
    byte[] digestValue = Base64.getDecoder().decode(digestB64);
    AssertionSignedInfo si = new AssertionSignedInfo(assertion, "_38cfd30f-7ef7-467d-9f43-872deea61263",
                                                     "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256",
                                                     "http://www.w3.org/2001/04/xmlenc#sha256",
                                                     digestValue);
    log.debug("SignedInfo :");
    log.debug(si.get());
    log.debug("SignedInfo c14n :");
    log.debug(si.getC14n());
  }
}
