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
using System.Reflection;
using System.Security.Cryptography.X509Certificates;
using System.Xml;
using System.Xml.Linq;
using TLSi_AssertionLibrary.cps;
using TLSi_AssertionLibrary.structure;
using TLSi_AssertionLibrary.tlsm;

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// Classe de génération d'assertion PS et Vitale
    /// </summary>
    ///

    public class AssertionFactory
    {
        #region Variables statiques de classe privées
        private static double DELAI_VALIDITE_ASSERTION_PS = 20; /* délai validité assertion PS par défaut = 20 sec */
        private static double DELAI_VALIDITE_ASSERTION_PSC = 3600; /* délai validité assertion PSC (avec jetonAM) par défaut = 1 heure */
        #endregion

        #region Variables d'instance privées
        private Boolean generationAssertion;        // pour savoir s'il faut générer l'assertion quand on la demande
        private DateTime tempsAssertionPS;          // horodatage de création de l'assertion PS
        private DateTime tempsAssertionPSC;          // horodatage de création de l'assertion PSC
        private PsSignatureProvider psSignProv;     // fournisseur de signature pour la CPS
        private VitaleSignatureProvider vitaleSignProv; // fournisseur de signature pour la carte Vitale
        private XDocument assertion;                // l'assertion PS générée et mémorisée
       
        #endregion

        #region Constructeur
        /// <summary>
        /// Constructeur par défaut
        /// <param name="cps">la CPS avec laquelle les assertions PS seront générées</param>
        /// <param name="vitale">la carte Vitale avec laquelle les assertions Vitale seront générées</param>
        /// </summary>
        public AssertionFactory(Cps cps, CarteVitale vitale)
        {
            generationAssertion = true;
            assertion = null;
            AttributeStatementPS = null;
            AttributeStatementPSC = null;
            AttributeStatementVitale = null;
            ValiditeAssertionPS = DELAI_VALIDITE_ASSERTION_PS;
            ValiditeAssertionPSC = DELAI_VALIDITE_ASSERTION_PSC;
            avecSignatureVitale = false;
            if (cps != null)
            {
                psSignProv = new PsSignatureProvider(cps);
            }
            else
            {
                psSignProv = null;
            }
                if (vitale != null)
            {
                vitaleSignProv = new VitaleSignatureProvider(vitale.Lecteur);
            }
            else
            {
                vitaleSignProv = null;
            }
        }


        /// <summary>
        /// Constructeur SAns parametres pour les assertions structures
        /// </summary>
        public AssertionFactory() {}

        #endregion Constructeur

        #region Properties
        /// <summary>
        /// La version de l'assembly TLSi_AssertionLibrary
        /// </summary>
        public static String Version
        {
            get
            {
                Assembly assembly = typeof(AssertionFactory).Assembly;
                return assembly.GetName().Version.ToString();
            }
        }
        /// <summary>
        /// la CPS sélectionnée pour les prochaines assertions PS
        /// </summary>
        public Cps Cps
        {
            get
            {
                return psSignProv.Cps;
            }

        }
        /// <summary>
        /// Le certificat de la CPS
        /// </summary>
        public X509Certificate2 CertificatCPS
        {
            get
            {
                if (Cps == null)
                    throw new AssertionException("CPS non valide");
                return psSignProv.Certificat;
            }
        }
        /// <summary>
        /// Teste l'occurence d'un événement sur le lecteur de la CPS
        /// </summary>
        public SlotStatus EvenementCps
        {
            get
            {
                return psSignProv.SlotEvent;
            }
        }

		/// <summary>
		/// Le Secteur d'activité
		/// </summary>
		public String SecteurActivite
		{
			get
			{
				if (Cps == null)
					throw new AssertionException("CPS non valide");
				return psSignProv.secteurActivite;
			}
		}

		/// <summary>
		/// Le code spécialité
		/// </summary>
		public String CodeSpecialite
		{
			get
			{
				if (Cps == null)
					throw new AssertionException("CPS non valide");
				return psSignProv.codeSpecialite;
			}
		}
		/// <summary>
		/// Le lecteur utilisé pour accéder à la carte Vitale pour les prochaines assertions Vitale
		/// </summary>
		public string LecteurVitale
        {
            get
            {
                if (vitaleSignProv != null)
                {
                    return vitaleSignProv.Lecteur;
                }
                return null;
            }
        }
        /// <summary>
        /// La carte Vitale lue dans le LecteurVitale
        /// </summary>
        public CarteVitale Vitale
        {
            get
            {
                if (vitaleSignProv != null)
                {
                    return vitaleSignProv.Vitale;
                }
                return null;
            }
        }
        /// <summary>
        /// Durée de validité de l'assertion PS en secondes (20 sec par défaut).
        /// Au delà de ce délai, la lecture de la propriété AssertionPS déclenche la création d'une nouvelle assertion
        /// </summary>
        public double ValiditeAssertionPS { get; set; }

        
        /// <summary>
        /// le XDocument de l'assertion PS signée.
        /// La CPS utilisée est celle correspondant à la propriété SignatureCertificate
        /// </summary>
        public XDocument AssertionPS
        {
            get
            {
                if (Cps == null)
                {
                    throw new AssertionException("CPS non valide");
                }
                if (psSignProv.CpsActive != true)
                {   // la CPS a été arrachée et réintroduite => il faut générer une nouvelle assertion PS
                    generationAssertion = true;
                }
                else // si (temps dernière assertion + délai de validité) < temps courant, alors nouvelle assertion
                    if (tempsAssertionPS.AddSeconds(ValiditeAssertionPS).CompareTo(DateTime.Now) < 0)
                        generationAssertion = true;
                if (generationAssertion == true)
                {    // si CPS arrachée ou délai dépassé génération d'une nouvelle assertion PS
                    SamlPsAssertion psAssertion = new SamlPsAssertion(psSignProv);

					
										if (AttributeStatementPS != null)
											psAssertion.AttributeStatement = AttributeStatementPS;
										assertion = psAssertion.Build();
                    tempsAssertionPS = DateTime.Now;
                    generationAssertion = false;
                }
                return assertion;
            }
        }

        /// <summary>
        /// Durée de validité de l'assertion PSC en secondes (20 sec par défaut).
        /// Au delà de ce délai, la lecture de la propriété AssertionPSC déclenche la création d'une nouvelle assertion
        /// </summary>
        public double ValiditeAssertionPSC { get; set; }

        /// <summary>
        /// le XDocument de l'assertion PSC
        /// La CPS utilisée est celle correspondant à la propriété SignatureCertificate
        /// </summary>
        public XDocument AssertionPSC
        {
            get
            {
                if (Cps == null)
                {
                    throw new AssertionException("CPS non valide");
                }
                // si (temps dernière assertion PSC + délai de validité) < temps courant, alors nouvelle assertion
                 if (tempsAssertionPSC.AddSeconds(ValiditeAssertionPSC).CompareTo(DateTime.Now) < 0)
                   {    // si délai dépassé génération d'une nouvelle assertion PSC
                    SamlPscAssertion pscAssertion = new SamlPscAssertion(psSignProv);

                    if (AttributeStatementPSC != null)
                        pscAssertion.AttributeStatement = AttributeStatementPSC;
                    assertion = pscAssertion.Build();
                    tempsAssertionPSC = DateTime.Now;
                    generationAssertion = false;
                }
                return assertion;
            }
        }

        /// <summary>
        /// booléen indiquant si l'assertion Vitale doit être signée ou non
        /// </summary>
        public Boolean avecSignatureVitale { get; set; }
        /// <summary>
        /// l'AttributeStatement à ajouter à l'assertion PS si différent de null
        /// </summary>
        public SamlAttributeStatement AttributeStatementPS { get; set; }
        /// <summary>
        /// l'AttributeStatement à ajouter à l'assertion PSC si différent de null
        /// </summary>
        public SamlAttributeStatement AttributeStatementPSC { get; set; }
        /// <summary>
        /// l'AttributeStatement à ajouter à l'assertion Vitale si différent de null
        /// </summary>
        public SamlAttributeStatement AttributeStatementVitale { get; set; }

        /// <summary>
        /// méthode retournant le XDocument de l'assertion Vitale
        /// </summary>
        public XDocument AssertionVitale
        {
            get
            {
                if (vitaleSignProv == null)
                {
                    return null;
                }
                vitaleSignProv.Lecteur = LecteurVitale; // forcer relecture carte Vitale (ControlePresenceCarteVitale)
                SamlVitaleAssertion vitaleAssertion = new SamlVitaleAssertion(vitaleSignProv);
                if (AttributeStatementVitale != null)
                    vitaleAssertion.AttributeStatement = AttributeStatementVitale;
                if (psSignProv != null)
                {
                    vitaleAssertion.Issuer = psSignProv.Certificat.GetNameInfo(X509NameType.SimpleName, false); // cherche le CN dans le DN
                }
                else
                {
                    X509Certificate2 certificate = null;
                    Pkcs12 pkcs12 = new Pkcs12("Chemin_certificat.p12", "Password_certificat");
                    certificate = pkcs12.certificate;
                    //authCertificate = pkcs11.authentificationCertificate;
                    certificate.GetNameInfo(X509NameType.SimpleName, false); // cherche le CN dans le DN)
                }
                return vitaleAssertion.Build(avecSignatureVitale);
            }
        }
        /// <summary>
        /// méthode retournant le XmlDocument de l'assertion structure
        /// </summary>
        /// <param name="cheminMyIni">Chemin du fichier de configuration (string)</param>
        /// <returns></returns>
        public XmlDocument AssertionStructure(string cheminMyIni)
        {
            //XmlDocument pour contenir l'assertion
            XmlDocument res = new XmlDocument();

            try
            {
                var str = new StructureAssertion(cheminMyIni);
                var MyIni = new INIFile(cheminMyIni);

                //chargement de la convention
                XmlDocument xmlConv = new XmlDocument();
                if (string.IsNullOrEmpty(MyIni.Read("Convention", "Convention")))
                    throw new Exception("Le chemin de la convention est incorrecte");

                xmlConv.Load(MyIni.Read("Convention", "Convention"));

                //dictionnaire contenant les infos de la convention ...
                Dictionary<string, string> voir = new Dictionary<string, string>();
                voir = str.structVal(xmlConv);

                

                //appel de la fonction de créaation et sauvegarde du resultat
                res = str.strucBuilder(voir);

                //Pour Enregistrer le fichier
                if(!string.IsNullOrEmpty(MyIni.Read("Resultat", "Assertion")))
                {
                    res.Save(MyIni.Read("Resultat", "Assertion"));
                }
                
                return res;

            }
            catch(Exception e)
            {
                Debug.WriteLine(e.ToString());
                return res;
            }
            

        }
        /// <summary>
        /// Liste toutes les CPS présentes
        /// </summary>
        public static List<Cps> CpsList
        {
            get
            {
                return PsSignatureProvider.ListeCps;
            }
        }
        /// <summary>
        /// la liste des ressources Galss disponibles pour la carte Vitale
        /// </summary>
        public static string[] LecteursGalss
        {
            get
            {
                return VitaleSignatureProvider.LecteursGalss;
            }

            set
            {
                VitaleSignatureProvider.LecteursGalss = value;
            }
        }
        /// <summary>
        /// Liste des lecteurs disponibles pour carte Vitale (avec ou sans carte)
        /// </summary>
        public static List<CarteVitale> VitaleList
        {
            get
            {
                //List<Cps> listeCps = PsSignatureProvider.ListeCps;
                List<string> lecteurs = VitaleSignatureProvider.ListeLecteursVitale;
                /*for (int i = 0; i < listeCps.Count; i++)
                {   // si lecteur CPS dans liste lecteurs, on le supprime car non dispo pour Vitale
                    if (lecteurs.IndexOf(listeCps[i].Lecteur) != -1)
                    {
                        lecteurs.Remove(listeCps[i].Lecteur);
                    }
                }*/
                List<CarteVitale> listeVitale = new List<CarteVitale>();
                for (int i = 0; i < lecteurs.Count; i++)
                {
                    listeVitale.Add(Mica.Instance.FindByName(lecteurs[i]));
                }
                return listeVitale;
            }
        }
        #endregion
    }
}
