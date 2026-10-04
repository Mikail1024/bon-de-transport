*SEL-GCONFORM-FTE* Version 0.63

![logo: CNDA](page_1_image_2_v2.jpg)

# **Service en Ligne/Service TR**
## **GUIDE DE TESTS DE CONFORMITE**

# **Service Facturation Transporteur Etendue**
## **intégré aux LPS**

# **Récupérer les données de la FEL**
## **Guide de tests de conformité**

![logo: SEFI](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td><mark>0.63</mark></td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td><mark>27/05/2019</mark></td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
    </tr>
</table>

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 1/10

*SEL-GCONFORM-FTE* Version 0.63

<table>
  <thead>
    <tr>
      <th colspan="4"><b><b>HISTORIQUE DES VERSIONS</b></b></th>
    </tr>
    <tr>
      <th><b>DATE</b></th>
      <th><b>VERSION</b></th>
      <th><b><b>EVOLUTION DU DOCUMENT</b></b></th>
      <th><b><b>REDACTEUR</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>27/03/2013</td>
      <td>0.41</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>21/06/2013</td>
      <td>0.50</td>
      <td>Ajout du tableau des cas à réaliser pour l’étape 1 de la FEL<br />V2 lot2.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>19/03/2014</td>
      <td>0.60</td>
      <td>Modification du tableau des cas à réaliser pour<br />l’expérimentation.<br /><br />Test 1.06 : Ajout d’un cas à réaliser dans le test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/09/2014</td>
      <td>0.61</td>
      <td>Suppression du tableau des cas à réaliser dans le cadre de<br />l’expérimentation</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>25/11/2016</td>
      <td>0.62</td>
      <td>Suppression du test 1.03</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>27/05/2019</mark></td>
      <td><mark>0.63</mark></td>
      <td><mark>Prise en compte des transporteurs taxis</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 2/10

*SEL-GCONFORM-FTE* Version 0.63

<table>
  <caption>**TABLE DES MATIERES**</caption>
    <tr>
      <td><b>1</b></td>
      <td><b>INTRODUCTION....................................................................................................................................................</b></td>
      <td><b>4</b></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1    PRE REQUIS.........................................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>RECUPERER LES DONNEES DE LA FEL.........................................................................................................</b></td>
      <td><b>5</b></td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 – CONTROLE ASSERTION PS.......................................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.02 – NIVEAU DE SECURITE DE L’ASSERTION PS...............................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.04 – CONSULTATION FEL HORS FACTURATION ...............................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 – AFFICHAGE DE LA FEL CONSULTEE.........................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.06 – AFFICHAGE DES ERREURS SOAP .............................................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.07 – COHERENCE DONNEES EN-TETE CORPS REQUETE SOAP ........................................................................</td>
      <td>10</td>
    </tr>
</table>

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 3/10

*SEL-GCONFORM-FTE* Version 0.63

# 1 Introduction

## 1.1 Pré requis

- **S'il n'y a pas de précisions dans le descriptif du test le contexte opérationnel d'utilisation du service est « Facturation et Hors Facturation ».**

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 4/10

*SEL-GCONFORM-FTE*
Version 0.63

# 2 Récupérer les données de la FEL

## Test 1.01 – Contrôle Assertion PS

<table>
    <tr>
      <th colspan="2"><u><i><b>Référence documentaire :</b></i></u></th>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <th><u><i><b>Etat du test :</b></i></u></th>
      <td>Actif</td>
      <th><u><i><b>Données d’entrée :</b></i></u></th>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.

Lancer la requête « récupérer les données de la FEL »

Une heure plus tard, relancer une nouvelle requête.

### <u>*A vérifier*</u> :

**Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.**

**Cette opération doit être transparente pour le transporteur.**

### <u>*Résultat à fournir*</u> :

**Décrire la cinématique mise en œuvre.**

27/05/2019
Guide de tests de conformité : Récupérer les données de la FEL
5/10

*SEL-GCONFORM-FTE* | Version 0.63

# Test 1.02 – Niveau de sécurité de l’assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u></strong> :</td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u></strong> :</td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u></strong> :</td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Suite du test précédent :

**Lancer la requête « récupérer les données de la FEL ».**

**Cas 1 :**

**Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête**

**Cas 2 :**

**<u>Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.</u>**

### <u>*A vérifier*</u> :

**Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :**

- **Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,**
- **Demander la saisie du code porteur de la carte CPE/CDE,**
- **Recalculer une nouvelle assertion le cas échéant.**

**Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h**

**Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion**

**Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.**

### <u>*Résultat à fournir*</u> :

**Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associé à ce test.**


6/10

<table>
    <tr>
      <td>27/05/2019</td>
      <td>Guide de tests de conformité : Récupérer les données de la FEL</td>
      <td>6/10</td>
    </tr>
</table>

*SEL-GCONFORM-FTE* Version 0.63

# Test 1.04 – Consultation FEL hors facturation

<table>
    <tr>
      <th colspan="2"><u><em><strong>Référence documentaire :</strong></em></u></th>
      <td colspan="2"><strong>SEL-MP-015 WS_FT §2.1 WS_FT1 : Consulter une FEL et §3.4 Opération WS_FT1 « consulter »</strong></td>
    </tr>
    <tr>
      <th><u><em><strong>Etat du test :</strong></em></u></th>
      <td><strong>Actif</strong></td>
      <th><u><em><strong>Données d’entrée :</strong></em></u></th>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

**Dans un contexte « hors facturation » essayer de lancer une requête d’accès au service « récupérer les données de la FEL ».**

.

### <u>*A vérifier*</u> :

**Le LPS doit récupérer les données de la FEL.**

### <u>*Résultat à fournir*</u> :

**Fournir les traces XML de la requête.**

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 7/10

*SEL-GCONFORM-FTE* Version 0.63

# Test 1.05 – Affichage de la FEL consultée

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">SEL-MP-015 WS_FT §2.1 WS_FT1 : Consulter une<br />FEL et §3.4 Opération WS_FT1 « consulter »</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Suite du test précédent

Récupérer la réponse de l’appel du service « récupérer les données de la FEL ».

## *<u>A vérifier</u> :*

Le LPS doit récupérer et afficher correctement les données de la FEL.

## *<u>Résultat à fournir</u> :*

Décrire la cinématique de la réception et de l’affichage des données de la FEL.

Fournir la copie d’écran des données de la FEL.

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 8/10

*SEL-GCONFORM-FTE* Version 0.63

# Test 1.06 – Affichage des erreurs SOAP

<table>
    <tr>
      <td colspan="2"><u><i><b>Référence documentaire :</b></i></u></td>
      <td colspan="2">SEL-MP-015 WS_FT §2.1 WS_FT1 : Consulter une<br />FEL et §3.4 Opération WS_FT1 « consulter »</td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test :</b></i></u></td>
      <td>Actif</td>
      <td><u><i><b>Données d’entrée :</b></i></u></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Dans un contexte « hors facturation » le LPS doit récupérer l’ensemble des données d’une facture en ligne.

Cas 1 : Saisir ou sélectionner un numéro de facture à rechercher dans le référentiel de la base des factures.

Cas 2 : Saisir un N° correspondant à une facture n’ayant pas obtenu un retour positif du service « valider ».

## <u>*A vérifier*</u> :

Cas 1 :Le LPS doit bien récupérer et restituer l’ensemble des données d’une facture en ligne, et doit également restituer les cas d’erreurs prévus.

Cas 2 : Le service restitue dans ce cas-là l’erreur : « ERR_FT_056 » et le libellé correspondant « Aucune facture trouvée au référentiel ».

Le logiciel peut contrôler dans sa base patient en amont de l’accès au service l’existence d’une facture.

## <u>*Résultat à fournir*</u> :

Copie d’écran d’un cas d’erreurs à fournir.

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 9/10

*SEL-GCONFORM-FTE* Version 0.63

# Test 1.07 – Cohérence données en-tête corps requête SOAP

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes<br /><u>SEL-MP-015 WS_FT §2.1 WS_FT1 : Consulter une</u> FEL et §3.4 Opération WS_FT1 « consulter »</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

<u>Sur la base du test alimentation des contextes (contexte BAM et contexte LPS) de l’entête de la requête</u>

### <u>*A vérifier*</u> :

- Les données renseignées dans les contextes BAM et LPS doivent être conformes au cadre d’interopérabilité (pour les données définies obligatoires dans le cadre d’interopérabilité) et conformes au guide d’intégration (pour les données attendues et définies optionnelles dans le cadre d’interopérabilité).

- Les données du contexte BAM (\<Grandregime>, \<Organisme> et \<Centre>) doivent être cohérentes avec celles renseignées dans le corps de la requête.

### <u>*Résultat à fournir*</u> :

Présenter les éléments mettant la bonne gestion de ces points (traces xml de la requête).

27/05/2019 Guide de tests de conformité : Récupérer les données de la FEL 10/10