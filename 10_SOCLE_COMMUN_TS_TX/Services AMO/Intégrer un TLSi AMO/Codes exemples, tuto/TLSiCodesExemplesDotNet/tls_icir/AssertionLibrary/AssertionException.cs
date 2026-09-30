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

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// Classe gérant les exceptions lors de la génération des assertions
    /// </summary>
    public class AssertionException : Exception
    {
        private string erreur;

        /// <summary>
        /// Instanciation de l'Exception
        /// </summary>
        /// <param name="contexte">le contexte de l'erreur</param>
        /// <param name="rc">le code d'erreur</param>
        public AssertionException(string contexte, ushort rc)
        {
            this.erreur = String.Format("Erreur création assertion {0} : {1:X4}", contexte, rc);
        }

        /// <summary>
        /// Instanciation de l'Exception
        /// </summary>
        /// <param name="message">le message d'erreur</param>
        public AssertionException(string message)
        {
            this.erreur = message;
        }

        /// <summary>
        /// Instanciation de l'Exception
        /// </summary>
        /// <param name="e">l'exception d'origine</param>
        public AssertionException(Exception e)
        {
            this.erreur = e.StackTrace;
        }

        /// <summary>
        /// restitue le message d'erreur
        /// </summary>
        /// <returns>le message d'erreur</returns>
        public override string ToString()
        {
            return erreur;
        }
    }
}
