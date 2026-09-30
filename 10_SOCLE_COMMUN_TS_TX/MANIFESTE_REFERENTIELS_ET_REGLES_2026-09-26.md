# Manifeste des référentiels, tarifs et règles — socle commun TS/TX et métier TS

État vérifié au 26 septembre 2026. Ce manifeste distingue les sources opposables, les copies locales servant de preuve et les artefacts que le logiciel doit produire. Une copie locale n'autorise jamais à ignorer une publication ultérieure.

Les chemins ci-dessous sont relatifs au dossier `10_SOCLE_COMMUN_TS_TX/`, sauf lorsqu'ils commencent par `../30_TRANSPORTEURS_SANITAIRES/`.

## Référentiels nationaux

| Domaine | Copie locale active | Version / date | Source officielle | Contrôle réalisé | Fréquence de contrôle recommandée | Repli en cas d'échec |
|---|---|---|---|---|---|---|
| Code officiel géographique | `Référentiels nationaux/COG_2026_ensemble_csv.zip` | COG au 01/01/2026 | <https://www.insee.fr/fr/information/8740218> | archive lisible ; SHA-256 `5c037e2977c9d476cfe2e7b7f923bbe09a87cbe448c59e492a71ef6a917aa53f` | annuel, puis contrôle des mises à jour INSEE | conserver le dernier millésime validé ; journaliser le millésime utilisé |
| Organismes destinataires | `Référentiels nationaux/TOD_3.76_2026-02-17.zip` | TOD 3.76, 17/02/2026 | <https://www.sesam-vitale.fr/web/sesam-vitale/tod-table-des-organismes-destinataires> | archive lisible ; SHA-256 `1033d2b409d6bc4440b177789b8b70029f813aab1b7809edc65cf41328802b13` | à chaque publication GIE ; abonnement à la lettre TOD | ne pas basculer sur une table invalide ; conserver la précédente avec alerte explicite |
| Centres payeurs | `Référentiels nationaux/Centres_payeurs_TOD_3.76_2026-02-17.csv` | 3.76, 17/02/2026 | <https://www.sesam-vitale.fr/web/sesam-vitale/adresses-des-centres-payeurs-tpt> | 618 lignes de données, 14 champs constants, 617 clés organisme correspondant à la TOD ; ISO-8859-1 ; SHA-256 `69f7ee4c5489eba7326e27600f3634ea7a2a5c8c0ed3e191856341ba7279adbb` | avec la TOD et avant toute mise en production | refuser l'import si encodage, nombre de colonnes ou cohérence TOD échoue |
| FINESS+ structures | `Référentiels nationaux/FINESS_structures_courant_2026-09-20.json.gz` | flux courant au 20/09/2026 ; schéma v1 | <https://www.data.gouv.fr/datasets/finess-structures-1> | JSON compressé lisible ; schéma et exemple locaux ; SHA-256 `ce6800a844f138b4487c1885a312e4b7f9e80f2a62fdac0c340585357de5a42d` | quotidien | conserver le dernier snapshot validé ; ne jamais charger partiellement |
| FINESS+ activités | `Référentiels nationaux/FINESS_activites_courant_2026-09-20.json.gz` | flux courant au 20/09/2026 ; schéma v1 | <https://www.data.gouv.fr/datasets/finess-activites-1> | JSON compressé lisible ; schéma, exemple et API YAML locaux ; SHA-256 `17387ef73765e3c9cb3444b4a599000f1dcf2b2f717e55a2b0a3d48bf7134d53` | quotidien | même règle que structures |
| Annuaire Santé / RPPS | `Référentiels nationaux/RPPS_extractions_2026-09-25/` | ressources ANS du 19/09/2026 | <https://www.data.gouv.fr/datasets/annuaire-sante-extractions-des-donnees-en-libre-acces-des-professionnels-intervenant-dans-le-systeme-de-sante-rpps> | 4 968 185 lignes de données lues ; nombre de champs constant ; hashes consignés dans le README local | quotidien | import atomique après contrôle ; conserver le snapshot validé précédent |
| Correspondance RPPS vers spécialité Assurance Maladie | `Référentiels nationaux/RPPS_regles_de_correspondance_GIE/` | guide FACT-GU-001 v1.22 et table livrée en mars 2026 avec l'avenant 48 | GIE SESAM-Vitale, package officiel de l'avenant 48 | guide de 9 pages lu ; classeur de 82 lignes et 7 colonnes lu cellule par cellule, sans formule ni feuille masquée ; replis profession seule non univoques pour les professions 10 et 60 ; hashes dans le README local | à chaque livraison GIE de l'avenant 48 ou de la table | correspondance exacte profession+savoir-faire ; mettre en quarantaine tout repli ambigu ; ne jamais substituer `TR-EDIT-DM01-SpecialiteDomaine` qui répond à un autre besoin |
| Nomenclatures des objets de santé | `Référentiels nationaux/NOS_JSON_FHIR_2026-08-27/` | 27/08/2026 | <https://mos.esante.gouv.fr/NOS/> | 401 JSON analysés, 31 877 concepts ; SHA-256 de l'archive `9b893b08c29f2d6553a7d95d4d355539d1cd06804a08aa04524092f3dc942809` | mensuel et avant livraison | conserver la version validée précédente et empêcher les codes inconnus de devenir silencieusement valides |
| Contrat Annuaire Santé | `Référentiels nationaux/Annuaire_Sante_DSFT_extractions_libre_acces_v3.1_2025-11-07.pdf` | DSFT 3.1, 07/11/2025 | ANS / Annuaire Santé | document lu ; SHA-256 `3759bc34a23dc70abb6418d0879908b37853af6f791f36ded2670c98feb457c2` | à chaque nouvelle version | le contrat de données doit être versionné avec l'importeur |

Notes d'intégration :

- le fichier des centres payeurs est en ISO-8859-1 et non en UTF-8 ;
- FINESS, RPPS, NOS, COG et TOD ne sont pas interchangeables : chacun doit conserver sa clé, sa version et sa provenance ;
- un import doit être préparé hors production, validé, puis activé atomiquement ;
- chaque facture doit pouvoir être reliée aux versions de référentiels utilisées lors de son calcul.

## Convention et tarifs TS

### Corpus conventionnel

Le dossier `../30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/` contient désormais la convention nationale de 2002 et la chaîne des avenants 1 à 11. L'avenant 1 est conservé sous forme de transcription de la source officielle Légifrance, le fac-similé étant protégé par le dispositif anti-robot du site. Les avenants 2 et 3 ont été ajoutés ; l'avenant 8, qui modifie l'avenant 1, est également présent.

Documents de pilotage complémentaires : protocole de maîtrise des dépenses de transport du 24 septembre 2025, circulaires relatives aux avenants 10 et 11, guide de tarification majorée SEFi et cahier TPMR.

### Tarifs actuellement documentés

| Périmètre | Source locale | Données d'effet visibles | Source officielle | Hash local |
|---|---|---|---|---|
| VSL | `../30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Tarifs_VSL_page_Ameli_consultee_2026-09-20.html` | socle non certifié au 01/10/2025 ; majoré SEFi au 01/01/2025 | <https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/facturation/tarifs/vsl-tarifs-conventionnels> | `2d6f91a8eb2c38c2a4aad075fb38404c567682b0457c4b2f92a7c26d84db9e18` |
| Ambulance | `../30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Tarifs_ambulance_page_Ameli_consultee_2026-09-20.html` | socle non certifié au 01/10/2025 ; majoré SEFi au 01/01/2025 | <https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/facturation/tarifs/ambulances-tarifs-conventionnels> | `299405f48c19b5b42eb3f2a5303aa8d653d9a4baa787b8abadd92dc928c1d374` |
| Communes au forfait agglomération | `../30_TRANSPORTEURS_SANITAIRES/Métier TS/Convention et tarification/Liste_communes_forfait_agglomeration_page_courante_2026-09-20.pdf` | page courante consultée le 20/09/2026 | page Ameli Ambulance ci-dessus | `efb9d97e9a28073ea8038d55e92b95cb136aac086e97f19416b71c898dc0496f` |

Les pages Ameli sont des preuves lisibles, pas une API tarifaire. Il reste à produire dans le logiciel une table normalisée et datée couvrant les forfaits, kilomètres, trajets courts, zones, communes, majorations, suppléments, transports partagés et critères de tarification majorée. Elle doit être testée contre des cas B2 et SEFi. Ce point est un artefact logiciel à construire, pas un document externe manquant.

Règle de repli : si une mise à jour tarifaire ne peut pas être validée, conserver la dernière version valide, empêcher l'application rétroactive d'un nouveau tarif, signaler l'obsolescence et bloquer toute date de transport située hors de la période explicitement couverte.

## B2 TS et évolutions SESAM-Vitale

Le socle documentaire local couvre la norme B2 2007 avec errata, l'annexe Transporteurs sanitaires, la géolocalisation, l'annexe 8 v2, l'annexe 10 de mars 2026, NOEMIE PS, ainsi que les spécifications de transport des flux ETS-DT-001 v1.52.00 et ETS-DT-003 v2.20.

La valeur `062007` n'est pas un indice d'addendum à demander : elle est imposée aux positions 82 à 87 du type 1 par la norme B2. Les addenda relèvent du cahier des charges SESAM-Vitale et ne doivent pas être confondus avec le numéro de version B2.

L'avenant 48 RPPS est conservé dans `B2/Evolutions/Avenant 48 RPPS - provisoire/`. Le PDT-CDC-112 v01.42 du 18 mars 2026 est marqué **PROVISOIRE**. Il concerne tous les professionnels, avec présence du profil TR, mais ne devient opposable que trois mois après publication par le CNDA des cas de test correspondants. Aucun package de tests ni date d'ouverture publique n'a été trouvé au 26 septembre 2026 : il faut donc préparer l'évolution sans la déclarer obligatoire en production.

Le mapping B2 du refus de transport partagé est défini dans FTE02 TS v03.60 du 27 août 2026 : type 4 après le dernier 4U ou 4 TMR, acte `TPR`, quantité `01`, coefficient `000100`, dénombrement `01`, prix unitaire et base à `0000002` (0,02 euro), taux et montants remboursables à zéro ; le prix du traceur n'entre pas dans le type 5. Le tableau de la page 87 comporte toutefois une erreur : il place la quantité en positions `75–80`, ce qui chevauche le code acte `74–78`, alors que la norme B2 2007 fixe la quantité en `79–80`. Ne pas inventer un arbitrage silencieux : demander un erratum ou une confirmation GIE/CNDA avant d'émettre ce cas.

## Droit et règles de prise en charge

Présents localement :

- l'arrêté du 23 décembre 2006 fixant le référentiel de prescription des transports, version consolidée contrôlée au 26/09/2026 ;
- les 3°, 4°, 19° et 28° de l'article L. 160-14 dans sa version en vigueur depuis le 20/08/2026, avec leur portée transport ;
- les extraits ciblés des articles R. 160-5, R. 160-8 à R. 160-11 et R. 160-16 utiles aux transports, avec les ruptures du 01/10/2026 et du 01/01/2027 (`Droit et règles/CSS_R160_regles_transport_versions_2026-09-26_2027-01-01.md`, SHA-256 `b1a288a909ee586db6dcf1c81db325213116c3b07d36ff302e0020f38dc422b8`) ;
- la décision UNCAM du 18 juillet 2023 fixant à 45 % la participation de droit commun aux frais de transport à compter du 01/08/2023, sous forme de transcription officielle complète avec empreinte (`Droit et règles/Decision_UNCAM_2023-07-18_participation_transports_45_pourcent.md`, SHA-256 du fichier `1b64eef0c2a931cd8be6c6f9b168c83ad4c1dc2947d47cc5ed7f214f47607f2e`) ;
- les articles R. 322-10 à R. 322-10-9, avec la version de R. 322-10 applicable jusqu'au 01/10/2026 et celle applicable à compter de cette date ;
- les articles L. 322-5 à L. 322-5-5 et R. 322-11-1 à R. 322-11-8 relatifs notamment au transport partagé ;
- le décret n° 2025-202, l'arrêté du 28 février 2025, la CIR-5/2025 et ses deux modèles nationaux de facture/annexe ;
- les formulaires courants S3138g / Cerfa 11574*07 et S3139h / Cerfa 11575*08, téléchargés depuis Ameli le 26/09/2026 et lus intégralement ;
- les modèles S3601d / Cerfa 11163*03 (facture VSL/ambulance) et S3602b / Cerfa 54003*01 (annexe valant attestation de service fait), présents dans `../30_TRANSPORTEURS_SANITAIRES/SEFi/Documents papier TS/` et également nécessaires au repli B2 ; leur contenu correspond aux modèles Ameli courants contrôlés ;
- la convention nationale, ses avenants et le protocole 2025.

La règle R. 322-10 change le 1er octobre 2026 : pour l'ALD, elle ajoute la condition de relever des 3° et 4° de l'article L. 160-14. Le moteur doit sélectionner la règle à la date du transport.

La borne de participation prévue au 9° de l'article R. 160-5 change le 1er janvier 2027 : elle passe de 45–55 % à 50–60 %. Le taux effectif 2027 ne doit pas être déduit de cette seule fourchette ; il dépend d'une nouvelle décision UNCAM encore à publier.

## TUPH et garde ambulancière

La page Ameli a été lue intégralement, toutes sections dépliées, et son relevé est conservé dans `../30_TRANSPORTEURS_SANITAIRES/Métier TS/TUPH/Page_Ameli_TUPH_consultee_2026-09-26.md` (SHA-256 `99525cf665ba14cb6a8898cdd03386b74fe80de76f06788ddd461a47e0531b7c`). Elle confirme le socle national : demande du SAMU-centre 15, forfait de 150 euros incluant 20 km, 2,32 euros par kilomètre à partir du 21e, sortie blanche à 80 euros, revenu minimal garanti à 64 euros par heure et minoration de 150 euros pour une intervention non exécutée du fait du transporteur depuis le 7 novembre 2023.

Les avenants 10 et 11 sont présents. L'instruction interministérielle `DGOS/R2/DSS/DGSCGC/2022/144` est identifiée, mais sa copie intégrale autonome reste à ajouter au corpus local. En outre, le cahier des charges opposable est défini par chaque ARS au niveau départemental. Il doit donc être obtenu et versionné pour chaque territoire de déploiement, avec le secteur et le tableau de garde correspondants ; un cahier d'un autre département n'est pas une pièce de substitution.

## Ce qui ne doit pas être confondu avec un document manquant

- tables tarifaires exécutables, jeux B2, fixtures NOEMIE 576/900, preuves et rapports de tests : à produire par le logiciel et la campagne de qualification ;
- distancier et traces de géolocalisation : données opérationnelles/versionnées, non remplacées par COG ;
- conventions et tarifs préfectoraux Taxi : périmètre TX départemental, pas socle national B2 TS ;
- service autonome d'interrogation des droits AMC : non applicable aux transporteurs sanitaires/taxis dans le périmètre retenu ; cela n'exclut pas les données AMC présentes dans les échanges `ServicePEC` ou `FEL` de SEFi ;
- absence d'API tarifaire nationale : contrainte de maintenance à traiter par une table interne versionnée, pas document externe bloquant.

## Lacunes externes encore ouvertes

1. avant la campagne, confirmation écrite par le CNDA du parcours de validation B2 Transporteur sanitaire : conditions, plan, volume technique, paramètres, certificats et environnement ; aucun package autonome B2 TS courant n'est exposé dans le catalogue consulté ;
2. cas de tests CNDA et date d'ouverture de l'avenant 48 RPPS, encore provisoire et non opposable ;
3. clarification GIE de la priorité des lignes de correspondance RPPS sans savoir-faire : les professions 10 et 60 conduisent chacune à plusieurs spécialités FNPS possibles ;
4. confirmation du jeu de tests de transport des flux à employer pendant la campagne, notamment l'articulation entre ETS-DT-001 v1.52.00 et les cahiers VALID-PTV disponibles ;
5. erratum ou confirmation GIE/CNDA des positions du type 4 `TPR` avant émission d'un refus de transport partagé en B2 (`75–80` dans FTE02 contre `79–80` dans B2 2007) ;
6. décision UNCAM fixant le taux effectif de participation aux frais de transport à compter du 01/01/2027 ;
7. copie intégrale de l'instruction nationale TUPH `DGOS/R2/DSS/DGSCGC/2022/144` ;
8. cahier des charges TUPH, arrêtés modificatifs, secteurs et tableaux de garde de chaque département effectivement déployé ;
9. distanciers conventionnels ou opérationnels applicables à chaque entreprise ou territoire ;
10. publications mettant en œuvre les suites annoncées par le protocole du 24 septembre 2025, si elles interviennent avant la mise en production.

Anomalies de publication à suivre sans modifier les originaux : la chaîne d'homologation publique des Cerfa courants reste moins lisible que les formulaires effectivement distribués par Ameli ; la page Ameli TUPH comporte une date de publication incohérente pour l'avenant 11 (mars au lieu de mai 2023).
