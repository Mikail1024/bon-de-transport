# Suivi des conversions PDF vers Markdown

## Audit final du 4 octobre 2026

Les 21 journaux de session et l’inventaire ont été comparés au dossier : les 190 Markdown finaux sont présents avec les bons noms et la bonne arborescence. Les 190 empreintes Markdown et les 190 empreintes PDF sont conformes. Aucun fichier final manquant, supplémentaire, vide ou en doublon. Les 235 archives distinctes référencées dans les journaux sont présentes ; les empreintes renseignées sont conformes. Aucune anomalie détectée. Ce contrôle porte sur les fichiers, pas sur la fidélité caractère par caractère des transcriptions. Voir [le rapport](audit-2026-10-04.md) et [le détail par document](audit-2026-10-04.json).

## Méthode

- Sources originales conservées. Écriture uniquement sous Markdown/.
- Ordre : chemins sources triés alphabétiquement.
- LlamaParse Agentic Plus : 45 crédits/page ; cost optimizer désactivé.
- Transcription intégrale sans résumé ; tableaux HTML, révisions, liens, petits caractères et images conservés.
- Chaque document conserve son nom et son arborescence, extension .md.
- Images extraites supprimées le 3 octobre 2026 à la demande de l’utilisateur. Pour les détails visuels, consulter le PDF original.
- Un statut completed signifie export Markdown téléchargé et enregistré ; il ne certifie pas chaque caractère. Les images ne sont plus téléchargées, et leurs références sont retirées en préservant le texte alternatif.

## Reprise

Lire inventaire.json et les fichiers session-*.json. Ne pas reconvertir un document completed. Pour submitted/downloaded, reprendre le résultat existant depuis son job_id avant de relancer. Vérifier le solde et le coût du document suivant avant toute conversion.

## Session 1 du 2 octobre 2026

Agentic Plus, 205 pages, 9 225 crédits consommés, 775 crédits restants (solde vérifié dans Brave).

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/B2/Evolutions/Avenant 48 RPPS - provisoire/PDT-CDC-112_Avenant_48_RPPS_v01.42_2026-03-18_PROVISOIRE.pdf | 24 | completed | 1080 |
| 10_SOCLE_COMMUN_TS_TX/B2/Evolutions/Avenant 48 RPPS - provisoire/PDT-INF-926v2_Diffusion_Avenant_48_RPPS_2026-04-28.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/B2/Normes communes/2007-06-cdc-errata-norme-b2.pdf | 178 | completed | 8010 |

## Session 2 du 2 octobre 2026

Agentic Plus, 218 pages, 9 810 crédits consommés, 190 crédits restants (solde vérifié dans Brave).

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/B2/Normes communes/2016-06-cdc-ps-norme-noemie.pdf | 137 | completed | 6165 |
| 10_SOCLE_COMMUN_TS_TX/B2/Normes communes/2018-05-annexe-8-v2-norme-b2.pdf | 2 | completed | 90 |
| 10_SOCLE_COMMUN_TS_TX/B2/Normes communes/Annexe10-B2-AMO_mars_2026.pdf | 17 | completed | 765 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/2016-12-09 - SFG et GI sans MR/FACT-SFG-037 SFG-Facturation Transporteur A PEC+ v03.11_sans MR.pdf | 24 | completed | 1080 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/2016-12-09 - SFG et GI sans MR/SEL-MP-010 PEC v03.11_sans MR.pdf | 38 | completed | 1710 |

## Session 3 du 2 octobre 2026

Agentic Plus, lot de 10 PDF : 202 pages, 9 090 crédits consommés, 910 crédits restants (solde vérifié dans Brave). Options du lot vérifiées avant lancement : révisions, liens, images inline/embarquées et petits caractères activés ; tableaux HTML ; cost optimizer désactivé ; prompt de transcription intégrale.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/Kit accompagnement/ep-procdures-11_09_2013_vf.pdf | 7 | completed | 315 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/Kit accompagnement/pec-tirat_circuit-de-support_v1.0.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/PDT-INF-198 - Corpus documentaire PEC V02 13 00.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/Qualification CNDA 02.13.07/Conditions_contractuelles_PEC_V4.0.pdf | 16 | completed | 720 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/Qualification CNDA 02.13.07/SEL-GCONFORM-PEC_Package CNDA PEC+_V2.13.07.pdf | 5 | completed | 225 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/Qualification CNDA 02.13.07/SEL-GCONFORM_PEC+_CI_2.13.07.pdf | 55 | completed | 2475 |
| 10_SOCLE_COMMUN_TS_TX/B2/PEC Plus 2.13/pdt-inf-219-pecplus_aide_a_implementation_wsdl_v1.1.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Cahier de tests/ETS-FDC-002_Formulaire de demande de tests de chiffrement de transport_3.2vfinale.pdf | 6 | completed | 270 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Cahier de tests/VALID-PTV-001-v01.05 - Tests de chiffrement des flux.pdf | 37 | completed | 1665 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/Archives/ETS-DT-001_TransportsFlux_SpecsTechCommune_v1.50.30.pdf | 69 | completed | 3105 |

## Session 4 du 3 octobre 2026

Agentic Plus, lot de 12 PDF : 219 pages, 9 855 crédits consommés, 145 crédits restants (solde vérifié dans Brave). Révisions, liens, images inline/embarquées et petits caractères activés ; tableaux HTML ; cost optimizer désactivé ; prompt de transcription intégrale.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/Archives/ETS-DT-001_TransportsFlux_SpecsTechCommune_v1.51.11.pdf | 71 | completed | 3195 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/Archives/PDT-INF-856-Fiche d'information-spécifications_chiffrement_transport_v1.51.11v4.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/ETS-DT-001_TransportsFlux_SpecsTechCommune_V1.52.00.pdf | 62 | completed | 2790 |
| 10_SOCLE_COMMUN_TS_TX/B2/Transport des flux de facturation/Spécifications de chiffrement de transport/ETS-DT-003_Création du fichier logique de facturation AMO et traitement des retours_v02.20.pdf | 52 | completed | 2340 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Formulaires officiels/S3138g_Cerfa_11574-07_Prescription_medicale_transport_Ameli_2026-02-12.pdf | 4 | completed | 180 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Formulaires officiels/S3139h_Cerfa_11575-08_Demande_accord_prealable_transport_Ameli_2026-02-12.pdf | 4 | completed | 180 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Transport partagé/Arrete_2025-02-28_transports_partages.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Transport partagé/CIR-5-2025_transport_partage_tiers_payant.pdf | 7 | completed | 315 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Transport partagé/CSS_L322-5_a_L322-5-5_version_2026-09-20.pdf | 8 | completed | 360 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Transport partagé/CSS_R322-11-1_a_R322-11-8_version_2026-09-20.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/Droit et règles/Transport partagé/Decret_2025-202_2025-02-28_transport_partage.pdf | 2 | completed | 90 |
| 10_SOCLE_COMMUN_TS_TX/Formulaires de facturation/PDT-INF-897-Mise à disposition des modèles de factures TS et TX attestation de service fait (ASF) et modèle dannexe 4.pdf | 2 | completed | 90 |

## Session 5 du 3 octobre 2026

Agentic Plus, lot de 10 PDF : 159 pages, 7 155 crédits consommés, 2 845 crédits restants (solde vérifié dans Brave). Révisions, liens, images inline/embarquées et petits caractères activés ; tableaux HTML ; cost optimizer désactivé ; prompt de transcription intégrale.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/Référentiels nationaux/Annuaire_Sante_DSFT_extractions_libre_acces_v3.1_2025-11-07.pdf | 41 | completed | 1845 |
| 10_SOCLE_COMMUN_TS_TX/Référentiels nationaux/FINESS_plus_webinaire_2026-04-15.pdf | 49 | completed | 2205 |
| 10_SOCLE_COMMUN_TS_TX/Référentiels nationaux/RPPS_regles_de_correspondance_GIE/FACT-GU-001_v1.22_Guide_referentiel_PS_2016-04-05.pdf | 9 | completed | 405 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/Exemples de fichiers SCOR non chiffrés/496245570-entscanordo-2012012711140023006/P-001-001.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/Exemples de fichiers SCOR non chiffrés/496245570-entscanordo-2012012711140023006/P-002-001.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/Exemples de fichiers SCOR non chiffrés/496245570-entscanordo-2012012711140023006/P-003-001.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/Exemples de fichiers SCOR non chiffrés/496245570-entscanordo-2012012711140023006/P-003-002.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/PDT-INF-747 SCOR évolution SCOR-SFG-003 v1.26 (optimisation de la volumétrie des lot de PJ SCOR).pdf | 2 | completed | 90 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/SCOR-INF-609 Diffusion des spécifications SCOR v2.12.pdf | 2 | completed | 90 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/SCOR-SFG-002_V01.24_PG.pdf | 52 | completed | 2340 |

## Session 6 du 3 octobre 2026

Agentic Plus : 11 PDF, 220 pages, 9 900 crédits consommés et 100 crédits restants (compteur vérifié dans Brave). Images non téléchargées ; balises d’images retirées en conservant les textes alternatifs. Exports bruts archivés sous exports_bruts/session-06/.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/SCOR-SFG-003_01.26.01_TT-TA.pdf | 74 | completed | 3330 |
| 10_SOCLE_COMMUN_TS_TX/SCOR/Baseline commune 2.12/SCOR-SFG-006_01.24_DICO.pdf | 34 | completed | 1530 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/API Lecture Vitale/Documentation officielle/API Lecture Vitale - MEMO EDITEURS.pdf | 2 | completed | 90 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/API Lecture Vitale/Documentation officielle/Conditions_contractuelles_API_DE_LECTURE_v01.00.pdf | 15 | completed | 675 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/API Lecture Vitale/Documentation officielle/Licence Package API de Lecture v0.8.pdf | 19 | completed | 855 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/API Lecture Vitale/Documentation officielle/Solution lecture Vitale - tableau comparatif 2026-03-18.pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/ApCV-INF-013 - Fiche Livraison Services appli carte Vitale v1.17.pdf | 5 | completed | 225 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/ApCV-INF-701 - Fiche Livraison globale appli carte Vitale v1.31.pdf | 6 | completed | 270 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/ApCV-NT-001-Echanges de proximité v1.6.pdf | 16 | completed | 720 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/ApCV-NT-006-Préconisations paramétrage lecteurs.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/Authentifier et gérer le contexte ApCV v1.0.7f/ApCV-MP-001 - GI Demander l'authentification et gérer le contexte ApCV v1.8.pdf | 45 | completed | 2025 |

## Session 7 du 3 octobre 2026

Agentic Plus : 6 PDF complets (74 pages), un PDF partiel. Compteur Brave : 5 580 crédits consommés, 4 420 restants. Les deux tentatives complètes du cadre TLSi ont échoué avec une erreur interne, puis une plage a réussi et la suivante a échoué. Les exports complets sont sans images ; les bruts sont archivés.

| Source | Pages source | Statut |
|---|---:|---|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/Authentifier et gérer le contexte ApCV v1.0.7f/ApCV-SFG-004 - Editeurs - Demander l'authentification et gérer le contexte ApCV v1.5.10.pdf | 31 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Documentation GIE/PDT-INF-905-Qualification automatique INS ApCV.pdf | 3 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Qualification CNDA 01.00.06/Conditions_contractuelles_APCV_V1.1.pdf | 17 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Qualification CNDA 01.00.06/SEL-GCONFORM-appli carte Vitale_Package CNDA_V01.00.06.pdf | 6 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Appli carte Vitale/Qualification CNDA 01.00.06/SEL_GCONFORM_appli carte Vitale_Demander l'authentification et gérer le contexte appli carte Vitale_v01.00.05.pdf | 11 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/20221116_JNI -Présentation-BSP-v1.2.pdf | 6 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/CI-TLSi_AMO_V1_2_3.pdf | 102 | partial_requires_resume |

## Complément 07b du 3 octobre 2026

Sélection de PDF légers autorisée par l’utilisateur : 12 documents complets, 50 pages, 2250 crédits consommés. Solde après ce lot : 2170 crédits. Images non téléchargées ; bruts conservés avec leur arborescence pour distinguer les fichiers homonymes.

| Source | Pages | Statut |
|---|---:|---|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/CI-TLSi_CIPHER_SUITE_V1_2_0.pdf | 1 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-031_Modalite acces cartes et certificats_1.4.pdf | 20 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3.pdf | 9 | failed_requires_resume |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3_MR.pdf | 9 | failed_requires_resume |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Modalités d'accès aux volets transport synchrone des services en santé ou des téléservices de l’AMO.pdf | 5 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/PDT-INF-850_CI_TLSI_AMO_1.2.3.pdf | 2 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/PDT-INF-913 WSDL_XSD  Gestion Redirections et Recommandations Mise en Cache.pdf | 2 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Présentation du cadre d'intéropérabilité.pdf | 30 | failed_requires_resume |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Codes exemples, tuto/TLSiCodesExemplesDotNet/tls_icir/TLSi_LPS_Guide_Implementation_CSharp.pdf | 10 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Disponibilite-des-TLSi-par-regime-publiee.pdf | 1 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Guides et procédure/Guide de demarrage TLSi 2026.pdf | 2 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Guides et procédure/Guide des livrables TLSi 2026.pdf | 3 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Points de vigilance/CI-TLSi_CIPHER_SUITE_V1_2_0.pdf | 1 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Points de vigilance/bonnes_pratiques_versions_LPS_TLSi_V2.0.pdf | 2 | completed |
| 20_TAXI/Métier Taxi/Référentiels métier/Liste des établissements éligibles au forfait Grande Ville - 01-04-2026.pdf | 1 | completed |

## Complément 07c du 3 octobre 2026

Sélection de PDF légers autorisée par l’utilisateur : 6 documents complets, 48 pages, 2160 crédits consommés. Solde après ce lot : 10 crédits. Images non téléchargées ; bruts conservés avec leur arborescence pour distinguer les fichiers homonymes.

| Source | Pages | Statut |
|---|---:|---|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Codes exemples, tuto/TLSiCodesExemplesJava17/INSi/TLSi_LPS_Guide_Implementation_Java.pdf | 12 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/INSi/Qualification CNDA 05.00.00/Conditions_contractuelles_INSI_V4.2.pdf | 17 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/INSi/Qualification CNDA 05.00.00/Package_CNDA_INSi_V05.00.00.pdf | 6 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Points de vigilance/Tutorial_IGC_Santé_ANS - Vérification_des_certificats.pdf | 5 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/PDT-INF-846-Fiche de livraison Package documentaire TLSi bénéficiaire.pdf | 3 | completed |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/Qualification CNDA 01.15.00/SEL-GCONFORM-Bénéficiaire_Package CNDA_V01.15.00.pdf | 5 | completed |

## Session 8 du 3 octobre 2026

14 PDF complets, 222 pages, 9 990 crédits consommés et 10 restants, solde vérifié dans Brave. Agentic Plus, options de transcription intégrale réappliquées aux deux lots. Aucun téléchargement d’images. Un PDF en échec interne, sans consommation : CI-TLSi_AMO_V1_2_3_MR.pdf.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/CI-TLSi_AMO_V1_2_3_MR.pdf | 102 | failed_requires_resume | 0 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/INSi/Package GIE 05.00.01/SEL-MP-043_05-00-01_INSi avec MR.pdf | 44 | completed | 1980 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/INSi/Qualification CNDA 05.00.00/SEL-GCONFORM_INSi_V01.14.pdf | 42 | completed | 1890 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/Qualification CNDA 01.15.00/Conditions_contractuelles_Beneficiaire_V1.0.pdf | 17 | completed | 765 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/Qualification CNDA 01.15.00/SEL-GCONFORM-Bénéficiaire_V01.00.pdf | 12 | completed | 540 |
| 20_TAXI/B2/Qualification CNDA B2 Taxi 03.00.00/Facture_Taxi_et_annexe_606b_092025.pdf | 2 | completed | 90 |
| 20_TAXI/SEFi/Documents papier Taxi/Archives - modèles 2024/Modèle annexe 4 à la facture taxis conventionnés - TX.pdf | 1 | completed | 45 |
| 20_TAXI/SEFi/Documents papier Taxi/Archives - modèles 2024/Modèle de facture national des taxis conventionnés - TX.pdf | 1 | completed | 45 |
| 20_TAXI/SEFi/SCOR/SCOR - Rappel des conditions relatives à l'utilisation de SCOR par les taxis (25-03-2026).pdf | 1 | completed | 45 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/SEL-MP-013_01.15_WS_BS Services en Ligne Bénéficiaire avec MR.pdf | 16 | completed | 720 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Package TLSi bénéficiaire version 01.15/SEL-MP-013_01.15_WS_BS Services en Ligne Bénéficiaire sans MR.pdf | 15 | completed | 675 |
| 20_TAXI/B2/AMELI/Annexe-30-facturation-b2-nouvelle-convention.pdf | 60 | completed | 2700 |
| 20_TAXI/B2/AMELI/annexe-29-b2-facturation-taxi.pdf | 6 | completed | 270 |
| 20_TAXI/SEFi/Documents papier Taxi/Facture et annexe taxi conventionné - CNAM 606b-09-2025.pdf | 4 | completed | 180 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_10_CIR-12-2021_annexe_2.pdf | 1 | completed | 45 |

Les 14 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-08/. Les 190 PDF sources et les 89 Markdown complets correspondent aux empreintes enregistrées. Les textes alternatifs sont conservés ; la fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-08.json.

## Session 9 du 3 octobre 2026

8 PDF complets, 222 pages, 9 990 crédits consommés et 10 restants, solde vérifié dans Brave. Tous les traitements ont réussi. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 20_TAXI/B2/AMELI/Cahier-des-charges-éditeurs-logiciels-facturation-B2-taxis.pdf | 100 | completed | 4500 |
| 20_TAXI/B2/Qualification CNDA B2 Taxi 03.00.00/Cahier de Test_Facturation B2 NC TAXIS v03.00.00.pdf | 44 | completed | 1980 |
| 20_TAXI/B2/Qualification CNDA B2 Taxi 03.00.00/Conditions_contractuelles_Convention Taxis_v2.00.pdf | 18 | completed | 810 |
| 20_TAXI/B2/Qualification CNDA B2 Taxi 03.00.00/VOL_TECH_TA-rev2.pdf | 10 | completed | 450 |
| 20_TAXI/Métier Taxi/Référentiels métier/Cahier des charges supplément forfaitaire TPMR Taxi.pdf | 7 | completed | 315 |
| 20_TAXI/Métier Taxi/Référentiels métier/Convention-cadre nationale Taxi - arrêté du 29-07-2025 (JO 08-08-2025).pdf | 30 | completed | 1350 |
| 20_TAXI/SEFi/Cartes de test Taxi/Commande CDE CPE - Taxis Conventionnés (octobre 2022).pdf | 7 | completed | 315 |
| 20_TAXI/SEFi/Conditions de présérie SEFi/Conditions et modalités d application de la présérie du SEFi taxis.pdf | 6 | completed | 270 |

Les 8 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-09/. Les 190 PDF sources et les 97 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-09.json.

## Session 10 du 3 octobre 2026

18 PDF complets, 222 pages, 9 990 crédits consommés et 10 restants, solde vérifié dans Brave. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images. Le document FACT-SFG-039 de géolocalisation a échoué avec une erreur interne, sans consommation ; trois documents plus légers ont complété le budget.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 20_TAXI/SEFi/Géolocalisation Taxi/Géolocalisation Taxi DRAFT/Géolocalisation Taxi DRAFT/FACT-SFG-039 Facturation Taxi - Constituer et transmettre les traces de géolocalisation v1.08.pdf | 36 | failed_requires_resume | 0 |
| 20_TAXI/SEFi/Géolocalisation Taxi/PDT-INF-937 Diffusion Géolocalisation Taxi DRAFT.pdf | 2 | completed | 90 |
| 20_TAXI/SEFi/SEFi TX DRAFT/2026 07 02 - présentation évolution corpus documentaire.pdf | 31 | completed | 1395 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Kit accompagnement/Multi-sociétés et sociétés bicéphales/SEFI Taxi - consignes facturation double spécialité V1.1.pdf | 4 | completed | 180 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/PDT-INF-293v3.04 Périmètre SEFI-FTE Taxi.pdf | 3 | completed | 135 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/PDT-INF-934-Diffusion du package SEFi Taxi DRAFT.pdf | 3 | completed | 135 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-029 DICO-Dictionnaire du système FTE TX v03.53_avec_MR.pdf | 40 | completed | 1800 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-030 PG-Présentation Générale du système FTE TX v05.47_avec_MR.pdf | 26 | completed | 1170 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-031 FTE01-Réaliser des Prestations d’une prescription TX v03.17_avec_MR.pdf | 12 | completed | 540 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-033 FTE03-Contrôler et Transmettre les PJ TX v03.20_avec_MR.pdf | 20 | completed | 900 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-034 FTE04-Consulter les referentiels de l'AMO TX v03.17_avec_MR.pdf | 19 | completed | 855 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-035 FTE05-Administrer le poste PS TX v03.44_avec_MR.pdf | 16 | completed | 720 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-060 FTE06-Superviser le poste PS TX v03.36_avec_MR.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/B2/AMELI/2002-04-annexe-transporteur-norme-b2.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_10_CIR-12-2021_annexe_3.pdf | 1 | completed | 45 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_7_rectificatif_JO_2014-08-05.pdf | 1 | completed | 45 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/SEL-MP-012 WS_PS TX v02.19_avec_MR.pdf | 18 | completed | 810 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/SEL-MP-016 WS_PEC TX v03.39_avec_MR.pdf | 17 | completed | 765 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Transport partagé/Annexes spécifiques TS - CIR-5-2025/CIR-DDGOS_Annexe_facture_modifiee_transports_sanitaires_Annexe_2.pdf | 1 | completed | 45 |

Les 18 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-10/. Les 190 PDF sources et les 115 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-10.json.

## Session 11 du 3 octobre 2026

9 PDF complets, 222 pages, 9 990 crédits consommés et 10 restants, solde vérifié dans Brave. Tous les traitements ont réussi. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/FACT-SFG-032 FTE02-Facturer des Prestations TX v03.57_avec_MR.pdf | 126 | completed | 5670 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/SEL-MP-014 WS_PL TX v03.16_avec_MR.pdf | 28 | completed | 1260 |
| 20_TAXI/SEFi/SEFi TX DRAFT/Package SEFi Taxi DRAFT/Package SEFi Taxi DRAFT/Corpus SEFi DRAFT/SEL-MP-015 WS_FT TX v03.50_avec_MR.pdf | 45 | completed | 2025 |
| 30_TRANSPORTEURS_SANITAIRES/B2/AMELI/2015-07-geolocalisation-annexe-ta-norme-b2.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Archives - réunions géolocalisation/20150624_Editeurs-TS_01_Compte-rendu.pdf | 7 | completed | 315 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Archives - réunions géolocalisation/20220621_CR_GT_Géolocalisation_VF.pdf | 4 | completed | 180 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_11_guide_SEFi_tarification_majoree.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_2_2004-07-09_JO_2004-12-07.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Transport partagé/Annexes spécifiques TS - CIR-5-2025/CIR-DDGOS_Facture_modifiee_transports_sanitaires_Annexe_1.pdf | 1 | completed | 45 |

Les 9 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-11/. Les 190 PDF sources et les 124 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-11.json.

## Session 12 du 3 octobre 2026

23 PDF complets, 223 pages sources, 9 990 crédits consommés et 10 restants, solde vérifié dans Brave. Tous les traitements ont réussi. Le premier lot de 219 pages a consommé 9 810 crédits contre 9 855 estimés ; la différence de 45 crédits n’a pas été attribuée à un document précis. Un complément de 4 pages a consommé 180 crédits. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits estimés |
|---|---:|---|---:|
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Archives - réunions géolocalisation/20150624_Editeurs-TS_01_Présentation-CDC-rénové.pdf | 36 | completed | 1620 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Archives - réunions géolocalisation/20220621-GT géolocalisation-VF.pdf | 24 | completed | 1080 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_10_2020-12-22_JO_2021-03-07.pdf | 18 | completed | 810 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_10_CIR-12-2021.pdf | 13 | completed | 585 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_11_2023-04-13_JO_2023-05-06.pdf | 14 | completed | 630 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_11_CIR-18-2023.pdf | 16 | completed | 720 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_3_2004-12-21_JO_2005-05-27.pdf | 2 | completed | 90 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_4_2005-06-29_JO_2005-07-31.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_5_2008-03-14_JO_2008-08-05.pdf | 12 | completed | 540 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_6_2011-07-26_JO_2011-10-21.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_7_2014-03-25_JO_2014-07-04.pdf | 6 | completed | 270 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_8_2017-03-20_JO_2017-07-20.pdf | 2 | completed | 90 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_9_2019-12-06_JO_2020-08-02.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Avenant_9_cahier_des_charges_TPMR.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Convention_nationale_transporteurs_sanitaires_2002-12-26_JO_2003-03-23.pdf | 14 | completed | 630 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Liste_communes_forfait_agglomeration_page_courante_2026-09-20.pdf | 15 | completed | 675 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Mise en œuvre SEFi - Avenant 11/FAQ Avenant 11_ modalités de mise en œuvre de la tarification différenciée.pdf | 6 | completed | 270 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Mise en œuvre SEFi - Avenant 11/PDT-INF-818v4  Avenant 11 impacts pour les transporteurs sanitaires.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Protocole_maitrise_depenses_transports_2025-09-24_JO_2025-09-30.pdf | 11 | completed | 495 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Cartes de test TS/Commande CDE CPE - Transporteur Sanitaires (octobre 2022).pdf | 7 | completed | 315 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Documents papier TS/CERFA 1116303  Facture de transport VSL ou ambulance.pdf | 1 | completed | 45 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Documents papier TS/CERFA 5400301 Annexe à la facture valant attestation de service fait (ASF) - TS.pdf | 1 | completed | 45 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/PDT-INF-374v2-Diffusion du package Geolocalisation.pdf | 2 | completed | 90 |

Les 23 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-12/. Les 190 PDF sources et les 147 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-12.json.

## Session 13 du 3 octobre 2026

16 PDF complets, 221 pages, 9 945 crédits consommés et 55 restants, solde vérifié dans Brave. Le plus petit document pending restant fait 8 pages (360 crédits). Les deux FACT-SFG-039 de géolocalisation TS v1.05, avec et sans MR, ont échoué avec une erreur interne, sans consommation. Cinq documents plus légers ont complété le budget. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Conditions de présérie SEFi/Archives/Conditions et modalités d application de la présérie du SEFi transport sanitaire - ancienne version non datée.pdf | 6 | completed | 270 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Conditions de présérie SEFi/Conditions et modalités d application de la présérie du SEFi transport sanitaire - v6 août 2026 (publication septembre 2026).pdf | 7 | completed | 315 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Package GEOLOCALISATION v1.05/FACT-SFG-039 Facturation Transporteur - Constituer et Transmettre les traces de geolocalisation_1.05 avec MR.pdf | 38 | failed_requires_resume | 0 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Package GEOLOCALISATION v1.05/FACT-SFG-039 Facturation Transporteur - Constituer et Transmettre les traces de geolocalisation_1.05 sans MR.pdf | 38 | failed_requires_resume | 0 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Qualification CNDA 01.05.00/Conditions_contractuelles_Geolocalisation_V3.01.pdf | 16 | completed | 720 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Qualification CNDA 01.05.00/SEL-GCONFORM-GEO_Package CNDA GEOLOCALISATION_V01.05.00.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Qualification CNDA 01.05.00/SEL-GCONFORM_GEOLOCALISATION_01.05.00.pdf | 18 | completed | 810 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Kit accompagnement/Multi-sociétés et sociétés bicéphales/SEFi_II.5_Multi-sociétés (2022).pdf | 1 | completed | 45 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/PDT-INF-293v3.07 Périmètre SEFI-FTE Transporteur Sanitaire.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/PDT-INF-307v6_Présérie FTE Traces Poste.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/PDT-INF-920v2 Diffusion du package SEFi‐Transporteur Sanitaire v3.50.pdf | 3 | completed | 135 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-029 DICO-Dictionnaire du système FTE TS v03.54_avec_MR.pdf | 67 | completed | 3015 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-031 FTE01-Réaliser des Prestations d’une prescription TS v03.18_avec_MR.pdf | 12 | completed | 540 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-030 PG-Présentation Générale du système FTE TS v05.48_avec_MR.pdf | 27 | completed | 1215 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-033 FTE03-Contrôler et Transmettre les PJ TS v03.21_avec_MR.pdf | 19 | completed | 855 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-034 FTE04-Consulter les referentiels de l'AMO TS v03.18_avec_MR.pdf | 21 | completed | 945 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-060 FTE06-Superviser le poste PS TS v03.37_avec_MR.pdf | 5 | completed | 225 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/SCOR/Annexe Transporteurs sanitaires/2016-02-annexe-scor-transporteurs-sanitaires-transport-flux.pdf | 6 | completed | 270 |

Les 16 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-13/. Les 190 PDF sources et les 163 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-13.json.

## Session 14 du 3 octobre 2026

6 PDF complets, 217 pages, 9 765 crédits consommés et 235 restants, solde vérifié dans Brave. Tous les traitements ont réussi. Le plus petit document non terminé fait 8 pages (360 crédits), au-delà du solde. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-032 FTE02-Facturer des Prestations TS v03.60_avec_MR.pdf | 88 | completed | 3960 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-035 FTE05-Administrer le poste PS TS v03.45_avec_MR.pdf | 15 | completed | 675 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/SEL-MP-012 WS_PS TS v02.20_avec_MR.pdf | 18 | completed | 810 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/SEL-MP-014 WS_PL TS v03.17_avec_MR.pdf | 28 | completed | 1260 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/SEL-MP-015 WS_FT TS v03.52_avec_MR.pdf | 51 | completed | 2295 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/SEL-MP-016 WS_PEC TS v03.40_avec_MR.pdf | 17 | completed | 765 |

Les 6 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-14/. Les 190 PDF sources et les 169 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-14.json.

## Session 15 du 3 octobre 2026

8 PDF complets, 218 pages, 9 810 crédits consommés et 190 restants, solde vérifié dans Brave. Tous les traitements ont réussi. Le plus petit document non terminé fait 9 pages (405 crédits), au-delà du solde. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/Conditions_contractuelles_SEFi_TS_V3.02.pdf | 18 | completed | 810 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Administrer le poste du PS_V1.20.11.pdf | 18 | completed | 810 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Calculer les montants d'une prestation_V0.60.13.pdf | 29 | completed | 1305 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Contrôler la recevabilité en FEL_V0.60.22.pdf | 82 | completed | 3690 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Package CNDA SEFi_V3.50.00.pdf | 8 | completed | 360 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Prescription en ligne_V0.80.06.pdf | 27 | completed | 1215 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Récupérer les données de la FEL_V0.63.pdf | 10 | completed | 450 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_RéférentielsAMO_V0.61.pdf | 26 | completed | 1170 |

Les 8 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-15/. Les 190 PDF sources et les 177 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-03-15.json.

## Session 16 du 4 octobre 2026

5 PDF complets, 149 pages, 6 705 crédits consommés et 3 295 restants, solde vérifié dans Brave. Tous les documents pending ont été convertis. Six documents précédemment en échec ont été retentés et ont échoué, sans débit. Les deux cadres TLSi de 102 pages demandent chacun 4 590 crédits, au-delà du solde. Agentic Plus, transcription intégrale, tableaux HTML, révisions, liens et petits caractères conservés. Aucun téléchargement d’images.

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_DMAT_V0.73.15.pdf | 80 | completed | 3600 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_Valider la FEL_V0.60.13.pdf | 24 | completed | 1080 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_arbre de_décisions_V1.15.pdf | 9 | completed | 405 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Qualification CNDA 03.50.00/SEL-GCONFORM-FTE_consulter prise en charge_v0.09.13.pdf | 25 | completed | 1125 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/SCOR/Sécurité certificats et CRL/Tutoriel IGC OSI - Utiliser les certificats de chiffrement et la CRL.pdf | 11 | completed | 495 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Présentation du cadre d'intéropérabilité.pdf | 30 | failed_requires_resume | 0 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Package GEOLOCALISATION v1.05/FACT-SFG-039 Facturation Transporteur - Constituer et Transmettre les traces de geolocalisation_1.05 avec MR.pdf | 38 | failed_requires_resume | 0 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3.pdf | 9 | failed_requires_resume | 0 |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3_MR.pdf | 9 | failed_requires_resume | 0 |
| 20_TAXI/SEFi/Géolocalisation Taxi/Géolocalisation Taxi DRAFT/Géolocalisation Taxi DRAFT/FACT-SFG-039 Facturation Taxi - Constituer et transmettre les traces de géolocalisation v1.08.pdf | 36 | failed_requires_resume | 0 |
| 30_TRANSPORTEURS_SANITAIRES/SEFi/Géolocalisation Transporteur Sanitaire/Package GEOLOCALISATION v1.05/Package GEOLOCALISATION v1.05/FACT-SFG-039 Facturation Transporteur - Constituer et Transmettre les traces de geolocalisation_1.05 sans MR.pdf | 38 | failed_requires_resume | 0 |

Les 5 exports bruts sont archivés avec leur arborescence sous exports_bruts/session-16/. Les 190 PDF sources et les 182 Markdown complets correspondent aux empreintes enregistrées. La fidélité caractère par caractère n’est pas auditée. Détails et identifiants dans session-2026-10-04-16.json.

## Complément de session 16 — découpage, 4 octobre 2026

3 documents complets supplémentaires (48 pages sources) : SEL-INF-032_V1_3, SEL-INF-032_V1_3_MR et la présentation du cadre TLSi. 41 pages réussies par LlamaParse Agentic Plus, 7 pages transcrites visuellement par Codex après des erreurs persistantes du service : page 1 de chacune des deux fiches et pages 11, 12, 13, 22 et 27 de la présentation. Les exemples XML/SOAP et les schémas sont transcrits, sans corriger les incohérences des sources. Les copies découpées conservent les originaux ; toutes les pages sont réunies une fois dans leur ordre source. Les tableaux restent séparés aux frontières de pages.

Ce complément consomme 1 845 crédits. Compteur du compte vérifié : 8 550 / 10 000, solde 1 450. Le plus petit document restant fait 36 pages (1 620 crédits). Aucun document complet supplémentaire ne tient dans le solde.

| Source | Pages | Méthode |
|---|---:|---|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3.pdf | 9 | LlamaParse découpé + transcription visuelle de pages en échec |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/SEL-INF-032_V1_3_MR.pdf | 9 | LlamaParse découpé + transcription visuelle de pages en échec |
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Présentation du cadre d'intéropérabilité.pdf | 30 | LlamaParse découpé + transcription visuelle de pages en échec |

Détails de chaque partie, essais, pages manuelles et exports bruts : session-2026-10-04-16-split.json et exports_bruts/session-16-split/. Les 190 PDF sources et les 185 empreintes Markdown ont été vérifiés. Les pages exportées par LlamaParse n’ont pas été auditées caractère par caractère.

## Session 17 du 4 octobre 2026

4 documents supplémentaires complets : géolocalisation Taxi v1.08 (36 pages), géolocalisation Transporteur v1.05 avec MR (38 pages), sans MR (38 pages), et CI-TLSi_AMO_V1_2_3 (102 pages, dont 51 pages réutilisées de la session 7 après vérification de leur correspondance source). Le cadre TLSi avec MR est partiellement récupéré : pages 1–72 sur 102. Ses pages 73–102 restent seules à convertir.

222 pages réussies par LlamaParse Agentic Plus, 9 990 crédits consommés, 10 restants : solde vérifié dans Brave. 235 nouvelles pages sources récupérées, avec 14 pages transcrites ou corrigées visuellement par Codex : Taxi p.35, TS avec/sans MR p.37, cadre TLSi sans MR p.93–94 et p.95–102, cadre TLSi avec MR p.32. La page 95 avait réussi mais l’export altérait identifiantDeleguant et insérait du gras Markdown dans le code XML : correction d’après le PDF, export brut conservé. Les autres pages manuelles répondaient à des échecs persistants du service. Tous les exemples conservent les valeurs sources et les éventuelles incohérences.

Découpage en copies temporaires, exports réunis dans l’ordre sans chevauchement. Aucun téléchargement d’images ; références retirées en conservant les textes alternatifs. Agentic Plus, tableaux HTML, liens et révisions. Pour le dernier lot de 13 pages (TLSi MR p.60–72), l’interface avait réinitialisé le prompt et l’option petits caractères ; les numéros de page et tous les mots distincts de six lettres ou plus du texte PDF ont été retrouvés dans les exports. Ce contrôle lexical ne constitue pas une vérification caractère par caractère.

Les 190 PDF originaux et les 189 empreintes Markdown complets ont été vérifiés. Tous les exports attendus sont présents et leurs empreintes contrôlées. Les 4 nouveaux Markdown conservent les noms et l’arborescence. Le partiel TLSi MR reste dans exports_bruts/session-17/partiels/CI-TLSi_AMO_V1_2_3_MR_pages_001-072.md et n’est pas compté comme terminé. Identifiants de chaque essai, méthodes et plages source dans session-2026-10-04-17.json.

## Session 18 du 4 octobre 2026 — corpus terminé

Le dernier document, CI-TLSi_AMO_V1_2_3_MR.pdf, est complet (102 pages). Les pages 1–72 proviennent du partiel conservé de la session 17 ; les pages 73–102 ont été récupérées durant cette session. Assemblage dans l’ordre, sans chevauchement, dans le Markdown portant le même nom et la même arborescence.

| Source | Pages du document | Nouvelles pages source | Statut |
|---|---:|---:|---|
| 10_SOCLE_COMMUN_TS_TX/Services AMO/Intégrer un TLSi AMO/Cadre d'interopérabilité 1.2.3/Cadre d'intéropérabilité TLSi_AMO_1.2.3/CI-TLSi_AMO_V1_2_3_MR.pdf | 102 | 30 (73–102) | completed |

21 pages réussies par LlamaParse Agentic Plus : 20 pages (73–92) en quatre lots de cinq, puis la page 95 après reprise individuelle. Les lots 93–97 et 98–102 ont échoué ; neuf des dix reprises individuelles ont également échoué. Solde vérifié dans Brave : 945 crédits utilisés sur 10 000, 9 055 restants. Arrêt parce que le corpus est terminé, pas parce que le solde est épuisé.

Les dix pages 93–102 ont été transcrites ou corrigées après vérification visuelle des originaux avec MR. Le corps XML identique, déjà transcrit pour la version sans MR, a été comparé au texte de chaque page MR (tous les caractères XML, espaces de mise en page exclus), puis contrôlé sur les rendus. La date propre au MR, ses numéros de figures et ses surlignages jaunes sont conservés. La page 95 réussie par LlamaParse écrivait identifiantDelequant au lieu du nom source identifiantDeleguant : corrigé, export brut conservé. Le « Par example » du PDF p.73 est rétabli dans le Markdown final. Les valeurs et incohérences des exemples sont conservées.

Agentic Plus, prompt intégral, tableaux HTML, liens, révisions et petits caractères vérifiés avant les deux lancements. Les 30 pages des copies temporaires ont un rendu identique à l’original. Aucun téléchargement d’images ; leurs références sont retirées en conservant le texte alternatif. Les pages 73–92 ont leurs numéros et le texte attendu selon le contrôle lexical ; ce contrôle ne constitue pas un audit caractère par caractère de toutes les pages.

Les 190 PDF originaux et les 190 empreintes Markdown complets sont vérifiés, les 189 Markdown antérieurs sont inchangés. Le partiel de session 17 reste archivé. Identifiants des 16 essais, plages source, méthodes, corrections et empreintes dans [session-2026-10-04-18.json](session-2026-10-04-18.json). Exports bruts et transcriptions dans exports_bruts/session-18/.

## Prochaine session

Aucun document restant : 190/190 complets, 3 675 pages sources. Consulter inventaire.json et les journaux avant tout travail complémentaire pour éviter une reconversion. Le statut completed atteste la présence d’une transcription intégrale assemblée ; il ne certifie pas chaque caractère de toutes les conversions LlamaParse.

## Contrôles et bilan

- 190 PDF convertis intégralement au total, 3 675 pages ; aucun document restant.
- Les 190 PDF sources et les 30 Markdown des sessions précédentes ont des empreintes inchangées.
- Session 5 : 811 images récupérées ; l’audit ci-dessous précise les références non résolues.
- Exports Markdown bruts des sessions 2 à 5 conservés sous exports_bruts/.
- Chaque document conserve son nom et son arborescence.
- Aucune suppression de contenu métier ni résumé appliqué.
- La fidélité caractère par caractère n’a pas été auditée manuellement.
- Session 2, FACT-SFG-037 : différences d’options avancées observées ; voir session-2026-10-02-02.json.
- Vérifier les options de chaque nouveau traitement : la navigation peut les réinitialiser.
- Les fichiers session-*.json contiennent les identifiants LlamaParse pour éviter les doubles conversions.

## Audit du 3 octobre 2026

Les 40 Markdown, les 4 644 images et les 37 exports bruts attendus sont présents. Les empreintes des 40 Markdown et des 190 PDF sources sont conformes. Aucun doublon ni document converti manquant.

Correction du bilan des liens : 108 occurrences d’images non résolues dans 9 documents, plus 90 marqueurs dans les blocs Mermaid. Les contrôles précédents ne couvraient que les références avec extension d’image. Ne pas considérer les anciens champs missing_images: [] comme un contrôle exhaustif.

Voir [le rapport d’audit](audit-2026-10-03.md) et [le détail par document](audit-2026-10-03.json). Les conversions et leurs exports bruts ont été conservés sans modification.

## Suppression des images — 3 octobre 2026

À la demande de l’utilisateur, 4 644 images et leurs 40 dossiers ont été supprimés. Les références d’images des 40 Markdown finaux ont été retirées, y compris les marqueurs sans fichier. Les textes alternatifs ont été conservés ; les tableaux et blocs Mermaid sont conservés. Les PDF originaux sont inchangés. Les exports bruts restent archivés tels que téléchargés et peuvent donc encore contenir des références d’images.

Les empreintes actuelles des Markdown sont mises à jour dans l’inventaire et les sessions ; leurs anciennes empreintes sont conservées. Les nombres d’images des sessions décrivent les téléchargements historiques. Le rapport d’audit précédent décrit l’état avant suppression. Voir suppression-images-2026-10-03.json pour le détail des modifications. Pour les prochaines sessions, ne pas télécharger les images et retirer les références d’images des Markdown finaux en préservant leur texte alternatif.

## Contrôles de la session 6

Les 11 nouveaux Markdown et leurs exports bruts sont présents. Les empreintes des 190 PDF sources et des 40 Markdown précédents sont inchangées. Les 51 empreintes Markdown actuelles correspondent à l’inventaire. Aucune image téléchargée ; aucune balise d’image dans les Markdown finaux. La fidélité caractère par caractère reste non auditée.

## Contrôles de la session 7

Les 6 nouveaux Markdown complets et leurs exports bruts sont présents. Les 190 PDF sources et les 51 Markdown précédents ont des empreintes inchangées. Le cadre TLSi partiel reste uniquement dans les exports de suivi, pas parmi les conversions terminées. Aucune image téléchargée.

## Bilan après compléments 07b et 07c

18 nouveaux PDF complets, 98 pages, sans images. Compteur du compte : 9 990 / 10 000 crédits, solde 10. Les deux SEL-INF-032 et la présentation du cadre d’interopérabilité ont échoué deux fois côté LlamaParse ; leurs statuts failed_requires_resume et identifiants sont conservés. Le cadre TLSi principal reste partiel. Les 190 PDF sources et les 75 empreintes Markdown actuelles sont vérifiés. Les prochains lots peuvent sélectionner des documents légers, tout en gardant les reprises identifiées.
