**FTE**

![logo: sesam-vitale](page_1_image_1_v2.jpg)



*Guide d'Intégration*

# **Facturation Transporteur Étendue**
# ***Taxi***

## **WS_PEC - Services en Ligne "Prise en Charge"**

Référence : SEL-MP-016 / Version : 03.39 / Date : 18/06/2026
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

*MP - Facturation Transporteur Étendue - Taxi*
SEL-MP-016 *WS_PEC - Services en Ligne "Prise en Charge"* Version : 03.39

## **TABLES DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>INTRODUCTION.........................................................................................................................................4</strong></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>LE SERVICE WS_PEC : PRISE EN CHARGE ............................................................................................4</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>1.1.1 Contexte .................................................................................................................................4</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>1.1.2 Pré-requis ...............................................................................................................................4</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>1.1.3 Evolutions à venir...................................................................................................................4</em></td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>DOCUMENT DE RÉFÉRENCE ....................................................................................................................4</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>ABRÉVIATIONS.......................................................................................................................................4</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>CINÉMATIQUE ET ASPECTS FONCTIONNELS......................................................................................5</strong></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>WS_PEC1 : ACQUÉRIR LES MODALITÉS DE PRISE EN CHARGE D’UNE PRESTATION DE TRANSPORT ............5</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.1.1 Présentation fonctionnelle du service.....................................................................................5</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.1.2 Données en entrée du service ...............................................................................................5</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.1.3 Données en sortie du service .................................................................................................7</em></td>
    </tr>
    <tr>
      <td><strong>3</strong></td>
      <td><strong>ÉLÉMENTS TECHNIQUES SPÉCIFIQUES AU SERVICE .......................................................................8</strong></td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>LES COMPOSANTS DU POSTE DE TRAVAIL ................................................................................................8</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>MISE EN ŒUVRE ....................................................................................................................................9</td>
    </tr>
    <tr>
      <td>3.3</td>
      <td>ENVIRONNEMENTS DE TRAVAIL .............................................................................................................11</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.3.1 Environnement de test .........................................................................................................11</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.3.2 Environnement de production ..............................................................................................11</em></td>
    </tr>
    <tr>
      <td>3.4</td>
      <td>OPÉRATION WS_PEC1 « CALCULER » ................................................................................................11</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.4.1 REQ_PEC1 « SE_ACQMODALITEPECTRANSP »............................................................11</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.4.2 REP_PEC1 « SE_MODALITEPECTRANSP » ....................................................................12</em></td>
    </tr>
</table>

## **TABLE DES ILLUSTRATIONS**

Aucune entrée de table d'illustration n'a été trouvée.

## **TABLE DES ANNEXES**

<table>
    <tr>
      <td><b>ANNEXE 1</b></td>
      <td><b>MESSAGES D’ERREUR .....................................................................................................14</b></td>
    </tr>
</table>




VERSION DE TRAVAIL

*18/06/2026* 3 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_3_image_1_v2.jpg)

*MP - Facturation Transporteur Étendue - Taxi*
SEL-MP-016 *WS_PEC - Services en Ligne "Prise en Charge"* Version : 03.39

# **1 Introduction**

## **1.1 Le service WS_PEC : Prise en Charge**

### **1.1.1 Contexte**

Le service Prise en Charge, dénommé également WS_PEC, permet à un LPS Transporteur d’acquérir les informations de prise en charge d’une prestation décrite sur une prescription transporteur.

Ce service propose une opération :

WS_PEC1 : Calculer

![icon: icon](page_4_image_1_v2.jpg) Les noms de message et d’opération présentés au chapitre 2 (partie fonctionnelle) sont utilisés comme identifiant dans les messages au chapitre 3 (partie technique)

### **1.1.2 Pré-requis**

Le LPS doit disposer de données d’identification du bénéficiaire ainsi que des données de la prescription de transport et de la date de réalisation du transport pour solliciter les opérations du service WS_PEC1.

### **1.1.3 Evolutions à venir**

Dans les prochaines versions, l’accès au service WS_PEC prendra en compte les assurés de tous les régimes obligatoires.

## **1.2 Document de référence**

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
      <td>[CI]</td>
      <td>Cadre d’interopérabilité des<br />téléservices intégrés</td>
      <td>CI-CNAMTS-DC v1.0.2</td>
    </tr>
    <tr>
      <td>[DICO]</td>
      <td>Services en Ligne "Prise en Charge"<br />du système FTE</td>
      <td>FACT-SFG-029</td>
    </tr>
  </tbody>
</table>

## **1.3 Abréviations**

Cf. Document FACT-SFG-029 : Dictionnaire




VERSION DE TRAVAIL

*18/06/2026* 4 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_4_image_2_v2.jpg)

*MP - Facturation Transporteur Étendue - Taxi*
SEL-MP-016 *WS_PEC - Services en Ligne "Prise en Charge" Version : 03.39*

# **2 Cinématique et aspects fonctionnels**

## **2.1 WS_PEC1 : Acquérir les modalités de prise en charge d’une prestation de transport**

### **2.1.1 Présentation fonctionnelle du service**

**Description**

Cette opération fournit à l’appelant des informations de prise en charge AMO d’une prestation de transport, déterminées à partir des informations connues au niveau des référentiels de l’AMO et destinées à être intégrées dans une FEL.

**Références techniques**

***Opération***

<table>
    <tr>
      <td>WS_PEC1</td>
      <td>Calculer</td>
    </tr>
</table>

***Messages***

<table>
  <caption><i>Messages</i></caption>
    <tr>
      <td>REQ_PEC1</td>
      <td>SE_ACQMODALITEPECTRANSP</td>
    </tr>
    <tr>
      <td>REP_PEC1</td>
      <td>SE_MODALITEPECTRANSP</td>
    </tr>
</table>

### **2.1.2 Données en entrée du service**

<table>
  <thead>
    <tr>
      <th><b>référence</b></th>
      <th><b>Libellé</b></th>
      <th>Description</th>
      <th><b>O/F</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>DE_PEC1_01</b></strong></td>
      <td>NIR de l’ouvrant droit</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_02</b></strong></td>
      <td>Clé du NIR de l’ouvrant droit</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_03</b></strong></td>
      <td>Date de naissance du bénéficiaire</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_04</b></strong></td>
      <td>Rang du bénéficiaire</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_05</b></strong></td>
      <td>Date de prescription</td>
      <td>La date de prescription doit être :<br /><br />- antérieure ou égale à la date d’évaluation,<br /><br />- antérieure ou égale à la date du jour,<br /><br />- postérieure ou égale à la date de naissance du bénéficiaire.<br /><br />Par ailleurs, si les soins sont en rapport avec un ATMP, la date de prescription doit être postérieure ou égale à la date de l’ATMP.</td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_06</b></strong></td>
      <td>Mode de transport</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_07</b></strong></td>
      <td>Indicateur « soins en rapport avec ALD exonérante »</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_08</b></strong></td>
      <td>Indicateur « soins en rapport avec l’article L115 »</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_09</b></strong></td>
      <td>Indicateur « prise en charge à 100% »</td>
      <td></td>
      <td>O</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026* 5 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: SESAM-Vitale logo](page_5_image_1_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
Version : 03.39

<table>
  <thead>
    <tr>
      <th><b>référence</b></th>
      <th><b>Libellé</b></th>
      <th><b>Description</b></th>
      <th><b>O/F</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>DE_PEC1_10</b></strong></td>
      <td>Indicateur « soins en rapport avec ATMP »</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_11</b></strong></td>
      <td>Date ATMP</td>
      <td>La date d’accident du travail est obligatoire si l’indicateur «soins en rapport avec ATMP» est positionné.<br /><br />La date d’accident doit être inférieure ou égale à la date de prescription.<br /><br />Lorsque l’indicateur «soins en rapport avec ATMP» n’est pas positionné, la date de l’ATMP est nécessairement non renseignée.<br /><br /><u>Remarque</u> : en cas d’ATMP, soit la date de l’ATMP, soit l’identifiant AT est renseigné.</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_12</b></strong></td>
      <td>Identifiant AT</td>
      <td>L’identifiant AT est obligatoire si l’indicateur ATMP est positionné.<br /><br />Lorsque l’indicateur «soins en rapport avec ATMP» n’est pas positionné, l’identifiant AT est nécessairement non renseigné.<br /><br /><u>Remarque</u> : en cas d’ATMP, soit la date de l’ATMP, soit l’identifiant AT est renseigné.</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC1_13</b></strong></td>
      <td>Date d’évaluation</td>
      <td>Cette date correspond à la date de réalisation de la prestation.<br /><br />Elle doit être :<br />- postérieure ou égale à la date de prescription,<br />- antérieure ou égale à la date du jour,<br />- dans le délai de 2 ans + 3 mois par rapport à la date du jour (délai de forclusion).<br /><br />Par ailleurs, si les soins sont en rapport avec un ATMP, la date de réalisation doit être postérieure ou égale à la date de l’ATMP.<br /><br /><u>Remarque</u> : la date de réalisation de la prestation doit également être postérieure ou égale à la date de naissance du bénéficiaire. Cependant, ce contrôle n’est pas spécifié ici, car il est couvert de fait par le contrôle entre la date de naissance et la date de prescription.</td>
      <td>O</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026*
*6 / 17*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: GIE SESAM-Vitale logo](page_6_image_1_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

## **2.1.3** **Données en sortie du service**

<table>
  <thead>
    <tr>
      <th><b>référence</b></th>
      <th>Libellé</th>
      <th><b>Description</b></th>
      <th><b>O/F</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>DS_PEC1_01</b></strong></td>
      <td>Code régime de prise en charge</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_02</b></strong></td>
      <td>Code caisse gestionnaire de prise en charge</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_03</b></strong></td>
      <td>Code centre gestionnaire de prise en charge</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_04</b></strong></td>
      <td>Nature d’assurance</td>
      <td>AS : Maladie<br />MA : Maternité<br />ATMP : Accident du Travail</td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_05</b></strong></td>
      <td>Date de maternité</td>
      <td>La date de maternité est renseignée uniquement en cas de nature d’assurance maternité.</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_06</b></strong></td>
      <td>Rang du bénéficiaire</td>
      <td></td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_07</b></strong></td>
      <td>Contrat AMO particulier</td>
      <td>BASE : Maladie<br />ALM : Régime Local Alsace-Moselle<br />FSV : Fond de Solidarité Vieillesse</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_08</b></strong></td>
      <td>Indicateur de situation particulière</td>
      <td><u>CMU-C</u> : <del>CMU complémentaire C2S</del><br />AME : Aide Médicale d’Etat<br /><del>ACS A : Aide à la Complémentaire Santé Contrat A</del><br /><del>ACS B : Aide à la Complémentaire Santé Contrat B</del><br /><del>ACS C : Aide à la Complémentaire Santé Contrat C</del><br />AMC : Organisme Complémentaire privé</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_09</b></strong></td>
      <td>TP réglementaire</td>
      <td>« O » : situation réglementaire induisant une dispense d’avance de frais sur les parts AMO et AMC<br />« N » : pas de situation réglementaire induisant une dispense d’avance de frais sur les parts AMO et AMC</td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_10</b></strong></td>
      <td>Justificatif d’exonération</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_11</b></strong></td>
      <td>Taux applicable à la prestation</td>
      <td></td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong>DS_PEC1_E99</strong></td>
      <td>Message</td>
      <td>Message d’information</td>
      <td>F</td>
    </tr>
    <tr>
      <td><strong><b>DS_PEC1_E99.02</b></strong></td>
      <td>Libellé Message</td>
      <td>Libellé du Message d’information</td>
      <td>O</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026*
7 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: GIE SESAM-Vitale logo](page_7_image_1_v2.jpg)

*MP - Facturation Transporteur Étendue - Taxi*
SEL-MP-016 *WS_PEC - Services en Ligne "Prise en Charge" Version : 03.39*

# 3 **Éléments techniques spécifiques au service**

Les mécanismes techniques mis en œuvre sont décrits dans le cadre d'interopérabilité, version 1.0.2 minimum. Ce chapitre traite uniquement des spécificités de ce téléservice.

![icon: icon](page_8_image_1_v2.jpg) Le cadre d’interopérabilité contient toutes les informations techniques qu’il est nécessaire de prendre en compte pour l’intégration d’un téléservice à un progiciel de santé.
La section présente décrit quant à elle tous les éléments **spécifiques au service**, et rien que ces éléments.
Vous devez donc vous appuyer sur les deux documents pour avoir la totalité des informations nécessaires.

![icon: icon](page_8_image_2_v2.jpg) Les formats, plages de valeurs et types des données spécifiés dans le présent document sont présentés à titre indicatif. Ils peuvent être amenés à évoluer. Seuls les schémas XSD constituent la référence des échanges.

![icon: icon](page_8_image_3_v2.jpg) Les formats des données sont décrits dans le cadre d’interopérabilité.

Deux formats supplémentaires sont susceptibles d’être utilisés dans le service :

<table>
  <thead>
    <tr>
      <th><b>Code</b></th>
      <th><b>Signification</b></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>ND</td>
      <td>Nombre Décimal.<br /><br />Le format ND est conforme à la définition de la norme XML schémas xsd:decimal (avec utilisation du point comme séparateur).<br /><br />Exemple : «999.50», «+999.5450», «-999.5230», «14», etc.</td>
      <td></td>
    </tr>
    <tr>
      <td>T</td>
      <td>Le format T est de type hh:mm:ss±hh:mm. (ISO 8601, Local time, Extended format).<br /><br />+hh:mm/-hh:mm : Décalage par rapport à l'heure UTC.<br /><br /><mark><s>Exemple : «15:27:46+01:00».</s></mark><br /><br /><mark><s><u>En absence de consigne spécifique, l’heure est exprimée en heure locale avec décalage horaire UTC.</u></s></mark><br /><br /><mark>Il est demandé de ne pas indiquer le décalage par rapport à l’heure UTC.</mark><br /><br /><mark>Par exemple, pour une heure locale de 15h27, indiquer dans le flux « 15:27:00 » au lieu de « 15:27:00+2 :00 ».</mark></td>
      <td></td>
    </tr>
  </tbody>
</table>

## **3.1** **Les composants du poste de travail**

Le poste de travail doit disposer de composants permettant au progiciel d'accéder aux cartes à puces.

Les composants d'accès liés à la carte CPx sont les librairies cryptographiques (CryptoLib) de l'ANS.

Grâce aux données obtenues des cartes, le progiciel formate ses requêtes et les envoie sur une liaison sécurisée préalablement établie.

![icon: icon](page_8_image_4_v2.jpg) Toutes les documentations des produits cités ci-dessus sont disponibles sur l’Espace Industriels du GIE SESAM-Vitale ou le site de l’ANS.




VERSION DE TRAVAIL

*18/06/2026* 8 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_8_image_5_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

## **3.2** **Mise en œuvre**

![icon: icon](page_9_image_4_v2.jpg) Voir cadre d’interopérabilité – volet «Web-service», chapitre «Liaison sécurisée avec authentification du téléservice».

![icon: icon](page_9_image_2_v2.jpg) Voir cadre d’interopérabilité – Document « Assertions et contexte ».

![icon: icon](page_9_image_3_v2.jpg) Le document « Assertions et contexte » du cadre d’interopérabilité fixe les champs des assertions et des contextes à renseigner obligatoirement.

**Occurrences des**
**en-têtes et**
**requêtes**

<table>
  <thead>
    <tr>
      <th colspan="2">Opération</th>
      <th colspan="3"><b>Assertion / contexte</b></th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th>PS</th>
      <th>LPS</th>
      <th>BAM</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>WS_PEC1</td>
      <td>Calculer</td>
      <td>X</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>
<u>Légende</u> : X = obligatoire

**Niveaux de**
**sécurité des**
**assertions**

Un contrôle est effectué sur les niveaux de sécurité des assertions, en référence au cadre d’interopérabilité (à partir de la version 1.0.2), volet «Web-service», chapitre «Niveau de contrôle des assertions».

<table>
  <thead>
    <tr>
      <th colspan="2">Opération</th>
      <th>Assertion</th>
    </tr>
    <tr>
      <th colspan="2"></th>
      <th>PS</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>WS_PEC1</td>
      <td>Calculer</td>
      <td>Niveau 2</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026*
9 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_9_image_1_v2.jpg)

SEL-MP-016
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
Version : 03.39

# **Renseignement des Assertions et Contextes**

Le tableau ci-dessous présente pour chaque opération, les champs à renseigner dans les en-têtes <u>**en plus**</u> des champs obligatoires décrits dans le cadre d’interopérabilité :

<table>
  <thead>
    <tr>
      <th rowspan="2"><b>Assertion</b><br />/<br />Contexte</th>
      <th rowspan="2" colspan="5"><b>Champs</b></th>
      <th rowspan="2">Renseignement</th>
      <th><b>Calculer</b></th>
    </tr>
    <tr>
      <th>WS_PEC1</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2">AssertionPS</td>
      <td colspan="5">AttributeStatement</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">identifiantFacturation</td>
      <td>N° de facturation + clé<br />renseignés par le Transporteur</td>
      <td>X</td>
    </tr>
    <tr>
      <td rowspan="10">Contexte BAM</td>
      <td colspan="5">DateRef</td>
      <td>Date de réalisation de la<br />prestation<br /><u>ATTENTION</u> : cet élément doit<br />être identique à DE_PEC1_13</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5">COUVERTURE</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">GrandRegime</td>
      <td>Code régime</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">ASSURE</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="3">Id</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2">Num</td>
      <td>NIR de l’ouvrant droit<br /><u>ATTENTION</u> : cet élément doit<br />être identique à DE PEC1_01</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2">Cle</td>
      <td>Clé du NIR de l’ouvrant droit<br /><u>ATTENTION</u> : cet élément doit<br />être identique à DE PEC1_02</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5">BENEFICIAIRE</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">DateNai</td>
      <td>Date de naissance du<br />bénéficiaire<br /><u>ATTENTION</u> : cet élément doit<br />être identique à DE PEC1_03</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">Rang</td>
      <td>Rang du bénéficiaire<br /><u>ATTENTION</u> : cet élément doit<br />être identique à DE PEC1_04</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

Pour appeler les services de facturation en ligne, le progiciel doit obtenir les données CPx par lecture de la carte.

### ***Cas particulier Utilisation en multi-sociétés***

Dans le cas d’une utilisation en multi-sociétés, l’identifiant de facturation de l’assertion PS doit correspondre au n° de facturation du PS facturant (**société mandante**) ou du PS émetteur (**société mandataire**) selon les organisations en place.

*18/06/2026*
*10 / 17*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: dots](page_10_image_1_v2.jpg)

SEL-MP-016
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

# **3.3** **Environnements de travail**

Deux environnements sont disponibles : un environnement de test et un environnement de production. Le passage de l’un à l’autre implique des changements de configuration qui ont un impact sur les flux XML échangés au sein de l’infrastructure.

## **3.3.1** **Environnement de test**

**URL d’appel**
L’URL d’appel est : [https://qualiflps.services-ps.ameli.fr/lps](https://qualiflps.services-ps.ameli.fr/lps)

**Numéro**
**d’autorisation**
Vous devez utiliser le numéro d’autorisation de test fourni par le CNDA lors de la signature des conditions particulières de la convention.

Le type du numéro d’autorisation à utiliser dans le flux XML est «4» (voir chapitre 3.1 du volet «Assertions et contextes» du cadre d’interopérabilité).

Pour plus d'informations, voir le guide de tests de conformité du CNDA, chapitre «Pré-requis».

## **3.3.2** **Environnement de production**

**URL d’appel**
L’URL d’appel est : [https://services-ps.ameli.fr/lps](https://services-ps.ameli.fr/lps)

**Numéro**
**d’autorisation**
Vous devez utiliser le numéro d’autorisation définitif obtenu auprès du CNDA à l’issue de la procédure d’autorisation.

Le type du numéro d’autorisation à utiliser dans le flux XML est «4» (voir chapitre 3.1 du volet «Assertions et contextes» du cadre d’interopérabilité).

# **3.4** **Opération WS_PEC1 « Calculer »**

## **3.4.1** **REQ_PEC1 « SE_ACQMODALITEPECTRANSP »**

<table>
  <thead>
    <tr>
      <th><strong><b>Balises XML</b></strong><br /><i>Italique : attribut</i></th>
      <th><strong>Occ</strong></th>
      <th><strong>Format</strong></th>
      <th><strong>Donnée fonctionnelle</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>PRESCRIPTION</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    DatePrescription</td>
      <td>1</td>
      <td>D</td>
      <td>DE_PEC1_05</td>
    </tr>
    <tr>
      <td>    <strong><b>PATIENT</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        DateNai</td>
      <td>1</td>
      <td>DL</td>
      <td>DE_PEC1_03</td>
    </tr>
    <tr>
      <td>        RangNai</td>
      <td>1</td>
      <td>N</td>
      <td>DE_PEC1_04</td>
    </tr>
    <tr>
      <td>        <strong><b>COUVERTURE</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>            <strong><b>ASSURE</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>                Id</td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>                    Num</td>
      <td>1</td>
      <td>AN</td>
      <td>DE_PEC1_01</td>
    </tr>
    <tr>
      <td>                    Cle</td>
      <td>1</td>
      <td>AN</td>
      <td>DE_PEC1_02</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026*
11 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: dots](page_11_image_1_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

<table>
  <thead>
    <tr>
      <th><b>Balises XML</b><br /><i>Italique : attribut</i></th>
      <th>Occ</th>
      <th>Format</th>
      <th>Donnée fonctionnelle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>EltTransport</td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    ModeTransport</td>
      <td>1</td>
      <td>AN</td>
      <td>DE_PEC1_06</td>
    </tr>
    <tr>
      <td>    <b><b>CONTEXTETRANSPORT</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        Motif</td>
      <td>0..n</td>
      <td>AN</td>
      <td>Valeur :<br />- ALD si DE_PEC1_07<br />- L115 si DE_PEC1_08<br />- CDP100 si DE_PEC1_09<br />- AT si DE_PEC1_10</td>
    </tr>
    <tr>
      <td>        IdentifiantAT</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DE_PEC1_12</td>
    </tr>
    <tr>
      <td>        DateATMP</td>
      <td>0..1</td>
      <td>D</td>
      <td>DE_PEC1_11</td>
    </tr>
    <tr>
      <td>        DateRealisation</td>
      <td>1</td>
      <td>D</td>
      <td>DE_PEC1_13</td>
    </tr>
  </tbody>
</table>

## **3.4.2**       **REP_PEC1 « SE_MODALITEPECTRANSP »**

Le tableau ci-dessous correspond au détail de l’enveloppe «Body» qui contient 1 ou 2 occurrences COUVERTURE :

•  L’une correspond au contrat AMO et donc à la part obligatoire de la facture,
•  L’autre correspond au contrat AMC et donc à la part complémentaire de la facture.

### Dans le bloc COUVERTURE :

•  Le champ **IdOrg** est exclusif des 3 champs **GrandRégime, Organisme, EntiteGestion** ;
•  Le champ **contrat** du bloc CONTRATS correspond :
    ○ dans l’occurrence COUVERTURE AMO au contrat AMO (DS_PEC1_07),
    ○ dans l’occurrence COUVERTURE AMC au contrat AMC (DS_PEC1_08).

<table>
  <thead>
    <tr>
      <th><b>Balises XML</b><br /><i>Italique : attribut</i></th>
      <th><b>Occ</b></th>
      <th><b>Format</b></th>
      <th><b>Donnée fonctionnelle</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>FACTURE</b></b></td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    <b><b>BENEFICIAIRE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        RangBen</td>
      <td>0..1</td>
      <td>N</td>
      <td>DS_PEC1_06</td>
    </tr>
    <tr>
      <td>    <b>COUVERTURE</b></td>
      <td>1..2</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        IdOrg</td>
      <td>1..1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td>        GrandRegime</td>
      <td>1..1</td>
      <td>AN</td>
      <td>DS_PEC1_01</td>
    </tr>
    <tr>
      <td>        Organisme</td>
      <td>1..1</td>
      <td>AN</td>
      <td>DS_PEC1_02</td>
    </tr>
    <tr>
      <td>        EntiteGestion</td>
      <td>1..1</td>
      <td>AN</td>
      <td>DS_PEC1_03</td>
    </tr>
    <tr>
      <td>        Nature</td>
      <td>1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td>        <b>CONTRATS</b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>            <i>Id</i></td>
      <td>1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td>            Contrat</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC1_07 si contrat AMO<br />DS_PEC1_08 si contrat AMC</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026*
12 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: dots](page_12_image_1_v2.jpg)

*MP - Facturation Transporteur Étendue - Taxi*
SEL-MP-016 *WS_PEC - Services en Ligne "Prise en Charge"* *Version : 03.39*

<table>
  <thead>
    <tr>
      <th colspan="7">
        <strong>**Balises XML**</strong><br />
        <i>Italique : attribut</i>
      </th>
      <th>Occ</th>
      <th>Format</th>
      <th>Donnée fonctionnelle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="4">NatureAssurance</td>
      <td>1</td>
      <td>AN</td>
      <td>DS_PEC1_04</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="4">CadreReglement</td>
      <td>1</td>
      <td>AN</td>
      <td>DS_PEC1_09</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="5"><strong><b>CONTEXTE</b></strong></td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="4">DateMaternite</td>
      <td>0..1</td>
      <td>D</td>
      <td>DS_PEC1_05</td>
    </tr>
    <tr>
      <td colspan="7"><strong><b>CADRE</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6"><strong><b>EXECUTION</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="5"><strong><b>SERVICE</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="4"><strong><b>RMB</b></strong></td>
      <td>1..n</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="3">Exo</td>
      <td>1</td>
      <td>AN</td>
      <td>DS_PEC1_10</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="3">Part</td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2">Tux</td>
      <td>1</td>
      <td>ND</td>
      <td>DS_PEC1_11</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="3"><strong><b>CONTRAT</b></strong></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2"><i>Id</i></td>
      <td>1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td colspan="7"><strong><b>MESSAGE</b></strong></td>
      <td>0..n</td>
      <td></td>
      <td>DS_PEC1_E99</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Libelle</td>
      <td>1</td>
      <td>AN</td>
      <td>DS_PEC1_E99.02</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026* *13 / 17*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: SESAM-Vitale logo](page_13_image_1_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

# **Annexe 1 Messages d’erreur**

## **Erreurs techniques**

En cas d’erreur remontée par le service, le progiciel affiche une fenêtre contenant le libellé de l’erreur, sans traitement, et suivi du code entre parenthèses.

Le code erreur est préfixé par le nom de l'espace de nommage.

Par exemple, pour une déclaration xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope", le code erreur est préfixé par soapenv (par exemple : soapenv:10).

![icon: icon](page_14_image_2_v2.jpg) Attention, le nom de l'espace de nommage peut varier.

Le tableau suivant vient compléter la liste des erreurs du cadre d’interopérabilité. De type « SOAP FAULT », ces erreurs sont propres au service WS_PEC et reprennent les principes de ce dernier.

![icon: icon](page_14_image_1_v2.jpg) La liste des messages d’erreur décrits ci-dessous est évolutive.

<table>
  <thead>
    <tr>
      <th colspan="6"><b>SOAP Fault</b></th>
    </tr>
    <tr>
      <th colspan="2">Code</th>
      <th rowspan="2"><b>Reason</b></th>
      <th colspan="3"><b>Detail</b></th>
    </tr>
    <tr>
      <th>Value</th>
      <th>Subcode</th>
      <th>Code</th>
      <th><b>Severite</b></th>
      <th><b>Descriptif</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="4">Sender</td>
      <td>pec_ps_8</td>
      <td>Ce service n'est pas ouvert pour cette nature de prestation</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_10</td>
      <td>La date de réalisation est antérieure à la date de prescription</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_12</td>
      <td>Pour les soins en rapport avec le L 115, merci d'adresser les pièces papiers à la CNMSS, Département des soins médicaux gratuits, 247 avenue Jacques Cartier, 83090 Toulon Cedex 9</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_13</td>
      <td>Le bénéficiaire est inconnu pour cet assuré.<br /><br />Veuillez vérifier sa date de naissance ou,<br /><br />le cas échéant, vous rapprocher de celui-ci.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>Sender</td>
      <td>pec_ps_15</td>
      <td>Le NIR renseigné est inconnu. Veuillez demander l'attestation de l'assuré afin de connaître sa caisse d'affiliation et vérifier son numéro d'immatriculation.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
  </tbody>
</table>





VERSION DE TRAVAIL

*18/06/2026*
*14 / 17*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: icon](page_14_image_3_v2.jpg)

*SEL-MP-016* *MP - Facturation Transporteur Étendue - Taxi* *Version : 03.39*
*WS_PEC - Services en Ligne "Prise en Charge"*

<table>
  <thead>
    <tr>
      <th colspan="6"><b>SOAP Fault</b></th>
    </tr>
    <tr>
      <th colspan="2">Code</th>
      <th rowspan="2"><b>Reason</b></th>
      <th colspan="3"><b>Detail</b></th>
    </tr>
    <tr>
      <th>Value</th>
      <th>Subcode</th>
      <th>Code</th>
      <th><b>Severite</b></th>
      <th><b>Descriptif</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="11"></td>
      <td>pec_ps_17</td>
      <td>Les champs obligatoires ne sont pas renseignés</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_18</td>
      <td>La date de prescription est antérieure à la date de naissance du patient. Veuillez vérifier sa valeur.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_19</td>
      <td>Pas de réponse possible à ce jour. Ce régime sera intégré au service prochainement.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_20</td>
      <td>Date de début de prestation antérieure à 2 ans + 3 mois</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_21</td>
      <td>La date de réalisation est postérieure à la date de décès du patient. Veuillez vérifier sa valeur.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_22</td>
      <td>La date de réalisation est antérieure à la date de naissance du patient. Veuillez vérifier sa valeur.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_23</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_31</td>
      <td>La date de naissance est postérieure à la date de détermination des droits</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_32</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_33</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_34</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td rowspan="4">Sender</td>
      <td>pec_ps_37</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_39</td>
      <td>La donnée clé du NIR est incorrecte</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_40</td>
      <td>Le bénéficiaire n'a pas de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_41</td>
      <td>Le régime [nom du régime] ne gère pas les AT/MP</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
  </tbody>
</table>




VERSION DE TRAVAIL

*18/06/2026* *15 / 17*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

![icon: decorative dots](page_15_image_1_v2.jpg)

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

<table>
  <thead>
    <tr>
      <th></th><th colspan="5"><b>SOAP Fault</b></th>
    </tr>
    <tr>
      <th colspan="2">Code</th>
      <th rowspan="2"><b>Reason</b></th>
      <th colspan="3"><b>Detail</b></th>
    </tr>
    <tr>
      <th>Value</th>
      <th>Subcode</th>
      <th>Code</th>
      <th><b>Severite</b></th>
      <th><b>Descriptif</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="14">Receiver</td>
      <td>pec_ps_42</td>
      <td>La date de l'AT ou l'identifiant de l'AT doivent obligatoirement être renseigné.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_43</td>
      <td>Le bénéficiaire n’a aucun droit</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_44</td>
      <td>Pas de correspondance dans notre référentiel assurés.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_50</td>
      <td>La date de prestation est postérieure à la date du jour.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_85</td>
      <td>L'AT/MP est inconnu au référentiel</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_86</td>
      <td>L'AT/MP est invalide</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_87</td>
      <td>La date de prescription est antérieure à la date de l'AT/MP</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>siram_20</td>
      <td>Vous ne disposez pas des droits suffisants pour accéder à ce service.</td>
      <td>pec_err_msa_100</td>
      <td rowspan="2">fatale</td>
      <td>Ce service n'est pas autorisé pour le partenaire MSA</td>
    </tr>
    <tr>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>pec_err_msa_101</td>
      <td>Ce flux n'est pas valide</td>
    </tr>
    <tr>
      <td rowspan="5">siram_40</td>
      <td rowspan="3">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_msa_102</td>
      <td rowspan="5">fatale</td>
      <td>Accès au service régional indisponible</td>
    </tr>
    <tr>
      <td>pec_err_msa_103</td>
      <td>Réponse du service régional indisponible</td>
    </tr>
    <tr>
      <td>pec_err_msa_104</td>
      <td>Réponse du service métier indisponible</td>
    </tr>
    <tr>
      <td rowspan="2">Le service est temporairement inaccessible. Veuillez renouveler votre</td>
      <td>pec_err_msa_105</td>
      <td>Accès base de données indisponible</td>
    </tr>
    <tr>
      <td>pec_err_technique_108</td>
      <td>Le code caisse/organisme doit être sur 3 caractères.</td>
    </tr>
  </tbody>
</table>



![icon: dots](page_16_image_1_v2.jpg)

VERSION DE TRAVAIL

*18/06/2026*
16 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*SEL-MP-016*
*MP - Facturation Transporteur Étendue - Taxi*
*WS_PEC - Services en Ligne "Prise en Charge"*
*Version : 03.39*

<table>
  <caption>**SOAP Fault**</caption>
  <thead>
    <tr>
      <th colspan="2">Code</th>
      <th rowspan="2"><b>Reason</b></th>
      <th colspan="3"><b>Detail</b></th>
    </tr>
    <tr>
      <th>Value</th>
      <th>Subcode</th>
      <th>Code</th>
      <th><b>Severite</b></th>
      <th><b>Descriptif</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="10"></td>
      <td rowspan="10"></td>
      <td rowspan="7">demande<br />ultérieurement.</td>
      <td>pec_err_technique_109</td>
      <td rowspan="10"></td>
      <td>Le code caisse/organisme saisi n'existe pas.</td>
    </tr>
    <tr>
      <td>pec_err_technique_110</td>
      <td>La clé doit être uniquement composée de chiffres.</td>
    </tr>
    <tr>
      <td>pec_err_technique_111</td>
      <td>La donnée {0} est en différence entre le header et le body</td>
    </tr>
    <tr>
      <td>pec_err_technique_300</td>
      <td>Cas de test invalide :</td>
    </tr>
    <tr>
      <td>pec_err_technique_103</td>
      <td>Réponse du service appelé par YQ indisponible : DC</td>
    </tr>
    <tr>
      <td>pec_err_technique_101</td>
      <td>Service appelé indisponible.</td>
    </tr>
    <tr>
      <td>pec_err_technique_900</td>
      <td>Service indisponible ou en maintenance</td>
    </tr>
    <tr>
      <td rowspan="1">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement. Si le problème persiste, contactez l’éditeur du progiciel.</td>
      <td>pec_err_technique_104</td>
      <td>Réponse du service appelé par DC indisponible : NRGD</td>
    </tr>
    <tr>
      <td rowspan="2">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_technique_105</td>
      <td>Réponse du service appelé par DC indisponible : R1NSROU</td>
    </tr>
    <tr>
      <td>pec_err_technique_106</td>
      <td>Réponse du service appelé par DC indisponible : FASIBEN</td>
    </tr>
    <tr>
      <td rowspan="2">Receiver</td>
      <td rowspan="2">siram_40</td>
      <td rowspan="2">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_technique_107</td>
      <td rowspan="2">fatale</td>
      <td>Réponse du service appelé par DC indisponible : TBI</td>
    </tr>
    <tr>
      <td>pec_err_technique_e1t</td>
      <td>Une erreur inconnue s'est produite</td>
    </tr>
  </tbody>
</table>

## **Erreurs fonctionnelles**

Les erreurs de type fonctionnel propres au service WS_PEC sont présents dans les éléments de type « Message ».

Ces erreurs fonctionnelles sont présentées dans la table TB_ERR_F : table de référence des messages d’erreurs fonctionnelles dans le document [DICO] du système FTE.



![icon: SESAM-Vitale logo](page_17_image_1_v2.jpg)

VERSION DE TRAVAIL

*18/06/2026*
17 / 17
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*