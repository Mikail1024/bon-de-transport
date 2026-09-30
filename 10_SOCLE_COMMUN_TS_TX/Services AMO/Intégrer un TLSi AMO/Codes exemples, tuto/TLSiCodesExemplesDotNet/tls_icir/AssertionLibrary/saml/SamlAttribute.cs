/********************************************************
 *  CopyRight....: GIE SESAM VITALE 
* La présente mise à disposition du code exemple ne saurait être interprétée comme un quelconque transfert des droits de propriété sur celui-ci.
* L’utilisateur désigne ci-après l’entité destinataire du code exemple.
* L'attention de l’utilisateur est appelée sur les modalités d'utilisation du code exemple. 
* Ce dernier est fourni à titre d'information  permettant à l’utilisateur de réaliser librement l'adaptation personnalisée nécessaire à la création de l'interfaçage de son logiciel.  
* Le code exemple est transmis en son état de développement sans garantie, il n'a notamment pas fait l'objet de qualification sécuritaire.
* Le code exemple ne fait l'objet d'aucune maintenance.
* L’utilisateur est seul responsable des conditions de l’utilisation du code exemple et est libre de s'inspirer des éléments fournis et de les adapter par ses propres moyens à la situation particulière de la solution logicielle qu'il développe.
* Ainsi notamment, il est déconseillé de procéder par voie de copier-coller du code à partir des exemples fournis.
********************************************************/

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// Classe de gestion d'un attribut SAML
    /// </summary>
    public class SamlAttribute
    {
#region Properties
        /// <summary>
        /// Le nom de l'attribut
        /// </summary>
        public string Name { get; set; }
        /// <summary>
        /// La valeur de l'attribut
        /// </summary>
        public string Value { get; set; }
#endregion

#region Constructeurs
        /// <summary>
        /// Constructeur par défaut
        /// </summary>
        public SamlAttribute()
        {
            Name = null;
            Value = null;
        }

        /// <summary>
        /// Contructeur à partir des caractéristiques de l'attribut
        /// </summary>
        /// <param name="name">nom de l'attribut</param>
        /// <param name="value">valeur de l'attribut</param>
        public SamlAttribute(string name, string value)
        {
            Name = name;
            Value = value;
        }
#endregion
    }
}
