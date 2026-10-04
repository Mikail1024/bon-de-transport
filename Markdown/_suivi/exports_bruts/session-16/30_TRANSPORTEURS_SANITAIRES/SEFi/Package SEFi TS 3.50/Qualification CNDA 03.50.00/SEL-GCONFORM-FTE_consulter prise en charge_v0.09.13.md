## **Service en Ligne/Service TR**

---

### **GUIDE DE TESTS DE CONFORMITE**

![logo: CNDA](page_1_image_2_v2.jpg)




# **Service Facturation Transporteur Etendue**
# **intégré aux LPS**

# **Consulter prise en charge en intégré**
# **LPS pour la FEL**
## **Guide de tests de conformité**

![logo: l'Assurance Maladie SEFI Transport](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td>0.09.13</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>21/08/2026</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
    </tr>
</table>

# HISTORIQUE DES VERSIONS

<table>
  <thead>
    <tr>
      <th colspan="4">HISTORIQUE DES VERSIONS</th>
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
      <td>27/03/2013</td>
      <td>0.41</td>
      <td>Création du document.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>28/08/2013</td>
      <td>0.41.06</td>
      <td>Modification des dates de prescription et réalisation.<br /><br />Tests 1.04, 1.05, 1.06, 1.07, 1.08, 1.09, 1.10 : modification du contrat AMO dans « A vérifier ».<br /><br />Test 1.17 Ajout précisions dans « A vérifier »<br /><br />Ajout du test 2.01 sur la gestion des traces</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>14/03/2014</td>
      <td>0.09</td>
      <td>Tests 1.04 à 1.14 : modification des données attendues restituées par le service.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>23/05/2014</td>
      <td>0.09.01</td>
      <td>Modification dans les descriptifs des factures de la caisse gestionnaire 349 en 261 et du code centre de 9881 en 9880.<br /><br />Test 1.03 : modification de la description et du résultat attendu.<br /><br />Test 1.16 : modification du code erreur attendu.<br /><br />Test 1.17 : modification du périmètre du test pour l’expérimentation.<br /><br />Test 1.18 : ce test est hors du périmètre de l’expérimentation.<br /><br />Test 2.01 : tests suspendu.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/09/2014</td>
      <td>0.09.02</td>
      <td>Test 1.04 : Ajout d’une information dans « A vérifier » et « Résultat attendu ».<br /><br />Test 1.11 : modification de la date de maternité dans le résultat attendu.<br /><br />Test 1.15 : Modification du code erreur retourné dans le test.<br /><br />Test 1.17 : prise en compte du périmètre de la présérie.<br /><br />Test 1.18 : modification du cas à prendre en compte pour la réalisation du test pour être conforme au périmètre de la présérie.<br /><br />Test 2.01 supprimé</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/05/2015</td>
      <td>0.09.03</td>
      <td>Test 1.16 : Modification d’une information dans « A vérifier »<br /><br />Test 1.18 : Suppression d’une information dans la description du test.<br /><br />Test 1.19 : Suppression de la vérification de la cohérence date de naissance/date de maternité (qui n’est pas une donnée d’entrée du service).</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>16/06/2015</td>
      <td>0.09.04</td>
      <td>Création des tests 1.21, 1.22 et 1.23 relatifs à l’ACS.</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

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
      <td>25/03/2016</td>
      <td>0.09.05</td>
      <td>Tests : 1.04, 1.05, 1.06, 1.08, 1.09, 1.10, 1.11, 1.12, 1.13,<br />1.14, 1.15, 1.16 modification des dates de<br />prescription/transport.<br /><br />Test 1.07 : Suppression du test.<br /><br />Test 1.17 : ajout d’une précision et d’une vérification.<br /><br />Ajout de précisions et modification des dates de<br />prescription/réalisation dans les tests 1.21, 1.22 et 1.23</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/01/2017</td>
      <td>0.09.06</td>
      <td>Test 1.09 : Suppression du test.<br /><br />Test 1.17 : Prise en compte de la suppression du test 1.09.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/10/2017</td>
      <td>0.09.07</td>
      <td>Maintenance : mise à jour des dates<br /><br />Test 1.17 : Extension du périmètre du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>01/03/2019</td>
      <td>0.09.08</td>
      <td>Maintenance : mise à jour des dates.<br /><br />Test 1.05 : Ajout d’une précision relative à l’ALD.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/05/2019</td>
      <td>0.09.09</td>
      <td>Prise en compte des transporteurs taxis.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>30/11/2020</td>
      <td>0.09.10</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/03/2024</td>
      <td>0.09.11</td>
      <td>Maintenance<br /><br />Test 1.14 : Modification du bénéficiaire du test.<br /><br />Tests 1.21 à 1.23 : Suppression des cas de tests.<br /><br />Test 1.24 : Création du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>24/12/2024</td>
      <td>0.09.12</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td><mark>0.09.13</mark></td>
      <td><mark>Test 1.10 : Ajout d’une vérification.</mark><br /><mark>Test 1.25 : Création du test.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

# TABLE DES MATIERES

<table>
    <tr>
      <td colspan="3"><b><b>TABLE DES MATIERES................................................................................................................................................ 4</b></b></td>
    </tr>
    <tr>
      <td><b>1</b></td>
      <td><b>CONSULTER LES MODALITES DE PRISE EN CHARGE EN INTEGRE LPS POUR LA FEL............................</b></td>
      <td><b>5</b></td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 ASSERTION PS – NIVEAU DE SECURITE .......................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1. 02 CONTROLE PRESENCE CDE/CPE ...............................................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1. 03 ACTIVATION/DESACTIVATION DU SERVICE ................................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1. 04 ACCIDENT DU TRAVAIL..............................................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 TRANSPORT EN RAPPORT AVEC L’ALD EXONERANTE DU PATIENT...........................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.06 REGIME EXONERANT ................................................................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td></td>
      <td><u>TEST 1.08 AIDE MEDICALE</u> ETAT..............................................................................................................................</td>
      <td>12</td>
    </tr>
    <tr>
      <td></td>
      <td><mark>TEST 1.10 C2S (EX CMU-C).....................................................................................................................................</mark></td>
      <td>13</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.11 NATURE D’ASSURANCE MATERNITE ........................................................................................................</td>
      <td>14</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.12 TAUX REGIME GENERAL...........................................................................................................................</td>
      <td>15</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.13 TAUX ALSACE MOSELLE..........................................................................................................................</td>
      <td>16</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.14 TAUX FOND SOLIDARITE VIEILLESSE .......................................................................................................</td>
      <td>17</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.15 SOINS MEDICAUX GRATUITS....................................................................................................................</td>
      <td>18</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.16 MATRICULE CORSE ET DATE DE NAISSANCE LUNAIRE ..............................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.17 INTEGRATION DES DONNEES PEC DANS LA FACTURE ...............................................................................</td>
      <td>20</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.18 POSSIBILITE DE MODIFICATION DANS LA FEL DES DONNEES RESTITUEES PAR PEC..................................</td>
      <td>21</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.19 CONTROLE DES DATES..............................................................................................................................</td>
      <td>22</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.20 COHERENCE DES DONNEES DE LA REQUETE SOAP...................................................................................</td>
      <td>23</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.24 FACTURATION D’UNE PRESTATION TMR..................................................................................................</td>
      <td>24</td>
    </tr>
    <tr>
      <td></td>
      <td><mark><u>TEST 1.25 FACTURATION D’UNE PRESTATION TRANSPORT URGENT PREHOSPITALIER</u> ...............................................</mark></td>
      <td>25</td>
    </tr>
</table>

# 1 Consulter les modalités de prise en charge en intégré LPS pour la FEL

## Test 1.01 Assertion PS – niveau de sécurité

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td>NIR : 1 65 01 63 220 102 / 18<br />
        <br />
        <u>Date de naissance :</u><br />
        <u>01/01/1965</u><br />
        <br />
        Rang de naissance : 1<br />
        <br />
        Code régime : 01</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th><u><b>Description détaillée du test</b></u><b> :</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Présence dans le lecteur de la carte CDE-CPE identifiée / authentifiée depuis moins d’une heure.</b></td>
    </tr>
    <tr>
      <td><b>Lancer la requête « Consulter prise en charge en intégré LPS pour la FEL ».</b></td>
    </tr>
    <tr>
      <td><b>Une heure plus tard, relancer une nouvelle requête.</b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u><b>A vérifier</b></u><b> :</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.</b><br /><br /><b>Cette opération doit être transparente pour le transporteur.</b></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u><strong><em>Résultat à fournir :</em></strong></u></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Décrire la cinématique mise en œuvre.</strong></td>
    </tr>
  </tbody>
</table>

# Test 1. 02 Contrôle présence CDE/CPE

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td>NIR : 1 65 01 63 220 102 / 18<br />
        <br />
        <u>Date de naissance :</u><br />
        <u>01/01/1965</u><br />
        <br />
        Rang de naissance : 1<br />
        <br />
        Code régime : 01</td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

Suite du test précédent :
    **Lancer la requête « Consulter prise en charge en intégré LPS pour la FEL ».**

**Cas 1 :**

**Procéder à un arrachage de la carte CDE/CPE (puis la réinsérer), relancer une nouvelle requête**

**Cas 2 :**

<u>**Procéder à un arrachage de la carte CDE/CPE (ne pas la réinsérer), relancer une nouvelle requête.**</u>

## *<u>A vérifier</u>* :

**Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :**

- **Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,**
- **Demander la saisie du code porteur de la carte CPE/CDE,**
- **Recalculer une nouvelle assertion le cas échéant.**

**Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h**

**Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion**

**Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.**

## *<u>Résultat à fournir</u>* :

**Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associé à ce test.**

# Test 1. 03 Activation/désactivation du service

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test :*</u>

Le LPS doit permettre, dans un contexte de facturation, par le biais d’un paramétrage la désactivation du service « Consulter prise en charge en intégré LPS pour la FEL ».

## <u>*A vérifier :*</u>

Vérifier que le LPS permet l'activation ou la désactivation du service dans un contexte de facturation.

Dans un contexte hors facturation cette désactivation doit être impossible.

## <u>*Résultat à fournir :*</u>

Fournir les éléments mettant en évidence cette possibilité d’activation/désactivation dans un contexte de facturation, et son impossibilité dans un contexte hors facturation.

# **Test 1. 04 Accident du travail**

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29 RG_FTE428/<br />RG_FTE429</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td>NIR : 1 65 01 63 220 102 / 18<br />Date de naissance : 01/01/1965<br />Rang de naissance : 1<br />Code régime : 01</td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

**<u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>**

**<u>Renseigner les informations obligatoires en entrée, accéder au service</u> « Consulter prise en charge en intégré LPS pour la FEL » :**

*   **<u>NIR de l’assuré + clé (ouvrant droit)</u>**
*   **<u>Date de naissance du bénéficiaire</u>**
*   **<u>Rang de naissance du bénéficiaire</u>**
*   **Mode de transport : ABA ou VSL**
*   **Date de réalisation de la prestation date du jour**
*   **Indicateur « soins en rapport avec AT/MP » renseigné**
*   **<u>L’une ou l’autre des données suivantes est obligatoirement renseignée :</u>**
    *   **- Date AT/MP : 12/05/1989 (Cas 1)**
    *   **<u>- Identifiant AT/MP : 890512346 (Cas 2)</u>**
*   **<u>Date de prescription : date du jour -1</u>**

## **<u>*A vérifier*</u> :**

<table>
    <tr>
      <td colspan="2"><strong>Informations restituées par le service :</strong></td>
    </tr>
    <tr>
      <td><strong>Nature de couverture : AMO</strong></td>
      <td rowspan="9"><strong>Le LPS ne doit pas permettre de<br />renseigner simultanément une date<br />d’AT et un identifiant AT.</strong></td>
    </tr>
    <tr>
      <td><strong>Code régime : 01</strong></td>
    </tr>
    <tr>
      <td><strong>Code caisse : 261</strong></td>
    </tr>
    <tr>
      <td><strong>Code centre gestionnaire : 9880</strong></td>
    </tr>
    <tr>
      <td><strong>Contrat AMO : BASE</strong></td>
    </tr>
    <tr>
      <td><strong>Nature d'assurance : ATMP</strong></td>
    </tr>
    <tr>
      <td><strong>Tiers payant réglementaire : O</strong></td>
    </tr>
    <tr>
      <td><strong>Taux applicable à la prestation : 100%</strong></td>
    </tr>
    <tr>
      <td><strong>Code justificatif d'exonération du ticket modérateur : 0</strong></td>
    </tr>
</table>

## <u>***Résultat à fournir :***</u>

**Présenter les éléments présentant la possibilité offerte au PS d’accéder au renseignement des informations liées à un accident de travail et l’impossibilité de renseigner pour un même flux une date et un identifiant.**

**Fournir les traces XML des requêtes (cas 1 et 2) et des réponses du service ainsi qu’une copie d’écran du résultat affiché dans le logiciel.**

# **Test 1.05 Transport en rapport avec l’ALD exonérante du patient**

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td>
        NIR : 1 65 01 63 220 102 / 18<br />
        Date de naissance : 01/08/1998<br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

### **<u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>**

Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL » :

*   **<u>NIR de l’assuré + clé (ouvrant droit)</u>**
*   **<u>Date de naissance du bénéficiaire</u>**
*   **<u>Rang de naissance du bénéficiaire</u>**
*   **Mode de transport : ABA ou VSL**
*   **Date de réalisation de la prestation date du jour**
*   **<u>Indicateur « soins en rapport avec ALD exonérante » renseigné à « O »</u>**
*   **<u>Indicateur « prise en charge 100% » renseigné (Motif « CDP100 »).</u>**
*   **<u>Date de prescription : date du jour -1</u>**

## **<u>*A vérifier*</u> :**

Informations restituées par le service :

<table>
    <tr>
      <td>Nature de couverture :</td>
      <td>AMO</td>
    </tr>
    <tr>
      <td>Code régime :</td>
      <td>01</td>
    </tr>
    <tr>
      <td>Code caisse :</td>
      <td>261</td>
    </tr>
    <tr>
      <td>Code centre gestionnaire :</td>
      <td>9880</td>
    </tr>
    <tr>
      <td>Contrat AMO :</td>
      <td>BASE</td>
    </tr>
    <tr>
      <td>Nature d'assurance :</td>
      <td>AS</td>
    </tr>
    <tr>
      <td>Tiers payant réglementaire :</td>
      <td>N</td>
    </tr>
    <tr>
      <td>Taux applicable à la prestation :</td>
      <td>100%</td>
    </tr>
    <tr>
      <td>Code justificatif d'exonération du ticket modérateur :</td>
      <td>4</td>
    </tr>
</table>

## **<u>*Résultat à fournir*</u> :**

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel

# Test 1.06 Régime exonérant

<table>
    <tr>
      <td colspan="2"><b><u>Référence documentaire :</u></b></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td rowspan="4"><b><u>Etat du test :</u></b></td>
      <td rowspan="4">Actif</td>
      <td rowspan="4"><b><u>Données d’entrée :</u></b></td>
      <td>NIR : 1 55 01 63 220 113 / 12</td>
    </tr>
    <tr>
      <td>Date de naissance : 01/01/1955</td>
    </tr>
    <tr>
      <td>Rang de naissance : 1</td>
    </tr>
    <tr>
      <td>Code régime : 01</td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

### <u>Hors processus de facturation</u>

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**

**Date de naissance du bénéficiaire**

**Rang de naissance du bénéficiaire**

**Mode de transport : ABA ou VSL**

**Date de réalisation de la prestation : <u>date du jour</u>**

**Date de prescription : <u>date du jour -1</u>**

## *<u>A vérifier</u> :*

**Informations restituées par le service :**

**Nature de couverture : AMO**
**Code régime : 01**
**Code caisse : 261**
**Code centre gestionnaire : 9880**
**Contrat AMO : BASE**
**Nature d'assurance : AS**
**Tiers payant réglementaire : N**
**Taux applicable à la prestation : 100%**
**Code justificatif d'exonération du ticket modérateur : 5**

## *<u>Résultat à fournir</u> :*

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel**

# Test 1.08 Aide Médicale Etat

<table>
    <tr>
      <td><u><i><b>Référence documentaire :</b></i></u></td>
      <td colspan="3"><b>FACT-SFG-034 §2.3.2.4 FTE04.29</b></td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test :</b></i></u></td>
      <td>Actif</td>
      <td><u><i><b>Données d’entrée :</b></i></u></td>
      <td>
        <b>NIR : 1 80 01 63 220 109 / 52</b><br />
        <b><u>Date de naissance : 01/01/1980</u></b><br />
        <b>Rang de naissance : 1</b><br />
        <b>Code régime : 01</b>
      </td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

### <u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**

**Date de naissance du bénéficiaire**

**Rang de naissance du bénéficiaire**

**Mode de transport : ABA ou VSL**

**Date de réalisation de la prestation : <u>date du jour</u>**

**Date de prescription : <u>date du jour -1</u>**

## <u>*A vérifier*</u> :

**Informations restituées par le service :**

<table>
    <tr>
      <td><strong>Nature de couverture : AMO</strong></td>
      <td><strong>Nature de couverture : AMC</strong></td>
    </tr>
    <tr>
      <td><strong>Code régime : 01</strong></td>
      <td><strong>Contrat : AME</strong></td>
    </tr>
    <tr>
      <td><strong>Code caisse : 261</strong></td>
      <td><strong>Nature d'assurance : AS</strong></td>
    </tr>
    <tr>
      <td><strong>Code centre gestionnaire : 9880</strong></td>
      <td><strong>Tiers payant réglementaire : O</strong></td>
    </tr>
    <tr>
      <td><strong>Contrat AMO : BASE</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Nature d'assurance : AS</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Tiers payant réglementaire : O</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Taux applicable à la prestation : 0%</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Code justificatif d'exonération du ticket modérateur : 0</strong></td>
      <td></td>
    </tr>
</table>

## <u>*Résultat à fournir*</u> :

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.**

# **<u>Test 1.10 C2S (ex CMU-C)</u>**

<table>
    <tr>
      <td colspan="2"><b><u>Référence documentaire</u> :</b></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><b><u>Etat du test</u> :</b></td>
      <td>Actif</td>
      <td><b><u>Données d’entrée</u> :</b></td>
      <td>
        NIR : 2 85 01 63 220 105 / 52<br />
        <u>Date de naissance : 01/01/1985</u><br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

**<u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>**

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**

**Date de naissance du bénéficiaire**

**Rang de naissance du bénéficiaire**

**Mode de transport : ABA ou VSL <u>ou TXI (selon la catégorie de transporteur gérée)</u>**

**Date de réalisation de la prestation : <u>date du jour</u>**

**Date de prescription : <u>date du jour -1</u>**

## **<u>*A vérifier*</u> :**

<mark><u>**Bien que le service restitue « CMU-C » le LPS doit afficher C2S.**</u></mark>

**Informations restituées par le service :**

<table>
    <tr>
      <td>Nature de couverture : AMO</td>
      <td>Nature de couverture : AMC</td>
    </tr>
    <tr>
      <td>Code régime : 01</td>
      <td>Contrat : CMU-C</td>
    </tr>
    <tr>
      <td>Code caisse : 261</td>
      <td>Nature d'assurance : AS</td>
    </tr>
    <tr>
      <td>Code centre gestionnaire : 9880</td>
      <td>Tiers payant réglementaire : O</td>
    </tr>
    <tr>
      <td>Contrat AMO : BASE</td>
      <td></td>
    </tr>
    <tr>
      <td>Nature d'assurance : AS</td>
      <td></td>
    </tr>
    <tr>
      <td>Tiers payant réglementaire : O</td>
      <td></td>
    </tr>
    <tr>
      <td>Taux applicable à la prestation : 55%</td>
      <td></td>
    </tr>
    <tr>
      <td>Code justificatif d'exonération du ticket modérateur :</td>
      <td></td>
    </tr>
</table>

## **<u>*Résultat à fournir*</u> :**

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel <mark>indiquant qu’il s’agit d’une situation de C2S.</mark>**

# **Test 1.11 Nature d’assurance Maternité**

<table>
    <tr>
      <th colspan="2"><u>Référence documentaire</u> :</th>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <th><u>Etat du test</u> :</th>
      <td>Actif</td>
      <th><u>Données d’entrée</u> :</th>
      <td>
        NIR : 1 65 01 63 220 102 / 18<br />
        Date de naissance : 02/06/1976<br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

### **<u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>**

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**
**Date de naissance du bénéficiaire**
**Rang de naissance du bénéficiaire**
**Mode de transport : ABA ou VSL**
**Date de réalisation de la prestation : <u>26/06/2026</u>**
**Date de prescription : <u>24/06/2026</u>**

## **<u>*A vérifier*</u> :**

**Informations restituées par le service :**

**Nature de couverture : AMO**
**Code régime : 01**
**Code caisse : 261**
**Code centre gestionnaire : 9880**
**Contrat AMO : BASE**
**Nature d'assurance : MA**
**Date maternité : <u>2026-01-01+01:00</u>**
**Tiers payant réglementaire : N**
**Taux applicable à la prestation : 100 %**
**Code justificatif d'exonération du ticket modérateur : 0**

## **<u>*Résultat à fournir*</u> :**

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.**

# Test 1.12 Taux Régime général

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td>
        NIR : 1 65 01 63 220 102 / 18<br />
        <u>Date de naissance : 01/01/1965</u><br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

### <u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>

Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».

NIR de l’assuré + clé (ouvrant droit)
Date de naissance du bénéficiaire
Rang de naissance du bénéficiaire
Mode de transport : ABA ou VSL
Date de réalisation de la prestation : **date du jour**
Date de prescription : **<u>date du jour -1</u>**

## *<u>A vérifier</u>* :

Informations restituées par le service :

Nature de couverture : **AMO**
Code régime : **01**
Code caisse : **261**
Code centre gestionnaire : **9880**
Contrat AMO : **BASE**
Nature d'assurance : **AS**
Tiers payant réglementaire : **N**
Taux applicable à la prestation : **55%**
Code justificatif d'exonération du ticket modérateur : **0**

## *<u>Résultat à fournir</u>* :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# **Test 1.13 Taux Alsace Moselle**

<table>
    <tr>
      <td colspan="2"><u><em><strong>Référence documentaire :</strong></em></u></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><u><em><strong>Etat du test :</strong></em></u></td>
      <td>Actif</td>
      <td><u><em><strong>Données d’entrée :</strong></em></u></td>
      <td>
        NIR : 1 60 01 63 220 107 / 64<br />
        <u>Date de naissance : 01/01/1960</u><br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

### **<u>*Description détaillée du test*</u> :**

**<u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>**

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**
**Date de naissance du bénéficiaire**
**Rang de naissance du bénéficiaire**
**Mode de transport : ABA ou VSL**
**Date de réalisation de la prestation : date du jour**
**Date de prescription : <u>date du jour -1**</u>

### **<u>*A vérifier*</u> :**

**Informations restituées par le service :**

<table>
    <tr>
      <td>Nature de couverture :</td>
      <td>AMO</td>
    </tr>
    <tr>
      <td>Code régime :</td>
      <td>01</td>
    </tr>
    <tr>
      <td>Code caisse :</td>
      <td>261</td>
    </tr>
    <tr>
      <td>Code centre gestionnaire :</td>
      <td>9880</td>
    </tr>
    <tr>
      <td>Contrat AMO :</td>
      <td>ALM</td>
    </tr>
    <tr>
      <td>Nature d'assurance :</td>
      <td>AS</td>
    </tr>
    <tr>
      <td>Tiers payant réglementaire :</td>
      <td>N</td>
    </tr>
    <tr>
      <td>Taux applicable à la prestation :</td>
      <td>100 %</td>
    </tr>
    <tr>
      <td>Code justificatif d'exonération du ticket modérateur :</td>
      <td>0</td>
    </tr>
</table>

### **<u>*Résultat à fournir*</u> :**

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.**

# Test 1.14 Taux Fond Solidarité Vieillesse

<table>
    <tr>
      <td colspan="2"><u><strong><i>Référence documentaire :</i></strong></u></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><u><strong><i>Etat du test :</i></strong></u></td>
      <td><strong>Actif</strong></td>
      <td><u><strong><i>Données d’entrée :</i></strong></u></td>
      <td>NIR : 1 40 01 63 220 766 / 94<br />
        <u>Date de naissance : 01/01/1940</u><br />
        Rang de naissance : 1<br />
        Code régime : 01</td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

### <u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>

Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».

NIR de l’assuré + clé (ouvrant droit)
Date de naissance du bénéficiaire
Rang de naissance du bénéficiaire
Mode de transport : ABA ou VSL
Date de réalisation de la prestation : <u>date du jour</u>
Date de prescription : <u>date du jour -1</u>

## *<u>A vérifier</u>* :

<table>
  <thead>
    <tr>
      <th colspan="2">Informations restituées par le service :</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Nature de couverture : AMO</td>
      <td rowspan="9"></td>
    </tr>
    <tr>
      <td>Code régime : 01</td>
    </tr>
    <tr>
      <td>Code caisse : 261</td>
    </tr>
    <tr>
      <td>Code centre gestionnaire : 9880</td>
    </tr>
    <tr>
      <td>Contrat AMO : FSV</td>
    </tr>
    <tr>
      <td>Nature d'assurance : AS</td>
    </tr>
    <tr>
      <td>Tiers payant réglementaire : N</td>
    </tr>
    <tr>
      <td>Taux applicable à la prestation : 100 %</td>
    </tr>
    <tr>
      <td>Code justificatif d'exonération du ticket modérateur : 9</td>
    </tr>
  </tbody>
</table>

## *<u>Résultat à fournir</u>* :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# Test 1.15 Soins Médicaux Gratuits

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td>
        NIR : 1 55 01 63 220 113 / 12<br />
        Date de naissance : 01/01/1955<br />
        Rang de naissance : 1<br />
        Code régime : 01
      </td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

### <u>Hors processus de facturation</u>

<table>
<tr>
<td>Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».</td>
</tr>
<tr>
<td>NIR de l’assuré + clé (ouvrant droit)</td>
</tr>
<tr>
<td>Date de naissance du bénéficiaire</td>
</tr>
<tr>
<td>Rang de naissance du bénéficiaire</td>
</tr>
<tr>
<td>Mode de transport : ABA ou VSL</td>
</tr>
<tr>
<td>Date de réalisation de la prestation : <u>date du jour</u></td>
</tr>
<tr>
<td>Indicateur « soins en rapport avec l’article L115 » : renseigné à « O »</td>
</tr>
<tr>
<td>Date de prescription : <u>date du jour -1</u></td>
</tr>
</table>

## <u>*A vérifier*</u> :

Le logiciel doit afficher au Professionnel de Santé le code erreur (« PEC_PS_012 ») et le libellé correspondant.

## <u>*Résultat à fournir*</u> :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# Test 1.16 Matricule corse et date de naissance lunaire

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2"><strong>FACT-SFG-034 §2.3.2.4 FTE04.29</strong></td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td><strong>Actif</strong></td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td>
        <strong>NIR : 1 60 20 2B 020 777 / 26</strong><br />
        <strong>Date de naissance : 01/20/1960</strong><br />
        <strong>Rang de naissance : 1</strong><br />
        <strong>Code régime : 01</strong>
      </td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

### <u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>

**Renseigner les informations obligatoires en entrée, accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**

**NIR de l’assuré + clé (ouvrant droit)**

**Date de naissance du bénéficiaire**

**Rang de naissance du bénéficiaire**

**Mode de transport : ABA ou VSL**

**Date de réalisation de la prestation : date du jour**

**Date de prescription : <u>date du jour -1**</u>

## *<u>A vérifier</u>* :

### <u>Erreur de service attendue dans ce test</u>

**Le logiciel doit afficher au Professionnel de Santé le code erreur et le libellé correspondant.**

**Le logiciel doit permettre la saisie d’un département de naissance avec un caractère alpha dans le matricule (NIR corse).**

**Le logiciel doit permettre de saisir un matricule et une date de naissance dont le mois est supérieur à 12 et le jour (pour la date de naissance) supérieur au dernier jour valide du mois (pour la prise en compte d’une date lunaire).**

## *<u>Résultat à fournir</u>* :

**Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.**

# **Test 1.17 Intégration des données PEC dans la facture**

<table>
    <tr>
      <td rowspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td><strong>FACT-SFG-034 §2.3.2.4 FTE04.29</strong></td>
    </tr>
    <tr>
      <td><strong>Fact-sfg-fte02 § 2.3.2.6 données [56.01]</strong></td>
    </tr>
</table>

<table>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td>
        <strong>Actif</strong><br />
        Dans le périmètre <u>actuel, seuls les tests</u> 1.04 cas 1 et cas 2, 1.05, 1.06, 1.08, 1.10, 1.11, 1.12, 1.13, 1.14, sont concernés.
      </td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

### **<u>Dans le processus de facturation</u>**

**Reprendre les données des tests 1.04 Cas 1 et Cas 2, 1.05, 1.06, 1.07, 1.08, 1.10, 1.11, 1.12, 1.13 <u>(hors transporteurs Taxi)</u>, 1.14.**

**Pour chaque cas intégrer l’ensemble des données restituées par le service dans une FEL.**

**Test 1.10 : avant l’intégration des données dans la FEL, le LPS doit transcoder l’indicateur de situation particulière CMU-C en CMUC.**

## **<u>*A vérifier*</u> :**

**L’ensemble des données restituées par le service est correctement intégré dans la proposition de facture.**

**La nature de la pièce justificative d’ouverture des droits sera renseignée à « 9 » dans \<NatureJOD>, le PEC ayant été utilisé pour acquérir les droits du patient.**

**La valeur de l’indicateur de situation CMU-C est transcodé CMUC**

## **<u>*Résultat à fournir*</u> :**

**Fournir les traces XML de chaque requête (FEL) en entrée du service de recevabilité et la réponse du service.**

# Test 1.18 Possibilité de modification dans la FEL des données restituées par PEC

<table>
    <tr>
      <td colspan="2"><u><i><b>Référence documentaire :</b></i></u></td>
      <td colspan="2"><b>FACT-SFG-034 §2.3.2.4 FTE04.29</b></td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test :</b></i></u></td>
      <td><b>Actif</b></td>
      <td><u><i><b>Données d’entrée :</b></i></u></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

### **<u>Dans le processus de facturation</u>**

**Reprendre les données des tests 1.04 et 1.12 et intégrer l’ensemble des données restituées dans une FEL.**

**Modifier les données intégrées suivantes :**

**Test 1.04 :**

**- Code nature d’assurance de « ATMP » en « AS »**

**- Tiers payant réglementaire de « O » en « N »**

**- Taux applicable à la prestation de « 100% » en « 55% »**

**-Entité gestion de « 9880 » en « 9881 »**

**Test 1.12 :**

**Réalisation d’une facture avec une prescription en rapport avec l’ALD exonérante du patient (erreur attendue sur l’ETM non trouvée en BDO en sortie de recevabilité)**

**- Taux applicable à la prestation de « 55% » en « 100% »**

**- Justificatif Exo TM de « 0 » en « 4 »**

## *<u>A vérifier</u>* :

**L’ensemble des données restituées par le service et intégrées dans les FEL doit être modifiables.**

## *<u>Résultat à fournir</u>* :

**Fournir les traces XML de chaque requête (FEL) en entrée du service de recevabilité et la réponse du service.**

# Test 1.19 Contrôle des dates

<table>
    <tr>
      <td colspan="2"><strong><em><u>Référence documentaire :</u></em></strong></td>
      <td colspan="2">FACT-SFG-034 §2.3.2.4 FTE04.29</td>
    </tr>
    <tr>
      <td><strong><em><u>Etat du test :</u></em></strong></td>
      <td>Actif</td>
      <td><strong><em><u>Données d’entrée :</u></em></strong></td>
      <td>NIR : 1 65 01 63 220 102 / 18<br />Date de naissance : 01/01/1965<br />Rang de naissance : 1<br />Code régime : 01</td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

### <u>Quel que soit le contexte opérationnel du service (facturation ou hors facturation)</u>

**Essayer de saisir :**

-   **Une date de naissance postérieure à la date de réalisation, à la date de prescription, à la date d’AT ou à la date de maternité.**
-   **Une date de réalisation supérieure à la date du jour**
-   **Une date de prescription supérieure à la date de réalisation, à la date d’AT, à la date du jour**

## *<u>A vérifier</u> :*

**Le LPS doit contrôler la cohérence des dates et heures :**

-   **Date de naissance doit être antérieure à la date de réalisation, à la date de prescription, à la date AT.**
-   **La date de réalisation ne doit pas être antérieure à la date de prescription.**
-   **La date de réalisation doit être antérieure ou égale à la date du jour.**
-   **La date de l’AT ne doit pas être postérieure à la date de prescription, ni à la date de réalisation.**

## *<u>Résultat à fournir</u> :*

**Fournir les éléments mettant en évidence la mise en place de ces contrôles.**

# Test 1.20 Cohérence des données de la requête SOAP

<table>
    <tr>
      <td colspan="2">
        <strong><u>Référence au guide</u></strong><br />
        <strong><u>d’intégration</u> :</strong>
      </td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td rowspan="4">
        <strong><u>Etat du test :</u></strong>
      </td>
      <td rowspan="4"><u>Actif</u></td>
      <td rowspan="4">
        <strong><u>Informations</u></strong><br />
        <strong><u>patient</u> :</strong>
      </td>
      <td>NIR : 1 65 01 63 220 102 / 18</td>
    </tr>
    <tr>
      <td>Date de naissance : 02/06/1976</td>
    </tr>
    <tr>
      <td>Rang de naissance : 1</td>
    </tr>
    <tr>
      <td>Code régime : 01</td>
    </tr>
</table>

**<u>*Description détaillée du test*</u> :**

<u>Sur la base du test 1.11 alimentation des contextes (contexte BAM et contexte LPS) de l’entête de la requête.</u>

**<u>*A vérifier*</u> :**

- **Les données renseignées dans les contextes BAM et LPS doivent être conformes au cadre d’interopérabilité (pour les données définies obligatoires dans le cadre d’interopérabilité) et conformes au guide d’intégration (pour les données attendues et définies optionnelles dans le cadre d’interopérabilité).**

- **Les données du contexte BAM (\<Dateref>, \<Num> et \<cle> de \<ASSURE>, \<Datenai> et \<Rang> de \<BENEFICIAIRE>) doivent être cohérentes avec celles renseignées dans le corps de la requête.**

**<u>*Résultat à fournir*</u> :**

Présenter les éléments mettant en évidence la bonne gestion de ces points (traces xml de la requête du test 1.11).

# Test 1.24 Facturation d’une prestation TMR

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">FACT-SFG-032 RG_FTE203</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

### <u>Dans le processus de facturation</u>

Reprendre les données des tests 1.13.

Facturation d’un VSL avec TMR

## *<u>A vérifier</u>* :

Le service PEC n’est pas appelé pour la prestation TMR.

Une prestation secondaire TMR reprend les données de prise en charge obtenues en sortie du service PEC (si appelé) pour la prestation principale à laquelle elle est rattachée.

## *<u>Résultat à fournir</u>* :

Fournir les traces XML de la requête en entrée du service de recevabilité et la réponse du service.

# Test 1.25 Facturation d’une prestation transport urgent préhospitalier

<table>
    <tr>
      <td><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td><strong>FACT-SFG-032 RG_FTE203</strong></td>
    </tr>
</table>

<table>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td><strong>Actif</strong></td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
</table>

### *<u>Description détaillée du test :</u>*

<u>**Dans le processus de facturation**</u>

<u>**Reprendre les données des tests 1.12.**</u>

<u>**Facturation d’un transport urgent préhospitalier et tenter d’accéder au service « Consulter prise en charge en intégré LPS pour la FEL ».**</u>

### *<u>A vérifier :</u>*

<u>Le service PEC n’est pas appelé pour la prestation d’un transport urgent préhospitalier pour définir le taux de prise en charge du patient (à défaut une erreur de service sera restituée). Si cette prestation est sélectionnée par l’utilisateur le taux de prise en charge doit forcément être de 100 %.</u>

### *<u>Résultat à fournir :</u>*

Présenter les éléments mettant en évidence l’impossibilité d’appeler le service en cas de facturation d’un transport urgent préhospitalier.