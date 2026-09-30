/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.cps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import fr.santesocial.assertion.cps.CpsAssertionBuilder;
import fr.santesocial.assertion.cps.CpsInfo;

public class CpsAssertionBuilderTest {
  private static final Logger log = LogManager.getLogger(CpsAssertionBuilderTest.class);
  
  private static final String CPS_LIB_PATH = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";
  
  @Test
  @Ignore
  public void testAssertionPSBuilder() throws Exception {
//    CpsAssertionBuilder builder = new CpsAssertionBuilder("identifiantFacturation", "99110832");
//    builder.addAttribute("Second attribut", "Seconde valeur");
    CpsAssertionBuilder builder = new CpsAssertionBuilder();
    CpsInfo[] sl = builder.getCpsSlotInfo(CPS_LIB_PATH);
    for (int i=0; i<sl.length; i++)
      log.debug("Slot " + sl[i].getSlot() + " - label : " + sl[i].getLabel() + " - n° série : " + sl[i].getSerialNumber());

    builder.selectCpsSlot(CPS_LIB_PATH, sl[0].getSlot());
    builder.createAssertion("1234");
  }

}
