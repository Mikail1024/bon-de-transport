logo: sesam-vitale

# TLSi
## *Guide d'implémentation*

# Code exemple en langage C-Sharp

Référence : **SEL-GI-001** / Version : **1.0.0** / Date : **07/01/2025**
Sécurité : **DIFFUSION RESTREINTE**

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des sanctions pour l’auteur du délit.

SEL-GI-001
Code exemple en langage C-Sharp
Version : 1.0.0

# Historique des versions

<table>
  <thead>
    <tr>
      <th>Date</th>
      <th>Version</th>
      <th>Évolution du document</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>07/01/2025</td>
      <td>1.0.0</td>
      <td>Initialisation du document</td>
    </tr>
  </tbody>
</table>

07/01/2025
GIE SESAM-Vitale 
icon: icon
3 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001
Code exemple en langage C-Sharp
Version : 1.0.0

# Tables des matières

<table>
    <tr>
      <td><b>1</b></td>
      <td><b>Introduction ...............................................................................................................................................5</b></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>Pré-requis ............................................................................................................................................5</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>Documents externes ...........................................................................................................................5</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>Contenu du document .........................................................................................................................5</td>
    </tr>
    <tr>
      <td>1.4</td>
      <td>Avertissement......................................................................................................................................5</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>Contenu du code exemple en C-Sharp ...................................................................................................6</b></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>Description des packages du projet exemple TLSi_AssertionLibrary.................................................6</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>Description des packages du code exemple.......................................................................................6</td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.1 Racine TLSi_AssertionLibrary................................................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.2 Package TLSi_AssertionLibrary.cps ......................................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.3 Package TLSi_AssertionLibrary.psc ......................................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.4 Package TLSi_AssertionLibrary.saml ....................................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.5 Package TLSi_AssertionLibrary.structure ..............................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.6 Package TLSi_AssertionLibrary.tlsm .....................................................................................6</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>2.2.7 Package TLSi_AssertionLibrary.vitale....................................................................................7</i></td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>Description détaillée des classes du code exemple ...........................................................................7</td>
    </tr>
    <tr>
      <td><b>3</b></td>
      <td><b>Contenu du code exemple .......................................................................................................................8</b></td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>Description des packages du code exemple TLSINSi ........................................................................8</td>
    </tr>
    <tr>
      <td></td>
      <td><i>3.1.1 Package TSINSi .....................................................................................................................8</i></td>
    </tr>
    <tr>
      <td></td>
      <td><i>3.1.2 Package TLSINSi.certificat.....................................................................................................8</i></td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>Description détaillée des classes du code exemple TLSINSi .............................................................8</td>
    </tr>
    <tr>
      <td><b>4</b></td>
      <td><b>Modes d’authentification..........................................................................................................................9</b></td>
    </tr>
    <tr>
      <td><b>5</b></td>
      <td><b>Génération des classes ..........................................................................................................................10</b></td>
    </tr>
    <tr>
      <td>5.1</td>
      <td>Génération avec Visual Studio ..........................................................................................................10</td>
    </tr>
    <tr>
      <td>5.2</td>
      <td>Webservices ......................................................................................................................................10</td>
    </tr>
    <tr>
      <td><b>6</b></td>
      <td><b>Compilation du projet à partir des sources .........................................................................................10</b></td>
    </tr>
    <tr>
      <td>6.1</td>
      <td>Pré-requis ..........................................................................................................................................10</td>
    </tr>
    <tr>
      <td>6.2</td>
      <td>Compilation du projet avec Visual Studio..........................................................................................10</td>
    </tr>
    <tr>
      <td>6.3</td>
      <td>Exécution du projet............................................................................................................................10</td>
    </tr>
    <tr>
      <td>6.4</td>
      <td>Exécution avec la carte CPS (authentification directe) .....................................................................10</td>
    </tr>
    <tr>
      <td>6.5</td>
      <td>Exécution avec la carte Vitale ...........................................................................................................10</td>
    </tr>
</table>

07/01/2025
GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo
4 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

# 1 Introduction

## 1.1 **Pré-requis**

La lecture des spécifications du service ainsi que du cadre d’interopérabilité AMO est un pré-requis à la compréhension du code exemple.

## 1.2 **Documents externes**

Le tableau ci-dessous récapitule les principaux documents applicables. Dans l’ensemble du document, ils sont désignés par le code apparaissant dans la colonne « Référence ».

<table>
  <thead>
    <tr>
      <th>Référence</th>
      <th>Document</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>CI</td>
      <td>CI-TLSi_AMO_V1.2.2</td>
    </tr>
    <tr>
      <td>ANX-WSDL</td>
      <td>Archive zip SCHÉMAS ET WSDL ASSOCIÉS :<br />CONTRAT_ICIR_EXP_1.5.0</td>
    </tr>
    <tr>
      <td>SFG/GI</td>
      <td>SEL-MP-043_04-00-02_INSi</td>
    </tr>
    <tr>
      <td>MICA-MP-001</td>
      <td>Manuel de programmation MICA 4.01.00</td>
    </tr>
  </tbody>
</table>

## 1.3 **Contenu du document**

Dans ce document sont expliqués les mécanismes utilisés pour accomplir différents appels au téléservice et les différents modes d’authentification :

*   TLSi_AssertionLibrary : fabrique d’assertion signée ou non signée
    *   CPS
    *   VITALE
    *   Structure
    *   PSC (proSantéConnect)
    *   Signature
*   TLSINSI : implémentation exemple de l’INSi – fonction de recherche
    *   Recherche par carte vitale
    *   Recherche par traits d’identité

## 1.4 **Avertissement**

Les codes sources sont fournis « tels quels », sans support.

icon: warning La mise à disposition du code exemple ne saurait être interprétée comme un quelconque transfert des droits de propriété sur celui-ci.

L’utilisateur désigne ci-après l’entité destinataire du code exemple.

L’attention de l’utilisateur est appelée sur les modalités d’utilisation du code exemple.

Ce dernier est fourni à titre d’information permettant à l’utilisateur de réaliser librement l’adaptation personnalisée nécessaire à la création de l’interfaçage de son logiciel.

Le code exemple est transmis en son état de développement sans garantie, il n'a notamment pas fait l'objet de qualification sécuritaire.

07/01/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale 5 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

Le code exemple ne fait l'objet d'aucune maintenance.

L’utilisateur est seul responsable des bonnes conditions de son utilisation et libre de s’inspirer des éléments fournis et de les adapter par ses propres moyens à la situation particulière de la solution logicielle qu’il développe.

Ainsi, il est déconseillé de procéder par voie de copier-coller du code à partir des exemples fournis.

L’éditeur **DOIT** adapter le code exemple fourni à son propre usage : les données fournies dans les flux exemples n’étant pas représentatives d’une utilisation en situation de production (certaines données sont renseignées « en dur » à titre d’exemple).

Il convient également de prendre en compte les contraintes techniques comme la présence d’un proxy sur le réseau.

# 2 Contenu du code exemple en C-Sharp

La solution TLSi_ICIR est composée de deux projets :

*   TLSi_AssertionLibrary: ce projet implémente les différentes assertions
*   TLSINSI : ce projet implémente le service de recherche d’INS.

## 2.1 Description des packages du projet exemple TLSi_AssertionLibrary

La libraire ClientTLSi-Assertion permet de mutualiser les classes de génération d’assertions pour faciliter leur usage dans les multiples TLSi AMO.

## 2.2 Description des packages du code exemple

### 2.2.1 Racine TLSi_AssertionLibrary

La classe AssertionFactory est le point d’entrée dans la librairie pour la génération des assertions.

La classe AssertionMessageInspector est permet d’effectuer des actions sur la trame juste avant l’envoi du message ou à sa réception.

### 2.2.2 Package TLSi_AssertionLibrary.cps

Le package contient les classes nécessaires à la génération d’assertion CPS

### 2.2.3 Package TLSi_AssertionLibrary.psc

Le package contient les classes nécessaires à la génération d’assertion CPS dans le cadre de Pro Santé Connect.

### 2.2.4 Package TLSi_AssertionLibrary.saml

Le package contient les classes nécessaires à la création d’assertions PS et Vitale.

### 2.2.5 Package TLSi_AssertionLibrary.structure

Le package contient les classes nécessaires à la génération d’assertion Structure.

### 2.2.6 Package TLSi_AssertionLibrary.tlsm

Le package contient des classes nécessaires à la génération d’assertion par certificats mutuels.

07/01/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo 6 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

## 2.2.7 **Package TLSi_AssertionLibrary.vitale**

Le package contient les classes nécessaires à la génération d’assertion Vitale.

## 2.3 Description détaillée des classes du code exemple

<table>
  <thead>
    <tr>
      <th>Nom du package</th>
      <th>Nom de la classe java</th>
      <th>Fonction</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary</td>
      <td>Package contenant la fabrique à assertion</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionFactory.cs</td>
      <td>Classe utilisée comme point d’entrée pour la génération d’assertion.</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionException.cs</td>
      <td>Classe pour la gestion des exceptions levées à la génération d’assertions.</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionMessageInspector.cs</td>
      <td>Inpecteur de message devant ajouter les assertions PS et Vitale dans le header Security du message requête du TLSi</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.cps</td>
      <td>Package pour la génération d’assertion CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>TLSi_AssertionLibrary.cps.cryptoki</td>
      <td>Package permettant de récupérer toutes les informations de la carte CPS à partir de la CryptoLib CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs11.java</td>
      <td>Classe qui charge les certificats de la carte CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>SamlPsAssertion.cs</td>
      <td>Construction d'une Assertion CPS au standard SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>PsSignatureProvider.cs</td>
      <td>Fabrique de signature CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>SaisieCodePorteur.cs</td>
      <td>Classe pour une saisie via une boîte de dialogue du code porteur de la carte CPS.</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.psc</td>
      <td>Package pour la génération d’assertion Pro Santé Connect</td>
    </tr>
    <tr>
      <td></td>
      <td>SamlPscAssertion.cs</td>
      <td>Construction d'une Assertion Pro Santé Connect au standard SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>AccesTokenAMOService.cs</td>
      <td>Classe permettant la récupération d'un jeton AMO à partir d'un jeton PSC</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.saml</td>
      <td>Package contenant les composants de base pour la génération d’une assertion SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>SamlAssertion.cs</td>
      <td>Classe de base de création d'une assertion SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>SamlAttribute.cs</td>
      <td><u>Classe de gestion d'un attribut SAML dans une assertion</u></td>
    </tr>
    <tr>
      <td></td>
      <td>SamlAttributeStatement.cs</td>
      <td>Classe de gestion de l'élément SAML AttributeStatement contenant les attributs d'une assertion</td>
    </tr>
    <tr>
      <td></td>
      <td>SignatureProvider.cs</td>
      <td>Génération de l'objet XML-Signature d'un document</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.structure</td>
      <td>Package pour la génération d’assertion Structure</td>
    </tr>
    <tr>
      <td></td>
      <td>INIFile.cs</td>
      <td>Classe permettant de charger le fichier « ini » contenant les informations de configuration</td>
    </tr>
    <tr>
      <td></td>
      <td>MyXmlWriter.cs</td>
      <td>Classe permettant d’écrire dans un XML</td>
    </tr>
    <tr>
      <td></td>
      <td>RSAPKCS11SHA256SignatureDescription.cs</td>
      <td>Class définissant l’algorithme de signature</td>
    </tr>
    <tr>
      <td></td>
      <td>StructureAssertion.cs</td>
      <td>Construction d'une Assertion Structure au standard SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>structure.ini</td>
      <td>Fichier exemple pour la configuration nécessaire à la génération d’une assertion Structure</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.tlsm</td>
      <td>Package pour la génération d’assertion TLS Mutuel</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs12.cs</td>
      <td>Classe qui charge le certificat à partir du certificat logiciel</td>
    </tr>
    <tr>
      <td colspan="2">TLSi_AssertionLibrary.vitale</td>
      <td>Package pour la génération d’assertion Vitale</td>
    </tr>
    <tr>
      <td></td>
      <td>CarteVitale.cs</td>
      <td>Informations d'une carte Vitale</td>
    </tr>
  </tbody>
</table>

07/01/2025 GIE SESAM-Vitale icon: SESAM-Vitale logo 7 / 10

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

<table>
<tr>
<td>Mica.cs</td>
<td>Classe permettant de contrôler la présence de la carte<br />vitale et de faire une signature vitale</td>
</tr>
<tr>
<td>SamlVitaleAssertion.cs</td>
<td>Construction d'une assertion Vitale au standard SAML</td>
</tr>
<tr>
<td>UnsafeMicaMethods.cs</td>
<td>Classe permettant d’appeler les méthodes de la classe<br />mica.cs</td>
</tr>
<tr>
<td>VitaleSignatureProvider.cs</td>
<td>Fabrique de signature Vitale</td>
</tr>
</table>

# **3 Contenu du code exemple**

Le code exemple propose l’implémentation d’un appel aux webservices INSi ICIR en se focalisant sur la génération des assertions SAML.

## **3.1 Description des packages du code exemple TLSINSi**

### **3.1.1 Package TSINSi**

Le package contient les principales classes du code exemple.

### **3.1.2 Package TLSINSi.certificat**

Le package contient les classes pour la gestion de certificats.

## **3.2 Description détaillée des classes du code exemple TLSINSi**

<table>
  <thead>
    <tr>
      <th>Nom du package</th>
      <th>Nom de la classe C#</th>
      <th>Fonction</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="2">TLSINSi</td>
      <td>Package principale pour le code exemple</td>
    </tr>
    <tr>
      <td></td>
      <td>Program.cs</td>
      <td>Classe de démarrage, appelant PatientINS.cs</td>
    </tr>
    <tr>
      <td></td>
      <td>PatientINS.cs</td>
      <td>Classe contenant la fonction principale pour l’exécution du code exemple</td>
    </tr>
    <tr>
      <td colspan="2">TLSINSi.certificat</td>
      <td>Package pour la gestion des certificats</td>
    </tr>
    <tr>
      <td></td>
      <td>CertificatHelper.cs</td>
      <td>Composant pour initialiser et vérifier le certificat en fonction du mode d’authentification</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs11.cs</td>
      <td>Composant pour charger les certificats à partir de la carte CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs12.cs</td>
      <td>Composant pour charger le certificat à partir du fichier *.p12</td>
    </tr>
  </tbody>
</table>

07/01/2025 GIE SESAM-Vitale 
 icon: SESAM-Vitale logo 8 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

# 4 Modes d’authentification

Il existe trois modes d’authentification, l’authentification avec la carte CPS (authentification directe), l’authentification avec un certificats établissement (authentification indirecte) et l’authentification PSC (authentification directe avec Pro Santé Connect).

Il convient d’adapter la configuration en fonction du mode d’authentification :

- Le choix de l’URL du webservice
- Les certificats logiciels à exploiter
- Le chemin vers la cryptolib CPS installée sur le poste

07/01/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo 9 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-001 Code exemple en langage C-Sharp Version : 1.0.0

# 5 Génération des classes

Les classes ont été générées depuis le WSDL fournis avec le package documentaire INSi à l’aide de l’utilitaire intégré à Visual Studio.

## 5.1 Génération avec Visual Studio

Projet->Ajouter Une référence de service.

Entrer l'URL de votre WSDL, choisissez un nom de référence puis Ajouter la référence.

La génération est ensuite effectuée et les objets générés sont placés dans le namespace portant le nom choisi ci-dessus.

## 5.2 Webservices

Le code exemple propose l’implémentation des fonctions de recherche INSi (ICIR) :

- rechercherInsAvecTraitsIdentite
- rechercherInsAvecCarteVitale

# 6 Compilation du projet à partir des sources

## 6.1 Pré-requis

Pour compiler le projet, vous devez disposer de .NET 4.8 et de Visual Studio 2022 minimum. Il est malgré tout possible que la solution fonctionne avec d’autres configurations.

icon: arrow Il faut bien évidemment posséder également l’archive du projet, et l’avoir décompressée.

## 6.2 Compilation du projet avec Visual Studio

Afin de compiler le projet avec Visual Studio, il faut tout d’abord l’ouvrir. Un double-clic sur TLSI_ICIR_v1.00.sln à la racine du dossier précédemment décompressé suffit si Visual Studio est correctement installé.

## 6.3 Exécution du projet

Une fois le projet compilé, il suffit de cliquer sur l’icône « Run » de Visual Studio pour le lancer.

## 6.4 Exécution avec la carte CPS (authentification directe)

Afin de pouvoir exécuter les exemples en authentification DIRECTE, il est nécessaire d’utiliser idéalement la dernière version de la Cryptolib (5.2.2).

## 6.5 Exécution avec la carte Vitale

Afin de pouvoir exécuter les exemples de recherche par carte Vitale, il est nécessaire d’utiliser la version 4.01.00 de MICA en 64 bits.

Cette version doit être installée dans C:\Program Files\santesocial\mica\.

07/01/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale 10 / 10
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale