![logo: l'Assurance Maladie](2007-06-cdc-errata-norme-b2_images/page_1_image_1_v2.jpg) ![logo: MSA](2007-06-cdc-errata-norme-b2_images/page_1_image_2_v2.jpg) ![logo: RSI Régime Social des Indépendants](2007-06-cdc-errata-norme-b2_images/page_1_image_2_v2.jpg) ![logo: UNRS](2007-06-cdc-errata-norme-b2_images/page_1_image_3_v2.jpg)

# ***NORMES B2***

## **INTER-REGIMES**

Télétransmission de factures entre
Professionnels de santé et Organismes
d’Assurance Maladie

### ***Cahier des Charges***

Juin 2007

*avec ERRATA*

*Le présent cahier des charges est la copropriété des auteurs indiqués ci-après :*

*   **⮚ *Caisse Nationale d’Assurance Maladie des Travailleurs Salariés (CNAMTS),***
*   **⮚ *Caisse Centrale de la Mutualité Sociale Agricole (CCMSA),***
*   **⮚ <mark><u>*Régime Social Indépendant (RSI), (ex*</u></mark> *Assurance Maladie des Professions Indépendantes AMPI),***
*   **⮚ *Union Nationale des Régimes Spéciaux (UNRS).***

***Ces co-auteurs sont donc titulaires des droits d’auteur sur le dit Cahier des Charges conformément à l’article L 113.1 du code de la propriété intellectuelle. La publication ci-après n’entraîne aucune cession des droits d’auteurs à quelque personne que ce soit.***

***Toute atteinte aux droits d’auteur constitue un délit et est passible des sanctions indiquées au chapitre V du titre III du livre III du Code de la Propriété Intellectuelle.***

NORMES B2 - Cahier des Charges – Juin 2007 avec errata

# **TABLE DES MATIERES**

I - PRESENTATION GENERALE ........................................................................................................................ 1
II - PRINCIPES TECHNIQUES GENERAUX...................................................................................................... 4
   21 - COMPOSITION DES ENVOIS................................................................................................................... 4
   22 - RÉCAPITULATION DES TYPES D’ENREGISTREMENTS EXISTANTS............................................. 7
   23 - ENCHAINEMENT DES SÉQUENCES SELON LES CATÉGORIES DE PROFESSIONNELS DE
   SANTÉ              .................................................................................................................................................. 10
   24 - RUPTURE DES LOTS ............................................................................................................................... 16
   25 - EXEMPLES DE NUMÉROTATION DES LOTS ..................................................................................... 17
   26 - DÉFINITION DE LA FACTURE............................................................................................................... 21
   27 - REGLES DE PRÉSENTATION DES INFORMATIONS ......................................................................... 22
III - MODALITES DE TELETRANSMISSION.................................................................................................. 31
IV - DOCUMENTS ET PIECES JUSTIFICATIVES A FOURNIR PAR LE PROFESSIONNEL DE SANTE 31
   41 - BORDEREAU D’ACCOMPAGNEMENT DES PIECES JUSTIFICATIVES .......................................... 31
   42 - PIECES JUSTIFICATIVES A JOINDRE................................................................................................... 32
TYPE 000 ............................................................................................................................................................... 33
   TYPE 000 : DEBUT FICHIER - TOUTES NORMES ........................................................................................ 34
TYPE 1 ................................................................................................................................................................... 36
   TYPE 1 : DEBUT LOT - TOUTES NORMES ................................................................................................... 37
TYPE 2 ................................................................................................................................................................... 40
   TYPE 2 : DEBUT FACTURE - TOUTES NORMES <sub>SAUF CP</sub>................................................................................ 41
   TYPE 2 : DEBUT FACTURE – .......................................................................................................................... 45
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 45
   TYPE 2S : SUITE DEBUT FACTURE –............................................................................................................ 49
   TOUTES NORMES <sub>SAUF CP</sub> ................................................................................................................................ 49
   TYPE 2S : SUITE DEBUT FACTURE –............................................................................................................ 50
   TOUTES NORMES <sub>SAUF CP</sub> ................................................................................................................................ 50
   TYPE 2S : SUITE DEBUT FACTURE –............................................................................................................ 51
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 51
   TYPE 2E : SUITE DEBUT FACTURE - ............................................................................................................ 53
   TOUTES NORMES <sub>SAUF CP</sub> ................................................................................................................................ 53
   TYPE 2M : COMPLEMENT FACTURE, INFO OC –...................................................................................... 54
   TOUTES NORMES <sub>SAUF CP, CT ET TA</sub>................................................................................................................ 54
   TYPE 2M : COMPLEMENT FACTURE, INFO OC –...................................................................................... 55
   TOUTES NORMES <sub>SAUF CP, CT ET TA</sub>................................................................................................................ 55
   TYPE 2P : COMPLEMENT FACTURE, INFO OC – ....................................................................................... 56
   TOUTES NORMES <sub>SAUF CP, CT ET TA</sub>................................................................................................................ 56
   TYPE 2B : COMPLEMENT FACTURE, ADRESSE –...................................................................................... 57
   NORME CT <sub>OU</sub> CP (ETABLISSEMENTS PUBLICS ET PRIVES) ............................................................................. 57
   TYPE 2C : COMPLEMENT FACTURE, ADRESSE <sub>ET</sub> DOM–......................................................................... 58
   NORME CT <sub>OU</sub> CP (ETABLISSEMENTS PUBLICS ET PRIVES) ............................................................................. 58
TYPE 3 ................................................................................................................................................................... 59
   TYPE 3 : PRESTATIONS HOSPITALIERES - ................................................................................................ 60
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 60
   TYPE 3S : SUITE PRESTATIONS HOSPITALIERES - ................................................................................... 67
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 67
   TYPE 3E : SUITE PRESTATIONS HOSPITALIERES - ................................................................................... 70
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 70
   TYPE 3F : CODAGE LPP –.............................................................................................................................. 71
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 71
   TYPE 3F : CODAGE LPP –.............................................................................................................................. 72
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 72
   TYPE 3H : CODAGE PHARMACIE HOSPITALIERE – ............................................................................... 73
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 73
   TYPE 3H : CODAGE PHARMACIE HOSPITALIERE – ............................................................................... 74
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 74

NORMES B2 - Cahier des Charges – Juin 2007 avec errata

# **TABLE DES MATIERES**

TYPE 4 ................................................................................................................................................................. 75
   TYPE 4 : LIGNE ACTE - TOUTES NORMES SAUF CP.................................................................................. 76
   TYPE 4 : LIGNE ACTE – ................................................................................................................................. 82
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 82
   TYPE 4S : SUITE LIGNE ACTE - TOUTES NORMES SAUF CP ................................................................... 86
   TYPE 4S : SUITE LIGNE ACTE - NORME CP .............................................................................................. 88
   TYPE 4E : SUITE LIGNE ACTE - TOUTES NORMES................................................................................... 91
   TYPE 4B : CODAGE BIOLOGIE – ................................................................................................................. 92
   NORMES CP (ETABLISSEMENTS PUBLICS ET PRIVES), CS, ER ET LB ................................................... 92
   TYPE 4D : CODAGE DENTAIRE NGAP – ................................................................................................... 93
   NORMES CP (ETABLISSEMENTS PUBLICS ET PRIVES), CS ET ER .......................................................... 93
   TYPE 4F : CODAGE LPP – NORMES PH, FR, <mark>, PE ET CS</mark> .......................................................................... 94
   TYPE 4H : CODAGE PHARMACIE HOSPITALIERE – ............................................................................... 96
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ......................................................................................... 96
   TYPE 4M : CODAGE CCAM – ...................................................................................................................... 98
   NORMES ER, CS ET CP (ETABLISSEMENTS PUBLICS ET PRIVES) .......................................................... 98
   TYPE 4P : CODAGE PHARMACIE – NORME PH ET ER .......................................................................... 101
   TYPE 4R : CODAGE PHARMACIE – NORME PH ET ER .......................................................................... 105
   TYPE 4R : CODAGE PHARMACIE – NORME PH ET ER .......................................................................... 106
   TYPE 4T : COMPLEMENT LIGNE TRANSPORT – NORME TA ............................................................. 107
   TYPE 4U : DETAIL TRANSPORT – NORME TA ........................................................................................ 109
TYPE 5 ............................................................................................................................................................... 111
   TYPE 5 : FIN FACTURE - TOUTES NORMES SAUF CP .......................................................................... 112
   TYPE 5 : FIN FACTURE –............................................................................................................................ 114
   NORME CP (ETABLISSEMENTS PUBLICS ET PRIVES) ....................................................................................... 114
TYPE 6 ............................................................................................................................................................... 116
   TYPE 6 : FIN LOT - TOUTES NORMES ..................................................................................................... 117
TYPE 999 ........................................................................................................................................................... 119
   TYPE 999 : FIN FICHIER - TOUTES NORMES.......................................................................................... 120
ANNEXES COMMUNES A TOUTES LES NORMES ..................................................................................... 121
   ANNEXE 1 TYPES DE DESTINATAIRES OU D’EMETTEURS ............................................................. 122
   ANNEXE 2 GRANDS REGIMES................................................................................................................ 123
   ANNEXE 3 CODIFICATION DES ORGANISMES GESTIONNAIRES ET DESTINATAIRES ............ 124
   ANNEXE 4 CODES NORMES ................................................................................................................... 125
   ANNEXE 5 VERIFICATION DES CLES.................................................................................................... 126
   ANNEXE 6 REMPLISSAGE PARTICULIER DES TYPES 3 ET 4 .......................................................... 127
   ANNEXE 7 NATURE D’OPERATION....................................................................................................... 130
   ANNEXE 8 NATURE DE LA PIECE JUSTIFICATIVE DES DROITS ................................................... 131
   ANNEXE 9 EXONERATION DU TICKET MODERATEUR.................................................................... 132
   ANNEXE 10 CODIFICATION DES PRESTATIONS ................................................................................... 137
   ANNEXE 11 SEQUENCE DES CALCULS : ARRONDIS .......................................................................... 138
   ANNEXE 12 QUALIFICATIF DE LA DEPENSE ....................................................................................... 142
   ANNEXE 13 MODE DE TRAITEMENT ..................................................................................................... 143
   ANNEXE 14 NORME CT - CODES NATURE DE VOIES P&T ................................................................. 144
   ANNEXE 15 NORME CT - CODIFICATION.............................................................................................. 145
   ANNEXE 16 NORME CP - TRAITEMENT DU FORFAIT JOURNALIER................................................ 146
   ANNEXE 17 LA TRANSMISSION INTER-REGIMES .............................................................................. 152
   ANNEXE 20 LES REGIMES SPECIAUX MEMBRES DE L'UNRS .......................................................... 154
   ANNEXE 21 CODIFICATION DES ZONES TARIFS ................................................................................. 155
   ANNEXE 22 ETABLISSEMENT EN DOTATION ANNUELLE HOPITAUX PUBLICS, PSPH, HOPITAUX
                    MILITAIRES .............................................................................................................................. 159
   ANNEXE 23 PRISE EN COMPTE DE LA CMU ........................................................................................ 162
   ANNEXE 24 PRISE EN COMPTE DE LA TAA ......................................................................................... 166
   ANNEXE 25 PARCOURS DE SOINS......................................................................................................... 167
   ANNEXE 26 PRISE EN COMPTE DE LA PARTICIPATION ASSURE EN VILLE................................. 169

NORMES B2 - Cahier des Charges – Juin 2007 avec errata

**MODIFICATIONS INCLUSES DANS CETTE VERSION**

La **version Juin 2007** du cahier des charges modifie la **version Juin 2005** et ses **addenda A et B.**

Cette version prend en compte les évolutions relatives aux nouveaux types 4P et 4R « codage pharmacie » pour véhiculer le code CIP à 13 caractères.
Elle intègre également des correctifs (<mark>surlignés en jaune</mark>) qui sont à l’origine de cet errata

<mark><u>Dans l’ensemble du document, les mentions au régime AMPI sont remplacées par le régime social indépendant (RSI)</u></mark>

### ***PAGE 3***
***Présentation générale***
Paragraphe 4, ajout des nouveaux types détails 4P et 4R et suppression du type 4C

### ***PAGES 5-6***
***Composition des envois***
<mark><u>Ajout du type 4F aux normes PE et CS</u></mark>
Ajout de la particularité concernant la caisse de paiement unique
<mark><u>Suppression de la mention « L’établissement doit renseigner le type 1 avec le grand régime et le n° de la CPU »</u></mark>

### ***PAGES 7-8***
***Récapitulation des types d'enregistrements existants***
Modification sur le type 4A
<mark><u>Ajout du type 4F aux normes PE et CS</u></mark>
Ajout des types 4P et 4R en norme PH et ER (pour les médecins propharmaciens)
Suppression du type 4C
<mark><u>Les types 4T et 4U sont rendus obligatoires pour les taxis</u></mark>

### ***PAGES 12 à 13***
***ENCHAINEMENT DES SÉQUENCES SELON LES CATÉGORIES DE PROFESSIONNELS DE SANTÉ***
<mark><u>Ajout du type 4F aux normes PE et CS</u></mark>
Ajout de consignes sur le type 4P et 4R en norme ER
Ajout de consignes sur le type 4P et 4R en norme PH
<mark><u>Les types 4T et 4U sont rendus obligatoires pour les taxis</u></mark>

### ***PAGE 16***
***Exemple de numérotation des lots***
<mark><u>Ajout du type 4F aux normes PE et CS</u></mark>
Ajout du type 4P et suppression du type 4C

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page I

# **MODIFICATIONS INCLUSES DANS CETTE VERSION**

## **PAGE 24**
### ***Règles de présentation des informations***
Modification des actes de référence dans les §51 et §52
Suppression du §53 sur la présentation des clichés
Suppression du §54 sur l’électrocardiogramme
Suppression du §58 sur la radiothérapie
<mark><u>Modification du § 63.1sur la LPP </u></mark>

## **PAGE 27**
### ***Codage de la pharmacie***
Modification des consignes sur la pharmacie de ville
Modification des consignes sur la pharmacie rétrocédée par les établissements de santé publics ou privés

## **PAGES 37-38**
### ***TYPE 1 - Toutes Normes***
Numéro de version 062007
Ajout de consignes pour la caisse de paiement unique

## **PAGES 41 à 43**
### ***TYPE 2 – Toutes Normes sauf CP***
<mark><u>Modification du libellé et de la consigne pour les factures sécurisées sur dispositif portable </u></mark>
Suppression de la mention du régime des mines pour la valeur « 06 » du champ « destinataire de règlement »

## **PAGE 44**
### ***TYPE 2 - Norme CP***
Ajout de consignes pour le remplissage du n° de titre pour les établissements publics

## **PAGES 46-47**
### ***TYPE 2S - Toutes Normes sauf CP***
Ajout de consignes dans la zone « origine de la prescription » pour les opticiens

## **PAGES 59-65**
### ***TYPE 3 - Norme CP***
<mark><u>Ajout de consignes sur le mode de traitement pour la T2A </u> ~~<u>publique</u>~~</mark>
<mark><u>Ajout de consignes sur la discipline pour la T2A publique</u></mark>
Ajout de consignes sur le code participation assuré pour les cas de prise en charge par le régime

## **PAGES 67**
### ***TYPE 3S - Norme CP***
<mark><u>Ajout de consigne pour l’Hospitalisation à domicile de résident en EHPA(D) </u></mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page II

# **MODIFICATIONS INCLUSES DANS CETTE VERSION**

## ***PAGE 69***
### ***TYPE 3E - Norme CP***
<u>Ajout de consignes sur le mode de traitement </u> pour la T2A publique
<mark><u>Passage de l’identifiant RPPS en numérique </u></mark>

## ***PAGE 73***
### ***TYPE 3H - Norme CP***
Modification de la consigne sur le prix d’achat unitaire TTC

## ***PAGES 75-78***
### ***TYPE 4 – Toutes normes sauf CP***
Modification de consignes sur le complément de type
Ajout de consignes sur le code participation assuré pour les cas de prise en charge par le régime
Ajout de consignes sur le remplissage du prix unitaire, en lien avec le type 4P

## ***PAGES 81-84***
### ***TYPE 4 –norme CP***
<mark><u>Ajout de consignes sur le mode de traitement pour la T2A publique</u></mark>
<mark><u>Ajout de consignes sur la discipline pour la T2A publique</u></mark>

## ***PAGES 88-89***
### ***TYPE 4S –norme CP***
Les zones N° de remplaçant et complément au N° de remplaçant sont supprimées.
Ajout de consignes sur le code participation assuré pour les cas de prise en charge par le régime <mark><u>et en cas d’hospitalisation</u> </mark>

## ***PAGES 90***
### ***TYPE 4E –toutes normes***
<mark><u>Passage de l’identifiant RPPS en numérique</u> </mark>

## ***PAGE***
### ***TYPE 4C - Norme PH et ER***
Suppression du type 4C

## ***PAGE***
### ***TYPE 4F - Norme PH et ER***
<mark><u>Ajout du type 4F aux normes PE et CS </u></mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page III

# **MODIFICATIONS INCLUSES DANS CETTE VERSION**

---

## ***PAGES 100-103***
### **TYPE 4P - Normes PH et ER**
Création du type 4P
<mark><u>Modification de consignes sur le type 4P</u></mark>

---

## ***PAGES 104***
### **TYPE 4R - Normes PH et ER**
Création du type 4R
<mark><u>Modification de consignes sur le type 4R, il est facultatif</u></mark>

---

## ***PAGE 113***
### **TYPE 5 - Norme CP**
Création d’une zone à l’usage des éditeurs de logiciels hospitaliers

---

## ***PAGES 115-116***
### **TYPE 6 – Toutes Normes**
Correction de consignes sur la zone « comptabilisation des enregistrements de type 2 »
Ajout de consignes sur la zone 61-72 pour les logiciels non SESAM
<mark><u>Modification de consignes sur la zone 88-96 « N° d’identification du PS signataire »</u></mark>

---

## ***PAGE 127***
### **ANNEXE 6**
Ajout de consignes pour l’AME et les actes CCAM. <mark><u>Ajout de la mention « en norme CP »</u></mark>

---

## ***PAGE 150-151***
### **ANNEXE 17**
Suppression des modalités de transfert en Xmodem et Pesit.
Ajout de consignes sur la transmission en SMTP avec chiffrement

---

## ***PAGES 154***
### **ANNEXE 21**
Ajout de la spécialité 36

---

## ***PAGES 157-159***
### **ANNEXE 22**
Ajout de consignes sur la facturation des soins et consultations externes dans le cadre de la T2A publique

---

## ***PAGES 175***
### **ANNEXE 26**
<mark><u>Ajout de la référence à l’annexe 26 externalisée</u></mark>

******************************

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page IV

# **I - PRESENTATION GENERALE**

Le cahier des charges définit les normes qui permettent de traiter des flux magnétiques en provenance de l'une des professions suivantes :

<table>
  <thead>
    <tr>
      <th></th>
      <th><b>Codes Normes</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Infirmiers</td>
      <td>IF</td>
    </tr>
    <tr>
      <td>- Masseurs-Kinésithérapeutes</td>
      <td>MK</td>
    </tr>
    <tr>
      <td>- Orthophonistes</td>
      <td>OO</td>
    </tr>
    <tr>
      <td>- Orthoptistes</td>
      <td>OY</td>
    </tr>
    <tr>
      <td>- Pédicures</td>
      <td>PE</td>
    </tr>
    <tr>
      <td>- Dispensaires Centres de santé</td>
      <td>CS</td>
    </tr>
    <tr>
      <td>- Laboratoires</td>
      <td>LB</td>
    </tr>
    <tr>
      <td>- Centres thermaux</td>
      <td>CT</td>
    </tr>
    <tr>
      <td>- Transports sanitaires</td>
      <td>TA</td>
    </tr>
    <tr>
      <td>- Ensemble prescripteuR : généralistes, spécialistes,<br />chirurgiens-dentistes, sages-femmes, structures<br />de scanographie, …</td>
      <td>ER</td>
    </tr>
    <tr>
      <td>- Pharmaciens et fournisseurs</td>
      <td>PH</td>
    </tr>
    <tr>
      <td>- Cliniques privées et hôpitaux</td>
      <td>CP</td>
    </tr>
    <tr>
      <td>- Fournisseurs</td>
      <td>FR</td>
    </tr>
  </tbody>
</table>

à destination d'une CPAM, d'une CMSA, d'un organisme gestionnaire du <mark>régime <u>social</u></mark> <mark><u>indépendant</u></mark>, d'un régime spécial membre de l'Union Nationale des Régimes Spéciaux (UNRS) (Voir liste en annexe 20). [Supprimé : d'Assurance Maladie des Professions Indépendantes]

Les normes répondent à cinq caractéristiques :

1) elles sont communes aux différents régimes ci-dessus.

2) elles peuvent véhiculer l'identification d'un organisme de protection complémentaire (mutuelle - assurance) et les montants éventuellement à la charge de ce dernier

3) les informations télétransmises reflètent exactement la facturation des actes retracée sur le support papier (feuille de soins ou facture)

4) les normes sont conçues pour recevoir une codification affinée des actes ou des produits, dans le respect du secret médical. Elles sont utilisables sans cette codification affinée si celle-ci n'est pas obligatoire

5) elles permettent, sous réserve d'accords locaux, d'adresser le remboursement soit au professionnel de santé (tiers-payant), soit à l'assuré lorsque le professionnel a perçu le paiement mais souhaite faciliter le remboursement de son client au moyen de la télétransmission

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 1

<u>Conditions de mise en œuvre des cinq caractéristiques énoncées</u>

1) Les normes ont été élaborées en commun par les différents régimes d'assurance maladie. Leur mise en œuvre, au plan local, peut néanmoins ne pas être concomitante sur l'ensemble du territoire national.

## 2) Conditions de transfert des informations concernant les organismes complémentaires

Cinq cas sont à considérer :

- le partenaire a utilisé la procédure de tiers payant sur la part principale et sur la part complémentaire ; il mentionne alors 15 dans la rubrique "destinataire de règlement" et complète l'ensemble des informations relatives à l'organisme complémentaire.
- le partenaire de santé a pratiqué le tiers payant sur la part principale, l'assuré ayant acquitté le ticket modérateur ; il mentionne 05 dans "destinataire de règlement" et laisse à blanc les zones concernant l'organisme complémentaire. Il mentionne également 05 lorsqu’il a pratiqué le tiers payant et que l’assuré est exonéré de ticket modérateur.
- le partenaire de santé n'a pas pratiqué le tiers payant, l'assuré ayant acquitté le montant total mais il souhaite néanmoins télétransmettre la demande de remboursement de l'assuré ; le professionnel mentionne 00 dans "destinataire de règlement" et porte les indications relatives à l'organisme complémentaire s'il en a connaissance.
- le professionnel de santé a pratiqué le tiers payant sur la part complémentaire, alors que l'assuré a acquitté la part principale. Le professionnel mentionne 25 dans "destinataire de règlement" (Type 2).
- le professionnel de santé a pratiqué le tiers payant sur la part complémentaire, alors que l'assuré n’a acquitté ni la part principale, ni la part complémentaire. Le professionnel mentionne 15 dans "destinataire de règlement" (Type 2) et inscrit 0 dans le taux applicable à la prestation correspondant à la part légale et N dans le qualificatif de la dépense (Type 4). Il porte obligatoirement les indications relatives à l'organisme complémentaire, dans les rubriques appropriées.

## 3) Les informations télétransmises reflètent exactement la facturation des actes retracée sur le support papier.

Pour que cette condition soit remplie, il est nécessaire de créer autant d’enregistrements de Type 3 ou de Type 4 (ligne de facture) que d’actes répertoriés sur la feuille de soins ou la facture.

Par exemple, les soins dentaires impliquent une ligne d’acte (enregistrement 4A et 4D) par dent soignée jusqu’à la mise en place du codage des actes dentaires.

<u>Cas particulier</u> : chaque acte fait l’objet d’une ligne acte de type 4, le coefficient des 2<sup>e</sup> et 3<sup>e</sup> actes étant le coefficient minoré.

Mise en œuvre de la codification affinée des actes : cf. §27-6.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 2

4) Sauvegarde du secret médical

Les différentes codifications sont véhiculées dans les enregistrements de type 3F, 3H, 4B, 4P, 4R,  4D, 4F, 4H et 4M. <span style="float:right; border: 1px solid black; padding: 2px;">Supprimé : C</span>

Ceux-ci font l’objet d’un archivage particulier qui comporte la totalité des informations qu’ils contiennent auxquelles sont ajoutées les informations relatives au prescripteur, à l’exécutant et au bénéficiaire des soins.

Toutes les informations de la base archive ainsi constituée peuvent être interrogées par les services administratifs des organismes d’assurance maladie ou par le service médical placé auprès d’eux.

Toutefois, conformément à l’article L161-29 du Code de la Sécurité Sociale, seul le service médical est habilité à procéder à un chaînage complet, n° immatriculation, date de naissance du bénéficiaire, actes dispensés ou médicaments consommés avec un code pathologie dont les modalités de saisie feront l’objet de précisions ultérieures.

Les informations liées au codage contenues dans les enregistrements de types 3F, 3H, 4B, 4P, 4R,  4D, 4F, 4H et 4M ne sont pas transmises aux organismes de protection complémentaire. <span style="float:right; border: 1px solid black; padding: 2px;">Supprimé : C</span>

5) Les normes permettent d’adresser le remboursement soit au professionnel de santé, soit à l’assuré.

Lorsque le professionnel a perçu son paiement de l’assuré, mais souhaite faciliter le remboursement de son client en recourant à la télétransmission, il ne peut le faire qu’en accord avec les organismes d’assurance maladie et sous les réserves suivantes :

- le partenaire de santé doit avoir clairement identifié l’assuré et l’organisme débiteur, au moyen d’une attestation de droits, ou d’une carte Vitale, ou d’une prise en charge, ou d’un serveur télématique.

- il doit renseigner les zones dans les mêmes conditions que s’il pratiquait le tiers payant, avec un destinataire de paiement à 00. Voir cas particuliers des zones facultatives dans le type 4 toutes normes.

- avant transmission, le partenaire de santé constitue deux lots : l’un regroupant les factures dont le règlement lui est destiné, l’autre celles qui sont à régler à ses clients. Il transmet, pour chacun des lots, un bordereau d’accompagnement et les pièces justificatives correspondantes.

- lorsque le règlement est destiné à l’assuré, le partenaire de santé ne reçoit pas de « Retour NOEMIE », ni d’informations relatives aux éventuels rejets.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 3

# **II - PRINCIPES TECHNIQUES GENERAUX**

## **21 - COMPOSITION DES ENVOIS**

Le professionnel de santé adresse au Centre de Télécollecte un ou plusieurs envois dénommés « Fichier » .

<table>
    <tr>
      <td>Type 000</td>
      <td>Début de fichier</td>
      <td></td>
      <td></td>
      <td rowspan="9">1 par Centre<br />Informatique, ou<br />1 par caisse<br />destinatrice</td>
    </tr>
    <tr>
      <td>Type 1</td>
      <td>Début de lot</td>
      <td></td>
      <td rowspan="6">n selon<br />critères de<br />rupture définis<br />au point 24<br />ci-après</td>
      <td></td>
    </tr>
    <tr>
      <td>Type 2</td>
      <td>Début de facture</td>
      <td rowspan="4">n selon<br />critères de<br />rupture définis<br />au point 26<br />ci-après</td>
      <td></td>
    </tr>
    <tr>
      <td>Type 2n</td>
      <td>Suite début de facture</td>
      <td></td>
    </tr>
    <tr>
      <td>Type 3 et 3n</td>
      <td>Ligne de facture(CP)</td>
      <td></td>
    </tr>
    <tr>
      <td>Type 4 et 4n</td>
      <td>Ligne de facture</td>
      <td></td>
    </tr>
    <tr>
      <td>Type 5</td>
      <td>Fin de facture</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Type 6</td>
      <td>Fin de lot</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Type 999</td>
      <td>Fin de fichier</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
</table>

- Un fichier est borné par un enregistrement de type 000 en début et de type 999 en fin.

Le professionnel de santé crée un fichier logique par organisme destinataire de chaque grand régime.
Pour les besoins du cryptage, on ne devra trouver qu’un fichier logique par fichier physique.

Les mutuelles de fonctionnaires et d’étudiants (MGEN - MGPTT - MFP,…) sont assimilées à un grand régime.

- Un fichier est constitué d'un ou plusieurs lots bornés par un enregistrement T1 (début) et T6 (fin).
- Chaque lot regroupe de 1 à n factures bornées par un enregistrement T2 ou T2A (début) puis T5 (fin).

Les factures ne doivent concerner que les assurés gérés par l'organisme auquel le lot qui les regroupe est destiné.
Elles doivent être classées à l’intérieur du lot dans l’ordre croissant de leur numéro.

L'en-tête de la facture Type 2A est suivi systématiquement d’un enregistrement type 2M pour toutes les normes sauf CP, CT et TA.
L'en-tête de la facture Type 2 (Norme CP) ou Type 2A (Norme CT) est suivi d'un enregistrement Type 2B et Type 2C dans le cas des Etablissements Privés ou des Centres Thermaux, pour les assurés hors région. Les assurés migrants sont exclus de cette procédure.
L'en-tête de la facture Type 2A peut être suivi d’un enregistrement de type 2S en toutes normes et de type 2E en toutes normes sauf CP.
- Chaque facture est constituée de <u>1 à n lignes,</u> contenues dans tous les enregistrements de Types 3 et 4 et dans tous les types de complément de ligne de facture.

La ligne est détaillée dans un enregistrement de type 4 ou de type 3.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 4

Il existe autant de types 3 et types 4 que d’actes identifiés sur la feuille de soins ou la facture, exception pour la codification affinée des actes (voir §27-6).

L’enregistrement de type 3 peut être suivi d’un type 3S et/ou d’un type 3E qui complètent le type 3 et d’un type 3F dans le cas de la codification de la LPP. En norme CP, il peut être suivi d’un type 3H, pour le codage des médicaments délivrés en hospitalisation par les cliniques privées ou les hôpitaux publics.

L’enregistrement de type 4 prend l’appellation 4A (sauf en Norme CP) lorsqu’il est suivi d’un type 4S et/ou d’un type 4E qui complètent le type 4 ou de la codification affinée reprise dans un enregistrement de type 4B (Biologie), 4~~P~~<u>P</u> (Pharmacie de ville), 4F (LPP), 4M (CCAM). En norme CP, il peut être suivi d’un type 4H (codage des médicaments rétrocédés).

L’enregistrement de type 4 prend l’appellation 4A lorsqu’il est suivi d’un type 4D (Soins dentaires). Avant la mise en place du codage CCAM, à chaque type 4A correspondra un seul type 4D et ce pour chaque dent traitée. Le type 4D disparaît avec le démarrage de la CCAM (type 4M) pour les actes dentaires.

<u>Pour les pharmaciens et les médecins propharmaciens, le type 4A regroupe le montant total à rembourser.</u>
<u>Il peut être suivi d’un enregistrement de type 4P pour le codage de la pharmacie et d’autant d’enregistrements de type 4R que nécessaires pour véhiculer les n° de lot et de série des conditionnements de médicament.</u>

Pour les transports sanitaires, le type 4A regroupe le montant total à rembourser.
Il est suivi d’un enregistrement de type 4T et d’autant d’enregistrements de type 4U (conditions d’exécution du transport) qu’il y a de transports facturés.

Pour les pharmaciens et fournisseurs, le type 4A regroupe tous les montants des types 4F.
Il est suivi d’autant d’enregistrements de type 4F que de codes LPP présents sur la facture.
Si un type 4A est suivi de plusieurs types 4F, ils doivent tous être homogènes en terme de remplissage du code LPP : soit chaque 4F contient un code LPP, soit aucun n’en contient. <mark><u>Le type 4F est également ouvert aux normes pédicure et centre de santé, pour la délivrance d’articles spécifiques à leur profession.</u></mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 5

## <u>**Particularité « Caisse Centralisatrice des Paiements »**</u>

Dans le cadre du dispositif « Caisse Centralisatrice des Paiements », dans le but de simplifier la constitution des fichiers, il est possible (mais non obligatoire) d’adopter une structure de fichier aménagée, uniquement pour les établissements non concernés par la CCAM et la TAA:

L’établissement crée un fichier (borné par un enregistrement de type 000 en début et de type 999 en fin) par grand régime destinataire (cf. annexe 1), et non plus par centre informatique. Les fichiers pour chaque grand régime, sont tous envoyés vers la Caisse Centralisatrice des Paiements. Sur les types 000 de chaque fichier, dans le n° de destinataire pos. 28-41, le code centre informatique n’est plus obligatoire, il est renseigné à « 000 ».
L’établissement crée un lot par organisme destinataire (caisse gestionnaire) à l'intérieur d'un même grand régime.

**Pour les cliniques privées concernées par la mise en place de la CCAM et de la TAA**, les flux devant être chiffrés, l’établissement doit créer un fichier par caisse destinataire. On ne devra trouver qu’un fichier logique par fichier physique.

## <u>**Particularité « Caisse de Paiement Unique » (CPU) pour les établissements publics et privés antérieurement sous dotation globale :**</u>

<u>Dans le cadre du dispositif « CPU », les flux devant être chiffrés, l’établissement doit créer un fichier par caisse destinataire (caisse gestionnaire de l’assuré). On ne devra trouver qu’un fichier logique par fichier physique.</u>

**Supprimé :** <mark>L'établissement</mark>

## <u>**Flux à destination des organismes complémentaires - Glossaire :**</u>

On appelle DRE (demande de remboursement), un flux SESAM Vitale, donc sécurisé, à destination d’un organisme complémentaire. Ce flux est émis directement par le professionnel de santé vers l’organisme complémentaire désigné par l’assuré comme étant celui qui lui sert les prestations d’assurance maladie complémentaire. Ce flux ne transite pas par un organisme d’assurance maladie obligatoire : on parle d’éclatement du flux à la source.
Il peut exister d’autres types de flux à destination des organismes complémentaires.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 6

# **22 - RÉCAPITULATION DES TYPES D’ENREGISTREMENTS EXISTANTS**

<table>
  <thead>
    <tr>
      <th>TYPES</th>
      <th><b>CONTENU</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>000</strong></td>
      <td>DEBUT DE FICHIER - unique par centre informatique ou par grand régime.<br />Initialisation de l’envoi.</td>
    </tr>
    <tr>
      <td><strong>1</strong></td>
      <td>DEBUT DE LOT (de factures) - unique pour le lot.<br />Identification du partenaire de santé.</td>
    </tr>
    <tr>
      <td><strong>2</strong></td>
      <td>DEBUT DE FACTURE - unique pour la facture. Identification de l’assuré et du bénéficiaire.<br />Information concernant l’ensemble de la facture, peut être suivi :<br />- d’un type 2B - 2C pour les Etablissements et pour les assurés hors région</td>
    </tr>
    <tr>
      <td><strong>2A</strong></td>
      <td>DEBUT DE FACTURE - remplace le 2 si 2S, 2B, 2C, 2E, 2M ou 2P présents, dans toutes les normes sauf CP.</td>
    </tr>
    <tr>
      <td><strong>2B</strong></td>
      <td>DEBUT D’ADRESSE DE L’ASSURE - pour les centres thermaux et les Etablissements (assurés hors région seulement).</td>
    </tr>
    <tr>
      <td><strong>2C</strong></td>
      <td>FIN D’ADRESSE DE L’ASSURE ET DOMICILIATION - pour les centres thermaux et les Etablissements (assurés hors région seulement).</td>
    </tr>
    <tr>
      <td><strong>2E</strong></td>
      <td>SUITE AU DEBUT DE FACTURE – permet de véhiculer des informations supplémentaires de niveau facture, relatives à l’identifications des PS et des structures.</td>
    </tr>
    <tr>
      <td><strong>2M</strong></td>
      <td>SUITE AU DEBUT DE FACTURE – permet de véhiculer des données relatives à la gestion de la part complémentaire .</td>
    </tr>
    <tr>
      <td><strong>2P</strong></td>
      <td>SUITE AU DEBUT DE FACTURE – permet de véhiculer des données relatives à la gestion de la part complémentaire.</td>
    </tr>
    <tr>
      <td><strong>2S</strong></td>
      <td>SUITE AU DEBUT DE FACTURE – permet de véhiculer des informations supplémentaires de niveau début de facture.</td>
    </tr>
    <tr>
      <td><strong>2X</strong></td>
      <td>NIVEAU FACTURE – Réservé aux échanges inter-organismes d’assurance maladie complémentaire.</td>
    </tr>
    <tr>
      <td><strong>3</strong></td>
      <td>LIGNE DE FACTURE relative aux prestations hospitalières remboursables. (autant que de prestations facturées).</td>
    </tr>
    <tr>
      <td><strong>3S</strong></td>
      <td>SUITE A LA LIGNE DE FACTURE – permet de véhiculer des informations supplémentaires de niveau ligne pour les prestations hospitalières.</td>
    </tr>
    <tr>
      <td><strong>3E</strong></td>
      <td>SUITE A LA LIGNE DE FACTURE – permet de véhiculer des informations supplémentaires de niveau ligne, notamment les nouvelles identifications des PS et des structures.</td>
    </tr>
    <tr>
      <td><strong>3F</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE PRESTATIONS HOSPITALIERES obligatoire dans la norme CP en cas de facturation de produits de la LPP avec le codage.</td>
    </tr>
    <tr>
      <td><strong>3H</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE PRESTATIONS HOSPITALIERES en norme CP, obligatoire en cas de facturation de produits pharmaceutiques.</td>
    </tr>
    <tr>
      <td><strong>4</strong></td>
      <td>LIGNE DE FACTURE relative aux actes remboursables au partenaire de santé ou à l’assuré (autant que d’actes facturés), exception pour codification affinée.</td>
    </tr>
    <tr>
      <td><strong>4A</strong></td>
      <td>LIGNE DE FACTURE : remplace le 4 dans les normes auxiliaires médicaux, laboratoires, ER, pharmaciens<mark>, centre de santé lorsqu’il</mark> est suivi d’un type affiné <u>:</u> 4B (NABM), 4P (codage CIP), 4M (CCAM), 4D (soins dentaires) ou 4F (LPP). Obligatoire pour les normes Transports (sauf SMUR), Fournisseurs (sauf acte FGA) et Soins dentaires.<br />Il remplace <mark>également le type</mark> 4 s’il est suivi d’un type 4S (type 4 suite).</td>
    </tr>
  </tbody>
</table>

**Supprimé :** <mark>si codification affinée. I</mark>
**Supprimé :** alors
**Supprimé :** contenant cette codification
**Supprimé :** ~~C~~
**Supprimé :** ou
**Supprimé :** <mark>codification</mark>
**Supprimé :** <mark>Taxi et</mark>
**Mis en forme :** Espace Avant : 0 pt, Après : 0 pt

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 7

<table>
  <thead>
    <tr>
      <th><b>TYPES</b></th>
      <th><b>CONTENU</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>4S</strong></td>
      <td>SUITE A LA LIGNE DE FACTURE – permet de véhiculer des informations supplémentaires de niveau ligne hors codage, quelle que soit la norme utilisée.</td>
    </tr>
    <tr>
      <td><strong>4E</strong></td>
      <td>SUITE A LA LIGNE DE FACTURE – permet de véhiculer des informations supplémentaires de niveau ligne, notamment les nouvelles identifications des PS et des structures.</td>
    </tr>
    <tr>
      <td><strong>4B</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE DE BIOLOGIE :<br />A n’utiliser qu’avec la codification affinée.</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><strong>4D</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE DE SOINS DENTAIRES<br />A utiliser avant le codage pour indiquer le numéro de la dent traitée. Remplacé avec la CCAM par le 4M.<br />Obligatoire dans la norme ER, CP et CS pour les soins dentaires.</td>
    </tr>
    <tr>
      <td><strong>4F</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE PHARMACIENS, FOURNISSEURS, <mark>PEDICURES ET CENTRE DE SANTE</mark> -<br />Obligatoire dans la norme fournisseurs pour identifier les produits de la LPP avec le codage.</td>
    </tr>
    <tr>
      <td><strong>4H</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE HOPITAUX PUBLICS ET CLINIQUES PRIVEES – en norme CP, obligatoire en cas de facturation de produits pharmaceutiques rétrocédés.</td>
    </tr>
    <tr>
      <td><strong>4M</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE<br />A n’utiliser qu’avec la codification affinée des actes médicaux (CCAM). En l’absence de codification affinée, n’employer que le Type 4.</td>
    </tr>
    <tr>
      <td><strong><u>4P</u></strong></td>
      <td><u>COMPLEMENT DE LIGNE DE FACTURE PHARMACIENS OU MEDECINS PROPHARMACIENS – Obligatoire pour la délivrance de la pharmacie codée avec code CIP à 7 ou 13 caractères</u></td>
    </tr>
    <tr>
      <td><strong><u>4R</u></strong></td>
      <td><u>COMPLEMENT DE LIGNE DE FACTURE PHARMACIENS OU MEDECINS PROPHARMACIENS – Permet de véhiculer des informations supplémentaires de niveau affiné. Suit un 4P, 15 types 4R max. pour un 4P.</u></td>
    </tr>
    <tr>
      <td><strong>4T</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE TRANSPORTS<br />Obligatoire dans la norme transports sanitaires, pour ambulances, VSL <mark>et taxis</mark>. N’est pas utilisé pour les SMUR. Suit un 4A.</td>
    </tr>
    <tr>
      <td><strong>4U</strong></td>
      <td>COMPLEMENT DE LIGNE DE FACTURE TRANSPORTS (suite) - Conditions d’exécution du transport. Obligatoire dans la norme transports sanitaires, pour ambulances, VSL <mark>et taxis</mark>. N’est pas utilisé pour les SMUR. Suit un 4T. (36 4U max. pour un 4T)</td>
    </tr>
    <tr>
      <td><strong>4X</strong></td>
      <td>NIVEAU LIGNE - Réservé pour les échanges inter-organismes d’assurance maladie complémentaire.</td>
    </tr>
    <tr>
      <td><strong>5</strong></td>
      <td>FIN DE FACTURE - unique pour la facture. Totalisation de la facture.</td>
    </tr>
    <tr>
      <td><strong>5X</strong></td>
      <td>NIVEAU FIN FACTURE - Réservé aux échanges inter-organismes d’assurance maladie complémentaire.</td>
    </tr>
    <tr>
      <td><strong>6</strong></td>
      <td>FIN DE LOT - unique pour le lot. Totalisation du lot.</td>
    </tr>
    <tr>
      <td><strong>999</strong></td>
      <td>FIN DE FICHIER - unique par centre informatique ou par grand régime.<br />Totalisation de l’envoi</td>
    </tr>
  </tbody>
</table>

Supprimé : En l’absence de codification affinée, employer le type 4 seulement.
Supprimé : 4C
Supprimé : COMPLEMENT DE LIGNE DE FACTURE PHARMACIENS OU MEDECINS PROPHARMACIENS - A n’utiliser qu’avec la saisie des vignettes. Dans le cas contraire, employer le type 4 seulement.
Supprimé : OU
Supprimé : et
Supprimé : taxis et
Supprimé : et
Supprimé : taxis et

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 8

# **TABLEAU RECAPITULATIF DES DESTINATAIRES DE PAIEMENT EN FONCTION DE LA NORME ET DE L’EXECUTANT DE L’ACTE**

<table>
  <thead>
    <tr>
      <th>NORME</th>
      <th>PARTENAIRE DE SANTE<br />TOUJOURS IDENTIQUE<br /><b>A L’EXECUTANT</b></th>
      <th>DESTINATAIRE DE<br />RÈGLEMENT</th>
      <th>IMPUTATION<br /><b>SNIR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>IF</td>
      <td>NON (remplacement)</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>MK</td>
      <td>NON (remplacement)</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>OO</td>
      <td>NON (remplacement)</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>OY</td>
      <td>NON (remplacement)</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>PE</td>
      <td>NON (remplacement)</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>LB</td>
      <td>NON</td>
      <td>Partenaire</td>
      <td>Exécutant</td>
    </tr>
    <tr>
      <td>CS</td>
      <td>NON</td>
      <td>Partenaire</td>
      <td>Exécutant</td>
    </tr>
    <tr>
      <td>TA</td>
      <td>OUI</td>
      <td>Partenaire</td>
      <td>Partenaire</td>
    </tr>
    <tr>
      <td>ER</td>
      <td>NON</td>
      <td>Partenaire<br />ou Exécutant<br />(dans le cas du scanner et de l’IRMN)</td>
      <td>Partenaire<br />ou Exécutant</td>
    </tr>
    <tr>
      <td>PH</td>
      <td>OUI</td>
      <td>Partenaire</td>
      <td></td>
    </tr>
    <tr>
      <td>CP</td>
      <td>NON</td>
      <td>Partenaire<br />(pour les actes du type 3)<br />ou Exécutant<br />(pour les actes du type 4)</td>
      <td>Partenaire<br /><br />ou Exécutant</td>
    </tr>
    <tr>
      <td>FR</td>
      <td>OUI</td>
      <td>Partenaire</td>
      <td></td>
    </tr>
    <tr>
      <td>CT</td>
      <td>OUI</td>
      <td>Partenaire</td>
      <td></td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 9

# **23 - ENCHAINEMENT DES SÉQUENCES SELON LES CATÉGORIES DE PROFESSIONNELS DE SANTÉ**

## **<u>Auxiliaires médicaux (infirmiers, masseurs-kinésithérapeutes, orthophonistes, orthoptistes, pédicures) et centres de santé</u> :**

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2M</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2P</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td rowspan="2">0 à 10</td>
      <td rowspan="2">type 4B</td>
      <td>facultatif mais obligatoire si codage des actes de biologie en</td>
    </tr>
    <tr>
      <td>Centre de Santé</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4D</td>
      <td>facultatif mais obligatoire pour les soins dentaires (hors CCAM)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4F</td>
      <td>obligatoire pour les articles de la LPP pour les normes PE et CS</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td rowspan="2">0 à 26</td>
      <td rowspan="2">type 4M</td>
      <td>facultatif mais obligatoire si codage des actes médicaux (en centres de</td>
    </tr>
    <tr>
      <td>santé uniquement)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
</table>

Type 999

## **<u>Entreprises de transports (transports sanitaires et taxis) :</u>**

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2 ou 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td rowspan="3">0 à 1</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>type 4T</td>
      <td>(spécial transport) 1 par facture (réservé aux transports sanitaires -<br />n’existe pas pour les SMUR)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4U</td>
      <td>(spécial transport) jusqu’à 36 transports avec détail des dates (réservé<br />aux transports sanitaires <u>- </u> n’existe pas pour les SMUR)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
</table>
Supprimé : taxis et
Supprimé : taxis et

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 10

Type 999

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 11

# <u>**Centres thermaux :**</u>

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2 ou 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2B</td>
      <td>(spécial centre thermal) facultatif</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2C</td>
      <td>(spécial centre thermal) facultatif mais obligatoire si 2B est présent</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
</table>

Type 999

# <u>**Laboratoires**</u>

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2M</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2P</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte (exception codage des actes de biologie)</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4B</td>
      <td>obligatoire avec codage des actes de biologie</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
</table>

Type 999

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 12

# **<u>Ensemble prescripteuR</u>**

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 2A</td>
      <td>1 par facture</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 2M</td>
      <td>1 par facture</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 2P</td>
      <td>1 par facture (facultatif)</td>
      <td></td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4B</td>
      <td>facultatif mais obligatoire si codage des actes d’anatomo-cyto-<br />pathologie</td>
      <td></td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par ligne de facture</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4<u>P</u></td>
      <td>facultatif mais obligatoire si saisie du code CIP (pour les médecins<br />propharmaciens)</td>
      <td>Supprimé : 0</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td>Supprimé : C</td>
    </tr>
    <tr>
      <td><u>0 à 15</u></td>
      <td><u>type 4R</u></td>
      <td><u>facultatif sauf obligation de transmettre les n° de lot et de série des<br />conditionnements de pharmacie</u></td>
      <td></td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4D</td>
      <td>facultatif mais obligatoire pour les soins dentaires (hors CCAM)</td>
      <td></td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par acte</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
      <td></td>
    </tr>
    <tr>
      <td>0 à 26</td>
      <td>type 4M</td>
      <td>facultatif mais obligatoire si codage des actes médicaux (CCAM)</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
      <td></td>
    </tr>
</table>

Type 999

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 13

# <u>**Pharmaciens**</u>

<table>
    <tr>
      <td colspan="3">Type 000</td>
    </tr>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2M</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2P</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par ligne de facture</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4P</td>
      <td>obligatoire avec saisie du code CIP</td>
    </tr>
    <tr>
      <td>0 à 15</td>
      <td>type 4R</td>
      <td>facultatif sauf obligation de transmettre les n° de lot et de série des<br />conditionnements de pharmacie</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4A</td>
      <td>1 par ligne de facture</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4F</td>
      <td>obligatoire pour les articles de la LPP</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td colspan="3">Type 999</td>
    </tr>
</table>

# <u>**Fournisseurs**</u>

<table>
    <tr>
      <td colspan="3">Type 000</td>
    </tr>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2E</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2M</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2P</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4 ou 4A</td>
      <td>1 par ligne de facture</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4F</td>
      <td>obligatoire pour les articles de la LPP (sauf code FGA)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td colspan="3">Type 999</td>
    </tr>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 14

# **<u>Cliniques privées et hôpitaux :</u>**

Type 000

<table>
    <tr>
      <td></td>
      <td>type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2S</td>
      <td>1 par facture, suite du type 2. Facultatif.</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2B</td>
      <td>facultatif</td>
    </tr>
    <tr>
      <td></td>
      <td>type 2C</td>
      <td>Idem mais obligatoire si 2B présent</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 3</td>
      <td>1 par ligne de facture : Actes remboursables à<br />l’établissement (prestations hospitalières).</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 3S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou s’il est<br />suivi d’un type 3F.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 3E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 3F</td>
      <td>facultatif mais obligatoire si codification des articles de la LPP facturables<br />en sus des GHS en établissement public ou privé.</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 3</td>
      <td>1 par ligne de facture : codification des médicaments</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 3S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou s’il est<br />suivi d’un type 3H.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 3E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 3H</td>
      <td>facultatif mais obligatoire si codification des médicaments facturables en<br />sus des GHS en établissement public ou privé.</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4</td>
      <td>1 par acte : honoraires (exception codage)</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou en cas<br />de séjour GHS ou GHT.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4B</td>
      <td>facultatif mais obligatoire si codage des actes de biologie et d’anatomo-<br />cytho-pathologie.</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4</td>
      <td>1 par acte</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou en cas<br />de séjour GHS ou GHT.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4D</td>
      <td>facultatif mais obligatoire pour les soins dentaires.</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4</td>
      <td>1 par ligne de facture : codification des médicaments rétrocédés.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou s’il est<br />suivi d’un type 4H.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 10</td>
      <td>type 4H</td>
      <td>facultatif mais obligatoire si codification des médicaments rétrocédés en<br />établissement public ou privé.</td>
    </tr>
    <tr>
      <td>n</td>
      <td>type 4</td>
      <td>1 par acte : honoraires (exception codage)</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4S</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires ou en cas<br />de séjour GHS ou GHT.</td>
    </tr>
    <tr>
      <td>0 à 1</td>
      <td>type 4E</td>
      <td>facultatif sauf si les informations qu’il contient sont obligatoires</td>
    </tr>
    <tr>
      <td>0 à 26</td>
      <td>type 4M</td>
      <td>facultatif mais obligatoire si codage des actes médicaux (CCAM)</td>
    </tr>
    <tr>
      <td></td>
      <td>type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td></td>
      <td>type 6</td>
      <td>1 par lot</td>
    </tr>
</table>

Type 999

Les types 2, 2S, 2B, 2C, 3, 3S, 3E, 3F, 3H, 4, 4S, 4H, et 5 sont des types spécifiques norme CP.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 15

# **24 - RUPTURE DES LOTS**

<u>Les critères de rupture d’un lot sont :</u>

1. Le partenaire de santé

2. L’organisme d’assurance maladie débiteur

3. Le type de destinataire de règlement :
   un lot ne doit regrouper que des factures ayant la même valeur de destinataire de règlement.

4. La certification ou la non certification des factures SESAM :
   les lots du point précédent doivent être subdivisés selon que les factures qui le composent sont certifiées SESAM ou non.

5. Le nombre de factures :
   le nombre maximal de factures par lot est 999.

6. Le type de flux pour les factures certifiées SESAM :
   un lot ne doit regrouper que des factures de même type :
   . 1 lot pour les factures réelles
   . 1 lot pour les factures tests
   . 1 lot pour les factures démonstrations

7. En SESAM, l’élaboration de la facture au cabinet ou en dehors du cabinet sur dispositif portable :
   un lot ne doit regrouper que des factures de même type :
   . 1 lot pour les factures élaborées au cabinet du PS
   . 1 lot pour les factures élaborées en dehors du cabinet sur dispositif portable

8. <u>L’origine du fichier</u> :
   Cas des consultations et soins externes en BG ayant un qualificatif de dépense à « I » pour information (détection de la participation forfaitaire)

Chaque lot doit être accompagné d’un bordereau décrit au point 41 ci-après.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 16

# **25 - EXEMPLES DE NUMÉROTATION DES LOTS**

Convention pour les équivalences des T2, T3 et T4 (T = type) pour les exemples qui suivent :

Le T2 devient un T2A s’il est suivi d’un T2S et/ou d’un T2E, et d’un T2B/T2C dans le cas des Centres Thermaux.
Le T2 peut être suivi d’un T2S ou d’un T2B/T2C dans le cas des Cliniques Privées.
Le T2 devient un T2A lorsqu’il est suivi d’un T2S ou d’un T2E dans le cas des transporteurs.
Le T2 devient un T2A lorsqu’il est suivi d’un T2S, d’un T2E ou d’un T2M pour toutes les normes sauf les Cliniques Privées, les Centres Thermaux et les Transporteurs.

Le T3 peut être présent dans le cas des établissements Publics ou Privés en norme CP uniquement, il peut être suivi d’un T3S et/ou d’un type 3E. Le T3 peut également être suivi d’un T3S/T3F ou d’un T3S/T3H.

Le T4 devient un T4A s’il est suivi d’un T4S ou d’un type 4E dans toutes les normes sauf CP.
Le T4 devient un T4A s’il est suivi d’un T4B pour les Laboratoires ou les Centres de Santé ou les Anatomo-cytopathologistes, ou d’un T4~~<u>P</u>~~ pour les Pharmaciens ou les Médecins propharmaciens, ou d’un T4D pour les soins dentaires, ou d’un T4F pour les Pharmaciens, les Fournisseurs, <mark><u>les pédicures, les centres de santé</u></mark> ou d’un T4M pour les centres de santé et les Ensembles prescripteuRs. Le T4F est obligatoire en Normes FR, PH, <mark><u>PE et CS</u></mark> pour les prestations LPP. <span style="float:right; border:1px solid red; padding:2px;">Supprimé : C</span> <span style="float:right; border:1px solid blue; padding:2px;">Supprimé : obligeant le codage</span>

Le T4 peut être suivi d’un T4S, d’un T4E, d’un T4B, d’un T4D, d’un T4H ou d’un T4M dans le cas des Cliniques Privées.

Le T4 de la norme Transport est obligatoirement un T4A suivi d’un T4T et d’autant de T4U que de transports compris dans la facture, sauf pour les SMUR. <span style="float:right; border:1px solid blue; padding:2px;">Supprimé : taxis et</span>

<u>1 TIERS - 1 ORGANISME</u>

<table>
  <caption><u>1 TIERS - 1 ORGANISME</u></caption>
  <thead>
    <tr>
      <th colspan="2"></th>
      <th></th>
      <th colspan="3">Numérotation des lots</th>
    </tr>
    <tr>
      <th colspan="2"></th>
      <th></th>
      <th>J</th>
      <th>J+1</th>
      <th>J+2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>T000</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td><strong>1<sup>ER</sup> LOT</strong></td>
      <td><strong>001</strong></td>
      <td><strong>002</strong></td>
      <td><strong>003</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

<u>1 TIERS - DEUX ORGANISMES D’UN MEME GRAND REGIME DISPOSANT DU MEME CENTRE INFORMATIQUE</u>

<table>
    <tr>
      <td>T000</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td></td>
      <td></td>
      <td></td>
      <td><b>1<sup>ER</sup> LOT</b></td>
      <td><b>001</b></td>
      <td><b>002</b></td>
      <td><b>003</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td colspan="2">1<sup>ER</sup> ORGANISME D’ASSURANCE MALADIE</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td></td>
      <td></td>
      <td></td>
      <td><b>2<sup>ème</sup> LOT</b></td>
      <td><b>001</b></td>
      <td><b>002</b></td>
      <td><b>003</b></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td colspan="2">2<sup>ème</sup> ORGANISME D’ASSURANCE MALADIE</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>T2</td>
      <td>*</td>
      <td>T4 T4</td>
      <td>*</td>
      <td>T5</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 17

<u>2 TIERS (Sté civile professionnelle) - 2 ORGANISMES DISPOSANT DU</u>
                                    <u>MEME CENTRE INFORMATIQUE</u>

<table>
  <thead>
    <tr>
      <th colspan="2"></th>
      <th></th>
      <th colspan="3">Numérotation des lots</th>
    </tr>
    <tr>
      <th colspan="2"></th>
      <th></th>
      <th>J</th>
      <th>J+1</th>
      <th>J+2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>T000</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td><strong>1<sup>ER</sup> LOT</strong></td>
      <td><strong>001</strong></td>
      <td><strong>002</strong></td>
      <td><strong>003</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 T4 * T5</td>
      <td>1<sup>ER</sup> TIERS</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 T4 * T5</td>
      <td>1<sup>ER</sup> ORGANISME D’ASSURANCE MALADIE</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td><strong>2EME LOT</strong></td>
      <td><strong>001</strong></td>
      <td><strong>002</strong></td>
      <td><strong>003</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td>1<sup>ER</sup> TIERS</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td>2<sup>ème</sup> ORGANISME D’ASSURANCE MALADIE</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T1</td>
      <td><strong>3<sup>ème</sup> LOT</strong></td>
      <td><strong>001</strong></td>
      <td><strong>002</strong></td>
      <td><strong>003</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td>2<sup>ème</sup> TIERS</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td>1<sup>ER</sup> ORGANISME D’ASSURANCE MALADIE</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T1</td>
      <td></td>
      <td><strong>4EME LOT</strong></td>
      <td><strong>001</strong></td>
      <td><strong>002</strong></td>
      <td><strong>003</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td>2<sup>ème</sup> TIERS</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>    T2 * T4 T4 T4 * T5</td>
      <td>2<sup>ème</sup> ORGANISME D’ASSURANCE MALADIE</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td>T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 18

# <u>1 TIERS - 1 C.P.A.M. - 1 MSA - 1 CAISSE DE TRAVAILLEURS NON SALARIES</u>

Avec une télétransmission sur un centre informatique unique chargé ensuite de la rediffusion sur les deux autres centres informatiques (sous réserve d’accords locaux entre régimes).

<table>
  <thead>
    <tr>
      <th colspan="2"></th>
      <th colspan="3">Numérotation des lots</th>
    </tr>
    <tr>
      <th colspan="2"></th>
      <th>J</th>
      <th>J+1</th>
      <th>J+2</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>T000 (régime général)</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T1</td>
      <td><b>1<sup>ER</sup> LOT</b></td>
      <td><b>001</b></td>
      <td><b>002</b></td>
      <td><b>003</b></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td>C.P.A.M.</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T000 (régime agricole)</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T1</td>
      <td><b>1<sup>ER</sup> LOT</b></td>
      <td><b>001</b></td>
      <td><b>002</b></td>
      <td><b>003</b></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td>MSA</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T000 (<u>RSI</u>)</td>
      <td colspan="4">Supprimé : <del>régime AMPI</del></td>
    </tr>
    <tr>
      <td>    T1</td>
      <td><b>1<sup>ER</sup> LOT</b></td>
      <td><b>001</b></td>
      <td><b>003</b></td>
      <td><b>005</b></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 * T5</td>
      <td>Organisme conventionné</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T1</td>
      <td><b>2<sup>ème</sup> LOT</b></td>
      <td><b>002</b></td>
      <td><b>004</b></td>
      <td><b>006</b></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 T4 * T5</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>        T2 * T4 T4 * T5</td>
      <td>Organisme conventionné</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    T6</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>T999</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

Dans l’hypothèse où la rediffusion par le centre collecteur vers un autre régime concernerait plusieurs centres informatiques, les articles de bornage (T000 - T999) seraient obligatoires pour chaque centre informatique destinataire.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 19

Cas particulier des informations de gestion de parc :

Deux types d’enregistrements supplémentaires sont créés pour transporter les informations techniques du Poste de Travail (PDT) : n° de version des modules SESAM, des logiciels lecteurs
- un type ‘A’
- un ou plusieurs type ‘B’

Il peut y avoir plusieurs ensembles TA+TB (TB…) qui se suivent avant le type 6, chaque ensemble TA+TB (TB…) étant représentatif de la configuration d’un PDT dans la structure émettrice des flux de FSE.
Cette constitution est faite par les modules SESAM Vitale, ponctuellement, lors de la constitution d’un lot de FSE. Cette zone est certifiée avec les FSE du lot.

Lors de la réception du fichier de FSE, le frontal vérifie la certification du lot, extrait les types A et B présents dans le lot et les envoie vers un serveur de gestion de parc.
Les lots transmis aux centraux AMO sont donc apurés des types A et B.

<u>Exemple de structuration :</u>
T000
T1
    T2
        T4 *
    T5
    T2
        T4 *
    T5
    TA
    TB *
    TA
    TB *
T6
T999

* plusieurs occurrences possibles du même type.

Ces 2 types ne sont pas décrits dans ce cahier des charges, car ils ne concernent que la solution SESAM.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 20

# **26 - DÉFINITION DE LA FACTURE**

## <u>Principe général</u> :

La facture télétransmise doit correspondre uniquement au document papier qui l’accompagne.

Dans tous les cas, une facture ne doit concerner qu’un seul bénéficiaire de soins, pour la même nature d’assurance.

Hormis le cas des cliniques privées et des hôpitaux, les factures sont individualisées par prescripteur pour les actes nécessitant une prescription.

## <u>Droits constatés :</u>

Lorsqu’un séjour en établissement excède le 31 décembre, la facture doit comporter sur une ligne la facturation jusqu’au 31 décembre inclus et sur une autre ligne, la facturation à compter du 1<sup>er</sup> janvier.
Pour les séjours GHS, l’acte GHS est indivisible, et les dates de séjour sont renseignées avec les dates réelles d’entrée et de sortie du patient (cf. annexe 24). Le séjour est imputable à l’exercice du jour de sortie. Pour toutes les autres prestations, il faut pratiquer comme précisé au paragraphe précédent.

Les séries d’actes doivent être imputées à l’exercice au cours duquel ceux ci ont été dispensés.

Pour les articles de la LPP en location, c’est la date de fin de période de location qui détermine l’exercice de rattachement. La facture doit comporter sur une ligne, la facturation jusqu’à la dernière période de location de l’année et sur une autre ligne, la reprise de la facturation de la location pour la nouvelle année, à compter du 1<sup>er</sup> jour de la nouvelle période.

## <u>Tarifs applicables :</u>

Pour les séjours GHS, le tarif applicable aux actes « GHS » et « EXH », est le tarif à la date de sortie.

Pour les articles de la LPP en location, le tarif à appliquer, est le tarif au 1<sup>er</sup> jour de la location, pour l’unité de facturation considérée (semaine,…).
En cas de changement de tarif en cours de période de location ou service :
- paiement de la période complète avant changement de tarif
- démarrage d’une nouvelle période de location, à compter de la date de changement de tarif

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 21

# **27 - REGLES DE PRÉSENTATION DES INFORMATIONS**

**1 -** Sauf mention particulière décrite au niveau de l’article, les zones sont définies soit :

■ en caractères alphanumériques majuscules et non accentués, sans caractères spéciaux (apostrophes, virgules, tirets, guillemets, etc...) et cadrés à gauche
■ en caractères numériques, cadrés à droite et complétés par des zéros (0) à gauche.

Les zones numériques ne doivent jamais être laissées à blanc. Elles doivent être complétées par des zéros.

Tous les « FILLER » doivent être servis à blanc.

Une rubrique facultative peut ne pas être servie sauf si elle est interdépendante avec une rubrique qui la rend obligatoire. Quand elle n’est pas servie, elle ne doit contenir que des zéros si elle est numérique ou des blancs si elle est alphanumérique.

**2 -** Les dates doivent être fournies sous la forme AAMMJJ.

**3 -** Les prix unitaires, les montants doivent être indiqués en centimes et non signés (pas de + ni de - ni de point ni de virgule) exemples :

35,25 € en prix unitaire s’écrit : | 0 | 0 | 0 | 3 | 5 | 2 | 5 |

De même, les coefficients ne comportent pas de virgule et doivent être exprimés en centièmes, <u>sauf indication différente dans le descriptif de la zone</u>.

0,40 en coefficient s’écrit : | 0 | 0 | 0 | 0 | 4 | 0 |

Ils prennent la valeur 1 par défaut.

**4 -** Gestion des arrondis : voir annexe 11 (séquence des calculs)

**5 -** Règles particulières de présentation concernant certains types d’actes (HORS CODAGE NGAP)

50 - Les indemnités de frais de déplacement doivent suivre immédiatement les actes auxquels elles se rapportent.

51 - Actes multiples au cours d’une même séance avec ou sans dépassement de tarif

Exemple : *AMI 3*AMI 3 + *AMI 3/2*AMI 3/2 <span style="float: right;">Supprimé : *KC*</span>
<span style="float: right;">Supprimé : *50*</span>

Chaque acte est présenté isolément dans un enregistrement de type 4. Dans l’exemple ci-dessus, le coefficient du 2<sup>ème</sup> acte est 1,5<u>1,5</u> , quantité 1, dénombrement 1. <span style="float: right;">Supprimé : *KC*</span>
<span style="float: right;">Supprimé : *50*</span>
<span style="float: right;">Supprimé : *25*</span>

Le montant des honoraires retrace le prix de chaque acte.

Le dépassement éventuel est imputé soit à chaque acte, soit à l’acte le plus important.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 22

# 51-1 - Plusieurs séances facturées sur la même feuille de soins avec actes multiples ou indemnités

Lorsque plusieurs séances d’actes sont facturées sur la même feuille de soins, la présentation des articles doit respecter la chronologie des séances et l’ordre de présentation des feuilles de soins comme précisé ci-après :

### <u>1</u> <sup>ère</sup> <u>Séance</u>
. acte médical avec ou sans majoration,
. éventuellement, acte médical réduit,
. indemnité(s).

### <u>2</u> <sup>ème</sup> <u>Séance</u>
. acte médical avec ou sans majoration,
. éventuellement, acte médical réduit,
. indemnité(s).

La possibilité de regrouper des actes identiques effectués le même jour (même coefficient, même lettre-clé, même complément d’acte réalisés par le même exécutant sur le même malade) est offerte. (cf. Type 4 toutes normes zone Quantité). Les indemnités kilométriques ne sont pas concernées par ce regroupement et doivent être présentées par séance de soins. La faculté de regrouper les actes effectués le même jour n’est pas contradictoire avec la règle énoncée ci-dessus.

*Exemple 1* : 1 AIS 3 effectué le matin et 1 AIS 3 effectué le soir pendant X jours à domicile.

a) Remplissage du type 4 avec regroupement, par journée de soins

<table>
  <thead>
    <tr>
      <th><strong><b>Enregistrement</b><br />Type 4</strong></th>
      <th><strong>Date</strong></th>
      <th><strong>Quantité</strong></th>
      <th><strong>Dénombrement</strong></th>
      <th><strong>Lettre-clé</strong></th>
      <th><strong>Coefficient</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>1<sup>er</sup> jour</td>
      <td>2</td>
      <td>2</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>2</td>
      <td>1<sup>er</sup> jour</td>
      <td>2</td>
      <td>2</td>
      <td>IFA</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>3</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>4</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>5</td>
      <td>2<sup>ème</sup> jour</td>
      <td>2</td>
      <td>2</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 23

b) Remplissage du type 4 sans regroupement, par journée de soins

<table>
  <thead>
    <tr>
      <th>Enregistrement<br />Type 4</th>
      <th>Date</th>
      <th>Quantité</th>
      <th>Dénombrement</th>
      <th>Lettre-clé</th>
      <th>Coefficient</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>2</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>IFA</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>3</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>4</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>5</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>IFA</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>6</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>7</td>
      <td>2<sup>ème</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
    </tr>
  </tbody>
</table>

*Exemple 2* : 2 AIS 3 effectués le matin durant la même séance et 1 AIS 3 effectué le soir pendant X jours à domicile.

<table>
  <thead>
    <tr>
      <th>Enregistrement<br />Type 4</th>
      <th>Date</th>
      <th>Quantité</th>
      <th>Dénombrement</th>
      <th>Lettre-clé</th>
      <th>Coefficient</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1</td>
      <td>1<sup>er</sup> jour</td>
      <td>2</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>2</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>IFA</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>3</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>4</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>5</td>
      <td>1<sup>er</sup> jour</td>
      <td>1</td>
      <td>1</td>
      <td>IFA</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>6</td>
      <td>1<sup>er</sup> jour</td>
      <td>5</td>
      <td>1</td>
      <td>IK</td>
      <td>1,00</td>
    </tr>
    <tr>
      <td>7</td>
      <td>2<sup>ème</sup> jour</td>
      <td>2</td>
      <td>1</td>
      <td>AIS</td>
      <td>3,00</td>
    </tr>
    <tr>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
      <td>«</td>
    </tr>
  </tbody>
</table>

52 - Majoration de nuit ou de dimanche dans l’hypothèse d’actes multiples au cours d’une même séance.

*Exemple : AMI 2 + AMI 1/2 + majoration de dimanche ou férié.*

### Présentation des actes :

| **1<sup>er</sup> enregistrement de type 4** | **2<sup>ème</sup> enregistrement de type 4** | |
| :--- | :--- | :--- |
| code acte : <u>AMI F</u> | code acte : AMI | Supprimé : *KC 50* |
| quantité : 1 | quantité : 1 | Supprimé : *KC* |
| coefficient : <u>2</u> | coefficient : <u>0,50</u> | Supprimé : *50* |
| dénombrement : 1 | dénombrement : 1 | Supprimé : *pour 156,75 €* |
| base de remboursement | base de remboursement | Supprimé : *25,15 € de* |
| montant des honoraires | montant des honoraires | Supprimé : *nuit* |
| ou de la dépense <u>13,42</u> € | ou de la dépense <u>1,45</u> € | Supprimé : KC |
| (5,80 + 7,62 de majoration | | Supprimé : __N |
| de férié) | | Supprimé : KC |
| | | Supprimé : 50 |
| | | Supprimé : 25 |
| | | Supprimé : 129 |
| | | Supprimé : 65 |
| | | Supprimé : 52 |
| | | Supprimé : 25 |
| | | Supprimé : 104,5 |
| | | Supprimé : 0 |
| | | Supprimé : 25,15 |
| | | Supprimé : nuit |

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 24

# 55 - Soins dentaires

Les dispositions réglementaires concernant les soins dentaires prévoient que le tarif applicable est celui en vigueur à la date d’achèvement des soins.

La rubrique « date des soins - position 68/73 » du type 4 ou 4A comporte donc cette date.

Le numéro de la dent traitée est véhiculé par le Type 4D qui est obligatoire.

# 56 - Prothèse dentaire

La réglementation prévoit que l’examen du droit aux prestations s’effectue à la date de proposition par le chirurgien-dentiste de la prothèse dentaire et non à la date d’exécution.

Cette date de proposition figure dans le type 2 - position 68/73. La date d’achèvement de la prothèse figure quant à elle dans « date des soins du type 4 - position 68 à 73 ».

# 57 - Actes Gratuits, Non Remboursables ou Hors Nomenclature ou prise en charge totale par l’Etat dans le cadre de l’AME, TM ou forfaits complémentaires dans le cadre de la CMU.

Voir Annexe 6

***

**[Sidebar Content]**

**Supprimé :** 53 - Présentation des films (clichés) en Electroradiologie¶
¶
Sans objet : suite à modification de la nomenclature des actes médicaux parue au JO du 9 février 1997.¶

**Supprimé :** 54 - Electrocardiogrammes¶
¶
*Exemple : C + K 6,50*¶
¶
La lettre-clé C et la lettre-clé K sont présentées sur deux lignes distinctes dans deux enregistrements de type 4.¶
¶
Lorsque l’électrocardiogramme comporte un supplément K5, celui-ci fait l’objet d’une 3<sup>ème</sup> ligne.¶
¶
Dans l’hypothèse où l’électrocardiogramme est effectué en clinique, le coefficient de minoration 0,80 applicable à la lettre-clé C figure en zone coefficient. ¶

**Supprimé :** 58 - Actes de Radiothérapie¶
¶
Certains traitements donnent lieu <u>obligatoirement</u> à un protocole de traitement. Ce sont les actes du Titre II Chapitre 1 - Actes de radiothérapie de Haute Energie - de la Nomenclature Générale des Actes Professionnels.¶
¶
Ces traitements sont soumis à la formalité de l’entente préalable. Sur celle-ci figurent les différentes cotations selon les divers articles du chapitre 1, et le total du traitement par irradiation.¶
¶
-----------------------Saut de page-----------------------¶
¶
Chaque acte des divers articles de la nomenclature sera présenté sur une ligne distincte dans un enregistrement de type 4.¶
¶
*<u>Exemple</u> : Z50 + Z20 + Z10 + Z20 + Z15 + Z960*¶
¶
1 Type 4 Z50 (Article premier - Protocole de traitement).¶
1 Type 4 Z20 (Article 2 - Repérage radiographique).¶
1 Type 4 Z10 (Article 2 - Repérage gammagraphique).¶
1 Type 4 Z20 (Article 3 - Etude dosimétrique).¶
1 Type 4 Z15 (Article 3 - Supplément pour dosimétrie).¶
1 Type 4 Z960 (Article 4 - Irradiations par faisceaux de photons ou électrons).¶
¶
Néanmoins et dans l’attente de la création d’un code acte ... [1]

***

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 25

# 59 - Transports

Dans le cadre de transports en séries, le nombre de détails de transports ne doit pas excéder 36 par facture.

Les exemples ci-après illustrent les modes de remplissage du type 4T de la Norme TA.

1. 3 transports de 50 kms avec forfait départemental dont un transport jour férié.

    Quantité <= 150 kms = 150
    Quantité <= 150 kms avec majoration férié = 50
    Quantité forfait = 3
    Quantité forfait de férié = 1

2. 3 transports de 160 kms avec forfait départemental dont un transport de nuit

    Quantité <= 150 = 450
    Quantité > 150 = 30

    Quantité <= 150 Nuit = 150
    Quantité > 150 Nuit = 10

    Quantité forfait = 3
    Quantité forfait Nuit = 1

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 26

# 6 - Codage des actes

## 60 - Codage de la biologie

Dès la mise en place du codage de la biologie, seule la lettre-clé B est acceptée dans les enregistrements de type 4 pour la Norme CP ou de type 4A pour la Norme LB (les lettres-clés BP et BR sont supprimées).

La procédure de codage de la biologie est obligatoire pour les laboratoires et cliniques mais également pour les consultations externes des hôpitaux publics et clinique PSPH, ainsi que pour les établissements de transfusion sanguine.
Les actes de biologie effectués par les pharmaciens sont eux exclus de la procédure de codage.

Les majorations de nuit et de férié étant codées dans les enregistrements de type 4B, les compléments d’actes N et F ne doivent plus figurer dans les enregistrements de type 4 pour la Norme CP ou de type 4A pour la Norme LB. Toutefois, le coefficient correspondant à ces majorations est à inclure dans le total des coefficients de l’enregistrement de type 4 pour la Norme CP ou de type 4A pour la Norme LB.

Le nombre d’enregistrements de type 4B est limité à 10 par type 4 (CP) ou 4A (LB). La valeur du dénombrement du type 4 (CP) ou du type 4A (LB) est égale au nombre de codes affinés contenus dans les enregistrements de type 4B qui suivent.

Lorsque l’acte de biologie a été effectué par un laboratoire spécialisé, sa facturation est reprise par le laboratoire demandeur et doit être isolée dans un type 4A particulier suivi du 4B comportant le codage de l’acte.

Certaines analyses peuvent être répétées plusieurs fois au cours d’une même journée et font alors l’objet d’une même facture. La présentation des enregistrements est alors la suivante :

Chaque exécution donne lieu à un Type 4A et un ou plusieurs Type 4B

<table>
    <tr>
      <td>4A</td>
      <td>code acte = B</td>
      <td>Quantité = 1</td>
      <td>Coefficient = n</td>
      <td rowspan="2">] 1<sup>ère</sup> analyse de la journée</td>
    </tr>
    <tr>
      <td>4B</td>
      <td colspan="3">xxxx liste des codes affinés</td>
    </tr>
    <tr>
      <td>4A</td>
      <td>code acte = B</td>
      <td>Quantité = 1</td>
      <td>Coefficient = n</td>
      <td rowspan="2">] 2<sup>ème</sup> même analyse de la journée</td>
    </tr>
    <tr>
      <td>4B</td>
      <td colspan="3">xxxx liste des codes affinés</td>
    </tr>
</table>

## 60.1- Codage d’anatomo-cyto-pathologie

Dès la mise en place du codage des actes d’anatomo-cyto-pathologie, seule la lettre-clé **P** est acceptée dans les enregistrements de type 4 pour la Norme CP ou de type 4A pour la Norme ER.

Le nombre d’enregistrements de type 4B est limité à 10 par type 4 (CP) ou 4A (ER). La valeur du dénombrement du type 4 (CP) ou du type 4A (ER) est égale au nombre de codes affinés contenus dans les enregistrements de type 4B qui suivent.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 27

# 61 - Codage de la pharmacie

## 61-1 Pharmacie de ville

En norme PH (Pharmacien) ou ER (pour les propharmaciens), on établit un enregistrement de type 4A par code <u>nature de prestation pharmacie</u>.

> **Supprimé :** acte PH1, PH4, PH7

<u>Si la prestation pharmacie supporte le codage,</u> cet enregistrement de type 4A est suivi d’<u>un seul</u> enregistrement de type 4<u>P</u>. Le type 4<u>P contient</u> le code CIP <u>du médicament délivré et éventuellement celui du médicament prescrit</u>. <u>Le type 4P supporte les codes CIP à 7 ou 13 caractères. Le</u> type 4<u>P peut être suivi de 1 à 15</u> types 4R<u>. Le type 4R n’est présent que s’il contient au moins l’information « n° de lot du conditionnement ».</u>

> **Supprimé :** C
> **Supprimé :** 1 à 10
> **Supprimé :** C
> **Supprimé :** C
> **Supprimé :** ne doit détailler que des produits ayant le même code taux/laboratoire

La valeur <u>de la quantité et</u> du dénombrement de l’enregistrement du type 4A demeure à 1.

La pharmacie délivrée par les établissements publics de santé et les cliniques privées est exclue de cette procédure de codage.

Les vaccins pris en compte dans le cadre de la prévention <u>sont facturés en</u> exonération « 7 »<u>, avec</u> codage obligatoire.

> **Supprimé :** Si un bénéficiaire est concerné par la délivrance de 2 vaccins différents dans une même facture, il faut alors générer 2 types 4A/4C distincts.

L’indication de substitution est possible sur chaque code CIP. Si la zone est à blanc ou à « N », c’est qu’il n’y a pas de substitution pour ce code.

> **Supprimé :** La substitution transitoire (« U » urgence et « G » générique) reste possible. Cette zone peut servir à indiquer la prescription en DCI : valeur « M » Molécule.

Dès lors qu’un second type 4<u>R</u> est transmis, il faut s’assurer que le premier type 4<u>R</u> est complètement renseigné.

> **Supprimé :** La substitution cible est désormais prise en compte : si la zone est renseignée à « P », cela indique que le code est celui du médicament prescrit, non délivré, et que celui-ci est substitué. Le code suivant est topé « D » et indique le médicament effectivement délivré.
> **Supprimé :** C
> **Supprimé :** C
> **Supprimé :** En particulier, si le 5<sup>ème</sup> code CIP d’un type 4C est un médicament prescrit, alors le 6<sup>ème</sup> code CIP (le médicament délivré) se trouve sur le type 4C suivant.

## 61-2 Pharmacie rétrocédée par les établissements de santé publics ou privés

En norme CP, on établit un enregistrement de type 4 par code acte PHH, PHS, PHQ.
Cet enregistrement de type 4 est suivi de 1 à 10 enregistrements de type 4H. Le ou les types 4H regroupent obligatoirement tous les codes UCD relatifs à une même nature de prestation, un même taux de prise en charge. Le prix unitaire de l’enregistrement de type 4 est obtenu par l’addition des « Montant total facturé TTC » des produits identifiés dans le ou les enregistrements de type 4H qui le suivent.
La valeur du dénombrement de l’enregistrement du type 4 CP demeure à 1.
<u>Certains médicaments ne sont pas soumis au codage UCD. Pour ces médicaments, on établit un enregistrement de type 4, sans type 4H, par code acte PHI, PHM, PHP ou PHU. Une marge MAR peut être associée à ces médicaments non codés.</u>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 28

## 61-3 Pharmacie en sus du GHS facturé par les établissements

En norme CP, on établit un enregistrement de type 3 par code acte PH8 quel que soit le taux de prise en charge de l’hospitalisation. Cet enregistrement de type 3 est suivi de 1 à 10 enregistrements de type 3H. Le ou les types 3H regroupent obligatoirement tous les codes UCD ayant un même taux de financement. Le prix unitaire de l’enregistrement de type 3 est obtenu par l’addition des « Montant total facturé TTC » des produits identifiés dans le ou les enregistrements de type 3H qui le suivent.

L’Ecart au Médicament Indemnisable (nature de prestation EMI) transmis en type 3 norme CP, suit immédiatement les types 3 / 3H de la prestation auquel il se rapporte. Le montant de l’EMI correspond à la somme des « montant total de l’écart indemnisable » des enregistrements de type 3H de la prestation PH8 qui précède.

## 62 - Codage des actes médicaux (CCAM) :

Dès la mise en place du codage des actes médicaux, la nature de prestation est renseignée par un code regroupement (cf. annexe 10 externalisée) dans les enregistrements de type 4 pour la Norme CP ou de type 4A pour les normes ER et CS.

La procédure de codage est obligatoire pour les médecins libéraux exerçant en cabinet ou en clinique mais également pour les consultations externes des hôpitaux publics et les cliniques PSPH.
Les actes médicaux effectués par les sages-femmes sont eux exclus de la procédure de codage.

Le codage des actes médicaux est contenu dans le type 4M. On trouve toujours un même code de l’acte/code activité/code phase de traitement par couple 4A/4M. Le nombre d’enregistrements de type 4M est limité à 26 par type 4 (CP) ou 4A (ER et CS) ; on ne trouve plusieurs types 4M que lorsqu’il faut renseigner plusieurs dates de séance.

Une phase de traitement est facturée lorsqu’elle est effectuée dans son ensemble. Si plusieurs phases sont facturées sur la même facture, alors chaque phase est décrite dans un type 4A distinct. Le PU du 4A correspond alors bien au PU de la base CCAM pour la phase de traitement donnée.
En cas d’actes permettant plusieurs séances pour une même phase de traitement, les dates de chaque séance seront transmises de façon chronologique, dans autant de types 4M que de séances réalisées. La date de la dernière séance correspond à la date d’exécution de l’acte du type 4A.
Avec le codage de la CCAM, l’exonération « Soins en rapport avec un K ou un KC >= 50 » ne peut plus être appliquée. Le code 1 devient une exonération CCAM liée à un acte. Les modalités d’exonération (exonération de l’acte ou de la facture, exonération de l’acte par nature ou par dépassement du seuil) sont trouvées dans la base CCAM en regard du code de l’acte concerné. L’exonération est positionnée au niveau ligne.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 29

# 63 – Codage des Articles de la LPP

## 63.1 - Titres I, II et IV

. <u>Les pharmaciens, <mark>les pédicures, les centres de santé :</mark></u>
Ils peuvent délivrer les articles de la LPP. Ils utilisent le type 4F avec <u><mark>respectivement</mark></u> les normes PH, <u><mark>, PE et CS</mark></u>.

. <u>Les fournisseurs </u>
Ils sont identifiés comme fournisseurs. Ils utilisent le type 4F avec la norme FR.

La délivrance d’articles de la LPP implique obligatoirement la transmission du type 4F que <mark>l’article</mark> de la LPP soit <mark>codé</mark> ou non. ~~le codage~~ ~~en place~~

. <u>Les cliniques et établissements privés</u>
Elles utilisent le type 3F avec la norme CP.

## 63.2 - LPP en sus du GHS facturé par les établissements

En norme CP, on établit un enregistrement de type 3 par nature de prestation LPP facturable en sus du GHS. Cet enregistrement de type 3 est suivi de 1 à 10 enregistrements de type 3F. Le ou les types 3F regroupent obligatoirement des codes LPP relatifs à une même nature de prestation et un même taux de financement. Le prix unitaire de l’enregistrement de type 3 est obtenu par l’addition des « Montant total facturé » des produits identifiés dans le ou les enregistrements de type 3F qui le suivent.

L’Ecart au Tarif Indemnisable (nature de prestation ETI) transmis en type 3 norme CP, suit immédiatement les types 3 / 3F de la prestation auquel il se rapporte. Le montant de l’ETI correspond à la somme des « montant total de l’écart indemnisable » des enregistrements de type 3F de la prestation qui précède.

# 7 – Tarification à l’activité

La tarification à l'activité concerne les établissements Médicaux, Chirurgicaux et d’Obstétrique (MCO).
L’ensemble des prestations recouvrant l’hébergement, l’environnement, la pharmacie fait l’objet d’un forfait par GHS (Groupe Homogène de Séjour).
A ce GHS correspond une durée moyenne de séjour (DMS), ainsi que des seuils haut et bas. Si la durée de séjour dépasse le seuil haut, on facture des journées supplémentaires sous le code EXH (Séjour Extrême Haut). Si la durée de séjour est inférieure au seuil bas, alors le GHS subit un coefficient réducteur.

Certaines prestations continuent d’être facturées sous DMT/MT : Accueil et Traitement des urgences (ATU), Interruption Volontaire de Grossesse (IVG) et Forfait de séances de Dialyse (D01 à Dxx).

La tarification à l'activité concerne également l’hospitalisation à domicile (HAD).
L’ensemble des prestations recouvrant l’HAD est facturé sous forme d’un GHT (Groupe Homogène de Tarif). Le GHT est une prestation journalière.

Dans le présent document, sont mentionnées sous forme de consignes, 2 cas particuliers :
* Hors TAA : établissements hors champ de la tarification à l'activité.
* Hors GHS : Prestations non concernées par la tarification à l'activité, et qui continuent à être facturées sous MT/DMT.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 30

# III - MODALITES DE TELETRANSMISSION

Le partenaire de santé utilise <u>le</u> protocole <u>de</u> transmission <u>«</u> SMTP <u>»</u> <u>, qui</u> permet le chiffrement de transport<u>.</u>

L’annexe 17 du présent document décrit la procédure de transmission Inter-Régimes

# <u>IV - DOCUMENTS ET PIECES JUSTIFICATIVES A FOURNIR</u>
# PAR LE PROFESSIONNEL DE SANTE

## 41 - BORDEREAU D’ACCOMPAGNEMENT DES PIECES JUSTIFICATIVES

Ce bordereau doit être le reflet d’un lot.

Composition du bordereau :

**En - tête :**

*   ■ identification du partenaire de santé
*   ■ n° du lot - date de constitution du lot
*   ■ n° de l’organisme d’Assurance Maladie destinataire
*   ■ type de destinataire de règlement (partenaire de santé ou assuré)

**Une ligne par facture :**

*   ■ n° de la facture
*   ■ n° d’immatriculation de l’assuré
*   ■ nom et prénom de l’assuré
*   ■ date de naissance du bénéficiaire
*   ■ montant total de la facture (dépassement compris)
*   ■ montant à la charge de l’Assurance Maladie
*   ■ montant à la charge d’un organisme complémentaire

**Supprimé :** r, en fonction des volumes transmis, 3

**Supprimé :** « PESIT/HORS SIT » (gros volumes) et ¶
« XMODEM CNAMTS » (volumes faibles ou moyens).¶

**Mis en forme :** Non Surlignage

**Supprimé :** s

**Mis en forme :** Non Surlignage

**Supprimé :** XMODEM CNAMTS doit avoir reçu une certification par un organisme désigné par la CNAMTS.¶
¶
Le protocole « XMODEM CNAMTS » permet un compactage de type 3 (voir cahier des charges XMODEM).¶
¶
L’organisme d’Assurance Maladie tient à la disposition du partenaire de santé ou de sa société de services informatiques le cahier des charges du protocole « XMODEM CNAMTS ». Le protocole « PESIT/HORS SIT » est disponible auprès du GSIT (Groupement des systèmes interbancaires de compensation, Avenue Ledru-Rollin à Paris).¶
¶
Ces protocoles sont susceptibles de modifications en fonction d’évolutions techniques.¶
¶

NORMES B2 - Cahier des Charges – Juin 2007 avec errata                            Page 31

### <u>Pour les cliniques :</u>

*   n° de la facture
*   n° d’immatriculation de l’assuré
*   nom et prénom de l’assuré
*   date de naissance du bénéficiaire
*   montant des prestations hospitalières facturées
*   montant des prestations hospitalières remboursables par l’Assurance Maladie
*   montant des prestations hospitalières remboursables par un organisme complémentaire
*   montant des honoraires facturés
*   montant des honoraires remboursables par l’Assurance Maladie
*   montant des honoraires remboursables par un organisme complémentaire

### **Une ligne « total général »**

*   nombre total de factures transmises
*   total des honoraires ou prestations facturés
*   total remboursable par la caisse
*   total participation de l’assuré et/ou de l’organisme complémentaire

### <u>Pour les cliniques</u>

*   nombre total de factures transmises
*   total des prestations hospitalières + honoraires facturés
*   total des prestations hospitalières + honoraires remboursables par l’Assurance Maladie
*   total des prestations hospitalières + honoraires remboursables par un organisme complémentaire

## **42 - PIECES JUSTIFICATIVES A JOINDRE**

Le bordereau édité tel qu’indiqué au point 41 est accompagné de l’ensemble des pièces justificatives exigées par la réglementation.

Les pièces justificatives doivent être classées en ordre croissant des numéros de factures et dans le même ordre que sur le bordereau récapitulatif et dans le fichier.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 32

# **TYPE 000**

## **DEBUT DE FICHIER**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 33

# **TYPE 000 : DEBUT FICHIER - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 000</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>1 fois par fichier physique. Permet d’identifier l’expéditeur du fichier (l’identification peut-être ≠ de celle exigée par le protocole de transmission), le destinataire, le fichier et de transmettre éventuellement un message</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1-3</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>= 000 (zéro) DEBUT DE FICHIER</td>
    </tr>
    <tr>
      <td>- Type d’émetteur</td>
      <td>4-5</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Valeur <u>TP</u> si transmission par partenaire de santé autre qu’établissement.<br />Valeur <u>TE</u> si partenaire de santé : établissement ou soins.<br />Valeur <u>SI</u> : autres émetteurs (ex : sociétés civiles professionnelles, sociétés civiles de moyens, etc.)<br />Valeur <u>OT</u> si transmission entre un OCT et l’organisme d’assurance maladie.</td>
    </tr>
    <tr>
      <td>- Numéro d’émetteur</td>
      <td>6-19</td>
      <td></td>
      <td>14</td>
      <td>O</td>
      <td>Si l’émetteur est un partenaire de santé (<u>TP</u> ou <u>TE</u>) : N° national d’identification et clé.<br />Si l’émetteur est de type SI : N° attribué par l’organisme d’assurance maladie, de préférence : N° SIRET.<br />Si l’émetteur est de type <u>OT</u> :<br />- n° SIRET en SESAM ou SESAM dégradé,<br />- n° attribué par l’organisme d’assurance maladie ou n° SIREN en B2.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>20-25</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Type de destinataire</td>
      <td>26-27</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Valeurs : Voir annexe 1.</td>
    </tr>
    <tr>
      <td>N° de destinataire</td>
      <td>28-41</td>
      <td></td>
      <td>14</td>
      <td>O</td>
      <td>Constitué par :<br />1- six 0 (zéro)<br />2- le code Grand régime : 2 car. Annexe 2<br />3- le code centre informatique : 3 car. Annexe 3 : à prendre en compte, quelle que soit la version de normes B2 utilisée.<br />4- identification complémentaire : 3 car égal à la valeur du n° d’organisme destinataire du type 1 position 17-19.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 34

# **TYPE 000 : DEBUT FICHIER - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Date de<br />réception du flux<br />sur le frontal</td>
      <td>42-47</td>
      <td>6</td>
      <td></td>
      <td>O</td>
      <td>Zone transmise à blanc, et renseignée<br />par le frontal avec la date de réception<br />du flux.</td>
    </tr>
    <tr>
      <td>- Application</td>
      <td>48-49</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Valeur TR<br />Valeur TO pour les flux transitant par<br />un OCT.</td>
    </tr>
    <tr>
      <td>- Identification du<br />fichier</td>
      <td>50-55</td>
      <td>6</td>
      <td></td>
      <td>O</td>
      <td>Nom du fichier transmis, attribué par<br />l’émetteur.<br />Alphabétique ou numérique, sans<br />caractère spécial, cette information<br />doit impérativement différer d’un fichier<br />à l’autre.</td>
    </tr>
    <tr>
      <td>- Date de<br />création du<br />fichier</td>
      <td>56-61</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>AAMMJJ</td>
    </tr>
    <tr>
      <td>- Norme</td>
      <td>62-65</td>
      <td>4</td>
      <td></td>
      <td>O</td>
      <td>Identifie la norme à utiliser par le<br />partenaire de santé. Valeur voir annexe<br />4.<br />A cadrer à gauche.</td>
    </tr>
    <tr>
      <td>- Version de<br />Norme</td>
      <td>66-67</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Valeur B2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>68</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>69</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>70-72</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>zone réservée SESAM</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>73-82</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Longueur<br />d’enregistrement</td>
      <td>83-85</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Valeur 128</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>86-91</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Zone message</td>
      <td>92-128</td>
      <td>37</td>
      <td></td>
      <td>F</td>
      <td>Zone de communication. Permet à<br />l’expéditeur de communiquer un<br />message. Elle est alphanumérique,<br />mais ne doit pas comporter de<br />caractères spéciaux.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 35

# **TYPE 1**

## **DEBUT DE LOT**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 36

# **TYPE 1 : DEBUT LOT - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 1</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>1 fois par lot. En-tête de l’ensemble des<br />factures transmises par un partenaire<br />de santé à un organisme d’Assurance<br />Maladie.</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 1 Début de lot.</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Numéro national d’identification du<br />partenaire de santé + Clé. - annexe 5 -<br />Clé à contrôler après saisie selon<br />instructions.</td>
    </tr>
    <tr>
      <td>- Origine du<br />fichier</td>
      <td>11-16</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire dans le cas de flux pour<br />information ne donnant pas lieu à<br />paiement.<br />Valeur « BG » : Consultations et soins<br />externes en Budget Global, flux servant<br />à détecter les participations forfaitaires.<br />Un lot de ce type ne contient que des<br />factures ayant un qualificatif de<br />dépense à « I » pour information.<br />A blanc sinon, sauf indication<br />particulière de l’organisme d’Assurance<br />Maladie destinataire.</td>
    </tr>
    <tr>
      <td>- N° d’organisme<br />destinataire</td>
      <td>17-19</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Indiquer le numéro d’organisme auquel<br />est adressé le lot de factures.<br />(Codification annexe 3).</td>
    </tr>
    <tr>
      <td>- N° de lot</td>
      <td>20-22</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Numéro attribué par le partenaire de<br />santé.<br />Il caractérise l’ensemble des factures<br />transmises à une caisse. Pour une<br />même caisse, ce N° doit être<br />impérativement différent d’un lot à<br />l’autre et évolutif de 001 à 999. Voir<br />exemple dans les instructions<br />générales.</td>
    </tr>
    <tr>
      <td>- Catégorie</td>
      <td>23-25</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Code catégorie attribué par la CRAM<br />pour les établissements, les centres de<br />santé, les centres thermaux.<br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- Statut juridique</td>
      <td>26-27</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Code statut juridique attribué par la<br />CRAM pour les établissements, les<br />centres de santé, les centres thermaux.<br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- Mode de<br />fixation des tarifs</td>
      <td>28-29</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Code mode de fixation des tarifs<br />attribué par la CRAM pour les<br />établissements, les centres de santé,<br />les Centres thermaux.<br />A blanc dans les autres cas.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 37

# TYPE 1 : DEBUT LOT - TOUTES NORMES

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b> <b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Nom ou raison sociale du parte-naire de santé</td>
      <td>30-69</td>
      <td>40</td>
      <td></td>
      <td>O</td>
      <td>Nom ou raison sociale du partenaire de santé</td>
    </tr>
    <tr>
      <td>- Version de norme utilisée</td>
      <td>70-71</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Permet d'indiquer la référence de la NORME.<br />Ce code est attribué par l'organisme d'Assurance Maladie. La norme décrite dans le présent cahier des charges correspond à la version B2.</td>
    </tr>
    <tr>
      <td>- Date de création du lot</td>
      <td>72-77</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>78</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Code norme</td>
      <td>79-80</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>= Voir annexe 4</td>
    </tr>
    <tr>
      <td>- Top certification du lot</td>
      <td>81</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><b>Blanc</b> = B2 non sécurisée, non chiffrée.<br /><b>S</b> = SESAM avec Vitale, sécurisé, chiffré.<br /><b>F</b> = SESAM sans Vitale, sécurisé, chiffré.<br /><b>D</b> = SESAM dégradé, chiffré avec CPS, sans Vitale.</td>
    </tr>
    <tr>
      <td>- Numéro de version de norme</td>
      <td>82-87</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Valeur <u>062007</u> Supprimé : 062005</td>
    </tr>
    <tr>
      <td>- Unité monétaire de facturation</td>
      <td>88</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Unité monétaire utilisée pour la facturation du lot :<br /><b>U</b> pour monnaie Unique : tous les montants, de tous les types sont exprimés en euros.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 38

# **TYPE 1 : DEBUT LOT - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Grand régime<br />de la caisse pivot<br /><u>ou de la caisse<br />de paiement<br />unique</u></td>
      <td>89-90</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Zone transmise à blanc.<br /><u>Renseignée par le frontal en</u> Caisse<br />Centralisatrice des Paiements pour les<br />établissements privés <u>et</u> <u>dans le cadre</u><br /><u>de la Caisse de paiement unique pour</u><br /><u>les établissements publics et privés</u><br /><u>antérieurement sous dotation globale.</u></td>
    </tr>
    <tr>
      <td>- N° de la caisse<br />pivot <u>ou n° de la</u><br /><u>caisse de</u><br /><u>paiement unique</u></td>
      <td>91-93</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Zone transmise à blanc.<br /><u>Renseignée par le frontal en</u> Caisse<br />Centralisatrice des Paiements pour les<br />établissements privés <u>et</u> <u>dans le cadre</u><br /><u>de la Caisse de paiement unique pour</u><br /><u>les établissements publics et privés</u><br /><u>antérieurement sous dotation globale.</u></td>
    </tr>
    <tr>
      <td>- Indication de<br />dispositif Caisse<br />Centralisatrice<br />des Paiements<br /><u>ou de la caisse</u><br /><u>de paiement</u><br /><u>unique.</u></td>
      <td>94</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone transmise à blanc.<br /><u>Renseignée par le frontal</u> <u>en Caisse</u><br /><u>Centralisatrice des Paiements pour les</u><br /><u>établissements privés et dans le cadre</u><br /><u>de la Caisse de paiement unique pour</u><br /><u>les établissements publics et privés</u><br /><u>antérieurement sous dotation globale.</u></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>95-128</td>
      <td>34</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 39

# **TYPE 2**

## **DEBUT DE FACTURE**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 40

# **TYPE 2 : DEBUT FACTURE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>1 fois en - tête de chaque facture.</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture.</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>A prendre sur le même support que le<br />n° immatriculation.. Clé à contrôler<br />après la saisie – cf. annexe 5</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>N° attribué par le partenaire de santé. Il<br />ne doit pas y avoir de N° en double,<br />durant une période à déterminer avec<br />l’Assurance Maladie. Le N° de la<br />facture doit être différent de zéro.</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire dans la norme centres<br />thermaux si présence de 2S, 2E, 2B ou<br />2C.<br />Obligatoire dans la norme transport<br />sanitaire si présence de 2S ou 2E.<br />Obligatoire dans toutes les autres<br />normes (sauf CP).<br />A compléter avec la lettre A.</td>
    </tr>
    <tr>
      <td>- Marquage de la<br />facture</td>
      <td>37</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>zone réservée SESAM.<br />Valeurs en SESAM : R facture réelle,<br />T facture test, D facture démonstration.</td>
    </tr>
    <tr>
      <td>- Indicateur de<br />forçage de la<br />tarification de la<br />part AMO</td>
      <td>38</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>zone réservée SESAM<br />Blanc : pas de forçage<br />Autres valeurs : forçage d’une<br />information applicable à l’ensemble de<br />la facture qui peut lever la garantie de<br />paiement.</td>
    </tr>
    <tr>
      <td>- Nature<br />d’opération</td>
      <td>39</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Voir codification en annexe 7, valeur :1<br />dans le cas général</td>
    </tr>
    <tr>
      <td>- Date de<br />facturation</td>
      <td>40-45</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Indiquer la date de facturation.</td>
    </tr>
    <tr>
      <td>- Top éclatement<br />des flux par le<br />PS</td>
      <td>46</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeur « <b>E</b> » : éclatement du flux<br />SESAM Vitale par le PS, avec<br />génération d’une DRE.<br />Valeur « <b>F</b> » : éclatement du flux par le<br />PS, hors SESAM Vitale.<br />A blanc : Pas d’éclatement à la source.</td>
    </tr>
    <tr>
      <td>- Type de facture</td>
      <td>47</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Hors SESAM : à blanc.<br />SESAM et SESAM dégradé : valeur <b>F</b>.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 41

# **TYPE 2 : DEBUT FACTURE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Facture<br /><u><mark>sécurisée</mark></u> sur un<br />dispositif portable</td>
      <td>48</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM.<br />Valeur « <b>V</b> », si la facture est <u><mark>sécurisée</mark></u><br /><u>sur un dispositif portable en dehors du</u><br />cabinet.<br />Blanc : autres cas.</td>
    </tr>
    <tr>
      <td>- Code Grand<br />Régime</td>
      <td>49-50</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.<br /><br />Voir codification annexe 2</td>
    </tr>
    <tr>
      <td>- N° Caisse<br />gestionnaire</td>
      <td>51-53</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.<br /><br />Voir codification annexe 3</td>
    </tr>
    <tr>
      <td>- N° Centre<br />gestionnaire</td>
      <td>54-57</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.<br /><br /><u>Pour le <mark>RSI</mark></u> : cadrage du numéro de<br />centre à gauche, le 4<sup>ème</sup> caractère doit<br />être renseigné par un 0 en position 57</td>
    </tr>
    <tr>
      <td>- Nature de la<br />pièce justificative<br />des droits</td>
      <td>58</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Voir codification en annexe 8 -<br />JUSTIFICATION DES DROITS AMO</td>
    </tr>
    <tr>
      <td>- N° prescripteur<br />+ clé</td>
      <td>59-67</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Indiquer le numéro du prescripteur<br />(même s’il s’agit d’un établissement).<br />Clé à contrôler - annexe 5</td>
    </tr>
    <tr>
      <td>- Date de<br />prescription</td>
      <td>68-73</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>AAMMJJ<br />Date de prescription ou de proposition<br />de la prothèse dentaire</td>
    </tr>
    <tr>
      <td>- Régime de<br />prestation de<br />l’assuré</td>
      <td>74-76</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire dans la norme centres<br />thermaux. Laisser à blanc dans les<br />autres cas.</td>
    </tr>
    <tr>
      <td>- Nature<br />d’assurance</td>
      <td>77-78</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>10 : maladie<br />13 : maladie régime local (Alsace -<br />Moselle)<br />30 : maternité<br />41 : accident du travail<br />90 : prévention maladie</td>
    </tr>
    <tr>
      <td>- Justification<br />d’exonération ou<br />de modulation du<br />ticket modérateur</td>
      <td>79</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Précise et justifie l’exonération ou la<br />modulation du ticket modérateur<br />appliqué aux soins facturés.<br />Cf. codification annexe 9.<br /><br />Cette justification vaut pour la totalité<br />de la facture, sauf indication contraire<br />au niveau de la ligne (position 54) dans<br />le Type 4 Toutes Normes.</td>
    </tr>
  </tbody>
</table>
Supprimé : établie
Supprimé : établie
Supprimé : s AMPI

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 42

# **TYPE 2 : DEBUT FACTURE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Date Maternité</td>
      <td>80-85</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Cette date correspond à la date présumée de grossesse ou à la date d’accouchement ou à la date d’adoption inscrite sur les étiquettes maternité.<br /><br />Obligatoire avec une nature d’assurance 30 maternité.</td>
    </tr>
    <tr>
      <td>- Numéro accident du travail ou date d’accident de droit commun</td>
      <td>86-94</td>
      <td></td>
      <td>9</td>
      <td>F</td>
      <td>Obligatoire en cas d’accident.<br /><u>Lorsque la Nature d’Assurance est AT (41) :</u><br />indiquer le numéro de l’AT (pour le RG, AAMMJJ + code CRAM + clé à contrôler, voir annexe 5) ou la date de l’AT (AAMMJJ, cadrée à droite et complétée par 3 zéros).<br /><u>Lorsque la Nature d'Assurance est AS (10 ou 13):</u><br />indiquer la date d’accident de droit commun (AAMMJJ, cadrée à droite et complétée par 3 zéros)</td>
    </tr>
    <tr>
      <td>- Présence d’une CPS de remplaçant pour sécurisation de la facture</td>
      <td>95</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Zone réservée SESAM.<br />Valeur « X » si la facture est sécurisée en présence de la CPS du remplaçant.<br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- Date de naissance du bénéficiaire</td>
      <td>96-101</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Indiquer ici la date de naissance du bénéficiaire.<br />AAMMJJ</td>
    </tr>
    <tr>
      <td>- Rang de naissance</td>
      <td>102</td>
      <td></td>
      <td>1</td>
      <td>F</td>
      <td><u>Obligatoire pour le régime général</u> : A reprendre sur l’attestation de droits, la carte Vitale ou la prise en charge. où il suit immédiatement la date de naissance</td>
    </tr>
    <tr>
      <td>- Rang de bénéficiaire</td>
      <td>103-104</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>A blanc pour le régime général. A prendre sur l’attestation de droits dans les autres régimes, si présent.</td>
    </tr>
    <tr>
      <td>- N° d’adhérent</td>
      <td>105-112</td>
      <td>8</td>
      <td></td>
      <td>F</td>
      <td>N° d’adhérent à un organisme complémentaire. Ne doit être servi que si la zone N° d’organisme complémentaire (119-128) est complétée.</td>
    </tr>
    <tr>
      <td>- Spécialité de prescripteur</td>
      <td>113-114</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Facultatif mais obligatoire pour les prescripteurs salariés.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 43

# **TYPE 2 : DEBUT FACTURE – TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Destinataire du règlement</td>
      <td>115-116</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>00 = Hors Tiers Payant : règlement à l’assuré<br />05 = Tiers Payant sur la part obligatoire seule (y compris le cas d’exonération du Ticket Modérateur) : règlement au partenaire de santé.<br />15 = Tiers Payant Intégral (part RO+RC) : règlement au partenaire de santé.<br />25 = Tiers Payant sur la part complémentaire seule : règlement au partenaire de santé.<br />06 = Tiers payant intégral : cas des seuls PS exerçant pour le compte d<u>u</u> régime<s>s</s> SNCF<s>s</s> <s>ou Mines</s>.<br /><i>10 = Réservé Régime Général pour les soins AT en consultation externe <u style="text-decoration: none; color: blue;">issus de la chaîne Budget Global</u>.</i></td>
    </tr>
    <tr>
      <td>- Type de contrat souscrit auprès d’un organisme complémentaire</td>
      <td>117-118</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Indiquer le type de contrat. Codification fournie par la caisse.<br />85 : sortants du dispositif CMUC (géré par un organisme obligatoire)<br />87 : sortants du dispositif CMUC (géré par un organisme complémentaire)<br />88 : aide à la mutualisation (panier de biens = panier CMUC)<br />89 : bénéficiaire de la CMU complémentaire (en cours), quel que soit le gestionnaire<br />99 : le PS transmet la FSE vers un OCT, et autorise celui-ci à pratiquer un éclatement du flux.</td>
    </tr>
    <tr>
      <td>- N° d’organisme complémentaire</td>
      <td>119-128</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>L’organisme obligatoire peut selon conventions <u>régler</u> directement la part de l’organisme complémentaire au partenaire de santé ou à l’assuré ou <u>transmettre</u> l’image de son décompte à l’organisme complémentaire.<br /><br />Lorsque le PS pratique un tiers payant sur la part complémentaire, il doit obligatoirement positionner le <b><b>n° de</b> l’organisme complémentaire</b>, cadré à droite, et complété par des zéros à gauche, ou le <b><b>top mutualiste «M »</b></b> en position 128, la zone étant complétée par des blancs.</td>
    </tr>
  </tbody>
</table>
Supprimé : es
Supprimé : s
Supprimé : ou Mines

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 44

# **TYPE 2 : DEBUT FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>1 fois en tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge.. Clé à<br />contrôler après la saisie annexe 5</td>
    </tr>
    <tr>
      <td>- Rang du<br />bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Valeur 000 pour le régime général.<br />A prendre sur l’attestation de droits ou<br />la prise en charge pour autres régimes<br />si présent</td>
    </tr>
    <tr>
      <td>- N° facture <u>ou n°<br />de titre pour les<br />établissements<br />publics</u></td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>N° attribué par le partenaire de santé. Il<br />ne doit pas y avoir de N° en double,<br />durant une période à déterminer avec<br />l’Assurance Maladie.<br />Le numéro de la facture doit être<br />différent de zéro.<br /><u>En norme CP, pour les établissements<br />publics :<br />- l’exercice du titre : sur 2 car (à gauche)<br />- le n° de titre : sur 7 car.</u></td>
    </tr>
    <tr>
      <td>- Nature<br />d’opération</td>
      <td>39</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Voir codification - annexe 7<br />Valeur :1 dans le cas général</td>
    </tr>
    <tr>
      <td>- N° d’entrée</td>
      <td>40-48</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>N° attribué par l’établissement</td>
    </tr>
    <tr>
      <td>- Code Grand<br />Régime</td>
      <td>49-50</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge. Voir<br />codification annexe 2</td>
    </tr>
    <tr>
      <td>- N° caisse<br />gestionnaire</td>
      <td>51-53</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge. Voir<br />codification annexe 3</td>
    </tr>
    <tr>
      <td>- N° centre<br />gestionnaire</td>
      <td>54-57</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge. Pour<br />le <mark>RSI</mark> : cadrage du numéro de centre à<br />gauche, le 4<sup>ème</sup> caractère doit être<br />renseigné par un 0 en position 57</td>
    </tr>
    <tr>
      <td>- Nature de la<br />pièce justificative<br />des droits</td>
      <td>58</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Voir codification en annexe 8 -<br />JUSTIFICATION DES DROITS AMO</td>
    </tr>
  </tbody>
</table>
Supprimé : <s>s AMPI</s>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 45

# **TYPE 2 : DEBUT FACTURE –**
## **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Prise en charge établie le</td>
      <td>59-64</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Obligatoire si l’établissement a indiqué qu’il possède une prise en charge.<br />Indiquer la date de prise en charge par l’organisme d’Assurance maladie. AAMMJJ.</td>
    </tr>
    <tr>
      <td>Attestation de droits, carte Vitale ou prise en charge valable à compter du.</td>
      <td>65-70</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Obligatoire si l’établissement a indiqué que l’assuré a présenté une attestation de droits, une carte Vitale ou une prise en charge.<br />Indiquer la date de validité de cette attestation. AAMMJJ.</td>
    </tr>
    <tr>
      <td>- Délivrée par</td>
      <td>71-73</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Code de l’organisme ayant délivré l’attestation de droits, la carte Vitale ou la prise en charge. (A prendre sur l’attestation de droits, la carte Vitale ou la prise en charge)</td>
    </tr>
    <tr>
      <td>- Régime de prestation de l’assuré</td>
      <td>74-76</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>A reprendre sur la prise en charge ou laisser à 000.<br />Cette information est obligatoire, en cas de présence de types 2B/2C, pour les bénéficiaires relevant de la subsistance « F212 », au sens du décret du 22.12.1967 (ex : bénéficiaires hospitalisés MECS, …)</td>
    </tr>
    <tr>
      <td>- Nature d’assurance</td>
      <td>77-78</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>10 : maladie<br />13 : maladie régime local Alsace-Moselle<br />30 : maternité<br />41 : accident du travail<br />90 : prévention maladie</td>
    </tr>
    <tr>
      <td>- Justification d’exonération ou de modulation du ticket modérateur</td>
      <td>79</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Précise et justifie l’exonération ou la modulation du ticket modérateur appliqué aux soins facturés.<br />Cf. codification annexe 9.<br />Cette justification vaut pour la totalité de la facture, sauf indication contraire au niveau de la ligne dans le type 3 (position 64) ou le Type 4 (position 54) en Norme CP.</td>
    </tr>
    <tr>
      <td>- Date de l’hospitalisation</td>
      <td>80-85</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Date du début de l’hospitalisation quel que soit l’établissement (en cas de transfert par exemple)</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 46

# **TYPE 2 : DEBUT FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Numéro accident du travail ou date d’accident de droit commun</td>
      <td>86-94</td>
      <td></td>
      <td>9</td>
      <td>F</td>
      <td>Obligatoire en cas d’accident.<br /><u>Lorsque la Nature d’Assurance est AT (41) :</u><br />indiquer le numéro de l’AT (pour le RG, AAMMJJ + code CRAM + clé à contrôler, voir annexe 5) ou la date de l’AT (AAMMJJ, cadrée à droite et complétée par 3 zéros).<br /><u>Lorsque la Nature d'Assurance est AS (10 ou 13):</u><br />indiquer la date d’accident de droit commun (AAMMJJ, cadrée à droite et complétée par 3 zéros)</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>95</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Date de naissance du bénéficiaire</td>
      <td>96-101</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Indiquer ici la date de naissance du bénéficiaire. AAMMJJ</td>
    </tr>
    <tr>
      <td>- Rang de naissance</td>
      <td>102</td>
      <td></td>
      <td>1</td>
      <td>F</td>
      <td><u>Obligatoire pour le régime général</u> :<br />A reprendre sur l’attestation Vitale où il suit immédiatement la date de naissance</td>
    </tr>
    <tr>
      <td>- Date d’entrée</td>
      <td>103-108</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Date d’entrée de l’hospitalisé dans l’établissement qui présente la facture (ou date de début de facturation).</td>
    </tr>
    <tr>
      <td>- Date de sortie</td>
      <td>109-114</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Indiquer la date de sortie réelle si tel est le cas, ou la date limite de facturation s’il s’agit d’une facturation partielle.</td>
    </tr>
    <tr>
      <td>- Heure de sortie</td>
      <td>115-116</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>2 chiffres pour l’heure seulement.<br />Indiquer une heure fictive s’il s’agit d’un début de facturation partielle</td>
    </tr>
    <tr>
      <td>- Type de contrat</td>
      <td>117-118</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Indiquer le type de contrat codification fournie par la caisse.<br />85 : sortants du dispositif CMUC (géré par un organisme obligatoire)<br />87 : sortants du dispositif CMUC (géré par un organisme complémentaire)<br />88 : aide à la mutualisation (panier de biens = panier CMUC)<br />89 : bénéficiaire de la CMU complémentaire (en cours), quel que soit le gestionnaire</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 47

# **TYPE 2 : DEBUT FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- N° d’organisme<br />complémentaire</td>
      <td>119-128</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>L’organisme obligatoire peut selon conventions <u>régler</u> directement la part de l’organisme complémentaire au partenaire de santé ou à l’assuré ou <u>transmettre</u> l’image de son décompte à l’organisme complémentaire.<br />Lorsque le PS pratique un tiers payant sur la part complémentaire, il doit obligatoirement positionner le <b><b>n° de</b> l’organisme complémentaire</b>, cadré à droite, et complété par des zéros à gauche, ou le <b><b>top mutualiste «M »</b></b> en position 128, la zone étant complétée par des blancs.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 48

# **TYPE 2S : SUITE DEBUT FACTURE –**
# **TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 S</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture - suite</td>
    </tr>
    <tr>
      <td>- N° du partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N° immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur S constante.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>37-49</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation individuel</td>
      <td>50-62</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td>A renseigner si l’information est présente sur la carte Vitale, l’attestation de droits ou la prise en charge.</td>
    </tr>
    <tr>
      <td>- Clé du N° immatriculation</td>
      <td>63-64</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>A prendre sur le même support que le n° immatriculation.<br />Clé à contrôler après la saisie, cf. annexe 5</td>
    </tr>
    <tr>
      <td>- Référence de la liste d’opposition</td>
      <td>65-70</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Zone réservée SESAM.<br />Date de référence de la liste d’opposition Vitale utilisée lors de l’élaboration de la facture.<br />Non renseigné si absence de carte Vitale.</td>
    </tr>
    <tr>
      <td>- Top déclaration de médecin traitant</td>
      <td>71</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br /><br />Valeur « O » si le bénéficiaire a déclaré un médecin traitant.<br />Valeur « N » si le bénéficiaire n’a pas déclaré de médecin traitant.<br /><br />A blanc dans les autres situations.</td>
    </tr>
    <tr>
      <td>- Nom du médecin traitant ou du praticien qui a orienté le patient</td>
      <td>72-96</td>
      <td>25</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br />Obligatoire si le patient est orienté.</td>
    </tr>
    <tr>
      <td>- Prénom du médecin traitant ou du praticien qui a orienté le patient</td>
      <td>97-111</td>
      <td>15</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br />Obligatoire si le patient est orienté.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 49

# **TYPE 2S : SUITE DEBUT FACTURE –**
# **TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- N° du médecin traitant</td>
      <td>112-120</td>
      <td></td>
      <td>9</td>
      <td>F</td>
      <td>Zone réservée.</td>
    </tr>
    <tr>
      <td>- Indicateur du parcours de soins</td>
      <td>121</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br />Cf. annexe 25.</td>
    </tr>
    <tr>
      <td>- Option de coordination</td>
      <td>122</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>A renseigner en norme ER :<br />Valeur « O » si l’exécutant a opté pour l’option de coordination.<br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- Origine de la prescription</td>
      <td>123</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Pour les professions prescrites :<br />- <u>Dans le cadre du parcours de soins,</u> cf. annexe 25.<br />- <u>Pour les opticiens, et les pharmaciens pour les délivrances d’optique :</u><br /><u>Valeur « <b>I</b> » en cas de renouvellement à l’Identique de la prescription initiale</u><br /><u>Valeur « <b>A</b> » en cas de renouvellement Adapté</u></td>
    </tr>
    <tr>
      <td>- Condition d’exercice du prescripteur</td>
      <td>124</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si le prescripteur agit en tant que libéral « L », que salarié « S » ou que bénévole « B ».</td>
    </tr>
    <tr>
      <td><u>- Support liste opposition</u></td>
      <td><u>125</u></td>
      <td><u>1</u></td>
      <td></td>
      <td><u>F</u></td>
      <td><u>Indiquer le type de liste d’opposition utilisée :</u><br />- <u>Valeur « E » : LOE-liste d’opposition électronique</u><br />- <u>Valeur « I » : LOI-liste d’opposition incrémentale</u><br /><u>En rapport avec la date de référence de la liste d’opposition en pos. 65-70 du même type.</u></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>12<s>6</s>-128</td>
      <td><s>3</s> <u>2</u></td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>
Mis en forme : Non Surlignage
Supprimé : 5
Supprimé : 4

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 50

# **TYPE 2S : SUITE DEBUT FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><u>LONGUEUR</u></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 S</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture – suite</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang du<br />bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>39</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur S constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>40-41</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- Complément au<br />numéro de titre<br />de recette</td>
      <td>42-47</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Obligatoire pour le receveur des<br />hôpitaux publics, complément au<br />numéro de titre de recette (position 30-<br />38 du type 2 CP).</td>
    </tr>
    <tr>
      <td>- Destinataire du<br />règlement</td>
      <td>48-49</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire pour les établissements non<br />conventionnés :<br />02 = Hors Tiers Payant : règlement à<br />l’assuré</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />individuel</td>
      <td>50-62</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td>A renseigner si l’information est<br />présente sur la carte Vitale, l’attestation<br />de droits ou la prise en charge.</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>63-64</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>A prendre sur le même support que le<br />n° immatriculation.<br />Clé à contrôler après la saisie, cf.<br />annexe 5</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>65-70</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Top déclaration<br />de médecin<br />traitant</td>
      <td>71</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeur « O » si le bénéficiaire a déclaré<br />un médecin traitant.<br />Valeur « N » si le bénéficiaire n’a pas<br />déclaré de médecin traitant.<br /><br />A blanc dans les autres situations.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 51

# **TYPE 2S : SUITE DEBUT FACTURE -**
## **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Nom du médecin traitant ou du praticien qui a orienté le patient</td>
      <td>72-96</td>
      <td>25</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br /><br />Obligatoire si le patient est orienté.</td>
    </tr>
    <tr>
      <td>- Prénom du médecin traitant ou du praticien qui a orienté le patient</td>
      <td>97-111</td>
      <td>15</td>
      <td></td>
      <td>F</td>
      <td>A renseigner pour les factures médecins :<br /><br />Obligatoire si le patient est orienté.</td>
    </tr>
    <tr>
      <td>- N° du médecin traitant</td>
      <td>112-120</td>
      <td></td>
      <td>9</td>
      <td>F</td>
      <td>Zone réservée.</td>
    </tr>
    <tr>
      <td>- Indicateur du parcours de soins</td>
      <td>121</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeurs possibles dans le cadre du parcours de soins :<br /><br />Cf. annexe 25.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>122-128</td>
      <td>7</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 52

# **TYPE 2E : SUITE DEBUT FACTURE -**
# **TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 E</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td>Suite de l’en-tête facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture – Extension du<br />type 2</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur E constante.</td>
    </tr>
    <tr>
      <td>- Identifiant<br />RPPS du<br />prescripteur</td>
      <td>37-47</td>
      <td>▼</td>
      <td><mark>11</mark></td>
      <td>F</td>
      <td>A renseigner avec le n° RPPS du<br />prescripteur.</td>
    </tr>
    <tr>
      <td>- N° de la<br />structure dans<br />laquelle le PS a<br />prescrit</td>
      <td>48-61</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>A renseigner avec le n° SIRET ou le n°<br />FINESS de la structure.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>62-128</td>
      <td>67</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>
Supprimé : 11

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 53

# **TYPE 2M : COMPLEMENT FACTURE, INFO OC –**
# **TOUTES NORMES sauf CP, CT et TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 M</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture - informations OC</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur M constante.</td>
    </tr>
    <tr>
      <td>- N° d’organisme<br />complémentaire<br />(*)</td>
      <td>37-46</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>Lorsque le PS réalise une DRE, pour le<br />remboursement de la part<br />complémentaire, il doit obligatoirement<br />positionner le n° de l’organisme<br />complémentaire, cadré à droite, et<br />complété par des zéros à gauche.</td>
    </tr>
    <tr>
      <td>- Code routage<br />destinataire AMC<br />(*)</td>
      <td>47-48</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Valeur « OC » : l’OC est destinataire<br />direct.<br /><br />Autres valeurs : le routage s‘opère par<br />l’intermédiaire d’un centre de service<br />AMC.</td>
    </tr>
    <tr>
      <td>- Identifiant de<br />l’hôte<br />destinataire AMC<br />(*)</td>
      <td>49-51</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Code / identifiant de l’organisme<br />gestionnaire du flux AMC.</td>
    </tr>
    <tr>
      <td>- FILLER (*)</td>
      <td>52-71</td>
      <td>20</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée à titre conservatoire<br />pour véhiculer le nom de domaine.</td>
    </tr>
    <tr>
      <td>- Identifiant AMC<br />fourni par<br />l’organisme<br />complémentaire</td>
      <td>72-86</td>
      <td>15</td>
      <td></td>
      <td>F</td>
      <td>Identifiant AMC fourni par l’organisme<br />complémentaire (N° adhérent).<br />Cette zone n’est servie que si le<br />support de justification de la couverture<br />AMC porte cet identifiant et si un n°<br />d’organisme complémentaire est<br />indiqué.</td>
    </tr>
  </tbody>
</table>

(*) Ces zones peuvent être chiffrées sur demande de l’OC. Elles servent à l’adressage des flux.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 54

# **TYPE 2M : COMPLEMENT FACTURE, INFO OC –**
# **TOUTES NORMES sauf CP, CT et TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- FILLER</td>
      <td>87-93</td>
      <td>7</td>
      <td></td>
      <td>F</td>
      <td>Zone non certifiée quand le type de<br />contrat du type 2 est à 99.<br />Sinon certifié.</td>
    </tr>
    <tr>
      <td>- Code forçage<br />de la tarification<br />de la part AMC</td>
      <td>94</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM<br />Blanc : pas de forçage<br /><br />Autres valeurs : Indicateur de forçage<br />par le PS, de la tarification de la part<br />AMC issue d’un module STS (*).</td>
    </tr>
    <tr>
      <td>- Type du module<br />STS (*)</td>
      <td>95</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Codification :<br />    R : Régime AMO<br />    U : CMU<br />    M : FMF / FNMF<br />    8 : CTIP<br />    4 : FFSA<br />Valeur à blanc si pas de module STS<br />utilisé.</td>
    </tr>
    <tr>
      <td>- N° de version<br />du module STS<br />(*)</td>
      <td>96-99</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Ce numéro indique la version du<br />module STS utilisée par le progiciel.</td>
    </tr>
    <tr>
      <td>- Code routage<br />AMC</td>
      <td>100-101</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>A blanc. Zone réservée DRE.</td>
    </tr>
    <tr>
      <td>- identifiant hôte<br />AMC</td>
      <td>102-104</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>A blanc. Zone réservée DRE.</td>
    </tr>
    <tr>
      <td>- Nom de<br />domaine</td>
      <td>105-124</td>
      <td>20</td>
      <td></td>
      <td>F</td>
      <td>A blanc. Zone réservée DRE.</td>
    </tr>
    <tr>
      <td>- indicateur de<br />traitement</td>
      <td>125-126</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>A blanc. Zone réservée DRE.</td>
    </tr>
    <tr>
      <td>- code<br />application AMC</td>
      <td>127-128</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>A blanc. Zone réservée DRE.</td>
    </tr>
  </tbody>
</table>

(*) STS : Services de Tarification Spécifique à une famille d’organismes complémentaires

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 55

# **TYPE 2P : COMPLEMENT FACTURE, INFO OC –**
# **TOUTES NORMES sauf CP, CT et TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 P</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture – informations OC</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur P constante.</td>
    </tr>
    <tr>
      <td>- N° d’opérateur<br />de règlement</td>
      <td>37-46</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée DRE.<br />Renseigné par le PS, dans le cadre<br />d’une convention PS / OC.<br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- Contexte<br />conventionnel<br />AMC</td>
      <td>47-80</td>
      <td>34</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par le PS, en fonction de la<br />demande de l’OC.<br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>81-128</td>
      <td>48</td>
      <td></td>
      <td>F</td>
      <td>Zone certifiée dans la DRE et certifiée<br />en FSE si le type de contrat du type 2<br />est différent de 99.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 56

# **TYPE 2B : COMPLEMENT FACTURE, ADRESSE –**
# **NORME CT ou CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 B</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Adresse du malade</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>A prendre sur l’attestation de droits, la<br />carte Vitale ou la prise en charge. Clé à<br />contrôler après la saisie - annexe 5</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>N° attribué par le partenaire de santé. Il<br />ne doit pas y avoir de numéro en<br />double, durant une période à<br />déterminer avec l’Assurance Maladie</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur B</td>
    </tr>
    <tr>
      <td>-FILLER</td>
      <td>37</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Qualité de<br />bénéficiaire</td>
      <td>38-39</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Valeurs :<br />A : assuré<br />C : conjoint, concubin<br />E : Enfant<br />AA : autres bénéficiaires</td>
    </tr>
    <tr>
      <td>- Code civilité</td>
      <td>40-42</td>
      <td>3</td>
      <td></td>
      <td>O</td>
      <td>Voir annexe 15</td>
    </tr>
    <tr>
      <td>- Nom du<br />bénéficiaire</td>
      <td>43-67</td>
      <td>25</td>
      <td></td>
      <td>O</td>
      <td>Nom d’usage du bénéficiaire des soins.</td>
    </tr>
    <tr>
      <td>- Prénom</td>
      <td>68-82</td>
      <td>15</td>
      <td></td>
      <td>O</td>
      <td>Prénom du bénéficiaire des soins.</td>
    </tr>
    <tr>
      <td>- N° de la voie</td>
      <td>83-86</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Complément N°<br />voie</td>
      <td>87</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Voir annexe 15</td>
    </tr>
    <tr>
      <td>- Type de voie</td>
      <td>88-91</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Voir annexe 14</td>
    </tr>
    <tr>
      <td>- Libellé de la<br />voie</td>
      <td>92-116</td>
      <td>25</td>
      <td></td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>117-128</td>
      <td>12</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 57

# **TYPE 2C : COMPLEMENT FACTURE, ADRESSE et DOM–**
## **NORME CT ou CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 2 C</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Adresse du malade et domiciliation<br />Obligatoire si 2 B présent.</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 2 Début de facture</td>
    </tr>
    <tr>
      <td>- N° du<br />partenaire santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur C</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>37-40</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Complément<br />adresse</td>
      <td>41-65</td>
      <td>25</td>
      <td></td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Commune<br />résidence</td>
      <td>66-90</td>
      <td>25</td>
      <td></td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code postal</td>
      <td>91-95</td>
      <td></td>
      <td>5</td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- Nom de<br />l’assuré</td>
      <td>96-120</td>
      <td>25</td>
      <td></td>
      <td>F</td>
      <td>Nom d’usage de l’assuré,<br />Obligatoire si la qualité de bénéficiaire<br />est différente de « A ».</td>
    </tr>
    <tr>
      <td>- Prénom de<br />l’assuré</td>
      <td>121-128</td>
      <td>8</td>
      <td></td>
      <td>F</td>
      <td>Prénom de l’assuré,<br />Obligatoire si la qualité de bénéficiaire<br />est différente de « A ».</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 58

# **TYPE 3**

## **LIGNE PRESTATIONS**
## **HOSPITALIERES**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 59

# **TYPE 3 : PRESTATIONS HOSPITALIERES -**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 3</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Prestations remboursables à<br />l’établissement</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 3 ligne de facture/prestations<br />hospitalières.</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- clé N°<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang de<br />bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>N° de facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Mode de<br />traitement</td>
      <td>39-40</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire hors séjour GHS et GHT (cf.<br />codification en annexe 13). En cas<br />d’échange (&#x3C; 48h) du patient dans une<br />autre structure de soins, indiquer ici le<br />MT de la structure du lieu d’exécution<br />de l’acte (cf. type 3S, pos. 67-80).<br />A zéro en cas de séjour GHS ou GHT.</td>
    </tr>
    <tr>
      <td>- Discipline de<br />prestations<br />(ex DMT)</td>
      <td>41-43</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Obligatoire hors séjour GHS et GHT.<br />Service où a séjourné le bénéficiaire<br />selon codification communiquée à<br />l’établissement par l’Assurance<br />Maladie. En cas d’échange (&#x3C; 48h), du<br />patient dans une autre structure de<br />soins, indiquer ici la discipline de la<br />structure du lieu d’exécution de l’acte<br />(cf. type 3S, pos. 67-80).<br />A zéro en cas de séjour GHS ou GHT.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 60

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Date début de<br />séjour</td>
      <td>44-49</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Date d’entrée du malade dans le<br />service de facturation, date de soins si<br />cette ligne concerne un acte isolé, date<br />de pose ou de délivrance pour les<br />articles de la LPP et pour la pharmacie.<br />En cas d’actes répétitifs autres que<br />frais de séjour, constituer autant de<br />lignes que d’actes.<br />Si changement de tarif ou d’année<br />civile au cours du séjour : créer autant<br />de lignes que de tarifs en indiquant<br />chaque fois une date début et fin de<br />séjour, excepté pour les actes GHS et<br />EXH (Cf. p17 et annexe 24).</td>
    </tr>
    <tr>
      <td>- date fin de<br />séjour</td>
      <td>50-55</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Pour les frais de séjour – date de sortie<br />du service ou date du dernier jour de<br />facturation de PJ ou date du dernier<br />jour de facturation de GHT.<br />Pour le GHS, date réelle de sortie de<br />l’établissement ou date de transfert.<br />(Cf. Annexe 24).<br /><br /><u>Hors TAA</u> :<br />Pour les prestations forfaitaires,<br />facturables une fois par séjour (ENT,<br />…), indiquer la même date que celle de<br />début de séjour (pos.44-49).<br />Pour les frais d’environnement, indiquer<br />la date de réalisation des actes.<br />Pour les prestations journalières (ex :<br />PHJ, SRA…), indiquer la date de sortie<br />du service ou la date du dernier jour<br />facturé.<br />Pour les prestations forfaitaires<br />hebdomadaires ou mensuelles,<br />indiquer la date de fin de semaine ou<br />de mois, ou la date réelle de fin en cas<br />d’interruption.<br />Pour les prestations sanitaires,<br />facturables une ou plusieurs fois par<br />séjour indiquer la même date que celle<br />de délivrance (pos. 44-49).</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 61

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Code acte</td>
      <td>56-60</td>
      <td>4+1</td>
      <td></td>
      <td>O</td>
      <td>Voir la codification prévue en annexe 10.<br />4 caractères sont réservés au code prestation, cadré à gauche.<br />EX : P J _ _ _, GHS _ _,…<br />Les frais d’hébergement et de soins ne doivent pas être facturés en dehors de la DMT, du GHS ou du GHT pour lesquels ils sont autorisés.<br />Le traitement du forfait journalier est décrit en annexe 16.</td>
    </tr>
    <tr>
      <td>- Quantité d’actes</td>
      <td>61-63</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’actes facturés.<br />Toujours à 1 pour l’acte GHS, la pharmacie et la LPP codées en sus du GHS.</td>
    </tr>
    <tr>
      <td>- Justification d’exonération du Ticket Modérateur au niveau de l’acte</td>
      <td>64</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Permet de gérer par exception un code exonération appliqué à l’acte seul.<br />Tous les codes de l’annexe 9 sont admis.<br />Si la zone est à blanc, c’est le code exonération de la facture (zone 79 du Type 2) qui prévaut. (voir Annexe 9)</td>
    </tr>
    <tr>
      <td>- Coefficient</td>
      <td>65-69</td>
      <td></td>
      <td>3+2</td>
      <td>F</td>
      <td>Hors GHS : Obligatoire pour les frais d’environnement.<br />Pour la prestation GHS, égal à 1 ou au <b><b>coefficient réducteur</b></b> dans les cas suivants :<br />- séjour inférieur au seuil bas<br />- retour dans l’établissement de séjour après transfert temporaire (>48h) dans un autre établissement.<br />Cf. annexe 24.<br />Par défaut, zone renseignée à 1.</td>
    </tr>
    <tr>
      <td>- Code prise en charge du forfait journalier</td>
      <td>70</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire avec l’acte PJ et les modes de traitements 03, 11, 15, 17, 20, 37, 38 ou 39.<br /><br />Obligatoire avec l’acte GHS, sauf lorsque la date début du GHS est égale à la date fin.<br /><br />Cf. annexe 16.<br /><br />Valeur :<br />A = à la charge du malade<br />R = à la charge du régime obligatoire<br />L = à la charge du régime Alsace Moselle.<br /><br />Dans les autres cas, ou en cas de GHT, ou si MT=11 avec DMT exonérante (279 à 301, 559, 590 à 592, 630, 666 à 687, 690), mettre à blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 62

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Coefficient MCO ou HAD pour les établissements privés</td>
      <td>71-75</td>
      <td></td>
      <td>1+4</td>
      <td>F</td>
      <td>Obligatoire en cas de séjour GHS ou GHT : indiquer le coefficient MCO ou HAD de l’établissement sur les prestations GHS et suppléments journaliers, ou GHT. Cf. annexe 24.<br /><br />Pour les établissements non conventionnés, le coefficient MCO intègre la minoration de remboursement.<br /><br />A zéro sinon.</td>
    </tr>
    <tr>
      <td>- Prix unitaire</td>
      <td>76-82</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Prix unitaire de l’acte.<br />Cf. annexes 16 &#x26; 24 pour les actes GHT, GHS et les suppléments journaliers .<br />Cf. annexe 16 pour l’acte PJ.<br /><u>LPP codée en sus du GHS délivrée par un établissement :</u> indiquer la somme des zones « Montant total facturé » (positions 79-85 des types 3F)<br /><u>Pharmacie codée en sus du GHS délivrée par un établissement</u> : indiquer la somme des zones « Montant total facturé » (positions 91-97 des types 3H)</td>
    </tr>
  </tbody>
</table>

**Supprimé : ¶**
Pour les facturations de FSO et ARE antérieures au démarrage de la TAA, cette zone se lit en format 3+2, coefficient de modulation du PU.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 63

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Base de<br />remboursement</td>
      <td>83-90</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Il constitue la base de remboursement<br />pour la Caisse. (quantité x coefficient<br />(pos.65-69) x prix unitaire).<br />Pour les séjours GHS ou GHT :<br />[ (PU du GHS, du GHT ou du<br />supplément journalier) x Qté x Coeff.] x<br />coeff. MCO (pos. 71-75). Calcul de<br />l’arrondi en annexe 11.<br /><u>LPP codée en sus du GHS délivrée par</u><br /><u>un établissement</u> : idem prix unitaire<br /><u>Pharmacie codée en sus du GHS</u><br /><u>délivrée par un établissement</u> : idem<br />prix unitaire</td>
    </tr>
    <tr>
      <td>- Taux applicable<br />à la prestation</td>
      <td>91-93</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Taux applicable à la prestation compte<br />tenu de l’exonération éventuelle (cf.<br />annexe 9)<br />- 100% pour les produits sanguins,<br />- ou celui (100%) qui résulte de<br />l’intervention chirurgicale K50, de<br />l’exonération CCAM ou de<br />la durée d’hospitalisation > 30<br />jours,<br />- ou celui (100%) qui résulte du<br />passage en maladie de longue<br />durée en cours d’hospitalisation.<br />- 100% pour les prestations relatives<br />à un accident du travail<br />- 100% pour les forfaits techniques :<br />examens de scanographie, IRMN,<br />etc...<br />Le taux est renseigné de façon<br />standard, indépendamment de la<br />situation au regard du parcours de<br />soins.<br />A zéro dans certains cas, cf. annexe 6.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 64

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2"><b>INFORMATIONS</b></th>
      <th rowspan="2"><b>POSITIONS</b></th>
      <th colspan="2"><b><u>LONGUEUR</u></b></th>
      <th rowspan="2"><b>PRESENCE</b></th>
      <th><b><b>CONSIGNES DE SAISIE</b></b></th>
    </tr>
    <tr>
      <th><b>A</b></th>
      <th><b>N</b></th>
      <th><b><b>DES RUBRIQUES</b></b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant remboursable par la caisse</td>
      <td>94-101</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Résultat de l’opération :<br />=Base de remboursement x taux de participation<br />(Cf. annexe 16 pour l’acte PJ)<br />(Cf. annexe 24 pour l’acte GHS et GHT)<br /><br />Participation assuré plafonnée :<br /><br />Pour les actes PJ, GHS et GHT, si le code participation assuré (pos. 117), prend la valeur « A », alors déduire du montant remboursable AMO la valeur du montant de la participation assuré plafonné.<br /><br /><u>Pharmacie ou LPP en sus du GHS délivrée par un établissement, résultat de l’opération :</u><br />Base de remboursement x taux de participation <b><b>x taux de financement</b>.</b><br />Cf. règle d’arrondi en annexe 11, 7°).</td>
    </tr>
    <tr>
      <td>- Montant total de la dépense</td>
      <td>102-109</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Montant total de la dépense, dépassement compris (chambre particulière, ...).</td>
    </tr>
    <tr>
      <td>- N° de GHS ou n° de GHT</td>
      <td>110-113</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Obligatoire en séjour GHS ou GHT. Indiquer le n° de GHS, dans lequel le patient a séjourné, fourni par le PMSI, sur le GHS et les suppléments journaliers.<br />Indiquer le n° de GHT, relatif à la prise en charge HAD, sur le GHT.<br />Hors GHS et GHT : à zéro.</td>
    </tr>
    <tr>
      <td>- Taux de financement</td>
      <td>114-116</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Obligatoire dans le cas de pharmacie ou de LPP <u>en sus du GHS</u> délivrée par un établissement privé, dans le cadre des contrats de bon usage du médicament.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 65

# **TYPE 3 : PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Code<br />participation<br />assuré</td>
      <td>117</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire avec l’acte PJ, GHS et<br />GHT, lorsque le séjour est exonéré au<br />titre du dépassement du seuil de 91€.<br /><br />Cf. annexe 24.<br />Valeur :<br />A = à la charge de l’Assuré, ou pris en<br />charge par la CMUC ou un organisme<br />complémentaire.<br />L = à la charge du régime Alsace<br />Moselle.<br /><u>R = à la charge du régime (SNCF).</u></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>118-119</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Qualificatif de la<br />dépense</td>
      <td>120</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Annexe 12.<br />Obligatoire si acte non remboursable<br />ou pris en charge totalement par l’Etat<br />ou forfaits complémentaires dans le<br />cadre de la CMU (voir annexe 6).</td>
    </tr>
    <tr>
      <td>- Domaine court<br />séjour</td>
      <td>121</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire si n° GHS renseigné,<br />valeurs : M, C ou O.<br /><br />Obligatoire si n° GHT renseigné, valeur<br />« D ».<br /><br />Sinon à Blanc</td>
    </tr>
    <tr>
      <td>- Montant<br />remboursable<br />par l’organisme<br />complémentaire</td>
      <td>122-128</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire si un organisme<br />complémentaire est désigné dans le<br />type 2.<br /><u>LPP ou pharmacie en sus du GHS<br />délivrée par un établissement :</u><br />A zéro, en cas de prise en charge à<br />100% par l’AMO, indépendamment de<br />la valeur du taux de financement. <u>Il n’y<br />a pas de reste à charge de l’assuré si<br />l’établissement n’a pas respecté le<br />contrat de bon usage du médicament.</u></td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 66

# **TYPE 3S : SUITE PRESTATIONS HOSPITALIERES -**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 3 S</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Prestations remboursables à<br />l’établissement – Suite</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 3 ligne de facture/prestations<br />hospitalières – Suite.</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang de<br />bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>39</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur S constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>40-41</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- N° Prescripteur</td>
      <td>42-50</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Obligatoire si présence de pharmacie,<br />d’une prestation de la LPP, de produits<br />sanguins ou d’origine humaine.</td>
    </tr>
    <tr>
      <td>- Condition<br />d’exercice du<br />prescripteur</td>
      <td>51</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si le prescripteur agit en tant<br />que libéral « L », que salarié « S » ou<br />que bénévole « B ».</td>
    </tr>
    <tr>
      <td>- Spécialité du<br />prescripteur<br />salarié</td>
      <td>52-53</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Indiquer la spécialité du prescripteur<br />salarié ou hors région.</td>
    </tr>
    <tr>
      <td>- Date de<br />Prescription</td>
      <td>54-59</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Indiquer la date de prescription de la<br />pharmacie, des articles de la LPP, de<br />produits sanguins ou d’origine humaine.</td>
    </tr>
    <tr>
      <td>- Date de la<br />demande<br />d’accord<br />préalable</td>
      <td>60-65</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Facultatif si le code accord préalable<br />à 9. Obligatoire avec les autres codes.<br />Indiquer la date (AAMMJJ) pour chaque<br />demande d’accord préalable adressée<br />à l’organisme d’Assurance Maladie.</td>
    </tr>
    <tr>
      <td>- Code accord<br />préalable</td>
      <td>66</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 : pas de réponse de la caisse dans le<br />délai réglementaire<br />4 : réponse favorable<br />5 : notion d’urgence<br />9 : acte non soumis à accord préalable.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 67

# **TYPE 3S : SUITE PRESTATIONS HOSPITALIERES – NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Etablissement<br />de Transfert ou<br />de retour<br /><br />ou<br /><br />Lieu d’exécution<br />de l’acte</td>
      <td>67-80</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Obligatoire dès lors que la nature d’interruption est renseignée à E, R ou T.<br /><strong><b>En GHS :</b></strong><br />Permet de renseigner le lieu dans lequel le patient a été transféré, dès lors que ce lieu est identifié avec un n° FINESS (ex : Envoi vers un autre plateau technique E, Transfert vers un autre établissement T, Retour d’un autre établissement R)<br /><br /><mark><u>En GHT :</u></mark><br /><mark><u>Obligatoire dès lors que le patient réside en EHPA(D).</u></mark><br />A zéro sinon.</td>
    </tr>
    <tr>
      <td>- Nature<br />d’interruption ou<br />de fin de séjour</td>
      <td>81</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire en GHS : Cf. annexe 24.<br />⮚ Si transfert d’établissement pendant le séjour, indiquer sur l’acte GHS :<br />    - pour une durée > 48h : indiquer « <strong>T</strong> » (<strong>T</strong>ransfert) en relation avec le N° FINESS de l’établissement destinataire (pos. 67-80). Indiquer « <strong>R</strong> » (<strong>R</strong>etour) si le patient revient dans l’établissement d’origine, le N° FINESS de l’établissement de transfert figure en (pos. 67-80).<br />    - pour une durée &#x3C; 48h indiquer « <strong>E</strong> » (<strong>E</strong>change plateaux techniques) en relation avec le N° FINESS de l’établissement destinataire en (pos. 67-80).<br />⮚ Indiquer « <strong>P</strong> », pour <strong>P</strong>résent en cas de changement de discipline au sein d’un même établissement.<br />⮚ Indiquer « <strong>S</strong> », en cas de <strong>S</strong>ortie définitive ou « <strong>D</strong> » en cas de <strong>D</strong>écès.<br /><br />En GHT <mark><u>- Hospitalisation à domicile :</u></mark><br /><mark><u>⮚ Valeur « <strong>H</strong> » obligatoire s’il y a minoration du prix unitaire du GHT, cas de convention entre l’EHPA(D) et la structure d’HAD.</u></mark><br /><mark><u>⮚ A blanc sinon.</u></mark><br /><br /><br />Hors TAA : Indiquer sur l’acte PJ, « <strong>S</strong> », en cas de Sortie définitive, ou « <strong>D</strong> » en cas de <strong>D</strong>écès.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 68

# **TYPE 3S : SUITE PRESTATIONS HOSPITALIERES –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Identification de la filière ou du réseau</td>
      <td>82-95</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Permet de renseigner la relation d’appartenance du bénéficiaire à une filière ou un réseau dans lequel l’acte a été effectué.</td>
    </tr>
    <tr>
      <td>- N° d’ordre du forfait technique</td>
      <td>96-100</td>
      <td></td>
      <td>5</td>
      <td>F</td>
      <td>N° d’ordre du forfait technique.</td>
    </tr>
    <tr>
      <td>- N° de l’appareil</td>
      <td>101-114</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>N° de l’appareil sur lequel l’acte technique a été réalisé.</td>
    </tr>
    <tr>
      <td>- Origine de la prescription</td>
      <td>115</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Pour les prestations prescrites :<br /><br />Cf. annexe 25.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>116-128</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 69

# **TYPE 3E : SUITE PRESTATIONS HOSPITALIERES - NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 3 E</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Prestations remboursables à l’établissement – Extension du type 3</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 3 lignes de facture/prestations hospitalières – Suite.</td>
    </tr>
    <tr>
      <td>- N° partenaire de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang de bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de type</td>
      <td>39</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur E constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>40-41</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- Identifiant RPPS du prescripteur</td>
      <td>42-52</td>
      <td></td>
      <td><u>11</u></td>
      <td>F</td>
      <td>A renseigner avec le n° RPPS du prescripteur.</td>
    </tr>
    <tr>
      <td>- N° de la structure dans laquelle le PS a prescrit</td>
      <td>53-66</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>A renseigner avec le n° SIRET ou le n° FINESS de la structure.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>67-128</td>
      <td>62</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

Supprimé : 11

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 70

# **TYPE 3F : CODAGE LPP –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 3 F</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td><strong><b>Détail des articles de la LPP - TAA</b></strong></td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 3 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur F</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé SESAM</td>
      <td>39-42</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>Renseigné par module de sécurité SESAM.</td>
    </tr>
    <tr>
      <td>- Code référence LPP</td>
      <td>43-55</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Code de l’article de la LPP.<br />7 caractères utiles <strong><b>cadrés à gauche</b></strong>, complétés par des blancs.</td>
    </tr>
    <tr>
      <td>- N° SIRET du fabricant ou de l’importateur</td>
      <td>56-69</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>« Fabricant » au sens des articles L665 et R665 du code de la santé publique.</td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>70-71</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Indiquer le nombre d’articles identiques.</td>
    </tr>
    <tr>
      <td>- Tarif référence LPP ou Prix Unitaire sur devis</td>
      <td>72-78</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le « tarif de référence » de l’article LPP ou le « Prix Unitaire sur devis » en cas de délivrance d’articles sur devis.</td>
    </tr>
    <tr>
      <td>- Montant total facturé</td>
      <td>79-85</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le montant total facturé pour cet article :<br />prix unitaire x quantité (pos. 70-71).<br />Le prix unitaire correspond au prix de vente pratiqué par l’établissement.<br />En cas d’article sur devis, le prix unitaire se trouve en position 72-78.<br />En cas de facturation d’un écart LPP indemnisable, le prix unitaire se trouve en position 86-92.</td>
    </tr>
    <tr>
      <td>- Prix d’achat unitaire</td>
      <td>86-92</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire en cas de facturation par l’établissement d’un écart LPP indemnisable :<br />Prix d’achat unitaire TTC.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 71

# **TYPE 3F : CODAGE LPP –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant unitaire<br />de l’écart<br />indemnisable</td>
      <td>93-99</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire en cas de facturation par<br />l’établissement d’un écart LPP<br />indemnisable.<br /><br />Indiquer le montant unitaire de la<br />rétribution suite à ristourne obtenue sur<br />le tarif de référence :<br />(Tarif de référence – prix d’achat<br />unitaire) x pourcentage fixé par arrêté.</td>
    </tr>
    <tr>
      <td>- Montant total de<br />l’écart<br />indemnisable</td>
      <td>100-106</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire en cas de facturation par<br />l’établissement d’un écart LPP<br />indemnisable.<br /><br />Le montant total de l’écart indemnisable<br />est égal à :<br />Montant unitaire de l’écart indemnisable<br />x quantité.<br />Ce montant n’intervient pas dans le<br />montant total facturé (pos. 79-85).</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>107-128</td>
      <td>22</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 72

# **TYPE 3H : CODAGE PHARMACIE HOSPITALIERE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 3H</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td><strong><b>Détail des médicaments hospitaliers</b><br /><b>– TAA</b></strong></td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 3 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2 CP pos. 30-38</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur H</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné ultérieurement par le<br />module de sécurité SESAM.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>43-48</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Code UCD</td>
      <td>49-55</td>
      <td></td>
      <td>7</td>
      <td>O</td>
      <td>Code UCD associé à une nature de<br />prestation PH8, pour les médicaments<br />délivrables en sus du GHS.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>56</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Coefficient de<br />fractionnement</td>
      <td>57-61</td>
      <td></td>
      <td>1+4</td>
      <td>O</td>
      <td>Le coefficient de fractionnement indique<br />la fraction délivrée par rapport à l’unité<br />de facturation. Il est inférieur ou égal à<br />1.<br /><br />Exemple : pour la délivrance du 1/3<br />d’un conditionnement donné, le<br />coefficient de fractionnement est égal à<br />03333.<br /><br />Si le coefficient de fractionnement est<br />strictement inférieur à 1, alors la<br />quantité doit être égale à 1.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>62-66</td>
      <td>5</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 73

# **TYPE 3H : CODAGE PHARMACIE HOSPITALIERE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Prix d’achat unitaire TTC</td>
      <td>67-73</td>
      <td></td>
      <td>5+2</td>
      <td><u>O</u></td>
      <td>Prix d’achat unitaire TTC <u>négocié</u> par l’établissement <u>en cas de facturation d’un écart indemnisable ou tarif de responsabilité publié au JO.</u></td>
    </tr>
    <tr>
      <td>- Montant unitaire de l’écart indemnisable</td>
      <td>74-80</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Indiquer le montant unitaire de la rétribution suite à ristourne obtenue sur le tarif de responsabilité :<br />(Tarif de responsabilité TTC – prix d’achat TTC) x pourcentage fixé par arrêté.</td>
    </tr>
    <tr>
      <td>- Montant total de l’écart indemnisable</td>
      <td>81-87</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Le montant total de l’écart indemnisable est égal à :<br />Montant unitaire de l’écart indemnisable x quantité x coefficient de fractionnement.<br />Ce montant n’intervient pas dans le montant total facturé (pos. 91-97).</td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>88-90</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’unités délivrées, par défaut égal à 1.<br />Si le nombre d’unités délivrées est supérieur à 1, alors le coefficient de fractionnement doit être égal à 1.</td>
    </tr>
    <tr>
      <td>- Montant total facturé TTC</td>
      <td>91-97</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Le montant total facturé TTC est égal à<br />prix d’achat unitaire TTC x quantité x coefficient de fractionnement</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>98-128</td>
      <td>31</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>
Supprimé : F
Supprimé : avec un code UCD

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 74

# **TYPE 4**

## **LIGNE ACTE**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 75

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Prestations réglées au partenaire de santé ou à l’assuré</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeur A si le type 4 est suivi d’un type 4S, 4E ou d’un type transportant une codification affinée (4B, 4<s>P</s><u>P</u>, 4D, 4E, 4F, 4M, 4T, 4U). Supprimé : C,</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Toujours à zéro.</td>
    </tr>
    <tr>
      <td>- Mode de traitement</td>
      <td>39-40</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><u>Actes d’imagerie médicale</u> :<br />(Scanner, IRMN) valeur 19<br /><u>Centres thermaux</u> :<br />cf. annexe 13<br /><u>Autres cas</u> :<br />valeur 0 (zéro)</td>
    </tr>
    <tr>
      <td>- Discipline de prestations (ex DMT)</td>
      <td>41-43</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td><u>Actes d’imagerie médicale</u> :<br />(Scanner, IRMN)<br />valeurs 035 : Scanner<br />753 : IRMN<br /><u>Centres thermaux</u> :<br />Service où a séjourné le bénéficiaire selon codification communiquée à l’établissement par l’Assurance Maladie.<br /><u>Autres cas</u> :<br />valeur 0 (zéro)</td>
    </tr>
    <tr>
      <td>- Date de la demande d’accord préalable ou date d’accord de prise en charge CMU.</td>
      <td>44-49</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Facultatif si le code accord préalable à 9. Obligatoire avec les autres codes. Indiquer la date (AAMMJJ) pour chaque demande d’accord préalable adressée à l’organisme d’Assurance Maladie.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 76

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Code accord préalable</td>
      <td>50</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 : pas de réponse de la caisse dans le délai réglementaire<br />4 : réponse favorable<br />5 : notion d’urgence<br />9 : acte non soumis à accord préalable.</td>
    </tr>
    <tr>
      <td>- Séquence de renouvellement</td>
      <td>51-52</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Pour les remboursements de pharmacie et de biologie, indiquer le n° d’ordre du renouvellement (01,02,...)</td>
    </tr>
    <tr>
      <td>- Code participation assuré</td>
      <td>53</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire avec l’acte qui déclenche l’exonération au titre du dépassement du seuil de 91€. Lorsqu’il s’agit d’un ensemble d’actes, ne renseigner le code que sur l’acte de plus forte base de remboursement.<br />Valeur :<br />A = à la charge de l’Assuré, ou pris en charge par la CMUC ou un organisme complémentaire.<br />L = à la charge du régime Alsace Moselle.<br /><u>R = à la charge du régime (SNCF).</u></td>
    </tr>
    <tr>
      <td>Justification d’exonération du Ticket Modérateur au niveau de l’acte</td>
      <td>54</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Permet de gérer par exception un code exonération appliqué à l’acte seul.<br />Tous les codes de l’annexe 9 sont admis.<br />Si la zone est à blanc, c’est le code exonération de la facture (zone 79 du Type 2) qui prévaut. (Voir annexe 9)</td>
    </tr>
    <tr>
      <td>- N° exécutant + clé ayant effectué l’acte ou fourni le produit</td>
      <td>55-63</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td><strong><b>Cas Particuliers</b> :</strong><br /><u>Laboratoires</u> :<br />N° d’identification du laboratoire ayant effectué l’acte<br /><u>Actes d’imagerie médicale</u> :<br />N° d’identification de l’exécutant de l’acte lorsqu’il s’agit d’un acte de radiologie ou numéro de la structure pour les forfaits techniques ( scanner - IRMN )<br /><u>Centres thermaux</u> :<br />N° du médecin qui surveille la cure ou N° de l’établissement</td>
    </tr>
    <tr>
      <td>- Zone tarif de l’exécutant</td>
      <td>64-65</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire s’il s’agit d’un salarié de l’exécutant (indiquer la zone tarif du salarié)<br />(Voir Annexe 21).</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 77

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Spécialité de l’exécutant</td>
      <td>66-67</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire s’il s’agit d’un salarié de l’exécutant (indiquer la spécialité du salarié)</td>
    </tr>
    <tr>
      <td>- Date de l’acte, de la délivrance du produit</td>
      <td>68-73</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>AAMMJJ<br /><u>LPP</u> : date de délivrance du produit ou date début de location.<br /><u>Actes dentaires</u> : date de fin des soins.</td>
    </tr>
    <tr>
      <td>- Code acte</td>
      <td>74-78</td>
      <td>5</td>
      <td></td>
      <td>O</td>
      <td>Cadrage à gauche suivi de blanc et éventuellement d’un code complémentaire en position 78 (Voir annexe 10)<br />Ex : C_ _ _ N<br />            Acte effectué la nuit.</td>
    </tr>
    <tr>
      <td>- Quantité d’actes</td>
      <td>79-80</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><u>IK</u> : indiquer le nombre de kilomètres facturés par séance de soins et après abattement<br />CCAM : Valeur 1.<br /><u>Auxiliaires médicaux</u> :voir exemples § 27.51.<br /><u>Autres cas</u> : Valeur 1.<br />Une valeur > 1 peut être acceptée si au cours d’une même journée, un acte identique (même coefficient, même lettre clé, même code complément d’acte) prescrit par un même prescripteur a été réalisé par un même exécutant.</td>
    </tr>
    <tr>
      <td>- Coefficient</td>
      <td>81-86</td>
      <td></td>
      <td>4+2</td>
      <td>O</td>
      <td>Coefficient de l’acte.<br />CCAM : Valeur 1.</td>
    </tr>
    <tr>
      <td>- Dénombrement</td>
      <td>87-88</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><u>Transports</u> : nombre de transports facturés.<br /><u>Actes de Radiothérapie</u> (§ 27.58)<br /><u>CCAM</u> : Valeur 1.<br /><u>Actes de Biologie</u> : si codage affiné, indiquer le nombre de codes détail.<br /><u>Auxiliaires médicaux</u> : voir exemples § 27.51.<br /><u>LPP</u> : nombre de types 4F.<br /><u>Autres cas</u> : valeur égale à la quantité sauf pour les IK = 1.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 78

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Prix unitaire</td>
      <td>89-95</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le montant, en centimes, de l’unité tarifaire (lettre clé) au tarif conventionnel.<br />
        <u>CCAM</u> : Valeur unitaire de l’acte.<br />
        <u>Centres Thermaux</u> :<br />
        Dans le cas d’un forfait réduit, indiquer le montant réduit du forfait<br />
        <u>Transport</u> : indiquer le montant total de la facture.<br />
        <s>Pharmaciens : indiquer le résultat le l’opération :<br />
        quantité (pos. 74-75) x PU (pos. 76-82) du type 4P<br />
        <u>ou en cas de déconditionnement :</u> quantité d’unités (pos. 84-86) x PU de l’unité (pos. 87-93) du type 4P.</s><br />
        <u>Fournisseurs, pharmaciens, <mark>pédicures et centres de santé</mark></u> : indiquer le total des montants de la LPP (positions 105-111 des types 4F)</td>
    </tr>
    <tr>
      <td>- Base de remboursement</td>
      <td>96-102</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Base de remboursement de l’Assurance Maladie = (quantité x coefficient x prix unitaire) + majoration de nuit ou de férié<br />
        <u>CCAM</u> : Valeur unitaire de l’acte, après application éventuelle des modificateurs, des règles d’association et du supplément de charge. (Cf. annexe 11-7°)<br />
        <u>Transports</u> : Base globale de remboursement.<br />
        <u>LPP codée</u>: idem prix unitaire.<br />
        <u>Pharmacie codée</u>: idem prix unitaire.</td>
    </tr>
    <tr>
      <td>- Taux applicable à la prestation</td>
      <td>103-105</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Taux applicable à la prestation compte tenu de l’exonération éventuelle (Cf. justification d’exo.- annexe 9).<br /><br />
        100% pour les prestations relatives à un AT.<br /><br />
        Le taux est renseigné de façon standard, indépendamment de la situation au regard du parcours de soins.<br /><br />
        A zéro dans certains cas, cf. annexe 6.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 79

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant remboursable par l’organisme d’Assurance Maladie</td>
      <td>106-112</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td><u>Dans le parcours de soins ou dans les situations non concernées par le parcours de soins</u> :<br />= Base de remboursement (BR) x Taux applicable à la prestation.<br /><br /><u>Hors parcours de soins :</u><br />= (BR x taux applicable à la prestation) – reste à charge assuré<br /><br /><i>Reste à charge assuré :</i><br />= minimum entre (BR x taux majoration du ticket modérateur) et (plafond).<br /><br /><i>Valeur du plafond :</i><br />= Tarif conventionnel de la consultation de spécialiste au cabinet <sup>(1)</sup> x taux majoration du ticket modérateur.<br /><br /><sup>(1)</sup> au 1<sup>er</sup> janvier 2006, CS+MPC<br /><br />Participation assuré plafonnée :<br /><br />Si le code participation assuré (pos. 53), prend la valeur « A », alors déduire du montant remboursable AMO la valeur du montant de la participation assuré plafonné.</td>
    </tr>
    <tr>
      <td>- Montant des honoraires ou de la dépense (dépassement compris ou après remise pour la norme FR)</td>
      <td>113-119</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le montant total des honoraires demandés par le partenaire de santé, dépassements compris, quel que soit le motif du dépassement.<br /><u>Transports</u> : Montant total de la facture de transport.<br /><u>Fournisseurs, pharmaciens, pédicures et centres de santé</u> : Indiquer le montant total de la facture après remise éventuelle. (Total des Positions 112-118 des types 4F)</td>
    </tr>
    <tr>
      <td>- Qualificatif de la dépense</td>
      <td>120</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Annexe 12.<br />Obligatoire s’il y a dépassement (sauf honoraires libres),<br />ou acte gratuit, non remboursable, pris en charge totalement par l’Etat, TM ou forfaits complémentaires dans le cadre de la CMU (voir annexe 6).</td>
    </tr>
    <tr>
      <td>- Code lieu</td>
      <td>121</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Indiquer :<br />0 si actes effectués au cabinet du partenaire de santé<br />1 si actes effectués au domicile du malade.<br /><u>Transports</u> : Valeur 1</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 80

# **TYPE 4 : LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant<br />remboursable<br />par l’organisme<br />complémentaire</td>
      <td>122-128</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire en Tiers Payant.<br />Obligatoire en Hors Tiers Payant pour<br />toutes les prestations sanitaires autres<br />que les honoraires.<br />Obligatoire si un organisme<br />complémentaire est désigné dans le<br />type 2.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 81

# **TYPE 4 : LIGNE ACTE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Honoraires réglés au praticien au mandataire des praticiens ou à la clinique s’il s’agit de soins externes en établissement public.</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 ligne de facture/honoraires</td>
    </tr>
    <tr>
      <td>- N° partenaire de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang de bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Mode de traitement</td>
      <td>39-40</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire hors séjour GHS et GHT.<br />Idem type 3 sauf pour les forfaits techniques : (scanner, IRMN, etc...)<br />En cas de réalisation de l’acte dans une autre structure, indiquer ici le MT de la structure du lieu d’exécution de l’acte (cf. type 4S norme CP, pos. 72-85).A zéro en cas de séjour GHS ou GHT.</td>
    </tr>
    <tr>
      <td>- Discipline de prestations (ex DMT)</td>
      <td>41-43</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Obligatoire hors séjour GHS et GHT.<br />Idem type 3 sauf pour les forfaits techniques : (scanner, IRMN, etc...)<br />En cas de réalisation de l’acte dans une autre structure, indiquer ici la discipline de la structure du lieu d’exécution de l’acte (cf. type 4S norme CP, pos. 72-85)<br />A zéro en cas de séjour GHS ou GHT.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 82

# **TYPE 4 : LIGNE ACTE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- N° de<br />prescripteur + clé</td>
      <td>44-52</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Interdit si la catégorie de l’exécutant est<br />1, 4 ou 5, (médecin, chirurgien-dentiste<br />ou sage-femme). Clé à contrôler après<br />saisie - annexe 5 - Obligatoire dans les<br />autres cas.</td>
    </tr>
    <tr>
      <td>- Origine de la<br />prescription</td>
      <td>53</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Pour les actes prescrits :<br />Cf. annexe 25.</td>
    </tr>
    <tr>
      <td>Justification<br />d’exonération du<br />Ticket<br />Modérateur au<br />niveau de l’acte</td>
      <td>54</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Permet de gérer par exception un code<br />exonération appliqué à l’acte seul.<br />Tous les codes de l’annexe 9 sont<br />admis.<br />Si la zone est à blanc, c’est le code exo<br />de la facture (zone 79 du Type 2) qui<br />prévaut. (Voir annexe 9)</td>
    </tr>
    <tr>
      <td>- Spécialité du<br />prescripteur</td>
      <td>55-56</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Facultatif, mais obligatoire pour les<br />prescripteurs salariés.</td>
    </tr>
    <tr>
      <td>- N° exécutant +<br />clé</td>
      <td>57-65</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>N° d’identification du médecin ou de<br />l’auxiliaire ou de la structure de soins<br />ayant effectué l’acte.<br />Clé à contrôler après saisie cf annexe 5</td>
    </tr>
    <tr>
      <td>- Zone tarif<br />exécutant</td>
      <td>66-67</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td rowspan="2">Obligatoire s’il s’agit d’un salarié de<br />l’exécutant (indiquer la zone tarif et<br />la spécialité du salarié), ou s’il s’agit de<br />soins externes en établissement public.<br />(Voir Annexe 21 pour la Zone Tarif).</td>
    </tr>
    <tr>
      <td>- Spécialité<br />Exécutant</td>
      <td>68-69</td>
      <td></td>
      <td>2</td>
      <td>F</td>
    </tr>
    <tr>
      <td>- Date des soins</td>
      <td>70-75</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Date de l’acte ou date de délivrance du<br />médicament.</td>
    </tr>
    <tr>
      <td>- Code acte</td>
      <td>76-80</td>
      <td>4+1</td>
      <td></td>
      <td>O</td>
      <td>Même consigne que pour la position<br />56-60 du type 3.</td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>81-82</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><u>IK</u> : indiquer le nombre de kilomètres<br />facturés par séance de soins et après<br />abattement<br /><u>CCAM</u> : Valeur 1.<br /><u>Auxiliaires médicaux</u> :<br />voir exemples § 27.51.<br /><u>Autres cas</u> : Valeur 1. Une valeur > 1<br />peut être acceptée si au cours d’une<br />même journée, un acte identique<br />(même coefficient, même lettre clé,<br />même code complément d’acte)<br />prescrit par un même prescripteur a été<br />réalisé par un même exécutant.</td>
    </tr>
    <tr>
      <td>- Coefficient</td>
      <td>83-88</td>
      <td></td>
      <td>4+2</td>
      <td>O</td>
      <td>Coefficient de l’acte.<br />CCAM : Valeur 1.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 83

# **TYPE 4 : LIGNE ACTE – NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Dénombrement</td>
      <td>89-90</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><u>Transports</u> : nombre de transports<br />facturés.<br /><u>Actes de Radiothérapie</u> (§ 27.588)<br />CCAM : Valeur 1.<br /><u>Actes de Biologie</u> : si codage affiné,<br />indiquer le nombre de codes détail.<br /><u>Auxiliaires médicaux</u> :<br />voir exemples § 27.51.<br />Pharmacie rétrocédée : valeur 1.<br /><u>Autres cas</u> : valeur égale à la quantité<br />sauf pour les IK = 1.</td>
    </tr>
    <tr>
      <td>- Prix unitaire</td>
      <td>91-97</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le montant en centimes de<br />l’unité tarifaire (lettre clé) au tarif<br />conventionnel.<br /><u>CCAM</u> : Valeur unitaire de l’acte.<br /><br /><u>Pharmacie délivrée par un</u><br /><u>établissement</u> : indiquer la somme des<br />zones « Montant total facturé »<br />(positions 91-97 des types 4H)</td>
    </tr>
    <tr>
      <td>- Base de<br />remboursement</td>
      <td>98-104</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Idem type 3<br /><u>CCAM</u> : Valeur unitaire de l’acte, après<br />application éventuelle des<br />modificateurs et des règles<br />d’association. (Cf. annexe 11-7°)<br /><br /><u>Pharmacie délivrée par un</u><br /><u>établissement</u> : idem prix unitaire.</td>
    </tr>
    <tr>
      <td>- Taux applicable<br />à la prestation-</td>
      <td>105-107</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 3<br /><br />Le taux est renseigné de façon<br />standard, indépendamment de la<br />situation au regard du parcours de<br />soins.</td>
    </tr>
    <tr>
      <td>- Montant<br />remboursable<br />par l’organisme<br />d’Assurance<br />Maladie<br />Obligatoire</td>
      <td>108-114</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td><u>Dans le parcours de soins ou dans les</u><br /><u>situations non concernées par le</u><br /><u>parcours de soins:</u><br />    = Base de remboursement (BR)<br />    x Taux applicable à la prestation.<br /><br /><u>Hors parcours de soins :</u><br />= (BR x taux applicable à la prestation)<br />        – reste à charge assuré</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 84

# **TYPE 4 : LIGNE ACTE – NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant<br />remboursable<br />par l’organisme<br />d’Assurance<br />Maladie<br />Obligatoire<br /><i>(Suite)</i></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td><u><i>Reste à charge assuré</i></u> :<br />= minimum entre (BR x taux majoration<br />du ticket modérateur) et (plafond).<br /><br /><i>Valeur du plafond</i> :<br />= Tarif conventionnel de la consultation<br />de spécialiste au cabinet <sup>(1)</sup> x taux<br />majoration du ticket modérateur.<br /><br /><sup>(1)</sup> au 1<sup>er</sup> janvier 2006, CS+MPC<br /><br /><u>Participation assuré plafonnée :</u><br /><br />Si le code participation assuré (pos.<br />128 du type 4S norme CP), prend la<br />valeur « A », alors déduire du montant<br />remboursable AMO la valeur du<br />montant de la participation assuré<br />plafonné.</td>
    </tr>
    <tr>
      <td>- Montant des<br />honoraires<br />(dépassement<br />compris)</td>
      <td>115-121</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Montant des honoraires demandés par<br />le partenaire de santé, dépassement<br />compris, quel que soit le motif du<br />dépassement.</td>
    </tr>
    <tr>
      <td>- Qualificatif de la<br />dépense</td>
      <td>122</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Annexe 12.<br />Obligatoire s’il y a dépassement (sauf<br />honoraires libres),<br />ou acte non remboursable ou pris en<br />charge totalement par l’Etat TM ou<br />forfaits complémentaires dans le cadre<br />de la CMU ou actes transmis pour<br />information (voir annexe 6).</td>
    </tr>
    <tr>
      <td>- Montant<br />remboursable<br />par l’organisme<br />complémentaire</td>
      <td>123-128</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Obligatoire si un organisme<br />complémentaire est désigné dans le<br />type 2.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 85

# **TYPE 4S : SUITE LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 S</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 ligne de facture - Suite</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur S constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- Condition<br />d’exercice de<br />l’exécutant</td>
      <td>39</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si l’exécutant agit en tant que<br />libéral « L », que salarié « S » ou que<br />bénévole « B ».</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>40</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Base de<br />remboursement<br />théorique</td>
      <td>41-47</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Permet de renseigner la base de<br />remboursement théorique (égale au<br />tarif conventionnel) d’un acte CCAM,<br />avant application du tarif non<br />conventionné.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>48</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Montant de la<br />majoration du<br />ticket modérateur<br />restant à charge<br />de l’assuré</td>
      <td>49-55</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire pour les médecins dans les<br />situations hors parcours de soins :<br /><br />= reste à charge assuré, cf. montant<br />remboursable AMO (type 4 toutes<br />normes sauf CP pos.106-112)</td>
    </tr>
    <tr>
      <td>- N° de<br />remplaçant</td>
      <td>56-64</td>
      <td>9</td>
      <td></td>
      <td>F</td>
      <td>Indiquer, s’il existe, le n° d’identification<br />de l’exécutant remplaçant.</td>
    </tr>
    <tr>
      <td>- Complément au<br />n° de remplaçant</td>
      <td>65-70</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Complément au n° de remplaçant, s’il<br />ne s’agit pas d’un numéro ADELI.</td>
    </tr>
    <tr>
      <td>- Indicateur de<br />forçage de la<br />tarification de la<br />part AMO</td>
      <td>71</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>zone réservée SESAM<br />Blanc : pas de forçage<br />Autres valeurs : forçage d’une<br />information applicable à la ligne de<br />prestation, qui peut lever la garantie de<br />paiement.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 86

# **TYPE 4S : SUITE LIGNE ACTE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Lieu<br />d’exécution de<br />l’acte</td>
      <td>72-85</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Permet de renseigner le lieu dans lequel l’acte a été effectué, dès lors que ce lieu est identifié avec un n° FINESS (structure de soins, maison de retraite,…).<br />En normes IF, MK et ER : obligatoire dès lors que les actes ne sont pas effectués au cabinet.</td>
    </tr>
    <tr>
      <td>- Identification de<br />la filière ou du<br />réseau</td>
      <td>86-99</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Permet de renseigner la relation d’appartenance du bénéficiaire à une filière ou un réseau dans lequel l’acte a été effectué.</td>
    </tr>
    <tr>
      <td>- Indicateur de<br />forçage de la<br />tarification de la<br />part AMC</td>
      <td>100</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>zone réservée SESAM<br />Blanc : pas de forçage<br /><br />Autres valeurs : Indicateur de forçage par le PS, de la tarification de la part AMC issue d’un module STS.</td>
    </tr>
    <tr>
      <td>- N° d’ordre du<br />forfait technique</td>
      <td>101-105</td>
      <td></td>
      <td>5</td>
      <td>F</td>
      <td>N° d’ordre du forfait technique.</td>
    </tr>
    <tr>
      <td>- N° de l’appareil</td>
      <td>106-119</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>N° de l’appareil sur lequel l’acte technique a été réalisé.</td>
    </tr>
    <tr>
      <td>- Zone<br />numérique non<br />utilisée</td>
      <td>120-123</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>A zéro.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>124</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Top prévention,<br />action commune<br />AMO/AMC</td>
      <td>125</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire pour les actes concernés par la prévention commune AMO/AMC, valeur « O ».<br /><br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- Qualifiant du<br />dispositif de<br />prévention</td>
      <td>126-127</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Valeurs à définir ultérieurement.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>128</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 87

# **TYPE 4S : SUITE LIGNE ACTE - NORME CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 S</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Suite de l’en-tête de chaque facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 ligne de facture - Suite</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur S constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- Condition<br />d’exercice de<br />l’exécutant</td>
      <td>39</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si l’exécutant agit en tant que<br />libéral « L », que salarié « S » ou que<br />bénévole « B ».</td>
    </tr>
    <tr>
      <td>- Option de<br />coordination</td>
      <td>40</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeur « O » si l’exécutant a opté pour<br />l’option de coordination.<br /><br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- Base de<br />remboursement<br />théorique</td>
      <td>41-47</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Permet de renseigner la base de<br />remboursement théorique (égale au<br />tarif conventionnel) d’un acte CCAM,<br />avant application du tarif non<br />conventionné.</td>
    </tr>
    <tr>
      <td>- Condition<br />d’exercice du<br />prescripteur</td>
      <td>48</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si le prescripteur agit en tant<br />que libéral « L », que salarié « S » ou<br />que bénévole « B ».</td>
    </tr>
    <tr>
      <td>- Date de la<br />demande<br />d’accord<br />préalable</td>
      <td>49-54</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Facultatif si le code accord préalable à<br />9.<br />Obligatoire avec les autres codes.<br />Indiquer la date (AAMMJJ) pour chaque<br />demande d’accord préalable adressée<br />à l’organisme d’Assurance Maladie.</td>
    </tr>
    <tr>
      <td>- Code accord<br />préalable</td>
      <td>55</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 : pas de réponse de la caisse dans le<br />délai réglementaire<br />4 : réponse favorable<br />5 : notion d’urgence<br />9 : acte non soumis à accord préalable.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 88

# **TYPE 4S : SUITE LIGNE ACTE - NORME CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- <s>FILLER</s></td>
      <td>56-<s>70</s></td>
      <td><s>15</s></td>
      <td></td>
      <td>F</td>
      <td><s>Blanc.</s></td>
    </tr>
    <tr>
      <td>- Indicateur de forçage de la tarification de la part AMO</td>
      <td>71</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée pour utilisation future SESAM<br />A blanc : pas de forçage</td>
    </tr>
    <tr>
      <td>- Lieu d’exécution de l’acte</td>
      <td>72-85</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Permet de renseigner le lieu dans lequel l’acte a été effectué, dès lors que ce lieu est identifié avec un n° FINESS (structure de soins, maison de retraite,…).<br />En norme CP : obligatoire pour les transferts (&#x3C;48h) vers un autre plateau technique ; indiquez le n° FINESS de l’établissement dans lequel les actes sont réalisés.</td>
    </tr>
    <tr>
      <td>- Identification de la filière ou du réseau</td>
      <td>86-99</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>Permet de renseigner la relation d’appartenance du bénéficiaire à une filière ou un réseau dans lequel l’acte a été effectué.</td>
    </tr>
    <tr>
      <td>- Indicateur de forçage de la tarification de la part AMC</td>
      <td>100</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée pour utilisation future SESAM<br />A blanc : pas de forçage</td>
    </tr>
    <tr>
      <td>- N° d’ordre du forfait technique</td>
      <td>101-105</td>
      <td></td>
      <td>5</td>
      <td>F</td>
      <td>N° d’ordre du forfait technique.</td>
    </tr>
    <tr>
      <td>- N° de l’appareil</td>
      <td>106-119</td>
      <td></td>
      <td>14</td>
      <td>F</td>
      <td>N° de l’appareil sur lequel l’acte technique a été réalisé.</td>
    </tr>
    <tr>
      <td>- N° de GHS ou de GHT</td>
      <td>120-123</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Obligatoire en séjour GHS ou GHT.<br />Indiquer le numéro de GHS (fourni par le PMSI), sous lequel l’acte a été réalisé.<br />Indiquer le numéro de GHT relatif à la prise en charge HAD.<br />Hors GHS et GHT : à zéro.</td>
    </tr>
    <tr>
      <td>- Domaine court séjour</td>
      <td>124</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire si n° GHS renseigné, valeurs : M, C ou O.<br />Obligatoire si n° GHT renseigné, valeur « D ».<br />Sinon à Blanc</td>
    </tr>
  </tbody>
</table>

Supprimé : N° de remplaçant
Supprimé : 67
Supprimé : 4
Supprimé : 9
Supprimé : 2
Supprimé : Indiquer, s’il existe, le n° d’identification de l’exécutant remplaçant.
Inséré : 7
Inséré : 2
Supprimé : - Complément au n° de remplaçant ... [2]
Tableau mis en forme

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 89

# **TYPE 4S : SUITE LIGNE ACTE - NORME CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Top prévention action commune AMO/AMC</td>
      <td>125</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire pour les actes concernés par la prévention commune AMO/AMC, valeur « O ».<br /><br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- Qualifiant du dispositif de prévention</td>
      <td>126-127</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Valeurs à définir ultérieurement.</td>
    </tr>
    <tr>
      <td>- Code participation assuré</td>
      <td>128</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire avec l’acte qui déclenche l’exonération au titre du dépassement du seuil de 91€, <mark><u>sauf si l’acte est réalisé durant un séjour ou s’il nécessite un forfait d’urgence, de sécurité ou d’environnement, car dans ces cas, la participation est déduite sur la prestation hospitalière.</u></mark> Lorsqu’il s’agit d’un ensemble d’acte, ne renseigner le code que sur l’acte de plus forte base de remboursement.<br /><br />Valeur :<br /><br />A = à la charge de l’Assuré, ou pris en charge par la CMUC ou un organisme complémentaire.<br /><br />L = à la charge du régime Alsace Moselle.<br /><br /><u>R = à la charge du régime (SNCF).</u></td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 90

# **TYPE 4E : SUITE LIGNE ACTE - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 E</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Extension de l’en-tête de chaque<br />facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 ligne de facture - Suite</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur E constante.</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- Identifiant<br />RPPS du<br />prescripteur</td>
      <td>39-49</td>
      <td></td>
      <td>11</td>
      <td>F</td>
      <td>Uniquement en norme CP :<br />A renseigner avec le n° RPPS du<br />prescripteur.</td>
    </tr>
    <tr>
      <td>- N° de la<br />structure dans<br />laquelle le PS a<br />prescrit</td>
      <td>50-63</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>Uniquement en norme CP :<br />A renseigner avec le n° SIRET ou le n°<br />FINESS de la structure dans laquelle le<br />prescripteur a établi la prescription de<br />l’acte ou du produit facturé.</td>
    </tr>
    <tr>
      <td>- Identifiant<br />RPPS de<br />l’exécutant</td>
      <td>64-74</td>
      <td></td>
      <td>11</td>
      <td>F</td>
      <td>A renseigner avec le n° RPPS de<br />l’exécutant.</td>
    </tr>
    <tr>
      <td>- N° de la<br />structure dans<br />laquelle le PS a<br />exécuté l’acte</td>
      <td>75-88</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>A renseigner avec le n° SIRET ou le n°<br />FINESS de la structure dans laquelle<br />l’acte a été exécuté.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>89-128</td>
      <td>40</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 91

# **TYPE 4B : CODAGE BIOLOGIE –**
## **NORMES CP (établissements publics et privés), CS, ER et LB**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 B</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des actes de Biologie</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur B</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>43-48</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>49-54</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>55-56</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un enregistrement de type 4B doit<br />comporter au moins un acte.</td>
    </tr>
    <tr>
      <td>- Code acte 1</td>
      <td>57-64</td>
      <td></td>
      <td>8</td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>65-70</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>71-72</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code acte 2</td>
      <td>73-80</td>
      <td></td>
      <td>8</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>81-86</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>87-88</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code acte 3</td>
      <td>89-96</td>
      <td></td>
      <td>8</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>97-102</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>103-104</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code acte 4</td>
      <td>105-112</td>
      <td></td>
      <td>8</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>113-118</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>119-120</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code acte 5</td>
      <td>121-128</td>
      <td></td>
      <td>8</td>
      <td>F</td>
      <td></td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 92

# **TYPE 4D : CODAGE DENTAIRE NGAP –**
## **NORMES CP (établissements publics et privés), CS et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 D</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des actes</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire de<br />santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur D</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>43-48</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>49-50</td>
      <td></td>
      <td>2</td>
      <td>I</td>
      <td>Un enregistrement de type 4D doit<br />comporter au moins un acte.</td>
    </tr>
    <tr>
      <td>- Code acte 1</td>
      <td>51-63</td>
      <td>13</td>
      <td></td>
      <td>I</td>
      <td>Code NGAP à saisir en cas de Codage</td>
    </tr>
    <tr>
      <td>- Coefficient<br />modulateur</td>
      <td>64-66</td>
      <td></td>
      <td>1+2</td>
      <td>I</td>
      <td>Indiquer le coefficient modulateur de<br />l’acte.<br />=1 : pas de modulation<br />&#x3C;1 : Réduction<br />>1 : Majoration</td>
    </tr>
    <tr>
      <td>- N° de dent</td>
      <td>67-68</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Obligatoire pour les soins dentaires<br />Norme NF S91.011 :<br />1<sup>er</sup> caractère : indication du quadrant :<br />1 à 4 pour les dents définitives<br />5 à 8 pour les dents de lait<br />2<sup>ème</sup> caractère : localisation de la dent<br />dans un même quadrant :<br />de 1 à 8<br />Valeur zéro si pas de notion de dent</td>
    </tr>
    <tr>
      <td>- Date de l’acte</td>
      <td>69-74</td>
      <td></td>
      <td>6</td>
      <td>I</td>
      <td></td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>75-76</td>
      <td></td>
      <td>2</td>
      <td>I</td>
      <td></td>
    </tr>
    <tr>
      <td>- Code acte 2</td>
      <td>77-89</td>
      <td>13</td>
      <td></td>
      <td>I</td>
      <td></td>
    </tr>
    <tr>
      <td>- Coefficient<br />modulateur</td>
      <td>90-92</td>
      <td></td>
      <td>1+2</td>
      <td>I</td>
      <td></td>
    </tr>
    <tr>
      <td>- N° de dent</td>
      <td>93-94</td>
      <td></td>
      <td>2</td>
      <td>I</td>
      <td></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>95-128</td>
      <td>34</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

<u>Champs avec le qualificatif « présence » à I </u> : présence interdite jusqu’à initiation du codage des actes dentaires.

En attendant le codage, un seul couple 4A-4D par dent traitée.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 93

# **TYPE 4F : CODAGE LPP – NORMES PH, FR, <u>PE et CS</u>**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 F</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des actes</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur F</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- Code de la LPP</td>
      <td>43-55</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td>Code de la LPP associé à la prestation.<br />7 caractères utiles <b><b>cadrés à gauche</b></b>,<br />complétés par des blancs.<br />Obligatoire dès lors que le codage de la<br />LPP sera en vigueur.<br />Si le code est renseigné, tous les 4F<br />suivants le même type 4A doivent<br />contenir un code.<br />Si le code n’est pas renseigné, tous les<br />4F suivants le même type 4A ne<br />contiennent pas de codes.</td>
    </tr>
    <tr>
      <td>- Type de<br />prestation fournie</td>
      <td>56</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Précise le type de prestation fournie au<br />malade. Valeurs possibles :<br />A : Achat<br />E : Entretien<br />L : Location<br />P : Frais de port<br />R : Réparation<br />S : Service (ex : assist. Respiratoire)<br />V : Livraison</td>
    </tr>
    <tr>
      <td>- N° SIRET du<br />fabricant ou de<br />l’importateur</td>
      <td>57-70</td>
      <td>14</td>
      <td></td>
      <td>F</td>
      <td>« Fabricant » au sens des articles L-<br />665 et R-665 du code de la santé<br />publique.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>71-76</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
    <tr>
      <td>- Date début de<br />location ou date<br />d’achat ou de<br />délivrance</td>
      <td>77-82</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>En cas de facturation partielle d’une<br />location, la date de début de location<br />correspond à la date de début de<br />facturation de la période concernée.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 94

# **TYPE 4F : CODAGE LPP – NORMES PH, FR, <u>PE et CS</u>**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Date de fin de<br />location ou de<br />service</td>
      <td>83-88</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>Obligatoire en cas de location ou de<br />service.<br />En cas de facturation partielle d’une<br />location, la date de fin de location<br />correspond à la date de fin de<br />facturation de la période concernée.<br />En cas de changement de tarif en cours<br />de période, indiquer une fin de période<br />à la date de fin de l’ancien tarif et finir la<br />période avec le nouveau tarif.</td>
    </tr>
    <tr>
      <td>- Tarif de<br />référence LPP ou<br />PU sur devis</td>
      <td>89-95</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le « tarif de référence » de<br />l’article LPP ou le « prix unitaire sur<br />devis » en cas de délivrance d’articles<br />sur devis.</td>
    </tr>
    <tr>
      <td>- Nombre<br />d’unités</td>
      <td>96-97</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Indique le nombre de fois où l’article est<br />facturé.<br />Correspond pour les locations au<br />nombre de jours, semaines ou mois<br />facturés.</td>
    </tr>
    <tr>
      <td>- Prix unitaire de<br />vente</td>
      <td>98-104</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le prix unitaire de vente de<br />l’article LPP remise incluse, ou le prix<br />unitaire sur devis.</td>
    </tr>
    <tr>
      <td>- Base de<br />remboursement<br />LPP</td>
      <td>105-111</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer la base de remboursement :<br />Tarif de référence LPP ou PU sur devis<br />(pos. 89-95) x nombre d’unités (pos.96-<br />97).</td>
    </tr>
    <tr>
      <td>- Montant total<br />facturé</td>
      <td>112-118</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le montant total facturé TTC :<br />prix unitaire de vente remise incluse<br />(pos. 98-104) x nombre d’unités (96-97)<br />.</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>119-128</td>
      <td>10</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

**NORMES B2 - Cahier des Charges – Juin 2007 avec errata** Page 95

# **TYPE 4H : CODAGE PHARMACIE HOSPITALIERE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4H</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des médicaments hospitaliers<br />rétrocédés</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2 CP pos. 30-38</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur H</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>De 01 à 10</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné ultérieurement par le<br />module de sécurité SESAM.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>43-48</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Code UCD</td>
      <td>49-55</td>
      <td></td>
      <td>7</td>
      <td>O</td>
      <td>Code UCD associé à une nature de<br />prestation PHH, PHS ou PHQ en<br />fonction du taux de remboursement du<br />médicament pour les médicaments<br />rétrocédés</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>56</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Coefficient de<br />fractionnement</td>
      <td>57-61</td>
      <td></td>
      <td>1+4</td>
      <td>O</td>
      <td>Le coefficient de fractionnement indique<br />la fraction délivrée par rapport à l’unité<br />de facturation. Il est inférieur ou égal à<br />1.<br /><br />Exemple : pour la délivrance du 1/3<br />d’un conditionnement donné, le<br />coefficient de fractionnement est égal à<br />03333.<br /><br />Si le coefficient de fractionnement est<br />strictement inférieur à 1, alors la<br />quantité doit être égale à 1.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>62-66</td>
      <td>5</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 96

# **TYPE 4H : CODAGE PHARMACIE HOSPITALIERE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Coût TTC lié à<br />la reconstitution<br />du médicament</td>
      <td>67-73</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire avec certains codes UCD.<br /><br />Coût TTC des composants et des consommables utilisés pour la reconstitution ou pour l’administration du médicament ainsi que le coût en personnel induit estimé sur la base de la comptabilité analytique de l’établissement,</td>
    </tr>
    <tr>
      <td>- Montant de la<br />marge TTC</td>
      <td>74-80</td>
      <td></td>
      <td>5+2</td>
      <td>F <s>O</s></td>
      <td>Indiquer le montant TTC de la marge de rétrocession. La marge s’applique à la ligne de prescription, une seule marge pour un même code UCD, quelle que soit la quantité délivrée. <u>Si un autre type 4H est nécessaire pour le même code UCD, dans le cas de fractionnement du produit, alors la marge est renseignée à zéro.</u></td>
    </tr>
    <tr>
      <td>- Prix unitaire<br />facturé TTC</td>
      <td>81-87</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le prix de vente unitaire TTC.</td>
    </tr>
    <tr>
      <td>- Quantité</td>
      <td>88-90</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’unités délivrées, par défaut égal à 1.<br /><br />Si le nombre d’unités délivrées est supérieur à 1, alors le coefficient de fractionnement doit être égal à 1.</td>
    </tr>
    <tr>
      <td>- Montant total<br />facturé TTC</td>
      <td>91-97</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Le montant total facturé TTC est égal à :<br /><br />(prix unitaire facturé TTC x quantité x coefficient de fractionnement) + montant de la marge TTC + le cas échéant, le coût TTC lié à la reconstitution du médicament.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>98-128</td>
      <td>31</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 97

# **TYPE 4M : CODAGE CCAM –**
# **NORMES ER, CS et CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 M</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des actes CCAM</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur M</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>01 à 26</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- Code de l’acte</td>
      <td>43-55</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Code CCAM, 7 caractères utiles<br /><b><b>cadrés à gauche</b></b>, complétés par des<br />blancs.</td>
    </tr>
    <tr>
      <td>- Code extension<br />documentaire</td>
      <td>56</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Affine le code de l’acte, à un niveau<br />d’information supplémentaire, mais non<br />utile à la tarification.</td>
    </tr>
    <tr>
      <td>- Code activité</td>
      <td>57</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Permet de différencier les différents<br />temps de l’acte, éventuellement<br />réalisés par différents intervenants.</td>
    </tr>
    <tr>
      <td>- Code phase de<br />traitement</td>
      <td>58</td>
      <td></td>
      <td>1</td>
      <td>F</td>
      <td>Dans le cas de traitements se déroulant<br />en plusieurs phases .</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur 1</td>
      <td>59</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Permet d’indiquer les circonstances<br />particulières de réalisation de l’acte<br />Cf. TB11 de la base CCAM.<br />Blanc sinon.</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur 2</td>
      <td>60</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur 3</td>
      <td>61</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur 4</td>
      <td>62</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 98

# **TYPE 4M : CODAGE CCAM –**
## **NORMES ER, CS et CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Code association d’actes non prévue</td>
      <td>63</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>cf. TB02 de la base CCAM disponible sur AMELI. <u><i>Cliquez sur ce lien</i></u>.<br />Permet de signaler les associations d’acte non prévues.<br />Valeur pour le démarrage de la CCAM :<br />- 1 : acte de tarif le plus élevé non réduit 100%<br /><br />- 2 : acte réduit 50%<br />- 3 : acte réduit 75%<br /><br />- 4 : actes spécifiques non réduits 100%<br />- 5 : actes non réduits car réalisés au cours d’une même journée, dans certains cas 100%<br />Blanc par défaut.</td>
    </tr>
    <tr>
      <td>- Code remboursement sous condition</td>
      <td>64</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Précise si le remboursement est lié à une indication médicale et s’il est admissible au remboursement.<br />Valeur possible : O (oui) ou N (non) pour les actes remboursables selon conditions.<br />Blanc par défaut.</td>
    </tr>
    <tr>
      <td>- Date de chaque séance de la phase de traitement</td>
      <td>65-70</td>
      <td></td>
      <td>6</td>
      <td>F</td>
      <td>A renseigner dans le cas de traitements prolongés ou d’actes permettant plusieurs séances pour une même phase de traitement. Tout au long de la phase de traitement, la date de chaque séance sera transmise dans autant de types 4M.</td>
    </tr>
    <tr>
      <td>- N° de la dent 1</td>
      <td>71-72</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire pour les soins dentaires<br />Utilisation de la norme ISO 3960-1984 :<br />Numérotation des dents :<br />1<sup>er</sup> caractère : indication du quadrant :<br />    1 à 4 pour les dents définitives<br />    5 à 8 pour les dents de lait<br />2<sup>ème</sup> caractère : localisation de la dent dans un même quadrant :<br />    de 1 à 8.<br />Numérotation sextants et maxillaires :<br />01 :maxillaire supérieur<br />02 :mandibule (maxillaire inférieur)<br />03 :Sextant supérieur droit<br />04 :Sextant antéro-supérieur<br />05 :Sextant supérieur gauche<br />06 :Sextant inférieur gauche<br />07 :Sextant antéro-inférieur<br />08 :Sextant inférieur droit<br /><br />A blanc si pas de notion de dent.<br />Si un seul numéro de localisation de dent est renseigné, c’est uniquement dans cette position qu’il doit l’être.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 99

# **TYPE 4M : CODAGE CCAM –**
# **NORMES ER, CS et CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th><b>DES RUBRIQUES</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- N° de la dent 2</td>
      <td>73-74</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire pour les soins dentaires si<br />plusieurs numéros de localisation de<br />dents doivent être renseignés.<br />Il ne doit pas y avoir de rupture dans le<br />remplissage des champs « n° de dent »<br />qui suivent.</td>
    </tr>
    <tr>
      <td>- N° de la dent 3</td>
      <td>75-76</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 4</td>
      <td>77-78</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 5</td>
      <td>79-80</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 6</td>
      <td>81-82</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 7</td>
      <td>83-84</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 8</td>
      <td>85-86</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 9</td>
      <td>87-88</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 10</td>
      <td>89-90</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 11</td>
      <td>91-92</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 12</td>
      <td>93-94</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 13</td>
      <td>95-96</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 14</td>
      <td>97-98</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 15</td>
      <td>99-100</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- N° de la dent 16</td>
      <td>101-102</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Idem N° de la dent 2</td>
    </tr>
    <tr>
      <td>- Supplément de<br />charge</td>
      <td>103</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Valeur « C » si un supplément de<br />charge pour activité en cabinet est<br />demandé.<br />Sinon à blanc.</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur OC 1</td>
      <td>104</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Transcription des codes modificateurs,<br />pour les OC.<br />Obligatoire lorsque le PS autorise<br />l’éclatement du flux si présence de<br />code modificateur.<br />Sinon à blanc.</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur OC 2</td>
      <td>105</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem code modificateur OC 1.</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur OC 3</td>
      <td>106</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem code modificateur OC 1.</td>
    </tr>
    <tr>
      <td>- Code<br />modificateur OC 4</td>
      <td>107</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Idem code modificateur OC 1.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>108-128</td>
      <td>21</td>
      <td></td>
      <td>F</td>
      <td>Blanc.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 100

# **TYPE 4P : CODAGE PHARMACIE – NORME PH et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 P</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Détail des actes de Pharmacie</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur P</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>= 01 – 1 seul CIP par type 4P</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- Mode de<br />prescription</td>
      <td>43</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><b>M</b> : mention du Médecin sur la<br />prescription « non substituable »<br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- indicateur de<br />substitution</td>
      <td>44</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><b>U</b> : substitution pour Urgence ou<br />Accord du médecin<br /><b>N</b> : refus de substitution<br />A blanc sinon.</td>
    </tr>
  </tbody>
</table>

**Supprimé :** ~~D : prescription en Dénomination Commune Internationale (DCI)~~
**~~I : Prescription Initiale Hospitalière~~**

**Supprimé :** ~~<u>Obligatoire en cas de substitution :</u>~~
**~~G : substitution de Générique à Générique~~**
**~~R : substitution de Générique à Référent~~**
**~~S : substitution de Référent à Générique~~**

**Supprimé :** ~~<u>Si pas de substitution :</u>~~

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 101

# **TYPE 4P : CODAGE PHARMACIE – NORME PH et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Type du code CIP du médicament <b>prescrit</b></td>
      <td>45</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><u>[Zone réservée à titre conservatoire]</u><br />La valeur « <b>A</b> » indique un code CIP du médicament <u>allopathique</u> prescrit sur 7 caractères.<br />La valeur « <b>B</b> » indique un code CIP du médicament <u>allopathique</u> prescrit sur 13 caractères.<br />A blanc sinon</td>
    </tr>
    <tr>
      <td>- Code CIP du médicament <b>prescrit</b></td>
      <td>46-58</td>
      <td>13</td>
      <td></td>
      <td>F</td>
      <td><u>[Zone réservée à titre conservatoire]</u><br />Code CIP du médicament <u>allopathique</u> prescrit à 13 caractères ou à 7 caractères (cadré à droite, complété à gauche par des blancs)<br />A blanc sinon.</td>
    </tr>
    <tr>
      <td>- Type du code CIP du médicament <b>délivré</b></td>
      <td>59</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td><u>La valeur « <b>6</b> » ou « <b>7</b> » indique un code CIP homéopathique sur 7 caractères, respectivement petit et grand laboratoire.</u><br />La valeur « <b>A</b> » indique un code CIP du médicament <u>allopathique</u> délivré sur 7 caractères.<br />La valeur « <b>B</b> » indique un code CIP du médicament délivré sur 13 caractères.</td>
    </tr>
    <tr>
      <td>- Code CIP du médicament <b>délivré</b></td>
      <td>60-72</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Code CIP du médicament délivré à 13 caractères ou à 7 caractères (cadré à droite, complété à gauche par des blancs)</td>
    </tr>
    <tr>
      <td>- Indicateur du médicament <b>délivré</b></td>
      <td>73</td>
      <td></td>
      <td>1</td>
      <td><u>F</u></td>
      <td><b>0</b> : médicament n’appartenant pas à un groupe générique<br /><b>1</b> : médicament générique non soumis à TFR<br /><b>4</b> : référent du groupe générique non soumis à TFR<br /><b>5</b> : référent du groupe générique soumis à TFR<br /><b>7</b> : Générique soumis à TFR</td>
    </tr>
  </tbody>
</table>
Supprimé : Obligatoire en cas d’indicateur de substitution à G, R, S ou U, ¶
Supprimé : Obligatoire en cas d’indicateur de substitution à G, R, S ou U, ¶
Supprimé : O

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 102

# **TYPE 4P : CODAGE PHARMACIE – NORME PH et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Quantité de<br />condition-<br />nements délivrés<br /><u>ou utilisés</u></td>
      <td>74-75</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Indiquer la quantité de condition-<br />nements délivrés pour ce code CIP.<br />Si le top « déconditionnement » est<br />renseigné avec la valeur « <b>D</b> », <mark><u>reporter<br />ici le nombre de conditionnements<br />utilisés dans le cadre du<br />déconditionnement du type 4P (pos 94-<br />95).</u></mark></td>
    </tr>
    <tr>
      <td>- Prix unitaire du<br />conditionnement<br />délivré</td>
      <td>76-82</td>
      <td></td>
      <td>5+2</td>
      <td>O</td>
      <td>Indiquer le prix unitaire du<br />conditionnement délivré.<br />Zone non renseignée si le top<br />« déconditionnement » est renseigné<br />avec la valeur « <b>D</b> »</td>
    </tr>
    <tr>
      <td>- Top<br />décondition-<br />nement</td>
      <td>83</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Le top est renseigné à la valeur « <b>D</b> » si<br />le médicament est déconditionné. Dans<br />ce cas, la facturation de ce médicament<br />est entièrement effectué en unités.</td>
    </tr>
    <tr>
      <td>- Quantité<br />d'unités délivrées<br />dans le cadre du<br />décondition-<br />nement</td>
      <td>84-86</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Obligatoire si le top « décondition-<br />nement » est renseigné avec la valeur<br />« <b>D</b> » : indiquer le nombre total d'unités<br />délivrées.<br />A zéro sinon</td>
    </tr>
    <tr>
      <td>- Prix unitaire de<br />l'unité délivré<br />dans le cadre du<br />décondition-<br />nement</td>
      <td>87-93</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire si le top « décondition-<br />nement » est renseigné avec la valeur<br />« <b>D</b> » : indiquer le prix unitaire de l'unité<br />délivrée.<br />Ce prix correspond au prix du<br />conditionnement divisé par le nombre<br />d'unité de ce conditionnement<br />Exemple : Pour une boite de 30<br />comprimés, ayant un prix à 15 €, le PU<br />de l'unité délivrée est :<br />15 € divisé par 30 comprimés = 0.50 €<br />A zéro sinon.</td>
    </tr>
  </tbody>
</table>

Supprimé : complets
Supprimé : complets
Supprimé : <mark>Zone non renseignée</mark>
Supprimé : <mark>car dans ce cas, la délivrance du médicament est entièrement effectuée en unités.</mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 103

# **TYPE 4P : CODAGE PHARMACIE – NORME PH et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Nombre de<br />conditionnement<br />s utilisés dans le<br />cadre du<br />décondition-<br />nement</td>
      <td>94-95</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire si le top « décondition-<br />nement » est renseigné avec la valeur<br />« <b>D</b> » : indiquer le nombre de<br />conditionnements nécessaires pour la<br />délivrance de la quantité d’unités<br />prescrites.<br /><br />exemple : 30 comprimés délivrés, issus<br />de boites de 14 unités, le nombre de<br />conditionnement utilisé est donc de 3.<br /><br />A zéro sinon.</td>
    </tr>
    <tr>
      <td>- Condition<br />particulière de<br />prise en charge</td>
      <td>96-98</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td><mark>Réservé à un usage futur</mark></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>99-128</td>
      <td>30</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

Supprimé : <mark>Indiquer la codification du contexte particulier de prise en charge du médicament.¶</mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 104

# **TYPE 4R : CODAGE PHARMACIE – NORME PH et ER**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 R</td>
      <td></td>
      <td></td>
      <td></td>
      <td>F</td>
      <td>Détail des actes de Pharmacie - suite</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé du numéro<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément de<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur R</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>= 01 à 15</td>
    </tr>
    <tr>
      <td>- Réservé<br />SESAM</td>
      <td>39-42</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Renseigné par module de sécurité<br />SESAM.</td>
    </tr>
    <tr>
      <td>- N° de lot du<br />conditionnement<br />(occurrence 1)</td>
      <td>43-62</td>
      <td>20</td>
      <td></td>
      <td>O</td>
      <td>Renseigné avec le numéro de lot du<br />conditionnement.</td>
    </tr>
    <tr>
      <td>- Quantité de<br />conditionnement<br />appartenant au<br />même lot<br /><br />(occurrence 1)</td>
      <td>63-64</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Si le numéro de série (pos. 66-85) est<br />renseigné, la quantité de<br />conditionnement est égale à 1.<br /><br />Si le numéro de série (pos. 66-85) n’est<br />pas renseigné, la quantité de<br />conditionnement est renseignée avec le<br />nombre de conditionnement<br />appartenant au même lot.</td>
    </tr>
    <tr>
      <td>-<br />Conditionnement<br />déconditionné<br />(occurrence 1)</td>
      <td>65</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire en cas de<br />déconditionnement.<br /><br />Si le numéro de série (pos. 66-85) est<br />renseigné, indiquer la valeur « <b>D</b> » si le<br />conditionnement est déconditionné<br /><br />Si le numéro de série (pos. 66-85) n’est<br />pas renseigné, indiquer la valeur « <b>D</b> »<br />si au moins un des conditionnements<br />appartenant au même lot est<br />déconditionné.</td>
    </tr>
    <tr>
      <td>- Numéro de<br />série du<br />conditionnement<br />délivré<br /><br />(occurrence 1)</td>
      <td>66-85</td>
      <td>20</td>
      <td></td>
      <td>F</td>
      <td>Renseigné avec le numéro de série du<br />conditionnement délivré.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 105

# <u>**TYPE 4R : CODAGE PHARMACIE – NORME PH et ER**</u>

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- N° de lot du<br />conditionnement<br /><br />(occurrence 2)</td>
      <td>86-105</td>
      <td>20</td>
      <td></td>
      <td>F</td>
      <td>Seconde occurrence possible pour un<br />numéro de lot différent.<br /><br />Cette seconde occurrence peut<br />comporter le même numéro de lot, si<br />présence d’un numéro de série de<br />conditionnement différent (109-128).</td>
    </tr>
    <tr>
      <td>- Quantité de<br />conditionnement<br />appartenant au<br />même lot<br /><br />(occurrence 2)</td>
      <td>106-107</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire si le numéro de lot (86-105)<br />est renseigné.<br /><br />Si le numéro de série (pos. 109-128)<br />est renseigné, la quantité de<br />conditionnement est égale à 1.<br /><br />Si le numéro de série (pos. 109-128)<br />n’est pas renseigné, la quantité de<br />conditionnement est renseignée avec le<br />nombre de conditionnement<br />appartenant au même lot.</td>
    </tr>
    <tr>
      <td>-<br />Conditionnement<br />déconditionné<br /><br />(occurrence 2)</td>
      <td>108</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Obligatoire en cas de<br />déconditionnement.<br /><br />Si le numéro de série (pos. 109-128)<br />est renseigné, indiquer la valeur « <b>D</b> »<br />si le conditionnement est déconditionné<br /><br />Si le numéro de série (pos. 109-128)<br />n’est pas renseigné, indiquer la valeur<br />« <b>D</b> » si au moins un des<br />conditionnements appartenant au<br />même lot est déconditionné.</td>
    </tr>
    <tr>
      <td>- Numéro de<br />série du<br />conditionnement<br />délivré<br /><br />(occurrence 2)</td>
      <td>109-128</td>
      <td>20</td>
      <td></td>
      <td>F</td>
      <td>Renseigné avec le numéro de série du<br />conditionnement délivré.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 106

# **TYPE 4T : COMPLEMENT LIGNE TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2"><b>INFORMATIONS</b></th>
      <th rowspan="2"><b>POSITIONS</b></th>
      <th colspan="2"><b><b>LONGUEUR</b></b></th>
      <th rowspan="2"><b>PRESENCE</b></th>
      <th rowspan="2"><b><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th><b>A</b></th>
      <th><b>N</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 T</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>COMPLEMENT DE LA FACTURE<br />GLOBALE</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>= Valeur T</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Un seul enregistrement numéroté 01.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>39-45</td>
      <td>7</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Série (au sens<br />du décret du<br />6/5/88)</td>
      <td>46</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 non 1 oui</td>
    </tr>
    <tr>
      <td>- Transport lié à<br />une<br />hospitalisation</td>
      <td>47</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 non<br />1 entrée / sortie<br />2 transfert</td>
    </tr>
    <tr>
      <td>- Longue<br />distance</td>
      <td>48</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 pas de longue distance<br />1 longue distance</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>49</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Forfait type de<br />forfait</td>
      <td>50</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>0 pas de forfait<br />1 département<br />2 agglomération<br />3 spécifique région parisienne<br />Si les transports de la série facturée<br />intègrent des forfaits de types<br />différents, faire une facture séparée par<br />type de forfait.</td>
    </tr>
    <tr>
      <td>- Prix unitaire du<br />forfait non majoré</td>
      <td>51-56</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Obligatoire si type de forfait différent de<br />0.</td>
    </tr>
    <tr>
      <td>- Quantité forfaits</td>
      <td>57-58</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Nombre de forfaits facturés y compris<br />Nuit et Férié. Maximum 36.</td>
    </tr>
    <tr>
      <td>- Quantité forfaits<br />majoration de<br />nuit</td>
      <td>59-60</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Nombre de forfaits de Nuit.</td>
    </tr>
    <tr>
      <td>- Quantité forfaits<br />majoration<br />dimanche ou<br />fériés</td>
      <td>61-62</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Nombre de forfaits « Férié »</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 107

# **TYPE 4T : COMPLEMENT LIGNE TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TARIF<br />KILOMETRIQUE</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>prix unitaire du<br />kilomètre non<br />réduit.</td>
      <td>63-68</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Valeur à zéro s’il n’y a pas de<br />kilomètres facturés.</td>
    </tr>
    <tr>
      <td>- SANS<br />MAJORATION<br /><br />Quantité<br />&#x3C;ou=150 km</td>
      <td>69-72</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme totale des kilomètres non<br />soumis à réduction (≤150) pour<br />l’ensemble des transports de la série<br />(déduction faite des kilomètres inclus<br />dans le forfait) y compris les kilomètres<br />effectués la nuit ou les jours fériés.</td>
    </tr>
    <tr>
      <td>Quantité<br />>150 km</td>
      <td>73-76</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme totale des kilomètres soumis à<br />réduction (>150) pour l’ensemble des<br />transports de la série y compris les<br />kilomètres effectués la nuit ou les jours<br />fériés.</td>
    </tr>
    <tr>
      <td>- MAJORATION<br />NUIT<br /><br />Quantité<br />&#x3C;ou=150 km</td>
      <td>77-80</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme des kilomètres non soumis à<br />réduction et effectués la nuit pour<br />l’ensemble des transports de la série<br />(déduction faite des kilomètres inclus<br />dans le forfait).</td>
    </tr>
    <tr>
      <td>Quantité<br />>150 km</td>
      <td>81-84</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme des kilomètres soumis à<br />réduction et effectués la nuit pour<br />l’ensemble des transports de la série.</td>
    </tr>
    <tr>
      <td>- MAJORATION<br />D.I.M./FERIE<br /><br />Quantité<br />&#x3C;ou=150 km</td>
      <td>85-88</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme des kilomètres non soumis à<br />réduction et effectués les jours fériés<br />pour l’ensemble des transports de la<br />série (déduction faite des kilomètres<br />inclus dans le forfait).</td>
    </tr>
    <tr>
      <td>Quantité<br />>150 km</td>
      <td>89-92</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Somme des kilomètres soumis à réduc-<br />tion et effectués les jours fériés pour<br />l’ensemble des transports de la série.</td>
    </tr>
    <tr>
      <td>- SUPPLE-<br />MENT<br /><br />Type supplément</td>
      <td>93</td>
      <td></td>
      <td>1</td>
      <td>F</td>
      <td>1 : aéroport<br />2 : enfant prématuré<br />3 : appel d’urgence après régulation<br />(centre 15 SAMU …)</td>
    </tr>
    <tr>
      <td>quantité</td>
      <td>94-95</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>montant</td>
      <td>96-101</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Montant total des suppléments.</td>
    </tr>
    <tr>
      <td>- PEAGE (S) et<br />voies d’eau</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>nombre</td>
      <td>102-103</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td></td>
    </tr>
    <tr>
      <td>montant</td>
      <td>104-109</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Montant total des péages.</td>
    </tr>
    <tr>
      <td>- Montant global<br />des abattements</td>
      <td>110-116</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire si la zone des abattements<br />est remplie sur au moins un des types<br />4U</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>117-128</td>
      <td>12</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 108

# **TYPE 4U : DETAIL TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>TYPE 4 U</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>COMPLEMENT FACTURE DETAIL<br />autant que de transports indiqués dans<br />dénombrement.</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 4 LIGNE DE FACTURE / Détail des<br />transports.</td>
    </tr>
    <tr>
      <td>-N° partenaire de<br />santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N°<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Complément du<br />type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Valeur U</td>
    </tr>
    <tr>
      <td>- Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Numéro d’ordre du transport. De 01 à<br />36.</td>
    </tr>
    <tr>
      <td>- Date départ</td>
      <td>39-44</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>AAMMJJ</td>
    </tr>
    <tr>
      <td>- Heure départ</td>
      <td>45-48</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>HHMM de 00 à 23H, de 00 à 59Mn</td>
    </tr>
    <tr>
      <td rowspan="2">- Lieu départ<br />département<br />commune</td>
      <td>49-50</td>
      <td></td>
      <td>2</td>
      <td>0</td>
      <td rowspan="2">Code INSEE des communes et des<br />départements. Remplir avec 99999 si<br />hors de France.</td>
    </tr>
    <tr>
      <td>51-53</td>
      <td></td>
      <td>3</td>
      <td>0</td>
    </tr>
    <tr>
      <td>- N° véhicule</td>
      <td>54-62</td>
      <td>9</td>
      <td></td>
      <td>O</td>
      <td>Numéro minéralogique.</td>
    </tr>
    <tr>
      <td>- Nom<br />conducteur</td>
      <td>63-70</td>
      <td>8</td>
      <td></td>
      <td>O</td>
      <td>8 premiers caractères nom.</td>
    </tr>
    <tr>
      <td>- Prénom<br />conducteur</td>
      <td>71-73</td>
      <td>3</td>
      <td></td>
      <td>O</td>
      <td>3 premiers caractères prénom.</td>
    </tr>
    <tr>
      <td>- Nom<br />accompagnateur</td>
      <td>74-81</td>
      <td>8</td>
      <td></td>
      <td>F</td>
      <td>8 premiers caractères nom.<br />Obligatoire pour les transports en<br />ambulance.</td>
    </tr>
    <tr>
      <td>- Prénom<br />accompagnateur</td>
      <td>82-84</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>3 premiers caractères prénom.<br />Obligatoire pour les transports en<br />ambulance.</td>
    </tr>
    <tr>
      <td>- Date arrivée</td>
      <td>85-90</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td>Obligatoire AAMMJJ</td>
    </tr>
    <tr>
      <td>- Heure arrivée</td>
      <td>91-94</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>HHMM 00 à 23H, 00 à 59 Mn.</td>
    </tr>
    <tr>
      <td>- Lieu arrivée</td>
      <td>95-99</td>
      <td></td>
      <td>5</td>
      <td>O</td>
      <td>Comme pour lieu de départ.</td>
    </tr>
    <tr>
      <td>- Nombre<br />malades</td>
      <td>100</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>Transportés dans véhicule.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 109

# **TYPE 4U : DETAIL TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- % abattement</td>
      <td>101-102</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td>Obligatoire si plus d’un malade en<br />V.S.L.</td>
    </tr>
    <tr>
      <td>- Montant<br />abattement</td>
      <td>103-108</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Obligatoire si plus d’un malade en<br />V.S.L.</td>
    </tr>
    <tr>
      <td>- Distance<br />parcourue</td>
      <td>109-112</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Nombre de kms facturés, (déduction<br />faite des kms compris dans le forfait ).</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>113-128</td>
      <td>16</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 110

# **TYPE 5**

## **FIN DE FACTURE**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 111

# **TYPE 5 : FIN FACTURE - TOUTES NORMES sauf CP**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><u>LONGUEUR</u></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 5</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>TOTALISATION DE LA FACTURE</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 5 - TOTAL FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire de<br />santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé immatriculation<br />assuré</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>27-35</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>36-38</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Nombre<br />d’enregistrement de<br />Type 4</td>
      <td>39-41</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’enregistrements de type 4<br />quel que soit le complément de type.</td>
    </tr>
    <tr>
      <td>- Zone réservée<br />SESAM</td>
      <td>42-57</td>
      <td>16</td>
      <td></td>
      <td>O</td>
      <td>A Blanc.<br />Zone libre utilisée entre le PS et l’OCT,<br />si le type de contrat = 99. La zone<br />contient des informations pour la<br />facturation complémentaire.</td>
    </tr>
    <tr>
      <td>- Total des montants<br />facturés</td>
      <td>58-65</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des montants facturés dans les<br />enregistrements de type 4 et 4A<br />dépassement compris (positions 113-<br />119).</td>
    </tr>
    <tr>
      <td>- Total<br />remboursable par la<br />Caisse</td>
      <td>66-73</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des montants remboursables par<br />la Caisse, des enregistrements de type<br />4 et 4A (positions 106-112).</td>
    </tr>
    <tr>
      <td>- Total participation<br />assuré avant<br />participation de<br />l’organisme<br />complémentaire</td>
      <td>74-81</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Résultat de l’opération :<br />+ Total montants facturés<br />- Total remboursable par la caisse</td>
    </tr>
    <tr>
      <td>- Total<br />remboursable par<br />l’organisme<br />complémentaire</td>
      <td>82-89</td>
      <td></td>
      <td>6+2</td>
      <td>F</td>
      <td>Total remboursable par l’organisme<br />complémentaire.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 112

# TYPE 5 : FIN FACTURE - TOUTES NORMES sauf CP

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Top éclatement des flux par l’OCT</td>
      <td>90</td>
      <td>1</td>
      <td></td>
      <td></td>
      <td>Valeur « <b>A</b> » : il y a eu éclatement des flux par un OCT,<br />Valeur <b><b>blanc</b></b> : il n’y a pas eu d’éclatement, ni de demande de remboursement AMC.<br /><b><b>Autres</b></b> valeurs : remboursement de la part AMO et AMC par l’AMO : indiquer la nature de la pièce justificative des droits AMC.<br />Cf. annexe 8 - JUSTIFICATION DES DROITS AMC.</td>
    </tr>
    <tr>
      <td>- Zone réservée SESAM</td>
      <td>91-93</td>
      <td>3</td>
      <td></td>
      <td>O</td>
      <td>A Blanc.<br /><br />Zone libre utilisée entre le PS et l’OCT, si le type de contrat = 99. La zone contient des informations pour la facturation complémentaire.<br /><br />Pos. 91 :<br />- D si réponse défavorable à une demande d’accord préalable AMO<br /><br />Pos. 92 :<br />- T pour tiers payant<br />- H pour hors tiers payant<br />- C pour tiers payant 100% santé-pharma<br />- P pour tiers payant 95% santé-pharma<br />- S autre tiers payant santé-pharma<br /><br />Pos. 93 :<br />1 = facture RO+RC<br />3=recyclage global de la facture RO+RC<br />4=recyclage partiel de la facture RO seul<br />5=recyclage partiel de la facture RC seul<br />6=facture RC seulement<br />7=facture RO seulement</td>
    </tr>
    <tr>
      <td>- Liste d’opposition</td>
      <td>94</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Zone réservée SESAM</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>95-96</td>
      <td>2</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Zone de certification</td>
      <td>97-128</td>
      <td>32</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM.</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 113

# **TYPE 5 : FIN FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br /><b>DES RUBRIQUES</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 5</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Totalisation de la facture</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 5 - TOTAL FACTURE</td>
    </tr>
    <tr>
      <td>- N° partenaire<br />de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>FILLER</td>
      <td>11</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Numéro<br />immatriculation<br />assuré</td>
      <td>12-24</td>
      <td>13</td>
      <td></td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Clé<br />immatriculation<br />assuré</td>
      <td>25-26</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Rang du<br />bénéficiaire</td>
      <td>27-29</td>
      <td></td>
      <td>3</td>
      <td>F</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- N° de facture</td>
      <td>30-38</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 2</td>
    </tr>
    <tr>
      <td>- Nombre d’enre-<br />gistrements de<br />Type 3 et 4</td>
      <td>39-41</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’enregistrements de type 3 et 4<br />quel que soit le complément de type.</td>
    </tr>
    <tr>
      <td>- Total base de<br />remboursement<br />prestations<br />hospitalières</td>
      <td>42-49</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des bases de remboursement des<br />enregistrements de type 3 CP (positions<br />83-90)</td>
    </tr>
    <tr>
      <td>- Total<br />remboursable<br />par la caisse<br />pour les<br />prestations<br />hospitalières</td>
      <td>50-57</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des montants remboursables par la<br />caisse pour les prestations hospitalières,<br />des enregistrements de type 3 CP<br />(positions 94-101)</td>
    </tr>
    <tr>
      <td>- Total des<br />honoraires<br />facturés</td>
      <td>58-65</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des honoraires facturés<br />dépassements compris, des<br />enregistrements de type 4 CP (positions<br />115-121)</td>
    </tr>
    <tr>
      <td>- Total<br />remboursable<br />par la Caisse<br />pour les<br />honoraires</td>
      <td>66-73</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Total des montants remboursables par la<br />caisse pour les honoraires, des<br />enregistrements de type 4 CP (positions<br />108-114)</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 114

# **TYPE 5 : FIN FACTURE –**
# **NORME CP (établissements publics et privés)**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Total participation assuré avant participation de l’organisme complémentaire</td>
      <td>74-81</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>= total montants facturés pour les prestations hospitalières<br />- total remboursable par la caisse pour les prestations hospitalières<br />+ total honoraires facturés<br />- total remboursable par la caisse pour les honoraires</td>
    </tr>
    <tr>
      <td>- Total remboursable par les organismes complémentaires</td>
      <td>82-89</td>
      <td></td>
      <td>6+2</td>
      <td>F</td>
      <td>Total remboursable par les organismes complémentaires pour les prestations hospitalières, des enregistrements de type 3 CP (positions 122-128)</td>
    </tr>
    <tr>
      <td>- Total remboursable par les organismes complémentaires</td>
      <td>90-97</td>
      <td></td>
      <td>6+2</td>
      <td>F</td>
      <td>total remboursable par les organismes complémentaires pour les honoraires, des enregistrements de type 4 CP (positions 123-128)</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>98-114</td>
      <td>17</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Montant total facturé pour les prestations hospitalières</td>
      <td>115-122</td>
      <td></td>
      <td>6+2</td>
      <td>O</td>
      <td>Montant total facturé pour les prestations hospitalières des enregistrements de type 3 CP (positions 102-109) dépassement compris (chambre particulière, ...). Correspond au coût réel de l’hospitalisation</td>
    </tr>
    <tr>
      <td><u>- Zone éditeur</u></td>
      <td><u>123-12</u><s>6</s>6</td>
      <td>4</td>
      <td></td>
      <td></td>
      <td><u>Zone réservée à l’usage des éditeurs de logiciels pour les hôpitaux, à des fins de recyclage des rejets</u></td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>12<s>7</s>-128</td>
      <td><u>2</u></td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 115

# **TYPE 6**
# **FIN DE LOT**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 116

# **TYPE 6 : FIN LOT - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 6</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>Totalisation du lot pour le partenaire de santé.</td>
    </tr>
    <tr>
      <td>- Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td>= 6 FIN DU LOT</td>
    </tr>
    <tr>
      <td>- N° partenaire de santé + clé</td>
      <td>2-10</td>
      <td></td>
      <td>9</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
    <tr>
      <td>- Nombre de factures</td>
      <td>11-13</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’enregistrements de type 2, 2A, transmis sous le même numéro de lot. (même partenaire de santé - même organisme).</td>
    </tr>
    <tr>
      <td>- Nombre de lignes actes</td>
      <td>14-17</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>Nombre d’enregistrements de type 3, 4, 4A, pour l’ensemble des factures transmises sous un même numéro de lot.</td>
    </tr>
    <tr>
      <td>-Comptabilisation des enregistrements de types 2</td>
      <td>18-21</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td>Comptabilisation des enregistrements de type 2, 2A, 2B, 2C, <u>2E,</u> 2M, 2P, 2S si présents.</td>
    </tr>
    <tr>
      <td>- Total de tous les enregistrements de type 5</td>
      <td>22-24</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre d’enregistrements de type 5 pour l’ensemble des factures transmises sous le même numéro de lot.</td>
    </tr>
    <tr>
      <td>- Montant total général du lot prestations facturées</td>
      <td>25-33</td>
      <td></td>
      <td>7+2</td>
      <td>O</td>
      <td>Cumul des montants facturés de toutes les factures du lot.<br /><u>Norme CP</u> : Prendre en compte les montants facturés pour les honoraires et les prestations hospitalières.</td>
    </tr>
    <tr>
      <td>- Montant total général du lot prestations remboursables par l’organisme d’Ass. maladie</td>
      <td>34-42</td>
      <td></td>
      <td>7+2</td>
      <td>O</td>
      <td>Cumul des montants remboursables par l’organisme d’Assurance Maladie pour toutes les factures du lot.<br /><u>Norme CP</u> : Prendre en compte les montants remboursables pour les honoraires et les prestations hospitalières.</td>
    </tr>
    <tr>
      <td>- Montant total général du lot prestations remboursables par les organismes complémentaires</td>
      <td>43-51</td>
      <td></td>
      <td>7+2</td>
      <td>O</td>
      <td>Cumul des montants remboursables par les organismes complémentaires pour toutes les factures du lot.<br /><u>Norme CP</u> : Prendre en compte les montants remboursables pour les honoraires et les prestations hospitalières.</td>
    </tr>
    <tr>
      <td>- N° de lot</td>
      <td>52-54</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Idem type 1</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 117

# **TYPE 6 : FIN LOT - TOUTES NORMES**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th><b>CONSIGNES DE SAISIE</b></th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- indicateur de marquage des factures du lot.</td>
      <td>55</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM<br />Valeurs en SESAM : R factures réelles, T factures tests, D factures démonstrations.<br />Blanc sinon.</td>
    </tr>
    <tr>
      <td>- Type de facture</td>
      <td>56</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM<br />Hors SESAM : à blanc.<br />SESAM et SESAM dégradé : valeur <b>F</b>.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>57-60</td>
      <td>4</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- N° agrément progiciel de santé <u>ou n° de certificat pour les logiciels établissements ou raison sociale éditeur</u></td>
      <td>61-72</td>
      <td>12</td>
      <td></td>
      <td>F</td>
      <td><u>En SESAM :</u><br />Obligatoire pour les logiciels labellisés et renseignée à partir du numéro d’agrément fourni par le CNDA.<br /><u>Hors SESAM :</u><br /><u>- Obligatoire pour les logiciels établissements certifiés et renseignée avec le numéro de certificat délivré par le CNDA .</u><br /><u>- Pour les autres catégories de PS en SMTP, 12 premiers caractères de la raison sociale de l’éditeur</u><br /><u>- Autres cas, à blanc.</u></td>
    </tr>
    <tr>
      <td>- N° agrément du dispositif portable</td>
      <td>73-84</td>
      <td>12</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM<br />Numéro d’agrément du dispositif portable, ayant servi à l’élaboration des factures hors cabinet.<br />A blanc dans les autres cas.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>85-87</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Zone réservée SESAM. A blanc.</td>
    </tr>
    <tr>
      <td>- N° d’identification du PS <mark>signataire</mark></td>
      <td>88-96</td>
      <td></td>
      <td>9</td>
      <td>F</td>
      <td>Zone réservée SESAM<br />N° d’identification du PS <mark>signataire si différent du PS titulaire du lot indiqué en pos 2-10.</mark><br />Sinon à blanc.</td>
    </tr>
    <tr>
      <td>- Zone de certification</td>
      <td>97-128</td>
      <td>32</td>
      <td></td>
      <td>F</td>
      <td>Zone Réservée SESAM.</td>
    </tr>
  </tbody>
</table>

Supprimé : Zone réservée SESAM¶
Mise en forme : Puces et numéros
Supprimé : <mark>remplaçant si le lot a été sécurisé en présence de la CPS du remplaçant.</mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 118

# **TYPE 999**
# **FIN DE FICHIER**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 119

# TYPE 999 : FIN FICHIER - TOUTES NORMES

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- TYPE 999</td>
      <td></td>
      <td></td>
      <td></td>
      <td>O</td>
      <td>1 fois par envoi.<br />Il permet de délimiter la fin du fichier et<br />de donner un bilan des enregistrements<br />transmis.</td>
    </tr>
    <tr>
      <td>- Type<br />d’enregistrement</td>
      <td>1-3</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>= 999 FIN DE FICHIER.</td>
    </tr>
    <tr>
      <td>- Type émetteur</td>
      <td>4-5</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- Numéro<br />émetteur</td>
      <td>6-19</td>
      <td></td>
      <td>14</td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>20-25</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Type de<br />destinataire</td>
      <td>26-27</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- Numéro de<br />destinataire</td>
      <td>28-41</td>
      <td></td>
      <td>14</td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>42-47</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Application</td>
      <td>48-49</td>
      <td>2</td>
      <td></td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- Identification du<br />fichier</td>
      <td>50-55</td>
      <td>6</td>
      <td></td>
      <td>O</td>
      <td>Identique au type 000</td>
    </tr>
    <tr>
      <td>- Volume du<br />fichier</td>
      <td>56-63</td>
      <td></td>
      <td>8</td>
      <td>O</td>
      <td>Totalisation de l’envoi.<br />Nombre total d’enregistrements à<br />transmettre. (types 000 à 999 compris).</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>64-82</td>
      <td>19</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
    <tr>
      <td>- Nombre de lots</td>
      <td>83-85</td>
      <td></td>
      <td>3</td>
      <td>O</td>
      <td>Nombre total de lots contenus dans le<br />fichier.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>86-128</td>
      <td>43</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 120

# **ANNEXES COMMUNES A TOUTES LES NORMES**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 121

# **ANNEXE 1 TYPES DE DESTINATAIRES OU D’EMETTEURS**

**CF** - SNCF

**CP** - C.P.A.M.

**CR** - C.R.A.M.

**CT** - CENTRE DE TRAITEMENT INFORMATIQUE (Régime Général)

**MA** - MSA

**SI** - AUTRES EMETTEURS (Sociétés civiles professionnelles...)

**SM** - SECTION DES MUTUELLES NATIONALES

**SR** - CENTRE INFORMATIQUE REGIONAL (<mark>RSI</mark>) <span style="border: 1px solid blue; padding: 2px;">Supprimé : <mark>AMPI</mark></span>

**TE** - ETABLISSEMENTS

**TP** - AUTRES PARTENAIRES DE SANTE

**OT** - ORGANISME CONCENTRATEUR TECHNIQUE

**AN** - ASSEMBLEE NATIONALE

**BF** - BANQUE DE FRANCE

**CC** - CAISSE DES CULTES

**CE** - CAISSE DE RETRAITE ET DE PREVOYANCE DES CLERCS ET EMPLOYES DE NOTAIRES (CRPCEN)

**CI** - CHAMBRE DE COMMERCE ET D’INDUSTRIE DE PARIS

**CM** - CAISSE NATIONALE MILITAIRE DE SECURITE SOCIALE (CNMSS)

**EN** - ETABLISSEMENT NATIONAL DES INVALIDES DE LA MARINE (ENIM)

**PB** - PORT AUTONOME DE BORDEAUX

**RM** - SECURITE SOCIALE MINIERE

**RP** - R.A.T.P.

**SE** - CAISSES AUTONOMES DE SECURITE SOCIALE DU SENAT

**Codification réservée pour les flux de DRE :**

**OC** – Organisme Complémentaire

**CS** – Centre de Service Complémentaire

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 122

# **ANNEXE 2   GRANDS REGIMES**

01 REGIME GENERAL

02 REGIME AGRICOLE

03 REGIME SOCIAL INDEPENDANT (RSI) <span style="float: right; border: 1px solid blue; padding: 5px; font-size: small;">**Supprimé :** ASSURANCE MALADIE DES PROFESSIONS INDEPENDANTES (AMPI)</span>

04 S N C F

05 R A T P

06 ETABLISSEMENT NATIONAL DES INVALIDES DE LA MARINE (ENIM)

07 MINEURS ET ASSIMILES

08 MILITAIRES DE CARRIERE

09 PERSONNEL DE LA BANQUE DE FRANCE

10 CLERCS ET EMPLOYES DE NOTAIRE

12 CHAMBRE DE COMMERCE ET D’INDUSTRIE DE PARIS

14 ASSEMBLEE NATIONALE

15 CAISSES AUTONOMES DE SECURITE SOCIALE DU SENAT

16 PORT AUTONOME DE BORDEAUX

17 CAISSE DES FRANÇAIS DE L’ETRANGER

80 MINISTERE DES ANCIENS COMBATTANTS

90 CAISSE ASSURANCE MALADIE DES CULTES

## **MUTUELLES DECOMPTEUSES**

91 Mutuelle générale de l’Education Nationale

92 Mutuelle Générale

93 Mutuelle Générale de la Police

94 Fédération Fonctionnaires SLI

95 Mutuelle Nationale des Hospitaliers

96 Mutuelle de la Marine

99 Autres Mutuelles

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 123

# **ANNEXE 3 CODIFICATION DES ORGANISMES GESTIONNAIRES ET DESTINATAIRES**

La codification actualisée des organismes gestionnaires et destinataires est disponible sur le site Internet du GIE SESAM Vitale à l’adresse suivante <u>www.sesam-vitale.fr</u> .

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 124

# **ANNEXE 4   CODES NORMES**

<u>Auxiliaires médicaux (AM)</u>

        IF     infirmiers
        MK    masseurs-kinésithérapeutes
        OO    orthophonistes
        OY    orthoptistes
        PE    pédicures

<u>Transports</u>

        TA    transports sanitaires et taxis

<u>Laboratoires</u>

        LB    laboratoires de biologie

<u>Fournisseurs</u>

        PH    pharmaciens
        FR    produits de la LPP délivrés par professionnel agréé

<u>Ensemble prescripteuR</u>

        ER    médecins généralistes et spécialistes, chirurgiens dentistes et sages-femmes

<u>Etablissements</u>

        CP    cliniques privées et hôpitaux
        CS    centres de santé (centres de soins infirmiers, cliniques dentaires)

Centres thermaux

        CT    centres thermaux

<mark>Supprimé : ( à ne pas utiliser pour les assurés du régime agricole) ¶</mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 125

# **ANNEXE 5   VERIFICATION DES CLES**

## <u>1 CLE TYPE 1 - 2 :</u>

n° Etablissement
n° Centre de Santé
n° Praticien
n° Laboratoire
n° Pharmacien
n° Transporteur
n° Fournisseur
n° Accident du travail
n° d’organisme complémentaire

**Mode de calcul :**
- numéroter les chiffres du numéro de la droite vers la gauche,
- multiplier par 1 les chiffres de rang pair,
- multiplier par 2 les chiffres de rang impair,
- additionner l’ensemble de ces résultats, chiffre par chiffre
- déterminer le complément à 10 du chiffre unitaire de cette somme : il constitue la clé.

Exemple : n° 7 6 0 3 1 2 0 8

Rang 8 7 6 5 4 3 2 1

                        7   6   0   3   1   2   0   8

pair x 1              7       0       1       0
impair x 2              12      6       4      16

Addition            7 + 1 + 2 + 0 + 6 + 1 + 4 + 0 + 1 + 6 = 28

**CLE**                **10 - 8 = 2**

## <u>2 - CLE TYPE 97</u>

N° immatriculation assuré

Elle est calculée sur les 13 caractères significatifs :
- diviser par 97 le nombre constitué par 13 caractères,
- déterminer le complément à 97 du reste de cette division : il constitue la clé.

Exemple : 1 29 02 78 551 031 : 97 = 13301840732

reste 27

complément : 97 - 27 = 70

**la CLE est 70**

*NB : Pour les assurés nés en Corse, le couple 2A prend la valeur 19 pour le calcul de la clé et le couple 2B la valeur 18.*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 126

# **ANNEXE 6   REMPLISSAGE PARTICULIER des TYPES 3 et 4**

## **REMPLISSAGE DES TYPES 3 et 4 POUR LES ACTES GRATUITS ,**
## **NON REMBOURSABLES OU HORS NOMENCLATURE,**
## **PRISE EN CHARGE PAR L’ETAT DANS LE CADRE DE L’AME, TM OU**
## **FORFAITS COMPLEMENTAIRES DANS LE CADRE DE LA CMU**
## **OU POUR LES ACTES TRANSMIS POUR INFORMATION.**

Certains champs des types 3 et 4 (lignes de prestation) subissent un remplissage particulier pour les actes gratuits, non remboursables par les régimes obligatoires ou hors nomenclature ou pris en charge par l’Aide Médicale Etat ou encore pour le TM ou les forfaits complémentaires CMU.

### 1. <u>LES ACTES GRATUITS </u>

Les spécificités de remplissage concernent les zones suivantes du type 4 :

- Prix unitaire (positions 89-95) : remplissage comme Type 4 standard
- Base de remboursement (positions 96-102) : remplissage comme Type 4 standard
- Taux (positions 103-105) : valeur zéro
- Montant remboursable par l’organisme d’Assurance Maladie (positions 106-112) : valeur zéro
- Montant des honoraires (positions 113-119) : valeur zéro
- Qualificatif de la dépense (position 120) : valeur G

### 2. <u>LES ACTES NON REMBOURSABLES, PRIS EN CHARGE TOTALEMENT PAR L’ETAT </u>
<u>DANS LE CADRE DE L’AME, TM ou FORFAITS COMPLEMENTAIRES CMU</u>

Les spécificités de remplissage concernent les zones suivantes du type 4 ou du type 3 :

- Prix unitaire (pos 89-95 Type 4 ou pos 91-97 Type 4 CP ou pos 76-82 type 3) remplissage comme Type 4 ou Type 3 standard
- Base de remboursement (pos 96-102 Type 4 ou pos 98-104 Type 4 CP ou pos 83-90 Type 3) : valeur zéro
- Taux (pos 103-105 Type 4 ou pos 105-107 Type 4 CP ou pos 91-93 Type 3) : valeur zéro
- Montant remboursable par l’organisme d’Assurance Maladie (pos 106-112 type 4 ou pos 108-114 Type 4 CP ou pos 94-101 type 3) : valeur zéro
- Montant des honoraires ou de la dépense (pos 113-119 Type 4 ou pos 115-121 Type 4 CP ou pos 102-109 Type 3) : remplissage standard ou montant du forfait complémentaire pour la CMU.
- Qualificatif de la dépense (pos 120 Type 4 et Type 3 ou pos 122 Type 4 CP ) : valeur N
- Montant remboursable par l’organisme complémentaire (pos 122-128 Type 4 et Type 3 ou pos 123-128 Type 4 CP) : indiquer le montant total à rembourser par l’AME, TM ou montant du forfait complémentaire pour la CMU.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 127

**ANNEXE 6   REMPLISSAGE PARTICULIER des TYPES 3 et 4**

-   <u>Consignes particulières **pour les actes CCAM** pris en charge totalement par l'état (AME) ou pour les tickets modérateurs CMUC, <mark>en norme CP</mark> :</u>

    Le **Prix unitaire** (pos 91-97 Type 4 CP), le **Montant des honoraires** ou de la dépense (pos 115-121 Type 4 CP) et le **Montant remboursable par l’organisme complémentaire** (pos 123-128 Type 4 CP) sont renseignés **<u>avec le même montant.</u>**

    Ce montant de référence correspond au calcul standard de la base de remboursement de l'acte CCAM avec application des majorations liées aux modificateurs (forfait ou %, cf. TB11) et des réductions pour associations d'actes (Cf. CCAM TB2), qui ne sont pour autant pas transmises.

    *   o Pour l’AME : montant de référence
    *   o pour la CMUC : ticket modérateur du montant de référence

    Le qualificatif de la dépense est à "N".

    La base de remboursement, le taux, le montant remboursable par l’organisme d’Assurance Maladie restent à zéro.

    <u>**Pour la CMUC,** l</u>a facturation étant établie dans le cadre d’une prise en charge en part complémentaire uniquement, le type 4M ne doit pas être transmis.

    <u>**Pour les actes CCAM pris en charge totalement par l'état (AME), le type 4M doit être transmis.**</u>

## 3. <u>LES ACTES HORS NOMENCLATURE</u>

Les spécificités de remplissage concernent les zones suivantes du type 4 et type 4 CP :

- Code acte (positions 74-78 ou 76-80 en CP) : valeur HN
- Coefficient de l’acte (positions 81-86 ou 83-88 en CP) : valeur 00100
- Prix unitaire (positions 89-95 ou 91-97 en CP) : égal au montant de la dépense
- Base de remboursement (positions 96-102 ou 98-104 en CP) : valeur zéro
- Taux (positions 103-105 ou 105-107 en CP) : valeur zéro
- Montant remboursable par l’organisme d’Assurance Maladie (positions 106-112 ou 108-114 en CP) : valeur zéro
- Montant des honoraires (positions 113-119 ou 115-121 en CP) : remplissage standard
- Qualificatif de la dépense (position 120 ou 122 en CP) : valeur N

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 128

# **ANNEXE 6   REMPLISSAGE PARTICULIER des TYPES 3 et 4**

## 4. <u>LES ACTES TRANSMIS POUR INFORMATION</u>

Les spécificités de remplissage pour les consultations et soins externes à l’hôpital concernent les zones suivantes du type 4 CP :

- Code acte (positions 74-78 ou 76-80 en CP) : nature de prestation en annexe 10 (consultations et soins externes)
- Coefficient de l’acte (positions 81-86 ou 83-88 en CP) : remplissage standard
- Prix unitaire (positions 89-95 ou 91-97 en CP) : remplissage standard
- Base de remboursement (positions 96-102 ou 98-104 en CP) : remplissage standard
- Taux (positions 103-105 ou 105-107 en CP) : remplissage standard
- Montant remboursable par l’organisme d’Assurance Maladie (positions 106-112 ou 108-114 en CP) : remplissage standard
- Montant des honoraires (positions 113-119 ou 115-121 en CP) : remplissage standard
- Qualificatif de la dépense (position 120 ou 122 en CP) : valeur **I**

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 129

# **ANNEXE 7   NATURE D’OPERATION**

## **1 - PAIEMENT NORMAL**

## **3 - RAPPEL EN VALEUR**

Est utilisé, sous réserve d’un accord local, pour un rappel à la suite d’une augmentation de prix unitaire.

Cette nature d’opération est interdite pour le Régime Général et pour la Caisse de Retraite et de Prévoyance de Clercs et Employés de Notaires.

## **4 - RÉGULARISATION POSITIVE**

Est utilisée, sous réserve d’un accord local, après une régularisation négative (code 5), pour régulariser un paiement antérieur (exemple : changement de risque, de bénéficiaire, de taux de prise en charge).

Lorsque la régularisation positive est inférieure à la régularisation négative, elle génère un indu et, dans le cas contraire, un paiement complémentaire.

## **5 - RÉGULARISATION NÉGATIVE**

Est utilisée, sous réserve d’accord local, pour annuler un paiement erroné.

Elle peut exister seule ou être suivie d’une régularisation positive.

## **9 - ANNULATION FEUILLES DE SOINS ELECTRONIQUES**

Feuilles de soins électroniques SESAM annulées dans le même lot.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 130

# **ANNEXE 8   NATURE DE LA PIECE JUSTIFICATIVE DES DROITS**

## **<u>JUSTIFICATION DES DROITS AMO</u>**

0       L’assuré n’a présenté aucune pièce justificative.

1       L’assuré a présenté un bulletin de salaire, une attestation de droits, une prise en charge pour l’AME, une attestation de bénéficiaire CMU, etc...

2       L’assuré a présenté son attestation d’ouverture de droits ou le partenaire a consulté le fichier par télématique

3       Prise en charge (cliniques et cures thermales)

4       L’assuré a présenté sa Carte VITALE.

## **<u>JUSTIFICATION DES DROITS AMC</u>**

0       L’adhérent/assuré n’a présenté aucune pièce justificative

1       Le Professionnel de Santé a consulté un serveur de droits

2       L’adhérent/assuré a présenté un support de droits AMC autre que la carte Vitale

3       Prise en charge AMC

4       L’adhérent/assuré a présenté sa carte Vitale comme support de droits

NORMES B2 - Cahier des Charges – Juin 2007 avec errata                          Page 131

# **ANNEXE 9   EXONERATION DU TICKET MODERATEUR**

L’exonération du Ticket Modérateur était jusqu’alors traitée au niveau de la facture.
On pourra dorénavant, à l’intérieur d’une facture, proposer une exonération au niveau d’un acte qui sera différente de l’exonération facture.
**Le principe étant que l’exonération de niveau ligne (type 3 ou type 4) prévaut sur l’exonération de niveau facture (type 2).**

**Si le motif d’exonération est commun à toutes les lignes de la facture :**
*   et présent au niveau facture, alors les codes exonérations de niveau ligne peuvent tous être renseignés à blanc ou avec le même motif que celui de la facture.
*   Mais non significatif au niveau facture (valeur 0), alors l’exonération commune devra être indiquée sur chacune des lignes de la facture.

Attention, la valeur zéro est significative de non exonération.

En cas de pluralité de motifs d’exonération, l’appréciation médicale prévaut. On favorisera l’exonération liée à la situation personnelle du bénéficiaire.
Ex. : exonérations LIS et K50 possibles, le motif retenu est LIS.

## **CODES JUSTIFICATION D’EXONERATION OU DE MODULATION DU TICKET MODERATEUR POSSIBLE AU NIVEAU FACTURE**

0 Pas d’exonération
1 Soins en rapport avec un K ou un KC = ou > 50 (NGAP)
    A compter du 1/1/2004, les actes en rapport avec un acte « K ou Z >= 50 » non présent sur la facture, ne sont plus exonérés.
2 Soins relatifs à un séjour > 30 jours (réservé à un établissement)
3 Soins particuliers exonérés (traitement de la stérilité, soins aux prématurés, actes exonérants, soins en établissements des nourrissons dans les 30 premiers jours de vie, test de dépistage du virus HIV)
4 Soins conformes au protocole ALD
5 Assuré ou bénéficiaire exonéré (régime exonérant)
6 Réservé SESAM-VITALE pour les régimes spéciaux SNCF
7 Soins dispensés en risque maladie et exonérés dans le cadre d’un dispositif de prévention
8 Réservé Régime Général
9 FSV ou FSI (ancien FNS)
C Soins exonérés en codage **C**CAM du fait de la nature de l’acte, ou du dépassement du seuil. La facture est exonérée.

## **CODES JUSTIFICATION D’EXONERATION DU TICKET MODERATEUR POSSIBLE AU NIVEAU LIGNE**

Blanc : c’est l’exonération de niveau facture qui prime.
C Soins exonérés en codage **C**CAM du fait de la nature de l’acte. Seul l’acte concerné est exonéré.
Tous les codes existant au niveau facture, peuvent être repris au niveau ligne.

Ceci permet de régler sur une même facture des actes non exonérés et des actes exonérés par nature comme par exemple le test de dépistage du HIV ou relatifs à une affection liste, cas qui correspond à la prise en compte de l’ordonnancier bi-zone.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 132

# **ANNEXE 9 EXONERATION DU TICKET MODERATEUR**

Pour les actes exonérés au niveau ligne (exemple : test de dépistage du HIV), ils doivent être dissociés du coefficient global dans le Type 4A. Ils sont présentés dans un Type 4A isolé comportant son code d’exonération en position 54. Il y a autant de Type 4A que de codes d’exonération distincts au niveau ligne.

## **DATES D’EXONERATION A PRENDRE EN COMPTE**

### **Spécificités concernant les séjours facturés au GHS :**

<u>La facturation des séjours GHS est « indivisible ». L’exonération doit donc être constante du premier au dernier jour du séjour, sur la prestation GHS.</u>

<u>Cas des séjours supérieurs à 30 jours (code exo 2) :</u>
Pour les séjours supérieurs à 30 jours, l’exonération intervient à compter du 31<sup>ème</sup> jour suivant le premier jour d’hospitalisation (type 2 CP, position 80-85), pour les honoraires et les suppléments journaliers.
Le GHS d’une durée > à 30 jours n’est pas exonéré. En effet, quelle que soit la durée du séjour, le ticket modérateur ne varie pas au delà de la borne de 30 jours.
En cas de transfert (>48h), le GHS de l’établissement de transfert peut être exonéré, si la date de sortie est supérieure à la date de début d’hospitalisation (dans le premier GHS) + 30 jours.

<u>Cas des bénéficiaires atteint d’affections liste, hors liste ou multiples (code exo 4) :</u>
Si les soins sont conformes au protocole ALD, alors le séjour ainsi que les actes et prestations afférents sont exonérés, même si le bénéficiaire acquiert ou perd le bénéfice de son exonération en cours de séjour.

<u>Cas des exonérations régimes (code exo 5) et de la prise en charge à 100% compter du 6<sup>ème</sup> mois de grossesse (nature d’assurance maternité) :</u>
Le bénéfice de ces exonérations <u>s’évalue à la date de fin de séjour</u> (date fin de la prestation GHS) et s’applique à <u>tous les actes compris dans la période du GHS.</u>
Dans cet esprit, si la parturiente entre dans ses 4 derniers mois de grossesse durant sa période d’hospitalisation, alors la prise en charge à 100% s’applique sur l’ensemble du séjour.

### **Spécificités concernant les actes prescrits :**

<u>Cas des bénéficiaires atteint d’affections liste, hors liste ou multiples (code exo 4), cas des exonérations régimes (code exo 5) :</u>

Le bénéfice de ces exonérations s’évalue <u>à la date des soins ainsi qu’à la date de prescription des soins ; il est retenu la situation la plus favorable pour le bénéficiaire.</u>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 133

# **ANNEXE 9 EXONERATION DU TICKET MODERATEUR**

## **EXONERATION OU MODULATION DU TICKET MODERATEUR**
## **MESSAGE PRESENT SUR L’ATTESTATION DE DROITS DU REGIME GENERAL,**
## **DU REGIME AGRICOLE ET DU <u>REGIME SOCIAL INDEPENDANT</u>** ~~DES PROFESSIONS INDEPENDANTES~~

<table>
  <thead>
    <tr>
      <th><b>Situation de l’assuré ou du</b> <b>bénéficiaire ou soins particuliers</b></th>
      <th><b>Message sur l’attestation de</b> <b>droits du RG et du RA</b></th>
      <th><u>RSI</u></th>
      <th><b>Code nature</b> <b>assurance</b></th>
      <th><b>Code justification</b> <b>d’exonération</b><br /><br /><b>De niveau facture</b> <b>(Type 2), ou de niveau</b> <b>ligne (Type 3 ou 4)</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Bénéficiaire reconnu atteint d’une affection liste</td>
      <td>100 % limité au traitement prévu au protocole (liste) <sub>(1)</sub></td>
      <td>Exonération jusqu’au XXXXXX</td>
      <td>10 ou 13</td>
      <td>4</td>
    </tr>
    <tr>
      <td>Bénéficiaire reconnu atteint d’une affection hors liste</td>
      <td>100 % limité au traitement prévu au protocole (hors liste) <sub>(1)</sub></td>
      <td>Exonération jusqu’au XXXXXX</td>
      <td>10 ou 13</td>
      <td>4</td>
    </tr>
    <tr>
      <td>Bénéficiaire reconnu atteint de polypathologies</td>
      <td>100 % limité au traitement prévu au protocole (multiples) <sub>(1)</sub></td>
      <td>Exonération jusqu’au XXXXXX</td>
      <td>10 ou 13</td>
      <td>4</td>
    </tr>
    <tr>
      <td>Assuré titulaire d’une rente AT > 66,66%</td>
      <td>100% sauf médicaments à 35 % <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>5</td>
    </tr>
    <tr>
      <td>Assuré titulaire d’une pension d’invalidité</td>
      <td>100 % sauf médicaments à 35 % <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>5</td>
    </tr>
    <tr>
      <td rowspan="2">Assuré titulaire d’une pension d’invalidité et bénéficiant d’une Exonération au titre d’une affection liste.</td>
      <td>Si maladie du protocole (liste) 100% <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>4 en rapport avec l’affection liste</td>
    </tr>
    <tr>
      <td>Si maladie différente 100 % sauf médicaments à 35 %</td>
      <td></td>
      <td>10 ou 13</td>
      <td>5 non en rapport avec l’affection liste.</td>
    </tr>
    <tr>
      <td rowspan="2">Assuré titulaire d’une pension d’invalidité et bénéficiaire d’une exonération pour procédure exceptionnelle.</td>
      <td>Si maladie du protocole (hors liste) 100 % <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>4 en rapport avec l’affection liste</td>
    </tr>
    <tr>
      <td>Si maladie différente 100 % sauf médicaments à 35 %</td>
      <td></td>
      <td>10 ou 13</td>
      <td>5 non en rapport avec l’affection liste</td>
    </tr>
    <tr>
      <td rowspan="2">Assuré titulaire d’une pension d’invalidité et bénéficiaire d’une Exonération pour polypathologie</td>
      <td>Si maladie du protocole (multiples) 100 % <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>4 en rapport avec l’affection liste</td>
    </tr>
    <tr>
      <td>Si maladie différente 100 % sauf médicaments à 35 %</td>
      <td></td>
      <td>10 ou 13</td>
      <td>5 non en rapport avec l’affection liste</td>
    </tr>
    <tr>
      <td>Assuré titulaire d’une pension militaire</td>
      <td>100 % pour toutes prestations en nature <sub>(1)</sub></td>
      <td></td>
      <td>10 ou 13</td>
      <td>5</td>
    </tr>
    <tr>
      <td>Soins dispensés aux enfants ou adolescents handicapés : Exonération pour frais d’hébergement ou de traitement en établissement d’éducation spécialisée</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>4</td>
    </tr>
    <tr>
      <td>K ou KC = ou > 50 (NGAP)</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>1</td>
    </tr>
    <tr>
      <td>En CCAM, soins exonérés par la nature de l’acte ou par dépassement du seuil</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>C</td>
    </tr>
    <tr>
      <td>Séjour > 30 j<br />Cf. règles du GHS, page précédente</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>2</td>
    </tr>
    <tr>
      <td>Soins particuliers exonérés: traitement de la stérilité, soins aux prématurés, actes exonérants, soins en établissement des nourrissons dans les trente premiers jours de vie, test de dépistage du virus HIV.</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>3</td>
    </tr>
    <tr>
      <td>Soins dispensés en risque maladie et exonérés dans le cadre d’un dispositif de prévention</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10 ou 13</td>
      <td>7</td>
    </tr>
  </tbody>
</table>

(1) *A ce libellé est associé la mention du « xxxxxxxx » au « xxxxxxxx ».*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 134

Supprimé : **~~DES PROFESSIONS~~**

# **ANNEXE 9   EXONERATION DU TICKET MODERATEUR**

## **EXONERATION OU MODULATION DU TICKET MODERATEUR**
## **MESSAGE PRESENT SUR L’ATTESTATION DE DROITS**
## **DU REGIME GENERAL, DU REGIME AGRICOLE**
## **ET DU <mark><u>REGIME SOCIAL</u></mark> INDEPENDANT** 

Dans tous les cas où l’exonération de niveau ligne est possible, on peut alors trouver une exonération de niveau facture à zéro.

Pour les natures d’assurance 30 « maternité », 41 « accident du travail » et 90 « prévention maladie », le justificatif de l’exonération est toujours à zéro.

### **PAS D’EXONERATION**

<table>
  <thead>
    <tr>
      <th>Situation de l’assuré ou<br />du bénéficiaire<br />ou soins particuliers</th>
      <th>Message sur<br /><b>l’attestation de droits</b><br />du RG et du RA</th>
      <th><mark><u>RSI</u></mark></th>
      <th>Code nature<br />assurance</th>
      <th>Code justification<br />d’exonération<br />de niveau facture (Type 2) ou<br />de niveau ligne (Type 3 ou 4)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>sans exonération</td>
      <td>Néant</td>
      <td>Néant</td>
      <td>10</td>
      <td>0</td>
    </tr>
  </tbody>
</table>
Supprimé : <mark>AMPI</mark>

### **MODULATION DU TICKET MODERATEUR**

<table>
  <thead>
    <tr>
      <th>Situation de l’assuré ou<br />du bénéficiaire<br />ou soins particuliers</th>
      <th><b>Message sur l’attestation de</b><br />droits du RG et du RA</th>
      <th><mark><u>RSI</u></mark></th>
      <th>Code nature<br />assurance</th>
      <th>Code justification<br />d’exonération<br />de niveau facture (Type 2) ou<br />de niveau ligne (Type 3 ou 4)</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Assuré bénéficiant du<br />FSV ou FSI (ex FNS)</td>
      <td>F.N.S à compter du<br />xxxxxxxx</td>
      <td></td>
      <td>10</td>
      <td>9</td>
    </tr>
    <tr>
      <td>Régime Alsace<br />Moselle</td>
      <td>Régime local Alsace-<br />Moselle à compter du<br />xxxxxxxx<br />Transport et hospitalisation<br />100%, autres prestations<br />90%</td>
      <td></td>
      <td>13</td>
      <td>0</td>
    </tr>
    <tr>
      <td>Régime Alsace<br />Moselle + FSV ou<br />FSI (ex FNS).</td>
      <td>Contexte impossible sur la<br />carte Vitale</td>
      <td></td>
      <td>13</td>
      <td>9</td>
    </tr>
  </tbody>
</table>

Supprimé : <mark><s>AMPI</s></mark>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 135

# **ANNEXE 9   EXONERATION DU TICKET MODERATEUR**

## **EXONERATION OU MODULATION DU TICKET MODERATEUR**
## **MESSAGE PRESENT SUR L’ATTESTATION VITALE**

### **CAISSE DE PROTECTION SOCIALE DE LA RATP**

■ Le message sur l’attestation Vitale relevant de la Caisse de Coordination aux Assurances Sociales de l’Unité Décentralisée de la Protection Sociale RATP est en conformité avec le message de l’attestation Vitale du Régime Général.

### **CAISSE D’ASSURANCE MALADIE DES CULTES**

■ Le message sur l’attestation Vitale des bénéficiaires de la Caisse d’Assurance Maladie des Cultes ayant opté pour le régime particulier est l’un des 2 suivants :

1<sup>er</sup> cas, régime particulier sans FNS : « REGIME REDUIT LIMITE A L’HOSPITALISATION ».
2<sup>ème</sup> cas, régime particulier avec FNS : « FNS AVEC REGIME REDUIT LIMITE A L’HOSPITALISATION ».

### **CAISSE DE RETRAITE ET DE PRÉVOYANCE DES CLERCS ET EMPLOYÉS DE NOTAIRES**

■ Le message sur l’attestation Vitale d’assuré social relevant de **CAISSE DE RETRAITE ET DE PRÉVOYANCE DES CLERCS ET EMPLOYÉS DE NOTAIRES** est en conformité avec l’attestation Vitale du Régime Général.

■ Particularités :
- Pas de gestion de l’assurance 41 « accident du travail » pour la CRPCEN.
- Pas de gestion de régime local Alsace-Moselle ou frontalier.
- Le taux de remboursement pharmacie vignettes bleus est à 45%.
- FNS : toutes prestations à 85%, sauf transports à 100% et analyses à 80%

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 136

# **ANNEXE 10  CODIFICATION DES PRESTATIONS**

L’annexe 10 est externalisée du présent cahier des charges, car son rythme de mise à jour n’est pas compatible avec la périodicité de diffusion de la présente norme.

Cette annexe est désormais disponible sur le site Internet de la CNAMTS à l’adresse suivante :
**<u>www.ameli.fr</u>** .

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 137

# **ANNEXE 11  SEQUENCE DES CALCULS : ARRONDIS**

L'existence ou non d'écarts entre les montants déterminés par le professionnel de santé, et les organismes sociaux est parfois uniquement lié à des méthodes de détermination différentes de part et d'autre.

Pour éviter les divergences, les principes généraux suivants peuvent être retenus.

<u>1°) Dès qu'un montant est affecté par un taux, le résultat :</u>

- est arrondi par excès (centime supérieur) dès lors que la troisième décimale est supérieure ou égale à 5
- est arrondi par défaut (centime inférieur) dès lors que la troisième décimale est inférieure ou égale à 4.

**Cette règle s'applique par ligne d'acte telle que définie dans les enregistrements de type 3 et 4.**

Exemple : Base de remboursement x Taux = Montant remboursable
          le Montant remboursable est arrondi suivant le principe ci-dessus.

<u>2°) La chronologie de détermination des sommes imparties à chaque poste peut être la suivante :</u>

- détermination de la part assurance obligatoire

          = tarif de responsabilité x taux = A

- calcul du montant maximum à compenser en tout ou partie par l'assurance complémentaire

          = dépense réelle de l'assuré - montant assurance obligatoire = B

- calcul du ticket modérateur

          = tarif de responsabilité - part de l'assurance obligatoire = C

- Détermination de la participation maximum de l'assurance complémentaire.

Base du remboursement assurance complémentaire (ticket modérateur ou dépense réelle ou remboursement AS, ou montant forfaitaire) multiplié par taux de participation = D.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 138

# **ANNEXE 11 SEQUENCE DES CALCULS : ARRONDIS**

- Détermination de la part remboursable par l'assurance complémentaire et de la part assuré

- si D < B et différence supérieure ou égale à 2 centimes alors la part remboursable par l'assurance complémentaire = D et la part assuré = B - D

- si D < B et différence inférieure à 2 centimes alors la part remboursable par l'assurance complémentaire = B et la part assuré = O

- si D >= B, alors la part remboursable par l'assurance complémentaire = B et la part assuré = O.

A noter que dans les enregistrements 3 et 4 (lignes détails) les montants parts assurance complémentaire, et assurés, ne sont pas reportés. Ils doivent en conséquence être stockés pour la détermination de l'enregistrement 5, qui résulte du cumul des différentes sommes déterminées dans les enregistrements 3 et 4.

En définitive, la part assurance complémentaire = total des dépenses réelles - part remboursable par le régime obligatoire - part de dépense restée à la charge de l'assuré.

## <u>3°) Cas particuliers des transports sanitaires</u>

Un arrondi supplémentaire pourra être introduit dans le calcul de la part assurance obligatoire, à l’intérieur même du type 4A, dans le cas où un transport subit une majoration de nuit ou de férié.

En effet, le Prix Unitaire du forfait et le Prix Unitaire du Km peuvent subir une majoration de nuit ou une majoration de dimanche et férié. Dans ce cas, le prix unitaire majoré sera arrondi suivant la règle du 1°) :

PU forfait x Pourcentage de majoration = Sous Total

**Ce Sous Total sera arrondi dans la séquence de calcul avant multiplication par la quantité.**

Et de la même façon pour l’opération :

PU Km (<= 150 km ou > 150 km) x Pourcentage de majoration = Sous Total.

Les autres calculs suivent les règles définies plus haut.

## <u>4°) Cas particuliers des PU des médicaments dans les DOM</u>

Le PU est multiplié par le coefficient multiplicateur : ce produit est arrondi avant multiplication par la quantité. L’arrondi est effectué comme au 1°), mais au niveau du décime :

- est arrondi par excès (décime supérieur) dès lors que la deuxième décimale est supérieure ou égale à 5
- est arrondi par défaut (décime inférieur) dès lors que la deuxième décimale est inférieure ou égale à 4.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 139

# **ANNEXE 11 SEQUENCE DES CALCULS : ARRONDIS**

## <u>5°) Calcul de la BR avec application du coefficient MCO ou HAD, pour les séjours GHS et GHT</u>

L’application du coefficient MCO et HAD concerne les prestations GHS et GHT, ainsi que les suppléments journaliers (séjour extrême haut, réanimation, surveillance continue…).

<u>Le calcul de la base de remboursement s’effectue en 2 temps :</u>

- Calculer PU (du GHS, du GHT ou du suppl. jour.) x Quantité x Coefficient : ce résultat intermédiaire est arrondi selon la règle du 1°).
- On applique ensuite le coefficient MCO (Type 3 CP, pos. 71-75) à 4 décimales. Ce résultat, obtenu avec une précision à 4 décimales, est arrondi selon la règle du 1°), et nous donne la base de remboursement.

## 6°) Calcul de la base de remboursement pour les actes CCAM

Le calcul de la base de remboursement s’effectue en **3 temps** :

1- Calculer la somme des montants pour les modificateurs tarifants de type forfait. Ce résultat intermédiaire, que nous appellerons **Montant 1**, est sur 2 décimales.

2- Calculer le prix unitaire de l'acte x le coefficient des modificateurs tarifants de type coefficient puis multiplier le résultat obtenu par le coefficient d'association.
Ce résultat intermédiaire, que nous appellerons **Montant 2**, est arrondi à 2 décimales.

   Exemple avec 2 modificateurs coefficient :
   coeff 1,3 + coeff 1,5 donne un coeff de 1,8 (et non un coeff de 2,8).

3- Sommer les **montants 1 et 2 et ajouter l’éventuel supplément de charges en cabinet**, afin d'obtenir la **base de remboursement**.

Cf. exemple page suivante 🡪

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 140

# **ANNEXE 11  SEQUENCE DES CALCULS : ARRONDIS**

<u>Exemple de calcul de la base de remboursement pour un acte CCAM effectué dans les</u>
<u>conditions suivantes :</u>

- PU = 100,30 €
- un modificateur forfait de 20,50 €
- un modificateurs coefficient de 1,255
- un coefficient d'association de 0,955
- un supplément de charges en cabinet de 12,55 €

1- Montant 1 = 20,50 €

2- Montant 2
   = [(PU=100,30) x (modificateur coeff. = 1,255)] x (coeff. association = 0,955)
   = 120,2120575
   = 120,21 après arrondi à 2 décimales

3- La base de remboursement est donc de :
   Montant 1 + montant 2 + supplément de charges = 20,50 + 120,21 + 12,55 = 153,26 €

<u>7°) Calcul du montant remboursable par l’organisme d’assurance maladie obligatoire en cas</u>
<u>d’application d’un second taux, en sus du taux de remboursement standard :</u>
- <u>taux de financement, pour les délivrances de médicaments ou de LPP en</u>
  <u>établissement MCO</u>

<u>Le calcul du montant remboursable par la caisse s’effectue en 2 temps :</u>

- Calculer la base de remboursement x taux de remboursement AMO : ce résultat intermédiaire est arrondi selon la règle du 1°).
- On applique ensuite le 2ⁿᵈ taux (taux de financement).

Ce résultat est arrondi selon la règle du 1°), et nous donne le montant <u>remboursable</u>
<u>par l’organisme d’assurance maladie obligatoire, en tiers payant.</u>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 141

# **ANNEXE 12   QUALIFICATIF DE LA DEPENSE**

A      Dépassement Autorisé, codifié DA sur la feuille de soins.

B      Dépassement autorisé et Entente Directe, codifié AE sur la feuille de soins

C      Dépassement maîtrisé et Exigence du malade, codifié ME sur la feuille de soins

D      Entente directe réservée aux stomatologues et aux chirurgiens dentistes

E      Exigence particulière du malade codifiée DE sur la feuille de soins

F      Déplacement non prescrit codifié DD (dépassement pour déplacement sur la feuille de soins pour infirmier seulement). Ce code doit être positionné sur le type 4 de l’acte professionnel (AMI ou AIS) et pas sur le type 4 des frais de déplacement.

G      Acte gratuit codifié GR sur la feuille de soins

I      Acte transmis pour Information (cas des actes réalisés dans le cadre du budget global,…), ne donnant pas lieu à paiement.

M      Dépassement Maîtrisé, codifié DM sur la feuille de soins.

N      Produit ou acte, à ne pas rembourser en assurance obligatoire dans le cas considéré

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 142

# **ANNEXE 13  MODE DE TRAITEMENT**

03    HOSPITALISATION COMPLETE
04    HOSPITALISATION DE JOUR
05    HOSPITALISATION DE NUIT
06    HOSPITALISATION A DOMICILE
07    SOINS EXTERNES
10    URGENCE
11    HEBERGEMENT COMPLET OU INTERNAT
12    HEBERGEMENT DE NUIT
13    SEMI INTERNAT
14    EXTERNAT
15    PLACEMENT EN FAMILLE D'ACCUEIL
16    PRESTATIONS A DOMICILE OU EN MILIEU OUVERT
17    INTERNAT DE SEMAINE
19    TRAITEMENT ET CURES AMBULATOIRES
20    HOSPITALISATION DE SEMAINE
21    ACCUEIL DE JOUR
22    HOSPITALISATION A TEMPS PARTIEL
23    CHIRURGIE OU ANESTHESIE AMBULATOIRE
24    ACCUEIL ET P.E.C. EN SERVICE FAMILIAL THERAPEUTIQUE
35    CURES THERMALES
37    ACCUEIL EN APPARTEMENT THERAPEUTIQUE PSYCHIATRIQUE
38    ACCUEIL EN CENTRE DE POST-CURE PSYCHIATRIQUE
39    ACCUEIL EN CENTRE DE CRISE PSYCHIATRIQUE

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 143

# **ANNEXE 14   NORME CT - CODES NATURE DE VOIES P&T**

*(réservé à la norme "centres thermaux")*

<table>
    <tr>
      <td>ABBAYE</td>
      <td>ABE</td>
      <td>ESPACE</td>
      <td>ESPA</td>
      <td>PETITE AVENUE</td>
      <td>PAE</td>
    </tr>
    <tr>
      <td>AGGLOMÉRATION</td>
      <td>AGL</td>
      <td>ESPLANADE(S)</td>
      <td>ESP</td>
      <td>PETITE IMPASSE</td>
      <td>PIM</td>
    </tr>
    <tr>
      <td>AIRE(S)</td>
      <td>AIRE</td>
      <td>ETANG</td>
      <td>ETNG</td>
      <td>PETITE ROUTE</td>
      <td>PRT</td>
    </tr>
    <tr>
      <td>ALLÉE(S)</td>
      <td>ALL</td>
      <td></td>
      <td></td>
      <td>PETITE RUE</td>
      <td>PTR</td>
    </tr>
    <tr>
      <td>ANCIEN CHEMIN(S)</td>
      <td>ACH</td>
      <td>FAUBOURG</td>
      <td>FG</td>
      <td>PLACE</td>
      <td>PL</td>
    </tr>
    <tr>
      <td>ANCIENNE ROUTE(S)</td>
      <td>ART</td>
      <td>FERME(S)</td>
      <td>FRM</td>
      <td>PLACIS</td>
      <td>PLCI</td>
    </tr>
    <tr>
      <td>ANSE</td>
      <td>ANSE</td>
      <td>FONTAINE</td>
      <td>FON</td>
      <td>PLAGE(S)</td>
      <td>PLAG</td>
    </tr>
    <tr>
      <td>ARCADE(S)</td>
      <td>ARC</td>
      <td>FORT</td>
      <td>FORT</td>
      <td>PLAINE</td>
      <td>PLN</td>
    </tr>
    <tr>
      <td>AUTOROUTE</td>
      <td>AUT</td>
      <td>FORUM</td>
      <td>FORM</td>
      <td>PLAN</td>
      <td>PLAN</td>
    </tr>
    <tr>
      <td>AVENUE</td>
      <td>AV</td>
      <td>FOSSE(S)</td>
      <td>FOS</td>
      <td>PLATEAU(X)</td>
      <td>PLT</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>FOYER</td>
      <td>FOYR</td>
      <td>POINTE</td>
      <td>PNT</td>
    </tr>
    <tr>
      <td>BARRIERE(S)</td>
      <td>BRE</td>
      <td></td>
      <td></td>
      <td>PONT(S)</td>
      <td>PONT</td>
    </tr>
    <tr>
      <td>BAS CHEMIN</td>
      <td>BCH</td>
      <td>GALERIE(S)</td>
      <td>GAL</td>
      <td>PORCHE</td>
      <td>PCH</td>
    </tr>
    <tr>
      <td>BASTIDE</td>
      <td>BSTD</td>
      <td>GARE</td>
      <td>GARE</td>
      <td>PORT</td>
      <td>PORT</td>
    </tr>
    <tr>
      <td>BASTION</td>
      <td>BAST</td>
      <td>GARENNE</td>
      <td>GARN</td>
      <td>PORTE</td>
      <td>PTE</td>
    </tr>
    <tr>
      <td>BEGUINAGE(S)</td>
      <td>BEGI</td>
      <td>GRAND BOULEVARD</td>
      <td>GBD</td>
      <td>PORTIQUE(S)</td>
      <td>PORQ</td>
    </tr>
    <tr>
      <td>BERGE(S)</td>
      <td>BER</td>
      <td>GRAND(s) ENSEMBLE(S)</td>
      <td>GDEN</td>
      <td>POTERNE</td>
      <td>POT</td>
    </tr>
    <tr>
      <td>BOIS</td>
      <td>BOIS</td>
      <td>GRANDE(S) RUE(S)</td>
      <td>GR</td>
      <td>POURTOUR</td>
      <td>POUR</td>
    </tr>
    <tr>
      <td>BOUCLE</td>
      <td>BCLE</td>
      <td>GRILLE</td>
      <td>GRI</td>
      <td>PRE</td>
      <td>PRE</td>
    </tr>
    <tr>
      <td>BOULEVARD</td>
      <td>BD</td>
      <td>GRIMPETTE</td>
      <td>GRIM</td>
      <td>PRESQU'ÎLE</td>
      <td>PRQ</td>
    </tr>
    <tr>
      <td>BOURG</td>
      <td>BRG</td>
      <td>GROUPE(S)</td>
      <td>GPE</td>
      <td>PROMENADE</td>
      <td>PROM</td>
    </tr>
    <tr>
      <td>BUTTE</td>
      <td>BUT</td>
      <td>GROUPEMENT</td>
      <td>GPT</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td>QUAI</td>
      <td>QU</td>
    </tr>
    <tr>
      <td>CALE</td>
      <td>CALE</td>
      <td>HALLE(S)</td>
      <td>HLE</td>
      <td>QUARTIER</td>
      <td>QUA</td>
    </tr>
    <tr>
      <td>CAMP</td>
      <td>CAMP</td>
      <td>HAMEAU(X)</td>
      <td>HAM</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>CAMPAGNE</td>
      <td>CGNE</td>
      <td>HAUT(S) CHEMIN(S)</td>
      <td>HCH</td>
      <td>RACCOURCI</td>
      <td>RAC</td>
    </tr>
    <tr>
      <td>CAMPING</td>
      <td>CPG</td>
      <td>HIPPODROME</td>
      <td>HIP</td>
      <td>RAIDILLON</td>
      <td>RAID</td>
    </tr>
    <tr>
      <td>CARRE</td>
      <td>CARR</td>
      <td>HLM</td>
      <td>HLM</td>
      <td>RAMPE</td>
      <td>RPE</td>
    </tr>
    <tr>
      <td>CARREAU</td>
      <td>CAU</td>
      <td></td>
      <td></td>
      <td>REMPART</td>
      <td>REM</td>
    </tr>
    <tr>
      <td>CARREFOUR</td>
      <td>CAR</td>
      <td>ILE</td>
      <td>ILE</td>
      <td>RESIDENCE(S)</td>
      <td>RES</td>
    </tr>
    <tr>
      <td>CARRIERE(S)</td>
      <td>CARE</td>
      <td>IMMEUBLE(S)</td>
      <td>IMM</td>
      <td>ROC(ADE)</td>
      <td>ROC</td>
    </tr>
    <tr>
      <td>CASTEL</td>
      <td>CST</td>
      <td>IMPASSE(S)</td>
      <td>IMP</td>
      <td>ROND POINT</td>
      <td>RPT</td>
    </tr>
    <tr>
      <td>CAVEE</td>
      <td>CAV</td>
      <td></td>
      <td></td>
      <td>ROQUET</td>
      <td>ROQT</td>
    </tr>
    <tr>
      <td>CENTRE(AL)</td>
      <td>CTRE</td>
      <td>JARDIN(S)</td>
      <td>JARD</td>
      <td>ROTONDE</td>
      <td>RTD</td>
    </tr>
    <tr>
      <td>CHALET</td>
      <td>CHL</td>
      <td>JETEE(S)</td>
      <td>JTE</td>
      <td>ROUTE(S)</td>
      <td>RTE</td>
    </tr>
    <tr>
      <td>CHAPELLE</td>
      <td>CHP</td>
      <td></td>
      <td></td>
      <td>RUE(S)</td>
      <td>R</td>
    </tr>
    <tr>
      <td>CHARMILLE</td>
      <td>CHI</td>
      <td>LEVEE</td>
      <td>LEVE</td>
      <td>RUELLE(S)</td>
      <td>RLE</td>
    </tr>
    <tr>
      <td>CHÂTEAU</td>
      <td>CHT</td>
      <td>LIEU DIT</td>
      <td>LD</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>CHAUSSEE(S)</td>
      <td>CHS</td>
      <td>LOTISSEMENT(S)</td>
      <td>LOT</td>
      <td>SENTE(IER)(S)</td>
      <td>SEN</td>
    </tr>
    <tr>
      <td>CHEMIN(S)</td>
      <td>CHE</td>
      <td></td>
      <td></td>
      <td>SQUARE</td>
      <td>SQ</td>
    </tr>
    <tr>
      <td>CHEMIN VICINAL(AUX)</td>
      <td>CHV</td>
      <td></td>
      <td></td>
      <td>STADE</td>
      <td>STDE</td>
    </tr>
    <tr>
      <td>CHEMINEMENT(S)</td>
      <td>CHEM</td>
      <td>MAIL</td>
      <td>MAIL</td>
      <td>STATION</td>
      <td>STA</td>
    </tr>
    <tr>
      <td>CHEZ</td>
      <td>CHEZ</td>
      <td>MAISON FORESTIERE</td>
      <td>MF</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>CITE(S)</td>
      <td>CITE</td>
      <td>MANOIR</td>
      <td>MAN</td>
      <td>TERRE PLEIN</td>
      <td>TPL</td>
    </tr>
    <tr>
      <td>CLOITRE</td>
      <td>CLOI</td>
      <td>MARCHE(S)</td>
      <td>MAR</td>
      <td>TERRAIN</td>
      <td>TRN</td>
    </tr>
    <tr>
      <td>CLOS</td>
      <td>CLOS</td>
      <td>MAS</td>
      <td>MAS</td>
      <td>TERRASSE(S)</td>
      <td>TSSE</td>
    </tr>
    <tr>
      <td>COL</td>
      <td>COL</td>
      <td>METRO</td>
      <td>MET</td>
      <td>TERTRE(S)</td>
      <td>TRT</td>
    </tr>
    <tr>
      <td>COLLINE(S)</td>
      <td>COLI</td>
      <td>MONTEE(S)</td>
      <td>MTE</td>
      <td>TOUR</td>
      <td>TOUR</td>
    </tr>
    <tr>
      <td>CONTOUR</td>
      <td>CTR</td>
      <td>MOULIN(S)</td>
      <td>MLN</td>
      <td>TRAVERSE</td>
      <td>TRA</td>
    </tr>
    <tr>
      <td>CORNICHE(S)</td>
      <td>COR</td>
      <td>MUSEE</td>
      <td>MUS</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>COTE(AU)</td>
      <td>COTE</td>
      <td></td>
      <td></td>
      <td>VAL(LEE) (LON)</td>
      <td>VAL</td>
    </tr>
    <tr>
      <td>COTTAGE(S)</td>
      <td>COTT</td>
      <td>NOUVELLE ROUTE</td>
      <td>NTE</td>
      <td>VENELLE(S)</td>
      <td>VEN</td>
    </tr>
    <tr>
      <td>COUR</td>
      <td>COUR</td>
      <td></td>
      <td></td>
      <td>VIA</td>
      <td>VIA</td>
    </tr>
    <tr>
      <td>COURS</td>
      <td>CRS</td>
      <td>PALAIS</td>
      <td>PAL</td>
      <td>VIEILLE ROUTE</td>
      <td>VTE</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>PARC(S)</td>
      <td>PARC</td>
      <td>VIEUX CHEMIN</td>
      <td>VCHE</td>
    </tr>
    <tr>
      <td>DARSE</td>
      <td>DARS</td>
      <td>PARKING</td>
      <td>PKG</td>
      <td>VILLA(S)</td>
      <td>VLA</td>
    </tr>
    <tr>
      <td>DEGRE(S)</td>
      <td>DEG</td>
      <td>PARVIS</td>
      <td>PRV</td>
      <td>VILLAGE(S)</td>
      <td>VLGE</td>
    </tr>
    <tr>
      <td>DESCENTE(S)</td>
      <td>DSC</td>
      <td>PASSAGE</td>
      <td>PAS</td>
      <td>VOIE(S)</td>
      <td>VOI</td>
    </tr>
    <tr>
      <td>DIGUE(S)</td>
      <td>DIG</td>
      <td>PASSAGE A NIVEAU</td>
      <td>PN</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>DOMAINE(S)</td>
      <td>DOM</td>
      <td>PASSE(S)</td>
      <td>PASS</td>
      <td>ZONE</td>
      <td>ZONE</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td>PASSERELLE(S)</td>
      <td>PLE</td>
      <td>ZONE D'ACTIVITES</td>
      <td>ZA</td>
    </tr>
    <tr>
      <td>ECLUSE(S)</td>
      <td>ECL</td>
      <td>PATIO</td>
      <td>PAT</td>
      <td>ZONE D'AMENAGEMENT CONCERTE</td>
      <td>ZAC</td>
    </tr>
    <tr>
      <td>EGLISE</td>
      <td>EGL</td>
      <td>PAVILLON(S)</td>
      <td>PAV</td>
      <td>ZONE D'AMENAGEMENT DIFFERE</td>
      <td>ZAD</td>
    </tr>
    <tr>
      <td>ENCEINTE</td>
      <td>EN</td>
      <td>PERIPHERIQUE</td>
      <td>PERI</td>
      <td>ZONE INDUSTRIELLE</td>
      <td>ZI</td>
    </tr>
    <tr>
      <td>ENCLAVE</td>
      <td>ENV</td>
      <td>PERISTYLE</td>
      <td>PSTY</td>
      <td>ZONE A URBANISER EN PRIORITE</td>
      <td>ZUP</td>
    </tr>
    <tr>
      <td>ENCLOS</td>
      <td>ENC</td>
      <td>PETITE(S) ALLEE(S)</td>
      <td>PTA</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>ESCALIER(S)</td>
      <td>ESC</td>
      <td>PETIT CHEMIN</td>
      <td>PCH</td>
      <td></td>
      <td></td>
    </tr>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 144

# **ANNEXE 15  NORME CT - CODIFICATION**

## **CODES CIVILITES, COMPLEMENTS N° DE VOIES**
## **ET CATEGORIES D'ETABLISSEMENTS INTERESSES**
## **( NORME "CENTRE THERMAUX")**

<u>CODE CIVILITE</u>

M    MONSIEUR
MME MADAME
MLE  MADEMOISELLE
SAN  PERSONNE MORALE

<u>COMPLEMENT N° VOIE</u>

B BIS
T TER
Q QUATER
C QUINQUIES

<u>CATEGORIES ETABLISSEMENT AUTORISEES</u>

126 ETABLISSEMENT THERMAL

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 145

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

## **ETABLISSEMENT PRIVES**

Les consignes de remplissage suivantes concernent le type 3 de l'acte PJ ou de l’acte GHS

### **1. Prix unitaire - type 3 - positions 76 à 82**

Le prix unitaire correspond au prix de journée incluant le forfait journalier, ou au prix du GHS incluant les forfaits journaliers.

### **2. Base de remboursement - type 3 - positions 83 à 90**

Ce montant correspond au prix unitaire multiplié par la quantité de jours facturés pour l'acte PJ. Pour les actes GHS et EXH, la base de remboursement sera égale au prix unitaire multiplié par la quantité, multiplié par le coefficient réducteur, multiplié par le coefficient MCO.

### **3. Montant remboursable par la caisse - type 3 - positions 94 à 101**

#### <u>3.1 Le bénéficiaire est exonéré du ticket modérateur et supporte le forfait journalier</u>

Ce cas concerne les malades exonérés du ticket modérateur et qui doivent régler le forfait journalier.

Le montant remboursable par la Caisse est égal à la base de remboursement de laquelle est déduit le montant unitaire du forfait journalier multiplié par le nombre de jours facturés soit :

Montant remboursable par la Caisse = base de remboursement - (FJ x quantité)

Le montant remboursable par l'organisme complémentaire est égal soit au prix unitaire du forfait journalier multiplié par la quantité si l'organisme complémentaire prend en charge le forfait, soit à zéro dans le cas contraire.

Le code prise en charge du forfait journalier (type 3 - position 70) prend la valeur A

<u>Cas particulier</u> : le forfait journalier est supérieur au ticket modérateur et le ticket modérateur est à la charge du bénéficiaire

Exemple : Prix de journée        = 30 euros
           Ticket modérateur     = 6 euros (80%)
           Forfait journalier    = 14 euros

La règle est de porter le ticket modérateur à hauteur du forfait journalier.

La base de remboursement du type 3 concernant le prix de journée est égale au prix de journée multiplié par le nombre de jours facturés.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 146

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

Le montant remboursable est égal à la base de remboursement de laquelle est déduit le forfait journalier multiplié par le nombre de jours soit :

Montant remboursable = base de remboursement - ( FJ x Quantité)

Le montant remboursable par l'organisme complémentaire est égal au montant unitaire du forfait multiplié par la quantité si cet organisme prend en charge le forfait journalier.

Le code prise en charge du forfait journalier (type 3 - position 70) prend la valeur A

## <u>3.2 Le ticket modérateur est à la charge de l'assuré (hors régime Alsace Moselle et Assurance Maladie des Actifs de l’Unité Décentralisée de Protection Sociale RATP)</u>

Le montant remboursable par le régime obligatoire est alors égal à la base de remboursement multiplié par le taux.

Le montant remboursable par l'organisme complémentaire est égal soit au montant du ticket modérateur si l'organisme complémentaire prend en charge le forfait, soit au montant du ticket modérateur duquel est déduit le forfait dans le cas contraire.

Le code prise en charge du forfait journalier (type 3 - position 70) prend la valeur A

## <u>3.3 Le forfait journalier est à la charge du régime obligatoire</u>

Cette situation concerne les assurés exonérés du forfait journalier pour les séjours:

- relatifs à un accident de travail (nature d'assurance = 41)
- relatifs à une maternité (nature d'assurance = 30)
- se situant pendant la période d'exonération du ticket modérateur due à une maternité
- des bénéficiaires de l'article 115 du Code des pensions militaires
- relatifs à leur affection des enfants de moins de 20 ans handicapés
- les nourrissons dont le début d'hospitalisation se situe dans les 30 jours suivant leur naissance;
- les prématurés hébergés dans un centre ou service spécialisé;
- les séjours pris en charge au titre de l'assurance maladie au delà des 12 jours après un accouchement ;
- les exonérations du forfait journalier accordées par les Services Médicaux des régimes obligatoires d'assurance maladie

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 147

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

Le montant remboursable par le régime obligatoire est alors égal à la base de remboursement.

Le code prise en charge du forfait journalier (type 3 - position 70) prend la valeur R

## <u>3.4 Le forfait journalier est à la charge du régime Alsace Moselle</u>

Le montant remboursable par la Caisse est égal à la base de remboursement

La valeur du code prise en charge forfait journalier (type 3 - position 70) est égal à L

## **4. Forfait journalier du jour de sortie**

Ce forfait s'applique uniquement dans le cas d'une sortie définitive de l'établissement (« **S** ») sans transfert, ni décès.
Pour un séjour GHS, ce forfait s’applique pour les « Natures d’interruption ou de fin de séjours », position 81 du type 3S, égales à **S**, **E** ou **R**.

Il convient de transmettre un type 3 comme suit

### <u>4.1 Le forfait journalier de sortie est à la charge de l'assuré</u>

- Code : FJA
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 0 %
- Base de remboursement : prix unitaire
- Montant remboursable : zéro
- Qualificatif de la dépense : N

### <u>4.2 Le forfait journalier de sortie est à la charge du régime obligatoire</u>

- Code : FJR
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 100 %
- Base de remboursement : prix unitaire
- Montant remboursable : prix unitaire

### <u>4.3 Le forfait journalier de sortie est à la charge du régime Alsace-Moselle</u>

- Code : FRL
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 100 %
- Base de remboursement : prix unitaire
- Montant remboursable : prix unitaire

Les actes FJA, FJR et FRL suivent immédiatement dans leur présentation, l’acte PJ, GHS ou EXH.

La date du forfait journalier du jour de sortie, correspond au lendemain de la date du dernier PJ facturé ou à la date de fin de l’acte GHS.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 148

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

## **ETABLISSEMENTS PUBLICS HORS DOTATION GLOBALE**

Les consignes de remplissage suivantes concernent le type 3 de l'acte PJ.

### **1. Prix unitaire - type 3 - positions 76 à 82**

Le prix unitaire correspond au tarif de responsabilité qui exclut le forfait journalier.

### **2. Base de remboursement - type 3 - positions 83 à 90**

Ce montant correspond au prix unitaire multiplié par la quantité de jours facturés.

### **3. Montant remboursable par la caisse - type 3 - positions 94 à 101**

Les dispositions spécifiques au forfait journalier du jour de sortie sont précisées au point 4 ci-après.

### <u>3.1 Le bénéficiaire est exonéré du ticket modérateur et supporte le forfait journalier</u>

Le montant remboursable est égal à la base de remboursement.

La valeur du code prise en charge forfait (type 3 - position 70) est égale à A.

<u>Cas particulier</u> : le forfait journalier est supérieur au ticket modérateur et où le ticket modérateur est à la charge de l'assuré

Exemple :    Prix de journée      = 30 euros
             Ticket modérateur    = 6 euros (80%)
             Forfait journalier   = 14 euros

Le montant remboursable par le régime obligatoire du type 3 concernant le prix de journée est égal à la base de remboursement soit le prix unitaire multiplié par la quantité de jours facturés.

Le montant remboursable par l'organisme complémentaire est égal, soit au montant du prix unitaire du forfait multiplié par la quantité dans le cas où l'organisme prend en charge le forfait, dans le cas contraire il est à zéro

La valeur du code prise en charge forfait (type 3 - position 70) est égale à A.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 149

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

## <u>3.2 Le ticket modérateur est à la charge de l'assuré (hors régime Alsace Moselle et Assurance Maladie des Actifs de l’Unité Décentralisée de Protection Sociale RATP)</u>

Le montant remboursable par le régime obligatoire est égal à la base de remboursement multiplié par le taux à laquelle s'ajoute le montant du prix unitaire du forfait journalier multiplié par la quantité

Montant remboursable par le régime obligatoire = (base de remboursement x taux) + (quantité x FJ)

Le montant remboursable par l'organisme complémentaire est égal soit au ticket modérateur dans le cas où l'organisme prend en charge le forfait, soit au ticket modérateur moins le forfait journalier dans le cas contraire.

La valeur du code prise en charge du forfait (type 3 - position 70) est égal à A.

## <u>3.3 Le forfait journalier est à la charge du régime obligatoire</u>

Cette situation concerne les séjours:

- relatifs à un accident de travail
- relatifs à une maternité
- se situant pendant la période d'exonération du ticket modérateur due à une maternité
- des bénéficiaires de l'article 115 du Code des pensions militaires
- relatifs à leur affection des enfants de moins de 20 ans handicapés
- des nourrissons dont l'hospitalisation se situe dans les 30 jours suivant leur naissance
- des bénéficiaires d'exonérations exceptionnelles du forfait journalier accordées par les Services médicaux des régimes obligatoires.
- les prématurés hébergés dans un centre ou service spécialisé;
- les séjours pris en charge au titre de l'assurance maladie au delà des 12 jours après un accouchement par césarienne;

Le montant remboursable par le régime obligatoire est alors égal à la base de remboursement à laquelle est ajouté le montant du prix unitaire du forfait journalier multiplié par la quantité :

Montant remboursable = base de remboursement + (FJ x quantité)

Le montant remboursable par l'organisme complémentaire est égal à zéro.

La valeur du code prise en charge du forfait (type 3 - position 70) est égale à R.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 150

# **ANNEXE 16     NORME CP - TRAITEMENT DU FORFAIT JOURNALIER**

### <u>3.4 Le forfait journalier est à la charge du régime Alsace Moselle</u>

Le montant remboursable par le régime obligatoire est alors égal à la base de remboursement à laquelle est ajouté le montant du prix unitaire du forfait journalier multiplié par la quantité :

Montant remboursable = base de remboursement + (FJ x quantité)

Le montant remboursable par l'organisme complémentaire est égal à zéro.

La valeur du code prise en charge du forfait (type 3 - position 70) est égale à L.

## **4. Forfait journalier du jour de sortie**

Ce forfait s'applique uniquement dans le cas d'une sortie définitive de l'établissement (« S ») sans transfert, ni décès.

Pour un séjour GHS, ce forfait s’applique pour les « natures d’interruption ou de fin de séjour », position 81 du type 3S, égales à S, E ou R.

Il convient de transmettre un type 3 comme suit

### <u>4.1 Le forfait journalier de sortie est à la charge de l'assuré</u>

- Code : FJA
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 0 %
- Base de remboursement : prix unitaire
- Montant remboursable : zéro
- Qualificatif de la dépense : N

### <u>4.2 Le forfait journalier de sortie est à la charge du régime obligatoire</u>

- Code : FJR
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 100 %
- Base de remboursement : prix unitaire
- Montant remboursable : prix unitaire

### <u>4.3 Le forfait journalier de sortie est à la charge du régime Alsace-Moselle</u>

- Code : FRL
- Quantité : 1
- Prix unitaire : montant journalier du forfait
- Taux applicable à la prestation : 100 %
- Base de remboursement : prix unitaire
- Montant remboursable : prix unitaire

## **HOSPITALISATION A DOMICILE – PRIVEE ou PUBLIQUE**

L’hospitalisation à domicile (GHT) n’est pas concernée par le forfait journalier

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 151

# **ANNEXE 17   LA TRANSMISSION INTER-REGIMES**

## **1) OBJECTIFS DE LA TRANSMISSION AU MOYEN D'UN RESEAU UNIQUE**

Permettre au Partenaire de Santé, d'échanger des flux avec les différents organismes sociaux, au moyen d'une seule connexion, <u>via un réseau tiers de son choix relié</u> au Réseau SESAM Vitale (RSV). ~~Santé Social~~ ~~R.S.S.~~

## **2) DESCRIPTION GENERALE DE LA SOLUTION RETENUE**

La solution retenue s'appuie sur plusieurs principes :

2.1 - Eclatement à la source chez le Partenaire de Santé des flux normalisés en autant de fichiers que ~~de centres informatiques destinataires ou~~ d’organismes destinataires.

2.2 - Prise unique de raccordement, <u>via un réseau tiers, au Réseau SESAM Vitale (RSV),</u> ce dernier n'assurant que la partie transport des informations (reroutage); il n'y a dans le réseau, ni stockage intermédiaire, ni traitement des informations. ~~vers un réseau (~~ ~~régime général ou S~~

2.3 - Maîtrise par chaque régime de ses relations avec les Partenaires de Santé; chaque régime assurant la sécurité de son système de traitement des flux normalisés.

## **3) DESCRIPTION TECHNIQUE**

<u>Les modalités de transfert en mode Xmodem et Pesit ont été supprimées du présent cahier des charges. </u>

<u>Dorénavant, possibilité est offerte à tous les PS de procéder aux transferts de fichiers B2 en mode SMTP.</u>

<u>Tout PS démarrant les télétransmissions devra obligatoirement utiliser ce protocole de transmission.</u>

**En SESAM Vitale (SMTP) pour les normes :**

<table>
    <tr>
      <td><u>- Infirmiers</u></td>
      <td><u>IF</u></td>
    </tr>
    <tr>
      <td><u>- Masseurs-Kinésithérapeutes</u></td>
      <td><u>MK</u></td>
    </tr>
    <tr>
      <td><u>- Orthophonistes</u></td>
      <td><u>OO</u></td>
    </tr>
    <tr>
      <td><u>- Orthoptistes</u></td>
      <td><u>OY</u></td>
    </tr>
    <tr>
      <td><u>- Pédicures</u></td>
      <td><u>PE</u></td>
    </tr>
    <tr>
      <td><u>- Dispensaires Centres de santé</u></td>
      <td><u>CS</u></td>
    </tr>
    <tr>
      <td><u>- Laboratoires</u></td>
      <td><u>LB</u></td>
    </tr>
    <tr>
      <td><u>- Ensemble prescripteuR : généralistes, spécialistes,</u></td>
      <td></td>
    </tr>
    <tr>
      <td><u>  chirurgiens-dentistes, sages-femmes, structures</u></td>
      <td></td>
    </tr>
    <tr>
      <td><u>  de scanographie, …</u></td>
      <td><u>ER</u></td>
    </tr>
    <tr>
      <td><u>- Pharmaciens</u></td>
      <td><u>PH</u></td>
    </tr>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 152

# ANNEXE 17 LA TRANSMISSION INTER-REGIMES

<table>
  <thead>
    <tr>
      <th colspan="2"><b>En hors SESAM mais SMTP, avec chiffrement de transport, pour les normes :</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Centres thermaux</td>
      <td>CT</td>
    </tr>
    <tr>
      <td>- Transports sanitaires</td>
      <td>TA</td>
    </tr>
    <tr>
      <td>- Cliniques privées, <u>hôpitaux publics, établissements ex DG</u><br />et autres établissements de soins</td>
      <td>CP</td>
    </tr>
    <tr>
      <td>- Fournisseurs (en attente de SESAM)</td>
      <td>FR</td>
    </tr>
  </tbody>
</table>

Les modalités de transmissions par protocole SMTP, avec ~~<u>un éventuel</u>~~ chiffrement de transport, sont décrites dans les annexes disponibles sur Internet, <u>sur le site du GIE SESAM Vitale,</u> dans la rubrique « Editeurs de logiciels » :

*   Pour les flux SESAM : ANNEXE 4 Télécommunications (sur Réseau IP) et chiffrement de transport.

> **Supprimé :** un éventuel

<u>sur le site de la CNAMTS,</u> dans la rubrique « <u>Connaître l’assurance maladie /</u> documentation technique » :

*   Pour les Cliniques : <u>Procédure de chiffrement des flux IRIS B2 pour les cliniques privées (mai 2004)</u>, *ce document décrit les démarches à effectuer par les cliniques privées pour mettre en place la procédure de chiffrement des flux IRIS B2.*
*   Pour les Cliniques : L’annexe « chiffrement de transport <u>des flux IRIS</u> » au Cahier des charges des éditeurs hors SESAM Vitale (juillet 2004)
*   Pour les hôpitaux : <u>Spécifications techniques du transport des flux hospitaliers pour les établissements de santé - version 1.00</u>
*   <u>Pour les professions hors SESAM : » Spécifications techniques du transport des flux B2 par messagerie SMTP et chiffrement de transport » hors établissements publics, PSPH et cliniques privées</u>

> **Supprimé :** <#>~~Pour les flux SESAM : <u>Les flux SMTP et SESAM Vitale</u>, *ce document détaille l'utilisation du format SMTP et des différents champs d'un message électronique dans le cadre de la création d'une Feuille de Soins Électronique.*~~ ¶

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 153

# **<u>ANNEXE 20</u>** **<u>LES REGIMES SPECIAUX MEMBRES DE L'UNRS</u>**

* Caisse de Prévoyance et de Retraite du personnel de la SNCF
* Unité Décentralisée de Protection Sociale de la RATP
* Etablissement National des Invalides de la Marine
* Caisse Autonome de Sécurité Sociale dans les Mines
* Caisse Nationale Militaire de Sécurité Sociale
* Caisse de Prévoyance Maladie de la Banque de France
* Caisse de Retraite et de Prévoyance des Clercs et Employés de Notaire,
* Caisse Autonome de la Chambre de Commerce et d'industrie de Paris,
* Caisse Autonome de Sécurité Sociale de l'Assemblée Nationale
* Caisse de Prévoyance du Port Autonome de Bordeaux
* Caisses Autonomes de Sécurité Sociale du Sénat

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 154

# **ANNEXE 21 CODIFICATION DES ZONES TARIFS**

## **MEDECINS**

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec ID ou MD</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><strong>CONVENTIONNE – code convention 1</strong></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>11</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><strong>X</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>22</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>23</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>24</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>25</td>
      <td>ZONE B</td>
      <td>Agglomération + 50.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td colspan="5"><strong>CONVENTIONNE HONORAIRES LIBRES – code convention 3</strong></td>
    </tr>
    <tr>
      <td>30</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>31</td>
      <td>ZONE A</td>
      <td>Paris</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>32</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>33</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>34</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>35</td>
      <td>ZONE B</td>
      <td>Agglomération + 50.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td colspan="5"><strong>NON CONVENTIONNE – code convention 0</strong></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><strong>ID</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td><strong>ID</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>60</td>
      <td>ZONE C</td>
      <td>Agglomération +100.000 hab</td>
      <td><strong>ID</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>70</td>
      <td>ZONE D</td>
      <td>Autres départements et localités</td>
      <td><strong>ID</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td colspan="5"><strong>CONVENTIONNE DEPASSEMENT PERMANENT – code convention 2</strong></td>
    </tr>
    <tr>
      <td>80</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>81</td>
      <td>ZONE A</td>
      <td>Paris</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>82</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>83</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>84</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>85</td>
      <td>ZONE B</td>
      <td>Agglomération + 50.000 hab</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td colspan="5"><strong>MEDECINS SALARIES d’établissement ou de centre de santé</strong></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>11</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><strong>X</strong></td>
      <td></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
    <tr>
      <td>22</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td><strong>X</strong></td>
      <td><strong>X</strong></td>
    </tr>
  </tbody>
</table>

*RP : Certaines communes en région parisienne*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 155

# **ANNEXE 21 CODIFICATION DES ZONES TARIFS**

## ***CHIRURGIENS - DENTISTES*** ***Spé 19*** ***<u>et 36</u>***

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec IF</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><b>CONVENTIONNE – code convention 1</b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b>NON CONVENTIONNE – code convention 0</b></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>60</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b><b>SALARIE D’UN CENTRE DE SANTE</b></b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

## ***SAGES FEMMES*** ***Spé 21***

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>IF ou IFA</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><strong>CONVENTIONNE – code convention 1</strong></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><strong><b>NON CONVENTIONNE– code convention 0</b></strong></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris, RP, Lyon et Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><strong><b>SALARIEE D’UN ETABLISSEMENT OU D’UN CENTRE DE SANTE</b></strong></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

## ***INFIRMIERES*** ***Spé 24***

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec IFA</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><b><b>CONVENTIONNE– code convention 1</b></b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td colspan="5"><b>NON CONVENTIONNE – code convention 0</b></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris,RP, Lyon et Marseille</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td>60</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td colspan="5"><b><b>SALARIEE d’un établissement, d’un centre de santé ou d’un laboratoire</b></b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td><b>X</b></td>
      <td><b>X</b></td>
    </tr>
  </tbody>
</table>

*RP : Certaines communes en région parisienne*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 156

# **ANNEXE 21  CODIFICATION DES ZONES TARIFS**

***AUXILIAIRES MEDICAUX***
                         ***Masseur Kinésithérapeutes***              ***spé 26***
                                         ***Pédicures***              ***spé 27***
                                    ***Orthophonistes***              ***spé 28***
                                       ***Orthoptistes***             ***spé 29***

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec IFA</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><b>CONVENTIONNE – code convention 1</b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>30</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b>NON CONVENTIONNE – code convention 0</b></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris,RP, Lyon et Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>60</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b>SALARIE d’un établissement ou d’un centre de santé</b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris,RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>30</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

*RP : Certaines communes en région parisienne*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 157

# **ANNEXE 21  CODIFICATION DES ZONES TARIFS**

## ***LABORATOIRES***

*   ***Laboratoires d'analyses médicales*** **spé 30**
*   ***Directeurs de laboratoire médecin*** **spé 38**
*   ***Laboratoires polyvalent*** **spé 39**
*   ***Laboratoires d'anatomo-cythopathologie*** **spé 40**

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec ID</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><strong><b>CONVENTIONNE pour spécialité 30, 39 et 40– code convention 1</b></strong></td>
    </tr>
    <tr>
      <td>11</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>22</td>
      <td>ZONE B</td>
      <td>Lyon et Marseille</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>23</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 habitants</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>24</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 habitants</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>25</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th>ZT</th>
      <th>Zone</th>
      <th>Zone Géographique</th>
      <th>Avec ID</th>
      <th>Avec IK</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td colspan="5"><b><b>CONVENTIONNE pour spécialité 38 – code convention 1</b></b></td>
    </tr>
    <tr>
      <td>10</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>11</td>
      <td>ZONE A</td>
      <td>Paris et RP</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>20</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>22</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>23</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>24</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>25</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b><b>CONVENTIONNE HL pour spécialité 38– code convention 3</b></b></td>
    </tr>
    <tr>
      <td>32</td>
      <td>ZONE B</td>
      <td>Paris, Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>33</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>34</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>35</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b><b>CONVENTIONNE DP pour spécialité 38 – code convention 2</b></b></td>
    </tr>
    <tr>
      <td>81</td>
      <td>ZONE A</td>
      <td>Paris</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>82</td>
      <td>ZONE B</td>
      <td>Lyon, Marseille</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>83</td>
      <td>ZONE B</td>
      <td>Agglomération +300.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>84</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td>85</td>
      <td>ZONE B</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td>X</td>
    </tr>
    <tr>
      <td colspan="5"><b><b>NON CONVENTIONNE – code convention 0</b></b></td>
    </tr>
    <tr>
      <td>40</td>
      <td>ZONE A</td>
      <td>Paris, RP, Lyon et Marseille</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>50</td>
      <td>ZONE B</td>
      <td>Agglomération +100.000 hab</td>
      <td>X</td>
      <td></td>
    </tr>
    <tr>
      <td>60</td>
      <td>ZONE C</td>
      <td>Autres départements et localités</td>
      <td>X</td>
      <td></td>
    </tr>
  </tbody>
</table>

*RP : Certaines communes en région parisienne*

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 158

# <u>**ANNEXE 22** **ETABLISSEMENT EN DOTATION ANNUELLE**</u>
**Hôpitaux publics, PSPH, hôpitaux militaires**

Les hôpitaux publics et militaires, les PSPH sont amenés à mettre en œuvre des échanges avec les organismes d’assurance maladie pour :

- les frais de séjour des assurés migrants,
- les frais de séjour des bénéficiaires pris en charge à 100 % par l’Aide Médicale Etat,
- le forfait journalier des bénéficiaires relevant du régime local Alsace Moselle
- <u>~~le forfait journalier des bénéficiaires relevant de la CMU~~</u>
- les prestations, les actes et les consultations externes hors dotation globale,
- <u>~~les soins et consultations externes pour les établissements dans le champ de la T2A~~</u>
- le Ticket Modérateur <u>~~des soins et consultations externes~~</u> des assurés relevant de la CMU ~~Supprimé : a part résiduelle (~~
pour les établissements hors champ de la T2A. ~~Supprimé : et forfait journalier)~~

**LES FRAIS DE SEJOUR**

<u>1 - des assurés migrants</u>

Les frais de séjour doivent être indiqués en type 3 avec les rubriques DMT-MT renseignées.

La règle de gestion du forfait journalier des établissements publics détaillée en annexe 16, s’applique aux hôpitaux publics en dotation globale.

<u>2 - des bénéficiaires pris en charge à 100 % par l’Etat</u>

Présence obligatoire en type 2 du Top mutuelle M (position 128 ou du numéro national de l’Aide Médicale Etat 75500017 (positions 119-128).

Les frais de séjour doivent être indiqués en type 3.

<u>Consignes particulières sur certaines zones :</u>
- Taux (positions 91-93): valeur zéro
- Montant remboursable par l’organisme d’assurance Maladie (positions 94-101) : valeur zéro
- Montant total de la dépense (positions 102-109) : remplissage standard type 3.
- Qualificatif de la dépense (position 120) valeur N, non remboursable au titre du régime obligatoire.
- Montant remboursable par l’organisme complémentaire Aide Médicale (positions 122-128) valeur : Montant de la dépense (PJ x Qté + FJ x Qté et dépassements).

**LE FORFAIT JOURNALIER DES BENEFICIAIRES RELEVANT DU REGIME LOCAL ALSACE MOSELLE**

Type 3 - DMT-MT renseignés.
- Code prestation : FJL
- Prix unitaire : montant du forfait journalier.
- Base de remboursement : prix unitaire x quantité,
- Taux applicable à la prestation : 0
- Montant remboursable : égal à la base de remboursement

Forfait journalier du jour de sortie : code prestation FRL, cf. consignes en annexe 16.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 159

**<u>ANNEXE 22</u> <u>ETABLISSEMENT EN DOTATION ANNUELLE</u>**
**Hôpitaux publics, PSPH, hôpitaux militaires**

# **LES PRESTATIONS ACTES ET CONSULTATIONS EXTERNES HORS DOTATION GLOBALE**

<u>1 - Forfaits techniques de scanographie et d’IRMN</u>

Les forfaits techniques sont facturables dès lors qu’ils sont effectués sur des malades non hospitalisés dans l’établissement en dotation globale.

Ils seront présentés dans des enregistrements de type 4 avec des DMT-MT égales à :

- 035 - 19 pour les scanners
- 753 - 19 pour les IRMN.

<u>2 - Consultations, actes et soins externes</u>

<u>Pour les établissements en dehors du champ de la T2A, l’</u>ensemble de ces actes est positionné en type 4 avec DMT = 000 et MT = 07.
Le numéro de l’exécutant est le numéro de l’hôpital.
La spécialité du médecin exécutant est obligatoire.

<u>3 - La pharmacie hospitalière</u>

Elle est facturable en type 4 avec DMT = 000 et MT = 07.

Le numéro du prescripteur est soit le numéro du médecin libéral soit le numéro de l’hôpital.
Le numéro de l’exécutant est le numéro de l’hôpital, la spécialité est égale à 50.

Les codes prestations à utiliser sont ceux relatifs à la pharmacie (cf annexe 10).

Pour les bénéficiaires pris en charge à 100 % par l’Etat, ces prestations ou actes seront présentés de la manière suivante :
- les zones taux et montant remboursable par la caisse seront renseignées à zéro,
- le qualificatif de la dépense (position 122) égal à N,
- le montant remboursable par l’organisme complémentaire (Etat) égal au montant des honoraires.

# **LA PART RESIDUELLE A LA CHARGE DE LA CMU**

Il s’agit du forfait journalier et du ticket modérateur relatifs aux frais de séjour et aux actes, prestations ou consultations externes inclus dans la dotation globale de fonctionnement.

Le ticket modérateur relatif aux frais de séjour sera identifié PJC.
Le forfait journalier complémentaire : FJC.

<u>Pour les établissements en dehors du champ de la T2A,</u> le ticket modérateur des actes et prestations effectués en consultation externe sera identifié sous le code de chaque prestation, **la part complémentaire seule** étant à véhiculer.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 160

# <u>**ANNEXE 22**</u> <u>**ETABLISSEMENT EN DOTATION ANNUELLE**</u>
**Hôpitaux publics, PSPH, hôpitaux militaires**

Constitution des enregistrements :

Type 2 - Présence obligatoire du Top M position 128 ou du numéro de complémentaire CMU (positions 119-128)

## **Ticket modérateur et forfait journalier en hospitalisation**

Type 3 - DMT-MT renseignés

- Code prestation PJC,
- Prix unitaire (positions 76-82) : égal au montant du ticket modérateur des frais de séjour .
- Taux (positions 91-93) : valeur zéro.
- Montant remboursable par l’organisme d’Assurance Maladie (positions 94-101) : valeur zéro.
- Montant total de la dépense (positions 102-109) : remplissage standard.
- le qualificatif de la dépense (position 122) égal à N,
- Montant remboursable par l’organisme complémentaire CMU (positions 122-128) valeur égale à PJC x Quantité (nombre de jours)

- Code prestation FJC,
- Prix unitaire (positions 76-82) valeur égale au montant du forfait journalier.
- Taux (positions 91-93) : valeur zéro.
- Montant remboursable par l’organisme d’Assurance maladie (positions 94-101) :valeur zéro
- Montant total de la dépense (positions 102-109) : Prix unitaire du forfait journalier x Quantité
- le qualificatif de la dépense (position 122) égal à N,
- Montant remboursable par l’organisme complémentaire CMU (positions 122-128) valeur égale à FJC x Quantité.

## **Ticket modérateur des prestations et actes en consultations externes <u>dans les établissements en dehors du champ de la T2A,</u>**

Type 4 - DMT = 000 et MT = 07

- Code acte ou prestations : cf annexe 10
- Quantité, dénombrement et prix unitaire : voir consigne type 4 norme CP.
- Base de remboursement (positions 98-104) : valeur zéro.
- Taux (positions 105-107) : valeur zéro.
- Montant remboursable par l’organisme d’Assurance Maladie (positions 108-114) : valeur zéro.
- Montant des honoraires (positions 115-121) : valeur égale au montant du ticket modérateur.
- Qualificatif de la dépense (position 122) : valeur N.
- Montant remboursable par l’organisme complémentaire - CMU (positions 123-128) valeur égale soit au montant du ticket modérateur seul, soit au montant du ticket modérateur et du dépassement d’honoraires.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata
Page 161

# **ANNEXE 23 PRISE EN COMPTE DE LA CMU**

## **Remplissage du type de contrat et du n° d’organisme complémentaire**

Le type de contrat CMU est le 89 (Reste facultatif).

<u>Pour les flux B2 classiques,</u> c’est le **n° d’organisme complémentaire CMU** ou **le top M** qui est indiqué. Chaque organisme complémentaire CMU dispose de son propre numéro de complémentaire CMU.

<u>Pour les flux SESAM,</u> en tiers payant intégral (RO+RC), c’est le **n° présent sur la carte vitale** quelle que soit la mutuelle assurant la couverture complémentaire CMU, qui est transmis en n° d’organisme complémentaire ou, si le numéro n’est pas présent sur la carte, le **n° d’organisme complémentaire CMU** (figurant sur la carte papier de l’organisme complémentaire) ou **le top M**.

## **Le Ticket Modérateur est pris en charge à 100%**

Pour toutes les prestations, le ticket modérateur est pris en charge par la complémentaire CMU.

## **Prise en charge du Forfait Journalier**

A charge de l’organisme assurant la complémentaire CMU, dès lors que le forfait aurait dû être à charge de l’assuré.

<u>Hospitalisation en clinique privée :</u>

Transmission du PJ ou du GHS avec FJ et FJA (jour de sortie) à charge de l’assuré.

<table>
  <thead>
    <tr>
      <th><b>Nature</b><br />de<br /><b>prestation</b></th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Exo</th>
      <th>Code<br /><b>prise en</b><br />charge</th>
      <th>PU</th>
      <th>Base<br />remb.</th>
      <th><b>Taux</b><br />remb.</th>
      <th>Mt<br />remb.<br /><b>Caisse</b></th>
      <th><b>Mt de la</b><br />dépense</th>
      <th><b>Qualif.</b><br />de la<br />dépense</th>
      <th>Mt<br />remb.<br />OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>PJ<br />FJ inclus ds<br />le TM</td>
      <td>10</td>
      <td>1</td>
      <td>0</td>
      <td>A</td>
      <td>100</td>
      <td>1000</td>
      <td>80</td>
      <td>800</td>
      <td>1000</td>
      <td></td>
      <td>200</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>PJ<br />Bénéficiaire<br />exonéré</td>
      <td>10</td>
      <td>1</td>
      <td>4</td>
      <td>A</td>
      <td>100</td>
      <td>1000</td>
      <td>100</td>
      <td>860<br />= 1000 -<br />140</td>
      <td>1000</td>
      <td></td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>GHS<br />FJ inclus ds<br />le TM</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>A</td>
      <td>1000</td>
      <td>1000</td>
      <td>80</td>
      <td>800</td>
      <td>1000</td>
      <td></td>
      <td>200</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>GHS<br />Bénéficiaire<br />exonéré</td>
      <td>1</td>
      <td>1</td>
      <td>4</td>
      <td>A</td>
      <td>1000</td>
      <td>1000</td>
      <td>100</td>
      <td>860<br />= 1000 -<br />140</td>
      <td>1000</td>
      <td></td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 162

# **ANNEXE 23  PRISE EN COMPTE DE LA CMU**

<u>Hospitalisation en établissement public hors budget global :</u>

Transmission du PJ avec FJ à charge de l’assuré et du forfait du jour de sortie FJA.

<table>
  <thead>
    <tr>
      <th>Nature de prestation</th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Exo</th>
      <th>Code prise en charge</th>
      <th>PU</th>
      <th>Base remb.</th>
      <th>Taux remb.</th>
      <th>Mt remb. Caisse</th>
      <th>Mt de la dépense</th>
      <th>Qualif. de la dépense</th>
      <th>Mt remb. OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>PJ</td>
      <td>10</td>
      <td>1</td>
      <td>0</td>
      <td>A</td>
      <td>80</td>
      <td>800</td>
      <td>80</td>
      <td>780<br />(=640 + 140)</td>
      <td>940</td>
      <td></td>
      <td>160<br />(=940 – 780)</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>PJ<br />TM inférieur au FJ</td>
      <td>10</td>
      <td>1</td>
      <td>0</td>
      <td>A</td>
      <td>60</td>
      <td>600</td>
      <td>80</td>
      <td>600</td>
      <td>730</td>
      <td></td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>PJ<br />bénéficiaire exonéré</td>
      <td>10</td>
      <td>1</td>
      <td>4</td>
      <td>A</td>
      <td>100</td>
      <td>1000</td>
      <td>100</td>
      <td>1000</td>
      <td>1140</td>
      <td></td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
  </tbody>
</table>

<u>Hospitalisation en établissement public en budget global :</u>

PJC : Ticket modérateur relatif aux frais de séjour.
FJC : Forfait journalier seul, dû par un organisme complémentaire.
FJA : Forfait du jour de sortie.
Et le ticket modérateur de toutes les prestations facturables en consultation externe.

<table>
  <thead>
    <tr>
      <th>Nature de prestation</th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Exo</th>
      <th>Code prise en charge</th>
      <th>PU</th>
      <th>Base remb.</th>
      <th>Taux remb.</th>
      <th>Mt remb. Caisse</th>
      <th>Mt de la dépense</th>
      <th>Qualif. de la dépense</th>
      <th>Mt remb. OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>PJC</td>
      <td>10</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>15</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>150</td>
      <td>N</td>
      <td>150</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>FJC<br />TM inférieur au FJ</td>
      <td>10</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>140</td>
      <td>N</td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>FJC<br />bénéficiaire exonéré</td>
      <td>10</td>
      <td>1</td>
      <td>4</td>
      <td>-</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>140</td>
      <td>N</td>
      <td>140</td>
    </tr>
    <tr>
      <td>FJA</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>14</td>
      <td>14</td>
      <td>0</td>
      <td>0</td>
      <td>14</td>
      <td>N</td>
      <td>14</td>
    </tr>
    <tr>
      <td>C</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>-</td>
      <td>20</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>6</td>
      <td>N</td>
      <td>6</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 163

# **ANNEXE 23  PRISE EN COMPTE DE LA CMU**

## **Optique**

Pour les bénéficiaires de + 18 ans uniquement.

⮚ Tarif verres unifocaux : forfaits OP1, OP2 et OP3, dans la limite d’un plafond tout compris RO + forfait. (exemple de plafond OPx = 20 €)
⮚ Tarif verres multifocaux ou : forfait OP4, dans la limite d’un plafond tout compris RO + forfait.

<table>
  <thead>
    <tr>
      <th></th>
      <th>Presta<br />tion</th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Dnb</th>
      <th>Exo</th>
      <th>PU</th>
      <th>Base<br />remb.</th>
      <th>Taux<br />remb.</th>
      <th>Mt remb.<br />Caisse</th>
      <th>Mt de la<br />dépense</th>
      <th>Qualif.<br />de la<br />dépense</th>
      <th>Mt<br />remb.<br />OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>à 65%</td>
      <td>OPx</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>7,42</td>
      <td>7,42</td>
      <td>65</td>
      <td>4,82</td>
      <td>20</td>
      <td></td>
      <td>15,18</td>
    </tr>
    <tr>
      <td>bénéficiaire<br />exonéré</td>
      <td>OPx</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>4</td>
      <td>7,42</td>
      <td>7,42</td>
      <td><strong>100</strong></td>
      <td>7,42</td>
      <td>20</td>
      <td></td>
      <td>12,58</td>
    </tr>
  </tbody>
</table>

Attention, en cas de TP, l’exécutant, destinataire du règlement, doit être identifié et connu des fichiers de l’AM.

## **Prothèses auditives**

Pour les bénéficiaires de + 16 ans uniquement.
Forfait plafonné en sus de la part RO. (exemple de plafond = 243,92 €)
Le code pour le forfait de prothèse auditive CMU est « PAU », le même que celui utilisé hors CMU.

<table>
  <thead>
    <tr>
      <th></th>
      <th>Presta<br />tion</th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Dnb</th>
      <th>Exo</th>
      <th>PU</th>
      <th>Base<br />remb.</th>
      <th>Taux<br />remb.</th>
      <th>Mt remb.<br />Caisse</th>
      <th>Mt de la<br />dépense</th>
      <th>Qualif.<br />de la<br />dépense</th>
      <th>Mt<br />remb.<br />OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>à 65%</td>
      <td>PAU</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>200</td>
      <td>200</td>
      <td>65</td>
      <td>130</td>
      <td>443,92</td>
      <td></td>
      <td>313,92</td>
    </tr>
    <tr>
      <td>bénéficiaire<br />exonéré</td>
      <td>PAU</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>4</td>
      <td>200</td>
      <td>200</td>
      <td>100</td>
      <td>200</td>
      <td>443,92</td>
      <td></td>
      <td>243,92</td>
    </tr>
  </tbody>
</table>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 164

# **ANNEXE 23 PRISE EN COMPTE DE LA CMU**

## **Dentaire**

Le cumul de tous les forfaits dentaires est limité par un plafond.

<table>
  <thead>
    <tr>
      <th></th>
      <th><b>Presta</b><br /><b>tion</b></th>
      <th>Qté</th>
      <th>Coeff</th>
      <th>Dnb</th>
      <th>Exo</th>
      <th>PU</th>
      <th>Base<br />remb.</th>
      <th><b>Taux</b><br />remb.</th>
      <th><b>Mt remb.</b><br /><b>Caisse</b></th>
      <th><b>Mt de la</b><br />dépense</th>
      <th><b>Qualif.</b><br />de la<br />dépense</th>
      <th>Mt<br />remb.<br />OC</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>à 70 %</td>
      <td>SPR</td>
      <td>1</td>
      <td>60</td>
      <td>1</td>
      <td>0</td>
      <td>2.15</td>
      <td>129</td>
      <td>70</td>
      <td>90,30</td>
      <td>396,37</td>
      <td></td>
      <td>38,70</td>
    </tr>
    <tr>
      <td></td>
      <td>FDA</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>267,37<br />(= 396,37 -<br />129)</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>267,37</td>
      <td>N</td>
      <td>267,37</td>
    </tr>
    <tr>
      <td>bénéficiaire<br />exonéré</td>
      <td>SPR</td>
      <td>1</td>
      <td>60</td>
      <td>1</td>
      <td>4</td>
      <td>2,15</td>
      <td>129</td>
      <td>100</td>
      <td>129</td>
      <td>396,37</td>
      <td></td>
      <td>0</td>
    </tr>
    <tr>
      <td></td>
      <td>FDA</td>
      <td>1</td>
      <td>1</td>
      <td>1</td>
      <td>0</td>
      <td>267,37<br />(= 396,37 -<br />129)</td>
      <td>0</td>
      <td>0</td>
      <td>0</td>
      <td>267,37</td>
      <td>N</td>
      <td>267,37</td>
    </tr>
  </tbody>
</table>

Le forfait n’arrive jamais seul, il est toujours précédé de la ligne portant l’acte de prothèse :

<table>
  <thead>
    <tr>
      <th><b>Forfait complémentaire CMU</b></th>
      <th><b>Acte de prothèse possible</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>FDA : forfait pour prothèses adjointes</td>
      <td>SPR, PRO</td>
    </tr>
    <tr>
      <td>FDC : forfait pour prothèses conjointes</td>
      <td>SPR, PRO</td>
    </tr>
    <tr>
      <td>FDR : forfait pour réparation</td>
      <td>SPR, PRO</td>
    </tr>
    <tr>
      <td>FDO : forfait pour orthodontie</td>
      <td>TO, ORT</td>
    </tr>
  </tbody>
</table>

Les prestations dentaires et le forfait CMU associé sont facturés par le même exécutant.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 165

# **ANNEXE 24  PRISE EN COMPTE DE LA TAA**

La présente annexe 24 est externalisée du cahier des charges normes B2.
Elle se trouve désormais sur <u>http://www.ameli.fr/</u> dans la rubrique
       🡪 CONNAÎTRE L'ASSURANCE MALADIE 🡪 Documentation technique

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 166

# **ANNEXE 25  PARCOURS DE SOINS**

## **Valeurs possibles de l’indicateur de parcours de soins**

A       acte en rapport avec l’article D162-1-6 du code de la Sécurité Sociale

B       l’exécutant est un médecin installé depuis moins de 5 ans dans une zone déficitaire

D      accès Direct spécifique pour certaines spécialités et certains actes

H      le patient est Hors résidence Habituelle

J       l’exécutant est un médecin généraliste primo installé depuis moins de 5 ans

M       le patient est orienté dans le parcours de soins par un médecin qui n’est pas son médecin traitant - présence du nom du praticien qui a orienté le patient

N      l’exécutant est le Nouveau médecin traitant

O      le patient est Orienté par son médecin traitant - présence du nom du médecin traitant

R      médecin traitant Remplacé (médecin traitant de substitution)

S       accès aux soins hors parcours

**T       l’exécutant est le médecin Traitant**

U      acte réalisé dans un contexte d’Urgence

Blanc   autres situations.

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 167

# **ANNEXE 25  PARCOURS DE SOINS**

## **Valeurs possibles de l’origine de la prescription**

O la prescription a été établie dans le parcours de soins par un médecin correspondant (médecin qui reçoit un patient orienté par son médecin traitant)

P la prescription a été établie dans une autre situation du parcours de soins

S la prescription a été établie hors parcours de soins

**T la prescription a été établie par le médecin Traitant**

Blanc autres situations

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 168

# **ANNEXE 26   PRISE EN COMPTE DE LA PARTICIPATION**
# **<u>ASSURE EN VILLE</u>**

<u>La présente annexe 26 est externalisée du cahier des charges normes B2.</u>
<u>Elle se trouve sur http://www.ameli.fr/ dans la rubrique </u>

<u>🡪 CONNAÎTRE L'ASSURANCE MALADIE 🡪 Documentation technique</u>

NORMES B2 - Cahier des Charges – Juin 2007 avec errata Page 169

**Page 25: [1] Supprimé** **REQUENA-09541** **01/08/2007 10:34**

## 58 - Actes de Radiothérapie

Certains traitements donnent lieu <u>obligatoirement</u> à un protocole de traitement. Ce sont les actes du Titre II Chapitre 1 - Actes de radiothérapie de Haute Energie - de la Nomenclature Générale des Actes Professionnels.

Ces traitements sont soumis à la formalité de l’entente préalable. Sur celle-ci figurent les différentes cotations selon les divers articles du chapitre 1, et le total du traitement par irradiation.

---------------------------------------------------------------------------Saut de page---------------------------------------------------------------------------

Chaque acte des divers articles de la nomenclature sera présenté sur une ligne distincte dans un enregistrement de type 4.

*<u>Exemple</u> : Z50 + Z20 + Z10 + Z20 + Z15 + Z960*

*1 Type 4 Z50 (Article premier - Protocole de traitement).*
*1 Type 4 Z20 (Article 2 - Repérage radiographique).*
*1 Type 4 Z10 (Article 2 - Repérage gammagraphique).*
*1 Type 4 Z20 (Article 3 - Etude dosimétrique).*
*1 Type 4 Z15 (Article 3 - Supplément pour dosimétrie).*
*1 Type 4 Z960 (Article 4 - Irradiations par faisceaux de photons ou électrons).*

Néanmoins et dans l’attente de la création d’un code acte spécifique aux irradiations par faisceaux ou électrons, les actes d’irradiation cotés Z1 ou Z2 sont globalisés sur une seule ligne dans un enregistrement de Type 4 dont la zone dénombrement indiquera le nombre de séances d’irradiations effectuées.

*<u>Exemple</u> : Z1 + Z1 + Z1 + Z1 + Z2*

*1 Type 4 : Acte : Z*
*Coefficient : 6,00*
*Quantité : 1*
*Dénombrement : 5*

<table>
  <thead>
    <tr>
      <th colspan="6"><b>Page 89: [2] Supprimé</b> <b>Requena Max</b> <b>01/10/2007 4:42</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Complément<br />au n° de<br />remplaçant</td>
      <td>65-70</td>
      <td>6</td>
      <td></td>
      <td>F</td>
      <td>Complément au n° de<br />remplaçant, s’il ne s’agit pas d’un<br />numéro ADELI.</td>
    </tr>
  </tbody>
</table>