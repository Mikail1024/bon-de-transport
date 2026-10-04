![logo: L'Assurance Maladie](page_1_image_2_v2.jpg)

![logo: CNDA sesam-vitale](page_1_image_1_v2.jpg)

# PROJET TRANSPORT
## **– Géolocalisation –**

Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

<table>
    <tr>
      <td>PARTICIPANTS :</td>
      <td>DIFFUSION :</td>
    </tr>
    <tr>
      <td>REPRESENTANTS DE LA PROFESSION</td>
      <td rowspan="26">► Invités de la réunion plénière du 24/06/2015</td>
    </tr>
    <tr>
      <td>► Alain RUSCH, FNTS</td>
    </tr>
    <tr>
      <td>► Claude DELESSE, FNAP</td>
    </tr>
    <tr>
      <td></td>
    </tr>
    <tr>
      <td>EDITEURS</td>
    </tr>
    <tr>
      <td>► Jean-Marc ISSART, LOMACO</td>
    </tr>
    <tr>
      <td>► Alain ENOND, BRESSUIRE Informatique</td>
    </tr>
    <tr>
      <td>► Patrick LALLEMAND, MK2I</td>
    </tr>
    <tr>
      <td>► Brice MAMBWINI, Reflet Technologie</td>
    </tr>
    <tr>
      <td>► Elios VALERA, SCR’Informatique</td>
    </tr>
    <tr>
      <td>► Pascal GUIDOUX, ETIB</td>
    </tr>
    <tr>
      <td>► Michel LACOMBE, SYNOVO</td>
    </tr>
    <tr>
      <td>► Tristan GUION, AIDESNSOFT</td>
    </tr>
    <tr>
      <td>► Olivier EMERY, AMB Informatique</td>
    </tr>
    <tr>
      <td>► Philippe LAKOMSKI, ADENO</td>
    </tr>
    <tr>
      <td>► Alibou LALEYE, SIGMASOFT</td>
    </tr>
    <tr>
      <td></td>
    </tr>
    <tr>
      <td>GIE SESAM-VITALE</td>
    </tr>
    <tr>
      <td>► Hélène DE SAEDELEER</td>
    </tr>
    <tr>
      <td>► Laure LECAIME</td>
    </tr>
    <tr>
      <td>► Carole ROUSSEAU</td>
    </tr>
    <tr>
      <td></td>
    </tr>
    <tr>
      <td>CNAMTS</td>
    </tr>
    <tr>
      <td>► Marthe CASSAGNEAU</td>
    </tr>
    <tr>
      <td>► Martine PIESSET</td>
    </tr>
    <tr>
      <td>► Catherine MORVAN-SIGWARD</td>
    </tr>
</table>

<table>
    <tr>
      <td>PLENIERE</td>
      <td>DATE : 24/06/2015</td>
      <td>COMPTE-RENDU : VT</td>
    </tr>
</table>

## 1. Ordre du jour

o Géolocalisation

▪ Présentation du contexte

▪ Description MAJ du cahier des charges

▪ Présentation du processus

▪ Modalités d’autorisation

o Actualités générales transport

![logo: Assurance Maladie](page_2_image_2_v2.jpg)
# PROJET TRANSPORT
## **– Géolocalisation –**
Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_2_image_1_v2.jpg)

- PEC+
- SEFi
- SPE/SPEi

## 2. GEOLOCALISATION

### **2.1 PRESENTATION DU CONTEXTE**

En 2008, l’avenant 5 a mis en place l’expérimentation de la transmission des traces de géolocalisation vers l’assurance Maladie. En 2014, dans le cadre de l’avenant 7, l’Assurance Maladie et la profession ont choisi d’intégrer une option conventionnelle prenant en compte le retour d’expérience fait sur l’expérimentation de l’avenant 5, pour généraliser la géolocalisation des transports de malades.

Dans ce cadre, à l’instar de ce qui est fait dans le cadre des téléservices, le GIE SESAM-Vitale a rédigé un cahier des charges (dit « cahier des charges rénové », comme cité dans l’avenant 7) à destination des éditeurs, le CNDA procédera à la vérification de conformité des logiciels à ce cahier des charges.

Dans le cadre de l’avenant 7 le transporteur sanitaire s’engage à s’équiper d’un logiciel implémentant le cahier des charges rénové afin de bénéficier des avantages liés à l’avenant (prime pour chaque véhicule et taux d’abattement préférentiel en cas de transport partagé). L’avenant 7 reprend les principes mis en place pour l’avenant 5 en intégrant la fiabilisation des échanges avec l’Assurance Maladie, grâce au cahier des charges et à la vérification de conformité faite par le CNDA.

Les représentants de la profession portent de l’intérêt à ce dossier et souhaitent que ce dossier aboutisse rapidement.

### **2.2 Description MAJ du cahier des charges**

L’analyse des fichiers de traces de l’expérimentation montre que 95% des rejets provient d’une mauvaise structure de fichier. La FNTS précise qu’il serait intéressant de donner aux transporteurs sanitaires les raisons des cas de rejets.

### **2.3 Présentation du processus**

Le périmètre du cahier des charges géolocalisation rédigé par l’Assurance Maladie couvre la constitution et la transmission des fichiers traces à l’Assurance Maladie, ainsi que le complément de la facture B2.

![logo: Assurance Maladie](page_3_image_2_v2.jpg)
# PROJET TRANSPORT
## **– Géolocalisation –**
Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_3_image_1_v2.jpg)

Le logiciel métier doit interpréter les données reçues du système de géolocalisation et constituer le fichier trace en s’appuyant sur les bases de données du système d’information du transporteur sanitaire.

Pour chaque facture générée un fichier trace doit être envoyé au système d’accueil des traces de géolocalisation et le complément d’information « géolocalisation » prévu dans le cahier des charges doit être ajouté à la facture B2.

Le processus général est composé de 4 sous processus

*   GE01 - Constitution du fichier de traces de géolocalisation
*   GE02 - Complément de la facture avec les données issues de la géolocalisation
*   GE03 - Transmission du fichier de traces
*   GE04 - Paramétrage de la production et de la transmission du fichier de traces

Dans un 1<sup>er</sup> temps, La transmission des traces de géolocalisation concerne les transports facturés en B2. Dans un second temps, il concernera également les transports facturés en ligne, via SEFi.

### <u>GE01 - Constitution du fichier de traces de géolocalisation</u>

A une facture, correspond un fichier de traces XML. Son format est inchangé par rapport à l’avenant 5.

Un schéma XML (fichier XSD) sera livré aux éditeurs pour leur permettre de valider le fichier XML.

Le fichier de traces est composé des données de la facture et des données du trajet.

Transport partagé : Il n’y a qu’un seul enregistrement de trace GPX dans le véhicule. Le LPS doit pouvoir extraire les bonnes traces GPX pour chaque patient et chaque trajet. La trace envoyée doit être conforme au trajet du patient. Les représentants de la profession précise que le partage de transport ne doit pas allonger le kilométrage du trajet de plus de 10 km de détour.

La mise en place de ce cahier des charges de géolocalisation ne change pas les modalités de facturation, telles que définies conventionnellement.

### <u>GE02 - Complément de la facture avec les données issues de la géolocalisation</u>

La complétion du type 4U dans la facture B2 n’est pas modifiée.

Le numéro d’autorisation qui sera délivré par le CNDA devra être renseigné dans le type 2S de la facture en position 45-49.

### <u>GE03 - Transmission du fichier de traces</u>

Le sous processus n’a pas été modifié par rapport à l’avenant 5.

![logo: Assurance Maladie](page_4_image_2_v2.jpg)
# PROJET TRANSPORT
## **– Géolocalisation –**
Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_4_image_1_v2.jpg)

Actuellement la transmission n’est opérationnelle que pour les assurés du Régime Général. L’instruction est en cours pour les autres régimes. Le processus GE04 « administrer » a été mis en place pour une gestion à venir des autres régimes.

### <u>GE04 - Paramétrage de la production et de la transmission du fichier de traces</u>

Questions éditeurs : *A quoi correspond la valeur « par défaut » ? Est-ce la valeur qui doit être affichée ?*

Il s’agit de la valeur actuelle, pouvant être modifiée par la suite par paramétrage.

*Quelle est l’unité utilisée pour la fréquence d’enregistrement des traces ?*

Dans EF_GE06 – Paramètres géolocalisation, la fréquence d’enregistrement des traces est exprimée en « int » ce qui correspond à des secondes et non des minutes. Une précision sera ajoutée dans les spécifications éditeurs.

*Un éditeur demande s’il est possible de réduire à 30 secondes la fréquence d’enregistrement car avec 1 minute, il est possible de ne pas détecter des arrêts dans les enregistrements des positions GPS.*

L’Assurance Maladie ne souhaite pas modifier le temps indiqué dans le cahier des charges. Les représentants de la profession précisent qu’il ne faut pas raccourcir le délai entre 2 enregistrements de position GPS.

## **2.4 Questions diverses**

### *1- Que veut dire « embarqué en fixe » dans le cahier des charges ?*

Le système de géolocalisation mis en place dans les véhicules doit respecter les conditions suivantes :

*   ⇨ qu’il soit dédié à un véhicule
*   ⇨ que l’identifiant IMEI soit attribué à ce véhicule. Ce numéro doit être référencé, non modifiable et sous contrôle d’une personne habilitée.

Pour que le système soit fiable, la solution embarquée dans le véhicule doit être robuste.

L’Assurance Maladie propose de remplacer le terme « fixe » par « installé ».

### *2- Un ambulancier peut-il revenir à un mode standard de facturation s’il a signé l’option Avenant 7 ?*

La rupture du contrat, par le transporteur sanitaire qui souhaite se retirer de l’option, est possible à tout moment (Annexe II, article 6, de l’avenant 7).

### *3- Les smartphones sont-ils autorisés comme système de géolocalisation.*

Ce type de dispositif permettant d’enregistrer les traces GPX dans le véhicule ne fait pas partie du périmètre actuel du Cahier des charges.

![logo: Assurance Maladie](page_5_image_1_v2.jpg)
## PROJET TRANSPORT
### **– Géolocalisation –**
Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_5_image_2_v2.jpg)

### 4- *Que signifie la phrase du Cahier des charges : « Dans tous les cas, le conducteur du véhicule peut déclencher manuellement la prise en charge via le dispositif informatique embarqué dans le véhicule »*

Pour les transporteurs sanitaires qui n’ont pas de remontée de traces en mode automatique, le système doit prévoir la possibilité d’une intervention manuelle sans pour autant qu’elle soit obligatoire.

Le CNDA n’est pas missionné pour vérifier les dispositifs embarqués dans les véhicules.

### 5- *Qu’en est-il du contrat de bonne pratique actuel ?*

Le contrat de bonne pratique est caduc et n’a plus de valeur légale.

### 6- *Durée de conservation des traces*

Un éditeur précise que la durée de conservation des traces à 60 jours semble trop juste pour beaucoup de transporteurs sanitaires qui facturent plus tard. Il serait souhaitable de conserver les traces jusqu’à ce que la facture soit envoyée. D’après un autre éditeur, si les traces servent à des fins de facturation elles peuvent être sauvegardées pendant 1 an.

La sauvegarde des traces d’origine ou des fichiers de géolocalisation par le SI du transporteur n’est pas décrite dans ce cahier des charges.

### 7- *Y-a-t-il un indicateur permettant de préciser si c’est une distance calculée à partir du boitier ou résultant d’un calcul du logiciel à partir des adresses géocodées de départ et d’arrivée ?*

Il n’y a pas d’indicateur, cependant si la trace est géocodée, il n’y a que les positions de départ et d’arrivée d’enregistrées.

### 8 - *Les éditeurs doivent-ils demander aux transporteurs sanitaires s’ils ont signé l’option ?*

Les représentants de la profession rappellent aux éditeurs que c’est une option non obligatoire. Les éditeurs ne doivent pas démarcher les transporteurs sanitaires pour vendre leur produit en disant que c’est obligatoire.

### 9- *Les éditeurs peuvent-ils déployer dès qu’ils ont l’autorisation du CNDA ?*

L’Assurance Maladie considère que l’expérimentation a déjà eu lieu avec l’avenant 5, donc le déploiement est autorisé sans phase de présérie.

### 10- *Le transporteur sanitaire peut-il envoyer des traces s’il n’a pas signé l’option ?*

L’Assurance Maladie répond que ce n’est pas utile, si c’était le cas, le transporteur sanitaire ne touchera évidemment pas les compensations prévues dans l’option.

### 11 - *En cas de rejet de facture, faut-il renvoyer les traces ?*

Les traces doivent être renvoyées. Une précision sera apportée au cahier des charges.

![logo: Assurance Maladie](page_6_image_1_v2.jpg)
# PROJET TRANSPORT
## **– Géolocalisation –**
Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_6_image_2_v2.jpg)

### 12 - *Est-ce un format B2 2007 ?*

L’Assurance Maladie confirme que c’est un format B2 2007.
*Hors réunion* : dans le cahier des charges il va être indiqué finalement que la norme compatible est la 2005-B et suivantes.

### 13 - *Quand les fichiers doivent-ils être envoyés ?*

Le LPS doit envoyer les fichiers à la fin de chaque journée de facturation.

En signant l’option conventionnelle, le transporteur sanitaire s’engage à s’équiper avec un logiciel implémentant le nouveau cahier des charges rénové en décembre 2015.

### **2.5 Modalités d’autorisation**

Le processus d’autorisation est superposable à celui qui existe pour les TLSi. La géolocalisation est raccrochée au même dispositif contractuel incluant les Conditions Générales et les Conditions Particulières spécifiques à la géolocalisation.

Point d’attention, le numéro d’autorisation ne sera pas le même que pour les TLSi. Un numéro spécifique géolocalisation sera délivré par le CNDA pour la géolocalisation.

## 3. ACTUALITES GENERALES TRANSPORT

### **3.1 PEC+**

Nous attirons l’attention sur le fait que l’ancienne version du PEC de 2012, spécifique aux transporteurs sanitaires, sera fermée au 31 juillet 2015. Il reste à fin mai, 250 transporteurs sanitaires utilisateurs de cette version et qui devront être migrés d’ici là.

Les représentants de la profession demandent si le service est ouvert en 24/24. L’Assurance Maladie confirme le 24/24 7/7. Les représentants de la profession soulignent qu’ils n’ont plus de remontée terrain d’interruption du service depuis quelques mois.

Un éditeur demande s’il est possible d’avoir, les codes régimes en plus des noms des régimes accrochés au PEC.

### **3.2 SEFi**

Les objectifs du SEFI sont :

⇨ Simplifier le processus dans son ensemble
⇨ Aider le transporteur à l’élaboration de la facture
⇨ Faciliter le traitement par la dématérialisation de l’ensemble des pièces justificatives dès la facturation

![logo: l'Assurance Maladie](page_7_image_1_v2.jpg)

# PROJET TRANSPORT

## **– Géolocalisation –**

Compte-rendu de la réunion plénière du 24/06/2015 avec les éditeurs TS et les représentants de la profession

![logo: CNDA sesam-vitale](page_7_image_2_v2.jpg)

Environ 12 000 factures en ligne ont été payées par l’Assurance Maladie depuis le début de l’expérimentation ce qui confirme que le service est utilisé par les transporteurs sanitaires de la présérie.

L’Assurance Maladie constate également que le bouquet de services est utilisé pour la facture B2, puisque le taux de rejet des factures B2 est tombé à 0,5% pour les transporteurs sanitaires de la présérie.

### **3.3 SPE/SPEi**

La Prescription Electronique est fiabilisée par les référentiels de l’Assurance Maladie. Le taux de prise en charge est calculé à la date de la prescription. La prescription validée est enregistrée en base et consultable par les transporteurs.

Le Service de Prescription Electronique sur Espace Pro est en cours d’expérimentation.

La version en intégrée logiciel devrait démarrer par une phase d’expérimentation au 4<sup>ième</sup> trimestre 2015.