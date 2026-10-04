*SEL-GCONFORM-PEC* Version : 02.13.07

logo: CNDA Centre National de Dépôt et d'Agrément

# **Services en Ligne / Services TR**

# **Aide à la prise en charge/PEC+**

## **Guide de tests de conformité**

logo: l'Assurance Maladie PEC+

<table>
    <tr>
      <td><i>Version</i></td>
      <td><mark>2.13.07</mark></td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td><mark>27/02/2026</mark></td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td><i>SEL-GCONFORM-PEC+</i></td>
    </tr>
</table>

<table>
    <tr>
      <td><mark>27/02/2026</mark></td>
      <td>Package CNDA PEC+</td>
      <td>1/5</td>
    </tr>
</table>

*SEL-GCONFORM-PEC* Version : 02.13.07

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
      <td>16/16/2015</td>
      <td>2.12.00</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>26/06/2015</td>
      <td>2.12.01</td>
      <td>Mise à jour guide de tests.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>01/03/2016</td>
      <td>2.12.02</td>
      <td>Maintenance : Actualisation des dates présentes dans les <br />tests</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/12/2016</td>
      <td>2.13.00</td>
      <td>Ajout des tests suite à l’avenant TPG</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>30/05/2017</td>
      <td>2.13.01</td>
      <td>Maintenance : mise à jour des dates de tests.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>16/08/2018</td>
      <td>2.13.02</td>
      <td>Mise à jour guide de tests.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>17/03/2021</td>
      <td>2.13.03</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/04/2023</td>
      <td>2.13.04</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>19/07/2024</td>
      <td>2.13.05</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>11/02/2025</td>
      <td>2.13.06</td>
      <td>Maintenance</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>27/02/2026</mark></td>
      <td><mark>2.13.07</mark></td>
      <td><mark>Maintenance</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

27/02/2026 Package CNDA PEC+ 2/5

*SEL-GCONFORM-PEC* Version : 02.13.07

<table>
  <caption><b>**TABLE DES MATIERES**</b></caption>
    <tr>
      <td><b>1</b></td>
      <td><b>INTRODUCTION ....................................................................................................................................4</b></td>
    </tr>
    <tr>
      <td></td>
      <td>1.1 PROCEDURE.........................................................................................................................................4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.2 PRE REQUIS..........................................................................................................................................4</td>
    </tr>
    <tr>
      <td></td>
      <td>1.3 IDENTIFICATION EDITEUR ................................................................. <b>ERREUR ! SIGNET NON DEFINI.</b></td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>CONTENU DE LA LIVRAISON............................................................................................................5</b></td>
    </tr>
    <tr>
      <td><b>3</b></td>
      <td><b>ANNEXE ........................................................................................... ERREUR ! SIGNET NON DEFINI.</b></td>
    </tr>
</table>

27/02/2026 Package CNDA PEC+ 3/5

*SEL-GCONFORM-PEC*
Version : 02.13.07

# **1 Introduction**

## **1.1 Procédure**

Ce document vise à vérifier la correcte intégration au logiciel partenaire de santé du service permettant aux transporteurs sanitaires et taxis conventionnés, de consulter le taux de prise en charge par l’Assurance Maladie obligatoire d’une prestation de transport pour une date donnée.

Dans l’optique de cette vérification :

- Une première phase consistera à l’examen par le CNDA des résultats des différents cas de tests du présent guide transmis par l’éditeur intégrant le service.

Les résultats doivent être déposés au format électronique dans votre espace personnel (https://sicnda.ameli.fr/).

<u>Format des résultats attendus :</u>

*   Un document .pdf ou .doc comprenant vos réponses aux tests : textes et copies d’écran.
*   Un dossier nommé « XML » contenant les traces de vos tests nommées avec le format suivant :
    *   Test_*numéroDuTest*_(cas_*numéroDuCas*_)REQUETE.xml
    *   Test_*numéroDuTest*_(cas_*numéroDuCas*_)REPONSE.xml

- Une seconde phase consistera à l’envoi du logiciel accompagné d’un guide d’installation et d’utilisation afin que les tests de ce guide puissent être déroulés par le CNDA (présence facultative de l’éditeur). A cette fin et dans un but de vérification, la version du logiciel transmise doit permettre l’accès aux traces xml des requêtes émises et des réponses reçues.

## **1.2 Pré requis**

Utilisation d’un numéro d’autorisation provisoire de test propre à chaque logiciel. Ce numéro vous sera fourni par le CNDA à la signature de la convention d’autorisation d’accès au téléservice intégré.

Pour les logiciels ayant obtenu un numéro d’autorisation dans le cadre de la demande de conformité pour un autre téléservice intégré, ce numéro doit être réutilisé dans les requêtes PEC+.

Utilisation du type d’autorisation « 4 » (Numéro d’autorisation) à renseigner dans l’entête de la requête.

27/02/2026
Package CNDA PEC+
4/5

| *SEL-GCONFORM-PEC* | | Version : 02.13.07 |
| :--- | :---: | :--- |

## **2 Contenu de la livraison**

<table>
  <thead>
    <tr>
      <th><strong><b>Référence Document</b></strong></th>
      <th><strong>Version diffusée</strong></th>
      <th><strong>Mise à jour / Nouveauté</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><mark>SEL-PEC-Ident.différentiel Tests</mark></td>
      <td><mark>02.13.07</mark></td>
      <td><mark><strong>Mise à jour</strong></mark></td>
    </tr>
    <tr>
      <td><mark>SEL-GCONFORM_PEC+_CI</mark></td>
      <td><mark>02.13.07</mark></td>
      <td><mark><strong>Mise à jour</strong></mark></td>
    </tr>
  </tbody>
</table>

| 27/02/2026 | Package CNDA PEC+ | <page_number>5/5</page_number> |
| :--------- | :---------------: | :--------------------------------- |
| :--- | :---: | :--- |