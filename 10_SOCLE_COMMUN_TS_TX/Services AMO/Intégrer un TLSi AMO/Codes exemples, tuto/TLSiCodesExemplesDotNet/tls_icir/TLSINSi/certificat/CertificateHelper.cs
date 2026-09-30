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

using System.Data;
using System.Security.Cryptography.X509Certificates;

namespace TLSINSi.certificat
{
    public static class CertificateHelper
    {
        public static X509Certificate2 AuthCertificate { get; private set; }
        public static X509Certificate2 SignatureCertificate { get; private set; }


        /// <summary>Initialise les certificats</summary>
        /// <exception cref="NoNullAllowedException"></exception>
        public static void InitCertificate()
        {
            if (PatientINS.CPS==true && PatientINS.PSC == false)
            {
                // recuperation du certificat depuis la carte CPS
                Pkcs11.Pkcs11 pkcs11 = new Pkcs11.Pkcs11();
                AuthCertificate = pkcs11.authentificationCertificate;
                SignatureCertificate = pkcs11.signatureCertificate;
            }
            else if (PatientINS.PSC==true) 
            {
                // recuperation du certificat P12 depuis le fichier
                Pkcs12.Pkcs12 pkcs12Auth = new Pkcs12.Pkcs12("Chemin_certificat_PSC.p12", "Password_Certificat");
                AuthCertificate = pkcs12Auth.certificate;
            }
            else if (PatientINS.CPS == false && PatientINS.PSC == false)
            {
                // recuperation du certificat P12 depuis le fichier
                Pkcs12.Pkcs12 pkcs12Auth = new Pkcs12.Pkcs12("Chemin_certificat.p12", "Password_certificat");
                AuthCertificate = pkcs12Auth.certificate;
            }

            if (CertificateHelper.AuthCertificate == null)
            {
                throw new NoNullAllowedException();
            }
        }


        /// <summary>
        /// Verification de la presence des certificats des autorites de certification dans les stores de Microsoft
        /// </summary>
        /// <returns>true si tous present</returns>
        public static bool CheckCertificates()
        {
            bool rc = true;

            X509Certificate2Collection CertCol;
            X509Certificate2Collection CertCol2;
            X509Certificate2Collection c;
            X509Certificate2Collection c2;
            X509Store rootStore = new X509Store(StoreName.Root, StoreLocation.LocalMachine);
            X509Store rootStore2 = new X509Store(StoreName.Root, StoreLocation.CurrentUser);
            X509Store intermediateStore = new X509Store(StoreName.CertificateAuthority, StoreLocation.LocalMachine);
            X509Store intermediateStore2 = new X509Store(StoreName.CertificateAuthority, StoreLocation.CurrentUser);
            rootStore.Open(OpenFlags.ReadOnly);
            rootStore2.Open(OpenFlags.ReadOnly);
            intermediateStore.Open(OpenFlags.ReadOnly);
            intermediateStore2.Open(OpenFlags.ReadOnly);

            // Vérification de la présence des Autorités principales racine de confiance

            // Filtre sur les certificats contenant "IGC-SANTE STANDARD"
            CertCol = rootStore.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE STANDARD", true);
           
            c = CertCol.Find(X509FindType.FindBySerialNumber, "11207F69865CDF9A675F3013640FE1A47805",
                true);
            CertCol2 = rootStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE STANDARD", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "11207F69865CDF9A675F3013640FE1A47805",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                 rc = false;
            }
            // Filtre sur les certificats contenant "IGC-SANTE ELEMENTAIRE"
            CertCol = rootStore.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE ELEMENTAIRE", true);

            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120ce19f9346f9456ff270023d8529037b5",
                true);
            CertCol2 = rootStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE ELEMENTAIRE", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120ce19f9346f9456ff270023d8529037b5",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                 rc = false;
            }
            // Filtre sur les certificats contenant "IGC-SANTE FORT"
            CertCol = rootStore.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE FORT", true);

            c = CertCol.Find(X509FindType.FindBySerialNumber, "112020c84f7536bbae89210de3991f7e1e0a",
                true);
            CertCol2 = rootStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC RACINE IGC-SANTE FORT", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "112020c84f7536bbae89210de3991f7e1e0a",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
               rc = false;
            }
            

            // Vérification de la présence des Autorités intermédiaires

           /* CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE ELEMENTAIRE ORGANISATIONS", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120653a6bf4aea5cc3d38fa056223f5acf1",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE ELEMENTAIRE ORGANISATIONS", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120653a6bf4aea5cc3d38fa056223f5acf1",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
              rc = false;
            }

            CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE ELEMENTAIRE PERSONNES", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120b865608a8b226df0a05d6a89d3577615",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE ELEMENTAIRE PERSONNES", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120b865608a8b226df0a05d6a89d3577615",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                rc = false;
            }

            CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE STANDARD ORGANISATIONS", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120e40e43a49ad0b95b67756f3c1835f7e9",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE STANDARD ORGANISATIONS", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120e40e43a49ad0b95b67756f3c1835f7e9",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                rc = false;
            }

            CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE STANDARD PERSONNES", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "112016654c36f13671b030541f6088ea44c2",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE STANDARD PERSONNES", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "112016654c36f13671b030541f6088ea44c2",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                rc = false;
            }

            CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE FORT ORGANISATIONS", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120d6066c2ffe33fc491f29e97642f64afa",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE FORT ORGANISATIONS", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120d6066c2ffe33fc491f29e97642f64afa",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                rc = false;
            }

            CertCol = intermediateStore.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE FORT PERSONNES", true);
            c = CertCol.Find(X509FindType.FindBySerialNumber, "1120679f809349701a181de89148cb554116",
                true);
            CertCol2 = intermediateStore2.Certificates.Find(X509FindType.FindByIssuerName, "AC IGC-SANTE FORT PERSONNES", true);
            c2 = CertCol2.Find(X509FindType.FindBySerialNumber, "1120679f809349701a181de89148cb554116",
                true);
            if ((c.Count == 0) && (c2.Count == 0))
            {
                rc = false;
            }*/

            return rc;
        }
    }
}