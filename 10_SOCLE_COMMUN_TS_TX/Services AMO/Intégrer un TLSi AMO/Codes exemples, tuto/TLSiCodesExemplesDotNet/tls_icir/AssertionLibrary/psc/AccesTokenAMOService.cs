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
using System.Net.Http;
using System.Security.Cryptography.X509Certificates;
using System.Text.Json;
using System.Threading.Tasks;

namespace TLSi_AssertionLibrary
{
    /// <summary>
    /// class permettant la récupération d'un jeton AMO à partir d'un jeton PSC
    /// </summary>
    public class AccesTokenAMOService
    {
        private static readonly HttpClient _httpClient = new HttpClient();
		//url du serveur de jeton AMO
        private static readonly string URL_GET_TOKEN = "https://qualiflps-auth-services-ps-tlsm.ameli.fr/token-exchange";

        /// <summary>
        /// fonction d'appel au service jetonAMO
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        /// <exception cref="Exception"></exception>
        public async Task<String> GetTokenAsync(String input)
        {
            HttpResponseMessage response = null;
            try
            {
                using (HttpClient httpClient = CreateHttpClient())
                {
                    HttpRequestMessage request = CreateHttpRequestMessageGetToken(input, URL_GET_TOKEN);
                    response = await httpClient.SendAsync(request);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Erreur lors de l'appel à getToken AMO : " + e.Message);
                throw new Exception("Erreur lors de l'appel à getToken AMO : " + e.Message);

            }

            return await TraitementReponseHttpGetTokenAsync(response);

        }

        private HttpClient CreateHttpClient()
        {
            var handler = new HttpClientHandler();
            handler.ClientCertificates.Add(GetClientCertificate());

            return new HttpClient(handler);
        }

        private X509Certificate2 GetClientCertificate()
        {
            X509Certificate2 certificate = new X509Certificate2("Chemin_Certificat_P12", "Password_Certificat", X509KeyStorageFlags.MachineKeySet | X509KeyStorageFlags.PersistKeySet | X509KeyStorageFlags.Exportable);

            return certificate;
        }

		/// <summary>
        /// Fonction définissant la requête REST d'appel au serveur de jeton AMO
        /// </summary>
        /// <param name="jetonPSC"></param>
        /// <param name="url"></param>
        /// <returns>request</returns>
        private HttpRequestMessage CreateHttpRequestMessageGetToken(String jetonPSC, string url)
        {
            HttpContent content = new FormUrlEncodedContent(new[]
            {
                new KeyValuePair<string, string>("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange"),
                new KeyValuePair<string, string>("subject_token", jetonPSC),
                new KeyValuePair<string, string>("subject_token_type", "urn:ietf:params:oauth:token-type:access_token"),
                new KeyValuePair<string, string>("scope", "all"),
                new KeyValuePair<string, string>("client_id", "XXX")
            });

            HttpRequestMessage request = new HttpRequestMessage(HttpMethod.Post, URL_GET_TOKEN);
            request.Content = content;
            request.Headers.Add("ContentType", "application/x-www-form-urlencoded");
			Console.WriteLine("requestGetToken : " + request);
            return request;
        }

		/// <summary>
        /// fonction de traitement de la réponse HTTP de la requête REST d'appel au serveur de jeton AMO
        /// </summary>
        /// <param name="response"></param>
        /// <returns>jetonAMO</returns>
        /// <exception cref="Exception"></exception>
        private async Task<String> TraitementReponseHttpGetTokenAsync(HttpResponseMessage response)
        {
            string responseContent = await response.Content.ReadAsStringAsync();

            JsonDocumentOptions options = new JsonDocumentOptions() { AllowTrailingCommas = true, CommentHandling = JsonCommentHandling.Skip };
            JsonDocument text = JsonDocument.Parse(responseContent, options);


            switch ((int)response.StatusCode)
            {
                case 200:
                    JsonElement jeton = text.RootElement.GetProperty("access_token");
                    return jeton.ToString();
                case 400:
                case 401:
                case 403:
                    JsonElement err = text.RootElement.GetProperty("error_description");
                    return err.ToString();
                default:
                    throw new Exception("Code réponse inconnu '" + (int)response.StatusCode + "'");
            }
        }
    }
}
