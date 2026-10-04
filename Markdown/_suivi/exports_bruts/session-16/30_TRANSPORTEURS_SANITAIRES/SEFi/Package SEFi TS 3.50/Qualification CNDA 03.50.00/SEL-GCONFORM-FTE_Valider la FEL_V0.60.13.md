*SEL-GCONFORM-FTE* Version 0.60.13

![logo: CNDA Centre National de Dépôt et d'Agrément](page_1_image_2_v2.jpg)

## Service en Ligne/Service TR

### GUIDE DE TESTS DE CONFORMITE

# **Service Facturation Transporteur Etendu**
# **intégré aux LPS**

## **Valider la FEL par le TS**
## **Guide de tests de conformité**

![logo: l'Assurance Maladie SEFI Transport](page_1_image_1_v2.jpg)

<table>
    <tr>
      <td><i>Version</i></td>
      <td><mark>0.60.13</mark></td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td><mark>21/08/2026</mark></td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><mark><i>SEL-GCONFORM-</i><br /><i>FTE</i></mark></td>
    </tr>
</table>

*SEL-GCONFORM-FTE*
Version 0.60.13

## **HISTORIQUE DES VERSIONS**

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
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>21/06/2013</td>
      <td>0.50</td>
      <td>MAJ Test 1.08 (Clause contractuelle)<br /><br />Ajout du tableau des cas à réaliser pour l’étape 1 de la FEL V2 lot2.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>01/10/2013</td>
      <td>0.53</td>
      <td>Ajout du test 2.01 (gestion des traces)<br /><br />Modification test 1.11 : ajout du contrôle du format et de la longueur du numéro de facture.<br /><br />Ajout du test 1.17<br /><br />Suppression du test 1.13 : paramétrage des plages de n° de lots (testé dans Administrer le poste PS)<br /><br />Ajout du test 3.01 : retours NOEMIE</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>25/03/2014</td>
      <td>0.60</td>
      <td>Ajout des tests 1.18 et 1.19<br /><br />Modification test 1.17 (heure « au plus tard » passée de 20h à 18h)<br /><br />Test 2.01 : modification du test. FI 260</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/08/2014</td>
      <td>0.60.01</td>
      <td>Test supprimé en rapport avec le périmètre de la présérie SEFI : test 1.17.<br /><br />Test 1.04 : Activation du test.<br /><br />Test 1.09 : activation du test et ajout de précisions.<br /><br />Test 1.19 : Ajout de précisions dans « à vérifier »<br /><br />Test 1.16 : Ajout de précisions dans « à vérifier »</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>01/12/2014</td>
      <td>0.60.02</td>
      <td>Test 2.01 : Prise en compte de la FI 307V1.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/05/2015</td>
      <td>0.60.03</td>
      <td>Test 1.11 : Prise en compte de la fiche d’information PDT-INF-358 : le numéro de la FEL est strictement renseigné sur 9 caractères numériques.<br /><br />Test 1.16 : ajout de précision (fiche d’information n° 328 du GIE SV).</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>17/07/2015</td>
      <td>0.60.04</td>
      <td>Test 1.12 : Ajout de précisions dans « A vérifier » unicité du n° de lot en fonction du critère de regroupement.<br /><br />Test 1.14 : ajout de la possibilité de conserver la FEL validée par le LPS.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>25/03/2016</td>
      <td>0.60.05</td>
      <td>Test 1.12 : Prise en compte de l’évolution des plages de lots.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/01/2016</td>
      <td>0.60.06</td>
      <td>Test 2.01 : Prise en compte de la version 4 de la fiche d’information 307 (ajout de nouvelles données dans les traces).</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/10/2017</td>
      <td>0.60.07</td>
      <td>Test 1.06 : Modification du « A vérifier ».<br /><br />Test 1.18 : Modification de la durée de validité du certificat</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

| *SEL-GCONFORM-FTE* | Version 0.60.13 |
| :--- | :--- |

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
      <td></td>
      <td></td>
      <td>Test 2.01 : Prise en compte de la fiche d’information<br />307V5.</td>
      <td></td>
    </tr>
    <tr>
      <td>18/02/2019</td>
      <td>0.60.08</td>
      <td>Test 1.12 : Ajout d’un critère de rupture de lot.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/05/2019</td>
      <td>0.60.09</td>
      <td>Prise en compte des transporteurs taxis.<br /><br />Test 1.04BIS : création du test spécifique transporteur taxi.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/07/2019</td>
      <td>0.60.10</td>
      <td>Test 2.01 : Prise en compte des FI 631V1 et 307V6.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/06/2020</td>
      <td>0.60.11</td>
      <td>Test 1.04 : le test est compatible avec les transporteurs<br />taxis.<br /><br />Test 1.04Bis : Suppression du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/03/2024</td>
      <td>0.60.12</td>
      <td>Test 1.04 : Ajout d’une précision.<br /><br />Test 2.01 : Ajout d’une vérification.<br /><br />Test 3.01 : Suspension du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>21/08/2026</mark></td>
      <td><mark>0.60.13</mark></td>
      <td><mark>Test 1.12 : Ajout d’un critère de rupture de lot</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

*SEL-GCONFORM-FTE* Version 0.60.13

# **TABLE DES MATIERES**

<table>
    <tr>
      <td colspan="2"><strong>TABLE DES MATIERES................................................................................................................................................</strong></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>CAS DE TESTS : VALIDER LA FEL PAR LE TRANSPORTEUR..................................................................</strong></td>
      <td><strong>5</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 – CONTROLE ASSERTION PS.......................................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.02 –NIVEAU DE SECURITE ASSERTION PS ........................................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.03 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE....................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.04- GESTION DE L’ERREUR « ERR_FT_007 » .................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 – GESTION DES ERREURS SOAP .................................................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.06 – DONNEES EN ENTREE DU SERVICE .........................................................................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.07 – GESTION ACCUSE DE RECEPTION ...........................................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.08 – GESTION DE LA CLAUSE .........................................................................................................................</td>
      <td>12</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.09 – GESTION DES ERREURS DESIR_1020/ ERR_FT_015 ..............................................................................</td>
      <td>13</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.10 – MODIFICATION/ANNULATION FEL ........................................................................................................</td>
      <td>14</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.11 – GESTION DU N° DE FACTURE .................................................................................................................</td>
      <td>15</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.12 – GESTION DES NUMEROS DE LOT .............................................................................................................</td>
      <td>16</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.14 – GESTION DE LA FEL VALIDEE................................................................................................................</td>
      <td>18</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.15 – DUPLICATA DE LA FEL..........................................................................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.16 – ALIMENTATION DES DONNEES PS ET BENEFICIAIRE DE LA FEL.............................................................</td>
      <td>20</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.18 – DUREE DE VALIDITE DU CERTIFICAT ......................................................................................................</td>
      <td>21</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.19 – GESTION DES ERREURS SOAP ...............................................................................................................</td>
      <td>22</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>GESTION DES TRACES......................................................................................................................................</strong></td>
      <td><strong>23</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.01 – GESTION DES TRACES : PHASE DE PRESERIE ...........................................................................................</td>
      <td>23</td>
    </tr>
</table>

*SEL-GCONFORM-FTE* Version 0.60.13

# 1 Cas de Tests : Valider la FEL par le transporteur

## Test 1.01 – Contrôle Assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.

Lancer la requête « Valider la FEL par le transporteur »

Une heure plus tard, relancer une nouvelle requête.

### <u>*A vérifier*</u> :

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

### <u>*Résultat à fournir*</u> :

Décrire la cinématique mise en œuvre.

*SEL-GCONFORM-FTE*
Version 0.60.13

# Test 1.02 –Niveau de sécurité assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">- Cadre Interopérabilité – assertions et contextes</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Suite du test précédent :

Lancer la requête «Valider la FEL par le TS».

**Cas 1 :**

Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête

**Cas 2 :**

<u>Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.</u>

## <u>*A vérifier*</u> :

Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :

- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la carte CPE/CDE,
- Recalculer une nouvelle assertion le cas échéant.

**Cas 1 :** Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h

**Cas 2 :** Le LPS doit détecter l’absence de la carte et demander son insertion

Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.

## <u>*Résultat à fournir*</u> :

Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associées à ce test.

*SEL-GCONFORM-FTE*
Version <mark>0.60.13</mark>

# Test 1.03 – Données obligatoires en entrée du service

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - <strong>SEL-MP-015 :</strong><br />
            <strong>§ 2.3 WS_FT3 : Valider une FEL</strong><br />
            <strong>§ 3.6 Opération WS_FT3 « valider »</strong>
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Accéder au service «Valider la FEL par le TS» avec une donnée obligatoire en entrée manquante.

**Données obligatoires :**

- **Données de la facture**
- **Certificat (non visible par le transporteur : donnée technique)**
- **Date de facture (date de validation) date à laquelle la FEL a été déclarée recevable**
- **N° de Lot**
- **N° de la facture**
- **Clause**

### <u>*A vérifier*</u> :

**Vérifier que le LPS ne permet pas d’accéder au service en l’absence d’une donnée obligatoire.**

**S’assurer que les données valorisées dans l’interface alimentent correctement la requête.**

### <u>*Résultat à fournir*</u> :

**Fournir :**

- **les éléments mettant en évidence la présence de ces informations**
- **une copie d’écran de la saisie effectuée ainsi que le vidage .xml de la requête soap correspondante générée.**

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.04- Gestion de l’erreur « ERR_FT_007 »

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">- SEL-MP-015 :<br />    § 2.3 WS_FT3 : Valider une FEL<br />    § 3.6 Opération WS_FT3 « valider »<br />    Annexe 2 Messages d’erreur<br />- FACT-SFG-032 FTE02 : [RG_FTE290] [CE1] lot déjà<br />en traitement</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

**Si le service « Valider la FEL par le TS » restitue une faute soap « ERR_FT_007 » le LPS doit être capable de l’interpréter et le LPS doit incrémenter le numéro de lot en cours et soumettre à nouveau la FEL à la validation du Transporteur.**

**Remarque : L’erreur ERR_FT_007 n'est pas reproductible en environnement éditeurs en raison de l’absence de chaîne de paiement, la cinématique de la règle RG_FTE290 CE1 doit être prise en compte sans pouvoir être validée en situation.**

## <u>*A vérifier*</u> :

**le LPS doit récupérer l’intégralité des messages restitués par le service.**

**Le logiciel doit afficher au Professionnel de Santé le code erreur (« ERR_FT_007 ») et le libellé correspondant.**

**Le logiciel doit interpréter l’erreur, incrémenter le numéro de lot et accéder à nouveau au service de validation de la FEL.**

## <u>*Résultat à fournir*</u> :

**Fournir les éléments mettant en évidence l’incrémentation du numéro du lot en cas de réception d’une erreur ERR_FT_007.**

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.05 – Gestion des erreurs SOAP

<table>
  <tr>
    <td>**Référence documentaire :**</td>
    <td>- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »<br />Annexe 2 Messages d’erreur</td>
  </tr>
  <tr>
    <td>**Etat du test :**</td>
    <td>Actif</td>
    <td>**Données d’entrée :**</td>
    <td>[___]</td>
  </tr>
</table>

## <u>*Description détaillée du test*</u> :

**Renseigner une date de facture différente de la date du jour (modification date système par exemple)**

**Accéder au service «Valider la FEL par le TS».**

**L’objet du test est de vérifier la prise en compte de la cinématique et la restitution correcte des messages d’erreur.**

**La modification de la date peut ne pas être autorisée par le logiciel, cette modification ne doit être permise que pour ce test.**

## <u>*A vérifier*</u> :

**le LPS doit récupérer l’intégralité des messages restitués par le service.**

**Le logiciel doit afficher au Professionnel de Santé le code erreur (« ERR_FT_060 ») et le libellé correspondant.**

**A réception d’un message d’erreur concernant le n° de facture, la date de facture ou le n° de lot le logiciel doit proposer au TS soit de :**

**- modifier la donnée erronée et repasser en recevabilité**
**- Passer en B2 (facturation nécessairement en tarification socle pour les transporteurs sanitaires).**

## <u>*Résultat à fournir*</u> :

**Fournir la copie d’écran du message affiché et les éléments mettant en évidence la possibilité offerte au TS.**

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.06 – Données en entrée du service

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Accéder au service «Valider la FEL» avec les données de la facture recevable ainsi que les données complémentaires :

- Date de facture
- N° de Lot
- N° de la facture
- Clause
- Certificat

### <u>*A vérifier*</u> :

Les données complémentaires de FEL sont correctement alimentées par le LPS.

### <u>*Résultat à fournir*</u> :

Fournir les traces XML de la requête.

*SEL-GCONFORM-FTE*
Version 0.60.13

# **Test 1.07 – Gestion accusé de réception**

<table>
    <tr>
      <td colspan="2"><u><b><i>Référence documentaire</i></b></u><b> :</b></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »<br />- FACT-SFG-032 FTE02 :[RG_FTE290] valider la<br />FEL</td>
    </tr>
    <tr>
      <td><u><b><i>Etat du test</i></b></u><b> :</b></td>
      <td>Actif</td>
      <td><u><b><i>Données d’entrée</i></b></u><b> :</b></td>
      <td></td>
    </tr>
</table>

## ***<u>Description détaillée du test</u> :***

Suite du test précédent

Récupérer la réponse de l’appel au du service «Valider la FEL par le transporteur».

## ***<u>A vérifier</u> :***

Le LPS doit récupérer, afficher et enregistrer correctement l’accusé de réception.

## ***<u>Résultat à fournir</u> :***

Décrire la cinématique de la réception et de l’enregistrement de l’accusé de réception.
Fournir la copie d’écran de l’accusé de réception

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.08 – Gestion de la clause

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire</em></strong></u> :</td>
      <td colspan="2">- SEL-MP-015 :<br />
            § 2.3 WS_FT3 : Valider une FEL<br />
            § 3.6 Opération WS_FT3 « valider »<br />
        - FACT-SFG-032 FTE02 :[RG_FTE281] Demande<br />
        au PS la validation de la FEL</td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test</em></strong></u> :</td>
      <td><strong>Actif</strong></td>
      <td><u><strong><em>Données d’entrée</em></strong></u> :</td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Avant l’accès au service « Valider la FEL par le transporteur », le LPS affiche la clause reçue lors de l’accès au service « contrôler la recevabilité en FEL ».

**Cas 1 : Tenter de modifier la clause.**

**Cas 2 : Accepter cette clause.**

## <u>*A vérifier*</u> :

**Affichage exhaustif de la clause.**

**Cas 1 : Modification impossible. \<Texte> doit obligatoirement être renseigné**

**Cas 2 : Acceptation de la clause obligatoire (case à cocher, bouton, autre). Sans acceptation de la clause le flux ne doit pas être émis. \<Accord> Valeur «true » ou « 1 ».**

## <u>*Résultat à fournir*</u> :

**Fournir :**

-   **copie d’écran de l’affichage de la clause contractuelle dans l’interface du logiciel.**
-   **Les éléments mettant en évidence l’impossibilité de l’envoie de la requête « valider » sans la clause et l’acceptation de la clause.**

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.09 – Gestion des erreurs desir_1020/ ERR_FT_015

<table>
    <tr>
      <td colspan="2"><strong><u>Référence documentaire</u> :</strong></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »<br />- FACT-SFG-032 FTE02 :[RG_FTE290] valider la<br />FEL</td>
    </tr>
    <tr>
      <td><strong><u>Etat du test</u> :</strong></td>
      <td>Actif</td>
      <td><strong><u>Données d’entrée</u> :</strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Lancer la validation d’une FEL ayant reçu un OK en sortie du contrôle de recevabilité.

L’enregistrement dans la base FEL (SI de L’Assurance Maladie) ne fonctionnant pas, l’accusé de réception n’est pas envoyé.

En l'absence d'accusé de réception (rejet AMO lors de la phase de validation, indisponibilité du SI de l'AMO : erreur siram_40/desir_1020) la FEL n'est pas à l'état "validée"

### <u>*A vérifier :*</u>

Le LPS doit présenter à nouveau une seule fois de manière automatique (sans intervention du transporteur) la FEL au service «Valider la FEL par le TS» sans aucune modification.

Si la facture reçoit un message d’erreur le logiciel doit afficher au Professionnel de Santé le code erreur et le libellé correspondant.

Si l’erreur indique que cette facture a déjà été envoyée (ERR_FT_015), Le LPS doit passer la FEL à l’état « validée » <sup>1</sup>

Si un accusé de réception est restitué, le LPS doit passer la FEL à l’état « validée ».

### <u>*Résultat à fournir*</u> :

Présenter les éléments mettant en évidence que ce contrôle est implémenté dans le LPS.

*SEL-GCONFORM-FTE*
Version 0.60.13

# Test 1.10 – Modification/annulation FEL

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">
        - SEL-MP-015 :<br />
            § 2.3 WS_FT3 : Valider une FEL<br />
            § 3.6 Opération WS_FT3 « valider »
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée :</i></u></strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test :*</u>

**Reprendre les données d’une FEL en sortie du service «Valider la FEL par le transporteur» ayant reçu un accusé de réception et essayer de la modifier ou de la supprimer.**

### <u>*A vérifier :*</u>

**Le LPS ne doit pas autoriser la modification ou l’annulation d’une FEL validée.**

### <u>*Résultat à fournir :*</u>

**Fournir les éléments mettant en évidence cette impossibilité.**

*SEL-GCONFORM-FTE*
Version 0.60.13

# Test 1.11 – Gestion du N° de facture

<table>
    <tr>
      <td><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="3"><strong>FACT-SFG-032 FTE02 : [RG_FTE282] Déterminer l’identifiant de la FEL<br /><br />Fiche d’Information 358 « Taille des numéros de facture »</strong></td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test :</em></strong></u></td>
      <td><strong>Actif</strong></td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Le LPS attribut un identifiant de FEL unique basé sur une séquence chronologique et continue.
Le numéro de la facture est au format numérique sur 9 caractères

## <u>*A vérifier*</u> :

Le LPS doit attribuer un numéro de facture unique pour chaque FEL.
Le N° de la facture est renseigné sur 9 caractères numériques.

## <u>*Résultat à fournir*</u> :

Fournir la cinématique d’attribution des identifiants de FEL mettant en évidence son unicité et son format 9 caractères numériques obligatoires.

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.12 – Gestion des numéros de lot

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">
        - <strong>SEL-MP-015 :</strong><br />
            <strong>§ 2.3 WS_FT3 : Valider une FEL</strong><br />
            <strong>§ 3.6 Opération WS_FT3 « valider »</strong><br />
        - <strong>FACT-SFG-032 FTE02 : [RG_FTE284]</strong><br />
        <strong>[RG_FTE287] Déterminer le n° de lot de la FEL</strong>
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée :</i></u></strong></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

**Attribution des plages de lots par le LPS en fonction des critères de rupture de lots.**

**Tranches de lots de factures :**

- **B2} 001 à 500**
- **PP + FEL} 501 à 750**
- **PEL+ FEL} 751 à 999**

## *<u>A vérifier</u> :*

**Le LPS doit attribuer correctement les plages de lot en fonction des critères de ruptures de lots :**

- **Identifiant du PS,**
- **Code Organisme destinataire**
- **TP AMO**
- **TP AMC**
- **Date de création du lot**
- **Type de prescription**
- **Type de facturation**
- **Critère spécifique AMO**

**S’assurer que le numéro de lot est incrémenté d’un en un jusqu’à utilisation de la plage allouée puis réinitialisation.**

- **S’assurer que les numéros de lot, sont différents d’un lot à l’autre quel que soit le destinataire (critère de regroupement en lots différent).**

- **Pour le régime 08 : application du critère spécifique AMO selon si la nature d’assurance dans la FEL est « Accident de travail » ou « différente d’Accident de travail ».**

*SEL-GCONFORM-FTE* Version 0.60.13

<u>**L’organisme destinataire (EF_FTE71_03 dans la FEL) est déterminé à partir de la Table des</u> Organismes Destinataires disponible sur [www.sesam-vitale.fr](http://www.sesam-vitale.fr/).**

<u>**Ainsi pour la MSA, avec un code caisse gestionnaire XX5, l’organisme destinataire sera XX1.**</u>

## *<u>Résultat à fournir</u> :*

**Fournir la cinématique d’attribution des plages de lots mettant en évidence la prise en compte des critères de rupture (et notamment du critère spécifique AMO) ainsi que la réinitialisation des numéros de lots.**

<u>**Présenter les éléments mettant en évidence que l'organisme destinataire est bien déterminé à</u> <u>partir de la Table des Organismes Destinataires (TOD).**</u>

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.14 – Gestion de la FEL validée

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test :</em></u></strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

Pour une FEL à l'état "validé" (accusé de réception reçu),

- Le LPS ne doit pas proposer de basculer en B2.
- Le LPS doit conserver une copie des FEL validées.

## **<u>*A vérifier*</u> :**

Le LPS ne doit pas autoriser de faire un débrayage de la facture en B2 après validation de celle-ci en FEL.

Le LPS doit conserver une copie des FEL validées.

## **<u>*Résultat à fournir*</u> :**

Fournir la cinématique mettant en évidence ces impossibilités.

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.15 – Duplicata de la FEL

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">- SEL-MP-015 :<br />§ 2.3 WS_FT3 : Valider une FEL<br />§ 3.6 Opération WS_FT3 « valider »</td>
    </tr>
    <tr>
      <td><strong><u><em>Etat du test</em></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
</table>

## *<u>Description détaillée du test</u>* :

Le transporteur fait une impression papier d’une FEL, celle-ci doit porter la mention spécifique « copie ».

## *<u>A vérifier</u>* :

Les impressions papier d'une FEL à l'état "validé" portent la mention spécifique "Copie" ou « duplicata ».

## *<u>Résultat à fournir</u>* :

Montrer la copie d’écran de cette impression avec la mention adéquate.

*SEL-GCONFORM-FTE*
Version 0.60.13

# Test 1.16 – Alimentation des données PS et bénéficiaire de la FEL

<table>
    <tr>
      <td colspan="2"><u><b><i>Référence documentaire</i></b></u> :</td>
      <td colspan="2">- SEL-MP-015, § 3.2.2 Couche échange<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><u><b><i>Etat du test</i></b></u> :</td>
      <td>Actif</td>
      <td><u><b><i>Données d’entrée</i></b></u> :</td>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Lancer la validation d’une FEL ayant reçu un OK en sortie du contrôle de recevabilité.

## <u>*A vérifier*</u> :

- Les données renseignées dans les contextes BAM et LPS doivent être conformes au cadre d’interopérabilité (pour les données définies obligatoires dans le cadre d’interopérabilité) et conformes au guide d’intégration (pour les données attendues et définies optionnelles dans le cadre d’interopérabilité).

- Les données du contexte BAM (\<Grandregime\>, \<Organisme\> et \<Centre\>, \<Num\> et \<cle\> de \<ASSURE\>, \<Datenai\> et \<Rang\> de \<BENEFICIAIRE\>) doivent être cohérentes avec celles renseignées dans le corps de la requête.

- **<u>Hors cas d’une utilisation en multi société (fiche d’information n° 328 du GIE SV)</u> : Le N° de facturation renseigné dans la balise AttributeStatement doit correspondre à celui renseigné dans le corps de la requête dans \<Numero\> de \<ORIGINE\>, \<EMETTEUR\> (hors cas OCT) et \<EXECUTANT\>.**

- Dans le Body \<Heure\> doit être au format hh:mm:ss renseignée à l’heure locale de réalisation de la prestation.

## <u>*Résultat à fournir*</u> :

Présenter les éléments mettant en évidence la bonne gestion de ces points (traces xml de la requête du test 1.06).

*SEL-GCONFORM-FTE* Version 0.60.13

# Test 1.18 – Durée de validité du certificat

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire</em></strong></u><strong> :</strong></td>
      <td colspan="2"><strong>FACT-SFG-032 FTE02 § 2.3.4 FTE02.04 : Valider la<br />FEL</strong></td>
    </tr>
    <tr>
      <td><u><strong><em>Etat du test</em></strong></u><strong> :</strong></td>
      <td>Actif</td>
      <td><u><strong><em>Données d’entrée</em></strong></u><strong> :</strong></td>
      <td></td>
    </tr>
</table>

**<u>*Description détaillée du test :*</u>**

**Présenter une FEL au service « contrôle de recevabilité », récupérer le certificat de recevabilité.**
**Avec les données de la FEL appeler le service de « valider » à J+1.**

**<u>*A vérifier :*</u>**

**Le LPS ne doit pas permettre d’appeler le service « valider » avec un certificat acquis la veille.**
**Le certificat n’est valable qu’une journée calendaire.**

**<u>*Résultat à fournir :*</u>**

**Présenter les éléments mettant en évidence le blocage de l’accès au service avec un certificat acquis la veille et que le logiciel permet d’utiliser le certificat obtenu dans une journée calendaire.**

*SEL-GCONFORM-FTE*
Version 0.60.13

# Test 1.19 – Gestion des erreurs SOAP

<table>
    <tr>
      <th colspan="2"><u><i><b>Référence documentaire :</b></i></u></th>
      <td colspan="2"><b>FACT-SFG-032 FTE02 § 2.3.4 FTE02.04 : Valider la<br />FEL</b></td>
    </tr>
    <tr>
      <th><u><i>Etat du test :</i></u></th>
      <td>Actif</td>
      <th><u><i>Données d’entrée :</i></u></th>
      <td></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

Présenter une FEL au service « contrôle de recevabilité », récupérer le certificat de recevabilité.

Avec les données de la FEL appeler le service de « valider » en renseignant :

- **Cas 1 : une date de facturation (&lt;DateFacturation&gt;) différente de la date du jour**
- **Cas 2 : un numéro de facture (&lt;Numero&gt;) déjà transmis**
- **Cas 3 : un identifiant de lot (&lt;Lot&gt;) déjà transmis**

## <u>*A vérifier*</u> :

**Le LPS doit afficher les messages d’informations restitués :**

- **ERR_FT_060 « La date de la facture doit être égale à la date du jour »**
- **ERR_FT_015 « Cette facture existe déjà »**
- **ERR_FT_080 « Identifiant de lot déjà transmis. »**

**Le LPS doit permettre :**

- **de soumettre à nouveau la facture au service de recevabilité après modification pour obtenir un nouveau certificat.**
- **de basculer en B2**

**<u>Remarque</u> : Le LPS peut également empêcher de générer ces erreurs par un contrôle sur la date de facturation (connexion à un serveur de temps pour alimenter la date, …) les numéros de facture et de lot (compteur, …).**

## <u>*Résultat à fournir*</u> :

**Présenter les éléments mettant en évidence la cinématique mise en œuvre dans les cas 1, 2 et 3. Si le LPS ne permet pas de reproduire ces cas, présenter les contrôles mis en œuvre.**

*SEL-GCONFORM-FTE* Version 0.60.13

# 2 Gestion des traces

## Test 2.01 – Gestion des traces : phase de présérie

<table>
    <tr>
      <td colspan="2"><strong><u>Référence au guide d’intégration :</u></strong></td>
      <td colspan="2"><strong>FI 307V6/FI 631V1</strong></td>
    </tr>
    <tr>
      <td><strong><u>Etat du test :</u></strong></td>
      <td><strong>Actif</strong></td>
      <td><strong><u>Données d’entrée :</u></strong></td>
      <td></td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

**<u>Le logiciel doit permettre de fournir la liste des factures validées</u>**

### <u>*A vérifier*</u> :

**<u>Une fois par semaine, chaque lundi, l’éditeur doit transmettre au GIE SESAM-Vitale la liste des factures créées la semaine précédente (lundi au dimanche inclus).</u>**

<u>**-Les fichiers traces zippés avec mot de passe seront envoyés par courriel à l’adresse suivante :**</u>

*   **<u>*[traces_RI@sesam-vitale.fr](mailto:traces_RI@sesam-vitale.fr)*</u>**

**<u>Cet envoi doit se faire de manière automatique sans intervention de l’éditeur.</u>**

**<u>en précisant en objet :</u>**

*   **<u>[SEFi-t] <nom éditeur> - Traces_suivi_SEFi période du <date début période> au <date fin période> : <N° AM></u>**

**<u>Le nom du fichier</u> sera de la forme suivante :**

**<u>SEFi-t_traces-FEL _< nom du logiciel>_<version du logiciel>_<UUID>_<N°AM>_<date de création du fichier>_<incrément>. csv</u>**

**<u>Où :</u>**

*   **<u>Nom du logiciel + version : Nom et version déclaré au CNDA lors des tests</u>**
*   **<u>L’UUID est l’identifiant unique de l’instance du logiciel</u>**
*   **<u>N° AM du transporteur</u>**
*   **<u>Date de création du fichier au format YYYYMMDD</u>**
*   **<u>L’incrément est un numéro d’ordre du fichier (incrémenté de 1 en 1 à chaque nouveau fichier créé)</u>**

**<u>Les fichiers traces doivent intégrer l’ensemble des données et dans l’ordre défini dans la fiche d’information FI 307VX.</u>**

**<u>Un échec de la sauvegarde des traces ne doit pas impacter le fonctionnement du service (ne pas empêcher l’émission de nouvelles requêtes).</u>**

| *SEL-GCONFORM-FTE* | | Version 0.60.13 |
| :--- | :--- | :--- |

### *<u>Résultat à fournir</u>* :

Fournir les traces générées mettant en évidence les informations transmises.

Présenter les éléments mettant en évidence l’envoi automatisé des traces.