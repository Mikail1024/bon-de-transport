| SEL-GCONFORM-*FTE* | | Version 0.60.13 |
| :--- | :--- | :--- |

![logo: CNDA](page_1_image_2_v2.jpg)

**Service en Ligne/Service TR**
**GUIDE DE TESTS DE CONFORMITE**

# **Service Facturation Transporteur Etendue**
# **intégré aux LPS**

## **Calculer les montants d’une**
## **prestation**

### **Guide de tests de conformité**

![logo: SEFI Transport](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td>0.60.13</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>21/08/2026</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td>SEL-GCONFORM-<br /><i>FTE</i></td>
    </tr>
</table>

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>1/29</td>
    </tr>
</table>

SEL-GCONFORM-
*FTE*
Version 0.60.13

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
      <td>27/03/2013</td>
      <td>0.41</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>21/06/2013</td>
      <td>0.50</td>
      <td>Ajout du tableau des cas à réaliser pour l’étape 1 de la FEL<br />2 lot 2</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>28/08/2013</td>
      <td>0.53</td>
      <td>Ajout du test 2.01 sur la gestion des traces</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>14/03/2014</td>
      <td>0.60</td>
      <td>Test 1.04 : modification des données d’entrée des cas du<br />test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>28/04/2014</td>
      <td>0.60.01</td>
      <td>Tests 1.04 et 1.05 : modification du code caisse et code<br />centre en entrée du service.<br /><br />Test 1.05 : création d’un cas 3<br /><br />Tests 1.08 à 1.11 : Modification du test de référence.<br /><br />Test 2.01 : test suspendu</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/09/2014</td>
      <td>0.60.02</td>
      <td>Test 2.01 supprimé<br /><br />Test 1.12 : Ajout de précisions dans « à vérifier »</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>01/12/2014</td>
      <td>0.60.03</td>
      <td>Test 1.09 : Ajout de vérifications.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/05/2015</td>
      <td>0.60.04</td>
      <td>Test 1.06 : suppression<br /><br />Test 1.09 : Modification du descriptif du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>17/07/2015</td>
      <td>0.60.05</td>
      <td>Test 1.05 : ajout du cas 4</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>25/03/2016</td>
      <td>0.60.06</td>
      <td>Test 1.04 :<br />- Cas 1 et 2 : modification des données du test<br />ajout du cas 3<br />Test 1.05 :<br />- Cas 1, 2, 3 et 4 : modification des données du test</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>15/09/2016</td>
      <td>0.60.07</td>
      <td>Test 1.07 : Suppression d’une anomalie dans le test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/10/2017</td>
      <td>0.60.09</td>
      <td>Test 1.05 : Cas 4 : Ajout d’une vérification<br /><br />Test 1.13 : Création du test</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/05/2019</td>
      <td>0.60.10</td>
      <td>Prise en compte des transporteurs taxis</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/06/2020</td>
      <td>0.60.11</td>
      <td>Tests 1.04, 1.05 et 1.13 : Actualisation de la date du<br />transport.</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 2/29

SEL-GCONFORM-
*FTE*
<mark>Version 0.60.13</mark>

## **HISTORIQUE DES VERSIONS**

<table>
  <thead>
    <tr>
      <th colspan="4"><b>HISTORIQUE DES VERSIONS</b></th>
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
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>22/03/2024</td>
      <td>0.60.12</td>
      <td>Test 1.05 cas 4 : modification des données du test.<br />Test 1.03 : Ajout d’une vérification.<br />Tests 1.10 et 1.11 : Suppression des tests.<br />Test 1.14 : Création du test.<br />Modification du taux régime général.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td><mark>0.60.13</mark></td>
      <td><mark>Test 1.15 : Création du test.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

<mark>21/08/2026</mark> Guide de tests de conformité : Calculer les montants d’une prestation 3/29

| SEL-GCONFORM- *FTE* | | Version 0.60.13 |
| :--- | :--- | :--- |

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><strong>TABLE DES MATIERES.....................................................................................................................................</strong></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td> </td>
      <td> </td>
    </tr>
    <tr>
      <td><strong>1. CAS DE TESTS : CALCULER LES MONTANTS D’UNE PRESTATION ...............................................</strong></td>
      <td><strong>5</strong></td>
    </tr>
    <tr>
      <td>    TEST 1.01 - ASSERTION PS – NIVEAU DE SECURITE ..........................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td>    TEST 1.02 - CONTROLE PRESENCE CDE/CPE...................................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td>    TEST 1.03 - ACTIVATION/DESACTIVATION DU SERVICE....................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td>    TEST 1.04 - DONNEES OBLIGATOIRES...............................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td>    TEST 1.05 - DONNEES FACULTATIVES ............................................................................................................</td>
      <td>12</td>
    </tr>
    <tr>
      <td>    TEST 1.07 - RESTITUTION DES DONNEES RETOURNEES PAR LE SERVICE .........................................................</td>
      <td>17</td>
    </tr>
    <tr>
      <td>    TEST 1.08 - INTEGRATION DES DONNEES RESTITUEES DANS LA FEL ..............................................................</td>
      <td>18</td>
    </tr>
    <tr>
      <td>    TEST 1.09 - MODIFICATION DES DONNEES EN SORTIE DU SERVICE .................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td>    TEST 1.12 - COHERENCE DES DONNEES DANS LA REQUETE SOAP ...................................................................</td>
      <td>20</td>
    </tr>
    <tr>
      <td>    TEST 1.13 - RESTRICTION AVEC UN CONTRAT AMC DE TYPE« AMC »..........................................................</td>
      <td>21</td>
    </tr>
    <tr>
      <td>    TEST 1.14 - FACTURATION D’UNE PRESTATION TMR.....................................................................................</td>
      <td>23</td>
    </tr>
    <tr>
      <td>    <mark>TEST 1.15 - FACTURATION D’UN TRANSPORT URGENT PRE-HOSPITALIER.......................................................</mark></td>
      <td><mark>26</mark></td>
    </tr>
</table>

| 21/08/2026 | Guide de tests de conformité : Calculer les montants d’une prestation | 4/29 |
| :--- | :---: | ---: |

SEL-GCONFORM-*FTE* Version 0.60.13

# 1. Cas de Tests : Calculer les montants d’une prestation

## Test 1.01 - Assertion PS – niveau de sécurité

<table>
    <tr>
      <td colspan="2"><u><i><b>Référence documentaire :</b></i></u></td>
      <td colspan="2">- SEL-MP-015,<br /><br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><u><i><b>Etat du test :</b></i></u></td>
      <td>Actif</td>
      <td><u><i><b>Données d’entrée :</b></i></u></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.

Lancer la requête « Calculer montant d’une prestation »

Une heure plus tard, relancer une nouvelle requête.

### <u>*A vérifier*</u> :

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

### <u>*Résultat à fournir*</u> :

Décrire la cinématique mise en œuvre.

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>5/29</td>
    </tr>
</table>

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td>Version 0.60.13</td>
    </tr>
</table>

# Test 1.02 - Contrôle présence CDE/CPE

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- SEL-MP-015, § 2.2 les composants du poste de <u>travail</u><br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

## <u>***Description détaillée du test***</u> :

Suite du test précédent :

Lancer la requête « calculer les montants d’une prestation »

**Cas 1 :**

**Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête**

**Cas 2 :**

**<u>Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.</u>**

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

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>6/29</td>
    </tr>
</table>

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td><mark>Version 0.60.13</mark></td>
    </tr>
</table>

# Test 1.03 - Activation/désactivation du service

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">FACT-SFG-032 FTE02 « RG_FTE240 »<br />FACT-SFG-035 FTE05-Paramétrer le poste PS « RG_FTE554 »</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td></td>
    </tr>
</table>

### **<u>*Description détaillée du test*</u> :**

**Cas 1 : La tarification majorée est désactivée. Essayer d’appeler l’opération « calculer les montants d’une prestation ».**

**Cas 2 : La tarification majorée est activée.**

### **<u>*A vérifier*</u> :**

**Cas 1 : L’appel à l'opération « calculer les montants d’une prestation » doit être désactivé si la tarification socle est appliquée.**

**Cas 2 : Le LPS doit permettre par le biais d’un paramétrage la désactivation du service « calculer les montants d’une prestation », par défaut l’appel au service est activé.**

### **<u>*Résultat à fournir*</u> :**

**Cas 1 : Présenter les éléments mettant en évidence qu’en cas de paramétrage de tarification socle, l’appel au service est désactivé.**

**Cas 2 : Présenter les éléments mettant en évidence qu’en cas de paramétrage de tarification majorée, l’appel au service peut être paramétré et que par défaut il est activé.**

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>7/29</td>
    </tr>
</table>

| SEL-GCONFORM-*FTE* | | Version 0.60.13 |
| :--- | :--- | :--- |

# Test 1.04 - Données obligatoires

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.4 :WS_FT4 : Déterminer les montants d’une prestation de transport</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

Essayer de lancer une requête d’accès au service « calculer les montants d’une prestation » dans laquelle il manque <u>une des données obligatoires</u> en entrée :

<table>
    <tr>
      <td><strong>Nature de prestation</strong></td>
      <td><strong>Code INSEE lieu d'arrivée</strong></td>
    </tr>
    <tr>
      <td><strong>Type de Forfait</strong></td>
      <td><strong>Distance parcourue</strong></td>
    </tr>
    <tr>
      <td><strong>Code INSEE lieu départ</strong></td>
      <td><strong>Date départ</strong></td>
    </tr>
    <tr>
      <td><strong>Date arrivée</strong></td>
      <td><strong>Heure départ</strong></td>
    </tr>
    <tr>
      <td><strong>Heure arrivée</strong></td>
      <td><strong>Taux de remboursement</strong></td>
    </tr>
    <tr>
      <td><u><strong>Nombre de malades transportés</strong></u></td>
      <td><u><strong>Identifiant AM du PS exécutant</strong></u></td>
    </tr>
    <tr>
      <td><strong>Contrat</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Code caisse gestionnaire</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Nature de couverture</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Code régime</strong></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>Code centre gestionnaire</strong></td>
      <td></td>
    </tr>
</table>

## *A vérifier* :

1) Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une donnée.

2) Sur la base des cas ci-dessus, s’assurer que les données valorisées dans l’interface alimentent correctement la requête.

## *<u>Résultat à fournir</u>* :

**Fournir :**

-les éléments mettant en évidence cette saisie obligatoire,

-une copie d’écran de la saisie effectuée ainsi que le vidage .xml de la requête soap correspondante générée.

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>8/29</td>
    </tr>
</table>

SEL-GCONFORM-
*FTE*
Version 0.60.13

**Cas 1 : Proposition de facture en nature d’assurance maladie avec la **facturation d’un FORFAIT AGGLOMERATION au taux régime général** (sans exonération) sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>AUCUN</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>055.00</b></strong></td>
    </tr>
</table>

21/08/2026
Guide de tests de conformité : Calculer les montants d’une prestation
9/29

SEL-GCONFORM- *FTE* | Version 0.60.13

**Cas 2 : Proposition de facture en nature d’assurance maladie avec la **facturation d’un FORFAIT DEPARTEMENTAL avec un Taux à 100% sur** la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>VSL</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Départemental</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>AUCUN</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>20</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

21/08/2026 | Guide de tests de conformité : Calculer les montants d’une prestation | 10/29

SEL-GCONFORM-
*FTE*
Version 0.60.13

**Cas 3 : Proposition de facture avec la facturation d’un FORFAIT **AGGLOMERATION à 100% Régime Alsace Moselle sur la base des données** suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td colspan="2" rowspan="9"></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>Contrat Nature</td>
      <td><strong>AMO</strong></td>
    </tr>
    <tr>
      <td>Contrat de la couverture AMO</td>
      <td><strong><b>ALM</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

21/08/2026
Guide de tests de conformité : Calculer les montants d’une prestation
11/29

| SEL-GCONFORM-*FTE* | | Version 0.60.13 |
| :--- | :--- | :--- |

## Test 1.05 - Données facultatives

<table>
    <tr>
      <td><u><em><strong>Référence documentaire :</strong></em></u></td>
      <td>- SEL-MP-015 :<br />§ 2.4 :WS_FT4 : Déterminer les montants d’une prestation de transport<br />§ 3.7 : Opération<br />WS_FT4 « calculerMontantsPrestation »</td>
    </tr>
    <tr>
      <td><u><em><strong>Etat du test :</strong></em></u></td>
      <td>Actif</td>
      <td><u><em><strong>Données d’entrée :</strong></em></u></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Le LPS doit permettre de renseigner les données facultatives suivantes :

Type supplément forfaitaire
Type supplément remboursable
Montant supplément non remboursable
Montant total du supplément remboursable
Couverture AMC

### <u>*A vérifier*</u> :

S’assurer que les données valorisées dans l’interface alimentent correctement la requête.

### <u>*Résultat à fournir*</u> :

Fournir la copie d’écran de la saisie effectuée et un vidage .xml de la requête soap correspondante générée.

| 21/08/2026 | Guide de tests de conformité : Calculer les montants d’une prestation | 12/29 |
| :--- | :---: | :--- |

SEL-GCONFORM-
*FTE*
Version 0.60.13

## **Cas 1 : Proposition de facture en nature d’assurance maladie avec la facturation d’un FORFAIT AGGLOMERATION et d’un supplément PEAGE au taux régime général (sans exonération) sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>PEAGE : « 1 »</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong>9H</strong></td>
      <td>Montant supplément remboursable</td>
      <td><strong><b>12.30€</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>10H</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong><b>24 KMS</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>055.00</b></strong></td>
    </tr>
</table>

21/08/2026
Guide de tests de conformité : Calculer les montants d’une prestation
13/29

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td><mark>Version 0.60.13</mark></td>
    </tr>
</table>

**Cas 2 : Proposition de facture en nature d’assurance maladie avec la **facturation d’un FORFAIT AGGLOMERATION et d’un supplément VOIE** d’EAU avec un taux à 100% sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>Voie d’eau : « 2 »</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong>9H</strong></td>
      <td>Montant supplément remboursable</td>
      <td><strong><b>12.30€</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>10H</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong><b>24 KMS</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>14/29</td>
    </tr>
</table>
14/29

SEL-GCONFORM-*FTE*
Version 0.60.13

**Cas 3 : Proposition de facture en nature d’assurance maladie avec la **facturation d’un FORFAIT AGGLOMERATION, d’un supplément non** **remboursable et d’un supplément forfaitaire à « 1 » (Gare/port/aéroport) au** taux régime général (sans exonération) sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong><mark>Date du jour - 1</mark></strong></td>
      <td>Type supplément forfaitaire</td>
      <td><strong><b>Gare/port/aéroport : « 1 »</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong>9H</strong></td>
      <td>SUPLN : Montant supplément non remboursable</td>
      <td><strong><b>12.30€</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong><mark>Date du jour - 1</mark></strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>10H</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong><b>24 KMS</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><mark>055</mark>.00</strong></td>
    </tr>
</table>

21/08/2026
Guide de tests de conformité : Calculer les montants d’une prestation
15/29

SEL-GCONFORM-*FTE* Version 0.60.13

## **Cas 4 : Proposition de facture en <mark><u>C2S</u></mark> sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Contrat (de la Couverture AMC)</td>
      <td><strong><b>CMUC</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>9H30</b></strong></td>
      <td colspan="2" rowspan="7"></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>10H30</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong><b>15 KMS</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>055.00</b></strong></td>
    </tr>
</table>

**<u>A vérifier</u> : Le taux AMC ne doit plus être renseigné dans Tux/Part/RMB de la COUVERTURE AMC.**

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 16/29

SEL-GCONFORM-*FTE*
Version 0.60.13

# Test 1.07 - Restitution des données retournées par le service

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">- SEL-MP-015 : ws_ft-v0.53<br />§ 2.4 :WS_FT4 : Déterminer les montants d’une prestation de transport<br />§ 3.7 : Opération<br />WS_FT4 « calculerMontantsPrestation »</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

<u>**Description détaillée du test**</u> :

Récupération de toutes les informations restituées par le service.

Les montants restitués correspondent aux tarifs conventionnels majorés.

<u>**A vérifier**</u> :

Le LPS doit afficher toutes les données suivantes retournées par le service :

- Montant du forfait
- Montant des Majorations du forfait
- Distance facturée
- Montant kilométrique
- Montant des majorations du montant kilométrique
- Montant des majorations dégressive trajet courts
- Montant des abattements
- Montant remboursable AMO du trajet
- Montant remboursable AMC du trajet
- Reste à charge de l’assuré du trajet
- Message d’erreur ou d’information

<u>**Résultat à fournir**</u> :

Fournir la copie d’écran de l’affichage dans l’interface du LPS des informations restituées.


17

<table>
    <tr>
      <td>21/08/2026</td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>17/29</td>
    </tr>
</table>

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td>Version 0.60.13</td>
    </tr>
</table>

# Test 1.08 - Intégration des données restituées dans la FEL

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">- SEL-MP-015 : ws_ft-v0.53<br />§ 2.4 :WS_FT4 : Déterminer les montants d’une prestation de transport<br />§ 3.7 : Opération WS_FT4 « calculerMontantsPrestation »</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test :*</u>

Dans un contexte de facturation, appeler le service « calculer montant prestations » avec les données d’entrée du test 1.04 cas 1.

Les montants restitués correspondent aux tarifs conventionnels majorés.

### <u>*A vérifier :*</u>

Le LPS doit permettre d’intégrer les montants restitués par le service dans la FEL.

### <u>*Résultat à fournir :*</u>

Fournir un vidage .xml de la FEL intégrant les données restituées par le service.

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>18/29</td>
    </tr>
</table>

SEL-GCONFORM-
*FTE*
Version 0.60.13

# Test 1.09 - Modification des données en sortie du service

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">
        - SEL-MP-015<br />
        <strong>§ 2.4 :WS_FT4 : Déterminer les montants d’une prestation de transport</strong><br />
        <strong>§ 3.7 : Opération WS_FT4 « calculerMontantsPrestation »</strong>
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

Dans un contexte de facturation, appeler le service « calculer montant prestations» avec les données d’entrée du test 1.04 cas 1.

Cas 1 : Modifier le <u>tarif de responsabilité du forfait agglomération par exemple.</u>

Cas 2 : Modifier une donnée de la FEL (une donnée qui n’était pas en entrée de l’opération « calculer montant prestations ») ajout par exemple d’un supplément remboursable péage.

## **<u>*A vérifier*</u> :**

Cas 1 : Le logiciel doit permettre de modifier dans la facture les informations en sortie de « calculer montant prestations» provenant du système, dans ce contexte, la facture ne peut être présentée au service de recevabilité, cette dernière doit être réalisée en B2 ou abandonnée.

Cas 2 : En sortie de l’opération « calculer montant prestations» la facture n’est pas figée, le LPS doit permettre d’ajouter des éléments de facturation.

## **<u>*Résultat à fournir*</u> :**

Pour le cas 1, présenter les éléments mettant en évidence la possibilité de modifier les données restituées par le service « calculer montant prestations» ainsi que les éléments montrant l’impossibilité de présenter la facture au service de recevabilité dans ce cadre (facturation B2 ou abandon).

Pour le cas 2, présenter les éléments mettant en évidence la possibilité d’ajouter des éléments à la facturation en sortie de « calculer montant prestations».


19/29

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>19/29</td>
    </tr>
</table>

SEL-GCONFORM-
*FTE*
Version 0.60.13

## Test 1.12 - Cohérence des données dans la requête soap

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td><strong>Actif</strong></td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

### <u>***Description détaillée du test***</u> :

<u>Sur la base du test 1.05 Cas1 alimentation des contextes (contexte BAM et contexte LPS) de l’entête de la requête.</u>

### <u>***A vérifier***</u> :

- **Les données renseignées dans les contextes BAM et LPS doivent être conformes au cadre d’interopérabilité (pour les données définies obligatoires dans le cadre d’interopérabilité) et conformes au guide d’intégration (pour les données attendues et définies optionnelles dans le cadre d’interopérabilité).**

- **Les données du contexte BAM (\<Grandregime>, \<Organisme> et \<Centre>), doivent être cohérentes avec celles renseignées dans le corps de la requête.**

- **Dans le Body \<Heure> doit être au format hh:mm:ss renseignée à l’heure locale de réalisation de la prestation.**

### <u>***Résultat à fournir***</u> :

**Présenter les éléments mettant en évidence la bonne gestion de ces points (traces xml de la requête).**


20/29

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>20/29</td>
    </tr>
</table>

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td>Version 0.60.13</td>
    </tr>
</table>

# Test 1.13 - Restriction avec un contrat AMC de type« AMC »

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td></td>
    </tr>
</table>

**<u>*Description détaillée du test*</u> :**

**Préparer un appel au service sur la base « calculer les montants d’une prestation » avec un contrat AMC de type « AMC » (données du cas 20 du test 1.04 du guide SEL-GCONFORM-FTE_Contrôler la recevabilité en FEL).**

**<u>*A vérifier*</u> :**

**La couverture AMC ne doit pas être renseignée dans l’appel au service « calculer les montants d’une prestation ».**

**La couverture AMC renseignée dans l’interface du LPS doit être renseignée dans l’appel au contrôle de recevabilité.**

**Le calcul de la part complémentaire doit être effectué par le LPS.**

**<u>*Résultat à fournir*</u> :**

**Fournir les éléments mettant en évidence l’absence de transmission de couverture AMC pour le service « calculer les montants d’une prestation » ainsi que les éléments montrant que le LPS renseigne bien les montants AMC (calcul interne au logiciel) dans la FEL.**

**Fournir les requêtes/réponses soap pour les opérations :**
**`<semafeltransport:1.0.0:calculerMontantsPrestation>` et**
**`<semafeltransport:1.0.0:controlerRecevabilite>`.**


21/29

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>21/29</td>
    </tr>
</table>

SEL-GCONFORM-*FTE* Version 0.60.13

**Proposition de facture en nature d’assurance maladie avec la facturation **d’un FORFAIT AGGLOMERATION et d’un supplément PEAGE au taux** régime général (sans exonération) sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>ABA</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Agglomération</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>PEAGE : « 1 »</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong>9H</strong></td>
      <td>Montant supplément remboursable</td>
      <td><strong><b>12.30€</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>10H</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong><b>24 KMS</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>055.00</b></strong></td>
    </tr>
</table>

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 22/29

SEL-GCONFORM-*FTE* Version 0.60.13

# Test 1.14 - Facturation d’une prestation TMR

<table>
    <tr>
      <td colspan="2"><u><em><strong>Référence documentaire :</strong></em></u></td>
      <td colspan="2">FACT-SFG-032 FTE02-Facturer des Prestations<br />RG_FTE227 [62.03] [CP1]     Prestation secondaire TMR</td>
    </tr>
    <tr>
      <td><u><em><strong>Etat du test :</strong></em></u></td>
      <td>Actif</td>
      <td><u><em><strong>Données d’entrée :</strong></em></u></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Préparer un appel au service sur la base « calculer les montants d’une prestation » avec facturation d’une prestation de transport VSL ainsi qu’une prestation secondaire TMR.

Les montants restitués correspondent aux tarifs conventionnels majorés.

## <u>*A vérifier*</u> :

Le LPS fait un premier appel au service « calculer les montants d’une prestation » pour la prestation de transport VSL et un second pour la prestation secondaire TMR.

## <u>*Résultat à fournir*</u> :

Fournir les éléments mettant en évidence que deux appels au service « calculer les montants d’une prestation » sont effectués.

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 23/29

SEL-GCONFORM-*FTE* Version 0.60.13

**Proposition de facture en nature d’assurance maladie avec la facturation **d’un FORFAIT DEPARTEMENTAL et facturation d’une prestation TMR** avec un Taux à 100% sur la base des données suivantes :**

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>VSL</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Départemental</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>AUCUN</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>20</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 24/29

SEL-GCONFORM-
*FTE*
Version 0.60.13

<table>
    <tr>
      <td>Nature de prestation</td>
      <td><strong><b>TMR</b></strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong>9</strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>AUCUN</b></strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
      <td colspan="2" rowspan="6"></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>20</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

21/08/2026 Guide de tests de conformité : Calculer les montants d’une prestation 25/29

<table>
    <tr>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
      <td></td>
      <td>Version 0.60.13</td>
    </tr>
</table>

# Test 1.15 - Facturation d’un transport urgent pré-hospitalier

<table>
    <tr>
      <td><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="3">FACT-SFG-032 FTE02-Facturer des Prestations [62.02]<br />[62.03] [CP2]Transport Urgent Pré-Hospitalier (TUPH)</td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td>Actif</td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
</table>

**<u>Description détaillée du test :</u>**

<u>Préparer un appel au service sur la base « calculer les montants d’une prestation » pour une prestation d’un transport urgent pré-hospitalier pour chaque cas avec les données renseignées issues des tableaux annexés à ce test.</u>

<u>Accéder au service « calculer les montants d’une prestation ».</u>

**<u>A vérifier :</u>**

<u>Dans le cas d’une prestation transport urgent pré-hospitalier le taux utilisé pour effectuer l’appel au service doit être celle définie dans les données techniques paramétrées sur le poste de travail. : 100 %.</u>

**<u>Résultat à fournir :</u>**

<u>Fournir les éléments mettant en évidence que le taux définit dans le cas d’un transport urgent pré-hospitalier est forcément de 100 % pour le service « calculer les montants d’une prestation ».</u>

<u>Fournir les requêtes/réponses soap.</u>

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>26/29</td>
    </tr>
</table>
26/29

SEL-GCONFORM- *FTE* | Version 0.60.13

**<u>Cas 1 : Proposition de facture en nature d’assurance maladie avec la facturation d’un péage pour un patient en ALD et d’une prestation AIG avec un Taux à 100% sur la base des données suivantes :</u>**

<table>
    <tr>
      <td>N° immatriculation assuré</td>
      <td><strong><b>1 65 01 63 220 102</b></strong></td>
      <td>Prénom du bénéficiaire</td>
      <td><strong><b>NOE</b></strong></td>
    </tr>
    <tr>
      <td>Clé du N° immatriculation</td>
      <td><strong>18</strong></td>
      <td>Type supplément remboursable</td>
      <td><strong><b>PEAGE</b></strong></td>
    </tr>
    <tr>
      <td>Date de naissance du bénéficiaire</td>
      <td><strong><b>01/08/1998</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td><strong><b>15.50</b></strong></td>
    </tr>
    <tr>
      <td>Nom de famille du bénéficiaire</td>
      <td><strong><b>PECPLUSUN</b></strong></td>
      <td>Justificatifs de prise en charge du transport</td>
      <td><strong><b>RALD + ALLON</b></strong></td>
    </tr>
    <tr>
      <td>Nature de prestation</td>
      <td><strong>AIG</strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Départemental</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td colspan="2" rowspan="8"></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>10</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
</table>

21/08/2026 | Guide de tests de conformité : Calculer les montants d’une prestation | 27/29

SEL-GCONFORM-*FTE* | Version 0.60.13

<u>**Cas 2 : Proposition de facture en nature d’assurance maladie pour une prestation AHG avec un Taux à 100% sur la base des données suivantes :**</u>

<table>
    <tr>
      <td>N° immatriculation assuré</td>
      <td><strong><b>1 55 01 63 220 113</b></strong></td>
      <td>Prénom du bénéficiaire</td>
      <td><strong><b>MARC</b></strong></td>
    </tr>
    <tr>
      <td>Clé du N° immatriculation</td>
      <td><strong>12</strong></td>
      <td>Type supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Date de naissance du bénéficiaire</td>
      <td><strong><b>01/01/1955</b></strong></td>
      <td>Montant supplément remboursable</td>
      <td></td>
    </tr>
    <tr>
      <td>Nom de famille du bénéficiaire</td>
      <td><strong><b>PECPLUSNEUF</b></strong></td>
      <td>Justificatifs de prise en charge du transport</td>
      <td><strong><b>ALLON</b></strong></td>
    </tr>
    <tr>
      <td>Nature de prestation</td>
      <td><strong>AHG</strong></td>
      <td>Régime</td>
      <td><strong>01</strong></td>
    </tr>
    <tr>
      <td>Type de forfait</td>
      <td><strong><b>Départemental</b></strong></td>
      <td>Caisse</td>
      <td><strong>261</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu de départ</td>
      <td><strong><b>34000</b></strong></td>
      <td>Centre</td>
      <td><strong>9880</strong></td>
    </tr>
    <tr>
      <td>Date de départ</td>
      <td><strong>Date du jour - 1</strong></td>
      <td>Identifiant AM du PS exécutant</td>
      <td><strong><b>9925xxxxx</b></strong></td>
    </tr>
    <tr>
      <td>Heure de départ</td>
      <td><strong><b>14h</b></strong></td>
      <td>Justificatif de l’exonération du TM</td>
      <td><strong>5</strong></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d’arrivée</td>
      <td><strong><b>34170</b></strong></td>
      <td colspan="2" rowspan="8"></td>
    </tr>
    <tr>
      <td>Date d’arrivée</td>
      <td><strong>Date du jour - 1</strong></td>
    </tr>
    <tr>
      <td>Heure d’arrivée</td>
      <td><strong><b>15h</b></strong></td>
    </tr>
    <tr>
      <td>Distance parcourue</td>
      <td><strong>30</strong></td>
    </tr>
    <tr>
      <td>Contrat AMO</td>
      <td><strong><b>BASE</b></strong></td>
    </tr>
    <tr>
      <td>Nombre de malades transportés</td>
      <td><strong>1</strong></td>
    </tr>
    <tr>
      <td>Taux de remboursement</td>
      <td><strong><b>100.00</b></strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
</table>

21/08/2026 | Guide de tests de conformité : Calculer les montants d’une prestation | 28/29

<table>
    <tr>
      <td><i>SEL-GCONFORM-</i><br /><i>FTE</i></td>
      <td></td>
      <td>Version 0.60.13</td>
    </tr>
</table>

29/29

<table>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td>Guide de tests de conformité : Calculer les montants d’une<br />prestation</td>
      <td>29/29</td>
    </tr>
</table>