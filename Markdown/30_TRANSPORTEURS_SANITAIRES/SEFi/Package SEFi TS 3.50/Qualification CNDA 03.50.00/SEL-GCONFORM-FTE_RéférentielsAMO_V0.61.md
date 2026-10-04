## Service en Ligne/Service TR
### GUIDE DE TESTS DE CONFORMITE

logo: CNDA Centre National de Dépôt et d'Agrément



# **Service Facturation Transporteur Etendue**
# **intégré aux LPS**

# **Consulter les référentiels de l’AMO**
# **Guide de tests de conformité**

logo: l'Assurance Maladie SEFI Transport

<table>
    <tr>
      <td><i>Version</i></td>
      <td>0.61</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>27/05/2019</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-<br />FTE</i></td>
    </tr>
</table>

# **HISTORIQUE DES VERSIONS**

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
      <td>03/08/2012</td>
      <td>0.51</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>15/10/2012</td>
      <td>0.51.1</td>
      <td>Modification « structure » en « établissement de soins »<br />Modification des codes erreur</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>14/12/2012</td>
      <td>0.51.2</td>
      <td>Ajout des données d’entrée nécessaire à la réalisation des tests.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>27/03/2013</td>
      <td>0.51.3</td>
      <td>Prise en compte du CI 1.0.2 (Tests 1.02, 2.02 et 3.02)</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/12/2013</td>
      <td>0.60</td>
      <td>Suppression des tests 1.03, 2.03 et 3.03 (Report dans le guide de conformité « Administration du poste de travail »</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>27/05/2019</mark></td>
      <td><mark>0.61</mark></td>
      <td><mark>Prise en compte des transporteurs taxis</mark><br /><mark>Test 3.05 : Ajout spécificité taxi.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

# **TABLE DES MATIERES**

<table>
    <tr>
      <td colspan="2"><b><b>TABLE DES MATIERES........................................................................................................................................ 3</b></b></td>
    </tr>
    <tr>
      <td><b>1</b></td>
      <td><b>CAS DE TESTS................................................................................................................................................ 4</b></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>IDENTIFIER UN BENEFICIAIRE/INFORMATIONS BENEFICIAIRES .................................................................... 4</td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.01 – Contrôle Assertion PS .......................................................................................................... 4</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.02 – Niveau de sécurité Assertion PS........................................................................................... 5</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.04 – Données obligatoires en entrée du service ........................................................................... 6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.05 – Données obligatoires en entrée du service ........................................................................... 7</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.06 – Enchainement des deux opérations InfoBenef...................................................................... 8</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.07 – Affichage des données en sortie du service .......................................................................... 9</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.08 – Modification des données en sortie du service ................................................................... 10</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.09 – Gestion des erreurs SOAP.................................................................................................. 11</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.10 – Gestion des erreurs SOAP.................................................................................................. 12</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 1.11 – Possibilité de modifier les données en sortie du service..................................................... 13</i></td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>IDENTIFIER UN PS ..................................................................................................................................... 14</td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.01 - Contrôle Assertion PS ......................................................................................................... 14</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.02 – Niveau de sécurité Assertion PS......................................................................................... 15</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.04 – Données obligatoires en entrée du service ......................................................................... 16</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.05 – Affichage des données en sortie du service ........................................................................ 17</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.06 – Modification des données en sortie du service ................................................................... 18</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 2.07 – Gestion des erreurs SOAP.................................................................................................. 19</i></td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>ACQUERIR LES INFORMATIONS TRANSPORTEUR AU RNT ......................................................................... 20</td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.01 - Contrôle Assertion PS ......................................................................................................... 20</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.02 – Niveau de sécurité Assertion PS......................................................................................... 21</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.04 – Données obligatoires en entrée du service ......................................................................... 23</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.05 – Affichage des données en sortie du service ........................................................................ 24</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.06 – Modification des données en sortie du service ................................................................... 25</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>Test 3.07 – Gestion des erreurs soap .................................................................................................... 26</i></td>
    </tr>
</table>

# 1 Cas de Tests

## 1.1 Identifier un bénéficiaire/Informations bénéficiaires

### Test 1.01 – Contrôle Assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-013, version 0.30, §2.1<br />
        - <b>FACT-SFG-029 §3.2 DF_FTE_BS : Données BS</b><br />
        - <b>Cadre Interopérabilité</b>
      </td>
    </tr>
    <tr>
      <td rowspan="5"><strong><u><i>Etat du test</i></u> :</strong></td>
      <td rowspan="5">Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>cas 1 : NIR+Clé ouvrant<br />droit</td>
      <td>1650163220102/18</td>
    </tr>
    <tr>
      <td>---------------------------------------</td>
      <td>13/12/2012</td>
    </tr>
    <tr>
      <td rowspan="2">Cas 2 : Date d’évaluation,<br />NIR+Clé ouvrant droit, date<br />et rang de naissance</td>
      <td>1650163220102/18</td>
    </tr>
    <tr>
      <td>01/08/1998 - 1</td>
    </tr>
</table>

<u>**Description détaillée du test**</u> :

Présence dans le lecteur de la carte CPE identifiée / authentifiée depuis moins d’une heure. Saisir le NIR + Clé de l’ouvrant droit.

Cas 1 : Lancer la requête « listerBeneficiaires ».

Cas 2 : Lancer la requête « rechercherEtatCivilBenef ».

Une heure plus tard, relancer une nouvelle requête pour les deux cas.

<u>**A vérifier**</u> :

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

<u>**Résultat à fournir**</u> :

Décrire la cinématique mise en œuvre pour les deux opérations.

# Test 1.02 – Niveau de sécurité Assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">
        - <strong>SEL-MP-013, version 0.30, §2.2</strong><br />
        - <strong>FACT-SFG-029 §3.2 DF_FTE_BS : Données BS</strong><br />
        - <strong>Cadre Interopérabilité</strong>
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td><strong>Actif</strong></td>
      <td>
        <strong><u><i>Données d’entrée :</i></u></strong><br />
        Date d’évaluation<br />
        NIR+Clé ouvrant droit<br />
        date et rang de naissance
      </td>
      <td>
        <br />
        <strong>13/12/2012</strong><br />
        <strong>2850163220105/52</strong><br />
        <strong>02/10/2011 - 1</strong>
      </td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

**Suite du test précédent :**
1) **Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée.**
2) **Sélectionner un bénéficiaire**
3) **Lancer la requête « listerBeneficiaires »**
4) **Lancer la requête « rechercherEtatCivilBenef »**

**Pour chaque requête :**

**Cas 1 : Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête**

**Cas 2 : Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.**

### <u>*A vérifier*</u> :

**Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :**

- **Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,**
- **Demander la saisie du code porteur de la carte CPE/CDE,**
- **Recalculer une nouvelle assertion le cas échéant.**

**Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h**

**Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion**

**Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.**

### <u>*Résultat à fournir*</u> :

**Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associées à ce test.**

# Test 1.04 – Données obligatoires en entrée du service

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="2">
        - SEL-MP-013, version 0.30, §2.1<br />
        - FACT-SFG-029 §3.2 DF_FTE_BS : Données BS
      </td>
    </tr>
    <tr>
      <td rowspan="2"><u><strong><em>Etat du test :</em></strong></u></td>
      <td rowspan="2"><strong>Actif</strong></td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
    <tr>
      <td>
        NIR ouvrant-droit<br />
        <br />
        Clé du NIR OD
      </td>
      <td>
        <strong>2850163220105</strong><br />
        <br />
        <strong>52</strong>
      </td>
    </tr>
</table>

<u>***Description détaillée du test :***</u>

Essayer de lancer une requête d’accès au service « listerBeneficiaires » dans laquelle il manque le NIR et/ou la clé.

<u>***A vérifier :***</u>

Vérifier que le LPS ne permette pas d’accéder au service en l’absence de cette donnée.

<u>***Résultat à fournir :***</u>

Fournir les éléments mettant en évidence cette saisie obligatoire.

# **Test 1.05 – Données obligatoires en entrée du service**

<table>
    <tr>
      <td colspan="2"><u><strong><em>Référence documentaire :</em></strong></u></td>
      <td colspan="2">
        - SEL-MP-013, version 0.30, §2.2<br />
        - FACT-SFG-029 §3.2 DF_FTE_BS : Données BS
      </td>
    </tr>
    <tr>
      <td rowspan="3"><u><strong><em>Etat du test :</em></strong></u></td>
      <td rowspan="3"><strong>Actif</strong></td>
      <td><u><strong><em>Données d’entrée :</em></strong></u></td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td><strong>13/12/2012</strong></td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit</td>
      <td><strong>1650163220102/18</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>date et rang de naissance</td>
      <td><strong>02/06/1976 - 1</strong></td>
    </tr>
</table>

### *<u>**Description détaillée du test**</u> :*

**1) Essayer de lancer une requête d’accès au service « rechercherEtatCivilBenef » dans laquelle il manque une des données suivantes :**
**- NIR OD**
**- Clé du NIR OD**
**- Date de naissance**
**- Rang de naissance**
**- Date d’évaluation**

**2) Essayer de lancer une requête d’accès au service « rechercherEtatCivilBenef » pour laquelle la date d’évaluation est postérieure à la date du jour**

### *<u>**A vérifier**</u> :*

**1) Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une de ces données d’entrée.**

**2) Vérifier que le LPS ne permette pas d’accéder au service. La date d’évaluation doit être obligatoirement antérieure ou égale à la date du jour.**

### *<u>**Résultat à fournir**</u> :*

**1) Fournir les éléments mettant en évidence cette saisie obligatoire.**

**2) Fournir les éléments mettant en évidence le contrôle sur la saisie de la date d’évaluation.**

# **Test 1.06 – Enchainement des deux opérations InfoBenef**

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">- SEL-MP-013, version 0.30, §2.2<br />- FACT-SFG-029 §3.2 DF_FTE_BS : Données BS</td>
    </tr>
    <tr>
      <td rowspan="2"><strong><u><em>Etat du test :</em></u></strong></td>
      <td rowspan="2">Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
    <tr>
      <td>NIR ouvrant-droit<br /><br />Clé du NIR OD</td>
      <td>1650163220102<br /><br />18</td>
    </tr>
</table>

## ***<u>Description détaillée du test</u> :***

**Lancer une requête d’accès au service « listerBeneficiaires »**

**Le LPS doit également prévoir un mode d’enchaînement entre les opérations « listerBeneficiaires » et « rechercherEtatCivilBenef » (passage automatique des données entre les 2 opérations) – Enchaînement Test 1.06 et 1.07**

## ***<u>A vérifier</u> :***

**Le LPS doit afficher les données en sortie retournées par le service pour chaque bénéficiaire :**

-  **Prénom**
-  **Date de naissance**
-  **Rang de naissance**

## ***<u>Résultat à fournir</u> :***

**Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur.**

# **Test 1.07 – Affichage des données en sortie du service**

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire :</em></u></strong></td>
      <td colspan="2">- SEL-MP-013, version 0.30, §2.2<br />- FACT-SFG-029 §3.2 DF_FTE_BS : Données BS</td>
    </tr>
    <tr>
      <td rowspan="3"><strong><u><em>Etat du test :</em></u></strong></td>
      <td rowspan="3">Actif</td>
      <td><strong><u><em>Données d’entrée :</em></u></strong></td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td>13/12/2012</td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td>1650163220102/18<br />01/08/1998 - 1</td>
    </tr>
</table>

### ***<u>Description détaillée du test</u> :***

Lancer une requête d’accès au service « rechercherEtatCivilBenef ».

### ***<u>A vérifier</u> :***

**Le LPS doit afficher les données en sortie retournées par le service :**

- **Nom patronymique**
- **Nom d’usage (optionnel)**
- **Prénom**
- **Code Grand régime, caisse et centre gestionnaire**

### ***<u>Résultat à fournir</u> :***

**1) Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur.**

**2) Mettre en évidence l’enchaînement entre les opérations « listerBeneficiaires » et « rechercherEtatCivilBenef » (passage automatique des données entre les 2 opérations)**

# Test 1.08 – Modification des données en sortie du service

<table>
    <tr>
      <td colspan="2"><u><strong>Référence documentaire</strong></u><strong> :</strong></td>
      <td colspan="2">
        - SEL-MP-013, version 0.30, §2.2<br />
        - FACT-SFG-029 §3.2 DF_FTE_BS : Données BS
      </td>
    </tr>
    <tr>
      <td rowspan="3"><u><strong>Etat du test</strong></u><strong> :</strong></td>
      <td rowspan="3"><strong>Actif</strong></td>
      <td><u><strong>Données d’entrée</strong></u><strong> :</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td><strong>13/12/2012</strong></td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit</td>
      <td><strong>1650163220102/18</strong></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>date et rang de naissance</td>
      <td><strong>01/08/1998 - 1</strong></td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

### <u>Suite du test précédent</u> :

Lors de la restitution des données du service, montrer la possibilité de pouvoir modifier l’ensemble des données restituées par le service.

## <u>*A vérifier*</u> :

Le LPS doit permettre à l’utilisateur de modifier les données en retour du service.

## <u>*Résultat à fournir*</u> :

Présenter une copie d’écran de l’interface du logiciel montrant l’accès aux informations restituées et leur modification possible.

# Test 1.09 – Gestion des erreurs SOAP

<table>
    <tr>
      <td colspan="2"><strong><em><u>Référence documentaire :</u></em></strong></td>
      <td colspan="2">- SEL-MP-013, version 0.30, Annexe 2<br />- FACT-SFG-029 §3.2 DF_FTE_BS : Données BS</td>
    </tr>
    <tr>
      <td><strong><em><u>Etat du test :</u></em></strong></td>
      <td>Actif</td>
      <td><strong><em><u>Données d’entrée :</u></em></strong><br /><br />NIR ouvrant droit<br /><br />Clé du NIR OD</td>
      <td><br /><br />1770863220187<br /><br />39</td>
    </tr>
</table>

**_<u>Description détaillée du test</u> :_**

Lancer une requête d’accès au service « listerBeneficiaires » en renseignant le NIR 1770863220187/39 (inconnu en BDO).

**_<u>A vérifier</u> :_**

Le logiciel doit afficher au Professionnel de Santé le code erreur restitué et le libellé correspondant.

**_<u>Résultat à fournir</u> :_**

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# **Test 1.10 – Gestion des erreurs SOAP**

<table>
    <tr>
      <td colspan="2"><strong><u><em>Référence documentaire</em></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-013, version 0.30, Annexe 2<br />
        - FACT-SFG-029 §3.2 DF_FTE_BS : Données BS
      </td>
    </tr>
    <tr>
      <td rowspan="3"><strong><u><em>Etat du test</em></u> :</strong></td>
      <td rowspan="3">Actif</td>
      <td><strong><u><em>Données d’entrée</em></u> :</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td>13/12/2012</td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit</td>
      <td>1650163220102/18</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>date et rang de naissance</td>
      <td>01/01/2000 - 1</td>
    </tr>
</table>

## ***<u>Description détaillée du test</u> :***

Lancer une requête d’accès au service « rechercherEtatCivilBenef » (avec date de naissance inconnue BDO).

## ***<u>A vérifier</u> :***

Le logiciel doit afficher au Professionnel de Santé le code erreur et le libellé correspondant.

## ***<u>Résultat à fournir</u> :***

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# Test 1.11 – Possibilité de modifier les données en sortie du service

<table>
    <tr>
      <td colspan="2"><u><strong><i>Référence documentaire</i></strong></u> :</td>
      <td colspan="2">
        - FACT-SFG-030, §2.4.3<br />
        - FACT-SFG-029 §3.2 DF_FTE_BS : Données BS
      </td>
    </tr>
    <tr>
      <td><u><strong><i>Etat du test</i></strong></u> :</td>
      <td>Actif</td>
      <td>
        <u><strong><i>Données d’entrée</i></strong></u> :<br />
        NIR ouvrant droit<br />
        Clé du NIR OD
      </td>
      <td>
        <br />
        1650163220102<br />
        18
      </td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Lancer une requête d’accès au service « listerBeneficiaires ».
Lors de la restitution des données du service, montrer la possibilité de pouvoir modifier l’ensemble des données restituées par le service.

### <u>*A vérifier*</u> :

Le LPS doit permettre à l’utilisateur de modifier les données en retour du service et donc de lancer une requête « rechercherEtatCivilBenef » avec des données modifiées.

### <u>*Résultat à fournir*</u> :

Présenter une copie d’écran de l’interface du logiciel montrant l’accès aux informations restituées et leur modification possible.

# 1.2 Identifier un PS

## Test 2.01 - Contrôle Assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">
        - SEL-MP-012, version 0.30, §2.1 et 2.2<br />
        - FACT-SFG-029 §3.1 DF_FTE_PS : Données PS<br />
        - Cadre Interopérabilité
      </td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td>
        <strong><u><i>Données d’entrée</i></u> :</strong><br />
        Identifiant AM du PS<br />
        <u>Identifiant de l’établissement</u><br />
        de soins<br />
        Date d’évaluation
      </td>
      <td>
        <br />
        991013301<br />
        340781608<br />
        <br />
        13/12/2012
      </td>
    </tr>
</table>

### *<u>Description détaillée du test</u> :*

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.

**Cas 1 : Saisir l’identifiant AM du PS et la date d’évaluation. Lancer la requête « rechercherPrescripteurPraticien »**

**Cas 2 : Saisir l’identifiant de l’établissement de soins et la date d’évaluation. Lancer la requête « rechercherEtablissement »**

Une heure plus tard, relancer une nouvelle requête.

### *<u>A vérifier</u> :*

**Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.**

**Cette opération doit être transparente pour le transporteur.**

### *<u>Résultat à fournir</u> :*

**Décrire la cinématique mise en œuvre.**

# **Test 2.02 – Niveau de sécurité Assertion PS**

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire</i></u> :</strong></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.1 et 2.2<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test</i></u> :</strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée</i></u> :</strong></td>
      <td></td>
    </tr>
    <tr>
      <td rowspan="3"></td>
      <td rowspan="3"></td>
      <td>Identifiant AM du PS</td>
      <td>991013301</td>
    </tr>
    <tr>
      <td><u>Identifiant de l’établissement</u><br />de soins</td>
      <td>340781608</td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td>13/12/2012</td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

*   Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée.
*   Saisir l’identifiant et la date d’évaluation

Lancer les requêtes « rechercherPrescripteurPraticien » et « rechercherEtablissement » pour les deux cas :

**Cas 1 :** Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête

**Cas 2 :** Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.

## **<u>*A vérifier*</u> :**

Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :

*   Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
*   Demander la saisie du code porteur de la carte CPE/CDE,
*   Recalculer une nouvelle assertion le cas échéant.

**Cas 1 :** Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h

**Cas 2 :** Le LPS doit détecter l’absence de la carte et demander son insertion

Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.

## **<u>*Résultat à fournir*</u> :**

Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associées à ce test.

# Test 2.04 – Données obligatoires en entrée du service

<table>
    <tr>
      <td colspan="2"><b><u><i>Référence documentaire</i></u> :</b></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.1 et 2.2<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td rowspan="4"><b><u><i>Etat du test</i></u> :</b></td>
      <td rowspan="4">Actif</td>
      <td><b><u><i>Données d’entrée</i></u> :</b></td>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant AM du PS</td>
      <td><b>991013301</b></td>
    </tr>
    <tr>
      <td>Identifiant de l’établissement<br />de soins</td>
      <td><b>340781608</b></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td><b>13/12/2015</b></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

1) Essayer de lancer une requête d’accès au service « rechercherPrescripteurPraticien » et une autre requête « rechercherEtablissement » dans laquelle il manque une des données suivantes :

- Identifiant AM du PS ou Identifiant de l’établissement de soins
- Date d’évaluation

2) Essayer de lancer une requête d’accès à ces 2 services pour laquelle la date d’évaluation est postérieure à la date du jour.

## *<u>A vérifier</u> :*

1) Vérifier que le LPS ne permette pas d’accéder aux services en l’absence d’une de ces données.

2) Vérifier que le LPS ne permette pas d’accéder aux services. La date d’évaluation doit être obligatoirement antérieure ou égale à la date du jour.

## *<u>Résultat à fournir</u> :*

1) Fournir les éléments mettant en évidence cette saisie obligatoire pour les deux requêtes.

2) Fournir les éléments mettant en évidence le contrôle sur la saisie de la date d’évaluation.

# Test 2.05 – Affichage des données en sortie du service

<table>
    <tr>
      <td colspan="2"><b><u><i>Référence documentaire :</i></u></b></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.1 et 2.2<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td rowspan="4"><b><u><i>Etat du test :</i></u></b></td>
      <td rowspan="4">Actif</td>
      <td><b><u><i>Données d’entrée :</i></u></b></td>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant AM du PS</td>
      <td><b>991013301</b></td>
    </tr>
    <tr>
      <td><u>Identifiant de l’établissement</u><br />de soins</td>
      <td><b>340781608</b></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td><b>13/12/2012</b></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

**Cas 1**

- lancer une requête d’accès au service « rechercherPrescripteurPraticien »

**Cas 2**

- lancer une requête « rechercherEtablissement »

## *<u>A vérifier</u> :*

Le LPS doit afficher de façon exhaustive les données en sortie retournées par le service pour chaque requête.

**Cas 1 - Données PS :**

- Identifiant RPPS du PS
- Nom, prénom du PS
- Code spécialité du PS
- Eventuel Message : code, libellé

**Cas 2 - Données Établissement de soins :**

- Établissement de soins (code spécialité, raison sociale)
- Adresse (identité du destinataire, point de remise, complément d’adresse, numéro, extension du numéro, type, nom de la voie, mention distribution, CP, localité, code et nom du pays, code INSEE, ligne d’adresse, manuelle)
- Eventuel Message : code, libellé

## *<u>Résultat à fournir</u> :*

Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur pour les deux cas.

# Test 2.06 – Modification des données en sortie du service

<table>
    <tr>
      <th colspan="2"><u><i><b>Référence documentaire :</b></i></u></th>
      <td colspan="2">
        - SEL-MP-012, version 0.30, §2.1 et 2.2<br />
        - FACT-SFG-034 FTE 04 V0.55 §2.3.1.1 et 2.3.1.2<br />
        - FACT-SFG-029 §3.1 DF_FTE_PS : Données PS
      </td>
    </tr>
    <tr>
      <th rowspan="3"><u><i><b>Etat du test :</b></i></u></th>
      <td rowspan="3"><b>Actif</b></td>
      <th><u><i><b>Données d’entrée :</b></i></u></th>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant AM du PS</td>
      <td><b>991013301</b></td>
    </tr>
    <tr>
      <td><u>Identifiant de l’établissement</u><br />de soins</td>
      <td><b>340781608</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>Date d’évaluation</td>
      <td><b>13/12/2015</b></td>
    </tr>
</table>

## *<u>Description détaillée du test</u> :*

### <u>Suite du test précédent</u> :
**Lors de la restitution des données des services, montrer la possibilité de pouvoir modifier l’ensemble des données restituées.**

## *<u>A vérifier</u> :*

**Le LPS doit permettre à l’utilisateur de modifier les données en retour des services.**

## *<u>Résultat à fournir</u> :*

**Présenter une copie d’écran de l’interface du logiciel montrant l’accès aux informations restituées et leur modification possible.**

# Test 2.07 – Gestion des erreurs SOAP

<table>
    <tr>
      <td colspan="2"><strong><em><u>Référence documentaire</u> :</em></strong></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.1 et 2.2<br />- SEL-MP-012, version 0.30, Annexe 2<br />- FACT-SFG-034 FTE 04 V0.55 §2.3.1.1 et 2.3.1.2<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td rowspan="3"><strong><em><u>Etat du test</u> :</em></strong></td>
      <td rowspan="3">Actif</td>
      <td><strong><em><u>Données d’entrée</u> :</em></strong></td>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant AM du PS</td>
      <td><strong>991000001</strong></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td><strong>13/12/2012</strong></td>
    </tr>
</table>

## ***<u>Description détaillée du test</u> :***

Lancer une requête d’accès au service « rechercherPrescripteurPraticien » en renseignant l’identifiant PS à 991000001 (inconnu au FNPS).

## ***<u>A vérifier</u> :***

Le logiciel doit afficher au Professionnel de Santé le code erreur (« IPS_PS_002 ») et le libellé correspondant.

## ***<u>Résultat à fournir</u> :***

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# 1.3 Acquérir les informations Transporteur au RNT

## Test 3.01 - Contrôle Assertion PS

<table>
    <tr>
      <td colspan="2"><u><em><strong>Référence documentaire :</strong></em></u></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.3<br />- Cadre Interopérabilité<br />- FACT-SFG-034 FTE 04 V0.55 §2.3.1.3<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td><u><em><strong>Etat du test :</strong></em></u></td>
      <td>Actif</td>
      <td><u><em><strong>Données d’entrée :</strong></em></u><br /><br />Identification PS (Assertion<br />PS)<br /><br />Date de début<br /><br />Date de fin</td>
      <td><br /><br /><strong>9925XXXXX</strong><br /><br /><strong>01/11/2012</strong><br /><br /><strong>13/12/2012</strong></td>
    </tr>
</table>

**<u>*Description détaillée du test :*</u>**

Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée depuis moins d’une heure.

Paramétrer sur le poste de travail l’identifiant AM du transporteur pour que ce dernier alimente la balise < AttributeStatement> de l’assertion PS.

Cas 1 : Renseigner la date de début et la date de fin et lancer la requête « rechercherDonneesTransporteur »

Cas 2 : Renseigner la date de début uniquement (date de fin optionnelle) et lancer la requête « rechercherDonneesTransporteur »

Une heure plus tard, relancer une nouvelle requête.

**<u>*A vérifier :*</u>**

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le transporteur.

**<u>*Résultat à fournir :*</u>**

Décrire la cinématique mise en œuvre.

# Test 3.02 – Niveau de sécurité Assertion PS

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.3<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td rowspan="4"><strong><u><i>Etat du test :</i></u></strong></td>
      <td rowspan="4">Actif</td>
      <td><strong><u><i>Données d’entrée :</i></u></strong></td>
      <td></td>
    </tr>
    <tr>
      <td>Identification PS (Assertion PS)</td>
      <td>9925XXXXX</td>
    </tr>
    <tr>
      <td>Date de début</td>
      <td>01/11/2012</td>
    </tr>
    <tr>
      <td>Date de fin</td>
      <td>13/12/2012</td>
    </tr>
</table>

### **<u>*Description détaillée du test*</u> :**

**Présence dans le lecteur de la carte CPE/CDE identifiée / authentifiée.**

**Lancer la requête « rechercherDonneesTransporteur »**

**Cas 1 : Procéder à un arrachage de la carte CPE/CDE (puis la réinsérer), relancer une nouvelle requête**

**Cas 2 : Procéder à un arrachage de la carte CPE/CDE (ne pas la réinsérer), relancer une nouvelle requête.**

### **<u>*A vérifier*</u> :**

**Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPE/CDE. En cas d’absence (arrachage ou absence), le LPS doit :**

- **Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,**
- **Demander la saisie du code porteur de la carte CPE/CDE,**
- **Recalculer une nouvelle assertion le cas échéant.**

**Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h**

**Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion**

**Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPE/CDE.**

### **<u>*Résultat à fournir*</u> :**

**Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associées à ce test.**

# **Test 3.04 – Données obligatoires en entrée du service**

<table>
    <tr>
      <td colspan="2"><strong><u><i>Référence documentaire :</i></u></strong></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.3<br />- FACT-SFG-034 FTE 04 V0.55 §2.3.1.3<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td><strong><u><i>Etat du test :</i></u></strong></td>
      <td>Actif</td>
      <td><strong><u><i>Données d’entrée :</i></u></strong><br /><br />Identification PS (Assertion<br />PS)<br /><br />Date de début<br /><br />Date de fin</td>
      <td><br /><br /><strong>9925XXXXX</strong></td>
    </tr>
</table>

## ***<u>Description détaillée du test</u> :***

**Essayer de lancer une requête d’accès au service « rechercherDonneesTransporteur » dans laquelle il manque la date de début.**

## ***<u>A vérifier</u> :***

**Vérifier que le LPS ne permette pas d’accéder au service en l’absence de cette donnée.**

## ***<u>Résultat à fournir</u> :***

**Fournir les éléments mettant en évidence cette saisie obligatoire.**

# **Test 3.05 – Affichage des données en sortie du service**

<table>
    <tr>
      <td colspan="2"><b><u><i>Référence documentaire :</i></u></b></td>
      <td colspan="2">
        - SEL-MP-012, version 0.30, §2.3<br />
        - FACT-SFG-034 FTE 04 V0.55 §2.3.1.3<br />
        - FACT-SFG-029 §3.1 DF_FTE_PS : Données PS
      </td>
    </tr>
    <tr>
      <td><b><u><i>Etat du test :</i></u></b></td>
      <td><b>Actif</b></td>
      <td>
        <b><u><i>Données d’entrée :</i></u></b><br />
        <br />
        Identification PS (Assertion PS)<br />
        Date de début<br />
        Date de fin
      </td>
      <td>
        <br />
        <br />
        <b>9925XXXXX</b><br />
        <b>01/11/2012</b><br />
        <b>13/12/2012</b>
      </td>
    </tr>
</table>

## **<u>*Description détaillée du test*</u> :**

Lancer une requête d’accès au service « rechercherDonneesTransporteur »

<u>**<mark>Si aucune donnée n’est restituée par le service, utiliser l’identifiant de facturation : 992501155</mark>**</u>

## **<u>*A vérifier*</u> :**

**Le LPS doit afficher de façon exhaustive les données en sortie retournées par le service.**

- **Personnel (Nom, prénom, date d’entrée et date de sortie)**
- **Diplôme (nature et date d’obtention du diplôme)**
- **Véhicule (immatriculation, date d’autorisation date de sortie du parc) pour TS**
- **Eventuel Message : code, libellé**

## **<u>*Résultat à fournir*</u> :**

**Fournir les données en sortie retournées par le service et les copies d’écrans présentées au transporteur.**

# Test 3.06 – Modification des données en sortie du service

<table>
    <tr>
      <td colspan="2"><b><u><i>Référence documentaire :</i></u></b></td>
      <td colspan="2">
        - SEL-MP-012, version 0.30, §2.3<br />
        - FACT-SFG-034 FTE 04 V0.55 §2.3.1.3<br />
        - FACT-SFG-029 §3.1 DF_FTE_PS : Données PS
      </td>
    </tr>
    <tr>
      <td><b><u><i>Etat du test :</i></u></b></td>
      <td>Actif</td>
      <td>
        <b><u><i>Données d’entrée :</i></u></b><br />
        <br />
        Identification PS (Assertion PS)<br />
        <br />
        Date de début<br />
        <br />
        Date de fin
      </td>
      <td>
        <br />
        <br />
        9925XXXXX<br />
        <br />
        01/11/2012<br />
        <br />
        13/12/2012
      </td>
    </tr>
</table>

## <u>*Description détaillée du test*</u> :

### <u>Suite du test précédent</u> :
**Lors de la restitution des données des services, montrer la possibilité de pouvoir modifier l’ensemble des données restituées.**

## <u>*A vérifier*</u> :

**Le LPS doit permettre à l’utilisateur de modifier les données en retour du service.**

## <u>*Résultat à fournir*</u> :

**Présenter une copie d’écran de l’interface du logiciel montrant l’accès aux informations restituées et leur modification possible.**

# Test 3.07 – Gestion des erreurs soap

<table>
    <tr>
      <td colspan="2"><u><b><i>Référence documentaire :</i></b></u></td>
      <td colspan="2">- SEL-MP-012, version 0.30, §2.3<br />- SEL-MP-012, version 0.30, Annexe 2<br />- FACT-SFG-029 §3.1 DF_FTE_PS : Données PS</td>
    </tr>
    <tr>
      <td rowspan="4"><u><b><i>Etat du test :</i></b></u></td>
      <td rowspan="4">Actif</td>
      <td><u><b><i>Données d’entrée :</i></b></u></td>
      <td></td>
    </tr>
    <tr>
      <td>Identification PS</td>
      <td>9925XXXXX</td>
    </tr>
    <tr>
      <td>Date de début</td>
      <td>01/11/2012</td>
    </tr>
    <tr>
      <td>Date de fin</td>
      <td>13/12/2012</td>
    </tr>
</table>

### <u>*Description détaillée du test*</u> :

Lancer une requête d’accès au service « rechercherDonneesTransporteur » en renseignant une date de début postérieure à la date de fin.

### <u>*A vérifier*</u> :

Le logiciel doit afficher au Professionnel de Santé le code erreur (« IPS_PS_006 ») et le libellé correspondant.

Le logiciel peut également ne pas permettre de transmettre une telle requête (contrôle en amont).

### <u>*Résultat à fournir*</u> :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.