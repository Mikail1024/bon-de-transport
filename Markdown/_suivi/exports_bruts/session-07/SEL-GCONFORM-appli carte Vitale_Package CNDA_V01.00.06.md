<table>
    <tr>
      <td><i>SEL-GCONFORM-appli<br />carte Vitale</i></td>
      <td></td>
      <td>Version 01.00.06</td>
    </tr>
</table>

![logo: CNDA](page_1_image_2_v2.jpg)

### **Service en Ligne/Service PS**

# **Service d’authentification / signature appli**
# **carte Vitale intégré aux LPS**

## **Package de tests CNDA appli**
## **carte Vitale**
## **V01.00.06**

![logo: V](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td>01.00.06</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>22/01/2026</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-appli<br />carte Vitale</i></td>
    </tr>
</table>

<table>
    <tr>
      <td><mark>22/01/2026</mark></td>
      <td>Package CNDA appli carte Vitale</td>
      <td>1/6</td>
    </tr>
</table>

*SEL-GCONFORM-appli*
*carte Vitale*
Version 01.00.06

<table>
  <thead>
    <tr>
      <th colspan="4"><b>HISTORIQUE DES VERSIONS</b></th>
    </tr>
    <tr>
      <th>DATE</th>
      <th>VERSION</th>
      <th><b>EVOLUTION DU DOCUMENT</b></th>
      <th><b>REDACTEUR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>16/10/2020</td>
      <td>1.00.00</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/10/2021</td>
      <td>1.00.01</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/03/2023</td>
      <td>1.00.02</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>03/07/2023</td>
      <td>1.00.03</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>17/04/2024</td>
      <td>1.00.04</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>07/08/2024</td>
      <td>1.00.05</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>22/01/2026</mark></td>
      <td><mark>1.00.06</mark></td>
      <td><mark>Maintenance</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

<mark>22/01/2026</mark> Package CNDA appli carte Vitale 2/6

*SEL-GCONFORM-appli*
carte Vitale
Version 01.00.06

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><b>1</b></td>
      <td><b>INTRODUCTION....................................................................................................................................................</b></td>
      <td><b>4</b></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>PROCEDURE........................................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>PRE REQUIS.........................................................................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>IDENTIFICATION EDITEUR...................................................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>CONTENU DE LA LIVRAISON ...........................................................................................................................</b></td>
      <td><b>6</b></td>
    </tr>
</table>

22/01/2026 Package CNDA appli carte Vitale 3/6

*SEL-GCONFORM-appli carte Vitale*
Version 01.00.06

# **1 Introduction**

## **1.1 Procédure**

La procédure de vérification de conformité vise à vérifier la correcte intégration dans les logiciels :
- Du méta-service appli carte Vitale « authentification » (TLSi AMO + facturation SV),
- Du méta-service appli carte Vitale « signature » (facturation SV).

**La vérification du méta-service appli carte Vitale « authentification » peut se faire **de façon isolée mais devra obligatoirement être menée pour l’ensemble des TLSi** AMO (hors ADRi) du logiciel.**

Dans l’optique de cette vérification :
- Une première phase consistera à l’examen par le CNDA des résultats des différents cas de tests contenus dans le package de tests appli carte Vitale.

Les résultats sont transmis directement en déposant le dossier au format électronique sur l’espace personnel éditeurs du CNDA (https://sicnda.ameli.fr/).

En fonction des téléservices déjà implémentés dans le logiciel, les résultats des tests différentiels contenus dans le package de tests afférents à ces téléservices sont attendus.

Tests différentiels pour chaque téléservice :
- AATi, Test 1.07 - Obsolescence assertion vitale, Cas 3 et 4
- ALDi, Test 1.03 - Règles de gestion de l’assertion appli carte Vitale, Cas 1
- DMTi, Test 4.05 - Règles de gestion de l’assertion appli carte Vitale, Cas 1
- HRi, Test 1.09 - Règles de gestion de l’assertion appli carte Vitale, Cas 1
- IMTi, Test 1.02, Cas 3

**Format des résultats attendus :**
- Un document .pdf ou .doc comprenant vos réponses aux tests : textes et copies d’écran.
- Un dossier nommé « XML » contenant les traces de vos tests nommées avec le format suivant :
    - Test_*numéroDuTest*_(cas_*numéroDuCas*_)REQUETE.xml
    - Test_*numéroDuTest*_(cas_*numéroDuCas*_)REPONSE.xml

- Une seconde phase consistera à vérifier directement sur le logiciel que les tests de ce guide puissent être déroulés par le CNDA.

A cette fin et dans un but de vérification, la version du logiciel transmise doit permettre l’accès aux traces xml des requêtes émises et des réponses reçues (ce que ne doit pas autoriser la version livrée aux professionnels de santé).

Support électronique : [support.cnda@assurance-maladie.fr](mailto:support.cnda@assurance-maladie.fr) (pour un meilleur service, veuillez préfixer l'objet de votre message par "TS-AM")

22/01/2026 Package CNDA appli carte Vitale 4/6

*SEL-GCONFORM-appli carte Vitale* Version 01.00.06

## **1.2 Pré requis**

Utilisation d’un numéro d’autorisation provisoire de test propre à chaque logiciel. Ce numéro vous sera fourni par le CNDA à la signature de la convention d’autorisation d’accès au téléservice intégré.

Pour les logiciels ayant obtenu un numéro d’autorisation dans le cadre de la demande de conformité pour un autre téléservice intégré, ce numéro doit être réutilisé dans les requêtes appli carte Vitale.

Utilisation du type d’autorisation « 4 » (Numéro d’autorisation) à renseigner dans l’entête de la requête.

## **1.3 Identification Editeur**

Les résultats du guide de tests de conformité transmis au CNDA, doivent être accompagnés <u>obligatoirement</u> du document « Fiche d’engagement de conformité pour les logiciels intégrant le service » dûment complété.

22/01/2026 Package CNDA appli carte Vitale 5/6

| *SEL-GCONFORM-appli carte Vitale* | | Version 01.00.06 |
| :--- | :---: | :--- |

## **2 Contenu de la livraison**

<table>
  <thead>
    <tr>
      <th><strong><b>Référence Document</b></strong></th>
      <th><strong>Version diffusée</strong></th>
      <th><strong>Mise à jour / <b>Nouveauté</b></strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>SEL_GCONFORM_appli carte Vitale_Demander l'authentification et gérer le contexte appli carte Vitale</td>
      <td>01.00.05</td>
      <td><strong>Mise à jour</strong></td>
    </tr>
    <tr>
      <td>SEL_GCONFORM_appli carte Vitale_Demander la signature Vitale de la facture appli carte Vitale</td>
      <td>01.00.04</td>
      <td>-</td>
    </tr>
    <tr>
      <td>SEL-appli carte Vitale-Ident.différentiel Tests</td>
      <td>01.00.06</td>
      <td><strong>Mise à jour</strong></td>
    </tr>
  </tbody>
</table>

| 22/01/2026 | Package CNDA appli carte Vitale | 6/6 |
| :--- | :---: | :--- |