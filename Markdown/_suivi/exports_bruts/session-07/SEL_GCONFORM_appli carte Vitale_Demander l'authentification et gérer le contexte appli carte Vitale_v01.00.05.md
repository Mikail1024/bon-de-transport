**Service en Ligne/Service PS**

**GUIDE DE TESTS DE CONFORMITE**

![logo: CNDA](page_1_image_2_v2.jpg)

# **Service appli carte Vitale**
# **intégré aux LPS**

## **Demander l'authentification et**
## **gérer le contexte appli carte**
## **Vitale**

### **Guide de tests de**
### **conformité**

![logo: Vitale](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td>01.00.05</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>22/01/2026</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td>SEL_GCONFORM_appli carte<br /><i>Vitale_Integre_aux_LPS_Demander</i><br /><i>l'authentification et gérer le contexte appli</i><br />carte Vitale</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th>DATE</th>
      <th>VERSION<br /><b>Guide de</b><br />tests</th>
      <th><b>EVOLUTION DU DOCUMENT</b></th>
      <th><b>REDACTEUR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>16/10/2020</td>
      <td>01.00.00</td>
      <td>Création du document.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/03/2023</td>
      <td>01.00.01</td>
      <td>Test 1.01 : Modification de l’ApCV utilisée dans le test.<br /><br />Test 2.01 : Correction des prénoms des bénéficiaires<br />dans la partie « A vérifier ».</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>03/07/2023</td>
      <td>01.00.02</td>
      <td>Test 0.01 : Suppression du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>17/04/2024</td>
      <td>01.00.03</td>
      <td>Test 2.01 : Ajout de contrôles.<br /><br />Test 3.01 : Ajout d’une vérification.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>07/08/2024</td>
      <td>01.00.04</td>
      <td>Test 1.02 : Suppression du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>22/01/2026</mark></td>
      <td><mark>01.00.05</mark></td>
      <td><mark>Test 2.01 : Suppression d’un cas de tests.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>CAS DE TESTS........................................................................................................................................................</strong></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>1 CONTROLES ET ACCES AU SERVICE...........................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 – ASSERTION PS .........................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.03 AFFICHAGE ET GESTION DES ERREURS SOAP 1 ..........................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.04 AFFICHAGE ET GESTION DES ERREURS SOAP 2 ..........................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 CONTROLER LA COMPATIBILITE ENTRE LA CARTE PS ET L’APPLI CARTE VITALE .......................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td></td>
      <td>2 DEMANDE DE L'AUTHENTIFICATION DE L'UTILISATEUR D'UNE APPLI CARTE VITALE ................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.01 AUTHENTIFICATION ET ACQUISITION DU CONTEXTE APPLI CARTE VITALE .................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>3 DEMANDER UN CONTEXTE APPLI CARTE VITALE....................................................................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 3.01 DEMANDE D’UN CONTEXTE APPLI CARTE VITALE ....................................................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td></td>
      <td>4 DEMANDER LA DESTRUCTION DU CONTEXTE APPLI CARTE VITALE ........................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 4.01 – DESTRUCTION DU CONTEXTE APPLI CARTE VITALE ...............................................................................</td>
      <td>11</td>
    </tr>
</table>

# 1 Cas de Tests

## 1 Contrôles et accès au service

### **Test 1.01 – Assertion PS**

<table>
    <tr>
      <td colspan="2"><u>Références au guide d’intégration :</u></td>
      <td colspan="2">Cadre d’interopérabilité § 3.2.2 « Assertion PS »<br /><u>ApCV-MP-001 - GI Demander l'authentification et</u><br />gérer le contexte appli carte Vitale. Niveaux de<br />contrôle des assertions<br /><br />ApCV-INF-027 Gestion des applis carte Vitale<br />sans ayant-droit</td>
    </tr>
    <tr>
      <td><u>Etat du test :</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Support Appli carte<br />vitale :</u></td>
      <td><strong><u>ADRUN SOLO</u></strong></td>
    </tr>
</table>

<u>Description détaillée du test</u> :

**Cas 1** : Lancer une requête pour l’opération « authentifierUtilisateurProximite », attendre une heure et relancer une requête.

**Cas 2** : Lancer une requête pour l’opération « authentifierUtilisateurProximite »,, retirer la CPS du lecteur et relancer une requête.

<u>A vérifier</u> :

Avant tout lancement de requête, le logiciel doit vérifier que l’assertion PS n’est pas obsolète et/ou que la CPS est présente dans le lecteur.

**Cas 1** : L’assertion étant obsolète, le logiciel doit automatiquement en générer une nouvelle (niveau de contrôle de l’assertion PS de type « 2 »).

**Cas 2** : Le logiciel ayant détecté l’absence de CPS, le logiciel ne doit pas permettre de lancer la requête. Dans ce cas, le LPS doit :
- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la CPS.

La gestion de l’assertion PS est identique pour les opérations « restituerContexteApCV » et « detruireContexteApCV ».

<u>Résultat à fournir</u> :

Fournir les traces des requêtes et réponses SOAP pour le cas 1.

Décrire la cinématique mise en œuvre pour les cas 1 et 2.

Présenter les éléments mettant en évidence que la gestion de l’assertion PS est identique pour les opérations restituerContexteApCV et detruireContexteApCV.

# **Test 1.03 Affichage et gestion des erreurs SOAP 1**

<table>
    <tr>
      <td colspan="2">
        <strong><u><i>Références au guide d’intégration</i></u> :</strong>
      </td>
      <td colspan="2">
        appli carte Vitale -MP-001 - GI Demander l'authentification et gérer le contexte appli carte Vitale. Annexe 1 Liste des erreurs
      </td>
    </tr>
    <tr>
      <td>
        <strong><u><i>Etat du test :</i></u></strong>
      </td>
      <td>
        <strong>**Actif**</strong>
      </td>
      <td>
        <u>Support Appli carte vitale :</u>
      </td>
      <td>
        <strong>CLE-OTP-**INVALIDE Clé** Otpinvalide</strong>
      </td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

Appeler le service pour le bénéficiaire Clé Otpinvalide

## **<u>*A vérifier*</u> :**

Vérifier que le logiciel affiche l’erreur obtenue sans traitement (err_61 : « L'authentification de l'appli carte Vitale a échoué. Veuillez recommencer. apcv_601 : « OTP invalide »).

Le logiciel doit permettre d’afficher la balise détail notamment à des fins de support.

Suite à l’affichage du message d’erreur, le logiciel doit permettre de faire une nouvelle authentification avec l’appli carte Vitale ou de retourner à un processus nominal hors appli carte Vitale (sur la base d’un autre support).

## **<u>*Résultat à fournir*</u> :**

Fournir la requête et réponse SOAP.

Fournir une copie d’écran de l’affichage de l’erreur dans l’interface du logiciel ainsi que la possibilité d’accéder à la balise détail

Fournir les éléments mettant en évidence que suite à l’affichage du message d’erreur, le logiciel doit permettre de faire une nouvelle authentification avec l' appli carte Vitale ou de retourner à un processus nominal hors appli carte Vitale (sur la base d’un autre support).

# **Test 1.04 Affichage et gestion des erreurs SOAP 2**

<table>
    <tr>
      <td colspan="2">
        <strong><u>Références au guide d’intégration</u> :</strong>
      </td>
      <td colspan="2">appli carte Vitale -MP-001 - GI Demander l'authentification et gérer le contexte appli carte Vitale. Annexe 1 Liste des erreurs</td>
    </tr>
    <tr>
      <td>
        <strong><u>Etat du test :</u></strong>
      </td>
      <td>
        <strong>**Actif**</strong>
      </td>
      <td>
        <strong><u>Support Appli carte vitale :</u></strong>
      </td>
      <td>
        <strong>Num-serie-invalide</strong>
      </td>
    </tr>
</table>

### <u>**Description détaillée du test**</u> :

Lancer une requête pour l’opération authentifierUtilisateurProximite avec l’appli carte Vitale : **Num-serie-invalide**

**<u>Pour les éditeurs implémentant la fonction de signature , réaliser ce test en relation avec le test 1.03 du guide de tests « Service appli carte Vitale intégré aux LPS - Demander la signature Vitale de la facture appli carte Vitale»</u>**

### <u>**A vérifier**</u> :

Vérifier que le logiciel affiche l’erreur obtenue sans traitement (err_52 « ApCV inconnue (n° série inconnu) »/apcv_503/ « L'appli carte Vitale n'est pas valide.»).

Le logiciel doit permettre d’afficher la balise détail notamment à des fins de support.

### <u>**Résultat à fournir**</u> :

Fournir la requête et réponse SOAP.

Fournir une copie d’écran de l’affichage de l’erreur dans l’interface du logiciel ainsi que la possibilité d’accéder à la balise détail

# <u>**Test 1.05 Contrôler la compatibilité entre la carte PS et l’appli carte</u> Vitale**

<table>
    <tr>
      <td colspan="2">
        <strong><em><u>Références au guide d’intégration</u></em> :</strong>
      </td>
      <td colspan="2">
        l’appli carte Vitale -MP-001 - GI Demander l'authentification et gérer le contexte l’appli carte Vitale. EF_ApCVsi01_S03.2
      </td>
    </tr>
    <tr>
      <td>
        <strong><em><u>Etat du test :</u></em></strong>
      </td>
      <td>
        <strong>**Actif**</strong>
      </td>
      <td>
        <u>Support Appli carte vitale :</u>
      </td>
      <td></td>
    </tr>
</table>

### **_<u>Description détaillée du test</u> :_**

Le LPS doit contrôler la compatibilité entre la carte PS et l’appli carte Vitale.

### **_<u>A vérifier</u> :_**

Pour des raisons de sécurité, seuls les couples de cartes suivants sont autorisés :
- Carte PS de Test et (appli carte Vitale de Test ou de Démonstration)
- Carte PS Réelle et (appli carte Vitale Réelle ou de Démonstration).

En cas d’incompatibilité entre le type de carte CPx et appli carte Vitale un message doit être affiché au PS

### **_<u>Résultat à fournir</u> :_**

Présenter les éléments mettant en évidence que la LPS effectue bien ce contrôle de compatibilité

Présenter l’affichage du message en cas d’incompatibilité entre la CPx et l’appli carte Vitale.

# **2 Demande de l'authentification de l'utilisateur d'une appli carte Vitale**

## <u>**Test 2.01 Authentification et acquisition du contexte appli carte</u> Vitale**

<table>
    <tr>
      <td colspan="2">
        <strong><u><em>Références au guide d’intégration</em></u> :</strong>
      </td>
      <td colspan="2">
        Appli carte Vitale-SFG-004 §2,.3.1 Cadrage fonctionnel §3.1 (AUT) Demander l'authentification de l'utilisateur d'une appli carte Vitale RG_ApCVlps_010/ RG_ApCVlps_020/ RG_ApCVlps_030/ RG_ApCVlps_050/ RG_ApCVlps_060<br />
        ApCV-NT-001-Echanges de proximité §5.4 et 5.5
      </td>
    </tr>
    <tr>
      <td>
        <strong><u><em>Etat du test :</em></u></strong>
      </td>
      <td>
        <strong>**Actif**</strong>
      </td>
      <td>
        <u>Support Appli carte vitale :</u>
      </td>
      <td>
        <strong>**Cas 1 : 9-BENEFICIAIRES**</strong><br />
        <strong>UN, DEUX, <mark><s>TROIS</s></mark></strong><br />
        <strong>**Cas 2 : ADRCINQ Isidore**</strong><br />
        <strong>**Cas 3 : Voir ci-dessous**</strong><br />
        <strong>**Cas 4 : ADRUN-B Baptiste**</strong><br />
        <strong>**Cas 5 : ADRUN-B Baptiste**</strong>
      </td>
    </tr>
</table>

### ***<u>Description détaillée du test</u> :***

Lancer une requête pour l’opération authentifierUtilisateurProximite pour le cas 1 et le cas 2.

Cas 1 : acquisition des informations de l’appli carte Vitale en mode d’échange QR Code
Cas 2 : acquisition des informations de l’appli carte Vitale en mode d’échange NFC
Cas 3 : contrôle du format du QR code. Lire le QR code ci-dessous.

![code: QR code for test case 3](page_8_image_1_v2.jpg)

Cas 4 : Configuration du lecteur de QR code en mode USB COM, et acquérir les informations de l’appli carte vitale.

Cas 5 : Configuration du lecteur de QR code en mode HID clavier : Verrouiller la majuscule du clavier (caps lock) et acquérir les informations de l’appli carte vitale.

Sur le logiciel, acquérir les informations d’identifications du PS et lancer une requête pour le bénéficiaire sélectionné sur l’appli carte Vitale.

## <u>***A vérifier :***</u>

- Le LPS doit intégrer obligatoirement les deux modes d’échanges décrits dans le document « Spécifications des échanges de proximité avec l'application mobile "Vitale" » (ApCV-NT-001) : QR Code et NFC.
- Le LPS a correctement acquis et renseigné dans la requête les données du PS : N° de facturation du PS, Identifiant national et code spécialité AMO.
- Le LPS a correctement acquis et renseigné dans la requête les données du LPS : la balise /Envelope/Header/ContexteLPS/LPS/Nom est renseignée avec « urn :lps : <nom commercial>:<version commerciale> ».
- Le LPS acquiert les données en sortie du service (dont la durée de validité du contexte permet dans ce laps de temps d’accéder aux téléservices AMO ou de demander une signature dans le cadre de la facturation SESAM vitale) et les enregistre.
- Le progiciel affiche le contenu de chaque support appli carte Vitale en respectant l’ordre de restitution du SI appli carte Vitale.

*   Bénéficiaire « UN » : seule la balise < NomFamille> est renseignée : le LPS affiche le nom « FAMILLE » (pas de <NomUsage> renseigné).
*   Bénéficiaire « DEUX » : les deux balises <NomUsage> et < NomFamille> sont renseignées : le LPS affiche le nom « USAGE » comme nom d’usage et « FAMILLE » comme nom de famille
*   <mark>~~Bénéficiaire « TROIS » : aucune balise <NomUsage> /< NomFamille> n’est restituée, seul le prénom est affiché.~~</mark>

Cas 3 : Le LPS vérifie le format du QR code, à savoir la chaine de caractères lue doit commencer par « PB83N8 ». Le QR code lu ne correspondant pas à celui d’une appli carte Vitale, le logiciel affiche le message suivant : « Le QR Code lu ne correspond pas à celui d’une application carte Vitale ou son dispositif de lecture est mal paramétré ».

Cas 4 : Le logiciel doit être en mesure d’acquérir les données du QR code via le port COM et demander l’authentification de l’appli carte Vitale avec succès.

Cas 5 : Lorsque les données du QR code sont acquises en mode HID clavier, le lecteur doit être paramétré en clavier Français pour s’affranchir du problème de verrouillage Majuscule du clavier. L’authentification de l’appli carte Vitale doit être réalisée avec succès lorsque cette touche est verrouillée.

## <u>***Résultat à fournir :***</u>

Présenter les éléments mettant en évidence que les modes d’échanges QR Code et NFC sont bien gérés.

Fournir les traces des requêtes et réponses SOAP.

Fournir une copie écran montrant dans l’interface l’affichage des données restituées par le service (pour les trois bénéficiaires de l’appli carte Vitale 9-BENEFICIAIRES.

Cas 3, 4 et 5 : Présenter les éléments mettant en évidence que le contrôle du contenu du QR code ainsi que les paramétrages du lecteur de QR code sont bien mis en œuvre.

# **3 Demander un contexte appli carte Vitale**

## **Test 3.01 Demande d’un contexte appli carte Vitale**

<table>
    <tr>
      <td colspan="2">
        <strong><em><u>Références au guide d’intégration</u> :</em></strong>
      </td>
      <td colspan="2">
        appli carte Vitale -SFG-004 - Editeurs - Demander l'authentification et gérer le contexte ApCV<br />
        RG_ApCVps_100 RG_ApCVps_110<br />
        RG_ApCVps_120<br />
        ApCV-MP-001 - GI Demander l'authentification et gérer le contexte appli carte Vitale §3.5 3.5<br />
        WS_ApCV0
      </td>
    </tr>
    <tr>
      <td>
        <strong><em><u>Etat du test :</u></em></strong>
      </td>
      <td>
        <strong>**Actif**</strong>
      </td>
      <td>
        <u>Support Appli carte vitale :</u>
      </td>
      <td>
        <strong>**ADRQUATRE Adrien**</strong>
      </td>
    </tr>
</table>

### **_<u>Description détaillée du test</u> :_**

Lancer une requête pour l’opération authentifierUtilisateurProximite.

Une fois le contexte appli carte Vitale obtenu, le PS effectue une demande de contexte appli carte Vitale (avec un contexte appli carte Vitale obtenu étant toujours valide) via l’opération restituerContexteApCV (scénario d’une perte sur le poste du contexte précédemment obtenu en raison d’un dysfonctionnement technique ou finalisation sur un autre poste d’un accès à un téléservice AMO ou d’une demande de signature pour la facturation SESAM vitale).

### **_<u>A vérifier</u> :_**

- Le LPS a correctement acquis et renseigné dans la requête les données du LPS : la balise /Envelope/Header/ContexteLPS/LPS/Nom est renseignée avec « urn :lps : <nom commercial>:<version commerciale> ».
- Le LPS permet au PS de demander le contexte appli carte Vitale (obtenu précédemment via l’opération authentifierUtilisateurProximite).
- Le LPS acquiert les données en sortie du service et les enregistre.
- Le progiciel affiche le contenu de chaque support appli carte Vitale en respectant l’ordre de restitution du SI appli carte Vitale.
- L’opération restituerContexteApCV ne peut être appelée que si un contexte ApCV a déjà été obtenu et est toujours en cours de validité.

### **_<u>Résultat à fournir</u> :_**

Présenter les éléments mettant en évidence que le LPS permet au PS de demander un contexte ApCV.

Présenter les éléments mettant en évidence que l’opération restituerContexteApCV ne peut être appelée que si un contexte ApCV a déjà été obtenu et est toujours en cours de validité.

Fournir les traces des requêtes et réponses SOAP.

Fournir une copie écran montrant dans l’interface l’affichage des données restituées par le service.

# **4 Demander la destruction du contexte appli carte Vitale**

## **Test 4.01 – Destruction du contexte appli carte Vitale**

<table>
    <tr>
      <td colspan="2"><strong><em><u>Références au guide d’intégration</u> :</em></strong></td>
      <td colspan="2">appli carte Vitale -SFG-004 - Editeurs - Demander l'authentification et gérer le contexte appli carte Vitale<br />RG_ApCVps_200 RG_ApCVps_210<br /><br />appli carte Vitale -MP-001 - GI Demander l'authentification et gérer le contexte appli carte Vitale §3.6 3.6<br />WS_ApCV03</td>
    </tr>
    <tr>
      <td><strong><em><u>Etat du test :</u></em></strong></td>
      <td><strong>Actif</strong></td>
      <td><u>Support Appli carte vitale :</u></td>
      <td><strong><b>ADRCINQ Bruno</b></strong></td>
    </tr>
</table>

**<u>*Description détaillée du test*</u> :**

Lancer une requête pour l’opération authentifierUtilisateurProximite.

- Une fois le contexte appli carte Vitale obtenu, changer de support et acquérir les données du patient à partir d’une carte vitale. Le LPS appelle l’opération detruireContexteApCV.

**<u>*A vérifier*</u> :**

- Le LPS a correctement acquis et renseigné dans la requête les données du LPS : la balise /Envelope/Header/ContexteLPS/LPS/Nom est renseignée avec « urn :lps : <nom commercial>:<version commerciale> ».

Au changement de support (carte vitale), le LPS doit demander la destruction du contexte appli carte Vitale acquis.

Le LPS doit afficher le retour du service dans son interface, l’accès aux télé-services AMO ou la facturation SESAM vitale est possible sur la base du support (quel que soit le retour du service).

**<u>*Résultat à fournir*</u> :**

Fournir les traces des requêtes et réponses SOAP

Fournir une copie écran de la réponse du service dans l’interface du LPS.

Veuillez indiquer quels sont les éléments déclencheur d’une demande par le LPS de destruction du contexte (changement de patient, fermeture du poste, …).