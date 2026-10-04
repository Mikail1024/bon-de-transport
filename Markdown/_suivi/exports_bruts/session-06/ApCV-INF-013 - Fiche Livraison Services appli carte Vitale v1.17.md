![icon: sesam-vitale](page_1_image_1_v2.jpg)

# <u>Fiche **d’information . 013**</u>

<table>
    <tr>
      <td><strong>Référence</strong></td>
      <td><strong>ApCV-INF-013</strong></td>
      <td><strong>Date</strong></td>
      <td><strong><u>09.12.2025</u></strong></td>
    </tr>
    <tr>
      <td><strong>Objet</strong></td>
      <td colspan="3"><strong><i>appli carte Vitale®</i> : Services appli carte Vitale v1.0.7f</strong></td>
    </tr>
</table>

<table>
    <tr>
      <td><strong><u>Type</u></strong></td>
      <td>[ ] Technique</td>
      <td>[ ] Pratique</td>
      <td>[ ] Communication</td>
      <td>[x] Livraison</td>
    </tr>
    <tr>
      <td><strong>Destinataires</strong></td>
      <td>[x] Éditeurs</td>
      <td>[x] Équipementiers</td>
      <td>[ ] OCT</td>
      <td>[ ] CIS</td>
    </tr>
    <tr>
      <td rowspan="2"><strong>Produits</strong></td>
      <td>Facturation<br />
        [ ] CDC Éditeurs<br />
        [ ] CDC OCT<br />
        [ ] FSV agrément<br />
        [ ] FSV exploitation<br />
        [ ] SCOR</td>
      <td>Référentiels<br />
        [ ] Dispositif Intégré<br />
        [ ] Terminal lecteur<br />
        [ ] TLA<br />
        [ ] Lecture Vitale<br />
        [ ] Télémise à jour</td>
      <td>Produits d’infrastructure<br />
        [ ] ATSAM<br />
        [ ] SrvSVCNAM<br />
        [ ] GALSS<br />
        Services en Ligne<br />
        [ ] CDR<br />
        [ ] Espace pro<br />
        [ ] Dossier Pharmaceutique</td>
      <td>Téléservices intégrés<br />
        [ ] ADRi<br />
        <br />
        [ ] HRi<br />
        [ ] DMTi<br />
        [ ] AATi<br />
        [ ] IMTi<br />
        [ ] ALDi<br />
        [ ] SEFI</td>
    </tr>
    <tr>
      <td colspan="4">WebServices appli carte Vitale<br />
        [x] Authentifier un utilisateur<br />
        [x] Signer une facture SESAM-Vitale</td>
    </tr>
    <tr>
      <td><strong><u>Secteur</u></strong></td>
      <td>[x] Libéral</td>
      <td>[ ] Hospitalier</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Professionnels de Santé <u>concernés</u></strong></td>
      <td>[x] Médecins<br />
        [x] Sages-femmes<br />
        [x] Chirurgiens-dentistes<br />
        [x] Pharmaciens<br />
        [x] Laboratoires</td>
      <td>[x] Auxiliaires médicaux<br />
        [x] Centres de Santé<br />
        [x] Fournisseurs<br />
        [ ] Transporteurs</td>
      <td>[ ] Établissements publics<br />
        [ ] Cliniques privées<br />
        [ ] ESPIC</td>
      <td></td>
    </tr>
    <tr>
      <td><strong><u>Prise en compte</u></strong></td>
      <td>[ ] Facultative</td>
      <td>[x] Obligatoire</td>
      <td></td>
      <td></td>
    </tr>
</table>

**Contexte**

La facturation SESAM-Vitale est un des 1<sup>iers</sup> services intégrant officiellement l’utilisation de la carte Vitale dématérialisée, appelée « *appli carte Vitale* ».
Cette évolution est portée par le palier Addendum 8 du système de facturation SESAM-Vitale.
Ce palier est constitué :
*   du Cahier des Charges SESAM-Vitale v8.20,
*   du Dispositif Intégré v4.00,
*   des FSV 1.40.14,
*   le TLSi ADRi minimum 1.15.

et s’appuie sur :
*   les WebServices appli carte Vitale : *Demander l’authentification et gérer le contexte ApCV* ainsi que *Demander la signature Vitale de la facture ApCV*,
*   le cadre d’interopérabilité 1.1.4 intégrant l’assertion appli carte Vitale.

**Cette présente Fiche accompagne la nouvelle livraison des Services appli carte Vitale.**

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
~~<u>**www.sesam-vitale.fr**</u>~~ 
 ![icon: twitter](page_1_image_2_v2.jpg)
**Référence : ApCV-INF-013** **Page 1 sur 5**

![icon: sesam-vitale](page_2_image_1_v2.jpg)

# <u>Fiche **d’information . 013**</u> 

![icon: icon](page_2_image_3_v2.jpg)

**Contenu** **de la**
**livraison**

Cette livraison est composée des éléments suivants : 
<table>
  <thead>
    <tr>
      <th>Référence <b>document</b></th>
      <th><b>Objet</b></th>
      <th><b>Version diffusée</b></th>
    </tr>
    <tr>
      <th colspan="3"><i>SPECIFICATIONS RELATIVES A LA SOLUTION LOGICIELLE DU PS</i></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><mark>ApCV-SFG-004</mark></td>
      <td><mark>Demander l’authentification et gérer le contexte ApCV</mark></td>
      <td><mark>V1.5.10</mark><br />
        <mark><i>Le contenu d’un certain nombre de fiches d’information a été injecté dans les SFG : ApCV-<u>INF-023, ApCV-INF-031</u></i></mark><br />
        <mark><i>-> §2.1 Contexte et périmètre du système décrit <u>dans la SFG</u></i></mark><br />
        <mark><i>- Précision sur l’appel au service détruire le <u>contexte ApCV qui doit être</u> <u>fait au bon moment</u></i></mark><br />
        <mark><i><u>- Retrait du point en suspens sur l’INS</u></i></mark><br />
        <mark><i>-> §3.1 : Demander l'authentification de <u>l'utilisateur d'une ApCV</u></i></mark><br />
        <mark><i>Rajout de la RG_ApCVlps_060 Contrôler le QR Code</i></mark><br />
        <mark><i>-> §4 : retrait du § sur l’administration du LPS</i></mark></td>
    </tr>
    <tr>
      <td><mark>ApCV-MP-001</mark></td>
      <td><mark>Guide d’intégration du Webservice</mark><br />
        <mark>« Demander l’authentification et gérer le contexte ApCV »</mark></td>
      <td><mark>V1.8</mark><br />
        <mark><i>Le contenu d’un certain nombre de fiches d’information a été injecté dans les SFG : ApCV-INF-027</i></mark><br />
        <mark><i>-> §3.4.1.2 : Données de sortie du service « Demande de l'authentification de l'utilisateur <u>d'une ApCV »</u></i></mark><br />
        <mark><i><u>Entités</u> <u>fonctionnelles : rajout des cardinalités et</u> <u>dans Identité AMO (EF_ApCVsi01_S06 ) :</u></i></mark><br />
        <mark><i>- informations sur le renseignement de Nom d’usage/Nom de famille/Prénom</i></mark><br />
        <mark><i><u>- enrichissement du descriptif des valeurs de</u> <u>Qualité du bénéficiaire</u></i></mark><br />
        <mark><i>-> §3.4.1.2 : Données de sortie du service <u>« Demande du contexte ApCV »</u></i></mark><br />
        <mark><i><u>Entités</u> <u>fonctionnelles : Idem ci-dessus</u></i></mark><br />
        <mark><i>-> ANNEXE A1-2 Liste des erreurs : messages d’erreur plus explicites envoyés par le SI ApCV au LPS</i></mark></td>
    </tr>
    <tr>
      <td><mark>ApCV-MP-002</mark></td>
      <td><mark>Guide d’intégration du Webservice</mark><br />
        <mark>« Demander la signature Vitale de la facture ApCV »</mark></td>
      <td><mark>V1.6</mark><br />
        <mark><i>-> §3.4.2 : Service « Demande de signature Vitale de la facture ApCV », Requête SignerVitale : L’IdNatPS est obligatoire</i></mark><br />
        <mark><i>-> ANNEXE A1-2 Liste des erreurs : messages d’erreur plus explicites envoyés par le SI ApCV au LPS</i></mark></td>
    </tr>
    <tr>
      <td>ApCV-NT-001</td>
      <td>Spécifications des échanges de proximité avec l’appli mobile « Vitale » (lecteur NFC et QRCode)</td>
      <td><i>Cf. [https://industriels.sesam-vitale.fr/group/equipements-lecture](https://industriels.sesam-vitale.fr/group/equipements-lecture)</i><br />
        V1.6 avec §5.4 et §5.5 :<br />
        <i>-> recommandation de configurer les lecteurs en mode USB COM</i></td>
    </tr>
  </tbody>
</table>

**GIE SESAM-Vitale** **5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**~~<u>**www.sesam-vitale.fr**</u>~~ ![icon: icon](page_2_image_2_v2.jpg)

**Référence : ApCV-INF-013** **Page 2 sur 5**

![icon: sesam-vitale](page_3_image_1_v2.jpg)

# Fiche **d’information . 013**

<table>
    <tr>
      <td></td>
      <td></td>
      <td><i>-> ex de code JAVA pour la lecture d’une appli carte Vitale sur le port COM<br />NB : Le cahier du tests du CNDA a évolué en conséquence.</i></td>
    </tr>
    <tr>
      <td>WSDL, XML, XSD et Exemples</td>
      <td>Relatifs au Webservices<br />« Demander l’authentification et gérer le contexte ApCV »<br />et « Demander la signature Vitale de la facture ApCV »</td>
      <td>V05.2021</td>
    </tr>
    <tr>
      <td><mark><s>ApCV-INF-023</s></mark></td>
      <td><mark><s>Encodage base 45 v5 et format QRCode</s></mark></td>
      <td><mark><i><s>V5</s></i></mark><br /><br /><mark><i><s>-> Le LPS contrôle que le format du QRCode lu est bien celui d’une carte Vitale et affiche un message au PS si cela n’est pas le cas.</s></i></mark><br /><mark><i><s>NB : Le cahier du tests du CNDA a évolué en conséquence.</s></i></mark><br /><br /><mark><i>Le contenu de cette FI a été ajouté dans les spécifications.</i></mark></td>
    </tr>
    <tr>
      <td>ApCV-INF-026</td>
      <td>Gestion des noms apparaissant dans le résumé de facture sur l’appli carte Vitale</td>
      <td>V1</td>
    </tr>
    <tr>
      <td><mark><s>ApCV-INF-027</s></mark></td>
      <td><mark><s>Gestion des applis carte Vitale sans ayant-droit</s></mark></td>
      <td><mark><i><s>V1</s></i></mark><br /><mark><i>Le contenu de cette FI a été ajouté dans les spécifications.</i></mark></td>
    </tr>
    <tr>
      <td>ApCV-INF-028</td>
      <td>Mise à jour des CIPHERS</td>
      <td>V1</td>
    </tr>
    <tr>
      <td><mark><s>ApCV-INF-029</s></mark></td>
      <td><mark><s>INS pour tous</s></mark></td>
      <td><mark><i><s>V1</s></i></mark><br /><mark><i>Remplacé par PDT-INF-905 Qualification automatique de l’INS provenant de l’appli carte Vitale</i></mark></td>
    </tr>
    <tr>
      <td><mark><s>ApCV-INF-031</s></mark></td>
      <td><mark><s>Utilisation de détruire contexte appli carte Vitale</s></mark></td>
      <td><mark><i><s>V1</s></i></mark><br /><mark><i>Le contenu de cette FI a été ajouté dans les spécifications.</i></mark></td>
    </tr>
    <tr>
      <td>ApCV-INF-034</td>
      <td>Gestion des noms et prénoms lus de l’appli carte Vitale pour accéder à la base patient</td>
      <td><mark>V2</mark></td>
    </tr>
    <tr>
      <td>ApCV-INF-038</td>
      <td>ApCV-INF-038 Utilisation de l'opération Restituer Contexte ApCV</td>
      <td>V1</td>
    </tr>
</table>

Le cadre d’interopérabilité des TLSi AMO est applicable [CI_TLSi_AMO v1.1.4].

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**[www.sesam-vitale.fr](http://www.sesam-vitale.fr)**</u> ![icon: twitter](page_3_image_2_v2.jpg)

**Référence : ApCV-INF-013**
**Page 3 sur 5**

![icon: sesam-vitale](page_4_image_1_v2.jpg)


# <u>Fiche **d’information . 013**</u>

**Autorisation CNDA**
L’intégration d’un ou des méta-services « appli carte Vitale » est soumise à la procédure d’autorisation de la Commission de Validation et d’Homologation.

L’autorisation sur le profil appli carte Vitale « *Authentification* » peut être obtenue seule pour l’ensemble des TLSi AMO (hors ADRi) uniquement offerts par le LPS.

L’autorisation sur le profil appli carte Vitale « *Authentification et Signature* » peut être obtenue dans le cadre de l’agrément Addendum 8 ou de l’Homologation Référentiel Dispositif Intégré v4.0.

Les cahiers de tests sont disponibles dans votre espace personnel sur le site du CNDA.

**Historique des livraisons**

<table>
  <thead>
    <tr>
      <th><b>Version</b> du package</th>
      <th><b>Descriptif et objectif du package</b></th>
      <th><b>Date</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><mark>V1.0.7f</mark></td>
      <td><mark>Diverses modifications dans les spécifications ApCV-SFG-004, ApCV-MP-001 et 002 (messages d’erreur affichés sur le LPS plus explicites, intégration dans les specs de certaines Fiches d’Informations ApCV-INF-023, 027 et 031…)</mark></td>
      <td><mark>09/12/2025</mark></td>
    </tr>
    <tr>
      <td>V1.0.7e</td>
      <td>Suppression de la fonctionnalité qui permet d’activer ou pas la lecture de l’appli carte Vitale dans le LPS en fonction des départements ouverts au déploiement assuré de l’appli</td>
      <td>05/07/2024</td>
    </tr>
    <tr>
      <td>V1.0.7d</td>
      <td>Nouvelles versions de ApCV-SFG-004 (Demander l’authentification et gérer le contexte ApCV) et ApCV-INF-023 (ApCV-INF-023 Encodage base 45 et format QRCode) avec contrôle supplémentaire effectué par le LPS<br /><br />+ nouvelles FI : ApCV-INF-034 (Gestion des noms et prénoms pour accéder à la base patient), ApCV-INF-038 (Utilisation de l'opération Restituer Contexte ApCV)</td>
      <td>16/04/2024</td>
    </tr>
    <tr>
      <td>V1.0.7c</td>
      <td>Rajout des 2 FI ApCV-INF-029 (INS pour tous), 031 (Détruire contexte). Modifications dans les spécifications ApCV-SFG-004, ApCV-MP-001 et 002</td>
      <td>05/09/23</td>
    </tr>
    <tr>
      <td>V1.0.7b</td>
      <td>Rajout de 3 FI suite à la présérie : ApCV-FI-026, 027 et 028</td>
      <td>29/03/23</td>
    </tr>
    <tr>
      <td>V1.0.7</td>
      <td>Divers ajouts dans ApCV-MP-001</td>
      <td>28/10/22</td>
    </tr>
    <tr>
      <td>V1.0.6</td>
      <td>Evolution de la spécification des échanges de proximité avec l’appli carte Vitale et FI associée : ajout d’un tag en début de QRCode : ApCV-NT-001 v1.11</td>
      <td>07/10/22</td>
    </tr>
    <tr>
      <td>V1.0.5</td>
      <td>Diverses corrections et évolutions (caractères diacritiques) :<br />• ApCV-SFG-004 v1.2<br />• ApCV-MP-001 v1.5<br />• ApCV-MP-002 v1.4<br />• ApCV-NT-001 v1.4</td>
      <td>04/11/21</td>
    </tr>
    <tr>
      <td>V1.0.4</td>
      <td>Retour en arrière sur les fichiers WSDL, XML, XSD et Exemples (mêmes fichiers que lors de la livraison initiale du 15/10/2020)</td>
      <td>03/05/2021</td>
    </tr>
    <tr>
      <td>V1.0.3</td>
      <td>Diverses évolutions :<br />• ApCV-SFG-004 v1.1<br />• ApCV-MP-001 v1.3<br />• ApCV-MP-002 v1.3</td>
      <td>15/04/2021</td>
    </tr>
  </tbody>
</table>

<hr>
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**~~www.sesam-vitale.fr~~** ![icon: twitter](page_4_image_2_v2.jpg)


**Référence : ApCV-INF-013** **Page 4 sur 5**

![logo: sesam-vitale](page_5_image_1_v2.jpg)


# Fiche **d’information . 013**

<table>
    <tr>
      <td></td>
      <td>• WSDL, XML, XSD et Exemples v04.2021</td>
      <td></td>
    </tr>
    <tr>
      <td>V1.0.2</td>
      <td>Correction des spécifications des échanges de proximité : trame AID pour le NFC : ApCV-NT-001 v1.2</td>
      <td>08/12/2020</td>
    </tr>
    <tr>
      <td>V1.0.1</td>
      <td>Correction des spécifications des échanges de proximité : ApCV-NT-001 v1.1</td>
      <td>24/11/2020</td>
    </tr>
    <tr>
      <td><strong>V1.0</strong>.0</td>
      <td>Livraison initiale</td>
      <td>15/10/2020</td>
    </tr>
</table>

**Des questions**
**sur le package**
**livré ?**
e-mail : [centre-de-service@sesam-vitale.fr](mailto:centre-de-service@sesam-vitale.fr)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
~~**www.sesam-vitale.fr**~~ ![icon: twitter](page_5_image_2_v2.jpg)

**Référence : ApCV-INF-013**
**Page 5 sur 5**