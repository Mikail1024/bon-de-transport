![logo: sesam-vitale](page_1_image_1_v2.jpg)

# Volet transport synchrone pour les téléservices de l'Assurance Maladie Obligatoire

## Cadre d’interopérabilité des TLSi AMO

Version du document 01.02.03
Date du document 23/04/2026
Référence CI_TLSI_AMO

**GIE SESAM-VITALE, maître d’œuvre et expert technique du système**
**5, boulevard Alexandre Oyon – 72 019 LE MANS Cedex 2**
**www.sesam-vitale.fr**

Cadre d’interopérabilité des TLSi

Ce document a été élaboré par le GIE SESAM-Vitale. Conformément à l’article L.122-4 du Code de la Propriété Intellectuelle, toute représentation ou reproduction (intégrale ou partielle) du présent ouvrage, quel que soit le support utilisé, doit être soumise à l’accord préalable écrit de son auteur.

Il en est de même pour sa traduction, sa transformation, son adaptation ou son arrangement quel que soit le procédé utilisé.

Tout manquement à ces obligations constituerait un délit de contrefaçon, au sens des articles L 335-2 et suivants du code de la propriété intellectuelle, susceptible d’entraîner des sanctions pour l’auteur du délit.

### *Contacts*

![logo: sesam-vitale](page_2_image_1_v2.jpg)

Pour toute question technique ou fonctionnelle durant vos développements, contactez l’assistance technique du GIE SESAM-Vitale :

- par courriel : centre-de-service@sesam-vitale.fr
- par téléphone : 02 43 57 42 88

23/04/2026 2 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Historique des versions

<table>
  <thead>
    <tr>
      <th><b>Date</b></th>
      <th>Version</th>
      <th>Évolution majeure du document</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Mars 2013</td>
      <td>1.0.2</td>
      <td>Diffusion du cadre d’interopérabilité 1.0.2</td>
    </tr>
    <tr>
      <td>Janvier 2018</td>
      <td>01.01.01</td>
      <td>Diffusion du cadre d’interopérabilité 01.01.01<br /><br />Réécriture du CI :<br /><br />- Ajout de l’authentification indirecte ;<br /><br />- Ajout de l’assertion Structure.<br /><br />- Passage de « recommandation » à « exigence » la nécessité de supporter deux chaînes d’autorité de confiance pour vérifier le certificat du SIR.<br /><br />- Ajout d’exigences sur le numéro d’autorisation, le nom et la version du SI-PS.</td>
    </tr>
    <tr>
      <td>Janvier 2019</td>
      <td>01.01.02</td>
      <td>Ajout de l’attribut « secteurActivite » dans l’assertion PS (chap. 5.1).<br /><br />Reformulation de la description de l’attribut « version » du contexte LPS.<br /><br />Suppression de l’ambiguïté entre la spécification des chaînes de caractères XML et de chaînes de caractères historiques (abréviation AN).<br /><br />Restriction des caractères utilisables dans l’élément XML &#x3C;ContexteLPS>&#x3C;Nom>.</td>
    </tr>
  </tbody>
</table>

23/04/2026

![icon: SESAM-Vitale logo](page_3_image_1_v2.jpg) 3 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

<table>
    <tr>
      <td>Mars 2020</td>
      <td>01.01.03</td>
      <td>Intégration du cadre d'interopérabilité dans le corpus documentaire de l'ANS.<br /><br />- Modification du titre<br /><br />Quelques corrections de forme.</td>
    </tr>
    <tr>
      <td>Juin 2020</td>
      <td>01.01.04</td>
      <td>L'ASIP Santé devient l'ANS<br /><br />Ajout de l'assertion ApCV<br /><br />Quelques évolutions</td>
    </tr>
    <tr>
      <td>Juin 2021</td>
      <td>01.01.05</td>
      <td>Modification de la longueur de la signature des cartes Vitale conservée dans l'assertion Vitale. Cette modification correspond à l'évolution de l'algorithme de signature des cartes Vitale.<br /><br />Ajout de l'attribut &#x3C;Subject>&#x3C;NameID@SPNameQualifier> dans l'assertion Vitale pour la distinguer formellement de l'assertion ApCV. Cet attribut est optionnel.</td>
    </tr>
    <tr>
      <td>Juin 2023</td>
      <td>01.02.00</td>
      <td>Ajout de l’authentification directe du PS via ProSantéConnect.</td>
    </tr>
    <tr>
      <td>Août 2023</td>
      <td>01.02.01</td>
      <td>Ajout d’une précision au chapitre 3.2.3 sur le <code>subject_token_type</code> de la demande de jeton d’accès AM.<br /><br />Suppression de l’algorithme SHA1. L’algorithme <code>RSAwithSHA1</code> et <code>SHA1</code> ne sont plus supportés (chapitre 5.1.2 Assertion PS).<br /><br />Modification de la valorisation de l’élément XML <code>&#x3C;issuer></code> de l’assertion PS.<br /><br />Reformulation de la description du champ <code>&#x3C;instance></code> du <code>contexteLPS</code> car ce dernier doit correspondre au LPS_ID du CI-SIS.</td>
    </tr>
    <tr>
      <td>Janvier 2024</td>
      <td>01.02.02</td>
      <td>Ajout de trois nouveaux attributs optionnels dans l’assertion PS : <code>codeRole</code>, <code>codeGenreActivite</code>, <code>CodeModeExercice</code></td>
    </tr>
    <tr>
      <td>Avril 2025</td>
      <td>01.02.03</td>
      <td>Ajout d’une option d’authentification mutuelle TLS au chapitre 3.3 (mode « authentification indirecte »).</td>
    </tr>
</table>

23/04/2026 
![icon: SESAM-Vitale logo](page_4_image_1_v2.jpg) 4 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

![icon: horizontal bar](page_5_image_3_v2.jpg)

<table>
    <tr>
      <td></td>
      <td></td>
      <td>Création du chapitre 3.4 « Authentification directe d’une structure » comprenant deux possibilités :<br /><br />- utilisation d’une assertion Structure ;<br /><br />- authentification mutuelle sans assertion Structure (sans assertion).</td>
    </tr>
</table>

23/04/2026 ![icon: blue circles](page_5_image_2_v2.jpg) 5 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Tables des matières

<table>
    <tr>
      <td colspan="2">Historique des versions ....................................................................................................</td>
      <td>3</td>
    </tr>
    <tr>
      <td colspan="2">Tables des matières ..........................................................................................................</td>
      <td>6</td>
    </tr>
    <tr>
      <td colspan="2">Glossaire ...........................................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td>Chapitre 1</td>
      <td>Introduction ................................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td>1.1</td>
      <td>Objet du document .............................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>Contenu du document ........................................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td>1.3</td>
      <td>Périmètre du cadre d’interopérabilité ................................................................</td>
      <td>9</td>
    </tr>
    <tr>
      <td>Chapitre 2</td>
      <td>Normes et standards ................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>Normes ..............................................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>Espace de noms .................................................................................................</td>
      <td>14</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>Types de données communs.............................................................................</td>
      <td>15</td>
    </tr>
    <tr>
      <td>Chapitre 3</td>
      <td>Dispositifs de sécurité...............................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>Principe général.................................................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td>3.1.1</td>
      <td>Authentification du PS et de la structure de santé ......................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td>3.1.2</td>
      <td>Authentification du support du bénéficiaire ................................................</td>
      <td>22</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>Authentification directe d’une personne physique ..........................................</td>
      <td>24</td>
    </tr>
    <tr>
      <td>3.2.1</td>
      <td>Identifiant et mot de passe ..........................................................................</td>
      <td>24</td>
    </tr>
    <tr>
      <td>3.2.2</td>
      <td>Accès direct avec une CPx ............................................................................</td>
      <td>26</td>
    </tr>
    <tr>
      <td>3.2.3</td>
      <td>Accès direct avec Pro Santé Connect ...........................................................</td>
      <td>29</td>
    </tr>
    <tr>
      <td>3.3</td>
      <td>Authentification indirecte d’une personne physique .......................................</td>
      <td>33</td>
    </tr>
    <tr>
      <td>3.4</td>
      <td>Authentification directe d’une structure ..........................................................</td>
      <td>36</td>
    </tr>
    <tr>
      <td>3.4.1</td>
      <td>Authentification mutuelle avec une assertion Structure .............................</td>
      <td>36</td>
    </tr>
    <tr>
      <td>3.4.2</td>
      <td>Authentification mutuelle sans assertion Structure ....................................</td>
      <td>37</td>
    </tr>
    <tr>
      <td>3.5</td>
      <td>Authentification de la carte Vitale ....................................................................</td>
      <td>38</td>
    </tr>
    <tr>
      <td>3.6</td>
      <td>Authentification d'une application Carte Vitale................................................</td>
      <td>40</td>
    </tr>
    <tr>
      <td>Chapitre 4</td>
      <td>Échanges SOAP .........................................................................................</td>
      <td>42</td>
    </tr>
    <tr>
      <td>4.1</td>
      <td>Principe général.................................................................................................</td>
      <td>42</td>
    </tr>
    <tr>
      <td>4.2</td>
      <td>Requêtes SOAP..................................................................................................</td>
      <td>44</td>
    </tr>
    <tr>
      <td>4.2.1</td>
      <td>Header SOAP.................................................................................................</td>
      <td>45</td>
    </tr>
    <tr>
      <td>4.2.2</td>
      <td>Body SOAP ....................................................................................................</td>
      <td>53</td>
    </tr>
</table>

23/04/2026 ![icon: SESAM-Vitale logo](page_6_image_1_v2.jpg) 6 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

4.3 Réponses SOAP..................................................................................................53
4.4 Erreurs SOAP .....................................................................................................54
# Chapitre 5 Spécification des assertions ..................................................................... 58
## 5.1 Assertion PS.......................................................................................................58
### 5.1.1 Attributs de l’assertion .................................................................................59
### 5.1.2 Attributs de la signature ...............................................................................67
## 5.2 Assertion Structure...........................................................................................69
### 5.2.1 Attributs de l’assertion .................................................................................70
### 5.2.2 Attributs de la signature ...............................................................................76
## 5.3 Assertion Vitale ................................................................................................77
### 5.3.1 Attributs de l’assertion .................................................................................78
### 5.3.2 Attributs de la signature ...............................................................................81
## 5.4 Assertion ApCV ................................................................................................87
### 5.4.1 Attributs de l’assertion .................................................................................87
## 5.5 Synthèse des identifiants dans les assertions ...................................................91
# Chapitre 6 Annexes ................................................................................................. 92
## 6.1 Schéma de l’élément XML &lt;Erreur&gt;..................................................................92
## 6.2 Schéma de l’élément XML &lt;KeyInfo&gt;................................................................92
## 6.3 Assertion PS signée...........................................................................................93
## 6.4 Assertion Structure...........................................................................................94
## 6.5 Assertion Vitale non signée..............................................................................96
## 6.6 Assertion Vitale signée SCOT.............................................................................97
## 6.7 Assertion Vitale IGEA.........................................................................................98
## 6.8 Assertion Vitale V2 ............................................................................................99
## 6.9 Assertion ApCV ................................................................................................100
## 6.10 Contexte BAM .................................................................................................101
## 6.11 Contexte LPS....................................................................................................102

23/04/2026

![icon: SESAM-Vitale logo](page_7_image_1_v2.jpg) 7 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Glossaire

**AMO** Assurance Maladie Obligatoire
**AN** Alphanumérique correspond au format xs:String
**ANS** Agence du Numérique en Santé
**ApCV** Application Carte Vitale
**CI** Cadre d’Interopérabilité
**CN** Common Name
**CNDA** Centre National de Dépôt et d’Agrément
**CPx** Carte du Professionnel de Santé de l'ANS
**CRL** Certificate Revocation List
**DESIR** Dispositif d'Exposition du Système Inter-régime
**DL** "Date lunaire"
**DN** Distinguished Name
**DT** "Date Time" correspond au format xs:DateTime
**LPS** Progiciel du Prestataire de Soins
**N** "Numérique" correspond au format xs:Integer
**PS** Professionnel de Santé
**PSC** ProSanté Connect
**RGI** Référentiel Général d’Interopérabilité
**RGS** Référentiel Général de Sécurité
**SAML** Security Assertion Markup Language
**SIH** Système d’Information Hospitalier
**SI-PS** Système d’Information du Professionnel de Santé. Dans ce document, le terme SI-PS englobe le terme SIH.
**SIR** Système Inter-régime
**SOAP** Simple Object Access Protocol
**TLS** Transport Layer Security
**TLSi** Téléservice Intégré
**URN** Uniform Resource Name
**UTC** Universal Time Coordinated
**UUID** Universally Unique IDentifier
**WSDL** Web Services Description Language
**XML** Extensible Markup Language

23/04/2026

![icon: SESAM-Vitale logo](page_8_image_2_v2.jpg) 8 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Chapitre 1

# Introduction

### 1.1 Objet du document

Ce document décrit le cadre d’interopérabilité (CI) mis en œuvre par le système d’information du professionnel de santé (SI-PS), dans un contexte individuel ou collectif, pour accéder aux services de l’Assurance Maladie obligatoire (par exemple les TLSi).

### 1.2 Contenu du document

Le cadre d’interopérabilité technique fixe les questions relatives aux protocoles d’échanges de données et à la sécurité des appels. Outre cette introduction, le document comporte les chapitres suivants :

− Le chapitre 2 présente les normes utilisées.
− Le chapitre 3 décrit les dispositifs de sécurité.
− Le chapitre 4 spécifie les échanges SOAP.
− Le chapitre 5 spécifie les assertions SAML.

### 1.3 Périmètre du cadre d’interopérabilité

23/04/2026 
![icon: SESAM-Vitale logo](page_9_image_1_v2.jpg) 9 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Cadre d’interopérabilité des TLSi

```mermaid
graph TD
    PS[Professionnel de Santé]
    SS[Structure de santé]
    SAM["Service de l'Assurance Maladie(TLSi)"]

    PS -- "(a)" --> SAM
    SS -- "(b)" --> SAM

    style SAM fill:#f2f2f2,stroke:#333,stroke-width:1px,rx:10,ry:10
```

Figure 1 – Cas d’usage

Deux grands cas d’usage du CI :

− a) Le cadre d’interopérabilité technique couvre les échanges entre un professionnel de santé (PS) et les services de l’Assurance Maladie obligatoire.

− b) Le cadre d’interopérabilité technique couvre également les échanges entre une structure de santé (établissement hospitalier, structure de soins, etc.) et les services de l’Assurance Maladie obligatoire, sous réserve de la signature d’une convention entre la structure et l’Assurance Maladie.

23/04/2026
![icon: page number decoration](page_10_image_1_v2.jpg)
10 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Chapitre 2

## Normes et standards

### 2.1 Normes

Le choix des normes techniques utilisées dans le CI est basé sur les spécifications du Basic Profile Version 2.0<sup>1</sup>.

**HTTP 1.1** est un protocole de communication client-serveur développé pour le web. La version 1.1 actualisée en 2014 est recommandée.

[https://fr.wikipedia.org/wiki/Hypertext_Transfer_Protocol](https://fr.wikipedia.org/wiki/Hypertext_Transfer_Protocol)

**SAML 2.0** est un protocole pour échanger des informations d’authentification et d’autorisation entre des parties, en particulier entre un fournisseur d’identité et un fournisseur de service. Basé sur le langage XML, SAML propose l’authentification unique (en anglais single sign-on) sur le web. De cette manière, un utilisateur peut naviguer sur plusieurs sites différents en ne s’authentifiant qu’une seule fois.

[https://fr.wikipedia.org/wiki/Security_assertion_markup_language](https://fr.wikipedia.org/wiki/Security_assertion_markup_language)

**SOAP 1.2** Simple Object Access Protocol (SOAP) spécifie le format des messages ainsi que les informations sur le message lui-même permettant son acheminement et son traitement.

[http://www.w3.org/standards/techs/soap](http://www.w3.org/standards/techs/soap)

**TLS 1.x** est un protocole de sécurisation des échanges sur Internet. Le protocole Transport Layer Security (TLS) permet de satisfaire aux objectifs de sécurité suivants :

– l’authentification du serveur ;

<sup>1</sup> <u>http://ws-i.org/profiles/BasicProfile-2.0-2010-11-09.html</u>
23/04/2026 
![icon: SESAM-Vitale logo](page_11_image_2_v2.jpg) 11 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

– la confidentialité des données échangées (ou session chiffrée) ;
– l’intégrité des données échangées ;
– de manière optionnelle, l’authentification du client.

La version 1.2 ou supérieure doit être retenue pour ce standard (conforme au Référentiel Général de Sécurité (RGS)).

[https://fr.wikipedia.org/wiki/Transport_Layer_Security](https://fr.wikipedia.org/wiki/Transport_Layer_Security)

**XML** ou « langage de balisage extensible » est un langage informatique de balisage générique. Cette syntaxe est dite « extensible », car elle permet de définir différents espaces de noms, c’est-à-dire des langages avec chacun leur vocabulaire et leur grammaire, comme XHTML, XSLT, RSS, SVG... Elle est reconnaissable par son usage des chevrons (< >) encadrant les balises XML. L’objectif initial est de faciliter l’échange automatisé de contenus complexes (arbres, texte riche...) entre systèmes informatiques hétérogènes (interopérabilité).

[http://www.w3.org/TR/REC-xml](http://www.w3.org/TR/REC-xml)

## *Information sur les éléments XML optionnels*

La description des structures XML peut faire apparaître des éléments optionnels. Si la valeur d’un élément optionnel n’est pas connue ou n’est pas utile dans un contexte particulier, il ne doit pas apparaître dans le flux XML.

Un élément optionnel non utilisé <u>ne peut pas</u> s’écrire :

`<elem></elem>` ni `<elem/>`

En effet, la valeur « vide » sera contrôlée comme une valeur « classique » et peut enfreindre les contraintes de l’élément (nombre de caractères, format, plage de date...).

*D’autre part, dans le cas où un élément XML facultatif n’est pas utilisé au démarrage d’un TLSi, le SI-PS ne doit pas être impacté le jour où ce champ est renseigné.*

23/04/2026 
![icon: icon](page_12_image_1_v2.jpg) 12 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## **XML Signature**

**XML Signature** (aussi nommé XMLDsig, XML-DSig, XML-Sig) est une recommandation du W3C destinée à permettre l’utilisation de signatures numériques dans les documents XML. Tout comme les techniques générales de cryptographie à clef publique qu’elle met en œuvre, elle permet d’assurer l’authentification, l’intégrité et par voie de conséquence la non-répudiation des données signées, mais en tirant profit de la souplesse offerte par le langage XML.

[http://www.w3.org/TR/2008/REC-xmldsig-core-20080610](http://www.w3.org/TR/2008/REC-xmldsig-core-20080610)

## **XSD**

**XSD** ou XML Schema est un langage de description de format de document XML permettant de définir la structure et le type de contenu d’un document XML. Cette définition permet notamment de vérifier la validité de ce document.

[http://www.w3.org/XML/Schema](http://www.w3.org/XML/Schema)

## **WSDL**

**WSDL** est une grammaire XML permettant une interface d’accès à un web-service. Cette description est fondée sur le XML qui indique « comment communiquer pour utiliser le service ».

[http://www.w3.org/TR/wsdl20/](http://www.w3.org/TR/wsdl20/)

[http://schemas.xmlsoap.org/wsdl/soap12/WSDL11SOAP12.pdf](http://schemas.xmlsoap.org/wsdl/soap12/WSDL11SOAP12.pdf)

## **WS-Addressing**

**WS-Addressing** (Web Services Addressing) est une spécification de mécanismes de transport neutre qui permet à des services Web de communiquer des informations d'adressage. Deux parties le composent essentiellement : une structure pour communiquer une référence à un service Web final, et un ensemble de propriétés d'adressage de messages qui associent des informations d'adressage à un message particulier.

[http://www.w3.org/Submission/ws-addressing/](http://www.w3.org/Submission/ws-addressing/)

## **WS-Security**

**WS-Security** (Web Services Security) est un protocole XML de communications qui permet d’appliquer de la sécurité aux services web. Le protocole WSS inclut des détails sur l’utilisation et le transport des assertions SAML et de la transmission des identifiants/mots de passe.

[https://www.oasis-open.org/committees/tc_home.php?wg_abbrev=wss](https://www.oasis-open.org/committees/tc_home.php?wg_abbrev=wss)

23/04/2026 
![icon: SESAM-Vitale logo](page_13_image_2_v2.jpg) 13 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 2.2    Espace de noms

Les éléments XML sont définis dans des espaces de nommage.

Un espace de nommage regroupe la définition d’éléments et de ce fait réduit le risque de conflit de déclaration. Il offre une méthode pour qualifier les noms des éléments XML (et des attributs) utilisés dans des messages XML.

Les espaces de nommage sont définis dans les fichiers XSD et déclarés dans les messages XML de la manière suivante :

```text
xmlns:prefixe="URI"
```

**_L’URI_** désigne de manière unique l’espace de nommage.

**Le *préfixe*** est une facilité pour associer un élément et un espace de nommage dans le message XML. Il peut prendre n’importe quelle valeur. *En conséquence, un progiciel doit donc pouvoir interpréter et exploiter les messages XML sans présupposer la valeur du préfixe.* Le choix de ces préfixes est arbitraire et n’est pas signifiant.

Ce document utilise de nombreux préfixes d’espace de nom listés ci-dessous.

<table>
  <thead>
    <tr>
      <th><b>Préfixe</b></th>
      <th><b>Espace de nom XML</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>ctxbam</td>
      <td>urn:siram:bam:ctxbam</td>
    </tr>
    <tr>
      <td>ctxlps</td>
      <td>urn:siram:lps:ctxlps</td>
    </tr>
    <tr>
      <td>ds</td>
      <td>http://www.w3.org/2000/09/xmldsig#</td>
    </tr>
    <tr>
      <td>saml</td>
      <td>urn:oasis:names:tc:SAML:2.0:assertion</td>
    </tr>
    <tr>
      <td>siram</td>
      <td>urn:siram</td>
    </tr>
    <tr>
      <td>vitale</td>
      <td>http://www.sesam-vitale.fr/xmldsig/2011/12/vitale</td>
    </tr>
    <tr>
      <td>wsa</td>
      <td>http://www.w3.org/2005/08/addressing</td>
    </tr>
    <tr>
      <td>wsse</td>
      <td>http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd</td>
    </tr>
  </tbody>
</table>

Attention, dans les flux de production les préfixes peuvent varier suivant les environnements.

23/04/2026

![icon: SESAM-Vitale logo](page_14_image_1_v2.jpg) 14 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 2.3 Types de données communs

**Alphanumérique** (abréviation "<sup>AN</sup>") Le format de chaîne choisi est celui défini par XML (`xs:string`). Si le format peut être préfixé par un nombre. Dans ce cas, la longueur de la chaîne ne peut pas dépasser ce nombre. Si aucune longueur n’est précisée, la longueur de la chaîne est de 1 caractère minimum, sans maximum.

Par exemple : 30AN représente une chaîne alphanumérique de 1 caractère au minimum et de 30 caractères au maximum.

**Date** (abréviation "<sup>D</sup>") Le format de date choisi est celui défini par XML (`xs:date`) sans décalage horaire par rapport à l’heure locale. Le format est YYYY-MM-DD.

Par exemple : "2016-06-22"

[http://www.w3.org/TR/xmlschema-2/#date](http://www.w3.org/TR/xmlschema-2/#date)

Cas particulier de la **date lunaire** (abréviation "<sup>DL</sup>")

Une date lunaire est également du type YYYY-MM-DD ; c’est un format spécifique autorisant des valeurs de MM > 12 et des valeurs de DD > 31.

**Date et heure** (abréviation "<sup>DT</sup>") Le format date et heure choisi est celui défini par XML (`xs:dateTime`).

En l’absence de consigne spécifique, l’heure est exprimée en heure locale avec décalage horaire UTC. Elle est de type YYYY-MM-DDThh:mm:ss+/-hh:mm avec +/-hh:mm est le décalage par rapport à l’heure UTC.

Par exemple : "2016-06-12T10:15:30+04:00"

Dans certains cas, l’heure peut être demandée en UTC. Son format est du type YYYY-MM-DDThh:mm:ssZ. On inscrit littéralement un Z final lorsqu’il s’agit de l’heure UTC.

Par exemple : "2016-06-22T06:00:00Z"

En l’absence de consigne spécifique, la précision des heures locales ou UTC est la seconde. Une précision en fraction de seconde (dixième de seconde, milliseconde, microseconde…) n’est pas demandée, mais elle est tolérée et est compatible avec le type `xs:dateTime` utilisé.

23/04/2026 
![icon: SESAM-Vitale logo](page_15_image_1_v2.jpg) 15 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

[http://www.w3.org/TR/xmlschema-2/#dateTime](http://www.w3.org/TR/xmlschema-2/#dateTime)

Quel que soit le cas, le SI-PS doit synchroniser son heure avec un serveur de temps pour des problématiques d’horodatage des données, de traçabilité et de sécurité (horodatage des assertions SAML). Le SI-PS peut, par exemple, utiliser le pool de serveurs de temps français fr.pool.ntp.org.

**ID** Dans le langage XML, les identifiants ID (unique identifiers) sont des `xs:NCName` ayant pour contrainte d’être uniques dans le document XML. La valeur doit se composer exclusivement de lettres, de chiffres, de traits d’union et de points. Les chiffres, le trait d’union et le point ne peuvent pas être utilisés en premier.

**Time** (abréviation "T") Le format heure choisi est celui défini par XML (`xs:Time`). Elle est de type hh:mm:ss+/-hh:mm avec +/-hh:mm est le décalage par rapport à l’heure UTC.

Par exemple : "10:15:30+04:00"

En l’absence de consigne spécifique, la précision des heures locales ou UTC est la seconde. Une précision en fraction de seconde (dixième de seconde, milliseconde, microseconde) n’est pas demandée, mais elle est tolérée et est compatible avec le type `xs:Time` utilisé (format hh:mm:ss[.s+]).

[http://www.w3.org/TR/xmlschema-2/#Time](http://www.w3.org/TR/xmlschema-2/#Time)

**URN** Le terme Uniform Resource Name (URN) traduit littéralement de l’anglais par « nom uniforme de ressource » permet de désigner une ressource de manière unique. Les URN ont la syntaxe suivante : urn:NID:NSS

- urn est la méthode d’URI des URN.
- NID (Namespace Identifier) est un identificateur d’espace de noms.
- NSS (Namespace specific String) est la partie spécifique à l’espace de noms identifié par le NID. L’interprétation syntaxique de cette partie dépend de l’espace de noms.

Par exemple : "urn:isbn:0451450523"

[https://en.wikipedia.org/wiki/Uniform_Resource_Name](https://en.wikipedia.org/wiki/Uniform_Resource_Name)

[http://www.yoyodesign.org/doc/w3c/uri-clarification/](http://www.yoyodesign.org/doc/w3c/uri-clarification/)

[https://tools.ietf.org/html/rfc2141](https://tools.ietf.org/html/rfc2141)

23/04/2026 ![icon: icon](page_16_image_1_v2.jpg) 16 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

**UUID** L’algorithme Universally Unique IDentifier (UUID) permet à des systèmes distribués d’attribuer de façon unique un identifiant à des informations sans coordination centrale. On parle d’identifiants « différents avec une haute probabilité ».

Dans le contexte de ce document, un UUID doit respecter la spécification RFC 4122 (toutes les versions sont autorisées).

Un UUID doit se présenter sous sa forme canonique, c’est-à-dire composée de groupes de caractères hexadécimaux en minuscules séparés par des tirets.

Par exemple : "110e8400-e29b-11d4-a716-446655440000"

C’est-à-dire 8-4-4-4-12 pour un total de 36 caractères (32 alpha numériques caractères et 4 « - »).

[https://en.wikipedia.org/wiki/Universally_unique_identifier](https://en.wikipedia.org/wiki/Universally_unique_identifier)

[https://tools.ietf.org/html/rfc4122](https://tools.ietf.org/html/rfc4122)

23/04/2026 ![icon: icon](page_17_image_1_v2.jpg) 17 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## **Autres types de données et abréviations utilisées :**

<table>
  <thead>
    <tr>
      <th><u>Format</u></th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>B</td>
      <td>Booléen : champ alphanumérique sur 1 caractère.<br /><br />La valorisation et l’interprétation de ce champ sont indiquées dans les guides des TLSi.<br /><br />Par exemple : « 0 » pour faux et « 1 » pour vrai.</td>
    </tr>
    <tr>
      <td>H</td>
      <td>Chaîne de caractères hexadécimaux.<br /><br />16 symboles sont utilisés, les chiffres de 1 à 10 et les lettres A à F.</td>
    </tr>
    <tr>
      <td>N</td>
      <td>Numérique : tous les chiffres de 0 à 9.<br /><br />Le format XN.YN permet de définir un numérique réel avec X chiffres avant le point décimal et Y chiffres après.</td>
    </tr>
    <tr>
      <td>ND</td>
      <td>Nombre décimal. Ce format est conforme à la définition de la norme XML schémas xsd:decimal avec utilisation du point comme séparateur.<br /><br />Par exemple : "14", "999.50", "+999.5450", "-999.52"</td>
    </tr>
  </tbody>
</table>

Si le format est préfixé d’un nombre, la longueur de la chaîne ne peut pas dépasser ce nombre. Si aucune longueur n’est précisée, la longueur de la chaîne est de 1 caractère minimum, sans maximum.

23/04/2026 ![icon: SESAM-Vitale logo](page_18_image_1_v2.jpg) 18 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Chapitre 3

## Dispositifs de sécurité

### 3.1 Principe général

#### 3.1.1 Authentification du PS et de la structure de santé

```mermaid
graph TD
    subgraph Structure_de_sante ["Structure de santé"]
        Agent((Agent)) --- SI[Système d'information]
    end

    PS((PS)) --- LPS[LPS]
    
    LPS -- "(a)" --> TLSi[Service de l'Assurance Maladie(TLSi)]
    SI -- "(b)" --> TLSi
    SS_Box[Structure de santé] -- "(c)" --> TLSi

    style Structure_de_sante fill:none,stroke:#000,stroke-width:1px
    style SI fill:#f2f2f2,stroke:#000,stroke-width:1px
    style LPS fill:#f2f2f2,stroke:#000,stroke-width:1px
    style TLSi fill:#f2f2f2,stroke:#000,stroke-width:1px
    style SS_Box fill:#f2f2f2,stroke:#000,stroke-width:1px
```

Figure 2 – Principe général

23/04/2026
![icon: SESAM-Vitale logo](page_19_image_1_v2.jpg) 19 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

**a)** Dans ce cas d’échange entre SI-PS et les services de l'Assurance Maladie obligatoire, **l’authentification du PS est *directe*** comme celle définie dans la Politique Générale de Sécurité des Systèmes d’Information de Santé. Le SI-PS accède sans intermédiaire au service. Il met en œuvre les mécanismes de sécurité nécessaires à l’accès. C’est-à-dire qu’il établit la liaison sécurisée, authentifie le service puis le sollicite avec les éléments permettant d’authentifier le PS. En fonction des exigences de sécurité du TLSi, deux moyens d’authentification du PS peuvent être employés :

– *Utilisation d’un identifiant et d’un mot de passe.* L’utilisateur est authentifié par le service grâce à un identifiant et un mot de passe transmis dans chaque requête vers le service.

– *Utilisation d’une CPx.* Le SI-PS génère un jeton d’authentification SAML signé avec la CPx. Ce jeton est une structure XML SAML 2.0 appelée *assertion PS* décrite au chapitre 5.1. L’assertion PS contient des informations sur le PS. Elle est signée par la CPx et possède une durée de vie limitée. L’assertion SAML est transmise dans chaque requête vers le service qui peut la conserver comme preuve d’accès. Grâce à la signature, le service authentifie le PS et s’assure de l’intégrité de l’assertion PS. L’assertion PS validée, le service l’utilise ensuite pour effectuer les contrôles d’accès.

– *Utilisation d’un jeton d’accès Pro Santé Connect (PSC).* PSC est un fédérateur d’identités qui permet aux professionnels des secteurs sanitaire, médico-social et social de se connecter de manière sécurisée à des services numériques de santé avec leur eCPS ou leur CPS. Le processus d’authentification se déroule en trois étapes : (1) l’utilisateur s’authentifie sur son SI-PS via Pro Santé Connect et acquiert un jeton d’accès, puis (2) il s’authentifie sur les services de l’Assurance Maladie avec ce jeton d’accès depuis son SI-PS et récupère un jeton d’accès AM. Les modalités d’authentification sont décrites dans le volet transport du CI-SIS pour les API Pro Santé Connect, au paragraphe 5.3.3.1. (3) Enfin, le SI-PS sollicite le service en fournissant le jeton d’accès AM ainsi qu’une assertion PS non signée.

23/04/2026 20 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

**b)** Dans le cas d’échange entre <u>un PS d’une</u> structure de santé et le SIR, **l’authentification du PS est *indirecte*** comme celle définie dans la Politique Générale de Sécurité des Systèmes d’Information de Santé. L’Assurance Maladie n’authentifie pas directement la personne physique utilisatrice du SIR, mais confie cette responsabilité à une structure de santé (par exemple un établissement de santé). La structure de santé dispose d’outils prenant en charge l’identification et l’authentification des agents. Ces derniers peuvent donc effectuer leurs activités sans l’usage systématique de leur carte CPS.

Lorsque l’authentification de l’agent est réalisée, la structure de santé génère une assertion Structure décrite au chapitre 5.2. Celle-ci contient l’identité de l’agent. Elle est signée par un certificat X.509 logiciel de signature (de type "ORG_SIGN") pour personne morale. La structure de santé la transmet dans chaque requête vers le SIR.

La mise en place d’un accès en mode d’authentification indirecte fait l’objet d’un accord entre la structure de santé et l’Assurance Maladie.

Cet accord est matérialisé par la signature d’une convention composée de différents documents, dont une convention technique XML. Ce document XML contient les informations techniques nécessaires à la mise en place de la sécurité.

Ce principe de fonctionnement est une déclinaison du standard INTEROPS<sup>2</sup> en mode « Application à Application » ou Interops-A. Ce standard « *a pour objectif de spécifier les modalités d’interopérabilité des identités et des habilitations entre les systèmes d’information des OPS [Organismes de Protection Sociale], dans une perspective de sécurisation des échanges* »<sup>3</sup>.

**c)** Dans le cas d’un échange « sans PS » entre une structure de santé et le SIR, l’authentification est dite directe (authentification de la structure). La structure s’identifie et s’authentifie en son nom propre auprès des services de l’Assurance Maladie. Deux modalités sont possibles :

− (1) Authentification mutuelle TLS avec transmission d’une assertion Structure signée (cf. chapitre 3.4.1).
− (2) Authentification mutuelle TLS sans transmission d’assertion Structure (cf. chapitre 3.4.2).

***

<sup>2</sup> http://www.interops.fr
<sup>3</sup> page 3 de la présentation générale du standard INTEROPS
23/04/2026

![icon: SESAM-Vitale logo](page_21_image_1_v2.jpg) 21 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

La structure de santé génère une assertion Structure décrite au chapitre 5.2. Elle est signée par un certificat X.509 logiciel de signature (de type "**ORG_SIGN**") pour personne morale. La structure de santé la transmet dans chaque requête vers le SIR.

La mise en place d’un accès en mode « authentification de structure » avec une authentification mutuelle TLS avec assertion Structure signée fait l’objet d’un accord entre la structure de santé et l’Assurance Maladie.

Cet accord est matérialisé par la signature d’une convention composée de différents documents, dont une convention technique XML. Ce document XML contient les informations techniques nécessaires à la mise en place de la sécurité.

Ce principe de fonctionnement est une déclinaison du standard INTEROPS⁴ en mode « Application à Application » ou Interops-A. Ce standard « *a pour objectif de spécifier les modalités d’interopérabilité des identités et des habilitations entre les systèmes d’information des OPS [Organismes de Protection Sociale], dans une perspective de sécurisation des échanges* »⁵.

### 3.1.2  Authentification du support du bénéficiaire

Un bénéficiaire de l’Assurance Maladie peut utiliser l’un des deux supports : la carte Vitale ou l’application Carte Vitale appelée ApCV.

Le guide d’intégration du service mentionnera quels sont les supports autorisés.

#### **Authentification de la carte Vitale**

Lorsque le service exige l’authentification ou l’identification d’une carte Vitale, le SI-PS doit générer une assertion SAML appelée assertion Vitale décrite au chapitre 5.3. Le SI-PS doit l’ajouter aux requêtes vers le SIR. L’assertion Vitale contient des informations de la carte Vitale. Elle peut être signée ou non par la carte Vitale en fonction des exigences de sécurité du service appelé. Le guide d’intégration du service mentionnera si l'assertion Vitale doit être signée ou non.

−   Lorsque l’assertion Vitale n’est pas signée, le service s’assure que la carte Vitale identifiée n’est pas en opposition.

***

<sup>4</sup> http://www.interops.fr

<sup>5</sup> page 3 de la présentation générale du standard INTEROPS
23/04/2026

![icon: page number graphic](page_22_image_1_v2.jpg) 22 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

![icon: decorative line](page_23_image_2_v2.jpg)

− Lorsque l’assertion Vitale est signée, le service complète le contrôle d’opposition par une vérification de signature. Il s’assure ainsi de la présence d’une carte Vitale non opposée et authentique.

## **Authentification de l'application Carte Vitale**

Lorsque le service autorise l’utilisation d’une ApCV en remplacement d’une carte Vitale, le SI-PS doit au préalable récupérer un *contexte ApCV* issu d’une ApCV.

La récupération du contexte ApCV est décrite dans un guide d’intégration diffusé par le GIE SESAM-Vitale.

À partir des éléments contenus dans le contexte ApCV, le SI-PS génère une assertion SAML appelée assertion ApCV. Celle-ci est décrite au chapitre 5.4.

*L'assertion ApCV remplace l'assertion Vitale. Ces deux assertions sont exclusives l'une de l'autre, elles ne sont jamais présentées en même temps.*

Comme avec les assertions Vitale, le SI-PS ajoute cette assertion ApCV aux requêtes vers le SIR.

23/04/2026 23 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.2 Authentification directe d’une personne physique

### 3.2.1 Identifiant et mot de passe

```mermaid
sequenceDiagram
    actor PS
    participant SI-PS
    participant TLSi as Service de l'Assurance Maladie (TLSi)

    PS->>SI-PS: Saisie de l'identifiant et du mot de passe
    PS->>SI-PS: Interogation
    SI-PS<->>TLSi: Négociation de la liaison sécurisée
    SI-PS->>TLSi: Requête SOAP (identifiant et mot de passe)
    Note right of TLSi: Vérification de l'identifiant et du mot de passe
    TLSi-->>SI-PS: Rèponse SOAP
    SI-PS-->>PS: Réponse
```

Figure 2 – identifiant et mot de passe

Figure 2 – identifiant et mot de passe

23/04/2026
24 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

Le PS saisit son identifiant et son mot de passe sur le SI-PS.

Avant d’envoyer une requête, si cela n’a pas déjà été réalisé, le SI-PS négocie une liaison sécurisée TLS 1.2 avec authentification du SIR. Lors de cette négociation, le service transmet un certificat X.509 serveur issu d’une autorité de certification de l'ANS. Le SI-PS valide le certificat X.509 serveur présenté pour s’assurer de communiquer avec le SIR.

- Le SI-PS doit vérifier la signature du certificat X.509 du SIR, sa parenté (l’autorité) et les dates de début et de fin de validité.
- Il est recommandé que le SI-PS effectue un contrôle de révocation du certificat X.509 du SIR.

Le certificat X.509 du SIR et la chaîne de certificats X.509 de l’autorité de certification ont une durée de vie limitée. Il faut donc prévoir leurs renouvellements. Pour faciliter cette opération, la structure de santé doit savoir gérer au moins deux chaînes de certificats d’autorités du certificat X.509 serveur du SIR : une chaîne de certificats d’autorités en fin de vie et la nouvelle.

Lorsque la liaison sécurisée est établie, le SI-PS transmet la requête au service accompagnée de l’identifiant et du mot de passe.

Lorsque le mot de passe est validé, le service poursuit ses traitements.

23/04/2026 ![photo: SESAM-Vitale logo](page_25_image_1_v2.jpg) 25 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.2.2 Accès direct avec une CPx

```mermaid
sequenceDiagram
    actor PS
    participant SI-PS
    participant TLSi as Service de l'Assurance Maladie (TLSi)

    PS->>SI-PS: Saisie du code porteur de la CPx
    Note right of SI-PS: Génération de l'assertion PS
    SI-PS->>SI-PS: 

    rect rgb(255, 255, 255)
        Note over SI-PS: Choix
        alt Niveau 1 ou si l'assertion est obsolète
            Note right of SI-PS: Génération d'une nouvelleassertion PS
            SI-PS->>SI-PS: 
        else Niveau 2 et si l'assertion n'est pas obsolète
            Note right of SI-PS: Vérification de la présencede la CPx dans le lecteur
            SI-PS->>SI-PS: 
        end
    end

    SI-PS<->>TLSi: Négociation de la liaison sécurisée
    SI-PS->>TLSi: Requête SOAP (assertion PS)
    Note right of TLSi: Vérification de l'assertion PS
    TLSi->>TLSi: 
    TLSi-->>SI-PS: Réponse SOAP
    SI-PS-->>PS: Réponse
```

Figure 3 – Assertion PS

23/04/2026 
![icon: SESAM-Vitale logo](page_26_image_1_v2.jpg) 26 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

Si la CPx vient d’être insérée dans le lecteur, le PS doit saisir le code porteur de sa CPx avant toute signature d’assertions PS. En aucun cas, le code porteur ne doit être mémorisé par le SI-PS.

Le SI-PS génère une assertion PS puis la signe avec la carte CPx. L’assertion PS est construite à partir des informations du certificat X.509, des données de la carte CPx et éventuellement du SI-PS.

Deux niveaux de sécurité :

**Niveau 1 :** Au moment de solliciter une opération d’un TLSi, le SI-PS doit générer une nouvelle assertion PS.

**Niveau 2 :** Au moment de solliciter une opération d’un TLSi, si la carte liée à l’assertion PS est toujours présente dans le lecteur, le SI-PS peut réutiliser une assertion PS qui date de moins d’une (1) heure. Mais, si la durée de vie de l’assertion PS est dépassée, le SI-PS doit en générer une nouvelle. Ce délai de réutilisation permet d’anticiper la génération d’une assertion PS (génération en temps masqué) et permet également de réutiliser une même assertion dans plusieurs échanges.

Le SI-PS peut détruire l’assertion PS lorsque la carte CPx est retirée du lecteur.

Chaque guide d’intégration mentionne le niveau de sécurité minimal qui est exigé pour le TLSi désigné. Il est possible d’appliquer le niveau 1 pour un TLSi qui demande le niveau 2.

Avant d’envoyer une requête, si cela n’a pas déjà été réalisé, le SI-PS négocie une liaison sécurisée TLS 1.2 avec authentification du SIR. Lors de cette négociation, le service transmet un certificat X.509 serveur issu d’une autorité de certification de l'ANS. Le SI-PS valide le certificat X.509 serveur présenté pour s’assurer de communiquer avec le SIR.

− Le SI-PS doit vérifier la signature du certificat X.509 du SIR, sa parenté (l’autorité) et les dates de début et de fin de validité.
− Il est recommandé que le SI-PS effectue un contrôle de révocation du certificat X.509 du SIR.

Le certificat X.509 du SIR et la chaîne de certificats X.509 de l’autorité de certification ont une durée de vie limitée. Il faut donc prévoir leurs renouvellements. Pour faciliter cette opération, le SI-PS doit savoir gérer au moins deux chaînes de certificats d’autorités du certificat X.509 du serveur du SIR : une chaîne de certificats d’autorités en fin de vie et la nouvelle.

23/04/2026 
 ![photo: SESAM-Vitale progress indicator](page_27_image_1_v2.jpg) 27 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

Lorsque la liaison sécurisée est établie, le SI-PS transmet la requête au service accompagné de l’assertion PS.

Lorsque l’assertion PS est validée, le service poursuit ses traitements. L’assertion PS est exploitée pour autoriser l’exécution du TLSi demandé et peut être conservée comme preuve d’accès.

23/04/2026 
![photo: SESAM-Vitale logo graphic](page_28_image_1_v2.jpg) 28 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.2.3 Accès direct avec Pro Santé Connect

```mermaid
sequenceDiagram
    box rgb(220, 220, 220) Système d'information du PS SI-PS
        actor PS
        participant Client
        participant Proxy
    end
    participant Pro Santé Connect
    box rgb(220, 220, 220) Système d'information de l'Assurance Maladie
        participant Service d'autorisation
        participant Service de l'Assurance Maladie (TLSi)
    end

    PS->>Client: 
    Client->>Proxy: Requête d'autorisation
    Proxy->>Pro Santé Connect: Requête d'autorisation
    
    Note over PS, Pro Santé Connect: Le PS s'authentifie sur son LPSavec ProSanté PSC.Cette cinématique est décrit dansle CI-SIS.
    
    Pro Santé Connect-->>Proxy: Jetons OIDC PSC
    Proxy-->>Client: 
    Client-->>PS: 
    
    PS->>Client: Appel un TLSi
    Client->>Proxy: Requête SOAP TLSi
    
    rect rgb(240, 240, 240)
        Note over Proxy, Service d'autorisation: alt [Si le proxy ne possède pas de jeton d'assès AM ou si le jeton d'accès AM est périmé]
        Proxy->>Service d'autorisation: Demander un jeton d'accès AM (jeton d'accès PSC)
        Proxy-->>Service d'autorisation: Négociation de la liaison sécurisée en authentification mutuelle
        Service d'autorisation-->>Proxy: Jeton d'accès AM
    end
    
    Proxy->>Service de l'Assurance Maladie (TLSi): Requête SOAP (assertion PS) + Jeton d'accès AM
    Proxy-->>Service de l'Assurance Maladie (TLSi): Négociation de la liaison sécurisée en authentification mutuelle
    
    Service de l'Assurance Maladie (TLSi)->>Service de l'Assurance Maladie (TLSi): Vérification du Jeton d'accès AM
    Service de l'Assurance Maladie (TLSi)->>Service de l'Assurance Maladie (TLSi): Vérification de l'assertion PS
    
    Service de l'Assurance Maladie (TLSi)-->>Proxy: Réponse du TLSi
    Proxy-->>Client: 
    Client-->>PS:
```

Figure 4 – Pro Santé Connect

23/04/2026 ![icon: SESAM-Vitale logo](page_29_image_1_v2.jpg) 29 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE
SESAM-Vitale

Cadre d’interopérabilité des TLSi

L’authentification sur Pro Santé Connect et l’accès aux services de l’Assurance Maladie imposent la mise en place d’un composant appelé ici « Proxy ». Ce composant unique pour un éditeur (ou un groupement d’éditeurs) prend en charge les étapes d’authentification du PS sur Pro Santé Connect et l’accès aux services de l’Assurance Maladie.

Première étape décrite dans le CI-SIS :

− L’utilisateur (PS, agents, etc.) s’authentifie sur son SI-PS avec PSC.
− Le SI-PS demande l'authentification du PS à PSC.
− PSC demande à l'utilisateur de s'authentifier.
− Une fois que l’utilisateur est authentifié, PSC retourne un code d'autorisation au SI-PS.
− Le Proxy du SI-PS utilise le code d'autorisation pour demander le jeton d’accès PSC auprès de PSC.

Seconde étape d’accès aux TLSi :

− L’utilisateur souhaite accéder à un TLSi de l’assurance maladie.
− Le SI-PS (Proxy ou Client) génère une requête SOAP conforme au CI-AMO. Cette requête contient une assertion PS non signée, un contexte LPS et un contexte BAM. Cette requête peut être complétée d’une assertion Vitale ou ApCV en fonction des exigences du service. L’assertion PS est valable 1 heure, mais il est recommandé d’en générer une nouvelle à chaque sollicitation du TLSi afin de réduire le risque de désynchronisation entre la durée de vie de l’assertion et celle du jeton d’accès AM.
− Le proxy du SI-PS utilise le jeton d'accès PSC pour demander l'accès au TLSi auprès du service d’autorisation de l’Assurance Maladie.
− Le service d’autorisation valide le jeton d'accès PSC auprès de PSC.
− Le service d’autorisation génère et retourne au SI-PS un jeton d'accès AM. La durée de vie du jeton d’accès AM est de 1 heure.

Troisième étape d’accès aux TLS

− Enfin, le proxy du SI-PS intègre le jeton d'accès AM dans l’en-tête de la requête SOAP générée par le SI-PS et sollicite le TLSi.

Note : dans le cas d’un service SAS, le client et le proxy peuvent ne faire qu’un seul composant du SI-PS.

23/04/2026 30 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## **Demander un jeton d’accès AM**

Cette requête est conforme au CI-SIS. Elle est envoyée par le proxy du SI-PS au service d’autorisation de l’Assurance Maladie pour obtenir un jeton d’accès AM.

Cette requête donne lieu à une authentification mutuelle TLS entre le proxy et le service d’autorisation de l’Assurance Maladie.

```text
POST /[URL] HTTP/1.1
Host: [HOST]
Content-Type: application/x-www-form-urlencoded
grant_type=urn:ietf:params:oauth:grant-type:token-exchange
&subject_token=[jeton d’accès PSC]
&subject_token_type=urn:ietf:params:oauth:token-type:access_token
&scope=all
&client_id=[client id]
```

Le HOST et l’URL sont définis dans les guides d’intégration des TLSi.

Les paramètres de la requête sont les suivants :

− Le subject_token contient le jeton d’accès PSC.
− Le subject_token_type contient la valeur `urn:ietf:params:oauth:token-type:access_token` (ou `urn:ietf:params:oauth:token-type:jwt` selon le guide d’intégration).
− Le scope contient la valeur `all`. Il n’y a pas de distinction entre TLSi
− Le client_id contient la valeur du client_id du proxy du SI-PS attribué par PSC.

### **Réponse en succès**

```text
HTTP/1.1 200 OK
   Content-Type: application/json;charset=UTF-8
   Cache-Control: no-store
   Pragma: no-cache
   {
     "access_token":  "[jeton d’accès AM]",
     "issued_token_type": "urn:ietf:params:oauth:token-type:access_token",
     "token_type":  "Bearer",
     "expires_in":  3600,
     "scope": "all"
   }
```

La réponse du service d’autorisation contient le nouveau jeton d’accès AM, ainsi que d'autres informations utiles telles que le type de jeton d’accès, la durée de validité du jeton d’accès, le scope accordé pour le nouveau jeton d’accès AM.

23/04/2026 31 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi



    Le contenu de la réponse :

     −    le access_token contient le nouveau jeton d’accès AM encodé en base64.
     −    le issued_token_type contient le type du jeton d’accès AM.
     −    le token_type contient la méthode pour utiliser le jeton d’accès AM.
     −    le expires_in contient la durée d’expiration du jeton d’accès AM (c’est-à-dire 1
          heure).
     −    le scope contient le scope demandé, "all" pour tous les TLSi.

    Réponse en échec

    Exemple :

    HTTP/1.1 400     Bad Request
    Content-Type: application/json;charset=UTF-8
    Cache-Control: no-store
    Pragma: no-cache

    {
    "error": "invalid_request",
    "error_description": "The   request is missing    a required       parameter."
    }

    La liste des erreurs est spécifiée dans le CI-SIS.

    Requête vers les TLSi

    Cette requête donne lieu à une authentification mutuelle TLS entre le proxy du SI-PS et
    le service de l’Assurance Maladie.

    POST [URL] HTTP/1.1
    Host: [host]
    Content-Type: text/xml;charset=UTF-8
    Content-Length: [length]
    Authorization: Bearer     <access_token_tlsi>

    <?xml version="1.0"  encoding="UTF-8"?>
    <soap:Envelope
    …
    </soap:Envelope>
    Avec : access_token_tlsi : Le jeton d’accès AM.

    L’URL et le HOST dépendent du TLSi et sont spécifiés dans le guide d’intégration.



    23/04/2026    32 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE
                                                SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.3 Authentification indirecte d’une personne physique

Ce mode d’authentification correspond aux usages des TLSi par un agent (administratifs, PS…) dans une structure de santé.

Ce mode est possible lorsque la structure de santé a signé une convention avec l’Assurance Maladie.

```mermaid
sequenceDiagram
    box Structure de santé
    actor Agent
    participant SI as Système d'information
    end
    participant TLSi as Service de l'Assurance Maladie (TLSi)

    Agent->>SI: 
    Note right of SI: Indentification et authentification de l'agent
    SI->>SI: 
    Note right of SI: Génération de l'assertion Structure
    SI->>SI: 
    SI<<->>TLSi: Négociation de la liaison sécurisée
    SI->>TLSi: Requête SOAP (assertion Structure)
    Note right of TLSi: Vérification de l'assertion Structure
    TLSi->>TLSi: 
    TLSi-->>SI: Réponse
    SI-->>Agent: Réponse
```

Figure 5 – Authentification indirecte

23/04/2026
![icon: SESAM-Vitale logo](page_33_image_2_v2.jpg) 33 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

La structure de santé doit disposer d’outils prenant en charge l’identification et l’authentification des agents. Ces derniers peuvent donc effectuer leurs activités sans l’usage systématique de leur carte CPS, et éventuellement, sans l’usage de la carte Vitale ou de l’ApCV du patient.

Lorsque l’authentification de l’agent est réalisée, la structure de santé génère une assertion Structure contenant l’identité de l’agent.

L’assertion Structure est signée par un certificat logiciel de signature de la structure de santé.

L’assertion Structure possède une durée de validité portée par les éléments NotOnOrAfter. Elle doit être régénérée à chaque requête.

Avant d’envoyer une requête, si cela n’a pas déjà été réalisé, la structure de santé négocie une liaison sécurisée TLS 1.2 avec authentification du SIR. Lors de cette négociation, le service transmet un certificat X.509 serveur issu d’une autorité de certification de l'ANS. La structure de santé doit valider le certificat X.509 serveur présenté pour s’assurer de communiquer avec le SIR.

- La structure de santé doit vérifier la signature du certificat X.509 du SIR, sa parenté (l’autorité) et les dates de début et de fin de validité.
- Il est recommandé que la structure de santé effectue un contrôle de révocation du certificat X.509 du SIR.

Le certificat X.509 du SIR et la chaîne de certificats X.509 de l’autorité de certification ont une durée de vie limitée. Il faut donc prévoir leurs renouvellements. Pour faciliter cette opération, la structure de santé doit savoir gérer au moins deux chaînes de certificats d’autorités du certificat X.509 serveur du SIR : une chaîne de certificats d’autorités en fin de vie et la nouvelle.

Lorsque la liaison sécurisée est établie, la structure de santé transmet la requête au TLSi accompagnée de l’assertion Structure.

Lorsque l’assertion Structure est validée, le service poursuit ses traitements. L’assertion Structure est exploitée pour autoriser l’exécution du TLSi demandé et peut être conservée comme preuve d’accès.

23/04/2026 34 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

![icon: icon](page_35_image_2_v2.jpg)

## **Authentification mutuelle TLS (option)**

En complément des mécanismes décrits ci‑dessus, le cadre d’appel d’un service peut prévoir une authentification mutuelle TLS entre la structure de santé et le service.

L’assertion Structure continue d’être régénérée à chaque requête et transmise au service.

23/04/2026 ![icon: icon](page_35_image_1_v2.jpg) 35 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.4 Authentification directe d’une structure

Ce mode d’authentification correspond aux usages des TLSi par une structure de santé (établissement hospitalier, structure de soins…) sans authentification d’une personne physique par l’Assurance Maladie. La structure, en tant que personne morale, porte la responsabilité de la sollicitation du service.

Deux possibilités sont offertes :

− Authentification mutuelle avec assertion Structure ;
− Authentification mutuelle sans assertion Structure.

### 3.4.1 Authentification mutuelle avec une assertion Structure

Ce mode est possible lorsque la structure de santé a signé une convention avec l’Assurance Maladie. Cette convention décrit les modalités techniques nécessaires à la mise en place de la sécurité.

Dans ce cas, la structure de santé génère, *à chaque requête*, une assertion Structure conforme au chapitre 5.2. Cette assertion contient l’identité de la structure et est signée par un certificat logiciel de signature de la structure de santé.

Avant d’envoyer une requête, si cela n’a pas déjà été réalisé, la structure de santé négocie une liaison sécurisée TLS 1.2 avec authentification mutuelle avec le service.

Lors de cette négociation, le service utilise un certificat X.509 serveur issu d’une autorité de certification de l’ANS.

La structure de santé doit vérifier la signature du certificat X.509 du SIR, sa chaîne de certification ainsi que ses dates de début et de fin de validité. Il est recommandé qu’elle effectue également un contrôle de révocation du certificat X.509 du SIR.

Le certificat X.509 du SIR et la chaîne de certificats d’autorité ont une durée de vie limitée. Il convient donc d’anticiper leur renouvellement. Pour faciliter cette opération, la structure de santé doit savoir gérer au moins deux chaînes de certificats d’autorité du certificat X.509 serveur du SIR : une chaîne en fin de vie et la nouvelle.

Lorsque la liaison sécurisée est établie, la structure de santé transmet la requête au TLSi accompagnée de l’assertion Structure et des contextes LPS/BAM demandés. Lorsque l’assertion Structure est validée, le service poursuit ses traitements. L’assertion Structure est exploitée pour autoriser l’exécution du service demandé et peut être conservée comme preuve d’accès.

23/04/2026 
 ![icon: SESAM-Vitale logo](page_36_image_1_v2.jpg) 36 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

### 3.4.2 Authentification mutuelle sans assertion Structure

Dans ce cas, aucune assertion Structure n’est transmise dans la requête SOAP. L’authentification de la structure est réalisée pendant la négociation TLS 1.2 par authentification mutuelle entre la structure de santé et le service.

Lors de la négociation TLS 1.2, le service transmet un certificat X.509 serveur et la structure présente un certificat X.509 client. Chaque partie valide le certificat de l’autre (vérification de la signature, parenté (chaîne), validité, révocation recommandée). La gestion des renouvellements des certificats et des chaînes d’autorités doit permettre au moins deux chaînes (une en fin de vie et la nouvelle).

Les contrôles d’accès sont effectués éventuellement à partir des contextes LPS/BAM et des informations d’identité portées par le certificat client selon les règles décrites dans la convention technique XML (par exemple, la correspondance FINESS et certificat client).

23/04/2026 37 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.5 Authentification de la carte Vitale

```mermaid
sequenceDiagram
    actor PS
    participant SI-PS
    participant Service de l'Assurance Maladie (TLSi)

    PS->>SI-PS: Insertion de la carte Vitale
    SI-PS->>SI-PS: Génération de l'assertion Vitale
    
    PS->>SI-PS: 

    rect rgb(240, 240, 240)
        Note over SI-PS: Choix
        alt Niveau 1 ou si l'assertion est obsolète
            SI-PS->>SI-PS: Génération d'une nouvelleassertion Vitale
        else Niveau 2 et si l'assertion n'est pas obsolète
            SI-PS->>SI-PS: Vérification de la présencede la carte Vitale dans le lecteur
        end
    end

    SI-PS<->>Service de l'Assurance Maladie (TLSi): Négociation de la liaison sécurisée
    SI-PS->>Service de l'Assurance Maladie (TLSi): Requête SOAP (assertion PS, ssertion Vitale)
    Service de l'Assurance Maladie (TLSi)->>Service de l'Assurance Maladie (TLSi): Vérification de l'assertion PS etde l'assertion Vitale
    Service de l'Assurance Maladie (TLSi)-->>SI-PS: Réponse SOAP
    SI-PS-->>PS: Réponse
```

Figure 6 – Assertion Vitale

23/04/2026 38 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

Une assertion Vitale est mise en œuvre pour établir un contexte de sécurité « carte Vitale ».

Lorsqu’un TLSi l’exige, le SI-PS doit générer une assertion SAML qui contient des informations de la carte Vitale. En fonction du TLSi, cette assertion Vitale peut être signée par la carte Vitale pour que le service puisse s’assurer de la présence d’une véritable carte Vitale.

Que l’assertion soit signée ou non, le service vérifiera toujours que la carte Vitale n’est pas en opposition.

Il n’y a pas obligatoirement de lien entre l’assertion PS/Structure et l’assertion Vitale.

− L’assertion PS/Structure peut être utilisée sans carte Vitale.
− Plusieurs assertions Vitale peuvent être utilisées avec une seule assertion PS/Structure.

Avant toutes sollicitations d’un TLSi, le SI-PS vérifie que l’assertion Vitale n’est pas obsolète. Si la durée de vie de l’assertion Vitale est dépassée, le SI-PS doit en générer une nouvelle.

Deux niveaux de sécurité :

**Niveau 1 :** Au moment de solliciter une opération d’un TLSi, le SI-PS doit générer une nouvelle assertion même si la précédente assertion est toujours valide.

**Niveau 2 :** Au moment de solliciter une opération d’un TLSi, le SI-PS doit s’assurer que la durée de vie de l’assertion n’est pas dépassée (soit 20 minutes) et que la carte liée à l’assertion Vitale est toujours présente dans le lecteur.

Chaque guide d’intégration mentionne si l’assertion Vitale doit être présente. Dans le cas où l’assertion Vitale est utilisée, le guide d’intégration mentionne également le niveau de sécurité minimal qui est exigé. Il est possible d’appliquer le niveau 1 pour un TLSi qui demande le niveau 2.

En complément, le SI-PS peut détruire l’assertion Vitale lorsque la carte Vitale est retirée du lecteur.

23/04/2026 
 ![icon: SESAM-Vitale logo](page_39_image_1_v2.jpg) 39 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 3.6 Authentification d'une application Carte Vitale

```mermaid
sequenceDiagram
    actor PS
    participant SI-PS
    participant TLSi as Service de l'Assurance Maladie (TLSi)
    participant ApCV as Application Carte Vitale
    participant SI_ApCV as Système d'information de l'ApCV

    PS-->>SI-PS: Demande de lecture d'une ApCV
    SI-PS->>ApCV: Lecture des données du bénéficiaire
    SI-PS<->>SI_ApCV: Négociation de la liaison sécurisée
    SI-PS->>SI_ApCV: Demande de contexte de proximité
    SI_ApCV-->>SI-PS: Contexte de proximité
    SI-PS->>SI-PS: Génération d'une nouvelle assertion ApCV
    PS-->>SI-PS: Accès à un TLSi
    SI-PS<->>TLSi: Négociation de la liaison sécurisée
    SI-PS->>TLSi: Requête SOAP (assertion PS, assertion ApCV)
    TLSi->>TLSi: Vérification de l'assertion PS et de l'assertion ApCV
    TLSi-->>SI-PS: Réponse SOAP
    SI-PS-->>PS: Réponse
```

Figure 7 – Assertion ApCV

23/04/2026
40 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

![icon: icon](page_41_image_2_v2.jpg)

Une assertion ApCV permet d’établir un contexte de sécurité « application Carte Vitale ». Chaque guide d’intégration TLSi mentionnera si dans son domaine d'application, l’assertion ApCV peut être utilisée ou non.

En premier lieu, le SI-PS doit acquérir les données d’une <u>ApCV et doit</u> interroger le système d’information des ApCV afin de récupérer un *contexte ApCV*. Ce dernier contient, en complément des informations sur le bénéficiaire, un numéro de série ApCV, un jeton d’autorisation ApCV ainsi qu’une durée de validité du contexte.

Pour acquérir un contexte ApCV, il est nécessaire d’utiliser une assertion PS ou une assertion Structure.

Le SI-PS reçoit le contexte ApCV uniquement si l’ApCV est authentique et n’est pas mise en opposition.

Il convient de vérifier que la date de fin de validité du contexte ApCV n'est pas dépassée avant de créer ou d'utiliser une assertion ApCV.

Ces opérations de récupération du contexte ApCV sont décrites dans le guide d’intégration « *Authentifier et gérer le contexte ApCV PS* » (ApCV-MP-001) fourni par le GIE SESAM-Vitale.

Ensuite, le SI-PS génère une assertion ApCV en y incluant le numéro de série de l’ApCV et le jeton d’autorisation ApCV. L’assertion ApCV n’est pas signée.

Au moment de solliciter une opération d’un TLSi, le SI-PS doit s’assurer que la durée de vie de l’assertion (l'objet XML SAML) n’est pas dépassée (soit 20 minutes).

Enfin, le SI-PS insère l'assertion ApCV dans l'en-tête des requêtes SOAP vers le SIR.

Lorsque le service reçoit une assertion ApCV, il vérifie que le jeton d’autorisation ApCV est toujours valide.

Le jeton d’autorisation ApCV est invalide dans les cas suivants :

− à la demande d’un SI-PS lors du départ du patient,
− lors de la lecture d’une nouvelle ApCV par le PS,
− lors de l’utilisation de l’ApCV chez un autre PS,
− ou après le dépassement de la durée de validité du contexte ApCV.

23/04/2026

![icon: icon](page_41_image_1_v2.jpg) 41 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

# Chapitre 4

# Échanges SOAP

## 4.1 Principe général

```mermaid
sequenceDiagram
    participant SI-PS
    participant TLSi as Service de l'Assurance Maladie (TLSi)

    SI-PS->>TLSi: Requête SOAP
    
    alt Réponse
        TLSi-->>SI-PS: Réponse SOAP
    else [en cas d'erreur]
        TLSi-->>SI-PS: Erreur SOAP
    end
```

Figure 8 – Échange SOAP en mode synchrone

Ces échanges respectent les principes décrits dans le document SOAP HTTP Binding 1. Les requêtes et les réponses sont des messages SOAP 1.2 transmis sur le protocole **HTTP 1.1**.

Les requêtes **HTTP** sont de type **POST** et doivent être encodées en **UTF-8**.

L’en-tête HTTP Content-Type doit être positionné à :

Content-Type=application/soap+xml;charset=utf-8

Dans le cas de l’utilisation de Pro Santé Connect, l’en-tête **Authorization: Bearer** contient le jeton d’accès AM retourné par le service d’autorisation de l’Assurance Maladie.

Le corps de la requête HTTP contient la requête SOAP.

23/04/2026 
 ![icon: SESAM-Vitale logo](page_42_image_1_v2.jpg) 42 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

Le codage littéral doit être utilisé ; l’élément `encodingStyle` n’est pas présent dans la requête SOAP<sup>6</sup>.

```text
POST/nomService HTTP/1.1
Host:server.example.fr
Content-Type:application/soap+xml;charset=utf-8
Content-Length:nnnn
```

Les réponses peuvent prendre l’une des formes suivantes : erreur HTTP, réponses SOAP positives ou erreur SOAP.

```text
HTTP/1.1 200 OK
Content-Type:application/soap+xml;charset=utf-8
Content-Length:nnnn
```

Une réponse SOAP positive possède un code de statut HTTP égal à 200 et contient toujours un message SOAP.

Si une erreur se produit, plusieurs cas sont à envisager :

− Si une erreur HTTP intervient au niveau du protocole HTTP, les codes de statut HTTP sont utilisés. Cette réponse ne contient pas de message SOAP.

− Si le corps du message contient une erreur SOAP, le code de statut HTTP est soit 400 pour une erreur imputée au client soit 500 pour une erreur imputable au serveur.

<table>
  <thead>
    <tr>
      <th><strong>Type de réponse</strong></th>
      <th><strong>Code HTTP</strong></th>
      <th><strong><b>Description</b></strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Erreur HTTP</td>
      <td>4xx, 5xx</td>
      <td>Tous types d’erreurs HTTP.<br />La réponse ne contient pas de message ni d’erreur SOAP.</td>
    </tr>
    <tr>
      <td>Erreur SOAP</td>
      <td>400, 500</td>
      <td>Tous types d’erreurs SOAP.<br />La réponse contient une erreur SOAP.</td>
    </tr>
    <tr>
      <td>Aucune erreur</td>
      <td>200</td>
      <td>La réponse contient un message SOAP.</td>
    </tr>
  </tbody>
</table>



![icon: SESAM-Vitale logo](page_43_image_1_v2.jpg) 43 / 102

<sup>6</sup> http://www.w3.org/TR/2003/REC-soap12-part2-20030624
23/04/2026
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## 4.2 Requêtes SOAP

Une requête SOAP est composée d’un en-tête `<Header>` et d’un corps de message `<Body>`.

```xml
<soap:Envelope>
  <soap:Header> ... </soap:Header> [1]
  <soap:Body> ... </soap:Body> [1]
</soap:Envelope>
```

L’élément XML `<soap:header>` contient des informations techniques destinées à être traitées par le SIR. Ces informations permettent, par exemple, le contrôle d’accès, la traçabilité des échanges, l’adressage du TLSi au sein du SIR, le maintien d’un dialogue avec celui-ci ou la gestion de la sécurité.

L’élément XML `<soap:Body>` contient le corps du message, c’est-à-dire le document métier propre au TLSi.

```mermaid
graph TD
    subgraph Message_SOAP [Message SOAP]
        direction TB
        subgraph Header_SOAP [Header SOAP]
            direction TB
            Action[Action]
            MessageId[MessageId]
            Security[Security]
            ContexteLPS[ContexteLPS]
            ContexteBAM[ContexteBAM]
        end
        subgraph Body_SOAP [Body SOAP]
            direction TB
            Document_metier[Document métier]
        end
    end

    style Message_SOAP fill:none,stroke:#000,stroke-width:2px
    style Header_SOAP fill:none,stroke:#000,stroke-width:2px
    style Body_SOAP fill:none,stroke:#000,stroke-width:2px
    style Action fill:none,stroke:#000,stroke-width:2px
    style MessageId fill:none,stroke:#000,stroke-width:2px
    style Security fill:none,stroke:#000,stroke-width:2px
    style ContexteLPS fill:none,stroke:#000,stroke-width:2px
    style ContexteBAM fill:none,stroke:#000,stroke-width:2px
    style Document_metier fill:none,stroke:#000,stroke-width:2px
```

Figure 9 – Requête SOAP

23/04/2026
44 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

### 4.2.1 Header SOAP

```text
<soap:Envelope>
  <soap:Header>
    <wsa:Action> ... </wsa:Action> [1]
    <wsa:MessageId> ... </wsa:MessageId> [1]
    <wsse:Security> ... </wsse:Security> [0..1]
    <ContexteLPS> ... </ContexteLPS > [1]
    <ContexteBAM> ... </ContexteBAM > [0..1]
  </soap:Header>
  <soap:Body> ... </soap:Body> [1]
</soap:Envelope>
```

#### **En-tête <Action>**

L’élément XML `<Action>` de la norme WS-Addressing indique l’action à réaliser au sein du SIR. C’est une URN qui doit respecter le format suivant :

```text
"urn:"<TLSi>":"<version>":"<operation>
```

La version est composée du triplet :

```text
<version de référence>"."<version majeure>"."<version mineure>
```

La valeur de l’élément XML `<Action>` est définie dans le contrat WSDL du TLSi.

Par exemple : "urn:hr:1.0.12:GetHistorique"

#### **En-tête <MessageID>**

L’élément XML `<MessageID>` de la norme WS-Addressing transporte l’identifiant de la requête. Un nouvel identifiant est généré à chaque appel. Il permet de suivre le cheminement du message dans les différentes couches d’infrastructure. Cet identifiant est du type URI et est composé d’un UUID. Le format de cet élément est "uuid:"<UUID>.

Par exemple : "uuid:550e8400-e29b-41d4-a716-446655440000"

23/04/2026 
 ![icon: 45 / 102](page_45_image_1_v2.jpg) 45 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

## **En-tête <Security>**

Selon les spécifications d’OASIS Web Services Security (WSS) TC, l’en-tête `<wsse:Security>` fournit un mécanisme pour attacher des assertions SAML (le profil WS-Security Basic Profile) ou un identifiant et un mot de passe.

L’insertion des assertions SAML dans la requête SOAP doit être conforme au SAML Binding.

Par exemple : cas de transmission d’une assertion SAML (PS ou Structure) :

```xml
<wsse:Security xmlns:wsse="...">
  <saml:Assertion xmlns:saml="...">
  ...
  </saml:Assertion>
</wsse:Security>
```

L’assertion PS et l’assertion Structure ne sont pas utilisées en même temps.

L’assertion Vitale ou l’assertion ApCV n’est pas systématiquement présente, cela dépend du TLSi appelé. L’assertion ApCV et l’assertion Vitale ne sont jamais présentes en même temps.

Par exemple : cas de transmission d’une assertion PS avec une assertion Vitale ou une assertion ApCV :

```xml
<wsse:Security xmlns:wsse="...">
  <!-- Assertion PS -->
  <saml:Assertion xmlns:saml="...">
  ...
  </saml:Assertion>
  <!--Assertion Vitale ou Assertion ApCV-->
  <saml:Assertion xmlns:saml="...">
  ...
  </saml:Assertion>
</wsse:Security>
```

L’en-tête WS-Security permet également de transmettre un identifiant et un mot de passe. Pour les TLSi, le mot de passe est transmis en clair. Seuls les éléments XML `<wsse:Username>` et `<wsse:Password>` sont utilisés.

Cas de transmission d’un mot de passe :

```xml
<wsse:Security xmlns:wsse="...">
  <wsse:Username> ... </wsse:Username>
  <wsse:Password> ... </wsse:Password>
</wsse:Security>
```

23/04/2026 46 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

**Cas sans assertion PS ou assertion Structure** : Dans le cas d’une authentification mutuelle sans assertion, l’en-tête `<wsse:Security>` n’est pas présent. Les contrôles d’accès sont effectués à partir des contextes LPS/BAM et des informations d’identité issues du certificat de la structure.

## En-tête <ContexteLPS>

Les requêtes SOAP sont accompagnées d’informations techniques caractérisant le SI-PS. Ces informations permettant d’effectuer des contrôles d’accès vis-à-vis du numéro d’autorisation du SI-PS `<IDAM>`. En ce qui concerne la description XSD de ce contexte, il faut se référer à la dernière version du document ROOT_ctxlps_CTXLPS_Vxx_xx.xsd.

Son espace de nommage est urn:siram:lps:ctxlps.

```xml
<ContexteLPS xmlns:ctxlps="…" Nature="CTXLPS" Version="…">
  <Id> ... </Id> [1]
  <Temps> ... </Temps> [1]
  <Emetteur> ... </Emetteur> [1]
  <LPS>
    <IDAM R=" ... "> ... </IDAM> [1]
    <Version> ... </Version> [1]
    <Instance> ... </Instance> [1]
    <Nom> ... </Nom> [1]
  </LPS>
</ContexteLPS>
```

### avec :

Nature **[optionnel] [AN]**

> Cet attribut XML contient la nature fonctionnelle du contenu du contexte LPS. La valeur est fixée à "CTXLPS".

Version **[obligatoire] [AN]**

> Cet attribut XML contient la version du contexte précisée dans le fichier XSD associé. La valeur actuelle est fixée à "01_00".

`<Id>` **[obligatoire] [36AN]**

> Cet élément XML contient l’identifiant unique du contexte. Ce numéro prend la forme d’un UUID sous sa forme canonique (36 caractères) et doit être régénéré à chaque nouveau contexte.
>
> Par exemple : "06c6bece-28d6-11e6-86d7-e6618c2586e4"

23/04/2026 47 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

### &lt;Temps&gt; **[obligatoire] [DT]**

Cet élément XML contient la date et l’heure UTC de création du contexte LPS.

Par exemple : "2011-10-17T12:59:49Z"

### &lt;Emetteur&gt; **[obligatoire] [AN]**

Cet élément XML contient l’identifiant de l’émetteur à l’origine du contexte.
C’est-à-dire :

– Soit le `<Subject><NameID>` de l’assertion PS ou de l’assertion Structure ;
– Soit l’identifiant `<username>` utilisé lors d’un accès par identifiant et mot de passe.

Dans le cas où le contexte LPS est émis sans assertion PS ou Structure, cet élément XML reprend la valeur de l’identifiant de la structure de santé (idNatStruct<sub>[5]</sub>).

### &lt;IDAM&gt; **[obligatoire] [AN]**

Cet élément XML contient le numéro d’autorisation attribué par l’Assurance Maladie et obtenu lors de la vérification de la conformité du SI-PS.

Ce numéro joue le rôle d’identifiant du logiciel. Il est utilisé pour contrôler l’accès du TLSi par le SI-PS.

Le numéro d’autorisation est confidentiel. Il ne doit pas être accessible ou paramétrable par le PS ou par la structure de santé.

### IDAM@R **[obligatoire] [2N]**

Cet attribut XML contient le type de vérification de conformité :

– "1" pour un numéro d’agrément ;
– "2" pour un NCC ;
– "3" pour un certificat de conformité ;
– "4" pour un numéro d’autorisation.

Dans le cas des TLSi, R="4" pour des numéros d’autorisation délivrés par le CNDA.

23/04/2026
![icon: SESAM-Vitale logo](page_48_image_1_v2.jpg) 48 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

&lt;Version&gt; **[obligatoire] [AN]**
       Cet élément XML contient le numéro de version du logiciel autorisé pour le TLSi
       appelé.

       La version du SI-PS est celle déclarée au CNDA lors du processus de vérification
       de conformité du TLSi considéré.

       La valeur de cette version reste identique tant qu’il n’y a pas eu de nouvelle
       autorisation du SI-PS sur le TLSi considéré.

       Cette information ne doit pas être modifiable par le PS ou par la structure de
       santé.

       La version est utilisée pour contrôler l’accès au TLSi par le SI-PS.

&lt;Instance&gt; **[obligatoire] [36AN]**
       Cet élément XML contient le numéro de série ou identifiant de l’installation du
       logiciel.

       Cet élément XML correspond dans sa définition au champ « LPS_ID » du jeton
       VIHF<sup>7</sup> du CI-SIS. Si le SI-PS implémente un des volets transport du CI-SIS, la valeur
       de cet élément XML doit être identique à la valeur du champ LPS_ID de jeton
       VIHF.

       Cet identifiant est généré lors de l’installation du SI-PS. Cet identifiant prend la
       forme d’un UUID sous sa forme canonique. Il doit être pérenne pour une
       installation d’un logiciel. Ce numéro est une aide au support, car il permet de
       regrouper les requêtes d’un même logiciel. Il permet également de compter le
       nombre de logiciels distincts accédant au TLSi.

       Par exemple : "9f822c04-cb46-49c1-9a7b-da18b97f6f65"

&lt;Nom&gt; **[obligatoire] [AN]**
       Cet élément XML contient le nom et la version commerciale du SI-PS.

       Format de cette donnée est une URN : urn:lps:[nom du LPS]:[version commerciale
       du SI-PS]

***

<sup>7</sup> CI-SIS_TRANSPORT_VOLET-SYNCHRONE_V3.0 au chapitre 4.3.1.10.1.1.

23/04/2026 ![icon: SESAM-Vitale logo](page_49_image_1_v2.jpg) 49 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE
SESAM-Vitale

Cadre d’interopérabilité des TLSi

Par exemple : `<ci:nom>urn:lps:MYPRODUIT:13B.RC8<ci:nom>`

Le nom et la version commerciale ne doivent pas contenir de caractère «:».

Le nom du SI-PS est celui déclaré au CNDA lors du processus de vérification de conformité. Cette information ne doit pas être modifiable par le PS ou par la structure de santé.

La version commerciale du SI-PS est la version connue et vue par le PS. Cette information ne doit pas être modifiable par le PS ou par la structure de santé.

## **En-tête <ContexteBAM>**

Ces informations concernent les données de l’assuré et du bénéficiaire objet de la requête. Ce contexte est construit à partir des informations issues de la carte Vitale, de l'ApCV ou du SI-PS. En ce qui concerne la description XSD de ce contexte, il faut se référer à la dernière version du document ROOT_ctxbam_CTXBAM_Vxx_xx.xsd.

```xml
<ContexteBAM Nature="CTXBAM" Version="..." xmlns="...">
  <Id> ... </Id> [1]
  <Temps> ... </Temps> [1]
  <Emetteur> ... </Emetteur> [1]
  <DateRef> ... </DateRef> [0..1]
  <COUVERTURE> [0..1]
    <GrandRegime> ... </GrandRegime> [0..1]
    <Organisme> ... </Organisme> [0..1]
    <CodeCentre> ... </CodeCentre> [0..1]
    <ASSURE> [0..1]
      <Id>
        <Num> ... </Num> [0..1]
        <Cle> ... </Cle> [0..1]
      </Id>
    </ASSURE>
    <BENEFICIAIRE> [0..1]
      <Nir>
        <Num> ... </Num> [0..1]
        <Cle> ... </Cle> [0..1]
        <DateCertification> ... </DateCertification> [0..1]
      </Nir>
      <DateNai> ... </DateNai> [0..1]
      <Rang> ... </Rang> [0..1]
    </BENEFICIAIRE>
  </COUVERTURE>
</ContexteBAM>
```

23/04/2026
![photo: progress indicator](page_50_image_1_v2.jpg) 50 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale

Cadre d’interopérabilité des TLSi

avec :

## Nature **[optionnel] [AN]**

Cet attribut XML contient la nature fonctionnelle du contenu du contexte. La valeur est fixée à "CTXBAM".

## Version **[obligatoire] [AN]**

Cet attribut XML contient la version du contexte précisée dans le fichier XSD associé. La valeur actuelle est fixée à "01_02".

## \<Id> **[obligatoire] [36AN]**

Cet élément XML contient l’identifiant unique du contexte. Ce numéro prend la forme d’un UUID sous sa forme canonique et doit être régénéré à chaque nouveau contexte.

Par exemple : "06c6bece-28d6-11e6-86d7-e6618c2586e4"

## \<Temps> **[obligatoire] [DT]**

Cet élément XML contient la date et l’heure UTC de création du contexte.

Par exemple : "2011-10-17T12:59:49Z"

## \<Emetteur> **[obligatoire] [AN]**

Cet élément XML contient l’identifiant de l’utilisateur à l’origine du contexte. C’est-à-dire :

–   Soit le \<Subject>\<NameID> de l’assertion PS ou de l’assertion Structure ;
–   Soit l’identifiant \<username> utilisé lors d’un accès par identifiant et mot de passe.

Dans le cas où le contexte BAM est émis sans assertion PS ou Structure, cet élément XML reprend la valeur de l’identifiant de la structure de santé (idNatStruct <u><sup>[7]</sup></u> ).

23/04/2026 
 ![icon: SESAM-Vitale logo](page_51_image_1_v2.jpg) 51 / 102
Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale