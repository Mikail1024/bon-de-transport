**Titre du document**
**Sous-titre**

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

photo: abstract shapes containing office imagery

# **Dossier des**
# **Spécifications**
# **Fonctionnelles et**
# **Techniques**

## Données en libre accès de l’Annuaire Santé

*Statut : En cours   |   Classification : Restreinte   |  Version : v0.1*

Agence du Numérique en Santé
2-10 rue d’Oradour-sur-Glane – 75015 Paris
esante.gouv.fr

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

---

## **<u>Documents de référence</u>**

▶ Document « Modèle des objets de santé (MOS) – Disponible sur le site esante.gouv.fr, rubrique MOS (https://mos.esante.gouv.fr/)
▶ Nomenclatures des objets de santé (NOS) – Disponibles sur le site esante.gouv.fr, rubrique NOS (https://esante.gouv.fr/interoperabilite/mos-nos/nos)
▶ Volet transport synchrone pour client lourd, couche « transport » du Cadre d’Interopérabilité des Systèmes d’Information de Santé (CI-SIS) - Disponible sur le site esante.gouv.fr, rubrique CI-SIS

## **<u>Historique du document</u>**

<table>
  <thead>
    <tr>
      <th>Version</th>
      <th colspan="2"><b>Rédigé par</b></th>
      <th colspan="2"><b>Vérifié par</b></th>
      <th colspan="2"><b>Validé par</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2">1.0</td>
      <td>ANS</td>
      <td>28/08/2017</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td colspan="6">Création du document – Version initiale pour diffusion</td>
    </tr>
    <tr>
      <td rowspan="2">2.0</td>
      <td>ANS</td>
      <td>18/07/2018</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td colspan="6">Mise à jour du document suite à la publication de nouvelles extractions de données en libre accès</td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>ANS</td>
      <td>25/10/2018</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Ajout d’une mention concernant l’ajout de colonnes dans les fichiers d’extraction<br />Dans la présentation détaillée des extractions, ajout d’explications sur les structures affichées et sur le libellé mode d’exercice<br />Ajout d’une FAQ<br />Ajout de précisions sur l’ouverture des fichiers d’extraction dans Microsoft Excel</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>ANS</td>
      <td>15/02/2019</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Ajout des colonnes « secteur d’activité » et « section tableau pharmaciens » dans le fichier « PS_LibreAcces_Personne_activite</td>
    </tr>
    <tr>
      <td>2.2.1</td>
      <td>ANS</td>
      <td>12/11/2019</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Correction de l’URL page 3 concernant la charte d’utilisation des données contenues dans le RPPS</td>
    </tr>
    <tr>
      <td>2.2.2</td>
      <td>ANS</td>
      <td>05/05/2020</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Modifications sur la partie 3.2 liées à l’intégration dans l’Annuaire Santé des pyschologues, psychothérapeutes, ostéopathes, assistants de service social et chiropracteurs.</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>ANS</td>
      <td>07/09/2021</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Mise en forme du DSFT sous le template ANS</td>
    </tr>
    <tr>
      <td>2.3.1</td>
      <td>ANS</td>
      <td>18/10/2021</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Ajout de nouvelles TRE pour les professions.</td>
    </tr>
    <tr>
      <td>2.4</td>
      <td>ANS</td>
      <td>13/06/2022</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Ajout du « Genre d’activité » et du « Rôle » dans l’extraction <i>PS_LibreAcces_Personne_activite</i><br />Ajout des jeux de valeurs JDV</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 1/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
    <tr>
      <td>3</td>
      <td>ANS</td>
      <td>07/08/2025</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Nombreuses modifications concernant des changements d’offre de l’ANS et de processus (suppression d’ADELI, ouverture du RPPS+, extraction V300, nouveau portail Annuaire Santé, arrêté RPPS de 2022…)</td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>ANS</td>
      <td>07/11/2025</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td colspan="6">Modification des liens de téléchargement des extractions v300 publiques, disponibles maintenant sur data.gouv</td>
    </tr>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 2/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: ANS - AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

---

<table>
    <caption>**SOMMAIRE**</caption>
        <tr>
            <td>1.</td>
            <td><strong>Présentation du service Annuaire Santé</strong></td>
            <td>..................................................................................................................................................</td>
            <td>4</td>
        </tr>
        <tr>
            <td>2.</td>
            <td><strong>Conditions d’usage des données</strong></td>
            <td>...........................................................................................................................................</td>
            <td>4</td>
        </tr>
        <tr>
            <td>3.</td>
            <td><strong>Contenu métier des extractions</strong></td>
            <td>..............................................................................................................................................</td>
            <td>5</td>
        </tr>
        <tr>
            <td>3.1.</td>
            <td><strong>Catégories de données présentes sur l’Annuaire Santé</strong></td>
            <td>...................................................................................................</td>
            <td>5</td>
        </tr>
        <tr>
            <td><i>3.1.1.</i></td>
            <td><i>Données concernant les professionnels</i></td>
            <td>.............................................................................................................................</td>
            <td><i>5</i></td>
        </tr>
        <tr>
            <td><i>3.1.2.</i></td>
            <td><i>Données concernant les cartes CPS et CPF</i></td>
            <td>......................................................................................................................</td>
            <td><i>6</i></td>
        </tr>
        <tr>
            <td><i>3.1.3.</i></td>
            <td><i>Données concernant les adresses de messagerie MSSanté</i></td>
            <td>.............................................................................................</td>
            <td><i>6</i></td>
        </tr>
        <tr>
            <td>3.2.</td>
            <td><strong>Sources des informations</strong></td>
            <td>....................................................................................................................................................</td>
            <td>6</td>
        </tr>
        <tr>
            <td>4.</td>
            <td><strong>Présentation générale des extractions et des modalités d’accès</strong></td>
            <td>.......................................................................................</td>
            <td>7</td>
        </tr>
        <tr>
            <td>4.1.</td>
            <td><strong>Présentation générale des extractions</strong></td>
            <td>...............................................................................................................................</td>
            <td>7</td>
        </tr>
        <tr>
            <td><i>4.1.1.</i></td>
            <td><i>Présentation générale des extractions de professionnels autorisés à exercer</i></td>
            <td>...................................................................</td>
            <td><i>7</i></td>
        </tr>
        <tr>
            <td><i>4.1.2.</i></td>
            <td><i>Présentation générale de l’extraction des cartes CPS ou CPF</i></td>
            <td>..........................................................................................</td>
            <td><i>7</i></td>
        </tr>
        <tr>
            <td><i>4.1.3.</i></td>
            <td><i>Présentation générale de l’extraction des BAL MSSanté</i></td>
            <td>...................................................................................................</td>
            <td><i>7</i></td>
        </tr>
        <tr>
            <td>4.2.</td>
            <td><strong>Modalités d’accès</strong></td>
            <td>..................................................................................................................................................................</td>
            <td>8</td>
        </tr>
        <tr>
            <td>5.</td>
            <td><strong>Présentation détaillée des extractions</strong></td>
            <td>...................................................................................................................................</td>
            <td>9</td>
        </tr>
        <tr>
            <td>5.1.</td>
            <td><strong>Présentation détaillée de l’extraction des professionnels autorisés à exercer</strong></td>
            <td>..............................................................</td>
            <td>9</td>
        </tr>
        <tr>
            <td><i>5.1.1.</i></td>
            <td><i>Règles de format applicables à l’extraction des professionnels autorisés à exercer</i></td>
            <td>..........................................................</td>
            <td><i>9</i></td>
        </tr>
        <tr>
            <td><i>5.1.2.</i></td>
            <td><i>Détail du contenu du fichier « PS_LibreAcces_Personne_activite »</i></td>
            <td>................................................................................</td>
            <td><i>11</i></td>
        </tr>
        <tr>
            <td><i>5.1.3.</i></td>
            <td><i>Détail du contenu du fichier «PS_LibreAcces_Dipl_AutExerc»</i></td>
            <td>........................................................................................</td>
            <td><i>17</i></td>
        </tr>
        <tr>
            <td><i>5.1.4.</i></td>
            <td><i>Détail du contenu du fichier « «PS_LibreAcces_SavoirFaire»</i></td>
            <td>.........................................................................................</td>
            <td><i>19</i></td>
        </tr>
        <tr>
            <td>5.2.</td>
            <td><strong>Présentation détaillée de l’extraction des cartes CPS ou CPF</strong></td>
            <td>.......................................................................................</td>
            <td>22</td>
        </tr>
        <tr>
            <td><i>5.2.1.</i></td>
            <td><i>Règles de format applicables à l’extraction des cartes CPS ou CPF</i></td>
            <td>...............................................................................</td>
            <td><i>22</i></td>
        </tr>
        <tr>
            <td><i>5.2.2.</i></td>
            <td><i>Détail du contenu de l’extraction des cartes CPS ou CPF</i></td>
            <td>................................................................................................</td>
            <td><i>22</i></td>
        </tr>
        <tr>
            <td>5.3.</td>
            <td><strong>Présentation détaillée de l’extraction des BAL MSSanté</strong></td>
            <td>................................................................................................</td>
            <td>24</td>
        </tr>
        <tr>
            <td><i>5.3.1.</i></td>
            <td><i>Règles de format applicables à l’extraction des BAL MSSanté</i></td>
            <td>.........................................................................................</td>
            <td><i>24</i></td>
        </tr>
        <tr>
            <td>6.</td>
            <td><strong>FAQ</strong></td>
            <td>..........................................................................................................................................................................................</td>
            <td>29</td>
        </tr>
        <tr>
            <td>7.</td>
            <td><strong>Aide à l’usage des fichiers d’extraction avec Microsoft Excel</strong></td>
            <td>..........................................................................................</td>
            <td>32</td>
        </tr>
        <tr>
            <td>7.1.</td>
            <td><strong>Fichiers d’extraction « PS_LibreAcces_Dipl_AutExerc », « PS_LibreAcces_SavoirFaire », « Porteurs_CPS_CPF » et « Correspondance_MSSante »</strong></td>
            <td>..........................................................................................................................................................................................</td>
            <td>32</td>
        </tr>
        <tr>
            <td>7.2.</td>
            <td><strong>Fichier d’extraction « PS_LibreAcces_Personne_activite »</strong></td>
            <td>............................................................................................</td>
            <td>34</td>
        </tr>
        <tr>
            <td><i>7.2.1.</i></td>
            <td><i>Filtrer une donnée</i></td>
            <td>............................................................................................................................................................</td>
            <td><i>34</i></td>
        </tr>
        <tr>
            <td><i>7.2.2.</i></td>
            <td><i>Supprimer une donnée inutile</i></td>
            <td>..........................................................................................................................................</td>
            <td><i>35</i></td>
        </tr>
        <tr>
            <td><i>7.2.3.</i></td>
            <td><i>Regrouper des données de plusieurs excels différents</i></td>
            <td>....................................................................................................</td>
            <td><i>36</i></td>
        </tr>
        <tr>
            <td><i>7.2.4.</i></td>
            <td><i>Appliquer des formules dans la partie transformation</i></td>
            <td>.......................................................................................................</td>
            <td><i>38</i></td>
        </tr>
        <tr>
            <td><i>7.2.5.</i></td>
            <td><i>Terminer la transformation et charger les données</i></td>
            <td>..........................................................................................................</td>
            <td><i>39</i></td>
        </tr>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 3/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

## **1. PRESENTATION DU SERVICE ANNUAIRE SANTE**

Le service Annuaire Santé regroupe l’ensemble des services de publication :

- des données des professionnels intervenant dans le système de santé enregistrés dans le RPPS (identités, professions et spécialités, lieux d’exercice…) ;
- des données des structures morales enregistrées au FINESS (numéro, adresse postale, coordonnées, secteur d’activité…) ;
- des données des structures morales SIRET qui ont contractualisé avec l’ANS ou des structures où les professionnels exercent dans le RPPS ;
- des données des cabinets libéraux où exercent les professionnels identifiés par un numéro technique appelé RRPS-rang
- des informations sur les cartes de la famille CPS ou CPF attribuées aux professionnels éligibles ;
- des données de correspondance électronique MSSanté.

L’accès aux données des professionnels enregistrés dans le RPPS répond aux règles définies dans [l’arrêté du 23 septembre 2022 relatif à la mise en œuvre du « Répertoire partagé des professionnels intervenant dans le système](https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000046349842) [de santé » (RPPS).](https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000046349842)</u>

Parmi ces données, certaines sont disponibles en libre accès comme définis dans l’arrêté mentionné précédemment.

L’objet du présent document est de décrire le contenu, le formalisme et les modalités d’accès de ces données dites « en libre accès » sous la forme de fichiers d’extraction disponible en téléchargement sur le service Annuaire Santé.

## **2. CONDITIONS D’USAGE DES DONNEES**

Les conditions d’utilisation des données publiées par le service Annuaire Santé et les responsabilités afférentes aux utilisateurs sont décrites dans des [conditions générales d’utilisation](https://annuaire.esante.gouv.fr/cgu). Les utilisateurs sont « responsables de traitement » au sens de la loi Informatique et Libertés à l’égard des données transmises. Chacun est responsable pénalement de toute utilisation frauduleuse qui pourrait être commise à l’égard des données ainsi transmises.

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 4/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé
# **DSFT des données en libre accès de l’Annuaire Santé**

## **3. CONTENU METIER DES EXTRACTIONS**

### **3.1. Catégories de données présentes sur l’Annuaire Santé**

Les données présentes dans l’Annuaire sont regroupées en catégories de données, respectant le Modèle des Objets de Santé (MOS) – cf. document de référence [0]. La documentation du MOS porte la définition métier des données.

#### **3.1.1. Données concernant les professionnels**

Le modèle interne de l’Annuaire Santé peut être représenté ainsi :

```mermaid
classDiagram
    direction BT
    
    class PersonnePhysique {
        <<Person>>
    }
    style PersonnePhysique fill:#FF99CC
    
    class Professionnel {
        <<Practitioner>>
    }
    style Professionnel fill:#FFBF00
    
    class Diplôme
    style Diplôme fill:#FFBF00
    
    class SavoirFaire
    style SavoirFaire fill:#FFBF00
    
    class ReferencementAE
    style ReferencementAE fill:#FFBF00
    
    class ExerciceProfessionnel {
        <<PractitionerRole>>
    }
    style ExerciceProfessionnel fill:#FFBF00
    
    class SituationExercice {
        <<PractitionerRole>>
    }
    style SituationExercice fill:#FFE5CC
    
    class EntiteJuridique {
        <<Organization>>
    }
    style EntiteJuridique fill:#B4C7E7
    
    class EntiteGeographique {
        <<Organization>>
    }
    style EntiteGeographique fill:#B4C7E7
    
    class EquipementMaterielLourd {
        <<Device>>
    }
    style EquipementMaterielLourd fill:#D9D9D9
    
    class DisciplineSocialeAutorisee {
        <<HealthcareService>>
    }
    style DisciplineSocialeAutorisee fill:#C5E0B4
    
    class ActiviteSanitaireAutorisee {
        <<HealthcareService>>
    }
    style ActiviteSanitaireAutorisee fill:#C5E0B4
    
    class ImplantationActiviteSanitaireAutorisee {
        <<HealthcareService>>
    }
    style ImplantationActiviteSanitaireAutorisee fill:#C5E0B4

    Professionnel --|> PersonnePhysique
    Diplôme "0..*" -- "1" Professionnel
    Professionnel "1" -- "0..*" ExerciceProfessionnel
    SavoirFaire "0..*" -- "1" ExerciceProfessionnel
    ReferencementAE "0..*" -- "1" ExerciceProfessionnel
    ExerciceProfessionnel "0..*" -- SituationExercice
    SituationExercice "0..*" -- "0..1" EntiteGeographique
    EntiteJuridique "1" -- "1..*" EntiteGeographique
    EntiteGeographique "1" -- "0..*" DisciplineSocialeAutorisee
    EntiteGeographique "1" -- "0..*" ActiviteSanitaireAutorisee
    EntiteGeographique "1" -- "0..*" ImplantationActiviteSanitaireAutorisee
    EntiteGeographique "1" -- "0..*" EquipementMaterielLourd
    ActiviteSanitaireAutorisee "1" -- "0..*" ImplantationActiviteSanitaireAutorisee
```

| **Ressources FHIR** |
| :--- |
| <span style="background-color:#FF99CC; padding:2px 10px; display:block; border:1px solid gray; text-align:center">Person</span> |
| <span style="background-color:#FFBF00; padding:2px 10px; display:block; border:1px solid gray; text-align:center">Practitioner</span> |
| <span style="background-color:#FFE5CC; padding:2px 10px; display:block; border:1px solid gray; text-align:center">PractitionerRole</span> |
| <span style="background-color:#B4C7E7; padding:2px 10px; display:block; border:1px solid gray; text-align:center">Organization</span> |
| <span style="background-color:#C5E0B4; padding:2px 10px; display:block; border:1px solid gray; text-align:center">HealthcareService</span> |
| <span style="background-color:#D9D9D9; padding:2px 10px; display:block; border:1px solid gray; text-align:center">Device</span> |

On peut considérer ces informations comme de deux natures :

- L’identité professionnelle : qui est le professionnel ? Quel est son champ de compétences ? (Cela correspond aux ressources « Person » et « Practitioner »)
- L’activité professionnelle : où travaille-t-il ? Selon quelles modalités (libéral/salarié) ? (Cela correspond aux ressources « PractitionerRole », « Organization », « HealthcareService » et « Device »).

Plus en détail, on peut distinguer 5 principaux groupes d’informations :

- Identité du professionnel
    - Identifiant national
    - Civilité
    - Nom et prénom d’exercice
- Diplômes et titres requis pour l’entrée dans une profession
- Appartenance à une profession ou spécialité : ce que le professionnel est autorisé à faire
- Situation d’exercice : lien entre le professionnel et la structure où il exerce
    - Mode d’exercice (libéral, salarié, bénévole…)

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 5/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

---

- Structure d’exercice
    o Tableau pharmacien
    o Identifiant de la structure
    o Dénomination
    o Secteur d’activité

## **3.1.2. Données concernant les cartes CPS et CPF**

Les cartes « CPS » sont attribuées à tous les professionnels munis d’un RPPS autorisés à exercer et éligibles à en avoir une. Cette liste d’éligibilité peut se retrouver [ici](https://esante.gouv.fr/produits-services/cartes-de-professionnels-de-sante).

Les cartes « CPF » sont attribuées à certains étudiants enregistrés dans le RPPS par l’ordre de la profession dont ils relèvent (interne en médecine, en pharmacie ou en odontologie et les étudiants en maïeutique).

Les données concernant les cartes sont gérées par l’ANS en tant que responsable de l’IGC (Infrastructure de Gestion de Clés) du secteur santé ; à ce titre, l’ANS doit publier quotidiennement les cartes actives (non révoquées et non échues).

Chaque carte CPS est rattachée à un professionnel dans une profession (future profession pour les internes) : elle est donc en lien avec un identifiant national (RPPS) et avec un code profession.

## **3.1.3. Données concernant les adresses de messagerie MSSanté**

L’ANS, en tant que régulateur de l’espace national de confiance MSSanté, tient à jour l’annuaire national MSSanté, qui rassemble toutes les BAL (boîtes aux lettres) transmises par les opérateurs de l’espace de confiance.

L’opérateur transmet, pour chaque BAL du périmètre cité, un identifiant national de personne (RPPS) et/ou un identifiant de structure (FINESS pour les BAL rattachées à un établissement de santé).

Il existe plusieurs types de BAL :
- les BAL (boîtes aux lettres) « personnelles » des personnes physiques disposant d’un identifiant RPPS, dont l’usage est sous la responsabilité exclusive du porteur de l’adresse ;
- les BAL « organisationnelles » associées à un service ou à une équipe, rattachées à une personne morale responsable de l’accès et de l’usage de la BAL ;
- les BAL « applicatives » associées à un logiciel métier ou à une machine et utilisées à des fins d’envois ou de réception automatisés, rattachées à une personne morale responsable de l’accès et de l’usage de la BAL.

## **3.2. Sources des informations**

Les professionnels s’enregistrent au RPPS auprès de leurs autorités d’enregistrement dont ils relèvent . Ces autorités sont selon les professions les ordres professionnels, les ARS, les structures où exercent les professionnels ou service de santé des armées (pour les professionnels agents publics). Ils sont en charge de vérifier les données suivantes avant enregistrement au RPPS :
- l’identité professionnelle (nom, prénom, profession, spécialité…) ;
- la situation d’exercice (modalités d’exercice dans un lieu donné) ;
- le lieu d’exercice (cabinets par exemple).

Les informations sur les cartes CPS proviennent de l’ANS.

Les données de messagerie MSSanté proviennent des opérateurs de l’espace de confiance MSSanté.

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 6/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé


**DSFT des données en libre accès de l’Annuaire Santé**

# **4. PRESENTATION GENERALE DES EXTRACTIONS ET DES MODALITES D’ACCES**

## **4.1. Présentation générale des extractions**

Les extractions suivantes sont mises à disposition :

- extraction des professionnels autorisés à exercer ;
- extraction des personnes ayant une carte CPS ou CPF ;
- extraction des BAL (boîtes aux lettres) MSSanté ;

Toutes les extractions sont compressées dans un fichier zip.

Les extractions fournies sur le service Annuaire Santé sont des extractions « stock », c’est-à-dire qu’elles contiennent l’ensemble des données associées aux entités définies par le périmètre de l’extraction, au moment de la génération du fichier d’extraction. Autrement dit, il n’y a pas de fichiers d’extraction « différentiels ».

### **4.1.1. Présentation générale des extractions de professionnels autorisés à exercer**

Deux extractions communiquent des informations relatives aux professionnels autorisés à exercer :

- Une extraction des professionnels autorisés à exercer, intitulée « PS_Libre_Acces », dont la liste des données présentées est conforme à l’arrêté RPPS du 23 septembre 2022 et à la liste des données nécessaires à la constitution du Vecteur d’Identification et d’Habilitation Formelle (VIHF), qui comprend un fichier principal et deux fichiers annexes :

► un fichier intitulé « PS_LibreAcces_Personne_activite » comprenant des données relatives à l’identité, à l’exercice professionnel et à la structure dans laquelle exerce le professionnel ;

► un fichier intitulé « PS_LibreAcces_Dipl_AutExerc » comprenant les données de diplôme et d’autorisation d’exercice des professionnels ;

► un fichier intitulé « PS_LibreAcces_SavoirFaire » comprenant les données de l’ensemble des savoir-faire des professionnels, dont les spécialités.

### **4.1.2. Présentation générale de l’extraction des cartes CPS ou CPF**

L’extraction intitulée « Porteurs_CPS_CPF » a pour objectif de remplacer les fichiers d’extraction de l’annuaire CPS.

Cette extraction apporte les informations relatives à la carte CPS ou CPF et à l’identité de son porteur.

L’extraction comprend l’ensemble des cartes CPS et CPF valides à date.

Les données présentes dans ce fichier sont issues uniquement du système d’information des cartes CPS.

### **4.1.3. Présentation générale de l’extraction des BAL MSSanté**

Cette extraction, intitulée « Correspondance_MSSante », permet d’accéder :

- aux BAL (boîtes aux lettres) « personnelles » des personnes physiques disposant d’un identifiant RPPS ;

- aux BAL « organisationnelles » rattachées à une personne morale, responsable de l’accès et de l’usage de la BAL.

L’opérateur transmet, pour chaque BAL du périmètre cité, un identifiant national de personne (RPPS) et/ou un identifiant de structure.

Les données descriptives complémentaires (nom, prénom, profession pour une personne, raison sociale et adresse pour une structure) sont celles du RPPS ou de FINESS en lien avec les identifiants attachés à la BAL.

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 7/40


Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

L’extraction en libre accès n’inclut pas les BAL applicatives.

## **4.2. Modalités d’accès**

Le service Annuaire Santé est certifié par un certificat de type personne morale SERVEUR émis par l’IGC Santé.

Pour permettre l’authentification mutuelle, il est nécessaire d’installer les Autorités de certification Racine de l’IGC Santé, disponibles sous [http://igc-sante.esante.gouv.fr/PC/#ca](http://igc-sante.esante.gouv.fr/PC/#ca)

Les accès suivants permettent de récupérer en ligne de commande ou sur un navigateur internet le fichier extrait, par simple appel d’URL.

- Extraction des professionnels autorisés à exercer : [https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/PS_LibreAcces](https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/PS_LibreAcces)
- Extraction des cartes CPS ou CPF : [https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/Porteurs_CPS_CPF](https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/Porteurs_CPS_CPF)
- Extraction des BAL MSSanté : [https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/Extraction_Correspondance_MSSante](https://service.annuaire.sante.fr/annuaire-sante-webservices/V300/services/extraction/Extraction_Correspondance_MSSante)

Les extractions v300 des données publiques sont également disponibles directement sur data.gouv :
[https://www.data.gouv.fr/organizations/agence-du-numerique-en-sante/datasets](https://www.data.gouv.fr/organizations/agence-du-numerique-en-sante/datasets)

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 8/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

## **5. PRESENTATION DETAILLEE DES EXTRACTIONS**

Sont décrites dans cette partie les spécificités de format et de contenu de chaque fichier : catégorie de données présentes, champs présents et valeurs possibles.

Les valeurs contenues dans les champs peuvent être libres ou codées. Dans ce dernier cas, elles sont alors issues des terminologies de référence (TRE) des Nomenclatures des Objets de Santé (NOS). Chaque TRE est référencée par son nom (CodesystemName) et par son OID<sup>1</sup> (CodeSystem).

**NB : L’ANS se réserve la possibilité d’ajouter des attributs supplémentaires dans les fichiers d’extraction, à **la suite des colonnes existantes et sans modification de ces dernières. Les utilisateurs doivent donc veiller** à ce que les traitements qu’ils effectuent sur les fichiers tolèrent ces éventuels ajouts.**

### **5.1. Présentation détaillée de l’extraction des professionnels autorisés à exercer**

#### **5.1.1. Règles de format applicables à l’extraction des professionnels autorisés à exercer**

<table>
  <thead>
    <tr>
      <th><b>Fichier</b> <b>concerné</b></th>
      <th><b>Nature</b></th>
      <th><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="2"><b><b>Tous</b></b></td>
      <td>Périmètre des données extraites</td>
      <td>Le périmètre d'extraction est limité aux personnes autorisées à exercer.<br /><br />Une personne est autorisée à exercer si et seulement si :<br />► La personne est vivante (pas de date de décès renseignée) ;<br />► Si le professionnel fait partie des professions à obligation d’enregistrement (profession enregistrée par un Ordre, une ARS ou le Service de Santé des Armées), elle est munie d’un numéro RPPS ;<br />► Elle a au moins un exercice professionnel dans un des cas suivants :<br />• Pour les étudiants, l’exercice professionnel doit être ouvert<sup>2</sup> et correspondre à un exercice de remplaçant ayant au moins une activité de remplaçant, d’interne ou de docteur junior<br />• Pour les agents publics (hors étudiant), l’exercice doit être ouvert<br />• Pour les pharmaciens, l’exercice professionnel doit être ouvert et être rattaché à une activité ouverte. Il doit être rattaché à un professionnel inscrit à l’ordre (non radié)<br />• Pour les professions à ordre, hors pharmaciens et étudiants, l’exercice professionnel doit être ouvert et rattaché à un professionnel inscrit à l’ordre (non radié)<br />• Pour les professions sans ordre, l’exercice professionnel doit être ouvert</td>
    </tr>
    <tr>
      <td>Format</td>
      <td>Les extractions sont générées au format UTF-8</td>
    </tr>
  </tbody>
</table>

<sup>1</sup> OID : Object Identifier
<sup>2</sup> Ouvert : pas de date de fin ou date de fin non échue et la date de début est échue

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 9/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th><b>Fichier</b> <b>concerné</b></th>
      <th><b>Nature</b></th>
      <th><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="4"></td>
      <td>Séparateur des données</td>
      <td>Le séparateur du fichier est "|"</td>
    </tr>
    <tr>
      <td>En-tête</td>
      <td>Chaque fichier possède une ligne d'en-tête</td>
    </tr>
    <tr>
      <td>Extension</td>
      <td>L'extension des fichiers est .txt</td>
    </tr>
    <tr>
      <td>Protection des champs</td>
      <td>Les champs ne sont pas protégés par des "</td>
    </tr>
    <tr>
      <td rowspan="4"><strong>PS_LibreAcces_ Personne_activ <b>ite</b></strong></td>
      <td>Nom du fichier</td>
      <td>PS_LibreAcces_Personne_activite_[Date]</td>
    </tr>
    <tr>
      <td>Périmètre des données des situations d’exercice extraites</td>
      <td>Ne sont extraites que les situations d’exercice ouvertes</td>
    </tr>
    <tr>
      <td>Structures affichées</td>
      <td>Ne sont extraites que les structures ouvertes<br /><br />Quand une structure n’est pas renseignée pour l’une des activités d’un professionnel, ce peut être parce que :<br /><br />► le professionnel, bien qu’inscrit à son ordre ou enregistré chez son ARS, est sans activité (retraite, congé sabbatique…), donc sans lieu d’exercice ;<br />► le professionnel est remplaçant exclusif, donc sans lieu d’exercice fixe.</td>
    </tr>
    <tr>
      <td>Savoir-faire affichés</td>
      <td>Ne sont extraits que les savoir-faire ouverts</td>
    </tr>
    <tr>
      <td rowspan="4"><strong>PS_LibreAcc <b>es_Dipl_AutE</b> <b>xerc</b></strong></td>
      <td>Nom du fichier</td>
      <td>Le fichier est nommé PS_LibreAcces_Dipl_AutExerc_[Date]</td>
    </tr>
    <tr>
      <td>Périmètre des données de diplômes extraites</td>
      <td>Ne sont extraits que :<br /><br />► les diplômes correspondant à des professionnels autorisés à exercer ;<br />► les autres diplômes correspondant à des professionnels autorisés à exercer;<br />► les autorisations ouvertes correspondant à des professionnels autorisés à exercer.</td>
    </tr>
    <tr>
      <td>Règle d’affichage lorsqu’une même personne possède un diplôme <u>et</u> une autorisation</td>
      <td>► Une ligne comportant un diplôme ne comporte pas d’autorisation ;<br />► Une ligne comportant une autorisation ne comporte pas de diplôme.</td>
    </tr>
    <tr>
      <td>Rattachement des données de diplôme aux données d’exercice</td>
      <td>Le diplôme est normalement attaché aux données d’état-civil d’une personne. Le rattachement au prénom et nom d’exercice de la personne est réalisé en prenant l’exercice ouvert le plus récent de la personne.</td>
    </tr>
    <tr>
      <td rowspan="2"><strong>PS_LibreAcc es_SavoirFai re</strong></td>
      <td>Nom du fichier</td>
      <td>Le fichier est nommé « PS_LibreAcces_SavoirFaire_[Date] »</td>
    </tr>
    <tr>
      <td>Périmètre des données de savoir-faire extraites</td>
      <td>Pour le fichier Savoir-Faire, ne sont extraites que les données d'exercice professionnel actives (date de fin non échue ou non présente ainsi que date de début échue) correspondant à des professionnels autorisés à exercer</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 10/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

## **5.1.2. Détail du contenu du fichier « PS_LibreAcces_Personne_activite »**

*L’ensemble des tables de valeurs citées ci-dessous (TRE, JDV) sont disponible sur le site [site MOS](https://mos.esante.gouv.fr/0.html)*

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th>Description</th>
      <th>CodeSystem</th>
      <th>CodesystemName</th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d'identifiant PP</td>
      <td colspan="3">Nomenclature<br /><b>CodesystemName</b> = TRE_G08-TypeIdentifiantPersonne<br /><b>CodeSystem</b> = 1.2.250.1.71.1.2.15<br /><b>CodesystemName</b> = JDV_J77-TypeIdentifiantPersonne-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.145</td>
      <td rowspan="3">Professionnel</td>
    </tr>
    <tr>
      <td>Identifiant PP</td>
      <td colspan="3">Identifiant RPPS</td>
    </tr>
    <tr>
      <td>Identification nationale PP</td>
      <td colspan="3">Concaténation du type d’identifiant et de l’identifiant national</td>
    </tr>
    <tr>
      <td>Code civilité d’exercice</td>
      <td colspan="3" rowspan="2">Nomenclature<br /><b>CodesystemName</b> = TRE_R11-CiviliteExercice<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.11<br /><b>CodesystemName</b> = JDV_J79-CiviliteExercice-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.147</td>
      <td rowspan="2">Exercice professionnel</td>
    </tr>
    <tr>
      <td>Libellé civilité exercice</td>
    </tr>
    <tr>
      <td>Code civilité</td>
      <td colspan="3" rowspan="2">Nomenclature<br /><b>CodesystemName</b> = TRE_R81-Civilite<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.69<br /><b>CodesystemName</b> = JDV_J78-Civilite-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.146</td>
      <td rowspan="2">Personne physique</td>
    </tr>
    <tr>
      <td>Libellé civilité</td>
    </tr>
    <tr>
      <td>Nom d'exercice</td>
      <td colspan="3">Alphanumérique (60)</td>
      <td rowspan="10">Exercice professionnel</td>
    </tr>
    <tr>
      <td>Prénom d'exercice</td>
      <td colspan="3">Alphanumérique (60)</td>
    </tr>
    <tr>
      <td rowspan="5">Code profession</td>
      <td>Description</td>
      <td>CodeSystem</td>
      <td>CodesystemName</td>
    </tr>
    <tr>
      <td><b><b>Professions de</b> Santé</b></td>
      <td>1.2.250.1.71.1.2.7</td>
      <td>TRE_G15-ProfessionSante</td>
    </tr>
    <tr>
      <td><b><b>Professions du</b> <b>Social</b></b></td>
      <td>1.2.250.1.213.1.6.1.4</td>
      <td>TRE_R94-ProfessionSocial</td>
    </tr>
    <tr>
      <td><b><b>Usagers de titre</b></b></td>
      <td>1.2.250.1.213.1.6.1.109</td>
      <td>TRE_R95-UsagerTitre</td>
    </tr>
    <tr>
      <td><b><b>Autres</b> <b>professions</b></b></td>
      <td>1.2.250.1.213.1.6.1.140</td>
      <td>TRE_R291-AutreProfession</td>
    </tr>
    <tr>
      <td rowspan="2">Libellé profession</td>
      <td colspan="3"><b>CodesystemName</b> = JDV_J106-EnsembleProfession-RASS</td>
    </tr>
    <tr>
      <td colspan="3"><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.174</td>
    </tr>
    <tr>
      <td>Code catégorie professionnelle</td>
      <td colspan="3">Nomenclature</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 11/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th colspan="3">Description</th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Libellé catégorie professionnelle</td>
      <td colspan="3"><strong>CodesystemName</strong> = TRE_R09-CategorieProfessionnelle<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.10<br /><strong>CodesystemName</strong> = JDV_J89-CategorieProfessionnelle-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.157</td>
      <td></td>
    </tr>
    <tr>
      <td>Code type savoir-faire</td>
      <td colspan="3">Nomenclature<br /><strong>CodesystemName</strong> = TRE_R04-TypeSavoirFaire<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.16</td>
      <td rowspan="9">Savoir-Faire</td>
    </tr>
    <tr>
      <td>Libellé type savoir-faire</td>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J91-TypeSavoirFaire-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.159<br />Seuls sont extraits les savoir-faire de type S, CEX, PAC</td>
    </tr>
    <tr>
      <td>Code savoir-faire</td>
      <td colspan="3">La Nomenclature applicable est fonction du type de savoir faire</td>
    </tr>
    <tr>
      <td rowspan="6">Libellé savoir-faire</td>
      <td><strong>Description</strong></td>
      <td><strong>CodeSystem</strong></td>
      <td><strong>CodesystemName</strong></td>
    </tr>
    <tr>
      <td><strong><b>Spécialité</b> <b>ordinale</b></strong></td>
      <td>1.2.250.1.213.2.28</td>
      <td>TRE_R38-SpecialiteOrdinale</td>
    </tr>
    <tr>
      <td><strong><b>Compétence</b> <b>exclusive</b></strong></td>
      <td>1.2.250.1.213.2.30</td>
      <td>TRE_R40-CompetenceExclusive</td>
    </tr>
    <tr>
      <td><strong><b>Qualification</b> <b>des praticiens</b> <b>adjoints</b> <b>contractuels</b> <b>(PAC)</b></strong></td>
      <td>1.2.250.1.213.2.34</td>
      <td>TRE_R44-QualificationPA</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J107-EnsembleSavoirFaire-RASS</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.175</td>
    </tr>
    <tr>
      <td>Code mode exercice</td>
      <td colspan="3">Nomenclature<br /><strong>CodesystemName</strong> = TRE_R23-ModeExercice<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.18</td>
      <td rowspan="2">Situation d’exercice</td>
    </tr>
    <tr>
      <td>Libellé mode exercice</td>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J95-ModeExercice-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.163<br />Le mode d’exercice n’est pas renseigné pour :<br />► Les professionnels qui, bien qu’inscrits par leur autorité d’enregistrement, sont sans activité ;</td>
    </tr>
    <tr>
      <td>Numéro SIRET site</td>
      <td colspan="3">Alphanumérique (14)</td>
      <td rowspan="3">Structure</td>
    </tr>
    <tr>
      <td>Numéro SIREN site</td>
      <td colspan="3">Alphanumérique (9)</td>
    </tr>
    <tr>
      <td>Numéro FINESS site</td>
      <td colspan="3">Alphanumérique (9)</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 12/40


Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Numéro FINESS établissement juridique</td>
      <td>Alphanumérique (9)</td>
      <td></td>
    </tr>
    <tr>
      <td>Identifiant technique de la structure</td>
      <td>Identifiant technique permettant d’identifier les structures de manière unique et pérenne</td>
      <td></td>
    </tr>
    <tr>
      <td>Raison sociale site</td>
      <td>Alphanumérique (164)</td>
      <td></td>
    </tr>
    <tr>
      <td>Enseigne commerciale site</td>
      <td>Alphanumérique (50)</td>
      <td></td>
    </tr>
    <tr>
      <td>Complément destinataire (coord. structure)</td>
      <td>Alphanumérique (38)</td>
      <td rowspan="16">Coordonnées structure</td>
    </tr>
    <tr>
      <td>Complément point géographique (coord. structure)</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>Numéro Voie (coord. structure)</td>
      <td>Alphanumérique (5)</td>
    </tr>
    <tr>
      <td>Indice répétition voie (coord. Structure)</td>
      <td>Alphanumérique (3)</td>
    </tr>
    <tr>
      <td>Code type de voie (coord. structure)</td>
      <td rowspan="2">Nomenclature<br /><b>CodesystemName</b> = TRE_R35-TypeVoie<br /><b>CodeSystem</b> = 1.2.250.1.213.2.44<br /><b>CodesystemName</b> = JDV_J103-TypeVoie-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.171</td>
    </tr>
    <tr>
      <td>Libellé type de voie (coord. structure)</td>
    </tr>
    <tr>
      <td>Libellé Voie (coord. structure)</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>Mention distribution (coord. structure)</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>Bureau cedex (coord. structure)</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>Code postal (coord. structure)</td>
      <td>Alphanumérique (5)</td>
    </tr>
    <tr>
      <td>Code commune (coord. structure)</td>
      <td rowspan="2">Nomenclature<br /><b>CodesystemName</b> = TRE_R13-CommuneOM<br /><b>CodeSystem</b> = 1.2.250.1.71.1.2.23<br /><b>CodesystemName</b> = JDV_J102-CommuneOM-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.170</td>
    </tr>
    <tr>
      <td>Libellé commune (coord. structure)</td>
    </tr>
    <tr>
      <td>Code pays (coord. structure)</td>
      <td rowspan="2">Nomenclature<br /><b>CodesystemName</b> = TRE_R20-Pays<br /><b>CodeSystem</b> = 1.2.250.1.71.1.2.24<br /><b>CodesystemName</b> = JDV_J74-Pays-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.142</td>
    </tr>
    <tr>
      <td>Libellé pays (coord. structure)</td>
    </tr>
    <tr>
      <td>Téléphone (coord. structure)</td>
      <td>Alphanumérique (15)</td>
    </tr>
    <tr>
      <td>Téléphone 2 (coord. structure)</td>
      <td>Alphanumérique (15)</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 13/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th><strong>Libellé</strong></th>
      <th><strong><b>Description</b></strong></th>
      <th><strong><b>Catégorie de</b> données</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Télécopie (coord. structure)</td>
      <td>Alphanumérique (15)</td>
      <td rowspan="5"></td>
    </tr>
    <tr>
      <td>Adresse e-mail (coord. structure)</td>
      <td>Alphanumérique (512)</td>
    </tr>
    <tr>
      <td>Code département (coord. structure)</td>
      <td rowspan="2">Champ actuellement non rempli</td>
    </tr>
    <tr>
      <td>Libellé département (coord. structure)</td>
    </tr>
    <tr>
      <td>Ancien identifiant de la structure</td>
      <td>Alphanumérique (15)<br /><br />Champ « technique » permettant de faire le lien avec d’autres extractions proposées par le service Annuaire Santé (extractions multi-table en accès restreint).<br /><br />Il est identique à l’identifiant national si la structure possède un tel identifiant. Dans le cas contraire, une clé technique est positionnée.</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 14/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Autorité d'enregistrement</td>
      <td>Ce champ permet de connaître les autorités d’enregistrement à l’origine des données présentes dans le fichier.<br /><br />Dans certains cas, il peut y avoir jusqu’à trois autorités d’enregistrement différentes selon la catégorie de la donnée :<br /><br />- professionnel, personne physique, exercice professionnel, savoir-faire : autorité d’enregistrement 1 ;<br />- situation d’exercice, structure : autorité d’enregistrement 2 ;<br />- coordonnées de la structure : autorité d’enregistrement 3.<br /><br />Dans ce champ, l’ordre de présentation des autorités d’enregistrement suivent le découpage suivant :<br /><br />Situation d’exercice, structure<br />XXXX / XXXX / XXXX<br />Professionnel, personne physique, exercice professionnel, savoir-faire | Coordonnées de la structure<br /><br />Ainsi, s’il est par exemple indiqué CNOM/ARS/ARS dans une cellule, cela signifie que :<br />- le CNOM a enregistré le numéro d’identification du professionnel, sa civilité, les données relatives à son exercice professionnel et à ses savoir-faire ;<br />- l’ARS est à l’origine des données de situation d’exercice et de l’enregistrement de l’identifiant de la structure d’exercice y étant rattachée ;<br />- l’ARS est à l’origine de l’enregistrement des coordonnées de la structure.<br /><br />Dans le cas où aucune autorité d’enregistrement n’est indiquée pour l’une des catégories de données, cela signifie que la donnée n’est pas alimentée dans l’annuaire<br /><br />Dans le cas où le terme « Variable » est renseigné, cela signifie que différentes autorités d’enregistrement peuvent être à l’origine de la donnée. Dans ce cas, il peut est nécessaire de contacter l’ANS pour connaître l’autorité qui a enregistré la donnée</td>
      <td></td>
    </tr>
    <tr>
      <td>Code secteur d’activité</td>
      <td>Nomenclature<br /><b>CodesystemName</b> = TRE_R02-SecteurActivite<br /><b>CodeSystem</b> = 1.2.250.1.71.4.2.4</td>
      <td rowspan="2">Structure</td>
    </tr>
    <tr>
      <td>Libellé secteur d’activité</td>
      <td><b>CodesystemName</b> = JDV_J101-SecteurActivite-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.169</td>
    </tr>
    <tr>
      <td>Code section tableau pharmaciens</td>
      <td>Nomenclatures</td>
      <td>Situation d’exercice</td>
    </tr>
  </tbody>
</table>

page 15/40
Statut : Validé | Classification : Non sensible - Public | Version v3.1

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: ANS AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Libellé section tableau pharmaciens</td>
      <td><strong>CodesystemName</strong> = TRE_R06-SectionTableauCNOP.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.213.2.37<br /><strong>CodesystemName</strong> = TRE_G05-SousSectionTableauCNOP.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.71.4.2.6<br /><strong>CodesystemName</strong> = JDV_J73-MetierPharmacien-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.141</td>
      <td rowspan="5">Situation d’exercice</td>
    </tr>
    <tr>
      <td>Code fonction</td>
      <td>Nomenclature</td>
    </tr>
    <tr>
      <td>Libellé fonction</td>
      <td><strong>CodesystemName</strong> = TRE_R21-Fonction.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.17<br /><strong>CodesystemName</strong> = TRE_R96-AutreFonctionSanitaire.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.110<br /><strong>CodesystemName</strong> = TRE_R85-RolePriseCharge.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.107<br /><strong>CodesystemName</strong> = JDV_J108-EnsembleFonction-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.176</td>
    </tr>
    <tr>
      <td>Code genre d’activité</td>
      <td>Nomenclature</td>
    </tr>
    <tr>
      <td>Libellé genre d’activité</td>
      <td><strong>CodesystemName</strong> = TRE_R22-GenreActivite.tabs<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.19<br /><strong>CodesystemName</strong> = JDV_J94-GenreActivite-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.162</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 16/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ
# **DSFT des données en libre accès de l’Annuaire Santé**

## **5.1.3. Détail du contenu du fichier «PS_LibreAcces_Dipl_AutExerc»**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d'identifiant PP</td>
      <td>Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_G08-TypeIdentifiantPersonne<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.15<br /><br /><strong>CodesystemName</strong> = JDV_J77-TypeIdentifiantPersonne-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.145</td>
      <td rowspan="3">Professionnel</td>
    </tr>
    <tr>
      <td>Identifiant PP</td>
      <td>Identifiant RPPS</td>
    </tr>
    <tr>
      <td>Identification nationale PP</td>
      <td>Concaténation du type d’identifiant et de l’identifiant national</td>
    </tr>
    <tr>
      <td>Nom d'exercice</td>
      <td>Alphanumérique (60)</td>
      <td rowspan="2">Exercice professionnel</td>
    </tr>
    <tr>
      <td>Prénom d'exercice</td>
      <td>Alphanumérique (60)</td>
    </tr>
    <tr>
      <td>Code type diplôme obtenu</td>
      <td rowspan="2">Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R14-TypeDiplome<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.36<br /><br /><strong>CodesystemName</strong> = JDV_J81-TypeDiplome-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.149</td>
      <td rowspan="3">Diplôme obtenu</td>
    </tr>
    <tr>
      <td>Libellé type diplôme obtenu</td>
    </tr>
    <tr>
      <td>Code diplôme obtenu</td>
      <td></td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 17/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th>Description</th>
      <th>CodeSystem</th>
      <th>CodesystemName</th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="17">Libellé diplôme obtenu</td>
      <td colspan="3">Nomenclature</td>
      <td rowspan="17"></td>
    </tr>
    <tr>
      <td><strong>Description</strong></td>
      <td><strong>CodeSystem</strong></td>
      <td><strong>CodesystemName</strong></td>
    </tr>
    <tr>
      <td><strong><b>Autre diplôme</b> obtenu</strong></td>
      <td>1.2.250.1.213.1.6.1.54</td>
      <td>TRE_R36-AutreDiplomeObtenu</td>
    </tr>
    <tr>
      <td><strong><b>Commission</b> de <b>qualification</b></strong></td>
      <td>1.2.250.1.213.1.6.1.30</td>
      <td>TRE_R47-CommissionQualification</td>
    </tr>
    <tr>
      <td><strong><b>Diplôme de</b> <b>l’Etat français</b></strong></td>
      <td>1.2.250.1.213.1.6.1.31</td>
      <td>TRE_R48-DiplomeEtatFrancais</td>
    </tr>
    <tr>
      <td><strong>Diplôme d’Etudes Spécialisées</strong></td>
      <td>1.2.250.1.213.1.6.1.32</td>
      <td>TRE_R49-DiplomeEtudeSpecialisee</td>
    </tr>
    <tr>
      <td><strong>DESC Groupe <b>1 (diplôme)</b></strong></td>
      <td>1.2.250.1.213.1.6.1.48</td>
      <td>TRE_R50-DESCGroupe1Diplome</td>
    </tr>
    <tr>
      <td><strong>DESC Groupe <b>2 (diplôme)</b></strong></td>
      <td>1.2.250.1.213.1.6.1.49</td>
      <td>TRE_R51-DESCGroupe2Diplome</td>
    </tr>
    <tr>
      <td><strong><b>Capacité</b> (diplôme)</strong></td>
      <td>1.2.250.1.213.1.6.1.50</td>
      <td>TRE_R52-CapaciteDiplome</td>
    </tr>
    <tr>
      <td><strong><b>Diplôme d’un</b> <b>pays de l’EEE</b></strong></td>
      <td>1.2.250.1.213.1.6.1.51</td>
      <td>TRE_R53-DiplomePaysEEE</td>
    </tr>
    <tr>
      <td><strong>Diplôme <b>d’Université</b> ou Inter-<b>Universitaire</b></strong></td>
      <td>1.2.250.1.213.1.6.1.34</td>
      <td>TRE_R54-DiplomeUniversiteInterUniversitaire</td>
    </tr>
    <tr>
      <td><strong><b>Certificat</b> <b>d’Etude</b> <b>Spéciale</b></strong></td>
      <td>1.2.250.1.213.1.6.1.52</td>
      <td>TRE_R55-CertificatEtudeSpeciale</td>
    </tr>
    <tr>
      <td><strong>Attestation</strong></td>
      <td>1.2.250.1.213.1.6.1.27</td>
      <td>TRE_R56-Attestation</td>
    </tr>
    <tr>
      <td><strong>Diplôme <b>Européen</b> d’Etudes Spécialisées</strong></td>
      <td>1.2.250.1.213.1.6.1.33</td>
      <td>TRE_R57-DiplomeEuropeenEtudeSpecialisee</td>
    </tr>
    <tr>
      <td><strong><b>Autre type de</b> diplôme</strong></td>
      <td>1.2.250.1.213.1.6.1.53</td>
      <td>TRE_R58-AutreTypeDiplome</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J105-EnsembleDiplome-RASS</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.173</td>
    </tr>
    <tr>
      <td>Code type autorisation</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 18/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th>Description</th>
      <th>Catégorie de données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Libellé type autorisation</td>
      <td>Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R17-TypeAutorisation<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.14<br /><br /><strong>CodesystemName</strong> = JDV_J75-TypeAutorisation-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.143</td>
      <td rowspan="3">Autorisation</td>
    </tr>
    <tr>
      <td>Code discipline autorisation</td>
      <td rowspan="2">Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R18-DisciplineAutorisation<br /><br /><strong>CodeSystem</strong> =1.2.250.1.213.1.6.1.67<br /><br /><strong>CodesystemName</strong> = JDV_J76-DisciplineAutorisation-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.144</td>
    </tr>
    <tr>
      <td>Libellé discipline autorisation</td>
    </tr>
  </tbody>
</table>

### **5.1.4. Détail du contenu du fichier « «PS_LibreAcces_SavoirFaire»**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th>Description</th>
      <th>Catégorie de données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d'identifiant PP</td>
      <td>Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_G08-TypeIdentifiantPersonne<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.15<br /><br /><strong>CodesystemName</strong> = JDV_J77-TypeIdentifiantPersonne-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.145</td>
      <td rowspan="3">Professionnel</td>
    </tr>
    <tr>
      <td>Identifiant PP</td>
      <td>Identifiant RPPS</td>
    </tr>
    <tr>
      <td>Identification nationale PP</td>
      <td>Concaténation du type d’identifiant et de l’identifiant national</td>
    </tr>
    <tr>
      <td>Nom d'exercice</td>
      <td>Alphanumérique (60)</td>
      <td rowspan="3">Exercice professionnel</td>
    </tr>
    <tr>
      <td>Prénom d'exercice</td>
      <td>Alphanumérique (60)</td>
    </tr>
    <tr>
      <td>Code Profession</td>
      <td></td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 19/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: ANS AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr><th>Libellé</th><th colspan="3">Description</th><th><b>Catégorie de</b> données</th></tr>
  </thead>
  <tbody>
    <tr><td rowspan="11">Libellé Profession</td><th>Description</th><th>CodeSystem</th><th>CodesystemName</th><td rowspan="11"></td></tr><tr><td><strong><b>Professions de</b> Santé</strong></td><td>1.2.250.1.71.1.2.7</td><td>TRE_G15-ProfessionSante</td></tr><tr><td><strong><b>Professions du</b> <b>Social</b></strong></td><td>1.2.250.1.213.1.6.1.4</td><td>TRE_R94-ProfessionSocial</td></tr><tr><td><strong><b>Usagers de titre</b></strong></td><td>1.2.250.1.213.1.6.1.109</td><td>TRE_R95-UsagerTitre</td></tr><tr><td><strong><b>Autres</b> <b>professions</b></strong></td><td>1.2.250.1.213.1.6.1.140</td><td>TRE_R291-AutreProfession</td></tr>
    <tr><td colspan="3"><strong>CodesystemName</strong> = JDV_J106-EnsembleProfession-RASS</td></tr>
    <tr><td colspan="3"><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.174</td></tr>
    <tr><td colspan="3"></td></tr>
    <tr><td colspan="3"></td></tr>
    <tr><td colspan="3"></td></tr>
    <tr><td colspan="3"></td></tr>
    <tr><td>Code catégorie professionnelle</td><td colspan="3">Nomenclature</td><td rowspan="4"></td></tr>
    <tr><td rowspan="3">Libellé catégorie professionnelle</td><td colspan="3"><strong>CodesystemName</strong> = TRE_R09-CategorieProfessionnelle</td></tr>
    <tr><td colspan="3"><strong>CodeSystem</strong> =1.2.250.1.213.1.6.1.10</td></tr>
    <tr><td colspan="3"><strong>CodesystemName</strong> = JDV_J89-CategorieProfessionnelle-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.157</td></tr>
    <tr><td>Code type savoir-faire</td><td colspan="3">Nomenclature</td><td rowspan="4">Savoir-Faire</td></tr>
    <tr><td rowspan="3">Libellé type savoir-faire</td><td colspan="3"><strong>CodesystemName</strong> = TRE_R04-TypeSavoirFaire</td></tr>
    <tr><td colspan="3"><strong>CodeSystem</strong> =1.2.250.1.213.1.6.1.16</td></tr>
    <tr><td colspan="3"><strong>CodesystemName</strong> = JDV_J91-TypeSavoirFaire-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.159</td></tr>
    <tr><td>Code savoir-faire</td><td colspan="3">La Nomenclature applicable est fonction du type de savoir-faire</td><td></td></tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 20/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th rowspan="2">Libellé</th>
      <th colspan="3">Description</th>
      <th rowspan="2"><b>Catégorie de</b> données</th>
    </tr>
    <tr>
      <th>Description</th>
      <th>CodeSystem</th>
      <th>CodesystemName</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="10">Libellé savoir-faire</td>
      <td><strong>Spécialité <b>ordinale</b></strong></td>
      <td>1.2.250.1.213.2.28</td>
      <td>TRE_R38-SpecialiteOrdinale</td>
      <td rowspan="10"></td>
    </tr>
    <tr>
      <td><strong>Compétence</strong></td>
      <td>1.2.250.1.213.2.29</td>
      <td>TRE_R39-Competence</td>
    </tr>
    <tr>
      <td><strong>Compétence <b>exclusive</b></strong></td>
      <td>1.2.250.1.213.2.30</td>
      <td>TRE_R40-CompetenceExclusive</td>
    </tr>
    <tr>
      <td><strong><b>Orientation</b> <b>particulière</b></strong></td>
      <td>1.2.250.1.213.2.31</td>
      <td>TRE_G13-OrientationParticuliere</td>
    </tr>
    <tr>
      <td><strong><b>DESC non</b> <b>qualifiant</b></strong></td>
      <td>1.2.250.1.213.2.32</td>
      <td>TRE_R42-DESCnonQualifiant</td>
    </tr>
    <tr>
      <td><strong><b>Capacité</b> <b>(savoir-faire)</b></strong></td>
      <td>1.2.250.1.213.2.33</td>
      <td>TRE_R43-CapaciteSavoirFaire</td>
    </tr>
    <tr>
      <td><strong><b>Qualification</b> <b>des praticiens</b> <b>adjoints</b> <b>contractuels</b> <b>(PAC)</b></strong></td>
      <td>1.2.250.1.213.2.34</td>
      <td>TRE_R44-QualificationPAC</td>
    </tr>
    <tr>
      <td><strong><b>Fonction</b> <b>qualifiée</b></strong></td>
      <td>1.2.250.1.213.2.35</td>
      <td>TRE_R45-FonctionQualifiee</td>
    </tr>
    <tr>
      <td><strong><b>Spécialité de</b> <b>concours</b> <b>hospitalier</b></strong></td>
      <td>1.2.250.1.213.2.36</td>
      <td>TRE_R46-SpecialiteConcoursHospitalier</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J107-EnsembleSavoirFaire-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.175</td>
    </tr>
  </tbody>
</table>

**Statut : Validé | Classification : Non sensible - Public | Version v3.1** page 21/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

## **5.2. Présentation détaillée de l’extraction des cartes CPS ou CPF**

### **5.2.1. Règles de format applicables à l’extraction des cartes CPS ou CPF**

<table>
  <thead>
    <tr>
      <th><b>Nature</b></th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Nom du fichier</td>
      <td>Le fichier est nommé Porteurs_CPS_CPF_[Date]</td>
    </tr>
    <tr>
      <td>Périmètre des données de carte extraites</td>
      <td>Sont extraites toutes cartes CPS et CPF en cours de validité (date de fin non échue, carte non opposée)</td>
    </tr>
    <tr>
      <td>Format</td>
      <td>Les extractions sont générées au format UTF-8</td>
    </tr>
    <tr>
      <td>Séparateur des données</td>
      <td>Le séparateur du fichier est "|"</td>
    </tr>
    <tr>
      <td>En-tête</td>
      <td>Le fichier possède une ligne d'en-tête</td>
    </tr>
    <tr>
      <td>Extension</td>
      <td>L'extension du fichier csv est .txt</td>
    </tr>
    <tr>
      <td>Complétion</td>
      <td>Le fichier ne peut être vide</td>
    </tr>
    <tr>
      <td>Protection des champs</td>
      <td>Les champs ne sont pas protégés par des "</td>
    </tr>
  </tbody>
</table>

### **5.2.2. Détail du contenu de l’extraction des cartes CPS ou CPF**

<table>
  <thead>
    <tr><th><b>Libellé</b></th><th colspan="3">Description</th><th><b>Catégorie de</b> données</th></tr>
  </thead>
  <tbody>
    <tr><td>Identifiant PP</td><td colspan="3">Identifiant RPPS</td><td rowspan="3">Professionnel</td></tr>
    <tr><td>Identification nationale PP</td><td colspan="3">Concaténation du type d’identifiant et de l’identifiant national</td></tr>
    <tr><td>Type d'identifiant PP</td><td colspan="3">Nomenclature<br /><b>CodesystemName</b> = TRE_G08-TypeIdentifiantPersonne<br /><b>CodeSystem</b> = 1.2.250.1.71.1.2.15<br /><b>CodesystemName</b> = JDV_J77-TypeIdentifiantPersonne-RASS<br /><b>CodeSystem</b> = 1.2.250.1.213.1.6.1.145</td></tr>
    <tr><td>Nom d'exercice</td><td colspan="3">Alphanumérique (60)</td><td rowspan="4">Exercice professionnel</td></tr>
    <tr><td>Prénom d'exercice</td><td colspan="3">Alphanumérique (60)</td></tr>
    <tr><td rowspan="2">Code Profession</td><th><b>Description</b></th><th><b>CodeSystem</b></th><th><b>CodesystemName</b></th></tr><tr><td><b><b>Professions de</b> Santé</b></td><td>1.2.250.1.71.1.2.7</td><td>TRE_G15-ProfessionSante</td></tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 22/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th>Libellé</th>
      <th colspan="3"><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="5">Libellé Profession</td>
      <td><strong><b>Professions du</b> <b>Social</b></strong></td>
      <td>1.2.250.1.213.1.6.1.4</td>
      <td>TRE_R94-ProfessionSocial</td>
      <td rowspan="7"></td>
    </tr>
    <tr>
      <td><strong><b>Usagers de titre</b></strong></td>
      <td>1.2.250.1.213.1.6.1.109</td>
      <td>TRE_R95-UsagerTitre</td>
    </tr>
    <tr>
      <td><strong><b>Autres</b> <b>professions</b></strong></td>
      <td>1.2.250.1.213.1.6.1.140</td>
      <td>TRE_R291-AutreProfession</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J106-EnsembleProfession-RASS</td>
    </tr>
    <tr>
      <td colspan="3"><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.174</td>
    </tr>
    <tr>
      <td>Code catégorie professionnelle</td>
      <td colspan="3">Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R09-CategorieProfessionnelle<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.10</td>
    </tr>
    <tr>
      <td>Libellé catégorie professionnelle</td>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J89-CategorieProfessionnelle-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.157</td>
    </tr>
    <tr>
      <td>Code type de carte</td>
      <td colspan="3" rowspan="2">Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_G02-TypeProduit<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.2</td>
      <td rowspan="9">Carte Professionnelle</td>
    </tr>
    <tr>
      <td>Libellé type de carte</td>
    </tr>
    <tr>
      <td>Numéro Carte</td>
      <td colspan="3">Alphanumérique (10)</td>
    </tr>
    <tr>
      <td>Identifiant national contenu dans la carte</td>
      <td colspan="3">Champ non rempli actuellement</td>
    </tr>
    <tr>
      <td>Date début validité</td>
      <td colspan="3">Date (jj/mm/aaaa)</td>
    </tr>
    <tr>
      <td>Date fin validité</td>
      <td colspan="3">Date (jj/mm/aaaa)</td>
    </tr>
    <tr>
      <td>Date opposition</td>
      <td colspan="3">Date (jj/mm/aaaa)</td>
    </tr>
    <tr>
      <td rowspan="2">Date de mise à jour</td>
      <td colspan="2">Date</td>
      <td>(jj/mm/aaaa)</td>
    </tr>
    <tr>
      <td colspan="3">Correspond à la date d’enregistrement de la carte dans le RPPS</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 23/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

---

## **5.3. Présentation détaillée de l’extraction des BAL MSSanté**

---

### **5.3.1. Règles de format applicables à l’extraction des BAL MSSanté**

<table>
  <thead>
    <tr>
      <th><b>Nature</b></th>
      <th><b>Description</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Nom du fichier</td>
      <td>Le fichier est nommé « Extraction_Correspondance_MSSanté_[Date] »</td>
    </tr>
    <tr>
      <td>Périmètre des adresses de messagerie extraites</td>
      <td>Seules sont extraites les BAL personnelle et organisationnelles</td>
    </tr>
    <tr>
      <td>Périmètre des structures extraites</td>
      <td>Ne sont extraites que les structures faisant l'objet d'un rattachement explicite à l’adresse de messagerie (cela exclut les BAL de type 10)</td>
    </tr>
    <tr>
      <td>Périmètre des savoir-faire extraits</td>
      <td>Dans le fichier Correspondance MSSanté, ne sont extraits que les savoir-faire actifs (date de début échue et date de fin non échue ou absente) de type de savoir-faire S, CEX ou PAC.</td>
    </tr>
    <tr>
      <td>Format</td>
      <td>Les extractions sont générées au format UTF-8</td>
    </tr>
    <tr>
      <td>Séparateur des données</td>
      <td>Le séparateur du fichier est "|"</td>
    </tr>
    <tr>
      <td>En-tête</td>
      <td>Le fichier possède une ligne d'en-tête</td>
    </tr>
    <tr>
      <td>Extension</td>
      <td>L'extension du fichier est .txt</td>
    </tr>
    <tr>
      <td>Protection des champs</td>
      <td>Les champs ne sont pas protégés par des "</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 24/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: ANS AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
  <thead>
    <tr>
      <th><b>Détail du contenu de</b> <b>l’extraction des BAL</b> <b>MSSantéLibellé</b></th>
      <th><b>Description</b></th>
      <th><b>Catégorie de</b> données</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type de BAL</td>
      <td>Valeurs possibles :<br /><br />▶ ORG pour une BAL Organisationnelle<br />▶ PER pour une BAL Personnelle<br /><br />Alphanumérique (3)</td>
      <td rowspan="2">Boite aux lettres MSS</td>
    </tr>
    <tr>
      <td>Adresse BAL</td>
      <td>Adresse unique de messagerie dans un domaine de messagerie MSSanté<br /><br />Alphanumérique (256)</td>
    </tr>
    <tr>
      <td>Type Identifiant PP</td>
      <td>Identifiant RPPS interne à la structure d’activité. Valeurs possibles :<br /><br />▶ 8 si RPPS<br /><br />Nomenclature<br /><strong>CodesystemName</strong> = TRE_G08-TypeIdentifiantPersonne<br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.15<br /><strong>CodesystemName</strong> = JDV_J77-TypeIdentifiantPersonne-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.145</td>
      <td rowspan="3">Professionnel</td>
    </tr>
    <tr>
      <td>Identifiant PP</td>
      <td>Identifiant RPPS du titulaire de la BAL<br />Alphanumérique (256)</td>
    </tr>
    <tr>
      <td>Identification nationale PP</td>
      <td>Concaténation du type d’identifiant et de l’identifiant national</td>
    </tr>
    <tr>
      <td>Type identifiant structure</td>
      <td>Type de structure à laquelle la BAL est rattachée par l’opérateur.<br /><br />Valeurs possibles :<br /><br />▶ 1 si FINESS<br />▶ 2 si SIREN<br />▶ 3 si SIRET<br /><br />Nomenclature<br /><strong><b>CodeSystemName</b></strong> = TRE_G07-TypeIdentifiantStructure<br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.14<br /><strong>CodesystemName</strong> = JDV_J104-TypeIdentifiantStructure-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.172</td>
      <td rowspan="2">Structure</td>
    </tr>
    <tr>
      <td>Identification Structure</td>
      <td>Numéro FINESS juridique ou géographique, ou le numéro SIREN, ou le numéro SIRET<br /><br />Alphanumérique (32)</td>
    </tr>
    <tr>
      <td>Service de rattachement</td>
      <td>Nom et description du service de rattachement de l’utilisateur dans l’organisation<br /><br />Alphanumérique (160)</td>
      <td>Boîte aux lettres MSS</td>
    </tr>
  </tbody>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 25/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
    <tr>
      <td>Libellé civilité exercice</td>
      <td colspan="3">Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R11-CiviliteExercice<br /><br /><strong>CodeSystem</strong> =1.2.250.1.213.1.6.1.11<br /><br /><strong>CodesystemName</strong> = JDV_J79-CiviliteExercice-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.147</td>
      <td rowspan="5">Exercice professionnel</td>
    </tr>
    <tr>
      <td>Nom d'exercice</td>
      <td colspan="3">Alphanumérique (80)</td>
    </tr>
    <tr>
      <td>Prénom d'exercice</td>
      <td colspan="3">Alphanumérique (50)</td>
    </tr>
    <tr>
      <td>Code catégorie profession</td>
      <td colspan="3">Nomenclature</td>
    </tr>
    <tr>
      <td>Libellé catégorie profession</td>
      <td colspan="3"><strong>CodesystemName</strong> = TRE_R37-CategorieProfession<br /><br /><strong>CodeSystem</strong> =1.2.250.1.213.1.6.1.3</td>
    </tr>
    <tr>
      <td rowspan="5">Code profession</td>
      <td>Description</td>
      <td>CodeSystem</td>
      <td>CodesystemName</td>
      <td rowspan="6"></td>
    </tr>
    <tr>
      <td><strong><b>Professions de</b> Santé</strong></td>
      <td>1.2.250.1.71.1.2.7</td>
      <td>TRE_G15-ProfessionSante</td>
    </tr>
    <tr>
      <td><strong><b>Professions du</b> <b>Social</b></strong></td>
      <td>1.2.250.1.213.1.6.1.4</td>
      <td>TRE_R94-ProfessionSocial</td>
    </tr>
    <tr>
      <td><strong><b>Usagers de titre</b></strong></td>
      <td>1.2.250.1.213.1.6.1.109</td>
      <td>TRE_R95-UsagerTitre</td>
    </tr>
    <tr>
      <td><strong><b>Autres</b> <b>professions</b></strong></td>
      <td>1.2.250.1.213.1.6.1.140</td>
      <td>TRE_R291-AutreProfession</td>
    </tr>
    <tr>
      <td>Libellé profession</td>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J106-EnsembleProfession-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.174</td>
    </tr>
    <tr>
      <td rowspan="4">Code savoir-faire</td>
      <td colspan="3">La Nomenclature applicable est fonction du type de savoir faire</td>
      <td rowspan="6">Savoir-faire</td>
    </tr>
    <tr>
      <td>Description</td>
      <td>CodeSystem</td>
      <td>CodesystemName</td>
    </tr>
    <tr>
      <td><strong><b>Spécialité</b></strong></td>
      <td>1.2.250.1.213.2.28</td>
      <td>TRE_R38-SpecialiteOrdinale</td>
    </tr>
    <tr>
      <td><strong><b>Compétence</b> <b>exclusive</b></strong></td>
      <td>1.2.250.1.213.2.30</td>
      <td>TRE_R40-CompetenceExclusive</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>Qualification</b> <b>des praticiens</b> <b>adjoints</b> <b>contractuels</b> <b>(PAC)</b></strong></td>
      <td>1.2.250.1.213.2.34</td>
      <td>TRE_R44-QualificationPA</td>
    </tr>
    <tr>
      <td>Libellé savoir-faire</td>
      <td colspan="3"><strong>CodesystemName</strong> = JDV_J107-EnsembleSavoirFaire-RASS<br /><br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.175</td>
    </tr>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 26/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

---

<table>
    <tr>
      <td>Dématérialisation</td>
      <td>Indicateur d’acceptation de la dématérialisation.<br /><br />Valeurs possibles :<br />► O – dématérialisation acceptée<br />► N – dématérialisation refusée<br /><br />Alphanumérique (1)</td>
      <td>Boite aux lettres MSS</td>
    </tr>
    <tr>
      <td>Raison Sociale structure BAL</td>
      <td>Raison sociale de la structure à laquelle la BAL est rattachée par l’opérateur<br /><br />Alphanumérique (164)</td>
      <td rowspan="12">Coordonnées<br />structure</td>
    </tr>
    <tr>
      <td>Enseigne commerciale structure BAL</td>
      <td>Enseigne commerciale de la structure à laquelle la BAL est rattachée<br />Alphanumérique (50)</td>
    </tr>
    <tr>
      <td>L2COMPLEMENTLOCALISATION structure BAL</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>L3COMPLEMENTDISTRIBUTION structure BAL</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>L4NUMEROVOIE structure BAL</td>
      <td>Alphanumérique (4)</td>
    </tr>
    <tr>
      <td>L4COMPLEMENTNUMEROVOIE structure BAL</td>
      <td>Alphanumérique (3)</td>
    </tr>
    <tr>
      <td>NL4TYPEVOIE structure BAL</td>
      <td>Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_R35-TypeVoie<br /><strong>CodeSystem</strong> = 1.2.250.1.213.2.44<br /><strong>CodesystemName</strong> = JDV_J103-TypeVoie-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.171</td>
    </tr>
    <tr>
      <td>L4LIBELLEVOIE structure BAL</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>L5LIEUDITMENTION structure BAL</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>L6LIGNEACHEMINEMENT structure BAL</td>
      <td>Alphanumérique (38)</td>
    </tr>
    <tr>
      <td>Code postal structure BAL</td>
      <td>Alphanumérique (5)</td>
    </tr>
    <tr>
      <td>Département structure BAL</td>
      <td>Nomenclature<br /><br /><strong>CodesystemName</strong> = TRE_G09-DepartementOM<br /><strong>CodeSystem</strong> = 1.2.250.1.71.1.2.16<br /><strong>CodesystemName</strong> = JDV_J84-DepartementOM-RASS<br /><strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.152</td>
    </tr>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 27/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

<table>
    <tr>
      <td rowspan="1">Pays structure BAL</td>
      <td>Nomenclature<br />
        <br />
        <strong>CodesystemName</strong> = TRE_R20-Pays<br />
        <br />
        <strong>CodeSystem</strong> = 1.2.250.1.213.2.24<br />
        <br />
        <strong>CodesystemName</strong> = JDV_J74-Pays-RASS<br />
        <br />
        <strong>CodeSystem</strong> = 1.2.250.1.213.1.6.1.142</td>
      <td></td>
    </tr>
</table>

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 28/40


Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé
# **DSFT des données en libre accès de l’Annuaire Santé**

---

## **6. FAQ**

Ci-dessous se trouvent les questions les plus fréquemment posées par nos utilisateurs, accompagnées de leurs réponses.

*   **A quelle fréquence les données des extractions sont-elles mises à jour ?**

La fréquence d’actualisation des données dépend de leur source :
*   Les données mises à jour de façon quotidienne sont les données provenant :
    *   Des conseils nationaux des ordres ;
    *   Du service de santé des armées ;
    *   Du référentiel FINESS ;
    *   Du système d’information des cartes CPx ;
    *   Du système d’information MSSanté.
*   Les données provenant des agences régionales de santé et des structures où exercent les professionnels sont mises à jour de façon hebdomadaire.

*   **Comment peut-on différencier les professionnels radiés, les professionnels sans activité inscrits à leur autorité d’enregistrement et les remplaçants exclusifs ?**

<table>
  <thead>
    <tr>
      <th>Le professionnel apparaît dans l’extraction</th>
      <th>Le professionnel n’apparaît pas dans l’extraction</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <ul>
          <li>Un professionnel qui a cessé toute activité et qui est toujours inscrit auprès de son autorité d’enregistrement (apparaît sans mode d’exercice)</li>
        </ul>
      </td>
      <td>
        <ul>
          <li>Un professionnel qui n’est pas inscrits au RPPS auprès de son autorité d’enregistrement</li>
        </ul>
      </td>
    </tr>
    <tr>
      <td>
        <ul>
          <li>Un professionnel qui exerce en tant que remplaçant exclusif apparaît avec la donnée de profession et de mode d’exercice</li>
        </ul>
      </td>
      <td>
        <ul>
          <li>Un professionnel radié par l’autorité d’enregistrement</li>
        </ul>
      </td>
    </tr>
  </tbody>
</table>

*   **Les étudiants et internes ont-ils un numéro RPPS ? Est-il définitif ?**

Certains étudiants et internes ont un numéro RPPS, attribué par le système d’information du RPPS opéré par l’ ANS. Cela concerne les internes en médecine, en pharmacie, en odontologie et les étudiants en maïeutique. Ceux-ci conservent les mêmes numéros lors de l’inscription au tableau de l’ordre après les études.

*   **Les professionnels à diplôme extra-européen sont-ils présents dans l’Annuaire Santé ?**

Seuls les professionnels titulaires d’un diplôme extra-européen ayant obtenu une autorisation ministérielle d’exercice sont éligibles à une inscription à l’ordre et présents dans le RPPS.

*   **Comment s’articulent entre elles les données de profession, diplômes et savoir-faire ?**

Un diplôme sanctionne un niveau de connaissances.
Le professionnel est libre d’exercer (ou non) toute profession pour laquelle il dispose d’un diplôme.
Parfois, le professionnel dispose d’un savoir-faire, qui correspond aux prérogatives d’exercice d’un professionnel reconnues par une autorité d’enregistrement. Il existe plusieurs types de savoir-faire :
*   les spécialités ordinales ;
*   les compétences exclusives ;
*   les qualifications PAC.

En particulier, un médecin peut exercer une seule spécialité à la fois, celle pour laquelle il a été qualifié par son ordre.
Dans les nouvelles extractions en libre accès, l’intégralité des diplômes et des savoir-faire des professionnels intervenant dans le système de santé sont recensés.

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 29/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

---

*   **Pourquoi la donnée de diplôme n’est-elle pas renseignée pour certains professionnels ?**

La donnée de diplôme est disponible seulement pour les professionnels du RPPS. Le numéro de diplôme n’est pas renseigné.

*   **Pourquoi la donnée de savoir-faire n’est-elle pas renseignée pour certains professionnels ?**

La notion de spécialité ou de savoir-faire existe uniquement pour les médecins et les chirurgiens-dentistes. Pour les autres professionnels, leur profession ne possède pas de spécialité particulière ou de savoir-faire particulier, d’où l’absence de données pour cette population.

*   **Pour quelles structures le SIRET est-il présent dans les données de l’extraction publique ?**

Les SIRET sont présents uniquement :
◼ pour les cabinets de type « société d’exercice » (société d’exercice libéral (SEL) ou société civile professionnelle (SCP)).
◼ pour les employeurs qui ne sont pas des établissements de soins (non présents dans FINESS).

Ils ne sont pas présents pour les cabinets individuels ou de groupe de manière générale. En effet, lors de l’inscription à l’ordre, les titulaires de cabinet ne disposent pas toujours de leur numéro SIRET. Afin de ne pas bloquer la facturation à l’assurance maladie, un numéro technique (RPPS-rang) permettant d’identifier le cabinet est distribué à chaque cabinet. De surcroit, il est rare qu’après l’obtention du numéro SIRET le professionnel se représente à son ordre pour compléter cette information.

*   **Comment sont gérés les noms de famille maritaux ?**

L’extraction publique ne publie que les noms et prénoms d’exercice. Les noms et prénoms d’usage et l’état civil font partie des données en accès restreint.

Ainsi, à l’occasion d’un changement de nom de famille (à la suite d’un mariage par exemple), le professionnel décidera lui-même s’il souhaite modifier son nom d’exercice. Pour cela, il se rendra auprès de son autorité d’enregistrement.

*   **Pourquoi les données ne sont-elles pas toutes normalisées ?**

Certaines données (noms, prénoms, villes…) ne sont pas normalisées. Par exemple, pour les prénoms, on retrouve « JEAN-PIERRE » ; « JEAN- PIERRE » ou « JEAN PIERRE ». Quelques adresses mail sont mal formatées et quelques données sont précédées ou suivies d’espaces typographiques.

Les données publiées par l’Annuaire Santé sont les données enregistrées et transmises par les autorités d’enregistrement. L’ANS reçoit donc leurs données et les publie telles quelles.

L’ANS travaille à l’uniformisation et à la qualité des données, en collaboration avec les différentes autorités d’enregistrement.

*   **Qu’est-ce que le « code commune » ?**

Le code commune est attribué par l’INSEE. Il sert à préciser le libellé de la localité. Il fait partie du COG (code officiel géographique). Toutes les communes disposent d’un code commune. Il est attribué – en règle générale – de la façon suivante : toutes les communes au sein d’un département donné sont numérotées de 001 à 999 au maximum, dans l’ordre à partir de 001. Le code commune est alors formé de la façon suivante : les deux premiers chiffres sont ceux correspondant au département et les trois suivants sont ceux correspondant au « numéro » de la commune (sauf pour la Corse où le numéro du département contient en réalité une lettre et sauf pour les départements d’outre-mer où le code département est sur trois chiffres).

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 30/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

---

*   **Pourquoi reste-t-il des guillemets dans la nouvelle extraction publique ?**

Auparavant, dans l’ancienne extraction publique, les données étaient délimitées par des guillemets. Dans la nouvelle extraction publique, ce n’est plus le cas. Cela signifie que les guillemets qui se trouvent toujours dans cette nouvelle version font partie intégrante des données, recueillies par les autorités d’enregistrement auprès des professionnels eux-mêmes (notamment dans les raisons sociales ou dans les adresses, comme par exemple « EHPAD "LES JARDINS" »).

Par ailleurs, le séparateur, qui était auparavant le point-virgule, est désormais le pipe : « | ».

*   **Est-il possible de mettre à disposition un webservice de consultation unitaire ? Est-il possible de ne télécharger que le différentiel de données entre deux extractions ?**

Il existe aujourd’hui une API se basant sur la technologie FHIR permettant aux solutions tierces de récupérer plus facilement et automatiquement les données publiques de l’Annuaire Santé.

Pour en savoir plus, nous conseillons au lecteur de se rendre sur la page dédiée [: https://ansforge.github.io/annuaire-sante-fhir-documentation/](https://ansforge.github.io/annuaire-sante-fhir-documentation/)</u>

*   **Quel est le coût du téléchargement des fichiers d’extraction en libre accès ?**

Le téléchargement des fichiers d’extraction n’est pas payant. Cela ne dispense cependant pas l’utilisateur de veiller scrupuleusement à ce que son utilisation des données de l’Annuaire Santé soit en conformité avec les conditions générales d’utilisation accessibles sur la page [https://annuaire.esante.gouv.fr/cgu](https://annuaire.esante.gouv.fr/cgu)

*   **Le site me renvoie une erreur 503, qu’est-ce que cela veut dire ?**

L’Annuaire Santé reçoit de plus en plus de sollicitations, aussi bien provenant des recherches faites directement sur le site que dans les connexions avec d’autres services numériques. Nous avons donc mis en place une nouvelle erreur, appelée 503, qui indique que : « Le service est actuellement saturé. Veuillez réessayer dans quelques minutes. ». Cette erreur a été créée pour permettre une meilleure lisibilité de la plateforme et de gérer au mieux les pics de charge.

Comme indiqué dans le message, trop de sollicitations ont été faites en un temps restreint auprès de l’Annuaire Santé. Nous vous invitons donc à réitérer votre démarche ultérieurement.

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 31/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

---

## **7. AIDE A L’USAGE DES FICHIERS D’EXTRACTION AVEC MICROSOFT EXCEL**

La procédure d’ouverture avec Microsoft Excel est différente selon le fichier d’extraction que l’utilisateur souhaite ouvrir.

### **7.1. Fichiers d’extraction « PS_LibreAcces_Dipl_AutExerc », « PS_LibreAcces_SavoirFaire », « Porteurs_CPS_CPF » et « Correspondance_MSSante »**

---

**N.B. : la méthode décrite ci-après convient à l’ouverture d’un fichier inférieur à 1 048 576 lignes, à cause des **limites actuelles d’Excel. Au-delà, il est nécessaire de réaliser préalablement un découpage du fichier (c’est** **le cas pour l’extraction « PS_Libre_Acces_Personne_activite », cf. la procédure décrite sur la partie suivante** de ce document).**

Par défaut Excel convertit les données afin de les interpréter.

- Les données contenant des chiffres sont converties en nombre. Ce qui a pour conséquence de supprimer les zéros de gauche des numéros FINESS par exemple ;
- Les données contenant plus de 10 chiffres sont converties en format exponentiel (ex : du numéro RPPS « 1000002636 » transformé en 1E+10) ;
- Les données alphabétiques sont converties en ANSI (ex : « Français » en FranÃ§ais).

Pour pallier ce problème, les extractions « PS_Libre_Acces », « Porteurs_CPS_CPF » et « Correspondance_MSSante » sont au format TXT. Pour ouvrir un fichier TXT dans Excel :

1. Ouvrir Excel (sans ouvrir le fichier) ;
2. Dans le menu d’Excel, aller sur « Données », « A partir du texte » ;
3. Sélectionner le fichier xxx.TXT et cliquer sur importer ;
4. L’écran « Assistant Importation de texte » apparaît ;

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 32/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

screenshot: Microsoft Excel interface showing the 'Données' tab and the 'Assistant Importation de texte - Étape 1 sur 3' dialog box.

5. Sélectionner le bouton radio « Délimité » ;

6. Modifier le jeu de caractère. Par défaut « Windows(ANSI) ». Mettre « 65001 : Unicode (UTF-8) » et cliquer sur le bouton [suivant] ;

| Assistant Importation de texte - Étape 1 sur 3 |  ?  |  X  |
| :--------------------------------------------- | :-: | :-: |
| :--- | :---: | :---: |

L'Assistant Texte a déterminé que vos données sont de type Délimité.

Si ce choix vous convient, choisissez Suivant, sinon choisissez le type de données qui décrit le mieux vos données.

Type de données d'origine
Choisissez le type de fichier qui décrit le mieux vos données :
(•) **D**élimité - Des caractères tels que des virgules ou des tabulations séparent chaque champ.
( ) **L**argeur fixe - Les champs sont alignés en colonnes et séparés par des espaces.

Commencer l'importation à la ligne : `1` [^] [v]  **O**rigine du fichier : [ 65001 : Unicode (UTF-8) | v ]

Aperçu du fichier C:\Users\frup03799\Documents\Mon_RASS\4_Suivi\Extrac...\EXTRACTION_PP_3_Langue_201311081119.csv.

```text
1 "Identifiant RPPS";"Code langue";"Libellé langue";"Date mise à jour langue";"Date fin lan
2 "10000026236";"FR";"Français";"30/04/09";"";
3 "10000028265";"EN";"Anglais";"30/04/09";"";
4 "10000028323";"FR";"Français";"30/04/09";"";
5 "10000014489";"EN";"Anglais";"30/04/09";"";
```

| [ Annuler ] | [ < Précédent ] | [ **S**uivant > ] | [ **T**erminer ] |
| :---: | :---: | :---: | :---: |

7. Sélectionner le séparateur « | » et choisir « aucun » comme identificateur de texte, puis cliquer sur le bouton [suivant] ;

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 33/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

---

| Assistant Importation de texte - Étape 2 sur 3 | ? | X |
| :--- | :---: | :---: |
| Cette étape vous permet de choisir les séparateurs contenus dans vos données. Vous pouvez voir les changements sur votre texte dans l'aperçu ci-dessous. | | |
| **Séparateurs** | | |
| [ ] Tabulation | [ ] Interpréter des séparateurs identiques consécutifs comme uniques | |
| [ ] Point-virgule | | |
| [ ] Virgule | Identificateur de texte : [ {aucun} | v ] |
| [ ] Espace | | |
| [x] Autre : [ | ] | | |
| | | |
| **Aperçu de données** | | |
| <table><tr><td>Type d'identifiant PP</td><td>Identifiant PP</td><td>Identification nationale PP</td><td>Code civilité exercice Lib</td></tr><tr><td>8</td><td>10000036359</td><td>810000036359</td><td></td></tr><tr><td>8</td><td>10000113422</td><td>810000113422</td><td></td></tr><tr><td>8</td><td>10000146562</td><td>810000146562</td><td></td></tr><tr><td>8</td><td>10000143155</td><td>810000143155</td><td></td></tr></table> | | |
| | | |
| | [ Annuler ] [ < Précédent ] [ Suivant > ] [ Terminer ] | |

8. Le fichier s’ouvre sur Excel.

## **7.2. Fichier d’extraction « PS_LibreAcces_Personne_activite »**

Une fois les données téléchargées et afin d’éviter le problème d’affichage d’Excel, il faut ensuite transformer les données pour n’afficher que les données souhaitées. Voici les étapes à suivre pour réaliser ce processus :

1. Ouvrir une feuille Excel vierge
2. Cliquer sur « Données » sur le bandeau en haut et « A partir d’un fichier texte/CSV »

| Fichier | Accueil | Insertion | Mise en page | Formules | **Données** | Rév |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |

| icon: Obtenir des données | icon: À partir d'un fichier texte/CSV **À partir d'un fichier texte/CSV** | icon: À partir de l'image À partir de l'image ⌵ |
| :--- | :--- | :--- |
| **Obtenir des données ⌵** | icon: À partir du web À partir du web | icon: Sources récentes Sources récentes |
| | icon: À partir de Tableau ou d'une Plage À partir de Tableau ou d'une Plage | icon: Connexions existantes Connexions existantes |

Récupérer et transformer des données

3. Sélectionner ensuite le fichier de l’extraction qui intéresse l’utilisateur
4. Cliquer enfin sur « Transformer les données »

Une fois la fenêtre de transformation des données ouverte, le reste des manipulations dépend de ce que l’utilisateur souhaite faire :

- Filtrer une donnée (le plus courant)
- Supprimer une donnée inutile
- Regrouper des données provenant de plusieurs excels différents
- Appliquer un calcul dans la partie transformation des données

### **7.2.1. Filtrer une donnée**

Cette partie de filtrage de données est essentielle pour limiter le volume de données à charger dans Excel et réduire le nombre de lignes à afficher.

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 34/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

---

**Attention** : il est nécessaire de réaliser ces filtres à l’ensemble des requêtes que l’utilisateur transforme dans Editeur Power Query. Chaque requête que l’utilisateur charge ensuite dans Excel doit pouvoir entrer dans une feuille, sans dépasser la limite du nombre de lignes maximales (l’utilisateur aura des données manquantes sinon).

1. Cliquer sur le icon: filter arrow de la colonne qui intéresse l’utilisateur pour filtrer.

2. En fonction de la quantité de données, il peut arriver que la liste ne soit pas complète. Pour s’en assurer, cliquer systématiquement sur « Charger plus » en bas à droite de la fenêtre de tri. Une fois cette fonction lancée, il faut attendre que le chargement de données se terminé (la mention « la liste peut être incomplète » disparaît alors).

screenshot: Menu de filtrage avec l'option Charger plus

3. Une fois la liste totalement chargée, il suffit ensuite de choisir les éléments que l’utilisateur souhaite voir apparaître dans son extraction. Pour cela il suffit de cocher ou décocher les carrés juste à côté des éléments de la liste

▶ <u>Astuce</u> : par défaut, l’ensemble des éléments sont cochés. L’utilisateur peut tous les décocher en décochant le carré à gauche de « Sélectionner tout ». Dans l’autre sens, l’utilisateur peut tout recocher en cochant le carré à gauche de « Sélectionner tout »

image: Liste de sélection avec cases à cocher

▶ Une fois le filtrage sélectionné, il suffit de cliquer sur « OK » en bas à droite de la fenêtre. L’action de filtrage est terminée. Celle-ci peut être répétée autant de fois que souhaité, pour l’ensemble des colonnes.

## **7.2.2. Supprimer une donnée inutile**

L’étape de suppression de colonnes permet de réduire fortement le nombre de données qu’Excel aura à charger. Ceci permettra ensuite d’accélérer les manipulations dans Excel.

Pour cela, il suffit de faire un « clic-droit » sur la colonne que l’utilisateur souhaite supprimer et cliquer sur « Supprimer »

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 35/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

photo: screenshot fragment showing context menu with Copier and Supprimer

## **7.2.3. Regrouper des données de plusieurs excels différents**

L’ANS a fractionné les différentes informations sur plusieurs fichiers Excel différents afin de répartir les droits comme décrit dans la diapositive 4, mais aussi pour limiter la taille de ces fichiers

1. Charger l’ensemble des requêtes que l’utilisateur souhaite fusionner en faisant un clic droit dans l’onglet de gauche « Requêtes », puis « Fichier » et « Texte/CSV ».

| | | |
| :--- | :--- | :--- |
| icon: Coller Coller | | |
| **Nouvelle requête** | ▶ | icon: Fichier **Fichier** | ▶ | icon: Excel Classeur Excel |
| Nouveau groupe... | | icon: Base de données Base de données | ▶ | icon: Texte/CSV **Texte/CSV** |
| Développer tout | | icon: Power Platform Power Platform | ▶ | icon: XML XML |
| Réduire tout | | icon: Azure Azure | ▶ | icon: JSON JSON |
| | | icon: Services en ligne Services en ligne | ▶ | icon: PDF PDF |
| | | icon: Autres sources Autres sources | ▶ | icon: Dossier Dossier |
| | | | | icon: SharePoint Dossier SharePoint |
| | | Combiner | ▶ | |
| | | icon: Sources récentes Sources récentes | ▶ | |

2. Cliquer sur « OK » quand la nouvelle fenêtre du nouveau fichier apparaît.
   ▶ La liste des requêtes apparaît dans l’onglet de gauche « Requêtes »

3. Cliquer ensuite sur une des deux extractions que l’utilisateur souhaite fusionner dans la partie de gauche « Requêtes » puis « Accueil » et « Fusionner des requêtes ».

|                               |                              |
| :---------------------------- | :--------------------------- |
| icon: merge queries  | **Fusionner des requêtes** ▾ |
| icon: append queries | **Ajouter des requêtes** ▾   |
| icon: combine files  | Combiner les fichiers        |
|                               | **Combiner**                 |

<u>Important à savoir</u> : Pour fusionner deux requêtes, il faut qu’une colonne soit commune entre deux requêtes pour que le rapprochement puisse se faire (l’identifiant PP correspondant au RPPS peut être utilisé pour rapprocher des professionnels par exemple)

4. Dans la nouvelle fenêtre « Fusionner », cliquer sur l’en-tête de la colonne de la première extraction qui sera identique avec la suivante. Celle-ci devient verte.

<table>
  <thead>
    <tr>
      <th>Type d'identifiant PP</th>
      <th>Identifiant PP</th>
      <th>Identifiant de l'activité</th>
      <th>Identification nationale PP</th>
      <th>Identifiant technique de</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>8</td>
      <td>10004973441</td>
      <td>1010656965</td>
      <td>8,10005E+11</td>
      <td>R10100000026103</td>
    </tr>
    <tr>
      <td>8</td>
      <td>10000028380</td>
      <td>1002508392</td>
      <td>8,1E+11</td>
      <td>R10000003500434</td>
    </tr>
    <tr>
      <td>8</td>
      <td>10000028596</td>
      <td>1002507234</td>
      <td>8,1E+11</td>
      <td>F140004383</td>
    </tr>
    <tr>
      <td>8</td>
      <td>10000029768</td>
      <td>1002510910</td>
      <td>8,1E+11</td>
      <td>F060780756</td>
    </tr>
  </tbody>
</table>

5. Sélectionner ensuite dans le menu déroulant, la seconde extraction que l’utilisateur souhaite rapprocher.

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 36/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

screenshot: Dropdown menu showing extraction profiles

6. Répéter l’étape 4 sur le second encart pour la deuxième extraction choisie.

<table>
  <thead>
    <tr>
      <th>Type d'identifiant PP</th>
      <th>Identifiant PP</th>
      <th>Identification nationale PP</th>
      <th>Code AE</th>
      <th>Libellé AE</th>
      <th>Date début</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>8</td>
      <td><i>10000086388</i></td>
      <td>8,1E+11</td>
      <td>CNOSF</td>
      <td>Ordre des Sages Femmes</td>
      <td></td>
    </tr>
    <tr>
      <td>8</td>
      <td><i>10000109941</i></td>
      <td>8,1E+11</td>
      <td>CNOSF</td>
      <td>Ordre des Sages Femmes</td>
      <td></td>
    </tr>
    <tr>
      <td>8</td>
      <td><i>10000117472</i></td>
      <td>8,1E+11</td>
      <td>CNOSF</td>
      <td>Ordre des Sages Femmes</td>
      <td></td>
    </tr>
    <tr>
      <td>8</td>
      <td><i>10000168129</i></td>
      <td>8,1E+11</td>
      <td>CNOSF</td>
      <td>Ordre des Sages Femmes</td>
      <td></td>
    </tr>
  </tbody>
</table>

7. Cliquer ensuite sur « OK »

8. Retourner à la première extraction sélectionnée en étape 3 (celle qui était dans le bandeau du haut dans la fenêtre « Fusionner »).

9. Chercher la dernière colonne (correspondant à la seconde extraction choisie en étape 6) et cliquer sur le logo qui a pris place de l’onglet de filtre.

screenshot: Column selection dialog in Excel Power Query

10. Sélectionner les informations que l’utilisateur souhaite rapatrier en cochant/décochant les éléments souhaités, comme dans un filtre. Cliquer ensuite sur « OK » et laisser Excel charger les informations (cette étape peut être longue – il peut être utile de filtrer les données et/ou supprimer des colonnes pour limiter le temps de chargement des données, au préalable).

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 37/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

## **7.2.4. Appliquer des formules dans la partie transformation**

Il peut être utile d’appliquer une formule sur une colonne existante pour en créer une nouvelle avec les résultats du calcul. Ceci peut permettre d’avoir accès à de nouvelles données pouvant affiner, entre autres, les filtres appliqués (ex. code département qui n’apparaît pas dans les données).

1. Cliquer sur « Ajouter une colonne » et « Colonne personnalisée »
2. Donner un nom à la nouvelle colonne, saisir la formule souhaitée et appuyer sur OK

*   ▶ <u>Astuce 1</u> : en cliquant sur les colonnes disponibles à droite, celle-ci apparaîtra automatiquement dans la formule, dans l’encart de gauche. Cela permet d’avoir la bonne syntaxe et de gagner du temps sur l’écriture de la formule
*   ▶ <u>Astuce 2</u> : en cas d’erreur dans la formule, un message en bas de la fenêtre change et indique un problème
*   ▶ <u>Astuce 3</u> : cliquer sur « En savoir plus sur les formules Power Query » permet d’accéder à la liste de formules existantes et trouver ce qui convient à votre besoin.

screenshot: Interface de création de colonne personnalisée dans Power Query

Statut : Validé | Classification : Non sensible - Public | Version v3.1 page 38/40

Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: Agence du Numérique en Santé

# **DSFT des données en libre accès de l’Annuaire Santé**

<u>Quelques exemples de formules utiles</u> :

<table>
  <thead>
    <tr>
      <th><b>Besoins</b></th>
      <th><b>Formule et syntaxe</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Je souhaite avoir qu’une partie du contenu de chaque cellule (par exemple, les deux premiers/derniers caractères)</td>
      <td><u>Je veux les n premiers caractères</u><br />=Text.Start([Colonne à sélectionner],n)<br /><u>Je veux les n derniers caractères</u><br />=Text.End([Colonne à sélectionner],n)<br /><u>Je veux n caractères à partir du caractère m</u><br />=Text.Middle([Colonne à sélectionner],m,n)</td>
    </tr>
    <tr>
      <td>Je souhaite créer une condition comme pour Excel avec des « Si »</td>
      <td><u>Par rapport à la condition n, je souhaite renvoyer x, sinon y</u><br />=if n then x else y</td>
    </tr>
    <tr>
      <td>Je souhaite faire des formules arithmétiques</td>
      <td><u>Je souhaite additionner x et y</u><br />=Value.Add(x,y)<br /><u>Je souhaite diviser x par y</u><br />=Value.Divide(x,y)<br /><u>Je souhaite multiplier x par y</u><br />=Value.Multiply(x,y)<br /><u>Je souhaite soustraire x par y</u><br />=Value.Substract(x,y)</td>
    </tr>
  </tbody>
</table>

## **7.2.5. Terminer la transformation et charger les données**

Une fois toutes les transformations terminées, l’utilisateur peut aller dans « Accueil » et cliquer sur « Fermer et charger ». Cette manipulation peut prendre un peu de temps, en fonction des données que l’utilisateur souhaite voir apparaître.

Il est ensuite possible de vérifier que l’utilisateur n’a pas perdu de données pendant vos transformations.

1. Attendre qu’Excel finisse de charger l’ensemble des requêtes et données que l’utilisateur a manipulées dans Editeur Power Query
2. S’assurer que chaque requête chargée n’a pas plus de 1 048 576 lignes

Si l’ensemble des lignes chargées de chaque requête est individuellement moins grand que ce nombre, l’utilisateur a toutes les données souhaitées

Si ce n’est pas le cas, l’utilisateur doit revenir sur Editeur Power Query et appliquer des filtres plus stricts pour éviter cette perte d’informations. Il suffit de faire clic droit sur une requête et de choisir « Modifier »

screenshot: Excel Power Query pane showing 'Requêtes et connexions' with 188 753 lines loaded

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 39/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.

logo: AGENCE DU NUMÉRIQUE EN SANTÉ

# **DSFT des données en libre accès de l’Annuaire Santé**

Si jamais l’utilisateur souhaite revenir en arrière dans ses transformations, sans pour autant recommencer depuis le début, il est possible de remonter l’historique de ce qui a été préalablement fait.

En effet, au fur et à mesure des actions réalisées, un historique se crée sur la partie de droite dans le champ « Etapes appliquées ».

Pour revenir en arrière, il suffit de supprimer les étapes en cliquant sur la croix à gauche de l’étape que l’utilisateur souhaite supprimé <u>**Attention**</u> : supprimer une étape ne supprime pas nécessairement les étapes suivantes (un message d’alerte apparaît sur Excel quand des étapes suivantes existent)

screenshot: interface showing applied steps in Excel Power Query

Statut : Validé | Classification : Non sensible - Public | Version v3.1
page 40/40
Ce document est la propriété de l’ANS - Son utilisation, sa reproduction ou sa diffusion sans l’autorisation préalable et écrite de l’ANS sont interdites.