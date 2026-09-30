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

namespace cryptoki
{
    /// <summary>
    /// CryptokiKey
    /// </summary>
    public class CryptokiKey : CryptokiObject
    {
        /// <summary>
        /// CryptokiKey constructor
        /// </summary>
        /// <param name="handle"></param>
        public CryptokiKey(uint handle)
            : base(handle)
        {
        }
    }

    /// <summary>
    /// Defines the Cryptoki signature object.
    /// </summary>
    public class CryptokiSign
    {
        private bool initialized = false;
        private Session session;
        private Mechanism mechanism;
        private CryptokiKey key;

        /// <summary>
        /// Creates a Cryptoki signature object with the specified session context, algorithm and key.
        /// </summary>
        /// <param name="session">The Cryptoki session context.</param>
        /// <param name="mechanism">The signature algorithm and parameters.</param>
        /// <param name="key">The key used to sign the input data.</param>
        public CryptokiSign(Session session, Mechanism mechanism, CryptokiKey key)
        {
            this.session = session;
            this.mechanism = mechanism;
            this.key = key;
        }

        /// <summary>
        /// Creates a cryptographic signature of the specified data.
        /// </summary>
        /// <param name="data">Data to be signed.</param>
        /// <param name="index">Index into the data to begin signing.</param>
        /// <param name="length">The number of bytes to sign.</param>
        public byte[] Sign(byte[] data, int index, int length)
        {
            if (!initialized)
            {
                session.SignInit(mechanism, key);
            }
            initialized = false;

            return session.Sign(data, index, length);
        }

        /// <summary>
        /// Performs a partial signature update.
        /// </summary>
        /// <param name="data">Data to be signed.</param>
        /// <param name="index">Index into the data to begin the signing.</param>
        /// <param name="length">Length in bytes of the partial singing.</param>
        public void SignUpdate(byte[] data, int index, int length)
        {
            if (!initialized)
            {
                session.SignInit(mechanism, key);
            }
            initialized = true;

            session.SignUpdate(data, index, length);
        }

        /// <summary>
        /// Finalizes the partial signing process and returns the signature.
        /// </summary>
        /// <returns>The final signature value.</returns>
        public byte[] SignFinal()
        {
            if (!initialized)
            {
                throw new InvalidOperationException();
            }
            initialized = false;

            return session.SignFinal();
        }
    }
}
