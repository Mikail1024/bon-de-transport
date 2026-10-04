logo: sesam-vitale

logo: **FTE**

*Spécifications Fonctionnelles Générales*

# **Facturation Transporteur Etendue**
# ***Taxi***

## **FTE06 - Superviser le poste PS**

Référence : FACT-SFG-060 / Version : 03.36 / Date : 20/05/2026
Diffusion : RESTREINTE
État : PROVISOIRE



VERSION DE TRAVAIL

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72 019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Ce document a été élaboré par le GIE SESAM-Vitale.

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

**Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles **L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des** sanctions pour l’auteur du délit.**

## **CONTACTS**

icon: sesam-vitale

Pour toute demande d'évolution, comme pour toute question technique ou fonctionnelle, contactez le Centre de services :

*   portail IRIS : [https://portail-support.sesam-vitale.fr/](https://portail-support.sesam-vitale.fr/)
*   téléphone : 02 43 57 42 88

VERSION DE TRAVAIL

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-060 *FTE06 - Superviser le poste PS Version : 03.36*

# **TABLES DES MATIERES**

<table>
    <tr>
      <td><strong>1</strong></td>
      <td><strong>INTRODUCTION .........................................................................................................................................</strong></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>OBJECTIF DU DOCUMENT .......................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>STATUT DU DOCUMENT ..........................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>POSITIONNEMENT DU DOCUMENT............................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.4</td>
      <td>CONTENU DU DOCUMENT .......................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.5</td>
      <td>DOCUMENTS DE RÉFÉRENCE ..................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.6</td>
      <td>ABRÉVIATIONS.......................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.7</td>
      <td>DÉFINITIONS..........................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td>1.8</td>
      <td>GUIDE DE LECTURE................................................................................................................................</td>
      <td>4</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td><strong>PRÉSENTATION DU SOUS-PROCESSUS FTE06 ...................................................................................</strong></td>
      <td><strong>5</strong></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>POSITIONNEMENT DU SOUS-PROCESSUS FTE06 .....................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>PRÉSENTATION GÉNÉRALE DU SOUS-PROCESSUS FTE06 : SUPERVISER LE POSTE PS .............................</td>
      <td>5</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>DESCRIPTION DÉTAILLÉE DES FONCTIONS DU SOUS-PROCESSUS FTE06 : SUPERVISER LE POSTE PS .......</td>
      <td>5</td>
    </tr>
    <tr>
      <td></td>
      <td>    <em>2.3.1 FTE06.01 : Règles de supervision du délai d’envoi des PJ ...................................................</em></td>
      <td><em>5</em></td>
    </tr>
</table>




VERSION DE TRAVAIL

*20/05/2026* 3 / 5
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: dots

*SFG - Facturation Transporteur Etendue - Taxi*
FACT-SFG-060 *FTE06 - Superviser le poste PS Version : 03.36*

# **1 Introduction**

## **1.1 Objectif du document**
Ce document a pour but de spécifier la fonctionnalité « FTE05 : Administrer le poste PS ».

## **1.2 Statut du document**
Ces SFG sont en version provisoire et référencée.

## **1.3 Positionnement du document**
Ce document fait partie du corpus documentaire des SFG du système de Facturation Transporteur Etendue **(FTE)**.

## **1.4 Contenu du document**
Outre ce chapitre introductif, ce document de spécifications fonctionnelles générales présente les règles de paramétrage des données du système FTE.

## **1.5 Documents de référence**

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
      <td>[DICO]</td>
      <td>Dictionnaire du système FTE</td>
      <td>FACT-SFG-029</td>
    </tr>
    <tr>
      <td>[PG]</td>
      <td>Présentation Générale du système FTE</td>
      <td>FACT-SFG-030</td>
    </tr>
    <tr>
      <td>[FTE02]</td>
      <td>FTE02-Facturer des Prestations</td>
      <td>FACT-SFG-032</td>
    </tr>
    <tr>
      <td>[B2]</td>
      <td>Norme B2</td>
      <td></td>
    </tr>
  </tbody>
</table>

## **1.6 Abréviations**
Cf. Document FACT-SFG-029 : Dictionnaire.

## **1.7 Définitions**
Cf. Document FACT-SFG-029 : Dictionnaire.

## **1.8 Guide de lecture**
Cf. Document FACT-SFG-030 : PG-Annexe 1 : Guide de lecture.




VERSION DE TRAVAIL

*20/05/2026* 4 / 5
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: dots

*SFG - Facturation Transporteur Etendue - Taxi*
*FACT-SFG-060 FTE06 - Superviser le poste PS Version : 03.36*

# **2 Présentation du sous-processus FTE06**

## **2.1 Positionnement du sous-processus FTE06**

Le sous-processus FTE06 : SUPERVISER ne fait pas partie à part entière du processus principal de facturation : il constitue un ensemble de fonctionnalités indépendantes.

## **2.2 Présentation générale du sous-processus FTE06 : Superviser le poste PS**

**Vue générale**

**Description** Le Poste de Travail veille au respect des délais maximum
**Entrées** Données de supervision DF_FTE_SPV
Données générales du système FTE DF_FTE_GEN
Données adjointes à la FEL DF_FTE_ADJ-FEL
Facture B2 cf. [B2]
**Sorties** Données de supervision DF_FTE_SPV
**Situations spécifiques** Aucune

## **2.3 Description détaillée des fonctions du sous-processus FTE06 : Superviser le poste PS**

### **2.3.1 FTE06.01 : Règles de supervision du délai d’envoi des PJ**

**Vue générale**

**Description** Cette opération a pour objet de détecter les lots de PJ SCOR non transmis dans les délais et de signaler le retard au PS
**Entrées** SCOR- Données niveau Lot de FE EF_FTE84
Facture B2 cf. [B2]
**Sorties** Aucune
**Situations spécifiques** Aucune

**Règles de gestion**

***[RG_FTE661] Détecter les lots de FE pour lesquels aucun lot de PJ n’a été envoyé et alerter le PS.***

Pour chaque lot de FE enregistré (EF_FTE84_01) pour lequel le lot de PJ correspondant n’a pas été émis (EF_FTE84_05 = « Non émis »), si le délai entre la date de création du lot de FE (EF_FTE84_02) et la date du jour est supérieur au délai maximum (EF_FTE92_11), un signalement est déclenché sur le Poste de Travail. Ce signalement indiquera à minima le numéro de lot de FE concerné.




VERSION DE TRAVAIL

*20/05/2026 5 / 5*
*Ce document ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

icon: dots