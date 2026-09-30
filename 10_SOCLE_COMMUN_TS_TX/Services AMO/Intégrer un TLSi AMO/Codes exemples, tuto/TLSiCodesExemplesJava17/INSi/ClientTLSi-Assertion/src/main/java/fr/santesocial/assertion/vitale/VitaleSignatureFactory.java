/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.vitale;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

import com.sun.jna.ptr.IntByReference;

import fr.santesocial.assertion.commun.AssertionException;
import fr.santesocial.assertion.commun.ISignatureFactory;
import fr.santesocial.assertion.util.Conversion;
import fr.santesocial.mica.jnamica.ErreurMica;
import fr.santesocial.mica.jnamica.FabriqueAccesMica;
import fr.santesocial.mica.jnamica.IMica;
import fr.santesocial.mica.jnamica.output.ByteArray;
import fr.santesocial.mica.jnamica.structures.InfosCarte;

/**
 * Fabrique de signature Vitale
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class VitaleSignatureFactory implements ISignatureFactory {
  private static Logger log = Logger.getLogger(VitaleSignatureFactory.class);

  /**
   * Type d'objet de sécurité "SIG_AMO" pour MICA
   */
  public static final int TYPE_OBJET_SECURITE_SIG_AMO = 1;


  private String ressource; // la ressource du lecteur Vitale à utiliser

  // interface MICA
  private IMica jnaMica;

  // les données info carte
  private String typeVitale;
  private String nature;
  private String numSerieLogique;
  private String numFabricant;
  private String cleMere;

  /**
   * Construction de la fabrique de signature Vitale
   * @param ress le nom de la ressource lecteur contenant la carte Vitale &agrave; utiliser
   */
  public VitaleSignatureFactory(String ress) throws AssertionException {
    this.ressource = ress;
    typeVitale = null;
    nature = null;
    numSerieLogique = null;
    numFabricant = null;
    cleMere = null;
    // Chargement de la librairie MICA
    jnaMica = FabriqueAccesMica.getAccesMica(FabriqueAccesMica.TYPE_ACCES_JNA);
    // MICA-SignatureVitale sans buffer donnée pour récup InfoCarte
    InfosCarte infosCarte = new InfosCarte();
    
    // Donnees de sortie
    ByteArray baSignature = new ByteArray(32);

    IntByReference ibrTailleSignature = new IntByReference();
    int ret = jnaMica.MICA_SignatureVitale(this.ressource, TYPE_OBJET_SECURITE_SIG_AMO, 0,
		null, ibrTailleSignature, baSignature, infosCarte);
    if (ret != ErreurMica.MICA_NON_ERR) {
      log.error("Erreur MICA_SignatureVitale (sans buffer) = " + Integer.toHexString(ret).toUpperCase().substring(4));
      throw new AssertionException("Erreur MICA Infos Vitale " + Integer.toHexString(ret).toUpperCase().substring(4));
    }
    switch (infosCarte.type_carte){
      case 1:
        typeVitale = "V1IGEA";
        break;
      case 2:
        typeVitale = "V1SCOT";
        break;
      case 3:
        typeVitale = "V2";
        break;
      default:
        throw new AssertionException("Type de carte Vitale" + Integer.toString(infosCarte.type_carte) + "invalide");
    }
    nature = new String(new byte[]{infosCarte.nature_carte});
    // le n° de série logique Vitale ne fait que 12 car max => suppression des 8 zéros à gauche
    numSerieLogique = Conversion.BufToString(new ByteArray(infosCarte.numero_de_serie),20).substring(8);
    // le n° fabricant n'est valorisé que pour une V1 SCOT
    if (typeVitale.equals("V1SCOT")) {
      numFabricant = String.valueOf(infosCarte.numero_Fabricant);
      // padding avec 0 à gauche sur 4 chiffres
      if (numFabricant.length()<4) {
        numFabricant = "000".substring(0, 4-numFabricant.length()) + numFabricant;
      }
    }
    // la clé mère n'est valorisée que pour une V2
    if (typeVitale.equals("V2"))
      cleMere = Conversion.BufToString(new ByteArray(infosCarte.cleMere),256);
  }
  
  @Override
  public String getKeyInfo() throws AssertionException {
    // TODO Auto-generated method stub
    StringBuilder keyInfo = new StringBuilder("<KeyInfo xmlns=\"http://www.sesam-vitale.fr/xmldsig/2011/12/vitale\">");
    if (typeVitale != null)
      keyInfo.append("<Type>" + typeVitale + "</Type>");
    if (nature != null)
      keyInfo.append("<Nature>" + nature + "</Nature>");
    if (numSerieLogique != null)
      keyInfo.append("<NumSerieLogique>" + numSerieLogique + "</NumSerieLogique>");
    if (numFabricant != null)
      keyInfo.append("<NumFabricant>" + numFabricant + "</NumFabricant>");
    if (cleMere != null)
      keyInfo.append("<CleMere>" + cleMere + "</CleMere>");
    keyInfo.append("</KeyInfo>");
    return keyInfo.toString();
  }

  @Override
  public String getSignatureAlgorithm() throws AssertionException {
    // TODO Auto-generated method stub
    String signatureAlgorithme = null;
    if (typeVitale.contains("V1IGEA")){
      signatureAlgorithme = "http://www.sesam-vitale.fr/xmldsig/2011/06/V1IGEA-SHA256/20";
    }
    else if(typeVitale.contains("V1SCOT")){
      signatureAlgorithme = "http://www.sesam-vitale.fr/xmldsig/2011/06/V1SCOT-SHA256/6";
    }
    else if (typeVitale.contains("V2")){
      signatureAlgorithme = "http://www.sesam-vitale.fr/xmldsig/2011/06/V2-SHA256";
    }
    return signatureAlgorithme;
  }

  @Override
  public byte[] sign(byte[] buf, String password) throws AssertionException {
    // TODO Auto-generated method stub
    byte[] digestValue;
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      digestValue = md.digest(buf);
    }
    catch (NoSuchAlgorithmException e) {
      throw new AssertionException("Digest Algorithm SHA-256 non suporté");
    }

    ByteArray baDonneesEntree = new ByteArray(digestValue);

    InfosCarte infosCarte = new InfosCarte();

    // Donnees de sortie
    ByteArray baSignature = new ByteArray(32);

    IntByReference ibrTailleSignature = new IntByReference();

    // Appel de la fonction MICA_SignatureVitale
    short ret = this.jnaMica.MICA_SignatureVitale(this.ressource, TYPE_OBJET_SECURITE_SIG_AMO,
			baDonneesEntree.getSize(), baDonneesEntree, ibrTailleSignature, baSignature, infosCarte);
    
    if (ret != ErreurMica.MICA_NON_ERR) {
      log.error("Erreur MICA_SignatureVitale = " + Integer.toHexString(ret).toUpperCase().substring(4));
      throw new AssertionException("Erreur MICA-SignatureVitale " + Integer.toHexString(ret).toUpperCase().substring(4));
    }
    
    // Conversion du buffer en string Hexa
    return baSignature.getBytes();
  }
}
