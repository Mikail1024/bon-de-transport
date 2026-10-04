![logo: CNDA Centre National de Dépôt et d'Agrément](page_1_image_1_v2.jpg)

# Service en Ligne/Service TR


**GUIDE DE TESTS DE CONFORMITE**

# Service Bénéficiaire intégré aux LPS

## Guide de tests de conformité

<table>
    <tr>
      <td><i>Version</i></td>
      <td>01.00</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>15/01/2024</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-FTE</i></td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th colspan="4">HISTORIQUE DES VERSIONS</th>
    </tr>
    <tr>
      <th>DATE</th>
      <th>VERSION</th>
      <th>EVOLUTION DU DOCUMENT</th>
      <th>REDACTEUR</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><mark>15/01/2024</mark></td>
      <td><mark>01.00</mark></td>
      <td><mark>Création du document</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

# TABLE DES MATIERES

<table>
    <tr>
      <td><b>1</b></td>
      <td><b>CAS DE TESTS........................................................................................................................................................</b></td>
      <td><b>4</b></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1 IDENTIFIER UN BENEFICIAIRE/INFORMATIONS BENEFICIAIRES ............................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 - CONTROLE ASSERTION PS .......................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.02 – NIVEAU DE SECURITE ASSERTION PS ......................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.03 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE....................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE....................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 – ENCHAINEMENT DES DEUX OPERATIONS INFOBENEF...............................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.06 – AFFICHAGE DES DONNEES EN SORTIE DU SERVICE ...................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.07 – MODIFICATION DES DONNEES EN SORTIE DU SERVICE............................................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.08 – GESTION DES ERREURS SOAP ...............................................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.09 – GESTION DES ERREURS SOAP ...............................................................................................................</td>
      <td>12</td>
    </tr>
</table>

1

# 1 Cas de Tests

## 1.1 Identifier un bénéficiaire/Informations bénéficiaires

### Test 1.01 - Contrôle Assertion PS

<table>
    <tr>
      <td><u>Référence documentaire</u> :</td>
      <td colspan="3">
        - SEL-MP-013 §2.1<br />
        - Cadre Interopérabilité
      </td>
    </tr>
    <tr>
      <td><u>Etat du test :</u></td>
      <td>Actif</td>
      <td>
        <u>Données d’entrée</u> :<br />
        cas 1 : NIR+Clé ouvrant<br />
        droit<br />
        ---------------------------------------<br />
        Cas 2 : Date d’évaluation,<br />
        NIR+Clé ouvrant droit, date<br />
        et rang de naissance
      </td>
      <td>
        <br />
        1750163220760/34<br />
        <br />
        Date du jour-1<br />
        1750163220760/34<br />
        31/10/1999 - 1
      </td>
    </tr>
</table>

**<u>Description détaillée du test</u> :**

Présence dans le lecteur de la carte CPE identifiée / authentifiée depuis moins d’une heure. Saisir le NIR + Clé de l’ouvrant droit.

Cas 1 : Lancer une requête pour l’opération « listerBeneficiaires ».
Cas 2 : Lancer une requête pour l’opération « rechercherEtatCivilBenef ».

Une heure plus tard, relancer une nouvelle requête pour les deux cas.

**<u>A vérifier</u> :**

Avant toute sollicitation d'un télé-service (web-service), le LPS doit vérifier que l’assertion PS n’est pas obsolète. Si la durée de vie de l’assertion PS est dépassée, le progiciel doit générer une nouvelle assertion.

Cette opération doit être transparente pour le professionnel de santé.

**<u>Résultat à fournir</u> :**

Décrire la cinématique mise en œuvre pour les deux opérations.

# Test 1.02 – Niveau de sécurité Assertion PS

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.1<br />- Cadre Interopérabilité</td>
    </tr>
    <tr>
      <td><u>Etat du test :</u></td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />Date d’évaluation<br />NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td><br />Date du jour<br />1750163220760/34<br />31/10/1999 - 2</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Suite du test précédent :
1) Présence dans le lecteur de la carte CPS identifiée / authentifiée.
2) Sélectionner un bénéficiaire
3) Lancer une requête pour l’opération « listerBeneficiaires »
4) Lancer une requête pour l’opération « rechercherEtatCivilBenef »

Pour chaque requête :

Cas 1 : Procéder à un arrachage de la carte CPS (puis la réinsérer), relancer une nouvelle requête

Cas 2 : Procéder à un arrachage de la carte CPS (ne pas la réinsérer), relancer une nouvelle requête.

## <u>A vérifier</u> :

Avant de lancer une requête, le LPS doit s’assurer de la présence de la carte CPS. En cas d’absence (arrachage ou absence), le LPS doit :

- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la carte CPS
- Recalculer une nouvelle assertion le cas échéant.

Cas 1 : Le LPS peut continuer à utiliser l’assertion générée initialement si sa durée de vie est < 1h

Cas 2 : Le LPS doit détecter l’absence de la carte et demander son insertion

Le LPS doit obligatoirement recalculer une nouvelle assertion après introduction d’une nouvelle CPS.

## <u>Résultat à fournir</u> :

Décrire la cinématique mise en œuvre. Fournir les copies d’écran(s) associées à ce test.

# Test 1.03 – Données obligatoires en entrée du service

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.1</td>
    </tr>
    <tr>
      <td><u>Etat du test</u> :</td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />NIR ouvrant-droit<br />Clé du NIR OD</td>
      <td>1750163220760/34</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Essayer de lancer une requête d’accès à l’opération « listerBeneficiaires » dans laquelle il manque le NIR et/ou la clé.

## <u>A vérifier</u> :

Vérifier que le LPS ne permette pas d’accéder au service en l’absence de cette donnée.

## <u>Résultat à fournir</u> :

Fournir les éléments mettant en évidence cette saisie obligatoire.

# Test 1.04 – Données obligatoires en entrée du service

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.2</td>
    </tr>
    <tr>
      <td rowspan="3"><u>Etat du test</u> :</td>
      <td rowspan="3">Actif</td>
      <td><u>Données d’entrée</u> :</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td>Date du jour -2</td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td>1750163220760/34<br />31/12/1975 - 1</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

1) Essayer de lancer une requête d’accès à l’opération « rechercherEtatCivilBenef » dans laquelle il manque une des données suivantes :
- NIR OD
- Clé du NIR OD
- Date de naissance
- Rang de naissance
- Date d’évaluation

2) Essayer de lancer une requête d’accès au service « rechercherEtatCivilBenef » pour laquelle la date d’évaluation est postérieure à la date du jour

## <u>A vérifier</u> :

1) Vérifier que le LPS ne permette pas d’accéder au service en l’absence d’une de ces données d’entrée.
2) Vérifier que le LPS ne permette pas d’accéder au service. La date d’évaluation doit être obligatoirement antérieure ou égale à la date du jour.

## <u>Résultat à fournir</u> :

1) Fournir les éléments mettant en évidence cette saisie obligatoire.
2) Fournir les éléments mettant en évidence le contrôle sur la saisie de la date d’évaluation.

# Test 1.05 – Enchainement des deux opérations InfoBenef

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.2</td>
    </tr>
    <tr>
      <td><u>Etat du test</u> :</td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />NIR ouvrant-droit<br />Clé du NIR OD</td>
      <td>1750163220760/34</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Lancer une requête d’accès à l’opération « listerBeneficiaires »

Le LPS peut également prévoir un mode d’enchaînement entre les opérations « listerBeneficiaires » et « rechercherEtatCivilBenef » (passage automatique des données entre les deux opérations) – Enchaînement Test 1.06 et 1.07

## <u>A vérifier</u> :

Le LPS doit afficher les données en sortie retournées par le service pour chaque bénéficiaire :

- Prénom
- Date de naissance
- Rang de naissance

## <u>Résultat à fournir</u> :

Fournir les données en sortie retournées par le service et les copies d’écrans présentées au professionnel de santé.

# Test 1.06 – Affichage des données en sortie du service

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.2</td>
    </tr>
    <tr>
      <td><u>Etat du test</u> :</td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />Date d’évaluation<br />NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td><br />Date du jour<br />1750163220760/34<br />31/10/1999 - 2</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Lancer une requête d’accès à l’opération « rechercherEtatCivilBenef ».

## <u>A vérifier</u> :

Le LPS doit afficher les données en sortie retournées par le service :

-  Nom patronymique
-  Nom d’usage (optionnel)
-  Prénom
-  Code Grand régime, caisse et centre gestionnaire

## <u>Résultat à fournir</u> :

1) Fournir les données en sortie retournées par le service et les copies d’écrans présentées au professionnel de santé.

2) Mettre en évidence l’enchaînement entre les opérations « listerBeneficiaires » et « rechercherEtatCivilBenef » (passage automatique des données entre les 2 opérations)

# Test 1.07 – Modification des données en sortie du service

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.2</td>
    </tr>
    <tr>
      <td><u>Etat du test</u> :</td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />Date d’évaluation<br />NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td><br />Date du jour<br />1750163220760/34<br />01/01/1975 - 1</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

### <u>Suite du test précédent</u> :

Lors de la restitution des données du service, montrer la possibilité de pouvoir modifier l’ensemble des données restituées par le service.

## <u>A vérifier</u> :

Le LPS doit permettre à l’utilisateur de modifier les données en retour du service.

## <u>Résultat à fournir</u> :

Présenter une copie d’écran de l’interface du logiciel montrant l’accès aux informations restituées et leur modification possible.

# Test 1.08 – Gestion des erreurs SOAP

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 §2.2</td>
    </tr>
    <tr>
      <td><u>Etat du test :</u></td>
      <td>Actif</td>
      <td><u>Données d’entrée</u> :<br />NIR ouvrant droit<br />Clé du NIR OD</td>
      <td><br />1770863220187/<br />39</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Lancer une requête d’accès au service « listerBeneficiaires » en renseignant le NIR 1770863220187/39 (inconnu en BDO).

## <u>A vérifier</u> :

Le logiciel doit afficher au Professionnel de Santé le code erreur restitué et le libellé correspondant.

## <u>Résultat à fournir</u> :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.

# Test 1.09 – Gestion des erreurs SOAP

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u> :</td>
      <td colspan="2">- SEL-MP-013 Annexe 2</td>
    </tr>
    <tr>
      <td rowspan="3"><u>Etat du test</u> :</td>
      <td rowspan="3">Actif</td>
      <td><u>Données d’entrée</u> :</td>
      <td></td>
    </tr>
    <tr>
      <td>Date d’évaluation</td>
      <td>Date du jour</td>
    </tr>
    <tr>
      <td>NIR+Clé ouvrant droit<br />date et rang de naissance</td>
      <td>1750163220760/34<br />01/01/2000 - 1</td>
    </tr>
</table>

## <u>Description détaillée du test</u> :

Lancer une requête d’accès au service « rechercherEtatCivilBenef » (avec date de naissance inconnue BDO).

## <u>A vérifier</u> :

Le logiciel doit afficher au Professionnel de Santé le code erreur et le libellé correspondant.

## <u>Résultat à fournir</u> :

Fournir les traces XML de la requête et de la réponse ainsi qu’une copie d’écran du résultat affiché dans le logiciel.