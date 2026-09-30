/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.util;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.security.auth.x500.X500Principal;

/**
 * Classe utilitaire de manipulation de donn&eacute;es de certificats X509
 * @author oryy
 *
 */
public class CertificateUtil {

  /**
   * Convertit un certificat encodé en base 64 en objet X509Certificate
   * @param certificateB64 le certificat encod&eacute; en base 64
   * @return l'objet X509Certificate correspondant
   * @throws CertificateException (lev&eacute;e si erreur d'encodage du certificat)
   */
  public static X509Certificate convert(String certificateB64) throws CertificateException {
    String certB64 = "-----BEGIN CERTIFICATE-----\n" +
                      certificateB64 +
                      "-----END CERTIFICATE-----";
    CertificateFactory cf = CertificateFactory.getInstance("X509");
    return (X509Certificate)cf.generateCertificate(new ByteArrayInputStream(certB64.getBytes()));
  }
  
  /**
   * Extrait le DN d'un certificat X509
   * @param cert le certificat X509
   * @return le DN du certificat
   */
  public static String getCertificateDN (X509Certificate cert) {
    return cert.getSubjectX500Principal().getName(X500Principal.RFC1779);
  }
  
  /**
   * Extrait le CN d'un certificat X509
   * @param cert le certificat X509
   * @return le CN du certificat (null si CN non trouv&eacute;)
   * @throws InvalidNameException (exception lev&eacute;e si erreur dans le DN du certificat)
   */
  public static String getCertificateCN (X509Certificate cert) throws InvalidNameException {
    String dn = getCertificateDN(cert);
    String cn = null;
    LdapName ln = new LdapName(dn);
    for (Rdn rdn : ln.getRdns()) {
      if (rdn.getType().equalsIgnoreCase("CN")) {
        cn = (String)rdn.getValue();
      }
    }
    return cn;
  }
}
