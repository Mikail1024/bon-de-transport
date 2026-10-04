SEL- GCONFORM- PEL | Version 0.80.06

![logo: CNDA Centre National de Dépôt et d'Agrément](page_1_image_2_v2.jpg)

# **Service en Ligne/Service TR**

**GUIDE DE TESTS DE CONFORMITE**

# **Service Facturation Transporteur Etendue**
# **intégré aux LPS**

## **Prescription en ligne**

### **Guide de tests de conformité**

![logo: SEFI l'Assurance Maladie Transport](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td><mark>0.80.06</mark></td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td><mark>21/08/2026</mark></td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
    </tr>
</table>

<table>
    <tr>
      <td>té - Prescription en ligne</td>
      <td>1/27</td>
    </tr>
</table>

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 1/27

<table>
    <tr>
      <td>SEL- GCONFORM- PEL</td>
      <td></td>
      <td>Version 0.80.06</td>
    </tr>
</table>

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
      <td>03/08/2012</td>
      <td>0.51</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>15/10/2012</td>
      <td>0.51.1</td>
      <td>Mise à jour des codes erreurs avec le guide d’intégration<br />« Prescription en ligne » version 0.40</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>26/11/2012</td>
      <td>0.51.2</td>
      <td>Ajout des données d’entrée nécessaire à la réalisation des<br />tests.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>28/01/2013</td>
      <td>0.51.3</td>
      <td>Test 1.06 : Précision sur les données non modifiables de la<br />PEL<br /><br />Test 3.05 : Suppression d’une information dans « à<br />vérifier »</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/03/2013</td>
      <td>0.71</td>
      <td>Tests 1.08, 1.09, 1.10 : modification du code erreur<br /><br />Prise en compte du CI 1.0.2 (Tests 1.02, 2.02 et 3.02)</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/12/2013</td>
      <td>0.80</td>
      <td>Test 1.06 : modification du test, ajout du contexte<br />facturation<br /><br />Activation des tests 1.03, 2.03 et 3.03</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>14/03/2014</td>
      <td>0.80.01</td>
      <td>Test 1.03, 2.03, 3.03 : Ajout d’une vérification liée à la<br />phase d’expérimentation.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/09/2014</td>
      <td>0.80.02</td>
      <td>Test 1.03, 2.03, 3.03 : suppression de la vérification liée à<br />la phase d’expérimentation.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/05/2015</td>
      <td>0.80.03</td>
      <td>Test 1.06 : Modification du descriptif du test (évolution<br />des données modifiables de la PEL).</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/05/2019</td>
      <td>0.80.04</td>
      <td>Prise en compte des transporteurs taxis.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/03/2024</td>
      <td>0.80.05</td>
      <td>Test 1.06 : Modification d’une donnée du test.<br /><br />Tests 2.02, 2.04, 2.06, 3.01, 3.02, 3.04, 3.06 : Modification<br />du nom du bénéficiaire.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>21/08/2026</td>
      <td>0.80.06</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>


2/27

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité - Prescription en ligne</td>
      <td>2/27</td>
    </tr>
</table>

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>INTRODUCTION....................................................................................................................................................</strong></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1 PRE REQUIS.........................................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>CAS DE TESTS........................................................................................................................................................</strong></td>
      <td><strong>5</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>2.1 ACQUERIR LES INFORMATIONS D’UNE PEL .............................................................................................. 5</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.01 - CONTROLE ASSERTION PS.......................................................................................................................... 5</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.02 – NIVEAU DE SECURITE DE L’ASSERTION PS .................................................................................................. 6</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.03 – ACTIVATION/DESACTIVATION DU SERVICE................................................................................................... 7</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE ....................................................................................... 8</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.05 – AFFICHAGE DES DONNEES RESTITUEES PAR LE SERVICE .............................................................................. 9</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.06 – UTILISATION DES DONNEES ACQUISES DANS LA FEL ................................................................................. 10</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.07 – INTERDICTION D’IMPRESSION DE LA PEL ................................................................................................. 11</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.08 – AFFICHAGE DES ERREURS SOAP ............................................................................................................. 12</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.09 – AFFICHAGE DES ERREURS SOAP ............................................................................................................. 13</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.10 – AFFICHAGE DES ERREURS SOAP ............................................................................................................. 14</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 1.11 – MODE CONSULTATION D’UNE PEL .......................................................................................................... 15</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>2.2 RESERVER DES PRESTATIONS D’UNE PEL ............................................................................................... 16</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.01 - CONTROLE ASSERTION PS........................................................................................................................ 16</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.02 – NIVEAU DE SECURITE DE L’ASSERTION PS ................................................................................................ 17</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.03 – DESACTIVATION DE L’OPERATION « RESERVER » ...................................................................................... 18</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE ..................................................................................... 19</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.05 –RESERVATION DE PRESTATIONS................................................................................................................. 20</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 2.06 –AFFICHAGE DES ERREURS SOAP .............................................................................................................. 21</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>2.3 SIGNALER LA REALISATION DE PRESTATIONS D’UNE PEL................................................................. 22</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.01 - CONTROLE ASSERTION PS........................................................................................................................ 22</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.02 – NIVEAU DE SECURITE DE L’ASSERTION PS ................................................................................................ 23</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.03 – DESACTIVATION DE L’OPERATION « EXECUTER »...................................................................................... 24</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE ..................................................................................... 25</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.05 – SIGNALER L’EXECUTION DE PRESTATIONS................................................................................................. 26</i></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td><i>TEST 3.06 – AFFICHAGE DES ERREURS SOAP ............................................................................................................... 27</i></td>
      <td></td>
    </tr>
</table>

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | <page_number>3/27</page_number> |
| :--------- | :--------------------------------------------------: | ----------------------------------: |
| :--- | :---: | ---: |

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

# 1 Introduction

## 1.1 Pré requis

**<u><mark>Les références PEL pour réaliser ces tests peuvent être obtenues par demande sur le support du CNDA (directement via votre espace personnel CNDA : https://sicnda.ameli.fr/).</mark></u>**

| 21/08/2026                          | Guide de tests de conformité - Prescription en ligne | 4/27 |
| :---------------------------------- | :--------------------------------------------------: | ---: |
| <page_number>4/27</page_number> |                                                      |      |

<table>
    <tr>
      <td>SEL- GCONFORM- PEL</td>
      <td></td>
      <td>Version 0.80.06</td>
    </tr>
</table>

# 2 Cas de Tests

## 2.1 ACQUERIR LES INFORMATIONS D’UNE PEL

### ***Test 1.01 - Contrôle Assertion PS***

<table>
    <tr>
      <td colspan="2"><b><u>Références documentaires :</u></b></td>
      <td colspan="2">- SEL-MP-014, version 0.40, §2.1<br />FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td rowspan="3"><b><u>Etat du test :</u></b></td>
      <td rowspan="3">Actif</td>
      <td><b><u>Données d’entrée :</u></b></td>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant PEL</td>
      <td>Prescription n°1 à n°5</td>
    </tr>
    <tr>
      <td>Nom du bénéficiaire</td>
      <td>Voir document des prescriptions</td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.
Lancer la requête « acquerirPrescription ».

Une heure plus tard, relancer une nouvelle requête sur une nouvelle prestation.

### <u>*A vérifier*</u> :

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

### <u>*Résultat à fournir*</u> :

Décrire la cinématique mise en œuvre.


5/27

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité - Prescription en ligne</td>
      <td>5/27</td>
    </tr>
</table>

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

# *Test 1.02 – Niveau de sécurité de l’assertion PS*

<table>
    <tr>
      <td colspan="2"><u><i><b>Références documentaires :</b></i></u></td>
      <td colspan="2">- SEL-MP-014, version 0.40, §2.1<br />FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test :</b></i></u></td>
      <td>Actif</td>
      <td><u><i><b>Données d’entrée :</b></i></u><br /><br />Identifiant PEL<br /><br />Nom du bénéficiaire</td>
      <td><br />Prescription n°1 à n°5<br /><br />Voir document des prescriptions</td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée. A partir du LPS, renseigner les données d’entrée.

Lancer la requête « acquerirPrescription »

Cas 1 : Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête sur une nouvelle prescription.

Cas 2 : Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête sur une nouvelle prescription.

## <u>*A vérifier*</u> :

Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :

- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la carte CPE/CDE,
- Recalculer une nouvelle assertion le cas échéant.

Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h

Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion

Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.

## <u>*Résultat à fournir*</u> :

Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associé à ce test.

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | <page_number>6/27</page_number> |
| :--------- | :--------------------------------------------------: | ----------------------------------: |
| :--- | :---: | ---: |

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# *Test 1.03 – Activation/désactivation du service*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- fact-sfg-035-fte05-administrer-le-poste-ps<br />§ 2.3.2 : FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS<br />Fiche d’information 237 du GIE SV(PDT-INF-237)</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

### *<u>Description détaillée du test</u>* :

Le LPS ne doit pas permettre par le biais d’un paramétrage la désactivation de l’opération <acquerirPrescription>.

### *<u>A vérifier</u>* :

Vérifier que le LPS ne permet pas la désactivation.

### *<u>Résultat à fournir</u>* :

Fournir les éléments mettant en évidence cette impossibilité : aucun paramétrage sur le poste de travail possible.

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité - Prescription en ligne</td>
      <td>7/27</td>
    </tr>
</table>

SEL- GCONFORM- PEL | Version 0.80.06

# *Test 1.04 – Données obligatoires en entrée du service*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, §2.1<br />
        <br />
        - FACT-SFG-034, version 0.55, §2.3.3.1<br />
        <br />
        FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td>
        <strong><u><i>Données d’entrée</i></u> :</strong><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        <strong>Prescription n°1 à n°5</strong><br />
        <br />
        <strong>Voir document des prescriptions</strong>
      </td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Essayer de lancer une requête d’accès au service « acquerirPrescription » dans laquelle il manque une des données suivantes :

- L’identifiant de la prescription en ligne,

- Nom bénéficiaire (nom mentionné sur la PEL : nom de famille ou nom d’usage).

## <u>*A vérifier*</u> :

Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une de ces données d’entrée.

## <u>*Résultat à fournir*</u> :

Fournir les éléments mettant en évidence cette saisie obligatoire.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 8/27

SEL- GCONFORM- PEL | Version 0.80.06

# *Test 1.05 – Affichage des données restituées par le service*

<table>
    <tr>
      <th colspan="2"><u><i>Référence documentaire :</i></u></th>
      <td colspan="2">- - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</td>
    </tr>
    <tr>
      <td><u><i>Etat du test :</i></u></td>
      <td>Actif</td>
      <td>
        <u><i>Données d’entrée :</i></u>
        <br /><br />
        Identifiant PEL
        <br /><br />
        Nom du bénéficiaire
      </td>
      <td>
        Prescription n°1 à n°5
        <br /><br />
        Voir document des prescriptions
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

<u>Renseigner les données d’entrée et Lancer une requête d’accès au service « acquerirPrescription ».</u>

## *<u>A vérifier</u> :*

Le LPS doit afficher la totalité des données en sortie retournées par le service :

- **Données générales prescription,**
- **Données du patient,**
- **Données du prescripteur,**
- **Informations du prescripteur libéral,**
- **Informations du prescripteur en structure,**
- **Données de la prestation,**
- **Condition de remboursement,**
- **Données prescription de transport,**
- **Départ et Arrivée**
- **Contexte du transport,**
- **Trajet**

S’il s’agit d’une acquisition décorrélée de la facturation (pas de réservation effectuée), les données ne doivent pas pouvoir être enregistrées par le LPS (cf. test 1.11).

## *<u>Résultat à fournir</u> :*

1) Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur, en fonction des indicateurs de prestation et des statuts.

2) Fournir la cinématique de la consultation.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 9/27

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

# *Test 1.06 – Utilisation des données acquises dans la FEL*

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, §2.1<br />
        - FACT-SFG-034, version 0.55, §2.3.3.1<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td>Actif</td>
      <td>
        <u><strong><em>Données d’entrée :</em></strong></u><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        Prescription n°4<br />
        <br />
        PECPLUSUN
      </td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

### <u>Suite du test précédent</u> :

Lors de la restitution des données du service dans un contexte de facturation, montrer l’impossibilité de modifier une des données de la PEL (données qui vont être utilisées dans une FEL) à <u>l’exception du taux</u>.

Procéder à la modification :

<Taux> de <CDTRMB> (100.0 devient 55.0)

## <u>*A vérifier*</u> :

Le LPS ne doit pas permettre à l’utilisateur de modifier les données en retour du service à l’exception du taux (et uniquement dans un contexte de facturation).

Les adresses de départ et d’arrivée issues de la PEL doivent garder la même structure et le même contenu dans la FEL (A défaut une erreur « ERR_FT_030 sera restituée).

## <u>*Résultat à fournir*</u> :

Présenter les éléments mettant en évidence :

- L’impossibilité de changer les données de la PEL
- La possibilité de modifier le taux restitué dans la PEL

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | 10/27 |
| :--- | :---: | ---: |

<table>
    <tr>
      <td>SEL- GCONFORM- PEL</td>
      <td></td>
      <td>Version 0.80.06</td>
    </tr>
</table>

# *Test 1.07 – Interdiction d’impression de la PEL*

<table>
    <tr>
      <td colspan="2"><b><u>Référence documentaire</u> :</b></td>
      <td colspan="2">- FACT-SFG-030, §2.3<br />- FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</td>
    </tr>
    <tr>
      <td><b><u>Etat du test</u> :</b></td>
      <td>Actif</td>
      <td>
        <b><u>Données d’entrée</u> :</b><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        Prescription n°1 à n°5<br />
        <br />
        Voir document des prescriptions
      </td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

#### <u>Suite du test précédent</u> :

**Les données mises à disposition par l’Assurance Maladie via les services en ligne sont protégées par le droit à la propriété intellectuelle.**

### <u>*A vérifier*</u> :

**Le LPS ne doit pas permettre d’imprimer une prescription (au format PEL) à partir des informations d’une PEL.**

### <u>*Résultat à fournir*</u> :

**Fournir la liste des impressions permises par le LPS**

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité - Prescription en ligne</td>
      <td>11/27</td>
    </tr>
</table>

| SEL- GCONFORM- PEL | Version 0.80.06 |
| :----------------- | --------------: |
| :--- | ---: |

# *Test 1.08 – Affichage des erreurs SOAP*

<table>
    <tr>
      <td colspan="2"><u><strong><i>Référence documentaire :</i></strong></u></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, Annexe 2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><u><strong><i>Etat du test :</i></strong></u></td>
      <td><strong>Actif</strong></td>
      <td>
        <u><strong><i>Données d’entrée :</i></strong></u><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        <br />
        FR0170MGR2B5X1<br />
        <br />
        DUPONT
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Lancer une requête d’accès au service « acquerirPrescription » en renseignant l’identifiant PEL « FR0170MGR2B5X1 » ainsi que le nom du bénéficiaire : « DUPONT ».

## *<u>A vérifier</u> :*

Le logiciel doit afficher au Professionnel de Santé le code erreur « PEL_PS_1 » et le libellé correspondant.

## *<u>Résultat à fournir</u> :*

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans l’interface du logiciel le logiciel.

| 21/08/2026                           | Guide de tests de conformité - Prescription en ligne | 12/27 |
| :----------------------------------- | :--------------------------------------------------: | ----: |
| <page_number>12/27</page_number> |                                                      |       |

<table>
    <tr>
      <td>SEL- GCONFORM- PEL</td>
      <td></td>
      <td>Version 0.80.06</td>
    </tr>
</table>

# *Test 1.09 – Affichage des erreurs SOAP*

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, Annexe 2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td><strong>Actif</strong></td>
      <td>
        <u><strong><em>Données d’entrée :</em></strong></u><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        <br />
        <strong>FR01AAAAAAAAA8</strong><br />
        <br />
        <strong>DUPONT</strong>
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Lancer une requête d’accès au service « acquerirPrescription » en renseignant l’identifiant PEL « FR01AAAAAAAAA8 » ainsi que le nom du bénéficiaire : « DUPONT ».

## *<u>A vérifier</u> :*

Le logiciel doit afficher au Professionnel de Santé le code erreur « PEL_PS_2 » et le libellé correspondant.

## *<u>Résultat à fournir</u> :*

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans l’interface du logiciel le logiciel.

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité - Prescription en ligne</td>
      <td>13/27</td>
    </tr>
</table>

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# *Test 1.10 – Affichage des erreurs SOAP*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, Annexe 2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td>
        <strong><u><i>Données d’entrée</i></u> :</strong><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire
      </td>
      <td>
        <br />
        <br />
        <strong>Prescription n°1 à n°5</strong><br />
        <br />
        <strong>DUPONT</strong>
      </td>
    </tr>
</table>

<u>***Description détaillée du test***</u> :

Lancer une requête d’accès au service « acquerirPrescription » en renseignant l’identifiant PEL ainsi que le nom du bénéficiaire : (Nom non associé à l’identifiant).

<u>***A vérifier***</u> :

Le logiciel doit afficher au Professionnel de Santé le code erreur « PEL_PS_3 » et le libellé correspondant.

<u>***Résultat à fournir***</u> :

Fournir la copie écran affichant le message.

| 21/08/2026                           | Guide de tests de conformité - Prescription en ligne | 14/27 |
| :----------------------------------- | :--------------------------------------------------: | ----: |
| <page_number>14/27</page_number> |                                                      |       |

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

# *Test 1.11 – Mode consultation d’une PEL*

<table>
    <tr>
      <td colspan="2"><strong><u><em>Références documentaires</em></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, §2.1<br />
        - FACT-SFG-034-FTE04 §2.3.3.1 FTE04.31<br />
        <u>- FACT-SFG-030 Présentation générale du système</u> FTE §2.2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td>
        <strong><u><em>Données d’entrée</em></u> :</strong><br />
        Identifiant PEL<br />
        Nom du bénéficiaire
      </td>
      <td>
        Prescription n°1 à n°5<br />
        Voir document des prescriptions
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Le logiciel dans son interface doit permettre l’accès à la seule consultation d’une PEL.
Lancer la requête « acquerirPrescription » avec cette fonctionnalité.

## *<u>A vérifier</u> :*

L’accès à cette fonctionnalité de consultation (via un bouton, menu déroulant…) ne doit permettre que l’affichage des données restituées par le service (en mode consultation l’accès à la réservation ou au signalement de l’exécution n’est pas possible).

Cette fonctionnalité est donc distincte de celle permettant l’acquisition des informations restituées par l’opération <acquerirPrescription> et pouvant être utilisée dans les opérations <reserverTrajet> et <executerTrajet>.

Dans le cadre de la simple consultation de la PEL, le stockage des données restituées est interdit.

## *<u>Résultat à fournir</u> :*

- Fournir les éléments décrivant la présence d’une fonctionnalité de consultation seule distincte de la fonctionnalité d’acquisition de la PEL.

- Fournir les éléments indiquant l’absence de stockage des données restituées par le service en mode de simple consultation.

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | 15/27 |
| :--- | :---: | ---: |

SEL- GCONFORM- PEL | Version 0.80.06

# 2.2 RESERVER DES PRESTATIONS D’UNE PEL

## *Test 2.01 - Contrôle Assertion PS*

<table>
    <tr>
      <td colspan="2"><strong><u><em>Références documentaires :</em></u></strong></td>
      <td colspan="2">- SEL-MP-014, version 0.40, §2.2<br />- FACT-SFG-031, version 0.50, §2.3.1<br />- FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong><br />Identifiant PEL<br />Nom du bénéficiaire<br />Identifiant(s) prestation(s)</td>
      <td>Prescription n°3<br />Prestation n°1</td>
    </tr>
</table>

<u>**Description détaillée du test :**</u>

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.
Sélectionner à partir du LPS, la ou les prestations qui doivent être réservées.

Lancer la requête « reserverTrajet »

Une heure plus tard, relancer une nouvelle requête sur une nouvelle prestation.

<u>**A vérifier :**</u>

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

<u>**Résultat à fournir :**</u>

Décrire la cinématique mise en œuvre.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 16/27

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# *Test 2.02 – Niveau de sécurité de l’assertion PS*

<table>
    <tr>
      <td colspan="2"><b><u><i>Références documentaires :</i></u></b></td>
      <td colspan="2">- SEL-MP-014, version 0.40, §2.2<br />- FACT-SFG-031, version 0.50, §2.3.1<br />- FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</td>
    </tr>
    <tr>
      <td><b><u><i>Etat du test :</i></u></b></td>
      <td>Actif</td>
      <td><b><u><i>Données d’entrée :</i></u></b><br /><br />Identifiant PEL<br /><br />Nom du bénéficiaire<br /><br />Identifiant(s) prestation(s)</td>
      <td><br /><br /><b>Prescription n°3</b><br /><br /><b>PECPLUSUN</b><br /><br /><b>Prestation n°2 (cas 1)<br />et Prestation n°3 (cas<br />2)</b></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée. Sélectionner à partir du LPS, la ou les prestations qui doivent être réservée(s).

Lancer la requête « reserverTrajet »

Cas 1 : Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête sur une nouvelle prestation.

Cas 2 : Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête sur une nouvelle prestation.

## *<u>A vérifier</u> :*

Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :

- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la carte CPE/CDE,
- Recalculer une nouvelle assertion le cas échéant.

Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h

Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion

Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.

## *<u>Résultat à fournir</u> :*

Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associé à ce test.

| 21/08/2026                           | Guide de tests de conformité - Prescription en ligne | 17/27 |
| :----------------------------------- | :--------------------------------------------------: | ----: |
| <page_number>17/27</page_number> |                                                      |       |

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# *Test 2.03 – Désactivation de l’opération « reserver »*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        <strong>- fact-sfg-035-fte05-administrer-le-poste-ps</strong><br />
        <strong>§ 2.3.2 : FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS</strong><br />
        <strong>Fiche d’information 237 du GIE SV(PDT-INF-237)</strong>
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>**Description détaillée du test**</u> :

Le LPS ne doit pas permettre par le biais d’un paramétrage la désactivation de l’opération
&lt;reserverTrajet&gt;.

### <u>**A vérifier**</u> :

Vérifier que le LPS ne permet pas la désactivation.

### <u>**Résultat à fournir**</u> :

Fournir les éléments mettant en évidence cette impossibilité : aucun paramétrage sur le poste de
travail possible.

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | <page_number>18/27</page_number> |
| :--------- | :--------------------------------------------------: | -----------------------------------: |
| :--- | :---: | ---: |

| SEL- GCONFORM- PEL |    | Version 0.80.06 |
| :----------------- | :- | :-------------- |
| :--- | :--- | :--- |

# *Test 2.04 – Données obligatoires en entrée du service*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, §2.2<br />
        - FACT-SFG-031, version 0.50, §2.3.1<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td><strong>Actif</strong></td>
      <td>
        <strong><u><i>Données d’entrée :</i></u></strong><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire<br />
        <br />
        Identifiant(s) prestation(s)
      </td>
      <td>
        <strong>Prescription n°3</strong><br />
        <br />
        <strong>PECPLUSUN</strong><br />
        <br />
        <strong>Prestations n°2 et n°3</strong>
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Essayer de lancer une requête d’accès au service « reserverTrajet » dans laquelle il manque une des données suivantes :

- L’identifiant de la prescription en ligne,
- Nom bénéficiaire,
- Le(s) identifiant(s) prestation(s),

## *<u>A vérifier</u> :*

Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une de ces données d’entrée.

## *<u>Résultat à fournir</u> :*

Fournir les éléments mettant en évidence cette saisie obligatoire.

| 21/08/2026                           | Guide de tests de conformité - Prescription en ligne | 19/27 |
| :----------------------------------- | :--------------------------------------------------: | ----: |
| <page_number>19/27</page_number> |                                                      |       |

| SEL- GCONFORM- PEL | Version 0.80.06 |
| :----------------- | :-------------- |
| :--- | :--- |

# *Test 2.05 –Réservation de prestations*

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">- SEL-MP-014, version 0.40, §2.2<br />- FACT-SFG-031, version 0.50, §2.3.1<br />- FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong><br /><br />Identifiant PEL<br /><br />Nom du bénéficiaire<br /><br />Identifiant(s) prestation(s)</td>
      <td><br /><br />Prescription n°1<br /><br />PECPLUSUN<br /><br />Prestations : cf. test</td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

**Le LPS doit donner la possibilité au Transporteur de sélectionner une ou plusieurs prestation(s) à réserver d’une même PEL.**

**Tenter de réserver l’ensemble des prestations de la prescription.**

**Le logiciel peut ne pas autoriser l’envoi d’une demande de réservation pour une prestation qui n’a pas un statut qui le permet (statut exécuté et réalisé).**

### <u>*A vérifier*</u> :

**Le LPS doit afficher les données en sortie retournées par le service :**

-   **Identifiant des prestations,**
-   **Liste actualisée des prestations : statut trajet, horodatage**

**Si le logiciel ne fait pas de contrôle sur le statut de la prestation, afficher le message d’information : code et libellé (pour les prestations n’ayant pas pu être réservées) « ERR_PT_006 ».**

> **Remarque : la prestation ne peut pas être signalée « réservée » car elle n’est pas à l’état « prescrite » ou « réservée » .**

### <u>*Résultat à fournir*</u> :

**Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur.**

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 20/27

SEL- GCONFORM- PEL | Version 0.80.06

# *Test 2.06 –Affichage des erreurs SOAP*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-014, version 0.40, Annexe 2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td>
        <strong><u><i>Données d’entrée</i></u> :</strong><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire<br />
        <br />
        Identifiant de la prestation
      </td>
      <td>
        <br />
        Prescription n°3<br />
        <br />
        PECPLUSUN<br />
        <br />
        « 9999 »
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

Lancer une requête d’accès au service « reserverTrajet » pour la prestation dont l’identifiant est :
« 9999 ».

## *<u>A vérifier</u>* :

Le logiciel doit afficher au Professionnel de Santé le code et le libellé du message d’information :
 « ERR_PC_038 ».

**Remarque :** l’identifiant de la prestation est introuvable

Le logiciel peut également empêcher la réservation d’une prestation dont l’identifiant n’a pas été
restitué lors de l’acquisition de la PEL.

## *<u>Résultat à fournir</u>* :

Fournir la copie écran affichant le message.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 21/27

SEL- GCONFORM- PEL | Version 0.80.06

## 2.3 SIGNALER LA REALISATION DE PRESTATIONS D’UNE PEL

### *Test 3.01 - Contrôle Assertion PS*

<table>
    <tr>
      <td colspan="2"><strong><u><i>Références documentaires :</i></u></strong></td>
      <td colspan="2">
        - SEL-MP-014, §2.3<br />
        - FACT-SFG-031 §2.3.2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL<br />
        - Cadre Interopérabilité
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td><strong>Actif</strong></td>
      <td>
        <strong><u><i>Données d’entrée :</i></u></strong><br />
        Identifiant PEL<br />
        Nom du bénéficiaire<br />
        Identifiant de la Prestation
      </td>
      <td>
        <strong>Prescription n°3</strong><br />
        <strong>PECPLUSUN</strong><br />
        <strong>Prestation n°1</strong>
      </td>
    </tr>
</table>

**<u>*Description détaillée du test*</u> :**

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.
Sélectionner à partir du LPS, la ou les prestations qui doivent être signalée(s) comme réalisée(s).
Lancer la requête « executerTrajet »

Une heure plus tard, relancer une nouvelle requête sur une nouvelle prestation.

**<u>*A vérifier*</u> :**

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

**<u>*Résultat à fournir*</u> :**

Décrire la cinématique mise en œuvre.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 22/27

SEL- GCONFORM- PEL | Version 0.80.06

# ***Test 3.02 – Niveau de sécurité de l’assertion PS***

<table>
    <tr>
      <td colspan="2"><u><b><i>Références documentaires :</i></b></u></td>
      <td colspan="2">
        - FACT-SFG-031<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <td><u><b><i>Etat du test :</i></b></u></td>
      <td>Actif</td>
      <td>
        <u><b><i>Données d’entrée</i></b></u><b><i> :</i></b><br />
        Identifiant PEL<br />
        Nom du bénéficiaire<br />
        Identifiant(s) prestation(s)
      </td>
      <td>
        Prescription n°3<br />
        <b>PECPLUSUN</b><br />
        <b>Prestation n°2 (cas 1) et<br />
        Prestation n°3 (cas 2)</b>
      </td>
    </tr>
</table>

## <u>***Description détaillée du test***</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée. Sélectionner à partir du LPS, la ou les prestations qui doivent être signalée(s) comme réalisée(s).

Lancer la requête « executerTrajet »

**Cas 1 : Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête sur une nouvelle prestation.**

**Cas 2 : Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête sur une nouvelle prestation.**

## <u>***A vérifier***</u> :

**Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :**

- **Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,**
- **Demander la saisie du code porteur de la carte CPE/CDE,**
- **Recalculer une nouvelle assertion le cas échéant.**

**Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h**

**Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion**

**Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.**

## <u>***Résultat à fournir***</u> :

**Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associé à ce test.**

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 23/27

SEL- GCONFORM- PEL | Version 0.80.06

# *Test 3.03 – Désactivation de l’opération « executer »*

<table>
    <tr>
      <td colspan="2"><u><i><b>Référence documentaire</b></i></u><b> :</b></td>
      <td colspan="2">
        <b>- fact-sfg-035-fte05-administrer-le-poste-ps</b><br />
        <b>§ 2.3.2 : FTE05.02 : Règles de paramétrage des indicateurs d’activation des WS</b><br />
        <b>Fiche d’information 237 du GIE SV(PDT-INF-237)</b>
      </td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test</b></i></u><b> :</b></td>
      <td><b>Actif</b></td>
      <td><u><i><b>Données d’entrée</b></i></u><b> :</b></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Le LPS ne doit pas permettre par le biais d’un paramétrage la désactivation de l’opération \<executerTrajet>.

## *<u>A vérifier</u> :*

Vérifier que le LPS ne permet pas la désactivation.

## *<u>Résultat à fournir</u> :*

Fournir les éléments mettant en évidence cette impossibilité : aucun paramétrage sur le poste de travail possible.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 24/27

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

## *Test 3.04 – Données obligatoires en entrée du service*

<table>
    <tr>
      <td colspan="2"><b><u><i>Référence documentaire</i></u> :</b></td>
      <td colspan="2">
        - <b>SEL-MP-014, §2.3</b><br />
        - <b>FACT-SFG-031, §2.3.2</b><br />
        - <b>FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</b>
      </td>
    </tr>
    <tr>
      <td rowspan="4"><b><u><i>Etat du test</i></u> :</b></td>
      <td rowspan="4"><b>Actif</b></td>
      <td><b><u><i>Données d’entrée</i></u> :</b></td>
      <td><b>Prescription n°3</b></td>
    </tr>
    <tr>
      <td>Identifiant PEL</td>
      <td><b>PECPLUSUN</b></td>
    </tr>
    <tr>
      <td>Nom du bénéficiaire</td>
      <td rowspan="2"><b>Prestations n°2 et n°3</b></td>
    </tr>
    <tr>
      <td>Identifiant de la Prestation</td>
    </tr>
</table>

### *<u>Description détaillée du test</u> :*

Essayer de lancer une requête d’accès au service « executerTrajet » dans laquelle il manque une des données suivantes :

- L’identifiant de la prescription en ligne,
- Nom bénéficiaire,
- Le(s) identifiant(s) prestation(s),

### *<u>A vérifier</u> :*

Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une de ces données d’entrée.

### *<u>Résultat à fournir</u> :*

Fournir les éléments mettant en évidence cette saisie obligatoire.

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | <page_number>25/27</page_number> |
| :--------- | :--------------------------------------------------: | -----------------------------------: |
| :--- | :---: | ---: |

SEL- GCONFORM- PEL | Version 0.80.06

# *Test 3.05 – Signaler l’exécution de prestations*

<table>
    <tr>
      <th colspan="2"><u><b>Référence documentaire</b></u><b> :</b></th>
      <td colspan="2">
        - SEL-MP-014, §2.3<br />
        - FACT-SFG-031, §2.3.2<br />
        - FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL
      </td>
    </tr>
    <tr>
      <th rowspan="3"><u><b>Etat du test</b></u><b> :</b></th>
      <td rowspan="3">Actif</td>
      <th><u><b>Données d’entrée</b></u><b> :</b></th>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant PEL</td>
      <td><b>Prescription n°1</b></td>
    </tr>
    <tr>
      <td>Nom du bénéficiaire</td>
      <td><b>PECPLUSUN</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>Identifiant de la Prestation</td>
      <td><b>Prestations : cf. test</b></td>
    </tr>
</table>

### *<u>Description détaillée du test</u> :*

Le LPS doit donner la possibilité au Transporteur, dans un même PEL, de sélectionner une ou plusieurs prestation(s) réservée(s) par lui-même.

Tenter d’exécuter l’ensemble de des prestations de la prescription.

Le logiciel peut ne pas autoriser l’envoi d’une demande d’exécution pour une prestation qui n’a pas un statut qui le permet (statut Réservé par le transporteur demandant l’exécution)

Lancer les requêtes d’accès au service « executerTrajet ».

Facturer (contrôle de recevabilité et valider la facture) les prestations qui ont pu être signalées exécutées.

### *<u>A vérifier</u> :*

Le LPS doit afficher les données en sortie retournées par le service :

- Identifiant des prestations,
- Liste actualisée des prestations : statut trajet, horodatage

Si le logiciel ne fait pas de contrôle sur le statut de la prestation, afficher le message d’information : code et libellé (pour les prestations n’ayant pas pu être réalisées) « ERR_PT_007 ».

<u>Remarque : la prestation ne peut pas être signalée « réalisée » car elle n’est pas à l’état « réservée ».</u>

### *<u>Résultat à fournir</u> :*

Fournir les données en sortie retournées par le service (« executerTrajet »., « controlerRecevabilite» et « valider » .et les copies d’écrans présentées au transporteur.

21/08/2026 | Guide de tests de conformité - Prescription en ligne | 26/27

| SEL- GCONFORM- PEL |     | Version 0.80.06 |
| :----------------- | :-: | --------------: |
| :--- | :---: | ---: |

# *Test 3.06 – Affichage des erreurs soap*

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">- SEL-MP-014, version 0.40, Annexe 2<br />- FACT-SFG-029 DICO §3.3 DF_FTE_PEL :PEL</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td><strong>Actif</strong></td>
      <td>
        <strong><u><em>Données d’entrée</em></u> :</strong><br />
        <br />
        Identifiant PEL<br />
        <br />
        Nom du bénéficiaire<br />
        <br />
        Identifiant de la prestation
      </td>
      <td>
        <br />
        <br />
        <strong>Prescription n°3</strong><br />
        <br />
        <strong>PECPLUSUN</strong><br />
        <br />
        <strong>« 9999 »</strong>
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

Lancer une requête d’accès au service « executerTrajet » pour la prestation dont l’identifiant est :
« 9999 ».

Remarque : Le logiciel peut interdire à l’utilisateur l’envoi d’une requête « executerTrajet » pour une prestation inexistante.

## *<u>A vérifier</u> :*

Le logiciel doit afficher au Professionnel de Santé le code et le libellé du message d’information :
« ERR_PC_038 ».

Remarque : la prestation ne peut pas être signalée « exécutée » car elle est introuvable.

## *<u>Résultat à fournir</u> :*

Fournir la copie écran affichant le message.

| 21/08/2026 | Guide de tests de conformité - Prescription en ligne | 27/27 |
| :--- | :---: | ---: |