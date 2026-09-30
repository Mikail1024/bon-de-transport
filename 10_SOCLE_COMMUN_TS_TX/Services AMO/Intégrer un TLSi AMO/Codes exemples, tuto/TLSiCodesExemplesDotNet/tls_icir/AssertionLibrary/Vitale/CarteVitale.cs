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
    /// Etat carte Vitale
    /// </summary>
    public enum CarteVitaleState
    {
        /// <summary>
        /// Carte présente avec retour du numéro de série.
        /// </summary>
        Present = 0,
        /// <summary>
        /// Carte présente identique.
        /// </summary>
        Identique = 1,
        /// <summary>
        /// Carte présente différente.
        /// </summary>
        Different = 2,
        /// <summary>
        /// Carte Absente.
        /// </summary>
        Absent = 3,
        /// <summary>
        /// Carte Inconnue.
        /// </summary>
        Inconnu = 255
    }

    /// <summary>
    /// Type carte Vitale
    /// </summary>
    public enum CarteVitaleType
    {
        /// <summary>
        /// Type carte V1 IGEA
        /// </summary>
        Vitale1_IGEA = 1,
        /// <summary>
        /// Type carte V1 SCOT
        /// </summary>
        Vitale1_SCOT = 2,
        /// <summary>
        /// Type carte V2
        /// </summary>
        Vitale2 = 3,
        /// <summary>
        /// Type inconnu
        /// </summary>
        Unknown = 255
    }

    /// <summary>
    /// Nature carte Vitale
    /// </summary>
    public enum CarteVitaleNature
    {
        /// <summary>
        /// Carte Vitale réelle.
        /// </summary>
        R = 'R',
        /// <summary>
        /// Carte Vitale de démo.
        /// </summary>
        D = 'D',
        /// <summary>
        /// Carte Vitale de test.
        /// </summary>
        T = 'T'
    }

    /// <summary>
    /// Information carte Vitale
    /// </summary>
    public class CarteVitaleInfo
    {
        /// <summary>
        /// Constructeur CarteVitaleInfo
        /// </summary>
        public CarteVitaleInfo()
        {
            Type = CarteVitaleType.Unknown;
            Nature = CarteVitaleNature.R;
            AnswerToReset = new byte[32];
            ManufacturerId = null;
            Key = null;
        }

        /// <summary>
        /// Type de la carte Vitale
        /// </summary>
        public CarteVitaleType Type { get; internal set; }
        /// <summary>
        /// Nature de la carte Vitale
        /// </summary>
        public CarteVitaleNature Nature { get; internal set; }
        /// <summary>
        /// ATR de la carte Vitale
        /// </summary>
        public byte[] AnswerToReset { get; internal set; }
        // SCOT: ManufacturerId (ushort)
        /// <summary>
        /// Idenitifiant Fabricant (pour une carte Vitale 1 SCOT)
        /// </summary>
        public string ManufacturerId { get; internal set; }
        // V2: Key (string)
        /// <summary>
        /// Clé Fabricant (pour une carte Vitale 2)
        /// </summary>
        public string Key { get; internal set; }
    }

    /// <summary>
    /// Algorithmes de signature de la carte Vitale
    /// </summary>
    public static class CarteVitaleSignatureAlgorithms
    {
        /// <summary>
        /// Algorithme de signature pour une carte Vitale 1 IGEA
        /// </summary>
        public const string V1_IGEA_Sha256Signature = "http://www.sesam-vitale.fr/xmldsig/2011/06/V1IGEA-SHA256/20";
        /// <summary>
        /// Algorithme de signature pour une carte Vitale 1 SCOT
        /// </summary>
        public const string V1_SCOT_Sha256Signature = "http://www.sesam-vitale.fr/xmldsig/2011/06/V1SCOT-SHA256/6";
        /// <summary>
        /// Algorithme de signature pour une carte Vitale 2
        /// </summary>
        public const string V2_Sha256Signature = "http://www.sesam-vitale.fr/xmldsig/2011/06/V2-SHA256";
    }

    /// <summary>
    /// carte Vitale
    /// </summary>
    public class CarteVitale
    {
        /// <summary>
        /// Constructeur
        /// </summary>
        public CarteVitale()
        {
            Lecteur = "";
            Serial = "";
            State = CarteVitaleState.Inconnu;
            Info = new CarteVitaleInfo();
        }

        /// <summary>
        /// nom du lecteur PC/SC ou ressource Galss
        /// </summary>
        public string Lecteur { get; internal set; }
        /// <summary>
        /// code retour appel MICA
        /// </summary>
        public ushort CodeMica { get; internal set; }
        /// <summary>
        /// N° de série de la carte Vitale
        /// </summary>
        public string Serial { get; internal set; }
        /// <summary>
        /// Etat de la carte Vitale
        /// </summary>
        public CarteVitaleState State { get; internal set; }
        /// <summary>
        /// Informations de la carte Vitale
        /// </summary>
        public CarteVitaleInfo Info { get; internal set; }

        /// <summary>
        /// <see cref="CarteVitaleSignatureAlgorithms"/>
        /// </summary>
        public string SignatureAlgorithm { get; internal set; }
    }
}
