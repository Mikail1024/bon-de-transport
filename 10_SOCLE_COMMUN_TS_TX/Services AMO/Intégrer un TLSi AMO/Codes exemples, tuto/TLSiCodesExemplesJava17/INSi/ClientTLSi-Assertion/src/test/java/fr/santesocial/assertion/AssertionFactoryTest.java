/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import fr.santesocial.assertion.cps.CpsInfo;
import fr.santesocial.assertion.vitale.VitaleInfo;
import fr.santesocial.util.FileTools;

public class AssertionFactoryTest {
  private static final Logger log = LogManager.getLogger(AssertionFactoryTest.class);
  
  private static final String CPS_LIB_PATH = "C:\\Windows\\System32\\cps3_pkcs11_w64.dll";
  
  @Test
  @Ignore
  public void testAssertionfactory() throws Exception {
    AssertionFactory af = new AssertionFactory();
   CpsInfo[] cpsInfos = af.getListeCps(CPS_LIB_PATH);
    log.debug("Slot CPS = " + cpsInfos[0].getSlot() + " - Description = " + cpsInfos[0].getDescription());
    af.setCps(CPS_LIB_PATH, cpsInfos[0].getSlot());
    VitaleInfo[] vitInfos = af.getListVitale(new String[]{"Vitale"});
    // recherche 1er lecteur avec carte Vitale
    for (int i=0; i<vitInfos.length; i++) {
      log.debug("Ressource Vitale = " + vitInfos[i].getRessource());
      if ((vitInfos[i].getNumSerie() != null)&& !vitInfos[i].getNumSerie().equals("0")) {
        af.setVitale(vitInfos[i].getRessource());
        break;
      }
    };
    
    log.debug("-----> Création AssertionPS1.xml <-----");
    af.getAssertionPS();
    FileTools.copyFile("AssertionPS.xml", "AssertionPS1.xml");
//    log.debug("-----> création immédiate AssertionPS2.xml <-----");s
//    af.getAssertionPS();
//    FileTools.copyFile("AssertionPS.xml", "AssertionPS2.xml");
//    log.debug("-----> Attente 20s puis création AssertionPS3.xml");
//    Date start = new Date();
//    Date now = new Date();
//    while ((((now.getTime()-start.getTime())/1000) < 21))
//      now = new Date();
//    af.getAssertionPS();
//    FileTools.copyFile("AssertionPS.xml", "AssertionPS3.xml");
//    log.debug("-----> création immédiate AssertionPS4.xml <-----");
//    af.getAssertionPS();
//    FileTools.copyFile("AssertionPS.xml", "AssertionPS4.xml");
    log.debug("-----> création immédiate AssertionPS5.xml avec 2 attributs <-----");
    af.addPSAttribute("identifiantFacturation", "012345678");
    af.addPSAttribute("Spécialite", "Médecin Généraliste");
    af.getAssertionPS();
    FileTools.copyFile("AssertionPS.xml", "AssertionPS5.xml");
    
    log.debug("-----> Création assertion Vitale 1 <-----");
    af.addVitaleAttribute("MONATTRIBUT", "VALEURDEMONATTRIBUT");
    af.createAssertionVitale("MonIssuer", false);
    FileTools.copyFile("AssertionVitale.xml", "AssertionVitale1.xml");

    log.debug("-----> Création assertion Vitale 2 <-----");
    af.addVitaleAttribute("AutreAttribut", "Autre Valeur");
    af.createAssertionVitale("Autre Issuer", false);
    FileTools.copyFile("AssertionVitale.xml", "AssertionVitale2.xml");

    log.debug("-----> Création assertion Vitale 3 <-----");
    af.delVitaleAttribute("MONATTRIBUT");
    af.createAssertionVitale("MonIssuer", false);
    FileTools.copyFile("AssertionVitale.xml", "AssertionVitale3.xml");

    log.debug("-----> Création assertion Vitale 4 <-----");
    af.createAssertionVitale(true);
    FileTools.copyFile("AssertionVitale.xml", "AssertionVitale4.xml");
    
    log.debug("-----> Création assertion Structure <-----");
    af.getAssertionStructure(new File("structure.ini"));
    FileTools.copyFile("AssertionStructure.xml", "AssertionStructure1.xml");
  }

}
