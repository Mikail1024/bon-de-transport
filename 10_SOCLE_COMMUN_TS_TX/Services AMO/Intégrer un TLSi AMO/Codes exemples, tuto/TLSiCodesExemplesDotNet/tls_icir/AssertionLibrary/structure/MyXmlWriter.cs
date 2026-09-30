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

using System.IO;

namespace TLSi_AssertionLibrary.structure
{
    class MyXmlWriter : System.Xml.XmlTextWriter
    {
        private static bool Premier = true;
        public MyXmlWriter(TextWriter fileName)
            : base(fileName)
        { }

        public override void WriteStartElement(string prefix, string localName, string ns)
        {

            if (ns == "urn:oasis:names:tc:SAML:2.0:assertion")
            {



                base.WriteStartElement("saml2", localName, ns);
                if (Premier)
                {
                    base.WriteAttributeString("xmlns", "samlp", null, "urn:oasis:names:tc:SAML:2.0:protocol");
                    base.WriteAttributeString("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
                    base.WriteAttributeString("xsi", "schemaLocation", null, "urn:oasis:names:tc:SAML:2.0:assertion http://docs.oasis-open.org/security/saml/v2.0/saml-schema-assertion-2.0.xsd");
                    Premier = false;

                }


            }
            else
            {
                base.WriteStartElement(prefix, localName, ns);
            }
        }

    }
}
