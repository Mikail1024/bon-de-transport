*SEL-GCONFORM-INS* Version 05.00.00

logo: CNDA Centre National de Dépôt et d'Agrément

## **Service en Ligne/Service PS**

# **Service INS intégré aux LPS**

# **Package de tests CNDA INSi**
# **V05.00.00**

logo: l'Assurance Maladie INSi

<table>
    <tr>
      <td><i>Version</i></td>
      <td><mark>05.00.00</mark></td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td><mark>11/08/2025</mark></td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-INSi</i></td>
    </tr>
</table>

11/08/2025 Package CNDA INSi 1/6

*SEL-GCONFORM-INS* Version 05.00.00

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
      <td>07/02/2020</td>
      <td>1.00.00</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>06/03/2020</td>
      <td>1.00.01</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/03/2020</td>
      <td>1.00.02</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/07/2020</td>
      <td>2.00.00</td>
      <td>Prise en compte du Package documentaire 2.00.00</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/12/2020</td>
      <td>3.00.00</td>
      <td>Prise en compte du Package documentaire 3.00.00</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/07/2021</td>
      <td>4.00.00</td>
      <td>Prise en compte du Package documentaire 4.00.00</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>31/03/2022</td>
      <td>4.00.01</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/11/2022</td>
      <td>4.00.02</td>
      <td>Prise en compte du Package documentaire 4.00.01</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/04/2023</td>
      <td>4.00.03</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>03/07/2023</td>
      <td>4.00.04</td>
      <td>Test 0.01 : Suppression du test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>11/12/2023</td>
      <td>4.00.05</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/01/2024</td>
      <td>4.00.06</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>11/08/2024</td>
      <td>5.00.00</td>
      <td>Prise en compte du Package documentaire 5.00.00</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

11/08/2025 Package CNDA INSi 2/6

<table>
    <tr>
      <td><i>SEL-GCONFORM-INS</i></td>
      <td></td>
      <td>Version <mark>05.00.00</mark></td>
    </tr>
</table>

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>INTRODUCTION.........................................................................................................................................4</strong></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>PROCEDURE..........................................................................................................................................4</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>PRE REQUIS ..........................................................................................................................................5</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>CONTENU DE LA LIVRAISON..................................................................................................................6</strong></td>
    </tr>
</table>



3/6

<table>
    <tr>
      <td><mark>11/08/2025</mark></td>
      <td>Package CNDA INSi</td>
      <td>3/6</td>
    </tr>
</table>

*SEL-GCONFORM-INS* Version 05.00.00

# **1 Introduction**

## **1.1 Procédure**

Ce document vise à vérifier la correcte intégration, au logiciel de facturation, des services d’acquisition et de vérification des informations d’un bénéficiaire de soins et d’un Partenaire de Santé à partir des référentiels de l’AMO.

Dans l’optique de cette vérification :

1. Une première phase consistera à l’examen par le CNDA des résultats des différents cas de tests du guide de tests SEL-GCONFORM_INSi_Vxx.xx.

   Les résultats seront transmis directement en déposant le dossier au format électronique sur le site du CNDA depuis votre « espace personnel » [(https://cnda.ameli.fr/](https://cnda.ameli.fr/)</u> ).

   Format des résultats attendus :
   * Un document .pdf ou .doc comprenant vos réponses aux tests : textes et copies d’écran.
   * Un dossier nommé « XML » contenant les traces de vos tests nommées avec le format suivant :
     * Test_*numéroDuTest*_(cas_*numéroDuCas*_)REQUETE.xml
     * Test_*numéroDuTest*_(cas_*numéroDuCas*_)REPONSE.xml

2. Une seconde phase consistera à la réalisation des différents cas du présent guide de tests ainsi que des tests de non régression dans le logiciel. A cette fin et dans un but de vérification, le logiciel devra permettre l’accès aux traces xml des requêtes émises et des réponses reçues.

Pendant toute la durée de la phase de tests, l’éditeur à la possibilité de contacter le support du CNDA par mail : [support.cnda@assurance-maladie.fr](mailto:support.cnda@assurance-maladie.fr) en préfixant l’objet du message par TS-AM.

11/08/2025 Package CNDA INSi 4/6

*SEL-GCONFORM-INS* Version 05.00.00

## **1.2 Pré requis**

Utilisation d’un numéro d’autorisation provisoire de test propre à chaque logiciel. Ce numéro vous sera fourni par le CNDA à la signature des conditions particulières du service intégré.

Utilisation du type d’autorisation « 4 » (Numéro d’autorisation) à renseigner dans l’entête de la requête.

**<u>Pour la réalisation de certains tests, le LPS doit permettre de traiter les fichiers xml</u>**
**<u>référencés dans les tests correspondants comme étant des réponses soap du</u>**
**<u>service INSi, ceci afin de simuler des réponses dans une autre version du service</u>**
**<u>ou la restitution de données spécifiques.</u>**

11/08/2025 Package CNDA INSi 5/6

*SEL-GCONFORM-INS* Version 05.00.00

## **2 Contenu de la livraison**

<table>
  <thead>
    <tr>
      <th><b>Référence Document</b></th>
      <th>Version diffusée</th>
      <th>Mise à jour /<br /><b>Nouveauté</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>SEL-GCONFORM_INSi</td>
      <td>01.14</td>
      <td><b>Mise à jour</b></td>
    </tr>
    <tr>
      <td>Fichiers xml à injecter</td>
      <td>1.03</td>
      <td>-</td>
    </tr>
    <tr>
      <td>SEL-INS-Ident.différentiel Tests</td>
      <td>05.00.00</td>
      <td><b>Mise à jour</b></td>
    </tr>
    <tr>
      <td>INS_A_VERIFIER</td>
      <td>1.04</td>
      <td>-</td>
    </tr>
  </tbody>
</table>

11/08/2025 Package CNDA INSi 6/6