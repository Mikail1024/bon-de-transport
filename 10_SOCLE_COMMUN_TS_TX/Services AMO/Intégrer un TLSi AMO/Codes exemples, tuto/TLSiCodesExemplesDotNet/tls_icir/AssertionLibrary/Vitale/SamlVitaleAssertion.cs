/********************************************************
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


using System;
using System.Xml.Linq;

namespace TLSi_AssertionLibrary
{
    internal class SamlVitaleAssertion : SamlAssertion
    {
        #region constructeur
        /// <summary>
        /// Constructeur de l'assertion PS
        /// </summary>
        /// <param name="signature">Objet de signature pour l'assertion PS</param>
        internal SamlVitaleAssertion(VitaleSignatureProvider signature)
            : base(signature)
        {
        }
        #endregion

        #region propriétés
        /// <summary>
        /// L'Issuer de l'assertion Vitale
        /// </summary>
        public String Issuer { get; set; }
        #endregion

        #region méthodes publiques
        /// <summary>
        /// Construit l'assertion Vitale
        /// </summary>
        /// <param name="avecSignature">indique si l'assertion doit être signée ou non</param>
        /// <returns>le document XML contenant l'assertion Vitale</returns>
        internal XDocument Build(Boolean avecSignature)
        {
            VitaleSignatureProvider signProv;
            if (this.SignatureProvider is VitaleSignatureProvider)
            {
                signProv = (VitaleSignatureProvider)SignatureProvider;
            }
            else
                throw new AssertionException("L'élément de Signature est incompatible avec la carte Vitale");

            return build(avecSignature, null, Issuer, "VITALE", signProv.Vitale.Serial);
        }
        #endregion
    }
}
