![logo: sesam-vitale](page_1_image_1_v2.jpg)

# **Préconisations de paramétrage des lecteurs QR code pour la lecture de l’appli carte Vitale**

*DSRI*

## **1 INTRODUCTION**

La présente note traite des préconisations de paramétrage pour les dispositifs de lecture QR Code référencés dans le catalogue produit du GIE SESAM-Vitale. La note a été rédigée à l’attention des éditeurs SESAM-Vitale et de leur réseau de distribution. Elle a pour objectif de contribuer à une réduction significative des erreurs directement liées à la qualité des données récupérées à partir des dispositifs de lecture QR Code.

## **2 MODE USB COM**

Le GIE SESAM-Vitale préconise **en priorité** la configuration des lecteurs de QR code en mode USB COM.

Pour cela :

- D’une part, les lecteurs doivent être paramétrés en mode USB COM. Pour information, l’ensemble des lecteurs référencés dans le catalogue Produit du GIE SESAM-Vitale bénéficie de ce paramétrage.

- D’autre part, les logiciels agréés en addendum 8 doivent permettre une lecture des QR code de l’appli carte Vitale sur le port COM. Un développement de l’éditeur SESAM-Vitale sera donc nécessaire. Pour ce faire, le GIE fournit un code exemple Java dans le document de Spécifications d’échange de proximité (ApCV-NT-001-Echanges de proximité) disponible dans la rubrique Equipements de Lecture dans l’espace Industriels. Ce code exemple ne bénéficiera pas d’un support par les équipes techniques du GIE SESAM-Vitale, cependant ce dernier sera maintenu.

### **2.1 Qualité de service**

Ce mode d’adressage des lecteurs QR code présente :

- Une excellente performance en termes de temps de lecture.
- Un excellent niveau de qualité de service en termes de taux de succès sur l’infrastructure SI d’accueil Appli carte Vitale.


1 / 3

Référence : **ApCV-NT-006** / Version : **1.0** / Date : **26/02/2024**
Rédigé par : **MONCLUS** / Approuvé par : **MARABOUT**
Sécurité : **DIFFUSION RESTREINTE**

*GIE SESAM-Vitale* 
![icon: GIE SESAM-Vitale logo](page_1_image_2_v2.jpg)

*ApCV-NT-006* *Préconisations de paramétrage des lecteurs QR code pour la lecture de l’appli carte Vitale* *Version : 1.0*

# 3 **MODE HID CLAVIER**

Le mode de configuration HID clavier n’est pas préconisé par le GIE SESAM-Vitale mais n’est pas interdit. En effet, ce mode, disponible par défaut sur tous les lecteurs QR Code, ne nécessite aucun développement de la part de l’éditeur SESAM-Vitale. Cette utilisation est néanmoins conditionnée par le paramétrage du lecteur en HID Clavier Français pour s’affranchir du problème de verrouillage Majuscule du clavier.

Pour information, l’ensemble des lecteurs référencés dans le catalogue Produit du GIE SESAM-Vitale propose le paramétrage en HID Clavier Français.

## 3.1 **Qualité de service**

Ce mode d’adressage des lecteurs QR code présente :

- Une faible performance en termes de temps de lecture par rapport au mode USB COM.
- Une mauvaise qualité de service en termes de taux de succès sur l’infrastructure SI d’accueil appli carte Vitale (format des blocs de données QR code altérés).

# 4 **MOYENS DE TESTS**

Afin d’aider les éditeurs SESAM-Vitale à tester le ou les équipements de lecture (NFC, QR Code, Cartes), le GIE met à disposition les outils suivants :

- LiTool : application de test de lecteurs QR Code, NFC, Cartes ;
- Application carte Vitale de démonstration ;
- Jeux de cartes Vitale et CPS de tests physiques (exclusivement pour les lecteurs intégrant un coupleur de carte PC/SC).

# 5 **POINTS D’ATTENTION**

L’expérience terrain liée à l’usage de l’appli carte Vitale a permis d’identifier deux problématiques provoquant un rejet de facturation :

Données invalides :

- Anomalie : Bloc de données corrompu par une mauvaise configuration du lecteur QR Code en mode HID Clavier. Rejet du SI appli Carte Vitale au motif de l’absence des caractères discriminants « PB83N8 » en base 45.
🡪 Solution : Reconfigurer ces lecteurs en mode HID-Clavier Français.

*26/02/2024* *GIE SESAM-Vitale* 
 ![icon: icon](page_2_image_1_v2.jpg) *2 / 3*
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*

*ApCV-NT-006 Préconisations de paramétrage des lecteurs QR code pour la lecture de l’appli carte Vitale Version : 1.0*

Taille du bloc de données incorrecte :

-   Anomalie : Lors de la présentation du QR Code au lecteur, l’assuré social ne retire pas suffisamment rapidement le smartphone de la caméra du lecteur, provoquant ainsi une multiple lecture du même QR Code. La taille du bloc de données envoyé au SI ApCV est supérieure à celle attendue et provoque un rejet.
    🡪 Solution : Paramétrer le délai de relecture du lecteur à 3 secondes (délai indicatif).

Pour aider les éditeurs SESAM-Vitale à paramétrer correctement les lecteurs référencés dans le catalogue Produit du GIE, des manuels de paramétrages rapides ont été mis à disposition dans l’espace Industriels. Ces manuels présentent les paramètres essentiels pour une utilisation de l’application carte Vitale optimale, que ce soit en termes de qualité de lecture comme de confort pour l’utilisateur.

## **6 AIDE DU GIE SESAM-VITALE**

Pour aider les éditeurs, le GIE SESAM-Vitale propose les documents et applications suivants :

> Le document de **spécifications des échanges de proximité** enrichi avec le mode USB COM assorti d’un code exemple Java.

> L’application de tests de lecteurs **LiTool** pour vérifier la compatibilité des lecteurs dans les modes NFC, USB COM, USB HID et Cartes Vitale et CPS. Jeux de cartes Vitale et CPS disponibles en contact le service [relations-industriels@sesam-vitale.fr](mailto:relations-industriels@sesam-vitale.fr).</u>

> L’**application carte Vitale Industriel** a demander en contactant le service <u>relations-industriels@sesam-vitale.fr.</u>

> Le **Tableau de synthèse de paramétrages** essentiels des lecteurs QR Code référencés dans le catalogue du GIE SESAM-Vitale. Ce tableau est accessible dans la rubrique « Equipements et solutions de lecture pour le numérique en santé » dans l’espace Industriels.

> Les **Guides de démarrages rapides** présentant les codes 2D essentiels de paramétrages des lecteurs référencés sur le site du GIE SESAM-Vitale. Les guides sont accessibles dans la rubrique « Equipements et solutions de lecture pour le numérique en santé » dans l’espace Industriels.

*26/02/2024 GIE SESAM-Vitale* 
 ![icon: icon](page_3_image_1_v2.jpg) 3 / 3
*Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale*