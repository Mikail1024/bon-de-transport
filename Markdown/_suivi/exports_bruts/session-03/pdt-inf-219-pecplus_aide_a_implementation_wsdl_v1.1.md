# Fiche d’information

<table>
    <tr>
      <td><strong>Référence</strong></td>
      <td><strong>N°219 <mark>v1.1</mark></strong></td>
      <td><strong>Date</strong></td>
      <td><strong>14.10.2013</strong></td>
    </tr>
    <tr>
      <td><strong>Objet</strong></td>
      <td colspan="3"><strong>PEC+ version TIRAT- Aide à l’implémentation du WSDL</strong><br />(ServicePECB2_EXP_4.0.<mark>4</mark>)</td>
    </tr>
</table>

<table>
    <tr>
      <td><strong><b>Type</b></strong></td>
      <td>[x] Technique</td>
      <td>[ ] Pratique</td>
      <td>[ ] Communication</td>
      <td>[x] Livraison</td>
    </tr>
    <tr>
      <td><strong><b>Destinataires</b></strong></td>
      <td>[x] Éditeurs</td>
      <td>[ ] Équipementiers</td>
      <td>[ ] OCT</td>
      <td>[ ] CIS</td>
    </tr>
    <tr>
      <td><strong>Produits</strong></td>
      <td>Facturation :<br />[ ] CDC Editeurs<br />[ ] CDC OCT<br />[ ] FSV agrément<br />[ ] FSV exploitation<br />[ ] SCOR</td>
      <td>Référentiels :<br />[ ] Dispositif Intégré<br />[ ] Terminal lecteur<br />[ ] TLA<br />[ ] Lecture Vitale<br />[ ] Télé-mise à jour</td>
      <td>Produits d’infrastructure :<br />[ ] ATSAM<br />[ ] SrvSVCNAM<br />[ ] GALSS<br />[ ] Cryptolib<br />[ ] MICA<br /><br />Services en Ligne :<br />[ ] CDR<br />[ ] Espace pro</td>
      <td>Télé-services intégrés :<br />[x] Tous Téléservices concernés par le cadre d’interopérabilité<br /><br /><br />Acquisition des droits :<br />[ ] API de Lecture</td>
    </tr>
    <tr>
      <td><strong><b>Secteur</b></strong></td>
      <td colspan="2">[x] Libéral</td>
      <td colspan="2">[ ] Hospitalier</td>
    </tr>
    <tr>
      <td><strong><b>Professionnels</b> de Santé concernés</strong></td>
      <td>[ ] Médecins<br />[ ] Sages-femmes<br />[ ] Chirurgiens-dentistes<br />[ ] Pharmaciens<br />[ ] Laboratoires</td>
      <td>[ ] Auxiliaires médicaux<br />[ ] Centres de Santé<br />[ ] Fournisseurs<br />[x] Transporteurs</td>
      <td colspan="2">[ ] Établissements publics<br />[ ] Cliniques privées<br />[ ] ESPIC</td>
    </tr>
    <tr>
      <td><strong><b>Prise en compte</b></strong></td>
      <td>[x] Facultative</td>
      <td>[ ] Obligatoire</td>
      <td colspan="2"></td>
    </tr>
</table>

***Nota** : les modifications apportées par rapport à la version précédente sont <mark><u>surlignées en jaune.</u></mark>*

**Contexte**

Le WSDL du service PEC+ est adapté pour vous permettre de l’utiliser directement sous JAVA et .NET dans la majorité des IDE du marché, sans que vous ayez à le modifier. <mark>Ce <u>WSDL est testé pour .NET (Visual Studio) et pour JAVA (Eclipse).</u></mark>

*   La valeur de l’attribut « transport » de l’élément `<wsdl:binding>` a été mise à jour à « [http://schemas.xmlsoap.org/soap/http](http://schemas.xmlsoap.org/soap/http) » au lieu de « [http://www.w3.org/2003/05/soap/bindings/HTTP/](http://www.w3.org/2003/05/soap/bindings/HTTP/) ».
*   La ligne `<wsaw:UsingAddressing required= "true"/>` a été supprimée.

L’aide à l’implémentation décrite ci-dessous précise les impacts et les adaptations à effectuer dans le support de de la formation « TLSi - Supports de formation / Aide au développement » qui a été mis à votre disposition <u>([https://diffusion.sesam-vitale.fr/dossiers/voir.asp?id=669](https://diffusion.sesam-vitale.fr/dossiers/voir.asp?id=669)).</u>

![icon: sesam-vitale](page_1_image_1_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**~~www.sesam-vitale.fr~~ – ~~centre-de-service@sesam-vitale.fr~~**

**Réf. : PDT-INF-219**

# Fiche d’information

**Valorisation du header Action**

Pour que le code généré valorise automatiquement le header Action avec la bonne valeur tel que spécifié dans le WSDL, il faut indiquer que le WS-Addressing doit être mis en œuvre :

**~~En java~~**
Lors de l’instanciation de la classe du service Port contenant les méthodes d’appel des opérations.
Pour ce faire, il faut récupérer auprès du service l’interface du service port en passant en paramètre une instance de classe correspondant à la gestion du WS-Addressing :
<u>Exemple pour le TELESERVICE « AAT » - Avis d’Arrêt de Travail</u> :
AATService service = aat.getAATService(new javax.xml.ws.soap.AddressingFeature());

**~~En C# / .NET~~**
Dans le fichier app.config généré lors de l’importation du WSDL, valoriser l’attribut "*messageVersion*" de l’élément *textMessageEncoding* du binding à "*Soap12WSAddressing10*".
<u>Exemple pour le TELESERVICE « AAT » - Avis d’Arrêt de Travail</u> :

```xml
<configuration>
    <system.serviceModel>
        <bindings>
            <customBinding>
                <binding name="AATServiceBinding">
                    <textMessageEncoding maxReadPoolSize="64" maxWritePoolSize="16"
                        messageVersion="Soap12WSAddressing10" writeEncoding="utf-8">
                        ...
                    </textMessageEncoding>
                    ...
                </binding>
            </customBinding>
        </bindings>
        ...
    </system.serviceModel>
</configuration>
```

**URL du service**

**L’URL du service doit pouvoir être modifiée en fonction de l’environnement appelé (de **tests ou de production**,** voir indications dans le guide d’intégration). Afin de faire cette modification facilement, il convient de paramétrer l’URL appelée.

<u>Exemple pour le TELESERVICE « AAT » - Avis d’Arrêt de Travail :</u>

**~~En java~~**
String URL_AAT = [https://qualif.services-ps.ameli.fr/lps;](https://qualif.services-ps.ameli.fr/lps)
AAT aat = new AAT(url);
AATService service = aat.getAATService(new javax.xml.ws.soap.AddressingFeature());
((BindingProvider)service).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, URL_AAT);

**~~En C# / .NET~~**
```csharp
String URL_AAT = "https://qualiflps.services-ps.ameli.fr/lps";
AATServiceClient aat = new AATServiceClient();
aat.Endpoint.Address = new EndpointAddress(URL_AAT);
```

Ainsi, il suffit d’un fichier de configuration de l’application dans lequel se trouve indiquées l’URL de test et l’URL d’exploitation du service sans avoir à modifier l’application.

![icon: sesam-vitale](page_2_image_1_v2.jpg)
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**~~www.sesam-vitale.fr~~ – ~~centre-de-service@sesam-vitale.fr~~**
**Réf. : PDT-INF-219**

# Fiche d’information

**Erreur SOAP** **Le fichier WSDL ne fait pas référence aux erreurs SOAP de type Erreur (correspondant **au détail de l’erreur SOAP défini dans le cadre d’interopérabilité). En effet, il n’est pas** **exclu de recevoir une erreur SOAP qui ne corresponde pas à ce type erreur. De ce fait,** **les exceptions levées ne seront que des SOAP exceptions (le type « Erreur » n’est pas** implémenté).**

### En java, il convient donc :

*   de coder de sorte à ne prendre en compte que des SOAPFaultException
*   de parcourir l’arbre DOM de ce type d’objet, afin de lire les données nécessaires à la traçabilité des erreurs (notamment rechercher dans l’élément detail un élément Erreur tel que défini dans le cadre d’interopérabilité).

<u>Exemple :</u>

```java
<mark>catch</mark> (SOAPFaultException e) {
 SOAPFault faute = e.getFault();
 <mark>*log*.debug("SOAPFaultException : Code = " + faute.getFaultCode()</mark>
        <mark>+ " - Reason text = " + faute.getFaultString());</mark>

 <mark>Iterator subCodeList = faute.getFaultSubcodes();</mark>
 <mark>**while** (subCodeList.hasNext()){</mark>
  <mark>String subCodeText = ((QName)subCodeList.next()).toString();</mark>
  <mark>**if** (subCodeText != **null**){</mark>
   <mark>*log*.debug("                - subCodeText = " + subCodeText);</mark>
  <mark>}</mark>
 <mark>}</mark>

 <mark>// recuperation de l'element Erreur dans le Detail de la faute soap</mark>
 <mark>**if** (faute.getDetail().hasChildNodes()) {</mark>
  <mark>Iterator listeDetail = faute.getDetail().getDetailEntries();</mark>
  <mark>**while** (listeDetail.hasNext()){</mark>
   <mark>DetailEntry d = (DetailEntry)listeDetail.next();</mark>
   <mark>*log*.debug("DetailEntry = " + d.getElementName().getLocalName());</mark>
   <mark>**if** (d.getElementName().getLocalName().equals("Erreur")){</mark>
    <mark>String code = d.getAttributeValue(**new** QName("code"));</mark>
    <mark>String messageID = d.getAttributeValue(**new** QName("messageID"));</mark>
    <mark>String severite = d.getAttributeValue(**new** QName("severite"));</mark>
    <mark>String value = d.getValue();</mark>
    <mark>*log*.debug("value = " + value);</mark>
    <mark>*log*.debug("code = " + code + ", messageID = " + messageID + ", severite = " + severite);</mark>
   <mark>}</mark>
  <mark>}</mark>
 <mark>}</mark>
<mark>}</mark>
```

![icon: sesam-vitale](page_3_image_1_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**~~www.sesam-vitale.fr~~ – ~~centre-de-service@sesam-vitale.fr~~**

**Réf. : PDT-INF-219**