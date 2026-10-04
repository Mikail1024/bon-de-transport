## **Service Transport**
---

# **GUIDE DE TESTS DE CONFORMITE**

logo: CNDA Centre National de Dépôt et d'Agrément




## **Facturation Transporteur**

## **Constituer et transmettre les traces de géolocalisation**

## **Guide de tests de conformité**

<table>
    <tr>
      <td><i>Version</i></td>
      <td>01.05.00</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>22/03/2024</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-GEO</i></td>
    </tr>
</table>

*SEL-GCONFORM-GEO* <mark>Version : 01.05.00</mark>

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
      <td>21/07/2015</td>
      <td>0.01.06</td>
      <td>Création du document.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>26/08/2015</td>
      <td>0.01.07</td>
      <td>Modification du test 1.03 : Trajet partagé en ambulance remplacé par trajet partagé en VSL.<br /><br />MAJ de la table des matières pour ce test</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/01/2016</td>
      <td>0.01.08</td>
      <td>Modification « A vérifier » des tests 1.06 à 1.10 :</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>03/02/2016</td>
      <td>0.01.09</td>
      <td>Modification : «Description détaillée du test », « A vérifier » &#x26; « Résultats à fournir » des tests 1.01 à 1.04</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/12/2021</td>
      <td>1.03.00</td>
      <td>Ajout des tests pour la Géolocalisation avec SEFI</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>31/03/2022</td>
      <td>1.03.01</td>
      <td>Modification : « Résultat à fournir » pour le test 3.04 cas 2</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>22/03/2024</mark></td>
      <td><mark>1.05.00</mark></td>
      <td><mark>Test 1.01 : Ajout d’une précision.</mark><br /><mark>Tests 3.01 et 3.02 : Ajout d’une vérification.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

*<mark>31/03/2022</mark> Guide de tests de conformité Géolocalisation 2 / 18*

*SEL-GCONFORM-GEO* Version : 01.05.00

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><b>0</b></td>
      <td><b>INTRODUCTION ET FICHE D’ENGAGEMENT .............................................................................................. 4</b></td>
    </tr>
    <tr>
      <td><b>1</b></td>
      <td><b>GEOLOCALISATION ET FACTURATION B2 ................................................................................................. 5</b></td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.01 - REALISATION D’UN TRAJET EN AMBULANCE ............................................................................................ 5</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.02 - REALISATION D’UN TRANSPORT « ALLER/RETOUR » EN AMBULANCE ...................................................... 6</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.03 - REALISATION D’UN TRAJET PARTAGE EN VSL ......................................................................................... 7</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.04 - REALISATION D’UN TRANSPORT « ALLER/RETOUR » EN VSL ................................................................... 8</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 1.05 - PARAMETRAGES ....................................................................................................................................... 9</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>INTEGRITE DES DONNEES SAISIES ET/OU ENREGISTREES DANS LE FICHIER DE TRACES ..... 10</b></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>LES TESTS CI-DESSOUS PERMETTENT DE VERIFIER L’INTEGRITE DES DONNEES SAISIES ET/OU ENREGISTREES<br />DANS LE FICHIER DE TRACES« TYPE ET LONGUEUR, PRESENCE DES BALISES » ................................................. 10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.01 - REPRENDRE LE TEST 1.01 – CONTROLE DE LA BALISE DISTANCE .......................................................... 10</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.02 - REPRENDRE LE TEST 1.01– CONTROLE DES BALISES GPX ..................................................................... 11</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.03 - REPRENDRE LE TEST 1.01 – CONTROLE DE LA BALISE BOITIER GPS ..................................................... 12</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.04 - REPRENDRE LE TEST 1.01 – CONTROLE DES BALISES TRANSPORTEURS ................................................. 13</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 2.05 - REPRENDRE LE TEST 1.01 – CONTROLE DES BALISES TRANSPORTEURS ................................................. 14</td>
    </tr>
    <tr>
      <td><b>3</b></td>
      <td><b>GEOLOCALISATION ET FEL ........................................................................................................................... 15</b></td>
    </tr>
    <tr>
      <td></td>
      <td><mark><u>TEST 3.01 - REALISATION D’UN TRANSPORT « ALLER/RETOUR » EN AMBULANCE</u></mark> .................................................... 15</td>
    </tr>
    <tr>
      <td></td>
      <td><mark><u>TEST 3.02 – POSITIONS GPS NON DISPONIBLES</u></mark> ......................................................................................................... 16</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 3.03 – PARAMETRAGE DES AUTORISATIONS DE TRANSMISSIONS DES TRACES .................................................. 17</td>
    </tr>
    <tr>
      <td></td>
      <td>TEST 3.04 – CONSTITUTION DU MESSAGE SMTP D’ENVOI DES TRACES .................................................................... 18</td>
    </tr>
</table>

*31/03/2022 Guide de tests de conformité Géolocalisation* 3 / 18

*SEL-GCONFORM-GEO* Version : *01.05.00*

# **0 Introduction et Fiche d’engagement**

1- La réalisation des tests pourra débuter que si les conditions particulières rattachées à la géolocalisation sont signées.

2- Les tests géolocalisation en contexte SEFi doivent être exclusivement avec les bénéficiaires du Guide de tests SEFi.

3- Utilisation de la carte CPS transporteur de test ou du numéro de facturation de test fourni par le CNDA à chaque SSII.

4- Utilisation pour les tests, du numéro provisoire spécifique «géolocalisation» à véhiculer dans la B2. Ce numéro vous sera fourni après signature du protocole et des conditions particulières avec le CNDA.

5- La durée des trajets relatifs aux tests demandés, doit être supérieure ou égale à 10 minutes.

**Tableau des tests à réaliser lors d’une certification différentielle pour l’implémentation de la géolocalisation pour la FEL**

<table>
  <thead>
    <tr>
      <th><strong>Certification Géolocalisation B2 et FEL</strong></th>
      <th><strong>Différentiel pour Certification Géolocalisation FEL<br /><b>(Déjà certifié pour la Géolocalisation B2)</b></strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Tests 1.01 – 1.02 – 1.03 – 1.04 – 1.05 –<br />2.01 - 2.02 - 2.03 - 2.04 - 2.05</td>
      <td></td>
    </tr>
    <tr>
      <td>Tests 3.01 – 3.02 – 3.03 – 3.04 – 3.05</td>
      <td>Tests 3.01 – 3.02 – 3.03 – 3.04 – 3.05</td>
    </tr>
  </tbody>
</table>

*31/03/2022* *Guide de tests de conformité Géolocalisation* 4 / 18

*SEL-GCONFORM-GEO* *Version : 01.05.00*

# **1 Géolocalisation et Facturation B2**

## **Test 1.01 - Réalisation d’un trajet en ambulance**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur – Constituer et Transmettre les traces de géolocalisation<br /><br />[RG_GE101] - [RG_GE102] - [RG_GE103] - [RG_GE106]<br />[RG_GE201] - [RG_GE202] - [RG_GE203] - [RG_GE204]</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

### <u>Description détaillée du test</u>

Réalisation d’un trajet en **Ambulance** (Domicile / Structure), pour un bénéficiaire du régime général.

1. Création de la facture au format Norme B2 à partir des données Bénéficiaire et du trajet réalisé.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données du trajet.

### <u>A vérifier</u>

1. <u>Dans le fichier au format Norme B2 : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.</u>
   <mark><u>Le N° d’autorisation de géolocalisation est renseignée dans le Type 2S positions 45-49.</u></mark>
2. Nommage du fichier XML de traces de géolocalisation. –
3. La complétude du fichier XML de traces de géolocalisation avec les données de la facture B2 et les données du trajet enregistrées.

### <u>Résultat à fournir</u>

Le fichier de facturation au format Norme B2 permettant de visualiser le contenu des types suivants :
Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.

Le fichier XML de traces de géolocalisation.

*31/03/2022* *Guide de tests de conformité Géolocalisation* 5 / 18

<table>
    <tr>
      <td><i>SEL-GCONFORM-GEO</i></td>
      <td></td>
      <td><i>Version : 01.05.00</i></td>
    </tr>
</table>

# **Test 1.02 - Réalisation d’un transport « aller/retour » en ambulance**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur – Constituer et<br />Transmettre les traces de géolocalisation<br /><br />[RG_GE101] - [RG_GE102] - [RG_GE103] - [RG_GE106]<br />[RG_GE201] - [RG_GE202] - [RG_GE203] - [RG_GE204]</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le<br />CNDA</td>
    </tr>
</table>

## <u>Description détaillée du test</u>

Réalisation d’un transport **« aller / retour »** en **Ambulance** (Domicile / Structure – Structure / Domicile), pour un bénéficiaire du régime général.

1. Création de la facture au format Norme B2 à partir des données Bénéficiaire et des trajets réalisés.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données correspondantes aux deux trajets.

## <u>A vérifier</u>

1. Dans le fichier au format Norme B2 : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.
2. Nommage du fichier XML de traces de géolocalisation
3. La complétude du fichier XML de traces de géolocalisation avec les données de la facture B2 et les données de trajet enregistrées.

## <u>Résultat à fournir</u>

Le fichier de facturation au format Norme B2 permettant de visualiser le contenu des types de la norme B2 suivants : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.

Le fichier XML de traces de géolocalisation.

*31/03/2022 Guide de tests de conformité Géolocalisation* 6 / 18

<table>
    <tr>
      <td><i>SEL-GCONFORM-GEO</i></td>
      <td></td>
      <td><i>Version : 01.05.00</i></td>
    </tr>
</table>

# **Test 1.03 - Réalisation d’un trajet partagé en VSL**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br /><strong><b>Situations Spécifiques</b></strong> : SP1 – transport partagé</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

## <u>Description détaillée du test</u>

Réalisation d’un trajet partagé en **VSL** (Domicile / Structure), pour deux bénéficiaires du régime général.
Point de départ différent (domicile de chaque bénéficiaire).
Point de dépose commune pour les deux bénéficiaires.

1. Création des factures au format Norme B2 à partir des données Bénéficiaire et des trajets réalisés.
2. Nommage des fichiers XML de traces de géolocalisation.
3. Constitution des fichiers XML de traces de géolocalisation contenant les données correspondantes à chacun des trajets.

## <u>A vérifier</u>

1. Dans le(s) fichier(s) au format Norme B2 : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.
2. Nommage des fichiers XML de traces de géolocalisation.
3. La complétude des fichiers XML de traces de géolocalisation avec les données des factures B2 et les données de trajet enregistrées.

## <u>Résultat à fournir</u>

Le fichier de facturation au format Norme B2 permettant de visualiser le contenu des types de la norme B2 suivants : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.

Les fichiers XML de traces de géolocalisation.

*31/03/2022* *Guide de tests de conformité Géolocalisation* *7 / 18*

*SEL-GCONFORM-GEO* *Version : 01.05.00*

# **Test 1.04 - Réalisation d’un transport « aller/retour » en VSL**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br />[RG_GE101] - [RG_GE102] - [RG_GE103] - [RG_GE106]<br />[RG_GE201] - [RG_GE202] - [RG_GE203] - [RG_GE204]</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le<br />CNDA</td>
    </tr>
</table>

## Description détaillée du test

Réalisation d’un transport **«aller / retour »** en **VSL** (Domicile / Structure – Structure / Domicile) pour un bénéficiaire du régime général.

1. Création de la facture au format Norme B2 à partir des données Bénéficiaire et des trajets réalisés.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données correspondantes aux deux trajets.

## <u>A vérifier</u>

1. Dans le fichier au format Norme B2 : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.
2. Nommage du fichier XML de traces de géolocalisation.
3. La complétude du fichier XML de traces de géolocalisation avec les données de la facture B2 et les données de trajet enregistrées.

## <u>Résultat à fournir</u>

Le fichier de facturation au format Norme B2 permettant de visualiser le contenu des types de la norme B2 suivants : Type 000 - Type 2A – Type 2S – Type 4T – Type 4U.

Le fichier XML de traces de géolocalisation.

*31/03/2022* *Guide de tests de conformité Géolocalisation* 8 / 18

<table>
    <tr>
      <td><i>SEL-GCONFORM-GEO</i></td>
      <td></td>
      <td><i>Version : 01.05.00</i></td>
    </tr>
</table>

# **Test 1.05 - Paramétrages**

<table>
    <tr>
      <td rowspan="2"><u>Référence documentaire</u></td>
      <td colspan="3"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur – Constituer et Transmettre les traces de géolocalisation<br /><br /><b>[RG_GE401]</b> Paramétrage de la fréquence d’enregistrement des traces<br /><b>[RG_GE402]</b> Paramétrage des autorisations de transmission des traces</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

## Description détaillée du test

1. Paramétrage de la fréquence d’enregistrement des traces.
2. Paramétrage des autorisations des transmissions des traces.

## <u>A vérifier</u>

1. La valeur par défaut de la fréquence d’enregistrement des traces est de 60 secondes.
2. Le bon paramétrage permettant de définir, pour chaque régime, les capacités à recevoir ou non les traces de géolocalisation.

## <u>Résultat à fournir</u>

• Fournir une copie d’écran pour la fréquence.
• Fournir des copies d’écran ou des fichiers du paramétrage mis en place pour les autorisations
  - Le paramétrage du régime général.
  - Le paramétrage simulé d’un autre régime à venir (ouvrir toutes les options de la règle).

*31/03/2022* *Guide de tests de conformité Géolocalisation* *9 / 18*

*SEL-GCONFORM-GEO* Version : *01.05.00*

# **2 Intégrité des données saisies et/ou enregistrées dans le fichier de traces**

## **2.1 Les tests ci-dessous permettent de vérifier l’intégrité des données saisies et/ou enregistrées dans le fichier de traces« Type et Longueur, présence des balises »**

### **Test 2.01 - Reprendre le test 1.01 – Contrôle de la Balise Distance**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br /><b>[RG_GE107]</b> Calcul de la distance réelle parcourue</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

#### <u>Description détaillée du test</u>

**Cas 1** : Supprimer la totalité de la balise `<Distance Q="réel">NNNN</Distance>`.

**Cas 2** : Ne pas enregistrer de valeur dans la balise `<Distance Q="réel"></Distance>`.

**Cas 3** : Enregistrer de valeur 0000 dans la balise `<Distance Q="réel">0000</Distance>`.

**Cas 4** : Enregistrer une valeur kilométrique dans la balise `<Distance Q="réel">NNNN</Distance>` différente de la valeur réalisée lors du trajet initial.

#### <u>A vérifier</u>

**Cas non passants**

Utiliser le fichier XSD pour la vérification du fichier XML généré ou modifié pour ce test. Les contrôles ne pouvant être effectués via le schéma XSD doivent être implantés dans le logiciel.

#### <u>Résultat à fournir</u>

Pour chaque cas :
- Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.
- Fournir des copies d’écran.

*31/03/2022 Guide de tests de conformité Géolocalisation* 10 / 18

<table>
    <tr>
      <td><i>SEL-GCONFORM-GEO</i></td>
      <td></td>
      <td><mark><i>Version : 01.05.00</i></mark></td>
    </tr>
</table>

# **Test 2.02 - Reprendre le test 1.01– Contrôle des Balises GPX**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br /><strong>[RG_GE106]</strong> Enregistrement des positions GPS</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

## <u>Description détaillée du test</u>

**Cas 1** : Supprimer la totalité de la balise \<trk> \</trk> est la totalité de son contenue.

**Cas 2** : Supprimer le contenu global de la 1ère balise de la balise \<trkpt>.

**Cas 3** : Supprimer uniquement le contenu de la balise \<time>\</time> contenu dans la 1ère balise de la .balise \<trkpt>.

**Cas 4** : Enrichir le contenu de la 1ére balise \<time>\</time> avec une chaine de 20 caractères alphanumériques.

## <u>A vérifier</u>

**Cas non passants**

Utiliser le fichier XSD pour la vérification du fichier XML généré ou modifié pour ce test. Les contrôles ne pouvant être effectués via le schéma XSD doivent être implantés dans le logiciel.

## <u>Résultat à fournir</u>

Pour chaque cas :
- Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.
- Fournir des copies d’écran.

*31/03/2022* *Guide de tests de conformité Géolocalisation* *11 / 18*

*SEL-GCONFORM-GEO* | *Version : 01.05.00*

# **Test 2.03 - Reprendre le test 1.01 – Contrôle de la Balise Boitier GPS**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le<br />CNDA</td>
    </tr>
</table>

### <u>Description détaillée du test</u>

**Cas 1** : Supprimer le contenu de la balise &lt;BoitierGPS Q="1"&gt; &lt;/BoitierGPS&gt;.

**Cas 2** : Supprimer la totalité de la balise &lt;BoitierGPS Q="1"&gt; &lt;/BoitierGPS&gt;.

**Cas 3** : Enrichir la balise &lt;BoitierGPS Q="1"&gt; &lt;/BoitierGPS&gt; avec une chaine supérieurs à 15 caractères.

**Cas 4** : Enrichir la balise &lt;BoitierGPS Q="1"&gt; &lt;/BoitierGPS&gt; avec une chaine inférieurs à 15 caractères.

### <u>A vérifier</u>

**Cas non passants**

Utiliser le fichier XSD pour la vérification du fichier XML généré ou modifié pour ce test. Les contrôles ne pouvant être effectués via le schéma XSD doivent être implantés dans le logiciel.

### <u>Résultat à fournir</u>

Pour chaque cas :
- Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.
- Fournir des copies d’écran.

*31/03/2022* | *Guide de tests de conformité Géolocalisation* | 12 / 18

<table>
    <tr>
      <td><i>SEL-GCONFORM-GEO</i></td>
      <td></td>
      <td><i>Version : 01.05.00</i></td>
    </tr>
</table>

# **Test 2.04 - Reprendre le test 1.01 – Contrôle des Balises Transporteurs**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le CNDA</td>
    </tr>
</table>

## <u>Description détaillée du test</u>

### **<Conducteur>**

**Cas 1** : Supprimer le contenu de la balise <Usage> </Usage> et de la balise <Prenom> </Prenom>.
**Cas 2** : Enrichir la balise <Usage> </Usage> et la balise <Prenom> </Prenom> avec des chaines supérieurs à 50 caractères.

### **<Accompagnateur>**

**Cas 3** : Supprimer le contenu de la balise <Usage> </Usage> et de la balise <Prenom> </Prenom>.
**Cas 4** : Enrichir la balise <Usage> </Usage> et la balise <Prenom> </Prenom> avec des chaine de supérieurs à 50 caractères.

## <u>A vérifier</u>

**Cas non passants**

Utiliser le fichier XSD pour la vérification du fichier XML généré ou modifié pour ce test. Les contrôles ne pouvant être effectués via le schéma XSD doivent être implantés dans le logiciel.

## <u>Résultat à fournir</u>

Pour chaque cas :
- Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.
- Fournir des copies d’écran.

*31/03/2022* *Guide de tests de conformité Géolocalisation* 13 / 18

*SEL-GCONFORM-GEO* Version : 01.05.00

# **Test 2.05 - Reprendre le test 1.01 – Contrôle des Balises Transporteurs**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br /><strong>[RG_GE103]</strong> Enregistrement des caractéristiques d’un transport</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>Numéro PS Transporteur<br /><br />N° géolocalisation provisoire fourni par le<br />CNDA</td>
    </tr>
</table>

## Description détaillée du test

### **<Accompagnateur>**

Réalisation d’un transport « aller / retour » en ambulance (Domicile/Structure–Structure/Domicile) sans accompagnateur, pour un bénéficiaire du régime général.

### <u>A vérifier</u>

### **Cas non passants**

Utiliser le fichier XSD pour la vérification du fichier XML généré ou modifié pour ce test. Les contrôles ne pouvant être effectués via le schéma XSD doivent être implantés dans le logiciel.

### <u>Résultat à fournir</u>

Pour chaque cas :
- Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.
- Fournir des copies d’écran.

*31/03/2022 Guide de tests de conformité Géolocalisation* 14 / 18

*SEL-GCONFORM-GEO* *Version : 01.05.00*

# **3 Géolocalisation et FEL**

## **Test 3.01 - Réalisation d’un transport « aller/retour » en ambulance**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur - Constituer et Transmettre<br />les traces de géolocalisation<br /><br /><b>[RG_GE101]</b> Nommage du fichier de traces XML de géolocalisation<br /><b>[RG_GE102]</b> Enregistrement des caractéristiques de la facture<br /><b>[RG_GE103]</b> Enregistrement des caractéristiques d’un transport</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>N°AM Transporteur Sanitaire SEFi</td>
    </tr>
</table>

### <u>Description détaillée du test</u>

Réalisation d’un transport « aller / retour » en **Ambulance** (Domicile / Structure – Structure / Domicile), pour un bénéficiaire du régime général.

1. Création d’une FEL à partir des données Bénéficiaire et des trajets réalisés.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données correspondantes aux deux trajets.

---

**Cas 1** : Réalisation du trajet **<u>avec</u>** accompagnateur, pour un bénéficiaire du régime général.
**Cas 2** : Réalisation du trajet **<u>sans</u>** accompagnateur, pour un bénéficiaire du régime général.

### <u>A vérifier</u>

*   Nommage du fichier XML de traces de géolocalisation (Type émetteur fixé à « TS » spécifique à la FEL).
*   La complétude du fichier XML de traces de géolocalisation avec les données de la FEL et les données de trajet enregistrées.
*   Dans la requête pour l’opération : « semafeltransport:1.0.0:valider » , la distance GPS, le niveau de <u>certification GPS, l’indicateur d’utilisation d’un distancier, et le N° d’autorisation de géolocalisation sont valorisés (balises : \<NiveauCertification> ,\<DistanceGPS>, \<Distancereferentiel> et \< NumeroAutorisation>).</u>

**Cas 2 : <u>Non passant</u>**

### <u>Résultat à fournir</u>

Pour chaque cas, fournir si possible :
*   Le fichier de facturation au format FEL : requête/réponse SOAP pour l’opération urn:semafeltransport:1.0.0:valider
*   Le fichier XML de traces de géolocalisation.

**Cas 2** : Afficher le code rejet du LPS, ou démontrer l’impossibilité de réaliser le test.

<table>
    <tr>
      <td><mark>31/03/2022</mark></td>
      <td><i>Guide de tests de conformité Géolocalisation</i></td>
      <td>15 / 18</td>
    </tr>
</table>

*SEL-GCONFORM-GEO Version : 01.05.00*

# **Test 3.02 – Positions GPS non disponibles**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><b><b>FACT-SFG-039</b></b> : Facturation Transporteur - Constituer et<br />Transmettre les traces de géolocalisation<br /><br /><b>[RG_GE106]</b> Enregistrement des positions GPS<br /><b>[CE_GE02]</b> Absence de positions GPS</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><b><b>Actif</b></b></td>
      <td><u>Données d’entrée</u></td>
      <td>N°AM Transporteur Sanitaire SEFi</td>
    </tr>
</table>

## Description détaillée du test

Réalisation d’un trajet en **VSL** (Domicile / Structure), pour un bénéficiaire du régime général.

1. Création d’une FEL à partir des données Bénéficiaire et du trajet réalisé.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données du trajet.

---

Les positions GPS ne sont pas disponibles.

## <u>A vérifier</u>

*   Nommage du fichier XML de traces de géolocalisation
*   La complétude du fichier XML de traces de géolocalisation avec les données de la FEL et les données de trajet enregistrées.
*   Dans la requête pour l’opération : « semafeltransport:1.0.0:valider » , la distance GPS, le niveau de <u>certification GPS, l’indicateur d’utilisation du’un distancier, et le N° d’autorisation de géolocalisation sont valorisés (balises : &lt;NiveauCertification&gt; ,&lt;DistanceGPS&gt;, &lt;Distancereferentiel&gt; et &lt; NumeroAutorisation&gt;).</u>

Le fichier de traces doit contenir à minima la position du début et de la fin du point de prise en charge.

## <u>Résultat à fournir</u>

Pour chaque cas, fournir si possible :

*   Le fichier de facturation au format FEL : requête/réponse SOAP pour l’opération urn:semafeltransport:1.0.0:valider
*   Le fichier XML de traces de géolocalisation.


16 / 18

*31/03/2022 Guide de tests de conformité Géolocalisation*

*SEL-GCONFORM-GEO* <span style="float: right;">*Version : 01.05.00*</span>

# **Test 3.03 – Paramétrage des autorisations de transmissions des traces**

<table>
    <tr>
      <td colspan="2"><u>Référence documentaire</u></td>
      <td colspan="2"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et Transmettre les traces de géolocalisation<br /><br /><strong>[RG_GE301]</strong> Autorisation transmission du fichier de traces géolocalisation<br /><strong>[RG_GE402]</strong> Paramétrage des autorisations de transmission des traces</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>N°AM Transporteur Sanitaire SEFi</td>
    </tr>
</table>

## Description détaillée du test

Paramétrage des autorisations des transmissions des traces

**Cas 1** : Transmissions des traces avant la « date de début de transmissions »
**Cas 2** : Transmissions des traces après la « date de fin de transmissions »
**Cas 3** : Transmission pour un régime ou une caisse non concerné

## <u>A vérifier</u>

L’autorisation de transmettre le fichier de traces de géolocalisation dépend du code régime, du code caisse destinataire du bénéficiaire et du type de facture effectuée.

Par défaut, pour le régime général et les régimes hébergés, l’autorisation FEL est à « O », et la date de début et de fin de transmissions sont à « non renseignée », la transmission est alors toujours possible.

## <u>Résultat à fournir</u>

Fournir des copies d’écran ou des fichiers du paramétrage mis en place pour :
* Le paramétrage de la date de début et de fin de transmissions
* Le paramétrage du régime général.
* Le paramétrage simulé d’un autre régime à venir (ouvrir toutes les options de la règle)

*31/03/2022* <span style="margin-left: 200px;">*Guide de tests de conformité Géolocalisation*</span> <span style="float: right;">17 / 18</span>

*SEL-GCONFORM-GEO Version : 01.05.00*

# **Test 3.04 – Constitution du message SMTP d’envoi des traces**

<table>
    <tr>
      <td rowspan="2"><u>Référence documentaire</u></td>
      <td colspan="3"><strong><b>FACT-SFG-039</b></strong> : Facturation Transporteur - Constituer et Transmettre les<br />traces de géolocalisation<br /><br /><strong>[RG_GE301]</strong> Autorisation transmission du fichier de traces géolocalisation<br /><strong>[RG_GE302]</strong> Constitution du message SMTP d’envoi des traces<br /><strong>[RG_GE402]</strong> Paramétrage des autorisations de transmission des traces</td>
    </tr>
    <tr>
      <td><u>Etat du test</u></td>
      <td><strong><b>Actif</b></strong></td>
      <td><u>Données d’entrée</u></td>
      <td>N°AM Transporteur Sanitaire SEFi</td>
    </tr>
</table>

## **<u>Description détaillée du test</u>**

Réalisation d’un transport « aller » en **Ambulance** (Domicile / Structure).

1. Création d’une FEL à partir des données Bénéficiaire et du trajet réalisé.
2. Nommage du fichier XML de traces de géolocalisation.
3. Constitution du fichier XML de traces de géolocalisation contenant les données du trajet.
4. Envoi du fichier de trace XML en pièces jointes d’un message SMTP à l’adresse mail destinataire
   **Paramétrer sur le poste une adresse mail de tests.**

**Cas 1** : Pour un bénéficiaire du régime général et des régimes hébergés
**Cas 2** : Pour un bénéficiaire des autres régimes (**<u>pas de bénéficiaire hors régime général disponible en environnement de tests éditeurs</u>**).

## **<u>A vérifier</u>**

Le fichier de trace XML est mis en pièce jointe non compressé, d’un message SMTP non sécurisé, à destination de l’adresse mail paramétrée.

**Cas 1 : Paramétrer sur le poste une adresse mail de tests.**
Pour l’environnement de production, l’adresse mail destinataire est « geolocts.cnam@assurance-maladie.fr ».

**Cas 2** : Adresse mail destinataire sera « non renseignée »

## **<u>Résultat à fournir</u>**

**Cas 1** :
* Le fichier de facturation au format FEL : requête/réponse SOAP pour l’opération urn:semafeltransport:1.0.0:valider
* Le fichier XML de traces de géolocalisation.
* Des copies d’écran ou des fichiers du paramétrage mis en place pour l’adresse mail destinataire.
  Le message SMTP.

**Cas 2** :
* Présenter les éléments mettant évidence que pour un bénéficiaire hors régime général et régimes hébergés l’adresse mail destinataire est « non renseignée ».

*31/03/2022 Guide de tests de conformité Géolocalisation 18 / 18*