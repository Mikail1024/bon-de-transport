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
using System.Globalization;
using System.IO;
using System.Net;
using System.ServiceModel;
using System.Xml.Serialization;
using TLSi_AssertionLibrary;
using TLSINSi.certificat;
using TLSINSi.ServiceICIR;

namespace TLSINSi
{
    class PatientINS
    {
		/**
   * Mode d'authentification via CPS
   */
        public static bool CPS = false;

        /**
    * Mode d'authentification via TLS Mutuel
    */
        public static bool TLSM = false;

        /**
	 * Mode d'authentification via Pro Santé Connect
	 */
        public static bool PSC = false;

        #region Méthodes privées
        /* Création du header MessageID
		 * return :
		 * - objet MessageID créé
		 */
        private static AttributedURIType createMessageID()
        {
            AttributedURIType messageId = new AttributedURIType();
            messageId.Value = "uuid:" + Guid.NewGuid().ToString();

            return messageId;
        }

        /* Création du contexte LPS
		 * params in :
		 * - Emetteur = n° émetteur du flux (sur 11 ou 12 chiffres)
		 * - IDAM     = identifiant Assurance Maladie de l'application
		 * - Version  = version de l'application
		 * return :
		 * - objet ContexteLPS créé
		 */
        private static ContexteLPS createContexteLPS(string Emetteur, string IDAM, string Version)
        {
            ContexteLPS ctxLps = new ContexteLPS();
            ctxLps.Emetteur = Emetteur;
            DateTime d = DateTime.UtcNow;
            d = DateTime.ParseExact(d.ToString("{0:yyyy-MM-ddTHH:mm:ss.fffZ}"),
                                                 "{0:yyyy-MM-ddTHH:mm:ss.fffZ}", CultureInfo.InvariantCulture);
            ctxLps.Temps = d.ToUniversalTime();

            ctxLps.Id = Guid.NewGuid().ToString();
            ctxLps.Version = "1.00.00";
            ctxLps.Nature = "CTXLPS";
            ctxLps.LPS = new LOGICIEL();
            ctxLps.LPS.IDAM = new IdentiteStringRef();
            ctxLps.LPS.IDAM.R = "4";
            ctxLps.LPS.IDAM.Value = IDAM;
            ctxLps.LPS.Version = Version;
            ctxLps.LPS.Nom = "XXX";
            ctxLps.LPS.Instance = "XXXX-XXX-XXXX";

            return ctxLps;
        }

        /* Création du contexte BAM à partir d'un fichier xml
		 * params in :
		 * - fichier = chemin d'accès au fichier xml contenant le contexte BAM sérialisé
		 * return :
		 * - objet ContexteBAM créé
		 */
        private static ContexteBAM deserializeContexteBAM(string fichier)
        {
            ContexteBAM ctxBam = null;
            StreamReader rd = new StreamReader(fichier);
            try
            {
                XmlSerializer xs = new XmlSerializer(typeof(ContexteBAM), "urn:siram:bam:ctxbam");
                ctxBam = (ContexteBAM)xs.Deserialize(rd);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            finally
            {
                if (rd != null)
                    rd.Close();
            }
            return ctxBam;
        }

        /* Création du contexte LPS à partir d'un fichier xml
		 * params in :
		 * - fichier = chemin d'accès au fichier xml contenant le contexte LPS sérialisé
		 * return :
		 * - objet ContexteBAM créé
		 */
        private static ContexteLPS deserializeContexteLPS(string fichier)
        {
            ContexteLPS ctxLps = null;
            StreamReader rd = new StreamReader(fichier);
            try
            {
                XmlSerializer xs = new XmlSerializer(typeof(ContexteLPS), "urn:siram:lps:ctxlps");
                ctxLps = (ContexteLPS)xs.Deserialize(rd);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            finally
            {
                if (rd != null)
                    rd.Close();
            }
            return ctxLps;
        }

        /* Création d'une requête 
		 * params in :
		 * -
		 * return :
		 * - objet Requete créée
		 */
        private static TraitsDIdentite1 CreateRequete()
        {
            TraitsDIdentite1 requete = new TraitsDIdentite1();
            requete.NomNaissance = "ADRDEUX";
            requete.Prenom = new string[] { "LAURENT" };
            requete.Sexe = "M";
            requete.DateNaissance = "1981-01-01";

            return requete;
        }

        /* Création d'une requête 
		 * params in :
		 * -
		 * return :
		 * - objet Requete créée
		 */
        private static Beneficiaire CreateRequeteAvecCV()
        {
            Beneficiaire requete = new Beneficiaire();
            
            requete.NomNaissance = "ADRDEUX";
            requete.DateNaissance = "1981-01-01";
            requete.RangNaissance = "1";
            requete.MatriculeOD = new Matricule();
            requete.MatriculeOD.NumIdentifiant = "1810163220751";
            return requete;
        }

        /* Mise à jour d'un contexte BAM déjà créé (modif du Temps et du Id)
		 * param in/out :
		 *      ctxBam = contexte BAM à modifier
		 */
        private static void majContexteBAM(ref ContexteBAM ctxBam)
        {
            ctxBam.Id = Guid.NewGuid().ToString();
            DateTime d = DateTime.UtcNow;
            d = DateTime.ParseExact(d.ToString("{0:yyyy-MM-ddTHH:mm:ss.fffZ}"),
                                                 "{0:yyyy-MM-ddTHH:mm:ss.fffZ}", CultureInfo.InvariantCulture);
            ctxBam.Temps = d.ToUniversalTime();
        }

        /* Sérialisation du résultat dans un fichier
		 * params in :
		 *  - fichier = nom du fichier à créer
		 *  - resultat = resultat à sérialiser dans le fichier
		 */
        private static void serializeResultat(string fichier, Resultat resultat)
        {
            StreamWriter sw = new StreamWriter(fichier);
            try
            {
                XmlSerializer xs = new XmlSerializer(typeof(Resultat), "http://www.cnamts.fr/INSiLot2/REPUnitaire");
                xs.Serialize(sw, resultat);
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            finally
            {
                if (sw != null)
                    sw.Close();
            }
        }
        #endregion

        private static bool CertificateValidationCallBack(
                                                        object sender,
                                                        System.Security.Cryptography.X509Certificates.X509Certificate certificate,
                                                        System.Security.Cryptography.X509Certificates.X509Chain chain,
                                                        System.Net.Security.SslPolicyErrors sslPolicyErrors)
        {   
            if (CPS == false || PSC==true)
                return certificate.Subject.Contains("services-ps-tlsm.ameli.fr");
            else
                return certificate.Subject.Contains("services-ps.ameli.fr");
        }

        public static void findINS()
        {
            // Instanciation du wrapper MICA pour la carte Vitale et récupération de la version MICA
            Console.WriteLine("MICA version = {0}", Mica.Instance.Version);

            // Récupération de l'unique instance de la fabrique d'assertion
            Console.WriteLine("TLSI_AssertionLibrary = {0}", AssertionFactory.Version);

            // Initialisation de la liste des lecteurs Galss pour lire la carte Vitale
            AssertionFactory.LecteursGalss = new string[] { "Vitale" };


            #region Gestion du proxy client si necessaire
            WebProxy proxy = new WebProxy("proxy:port", true);
            WebRequest.DefaultWebProxy = proxy;
            #endregion

            List<Cps> listeCps = null;              // la liste des CPS identifiées lors du scan des slots par la PKCS#11
            Cps cps = null;                         // la CPS sélectionnée pour la génération des assertions PS
            List<CarteVitale> listeVitale = null;   // la liste des Vitale identifiées
            CarteVitale vitale = null;              // la Vitale sélectionnée
            AssertionFactory factory = null;        // la fabrique d'assertions


            while (true)
            {
                Console.WriteLine("********************************************************\n");
                Console.WriteLine("* Veuillez saisir un argument et appuyez sur entrée    *\n");
                Console.WriteLine("********************************************************\n");
                Console.WriteLine("**********************par CPS***************************\n");
                Console.WriteLine("Rechercher INS  par Traits d'Identité: tapez A\n");
                Console.WriteLine("Rechercher INS  par carte vitale: tapez B\n");
                Console.WriteLine("**********************par TLS-Mutuelle******************\n");
                Console.WriteLine("Rechercher INS par Traits d'Identité: tapez C\n");
                Console.WriteLine("Rechercher INS  par carte vitale: tapez D\n");
                Console.WriteLine("**********************par Pro Santé Connect*************\n");
                Console.WriteLine("Rechercher INS par Traits d'Identité: tapez E\n");
                Console.WriteLine("Rechercher INS  par carte vitale: tapez F\n");
                Console.WriteLine("********************************************************\n");
                Console.WriteLine("Quitter: tapez ESC\n");
                Console.WriteLine("********************************************************\n");

                ConsoleKeyInfo key = Console.ReadKey();
                Console.WriteLine();
                if (key.KeyChar == 0x1B)
                    break;

                //Selection CPS 
                if ((key.KeyChar & 0x5F) == 'A' || (key.KeyChar & 0x5F) == 'B' || (key.KeyChar & 0x5F) == 'E' || (key.KeyChar & 0x5F) == 'F')
                {
                    CPS = true;
                    if (CPS == true && ((key.KeyChar & 0x5F) == 'E' || (key.KeyChar & 0x5F) == 'F'))
                    {
                        PSC = true;
                    }

                    try
                    {
                        Console.WriteLine("\nRecherche des CPS ...");
                        listeCps = AssertionFactory.CpsList; // Liste les CPS
                        Console.WriteLine("{0} CPS identifiés :", AssertionFactory.CpsList.Count);
                        for (int i = 0; i < listeCps.Count; i++)
                        {
                            Console.WriteLine("{0} : Lecteur {1}, DN : {2}", i, listeCps[i].Lecteur, listeCps[i].Nom);
                        }
                        if (listeCps.Count > 0)
                        {
                            Console.Write("Tapez l'indice du lecteur de la CPS choisie : ");
                            ConsoleKeyInfo key2 = Console.ReadKey();
                            int indiceSlot = key2.KeyChar - '0';
                            if ((indiceSlot >= 0) && (indiceSlot < listeCps.Count))
                            {
                                cps = listeCps[indiceSlot];
                                Console.WriteLine("\nCPS choisie : {0}", listeCps[indiceSlot].Nom);
                            }
                            else
                            {
                                cps = null;
                                Console.WriteLine("\nIndice lecteur CPS invalide");
                            }
                        }

                        if ((cps != null))
                        {
                            if ((key.KeyChar & 0x5F) == 'B' || (key.KeyChar & 0x5F) == 'F')
                            {

                                Console.WriteLine("\nRecherche des Vitale ...");
                                listeVitale = AssertionFactory.VitaleList; // Liste les Vitale
                                Console.WriteLine("{0} Vitale identifiés :", AssertionFactory.VitaleList.Count);
                                for (int i = 0; i < listeVitale.Count; i++)
                                {
                                    Console.WriteLine("{0} : Lecteur {1}, DN : {2}", i, listeVitale[i].Lecteur, listeVitale[i].Lecteur);
                                }
                                if (listeVitale.Count > 0)
                                {
                                    Console.Write("Tapez l'indice du lecteur de la Vitale choisie : ");
                                    ConsoleKeyInfo key2 = Console.ReadKey();
                                    int indiceSlot = key2.KeyChar - '0';
                                    if ((indiceSlot >= 0) && (indiceSlot < listeVitale.Count))
                                    {
                                        vitale = listeVitale[indiceSlot];
                                        Console.WriteLine("\nVitale choisie : {0}", listeVitale[indiceSlot].Lecteur);
                                    }
                                    else
                                    {
                                        vitale = null;
                                        Console.WriteLine("\nIndice lecteur Vitale invalide");
                                    }
                                }
                            }
                            Console.WriteLine("\nInstanciation Fabrique d'assertions");
                            factory = new AssertionFactory(cps, vitale);
                        }
                        else
                        {
                            Console.WriteLine("\nCps non sélectionnée");
                        }
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine("Exception(C) :" + e);
                    }
                }
                else if ((key.KeyChar & 0x5F) == 'D')
                {
                    TLSM = true;
                    Console.WriteLine("\nRecherche des Vitale ...");
                    listeVitale = AssertionFactory.VitaleList; // Liste les Vitale
                    Console.WriteLine("{0} Vitale identifiés :", AssertionFactory.VitaleList.Count);
                    for (int i = 0; i < listeVitale.Count; i++)
                    {
                        Console.WriteLine("{0} : Lecteur {1}, DN : {2}", i, listeVitale[i].Lecteur, listeVitale[i].Lecteur);
                    }
                    if (listeVitale.Count > 0)
                    {
                        Console.Write("Tapez l'indice du lecteur de la Vitale choisie : ");
                        ConsoleKeyInfo key2 = Console.ReadKey();
                        int indiceSlot = key2.KeyChar - '0';
                        if ((indiceSlot >= 0) && (indiceSlot < listeVitale.Count))
                        {
                            vitale = listeVitale[indiceSlot];
                            Console.WriteLine("\nVitale choisie : {0}", listeVitale[indiceSlot].Lecteur);
                        }
                        else
                        {
                            vitale = null;
                            Console.WriteLine("\nIndice lecteur Vitale invalide");
                        }
                    }
                    Console.WriteLine("\nInstanciation Fabrique d'assertions");
                    factory = new AssertionFactory(cps, vitale);
                }
                



            // Appel INSi

            #region Préparation des headers
            /* Création du Contexte LPS */
            ContexteLPS ctxLps = deserializeContexteLPS("ContexteLPS.xml");
                    if (ctxLps != null)
                        Console.WriteLine($"ContexteLPS => " +
                            $"\n  Id={ctxLps.Id}" +
                            $"\n  Instance={ctxLps.LPS.Instance}" +
                            $"\n  Temps={ctxLps.Temps}" +
                            $"\n  IDAM={ctxLps.LPS.IDAM.Value}");

                    /* Création du Contexte BAM */
                    ContexteBAM ctxBam = deserializeContexteBAM("ContexteBAM.xml");
                    majContexteBAM(ref ctxBam);
                    if (ctxBam != null)
                        Console.WriteLine($"ContexteBAM => " +
                            $"\n  Id={ctxBam.Id}" +
                            $"\n  Temps={ctxBam.Temps}" +
                            $"\n  Régime={ctxBam.COUVERTURE.GrandRegime} " +
                            $"\n  Organisme={ctxBam.COUVERTURE.Organisme}" +
                            $"\n  CodeCentre={ctxBam.COUVERTURE.CodeCentre}");

                    /* Déclaration du MessageID */
                    AttributedURIType messageID = createMessageID();

                    /* Création de l'élément Security vide */
                    AssertionType[] security = new AssertionType[2];

                TraitsDIdentite1 requeteTI=null;
                Beneficiaire requeteCV=null;
                if ((key.KeyChar & 0x5F) == 'A' ||(key.KeyChar & 0x5F) == 'C' || (key.KeyChar & 0x5F) == 'E')
                    {
                        /* Récupération de la requête client */
                        requeteTI = CreateRequete();

                        if (requeteTI != null)
                            Console.WriteLine($"Requete => " +
                                $"\n      NomNaissance={requeteTI.NomNaissance} " +
                                $"\n      Prenom={requeteTI.Prenom[0]} " +
                                $"\n      Sexe={requeteTI.Sexe} " +
                                $"\n      DateNaissance={requeteTI.DateNaissance} " +
                                $"\n      LieuNaissance={requeteTI.LieuNaissance}");
                    Console.WriteLine($"\nEnvoi de la requête 'verifierInsAvecTraitsIdentite' ...");
                }
                else
                    {
                        /* Récupération de la requête client */
                        requeteCV = CreateRequeteAvecCV();

                        if (requeteCV != null)
                            Console.WriteLine($"Requete => " +
                                $"\n      NomNaissance={requeteCV.NomNaissance} " +
                                $"\n      DateNaissance={requeteCV.DateNaissance} ");
                    Console.WriteLine($"\nEnvoi de la requête 'verifierInsAvecCarteVitale' ...");
                }
                    #endregion


                    //Console.WriteLine($"\nEnvoi de la requête 'verifierInsAvecTraitsIdentite' ...");
                    CIRServiceClient client = new CIRServiceClient();
              

                CertificateHelper.InitCertificate();


                    client.ClientCredentials.ClientCertificate.Certificate = CertificateHelper.AuthCertificate;
                if (CPS==true && ((key.KeyChar & 0x5F) == 'A' || (key.KeyChar & 0x5F) == 'B'))
                {
                    client.Endpoint.Address = new EndpointAddress("https://qualiflps.services-ps.ameli.fr/lps");
                    
                }
                else
                {
                    client.Endpoint.Address = new EndpointAddress("https://qualiflps-services-ps-tlsm.ameli.fr/lps");
                }
                if (CertificateHelper.AuthCertificate != null &&
                        client.Endpoint.Address.Uri.AbsoluteUri.StartsWith("https"))
                    {
                        // protocole TLS
                        ServicePointManager.Expect100Continue = true;
                        ServicePointManager.DefaultConnectionLimit = 9999;
                        ServicePointManager.SecurityProtocol = SecurityProtocolType.Tls12 | SecurityProtocolType.Ssl3;
                        // on l'ajoute pour etablir la connexion TLS
                        if (client.ClientCredentials != null)
                            client.ClientCredentials.ClientCertificate.Certificate = CertificateHelper.AuthCertificate;


                    }
                // Verification de la presence des certificats necessaires
                if (CertificateHelper.CheckCertificates())
                {
                    System.Net.ServicePointManager.ServerCertificateValidationCallback = CertificateValidationCallBack;
                }
                else
                { Console.WriteLine("erreur CheckCertfificates"); }


                #region Paramétrage de la fabrique d'assertions et configuration du Web-Service
                /* Instanciation de la classe qui modifie le message avant envoi
                   en initialisant les ressources CPS et Vitale à utiliser */
                if ((key.KeyChar & 0x5F) != 'C')
                {
                   /* factory.AttributeStatementPS = new SamlAttributeStatement(new SamlAttribute("CodeSpecialite", factory.CodeSpecialite));
                    factory.AttributeStatementPS = new SamlAttributeStatement(new SamlAttribute("SecteurActivite", factory.SecteurActivite));*/

                    AssertionMessageInspector inspector = null;

                    if ((key.KeyChar & 0x5F) == 'B')
                    {
                        inspector = new AssertionMessageInspector(factory, true);
                    }
                    else if ((key.KeyChar & 0x5F) == 'A')
                    {
                        inspector = new AssertionMessageInspector(factory, false);
                    }
                    else if ((key.KeyChar & 0x5F) == 'D')
                    {
                        inspector = new AssertionMessageInspector(factory, true,false,true);
                    }
                    else if ((key.KeyChar & 0x5F) == 'F')
                    {
                        inspector = new AssertionMessageInspector(factory, true,true,false);
                    }
                    else if ((key.KeyChar & 0x5F) == 'E')
                    {
                        inspector = new AssertionMessageInspector(factory, false, true,false);
                    }
                    
                    /* Ajout de cette instance au Web-Service */
                    client.Endpoint.Behaviors.Add(inspector);
                }
                Resultat reponse = null;
                #endregion
                if ((key.KeyChar & 0x5F) == 'A' || (key.KeyChar & 0x5F) == 'C' || (key.KeyChar & 0x5F) == 'E')
                {
                    try
                    {
                       reponse = client.rechercherInsAvecTraitsIdentite(security, ctxLps, messageID, ctxBam, requeteTI);
                    }
                    catch (Exception ex) { Console.WriteLine(ex.ToString()); }
                }
                else
                {

                    reponse = client.rechercherInsAvecCarteVitale(security, ctxLps, messageID, ctxBam, requeteCV);
                }
                    serializeResultat("Resultat.xml", reponse);

                    Console.WriteLine($"Réception d'une réponse\n");

                    if (reponse != null && reponse.CR != null)
                    {
                        Console.WriteLine($"Code {reponse.CR.CodeCR}: {reponse.CR.LibelleCR} ");
                        Console.WriteLine($"INSACTIF {reponse.INDIVIDU.INSACTIF.IdIndividu.NumIdentifiant}: {reponse.INDIVIDU.INSACTIF.IdIndividu.Cle} ");
                        Console.WriteLine($"OID {reponse.INDIVIDU.INSACTIF.OID}");


                    }
                    else
                        Console.WriteLine($"Résultat vide");

                }
            }

        public static bool isCPS()
        {
            return CPS;
        }

        public static void setCPS(bool cPS)
        {
            CPS = cPS;
        }

        public static bool isPSC()
        {
            return PSC;
        }

        public static void setPSC(bool pSC)
        {
            PSC = pSC;
        }

        public static bool isTLSM()
        {
            return TLSM;
        }

        public static void setTLSM(bool tLSM)
        {
            TLSM = tLSM;
        }

    }
    
   }

