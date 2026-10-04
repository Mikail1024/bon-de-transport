**SPHEV**
**GUIDE**

![logo: sesam-vitale](page_1_image_1_v2.jpg)



# GU - Guide d'intégration et d'utilisation du référentiel PS -

**Référence : FACT-GU-001 / Version : 1.22 / Date : 05/04/2016**
**Sécurité : RESTREINTE / Etat : PROVISOIRE**

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72 019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Ce document a été élaboré par le GIE SESAM-Vitale.

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

**Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens **des articles L 335-2 et suivants du code de la propriété intellectuelle, susceptible** d’entraîner des sanctions pour l’auteur du délit.**

*05/04/2016* GIE SESAM-Vitale ![icon: icon](page_2_image_1_v2.jpg) *2 / 9*

*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

# **SOMMAIRE**

**(Une table des matières est disponible page** Erreur ! Signet non défini..**)**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>OBJET DU DOCUMENT ............................................................................................................................4</strong></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>DOCUMENTS DE REFERENCE ...............................................................................................................4</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>ABREVIATIONS ....................................................................................................................................4</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>CONTEXTE.................................................................................................................................................5</strong></td>
    </tr>
    <tr>
      <td><strong>3</strong></td>
      <td><strong>RECUPERATION DES DIFFERENTS ELEMENTS ..................................................................................6</strong></td>
    </tr>
    <tr>
      <td><strong>4</strong></td>
      <td><strong>CONSTITUTION DU REFERENTIEL PS ...................................................................................................7</strong></td>
    </tr>
    <tr>
      <td><strong>5</strong></td>
      <td><strong>DIFFUSION DU REFERENTIEL PS...........................................................................................................9</strong></td>
    </tr>
    <tr>
      <td><strong>6</strong></td>
      <td><strong>UTILISATION DU REFERENTIEL PS .......................................................................................................9</strong></td>
    </tr>
</table>

# **TABLE DES ILLUSTRATIONS**

<table>
    <tr>
      <td>FIGURE 1 : CONSTITUTION DU REFERENTIEL PS .....................................................................................................8</td>
    </tr>
</table>

*05/04/2016 GIE SESAM-Vitale* 
 ![icon: icon](page_3_image_1_v2.jpg) 3 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

# **1 OBJET DU DOCUMENT**

Ce document est destiné aux industriels dont les progiciels utilisent un référentiel PS pour acquérir des informations sur les PS prescripteurs.

Il décrit notamment comment :

*   obtenir les informations nécessaires à la constitution et à la mise à jour du référentiel PS,
*   constituer le référentiel PS;

## **1.1 Documents de référence**

<table>
  <thead>
    <tr>
      <th><b>Appellation</b></th>
      <th><b>Type et titre</b></th>
      <th><b>Référence</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>CdC SV</td>
      <td>Cahier des Charges SESAM-Vitale</td>
      <td>PDT-CDC-001</td>
    </tr>
  </tbody>
</table>

## **1.2 Abréviations**

<table>
  <thead>
    <tr>
      <th colspan="2">Abréviations</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>RPPS</td>
      <td>Répertoire Partagé des Professionnels de Santé</td>
    </tr>
    <tr>
      <td>PS</td>
      <td>Professionnel de Santé</td>
    </tr>
    <tr>
      <td>FNPS</td>
      <td>Fichier National des Professionnels de Santé</td>
    </tr>
  </tbody>
</table>

*05/04/2016 GIE SESAM-Vitale* 
 ![icon: GIE SESAM-Vitale logo](page_4_image_1_v2.jpg) 4 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

## 2 **CONTEXTE**

L’avenant 11 (EV81) au Cahier des Charges SESAM-Vitale, introduit l’usage, pour certaines catégories de PS (pharmaciens, …), d’un référentiel PS.

Ce référentiel PS permet une aide à la saisie des données prescripteurs qui ne seraient pas présentes sur la prescription.

Dans le cadre de la facturation SESAM-Vitale, ce référentiel facilite l’acquisition du N° RPPS.

Ce référentiel est constitué par l’éditeur à partir d’informations fournies par l’ASIP Santé et le GIE SESAM-Vitale.

*05/04/2016 GIE SESAM-Vitale* 
 ![icon: SESAM-Vitale logo](page_5_image_1_v2.jpg) 5 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

# 3 **RECUPERATION DES DIFFERENTS ELEMENTS**

## **Préambule**

L’ASIP Santé propose un service « https://annuaire.sante.fr » regroupant les données de description des professionnels de santé enregistrés dans le RPPS (données d’identité, exercice professionnel, situations d’exercice…).

L’annuaire santé contient un code profession et un code savoir faire qui ne correspondent pas au code spécialité utilisé en facturation SESAM-Vitale. Une table de correspondance permet de convertir le couple code profession / code savoir faire en un code spécialité SESAM-Vitale.

Pour constituer leur référentiel PS, les industriels doivent récupérer :
* l’extraction RPPS mise à disposition par l’ASIP Santé ;
* la table de correspondance des spécialités mise à disposition par le GIE SESAM-Vitale.

## **Extraction RPPS**

Une extraction des données librement consultables est mise à disposition des industriels à l’adresse suivante :

[https://annuaire.sante.fr](https://annuaire.sante.fr/).</u>

Sur ce site, il est possible de télécharger :
* une extraction RPPS libre d’accès ;
* les Spécifications Fonctionnelles et Techniques de cette extraction.

L’extraction RPPS est mise à jour quotidiennement.

Le site propose également une rubrique « Aide et support » qui peut être consultée pour toute question en rapport avec le contenu et le format de cette extraction.

## **Table de correspondance des codes spécialité**

La table de correspondance des codes spécialité peut être téléchargée sur le Portail Industriel du GIE SESAM-Vitale à l’adresse suivante :

[https://industriels.sesam-vitale.fr](https://industriels.sesam-vitale.fr/)

Cette table est mise à jour à chaque création, modification ou suppression d’une spécialité.

## **Communication sur les mises à jour**

Le GIE SESAM-Vitale informera les industriels de la mise à jour :
* de la table de correspondance des spécialités ;
* des Spécifications Fonctionnelles et Techniques de l’extraction RPPS.

La communication sera faite par courrier électronique.

*05/04/2016 GIE SESAM-Vitale* 
 ![icon: icon](page_6_image_1_v2.jpg) 6 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001* *GU - Guide d'intégration et d'utilisation du référentiel PS -* *Version : 1.22*

# 4 **CONSTITUTION DU REFERENTIEL PS**

## **Construction**

L’extraction RPPS contient, entre autre, les informations suivantes :

* Identifiant PP (N° RPPS).
* Code profession.
* Code savoir faire RPPS.
* Numéro FINESS site.
* Nom d’exercice.
* Prénom d’exercice.
* Raison sociale site.

La table de correspondance des spécialités contient, entre autre, les informations suivantes :

* Code profession RPPS.
* Code savoir faire RPPS.
* Code spécialité FNPS.
* Intitulé FNPS.

Le couple code profession RPPS / code savoir faire RPPS permet d’associer à chaque N° RPPS de l’extraction RPPS :

* un code spécialité FNPS,
* un intitulé FNPS ;

issus de la table de correspondance des spécialités.

A partir de l’extraction RPPS et de la table de correspondance des spécialités, l’éditeur peut donc construire un référentiel PS contenant à minima les informations suivantes pour chaque PS :

* N° RPPS.
* Code spécialité FNPS.
* Intitulé FNPS.
* Nom d’exercice.
* Prénom d’exercice.

Et, pour les salariés d’établissements :

* N° FINESS.
* Raison sociale.

La figure 1 ci-dessous décrit la procédure de construction du référentiel PS.

*05/04/2016* *GIE SESAM-Vitale* 
 ![icon: icon](page_7_image_1_v2.jpg) *7 / 9*
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

```mermaid
graph LR
    subgraph Extraction_RPPS [Extraction RPPS]
        direction TB
        E1[Identifiant PP - N° RPPS]
        E2[N° FINESS site]
        E3["Autres données (nom, prénom, raison sociale...)"]
        E4[Code profession]
        E5[Code savoir faire]
        
        ![logo: asipsanté](image_url_placeholder)
    end

    subgraph Sesam_Vitale [ ]
        direction TB
        ![logo: sesam-vitale](image_url_placeholder)
        
        subgraph Table_Correspondance [Table de correspondance des spécialités]
            direction TB
            T1[Code profession RPPS]
            T2[Code savoir faire RPPS]
            T3[Code spécialité FNPS]
            T4[Intitulé FNPS]
        end
    end

    subgraph Referentiel_PS [Référentiel PS]
        direction TB
        R1[N° RPPS]
        R2[N° FINESS]
        R3["Autres données (nom, prénom, raison sociale...)"]
        R4[Code spécialité FNPS]
        R5[Intitulé FNPS]
        
        Editeur[Editeur]
    end

    %% Direct mappings
    E1 --> R1
    E2 --> R2
    E3 --> R3

    %% Mappings through table
    E4 -.-> T1
    E5 -.-> T2
    T3 --> R4
    T4 --> R5

    %% Styling
    style Extraction_RPPS fill:#e1f5fe,stroke:#0288d1,stroke-width:2px
    style Sesam_Vitale fill:#f1f8e9,stroke:#388e3c,stroke-width:2px
    style Referentiel_PS fill:#f3e5f5,stroke:#7b1fa2,stroke-width:2px
    
    style E1 fill:white,stroke:#0288d1
    style E2 fill:white,stroke:#0288d1
    style E3 fill:white,stroke:#0288d1
    style E4 fill:white,stroke:#0288d1
    style E5 fill:white,stroke:#0288d1
    
    style T1 fill:white,stroke:#0288d1
    style T2 fill:white,stroke:#0288d1
    style T3 fill:white,stroke:#0288d1
    style T4 fill:white,stroke:#0288d1
    
    style R1 fill:white,stroke:#0288d1
    style R2 fill:white,stroke:#0288d1
    style R3 fill:white,stroke:#0288d1
    style R4 fill:white,stroke:#0288d1
    style R5 fill:white,stroke:#0288d1

    style Table_Correspondance fill:#4fc3f7,stroke:none,color:white
    style Editeur fill:none,stroke:none,color:#01579b,font-weight:bold
```

**Figure 1 : Constitution du référentiel PS**

**Format**

Le format du référentiel PS utilisé par le progiciel est laissé à la discrétion de l’éditeur.

*05/04/2016 GIE SESAM-Vitale* 
![icon: logo GIE SESAM-Vitale](page_8_image_1_v2.jpg) 8 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*FACT-GU-001 GU - Guide d'intégration et d'utilisation du référentiel PS - Version : 1.22*

## 5 **DIFFUSION DU REFERENTIEL PS**

Chaque éditeur diffuse des mises à jour régulières sur le poste de ses clients.

Le mode de diffusion et la fréquence des mises à jour sont laissés à la discrétion de l’éditeur.

Chaque éditeur doit être en capacité de communiquer la date de la dernière mise à jour du référentiel PS sur les postes de ses clients.

---

## 6 **UTILISATION DU REFERENTIEL PS**

**Dans le cadre du**
**CDC SESAM –**
**Vitale**

Se reporter au Cahier des charges SESAM-Vitale §4.1.2 « Architecture logicielle » et §4.2.1.6 « Acquisition des informations relatives à la prestation ».

Le N° FINESS à utiliser est celui identifié dans l’extraction RPPS de l’ASIP santé par le libellé « N° FINESS <u>site</u> » (à distinguer du « N° FINESS établissement juridique »).

---

**Autres utilisation**
**possible**

L’exploitation du référentiel PS pour des besoins hors Cahier des charges SESAM-Vitale est possible. Il appartient alors à l’éditeur de compléter, si nécessaire, le référentiel PS avec d’autres données provenant de l’extraction RPPS. Les Spécifications Fonctionnelles et Techniques de l’extraction RPPS contiennent la liste des données disponibles.

*05/04/2016 GIE SESAM-Vitale* 
![icon: icon](page_9_image_1_v2.jpg) 9 / 9
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*