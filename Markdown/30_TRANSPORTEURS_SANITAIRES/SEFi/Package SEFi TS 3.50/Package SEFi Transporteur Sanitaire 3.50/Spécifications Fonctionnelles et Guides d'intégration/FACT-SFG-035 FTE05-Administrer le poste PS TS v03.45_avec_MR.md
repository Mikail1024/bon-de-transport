logo: sesam-vitale

logo: **FTE**

*Spécifications Fonctionnelles Générales*

# **Facturation Transporteur Etendue**
# *Transporteur Sanitaire*

## **FTE05 - Administrer le poste PS**

Référence : FACT-SFG-035 / Version : 03.45 / Date : 17/07/2026
Diffusion : RESTREINTE
État : REFERENCE

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72 019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Ce document a été élaboré par le GIE SESAM-Vitale.

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

**Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles **L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des** sanctions pour l’auteur du délit.**

## **CONTACTS**

icon: sesam-vitale

Pour toute demande d'évolution, comme pour toute question technique ou fonctionnelle, contactez le Centre de services :

*   portail IRIS : [https://portail-support.sesam-vitale.fr/](https://portail-support.sesam-vitale.fr/)
*   téléphone : 02 43 57 42 88

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.45*

<table>
  <caption>**TABLES DES MATIERES**</caption>
    <tr>
      <td><b>1</b></td>
      <td colspan="2"><b>INTRODUCTION ........................................................................................................................................4</b></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1 OBJECTIF DU DOCUMENT .......................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.2 STATUT DU DOCUMENT ..........................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.3 POSITIONNEMENT DU DOCUMENT............................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.4 CONTENU DU DOCUMENT .......................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.5 DOCUMENTS DE RÉFÉRENCE ..................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.6 ABRÉVIATIONS.......................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.7 DÉFINITIONS..........................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.8 GUIDE DE LECTURE................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td colspan="2"><b>PRÉSENTATION DU SOUS-PROCESSUS FTE05 ...................................................................................5</b></td>
    </tr>
    <tr>
      <td></td>
      <td>2.1 POSITIONNEMENT DU SOUS-PROCESSUS FTE05 .....................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2 PRÉSENTATION GÉNÉRALE DU SOUS-PROCESSUS FTE05 : ADMINISTRER LE POSTE PS ............................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>2.3 DESCRIPTION DÉTAILLÉE DES FONCTIONS DU SOUS-PROCESSUS FTE05 : ADMINISTRER LE POSTE PS ......</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.1 FTE05.01 : Règles de paramétrage des informations liées au Transporteur ........................</i></td>
      <td><i>6</i></td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.2 FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS .............................</i></td>
      <td><i>8</i></td>
    </tr>
    <tr>
      <td></td>
      <td>    <i>2.3.3 FTE05.03 : Règles de paramétrage des données techniques A.M. du processus de<br />            facturation.............................................................................................................................</i></td>
      <td><i>13</i></td>
    </tr>
    <tr>
      <td></td>
      <td><mark><u>2.3.4 FTE05.05 : Historisation des requêtes et des réponses des services</u></mark> .................................</td>
      <td>15</td>
    </tr>
</table>

*17/07/2026* 3 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 FTE05 - Administrer le poste PS Version : 03.45*

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

*17/07/2026* 4 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: SESAM-Vitale logo

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035* *FTE05 - Administrer le poste PS* *Version : 03.45*

# **2 Présentation du sous-processus FTE05**

## **2.1 Positionnement du sous-processus FTE05**

Le sous-processus FTE05 : ADMINISTRER ne fait pas partie à part entière du processus principal de facturation : il constitue un ensemble de fonctionnalités indépendantes.

## **2.2 Présentation générale du sous-processus FTE05 : Administrer le poste PS**

**Vue générale**

<table>
    <tr>
      <td><i>Description</i></td>
      <td>Le système FTE utilise différentes informations qui sont toujours identiques quelle que soit la FEL à élaborer.<br />
        • Données d’identification du transporteur (cf. FTE05.01)<br />
        • Indicateurs d’activation ou désactivation des appels aux WS optionnels (cf. FTE05.02)<br />
        • Données techniques du processus de facturation (cf. FTE05.03)<br />
        <mark><u>Le LPS doit assurer l’historisation des traces des requêtes et des réponses des services.</u> <u>cf. FTE05.05.</u></mark><br />
        Ces opérations FTE05.xx de paramétrage de données par le Transporteur sont réalisées indépendamment du processus de facturation.</td>
    </tr>
    <tr>
      <td><i>Entrées</i></td>
      <td>Aucune</td>
    </tr>
    <tr>
      <td><i>Sorties</i></td>
      <td>Aucune</td>
    </tr>
    <tr>
      <td><i>Situations spécifiques</i></td>
      <td>Aucune</td>
    </tr>
</table>

*17/07/2026* 5 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: SESAM-Vitale logo

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 FTE05 - Administrer le poste PS Version : 03.45*

# **2.3 Description détaillée des fonctions du sous-processus FTE05 : Administrer le poste PS**

## **2.3.1 FTE05.01 : Règles de paramétrage des informations liées au Transporteur**

### **Vue générale**

***Description*** Cette opération a pour objet de permettre le paramétrage par le Transporteur sur son LPS, ou par l’éditeur, de diverses informations liées à son identification et utilisées dans le processus d’élaboration des FEL. Ces données, une fois renseignées par le Transporteur, seront utilisées pour l’élaboration de chaque FEL, évitant ainsi leur ressaisie.

icon: warning L’enrichissement des paramètres de cette opération est imposé avant la première utilisation du LPS par le transporteur

***Entrées*** Aucune

***Sorties***
Identifiant émetteur des FEL EF_FTE91_01
Adresse mail émetteur des FEL EF_FTE91_02
Identifiant PS facturant les FEL EF_FTE91_03
Raison sociale PS facturant les FEL EF_FTE91_04
Adhésion à l’option conventionnelle du PS facturant les FEL EF_FTE91_05
Activation de la tarification majorée pour chaque entreprise de EF_FTE91_06
transport identifiée par son identifiant AM de PS exécutant

***Situations spécifiques*** Aucune

### **Règles de gestion**

#### ***[RG_FTE501] Paramétrer l’identifiant de l’émetteur des FEL (EF_FTE91_01)***

Le LPS doit permettre au Transporteur de paramétrer l’identifiant de l’émetteur des FEL.
Cette information est transmise dans chaque FEL (cf. RG_FTE211).

icon: arrow Dans le cas où l’émetteur du flux est le Transporteur, cet identifiant correspond à son identifiant A.M.

#### ***[RG_FTE502] Paramétrer l’adresse mail de l’émetteur des FEL (EF_FTE91_02)***

Le LPS doit permettre au Transporteur de paramétrer l’adresse mail de l’émetteur des FEL.
Cette information est transmise dans chaque FEL (cf. RG_FTE211).

#### ***[RG_FTE503] Paramétrer l’identifiant du PS facturant les FEL (EF_FTE91_03)***

Le LPS doit permettre au Transporteur de paramétrer l’identifiant du PS facturant les FEL.
Cette information est transmise dans chaque FEL (cf. RG_FTE212).

icon: arrow Cette information est également présente dans les données techniques d’appel de certains services (assertion PS).

*17/07/2026 6 / 15*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: logo

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
FACT-SFG-035 *FTE05 - Administrer le poste PS* *Version : 03.45*

## ***[RG_FTE504] Paramétrer la raison sociale du PS facturant les FEL (EF_FTE91_04)***

Le LPS doit permettre au Transporteur de paramétrer la raison sociale du PS facturant les FEL.

Cette information est transmise dans chaque FEL (cf. RG_FTE212).

## ***[RG_FTE505] Paramétrer l’adhésion à l’option conventionnelle du PS facturant les FEL (EF_FTE91_05)***

Le LPS doit permettre au Transporteur de paramétrer l’adhésion à l’option conventionnelle du PS facturant les FEL.

Cette information est utilisée pour la tarification de la FEL (cf. RG_FTE231).

## ***[RG_FTE506] Activer/désactiver la tarification majorée pour une entreprise de transport (EF_FTE91_06)***

Le LPS doit permettre – à l’éditeur uniquement – d’activer ou de désactiver la tarification majorée pour chaque entreprise de transport.

La tarification socle s’applique si ce paramétrage est désactivé.

Chaque entreprise de transport est identifiée par son identifiant AM de PS exécutant (EF_FTE61_01).

L’activation de la tarification majorée est soumise à l’accord de la CPAM de rattachement de chaque entreprise de transport.

En cas de constat d’anomalie et/ou de fraude, le retour à la tarification socle doit être possible à tout moment.

*17/07/2026* *7 / 15*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: SESAM-Vitale logo

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 *FTE05 - Administrer le poste PS* Version : 03.45*

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
*   WS_FT4 : « Déterminer les montants d’une prestation de transport » (utilisable uniquement si la tarification majorée est appliquée)

icon: icon
Ces paramétrages ne concernent pas le processus CONSULTER.
Les opérations de consultation (cf. FTE04) sont utilisées directement par le Transporteur, indépendamment des indicateurs d’activations définis ci-après.
Ces indicateurs d’activation concernent les opérations de FTE02 (FTE02.01 phase d’acquisition des informations préalables de facturation)

<table>
    <tr>
      <td><i><b>Entrées</b></i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
    <tr>
      <td rowspan="7"><i><b>Sorties</b></i></td>
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
      <td>Activation WS_FT4</td>
      <td>EF_FTE90_54</td>
    </tr>
    <tr>
      <td><i><b>Situations spécifiques</b></i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
</table>

*17/07/2026* *8 / 15*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 *FTE05 - Administrer le poste PS* Version : 03.45*

## **Règles de gestion**

### ***[RG_FTE511] Paramétrer l’appel à WS_PS1 (EF_FTE90_11)***

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_PS1 : « Acquérir les données PS par n° AM »

icon: icon Par défaut l’appel à ce service doit être activé.

icon: icon En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

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

icon: icon Par défaut l’appel à ce service doit être activé.

icon: icon En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3">FTE02.01 : Acquérir les informations préalables à la facturation</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE12_02</td>
      <td>Code spécialité PS exerçant dans l’établissement<br />de soins</td>
      <td><strong>RG_FTE201</strong></td>
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

icon: icon Par défaut l’appel à ce service doit être activé.

*17/07/2026* 9 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 FTE05 - Administrer le poste PS Version : 03.45*

icon: icon

En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="4">FTE02.01 : Acquérir les informations préalables à la facturation</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>N*</td>
      <td>EF_FTE14</td>
      <td>Personnel</td>
      <td rowspan="2"><strong>RG_FTE204</strong></td>
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

icon: icon

*\* : N signifie que plusieurs entités peuvent être présentes.*

## *[RG_FTE521] Paramétrer l’appel à WS_BS1 (EF_FTE90_21)*

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_BS1 : « Identifier un bénéficiaire »

icon: icon

Par défaut l’appel à ce service doit être activé.

icon: icon

En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3">FTE02.01 : Acquérir les informations préalables à la facturation</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE20_04</td>
      <td>Date de naissance</td>
      <td rowspan="2"><strong>RG_FTE202<br /><b>[Scénario PP]</b></strong></td>
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
      <th colspan="3">FTE02.01 : Acquérir les informations préalables à la facturation</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE20_04</td>
      <td>Date de naissance du bénéficiaire</td>
      <td rowspan="2"><strong>RG_FTE429</strong><br />appelée par<br /><strong>RG_FTE203</strong></td>
    </tr>
    <tr>
      <td>EF_FTE20_05</td>
      <td>Rang du bénéficiaire</td>
    </tr>
  </tbody>
</table>

Puis lors de l’élaboration de la FEL (opération FTE02.02), le Transporteur devra renseigner lui-même les données suivantes :

*17/07/2026* 10 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
FACT-SFG-035 *FTE05 - Administrer le poste PS Version : 03.45*

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

## *[RG_FTE522] Paramétrer l’appel à WS_BS2 (EF_FTE90_22)*

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_BS2 : « Acquérir les données d’un bénéficiaire »

icon Par défaut l’appel à ce service doit être activé.

icon En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

<table>
  <thead>
    <tr>
      <th colspan="3"><b><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></b></th>
      <td></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE22_01</td>
      <td>Code régime</td>
      <td rowspan="3"><b>RG_FTE202<br /><b>[Scénario PEL]</b><br />et<br />[Scénario PP]</b></td>
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
      <td rowspan="3"><b>RG_FTE202<br />[Scénario PP]</b></td>
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

## *[RG_FTE529] Paramétrer l’appel à WS_PEC1 (EF_FTE90_29)*

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_PEC1 : « Acquérir les modalités de prise en charge d’une prestation de transport »

icon Par défaut l’appel à ce service doit être activé.

icon En cas de désactivation de ce service, les informations préalables à la facturation (opération FTE02.01) ne seront pas renseignées :

*17/07/2026* 11 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035* *FTE05 - Administrer le poste PS* *Version : 03.45*

<table>
  <thead>
    <tr>
      <th colspan="3"><b><b>FTE02.01 : Acquérir les informations préalables à la facturation</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE28_01</td>
      <td>Code régime de prise en charge</td>
      <td rowspan="11"><b>RG_FTE203</b></td>
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
      <th colspan="3"><b>FTE02.02 : Elaborer la FEL</b></th>
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

*17/07/2026* 12 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: SESAM-Vitale logo

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 *FTE05 - Administrer le poste PS* Version : 03.45*

# **[RG_FTE554] Paramétrer l’appel à WS_FT4 (EF_FTE90_54)**

Le LPS doit permettre au Transporteur d’activer ou désactiver l’appel au service en ligne WS_FT4 : « Déterminer les montants d’une prestation de transport »

icon: icon Par défaut l’appel à ce service doit être activé si la tarification majorée est appliquée.

icon: icon L’appel à ce service doit être désactivé si la tarification socle est appliquée.

icon: icon En cas de désactivation de ce service, le LPS devra, lors de l’élaboration de la FEL (opération FTE02.02) déterminer les données suivantes :

<table>
  <thead>
    <tr>
      <th colspan="3"><b><b>FTE02.02 : Elaborer la FEL</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE62_12</td>
      <td>Distance facturée</td>
      <td><b>RG_FTE225</b></td>
    </tr>
    <tr>
      <td>EF_FTE62_03</td>
      <td>Montant du forfait</td>
      <td rowspan="2"><b>RG_FTE227</b></td>
    </tr>
    <tr>
      <td>EF_FTE65_03</td>
      <td>Majoration montant forfait</td>
    </tr>
    <tr>
      <td>EF_FTE62_06</td>
      <td>Montant Kilométrique</td>
      <td rowspan="2"><b>RG_FTE228</b></td>
    </tr>
    <tr>
      <td>EF_FTE65_05</td>
      <td>Majoration montant kilométrique</td>
    </tr>
    <tr>
      <td>EF_FTE62_07</td>
      <td>Montant majoration courte distance</td>
      <td><b>RG_FTE229</b></td>
    </tr>
    <tr>
      <td>EF_FTE62_09</td>
      <td>Montant abattement</td>
      <td><b>RG_FTE231</b></td>
    </tr>
    <tr>
      <td>EF_FTE64_11</td>
      <td>Montant remboursable AMO de la prestation</td>
      <td rowspan="3"><b>RG_FTE242</b></td>
    </tr>
    <tr>
      <td>EF_FTE64_12</td>
      <td>Montant remboursable AMC de la prestation (en <mark>CMU-C, ACS, C2S</mark>, AME ou AME-C)</td>
    </tr>
    <tr>
      <td>EF_FTE64_13</td>
      <td>Reste à charge assuré de la prestation</td>
    </tr>
  </tbody>
</table>

## **2.3.3 FTE05.03 : Règles de paramétrage des données techniques A.M. du processus de facturation**

### **Vue générale**

<table>
    <tr>
      <td><i><b>Description</b></i></td>
      <td>Cette opération a pour objet de permettre le paramétrage de diverses informations techniques utilisées par le LPS dans l’ensemble du système FTE.<br /><br />Les évolutions de ces informations sont communiquées par l’Assurance Maladie.</td>
      <td></td>
    </tr>
    <tr>
      <td><i><b>Entrées</b></i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
    <tr>
      <td rowspan="7"><i><b>Sorties</b></i></td>
      <td>Taille maximale d’un fichier PDF (SCOR)</td>
      <td>EF_FTE92_01</td>
    </tr>
    <tr>
      <td>Plage des valeurs des n° de lot</td>
      <td>EF_FTE92_02<br />à EF_FTE92_09</td>
    </tr>
    <tr>
      <td>Nombre maximum de trajets <mark><u>(ou prestations)</u></mark> par FEL</td>
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
      <td><mark><u>Taux de remboursement d’un TUPH</u></mark></td>
      <td><mark><u>EF_FTE92_13</u></mark></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><i><b>Situations spécifiques</b></i></td>
      <td>Aucune</td>
      <td></td>
    </tr>
</table>

17/07/2026 13 / 15
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
FACT-SFG-035 *FTE05 - Administrer le poste PS* *Version : 03.45*

## **Règles de gestion**

### *[RG_FTE591] Paramétrer les plages de n° de lot (EF_FTE92_02 à EF_FTE92_09)*

Les plages de n° de lot sont utilisées par la règle RG_FTE287 « Déterminer le n° de lot de la FEL » lors de la validation de la FEL (opération FTE02.04).

icon: icon En première version du système FTE, les valeurs à utiliser sont les suivantes :

<table>
  <thead>
    <tr>
      <th><strong><b>Référence</b></strong></th>
      <th><strong><b>Libellé</b></strong></th>
      <th><strong><b>Valeur</b></strong></th>
      <th><strong><b>Date d’effet</b></strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EF_FTE92_02</td>
      <td>Minimum Plage 1</td>
      <td><strong>001</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_03</td>
      <td>Maximum Plage 1</td>
      <td><strong>250</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_04</td>
      <td>Minimum Plage 2</td>
      <td><strong>251</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_05</td>
      <td>Maximum Plage 2</td>
      <td><strong>500</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_06</td>
      <td>Minimum Plage 3</td>
      <td><strong>501</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_07</td>
      <td>Maximum Plage 3</td>
      <td><strong>750</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_08</td>
      <td>Minimum Plage 4</td>
      <td><strong>751</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
    <tr>
      <td>EF_FTE92_09</td>
      <td>Maximum Plage 4</td>
      <td><strong>999</strong></td>
      <td><strong>01/09/13</strong></td>
    </tr>
  </tbody>
</table>

icon: icon Ces valeurs pourront évoluer dans le temps. Le LPS doit donc permettre leur modification.

### *[RG_FTE593] Paramétrer le nombre maximum de trajets <u>(ou prestations)</u> par FEL (EF_FTE92_10)*

Le nombre maximum de trajets (ou prestations) pouvant composer une FEL est contrôlé lors de l’élaboration de la FEL (FTE02.02.04), la taille des messages du SEFi devant être limitée.

icon: icon Par défaut, le nombre maximum de trajets par FEL est fixé à 20.

icon: icon Cette valeur peut évoluer dans le temps : le LPS doit permettre la modification de ce paramètre.

### *[RG_FTE594] Paramétrer le délai maximum d’envoi des PJ (EF_FTE92_11)*

Il s’agit du délai entre la date de création du lot de FE et la date démission du lot de PJ SCOR correspondant. Ce délai est utilisé pour la supervision du poste (FTE06.01)

icon: icon Par défaut, le délai maximum d’envoi des PJ est de 48h.

icon: icon Cette valeur peut évoluer dans le temps : le LPS doit permettre la modification de ce paramètre.

### *[RG_FTE595] Activer/désactiver le positionnement par défaut du TP AMO (EF_FTE92_12)*

Le LPS doit permettre au Transporteur d’activer ou désactiver le positionnement par défaut du TP AMO dans les situations définies dans la TB222.

*17/07/2026* *14 / 15*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon

*SFG - Facturation Transporteur Etendue - Transporteur Sanitaire*
*FACT-SFG-035 *FTE05 - Administrer le poste PS* Version : 03.45*

Par défaut ce top activation par défaut du TP AMO (EF_FTE92_12) est à « OUI », le Transporteur pouvant toujours le modifier et désactiver le positionnement par défaut par le LPS du TP AMO.

icon: icon

A noter que ce positionnement par défaut est effectué :

*   dans la règle RG_FTE222[57.03] en s’appuyant sur les conditions de contexte réglementaire réunies dans la table TB222,
*   et uniquement dans la mesure où le top de activation du positionnement par défaut du TP AMO est à « OUI ».

### <mark>**[RG_FTE596] *Paramétrer le taux de remboursement d’un TUPH (EF_FTE92_13)***</mark>

<mark><u>Par défaut ce taux est égal à 100% (à la charge de l’AMO).</u></mark>

<mark><u>Cette valeur peut évoluer dans le temps : le LPS doit permettre la modification de ce paramètre.</u></mark>

## **2.3.4** <mark>**FTE05.05 : Historisation des requêtes et des réponses des services**</mark>

<mark>**<u>Vue générale</u>**</mark>

**<u>*Entrées*</u>** <mark><u>Toutes les requêtes et toutes les réponses des services WS_FT2 et WS_FT3.</u></mark>
**<u>*Sorties*</u>** <mark><u>Requêtes et réponses historisées</u></mark>
**<u>*Situations spécifiques*</u>** <mark><u>Aucune</u></mark>

<mark>**<u>Règles de gestion</u>**</mark>

### <mark>**[RG_FTE597] *Historiser les requêtes et les réponses des services***</mark>

<mark><u>Les LPS doit pouvoir historiser pendant 12 mois toutes les requêtes et toutes les réponses des services suivants :</u></mark>

*   <mark><u>WS_FT2 : Vérifier la recevabilité d’une FEL</u></mark>
*   <mark><u>WS_FT3 : Valider une FEL</u></mark>

<mark><u>Cet historisation doit être activable par le transporteur ou par l’éditeur pour chacun des services.</u></mark>

<mark><u>Une société de transports doit être en capacité de présenter ces éléments sur demande de l’Assurance Maladie.</u></mark>

*17/07/2026* *15 / 15*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: icon