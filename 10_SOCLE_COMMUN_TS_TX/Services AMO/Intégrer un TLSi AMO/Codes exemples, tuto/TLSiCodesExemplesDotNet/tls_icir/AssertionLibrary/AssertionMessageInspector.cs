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
using System.ComponentModel.Composition;
using System.IO;
using System.Linq;
using System.ServiceModel.Channels;
using System.ServiceModel.Description;
using System.ServiceModel.Dispatcher;
using System.Xml;
using System.Xml.Linq;

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// Inpecteur de message devant ajouter les assertions PS et Vitale dans le header Security du message requête du TLSi
    /// </summary>
    public class AssertionMessageInspector : IEndpointBehavior, IClientMessageInspector
    {[Import]
        private AssertionFactory factory;

        #region Constructeur
        /// <summary>
        /// Contructuer de l'inspecteur de message pour les assertions PS et Vitale
        /// </summary>
        /// <param name="f">la fabrique d'assertions</param>
        public AssertionMessageInspector(AssertionFactory f)
        {
            this.factory = f;
            this.AvecVitale = true;
        }
        /// <summary>
        /// Constructeur de l'inspecteur de message pour les assertions
        /// </summary>
        /// <param name="f">la fabrique d'assertions</param>
        /// <param name="vit">l'indicateur de génération d'assertion Vitale</param>
        public AssertionMessageInspector(AssertionFactory f, Boolean vit)
        {
            this.factory = f;
            this.AvecVitale = vit;
        }

        /// <summary>
        /// Constructeur de l'inspecteur de message pour les assertions
        /// </summary>
        /// <param name="f">la fabrique d'assertions</param>
        /// <param name="vit">l'indicateur de génération d'assertion Vitale</param>
        /// <param name="psc">l'indicateur de génération d'assertion PSC</param>
        /// <param name="tlsm">l'indicateur de authentifiaction mutuelle</param>

        public AssertionMessageInspector(AssertionFactory f, Boolean vit, Boolean psc, Boolean tlsm)
        {
            this.factory = f;
            this.AvecVitale = vit;
            this.IsPSC = psc;
            this.IsTLSM = tlsm;
        }
        #endregion

        #region Properties
        /// <summary>
        /// indique si une assertion Vitale doit être générée
        /// </summary>
        public Boolean AvecVitale { get; set; }

        /// <summary>
        /// indique si une assertion PSC doit être générée
        /// </summary>
        public Boolean IsPSC { get; set; }

        /// <summary>
        /// indique si autentification par TLS Mutuel --> pas d'assertion PS
        /// </summary>
        public Boolean IsTLSM { get; set; }

        /// <summary>
        /// Message requête
        /// </summary>
        public string RequestMessage { get; set; }
        /// <summary>
        /// Message réponse
        /// </summary>
        public string ResponseMessage { get; set; }
        #endregion

        #region IEndpointBehavior Members
        void IEndpointBehavior.AddBindingParameters(ServiceEndpoint endpoint, System.ServiceModel.Channels.BindingParameterCollection bindingParameters)
        {
        }

        void IEndpointBehavior.ApplyClientBehavior(ServiceEndpoint endpoint, ClientRuntime clientRuntime)
        {
            // adds our inspector to the runtime
            clientRuntime.MessageInspectors.Add(this);
        }

        void IEndpointBehavior.ApplyDispatchBehavior(ServiceEndpoint endpoint, EndpointDispatcher endpointDispatcher)
        {
        }

        void IEndpointBehavior.Validate(ServiceEndpoint endpoint)
        {
        }
        #endregion

        #region IClientMessageInspector Members
        void IClientMessageInspector.AfterReceiveReply(ref System.ServiceModel.Channels.Message reply, object correlationState)
        {
            this.ResponseMessage = reply.ToString();
            StreamWriter outfile = new StreamWriter("MessageSOAPRecu.xml");
            outfile.Write(reply.ToString());
            outfile.Flush();
            outfile.Close();
        }

        object IClientMessageInspector.BeforeSendRequest(ref System.ServiceModel.Channels.Message request, System.ServiceModel.IClientChannel channel)
        {
            string msgRequest = request.ToString();

            #region Ajout des assertions PS/PSC et Vitale dans l'élément Security
            // Recherche du noeud Security
            XDocument doc = XDocument.Parse(msgRequest);
            XElement root = doc.Root;
            XNamespace ns = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
            XElement xElementSecurity = doc.Descendants(ns + "Security").First();

            if (IsPSC)
            {
                // Création de l'assertion PSC
                XElement assertionPSC = factory.AssertionPSC.Root;
                Console.WriteLine("assertion PSC OK");
                xElementSecurity.Add(assertionPSC);
            }
            else if (!IsTLSM)
            {
                // Création de l'assertion PS signée
                XElement assertionPS = factory.AssertionPS.Root;
                Console.WriteLine("assertion PS OK");
                xElementSecurity.Add(assertionPS);
            }

            

            // création de l'assertion Vitale
            if (AvecVitale)
            {
                XElement assertionVitale = factory.AssertionVitale.Root;
                Console.WriteLine("assertion Vitale OK");
                xElementSecurity.Add(assertionVitale);
            }
            #endregion

            //Permet de recréér un nouveau message SOAP à partir du message d'origine + 
            //les assertions dans le Header
            MemoryStream ms = new MemoryStream();

            // Attention très important :
            // Il faut Sauvegarder le XML dans un flux avec l'option DisableFormatting
            // pour que le flux ne soit pas modifié (ajout ou suppression d'espace)
            doc.Save(ms, SaveOptions.DisableFormatting);

            // Sauvegarde du document SOAP en entrée
            StreamWriter outfile = new StreamWriter("MessageSOAPEnvoye.xml");
            outfile.Write(doc.ToString());
            outfile.Flush();
            outfile.Close();

            ms.Position = 0;    // Se positionner au début du flux : important
            XmlReader reader = XmlReader.Create(ms);

            request = Message.CreateMessage(reader, int.MaxValue, request.Version);

            //Si authentification ProSantéConnect
			if (IsPSC)
            {
                //Si on est en authentification PSC, récupération du jeton ProSantéConnect
                String jetonPSC = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJKRlRBM1llVVdQbERCTEJfeU5qWUs0bWZJcTdhYXBBS21ieVdyczRPZ0RnIn0.eyJleHAiOjE3MzE0ODU3MzAsImlhdCI6MTczMTQ4NTYxMCwiYXV0aF90aW1lIjoxNzMxNDg0MTAxLCJqdGkiOiIyYjk4NzYzNi03MzQ1LTQxYzMtYTE0Ny02N2Q4NzZjMzFhM2UiLCJpc3MiOiJodHRwczovL2F1dGguYmFzLnBzYy5lc2FudGUuZ291di5mci9hdXRoL3JlYWxtcy9lc2FudGUtd2FsbGV0Iiwic3ViIjoiZjo1NTBkYzFjOC1kOTdiLTRiMWUtYWM4Yy04ZWI0NDcxY2Y5ZGQ6ODk5NzAwNTU1MjU1IiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZ2llc3Ytd2ViLXNlcnZpY2VzLWJhcyIsIm5vbmNlIjoiNzg5NDU2Iiwic2lkIjoiMzRiYTJmYzgtMmNlNS00ZWJhLTk1NDUtYzUzMWI3MDYxMDNjIiwiYWNyIjoiZWlkYXMxIiwic2NvcGUiOiJvcGVuaWQgc2NvcGVfYWxsIiwiYXV0aE1vZGUiOiJDQVJEIiwiU3ViamVjdE5hbWVJRCI6Ijg5OTcwMDU1NTI1NSIsInByZWZlcnJlZF91c2VybmFtZSI6Ijg5OTcwMDU1NTI1NSIsInNlc3Npb25fc3RhdGUiOiIzNGJhMmZjOC0yY2U1LTRlYmEtOTU0NS1jNTMxYjcwNjEwM2MifQ.JX3H8nYOBNdo6edp-jctsjB0_fC7nw3HfIfH0GRBjSeHHNfUavcOgk8E1uYpfW_er0IbTab8sVoniNUz05egO5ufNx4iHTnMRxbn_7kJVQy9IbdJE82Ja-HeNg8qd9s7P-vSwzMZBcfFrdfG-Xs64Tnl7cG9qxX29sdI4tJUGKGadqfH7EMvdW4Y2hKHOasUv04oMHTqItq_iUDor0zq7d9_AkD3TDBzHmGALNmW8XtmIKc8nrcj5tApIVtGiRlOUcKgA1jhclyT1YnMyw_RQyN4BWQjqewHYyRg6WJGBM3l1adzHwllHNGCFtvqCUgLBEtYJT8h2WbU6CtKRvLOIg";
               
                //Appel de la classe permettant de récupérer le jeton AssuranceMaladie via une requête REST et le jeton PSC en paramètre
                AccesTokenAMOService tokenAMOService = new AccesTokenAMOService();
                 String jetonAMO = tokenAMOService.GetTokenAsync(jetonPSC).Result;
                 Console.WriteLine("jetonAMO : " + jetonAMO);

                // ajout de jeton AM en en-tête de la requête SOAP
                if (request.Properties.Count == 0 || request.Properties[HttpRequestMessageProperty.Name] == null)
                {
                    var property = new HttpRequestMessageProperty();
                    property.Headers["Authorization"] = "Bearer " + jetonAMO;
                    request.Properties.Add(HttpRequestMessageProperty.Name, property);
                }
                else
                {
                    ((HttpRequestMessageProperty)request.Properties[HttpRequestMessageProperty.Name]).Headers["Authorization"] = "Bearer " + jetonAMO;
                }

            }

            this.RequestMessage = request.ToString();

            return null;
        }
        #endregion
    }
}
