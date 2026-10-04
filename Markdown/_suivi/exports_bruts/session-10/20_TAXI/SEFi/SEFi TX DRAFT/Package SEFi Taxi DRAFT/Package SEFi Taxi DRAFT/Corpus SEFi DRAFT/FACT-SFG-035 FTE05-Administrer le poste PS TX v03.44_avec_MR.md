![logo: sesam-vitale](page_1_image_1_v2.jpg)

![logo: **FTE**](page_1_image_2_v2.jpg)

*Spécifications Fonctionnelles Générales*

# **Facturation Transporteur Etendue**
## ***Taxi***

### **FTE05 - Administrer le poste PS**

Référence : FACT-SFG-035 / Version : 03.44 / Date : 02/07/2026
Diffusion : RESTREINTE
État : PROVISOIRE




VERSION DE TRAVAIL

**GIE SESAM-Vitale**

5, boulevard Marie et Alexandre Oyon – 72 019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Ce document a été élaboré par le GIE SESAM-Vitale.

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

**Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles **L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des** sanctions pour l’auteur du délit.**

## **CONTACTS**

![icon: sesam-vitale](page_2_image_1_v2.jpg)

Pour toute demande d'évolution, comme pour toute question technique ou fonctionnelle, contactez le Centre de services :

*   portail IRIS : [https://portail-support.sesam-vitale.fr/](https://portail-support.sesam-vitale.fr/)
*   téléphone : 02 43 57 42 88

VERSION DE TRAVAIL

*FACT-SFG-035*
*SFG - Facturation Transporteur Etendue - Taxi*
*FTE05 - Administrer le poste PS*
Version : 03.44

# **TABLES DES MATIERES**

<table>
    <tr>
      <td><b>1</b></td>
      <td><b>INTRODUCTION ........................................................................................................................................4</b></td>
      <td><b>4</b></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1 OBJECTIF DU DOCUMENT .......................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.2 STATUT DU DOCUMENT ..........................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.3 POSITIONNEMENT DU DOCUMENT............................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.4 CONTENU DU DOCUMENT .......................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.5 DOCUMENTS DE RÉFÉRENCE ..................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.6 ABRÉVIATIONS.......................................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.7 DÉFINITIONS..........................................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.8 GUIDE DE LECTURE................................................................................................................................4</td>
      <td>4</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>PRÉSENTATION DU SOUS-PROCESSUS FTE05 ...................................................................................5</b></td>
      <td><b>5</b></td>
    </tr>
    <tr>
      <td></td>
      <td>2.1 POSITIONNEMENT DU SOUS-PROCESSUS FTE05 .....................................................................................5</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2 PRÉSENTATION GÉNÉRALE DU SOUS-PROCESSUS FTE05 : ADMINISTRER LE POSTE PS ............................5</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>2.3 DESCRIPTION DÉTAILLÉE DES FONCTIONS DU SOUS-PROCESSUS FTE05 : ADMINISTRER LE POSTE PS ......6</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.1 FTE05.01 : Règles de paramétrage des informations liées au Transporteur ........................6</i></td>
      <td><i>6</i></td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.2 FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS .............................8</i></td>
      <td><i>8</i></td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.3 FTE05.03 : Règles de paramétrage des données techniques A.M. du processus de</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>facturation.............................................................................................................................13</i></td>
      <td><i>13</i></td>
    </tr>
    <tr>
      <td></td>
      <td>    <mark><u>2.3.4</u> <i>FTE05.04 : Traçabilité des données unitaires de référence ................................................15</i></mark></td>
      <td><mark><i>15</i></mark></td>
    </tr>
    <tr>
      <td></td>
      <td>    <mark><u>2.3.5</u> <u><i>FTE05.05 : Historisation des requêtes et des réponses des services</i></u> <i>.................................16</i></mark></td>
      <td><mark><i>16</i></mark></td>
    </tr>
</table>




VERSION DE TRAVAIL

*02/07/2026*
*3 / 16*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: SESAM-Vitale logo](page_3_image_1_v2.jpg)

FACT-SFG-035
*SFG - Facturation Transporteur Etendue - Taxi*
*FTE05 - Administrer le poste PS*
*Version : 03.44*

# **1 Introduction**

## **1.1 Objectif du document**
Ce document a pour but de spécifier la fonctionnalité « FTE05 : Administrer le poste PS ».

## **1.2 Statut du document**
Ces SFG sont en version provisoire et référencée.

## **1.3 Positionnement du document**
Ce document fait partie du corpus documentaire des SFG du système de Facturation Transporteur Etendue **(FTE)**.

## **1.4 Contenu du document**
Outre ce chapitre introductif, ce document de spécifications fonctionnelles générales présente les règles de paramétrage des données du système FTE.

## **1.5 Documents de référence**

<table>
  <thead>
    <tr>
      <th><b>Appellation</b></th>
      <th><b>Type et titre</b></th>
      <th><b>Référence</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>[DICO]</td>
      <td>Dictionnaire du système FTE</td>
      <td>FACT-SFG-029</td>
    </tr>
    <tr>
      <td>[PG]</td>
      <td>Présentation Générale du système FTE</td>
      <td>FACT-SFG-030</td>
    </tr>
    <tr>
      <td>[FTE02]</td>
      <td>FTE02-Facturer des Prestations</td>
      <td>FACT-SFG-032</td>
    </tr>
    <tr>
      <td>[SCOR TT-TA]</td>
      <td>SCOR - TT-TA « Transmettre un flux de PJ<br />et analyser les retours »</td>
      <td>SCOR-SFG-003</td>
    </tr>
  </tbody>
</table>

## **1.6 Abréviations**
Cf. Document FACT-SFG-029 : Dictionnaire.

## **1.7 Définitions**
Cf. Document FACT-SFG-029 : Dictionnaire.

## **1.8 Guide de lecture**
Cf. Document FACT-SFG-030 : PG-Annexe 1 : Guide de lecture.




VERSION DE TRAVAIL

*02/07/2026*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: SESAM-Vitale logo](page_4_image_1_v2.jpg)
*4 / 16*

*FACT-SFG-035*
*SFG - Facturation Transporteur Etendue - Taxi*
*FTE05 - Administrer le poste PS*
*Version : 03.44*

# **2 Présentation du sous-processus FTE05**

## **2.1 Positionnement du sous-processus FTE05**

Le sous-processus FTE05 : ADMINISTRER ne fait pas partie à part entière du processus principal de facturation : il constitue un ensemble de fonctionnalités indépendantes.

## **2.2 Présentation générale du sous-processus FTE05 : Administrer le poste PS**

**Vue générale**

**_Description_** Le système FTE utilise différentes informations qui sont toujours identiques quelle que soit la FEL à élaborer.

*   Données d’identification du transporteur (cf. FTE05.01)
*   Indicateurs d’activation ou désactivation des appels aux WS optionnels (cf. FTE05.02)
*   Données techniques du processus de facturation (cf. FTE05.03)

<mark><u>Le système FTE utilise des données unitaires de référence pour calculer les montants à facturer. Le LPS doit assurer la traçabilité des mises à jour de ces données. cf. FTE05.04.</u></mark>

<mark><u>Le LPS doit assurer l’historisation des traces des requêtes et des réponses des services. cf. FTE05.05.</u></mark>

Ces opérations FTE05.xx de paramétrage de données par le Transporteur sont réalisées indépendamment du processus de facturation.

<table>
    <tr>
      <td><i>Entrées</i></td>
      <td>Aucune</td>
    </tr>
    <tr>
      <td><i>Sorties</i></td>
      <td>Aucune</td>
    </tr>
    <tr>
      <td><i>Situations<br />spécifiques</i></td>
      <td>Aucune</td>
    </tr>
</table>




VERSION DE TRAVAIL

*02/07/2026*
5 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: SESAM-Vitale logo](page_5_image_1_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
*FACT-SFG-035* *FTE05 - Administrer le poste PS* *Version : 03.44*

# **2.3** **Description détaillée des fonctions du sous-processus FTE05 : Administrer le poste PS**

## **2.3.1** **FTE05.01 : Règles de paramétrage des informations liées au Transporteur**

**Vue générale**

***Description*** Cette opération a pour objet de permettre le paramétrage par le Transporteur sur son LPS, ou par l’éditeur, de diverses informations liées à son identification et utilisées dans le processus d’élaboration des FEL. Ces données, une fois renseignées par le Transporteur, seront utilisées pour l’élaboration de chaque FEL, évitant ainsi leur ressaisie.

![icon: warning](page_6_image_2_v2.jpg) L’enrichissement des paramètres de cette opération est imposé avant la première utilisation du LPS par le transporteur

***Entrées*** Aucune

***Sorties***

<table>
    <tr>
      <td rowspan="5"><i>Sorties</i></td>
      <td>Identifiant émetteur des FEL</td>
      <td>EF_FTE91_01</td>
    </tr>
    <tr>
      <td>Adresse mail émetteur des FEL</td>
      <td>EF_FTE91_02</td>
    </tr>
    <tr>
      <td>Identifiant PS facturant les FEL</td>
      <td>EF_FTE91_03</td>
    </tr>
    <tr>
      <td>Raison sociale PS facturant les FEL</td>
      <td>EF_FTE91_04</td>
    </tr>
    <tr>
      <td>Adhésion à l’option conventionnelle du PS facturant les FEL</td>
      <td>EF_FTE91_05</td>
    </tr>
</table>

***Situations spécifiques*** Aucune

**Règles de gestion**

### ***[RG_FTE501] Paramétrer l’identifiant de l’émetteur des FEL (EF_FTE91_01)***

Le LPS doit permettre au Transporteur de paramétrer l’identifiant de l’émetteur des FEL. Cette information est transmise dans chaque FEL (cf. RG_FTE211).

![icon: arrow](page_6_image_3_v2.jpg) Dans le cas où l’émetteur du flux est le Transporteur, cet identifiant correspond à son identifiant A.M.

### ***[RG_FTE502] Paramétrer l’adresse mail de l’émetteur des FEL (EF_FTE91_02)***

Le LPS doit permettre au Transporteur de paramétrer l’adresse mail de l’émetteur des FEL. Cette information est transmise dans chaque FEL (cf. RG_FTE211).

### ***[RG_FTE503] Paramétrer l’identifiant du PS facturant les FEL (EF_FTE91_03)***

Le LPS doit permettre au Transporteur de paramétrer l’identifiant du PS facturant les FEL. Cette information est transmise dans chaque FEL (cf. RG_FTE212).

![icon: arrow](page_6_image_1_v2.jpg) Cette information est également présente dans les données techniques d’appel de certains services (assertion PS).




VERSION DE TRAVAIL

*02/07/2026* 6 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: logo](page_6_image_4_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*

*FACT-SFG-035* *FTE05 - Administrer le poste PS* *Version : 03.44*

## ***[RG_FTE504] Paramétrer la raison sociale du PS facturant les FEL (EF_FTE91_04)***

<u>Pour les taxis, et dans cette version, le LPS doit permettre au Transporteur de paramétrer le numéro d’autorisation de stationnement.</u>

<u>Le LPS doit permettre au Transporteur de paramétrer la raison sociale du PS facturant les FEL.</u>

Cette information est transmise dans chaque FEL (cf. RG_FTE212).




VERSION DE TRAVAIL

*02/07/2026* 7 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: dots](page_7_image_1_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
*FACT-SFG-035 FTE05 - Administrer le poste PS Version : 03.44*

## **2.3.2** **FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS**

### **Vue générale**

***Description*** Cette opération a pour objet de permettre au Transporteur de choisir parmi les services en ligne optionnels pour le processus FACTURER ceux qu’il souhaite utiliser lors de l’élaboration des FEL (cf. FTE02).

Les services en ligne optionnels en facturation sont les suivants :

*   WS_PS1 : « Acquérir les données PS par n° AM »
*   WS_PS3 : « Acquérir les informations PS par n° FINESS »
*   WS_PS4 : « Acquérir les informations RNT»
*   WS_BS1 : « Identifier un bénéficiaire »
*   WS_BS2 : « Acquérir les données d’un bénéficiaire »
*   WS_PEC1 : « Acquérir les modalités de prise en charge d’une prestation de transport »
*   ~~<u>•</u>~~ <u>WS_FT4 : « Déterminer les montants d’une prestation de transport »</u>
    <u>(utilisable uniquement si la tarification majorée est appliquée)</u>

![icon: icon](page_8_image_1_v2.jpg) Ces paramétrages ne concernent pas le processus CONSULTER.
Les opérations de consultation (cf. FTE04) sont utilisées directement par le Transporteur, indépendamment des indicateurs d’activations définis ci-après.
Ces indicateurs d’activation concernent les opérations de FTE02 (FTE02.01 phase d’acquisition des informations préalables de facturation)

<table>
    <tr>
      <td><i>Entrées</i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
    <tr>
      <td rowspan="7"><i>Sorties</i></td>
      <td>Activation WS_PS1</td>
      <td>EF_FTE90_11</td>
    </tr>
    <tr>
      <td>Activation WS_PS3</td>
      <td>EF_FTE90_13</td>
    </tr>
    <tr>
      <td>Activation WS_PS4</td>
      <td>EF_FTE90_14</td>
    </tr>
    <tr>
      <td>Activation WS_BS1</td>
      <td>EF_FTE90_21</td>
    </tr>
    <tr>
      <td>Activation WS_BS2</td>
      <td>EF_FTE90_22</td>
    </tr>
    <tr>
      <td>Activation WS_PEC1</td>
      <td>EF_FTE90_29</td>
    </tr>
    <tr>
      <td><mark><u>Activation WS_FT4</u></mark></td>
      <td><mark><u>EF_FTE90_54</u></mark></td>
    </tr>
    <tr>
      <td><i>Situations spécifiques</i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
</table>




VERSION DE TRAVAIL

*02/07/2026* 8 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: .••](page_8_image_2_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
*FACT-SFG-035 FTE05 - Administrer le poste PS Version : 03.44*

**Règles de gestion**

### ***[RG_FTE511] Paramétrer l’appel à WS_PS1 (EF_FTE90_11)***

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_PS1 : « Acquérir les données PS par n° AM »

![icon](page_9_image_5_v2.jpg) Par défaut l’appel à ce service doit être activé.

![icon](page_9_image_6_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE10_05</td>
      <td>Code spécialité du PS</td>
      <td rowspan="2"><b>RG_FTE201</b></td>
    </tr>
    <tr>
      <td>EF_FTE10_02</td>
      <td>Identifiant RPPS du PS</td>
    </tr>
  </tbody>
</table>

et le Transporteur devra donc, lors de l’élaboration de la FEL (opération FTE02.02) renseigner lui-même les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE53_02</td>
      <td>Code spécialité du PS prescripteur</td>
      <td rowspan="2"><b>RG_FTE215</b></td>
    </tr>
    <tr>
      <td>EF_FTE53_05</td>
      <td>Identifiant RPPS du PS prescripteur</td>
    </tr>
  </tbody>
</table>

### ***[RG_FTE513] Paramétrer l’appel à WS_PS3 (EF_FTE90_13)***

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_PS3 : « Acquérir les informations PS par n° FINESS »

![icon](page_9_image_2_v2.jpg) Par défaut l’appel à ce service doit être activé.

![icon](page_9_image_4_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE12_02</td>
      <td>Code spécialité PS exerçant dans l’établissement<br />de soins</td>
      <td><b>RG_FTE201</b></td>
    </tr>
  </tbody>
</table>

et le Transporteur devra donc, lors de l’élaboration de la FEL (opération FTE02.02) renseigner lui-même les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE53_02</td>
      <td>Code spécialité du PS prescripteur</td>
      <td><b>RG_FTE215</b></td>
    </tr>
  </tbody>
</table>

### ***[RG_FTE514] Paramétrer l’appel à WS_PS4 (EF_FTE90_14)***

Le LPS doit permettre au Transporteur d’activer ou désactiver l’ appel au service en ligne WS_PS4 : « Acquérir les informations RNT»

![icon](page_9_image_1_v2.jpg) Par défaut l’appel à ce service doit être activé.




VERSION DE TRAVAIL

*02/07/2026* *9 / 16*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon](page_9_image_3_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.44*

![icon: icon](page_10_image_2_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="4"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>N*</td>
      <td>EF_FTE14</td>
      <td>Personnel</td>
      <td rowspan="2"><b>RG_FTE204</b></td>
    </tr>
    <tr>
      <td>N*</td>
      <td>EF_FTE16</td>
      <td>Véhicule</td>
    </tr>
  </tbody>
</table>

et le Transporteur devra donc, lors de l’élaboration de la FEL (opération FTE02.02) renseigner lui-même les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b><b>FTE02.02 : Elaborer la FEL</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE64_01</td>
      <td>N° d’immatriculation du véhicule</td>
      <td rowspan="5"><b>RG_FTE221</b></td>
    </tr>
    <tr>
      <td>EF_FTE64_02</td>
      <td>Nom du conducteur</td>
    </tr>
    <tr>
      <td>EF_FTE64_03</td>
      <td>Prénom du conducteur</td>
    </tr>
    <tr>
      <td>EF_FTE64_04</td>
      <td>Nom du 2nd membre d’équipage</td>
    </tr>
    <tr>
      <td>EF_FTE64_05</td>
      <td>Prénom du 2nd membre d’équipage</td>
    </tr>
  </tbody>
</table>

![icon: icon](page_10_image_1_v2.jpg) \* : *N signifie que plusieurs entités peuvent être présentes.*

## **[RG_FTE521] Paramétrer l’appel à WS_BS1 (EF_FTE90_21)**

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_BS1 : « Identifier un bénéficiaire »

![icon: icon](page_10_image_4_v2.jpg) Par défaut l’appel à ce service doit être activé.

![icon: icon](page_10_image_5_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE20_04</td>
      <td>Date de naissance</td>
      <td rowspan="2"><b>RG_FTE202<br /><b>[Scénario PP]</b></b></td>
    </tr>
    <tr>
      <td>EF_FTE20_05</td>
      <td>Rang du bénéficiaire</td>
    </tr>
  </tbody>
</table>

et le Transporteur devra donc les renseigner lui-même pour l’acquisition préalable des données de prise en charge :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE20_04</td>
      <td>Date de naissance du bénéficiaire</td>
      <td rowspan="2">
        <b>RG_FTE429</b><br />
        appelée par<br />
        <b>RG_FTE203</b>
      </td>
    </tr>
    <tr>
      <td>EF_FTE20_05</td>
      <td>Rang du bénéficiaire</td>
    </tr>
  </tbody>
</table>

Puis lors de l’élaboration de la FEL (opération FTE02.02), le Transporteur devra renseigner lui-même les données suivantes :




VERSION DE TRAVAIL

*02/07/2026* 10 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_10_image_3_v2.jpg)

FACT-SFG-035
*SFG - Facturation Transporteur Etendue - Taxi*
*FTE05 - Administrer le poste PS*
Version : 03.44

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE55_03</td>
      <td>Date de naissance du bénéficiaire</td>
      <td rowspan="2"><b>RG_FTE214<br />[Scénario PP]</b></td>
    </tr>
    <tr>
      <td>EF_FTE55_04</td>
      <td>Rang du bénéficiaire</td>
    </tr>
  </tbody>
</table>

### *[RG_FTE522] Paramétrer l’appel à WS_BS2 (EF_FTE90_22)*

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_BS2 : « Acquérir les données d’un bénéficiaire »

![icon: icon](page_11_image_2_v2.jpg) Par défaut l’appel à ce service doit être activé.

![icon: icon](page_11_image_1_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="2"><strong><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></strong></th>
      <th></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE22_01</td>
      <td>Code régime</td>
      <td rowspan="3"><strong>RG_FTE202</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>EF_FTE22_02</td>
      <td>Code caisse gestionnaire</td>
      <td></td>
    </tr>
    <tr>
      <td>EF_FTE22_03</td>
      <td>Code centre gestionnaire</td>
      <td></td>
    </tr>
    <tr>
      <td>EF_FTE20_01</td>
      <td>Nom de famille</td>
      <td rowspan="3"><strong>RG_FTE202<br />[Scénario PP]</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>EF_FTE20_02</td>
      <td>Nom d’usage</td>
      <td></td>
    </tr>
    <tr>
      <td>EF_FTE20_03</td>
      <td>Prénom du bénéficiaire</td>
      <td></td>
    </tr>
  </tbody>
</table>

et le Transporteur devra donc, lors de l’élaboration de la FEL (opération FTE02.02) renseigner lui-même les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE55_05</td>
      <td>Nom de famille du bénéficiaire</td>
      <td rowspan="3"><b>RG_FTE214<br />[Scénario PP]</b></td>
    </tr>
    <tr>
      <td>EF_FTE55_06</td>
      <td>Nom d'usage du bénéficiaire</td>
    </tr>
    <tr>
      <td>EF_FTE55_07</td>
      <td>Prénom du bénéficiaire</td>
    </tr>
  </tbody>
</table>

### *[RG_FTE529] Paramétrer l’appel à WS_PEC1 (EF_FTE90_29)*

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_PEC1 : « Acquérir les modalités de prise en charge d’une prestation de transport »

![icon: icon](page_11_image_4_v2.jpg) Par défaut l’appel à ce service doit être activé.

![icon: icon](page_11_image_5_v2.jpg) En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :




VERSION DE TRAVAIL

*02/07/2026*
*11 / 16*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_11_image_3_v2.jpg)

*FACT-SFG-035*
*SFG - Facturation Transporteur Etendue - Taxi*
*FTE05 - Administrer le poste PS*
*Version : 03.44*

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE28_01</td>
      <td>Code régime de prise en charge</td>
      <td rowspan="11"><strong>RG_FTE203</strong></td>
    </tr>
    <tr>
      <td>EF_FTE28_02</td>
      <td>Code caisse gestionnaire de prise en charge</td>
    </tr>
    <tr>
      <td>EF_FTE28_03</td>
      <td>Code centre gestionnaire de prise en charge</td>
    </tr>
    <tr>
      <td>EF_FTE28_04</td>
      <td>Nature d’assurance</td>
    </tr>
    <tr>
      <td>EF_FTE28_05</td>
      <td>Date de maternité</td>
    </tr>
    <tr>
      <td>EF_FTE28_06</td>
      <td>Rang du bénéficiaire</td>
    </tr>
    <tr>
      <td>EF_FTE28_07</td>
      <td>Contrat AMO particulier</td>
    </tr>
    <tr>
      <td>EF_FTE28_08</td>
      <td>Indicateur de situation particulière</td>
    </tr>
    <tr>
      <td>EF_FTE28_09</td>
      <td>TP réglementaire</td>
    </tr>
    <tr>
      <td>EF_FTE29_02</td>
      <td>Justificatif d’exonération</td>
    </tr>
    <tr>
      <td>EF_FTE29_03</td>
      <td>Taux applicable à la prestation</td>
    </tr>
  </tbody>
</table>

et le Transporteur devra, lors de l’élaboration de la FEL (opération FTE02.02), renseigner lui-même les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b><b>FTE02.02 : Elaborer la FEL</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE57_04<br />[AMO]</td>
      <td>Code régime</td>
      <td rowspan="5"><b>RG_FTE222</b></td>
    </tr>
    <tr>
      <td>EF_FTE57_05<br />[AMO]</td>
      <td>Code caisse gestionnaire</td>
    </tr>
    <tr>
      <td>EF_FTE57_06<br />[AMO]</td>
      <td>Code centre gestionnaire</td>
    </tr>
    <tr>
      <td>EF_FTE56_01<br />[AMO]</td>
      <td>Contrat [AM0]</td>
    </tr>
    <tr>
      <td>EF_FTE57_03<br />[AMO]</td>
      <td>Tiers Payant [AM0]</td>
    </tr>
    <tr>
      <td>EF_FTE56_01<br />[AMC]</td>
      <td>Contrat [AMC]</td>
      <td rowspan="2"><b>RG_FTE223</b></td>
    </tr>
    <tr>
      <td>EF_FTE57_03<br />[AMC]</td>
      <td>Tiers Payant [AMC]</td>
    </tr>
    <tr>
      <td>EF_FTE56_04</td>
      <td>Nature d'Assurance</td>
      <td rowspan="2"><b>RG_FTE224</b></td>
    </tr>
    <tr>
      <td>EF_FTE57_08<br />[AMO]</td>
      <td>Date maternité</td>
    </tr>
    <tr>
      <td>EF_FTE64_07</td>
      <td>Justificatif de l'exonération du TM</td>
      <td rowspan="2"><b>RG_FTE241</b></td>
    </tr>
    <tr>
      <td>EF_FTE64_08</td>
      <td>Taux de remboursement</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*02/07/2026*
12 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: dots](page_12_image_1_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.44*

# **[RG_FTE554] Paramétrer l’appel à WS_FT4 (EF_FTE90_54)**

<u>Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_FT4 : « Déterminer les montants d’une prestation de transport »</u>

![icon: icon](page_13_image_3_v2.jpg) Par défaut l’appel à ce service doit être activé si la tarification majorée est appliquée.

![icon: icon](page_13_image_2_v2.jpg) L’appel à ce service doit être désactivé si la tarification socle est appliquée.

![icon: icon](page_13_image_4_v2.jpg) En cas de désactivation de ce service, le LPS devra, lors de l’élaboration de la FEL <u>(opération FTE02.02) déterminer les données suivantes :</u>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE62_12</td>
      <td>Distance facturée</td>
      <td>RG_FTE225</td>
    </tr>
    <tr>
      <td>EF_FTE62_03</td>
      <td>Montant du forfait</td>
      <td rowspan="2">RG_FTE227</td>
    </tr>
    <tr>
      <td>EF_FTE65_03</td>
      <td>Majoration montant forfait</td>
    </tr>
    <tr>
      <td>EF_FTE62_06</td>
      <td>Montant Kilométrique</td>
      <td rowspan="2">RG_FTE228</td>
    </tr>
    <tr>
      <td>EF_FTE65_05</td>
      <td>Majoration montant kilométrique</td>
    </tr>
    <tr>
      <td>EF_FTE62_07</td>
      <td>Montant majoration courte distance</td>
      <td>RG_FTE229</td>
    </tr>
    <tr>
      <td>EF_FTE62_09</td>
      <td>Montant abattement</td>
      <td>RG_FTE231</td>
    </tr>
    <tr>
      <td>EF_FTE64_11</td>
      <td>Montant remboursable AMO de la prestation</td>
      <td rowspan="3">RG_FTE242</td>
    </tr>
    <tr>
      <td>EF_FTE64_12</td>
      <td>Montant remboursable AMC de la prestation (en CMU-C, ACS, AME ou AME-C)</td>
    </tr>
    <tr>
      <td>EF_FTE64_13</td>
      <td>Reste à charge assuré de la prestation</td>
    </tr>
  </tbody>
</table>

## **2.3.3** **FTE05.03 : Règles de paramétrage des données techniques A.M. du processus de facturation**

<table>
  <caption>**Vue générale**</caption>
    <tr>
      <td><i>Description</i></td>
      <td colspan="2">Cette opération a pour objet de permettre le paramétrage de diverses informations techniques utilisées par le LPS dans l’ensemble du système FTE.<br />Les évolutions de ces informations sont communiquées par l’Assurance Maladie.</td>
    </tr>
    <tr>
      <td><i>Entrées</i></td>
      <td colspan="2">Aucune</td>
    </tr>
    <tr>
      <td rowspan="6"><i>Sorties</i></td>
      <td>Taille maximale d’un fichier PDF (SCOR)</td>
      <td>EF_FTE92_01</td>
    </tr>
    <tr>
      <td>Plage des valeurs des n° de lot</td>
      <td>EF_FTE92_02<br />à EF_FTE92_09</td>
    </tr>
    <tr>
      <td>Nombre maximum de trajets par FEL</td>
      <td>EF_FTE92_10</td>
    </tr>
    <tr>
      <td>Délai maximum d’envoi des PJ SCOR</td>
      <td>EF_FTE92_11</td>
    </tr>
    <tr>
      <td>Positionnement par défaut du TP AMO</td>
      <td>EF_FTE92_12</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><i>Situations spécifiques</i></td>
      <td colspan="2">Aucune</td>
    </tr>
</table>

*02/07/2026*
13 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_13_image_1_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.44*

## **Règles de gestion**

### *[RG_FTE591] Paramétrer les plages de n° de lot (EF_FTE92_02 à EF_FTE92_09)*

Les plages de n° de lot sont utilisées par la règle RG_FTE287 « Déterminer le n° de lot de la FEL » lors de la validation de la FEL (opération FTE02.04).

![icon: icon](page_14_image_2_v2.jpg) En première version du système FTE, les valeurs à utiliser sont les suivantes :

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Libellé</b></th>
      <th><b>Valeur</b></th>
      <th><b>Date d’effet</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE92_02</td>
      <td>Minimum Plage 1</td>
      <td>001</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_03</td>
      <td>Maximum Plage 1</td>
      <td>250</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_04</td>
      <td>Minimum Plage 2</td>
      <td>251</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_05</td>
      <td>Maximum Plage 2</td>
      <td>500</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_06</td>
      <td>Minimum Plage 3</td>
      <td>501</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_07</td>
      <td>Maximum Plage 3</td>
      <td>750</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_08</td>
      <td>Minimum Plage 4</td>
      <td>751</td>
      <td>01/09/13</td>
    </tr>
    <tr>
      <td>EF_FTE92_09</td>
      <td>Maximum Plage 4</td>
      <td>999</td>
      <td>01/09/13</td>
    </tr>
  </tbody>
</table>

![icon: icon](page_14_image_1_v2.jpg) Ces valeurs pourront évoluer dans le temps. Le LPS doit donc permettre leur modification.

### *[RG_FTE593] Paramétrer le nombre maximum de trajets par FEL (EF_FTE92_10)*

Le nombre maximum de trajets pouvant composer une FEL est contrôlé lors de l’élaboration de la FEL (FTE02.02.04), la taille des messages du SEFi devant être limitée.

![icon: icon](page_14_image_4_v2.jpg) Par défaut, le nombre maximum de trajets par FEL est fixé à <mark>~~20~~ <u>36</u></mark>.

![icon: icon](page_14_image_5_v2.jpg) Cette valeur peut évoluer dans le temps : le LPS doit permettre la modification de ce paramètre.

### *[RG_FTE594] Paramétrer le délai maximum d’envoi des PJ (EF_FTE92_11)*

Il s’agit du délai entre la date de création du lot de FE et la date démission du lot de PJ SCOR correspondant. Ce délai est utilisé pour la supervision du poste (FTE06.01)

![icon: icon](page_14_image_6_v2.jpg) Par défaut, le délai maximum d’envoi des PJ est de 48h.

![icon: icon](page_14_image_3_v2.jpg) Cette valeur peut évoluer dans le temps : le LPS doit permettre la modification de ce paramètre.

### *[RG_FTE595] Activer/désactiver le positionnement par défaut du TP AMO (EF_FTE92_12)*

Le LPS doit permettre au Transporteur d’activer ou désactiver le positionnement par défaut du TP AMO dans les situations définies dans la TB222.




VERSION DE TRAVAIL

*02/07/2026* 14 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_14_image_7_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.44*

Par défaut ce top activation par défaut du TP AMO (EF_FTE92_12) est à « OUI », le Transporteur pouvant toujours le modifier et désactiver le positionnement par défaut par le LPS du TP AMO.

![icon: icon](page_15_image_4_v2.jpg)

A noter que ce positionnement par défaut est effectué :

* dans la règle RG_FTE222[57.03] en s’appuyant sur les conditions de contexte réglementaire réunies dans la table TB222,
* et uniquement dans la mesure où le top de activation du positionnement par défaut du TP AMO est à « OUI ».

---

## **2.3.4** **FTE05.04 : Traçabilité des données unitaires de référence**

### <u>**Vue générale**</u>

<table>
  <thead>
    <tr>
      <th colspan="2">Vue générale</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><i><b><u>Description</u></b></i></td>
      <td><u>Cette opération a pour objet la traçabilité des mises à jour des données unitaires</u><br /><u>de référence.</u></td>
    </tr>
    <tr>
      <td><i><b><u>Entrées</u></b></i></td>
      <td><u>Mises à jour des données unitaires de référence</u></td>
    </tr>
    <tr>
      <td><i><b><u>Sorties</u></b></i></td>
      <td><u>Trace des mises à jour des données unitaires de référence</u></td>
    </tr>
    <tr>
      <td><i><b>Situations<br /><u>spécifiques</u></b></i></td>
      <td>Aucune</td>
    </tr>
  </tbody>
</table>

### <u>**Règles de</u> <u>gestion**</u>

<table>
  <thead>
    <tr>
      <th colspan="2"><b>[RG_FTE598] Tracer les mises à jour des données unitaires de référence</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><img src="page_15_image_3_v2.jpg" alt="icon: sdli"></td>
      <td>CDC B2 TX : TRACABILITE DES MISES A JOUR DE DONNEES - 001</td>
    </tr>
    <tr>
      <td></td>
      <td><u>Les mises à jour des données unitaires de références suivantes doivent être tracées</u> <u>(valeurs et date de modification) et historisées pendant 27 mois.</u><br /><u>○ Donnée fonction du département de l’ADS de la société de taxis : tarif km.</u><br /><u>• Données fonction de l’organisme local d’Assurance Maladie dont dépend l’ADS d’un</u> <u>véhicule exploite par la société de taxis :</u><br /><u>○ type et montant des suppléments forfaitaires,</u><br /><u>○ seuil kilométrique de trajet seul.</u><br /><u>• Données nationales :</u><br /><u>○ type de forfait,</u><br /><u>○ tarif du forfait,</u><br /><u>○ distance minimale couverte par le forfait,</u><br /><u>○ coefficient aller ou retour à vide en fonction de la plage de distance,</u><br /><u>○ seuil n°1 KM aller ou retour vide,</u><br /><u>○ coefficient de majoration nuit ou dimanche / jour férié,</u><br /><u>○ % d’abattement en fonction du nombre de malades transportés,</u><br /><u>○ tarif de supplément TPMR,</u><br /><u>○ ainsi que le supplément forfaitaire DROM et le supplément forfaitaire insulaire</u> <u>définis nationalement.</u></td>
    </tr>
    <tr>
      <td><img src="page_15_image_1_v2.jpg" alt="icon: bzdk"></td>
      <td>CDC B2 TX : TRACABILITE DES MISES A JOUR DE DONNEES – 002</td>
    </tr>
  </tbody>
</table>

*02/07/2026* *15 / 16*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_15_image_2_v2.jpg)

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.44*

<u>Une société de taxis doit être en capacité de présenter à sa caisse de rattachement ou aux</u> <u>organismes locaux d’Assurance Maladie dont dépendent les autorisations de</u> <u>stationnement (ADS) des véhicules exploités par la société de taxis :</u>

*   <u>les données unitaires de références,</u>
*   <u>ainsi que l’historique sur 27 mois des mises à jour de chacune d’entre elles.</u>

![icon: icon](page_16_image_2_v2.jpg) CDC B2 TX : TRACABILITE DES MISES A JOUR DE DONNEES ₋ 003
<u>Les données historisées (valeur, date de modification etc.) ne doivent pas pouvoir être</u> <u>modifiées.</u>

## **2.3.5** **FTE05.05 : Historisation des requêtes et des réponses des services**

<u>**Vue générale**</u>
<u>**_Entrées_** Toutes les requêtes et toutes les réponses des services WS_FT2 et WS_FT3.</u>
<u>**_Sorties_** Requêtes et réponses historisées</u>
**_Situations spécifiques_** <u>Aucune</u>

<u>**Règles de</u> <u>gestion**</u>

<table>
  <thead>
    <tr>
      <th colspan="2"><b><i>[RG_FTE597] Historiser les requêtes et les réponses des services</i></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td><u>Les LPS doit pouvoir historiser pendant 12 mois toutes les requêtes et toutes les réponses</u> <u>des services suivants :</u><br />
        • WS_FT2 : Vérifier la recevabilité d’une FEL<br />
        • WS_FT3 : Valider une FEL<br />
        <u>Cet historisation doit être activable par le transporteur ou par l’éditeur pour chacun des</u> <u>services.</u><br />
        <u>Une société de transports doit être en capacité de présenter ces éléments sur demande</u> <u>de l’Assurance Maladie.</u></td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*02/07/2026* 16 / 16
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_16_image_1_v2.jpg)