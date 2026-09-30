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
using System.Diagnostics;
using System.Security.Cryptography.X509Certificates;
using System.Xml.Linq;

namespace TLSi_AssertionLibrary
{
    internal class SamlPscAssertion : SamlAssertion
    {
        #region constructeur
        /// <summary>
        /// Constructeur de l'assertion PS
        /// </summary>
        /// <param name="signature">Objet de signature pour l'assertion PS</param>
        internal SamlPscAssertion(PsSignatureProvider signature) : base(signature)
        {
        }
        #endregion

        #region méthodes publiques
        /// <summary>
        /// Construit l'assertion PS
        /// </summary>
        /// <returns>le document XML contenant l'assertion PS</returns>
        internal XDocument Build()
        {
            PsSignatureProvider signProv;
            if (this.SignatureProvider is PsSignatureProvider)
            {
                signProv = (PsSignatureProvider)SignatureProvider;
            }
            else
                throw new AssertionException("L'élément de Signature est incompatible avec la CPS");
            X509Certificate2 certificatCps = signProv.Certificat;
            String cpsType = getCardType(certificatCps);

            return build(false, "urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName",
                         "Ademis", "PSC",
                         certificatCps.GetNameInfo(X509NameType.SimpleName, false));
        }
        #endregion

        #region Private Methods
        /// <summary>
        /// Permet de récupérer le code du type de carte PS dans le certificat de signature
        /// </summary>
        /// <param name="certificate">Certificat de signature de la CPS</param>
        /// <returns>le type de CPS</returns>
        private string getCardType(X509Certificate2 certificate)
        {
            string typeCarte = null;
            try
            {
                X509Extension extension = GetExtensionByOidValue(certificate, "1.2.250.1.71.1.2.2");
                byte[] bytes = extension.RawData;
                if (bytes == null || bytes.Length == 0)
                {
                    throw new Exception("Ext GipCardType non trouvé");
                }
                else if (bytes.Length != 3)
                {
                    throw new Exception("Ext GipCardType invalide");
                }
                else
                {
                    short codeTypeCard = bytes[2];
                    typeCarte = translateCardType(codeTypeCard);
                    if (typeCarte == null)
                        throw new Exception("GipCardType inconnu " + codeTypeCard);
                }
            }
            catch (Exception ex)
            {
                typeCarte = "CPX";
                Debug.WriteLine(ex.Message);
                //Console.ForegroundColor = ConsoleColor.Red;
                //Console.WriteLine(ex.Message);
            }
            return typeCarte;
        }

        /// <summary>
        /// Permet d'obtenir l'extension d'un certificat en fonction de son OID
        /// </summary>
        /// <param name="certificat">Certificat</param>
        /// <param name="oidValue">Valeur de l'OID</param>
        /// <returns>l'extension</returns>
        private X509Extension GetExtensionByOidValue(X509Certificate2 certificat, string oidValue)
        {
            X509Extension extensionFind = null;
            foreach (X509Extension extension in certificat.Extensions)
            {
                if (extension.Oid.Value == oidValue)
                {
                    extensionFind = extension;
                }
            }
            return extensionFind;
        }

        /// <summary>
        /// traduit le code de la carte en type de CPx
        /// </summary>
        /// <param name="codeCard">code de la carte</param>
        /// <returns>Type de carte CPS</returns>
        private string translateCardType(short codeCard)
        {
            string cardType = null;
            switch (codeCard)
            {
                case 0:
                    cardType = "CPS";
                    break;
                case 1:
                    cardType = "CPF";
                    break;
                case 2:
                    cardType = "CDE-CPE";
                    break;
                case 3:
                    cardType = "CPA";
                    break;
            }

            return cardType;
        }
        #endregion
    }
}
