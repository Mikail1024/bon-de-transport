/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

import java.util.ArrayList;

/**
 * Classe de gestion de l'&eacute;l&eacute;ment SAML AttributeStatement contenant les attributs d'une assertion
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class AssertionAttributeStatement {
  private ArrayList<AssertionAttribute> attributes;

  /**
   * Construction d'un AttributeStatement SAML vide
   */
  public AssertionAttributeStatement() {
    attributes = new ArrayList<AssertionAttribute>();
  }
  
  /**
   * Construction d'un AttributeStatement SAML avec un attribut
   * @param a l'attribut
   */
  public AssertionAttributeStatement(AssertionAttribute a) {
    attributes = new ArrayList<AssertionAttribute>();
    add(a);
  }
  
  /**
   * Ajoute un attribut SAML &agrave; l'AttributeStatement
   * @param a l'attribut
   */
  public void add(AssertionAttribute a) {
    attributes.add(a);
  }
  
  /**
   * Suprime un attribut SAML de l'AttributeStatement
   * @param name le nom de l'attribut
   */
  public void del(String name) {
    for (AssertionAttribute a  : attributes) {
      if (a.getName().equals(name))
        attributes.remove(a);
    }
  }
  
  /**
   * retourne le nombre d'attributs dans l'AttributeStatement
   * @return le nombre d'attributs
   */
  public int getAttributeNumber() {
    return attributes.size();
  }
  
  /**
   * Retourne l'AttributeStatement SAML s&eacute;rialis&eacute;
   * @return l'AttributeStatement
   */
  public String get() {
    StringBuilder sb = new StringBuilder("<AttributeStatement>");
    for (AssertionAttribute a : attributes) {
      sb.append(a.get());
    }
    sb.append("</AttributeStatement>");
    return sb.toString();
  }
}
