# Carte de travail — extraction réglementaire SEFi Transporteur sanitaire 03.50.00

**Version du livrable :** 0.1 — préparation de l'extraction  
**Date de référence :** 26 septembre 2026  
**Profession :** Transporteur sanitaire (TS)  
**Canal :** SEFi  
**Baseline visée :** package GIE SESAM-Vitale 3.50 / qualification CNDA 03.50.00

## 1. Objet, limites et méthode

Ce document est une **carte de travail**. Il inventorie et ordonne les sources à analyser ; il ne constitue ni une synthèse de SEFi, ni une architecture fonctionnelle, ni un registre complet de règles.

La collecte a été bornée au corpus local utile à SEFi TS 03.50.00, complété par quelques pages officielles courantes nécessaires pour déterminer l'applicabilité au 26 septembre 2026. Les documents de routage ont servi à localiser les sources, puis les sources primaires ont été vérifiées de manière ciblée. Aucun binaire ou code d'exemple n'a été exécuté, aucun original n'a été modifié, aucune empreinte n'a été recalculée et aucun import distant de schéma n'a été résolu.

### 1.1 Qualification des conclusions

- `ETABLI` : explicitement porté par une source applicable consultée.
- `DEDUIT` : conséquence raisonnée de sources citées.
- `RECOMMANDE` : choix de méthode pour l'extraction à venir.
- `CONFLIT` : sources ou parties de source incompatibles avec impact possible.
- `INCONNU` : preuve absente ou insuffisante.

### 1.2 États de couverture

- `REVIEWED` : le contenu utile au rôle attribué a été lu intégralement ou vérifié de manière complète pour ce rôle. Cela ne prouve ni actualité ni applicabilité.
- `PARTIALLY_REVIEWED` : seules certaines parties ont été lues ou contrôlées.
- `NOT_REVIEWED` : source repérée mais contenu non encore analysé.
- `NOT_APPLICABLE` : hors de la baseline ou hors de la date de référence, sous réserve du motif indiqué.
- `MISSING` : source nécessaire ou explicitement référencée non retrouvée localement.

Un titre, un sommaire ou une présence dans un dossier ne suffit pas à classer une source `REVIEWED`. Une archive officielle et son extraction locale sont comptées comme **une seule livraison**.

### 1.3 Abréviations de chemins

Tous les chemins sont relatifs à la racine du projet.

- `SEFI` = `30_TRANSPORTEURS_SANITAIRES/SEFi`
- `PKG` = `SEFI/Package SEFi TS 3.50`
- `CORE` = `PKG/Package SEFi Transporteur Sanitaire 3.50`
- `CNDA` = `PKG/Qualification CNDA 03.50.00`
- `GEO` = `SEFI/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05`
- `METIER` = `30_TRANSPORTEURS_SANITAIRES/Métier TS`
- `TS-B2` = `30_TRANSPORTEURS_SANITAIRES/B2`
- `COMMUN` = `10_SOCLE_COMMUN_TS_TX`

Dans un même tableau, le préfixe `.../` reprend exactement le répertoire explicitement donné par la première ligne de la famille ; il ne désigne pas une recherche approximative.

## 2. Gel provisoire de la baseline

| Conclusion de cadrage | Preuve consultée | Qualification et réserve |
|---|---|---|
| La livraison documentaire est appelée « package SEFi-Transporteur Sanitaire v3.50 ». | GIE SESAM-Vitale, `PKG/PDT-INF-920v2 Diffusion du package SEFi‐Transporteur Sanitaire v3.50.pdf`, v2, 03/09/2026, p.1-3. | `ETABLI` pour le nom et la composition de la livraison. La p.2 conserve cependant le texte « du xx août 2026 » : date éditoriale incohérente. |
| La qualification cible est 03.50.00 et son paquet récapitulatif est daté du 21/08/2026. | CNDA, `CNDA/SEL-GCONFORM-FTE_Package CNDA SEFi_V3.50.00.pdf`, v3.50.00, 21/08/2026, p.1 et p.8. | `ETABLI` pour le dossier de qualification. L'équivalence complète de chaque composant du package GIE 3.50 avec le dossier CNDA 03.50.00 devra être vérifiée, pas présumée. |
| La V3.50 est publiée comme version de référence le 04/09/2026. L'opposabilité au 26/09/2026 dépend de la situation contractuelle de l'éditeur. | CNDA/CTLSAM, décision du 04/09/2026, page officielle consultée le 26/09/2026 : <https://cnda.ameli.fr/editeurs/decisions-ctlsam/decision-ctlsam-du-04-09-2026-sefi-transporteurs-sanitaires-v3-50/>. | `ETABLI` : immédiate pour les éditeurs non encore contractualisés ; délai jusqu'au 31/12/2026 pour ceux déjà contractualisés sur une version antérieure, puis V3.50 opposable. La baseline n'est donc pas uniformément opposable à tous au 26/09/2026. Copie locale `MISSING`. |
| Le périmètre fonctionnel détaillé n'est pas figé dans la seule livraison 3.50. | GIE SESAM-Vitale, `SEFI/PDT-INF-293v3.07 Périmètre SEFI-FTE Transporteur Sanitaire.pdf`, v3.07, 02/09/2026, p.1-3 ; `PDT-INF-920` p.3. | `ETABLI` : la fiche de périmètre est séparée et peut évoluer indépendamment. Elle doit être gelée avec date et version dans toute extraction. |
| Le package principal ne contient pas toutes ses dépendances. | `PDT-INF-920` p.3 ; références des SFG/guides indiquées plus bas. | `ETABLI` : TLSi bénéficiaire, SCOR, B2, géolocalisation, cadre d'interopérabilité et sources métier doivent être analysés comme corpus dépendants. |

**Décision de travail `RECOMMANDEE` :** utiliser le tuple de gel `D01/D02 (package GIE 3.50) + D03 (PDT-INF-293 v3.07) + Q01/Q02 (qualification CNDA 03.50.00) + décision CTLSAM du 04/09/2026`, puis rattacher chaque règle future à la situation d'opposabilité de l'éditeur. Ne pas utiliser la seule étiquette « 3.50 » comme preuve d'applicabilité. Q03 reste une source contractuelle candidate distincte : sa version 3.02 n'est visible que dans le nom local et son applicabilité exacte est `INCONNU` tant qu'elle n'est pas confirmée officiellement.

## 3. Sources de routage — orientation seulement

| ID | Chemin / titre | Autorité, version, date, nature | Rôle, relations et réserves | Couverture |
|---|---|---|---|---|
| R01 | `README.md` — accueil du corpus | Projet local ; synthèse secondaire ; état au 26/09/2026. | Oriente vers les branches TS et socle commun. Ne justifie aucune obligation. | `REVIEWED` pour le routage |
| R02 | `30_TRANSPORTEURS_SANITAIRES/README.md` | Projet local ; synthèse secondaire ; 26/09/2026. | Localise package SEFi, qualification, présérie, géolocalisation, SCOR, cartes, formulaires et métier TS. | `REVIEWED` pour le routage |
| R03 | `COMMUN/README.md` | Projet local ; synthèse secondaire ; 26/09/2026. | Localise B2, services AMO, SCOR, droit et référentiels. | `REVIEWED` pour le routage |
| R04 | `AUDIT_RECENT_TS_TX_2026-09-26.md` | Projet local ; audit secondaire ; 26/09/2026. | Piste les anomalies et sources récentes ; chaque point normatif a été ou devra être revérifié dans l'original. | `PARTIALLY_REVIEWED` |
| R05 | `COMMUN/MANIFESTE_REFERENTIELS_ET_REGLES_2026-09-26.md` | Projet local ; manifeste secondaire ; 26/09/2026. | Oriente vers droit, référentiels et services. Ne vaut pas preuve primaire. | `PARTIALLY_REVIEWED` |

## 4. Registre des sources candidates

### 4.1 Diffusion, périmètre et présérie

| ID | Chemin / titre | Autorité, version, statut, date, nature | Rôle documentaire, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| D01 | `PKG/PDT-INF-920v2 Diffusion du package SEFi‐Transporteur Sanitaire v3.50.pdf` | GIE SESAM-Vitale ; v2 ; 03/09/2026 ; diffusion primaire. | Composition de la livraison : 8 SFG, 4 guides, 4 contrats, 4 lots d'exemples et traces de présérie. p.1-3. `CONFLIT` de date : en-tête 03/09/2026, corps p.2 « xx août 2026 ». p.1 mentionne la spécialité 56, en conflit avec S02/PG §2.3 p.11, `RG_FTE099`. | `REVIEWED` |
| D02 | `PKG/Package SEFi Transporteur Sanitaire 3.50.zip` et extraction `CORE/` | GIE SESAM-Vitale ; package 3.50 ; livraison primaire. | Une seule livraison logique. L'inventaire du ZIP et de l'extraction a été établi, sans comparaison d'intégrité membre à membre. `PDT-INF-307` est annoncé parmi les autres éléments mais se trouve à côté du ZIP, non dedans. | `PARTIALLY_REVIEWED` |
| D03 | `SEFI/PDT-INF-293v3.07 Périmètre SEFI-FTE Transporteur Sanitaire.pdf` | GIE SESAM-Vitale ; v3.07 ; 02/09/2026 ; périmètre primaire. | p.1-2 : restrictions d'admission des services SEFi et orientation B2. p.3 : format des heures, reprise après double appel WS_FT3 et disponibilité des services ; ces trois blocs sont routés vers des lots distincts de données, validation/reprise et exploitation. Relation PG/FTE02. Source séparée du package et évolutive indépendamment. | `REVIEWED` |
| D04 | `PKG/PDT-INF-307v6_Présérie FTE Traces Poste.pdf` | GIE SESAM-Vitale ; v6 ; 12/07/2019 ; procédure opérationnelle primaire. | Traces de factures validées et appels WS_FT2, p.1-5. Son applicabilité à la qualification 03.50.00 est `ETABLI` par Q10 pp.77-78 et Q12 p.23 ; ses modalités d'exploitation doivent être lues avec D05. | `REVIEWED` |
| D05 | `SEFI/Conditions de présérie SEFi/Conditions et modalités d application de la présérie du SEFi transport sanitaire - v6 août 2026 (publication septembre 2026).pdf` | Émetteur non explicitement signé ; contexte CNAM/GIE ; v6 ; août 2026, publication indiquée par le nom de fichier en septembre 2026 ; exploitation/présérie. | Conditions, acteurs, durée, échantillon, critères, PJ/SCOR et décision de sortie ; p.1-7. La date de publication n'est pas imprimée dans le contenu. | `REVIEWED` |
| D06 | `SEFI/Conditions de présérie SEFi/Archives/Conditions et modalités ... ancienne version non datée.pdf` | Émetteur non explicitement signé ; contexte CNAM/GIE ; v5 ; février 2024 indiqué en couverture ; historique. | Version antérieure de D05. Le nom de fichier « non datée » est inexact. | `REVIEWED`, puis `NOT_APPLICABLE` à la baseline courante |
| D07 | Page GIE « SEFi — Transporteurs sanitaires », <https://sesam-vitale.fr/web/sesam-vitale/sefi-etpt> | GIE SESAM-Vitale ; page officielle courante ; consultée 26/09/2026. | Confirme le parcours d'intégration et que documentation/composants sont diffusés via l'Espace Industriels, en partie authentifié. Sert à borner l'accès, pas à remplacer les documents contractuels. | `REVIEWED` pour ce rôle |

### 4.2 Spécifications fonctionnelles et dictionnaire

Les huit fichiers suivants sont des **sources fonctionnelles primaires** émises par le **GIE SESAM-Vitale**, marquées `Diffusion : RESTREINTE`, suffixées `_avec_MR`, et annoncées par `PDT-INF-920` p.2. Leur couverture porte `État : REFERENCE`, tandis que leur corps indique `EN COURS` ou « version provisoire et référencée » : statut `CONFLIT` à faire confirmer avant promotion de règles.

| ID | Source | Version / date | Domaine, relations et localisateurs vérifiés | Couverture |
|---|---|---|---|---|
| S01 | `CORE/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-029 DICO-Dictionnaire du système FTE TS v03.54_avec_MR.pdf` | 03.54 ; 17/07/2026 ; 67 p. | Définitions p.6-10 ; données PS, bénéficiaire, PEL, FEL, adjointes, SCOR, générales et B2 p.11-29 ; §3.10 tables p.29-36 ; ch.4 erreurs p.36-67. Référence SCOR-SFG-003. | `PARTIALLY_REVIEWED` |
| S02 | `.../FACT-SFG-030 PG-Présentation Générale du système FTE TS v05.48_avec_MR.pdf` | 05.48 ; 17/07/2026 ; 27 p. | §2.1-2.3 : contexte, acteurs et aspects non fonctionnels p.6-12 ; §2.4-2.5 : processus principal p.13-20 ; §2.6 : situations spécifiques p.21-23 ; §2.7 : administration/supervision hors processus p.23-24 ; §2.8 : consignes transverses p.24 ; architecture documentaire et conventions p.25-27. Renvoie à DICO et PDT-INF-293. | `PARTIALLY_REVIEWED` |
| S03 | `.../FACT-SFG-031 FTE01-Réaliser des Prestations d’une prescription TS v03.18_avec_MR.pdf` | 03.18 ; 17/07/2026 ; 12 p. | Prescription électronique : réservation et réalisation p.7-12. Dépend de WS_PL. | `PARTIALLY_REVIEWED` |
| S04 | `.../FACT-SFG-032 FTE02-Facturer des Prestations TS v03.60_avec_MR.pdf` | 03.60 ; 27/08/2026 ; 88 p. | Acquisition p.11-17 ; élaboration FEL p.18-66 ; recevabilité p.67-68 ; validation p.69-75 ; B2 p.76-88. Dépend de DICO, PG, FTE03/04/05, WS_FT, B2, géolocalisation et PDT-INF-818. | `PARTIALLY_REVIEWED` |
| S05 | `.../FACT-SFG-033 FTE03-Contrôler et Transmettre les PJ TS v03.21_avec_MR.pdf` | 03.21 ; 17/07/2026 ; 19 p. | Contrôle PJ p.9-11 ; dossier/lot, émission et retours p.12-19. Dépend de SCOR-SFG-002/003/006, FTE02 et FTE06. | `PARTIALLY_REVIEWED` |
| S06 | `.../FACT-SFG-034 FTE04-Consulter les referentiels de l'AMO TS v03.18_avec_MR.pdf` | 03.18 ; 17/07/2026 ; 21 p. | PS p.6-9 ; bénéficiaire/PEC p.10-16 ; PEL p.17-19 ; FEL p.20 ; commun p.21. Référence WS_PS, WS_BS, WS_PL, WS_FT et utilise WS_PEC sans le lister en §1.5. | `PARTIALLY_REVIEWED` |
| S07 | `.../FACT-SFG-035 FTE05-Administrer le poste PS TS v03.45_avec_MR.pdf` | 03.45 ; 17/07/2026 ; 15 p. | Paramètres transporteur p.6-7 ; activation WS p.8-12 ; données techniques p.13-14 ; historique p.15. Dépend de DICO, PG, FTE02 et SCOR. | `PARTIALLY_REVIEWED` |
| S08 | `.../FACT-SFG-060 FTE06-Superviser le poste PS TS v03.37_avec_MR.pdf` | 03.37 ; 17/07/2026 ; 5 p. | Supervision du délai PJ p.5 ; dépend de DICO, PG, FTE02 et B2. §1.1/§1.4 semblent copiés de FTE05 : réserve éditoriale, sans créer à ce stade un conflit matériel. | `PARTIALLY_REVIEWED` |

### 4.3 Guides d'intégration SEFi

Les quatre guides sont des **sources primaires d'intégration** du **GIE SESAM-Vitale**, `REFERENCE`, `RESTREINTE`, `_avec_MR`. Chacun indique au chapitre 3 que les formats/types/plages du guide sont indicatifs et que **les XSD sont la référence des échanges**. Cette relation impose d'étudier guide, WSDL et XSD ensemble.

| ID | Source | Version / date | Domaine, relations et localisateurs | Couverture |
|---|---|---|---|---|
| G01 | `.../SEL-MP-012 WS_PS TS v02.20_avec_MR.pdf` | 02.20 ; 17/07/2026 ; 18 p. | PS1 prescripteur, PS3 FINESS, PS4 transporteur/RNT p.5-10 ; technique/env. p.11-14 ; messages p.15-17 ; erreurs p.18. Contrat InfoPS 2.0.6 ; renvoie à CI-CNAMTS-DC v1.0.2. | `PARTIALLY_REVIEWED` |
| G02 | `.../SEL-MP-014 WS_PL TS v03.17_avec_MR.pdf` | 03.17 ; 17/07/2026 ; 28 p. | PL1 acquisition, PL2 réservation, PL3 exécution p.5-15 ; technique/env. p.16-19 ; messages p.19-26 ; erreurs p.27-28. Contrat PEL 2.2.1. | `PARTIALLY_REVIEWED` |
| G03 | `.../SEL-MP-015 WS_FT TS v03.52_avec_MR.pdf` | 03.52 ; 27/08/2026 ; 51 p. | FT1 consultation, FT2 recevabilité, FT3 validation, FT4 calcul p.5-11 ; modèle FEL p.12-24 ; technique/env. p.25-28 ; messages p.29-49 ; erreurs p.50-51. Contrat SEMaFEL 1.1.0. | `PARTIALLY_REVIEWED` |
| G04 | `.../SEL-MP-016 WS_PEC TS v03.40_avec_MR.pdf` | 03.40 ; 17/07/2026 ; 17 p. | PEC1 prise en charge p.5-7 ; technique/env. p.8-11 ; messages p.11-13 ; erreurs p.14-17. Contrat ServicePEC 1.0.4. | `PARTIALLY_REVIEWED` |

Réserves transverses : les WSDL diffusent des endpoints de qualification et non de production ; les guides distinguent les environnements. G03 omet le `P` final dans certains libellés alors que les XSD/WSDL portent `...TRANSP` : la préséance explicite donnée aux XSD guide l'analyse, mais la divergence reste à tracer.

### 4.4 Contrats WSDL/XSD

Les dates internes anciennes de génération des modèles et les versions de `soapAction` ne sont pas des dates de diffusion du package. L'autorité de diffusion est le GIE SESAM-Vitale via D01. Les 4 WSDL et 82 XSD ont été inventoriés et contrôlés comme XML bien formés ; ils n'ont pas été compilés ni validés comme graphe complet.

| ID | Chemin / contrat | Version, contenu et rôle | Relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| X01 | `CORE/WSDL - SEFi Transporteurs Sanitaires/InfoPS_EXP_2.0.6/CONTRAT_InfoPS_EXP_2.0.6/InfoPS_EXP_2.0.6.wsdl` + 13 XSD | InfoPS 2.0.6 ; opérations aux chemins `/wsdl:definitions/wsdl:portType/wsdl:operation/@name` : `rechercherEtablissement`, `rechercherPrescripteurPraticien`, `rechercherDonneesTransporteur`. | Contrat de G01. Imports via `/wsdl:definitions/wsdl:types/xsd:schema/xsd:import/@schemaLocation`; adresse via `/wsdl:definitions/wsdl:service/wsdl:port/soap*:address/@location`. Imports WSSE/WS-Addressing distants sans copies dans ce bundle ; endpoint qualification. | `PARTIALLY_REVIEWED` |
| X02 | `.../PELTranspLPS_EXP_2.2.1/PELTranspLPS_EXP_2.2.1/PELTranspLPS_EXP_2.2.1.wsdl` + 30 XSD | PELTranspLPS 2.2.1 ; acquisition, réservation, exécution aux chemins WSDL communs de X01. | Contrat de G02. `CONFLIT` : `xsd/PELTranspLPS/ROOT_expolps_peltransp_EXPOLPSTRANSP_PELTRANSP_V00_07.xsd` et `AUX_prescription_EXPOLPSTRANSP_PELTRANSP_V00_07.xsd` portent `/xsd:schema/xsd:annotation/xsd:appinfo/Package/@Version = 00.06`. Métadonnées `CVS/*` non contractuelles. | `PARTIALLY_REVIEWED` |
| X03 | `.../SEMaFELTransport_EXP_1.1.0/SEMaFELTransport_EXP_1.1.0/SEMaFELTransport_EXP_1.1.0.wsdl` + 33 XSD | SEMaFELTransport 1.1.0 ; consultation, recevabilité, calcul, validation aux chemins WSDL communs de X01. | Contrat de G03. Imports distants malgré certaines copies locales ; adresse de qualification via le chemin `soap*:address/@location` ; version `soapAction` distincte. | `PARTIALLY_REVIEWED` |
| X04 | `.../ServicePEC_EXP_1.0.4/ServicePEC_EXP_1.0.4/ServicePEC_EXP_1.0.4.wsdl` + 6 XSD | ServicePEC 1.0.4 ; opération `calculer` au chemin WSDL commun de X01. | Contrat de G04. Imports WSSE/WS-Addressing distants ; adresse de qualification via le chemin `soap*:address/@location` ; version `soapAction` distincte. | `PARTIALLY_REVIEWED` |
| X05 | Métadonnées `/xsd:schema/xsd:annotation/xsd:appinfo/Package/@Status` des 82 XSD | Statuts internes Camelia souvent `Draft`, parfois `Approved`. | `INCONNU` : portée de ces valeurs pour l'opposabilité du contrat diffusé. Ne pas les assimiler au statut officiel sans décision GIE/CNDA. | `PARTIALLY_REVIEWED` |

`RECOMMANDE` : créer ultérieurement une copie dérivée, versionnée et sans accès réseau du graphe de schémas, puis compiler/valider cette copie. Ne jamais modifier les originaux ni laisser un outil télécharger silencieusement les imports HTTP.

### 4.5 Exemples XML

Racine : `CORE/Exemple ‐ SEFi Transporteurs Sanitaire v1.2/`. Les 22 XML sont bien formés ; leur validation contre les contrats courants reste à faire. D01 p.3 les classe comme **exemples**, pas comme norme.

| ID | Lot | Contenu / relation | Statut et réserve | Couverture |
|---|---|---|---|---|
| E01 | `InfoPS_EXP_2.0.5_v2/` | 6 requêtes/réponses PS1, PS3, PS4 ; version antérieure au contrat 2.0.6. | Exemple ; date propre `INCONNU`. | `PARTIALLY_REVIEWED` |
| E02 | `PELTransp_EXP_2.1.5_v2/` | 6 requêtes/réponses PL1 à PL3 ; version antérieure au contrat 2.2.1. | Exemple ; date propre `INCONNU`. | `PARTIALLY_REVIEWED` |
| E03 | `SEMaFELTransport_EXP_1.1.0_v1/` | 8 requêtes/réponses FT1 à FT4 ; version nominale alignée 1.1.0. | Exemple, sans présomption normative. | `PARTIALLY_REVIEWED` |
| E04 | `ServicePEC_EXP_1.0.3_v2/` | 2 XML PEC1 ; version antérieure au contrat 1.0.4. | `CONFLIT` : dans `WS_PEC1_calculer_Response.xml`, `FACTURE/COUVERTURE[2]` commence par `Nature` et omet le choix d'identification obligatoire. `X04/xsd/PriseEnChargeTransport/AUX_facturation_SE_MODALITEPECTRANSP_V00_03.xsd`, type `Couverture_SE_MODALITEPECTRANSP`, impose d'abord `IdOrg` ou le triplet `GrandRegime/Organisme/EntiteGestion`, puis `Nature`. L'exemple ne doit pas corriger le XSD. | `PARTIALLY_REVIEWED` |

### 4.6 Qualification CNDA SEFi 03.50.00

Le ZIP `CNDA/Package_SEFi TR_03.50.00.zip` et les onze PDF extraits à côté forment **une livraison unique**. Les guides sont des sources de qualification : ils permettent de vérifier la conformité attendue lors des essais, mais ne remplacent pas automatiquement la source fonctionnelle, juridique ou tarifaire qu'ils mettent en scène.

| ID | Chemin / titre | Autorité, version, date, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| Q01 | `CNDA/Package_SEFi TR_03.50.00.zip` + onze PDF extraits | CNDA ; livraison 03.50.00 ; package de qualification ; date de synthèse 21/08/2026. | Conteneur des Q02 et Q04-Q13. Inventaire établi ; pas de contrôle d'intégrité membre à membre. | `PARTIALLY_REVIEWED` |
| Q02 | `CNDA/SEL-GCONFORM-FTE_Package CNDA SEFi_V3.50.00.pdf` | CNDA ; v3.50.00 ; 21/08/2026 ; présentation primaire de qualification ; 8 p. | Historique, organisation et liste des dix guides p.8. La p.6 paraît décrire étroitement le service de calcul avant d'exiger l'intégration de tous les services SEFi : portée rédactionnelle à confirmer. | `REVIEWED` |
| Q03 | `CNDA/Conditions_contractuelles_SEFi_TS_V3.02.pdf` | CNDA/CNAM ; v3.02 dans le nom ; aucune version/date visible dans le contenu ; conditions contractuelles ; 18 p. | Source distincte, placée à côté du ZIP. Art.2 p.5 : corpus contractuel dynamique ; art.3 p.5 : cartes CDE/CPE et géolocalisation 1.05+ ; art.5 : processus qualification/autorisation. La métadonnée de création PDF ne vaut pas date officielle. | `PARTIALLY_REVIEWED` |
| Q04 | `CNDA/SEL-GCONFORM-FTE_Administrer le poste du PS_V1.20.11.pdf` | CNDA ; v1.20.11 ; 21/08/2026 ; guide de conformité. | Administration, paramétrage, lots, limites, multi-sociétés et traces ; sommaire p.4 ; à confronter à FTE05/DICO. | `PARTIALLY_REVIEWED` |
| Q05 | `CNDA/SEL-GCONFORM-FTE_arbre de_décisions_V1.15.pdf` | CNDA ; v1.15 ; 21/08/2026 ; guide de conformité. | DAP, garde/TUPH, transfrontalier, migrant ; dépend de PDT-INF-293. `CONFLIT` p.5, test 1.01 DAP : le texte autorise puis demande d'empêcher les mêmes appels, avant d'attendre la démonstration d'une FEL. | `PARTIALLY_REVIEWED` |
| Q06 | `CNDA/SEL-GCONFORM-FTE_Prescription en ligne_V0.80.06.pdf` | CNDA ; v0.80.06 ; 21/08/2026 ; guide de conformité. | Acquisition, réservation, exécution, sécurité, affichage et erreurs ; à confronter à FTE01, FTE04, WS_PL et contrat PEL. Renvoie à PDT-INF-237, non retrouvé. | `PARTIALLY_REVIEWED` |
| Q07 | `CNDA/SEL-GCONFORM-FTE_RéférentielsAMO_V0.61.pdf` | CNDA ; v0.61 ; 27/05/2019 ; indiqué « inchangé » par le catalogue 3.50. | PS, bénéficiaire et transporteur/RNT ; dépend de FTE04, WS_PS et WS_BS. Référence SEL-MP-013 v0.30, alors que le corpus local porte 1.15. | `PARTIALLY_REVIEWED` |
| Q08 | `CNDA/SEL-GCONFORM-FTE_consulter prise en charge_v0.09.13.pdf` | CNDA ; v0.09.13 ; 21/08/2026 ; guide de conformité. | PEC : AT, ALD, exonérations, AME, C2S, maternité, taux, Corse, TMR/TUPH ; à confronter à G04/X04 et FTE02/04. | `PARTIALLY_REVIEWED` |
| Q09 | `CNDA/SEL-GCONFORM-FTE_Calculer les montants d'une prestation_V0.60.13.pdf` | CNDA ; v0.60.13 ; 21/08/2026 ; guide de conformité. | Entrées/sorties, intégration, cohérence SOAP, AMC, TMR/TUPH ; dépend de sources métier, tarifaires, géolocalisation et FT4. | `PARTIALLY_REVIEWED` |
| Q10 | `CNDA/SEL-GCONFORM-FTE_Contrôler la recevabilité en FEL_V0.60.22.pdf` | CNDA ; v0.60.22 ; 21/08/2026 ; guide de conformité ; 82 p. | Tests pp.9-76, traces pp.77-78, transcodification B2 pp.79-82. `CONFLIT` pp.71-74 : `SUPFORF=3` à montant nul puis suppléments déclarés incompatibles. `CONFLIT` test 1.39 pp.75-76 : second trajet dans la description, premier dans le contrôle. Renvoie à FI 631 v1, absent. | `PARTIALLY_REVIEWED` |
| Q11 | `CNDA/SEL-GCONFORM-FTE_Récupérer les données de la FEL_V0.63.pdf` | CNDA ; v0.63 ; 27/05/2019 ; indiqué « inchangé » par le catalogue 3.50. | Consultation FT1 et restitution FEL ; tests pp.5-10 ; à confronter à G03/X03. | `PARTIALLY_REVIEWED` |
| Q12 | `CNDA/SEL-GCONFORM-FTE_Valider la FEL_V0.60.13.pdf` | CNDA ; v0.60.13 ; 21/08/2026 ; guide de conformité. | Sécurité, erreurs, accusés, reprises, annulation, identifiants/doublons/certificat ; traces p.23. Renvoie à PDT-INF-307 v6 et FI 631 v1. | `PARTIALLY_REVIEWED` |
| Q13 | `CNDA/SEL-GCONFORM-FTE_DMAT_V0.73.15.pdf` | CNDA ; catalogue 0.73.15, couverture `00.73.15` ; 21/08/2026 ; guide de conformité ; 80 p. | Numérisation pp.6-16, lots pp.17-41, transmission pp.42-47, retours pp.48-79 ; dépend de FTE03 et SCOR 2.12. | `PARTIALLY_REVIEWED` |

**Applicabilité :** `ETABLI` pour le package de tests 03.50.00 ; l'effet temporel réel doit être combiné avec la décision CTLSAM et la situation contractuelle de l'éditeur. Les plans personnalisés, environnements, certificats/cartes et dates de rendez-vous ne sont pas contenus dans ce corpus générique : ils restent des entrées de campagne à obtenir.

### 4.7 Géolocalisation 1.05 et qualification 01.05.00

| ID | Chemin / titre | Autorité, version, date, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| Z01 | `SEFI/Géolocalisation Transporteur Sanitaire/PDT-INF-374v2-Diffusion du package Geolocalisation.pdf` | GIE SESAM-Vitale ; v2 ; 19/03/2024 ; fiche de diffusion ; 2 p. | Annonce FACT-SFG-039 v1.05 et XSD v1 ; indique une livraison du 19/02/2024. Relation FTE02, WS_FT, tarification majorée. | `REVIEWED` |
| Z02 | `GEO/Package GEOLOCALISATION v1.05/FACT-SFG-039 ..._1.05 avec MR.pdf` et édition `...sans MR.pdf` | GIE SESAM-Vitale ; v1.05 ; 14/02/2024 ; SFG, deux représentations d'une même spécification. | Constitution/transmission de traces, capacités GE01-GE04 ; relation FTE02 et qualification géoloc. `CONFLIT` de statut : couverture `REFERENCE`, §1.2 p.4 « Version de travail ». | `PARTIALLY_REVIEWED` |
| Z03 | `GEO/Package GEOLOCALISATION v1.05/TracesGeolocalisation.xsd` | GIE SESAM-Vitale ; schéma commenté v1.0 ; contrat XSD. | Contrat de traces. `/xs:schema/xs:import` pointe vers `http://www.topografix.com/gpx/1/1/gpx.xsd`. Ne pas résoudre en réseau. | `REVIEWED` pour structure/imports |
| Z04 | `GEO/Package GEOLOCALISATION v1.05/Dependances/GPX_1.1/gpx.xsd` et dépendances locales | Topografix/standard GPX ; 1.1 ; copie technique locale. | Dépendance de Z03. Sa provenance/licence et son identité avec la cible HTTP doivent être qualifiées avant activation. | `NOT_REVIEWED` |
| Z05 | `GEO/Qualification CNDA 01.05.00/Conditions_contractuelles_Geolocalisation_V3.01.pdf` | CNDA/CNAM ; v3.01 dans le nom ; aucune version/date visible dans le contenu ; conditions contractuelles. Métadonnée de création 22/03/2024, non assimilable à une publication. | Prérequis et processus de qualification. Art.3 p.4 exige SEFi 3.40 ou plus ; Q03 art.3 p.5 exige géoloc 1.05 : dépendance croisée à représenter explicitement. | `PARTIALLY_REVIEWED` |
| Z06 | `GEO/Qualification CNDA 01.05.00/SEL-GCONFORM-GEO_Package CNDA GEOLOCALISATION_V01.05.00.pdf` | CNDA ; 01.05.00 ; 22/03/2024 ; synthèse qualification. | Composition de la campagne de qualification géolocalisation, p.5. | `REVIEWED` |
| Z07 | `GEO/Qualification CNDA 01.05.00/SEL-GCONFORM_GEOLOCALISATION_01.05.00.pdf` | CNDA ; 01.05.00 ; 22/03/2024 ; guide de conformité. | `CONFLIT` : p.4 annonce les tests 3.01 à 3.05, tandis que le sommaire p.3 et le corps pp.15-18 s'arrêtent à 3.04. Pied de page périmé au 31/03/2022. | `PARTIALLY_REVIEWED` |
| Z08 | `GEO/Qualification CNDA 01.05.00/SEL-GEOLOCALISATION Différentiel Tests_V01.05.00.xlsx` | CNDA ; 01.05.00 attendu ; date documentaire non établie ; différentiel de tests. | Lignes 26-29 : tests 3.01 à 3.04 seulement, renforçant le conflit Z07. Cellule H6 : « Package 01.054.00 », probablement coquille à conserver comme réserve. | `PARTIALLY_REVIEWED` |

`INCONNU` : aucune décision publique courante équivalente à la décision CTLSAM SEFi 3.50 n'a été retrouvée pour établir l'opposabilité exacte de la géolocalisation 01.05.00 au 26/09/2026.

### 4.8 Cartes, kit et formulaires de repli

| ID | Chemin / titre | Autorité, version, date, nature | Rôle et réserve | Couverture |
|---|---|---|---|---|
| P01 | `SEFI/Cartes de test TS/Commande CDE CPE - Transporteur Sanitaires (octobre 2022).pdf` | CNAM ; octobre 2022 ; procédure cartes CDE/CPE ; 7 p. | Malgré son dossier, décrit la commande et l'usage de cartes d'entreprise de production, pas un jeu de cartes CNDA. Formulaires, URL et circuits ANS à revérifier en 2026. | `REVIEWED`, applicabilité actuelle `INCONNU` |
| P02 | `SEFI/Kit accompagnement/Multi-sociétés et sociétés bicéphales/SEFi_II.5_Multi-sociétés (2022).pdf` | CNAM ; mai 2022 ; guide opérationnel ; 1 p. | Mandant/mandataire et cartes ; relation avec le test Administration 1.11. À réconcilier avec le guide CNDA 2026. | `REVIEWED` |
| P03 | `SEFI/Kit accompagnement/Logos/` et archive `logos SEFi transport.zip` | Kit graphique ; date/version non établies ; communication. | Hors extraction réglementaire, sauf éventuelle exigence contractuelle de marque non identifiée. | `NOT_APPLICABLE` |
| P04 | `SEFI/Documents papier TS/CERFA 1116303 Facture de transport VSL ou ambulance.pdf` | Assurance Maladie/Cerfa ; modèle `SPECIMEN` ; référence visible 11163*03 / S3601d ; date officielle non établie. | Repli papier/facture. La page catalogue Ameli affiche encore 11163*02 : `CONFLIT` de référencement public, à faire confirmer. Une métadonnée PDF ne vaut pas date officielle. | `REVIEWED` |
| P05 | `SEFI/Documents papier TS/CERFA 5400301 Annexe à la facture valant attestation de service fait (ASF) - TS.pdf` | Assurance Maladie/Cerfa ; modèle `SPECIMEN` ; référence visible 54003*01 / S3602b ; date officielle non établie. | Repli papier/ASF. La page catalogue Ameli affiche S3602b Cerfa 11917*01 : `CONFLIT` de référencement public. | `REVIEWED` |
| P06 | Page Ameli « Facturation : mode d'emploi », <https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/facturation/modalites-facturation> | Assurance Maladie ; mise à jour 15/05/2025 ; page d'exploitation consultée 26/09/2026. | Oriente vers SEFi, SCOR et formulaires S3601d/S3602b ; à conserver comme consigne datée, non comme remplacement des spécifications. | `REVIEWED` pour le routage |
| P07 | Page catalogue Ameli « Rechercher un formulaire », <https://www.ameli.fr/transporteur-sanitaire/recherche-formulaire> | Assurance Maladie ; page courante consultée 26/09/2026. | Source du conflit de références Cerfa P04/P05. Les PDF liés portent les mêmes références visibles que les copies locales. | `REVIEWED` pour ce point |
| P08 | `COMMUN/Formulaires de facturation/PDT-INF-897-Mise à disposition des modèles de factures TS et TX attestation de service fait (ASF) et modèle dannexe 4.pdf` | GIE SESAM-Vitale ; PDT-INF-897 ; 07/04/2025 ; notice de diffusion. | p.1 : contexte transport partagé ; p.2 : modèles TS 11163*03 et 54003*01, modifications et articulation SCOR/B2/SEFi. | `REVIEWED` |

### 4.9 SCOR — socle commun et adaptation TS

Racines : `COMMUN/SCOR/Baseline commune 2.12` et `SEFI/SCOR`. FTE03 et FTE05 référencent explicitement SCOR-SFG-002/003/006 ; ce corpus est donc une dépendance du nominal SEFi pour les PJ, non un simple complément documentaire.

| ID | Chemin / titre | Autorité, version, date, statut, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| C01 | `COMMUN/SCOR/Baseline commune 2.12/SCOR-INF-609 Diffusion des spécifications SCOR v2.12.pdf` | GIE SESAM-Vitale ; SCOR-INF-609 ; 05/03/2019 ; notice de diffusion primaire. | Liste PG 1.24, DICO 1.24 et TT-TA 1.24 p.1. Forte applicabilité comme baseline commune, mais modalités professionnelles séparées. | `REVIEWED` |
| C02 | `.../SCOR-SFG-002_V01.24_PG.pdf` | GIE SESAM-Vitale ; v1.24 ; 23/11/2018 ; `PROVISOIRE`, `RESTREINTE`. | Acteurs, cycles, liens B2/SEH ; positionnement p.6, références p.7. Statut à confirmer malgré diffusion 2.12. | `PARTIALLY_REVIEWED` |
| C03 | `.../SCOR-SFG-003_01.26.01_TT-TA.pdf` | GIE SESAM-Vitale ; couverture v1.26 ; 03/11/2021 ; `PROVISOIRE`, `RESTREINTE`. | Flux PJ, retours et paramètres ; sommaire pp.3-4, références p.5. Nom de fichier `01.26.01` contre couverture `1.26` : ambiguïté de version. | `PARTIALLY_REVIEWED` |
| C04 | `.../PDT-INF-747 SCOR évolution SCOR-SFG-003 v1.26 (...).pdf` | GIE SESAM-Vitale ; PDT-INF-747 v2 ; 06/12/2021 ; évolution primaire. | Met à jour le TT-TA, précise l'en-tête SEH `VO212000` et renvoie les TS à FTE05 ; p.1. | `REVIEWED` |
| C05 | `.../SCOR-SFG-006_01.24_DICO.pdf` | GIE SESAM-Vitale ; nom 01.24, couverture v1.23 ; 23/10/2018 ; `PROVISOIRE`. | Dictionnaire SCOR. `CONFLIT` de version entre fiche/nom et couverture ; ne pas corriger l'original. | `PARTIALLY_REVIEWED` |
| C06 | `SEFI/SCOR/Annexe Transporteurs sanitaires/2016-02-annexe-scor-transporteurs-sanitaires-transport-flux.pdf` | CNAMTS ; DMPR 2016/2 ; février 2016 ; annexe métier primaire. | ASF numérisée, signature et flux p.2-4. Applicabilité 2026 probable mais maintien en vigueur `INCONNU`. | `PARTIALLY_REVIEWED` |
| C07 | `SEFI/SCOR/Contrat et normes d’échange SCOR v04.00/2015-09-scor-version-4-transport-flux.zip` et membres | GIE SESAM-Vitale ; SEH SCOR v4.00 ; septembre 2015 ; livraison de contrat. | WSDL/XSD et exemples, une seule livraison archive/extraction. Référencée par C02 p.7 ; à analyser avec C01-C05 et erratum 2021. | Inventaire `PARTIALLY_REVIEWED`, contrats `NOT_REVIEWED` |
| C08 | `COMMUN/SCOR/Baseline commune 2.12/Exemples de fichiers SCOR non chiffrés.zip` et extraction | GIE SESAM-Vitale ; exemples ; date/version à relever. | `lisez_moi.txt` les qualifie d'exemples. Fixtures, jamais preuve normative. | Notice `REVIEWED`, exemples `NOT_REVIEWED` |
| C09 | `SEFI/SCOR/Sécurité certificats et CRL/Tutoriel IGC OSI - Utiliser les certificats de chiffrement et la CRL.pdf` | Autorité/version/date à relever ; tutoriel sécurité. | Dépendance potentielle au chiffrement SCOR ; statut et actualité à confirmer. | `NOT_REVIEWED` |

### 4.10 Services bénéficiaire et cadre TLSi AMO

FTE04 appelle explicitement WS_BS1/WS_BS2. Le package bénéficiaire 01.15 et sa qualification restent une livraison/autorisation séparée de SEFi 03.50.

| ID | Chemin / titre | Autorité, version, date, statut, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| T01 | `COMMUN/Services AMO/Package TLSi bénéficiaire version 01.15/PDT-INF-846-Fiche de livraison Package documentaire TLSi bénéficiaire.pdf` | GIE SESAM-Vitale ; PDT-INF-846 ; 05/02/2024 ; notice de diffusion. | p.1 : WS_BS1/2 ; p.2 : SEL-MP-013 01.15, WSDL 1.0.6, exemples 1.0.5, CI hors livraison ; p.3 : autorisation CNDA séparée. | `REVIEWED` |
| T02 | `.../SEL-MP-013_01.15_WS_BS Services en Ligne Bénéficiaire avec MR.pdf` et `...sans MR.pdf` | GIE SESAM-Vitale ; v01.15 ; 10/11/2023 ; `REFERENCE`, `RESTREINTE` ; deux représentations. | Opérations/données WS_BS. Références p.4 ; opérations à partir de p.5. Lié à DICO/FTE04 et cadre TLSi. | `PARTIALLY_REVIEWED` |
| T03 | `.../InfoBenefTransp_EXP_1.0.6/` | GIE SESAM-Vitale ; contrat WSDL/XSD v1.0.6 ; date de diffusion via T01. | Contrat de T02. Schémas et imports à analyser en lots WS_BS1/2. | Inventaire `PARTIALLY_REVIEWED`, schémas `NOT_REVIEWED` |
| T04 | `.../Exemples_CONTRAT_InfoBenef_EXP_1.0.5/` | GIE SESAM-Vitale ; exemples v1.0.5. | Exemples antérieurs au contrat 1.0.6 ; non normatifs. | `NOT_REVIEWED` |
| T05 | `.../Qualification CNDA 01.15.00/` — conditions, package, guide et différentiel | CNDA ; qualification 01.15.00 ; package daté 05/02/2024 selon synthèse. | Qualification propre au TLSi bénéficiaire ; ne pas la réputée incluse dans SEFi 03.50. | `PARTIALLY_REVIEWED` |
| T06 | `COMMUN/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/.../CI-TLSi_AMO_V1_2_3.pdf` | GIE SESAM-Vitale ; 01.02.03 ; 23/04/2026 ; `RESTREINTE`. | Sécurité, transport, authentification et assertions. PG 3.50 exige les principes TLSi mais annonce que les références seront précisées ultérieurement : version exactement exigée `INCONNU`. | `PARTIALLY_REVIEWED` |
| T07 | `.../PDT-INF-850_CI_TLSI_AMO_1.2.3.pdf` | GIE SESAM-Vitale ; PDT-INF-850 ; 12/05/2026 ; diffusion primaire. | p.1-2 : portée tous TLSi et statut de référence pour nouvelles autorisations CNDA, sans réagrément automatique des produits autorisés. | `REVIEWED` |
| T08 | `.../SEL-INF-031_Modalite acces cartes et certificats_1.4.pdf`, `SEL-INF-032_V1_3.pdf`, `CI-TLSi_CIPHER_SUITE_V1_2_0.pdf` | GIE SESAM-Vitale ; versions 1.4/1.3/1.2.0 ; dates propres à relever ; spécifications transverses. | Cartes/certificats, accès et cryptographie appelés par T02/T06 ; applicabilité exacte à la campagne 03.50 à établir. | `NOT_REVIEWED` |
| T09 | `.../PDT-INF-913 WSDL_XSD Gestion Redirections et Recommandations Mise en Cache.pdf` | GIE SESAM-Vitale ; PDT-INF-913 ; 02/10/2025 ; consigne transverse. | p.2 : redirections et conservation locale des XSD, notamment SEFi/PEC+/TLSi. | `REVIEWED` |
| T10 | `COMMUN/Services AMO/Intégrer un TLSi AMO/Disponibilite-des-TLSi-par-regime-publiee.pdf` | GIE SESAM-Vitale ; mise à jour affichée 23/04/2026 ; tableau opérationnel. | Disponibilité du service SEFi TS par régime ; information susceptible d'évoluer, à dater à chaque extraction. Source officielle en ligne consultée le 26/09/2026 : <https://www.sesam-vitale.fr/documents/20182/55478/Disponibilite-des-TLSi-par-regime-publiee.pdf>. | `PARTIALLY_REVIEWED` |
| T11 | `COMMUN/Services AMO/Intégrer un TLSi AMO/Guides et procédure/Guide des livrables TLSi 2026.pdf` et `Guide de demarrage TLSi 2026.pdf` | GIE SESAM-Vitale ; 2026 ; guides de procédure. | Candidats pour le parcours éditeur et la livraison ; ne remplacent pas CI/SFG/contrats. | `NOT_REVIEWED` |

**Source explicitement référencée mais absente :** `CI-CNAMTS-DC v1.0.2` cité par les quatre guides SEFi n'a pas été retrouvé. Le CI TLSi 1.2.3 local est plus récent, mais son remplacement/équivalence ne peut pas être déduit sans une notice de transition.

### 4.11 Repli B2, NOEMIE et transport des flux

FTE02 pp.76-88 et PG pp.17-20 rendent B2/NOEMIE nécessaires au parcours de repli et aux retours. Cette famille doit rester séparée du flux nominal SEFi et de PEC+ B2.

| ID | Chemin / titre | Autorité, version, date, statut, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| B01 | `COMMUN/B2/Normes communes/2007-06-cdc-errata-norme-b2.pdf` | CNAMTS, CCMSA, RSI, UNRS ; juin 2007 avec errata ; norme inter-régimes. | Enregistrements B2 types 1, 2, 2S, 2E, 4/4T/4U, 5, 6, 999. FTE02 cite « juin 2007-AddendumB » : référence/libellé à réconcilier. | `PARTIALLY_REVIEWED` |
| B02 | `TS-B2/AMELI/2002-04-annexe-transporteur-norme-b2.pdf` | CNAMTS, Comité Normes B2 ; daté 01/02/2012, maj 24/04/2012 ; annexe métier Avenant 6. | Ajouts TS, types 4T/4U p.1-3. Nom local `2002-04` trompeur. | `REVIEWED` |
| B03 | `TS-B2/AMELI/2015-07-geolocalisation-annexe-ta-norme-b2.pdf` | CNAMTS, Comité Normes B2 ; 06/07/2015 ; annexe B2 juin 2005-B+. | Champs géolocalisation et autorisation. Compatibilité exacte avec socle 2007 à établir. | `REVIEWED` |
| B04 | `COMMUN/B2/Normes communes/Annexe10-B2-AMO_mars_2026.pdf` | CNAM ; mars 2026 ; annexe courante B2/NOEMIE. | Codes actes/prestations et natures ; candidate de codification pour le repli. | `PARTIALLY_REVIEWED` |
| B05 | `.../2018-05-annexe-8-v2-norme-b2.pdf` | CNAMTS ; 14/05/2018 ; annexe B2. | Codes justificatifs de droits, notamment ADRi/CDRi ; à confronter aux droits SEFi. | `REVIEWED` |
| B06 | `.../2016-06-cdc-ps-norme-noemie.pdf` | CNAMTS, CCMSA, RSI, UNRS ; juin 2016 ; norme NOEMIE PS. | Retours 531, 580, 900 ; catalogue pp.11-26. PG 3.50 prescrit 531 et annonce 580 à terme : 580 n'est pas à promouvoir comme règle actuelle sans nouvelle preuve. | `PARTIALLY_REVIEWED` |
| B07 | `COMMUN/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/ETS-DT-001_TransportsFlux_SpecsTechCommune_V1.52.00.pdf` | GIE SESAM-Vitale ; ETS-DT-001 v01.52.00 ; 27/05/2025 ; `REFERENCE`, `RESTREINTE`. | SMTP, chiffrement, frontaux ; p.5 inclut TS/taxis parmi les autres PS. | `PARTIALLY_REVIEWED` |
| B08 | `.../ETS-DT-003_Création du fichier logique de facturation AMO et traitement des retours_v02.20.pdf` | GIE SESAM-Vitale ; ETS-DT-003 v02.20 ; 14/06/2024. | Regroupement logique, ARL/RSP et transport ; pp.6-7. Cinématiques principalement FIDES/MCO : applicabilité détaillée aux TS à extraire prudemment. | `PARTIALLY_REVIEWED` |
| B09 | `COMMUN/B2/Transport des flux de facturation/Cahier de tests/VALID-PTV-001-v01.05 - Tests de chiffrement des flux.pdf` et formulaire `ETS-FDC-002...` | GIE SESAM-Vitale ; versions/dates propres à relever ; qualification transport. | Tests de chiffrement/transport à traiter séparément de la qualification fonctionnelle SEFi. | `NOT_REVIEWED` |
| B10 | `.../Archives/ETS-DT-001_...v1.50.30.pdf`, `...v1.51.11.pdf`, `PDT-INF-856...` | GIE SESAM-Vitale ; anciennes versions. | Historique de transport, remplacé par B07 pour la baseline courante sauf renvoi explicite. | `NOT_APPLICABLE` au courant ; `NOT_REVIEWED` historique |
| B11 | `COMMUN/B2/PEC Plus 2.13/` — PDT-INF-198, FACT-SFG-037, SEL-MP-010, contrats 4.0.1/4.0.4, exemples et qualification 02.13.07 | GIE SESAM-Vitale/CNDA ; PEC+ 2.13 ; 2016 et qualification séparée. | Produit B2 voisin, distinct du `ServicePEC_EXP_1.0.4` SEFi. | `NOT_APPLICABLE` au nominal SEFi ; `PARTIALLY_REVIEWED` pour distinction |
| B12 | `COMMUN/B2/Evolutions/Avenant 48 RPPS - provisoire/PDT-CDC-112...v01.42...pdf` et `PDT-INF-926v2...pdf` | GIE SESAM-Vitale ; CDC v01.42 `PROVISOIRE` 18/03/2026 ; notice 28/04/2026. | Évolution B2 RPPS. Notice subordonne l'opposabilité à l'ouverture CNDA ; cas/tests d'ouverture non retrouvés. | CDC `PARTIALLY_REVIEWED`, notice `REVIEWED`; applicabilité `INCONNU` |

`CONFLIT` critique à traiter dans le lot B2 : FTE02 pp.87-88 place le code TPR en positions 74-78 et la quantité en 75-80, donc avec chevauchement ; B01 place la quantité en 79-80. Aucun arbitrage n'est fait ici. Le package/cahier de tests CNDA B2 TS correspondant au repli courant n'a pas été localisé (`MISSING`).

### 4.12 Droit, prescription, prise en charge et transport partagé

Les fichiers Markdown ci-dessous sont des transcriptions de travail locales avec URL Légifrance ; ils ne deviennent pas, par leur seule présence, des originaux officiels. Lors de l'extraction, chaque proposition devra être contrôlée dans la version officielle en vigueur à la date visée.

| ID | Chemin / titre | Autorité, référence, version/date, nature | Domaine, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| L01 | `COMMUN/Droit et règles/Arrete_2006-12-23_referentiel_prescription_transports_version_2026-09-26.md` | République française ; arrêté du 23/12/2006, NOR SANS0624760A, effet 30/12/2006 ; transcription secondaire. | Référentiel de prescription des transports ; nécessaire à prescription/DAP. Source officielle Légifrance liée dans le fichier. | `PARTIALLY_REVIEWED` |
| L02 | `.../CSS_L160-14_extraits_transport_version_2026-09-26.md` | Code de la sécurité sociale ; L.160-14, version depuis 20/08/2026, réf. LEGIARTI000054711279 ; extraits secondaires. | Participation/exonérations liées au transport. Applicable à la date de coupure sous réserve de vérification officielle. | `PARTIALLY_REVIEWED` |
| L03 | `.../CSS_R160_regles_transport_versions_2026-09-26_2027-01-01.md` | CSS ; versions actuelles et future de R.160-5, R.160-8 à R.160-11 et R.160-16 ; transcription secondaire. | Prise en charge/participation. Version au 26/09 candidate ; partie prenant effet le 01/01/2027 `NOT_APPLICABLE` à la date de référence mais à conserver comme transition. | `PARTIALLY_REVIEWED` |
| L04 | `.../CSS_R322-10_a_R322-10-9_versions_2026-09-26_et_2026-10-01.md` | CSS ; versions au 26/09 et à compter du 01/10/2026 ; transcription secondaire. | Prescription/accord préalable/transport. Partie 01/10 `NOT_APPLICABLE` au 26/09, mais imminente et à isoler. | `PARTIALLY_REVIEWED` |
| L05 | `.../Decision_UNCAM_2023-07-18_participation_transports_45_pourcent.md` | UNCAM ; décision 18/07/2023, NOR SPRU2320048S, JORF/effet 01/08/2023 ; transcription secondaire. | Taux de participation ; à relier au moteur de prise en charge, pas au contrat XML. | `PARTIALLY_REVIEWED` |
| L06 | `COMMUN/Droit et règles/Formulaires officiels/S3138g_Cerfa_11574-07_...pdf` et `S3139h_Cerfa_11575-08_...pdf` | Assurance Maladie/Cerfa ; 11574*07 et 11575*08 ; copies Ameli modifiées 12/02/2026 ; formulaires officiels `SPECIMEN`. | Prescription papier et DAP, parcours de repli. Réserve locale : notice Service-Public encore 50742#06 alors que le PDF Ameli contient 50742#07. | `NOT_REVIEWED` ; `README.md` de provenance `REVIEWED` |
| L07 | `COMMUN/Droit et règles/Transport partagé/Decret_2025-202_2025-02-28_transport_partage.pdf` | République française ; décret 2025-202 du 28/02/2025, JORF 01/03/2025, NOR TSSS2430862D ; texte primaire. | Cadre du transport partagé. | `PARTIALLY_REVIEWED` |
| L08 | `.../Arrete_2025-02-28_transports_partages.pdf` | République française ; arrêté 28/02/2025, JORF 01/03/2025, NOR TSSS2503520A ; texte primaire. | Modalités du transport partagé. | `PARTIALLY_REVIEWED` |
| L09 | `.../CSS_L322-5_a_L322-5-5_version_2026-09-20.pdf` et `CSS_R322-11-1_a_R322-11-8_version_2026-09-20.pdf` | Légifrance ; captures officielles au 20/09/2026. | Socle législatif/réglementaire du transport partagé ; vérifier la version au 26/09 avant promotion. | `PARTIALLY_REVIEWED` |
| L10 | `.../CIR-5-2025_transport_partage_tiers_payant.pdf` | CNAM ; CIR-5/2025, 18/04/2025, maj 23/04/2025 ; circulaire d'exploitation. | Mise en œuvre et tiers payant, pp.1-4 ; antérieure aux évolutions conventionnelles ultérieures, donc ne suffit pas seule au tarif 2026. | `PARTIALLY_REVIEWED` |
| L11 | `.../Tiers_payant_transport_partage_page_Ameli_consultee_2026-09-20.html` | Assurance Maladie ; page officielle sauvegardée ; consultation 20/09/2026. | Consigne publique datée ; à recouper avec textes et circulaire. | `PARTIALLY_REVIEWED` |
| L12 | `METIER/Transport partagé/Annexes spécifiques TS - CIR-5-2025/` — deux annexes facture/ASF | CNAM ; 2025 ; modèles professionnels. | Modèles S3601d/S3602b ; doublons fonctionnels des P04/P05 à traiter comme même modèle diffusé, pas comme sources indépendantes. | `NOT_REVIEWED` |

Les originaux officiels suivants, liés par les transcriptions L01-L05, sont des **sources candidates autonomes**. Ils n'ont pas été relus pendant ce cadrage et aucune copie officielle locale n'est disponible ; ils devront être consultés à la date de version indiquée avant toute extraction juridique.

| ID | URL officielle candidate | Autorité / rôle documentaire | Applicabilité à vérifier | Couverture |
|---|---|---|---|---|
| L01P | <https://www.legifrance.gouv.fr/loda/id/JORFTEXT000000645199/2026-09-26> | Légifrance ; version officielle de l'arrêté de prescription référencé par L01. | TS, prescription/DAP, version au 26/09/2026. | `NOT_REVIEWED` ; copie locale `MISSING` |
| L02P | <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000054711279/2026-09-26> | Légifrance ; article officiel L.160-14 référencé par L02. | TS, participation/exonérations, version au 26/09/2026. | `NOT_REVIEWED` ; copie locale `MISSING` |
| L03P | <https://www.legifrance.gouv.fr/codes/section_lc/LEGITEXT000006073189/LEGISCTA000031795491/2026-09-26> | Légifrance ; section officielle R.160 référencée par L03. | Version au 26/09/2026 ; les versions futures liées dans L03 restent `NOT_APPLICABLE` à la baseline jusqu'à leur date d'effet. | `NOT_REVIEWED` ; copie locale `MISSING` |
| L04P | <https://www.legifrance.gouv.fr/codes/section_lc/LEGITEXT000006073189/LEGISCTA000006186455/2026-09-26> | Légifrance ; section officielle R.322-10 à R.322-10-9 référencée par L04. | Version au 26/09/2026 ; la version du 01/10/2026 est hors date de référence. | `NOT_REVIEWED` ; copie locale `MISSING` |
| L05P | <https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000047911778> | Légifrance/JORF ; décision UNCAM officielle référencée par L05. | TS, participation, vigueur et effet à revérifier avant extraction. | `NOT_REVIEWED` ; copie locale `MISSING` |

### 4.13 Convention TS, tarification, TUPH et contextes métier

La convention initiale ne peut pas être lue seule : la future extraction devra reconstruire la chaîne de modifications dans l'ordre chronologique, puis contrôler les pages d'exploitation courantes.

| ID | Chemin / titre | Autorité, version/date, nature | Domaine, relations, applicabilité et réserves | Couverture |
|---|---|---|---|---|
| M01 | `METIER/Convention et tarification/Convention_nationale_transporteurs_sanitaires_2002-12-26_JO_2003-03-23.pdf` | Partenaires conventionnels / arrêté d'approbation ; signée 26/12/2002, JORF 23/03/2003 ; convention primaire scannée. | Socle conventionnel, applicable seulement après consolidation avec les avenants. | `NOT_REVIEWED` |
| M02 | Famille `.../Avenant_1_...` à `Avenant_9_...`, incluant `Avenant_7_rectificatif...` | Sources distinctes, 2003-2020. A1 est une transcription locale secondaire ; A2-A9 et le rectificatif A7 sont des PDF officiels candidats, à qualifier individuellement. | Index de routage seulement, pas une source unique ni une « chaîne primaire » homogène. Chaque avenant/rectificatif doit avoir sa propre autorité, date d'effet, rôle et couverture ; pour A1, la page Légifrance liée est la source primaire à consulter. | Inventaire de famille `PARTIALLY_REVIEWED`; contenus `NOT_REVIEWED` |
| M03 | `.../Avenant_9_cahier_des_charges_TPMR.pdf` | Autorité/date selon document ; cahier des charges conventionnel. | Capacité TPMR citée dans les contextes de facturation ; à analyser après A9. | `NOT_REVIEWED` |
| M04 | `.../Avenant_10_2020-12-22_JO_2021-03-07.pdf`, `Avenant_10_CIR-12-2021.pdf` et annexes 2/3 | Partenaires conventionnels/CNAM ; signé 22/12/2020, approuvé 26/02/2021, JORF 07/03/2021. | Transport partagé, TUPH et rémunérations ; circulaire/annexes pour exploitation. | `PARTIALLY_REVIEWED` |
| M05 | `.../Avenant_11_2023-04-13_JO_2023-05-06.pdf` et `Avenant_11_CIR-18-2023.pdf` | Partenaires conventionnels/CNAM ; signé 13/04/2023, JORF 06/05/2023. | SEFi, géolocalisation et tarification différenciée. `CONFLIT` éditorial : une date « 1er janvier 2015 » à l'art.15 paraît incompatible avec le contexte 2025 ; erratum/preuve à rechercher. | `PARTIALLY_REVIEWED` |
| M06 | `.../Avenant_11_guide_SEFi_tarification_majoree.pdf` | CNAM DSMOI/DPROF ; décembre 2025 ; guide opérationnel. | Procédure annoncée au 22/12/2025, SEFi 3.40 et géoloc 1.05. Applicabilité à 3.50 probable mais non explicitement établie. | `PARTIALLY_REVIEWED` |
| M07 | `METIER/Convention et tarification/Mise en œuvre SEFi - Avenant 11/PDT-INF-818v4 Avenant 11 impacts pour les transporteurs sanitaires.pdf` | GIE SESAM-Vitale ; PDT-INF-818 v4 ; 28/01/2026. | Tarification majorée p.1 ; activation CPAM et B2 réduit au socle p.2 ; SEFi 3.40/géoloc 1.05 et CNDA p.5. Référencée par FTE02. | `PARTIALLY_REVIEWED` |
| M08 | `.../FAQ Avenant 11_ modalités de mise en œuvre de la tarification différenciée.pdf` | Groupe de travail ; 27/11/2023 ; FAQ préparatoire. | Calendriers/périmètres dépassés par livraisons 2025-2026 ; valeur historique seulement. | `NOT_APPLICABLE` au courant |
| M09 | `.../Protocole_maitrise_depenses_transports_2025-09-24_JO_2025-09-30.pdf` | Partenaires conventionnels ; signé 24/09/2025, publié 30/09/2025 ; protocole primaire. | Maîtrise des dépenses, transport partagé, SEFi/géolocalisation et tarifs. | `PARTIALLY_REVIEWED` |
| M10 | `.../Tarifs_VSL_page_Ameli_consultee_2026-09-20.html` | Assurance Maladie ; page affichée 30/09/2025, consultée 20/09/2026. | Tarifs VSL, socle/majoré. Page officielle courante également consultée le 26/09/2026 : <https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/facturation/tarifs/vsl-tarifs-conventionnels>. | `PARTIALLY_REVIEWED` |
| M11 | `.../Tarifs_ambulance_page_Ameli_consultee_2026-09-20.html` | Assurance Maladie ; page affichée 30/09/2025, consultée 20/09/2026. | Tarifs ambulance et condition géoloc+SEFi. Page officielle : <https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/facturation/tarifs/ambulances-tarifs-conventionnels>, consultée 26/09/2026. | `PARTIALLY_REVIEWED` |
| M12 | `.../Liste_communes_forfait_agglomeration_page_courante_2026-09-20.pdf` | Assurance Maladie ; page présentée courante ; métadonnées PDF 07/02/2007. | Communes du forfait agglomération. Actualité matérielle 2026 `INCONNU`, historique/version officielle à obtenir. | `PARTIALLY_REVIEWED` |
| M13 | `METIER/TUPH/Page_Ameli_TUPH_consultee_2026-09-26.md` | Assurance Maladie ; page datée 30/01/2025, relevée 26/09/2026 ; transcription secondaire. | Renvoie à A10, instruction DGOS/R2/DSS/DGSCGC/2022/144 et cahiers ARS. `CONFLIT` éditorial : page indique « 6 mars 2023 » pour A11, le JORF local établit 6 mai 2023. | `REVIEWED` comme relevé |
| M14 | `METIER/Archives - réunions géolocalisation/` — quatre PDF 2015/2022 | Groupes de travail ; documents historiques. | Filiation de géolocalisation uniquement ; ne prouvent pas une règle courante. | `NOT_APPLICABLE` au courant |

`MISSING` : instruction interministérielle `DGOS/R2/DSS/DGSCGC/2022/144` comme pièce autonome et cahiers des charges/tableaux de garde ARS de chaque territoire déployé. Leur portée étant territoriale, aucune règle TUPH complète ne pourra être déclarée couverte sans ces entrées.

### 4.14 Référentiels nationaux et produits voisins

Ces sources ne deviennent pas automatiquement des dépendances du logiciel parce qu'elles sont présentes localement. Leur consommation doit être démontrée par un besoin de donnée, un renvoi de contrat ou une exigence de qualification.

| ID | Source / chemin | Autorité, version/date, rôle | Applicabilité et réserve | Couverture |
|---|---|---|---|---|
| N01 | `COMMUN/Référentiels nationaux/TOD_3.76_2026-02-17.zip` | GIE SESAM-Vitale ; TOD 3.76, 17/02/2026 ; livraison de référentiel. | Forte utilité B2/organismes. Archive et extraction éventuelle = une livraison. | `PARTIALLY_REVIEWED` |
| N02 | `.../Centres_payeurs_TOD_3.76_2026-02-17.csv` | Autorité/provenance propre `INCONNU` ; fichier centres payeurs. | Diffère du `pdt-cdc-011.csv` interne au ZIP par lignes et taille ; ne pas le présenter comme extraction du ZIP. Rôle direct SEFi à établir. | `PARTIALLY_REVIEWED` pour structure |
| N03 | `.../RPPS_extractions_2026-09-25/` et pages/provenance associées | ANS/data.gouv.fr ; données mises à jour 19/09/2026, récupérées 25/09/2026. | Identités/activités PS. WS_PS peut fournir côté AMO des données : un import local n'est pas automatiquement requis. | Provenance `REVIEWED`, données `NOT_REVIEWED` |
| N04 | `.../RPPS_regles_de_correspondance_GIE/FACT-GU-001_v1.22...pdf` et `TableCorrespondance_SpeAM_SavoirFaire_RPPS_2026-03.xlsx` | GIE SESAM-Vitale ; guide 1.22 du 05/04/2016, table mars 2026. | Correspondances RPPS/FNPS ; candidat surtout pour évolution B2 Avenant 48. | `NOT_REVIEWED` |
| N05 | `.../FINESS_structures_courant_2026-09-20.json.gz`, `FINESS_activites...` et `FINESS+ schemas/` | ANS/data.gouv.fr ; données au 20/09/2026, schémas v1 2026. | Structures/activités. Dépendance directe non établie ; les incompatibilités signalées par l'audit restent à reproduire sur sources primaires. | Provenance `PARTIALLY_REVIEWED`, données/schémas `NOT_REVIEWED` |
| N06 | `.../COG_2026_ensemble_csv.zip` et page INSEE sauvegardée | INSEE ; COG 2026. | Communes/adresses, candidat pour contrôles ou tarification ; renvoi exact à établir. | `NOT_REVIEWED` |
| N07 | `.../NOS_JSON_FHIR_2026-08-27/` | ANS ; livraison NOS FHIR 27/08/2026. | Nomenclatures de santé ; pas de dépendance directe trouvée dans le noyau SEFi examiné. | `NOT_REVIEWED` |
| N08 | `.../Annuaire_Sante_DSFT_extractions_libre_acces_v3.1_2025-11-07.pdf` et page API FHIR | ANS ; DSFT 3.1 du 07/11/2025. | Produit de données voisin ; nécessité pour SEFi 03.50 `INCONNU`. | `NOT_REVIEWED` |
| N09 | `COMMUN/Services AMO/API Lecture Vitale/Documentation officielle/` | CNDA/CNAM/GIE selon pièce ; API Lecture Vitale, versions propres. | Option d'acquisition possible. La page CNDA courante consultée le 26/09/2026 indique que les LPS TS SEFi peuvent l'utiliser : <https://cnda.ameli.fr/editeurs/referencer-un-logiciel/api-lecture-vitale/lessentiel-sur-lapi-de-lecture-vitale/>. Qualification distincte ; pas une obligation 03.50 établie. | `NOT_REVIEWED`, applicabilité `INCONNU` |
| N10 | `COMMUN/Services AMO/Intégrer un TLSi AMO/INSi/` | GIE SESAM-Vitale/CNDA ; INSi 05.00.01/05.00.00. | Produit indépendant sans renvoi SEFi 03.50 identifié. | `NOT_APPLICABLE` à la baseline nominale |
| N11 | Package ApCV local, s'il est mobilisé dans la solution | GIE/CNDA ; qualification séparée. | Assertions prévues par CI TLSi, mais aucune obligation explicite de package ApCV n'a été retrouvée dans les SFG 3.50. | `NOT_REVIEWED`, applicabilité `INCONNU` |

## 5. Cartographie fonctionnelle du corpus

Cette carte est `DEDUIT` des titres, sommaires, introductions, références et contrats consultés. Elle identifie les **zones d'extraction futures** ; elle ne décrit pas une architecture et n'énonce pas encore les règles de ces zones.

| Capacité à étudier | Sources d'ancrage du noyau | Sources dépendantes / qualification | Frontière ou question de travail |
|---|---|---|---|
| Gouvernance de baseline, opposabilité, autorisations | D01-D03, Q02-Q03, décision CTLSAM | D05, Q01, Z05-Z07, T05 | Distinguer version de référence, date d'effet, situation contractuelle et autorisations séparées. |
| Acteurs, responsabilités et cycles de vie | S02, S01 | Q02-Q04, C02 | Éditeur, TS, AMO, GIE, CNDA, caisse, présérie ; ne pas transformer ces acteurs en composants techniques. |
| Sécurité, cartes, certificats, assertions et contextes | G01-G04, X01-X04, S07 | T06-T09, P01, C09, Q03-Q04 | Version exacte du CI et des modalités cartes/certificats à geler. |
| Périmètre SEFi et arbre de décision | D03, S02, S04 | Q05, droit/convention, B2 | Déterminer les cas admis et les sorties sans résoudre ici le conflit de spécialité. |
| Identification prescripteur, établissement et transporteur | S06, G01, X01, S01 | Q07, N03-N05 | Distinguer données retournées par l'AMO et référentiels locaux éventuels. |
| Identification bénéficiaire et état civil | S06, S01 | T01-T05, Q07 | WS_BS est hors package principal et possède sa qualification propre. |
| Acquisition de la prescription en ligne | S03, S06, G02, X02 | Q06, L01/L04/L06 | PL1 ; séparer contrat d'échange, règle métier de prescription et scénario CNDA. |
| Réservation d'un trajet | S03, G02, X02 | Q06 | PL2 ; états et transitions à extraire ultérieurement. |
| Déclaration d'exécution/réalisation | S03, G02, X02 | Q06 | PL3 ; relation prestation/PEL à établir. |
| Consultation des référentiels AMO | S06 | G01-G04, T02-T03, Q07-Q08 | PS, bénéficiaire, PEC, PEL et FEL ; une opération par lot. |
| Acquisition des données préalables à la facturation | S04 | S06, WS_PS/BS/PL/PEC, Q08 | Orchestration fonctionnelle à étudier après les contrats, sans en faire une architecture. |
| Modèle et constitution de la FEL | S01, S04, G03, X03 | Q09-Q12 | Découper par entité : PS, bénéficiaire, prescription, prestations, contexte, montants, PJ. |
| Contextes de facturation | S04, S02, D03 | M03-M13, L07-L12, Q05/Q08/Q10 | TMR, TUPH, TPMR, transport partagé/refus, transfrontalier, migrant, multi-sociétés. |
| Prise en charge, droits et participation | S04, S06, G04, X04 | Q08, L02-L05 | Éviter de confondre contrat PEC et règle juridique de prise en charge. |
| Détermination et valorisation des montants | S04, G03/FT4, X03 | Q09, M01-M12, Z01-Z08, B04 | Consolidation conventionnelle/tarifaire préalable indispensable. |
| Contrôle de recevabilité | S04, G03/FT2, X03, S01 erreurs | Q10 | Diagnostics, incohérences CNDA et cas métier à isoler. |
| Validation de la FEL | S04, G03/FT3, X03 | Q12, D04-D05 | Accusés, reprises, annulation et traces ; distinguer règle fonctionnelle et preuve de présérie. |
| Consultation/récupération d'une FEL | S06, G03/FT1, X03 | Q11 | Accès et restitution après validation. |
| Erreurs, reprises, indisponibilités et diagnostics | S01 ch.4, guides ch.3, WSDL/XSD Fault | Q06-Q13, T06, B06-B08 | Extraire par opération et par origine ; ne pas uniformiser avant recoupement. |
| Pièces justificatives et dématérialisation | S05, S01 | C01-C09, Q13, P04-P07 | Contrôle, dossier, lot, émission, retours, signature et modèles papier. |
| Géolocalisation et certification | S04, G03/FT4 | Z01-Z08, B03, M05-M07, Q09-Q10 | Dépendance croisée SEFi/géoloc ; statut et test 3.05 à clarifier. |
| Administration, activation et historisation | S07, S01 | Q04, T06-T09, P02 | Paramètres TS, services actifs, données techniques, journal des requêtes/réponses. |
| Supervision des PJ | S08, S05 | C01-C05, Q13 | Délai et alertes ; dépend du cycle SCOR/B2. |
| Repli B2 et télétransmission | S02, S04 pp.76-88 | B01-B12, N01-N02 | Conversion FEL→B2, transport, ARL/RSP et conflit de positions. |
| Repli papier | S02, S05 | L06/L12, P04-P07 | Prescription, facture et ASF ; versions Cerfa en conflit public. |
| Retours NOEMIE | S02 | B06-B08 | Référence 531 actuelle dans PG ; 580 annoncée pour une évolution. |
| Présérie et preuve d'exploitation | D04-D06 | Q03, Q10/Q12, artefacts de campagne | Traces, échantillon, bilan et décision ; artefacts personnalisés hors corpus générique. |
| Qualification fonctionnelle | Q01-Q13 | toutes les familles appelées | Les tests vérifient, mais ne se substituent pas aux sources de la règle testée. |
| Référentiels nationaux | S01/S04/S06, XSD | N01-N08, B12 | Activer seulement le référentiel explicitement requis par un champ, une règle ou une interface. |

### 5.1 Chaîne documentaire à respecter

| Niveau de travail | Dépend de | Sert à |
|---|---|---|
| Décision de référence + notices + périmètre | date de coupure et situation de l'éditeur | geler la baseline et l'applicabilité |
| PG + DICO | baseline gelée | vocabulaire, acteurs, processus, identifiants et familles d'erreurs |
| SFG de domaine | PG/DICO + textes métier pertinents | capacités/processus fonctionnels |
| Guides d'intégration | SFG + cadre TLSi | opérations, cinématiques et lecture des contrats |
| WSDL/XSD | guides + dépendances de schéma locales | contrat d'échange ; les guides déclarent les XSD de référence |
| Sources juridiques/conventionnelles/tarifaires | version en vigueur et date d'effet | sens métier des données et calculs |
| Dossiers CNDA | toutes les sources qu'ils citent | scénarios de preuve et qualification |
| Exemples | contrat courant compilé/validé | fixtures de contrôle seulement |

Cette chaîne n'établit pas de hiérarchie universelle entre droit, convention, SFG et qualification. Elle décrit l'ordre de lecture le moins répétitif. Tout conflit matériel reste ouvert sauf règle de préséance explicitement trouvée dans une source applicable.

## 6. Ordre recommandé d'analyse

> **Mise à jour du 27/09/2026 :** cet ordre v0.1 est conservé comme historique. Il est remplacé pour l'exécution par la section 5 de `VALIDATION_CADRAGE_ET_PREMIER_LOT_SEFI_TS_03.50.00_2026-09-27.md`, qui supprime les doubles lectures qualification/exemples et place les corpus métier propriétaires avant les parties contextuelles et tarifaires de FTE02/FT4.

1. **Geler l'applicabilité.** Lire décision CTLSAM, D01, D03 et Q02-Q03 ; consigner la situation contractuelle de l'éditeur et les autorisations séparées.
2. **Résoudre la gouvernance documentaire minimale.** Demander les statuts finaux des SFG `_avec_MR`, la version de CI opposable, les sources absentes et les errata CNDA. Les travaux peuvent continuer avec hypothèses visibles, mais aucune règle conflictuelle ne doit être promue.
3. **Stabiliser le vocabulaire et les identifiants.** Analyser S02 puis S01 par petites sections ; construire l'index des entités, données, tables et erreurs sans encore attribuer de `RULE-ID` aux notes incertaines.
4. **Stabiliser le socle d'échange.** Étudier T06-T09, les contextes XML et les dépendances de sécurité ; préparer un graphe d'import local hermétique.
5. **Analyser chaque service verticalement.** Pour une opération donnée : section fonctionnelle du guide → opération WSDL → ROOT/AUX XSD → données DICO → erreurs → test CNDA → exemple en dernier. Ordre : WS_PS → WS_BS → WS_PL → WS_PEC → WS_FT1/2/3/4.
6. **Analyser les processus du noyau.** FTE01 et FTE04, puis FTE05, puis FTE02 ; ce dernier vient après services/données car il les agrège.
7. **Analyser les règles métier externes.** Prescription/droits, convention consolidée, transport partagé, tarifs, TUPH/TPMR et géolocalisation ; distinguer date d'effet et date de consultation.
8. **Analyser PJ et replis.** FTE03 avec SCOR ; FTE06 après le cycle PJ ; B2/NOEMIE/transport et papier comme parcours séparés.
9. **Analyser la qualification.** Rejouer Q04-Q13 après stabilisation des sources fonctionnelles et externes ; documenter les écarts, sans faire du test la source de la règle.
10. **Contrôler les exemples et la cohérence transverse.** Valider les XML contre les XSD courants, puis consolider les conflits, manques, dépendances et couverture.

Cet ordre minimise les relectures du DICO, des contrats et des textes tarifaires, et évite de bâtir des conclusions sur des exemples ou tests avant d'avoir établi la source normative qu'ils illustrent.

## 7. Registre initial de couverture

Les états détaillés de chaque source figurent dans les tableaux de la section 4. La matrice suivante précise les parties importantes afin d'éviter qu'un inventaire ou une lecture de sommaire soit pris pour une revue complète.

| Périmètre documentaire | Partie effectivement examinée | Partie restant à examiner | État initial |
|---|---|---|---|
| README, audit, manifeste | Chemins, familles et alertes utiles au routage | Toute affirmation normative à revérifier dans l'original | `REVIEWED` uniquement comme routage pour R01-R03 ; `PARTIALLY_REVIEWED` R04-R05 |
| PDT-INF-920 v2 | Intégralité p.1-3 | Confirmation externe du statut/date placeholder | `REVIEWED` |
| ZIP 3.50 + extraction | Inventaire des membres et conditionnement | Identité archive/extraction, intégrité et provenance membre à membre | `PARTIALLY_REVIEWED` |
| PDT-INF-293 v3.07 | Intégralité p.1-3 | Réconciliation avec tous les tests/cas de FTE02 | `REVIEWED` |
| PG 05.48 | Couverture, statut, sommaire, cadrage, architecture documentaire p.25-27 | Règles et scénarios détaillés p.6-24 | `PARTIALLY_REVIEWED` |
| DICO 03.54 | Couverture, statut, sommaire, organisation des entités/tables/erreurs | Définitions champ par champ, valeurs, cardinalités et toutes les erreurs | `PARTIALLY_REVIEWED` |
| FTE01 | Couverture, références, sommaire, cadrage | Règles de réservation/réalisation section par section | `PARTIALLY_REVIEWED` |
| FTE02 | Couverture, références, sommaire, sections ciblées spécialité/B2 | Règles détaillées p.11-88 hors points ciblés | `PARTIALLY_REVIEWED` |
| FTE03 | Couverture, références, sommaire, périmètre SCOR | Contrôle, dossier, lot, émission et retours règle par règle | `PARTIALLY_REVIEWED` |
| FTE04 | Couverture, références, sommaire et liste des consultations | Règles détaillées PS/BS/PEC/PEL/FEL | `PARTIALLY_REVIEWED` |
| FTE05 | Couverture, références, sommaire | Paramètres, activation, données techniques et historique | `PARTIALLY_REVIEWED` |
| FTE06 | Intégralité courte ciblée et anomalie de cadrage | Recoupement complet avec cycle SCOR/B2 | `PARTIALLY_REVIEWED` |
| Guides WS_PS/PL/FT/PEC | Couvertures, références, sommaires, cadrage et règle de référence XSD | Cinématiques, messages et catalogues d'erreurs complets | `PARTIALLY_REVIEWED` |
| 4 WSDL | Imports, messages, opérations, bindings et endpoints | Validation contre tous les XSD et environnement de production | `PARTIALLY_REVIEWED` |
| 82 XSD SEFi | Bonne formation, inventaire, imports, appinfo, namespaces et racines | Compilation hermétique, facettes, cardinalités, contraintes et cohérence inter-schémas | `PARTIALLY_REVIEWED` |
| Métadonnées `CVS/*` du bundle PEL et `.DS_Store` | Nature de métadonnées/artefacts établie | Rien pour le contrat fonctionnel | `NOT_APPLICABLE` |
| 22 exemples XML | Inventaire, bonne formation, corps SOAP ; conflit PEC ciblé | Validation contre contrats courants et comparaison sémantique | `PARTIALLY_REVIEWED` |
| Catalogue CNDA 3.50 | Intégralité p.1-8 | — | `REVIEWED` |
| Conditions contractuelles SEFi v3.02 | Articles 2, 3 et 5 ciblés | Lecture intégrale, version/date officielle et delta antérieur | `PARTIALLY_REVIEWED` |
| Dix guides CNDA 3.50 | Version/date, sommaire, références et cas conflictuels ciblés | Tous les tests, préconditions, données et résultats attendus | `PARTIALLY_REVIEWED` chacun |
| Présérie v6 | Intégralité p.1-7 | Provenance officielle et artefacts propres à une campagne | `REVIEWED` |
| Présérie v5 | Version/date et intégralité utile au classement | Delta détaillé seulement si besoin historique | `NOT_APPLICABLE` au courant |
| PDT-INF-307 v6 | Intégralité p.1-5 ; renvois Q10 pp.77-78 et Q12 p.23 | Artefacts propres à une campagne réelle | `REVIEWED`, applicable à la qualification 03.50.00 |
| Géoloc notice / XSD / catalogue CNDA | Intégralité utile au rôle de notice, structure/imports XSD, catalogue p.1-5 | Règles métier et tests détaillés | `REVIEWED` pour Z01, Z03, Z06 |
| Géoloc SFG/GPX/conditions/guide/classeur | Statut, sommaire, imports, conditions ciblées, conflits ciblés | GE01-GE04, tous éléments/facettes et tous tests | `PARTIALLY_REVIEWED` |
| Cartes, multi-sociétés, formulaires papier | Documents courts lus ; références visibles contrôlées | Actualité 2026 des circuits cartes ; règles de remplissage détaillées | P01/P02/P04/P05 `REVIEWED` selon rôle ; actualité parfois `INCONNU` |
| SCOR 2.12 | Notice et PDT-INF-747 intégralement ; couvertures/sommaires/références SFG | Règles PG/DICO/TT-TA, contrat v4, exemples, annexe TS courante | Notice/erratum `REVIEWED`, reste `PARTIALLY_REVIEWED` ou `NOT_REVIEWED` |
| TLSi bénéficiaire 01.15 | Notice intégrale ; couvertures/références SFG et inventaire contrat | Opérations, schémas, exemples et tests complets | `PARTIALLY_REVIEWED` |
| CI TLSi 1.2.3 | Notice intégrale et sommaire CI | Exigences détaillées, SEL-INF-031/032, cipher suite | `PARTIALLY_REVIEWED` |
| B2/NOEMIE/transport | Annexes TA 2012/2015 et annexe 8 revues ; autres sources ciblées | Norme par type, annexe 10 complète, NOEMIE, ETS et tests | Mixte : B02/B03/B05 `REVIEWED`, autres `PARTIALLY_REVIEWED`/`NOT_REVIEWED` |
| PEC+ B2 | Distinction avec WS_PEC SEFi | Contenu, seulement si produit B2 dans le périmètre futur | `NOT_APPLICABLE` au nominal SEFi |
| Droit courant | En-têtes, versions, dates et parties ciblées des transcriptions/captures | Vérification proposition par proposition dans Légifrance | `PARTIALLY_REVIEWED` |
| Originaux Légifrance L01P-L05P | URL candidates enregistrées depuis L01-L05 ; aucun contenu normatif relu dans cette mission | Versions officielles à la date du 26/09/2026, puis archivage local si autorisé | `NOT_REVIEWED` ; copies locales `MISSING` |
| Convention et avenants | Inventaire complet ; A10/A11/protocole et guides ciblés | Consolidation chronologique et règles article par article | `PARTIALLY_REVIEWED` au niveau famille ; nombreux fichiers `NOT_REVIEWED` |
| Pages tarifaires/TUPH | Copies courantes et renvois ciblés | Tarifs et conditions ligne par ligne ; pièces TUPH manquantes | `PARTIALLY_REVIEWED`, relevé TUPH `REVIEWED` comme copie |
| Référentiels nationaux | Provenance/structure de quelques livraisons | Contenus, schémas, fréquence et besoin réel par champ | Majoritairement `NOT_REVIEWED` |
| API Lecture Vitale / ApCV / INSi | Positionnement produit uniquement | Contenus, si un renvoi SEFi ou un choix produit les rend nécessaires | API/ApCV `INCONNU`; INSi `NOT_APPLICABLE` |
| Décision CTLSAM du 04/09/2026 | Page officielle entièrement lue pour publication/opposabilité | Copie locale et éventuelle décision ultérieure | `REVIEWED` en ligne ; copie locale `MISSING` |

### 7.1 Limite de couverture déclarée

Cette première passe couvre l'**identification**, le **rôle documentaire**, les **relations principales**, l'**applicabilité probable** et les **anomalies déjà visibles**. Elle ne couvre pas l'extraction exhaustive des règles, la compilation complète des contrats, la consolidation conventionnelle, tous les tests CNDA, ni les portails authentifiés non accessibles. Aucune exhaustivité absolue n'est revendiquée.

## 8. Conflits matériels déjà ouverts

| Sujet | Preuve A | Preuve B | Impact fonctionnel potentiel | Validation requise |
|---|---|---|---|---|
| Spécialité TS 55/56 | D01, PDT-INF-920 p.1 : spécialité 56. | S02, PG §2.3 p.11, `RG_FTE099` : spécialité 55 compatible et 56 interdite. | Authentification/périmètre du LPS et admissibilité au canal. | GIE SESAM-Vitale/CNDA ; obtenir erratum ou version corrigée. |
| Statut des SFG 3.50 | Couvertures : `État REFERENCE`. | DICO/PG §1.2-1.3 : `EN COURS` ; FTE01-06 §1.2 : « provisoire et référencée ». | Opposabilité et possibilité de promouvoir des règles canoniques. | GIE/CNDA ; demander statut final et copies sans MR. |
| Version interne de la réponse PEL | Noms ROOT/AUX `...V00_07.xsd`. | X02, `/xsd:schema/xsd:annotation/xsd:appinfo/Package/@Version = 00.06`. | Sélection/traçabilité du contrat et génération de messages. | GIE ; confirmer la version du modèle réellement diffusé. |
| Exemple PEC contraire au XSD | E04, `WS_PEC1_calculer_Response.xml`, `FACTURE/COUVERTURE[2]` : `Nature` présente mais choix d'identification absent. | X04, `AUX_facturation_SE_MODALITEPECTRANSP_V00_03.xsd`, type `Couverture_SE_MODALITEPECTRANSP` : `IdOrg` ou `GrandRegime/Organisme/EntiteGestion` obligatoire avant `Nature`. | Exemple non validable ou interprétation incorrecte. | Appliquer provisoirement la préséance XSD explicitée par G04 ; demander exemple corrigé. |
| Projection B2 type 4 | S04 pp.87-88 : code TPR 74-78 et quantité 75-80. | B01 : quantité 79-80. | Chevauchement de positions et rejet potentiel du repli B2. | GIE/CNAM/CNDA B2 ; aucune correction locale tacite. |
| Test CNDA DAP | Q05 p.5 autorise des appels contrôle/validation et attend une FEL. | Même test demande d'empêcher l'accès à ces appels. | Scénario de qualification inexécutable ou résultat ambigu. | CNDA ; erratum requis. |
| Test CNDA TUPH | Q10 pp.71-74 demande `SUPFORF=3`, mission et montant zéro. | Même séquence déclare les suppléments forfaitaires incompatibles. | Données FEL et recevabilité TUPH. | CNDA/CNAM ; faire préciser la donnée attendue. |
| Test CNDA transport partagé | Q10 p.75, cas 3 : refus du second trajet. | Q10 p.76 : contrôle du premier trajet. | Mauvais trajet facturé/refusé lors du test. | CNDA ; faire corriger le cas. |
| Statut SFG géolocalisation 1.05 | Z02 couverture : `REFERENCE`. | Z02 §1.2 p.4 : « Version de travail ». | Autorité de la spécification de traces/certification. | GIE/CNDA. |
| Périmètre tests géoloc | Z07 p.4 : tests 3.01-3.05. | Z07 sommaire/corps et Z08 lignes 26-29 : 3.01-3.04 seulement. | Étendue de la campagne 01.05.00. | CNDA ; confirmer existence ou suppression du 3.05. |
| Version DICO SCOR | C01 et nom C05 : 1.24. | Couverture C05 : 1.23. | Baseline de données SCOR à utiliser. | GIE/CNDA SCOR. |
| Références Cerfa publiques | P07 catalogue : S3601d 11163*02 et S3602b 11917*01. | PDF distribués et copies P04/P05 : 11163*03 et 54003*01. | Identification du bon formulaire de repli/PJ. | Assurance Maladie ; conserver les PDF diffusés sans réécriture en attendant confirmation. |

### 8.1 Réserves éditoriales ou ambiguïtés à ne pas surclasser

- D01 : `03/09/2026` en en-tête contre « xx août 2026 » p.2.
- D01 annonce PDT-INF-307 comme élément du package, mais le fichier est à côté du ZIP.
- FTE06 §1.1/§1.4 reprend des formulations FTE05 alors que le chapitre 2 traite bien la supervision.
- Noms d'opération/libellés ou `soapAction` de version différente de la version de livraison : axes de version à documenter, pas automatiquement conflits.
- Statuts Camelia `Draft/Approved` des XSD : portée officielle `INCONNU`.
- PDT-INF-374 : en-tête 19/03/2024, livraison annoncée 19/02/2024.
- Z08 cellule H6 `01.054.00` et pied de page 2022 de Z07 : coquilles probables, originaux à conserver.
- C03 : nom `01.26.01`, couverture `1.26`.
- B02 : nom local `2002-04`, contenu daté 2012.
- M05 : date 2015 dans A11 ; M13 : « 6 mars 2023 » au lieu du 6 mai 2023. Impact à confirmer avant création d'un conflit canonique.

## 9. Sources manquantes, accès incomplets et validations humaines

| Élément | Motif / source qui le réclame | Statut et action |
|---|---|---|
| Copie locale de la décision CTLSAM SEFi 3.50 du 04/09/2026 | Gel d'opposabilité. | `MISSING` localement ; archiver une copie officielle avec date de consultation. |
| Décision officielle de référence/opposabilité Géolocalisation 1.05 | Q03/Z05 en font un prérequis, mais aucune décision publique n'a été retrouvée. | `MISSING` ou accès limité ; demander confirmation CNDA. L'absence de résultat public ne prouve pas l'absence de décision. |
| `CI-CNAMTS-DC v1.0.2` et volets associés | Cité par G01-G04. | `MISSING`. Le CI TLSi 1.2.3 ne peut pas être déclaré remplaçant sans notice de transition. |
| Version exacte du CI TLSi applicable à SEFi 03.50 | S02 p.12 annonce que les références seront précisées ultérieurement ; T07 rend 1.2.3 référence pour nouvelles autorisations. | `INCONNU` ; arbitrage GIE/CNDA. |
| Versions officielles Légifrance sous-jacentes à L01-L05 | L01-L05 sont des transcriptions/extraits locaux secondaires et contiennent les URL officielles datées. | Sources primaires autonomes `NOT_REVIEWED` dans cette mission ; copies locales officielles `MISSING`. Les consulter et les dater avant toute promotion d'une règle juridique. |
| `PDT-INF-237` | Cité par Q06. | `MISSING` ; obtenir la version citée. |
| `FI 631 v1` | Cité par Q10 pp.77-78 et Q12 p.23 pour les traces. | `MISSING`. |
| `SEL-MP-013 v0.30` exact | Cité par Q07 de 2019 ; corpus local T02 en 1.15. | `MISSING` comme version historique exacte ; déterminer si le test 0.61 doit être lu avec 0.30 ou adapté à 1.15. |
| `[CDC] Cahier des charges rénovation ... expérimentation`, v2.6 du 04/01/2010 | Cité par Z02 p.4. | `MISSING` ; qualifier s'il reste applicable ou seulement historique. |
| `PDT-INF-388` et FI 882 d'origine | Évolutions annoncées comme intégrées dans D01/S04. | `MISSING` du package ; obtenir seulement si nécessaires à la provenance/delta, pas pour remplacer le texte intégré. |
| Package/cahier de tests CNDA B2 TS courant | Nécessaire au repli B2 et au conflit type 4. | `MISSING` ; demander au CNDA/GIE. |
| Norme B2 « version juin 2007-Addendum B » | Référence distincte citée par S04/FTE02 §1.5 p.5 ; B01 local est seulement intitulé « juin 2007 avec errata ». | `MISSING` ou équivalence `INCONNU` ; ne pas assimiler B01 sans preuve CNAM/GIE. |
| Norme B2 « version juin 2005 » | Référence distincte citée par S04/FTE02 §1.5 p.5. | `MISSING` comme édition exacte ; identifier aussi les annexes et compléments Ameli visés par ce renvoi. |
| Statut courant de l'annexe SCOR TS 2016 et éventuel package CNDA SCOR TS | C06 est ancien ; Q13 dépend de SCOR. | `INCONNU` / source courante potentiellement `MISSING`. |
| Instruction TUPH DGOS/R2/DSS/DGSCGC/2022/144 | Référencée par M13. | `MISSING` comme pièce autonome. |
| Cahiers des charges et tableaux de garde ARS | Référencés par M13 ; portée territoriale. | `MISSING` par territoire ; requis avant une couverture TUPH locale. |
| Consolidation officielle courante de la convention TS | Corpus local = convention + avenants. | `MISSING` comme document consolidé unique ; reconstruire la chaîne et faire valider juridiquement. |
| Historique/version fiable de la liste des communes d'agglomération | M12 paraît courante mais métadonnées 2007. | `INCONNU` ; demander source officielle versionnée. |
| Preuve d'ouverture CNDA de l'Avenant 48 RPPS | B12 subordonne l'opposabilité à la publication des cahiers de tests. | `MISSING` dans la recherche locale ; ne pas déclarer l'évolution opposable. |
| Artefacts d'une campagne réelle | Plan personnalisé, environnement, cartes de test, autorisations, pilotes, PV, questionnaires, bilan, décision. | `MISSING` pour une qualification effective seulement ; non attendus dans le package générique. |
| Contenu courant de l'Espace Industriels authentifié | D07 indique que certaines pièces sont accessibles dans cet espace. | Accès non vérifié ; comparer les versions lors de l'ouverture de la phase d'extraction. |

### 9.1 Validations à demander avant promotion de règles

1. GIE SESAM-Vitale : spécialité 55/56, statut final des SFG, versions PEL/XSD, exemple PEC, référence CI et conflit B2 type 4.
2. CNDA : errata DAP/TUPH/TPR, test géolocalisation 3.05, articulations des qualifications SEFi/WS_BS/SCOR/géoloc/B2.
3. CNAM/Assurance Maladie : références Cerfa, annexe SCOR TS courante, tarifs/communes et consignes d'exploitation.
4. Expert juridique/conventionnel : consolidation convention + avenants et versions des textes à date d'effet.
5. ARS/caisse compétente : TUPH territorial et activation locale uniquement lorsqu'une source applicable conditionne le cas étudié.

## 10. Découpage initial en sous-unités — remplacé pour l'exécution

Le découpage ci-dessous est conservé comme historique de routage v0.1. Il mélangeait des tranches documentaires, des tests, des exemples et des opérations de gouvernance ; il **ne doit plus être utilisé comme registre exécutable des lots**. Le registre canonique fonctionnel, ses critères de couverture et le contrat du premier lot figurent dans `VALIDATION_CADRAGE_ET_PREMIER_LOT_SEFI_TS_03.50.00_2026-09-27.md`, section 4 et suivantes.

### 10.1 Contrat de sortie de chaque lot

Chaque lot devra produire, au minimum :

1. périmètre, version, date d'effet/consultation et sections réellement lues ;
2. assertions atomiques qualifiées `ETABLI`, `DEDUIT`, `RECOMMANDE`, `CONFLIT` ou `INCONNU` ;
3. pour chaque assertion : autorité, référence, version/statut/date, page+section ou chemin XML/XSD, applicabilité TS/SEFi/situation/date et réserve ;
4. chaîne provisoire `source → règle candidate → capacité/workflow` ;
5. conflits, documents manquants et validations humaines ;
6. mise à jour du registre de couverture.

Un `RULE-ID` stable ne sera attribué qu'après établissement suffisant et validation du registre canonique. Les hypothèses, exemples invalides et notes exploratoires resteront sans `RULE-ID`.

### 10.2 Baseline et gouvernance documentaire

| Lot | Contenu section par section | Dépendance / résultat attendu |
|---|---|---|
| `BASE-01` | Décision CTLSAM du 04/09/2026, totalité de la page. | Matrice d'opposabilité au 26/09/2026 selon situation contractuelle. |
| `BASE-02` | D01, PDT-INF-920 p.1-3. | Composition/version/date, liste exacte des livrables et dépendances. |
| `BASE-03` | D03, PDT-INF-293 p.1-2 ; p.3 seulement pour routage vers trois lots propriétaires. | Périmètre et frontière B2 ; format des heures, reprise FT3 et disponibilité ne sont pas extraits ensemble. |
| `BASE-04` | Q02 p.1-8 + inventaire Q01. | Correspondance package GIE / qualification CNDA et versions de guides. |
| `BASE-05` | Q03 art.1-3. | Sources contractuelles, prérequis et qualifications liées. |
| `BASE-06` | Q03 art.4-fin. | Processus d'autorisation, obligations, présérie et maintien. |
| `BASE-07` | Comparaison couvertures/§1.2 des douze PDF `_avec_MR` disponibles. | Dossier de décision sur statuts, sans supposer l'existence d'éditions sans MR ; celles-ci ne deviennent `MISSING` que si le GIE confirme qu'elles doivent exister. |

### 10.3 Présentation générale et dictionnaire

| Lot | Contenu | Résultat attendu |
|---|---|---|
| `PG-01` | S02 ch.1 et annexe 1. | Portée, conventions de lecture et architecture documentaire. |
| `PG-02` | S02 §2.1-2.3. | Contexte, acteurs et aspects non fonctionnels ; sous-unités absorbées dans les lots canoniques concernés. |
| `PG-03` | S02 §2.4-2.5. | Processus principal et hors processus ; sous-unités absorbées dans les lots canoniques concernés. |
| `PG-04` | S02 §2.6-2.8 puis ch.3. | Situations spécifiques, administration/supervision, consignes transverses et conventions. |
| `DICO-01` | S01 ch.1-2. | Introduction, définitions et abréviations, avec index de termes ; ne constitue pas à lui seul un modèle conceptuel. |
| `DICO-02` | S01 §3.1 PS + §3.2 bénéficiaire. | Données PS/BS, renvois services et tables. |
| `DICO-03` | S01 §3.3 PEL. | Entités et états PEL. |
| `DICO-04` | Ancienne coupure « première moitié » retirée. | Absorbé dans les lots canoniques FEL par sous-entité et groupes `RG_FTE` localisés. |
| `DICO-05` | Ancienne coupure « seconde moitié » retirée. | Absorbé dans les lots canoniques FEL par sous-entité et groupes `RG_FTE` localisés. |
| `DICO-06` | S01 §3.5-3.9. | Données adjointes, SCOR, générales et B2. |
| `DICO-07` | S01 §3.10, une famille de tables par sous-lot. | Catalogue de valeurs avec source et portée. |
| `DICO-08` | S01 ch.4 `ERR_BS`. | Erreurs bénéficiaire. |
| `DICO-09` | S01 ch.4 `ERR_PS/PC`. | Erreurs PS/prise en charge. |
| `DICO-10` | S01 ch.4 `ERR_PT`. | Erreurs prescription/prestation. |
| `DICO-11` | S01 ch.4 `ERR_FT` et autres familles. | Erreurs FEL/services de facturation. |

### 10.4 Socle TLSi et contrats d'échange

| Lot | Contenu | Prérequis / résultat attendu |
|---|---|---|
| `TLSI-01` | T07 puis T06 : diffusion, périmètre, sécurité/transport. | Version applicable encore à confirmer ; index des exigences transverses. |
| `TLSI-02` | T08 : cartes/certificats et assertions/contexte. | Prérequis d'accès, distingués de P01 et de la qualification produit. |
| `TLSI-03` | T09 : redirections, cache et gestion WSDL/XSD. | Politique d'intégration des contrats. |
| `XML-01` | Contextes CTX, SOAP, SAML, WSSE/WS-Addressing de X01-X04. | Graphe d'import local, sans réseau, et liste des dépendances manquantes. |
| `XML-02` | Fault SOAP et diagnostics communs. | Modèle commun des erreurs de transport, séparé des erreurs métier. |
| `WSBS-01` | T02 opération WS_BS1 + WSDL/XSD T03 + DICO + test Q07. | Contrat et capacité « lister bénéficiaires ». |
| `WSBS-02` | T02 opération WS_BS2 + WSDL/XSD T03 + DICO + test Q07. | Contrat et capacité « rechercher état civil ». |
| `WSPS-01` | G01 PS1 + opération WSDL/XSD X01 + DICO + tests Q07. | Recherche prescripteur. Exemple E01 seulement en fin de lot. |
| `WSPS-03` | G01 PS3 + X01 + DICO + Q07. | Recherche établissement FINESS. |
| `WSPS-04` | G01 PS4 + X01 + DICO + Q07. | Données transporteur/RNT. |
| `WSPL-01` | G02 PL1 + X02 + DICO + Q06. | Acquisition PEL ; exemple E02 en dernier. |
| `WSPL-02` | G02 PL2 + X02 + DICO + Q06. | Réservation ; états/transitions. |
| `WSPL-03` | G02 PL3 + X02 + DICO + Q06. | Déclaration d'exécution. |
| `WSPEC-01` | G04 PEC1 + X04 + DICO + Q08. | Prise en charge ; confronter E04 après le XSD. |
| `WSFT-00` | G03 modèle FEL p.12-24 + X03 types communs. | Modèle contractuel partagé FT1-FT4. |
| `WSFT-01` | G03 FT1 + X03 + DICO + Q11. | Consultation/récupération FEL ; E03 en dernier. |
| `WSFT-02` | G03 FT2 + X03 + DICO + Q10. | Contrôle de recevabilité et diagnostics. |
| `WSFT-03` | G03 FT3 + X03 + DICO + Q12. | Validation/accusé/reprises. |
| `WSFT-04` | G03 FT4 + X03 + DICO + Q09. | Calcul des montants ; dépend des lots tarifaires. |

Pour chaque lot `WS*`, séparer en sous-lots si nécessaire : fonctionnel, message requête, message réponse, erreurs, environnement, puis test/exemple.

### 10.5 Processus fonctionnels du noyau

| Lot | Sections | Dépendances |
|---|---|---|
| `FTE01-01` | S03 cadrage et vue générale p.5-6. | PG/DICO/WS_PL. |
| `FTE01-02` | S03 réservation p.7-9. | `WSPL-02`. |
| `FTE01-03` | S03 réalisation p.10-12. | `WSPL-03`. |
| `FTE04-01` | S06 PS p.6-9. | WSPS-01/03/04. |
| `FTE04-02` | S06 bénéficiaire p.10-12. | WSBS-01/02. |
| `FTE04-03` | S06 PEC p.13-16. | WSPEC-01. |
| `FTE04-04` | S06 PEL p.17-19. | WSPL-01/02/03. |
| `FTE04-05` | S06 FEL/commun p.20-21. | WSFT-01 et erreurs communes. |
| `FTE05-01` | S07 paramètres transporteur p.6-7. | DICO/Q04/P02. |
| `FTE05-02` | S07 activation WS p.8-12. | TLSi et chaque service. |
| `FTE05-03` | S07 données techniques p.13-14. | TLSi/SCOR. |
| `FTE05-04` | S07 historique p.15. | Traçabilité requêtes/réponses. |
| `FTE02-01` | S04 cadrage/principes p.5-10. | BASE, PG/DICO. |
| `FTE02-02` | S04 acquisition p.11-17. | FTE04 et services. Le conflit de spécialité relève de S02/PG §2.3 p.11 (`RG_FTE099`), pas de FTE02. |
| `FTE02-03` | S04 cadre d'élaboration FEL p.18-22. | WSFT-00. |
| `FTE02-04` | S04 données PS p.23-25. | WSPS/DICO. |
| `FTE02-05` | S04 bénéficiaire p.26-27. | WSBS/DICO. |
| `FTE02-06` | S04 prescription p.28-30. | WSPL + droit prescription. |
| `FTE02-07` | S04 prestations p.31-39. | DICO + convention. |
| `FTE02-08` | S04 contextes p.40-47. | Transport partagé, TUPH, TMR, transfrontalier, multi-sociétés. |
| `FTE02-09` | S04 valorisation p.48-57. | Convention/tarifs/géoloc. |
| `FTE02-10` | S04 valorisation p.58-66. | WSFT-04 et suites métier. |
| `FTE02-11` | S04 recevabilité p.67-68. | WSFT-02/Q10. |
| `FTE02-12` | S04 validation p.69-75. | WSFT-03/Q12. |
| `FTE02-13` | S04 élaboration B2 p.76-86. | B2/DICO. |
| `FTE02-14` | S04 tableaux B2 p.87-88. | B01/B02 ; traiter le conflit de positions isolément. |
| `FTE03-01` | S05 cadrage/références p.4-8. | SCOR PG/DICO. |
| `FTE03-02` | S05 contrôle PJ p.9-11. | Formulaires et DICO. |
| `FTE03-03` | S05 initialisation dossier/constitution lot p.12-14. | SCOR TT-TA. |
| `FTE03-04` | S05 émission et retours p.15-19. | SCOR contrat/transport. |
| `FTE06-01` | S08 p.1-5. | Cycle FTE03/SCOR/B2 ; isoler les reprises éditoriales. |

### 10.6 Droit, convention et tarification

| Lot | Contenu | Ordre / résultat |
|---|---|---|
| `JUR-01` | L01 + articles de L04 applicables au 26/09. | Prescription et accord préalable, versionnés par date d'effet. |
| `JUR-02` | L02, L03 et L05, uniquement versions au 26/09. | Prise en charge, participation, exonérations. |
| `JUR-03` | Parties futures L03/L04 (01/10/2026, 01/01/2027). | Registre de transitions, sans les mélanger à la baseline. |
| `JUR-04` | L06 S3138g/S3139h, un formulaire puis sa notice. | Parcours papier prescription/DAP. |
| `TP-01` | L07-L09, texte par texte. | Socle juridique du transport partagé. |
| `TP-02` | L10-L12 + P04/P05/P07. | Mise en œuvre, facture/refus/ASF et conflit Cerfa. |
| `CONV-01` | M01, clause par clause avec index initial. | Socle 2002, sans supposer qu'il reste inchangé. |
| `CONV-02` | Avenants 1-4, un avenant par sous-lot. | Table de delta chronologique. |
| `CONV-03` | Avenants 5-7 + rectificatif, un par sous-lot. | Suite de la consolidation. |
| `CONV-04` | Avenants 8-9 + M03 TPMR. | Suite et capacité TPMR. |
| `CONV-05` | M04 A10 + circulaire/annexes. | TUPH/transport partagé/rémunérations. |
| `CONV-06` | M05 A11 + circulaire. | SEFi/géoloc/tarification différenciée et conflit de date. |
| `CONV-07` | M09 protocole 2025. | Delta après A11. |
| `TARIF-01` | M06-M08. | Guide majoration, impacts GIE et FAQ historique. |
| `TARIF-02` | M10 VSL, tableau/condition par tableau/section. | Tarifs courants, date de consultation conservée. |
| `TARIF-03` | M11 ambulance, tableau/condition par section. | Tarifs courants et lien géoloc+SEFi. |
| `TARIF-04` | M12 communes d'agglomération. | Seulement après résolution de l'actualité/version. |
| `TUPH-01` | M13 + instruction 2022 à obtenir. | Cadre national TUPH. |
| `TUPH-02` | Un territoire ARS par lot. | Cahier, garde et activation locale ; aucune généralisation entre territoires. |

### 10.7 Géolocalisation

| Lot | Contenu | Résultat |
|---|---|---|
| `GEO-01` | Z01 + Z02 ch.1. | Diffusion, statut, vocabulaire et dépendances. |
| `GEO-02` | Z02 présentation/cinématique. | Périmètre fonctionnel des traces. |
| `GEO-03` | Z02 GE01. | Capacité GE01, règles candidates atomiques. |
| `GEO-04` | Z02 GE02. | Capacité GE02. |
| `GEO-05` | Z02 GE03. | Capacité GE03. |
| `GEO-06` | Z02 GE04. | Capacité GE04. |
| `GEO-07` | Z02 entités et annexes. | Modèle de données et références. |
| `GEO-08` | Z03 + Z04. | Contrat XSD/GPX compilable hors ligne, sans modifier les originaux. |
| `GEO-09` | Z05-Z06. | Contrat de qualification et dépendance croisée SEFi/géoloc. |
| `GEO-10` | Z07 tests B2 1.01-1.05. | Preuves B2. |
| `GEO-11` | Z07 tests schéma/intégrité 2.01-2.05. | Preuves XML/intégrité. |
| `GEO-12` | Z07 tests FEL 3.01-3.04 + Z08. | Preuves FEL et conflit 3.05. |

### 10.8 SCOR, B2, télétransmission et papier

| Lot | Contenu | Résultat |
|---|---|---|
| `SCOR-01` | C01 + C04. | Baseline 2.12 et évolution 1.26. |
| `SCOR-02` | C02, une section par sous-lot. | Acteurs/cycles et relations B2/SEH. |
| `SCOR-03` | C05, une famille de données/erreurs par sous-lot. | DICO avec conflit 1.23/1.24. |
| `SCOR-04` | C03 émission. | Tables/cinématique d'émission. |
| `SCOR-05` | C03 retours. | ARL/retours et paramètres. |
| `SCOR-06` | C06. | Spécificités TS/ASF, sous réserve du statut 2026. |
| `SCOR-07` | C07 WSDL/XSD, un message/flux par sous-lot. | Contrat SEH v4.00 avec erratum. |
| `SCOR-08` | C08 exemples. | Validation après SCOR-07 seulement. |
| `B2-01` | B01 introduction + type 1. | En-tête facture. |
| `B2-02` | B01 types 2/2S/2E. | Lignes/compléments de prestation. |
| `B2-03` | B01 types 4/4T/4U + B02/B03. | Transport et géolocalisation ; conflit positions isolé. |
| `B2-04` | B01 types 5/6/999. | Totaux, lots et fins. |
| `B2-05` | B05 puis B04. | Droits/justificatifs et codes 2026. |
| `B2-06` | B06 référence 531. | Retours actuels TS. |
| `B2-07` | B06 références 580/900. | Évolutions/futurs, sans activation anticipée. |
| `B2-08` | B07 par chapitres applicables aux « autres PS ». | Transport/chiffrement. |
| `B2-09` | B08 par cinématique TS effectivement applicable. | Fichier logique, ARL/RSP. |
| `B2-10` | B09 + package CNDA TS à obtenir. | Qualification du transport/repli. |
| `PAPIER-01` | P04/P05/P08 + L12. | Facture/ASF, versions et lien SCOR. |
| `PAPIER-02` | L06. | Prescription/DAP papier. |

### 10.9 Qualification SEFi et présérie

Ces lots viennent **après** les sources qu'ils testent.

| Lot | Guide / pages | Dépendances |
|---|---|---|
| `QUAL-01` | Q04, un groupe de tests par rubrique du sommaire. | FTE05, DICO, multi-sociétés, cartes. |
| `QUAL-02` | Q05, un test par lot. | D03, droit/DAP/TUPH ; bloquer le test DAP conflictuel. |
| `QUAL-03` | Q06 acquisition. | WSPL-01. |
| `QUAL-04` | Q06 réservation. | WSPL-02. |
| `QUAL-05` | Q06 exécution, sécurité et erreurs. | WSPL-03/TLSi. |
| `QUAL-06` | Q07 référentiels PS/transporteur. | WSPS. |
| `QUAL-07` | Q07 bénéficiaire. | WSBS et décision sur version 0.30/1.15. |
| `QUAL-08` | Q08 droits généraux. | WSPEC/JUR-02. |
| `QUAL-09` | Q08 cas particuliers. | TMR/TUPH/AME/C2S/maternité/Corse, sources métier correspondantes. |
| `QUAL-10` | Q09 entrées/sorties et SOAP. | WSFT-04/XML. |
| `QUAL-11` | Q09 intégration et cas spéciaux. | Tarifs/AMC/TMR/TUPH. |
| `QUAL-12` | Q10 pp.9-35. | Données principales/FT2. |
| `QUAL-13` | Q10 pp.36-60. | Géoloc, erreurs, options et cohérences. |
| `QUAL-14` | Q10 pp.61-76. | TMR, tarif, TUPH, TPR ; conflits traités séparément. |
| `QUAL-15` | Q10 pp.77-78. | Traces ; FI 631 à obtenir. |
| `QUAL-16` | Q10 pp.79-82. | Transcodification B2. |
| `QUAL-17` | Q11 pp.5-10. | WSFT-01. |
| `QUAL-18` | Q12 pp.5-22. | WSFT-03. |
| `QUAL-19` | Q12 p.23. | Traces PDT-INF-307/FI 631. |
| `QUAL-20` | Q13 pp.6-16. | Numérisation. |
| `QUAL-21` | Q13 pp.17-41. | Préparation des lots SCOR. |
| `QUAL-22` | Q13 pp.42-47. | Transmission. |
| `QUAL-23` | Q13 pp.48-79. | Retours. |
| `PRES-01` | D05 p.1-7. | Conditions courantes de présérie. |
| `PRES-02` | D04 p.2-3. | Traces factures validées. |
| `PRES-03` | D04 p.4-5. | Traces WS_FT2. |
| `PRES-04` | Artefacts de campagne réels. | Seulement lorsqu'ils sont fournis ; couverture du produit candidat. |

### 10.10 Référentiels, exemples et clôture transverse

| Lot | Contenu | Condition d'ouverture |
|---|---|---|
| `REF-01` | N01/N02 TOD et centres payeurs. | Ouvrir lorsqu'un champ/routage B2 le requiert. |
| `REF-02` | N03/N04 RPPS/FNPS. | Ouvrir après décision sur Avenant 48 et besoin WS_PS/B2. |
| `REF-03` | N05 FINESS+. | Ouvrir si validation/import local requis ; vérifier schéma/flux. |
| `REF-04` | N06 COG. | Ouvrir pour commune/adresse/tarification explicitement référencée. |
| `REF-05` | N07/N08 NOS/Annuaire Santé. | Ouvrir uniquement sur renvoi prouvé. |
| `EX-01` | E01 InfoPS. | Après WSPS-01/03/04. |
| `EX-02` | E02 PEL. | Après WSPL-01/02/03 et résolution version 00.06/00.07. |
| `EX-03` | E03 SEMaFEL. | Après WSFT-01/02/03/04. |
| `EX-04` | E04 ServicePEC. | Après WSPEC-01 ; conserver le conflit, produire une fixture dérivée séparée si nécessaire. |
| `CLOSE-01` | Matrice de tous les renvois documentaires. | Après chaque famille, pour repérer les sources encore absentes. |
| `CLOSE-02` | Registre des conflits matériels. | Vérifier preuves, impact et autorité de résolution ; pas de fermeture par vraisemblance. |
| `CLOSE-03` | Registre de couverture. | Recalculer par section réellement lue, jamais par simple présence. |
| `CLOSE-04` | Synthèse transverse source→règle→capacité/workflow. | Seulement après stabilisation suffisante des lots locaux ; ce sera le point de départ de l'architecture fonctionnelle, pas l'architecture elle-même. |

## 11. Point d'arrêt de cette mission

La préparation est suffisante pour ouvrir les premiers lots `BASE-*`, `PG-*` et `DICO-*`. Elle n'est **pas** suffisante pour déclarer la baseline réglementaire entièrement couverte, pour résoudre les conflits listés, ni pour concevoir l'architecture fonctionnelle. Le prochain travail doit commencer par le gel d'applicabilité et la gouvernance documentaire, puis progresser selon les lots ci-dessus.
