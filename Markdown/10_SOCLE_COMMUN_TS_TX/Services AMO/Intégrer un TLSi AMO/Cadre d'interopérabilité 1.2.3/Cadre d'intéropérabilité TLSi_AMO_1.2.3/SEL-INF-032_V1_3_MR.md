<!-- Page source 1 : transcription visuelle vérifiée ; pages suivantes : LlamaParse Agentic Plus. -->

SESAM-Vitale

# Table des erreurs du SIR

*Note technique SEL-INF-032 V1.2*

## 1 INTRODUCTION

Document listant les erreurs SOAP du SIR

Cette liste des erreurs est à usage informatif et non exhaustive.

## 2 FORMAT DE L’ERREUR SOAP

```xml
<?xml version="1.0"?>
<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
  <soap:Body>
    <soap:Fault>
      <soap:Code>
        <soap:Value>soap:[Code Value]</soap:Value>
        <soap:Subcode>
          <soap:Value>soap:[SubCode Value]</soap:Value>
        </soap:Subcode>
      </soap:Code>
      <soap:Reason>
        <soap:Text>[Reason]</soap:Text>
      </soap:Reason>
      <soap:Detail>
        <siram:Erreur xmlns:siram="urn:siram"
                      code="[code] "
                      severite="[Severite] "
                      messageID="...">
          [Erreur]
        </siram:Erreur>
      </soap:Detail>
    </soap:Fault>
  </soap:Body>
</soap:Envelope>
```

GIE SESAM-Vitale — 1 / 9


<!-- Pages source 2-2 -->

# **3 LISTE DES ERREURS**

La colonne grise peut apporter une information complémentaire sur la signification de l’erreur. Cette description n’est pas visible sur l’erreur SOAP.

<table>
  <thead>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th colspan="1"><b>Erreurs internes SIR</b></th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th colspan="1"></th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th colspan="1"><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_100</td>
      <td>ERREUR</td>
      <td>Version SOAP différente de 1.2</td>
      <td></td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Impossible de se connecter à la base de données du référentiel DESIR</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Le contexte "[Nom du contexte]" est obligatoire pour l'opération "[Nom de l'opération]"</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Erreur de syntaxe dans la formule de routage "[formule de routage analysée]"</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Erreur lors de la récupération des informations du PS - [détail erreur]</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Erreur lors de l'enrichissement PS</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Erreur lors de la récupération des informations du BAM - [détail erreur]</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>SCVI - Erreur technique</td>
    </tr>
  </tbody>
</table>

***GIE SESAM-Vitale*** icon: icon ***2 / 9***

*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

<!-- Pages source 3-3 -->

<table>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Les informations du ContexteBAM sont insuffisantes pour contacter le service CY_PB</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique</td>
      <td>Erreur lors de l'enrichissement PS via le cache offre de soin</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>ERREUR</td>
      <td>Erreur technique</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>ERREUR</td>
      <td>Erreur technique avec l’information de la balise security vide.</td>
      <td></td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique - Contexte Mode Appel absent</td>
      <td>Contexte ModeAppel absent</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique - Contexte Mode Appel invalide (au sens XSD)</td>
      <td>Contexte ModeAppel n’est pas conforme au XSD</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique - Contexte User absent</td>
      <td>Contexte User absent</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique – Problème authentificationInterOps</td>
      <td>Problème d’authentification</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique - Paramètres INTEROPS introuvable</td>
      <td>Paramètres INTEROPS introuvable</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique – ContexteModeAppel.NomLogique absent</td>
      <td>Paramètres INTEROPS introuvable</td>
    </tr>
</table>

* **GIE SESAM-Vitale** * icon: icon **3 / 9**

* **Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale** *

<!-- Pages source 4-6 -->

<table>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique –<br />Element sécurité absent</td>
      <td>Les éléments de sécurité sont<br />absents du flux</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.Veuillez renouveler votre<br />demande ultérieurement. Si le<br />problème persiste, contactez<br />l’éditeur du progiciel ou votre<br />responsable informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique –<br />Element sécurité absent</td>
      <td>Les éléments de sécurité sont<br />absents du flux</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique -<br />Contexte sécurité absent</td>
      <td>Contexte sécurité absent</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique -<br />Contexte sécurité<br />invalide (au sens XSD)</td>
      <td>Contexte sécurité non conforme XSD</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique -<br />Contexte Client DESIR<br />absent</td>
      <td>Contexte Client DESIR absent</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique -<br />Contexte Client DESIR<br />invalide (au sens XSD)</td>
      <td>Contexte Client DESIR non conforme<br />XSD</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique –<br />Contexte Application<br />Cliente absent</td>
      <td>Contexte Application Cliente absent</td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1000</td>
      <td>FATALE</td>
      <td>Erreur technique –<br />Contexte Application<br />Cliente invalide (au sens<br />XSD)</td>
      <td>Contexte Application Cliente non<br />conforme XSD</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1010</td>
      <td>ERREUR</td>
      <td>Impossible d’accéder au<br />partenaire destinataire</td>
      <td></td>
    </tr>
    <tr>
      <td>Receiver</td>
      <td>siram_40</td>
      <td>Le service est temporairement<br />inaccessible.<br />Veuillez renouveler votre demande<br />ultérieurement. Si le problème<br />persiste, contactez l’éditeur du<br />progiciel ou votre responsable<br />informatique.</td>
      <td>desir_1010</td>
      <td>FATALE</td>
      <td>Impossible d’accéder au<br />partenaire destinataire</td>
      <td>Le système partenaire est<br />injoignable (URL erronée, timeout,<br />…)</td>
    </tr>
</table>

*GIE SESAM-Vitale* icon: icon **4 / 9**

*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

<table>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_120</td>
      <td>ERREUR</td>
      <td>Action absente</td>
      <td>Problème sur les balises WS-Addressing</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_120</td>
      <td>ERREUR</td>
      <td>Action absente</td>
      <td>wsa :action absent</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_120</td>
      <td>ERREUR</td>
      <td>Action absente</td>
      <td>wsa :action absent</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_120</td>
      <td>ERREUR</td>
      <td>Action absente</td>
      <td>wsa :action absent</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_130</td>
      <td>ERREUR</td>
      <td>Action absente</td>
      <td>Problème format balise wsa :action</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_130</td>
      <td>ERREUR</td>
      <td>Action invalide</td>
      <td>Structure wsa :action incorrect</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_130</td>
      <td>ERREUR</td>
      <td>Action invalide</td>
      <td>Structure wsa :action incorrect</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_130</td>
      <td>ERREUR</td>
      <td>Action invalide</td>
      <td>Structure wsa :action incorrect</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_50</td>
      <td>Le service demandé n’existe pas. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_140</td>
      <td>ERREUR</td>
      <td>Action inconnue</td>
      <td>L’opération demandée (service :version :operation) n’existe pas dans le référentiel DESIR.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_50</td>
      <td>Le service demandé n’existe pas. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_140</td>
      <td>ERREUR</td>
      <td>Action inconnue</td>
      <td>L’opération demandée (service :version :operation) n’est routée vers aucune opération accédée.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_50</td>
      <td>Le service demandé n’existe pas. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_140</td>
      <td>ERREUR</td>
      <td>Action inconnue</td>
      <td>L’opération accédée (service :version :operation) n’est aucune instance de service.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_50</td>
      <td>Le service demandé n’existe pas. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_140</td>
      <td>ERREUR</td>
      <td>Action inconnue</td>
      <td>Proxy inexistant</td>
    </tr>
</table>

***GIE SESAM-Vitale*** icon: icon **5 / 9**

***Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

<table>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_150</td>
      <td>ERREUR</td>
      <td>MessageID absent</td>
      <td>Balise ws :MessageID incorrecte</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_150</td>
      <td>ERREUR</td>
      <td>MessageID absent</td>
      <td>Balise ws :MessageID incorrecte</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_150</td>
      <td>ERREUR</td>
      <td>MessageID absent</td>
      <td>Balise ws :MessageID incorrecte</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_170</td>
      <td>ERREUR</td>
      <td>Contexte BAM absent</td>
      <td>Le contexte BAM est absent du flux</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_170</td>
      <td>ERREUR</td>
      <td>Contexte BAM absent</td>
      <td>Contexte BAM obligatoire</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_180</td>
      <td>ERREUR</td>
      <td>Contexte BAM invalide (au sens XSD)</td>
      <td>Contexte BAM non conforme XSD</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_190</td>
      <td>ERREUR</td>
      <td>Contexte LPS absent</td>
      <td>SCVI - Contexte LPS absent</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_190</td>
      <td>ERREUR</td>
      <td>Contexte LPS absent</td>
      <td>Contexte LPS absent</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_200</td>
      <td>ERREUR</td>
      <td>Contexte LPS invalide (au sens XSD)</td>
      <td>Contexte LPS non conforme XSD</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_210</td>
      <td>ERREUR</td>
      <td>Assertion PS absente</td>
      <td>L'assertion SAML est absente du flux (InterOps)</td>
    </tr>
</table>

* **GIE SESAM-Vitale** * 
 icon: icon ** *6 / 9* **
* **Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale** *

<!-- Pages source 7-9 -->

<table>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_220</td>
      <td>ERREUR</td>
      <td>Assertion PS invalide (au sens XSD)</td>
      <td>Cas Assertion PS</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_220</td>
      <td>ERREUR</td>
      <td>Données d'authentification invalides</td>
      <td>Cas Pro Santé Connect</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_230</td>
      <td>ERREUR</td>
      <td>Assertion PS insuffisant</td>
      <td>Le format de l'assertion est obligatoire (InterOps)</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_240</td>
      <td>ERREUR</td>
      <td>Assertion VITALE absente</td>
      <td>SCVI - Aucune assertion trouvée</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_240</td>
      <td>ERREUR</td>
      <td>Assertion VITALE absente</td>
      <td>L'assertion vitale est absente du flux</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_240</td>
      <td>ERREUR</td>
      <td>Assertion VITALE absente</td>
      <td>Le numéro de série vitale est absent du flux</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_290</td>
      <td>ERREUR</td>
      <td>L’identifiant PS est absent.</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_40</td>
      <td>ERREUR</td>
      <td>Content-type incorrect</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_50</td>
      <td>ERREUR</td>
      <td>Content-length incorrect</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_30</td>
      <td>Vous ne disposez plus des droits suffisants pour accéder à ce service. Renouvelez votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_500</td>
      <td>ERREUR</td>
      <td>Assertion PS obsolète</td>
      <td></td>
    </tr>
</table>

***GIE SESAM-Vitale*** icon: icon **7 / 9**

*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

<table>
<tr>
<td>Sender</td>
<td>siram_60</td>
<td>La CPS n’est pas reconnue.<br />Renouvelez votre demande. Si le<br />problème persiste, contactez<br />l’éditeur du progiciel ou votre<br />responsable informatique.</td>
<td>desir_510</td>
<td>ERREUR</td>
<td>Signature de l’assertion<br />PS incorrecte</td>
<td></td>
</tr>
</table>

***GIE SESAM-Vitale*** 
icon: icon **8 / 9**
8 / 9
***Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

<table>
    <tr>
      <td>Sender</td>
      <td>siram_30</td>
      <td>Vous ne disposez plus des droits suffisants pour accéder à ce service. Renouvelez votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_520</td>
      <td>ERREUR</td>
      <td>Assertion Vitale ou assertion appli carte Vitale obsolète</td>
      <td>SCVI - L'assertion est obsolète.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_80</td>
      <td>La carte Vitale n'est pas valide.</td>
      <td>desir_530</td>
      <td>ERREUR</td>
      <td>Carte vitale en opposition</td>
      <td>SCVI - La carte Vitale est en opposition</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_90</td>
      <td>La carte Vitale n'est pas reconnue. Renouvelez votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_540</td>
      <td>ERREUR</td>
      <td>Signature de l'assertion Vitale incorrecte</td>
      <td>SCVI - La signature de l'assertion n'est pas valide.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_100</td>
      <td>L’accès par ce progiciel au service n’est pas autorisé. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_550</td>
      <td>ERREUR</td>
      <td>Numéro d'autorisation du logiciel inconnu</td>
      <td>Le numéro d’autorisation du LPS [IDAM] n’est pas autorisé à la date du [date_demande].</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_100</td>
      <td>L’accès par ce progiciel au service n’est pas autorisé. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_553</td>
      <td>ERREUR</td>
      <td>Numéro du logiciel incorrect</td>
      <td>La version du LPS n'est pas connue</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_20</td>
      <td>Vous ne disposez pas des droits suffisants pour accéder à ce service.</td>
      <td>desir_560</td>
      <td>ERREUR</td>
      <td>Niveau d’accès insuffisant</td>
      <td>Les règles métiers {règles} sont réfutées pour le service {service :version :opération}</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_20</td>
      <td>Vous ne disposez pas des droits suffisants pour accéder à ce service.</td>
      <td>desir_560</td>
      <td>ERREUR</td>
      <td>Niveau d’accès insuffisant</td>
      <td>Le client n'est pas autorisé</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_20</td>
      <td>Vous ne disposez pas des droits suffisants pour accéder à ce service.</td>
      <td>desir_560</td>
      <td>ERREUR</td>
      <td>Niveau d’accès insuffisant</td>
      <td>Information PS absente</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_120</td>
      <td>Un problème concernant le certificat numérique de la carte PS a été détecté. Renouvelez votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_590</td>
      <td>ERREUR</td>
      <td>Le certificat de la carte PS est révoqué.</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_120</td>
      <td>Un problème concernant le certificat numérique de la carte PS a été détecté. Renouvelez votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_620</td>
      <td>ERREUR</td>
      <td>Le certificat de la carte PS est erroné.</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_150</td>
      <td>Une erreur de combinaison Identifiant/Mot de passe est survenue. Veuillez réessayer.</td>
      <td>desir_660</td>
      <td>ERREUR</td>
      <td>Identifiant ou mot de passe incorrect.</td>
      <td></td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste contactez l'éditeur du progiciel ou votre responsable informatique.</td>
      <td>smir_20</td>
      <td>ERREUR</td>
      <td>Le flux est non valide</td>
      <td>Le flux n’est pas conforme au WSDL</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_110</td>
      <td>Le service sollicité n’est pas ouvert pour les assurés de ce régime.</td>
      <td>smir_80</td>
      <td>AVERTISSEMENT</td>
      <td>Service non ouvert pour les assurés de ce régime</td>
      <td>Service non ouvert pour les assurés de ce régime</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_100</td>
      <td>L’accès par ce progiciel au service n’est pas autorisé. Contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>desir_551</td>
      <td>ERREUR</td>
      <td>Accès à cette version du service non autorisée.</td>
      <td>Le numéro d’autorisation du LPS n’est pas autorisé pour la version du service.</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>siram_160</td>
      <td>Pour réaliser cette demande il est nécessaire que vous lisiez à nouveau l’appli carte Vitale de votre patient.</td>
      <td>desir_527</td>
      <td>ERREUR</td>
      <td>Session appli carte Vitale expirée ou détruite</td>
      <td></td>
    </tr>
</table>

*GIE SESAM-Vitale* icon: icon **9 / 9**

*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*