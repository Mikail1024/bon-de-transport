logo: sesam-vitale

**Guide d'Intégration**

# **Facturation Transporteur B2**

## **WS_PEC+ - "Aide à la prise en charge"**

*Version* 03.11
*Date* 19/10/2016
*Référence* SEL-MP-010
*Information* RESTREINTE
*Etat* REFERENCE

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72 019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

Ce document a été élaboré par le GIE SESAM-Vitale.

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des sanctions pour l’auteur du délit.

## **CONTACTS**

logo: sesam-vitale

Pour toute demande d'évolution, comme pour toute question technique ou fonctionnelle, contactez le Centre de services :

*   e-mail : **centre-de-service@sesam-vitale.fr**
*   téléphone : **02 43 57 42 88**

***19/10/2016*** ***GIE SESAM-Vitale*** ***2 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

MP Facturation Transporteur B2 -
SEL-MP-010 WS_PEC+ - "Aide à la prise en charge" Version : 03.11

19/10/2016 GIE SESAM-Vitale 3 / 38
Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

**SEL-MP-010** **MP Facturation Transporteur B2 -** **Version : 03.11**
***WS_PEC+ - "Aide à la prise en charge"***

## **TABLES DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>INTRODUCTION.........................................................................................................................................5</strong></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>LE SERVICE WS_PEC+ .........................................................................................................................5</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>1.1.1 Contexte .................................................................................................................................5</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>1.1.2 Pré-requis ...............................................................................................................................5</em></td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>DOCUMENTS DE REFERENCE ..................................................................................................................5</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>ABREVIATIONS.......................................................................................................................................5</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>CINEMATIQUES ET ASPECTS FONCTIONNELS ...................................................................................6</strong></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>PRESENTATION FONCTIONNELLE DU SERVICE ..........................................................................................6</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>DONNEES ECHANGEES...........................................................................................................................6</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.2.1 Données en entrée du service ...............................................................................................6</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.2.2 Données en sortie du service .................................................................................................8</em></td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>ILLUSTRATIONS....................................................................................................................................10</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.1 Illustration I : Bénéficiaire non exonéré ................................................................................11</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.2 Illustration II : ALD exonérante demandée ...........................................................................12</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.3 Illustration III : ALD et maternité ...........................................................................................12</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.4 Illustration IV : régime exonérant..........................................................................................13</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.5 Illustration V : ALD non demandée.......................................................................................15</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.6 Illustration VI : Stérilité..........................................................................................................15</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.7 Illustration VII : Nourrisson (en hospitalisation) ....................................................................16</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.8 Illustration VIII : AME de base ..............................................................................................18</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.9 Illustration IX : Fond de Solidarité Vieillesse (FSV)................................................................19</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    2.3.10<em>Illustration X : Alsace - Moselle ............................................................................................20</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    2.3.11<em>Illustration XI : CMU-Complémentaire..................................................................................21</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    2.3.12<em>Illustration XII : Prise en charge à 100% en risque Accident de Travail ..............................21</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    2.3.13<em>Illustration XIII : ACS contrat A.............................................................................................23</em></td>
    </tr>
    <tr>
      <td><strong>3</strong></td>
      <td><strong>ÉLEMENTS TECHNIQUES SPECIFIQUES AU SERVICE .....................................................................24</strong></td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>MISE EN ŒUVRE ..................................................................................................................................24</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>ENVIRONNEMENTS DE TRAVAIL .............................................................................................................26</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.2.1 Environnement de test .........................................................................................................26</em></td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>3.2.2 Environnement de production ..............................................................................................26</em></td>
    </tr>
    <tr>
      <td>3.3</td>
      <td>OPERATION « CALCULER » ...................................................................................................................27</td>
    </tr>
    <tr>
      <td></td>
      <td>    3.3.1 <em>REQ_PECB2 « SE_acqmodalitepecb2transp » ...................................................................27</em></td>
    </tr>
    <tr>
      <td></td>
      <td>        3.3.1.1 Description ........................................................................................................................... 27</td>
    </tr>
    <tr>
      <td></td>
      <td>    3.3.2 <em>REP PECB2 « SE_modalitepecb2transp » ..........................................................................28</em></td>
    </tr>
    <tr>
      <td></td>
      <td>        3.3.2.1 Type de réponse .................................................................................................................. 28</td>
    </tr>
    <tr>
      <td></td>
      <td>        3.3.2.2 Description du corps ............................................................................................................ 28</td>
    </tr>
    <tr>
      <td>3.4</td>
      <td>TRACES 31</td>
    </tr>
</table>

## **TABLE DES ILLUSTRATIONS**

AUCUNE ENTREE DE TABLE D'ILLUSTRATION N'A ETE TROUVEE.

## **TABLE DES ANNEXES**

<table>
    <tr>
      <td><strong>ANNEXE 1</strong></td>
      <td><strong>MESSAGES D’ERREUR .....................................................................................................</strong></td>
      <td><strong>34</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    A1-1 ERREURS SSL ....................................................................................................................................</td>
      <td>34</td>
    </tr>
    <tr>
      <td></td>
      <td>    A1-2 ERREURS DU SERVICE PEC+ ...............................................................................................................</td>
      <td>34</td>
    </tr>
    <tr>
      <td></td>
      <td>    A1-3 AUTRES ERREURS ...............................................................................................................................</td>
      <td>38</td>
    </tr>
</table>

**19/10/2016** **GIE SESAM-Vitale** **4 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

# **1 Introduction**

## **1.1 Le service WS_PEC+**

### **1.1.1 Contexte**

Le service PEC+ permet à un Transporteur de consulter, via son Logiciel de Partenaire de Santé (LPS), le taux de prise en charge par l’AMO d’une prestation de transport pour un bénéficiaire à une date donnée.

### **1.1.2 Pré-requis**

Le LPS doit disposer de données :

* d’identification du bénéficiaire ;
* issues de la prescription papier ;
* de réalisation de la prestation.

Ces données sont renseignées par le Transporteur sur la base des informations fournies par l’assuré ou présentes dans la prescription.

## **1.2 Documents de référence**

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
      <td>[SFG]</td>
      <td>Spécifications fonctionnelles générales « facturation transporteur B2 - Aide à la prise en charge »</td>
      <td>FACT-SFG-037</td>
    </tr>
    <tr>
      <td>[CI]</td>
      <td>Cadre d’interopérabilité des télé-services intégrés</td>
      <td>CI-CNAMTS-DC v1.0.2 ou supérieur</td>
    </tr>
  </tbody>
</table>

## **1.3 Abréviations**

Cf. FACT-SFG-037 : Spécifications Fonctionnelles Générales Facturation Transporteur B2

***19/10/2016*** ***GIE SESAM-Vitale*** ***5 / 38***
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*MP Facturation Transporteur B2 -*
**SEL-MP-010** *WS_PEC+ - "Aide à la prise en charge"* **Version : 03.11**

# 2 **Cinématiques et aspects fonctionnels**

## 2.1 **Présentation fonctionnelle du service**

### **Description**

Le service PEC+ détermine pour un bénéficiaire donné et une prestation donnée à une date donnée les informations de prise en charge AMO nécessaires au Partenaire de Santé dans le cadre de son processus métier (prise de commande et élaboration de la facture).

### **Références techniques**

#### ***Opération***

<table>
    <tr>
      <td>WS_PEC+</td>
      <td>calculer</td>
    </tr>
</table>

#### ***Messages***

<table>
    <tr>
      <td>REQ_PECB2</td>
      <td>acqmodalitepecb2transp</td>
    </tr>
    <tr>
      <td>REP_PECB2</td>
      <td>modalitepecb2transp</td>
    </tr>
</table>

## 2.2 **Données échangées**

### 2.2.1 **Données en entrée du service**

Le tableau ci-après présente, la liste des données d’entrée attendues par le service PEC+ et la description de celles-ci **<u>à titre informatif</u>**.

**Le service PEC+ contrôle ces données en fonction de cette description.**

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Donnée</b></th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td>Le NIR de l’assuré est obligatoire en entrée du service PEC+. Il doit être différent de zéro.</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>La clé du NIR est obligatoire en entrée du service PEC+.</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date de naissance du bénéficiaire</td>
      <td>La date de naissance du bénéficiaire des soins est obligatoire en entrée du service PEC+. Elle doit être numérique.<br /><br /><u>Cas particulier</u> : la date de naissance du bénéficiaire peut être une «date lunaire», i.e. le mois de la date de naissance peut prendre une valeur supérieure à «12» et le jour peut être supérieur au dernier jour valide du mois.</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang de naissance du bénéficiaire</td>
      <td>Le rang de naissance du bénéficiaire des soins est obligatoire en entrée du service PEC+. Il doit être numérique et différent de zéro.</td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>La date de prescription est obligatoire en entrée du service PEC+. Elle doit être :<br /><br />- numérique,<br /><br />- antérieure ou égale à la date de réalisation de la prestation,<br /><br />- antérieure ou égale à la date du jour,<br /><br />- postérieure ou égale à la date de naissance du bénéficiaire.<br /><br />Par ailleurs, si les soins sont en rapport avec un AT/MP, la date de</td>
    </tr>
  </tbody>
</table>

*19/10/2016* ***GIE SESAM-Vitale*** **6 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
**SEL-MP-010** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Donnée</b></th>
      <th><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td>prescription doit être postérieure ou égale à la date de l’AT/MP.</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td>La date de réalisation de la prestation est obligatoire en entrée du service PEC+. Elle doit être :<br /><br />- numérique,<br /><br />- postérieure ou égale à la date de prescription,<br /><br />- antérieure ou égale à la date du jour,<br /><br />- dans le délai de 2 ans + 3 mois par rapport à la date du jour (délai de forclusion).<br /><br />Par ailleurs, si les soins sont en rapport avec un AT/MP, la date de réalisation doit être postérieure ou égale à la date de l’AT/MP.<br /><br /><u>Remarque</u> : la date de réalisation de la prestation doit également être postérieure ou égale à la date de naissance du bénéficiaire. Cependant, ce contrôle n’est pas spécifié ici, car il est couvert de fait par le contrôle entre la date de naissance et la date de prescription.</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
      <td>Le code prestation est obligatoire en entrée du service PEC+. Il est de niveau trajet.<br /><br />La valeur attendue par le service est l’une des valeurs suivantes :<br /><ul><li>ABA</li><li>VSL</li><li>ABA/VSL</li><li>TXI</li></ul></td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>Cet indicateur est renseigné par le Transporteur à partir de la prescription.<br /><br /><u>Remarque</u> : les assurés de certains régimes ne sont pas couverts par le risque AT/MP ; certains codes régime sont donc incompatibles avec un indicateur «soins en rapport avec un AT/MP» positionné.</td>
    </tr>
    <tr>
      <td>DE_PEC_011</td>
      <td>Indicateur soins en rapport avec ALD</td>
      <td rowspan="2">Il est positionné par le Transporteur à partir de la prescription.</td>
    </tr>
    <tr>
      <td>DE_PEC_012</td>
      <td>Indicateur prise en charge à 100%</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td>Si l’indicateur «en rapport avec article 115» est positionné en entrée, le service PEC+ ne retourne pas les données de droits mais un message indiquant de réaliser une facture papier et de l’adresser à la CNMSS.</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td>La date d’accident du travail est obligatoire si l’indicateur «soins en rapport avec AT/MP» est positionné.<br /><br />La date d’accident doit être numérique. Elle est inférieure ou égale à la date de prescription.<br /><br />Lorsque l’indicateur «soins en rapport avec AT/MP» n’est pas positionné, la date de l’AT/MP est nécessairement non renseignée.<br /><br /><u>Remarque</u> : en cas d’AT/MP, soit la date de l’AT/MP, soit l’identifiant AT/MP est renseigné.</td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td>L’identifiant AT/MP est obligatoire si l’indicateur AT/MP est positionné.<br /><br />Lorsque l’indicateur «soins en rapport avec AT/MP» n’est pas positionné, l’identifiant AT/MP est nécessairement non renseigné.</td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **7 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

<table>
  <thead>
    <tr>
      <th>Référence</th>
      <th>Donnée</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td><u>Remarque</u> : en cas d’AT/MP, soit la date de l’AT/MP, soit l’identifiant<br />AT/MP est renseigné.</td>
    </tr>
  </tbody>
</table>

### **2.2.2** **Données en sortie du service**

Le tableau ci-après présente, la liste des données de sortie attendues par le service PEC+ et la description de celles-ci **<u>à titre informatif</u>**.

Ces données de sortie sont toutes de niveau « prise en charge » hormis celles figurant sur <mark>un fond grisé</mark> qui sont des informations de niveau « prestation ».

<table>
  <thead>
    <tr>
      <th>Référence</th>
      <th>Donnée</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">Ces trois informations sont toujours renseignées par le service PEC+.<br /><br /><u>Remarque</u> Le format attendu pour la donnée « centre gestionnaire » est de 4 caractères numériques. Cependant le service peut restituer une donnée « centre gestionnaire » d’une longueur inférieure à 4 caractères.</td>
    </tr>
    <tr>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DS_PEC_118</td>
      <td>Code Nature Assurance</td>
      <td>Le code nature d’assurance peut prendre l’une des valeurs suivantes :<br />● <b>«10»</b> : Maladie<br />● <b>«13»</b> : Maladie Régime Local<br />● <b>«22»</b> : Soins Médicaux Gratuits (SMG)<br />● <b>«30»</b> : Maternité<br />● <b>«41»</b> : Accident du Travail<br />● <b>«90»</b> : Prévention<br />Cette information est toujours renseignée par le service PEC+.<br />Dans cette version du service PEC+, seules les valeurs «10», «13», «30» et «41» sont retournées.</td>
    </tr>
    <tr>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>La date de maternité est renseignée uniquement en cas de nature d’assurance maternité.</td>
    </tr>
    <tr>
      <td>DS_PEC_120</td>
      <td>Rang de Bénéficiaire</td>
      <td>Cette information est non renseignée pour le Régime Général et les régimes hébergés.<br /><u>Remarque</u> : cette information est différente du rang de naissance fourni en entrée.</td>
    </tr>
    <tr>
      <td>DS_PEC_122</td>
      <td>Indicateur de situation particulière du bénéficiaire</td>
      <td>S’il est renseigné, l’indicateur de situation prend l’une des valeurs suivantes :<br />● <b>«CMU-C»</b> : si le bénéficiaire relève de la CMU-C pour la prestation donnée.<br />● <b>«AME»</b> : si le bénéficiaire relève de l’AME de base, appelée également AME totale, pour la prestation donnée.<br />● <b>«<b>ACS A</b>»</b> : si le bénéficiaire relève de l’ACS contrat A pour la prestation donnée.<br />● <b>«<b>ACS B</b>»</b> : si le bénéficiaire relève de l’ACS contrat B pour la prestation donnée.</td>
    </tr>
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** ***8 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***MP Facturation Transporteur B2 -***
**SEL-MP-010** ***WS_PEC+ - "Aide à la prise en charge"*** **Version : 03.11**

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Donnée</b></th>
      <th><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td></td>
      <td></td>
      <td>● <b>«<b>ACS C</b>»</b> : si le bénéficiaire relève de l’ACS contrat C pour la prestation donnée.</td>
    </tr>
    <tr>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
      <td rowspan="2">Ces deux informations sont renseignées uniquement lorsque le bénéficiaire relève d’une situation particulière, i.e. lorsque l’indicateur de situation particulière est renseigné.<br /><u><b>Type de contrat</b></u><br />S’il est renseigné, le type de contrat prend l’une des valeurs suivantes :<br />● <b>« 00 »</b> : pour un bénéficiaire de l’AME,<br />● <b>« 89 »</b> : pour un bénéficiaire de la CMU-C,<br />● <b>« 91 »</b> : pour un bénéficiaire de l’ACS contrat A,<br />● <b>« 92 »</b> : pour un bénéficiaire de l’ACS contrat B,<br />● <b>« 93 »</b> : pour un bénéficiaire de l’ACS contrat C.<br /><u><b>N° Organisme Complémentaire</b></u><br />S’il est renseigné, le n° Organisme Complémentaire prend la valeur <b>« M »</b></td>
    </tr>
    <tr>
      <td>DS_PEC_124</td>
      <td>N° Organisme Complémentaire</td>
    </tr>
    <tr>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
      <td>Cette information est renseignée uniquement lorsque le bénéficiaire relève d’une situation particulière, i.e. lorsque l’indicateur de situation particulière est renseigné.<br />S’il est renseigné, le destinataire de règlement prend l’une des valeurs suivantes :<br />● <b>« 00 »</b> : hors Tiers payant,<br />● <b>« 05 »</b> : Tiers payant sur la part obligatoire uniquement<br />● <b>« 15 »</b> : Tiers payant sur la part obligatoire et sur la part complémentaire.</td>
    </tr>
    <tr>
      <td>DS_PEC_126</td>
      <td>Justification Exo Ticket Modérateur</td>
      <td rowspan="2">Ces informations sont toujours renseignées par le service PEC+</td>
    </tr>
    <tr>
      <td>DS_PEC_127</td>
      <td>Taux applicable à la Prestation</td>
    </tr>
    <tr>
      <td>DS_PEC_130</td>
      <td>Tiers Payant Réglementaire AMO (OUI/NON)</td>
      <td>Cette information est toujours renseignée par le service PEC+.<br />Elle prend l’une des deux valeurs suivantes :<br />● <b>«OUI»</b> : situation réglementaire induisant une dispense d’avance de frais sur la part AMO.<br />● <b>«NON»</b> : pas de situation réglementaire induisant une dispense d’avance de frais sur la part AMO.</td>
    </tr>
    <tr>
      <td>DS_PEC_131</td>
      <td>Tiers Payant Réglementaire AMC (OUI/NON)</td>
      <td>Cette information est toujours renseignée par le service PEC+.<br />Elle prend l’une des deux valeurs suivantes :<br />● <b>«OUI»</b> : situation réglementaire induisant une dispense d’avance de frais sur la part AMC.<br />● <b>«NON»</b> : pas de situation réglementaire induisant une dispense d’avance de frais sur la part AMC.</td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **9 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

## **2.3 Illustrations**

Ci-après sont présentés des exemples d’illustrations de cas métiers qui mettent notamment en évidence les données les plus caractéristiques.

Les éléments figurant :

*   avec une * sur fond bleu représentent des données non significatives pour l’illustration proposée ;
*   avec un - sur fond gris sont des données non renseignées dans cet exemple ;
*   en gras, sur fond blanc sont des données caractéristiques de l’illustration.

***19/10/2016*** ***GIE SESAM-Vitale*** ***10 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

*SEL-MP-010* ***MP Facturation Transporteur B2 -*** *Version : 03.11*
***WS_PEC+ - "Aide à la prise en charge"***

### **2.3.1** **Illustration I : Bénéficiaire non exonéré**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b><b>Résultat attendu</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>Prise en charge à 65% en risque maladie</b></b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="5">-</td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en <b>rapport avec ALD</b></b></td>
      <td rowspan="2"><b>Non</b></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en <b>charge à 100%</b></b></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket <b>Modérateur</b></b></td>
      <td><b>0</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la prestation</b></td>
      <td><b>65</b></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMO</b></b></td>
      <td><b>Non</b></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMC</b></b></td>
      <td><b>Non</b></td>
    </tr>
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** ***11 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

*SEL-MP-010* **MP Facturation Transporteur B2 -** *Version : 03.11*
***WS_PEC+ - "Aide à la prise en charge"***

## **2.3.2** **Illustration II : ALD exonérante demandée**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>«En rapport avec une ALD» et «Prise en charge<br />à 100%» cochés sur la prescription</td>
    </tr>
    <tr>
      <td rowspan="2"><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>ALD exonérante connue de l’AM</td>
    </tr>
    <tr>
      <td>Pas de maternité connue</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Prise en charge à 100% en risque maladie</b></strong></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du<br />bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du<br />bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de<br />la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en<br />rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation<br />particulière du<br />bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en<br /><b>rapport avec ALD</b></b></td>
      <td rowspan="2"><b><b>Oui</b></b></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en<br />charge à 100%</b></td>
      <td>DS_PEC_124</td>
      <td>N° organisme<br />complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en<br />rapport avec article<br />L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de<br />règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket<br /><b>Modérateur</b></b></td>
      <td><b>4</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la<br />prestation</b></td>
      <td><b>100</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant<br /><b>Réglementaire AMO</b></b></td>
      <td><b>Non</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant<br /><b>Réglementaire AMC</b></b></td>
      <td><b>Non</b></td>
    </tr>
  </tbody>
</table>

## **2.3.3** **Illustration III : ALD et maternité**

*19/10/2016* ***GIE SESAM-Vitale*** *12 / 38*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

<table>
  <thead>
    <tr>
      <th colspan="2">Informations</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="3"><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>«En rapport avec une ALD» et «Prise en charge</td>
    </tr>
    <tr>
      <td>à 100%» cochés sur la prescription</td>
    </tr>
    <tr>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td rowspan="2"><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>ALD exonérante</td>
    </tr>
    <tr>
      <td>Maternité</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Prise en charge à 100% en risque maternité</b></strong></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>30</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td><strong>DS_PEC_119</strong></td>
      <td><strong>Date Maternité</strong></td>
      <td><strong>Renseignée</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec ALD</b></strong></td>
      <td rowspan="2"><strong><b>Oui</b></strong></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>100</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMO</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMC</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
  </tbody>
</table>

## **2.3.4** **Illustration IV : régime exonérant**

### **Informations**

***19/10/2016*** ***GIE SESAM-Vitale*** ***13 / 38***
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

<table>
    <tr>
      <td><b><b>Connues du partenaire de santé</b></b></td>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><b><b>Connues de l’Assurance Maladie</b></b></td>
      <td>Régime exonérant</td>
    </tr>
</table>

**Résultat attendu**

**Prise en charge à 100% en risque maladie**

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du<br />bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du<br />bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de<br />la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en<br />rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation<br />particulière du<br />bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en<br /><b>rapport avec ALD</b></b></td>
      <td rowspan="2"><b>Non</b></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en<br />charge à 100%</b></td>
      <td>DS_PEC_124</td>
      <td>N° organisme<br />complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en<br />rapport avec article<br />L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de<br />règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket<br /><b>Modérateur</b></b></td>
      <td><b>5</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la<br />prestation</b></td>
      <td><b>100</b></td>
    </tr>
    <tr>
      <td colspan="3" rowspan="2"></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant<br /><b>Réglementaire AMO</b></b></td>
      <td><b>Non</b></td>
    </tr>
    <tr>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant<br /><b>Réglementaire AMC</b></b></td>
      <td><b>Non</b></td>
    </tr>
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** ***14 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

### **2.3.5** **Illustration V : ALD non demandée**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2"><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Ni l’ALD, ni la « Prise en charge à 100% » ne sont cochées sur la prescription</td>
    </tr>
    <tr>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>ALD exonérante</td>
    </tr>
  </tbody>
</table>

<table>
<thead>
<tr>
<th><b>Résultat attendu</b></th>
</tr>
</thead>
<tbody>
<tr>
<td><strong><b>Prise en charge à 65% en risque maladie</b></strong></td>
</tr>
</tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td><strong><b>DE_PEC_010</b></strong></td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec ALD</b></strong></td>
      <td rowspan="2"><strong>Non</strong></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>65</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMO</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMC</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
  </tbody>
</table>

### **2.3.6** **Illustration VI : Stérilité**

***19/10/2016*** ***GIE SESAM-Vitale*** ***15 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

* **MP Facturation Transporteur B2 -** *
* **SEL-MP-010** **WS_PEC+ - "Aide à la prise en charge"** **Version : 03.11** *

<table>
  <thead>
    <tr>
      <th colspan="2">Informations</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2"><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>«Prise en charge à 100%» cochée sur la prescription mais «Rapport avec une ALD» non coché</td>
    </tr>
    <tr>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Situation de stérilité</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Prise en charge à 100% en risque maladie</b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en rapport avec ALD</b></td>
      <td><b>Non</b></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en charge à 100%</b></td>
      <td><b><b>Oui</b></b></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket <b>Modérateur</b></b></td>
      <td><b>3</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la prestation</b></td>
      <td><b>100</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMO</b></b></td>
      <td><b>Non</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMC</b></b></td>
      <td><b>Non</b></td>
    </tr>
  </tbody>
</table>

### **2.3.7** **Illustration VII : Nourrisson (en hospitalisation)**

**Informations**

* **19/10/2016** **GIE SESAM-Vitale** **16 / 38** *
* **Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale** *

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

<table>
  <thead>
    <tr>
      <th colspan="2"><b><b>Connues du partenaire de santé</b></b></th>
      <th colspan="4">«Prise en charge à 100%» et hospitalisation cochés sur la prescription<br />Quel que soit le régime d’affiliation</th>
    </tr>
    <tr>
      <th colspan="2"><b><b>Connues de l’Assurance Maladie</b></b></th>
      <th colspan="4">Soins réalisés pour un nourrisson de moins de 30 jours (en cas d’hospitalisation)</th>
    </tr>
    <tr>
      <th colspan="6"><b>Résultat attendu</b><br />Prise en charge à 100% en risque maladie</th>
    </tr>
    <tr>
      <th colspan="3">Donnée en entrée</th>
      <th colspan="3">Donnée en sortie</th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td></td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td></td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
      <td>*</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td></td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td>*</td>
      <td>DS_PEC_118</td>
      <td>Code Nature Assurance</td>
      <td>10</td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td></td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td></td>
      <td>DS_PEC_120</td>
      <td>Rang de Bénéficiaire</td>
      <td>*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_011</td>
      <td>Indicateur soins en rapport avec ALD</td>
      <td>Non</td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_012</td>
      <td>Indicateur prise en charge à 100%</td>
      <td>Oui</td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td></td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
      <td></td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td>-</td>
      <td>DS_PEC_126</td>
      <td>Justification Exo Ticket Modérateur</td>
      <td>3</td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td></td>
      <td>DS_PEC_127</td>
      <td>Taux applicable à la prestation</td>
      <td>100</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>DS_PEC_130</td>
      <td>Tiers Payant Réglementaire AMO</td>
      <td>Non</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>DS_PEC_131</td>
      <td>Tiers Payant Réglementaire AMC</td>
      <td>Non</td>
    </tr>
  </tbody>
</table>

## **Résultat attendu**

### **Prise en charge à 100% en risque maladie**

<table>
  <thead>
    <tr>
      <th colspan="3">Donnée en entrée</th>
      <th colspan="3">Donnée en sortie</th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en rapport avec ALD</strong></td>
      <td><strong>Non</strong></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td><strong>Oui</strong></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket Modérateur</strong></td>
      <td><strong>3</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>100</strong></td>
    </tr>
    <tr>
      <td colspan="3" rowspan="2"></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant Réglementaire AMO</strong></td>
      <td><strong>Non</strong></td>
    </tr>
    <tr>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant Réglementaire AMC</strong></td>
      <td><strong>Non</strong></td>
    </tr>
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** ***17 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

*SEL-MP-010* *MP Facturation Transporteur B2 -* *Version : 03.11*
*WS_PEC+ - "Aide à la prise en charge"*

## 2.3.8 Illustration VIII : AME de base

<table>
  <thead>
    <tr>
      <th colspan="2">Informations</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Connues du partenaire de santé</strong></td>
      <td>L’assuré est affilié au régime 01</td>
    </tr>
    <tr>
      <td><strong>Connues de l’Assurance Maladie</strong></td>
      <td>Bénéficiaire connu de l’AM comme relevant de<br />l’AME de base</td>
    </tr>
    <tr>
      <th colspan="2">Résultat attendu</th>
    </tr>
    <tr>
      <td colspan="2"><strong>Prise en charge à 100% en risque maladie</strong></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3">Donnée en entrée</th>
      <th colspan="3">Donnée en sortie</th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td><b>DS_PEC_115</b></td>
      <td><b>Code Grand Régime</b></td>
      <td><b>01</b></td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td><b>DS_PEC_122</b></td>
      <td><b>Indicateur Situation particulière du bénéficiaire</b></td>
      <td><b>AME</b></td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en rapport avec ALD</b></td>
      <td rowspan="2">Non</td>
      <td><b>DS_PEC_123</b></td>
      <td><b>Type de contrat</b></td>
      <td><b>00</b></td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en charge à 100%</b></td>
      <td><b>DS_PEC_124</b></td>
      <td><b>N° organisme complémentaire</b></td>
      <td><b>75500017</b></td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td><b>DS_PEC_125</b></td>
      <td><b>Destinataire de règlement</b></td>
      <td><b>15</b></td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket Modérateur</b></td>
      <td><b>0</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la prestation</b></td>
      <td><b>0</b></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant Réglementaire AMO</b></td>
      <td><b>Oui</b></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant Réglementaire AMC</b></td>
      <td><b>Oui</b></td>
    </tr>
  </tbody>
</table>

*19/10/2016* *GIE SESAM-Vitale* 18 / 38
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***SEL-MP-010***
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
***Version : 03.11***

## **2.3.9** **Illustration IX : Fond de Solidarité Vieillesse (FSV)**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Bénéficiaire connu de l’AM comme bénéficiant<br />du FSV</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Prise en charge à 100% en risque maladie</b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><b>DS_PEC_118</b></td>
      <td><b>Code Nature Assurance</b></td>
      <td><b>10</b></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><b>DE_PEC_011</b></td>
      <td><b>Indicateur soins en <b>rapport avec ALD</b></b></td>
      <td rowspan="2"><b>Non</b></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><b>DE_PEC_012</b></td>
      <td><b>Indicateur prise en charge à 100%</b></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><b>DS_PEC_126</b></td>
      <td><b>Justification Exo Ticket <b>Modérateur</b></b></td>
      <td><b>9</b></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><b>DS_PEC_127</b></td>
      <td><b>Taux applicable à la prestation</b></td>
      <td><b>100</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_130</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMO</b></b></td>
      <td><b>Non</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b>DS_PEC_131</b></td>
      <td><b>Tiers Payant <b>Réglementaire AMC</b></b></td>
      <td><b>Non</b></td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **19 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

## **2.3.10 Illustration X : Alsace - Moselle**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Rattachement à l’Alsace-Moselle au niveau de l’Assurance Maladie</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b><b>Résultat attendu</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>Prise en charge à 100% en risque maladie</b></b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>13</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec ALD</b></strong></td>
      <td rowspan="2">Non</td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>100</strong></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMO</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant <b>Réglementaire AMC</b></strong></td>
      <td><strong>Non</strong></td>
    </tr>
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** ***20 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***SEL-MP-010*** ***MP Facturation Transporteur B2 -*** ***Version : 03.11***
***WS_PEC+ - "Aide à la prise en charge"***

## **2.3.11 Illustration XI : CMU-Complémentaire**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Ni l’ALD, ni la «Prise en charge à 100%» ne<br />sont cochées sur la prescription<br /><br />Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Bénéficiaire de la CMU-C</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b><b>Résultat attendu</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>Prise en charge à 65% en risque maladie</b></b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td><strong>DS_PEC_122</strong></td>
      <td><strong>Indicateur Situation <b>particulière du</b> bénéficiaire</strong></td>
      <td><strong>CMU-C</strong></td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec ALD</b></strong></td>
      <td rowspan="2"><b>Non</b></td>
      <td><strong>DS_PEC_123</strong></td>
      <td><strong>Type de contrat</strong></td>
      <td><strong>89</strong></td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td><strong>DS_PEC_124</strong></td>
      <td><strong>N° organisme <b>complémentaire</b></strong></td>
      <td><strong>M</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td><strong>DS_PEC_125</strong></td>
      <td><strong>Destinataire de <b>règlement</b></strong></td>
      <td><strong>15</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>65</strong></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant Réglementaire AMO</strong></td>
      <td><strong>Oui</strong></td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant Réglementaire AMC</strong></td>
      <td><strong>Oui</strong></td>
    </tr>
  </tbody>
</table>

## **2.3.12 Illustration XII : Prise en charge à 100% en risque Accident de Travail**

***19/10/2016*** ***GIE SESAM-Vitale*** ***21 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***SEL-MP-010***
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
***Version : 03.11***

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="3"><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>« Soins liés à un AT/MP » coché sur la<br />prescription</td>
    </tr>
    <tr>
      <td>«Prise en charge à 100%» coché sur la<br />prescription</td>
    </tr>
    <tr>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Accident du travail enregistré au référentiel<br />assurés AMO.</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Prise en charge à 100% en risque AT</b></strong></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>41</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_010</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec un</b> AT/MP</strong></td>
      <td><strong>Oui</strong></td>
      <td>DS_PEC_122</td>
      <td>Indicateur Situation particulière du bénéficiaire</td>
      <td rowspan="4">-</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en rapport avec ALD</strong></td>
      <td><strong>Non</strong></td>
      <td>DS_PEC_123</td>
      <td>Type de contrat</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td><strong>Oui</strong></td>
      <td>DS_PEC_124</td>
      <td>N° organisme complémentaire</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_013</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec article</b> <b>L115</b></strong></td>
      <td rowspan="3"><strong>21/12/2012</strong></td>
      <td>DS_PEC_125</td>
      <td>Destinataire de règlement</td>
    </tr>
    <tr>
      <td><strong>DE_PEC_008</strong></td>
      <td><strong>Date AT/MP</strong></td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td><strong>DE_PEC_009</strong></td>
      <td><strong>Identifiant AT/MP</strong></td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>100</strong></td>
    </tr>
    <tr>
      <td colspan="3" rowspan="2"></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant Réglementaire AMO</strong></td>
      <td><strong>Oui</strong></td>
    </tr>
    <tr>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant Réglementaire AMC</strong></td>
      <td><strong>Non</strong></td>
    </tr>
  </tbody>
</table>

***19/10/2016***
***GIE SESAM-Vitale***
**22 / 38**
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***SEL-MP-010***
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
***Version : 03.11***

# **2.3.13 Illustration XIII : ACS contrat A**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Informations</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2"><strong><b>Connues du partenaire de santé</b></strong></td>
      <td>Ni l’ALD, ni la «Prise en charge à 100%» ne sont cochées sur la prescription</td>
    </tr>
    <tr>
      <td>Quel que soit le régime d’affiliation</td>
    </tr>
    <tr>
      <td><strong><b>Connues de l’Assurance Maladie</b></strong></td>
      <td>Bénéficiaire de l’ACS contrat A</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>Résultat attendu</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>Prise en charge à 65% en risque maladie</b></b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="3"><b>Donnée en entrée</b></th>
      <th colspan="3"><b>Donnée en sortie</b></th>
    </tr>
    <tr>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
      <th>Référence</th>
      <th>Libellé</th>
      <th>Valeur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>DE_PEC_001</td>
      <td>NIR de l’assuré</td>
      <td rowspan="7">*</td>
      <td>DS_PEC_115</td>
      <td>Code Grand Régime</td>
      <td rowspan="3">*</td>
    </tr>
    <tr>
      <td>DE_PEC_002</td>
      <td>Clé du NIR de l’assuré</td>
      <td>DS_PEC_116</td>
      <td>N° Caisse Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_003</td>
      <td>Date naissance du bénéficiaire</td>
      <td>DS_PEC_117</td>
      <td>N° Centre Gestionnaire</td>
    </tr>
    <tr>
      <td>DE_PEC_004</td>
      <td>Rang naissance du bénéficiaire</td>
      <td><strong>DS_PEC_118</strong></td>
      <td><strong>Code Nature Assurance</strong></td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_005</td>
      <td>Date de prescription</td>
      <td>DS_PEC_119</td>
      <td>Date Maternité</td>
      <td>-</td>
    </tr>
    <tr>
      <td>DE_PEC_006</td>
      <td>Date de réalisation de la prestation</td>
      <td rowspan="2">DS_PEC_120</td>
      <td rowspan="2">Rang de Bénéficiaire</td>
      <td rowspan="2">*</td>
    </tr>
    <tr>
      <td>DE_PEC_007</td>
      <td>Code prestation</td>
    </tr>
    <tr>
      <td>DE_PEC_010</td>
      <td>Indicateur soins en rapport avec un AT/MP</td>
      <td>-</td>
      <td><strong>DS_PEC_122</strong></td>
      <td><strong>Indicateur Situation <b>particulière du</b> bénéficiaire</strong></td>
      <td><strong><b>ACS A</b></strong></td>
    </tr>
    <tr>
      <td><strong>DE_PEC_011</strong></td>
      <td><strong>Indicateur soins en <b>rapport avec ALD</b></strong></td>
      <td rowspan="2"><b>Non</b></td>
      <td><strong>DS_PEC_123</strong></td>
      <td><strong>Type de contrat</strong></td>
      <td><strong>91</strong></td>
    </tr>
    <tr>
      <td><strong>DE_PEC_012</strong></td>
      <td><strong>Indicateur prise en charge à 100%</strong></td>
      <td><strong>DS_PEC_124</strong></td>
      <td><strong>N° organisme <b>complémentaire</b></strong></td>
      <td><strong>M</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_013</td>
      <td>Indicateur soins en rapport avec article L115</td>
      <td rowspan="3">-</td>
      <td><strong>DS_PEC_125</strong></td>
      <td><strong>Destinataire de <b>règlement</b></strong></td>
      <td><strong>15</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_008</td>
      <td>Date AT/MP</td>
      <td><strong>DS_PEC_126</strong></td>
      <td><strong>Justification Exo Ticket <b>Modérateur</b></strong></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>DE_PEC_009</td>
      <td>Identifiant AT/MP</td>
      <td><strong>DS_PEC_127</strong></td>
      <td><strong>Taux applicable à la prestation</strong></td>
      <td><strong>65</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_130</strong></td>
      <td><strong>Tiers Payant Réglementaire AMO</strong></td>
      <td><strong>Oui</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>DS_PEC_131</strong></td>
      <td><strong>Tiers Payant Réglementaire AMC</strong></td>
      <td><strong>Oui</strong></td>
    </tr>
  </tbody>
</table>

***19/10/2016***
***GIE SESAM-Vitale***
***23 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

*MP Facturation Transporteur B2 -*
**SEL-MP-010** *WS_PEC+ - "Aide à la prise en charge"* **Version : 03.11**

# **3 Éléments techniques spécifiques au service**

Les mécanismes techniques mis en œuvre sont décrits dans le cadre d'interopérabilité, version 1.0.2 minimum. Ce chapitre traite uniquement des spécificités de ce téléservice.

icon: warning Le cadre d’interopérabilité contient toutes les informations techniques nécessaires pour l’intégration d’un téléservice à un progiciel de santé.
La présente section décrit quant à elle tous les éléments **spécifiques au service**, et rien que ces éléments.
Vous devez donc vous appuyer sur les deux documents pour avoir la totalité des informations nécessaires.

icon: warning Les formats, plages de valeurs et types des données spécifiés dans le présent document sont présentés à titre indicatif. Ils peuvent être amenés à évoluer. Seuls les schémas XSD constituent la référence des échanges.

icon: book Les formats des données sont décrits dans le cadre d’interopérabilité.

Un format supplémentaire est utilisé dans le service PEC+ :

<table>
  <thead>
    <tr>
      <th><b>Code</b></th>
      <th><b>Signification</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>ND</td>
      <td>Nombre Décimal écrit avec des chiffres, un point décimal et<br />éventuellement précédé d'un signe + ou -</td>
    </tr>
  </tbody>
</table>

## **3.1 Mise en œuvre**

icon: book Voir cadre d’interopérabilité – volet «Web-service», chapitre «Liaison sécurisée avec authentification du téléservice».

icon: book Voir cadre d’interopérabilité – Document « Assertions et contexte ».

icon: pointer Le document « Assertions et contexte » du cadre d’interopérabilité fixe les champs des contextes à renseigner obligatoirement.

### **Accès au service**

L’accès au service pour un utilisateur est réalisé via une authentification par identifiant et mot de passe. L’utilisateur saisit son identifiant et son mot de passe au démarrage de sa session dans le LPS, qui autorise alors (ou non) l’appel au service selon son profil.

icon: warning **Attention, 3 saisies erronées consécutives du mot de passe bloquent l’accès au service.**

Chaque requête au service est accompagnée de l'identifiant et du mot de passe saisis, qui sont vérifiées avant l'exécution du service.

Le couple identifiant / mot de passe peut être conservé et réutilisé au long de la session d’un même utilisateur et sont perdus lors de la fermeture de la session de l’utilisateur (déconnexion automatique après 30 mn maximum d’inactivité du LPS ; la durée de déconnexion automatique peut être paramétrable sur le poste dans la limite des 30 mn).

***19/10/2016*** ***GIE SESAM-Vitale*** ***24 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

**_SEL-MP-010_** **_MP Facturation Transporteur B2 -_** **_Version : 03.11_**
**_WS_PEC+ - "Aide à la prise en charge"_**

Par contre, ce couple identifiant / mot de passe ne doit être stocké en mémoire au niveau du LPS qu’après la réponse positive à la première requête du service.

Le couple identifiant / mot de passe ne doit pas être conservé sans protection sur le disque dur de l’utilisateur, ni sur tout autre système de stockage non volatile.

🕮 Voir cadre d’interopérabilité – volet «Web-service», chapitre «Transmission de l’identifiant et du mot de passe».

## **Occurrences** **des en-têtes et** **requêtes**

<table>
  <thead>
    <tr>
      <th colspan="2"><b>Opération</b></th>
      <th colspan="2">Contexte</th>
    </tr>
    <tr>
      <th colspan="2"></th>
      <th>LPS</th>
      <th>BAM</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>WS_PEC+</td>
      <td>calculer</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>
<u>Légende</u> : X = obligatoire

## **Renseignement** **des contextes**

Le tableau ci-dessous présente pour chaque opération, les champs à renseigner dans les contextes **en plus** des champs obligatoires décrits dans le cadre d’interopérabilité :

<table>
  <thead>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
      <th>calculer</th>
    </tr>
    <tr>
      <th>Contexte</th>
      <th colspan="2"><b>Champs</b></th>
      <th colspan="2">Renseignement</th>
      <th>WS_PEC+</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="7">Contexte<br />BAM</td>
      <td colspan="2">DateRef</td>
      <td colspan="2">Date de réalisation de la prestation<br /><u><strong>Attention</strong></u> : cet élément doit être identique à DE_PEC_006</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5">COUVERTURE</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="2">GrandRegime</td>
      <td colspan="2">Code régime</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="4">ASSURE</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="3">Id</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>Num</td>
      <td>NIR de l’ouvrant droit<br /><u><strong>Attention</strong></u> : cet élément doit être identique à DE_PEC_001</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>Cle</td>
      <td>Clé du NIR de l’ouvrant droit<br /><u><strong>Attention</strong></u> : cet élément doit être identique à DE_PEC_002</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

**_19/10/2016_** **_GIE SESAM-Vitale_** **_25 / 38_**
**_Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale_**

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

<table>
    <tr>
      <td rowspan="3"></td>
      <td></td>
      <td colspan="2">BENEFICIAIRE</td>
      <td></td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>DateNai</td>
      <td>Date de naissance du bénéficiaire<br /><b><u>Attention</u></b> : cet élément doit être identique à DE_PEC_003</td>
      <td>X</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>Rang</td>
      <td>Rang du bénéficiaire<br /><b><u>Attention</u></b> : cet élément doit être identique à DE_PEC_004</td>
      <td>X</td>
    </tr>
</table>

icon: hand pointing right Dans les contextes LPS et BAM, le n° d’émetteur doit être renseigné uniquement avec l’identifiant (ou login) utilisé par le Transporteur pour se connecter à Espace pro

## **3.2** **Environnements de travail**

Deux environnements sont disponibles : un environnement de test et un environnement de production. Le passage de l’un à l’autre implique des changements de configuration qui ont un impact sur les flux XML échangés au sein de l’infrastructure.

### **3.2.1** **Environnement de test**

**URL d’appel**

L’URL d’appel est :

<u>https://qualiflps.services-ps.ameli.fr/lps</u>

**Numéro d’autorisation**

Vous devez utiliser le numéro d’autorisation de test fourni par le CNDA lors de la signature de la convention.

Le type du numéro d’autorisation à utiliser dans le flux XML est «4».

📖 Voir chapitre 3.1 du volet «Assertions et contextes» du cadre d’interopérabilité.

### **3.2.2** **Environnement de production**

**URL d’appel**

L’URL d’appel est :

<u>https://services-ps.ameli.fr/lps</u>

**Numéro d’autorisation**

Vous devez utiliser le numéro d’autorisation définitif obtenu auprès du CNDA à l’issue de la vérification de conformité.

Le type du numéro d’autorisation à utiliser dans le flux XML est «4».

📖 Voir chapitre 3.1 du volet «Assertions et contextes» du cadre d’interopérabilité.

***19/10/2016*** ***GIE SESAM-Vitale*** ***26 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

**_MP Facturation Transporteur B2 -_**
**_SEL-MP-010_** **_WS_PEC+ - "Aide à la prise en charge"_** **_Version : 03.11_**

## **3.3 Opération « calculer »**

### **3.3.1 REQ_PECB2 « SE_acqmodalitepecb2transp »**

#### **3.3.1.1 Description**

<table>
  <thead>
    <tr>
      <th colspan="8"><b>Balises XML</b><br /><i>Italique : attribut</i></th>
      <th>Occ</th>
      <th>Format</th>
      <th>Valeurs</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="8"><b><b>PRESCRIPTION</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="7">DatePrescription</td>
      <td>1</td>
      <td>D</td>
      <td>DE_PEC_005</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="7"><b><b>PATIENT</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="6">DateNai</td>
      <td>1</td>
      <td>DL</td>
      <td>DE_PEC_003</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="6">RangNai</td>
      <td>1</td>
      <td>N</td>
      <td>DE_PEC_004</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="6"><b><b>COUVERTURE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="5"><b><b>ASSURE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="4">Id</td>
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
      <td colspan="3">Num</td>
      <td>1</td>
      <td>AN</td>
      <td>DE_PEC_001</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2"><i>R</i></td>
      <td>0..1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="3">Cle</td>
      <td>1</td>
      <td>AN</td>
      <td>DE_PEC_002</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="2"><i>R</i></td>
      <td>0..1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="7"><b><b>EltTransport</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="6">ModeTransport</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DE_PEC_007</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="6"><b><b>CONTEXTETRANSPORT</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="5">Motif</td>
      <td>0..n</td>
      <td>AN</td>
      <td>valeur «AT» = DE_PEC_010<br />valeur «ALD» = DE_PEC_011<br />valeur «CDP100» = DE_PEC_012<br />valeur «L115» = DE_PEC_013</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="5">IdentifiantAT</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DE_PEC_009</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="5">DateATMP</td>
      <td>0..1</td>
      <td>D</td>
      <td>DE_PEC_008</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td colspan="5">DateRealisation</td>
      <td>0..1</td>
      <td>D</td>
      <td>DE_PEC_006</td>
    </tr>
  </tbody>
</table>

**_19/10/2016_** **_GIE SESAM-Vitale_** **_27 / 38_**
**_Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale_**

*SEL-MP-010*
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
*Version : 03.11*

# **3.3.2** **REP PECB2 « SE_modalitepecb2transp »**

## **3.3.2.1** **Type de réponse**

La réponse peut être :

*   une réponse positive contenant des données (décrite ci-dessous et dans la section 3.3.2.2), ou
*   une réponse négative qui respecte la syntaxe standard SOAP, c’est-à-dire une erreur applicative ou d’infrastructure décrite dans un élément soap:Fault.

<table>
  <thead>
    <tr>
      <th><b>Balises XML</b></th>
      <th>Signification</th>
      <th>Occ</th>
      <th>Valeurs</th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <th></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>Envelope</b></strong><br />Namespace :<br />«http://www.w3.org/2003/05/soap-envelope»</td>
      <td>Elément racine<br />du message</td>
      <td>1</td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Body</strong></td>
      <td>Corps SOAP</td>
      <td>1</td>
      <td></td>
    </tr>
    <tr>
      <td>    modalitepecb2transp<br />    Namespace :<br />    «http://www.InterRegimes.fr/PriseEnCharge»</td>
      <td>Résultat de la<br />consultation des<br />données</td>
      <td>1</td>
      <td>Cet élément est<br />toujours présent<br />dans un processus<br />nominal, absent en<br />cas d’erreur<br />(soap :Fault).</td>
    </tr>
  </tbody>
</table>

## **3.3.2.2** **Description du corps**

Le tableau ci-dessous correspond au détail de l’enveloppe «Body» décrite ci-dessus, qui contient 1 ou 2 occurrences COUVERTURE :

*   L’une correspond au contrat AMO et donc à la part obligatoire de la facture,
*   L’autre correspond au contrat AMC et donc à la part complémentaire de la facture.

**Dans le bloc COUVERTURE :**

*   Le champ **IdOrg** est exclusif des 3 champs **GrandRégime, Organisme, EntiteGestion** :
    *   Si l’**IdOrg** est renseigné, les 3 champs suivants ne le sont pas : il s’agit d’une couverture AMC,
    *   Inversement, si l’**IdOrg** n’est pas renseigné, les 3 champs suivants le sont, ils identifient l’organisme gestionnaire (code régime, caisse, centre) de l’AMO.
*   Les champs **NatureAssurance** et **DateMaternité** sont renseignés uniquement dans l’occurrence de COUVERTURE AMO.
*   Le champ **contrat** du bloc CONTRATS est renseigné uniquement dans l’occurrence de COUVERTURE AMC

*19/10/2016*
***GIE SESAM-Vitale***
**28 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

**SEL-MP-010**  
***MP Facturation Transporteur B2 -***  
***WS_PEC+ - "Aide à la prise en charge"***  
**Version : 03.11**

*   Le champ **cadreReglement** du bloc CONTRATS correspond :
    *   dans l’occurrence COUVERTURE AMO au TP réglementaire sur la part AMO (DS_PEC_130),
    *   dans l’occurrence COUVERTURE AMC au TP réglementaire sur la part complémentaire (DS_PEC_131).
*   Le champ **cadreReglement** du bloc CONTEXTE est renseigné uniquement dans l’occurence COUVERTURE AMO. Il correspond au destinataire de règlement (DS_PEC_125) à renseigner dans la facture B2 (T2, pos.115-116).

### <u>*Spécificités fonctionnelles*</u>

Dans cette version du service PEC+, la part complémentaire est gérée uniquement en cas de CMU-C, ACS A, ACS B, ACS C ou d’AME. L’occurrence COUVERTURE AMC est donc utilisée uniquement dans ces cas.

Le tableau ci-dessous correspond au détail de l’enveloppe «Body» décrite ci-dessus.

<table>
  <thead>
    <tr>
      <th colspan="4"><b><b>Balises XML</b></b><br /><i>Italique : attribut</i></th>
      <th>Occ</th>
      <th>Format</th>
      <th>Valeurs</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="4"><b><b>FACTURE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="3"><b><b>BENEFICIAIRE</b></b></td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">RangBen</td>
      <td>0..1</td>
      <td>N</td>
      <td>DS_PEC_120</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">SituationParticuliere</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_122</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="3"><b>COUVERTURE</b></td>
      <td>0..n</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">IdOrg</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_124</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">GrandRegime</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_115</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">Organisme</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_116</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2">EntiteGestion</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_117</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2"><b>CONTRATS</b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><i>Id</i></td>
      <td>1</td>
      <td>AN</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>Contrat</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_123</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>NatureAssurance</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_118</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>CadreReglement</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_130<br />DS_PEC_131</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2"><b>CONTEXTE</b></td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>CadreReglement</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_125</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>DateMaternite</td>
      <td>0..1</td>
      <td>D</td>
      <td>DS_PEC_119</td>
    </tr>
    <tr>
      <td></td>
      <td colspan="3"><b><b>CADRE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td colspan="2"><b><b>EXECUTION</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td><b><b>SERVICE</b></b></td>
      <td>1</td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **29 / 38**
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

*SEL-MP-010*
*MP Facturation Transporteur B2 -*
*WS_PEC+ - "Aide à la prise en charge"*
*Version : 03.11*

<table>
  <thead>
    <tr>
      <th><b>Balises XML</b><br /><i>Italique : attribut</i></th>
      <th><b>Occ</b></th>
      <th><b>Format</b></th>
      <th><b>Valeurs</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>RMB</b></td>
      <td>0..n</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    Exo</td>
      <td>0..1</td>
      <td>AN</td>
      <td>DS_PEC_126</td>
    </tr>
    <tr>
      <td>    Part</td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        Tux</td>
      <td>0..1</td>
      <td>ND</td>
      <td>DS_PEC_127</td>
    </tr>
    <tr>
      <td>    <b>CONTRAT</b></td>
      <td>0..1</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        <i>Id</i></td>
      <td>1</td>
      <td>AN</td>
      <td>= id element «CONTRATS» d’une des<br />occurrences «COUVERTURE»</td>
    </tr>
    <tr>
      <td><b>MESSAGE</b></td>
      <td>0..n</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    Libelle</td>
      <td>1</td>
      <td>AN</td>
      <td></td>
    </tr>
  </tbody>
</table>

*19/10/2016*
*GIE SESAM-Vitale*
30 / 38
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

**SEL-MP-010**
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
***Version : 03.11***

## 3.4 **Traces**

En vue de réaliser un bilan de présérie, le LPS doit enregistrer des traces sur le poste. L’enregistrement de ces traces doit pouvoir être débrayé par le Transporteur.

Le LPS proposera une fonction d’export des traces anonymes sous forme d’un fichier au format CSV (séparateur ";"). Le nom du fichier sera de la forme suivante :

PECTPIACS_traces _\<nom du logiciel> _ \<version du logiciel>_\<date de création du fichier>_\<incrément>_\<UUID>. csv

Où :

* Nom du logiciel + version : Nom et version déclaré au CNDA lors des tests
* Date de création du fichier au format YYYYMMDD
* L’incrément est un numéro d’ordre du fichier (incrémenté de 1 en 1 à chaque nouveau fichier créé
* L’UUID est l’identifiant unique de l’instance du logiciel

Exemple : PECTPIACS_traces_ADEMIS_V3_20141123_1_ 2404a520-e12b 3ad4-a710-64562a440120.csv

L’export doit être possible sur une période d’antériorité de 3 mois.

Les fichiers traces seront envoyés par courriel à l’adresse suivante : Relations Industriels@sesam-vitale.fr en précisant en objet :

[PECTPIACS] *\<nom éditeur>* - Traces_période du \<date début période> au \<date fin période>

Exemple : [PECTPIACS] GIE_SV – Traces période du 20141103 au 20141109

L’éditeur peut consolider l’ensemble des traces de ses Transporteurs pilotes dans un même fichier et ainsi ne faire qu’un envoi pour la même période.

Les traces anonymes pourraient être transmises par le Transporteur aux représentants de la profession :

* mesure des performances ;
* mesure de l’utilisation du service.

Le processus fonctionnel ne doit pas être arrêté si l’enregistrement de la trace échoue.

**Les données anonymes (sans identification du bénéficiaire) sont au minimum :**

* Identité de l’utilisateur ;
* Identifiants et horodatage de la requête et de la réponse (pour les mesures de performance du service) (iso 8601) UTC;
* Données d’entrée de la requête (informations de la prescription et de la prestation et données techniques). Le NIR et la date de naissance seront remplacés par des «X» ;

***19/10/2016***
***GIE SESAM-Vitale***
***31 / 38***
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***SEL-MP-010***
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
***Version : 03.11***

*   Données retournées par le service ;
*   Code et motif de l’échec.

**Les pages suivantes décrivent l'ordre et la nature des données à inscrire **dans chaque enregistrement et également les noms à utiliser pour nommer** les en-têtes de colonne du fichier (1er enregistrement).**

**Les données référencées DE_... ou DS_... doivent être au même format **dans le fichier trace que dans la requête ou dans la réponse, même** lorsqu'elles sont anonymisées.**

**Lorsque ces données ne sont pas renseignées dans la requête ou la réponse, elles sont également laissées vides dans le fichier traces.**

<table>
  <thead>
    <tr>
      <th><i>Code entête de colonne</i></th>
      <th><i>Nom de l’en-tête de la colonne</i></th>
      <th><i>Référence de la donnée</i></th>
      <th><i>Précisions particulières</i></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="4"><b><b>Identité de l’utilisateur</b></b></td>
    </tr>
    <tr>
      <td></td>
      <td>Identifiant de facturation</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>NAME_ID</td>
      <td>IdentUtilisateur</td>
      <td></td>
      <td>Nom _ prénom de l'utilisateur du progiciel chez le Transporteur<br />30 caractères au maximum.</td>
    </tr>
    <tr>
      <td colspan="4"><b><b>Identifiants et horodatage de la requête et de la réponse</b></b></td>
    </tr>
    <tr>
      <td>MES_ID</td>
      <td>MessageID</td>
      <td></td>
      <td>MessageID de l’en-tête WS-Addressing de la requête(UUID)</td>
    </tr>
    <tr>
      <td>DH_REQ</td>
      <td>DateHeureRequetePEC</td>
      <td></td>
      <td>Horodatage de la requête au moment de l'appel au service par le LPS.<br /><u>Format</u> :<br /><b>AAAAMMJJhhmmssxxxxxx</b>,<br />où xxxxxx représente le nombre de micro secondes.<br />Détailler au minimum à la milliseconde et compléter avec des 0 si besoin. <i>(toutes les données DateHeureRequetePEC doivent être de la même longueur)</i></td>
    </tr>
    <tr>
      <td>DH_REP</td>
      <td>DateHeureReponsePEC</td>
      <td></td>
      <td>Horodatage de la réponse au moment de la réception par le progiciel.<br /><u>Format</u> :<br /><b>AAAAMMJJhhmmssxxxxxx</b>,<br />où xxxxxx représente le nombre de micro secondes.<br />Détailler au minimum à la milliseconde et compléter avec des 0 si besoin. <i>(toutes les données DateHeureReponsePEC doivent être de la même</i></td>
    </tr>
  </tbody>
</table>

***19/10/2016***
***GIE SESAM-Vitale***
**32 / 38**
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

***MP Facturation Transporteur B2 -***
**SEL-MP-010** ***WS_PEC+ - "Aide à la prise en charge"*** **Version : 03.11**

<table>
  <thead>
    <tr>
      <th><b><i>Code entête de colonne</i></b></th>
      <th><b><i>Nom de l’en-tête de la colonne</i></b></th>
      <th><b><i>Référence de la donnée</i></b></th>
      <th><b><i>Précisions particulières</i></b></th>
    </tr>
    <tr>
      <th></th>
      <th></th>
      <th></th>
      <td><i>longueur)</i></td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th colspan="4"><b><b>Données d’entrée de la requête (Cf. § 2.2.1.)</b></b></th>
    </tr>
    <tr>
      <td>ID_DPEL</td>
      <td>DE_PEC_005_DatePrescription</td>
      <td>DE_PEC_005</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_DPRE</td>
      <td>DE_PEC_006_DatePrestation</td>
      <td>DE_PEC_006</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_CPRE</td>
      <td>DE_PEC_007_CodePrestation</td>
      <td>DE_PEC_007</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_ATMP</td>
      <td>DE_PEC_010_IndicATMP</td>
      <td>DE_PEC_010</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_ALD</td>
      <td>DE_PEC_011_IndicALD</td>
      <td>DE_PEC_011</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_PEC100</td>
      <td>DE_PEC_012_IndicPEC100</td>
      <td>DE_PEC_012</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_L115</td>
      <td>DE_PEC_013_IndicL115</td>
      <td>DE_PEC_013</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_DATMP</td>
      <td>DE_PEC_008_DateATMP</td>
      <td>DE_PEC_008</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_IATMP</td>
      <td>DE_PEC_009_IdentATMP</td>
      <td>DE_PEC_009</td>
      <td></td>
    </tr>
    <tr>
      <th colspan="4"><b><b>Données retournées par le service (Cf. § 2.2.2.)</b></b></th>
    </tr>
    <tr>
      <td>ID_CGR</td>
      <td>DS_PEC_115_CodeGdRegime</td>
      <td>DS_PEC_115</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_NCaG</td>
      <td>DS_PEC_116_NoCaisseGest</td>
      <td>DS_PEC_116</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_NCeG</td>
      <td>DS_PEC_117_NoCentreGest</td>
      <td>DS_PEC_117</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_CNaA</td>
      <td>DS_PEC_118_CodeNatAssurance</td>
      <td>DS_PEC_118</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_DMAT</td>
      <td>DS_PEC_119_DateMaternite</td>
      <td>DS_PEC_119</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_RBEN</td>
      <td>DS_PEC_120_RangBeneficiaire</td>
      <td>DS_PEC_120</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_ISP</td>
      <td>DS_PEC_122_IndicSituationPart</td>
      <td>DS_PEC_122</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_TP</td>
      <td>DS_PEC_123_TypeContrat</td>
      <td>DS_PEC_123</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_NoOC</td>
      <td>DS_PEC_124_NoOrgCompl</td>
      <td>DS_PEC_124</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_DeRg</td>
      <td>DS_PEC_125_DestReglt</td>
      <td>DS_PEC_125</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_EXO</td>
      <td>DS_PEC_126_JustifExoTM</td>
      <td>DS_PEC_126</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_TPre</td>
      <td>DS_PEC_127_TauxPrestation</td>
      <td>DS_PEC_127</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_ITPR1</td>
      <td>DS_PEC_130_IndicTPReglt</td>
      <td>DS_PEC_130</td>
      <td></td>
    </tr>
    <tr>
      <td>ID_ITPR2</td>
      <td>DS_PEC_131_IndicTPReglt</td>
      <td>DS_PEC_131</td>
      <td></td>
    </tr>
    <tr>
      <td><b>ID_CME</b></td>
      <th colspan="3"><b>Code et motif de l’échec (Cf. Annexe A - Messages d’erreur)</b></th>
    </tr>
    <tr>
      <td>ID_COD</td>
      <td>CodeErreurServicePEC</td>
      <td></td>
      <td>Valeur de la balise &#x3C;value> du<br />subcode du code de l’erreur de la<br />soap fault.</td>
    </tr>
    <tr>
      <td>ID_MERR</td>
      <td>MotifErreurServicePEC</td>
      <td></td>
      <td>Valeur de l’attribut « code du<br />détail de l’erreur de la soap fault.</td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **33 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*MP Facturation Transporteur B2 -*
**SEL-MP-010** *WS_PEC+ - "Aide à la prise en charge"* **Version : 03.11**

# **Annexe 1 Messages d’erreur**

## **A1-1 Erreurs SSL**

Les erreurs techniques liées à la négociation SSL ne font pas l'objet d'une réponse HTTP/SOAP.

Elles sont prises en charge par le LPS pour les cas suivants :

<table>
  <thead>
    <tr>
      <th><b>Code erreur</b></th>
      <th><b>Signification</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>990</td>
      <td>Erreur générique de connexion SSL</td>
    </tr>
  </tbody>
</table>

## **A1-2 Erreurs du service PEC+**

**>> **En cas d’erreur remontée par le service, le LPS affiche une fenêtre** contenant le libellé de l’erreur** *(colonne fault SOAP/Reason)*, **sans traitement, et suivi du code entre parenthèses.**

*Le progiciel doit donner accès au détail de l’erreur (colonne Detail) au PS qui souhaite obtenir un complément d’information. »*

Le code erreur est préfixé par le nom de l'espace de nommage.

Par exemple, pour une déclaration `xmlns:soapenv="http://www.w3.org/2003/05/soap-envelope"`, le code erreur est préfixé par soapenv (par exemple : soapenv:10).

**>> Attention, le nom de l'espace de nommage peut varier.**

Les valeurs des éléments de la faute SOAP sont récapitulées dans le tableau ci-dessous :

icon: warning triangle La liste des messages d’erreur décrits ci-dessous est évolutive.

<table>
  <thead>
    <tr>
      <th colspan="6"><b>SOAP Fault</b></th>
    </tr>
    <tr>
      <th colspan="2">Code</th>
      <th rowspan="2">Reason</th>
      <th colspan="3">Detail</th>
    </tr>
    <tr>
      <th>Value</th>
      <th>Subcode</th>
      <th>Code</th>
      <th>Severite</th>
      <th>Descriptif</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="3">Sender</td>
      <td>pec_ps_8</td>
      <td>Ce service n'est pas<br />ouvert pour cette<br />nature de prestation</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_10</td>
      <td>La date de réalisation<br />est antérieure à la date<br />de prescription</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_12</td>
      <td>Pour les soins en<br />rapport avec le L 115,<br />merci d'adresser les<br />pièces papiers à la<br />CNMSS, Département<br />des soins médicaux<br />gratuits, 247 avenue<br />Jacques Cartier,<br />83090 Toulon Cedex 9</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **34 / 38**
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

**SEL-MP-010**
***MP Facturation Transporteur B2 -***
***WS_PEC+ - "Aide à la prise en charge"***
**Version : 03.11**

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
      <th>Severite</th>
      <th>Descriptif</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="10">Sender</td>
      <td>pec_ps_13</td>
      <td>Le bénéficiaire est inconnu pour cet assuré.<br /><br />Veuillez vérifier sa date de naissance ou,<br /><br />le cas échéant, vous rapprocher de celui-ci.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_15</td>
      <td>Le NIR renseigné est inconnu. Veuillez demander l'attestation de l'assuré afin de connaître sa caisse d'affiliation et vérifier son numéro d'immatriculation.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
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
  </tbody>
</table>

***19/10/2016***
***GIE SESAM-Vitale***
***35 / 38***
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***SEL-MP-010*** *MP Facturation Transporteur B2 -* **Version : 03.11**
***WS_PEC+ - "Aide à la prise en charge"***

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
      <th>Severite</th>
      <th>Descriptif</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="15">Sender</td>
      <td>pec_ps_32</td>
      <td>Le bénéficiaire n'a pas<br />de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_33</td>
      <td>Le bénéficiaire n'a pas<br />de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_34</td>
      <td>Le bénéficiaire n'a pas<br />de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_37</td>
      <td>Le bénéficiaire n'a pas<br />de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_39</td>
      <td>La donnée clé du NIR<br />est incorrecte</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_40</td>
      <td>Le bénéficiaire n'a pas<br />de droits ouverts</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_41</td>
      <td>Le régime [nom du<br />régime] ne gère pas<br />les AT/MP</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_42</td>
      <td>La date de l'AT ou<br />l'identifiant de l'AT<br />doivent<br />obligatoirement être<br />renseigné.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_43</td>
      <td>Le bénéficiaire n’a<br />aucun droit</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_44</td>
      <td>Pas de<br />correspondance dans<br />notre référentiel<br />assurés.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_50</td>
      <td>La date de prestation<br />est postérieure à la<br />date du jour.</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>pec_ps_85</td>
      <td>L'AT/MP est inconnu<br />au référentiel</td>
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
      <td>La date de prescription<br />est antérieure à la date<br />de l'AT/MP</td>
      <td>-</td>
      <td>-</td>
      <td>-</td>
    </tr>
    <tr>
      <td>siram_20</td>
      <td>Vous ne disposez pas<br />des droits suffisants<br />pour accéder à ce<br />service.</td>
      <td>pec_err_msa_100</td>
      <td>fatale</td>
      <td>Ce service n'est pas<br />autorisé pour le<br />partenaire MSA</td>
    </tr>
  </tbody>
</table>

**19/10/2016** **GIE SESAM-Vitale** **36 / 38**
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

***MP Facturation Transporteur B2 -***
***SEL-MP-010*** ***WS_PEC+ - "Aide à la prise en charge"*** ***Version : 03.11***

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
      <th>Severite</th>
      <th>Descriptif</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Sender</td>
      <td>siram_10</td>
      <td>Une erreur technique survenue sur votre poste de travail empêche le traitement de votre demande. Vous pouvez renouveler votre demande. Si le problème persiste, contactez l’éditeur du progiciel ou votre responsable informatique.</td>
      <td>pec_err_msa_101</td>
      <td rowspan="13">fatale</td>
      <td>Ce flux n'est pas valide</td>
    </tr>
    <tr>
      <td rowspan="12">Receiver</td>
      <td rowspan="12">siram_40</td>
      <td rowspan="3">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_msa_102</td>
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
      <td rowspan="9">Le service est temporairement inaccessible. Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_msa_105</td>
      <td>Accès base de données indisponible</td>
    </tr>
    <tr>
      <td>pec_err_technique_108</td>
      <td>Le code caisse/organisme doit être sur 3 caractères.</td>
    </tr>
    <tr>
      <td>pec_err_technique_109</td>
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
  </tbody>
</table>

***19/10/2016*** ***GIE SESAM-Vitale*** **37 / 38**
***Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale***

* **SEL-MP-010** * * **MP Facturation Transporteur B2 -** *
* **WS_PEC+ - "Aide à la prise en charge"** * * **Version : 03.11** *

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
      <th>Severite</th>
      <th>Descriptif</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="5">Receiver</td>
      <td rowspan="3"></td>
      <td>Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement.<br />Si le problème persiste, contactez l’éditeur du progiciel.</td>
      <td>pec_err_technique_104</td>
      <td rowspan="5">fatale</td>
      <td>Réponse du service appelé par DC indisponible : NRGD</td>
    </tr>
    <tr>
      <td rowspan="2">Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_technique_105</td>
      <td>Réponse du service appelé par DC indisponible : R1NSROU</td>
    </tr>
    <tr>
      <td>pec_err_technique_106</td>
      <td>Réponse du service appelé par DC indisponible : FASIBEN</td>
    </tr>
    <tr>
      <td rowspan="2">siram_40</td>
      <td rowspan="2">Le service est temporairement inaccessible.<br />Veuillez renouveler votre demande ultérieurement.</td>
      <td>pec_err_technique_107</td>
      <td>Réponse du service appelé par DC indisponible : TBI</td>
    </tr>
    <tr>
      <td>pec_err_technique_e1t</td>
      <td>Une erreur inconnue s'est produite</td>
    </tr>
  </tbody>
</table>

## **A1-3 Autres erreurs**

Toute erreur qui n’est pas décrite dans les sections précédentes doit conduire à l'affichage du message suivant :

«Service PEC+ : une erreur est survenue lors de l'appel au service. La demande n'a pas pu aboutir. Contactez votre support technique si l'erreur persiste. (Erreur code XXX).»

▶▶ **Remplacer XXX par le code erreur remonté. Si aucun code erreur n'est fourni par le système, mettre le code erreur à 999.**

* **19/10/2016** * * **GIE SESAM-Vitale** * * **38 / 38** *
* *Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale* *