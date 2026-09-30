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
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// classe singleton Wrapper MICA
    /// </summary>
    public class Mica 
    {
        private static Mica instance = null;
        private bool initialized = false;

#region propriétés
        /// <summary>
        /// l'instance unique de Mica
        /// </summary>
        public static Mica Instance
        {
            get
            {
                if (instance == null)
                {
                    instance = new Mica();
                }
                return instance;
            }
        }
        /// <summary>
        /// La liste des paramètres d'initialisation de Mica
        /// </summary>
        public Dictionary<string, string> Parameters { get; set; }
#endregion

        // constructeur privé du singleton
        private Mica()
        {
            init(Parameters);
            initialized = true;
        }
        /// <summary>
        /// Initialise le MICA avec une liste de paramètres à passer à MGC.
        /// liste des paramètres (avec valeur par défaut) autorisés :
        /// * tempo_exclu_OI=500
        /// * repetiton_exclu_OI=3
        /// * tempo_exclu_OT=100
        /// * repetiton_exclu_OT=10
        /// </summary>
        /// <param name="parameters">Paramètres de configuration à passer à MICA. (Maximum 8)</param>
        private void init(Dictionary<string, string> parameters)
        {
            UnsafeMicaMethods.T_Init_Liste list = null;

            if (parameters != null)
            {
                list = new UnsafeMicaMethods.T_Init_Liste();

                for (int i = 0; i < Math.Min(parameters.Count, UnsafeMicaMethods.NB_PARAM_ENTREE_INIT); i++)
                {
                    KeyValuePair<string, string> pair = parameters.ElementAtOrDefault(i);

                    list.taille++;
                    list.parametre[i].name = pair.Key;
                    list.parametre[i].value = pair.Value;
                }
            }

            if (!initialized)
            {
                ushort errnum = UnsafeMicaMethods.MICA_Init(list);
                if (errnum != 0)
                {
                    throw new AssertionException(string.Format("MICA_Init() erreur 0x{0:X} ({0})", errnum));
                }
                initialized = true;
            }
        }

        /// <summary>
        /// Termine la librairie MICA
        /// </summary>
        public void Terminer()
        {
            ushort errnum = UnsafeMicaMethods.MICA_Terminer();
            if (errnum != 0)
            {
                throw new AssertionException(string.Format("MICA_Terminer() erreur 0x{0:X} ({0})", errnum));
            }
            initialized = false;
        }

        /// <summary>
        /// Version du MICA au format XX.YY.ZZ (Version.Release.Lot).
        /// </summary>
        public string Version
        {
            get
            {
                if (initialized == false)
                {
                    init(Parameters);
                }
                StringBuilder version = new StringBuilder(); // capacity: "XX.YY.ZZ".Length
                // CA1065: DoNotRaiseExceptionsInUnexpectedLocations
                ushort errnum = UnsafeMicaMethods.MICA_LireVersion(version);
                if (errnum != 0)
                {
                    throw new AssertionException(string.Format("MICA_LireVersion() erreur 0x{0:X} ({0})", errnum));
                }

                return version.ToString();
            }
        }

        /// <summary>
        /// Recherche une Carte Vitale parmi tous les lecteurs présents.
        /// </summary>
        /// <returns>la carte Vitale</returns>
        public CarteVitale Find()
        {
            return FindByName(null);
        }

        /// <summary>
        /// Recherche une Carte Vitale présente dans un lecteur donné.
        /// </summary>
        /// <param name="name">Nom du lecteur</param>
        /// <returns>la carte Vitale</returns>
        public CarteVitale FindByName(string name)
        {
            if (initialized == false)
            {
                init(Parameters);
            }
            ushort errnum = 0;
            StringBuilder serial = new StringBuilder();
            byte[] state = new byte[1];
            errnum = UnsafeMicaMethods.MICA_ControlePresenceCarteVitale(name, serial, state);
            CarteVitale card = new CarteVitale();
            card.Lecteur = name;
            card.CodeMica = errnum;
            if (errnum != 0)
            {   // erreur lors du contrôle présence carte Vitale
                Debug.WriteLine(string.Format("MICA_ControlePresenceCarteVitale() erreur x{0:X} ({0})", errnum));
                card.State = CarteVitaleState.Absent;
                card.Serial = "";
                card.Info.Type = CarteVitaleType.Unknown;
                card.Info.Nature = CarteVitaleNature.T;
                card.Info.AnswerToReset = new byte[]{ 0 };
                card.SignatureAlgorithm = "";
                card.Info.Key = "";
            }
            else
            {   // il y a bien une carte Vitale dans le lecteur
                card.Serial = serial.ToString().TrimStart('0').PadLeft(12, '0'); // see: CI-1.0.1-CNAMTS-AC_V1.7
                card.State = (CarteVitaleState)state[0];

                byte[] pucSignature = new byte[32];
                IntPtr pusTailleSignature = new IntPtr();

                UnsafeMicaMethods.T_InfosCarte infos = new UnsafeMicaMethods.T_InfosCarte();
                try
                {
                    errnum = UnsafeMicaMethods.MICA_SignatureVitale(name, UnsafeMicaMethods.SIG_AMO, 0, null, out pusTailleSignature, pucSignature, infos);
                    if (errnum != 0)
                    {
                        Debug.WriteLine(string.Format("MICA_SignatureVitale() erreur x{0:X} ({0})", errnum));
                        card.CodeMica = errnum;
                        card.Info.Type = CarteVitaleType.Unknown;
                        card.Info.Nature = CarteVitaleNature.T;
                        card.Info.AnswerToReset = new byte[] { 0 };
                        card.SignatureAlgorithm = "";
                        card.Info.Key = "";
                    }
                    else
                    {
                        card.Info.Type = (CarteVitaleType)infos.typeCarte;
                        card.Info.Nature = (CarteVitaleNature)infos.natureCarte;
                        card.Info.AnswerToReset = Encoding.ASCII.GetBytes(infos.atr);

                        switch (card.Info.Type)
                        {
                            case CarteVitaleType.Vitale1_IGEA:
                                card.SignatureAlgorithm = CarteVitaleSignatureAlgorithms.V1_IGEA_Sha256Signature;
                                card.Info.Key = infos.numEncarteur.ToString();
                                break;
                            case CarteVitaleType.Vitale1_SCOT:
                                card.SignatureAlgorithm = CarteVitaleSignatureAlgorithms.V1_SCOT_Sha256Signature;
                                card.Info.ManufacturerId = infos.numEncarteur.ToString();
                                break;
                            case CarteVitaleType.Vitale2:
                                card.SignatureAlgorithm = CarteVitaleSignatureAlgorithms.V2_Sha256Signature;
                                card.Info.Key = infos.cleMereV2.ToString();
                                break;
                        }
                        // le n° de série logique Vitale ne fait que 12 car max => suppression des 8 zéros à gauche
                        card.Serial = infos.numSerie.Substring(8);
                        // le n° fabricant n'est valorisé que pour une V1 SCOT
                        if (card.Info.Type.Equals("V1SCOT"))
                        {
                            card.Info.ManufacturerId = infos.numEncarteur.ToString();
                            // padding avec 0 à gauche sur 4 chiffres
                            if (card.Info.ManufacturerId.Length < 4)
                            {
                                card.Info.ManufacturerId = "000".Substring(0, 4 - card.Info.ManufacturerId.Length) + card.Info.ManufacturerId;
                            }
                        }
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(string.Format("MICA_SignatureVitale() erreur :", e.Message));
                }

            }
            return card;
        }

        /// <summary>
        /// Signature par la carte Vitale
        /// </summary>
        /// <param name="name">nom du lecteur PC/SC ou ressource Galss</param>
        /// <param name="data">donnée à signer</param>
        /// <returns>la donnée signée</returns>
        public byte[] SignatureVitale(string name, byte[] data)
        {
            if (initialized == false)
            {
                init(Parameters);
            }
            ushort errnum = 0;
            // Donnees de sortie

            byte[] pucSignature = new byte[32];
            IntPtr pusTailleSignature = new IntPtr();
            UnsafeMicaMethods.T_InfosCarte infosCarte = new UnsafeMicaMethods.T_InfosCarte(); // unused here (must be instanciated)   

            try
            {
                errnum = UnsafeMicaMethods.MICA_SignatureVitale(name, UnsafeMicaMethods.SIG_AMO, (ushort)data.Length, data, out pusTailleSignature, pucSignature, infosCarte);
                if (errnum != 0)
                {
                    throw new Exception(string.Format("MICA_SignatureVitale() failed with code x{0:X} ({0})", errnum));
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(string.Format("MICA_SignatureVitale() erreur :", e.Message));
            }

            return pucSignature.Take((int)pusTailleSignature).ToArray();

        }

    }
}
