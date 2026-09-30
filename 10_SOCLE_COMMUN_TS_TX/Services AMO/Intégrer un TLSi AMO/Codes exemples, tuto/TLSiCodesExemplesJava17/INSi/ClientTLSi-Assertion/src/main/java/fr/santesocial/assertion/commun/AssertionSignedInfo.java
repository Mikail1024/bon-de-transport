/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

import java.util.Base64;

/**
 * Classe de gestion de l'&eacute;l&eacute;ment SignedInfo de l'objet XML-Signature de l'assertion
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class AssertionSignedInfo {
  private StringBuilder signedInfo;
  private StringBuilder signedInfoC14n;
  
  private static final String SIGNEDINFO_BEGIN = "<SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/><SignatureMethod Algorithm=\"";
  private static final String SIGNEDINFO_C14N_BEGIN = "<SignedInfo xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"></CanonicalizationMethod><SignatureMethod Algorithm=\"";
  private static final String SIGNEDINFO_BEFORE_URI = "\"/><Reference URI=\"";
  private static final String SIGNEDINFO_C14N_BEFORE_URI = "\"></SignatureMethod><Reference URI=\"";
  private static final String SIGNEDINFO_BEFORE_DIGESTMETHOD = "\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/><Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/></Transforms><DigestMethod Algorithm=\"";
  private static final String SIGNEDINFO_C14N_BEFORE_DIGESTMETHOD = "\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"></Transform><Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"></Transform></Transforms><DigestMethod Algorithm=\"";
  private static final String SIGNEDINFO_BEFORE_DIGESTVALUE = "\"/><DigestValue>";
  private static final String SIGNEDINFO_C14N_BEFORE_DIGESTVALUE = "\"></DigestMethod><DigestValue>";
  private static final String SIGNEDINFO_END = "</DigestValue></Reference></SignedInfo>";
  
  /**
   * Construit l'&eacute;l&eacute;ment SignedInfo de la norme XML-Signature
   * @param doc le document &agrave; signer
   * @param id l'ID du document
   * @param signAlgo l'algorithme de signature
   * @param digestAlgo l'algorithme de digest
   * @param digestValue la valeur du digest du document
   */
  public AssertionSignedInfo(String doc, String id,
                             String signAlgo, String digestAlgo,
                             byte[] digestValue) {
    signedInfo = new StringBuilder(SIGNEDINFO_BEGIN);
    signedInfoC14n = new StringBuilder(SIGNEDINFO_C14N_BEGIN);
    
    // algorithme de signature
    signedInfo.append(signAlgo);
    signedInfoC14n.append(signAlgo);
    
    // Reference URI = id de l'assertion
    signedInfo.append(SIGNEDINFO_BEFORE_URI);
    signedInfo.append("#"+id);
    signedInfoC14n.append(SIGNEDINFO_C14N_BEFORE_URI);
    signedInfoC14n.append("#"+id);
    
    // algorithme de digest
    signedInfo.append(SIGNEDINFO_BEFORE_DIGESTMETHOD);
    signedInfo.append(digestAlgo);
    signedInfoC14n.append(SIGNEDINFO_C14N_BEFORE_DIGESTMETHOD);
    signedInfoC14n.append(digestAlgo);
    
    // digest Value
    signedInfo.append(SIGNEDINFO_BEFORE_DIGESTVALUE);
    signedInfo.append(Base64.getEncoder().encodeToString(digestValue));
    signedInfoC14n.append(SIGNEDINFO_C14N_BEFORE_DIGESTVALUE);
    signedInfoC14n.append(Base64.getEncoder().encodeToString(digestValue));
    
    signedInfo.append(SIGNEDINFO_END);
    signedInfoC14n.append(SIGNEDINFO_END);
  }
  
  /**
   * restitue l'&eacute;l&eacute;ment SignedInfo s&eacute;rialis&eacute;
   * @return le SignedInfo
   */
  public String get() {
    return signedInfo.toString();
  }
  
  /**
   * restitue l'&eacute;l&eacute;ment SignedInfo s&eacute;rialis&eacute; selon la canonisation C14N
   * @return le SignedInfo canonis&eacute; C14N
   */
  public String getC14n() {
    return signedInfoC14n.toString();
  }
}
