![logo: sesam-vitale](page_1_image_1_v2.jpg)

# <u>Fiche d’information.</u>

---

**Référence** **PDT-INF-913** **Date** **02/10/2025**
**Objet** **WSDL/XSD : gestion des redirections et recommandations de mise en cache**

---

<table>
    <tr>
      <td><u>Type</u></td>
      <td>☒ Technique</td>
      <td>☐ Pratique</td>
      <td>☐ Communication</td>
      <td>☐ Livraison</td>
    </tr>
    <tr>
      <td><u>Destinataires</u></td>
      <td>☒ Éditeurs</td>
      <td>☐ Équipementiers</td>
      <td>☐ OCT</td>
      <td>☐ CIS</td>
    </tr>
    <tr>
      <td><u>Produits</u></td>
      <td><b><b>Facturation</b></b><br />
        ☐ CDC Éditeurs<br />
        ☐ CDC OCT<br />
        ☐ FSV agrément<br />
        ☐ FSV exploitation<br />
        ☐ SCOR<br />
        <br />
        Services AMC<br />
        ☐ TP Complémentaire</td>
      <td><b><b>Référentiels</b></b><br />
        ☐ Dispositif Intégré<br />
        ☐ Terminal lecteur<br />
        ☐ TLA<br />
        ☐ Lecture Vitale<br />
        ☐ Télémise à jour</td>
      <td><b>Produits <b>d’infrastructure</b></b><br />
        ☐ ATSAM<br />
        ☐ SrvSVCNAM<br />
        ☐ GALSS<br />
        <br />
        Services en Ligne<br />
        ☐ CDR<br />
        ☐ amelipro</td>
      <td><b><b>Téléservices</b> <b>intégrés</b></b><br />
        ☒ AATi<br />
        ☒ ADRi<br />
        ☒ ALDi<br />
        ☒ CDRi<br />
        ☒ DMP<br />
        ☒ DMTi<br />
        ☒ EBDi<br />
        ☒ HRi<br />
        ☒ IMTi<br />
        ☒ INSi<br />
        ☒ ON<br />
        ☒ PEC +<br />
        ☒ ROC<br />
        ☒ SEFi<br />
        ☒ SPEi<br />
        <br />
        Acquisition des droits<br />
        ☐ API de Lecture Vitale</td>
    </tr>
    <tr>
      <td><u>Produits</u></td>
      <td><b><b>WebServices Appli</b> <b>Carte Vitale</b></b><br />
        ☒ Authentifier un utilisateur<br />
        ☒ Signer une facture Sesam Vitale</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><u>Secteur</u></td>
      <td>☒ Libéral</td>
      <td>☒ Hospitalier</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Professionnels<br />
        <u>de Santé</u><br />
        <u>concernés</u></td>
      <td>☒ Médecins<br />
        ☒ Sages-femmes<br />
        ☒ Chirurgiens-dentistes<br />
        ☒ Pharmaciens<br />
        ☒ Laboratoires</td>
      <td>☒ Auxiliaires médicaux<br />
        ☒ Centres de Santé<br />
        ☒ Fournisseurs<br />
        ☒ Transporteurs</td>
      <td>☒ Établissements publics<br />
        ☒ Cliniques privées<br />
        ☒ ESPIC</td>
      <td></td>
    </tr>
    <tr>
      <td>Prise en compte</td>
      <td>☒ Facultative</td>
      <td>☐ Obligatoire</td>
      <td></td>
      <td></td>
    </tr>
</table>

---

**Contexte** Des éditeurs peuvent occasionnellement rencontrer des erreurs avec certains fichiers WSDL/XSD.

---

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
*PDT-INF-913* **<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr-</u>** 
![icon: twitter](page_1_image_2_v2.jpg) *1 / 2*

![logo: sesam-vitale](page_2_image_1_v2.jpg)

# <u>Fiche d’information.</u>

---

### **Type d’erreur 1**

**Des éditeurs peuvent rencontrer des erreurs lors de l’import ou du traitement de fichiers WSDL/XSD des téléservices, car certains fichiers XSD référencés en http:// sont redirigés en <u>https://.</u> Certains parseurs WSDL ne gèrent pas correctement cette redirection et affichent des erreurs.**

<u>**Exemples de messages d’erreur**</u> :

*   SOAP-ERROR: Parsing Schema: can't import schema from 'http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd'
*   WSDLException (at /wsdl:definitions/wsdl:types/xsd:schema): faultCode=PARSER_ERROR: Problem parsing 'http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd'.: org.xml.sax.SAXParseException: The element type "hr" must be terminated by the matching end-tag "</hr>".
*   301 Moved permanently // "\<html> \<head>\<title>301 Moved Permanently\</title>\</head> \<body> \\<h1>301 Moved Permanently\</h1>\ \<hr>\nginx/1.26.3\ \</body> \</html>"
*   Error loading WSDL – There was something wrong with the WSDL you are trying to import. Error loading [ 'http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd] : org.apache.xmlbeans.XmlException : org.apache.xmlbeans.XmlException : error : does not close tag

---

### **Type d’erreur 2**

**De plus, si un logiciel tente de recharger systématiquement les XSD distants (ex. <u>http://www.w3.org/2006/03/addressing/ws-addr.xsd</u>), le site <u>www.w3.org</u> (via Cloudflare) bloque ces appels en affichant une page « anti-bot ».**

<u>**Exemple de message d’erreur**</u> :

Si plusieurs appels au xsd suivant <u>"http://www.w3.org/2006/03/addressing/ws-addr.xsd"</u> affichage d’un « anti-bot » à l’utilisateur.

---

### **Actions 1 & 2**

Pour les éditeurs qui rencontrent ces problèmes avec les fichiers « xsd » lors de leur récupération et/ou consultation, **la recommandation est la suivante** :

1.  Télécharger localement les fichiers XSD utilisés par les WSDL.
2.  Modifier les références dans les WSDL pour pointer vers ces fichiers locaux.

<u>**Exemple d’arborescence**</u> :

*   XSD/WSSE/Security.xsd
*   XSD/SOAP/ws-addr.xsd

Cela garantit la disponibilité des schémas et supprime les dépendances aux redirections externes.

---

### **Support GIE SV**

Le support relatif à cette information s’effectue via le portail Iris.

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr-</u>** ![icon: icon](page_2_image_2_v2.jpg)

***PDT-INF-913*** *2 / 2*