logo: sesam-vitale

# TLSi
*Guide d'implémentation*

# Code exemple en
# langage JAVA

Référence : **SEL-GI-002** / Version : **1.0.0**/ Date : **06/03/2025**
Sécurité : **DIFFUSION RESTREINTE**

**GIE SESAM-Vitale**
5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u>

Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement, quel que soit le procédé utilisé.

Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des sanctions pour l’auteur du délit.

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

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
      <td>06/03/2025</td>
      <td>V 1.0.0</td>
      <td>Version initiale du document</td>
    </tr>
  </tbody>
</table>

06/03/2025 GIE SESAM-Vitale 
icon: icon 3 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002
Code exemple en langage JAVA
Version : 1.0.0

<table>
  <caption>Tables des matières</caption>
    <tr>
      <td><b>1</b></td>
      <td><b>Introduction ...............................................................................................................................5</b></td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>Pré-requis ............................................................................................................................................ 5</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>Documents et annexes externes......................................................................................................... 5</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>Contenu du document ......................................................................................................................... 5</td>
    </tr>
    <tr>
      <td>1.4</td>
      <td>Avertissement...................................................................................................................................... 5</td>
    </tr>
    <tr>
      <td><b>2</b></td>
      <td><b>Contenu du code exemple .......................................................................................................6</b></td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>Description des dossiers ..................................................................................................................... 6</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>Description des packages du code exemple....................................................................................... 6</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2.1 <i>Package fr.sesamvitale.lps</i>..................................................................................................... 6</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2.2 <i>Package fr.sesamvitale.pkcs12</i>.............................................................................................. 7</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2.3 <i>Package fr.sesamvitale.psc</i>.................................................................................................... 7</td>
    </tr>
    <tr>
      <td></td>
      <td>2.2.4 <i>Package fr.sesamvitale.util</i>..................................................................................................... 7</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>Description détaillée des classes du code exemple ........................................................................... 7</td>
    </tr>
    <tr>
      <td>2.4</td>
      <td>Dossier src/main/resources................................................................................................................. 8</td>
    </tr>
    <tr>
      <td><b>3</b></td>
      <td><b>Librairie ClientTLSi-Assertion .................................................................................................8</b></td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>Description des dossiers ..................................................................................................................... 8</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>Description des packages du code exemple....................................................................................... 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.1 <i>Package fr.santesocial.assertion</i>............................................................................................ 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.2 <i>Package fr.santesocial.assertion.commun</i>............................................................................. 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.3 <i>Package fr.santesocial.assertion.cps</i> ..................................................................................... 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.4 <i>Package fr.santesocial.assertion.psc</i> ..................................................................................... 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.5 <i>Package fr.santesocial.assertion.structure</i> ............................................................................ 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.6 <i>Package fr.santesocial.assertion.util</i> ...................................................................................... 8</td>
    </tr>
    <tr>
      <td></td>
      <td>3.2.7 <i>Package fr.santesocial.assertion.vitale</i> .................................................................................. 9</td>
    </tr>
    <tr>
      <td>3.3</td>
      <td>Description détaillée des classes du code exemple ........................................................................... 9</td>
    </tr>
    <tr>
      <td>3.4</td>
      <td>Fichiers à la racine du projet ............................................................................................................. 10</td>
    </tr>
    <tr>
      <td><b>4</b></td>
      <td><b>Authentifications .....................................................................................................................10</b></td>
    </tr>
    <tr>
      <td><b>5</b></td>
      <td><b>Webservices ............................................................................................................................10</b></td>
    </tr>
    <tr>
      <td><b>6</b></td>
      <td><b>Compilation du projet à partir des sources .........................................................................10</b></td>
    </tr>
    <tr>
      <td>6.1</td>
      <td>Pré-requis .......................................................................................................................................... 10</td>
    </tr>
    <tr>
      <td>6.2</td>
      <td>Génération des classes Java ............................................................................................................ 10</td>
    </tr>
    <tr>
      <td>6.3</td>
      <td>Compilation du projet avec Eclipse ................................................................................................... 11</td>
    </tr>
    <tr>
      <td></td>
      <td>6.3.1 <i>Installation de Eclipse</i>........................................................................................................... 11</td>
    </tr>
    <tr>
      <td></td>
      <td>6.3.2 <i>Librairies dépendantes</i> ......................................................................................................... 11</td>
    </tr>
    <tr>
      <td></td>
      <td>    6.3.2.1 Projet ClientTLSi-Assertion .................................................................................................. 11</td>
    </tr>
    <tr>
      <td></td>
      <td>    6.3.2.2 Projet tls_icir......................................................................................................................... 11</td>
    </tr>
    <tr>
      <td></td>
      <td>6.3.3 <i>Import du projet sous Eclipse</i> ............................................................................................... 12</td>
    </tr>
    <tr>
      <td></td>
      <td>6.3.4 <i>Compilation et exécution sous Eclipse</i> ................................................................................. 12</td>
    </tr>
    <tr>
      <td>6.4</td>
      <td>Exécution avec la carte CPS (authentification directe) ..................................................................... 12</td>
    </tr>
    <tr>
      <td>6.5</td>
      <td>Exécution avec la carte Vitale ........................................................................................................... 12</td>
    </tr>
</table>

06/03/2025
GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo 4 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002
Code exemple en langage JAVA
Version : 1.0.0

# **1 Introduction**

## **1.1 Pré-requis**

La lecture des spécifications d’interfaces du Service ainsi que du Cadre d’interopérabilité AMO est un pré-requis à la compréhension du code exemple.

## **1.2 Documents et annexes externes**

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

## **1.3 Contenu du document**

Le document propose de décrire les deux composants proposés comme code exemple pour l’implémentation des appels aux webservices de recherche INSi ICIR :

- Le projet d’appel aux webservices en lui-même avec plusieurs modes d’authentification
- La librairie ClientTLSi-Assertion pour la mutualisation de la génération d’assertion conforme au cadre d’interopérabilité AMO

Le document fournit également les informations pour le paramétrage et l’exécution de ce code exemple.

## **1.4 Avertissement**

Les codes sources sont fournis « tels quels », sans support.

icon: exclamation mark La mise à disposition du code exemple ne saurait être interprétée comme un quelconque transfert des droits de propriété sur celui-ci.

L’utilisateur désigne ci-après l’entité destinataire du code exemple.

L’attention de l’utilisateur est appelée sur les modalités d’utilisation du code exemple.

Ce dernier est fourni à titre d’information permettant à l’utilisateur de réaliser librement l’adaptation personnalisée nécessaire à la création de l’interfaçage de son logiciel.

Le code exemple est transmis en son état de développement sans garantie, il n'a notamment pas fait l'objet de qualification sécuritaire.

Le code exemple ne fait l'objet d'aucune maintenance.

L’utilisateur est seul responsable des bonnes conditions de son utilisation et libre de s’inspirer des éléments fournis et de les adapter par ses propres moyens à la situation particulière de la solution logicielle qu’il développe.

Ainsi, il est déconseillé de procéder par voie de copier-coller du code à partir des exemples fournis.

L’éditeur **DOIT** adapter le code exemple fourni à son propre usage : les données fournies dans les flux exemples n’étant pas représentatives d’une utilisation en situation de production (certaines données sont renseignées « en dur » à titre d’exemple).

06/03/2025
GIE SESAM-Vitale 
 icon: GIE SESAM-Vitale logo
5 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002
Code exemple en langage JAVA
Version : 1.0.0

Il convient également de prendre en compte les contraintes techniques comme la présence d’un proxy sur le réseau.

# 2 Contenu du code exemple

Le code exemple propose l’implémentation d’un appel aux webservices INSi ICIR en se focalisant sur la génération des assertions SAML.

Le corps des requêtes est alimenté à partir de contenus statiques présents dans des fichiers *.xml.

## 2.1 Description des dossiers

<table>
    <tr>
      <td>ac_ans</td>
      <td>Contient les fichiers utilisés pour vérifier le certificat du serveur lors de l’authentification mutuelle</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Certificates</td>
      <td>A pour objectif de contenir les certificats utilisés pour l’authentification mutuelle dans le cadre de Pro Santé Connect<br /><br />Doit être alimenter par l’utilisateur du code exemple</td>
    </tr>
    <tr>
      <td>Certificates\INSI-AUTO</td>
      <td>A pour objectif de contenir les certificats utilisés pour l'authentification mutuelle INSi pour «TLS-Mutuelle »<br /><br />Doit être alimenter par l’utilisateur du code exemple</td>
    </tr>
    <tr>
      <td>Certificates\INSI-MANU</td>
      <td>A pour objectif de contenir les certificats utilisés pour l'authentification mutuelle INSi pour «TLS-Mutuelle »<br /><br />Doit être alimenter par l’utilisateur du code exemple</td>
    </tr>
    <tr>
      <td>Certificates\INSI-PSC</td>
      <td>A pour objectif de contenir les certificats utilisés pour l'authentification mutuelle INSi pour « TODO TLS-Mutuelle » dans le cadre de Pro Santé Connect<br /><br />Doit être alimenter par l’utilisateur du code exemple</td>
    </tr>
    <tr>
      <td>Config</td>
      <td>Contient les fichiers de configuration. Actuellement, le fichier « pkcs11w64.p11 » contient la configuration de l’interface PKCS#11</td>
    </tr>
    <tr>
      <td>src\main\java</td>
      <td>Dossier contenant les sources des classes java d’exemples</td>
    </tr>
    <tr>
      <td>src\main\resources</td>
      <td>Dossier contenant les ressources utiles à l’exécution des classes d’exemples (fichiers de configurations, ...)</td>
    </tr>
    <tr>
      <td>src\test\java</td>
      <td>Dossier contenant les sources des classes java des tests JUnit des services (permet l’exécution des web-services)</td>
    </tr>
    <tr>
      <td>Target\classes</td>
      <td>Dossier de compilation des classes (créé lors de la première compilation du projet)</td>
    </tr>
    <tr>
      <td>Target\generated-sources</td>
      <td>Dossier contenant les sources des classes générées à partie des wsdl et de fichier de trace pour debug de flux</td>
    </tr>
    <tr>
      <td>assertions</td>
      <td>Dossier historiquement nécessaire au projet</td>
    </tr>
</table>

## 2.2 Description des packages du code exemple

### 2.2.1 Package fr.sesamvitale.lps

Le package contient les principales classes du code exemple.

06/03/2025
GIE SESAM-Vitale 
 icon: GIE SESAM-Vitale logo 6 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

## 2.2.2 **Package fr.sesamvitale.pkcs12**

Le package contient les classes pour la gestion de certificats PKCS#12.

## 2.2.3 **Package fr.sesamvitale.psc**

Le package contient les classes pour la gestion de l’authentification Pro Santé Connect.

## 2.2.4 **Package fr.sesamvitale.util**

Le package contient des classes utilitaires.

## 2.3 **Description détaillée des classes du code exemple**

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
      <td colspan="2">fr.sesamvitale.lps</td>
      <td>Package principale pour le code exemple</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionPSCHandler.java</td>
      <td>Handler SOAP pour l’intégration d’une assertion<br />PSC dans les requêtes</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionPSHandler.java</td>
      <td>Handler SOAP pour l’intégration d’une assertion<br />CPS dans les requêtes</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionVitaleHandler.java</td>
      <td>Handler SOAP pour l’intégration d’une assertion<br />Vitale dans les requêtes</td>
    </tr>
    <tr>
      <td></td>
      <td>GetINS.java</td>
      <td>Classe contenant la fonction principale pour<br />l’exécution du code exemple</td>
    </tr>
    <tr>
      <td></td>
      <td>MyTrustManager.java</td>
      <td>Composant pour vérifier le certificat proposé par le<br />serveur dans le cadre de l’authentification<br />mutuelle</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionException.java</td>
      <td>Classe pour la gestion des exceptions levées à la<br />génération d’assertions.</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionPSBuilder.java</td>
      <td>Alternative de génération d’une assertion CPS,<br />n’est pas utilisé dans le code exemple</td>
    </tr>
    <tr>
      <td colspan="2">fr.sesamvitale.pkcs12</td>
      <td>Package pour la gestion de l’authentification<br />mutuelle avec un certificat *.p12</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs12.java</td>
      <td>Interface pour la gestion de l’authentification<br />mutuelle avec un certificat *.p12</td>
    </tr>
    <tr>
      <td></td>
      <td>Pkcs12Impl.java</td>
      <td>Implémentation par défaut de l’interface pour la<br />gestion de l’authentification mutuelle avec un<br />certificat *.p12</td>
    </tr>
    <tr>
      <td colspan="2">fr.sesamvitale.psc</td>
      <td>Package dédié à la prise en compte des spécificités<br />Pro Santé Connect</td>
    </tr>
    <tr>
      <td></td>
      <td>ProxyJetonAM.java</td>
      <td>Proxy pour obtenir le jeton AM nécessaire pour le<br />mode d'authentification via Pro Santé Connect</td>
    </tr>
    <tr>
      <td></td>
      <td>PscTrustManager.java</td>
      <td>Trust-manager pour l'authentification mutuelle Pro<br />Sant Connect</td>
    </tr>
    <tr>
      <td colspan="2">fr.sesamvitale.util</td>
      <td>Package contenant des classes utilitaires</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionSoapLogger.java</td>
      <td>Handler SOAP pour la gestion des traces des<br />requêtes et des réponses aux webservices.<br />Fonctionne avec Log.java</td>
    </tr>
    <tr>
      <td></td>
      <td>Log.java</td>
      <td>Composant pour la gestion des traces des requêtes<br />et des réponses aux webservices</td>
    </tr>
    <tr>
      <td></td>
      <td>SSLKeyManagers.java</td>
      <td>Gestionnaire de clé pour l'établissement du canal<br />SSL</td>
    </tr>
    <tr>
      <td></td>
      <td>TestCaractere.java</td>
      <td>Classe utilitaire historiquement présente dans le<br />code, nécessaire pour la manipulation de<br />caractères dans le cadre de la génération<br />d’assertions.</td>
    </tr>
  </tbody>
</table>

06/03/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo 7 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

## 2.4 Dossier src/main/resources

Ce répertoire a pour rôle de recevoir le fichier *.wsdl et les fichiers *.xsd du webservice dans un sous-répertoire « wsdl » afin de permettre de générer les sources nécessaires à l’appel du webservice du code exemple.

# 3 Librairie ClientTLSi-Assertion

La libraire ClientTLSi-Assertion permet de mutualiser les classes de génération d’assertions pour faciliter leur usage dans les multiples TLSi AMO.

## 3.1 Description des dossiers

<table>
<tr>
<td>src\main\java</td>
<td>Dossier contenant les sources des classes java</td>
</tr>
<tr>
<td>src\main\resources</td>
<td>Dossier contenant les ressources utiles à l’exécution des classes (fichiers<br />de configurations, ...)</td>
</tr>
<tr>
<td>src\test\java</td>
<td>Dossier contenant les sources des classes java des tests JUnit des services<br />(permet l’exécution des web-services)</td>
</tr>
<tr>
<td>src\test\resources</td>
<td>Dossier contenant les ressources utiles à l’exécution des tests JUnit<br />(fichiers de configurations, ...)</td>
</tr>
<tr>
<td>target</td>
<td>Dossier de compilation Maven</td>
</tr>
</table>

## 3.2 Description des packages du code exemple

### 3.2.1 Package fr.santesocial.assertion

La classe AssertionFactory est le point d’entrée dans la librairie pour la génération des assertions.

A noter que cette classe n’est pas utilisée dans le code exemple INSi ICIR.

### 3.2.2 Package fr.santesocial.assertion.commun

Le package contient le code partagé par l’ensemble des assertions.

### 3.2.3 Package fr.santesocial.assertion.cps

Le package contient les classes nécessaires à la génération d’assertion CPS

### 3.2.4 Package fr.santesocial.assertion.psc

Le package contient les classes nécessaires à la génération d’assertion CPS dans le cadre de Pro Santé Connect

### 3.2.5 Package fr.santesocial.assertion.structure

Le package contient les classes nécessaires à la génération d’assertion Structure.

### 3.2.6 Package fr.santesocial.assertion.util

Le package contient des classes utilitaires.

06/03/2025 GIE SESAM-Vitale 
icon: SESAM-Vitale logo 8 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

### 3.2.7 **Package fr.santesocial.assertion.vitale**

Le package contient les classes nécessaires à la génération d’assertion Vitale.

## 3.3 **Description détaillée des classes du code exemple**

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
      <td>fr.santesocial.assertion</td>
      <td></td>
      <td>Package contenant la fabrique à assertion</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionFactory</td>
      <td>Classe utilisée comme point d’entrée pour la génération d’assertion.<br />A noter que cette classe n’est pas utilisée dans le code exemple INSi ICIR</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.commun</td>
      <td></td>
      <td>Package contenant les composants de base pour la génération d’une assertion SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>AbstractAssertionBuilder.java</td>
      <td>Classe de base de création d'une assertion SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>AbstractAssertionSigneeBuilder.java</td>
      <td>Représentation d'un composant pour la création d'assertion signée</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionAttribute.java</td>
      <td><u>Classe de gestion d'un attribut SAML dans une assertion</u></td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionAttributeStatement.java</td>
      <td>Classe de gestion de l'élément SAML AttributeStatement contenant les attributs d'une assertion</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionException.java</td>
      <td>Exception dans la création d'une Assertion SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionSignature.java</td>
      <td>Génération de l'objet XML-Signature d'un document</td>
    </tr>
    <tr>
      <td></td>
      <td>AssertionSignedInfo.java</td>
      <td>Classe de gestion de l'élément SignedInfo de l'objet XML-Signature de l'assertion</td>
    </tr>
    <tr>
      <td></td>
      <td>ISignatureFactory.java</td>
      <td>Interface de la fabrique de signature</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.cps</td>
      <td></td>
      <td>Package pour la génération d’assertion CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>Cps3Pkcs11.java</td>
      <td>Classe singleton qui encapsule les appels à la cryptolib CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>CpsAssertionBuilder.java</td>
      <td>Construction d'une Assertion CPS au standard SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>CpsInfo.java</td>
      <td>Informations d'une CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>CpsSignatureFactory.java</td>
      <td>Fabrique de signature CPS</td>
    </tr>
    <tr>
      <td></td>
      <td>DialogSaisieCodePorteur.java</td>
      <td>Classe pour une saisie via une boîte de dialogue du code porteur de la carte CPS.<br />A noter que cette classe n’est pas utilisée dans le code exemple INSi ICIR</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.psc</td>
      <td></td>
      <td>Package pour la génération d’assertion Pro Santé Connect</td>
    </tr>
    <tr>
      <td></td>
      <td>PscAssertionBuilder.java</td>
      <td>Construction d'une Assertion Pro Santé Connect au standard SAML</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.structure</td>
      <td></td>
      <td>Package pour la génération d’assertion Structure</td>
    </tr>
    <tr>
      <td></td>
      <td>StructureAssertionBuilder.java</td>
      <td>Construction d'une Assertion Structure au standard SAML</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.util</td>
      <td></td>
      <td>Package contenant des classes utilitaires</td>
    </tr>
    <tr>
      <td></td>
      <td>ChiffrementUtil.java</td>
      <td>Classe utilitaire concernant le chiffrement</td>
    </tr>
    <tr>
      <td></td>
      <td>Conversion.java</td>
      <td>Classe permettant de convertir différentes données</td>
    </tr>
  </tbody>
</table>

06/03/2025 GIE SESAM-Vitale 
 icon: logo 9 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

<table>
    <tr>
      <td></td>
      <td>TestCaractere.java</td>
      <td>Classe permettant de tester un type de caractère</td>
    </tr>
    <tr>
      <td>fr.santesocial.assertion.vitale</td>
      <td></td>
      <td>Package pour la génération d’assertion Vitale</td>
    </tr>
    <tr>
      <td></td>
      <td>VitaleAssertionBuilder.java</td>
      <td>Construction d'une assertion Vitale au standard SAML</td>
    </tr>
    <tr>
      <td></td>
      <td>VitaleInfo.java</td>
      <td>Informations d'une carte Vitale</td>
    </tr>
    <tr>
      <td></td>
      <td>VitaleSignatureFactory.java</td>
      <td>Fabrique de signature Vitale</td>
    </tr>
</table>

## **3.4 Fichiers à la racine du projet**

<table>
    <tr>
      <td>pom.xml</td>
      <td>Déclaration du projet pour Maven</td>
    </tr>
    <tr>
      <td>structure.ini</td>
      <td>Fichier exemple pour la configuration nécessaire à la génération d’une<br />assertion Structure</td>
    </tr>
</table>

# **4 Authentifications**

Il existe trois modes d’authentification, l’authentification avec la carte CPS (authentification directe), l’authentification avec un certificats établissement (authentification indirecte) et l’authentification PSC (authentification directe avec Pro Santé Connect).

Il convient d’adapter la configuration en fonction du mode d’authentification :
- Le choix de l’URL du webservice
- Les certificats logiciels à exploiter
- Le chemin vers la cryptolib CPS installée sur le poste

# **5 Webservices**

Le code exemple propose l’implémentation des fonctions de recherche INSi (ICIR):
- rechercherInsAvecTraitsIdentite
- rechercherInsAvecCarteVitale

# **6 Compilation du projet à partir des sources**

## **6.1 Pré-requis**

Pour compiler le projet, vous devez disposer de maven 3.6 et de Java JDK version 17.

Décompresser l’archive du projet vers un dossier nommé à votre convenance (ici « insi_icir »).

## **6.2 Génération des classes Java**

Les classes représentant les web services ont été générées grâce au plugin jaxws-maven-plugin en compilant l’application via « mvn clean compile » dans le dossier target\generated-sources.

Les WSDL sont fournis dans une annexe externe [ANX-WSDL].

06/03/2025 GIE SESAM-Vitale 
 icon: GIE SESAM-Vitale logo 10 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

# 6.3 Compilation du projet avec Eclipse

## 6.3.1 Installation de Eclipse

Voir le site <u>http://www.eclipse.org/</u>

icon: arrow icon **Remarque :**

Le projet a été testé avec Eclipse « 2023-09 (4.29.0) », mais il est probable qu’il fonctionne aussi sur des versions antérieures (sans garantie).

## 6.3.2 Librairies dépendantes

### 6.3.2.1 Projet ClientTLSi-Assertion

Les librairies dépendantes sont définies à travers le pom.xml du projet :

<table>
  <thead>
    <tr>
      <th>librairie</th>
      <th>Version</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>fr.santesocial.mica:jnamica</td>
      <td>2.01.01</td>
    </tr>
    <tr>
      <td>org.bouncycastle:bcpkix-jdk18on</td>
      <td rowspan="2">1.76</td>
    </tr>
    <tr>
      <td>org.bouncycastle:bcprov-jdk18on</td>
    </tr>
    <tr>
      <td>org.opensaml:opensaml-core</td>
      <td rowspan="3">4.0.1</td>
    </tr>
    <tr>
      <td>org.opensaml:opensaml-saml-api</td>
    </tr>
    <tr>
      <td>org.opensaml:opensaml-saml-impl</td>
    </tr>
    <tr>
      <td>iaik.pkcs.pkcs11.wrapper:iaikPkcs11Wrapper</td>
      <td>1.4</td>
    </tr>
    <tr>
      <td>net.java.dev.jna:jna</td>
      <td>5.7.0</td>
    </tr>
    <tr>
      <td>org.apache.logging.log4j:log4j-core</td>
      <td>2.21.1</td>
    </tr>
    <tr>
      <td>org.slf4j:slf4j-reload4j</td>
      <td>2.0.9</td>
    </tr>
    <tr>
      <td>junit:junit</td>
      <td>4.13.2</td>
    </tr>
  </tbody>
</table>

### 6.3.2.2 Projet tls_icir

Les librairies dépendantes sont définies à travers le pom.xml du projet :

<table>
  <thead>
    <tr>
      <th>librairie</th>
      <th>Version</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>fr.santesocial.lps:ClientTLSi-Assertion</td>
      <td>4.0.0</td>
    </tr>
    <tr>
      <td>jakarta.validation:jakarta.validation-api</td>
      <td>3.0.2</td>
    </tr>
    <tr>
      <td>jakarta.xml.bind:jakarta.xml.bind-api</td>
      <td>4.0.0</td>
    </tr>
    <tr>
      <td>com.sun.xml.bind:jaxb-impl</td>
      <td>4.0.0</td>
    </tr>
    <tr>
      <td>jakarta.xml.ws:jakarta.xml.ws-api</td>
      <td>4.0.0</td>
    </tr>
    <tr>
      <td>com.sun.xml.ws:jaxws-rt</td>
      <td>4.0.0</td>
    </tr>
    <tr>
      <td>com.fasterxml.jackson.core:jackson-databind</td>
      <td rowspan="2">2.14.2</td>
    </tr>
    <tr>
      <td>com.fasterxml.jackson.core:jackson-annotations</td>
    </tr>
    <tr>
      <td>org.apache.logging.log4j:log4j-core</td>
      <td>2.21.1</td>
    </tr>
  </tbody>
</table>

06/03/2025 GIE SESAM-Vitale icon: logo 11 / 12

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

SEL-GI-002 Code exemple en langage JAVA Version : 1.0.0

### 6.3.3 Import du projet sous Eclipse

Pour importer le projet sous Eclipse :

1. Pour importer un Maven projet déjà existant : **File→Import ...** ;
2. **Maven / Existing Maven Project**;
3. Sélectionner le dossier « insi_icir» décompressé, puis **Finish**

### 6.3.4 Compilation et exécution sous Eclipse

Sous Eclipse :

* Le projet se compile via le JDK 17;
* Les « Main » d’exemple peuvent être lancés directement sous Eclipse (carte CPS : voir le chapitre suivant pour la limitation possible en fonction de la version de la cryptoLib).

## 6.4 Exécution avec la carte CPS (authentification directe)

**Afin de pouvoir exécuter les exemples sous Eclipse, il est nécessaire d’utiliser idéalement la dernière version de la Cryptolib (5.2.2).**

Sur les anciennes versions de CryptoLib (inférieure à la version 3.06), en raison d’un classpath trop long formé par Eclipse, l’exécution d’une classe utilisant la carte CPS n’arrivera pas à son terme, à cause d’une limitation du buffer de la dll cps_pkcs11_w32 qui ne supportait pas plus de 4096 caractères, et terminera l’exécution sans aucun code retour.

icon: exclamation mark **Note :**

Dans le cas d’une exécution des tests avec la carte CPS, il est nécessaire de renseigner le code PIN correct de la carte CPS dans la constante CODE_PORTEUR de la classe GetINS.java. **Dans le cas contraire, il y un risque de blocage de la carte CPS par l’exécution des tests (le code PIN livré par défaut dans le fichier de configuration est « 1234 »).**

Il peut également être nécessaire de modifier le numéro de slot attribué au lecteur PC/SC de la carte CPS (la constante CPS_SLOT de la classe GetINS.java est renseigné à « 4 »).

## 6.5 Exécution avec la carte Vitale

**Afin de pouvoir exécuter les exemples sous Eclipse, il est nécessaire d’utiliser la version 4.01.00 de MICA en 64 bits.**

Cette version doit être installée dans C:\Program Files\santesocial\mica\.

06/03/2025 GIE SESAM-Vitale 
icon: GIE SESAM-Vitale logo 12 / 12
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale