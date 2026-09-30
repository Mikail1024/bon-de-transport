/****************************************************************************
 *  CopyRight....: GIE SESAM VITALE - 2016
 *  Project......: ClientTLSi-Assertion
 *  Date.........: janvier 2016
 *****************************************************************************/

package fr.santesocial.assertion.commun;

/**
 * Classe de gestion d'un Attribut SAML dans une assertion
 * @author GIE SESAM-VITALE - 2014
 *
 */
public class AssertionAttribute {
  private String name;
  private String value;
  
  /**
   * Construction d'un attribut
   * @param name le nom de l'attribut
   * @param value la valeur de l'attribut
   */
  public AssertionAttribute(String name, String value) {
    this.name = name;
    this.value = value;
  }
  
  /**
   * restitue le nom de l'attribut
   * @return le nom de l'attribut
   */
  public String getName() {
    return name;
  }
  
  /**
   * restitue la valeur de l'attribut
   * @return la valeur de l'attribut
   */
  public String getValue() {
    return value;
  }
  
  /**
   * restitue l'attribut s&eacute;rialis&eacute;
   * @return l'attribut
   */
  public String get() {
    return "<Attribute Name=\"" + name + "\"><AttributeValue>" + value + "</AttributeValue></Attribute>";
  }
}
