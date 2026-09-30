# Validation du cadrage et sélection du premier lot — SEFi TS 03.50.00

**Date de la revue :** 27 septembre 2026

**Date de référence de la baseline :** 26 septembre 2026, inchangée

**Profession :** Transporteur sanitaire (TS)

**Canal :** SEFi

**Baseline :** package GIE SESAM-Vitale 3.50 / qualification CNDA 03.50.00

**Livrable source :** `CARTE_TRAVAIL_EXTRACTION_SEFI_TS_03.50.00_2026-09-26.md`

## 1. Objet et limite de cette revue

Cette revue vérifie si le cadrage permet d'ouvrir une extraction réglementaire détaillée, corrige la définition des lots, puis sélectionne **un seul** premier lot. Elle ne produit aucune architecture fonctionnelle et ne commence pas l'extraction des règles.

Les identifiants de sources `D01`, `S01`, `Q10`, etc. renvoient au registre de la section 4 de la carte de travail source. Les qualifications `ETABLI`, `DEDUIT`, `RECOMMANDE`, `CONFLIT` et `INCONNU` conservent le sens défini dans cette carte.

## 2. Verdict de solidité du cadrage

**Conclusion de méthode : le cadrage est suffisamment solide pour commencer une extraction ciblée, sous réserves explicites.** Les réserves ouvertes empêchent de déclarer le référentiel complet ou validé ; elles n'empêchent pas d'ouvrir un premier lot dont les dépendances sont maîtrisées.

| Point à vérifier | Éléments disponibles | Lacune ou réserve | Verdict |
|---|---|---|---|
| Périmètre exact de la baseline | D01 notice et D02 livraison GIE 3.50 ; Q01-Q02 qualification CNDA 03.50.00 ; D03 périmètre v3.07 ; décision CTLSAM du 04/09/2026 ; date de coupure fixée au 26/09/2026. | L'association composant par composant entre package GIE et package CNDA n'est pas donnée par un manifeste unique. La situation contractuelle de l'éditeur n'a pas été fournie ; elle modifie l'opposabilité au 26/09/2026. | Suffisant pour une baseline cible, à condition de conserver ces deux réserves. |
| Sources candidates | Registre D01-N11, couvrant noyau, exemples, qualification, géoloc, SCOR, TLSi, B2, droit, convention, tarifs et référentiels. | Portail Espace Industriels partiellement authentifié ; quelques références explicites manquent. | Suffisant et borné ; aucune exhaustivité absolue revendiquée. |
| Rôle documentaire | Nature primaire, secondaire, exemple, qualification, historique ou produit voisin indiquée par famille/source. | Certaines pièces sans signature/date visible restent qualifiées `INCONNU`, sans attribution inventée. | Conforme. |
| Version et statut | Version/date/statut enregistrés, avec distinction date de publication, effet, consultation et métadonnée. | `CONFLIT` transversal `REFERENCE` contre `EN COURS/provisoire` pour les SFG ; plusieurs incohérences de version internes. | Suffisant pour extraire avec réserve ; insuffisant pour déclarer les règles validées sans arbitrage. |
| Dépendances | Chaîne documentaire section 5.1 ; renvois WS_BS, TLSi, SCOR, B2, géoloc, droit et tarifs identifiés. | Version exacte du CI TLSi opposable et statut courant de certaines dépendances restent inconnus. | Suffisant pour choisir des lots ne dépendant pas encore de ces pièces. |
| Capacités fonctionnelles | Carte section 5 : périmètre, prescription, référentiels, FEL, contrôle, validation, PJ, géoloc, administration, replis, qualification, etc. | La carte est une taxonomie de travail, pas une architecture ; cette limite est correcte. | Conforme. |
| Couverture initiale | Registre par source et par partie en section 7. | De nombreux documents longs restent `PARTIALLY_REVIEWED`, conformément à la réalité. | Conforme. |
| Documents manquants | Tableau section 9 : CI 1.0.2, PDT-INF-237, FI 631, SEL-MP-013 v0.30, CDC géoloc, CNDA B2 TS, TUPH/ARS, etc. | Copie locale de la décision CTLSAM et décision géoloc 1.05 à obtenir. | Conforme ; manques visibles. |
| Conflits connus | Douze familles matérielles en section 8, preuves et autorités de résolution indiquées. | Aucun conflit n'est arbitré par vraisemblance. | Conforme. |
| Plan en lots | Section 10 initiale très détaillée. | Mélange prérequis de gouvernance, unités fonctionnelles et simples tranches de documents ; toutes les lignes n'ont pas les champs de contrat demandés. | À corriger ; plan canonique remplacé par la section 4 du présent document. |

### 2.1 Corrections apportées

1. L'applicabilité de D04/PDT-INF-307 v6 à la qualification 03.50.00 est désormais `ETABLI` par les renvois Q10 pp.77-78 et Q12 p.23 ; la carte source a été corrigée.
2. Le gel n'est plus décrit comme un « triplet » incomplet : le tuple de baseline comprend D01/D02, D03, Q01/Q02 et la décision CTLSAM. Q03 reste une source contractuelle candidate distincte, d'applicabilité exacte `INCONNU`.
3. `RG_FTE099` est réattribuée à S02/PG §2.3 p.11, et non à S04/FTE02. Le conflit de spécialité 55/56 reste ouvert, mais il est sorti du premier lot de périmètre.
4. Le rôle de D03 est complété : p.1-2 portent le périmètre ; p.3 porte trois familles distinctes — format des heures, reprise WS_FT3 et disponibilité — routées vers leurs lots propriétaires.
5. Les localisateurs S01/S02 sont rectifiés : S01 §3.10 tables p.29-36 et ch.4 erreurs p.36-67 ; S02 §2.1-2.3 contexte/acteurs/aspects non fonctionnels, §2.4-2.5 processus, §2.6 situations spécifiques, §2.7 administration/supervision, §2.8 consignes transverses.
6. Le conflit E04 est reformulé : `WS_PEC1_calculer_Response.xml`, `FACTURE/COUVERTURE[2]`, omet le choix d'identification obligatoire ; il ne place pas cette identification après `Nature`.
7. Les éditions B2 « juin 2007-Addendum B » et « juin 2005 », ainsi que l'identification des annexes/compléments Ameli cités par FTE02 §1.5 p.5, sont ajoutées aux manques. B01 n'est pas présumé équivalent.
8. M02 est ramené à un index de famille : A1 est une transcription locale secondaire, tandis que chaque autre avenant/rectificatif doit recevoir son propre rôle, autorité, date et état de couverture avant extraction.
9. Les versions officielles Légifrance liées par L01-L05 sont désormais enregistrées comme sources primaires autonomes L01P-L05P, `NOT_REVIEWED`, avec copies locales `MISSING` avant promotion d'une règle juridique.
10. Pour les contrats, les localisateurs canoniques seront les fichiers et chemins XML complets — opération, messages, binding, adresse, racines/types XSD et imports — et non le seul nom d'un répertoire.
11. Les opérations de gel, de résolution de statut et de sécurisation des imports sont désormais des **portes de préparation**, pas des lots de règles. Les anciennes entrées `PG-*`, `DICO-*`, `BASE-*`, `QUAL-*` et `EX-*` sont des sous-unités de lecture ou preuves intégrées ; elles ne sont plus le registre canonique.
12. Chaque lot est désormais défini par une capacité, ses passages ou éléments, ses renvois, ses dépendances, son résultat et ses critères de couverture. La page 3 de D03 n'est pas absorbée dans le premier lot.

## 3. Portes de préparation — hors registre des lots

| Porte | Objet | État au 27/09/2026 | Condition |
|---|---|---|---|
| `GATE-BL-01` | Geler le tuple D01/D02 (package GIE 3.50) / D03 (périmètre v3.07) / Q01-Q02 (qualification 03.50.00) / décision CTLSAM, à la date du 26/09/2026. | Satisfaite avec réserve. | Conserver la décision CTLSAM, distinguer l'opposabilité selon la situation contractuelle de l'éditeur et ne pas inclure Q03 dans le package CNDA. |
| `GATE-DOC-01` | Rendre visibles statuts, conflits et manques avant extraction. | Satisfaite. | Aucun conflit ne doit être masqué ; les SFG restent marquées `CONFLIT` de statut. |
| `GATE-SAFE-01` | Empêcher tout téléchargement implicite de schéma et préserver les originaux. | Satisfaite comme consigne. | Toute compilation future utilisera une copie dérivée locale, jamais les originaux ni le réseau. |
| `GATE-TRACE-01` | Imposer le contrat de preuve et la chaîne `source → règle → capacité/workflow`. | Satisfaite comme méthode. | Aucun `RULE-ID` pour une hypothèse, un exemple ou une conclusion insuffisamment établie. |

## 4. Registre canonique des lots d'extraction

### 4.1 Règle commune de couverture

Un lot ne peut passer à `REVIEWED` pour son périmètre que si :

- chaque passage principal annoncé a été lu intégralement dans le périmètre du lot ;
- tous les renvois nécessaires à la compréhension de ces passages ont été soit consultés, soit classés `MISSING`/hors périmètre avec impact explicite ;
- chaque règle candidate possède qualification, source, autorité, version/statut/date, localisateur et applicabilité ;
- les contradictions et limites sont enregistrées ;
- la chaîne `source → règle candidate → capacité/workflow` est complète ;
- le registre de couverture des sources est mis à jour ;
- aucun exemple ou test de qualification n'est utilisé seul comme origine d'une obligation.

Une contradiction non résolue n'empêche pas nécessairement de clore la lecture du lot : le lot peut être `REVIEWED` avec conclusion `CONFLIT`, à condition que les deux preuves, l'impact et l'autorité de résolution soient documentés.

### 4.2 Périmètre et capacités transverses

| LOT-ID / capacité | Sources principales et passages | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-PERIM-01` — déterminer le périmètre courant d'élaboration d'une FEL SEFi TS et l'orientation hors SEFi | D03 p.1, blocs « Contexte » et « Périmètre pour les services », puis p.2, tableau complet C1.3, C1.4, C2.1, C2.2 ; S02 §2.1 p.7, seul bloc « Périmètre du système FTE ». | D01 pp.1-3, décision CTLSAM et Q02 p.8 seulement pour provenance/applicabilité ; S01 p.12, pp.20-21 et p.32 uniquement pour le sens des données déjà citées. Tout autre renvoi est routé sans extraction. | `GATE-BL-01`, `GATE-DOC-01`. | Registre des critères d'entrée/sortie, données support, statut temporel du périmètre et frontière vers B2, sans règle B2. | Chaque paragraphe/ligne/note inclus est comptabilisé ; C1.1/C1.2 ne sont pas reconstitués ; « Étape en cours » et « Étapes suivantes » sont séparées ; D03 p.3, S02 p.8 « Forçage », S02 §2.3/RG_FTE099, T10 et Q05 sont exclus. |
| `TS-SEFI-ACT-01` — identifier acteurs, responsabilités fonctionnelles et cycles de vie | S02 §2.2 pp.9-10 ; §2.4.1-2.4.2 pp.13-16 ; ch.3 p.24 ; S01 ch.2 pour les définitions utilisées. | Q02-Q03 pour rôles GIE/CNDA/éditeur ; C02 uniquement pour les acteurs SCOR mentionnés. | `TS-SEFI-PERIM-01`. | Tableau des acteurs, objets fonctionnels, responsabilités et états/transitions explicitement décrits. | Chaque acteur et chaque état/transition du périmètre lu possède une source ; aucune responsabilité technique ou organisationnelle n'est déduite sans preuve. |
| `TS-SEFI-SEC-01` — accéder aux services et porter les contextes de sécurité | T06 chapitres sécurité/transport/assertions ; T07 p.1-2 ; T08 documents cartes/certificats et cipher suite ; chapitres techniques de G01-G04 ; éléments CTX/SAML/WSSE/WS-Addressing de X01-X04. | Q03 art.3 p.5 ; P01 ; T09 pour cache/redirections. | Version exacte du CI à confirmer ; `GATE-SAFE-01`. | Registre des modes d'accès, identités, certificats, assertions et contextes communs aux appels. | Version/statut de chaque pièce établis ou `INCONNU` ; chaque exigence commune est localisée ; aucun endpoint de qualification n'est pris pour la production ; imports distants recensés sans résolution réseau. |
| `TS-SEFI-ADM-01` — paramétrer le TS, activer les services et historiser les échanges | S07 p.6-15 ; Q04 rubriques correspondantes ; S01 données de paramétrage citées. | T06-T09 ; C03/C05 pour les paramètres SCOR explicitement appelés. | `TS-SEFI-SEC-01` et lots de service dont l'activation est étudiée. | Registre des paramètres, états d'activation, données techniques et preuves d'historisation. | Chaque paramètre possède source, portée et cycle de vie ; les paramètres propres à un service restent rattachés à son lot ; les tests Q04 sont recoupés avec la SFG. |
| `TS-SEFI-MULTI-01` — gérer multi-sociétés et mandats | S02 §2.4.4 p.18 ; P02 ; tests Q04 relatifs au multi-sociétés ; données S01 citées. | P01 pour cartes CDE/CPE ; S07 règles de paramétrage correspondantes. | `TS-SEFI-ADM-01`, `TS-SEFI-SEC-01`. | Règles de rôles mandant/mandataire, rattachements, cartes et séparation des factures. | Tous les scénarios explicitement présents sont couverts ; le guide 2022 est confronté au test 2026 ; toute divergence d'actualité reste visible. |
| `TS-SEFI-DISPONIBILITE-01` — gérer disponibilité/indisponibilité des services | D03 p.3, bloc « Disponibilité du service » ; S02 §2.1, bloc disponibilité p.8 ; G01-G04 sections environnements ; T10. | Passages de PG/FTE02 explicitant B2 ou papier en mode dégradé ; aucun détail B2. | `TS-SEFI-PERIM-01`, `TS-SEFI-SEC-01`. | Règles de disponibilité déclarée, détection d'indisponibilité et orientation vers les lots de repli. | Horaires, périmètre régime et conditions de repli sont sourcés et datés ; les mécanismes B2/papier restent de simples renvois vers leurs lots. |
| `TS-SEFI-REPRISE-FT3-01` — reprendre un appel de validation en erreur | D03 p.3, bloc « Double appel au service WS_FT3 » ; G03 opération FT3 et erreurs ; X03 opération `valider`; S01 erreurs citées. | S04 validation pp.69-75 ; Q12 tests de reprise/doublon. | `TS-SEFI-FT3-01`. | Machine d'états de reprise, conservation des identifiants et traitement des réponses du second appel. | Chaque branche de réponse est tracée ; codes d'erreur et statut FEL sont recoupés DICO/XSD/qualification ; aucune autre stratégie de retry n'est généralisée. |

### 4.3 Opérations des services AMO

Pour chacun des lots ci-dessous, les éléments WSDL visés sont le fichier exact et les chemins `/wsdl:definitions/wsdl:portType/wsdl:operation`, messages, binding et `/wsdl:definitions/wsdl:service/wsdl:port/soap*:address` ; les XSD visés sont les racines requête/réponse, leurs types atteignables et `/xsd:schema/xsd:import/@schemaLocation`. Le résultat commun attendu est un dossier d'opération : préconditions, entrée, sortie, erreurs, transitions, preuve de qualification et statut des exemples. Le lot est couvert lorsque tous les éléments de message, cardinalités/facettes utiles, erreurs, pré/postconditions et cas CNDA du périmètre sont tracés ; l'exemple correspondant est validé contre le contrat courant ou explicitement classé incompatible.

| LOT-ID / capacité | Sources principales et sections/éléments | Compléments / renvois | Dépendances | Résultat attendu / critère additionnel |
|---|---|---|---|---|
| `TS-SEFI-PS1-01` — rechercher un prescripteur praticien | G01 section WS_PS1 dans pp.5-10, messages pp.15-17, erreurs p.18 ; X01 opération `rechercherPrescripteurPraticien` et XSD associés. | S06 partie PS pp.6-9 ; S01 données PS ; tests PS de Q07 ; E01 PS1 en dernier. | `TS-SEFI-SEC-01`, `TS-SEFI-PERIM-01`. | Dossier PS1 ; couvrir identifiant d'entrée, données retournées, absence/erreurs et statut de l'exemple. |
| `TS-SEFI-PS3-01` — rechercher un établissement | G01 section WS_PS3, mêmes plages ; X01 opération `rechercherEtablissement` et XSD associés. | S06 pp.6-9 ; S01 ; Q07 ; E01 PS3. | `TS-SEFI-SEC-01`, `TS-SEFI-PERIM-01`. | Dossier PS3 ; isoler FINESS transmis/retourné et ne pas supposer un import FINESS local. |
| `TS-SEFI-PS4-01` — rechercher les données du transporteur/RNT | G01 section WS_PS4, mêmes plages ; X01 opération `rechercherDonneesTransporteur` et XSD associés. | S06 pp.6-9 ; S01 ; Q07 ; E01 PS4 ; conflit D01 p.1 / S02 §2.3 p.11 (`RG_FTE099`). | `TS-SEFI-SEC-01`, `TS-SEFI-PERIM-01`. | Dossier PS4 ; traiter explicitement identifiants, spécialité et RNT, avec conflit 55/56 non arbitré. |
| `TS-SEFI-BS1-01` — lister les bénéficiaires | T02 section WS_BS1 à partir de p.5 ; T03 opération WSDL et XSD WS_BS1. | S06 bénéficiaire pp.10-12 ; S01 ; tests correspondants Q07 ; T04 exemple en dernier. | `TS-SEFI-SEC-01`, décision sur version Q07 0.30 contre T02 1.15. | Dossier BS1 ; l'écart de version qualification/service doit être conclu `CONFLIT` ou `INCONNU`, pas masqué. |
| `TS-SEFI-BS2-01` — rechercher l'état civil bénéficiaire | T02 section WS_BS2 ; T03 opération et XSD WS_BS2. | S06 pp.10-12 ; S01 ; Q07 ; T04 exemple. | `TS-SEFI-BS1-01` seulement pour données communes ; même conflit de version. | Dossier BS2 ; distinguer critères de recherche, identité retournée et erreurs. |
| `TS-SEFI-PL1-01` — acquérir une prescription électronique | G02 section PL1 dans pp.5-15, messages pp.19-26, erreurs pp.27-28 ; X02 opération `acquerirPrescription` et XSD associés. | S06 PEL pp.17-19 ; S03 cadrage ; S01 ; Q06 acquisition ; E02 PL1. | `TS-SEFI-SEC-01`, `TS-SEFI-PERIM-01`; PDT-INF-237 manquant à qualifier. | Dossier PL1 ; documenter le conflit XSD réponse V00_07/appinfo 00.06. |
| `TS-SEFI-PL2-01` — réserver un trajet | G02 section PL2 ; X02 opération `reserverTrajet` et XSD associés. | S03 réservation p.7-9 ; S06 ; S01 ; Q06 réservation ; E02 PL2. | `TS-SEFI-PL1-01`, `TS-SEFI-ACT-01`. | Dossier PL2 ; couvrir transition d'état et identifiants de réservation. |
| `TS-SEFI-PL3-01` — déclarer l'exécution d'un trajet | G02 section PL3 ; X02 opération `executerTrajet` et XSD associés. | S03 réalisation p.10-12 ; S06 ; S01 ; Q06 exécution ; E02 PL3. | `TS-SEFI-PL2-01`, `TS-SEFI-ACT-01`. | Dossier PL3 ; couvrir transition de réalisation, retours et erreurs. |
| `TS-SEFI-PEC1-01` — obtenir les modalités de prise en charge | G04 fonctionnel pp.5-7, messages pp.11-13, erreurs pp.14-17 ; X04 opération `calculer` et XSD associés. | S06 PEC pp.13-16 ; S01 ; Q08 ; E04 en dernier ; L02-L05 uniquement si un concept juridique doit être interprété. | `TS-SEFI-BS1-01`, `TS-SEFI-BS2-01` pour les données bénéficiaire ; `TS-SEFI-RIGHTS-01` pour le sens juridique. | Dossier PEC1 ; l'exemple E04 est classé par rapport au XSD sans modifier l'original. |
| `TS-SEFI-FT1-01` — consulter/récupérer une FEL | G03 FT1 pp.5-11, modèle FEL pp.12-24, messages pp.29-49, erreurs pp.50-51 ; X03 opération `consulter` et XSD associés. | S06 FEL p.20 ; S01 ; Q11 pp.5-10 ; E03 FT1. | `TS-SEFI-FEL-MODEL-01` et lots FEL propriétaires des données restituées. | Dossier FT1 ; couvrir clé de consultation, contenu restitué et absence/erreurs. |
| `TS-SEFI-FT2-01` — contrôler la recevabilité | G03 FT2 et plages communes ; X03 opération `controlerRecevabilite` et XSD associés. | S04 pp.67-68 ; S01 erreurs ; Q10, découpé selon les cas rattachables ; E03 FT2. | Lots FEL, droits, tarifs et géoloc propriétaires de chaque contrôle. | Dossier FT2 ; chaque test Q10 est rattaché à la source de la règle testée ; conflits TUPH/TPR maintenus ouverts. |
| `TS-SEFI-FT3-01` — valider une FEL | G03 FT3 et plages communes ; X03 opération `valider` et XSD associés. | S04 pp.69-75 ; S01 ; Q12 pp.5-22 ; E03 FT3. | `TS-SEFI-FEL-MODEL-01`, lots FEL/valorisation et `TS-SEFI-SEC-01`. | Dossier FT3 ; couvrir accusé, identifiants, doublons, reprises/annulation ; la reprise spéciale reste dans `TS-SEFI-REPRISE-FT3-01`. |
| `TS-SEFI-FT4-01` — calculer les montants d'une prestation | G03 FT4 et plages communes ; X03 opération `calculerMontantsPrestation` et XSD associés. | S04 valorisation pp.48-66 ; S01 ; Q09 ; E03 FT4 ; sources tarifaires via lots dédiés. | `TS-SEFI-FEL-PREST-01`, `TS-SEFI-FEL-TRAJET-01`, lots tarifaires applicables. | Dossier FT4 ; séparer contrat de calcul et origine conventionnelle/tarifaire des montants. |

### 4.4 Constitution et cycle de la FEL

| LOT-ID / capacité | Sources principales et passages | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-FEL-MODEL-01` — établir le modèle FEL partagé | S04 §2.3.2 pp.18-22 ; G03 modèle FEL pp.12-24 ; S01 entité FEL et types communs ; X03 types XSD partagés FT1-FT4. | S02 cycle FEL pp.13-16. | `TS-SEFI-ACT-01`; dictionnaire commun lu seulement pour les éléments utilisés. | Modèle fonctionnel sourcé des entités/relations FEL, indépendant des règles de chaque opération. | Chaque entité/relation du périmètre est localisée dans SFG/DICO/XSD ; les règles de calcul, contrôle et validation sont seulement routées. |
| `TS-SEFI-FAC-ACQ-01` — acquérir les informations préalables | S04 pp.13-16, `RG_FTE200` à `RG_FTE204` ; S01 données citées. | S06 ; lots PS/BS/PL/PEC propriétaires des appels. | `TS-SEFI-PS1-01`, `TS-SEFI-PS3-01`, `TS-SEFI-PS4-01`, `TS-SEFI-BS1-01`, `TS-SEFI-BS2-01`, `TS-SEFI-PL1-01`, `TS-SEFI-PEC1-01`. | Matrice besoin de donnée → origine → moment d'acquisition. | Toutes les RG 200-204 et leurs données sont couvertes ; aucune règle interne d'un service n'est réextraite. |
| `TS-SEFI-FEL-PARTIES-01` — déterminer PS et bénéficiaire de la FEL | S04 pp.24-27, `RG_FTE211` à `RG_FTE214` ; S01 familles PS/BS/FEL ; G03 modèle FEL. | Lots PS/BS. | `TS-SEFI-FEL-MODEL-01`, `TS-SEFI-FAC-ACQ-01`. | Correspondance données PS/BS → FEL, avec provenance et conditions. | RG 211-214 et chaque champ associé sont tracés ; les recherches de référentiel restent dans leurs lots. |
| `TS-SEFI-FEL-PRESC-01` — déterminer les informations de prescription | S04 pp.28-30, `RG_FTE215` ; S01 données prescription/FEL. | Lots PL ; `TS-SEFI-PRESC-DAP-01` pour sens juridique. | `TS-SEFI-FEL-MODEL-01`, `TS-SEFI-FEL-PARTIES-01`. | Données de prescription portées dans la FEL et provenance PEL/papier. | Toute branche PEL/PP de RG_FTE215 est couverte ; aucune règle juridique n'est déduite de la seule SFG. |
| `TS-SEFI-FEL-PREST-01` — déterminer les prestations | S04 pp.31-35, `RG_FTE217` et `RG_FTE218` ; S01 données prestation/FEL. | S03 et lots PL2/PL3 pour réalisation ; sources métier selon nature. | `TS-SEFI-FEL-PRESC-01`, `TS-SEFI-ACT-01`. | Règles de création/association des prestations à la prescription. | RG 217-218, entrées, sorties et exceptions sont couvertes ; tarifs exclus. |
| `TS-SEFI-FEL-TRAJET-01` — déterminer les trajets et leur nombre | S04 pp.36-40, `RG_FTE219` à `RG_FTE221` puis `RG_FTE250` ; S01 données trajet. | Lots PL2/PL3 ; contextes TMR/transport partagé seulement sur renvoi. | `TS-SEFI-FEL-PREST-01`. | Règles de trajet, association, ordre/nombre et cohérences. | Chaque RG et note de la plage est couverte ; cas spéciaux sont reliés à leur lot sans extraction anticipée. |
| `TS-SEFI-FEL-COUV-01` — déterminer couvertures AMO/AMC et contextes associés | S04 pp.41-45, `RG_FTE251`, `RG_FTE222`, `RG_FTE223` ; S01 données de couverture. | `TS-SEFI-RIGHTS-01`, `TS-SEFI-PEC1-01`, transport partagé/refus selon renvoi. | `TS-SEFI-FEL-TRAJET-01`. | Règles fonctionnelles de couverture portées par la FEL, avec origine juridique/service. | Chaque RG et champ est tracé ; AME/C2S/AMC ne sont pas assimilés ; les règles de droit sont importées seulement par lien vers leur lot. |
| `TS-SEFI-FEL-ASSUR-01` — déterminer contexte d'assurance/maternité | S04 pp.46-47, `RG_FTE224` ; S01 données concernées. | L02-L05 et Q08 seulement si explicitement nécessaires. | `TS-SEFI-FEL-COUV-01`. | Données et conditions de contexte assurance/maternité. | RG_FTE224 couverte dans toutes ses branches ; versions juridiques datées. |
| `TS-SEFI-VAL-BASE-01` — déterminer distance, majoration, forfait, kilométrique et trajet court | S04 pp.53-56, `RG_FTE225` à `RG_FTE229` ; S01 données de montant. | FT4 ; lots tarifaires VSL/ambulance/majoration. | `TS-SEFI-FEL-TRAJET-01`, tarifs applicables. | Règles candidates de composantes tarifaires de base et provenance de valeur. | RG 225-229 couvertes ; chaque montant/condition a une source tarifaire datée ; aucun choix d'implémentation. |
| `TS-SEFI-VAL-AJUST-01` — appliquer suppléments et abattements | S04 pp.56-60, `RG_FTE230` à `RG_FTE234`. | Lots TUPH/transport partagé/tarifs selon chaque renvoi. | `TS-SEFI-VAL-BASE-01`. | Règles de suppléments/abattements avec conditions. | RG 230-234 et sources conventionnelles sont couvertes ; conflit TUPH explicite. |
| `TS-SEFI-VAL-BR-01` — déterminer bases, montants et prise en charge | S04 pp.60-63, `RG_FTE236` à `RG_FTE241`. | FT4/PEC1 ; lot droits. | `TS-SEFI-VAL-AJUST-01`, `TS-SEFI-RIGHTS-01`. | Calcul fonctionnel des bases/remboursements et provenance des montants. | RG 236-241 couvertes ; calcul local et service sont distingués. |
| `TS-SEFI-VAL-FINAL-01` — déterminer montants finaux et totaux | S04 pp.64-65, `RG_FTE242` et `RG_FTE249`. | G03 modèle FEL ; FT4 ; Q09 cas correspondants. | `TS-SEFI-VAL-BR-01`. | Règles finales de totalisation portées dans la FEL. | Deux RG, champs résultants et arrondis/conditions explicitement présents sont tracés ; aucun calcul absent n'est inventé. |

### 4.5 Règles métier et tarifaires nécessaires à la FEL

| LOT-ID / capacité | Sources principales et passages/éléments | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-PRESC-DAP-01` — établir prescription et accord préalable | L01, articles applicables de l'arrêté du 23/12/2006 ; L04, articles R.322-10 à R.322-10-9 dans leur version au 26/09/2026 ; L06 formulaires S3138g/S3139h ; S04 prescription pp.28-30. | Q05/Q06 pour contrôle après le normatif ; SCOR uniquement pour le support DAP. | `TS-SEFI-PERIM-01`; vérification Légifrance courante. | Règles de prescription, DAP, supports et données utiles à la FEL. | Chaque règle est rattachée au texte/version/date d'effet ; la version du 01/10/2026 est isolée comme future ; le conflit Q05 DAP reste ouvert. |
| `TS-SEFI-RIGHTS-01` — déterminer prise en charge et participation | L02, L03 versions au 26/09/2026, L05 ; S06/G04 pour le point d'usage, sans reprendre le contrat PEC. | Q08 après sources juridiques ; versions futures L03 en registre de transition. | `TS-SEFI-PRESC-DAP-01` lorsque l'accord préalable intervient ; `TS-SEFI-PEC1-01` pour l'échange. | Registre daté des conditions de droit/participation et correspondance avec les concepts FEL/PEC. | Texte officiel courant vérifié proposition par proposition ; effets 2027 exclus de la baseline ; contrat d'échange et droit ne sont pas confondus. |
| `TS-SEFI-SHARED-01` — traiter transport partagé et refus | L07-L11 ; S02 §2.1 passages transport partagé/refus pp.7-9 ; sections correspondantes S04/Q10 ; L12/P04/P05/P08 pour facture/ASF. | M04/M05/M09 pour effets conventionnels/tarifaires. | `TS-SEFI-PRESC-DAP-01`, `TS-SEFI-FEL-TRAJET-01`, `TS-SEFI-FEL-COUV-01`; lots tarifaires. | Conditions, proposition/refus, effets facturation/tiers payant et preuves documentaires. | Droit, circulaire, convention et formulaire sont distingués ; conflit Q10 trajet 1/2 et conflit Cerfa restent visibles. |
| `TS-SEFI-TUPH-NAT-01` — traiter TUPH au niveau national | S02 §2.1 passage TUPH pp.8-9 ; M04 Avenant 10 et circulaire ; M13 ; sections S04/Q08/Q10 correspondantes. | Instruction DGOS/R2/DSS/DGSCGC/2022/144 à obtenir ; M07/PDT-INF-818 pour relation tarification. | `TS-SEFI-FEL-TRAJET-01`, `TS-SEFI-VAL-AJUST-01`, `TS-SEFI-TARIF-AMB-01`. | Règles nationales du contexte TUPH et liste des paramètres territoriaux non couverts. | Corpus national intégralement tracé ; conflit Q10 SUPFORF ouvert ; aucune règle ARS locale n'est généralisée. |
| `TS-SEFI-TUPH-LOC-<territoire>` — appliquer TUPH territorialement | Cahier des charges et tableau de garde de l'ARS/caisse du territoire visé. | Résultat `TS-SEFI-TUPH-NAT-01`. | Source territoriale fournie ; lot conditionnel, un territoire par lot. | Paramètres et règles locales, datés et bornés au territoire. | Autorité, territoire, période et preuve d'activation établis ; aucune extrapolation à un autre territoire. |
| `TS-SEFI-TPMR-01` — traiter la prestation TMR/TPMR | M03 cahier des charges TPMR ; clauses pertinentes Avenant 9 ; S02 §2.1 p.7 ; sections S04/Q08/Q10 correspondantes. | Sources tarifaires VSL/ambulance selon cas. | `TS-SEFI-FEL-PREST-01`, `TS-SEFI-FEL-TRAJET-01`. | Conditions, données, articulation avec un trajet et effets de facturation. | Toutes les clauses TPMR applicables sont localisées ; le type de véhicule et les dépendances tarifaires sont explicites. |
| `TS-SEFI-TARIF-VSL-01` — déterminer les tarifs VSL applicables | M10 page Ameli VSL ; articles/annexes VSL de M01-M09, à indexer par intitulé avant ouverture ; B04 pour codification si nécessaire. | M12 communes d'agglomération ; M06/M07 pour différenciation SEFi. | `TS-SEFI-FEL-PREST-01`, `TS-SEFI-FEL-TRAJET-01`; consolidation chronologique des clauses VSL. | Tableau tarifaire VSL daté, avec base juridique/conventionnelle et conditions. | Chaque montant/condition de la page courante est relié à une source conventionnelle ou signalé comme consigne d'exploitation ; pages/articles exacts indexés avant ouverture ; actualité M12 résolue avant usage. |
| `TS-SEFI-TARIF-AMB-01` — déterminer les tarifs ambulance applicables | M11 page Ameli ambulance ; articles/annexes ambulance de M01-M09, à indexer par intitulé avant ouverture ; B04 si nécessaire. | M12 ; M04 pour TUPH ; M06/M07 pour différenciation. | `TS-SEFI-FEL-PREST-01`, `TS-SEFI-FEL-TRAJET-01`; consolidation chronologique des clauses ambulance. | Tableau tarifaire ambulance daté avec conditions. | Même critère que VSL ; pages/articles exacts indexés avant ouverture ; les tarifs TUPH restent rattachés à leur lot et aucune métadonnée 2007 n'est prise pour actualité. |
| `TS-SEFI-TARIF-MAJ-01` — appliquer tarification socle/majorée SEFi | M05 Avenant 11, clauses SEFi/géoloc ; M06 ; M07 ; M09 ; M10-M11 sections socle/majorée ; Z05/Q03 pour prérequis de qualification. | Z01-Z08 ; preuve d'activation CPAM lorsqu'elle conditionne le cas. | `TS-SEFI-GEO-MODEL-01`, lots GE01-GE04 applicables, tarifs VSL/ambulance. | Conditions d'éligibilité et delta socle/majoré, datés. | La portée de chaque source est qualifiée ; SEFi 3.40 cité par anciens guides n'est pas automatiquement substitué à 3.50 ; activation locale et certification sont prouvées ou `INCONNU`. |

### 4.6 Pièces justificatives, SCOR et supervision

| LOT-ID / capacité | Sources principales et passages/éléments | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-PJ-BASE-01` — établir le socle SCOR applicable | C01 p.1 ; C02 p.6-7 et sections acteurs/cycles ; C03 références p.5 ; C04 p.1 ; C05 couverture/version. | C06 pour spécificité TS ; décision CNDA courante à obtenir. | `GATE-DOC-01`. | Matrice version/statut/acteur/cycle du socle SCOR utilisé par SEFi. | Versions 2.12/1.24/1.26/1.23-1.24 réconciliées ou en `CONFLIT` ; statut de C06 en 2026 explicitement `INCONNU` si non confirmé. |
| `TS-SEFI-PJ-CONTROL-01` — contrôler les PJ | S05 pp.9-11 ; S01 données/erreurs PJ ; parties Q13 relatives à la numérisation pp.6-16 ; C06 passages TS applicables. | P04/P05/P08 pour facture/ASF ; prescription/DAP papier selon PJ. | `TS-SEFI-PJ-BASE-01`, lots papier. | Règles de présence, nature, qualité et contrôle des PJ avant dossier. | Chaque type de PJ et chaque contrôle est sourcé ; modèle papier et règle SCOR sont distingués. |
| `TS-SEFI-PJ-LOT-01` — initialiser un dossier et constituer un lot | S05 pp.12-14 ; C03 sections dossier/lot ; Q13 pp.17-41. | S01 ; paramètres S07 si explicitement référencés. | `TS-SEFI-PJ-CONTROL-01`. | États, identifiants, regroupements et contraintes de lot. | Toute transition dossier/lot et limite/paramètre du périmètre est tracé ; aucune règle d'émission n'est anticipée. |
| `TS-SEFI-PJ-EMIS-01` — émettre un lot de PJ | S05 passages d'émission pp.15-19 ; C03 émission ; C07 messages WSDL/XSD SEH correspondants ; Q13 pp.42-47. | C08 exemples après contrat ; B07 si transport commun explicitement appelé. | `TS-SEFI-PJ-LOT-01`, `TS-SEFI-SEC-01`. | Flux d'émission, états, preuves, erreurs et paramètres. | Message, pièces, accusé immédiat et erreurs sont couverts ; exemples seulement après contrat ; aucun téléchargement de schéma. |
| `TS-SEFI-PJ-RETOUR-01` — analyser les retours PJ | S05 passages de retours pp.15-19 ; C03 tables de retours ; C07 messages concernés ; Q13 pp.48-79. | C08 exemples après contrat ; DICO erreurs. | `TS-SEFI-PJ-EMIS-01`. | Typologie des retours, transitions, reprises et traçabilité. | Chaque retour/ARL du périmètre est relié à un état/action ; erreurs non couvertes classées `INCONNU`. |
| `TS-SEFI-PJ-SUPERV-01` — superviser les délais de PJ | S08 p.5 ; références S08 p.4 ; règles C03/C05 strictement appelées. | Q04 si test de supervision ; FTE03 pour états source. | `TS-SEFI-PJ-LOT-01`, `TS-SEFI-PJ-RETOUR-01`. | Conditions de surveillance, délai, alerte et action attendue. | L'anomalie éditoriale FTE05/FTE06 est conservée ; chaque délai/action provient d'une source applicable. |

### 4.7 Géolocalisation

| LOT-ID / capacité | Sources principales et localisateurs | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-GEO-MODEL-01` — établir le modèle de trace géolocalisée | Z02 sections entités/annexes ; Z03 `/xs:schema`, import GPX et déclarations d'éléments ; Z04 GPX 1.1. | Z01 p.1-2 pour version ; S01/S04 champs FEL cités. | `GATE-SAFE-01`, statut Z02 `CONFLIT`. | Modèle des traces, lien FEL/trajet et graphe XSD local. | Tous les éléments/types/facettes atteignables sont parcourus hors ligne ; provenance GPX établie ou réservée ; aucune modification des originaux. |
| `TS-SEFI-GEO-GE01-01` — capacité GE01 | Z02 section GE01 et entités citées. | Z03 éléments correspondants ; tests Z07/Z08 rattachés à GE01. | `TS-SEFI-GEO-MODEL-01`. | Règles candidates et transitions propres à GE01. | Section GE01, données XSD et tests associés sont tous tracés ; le test ne devient pas source unique. |
| `TS-SEFI-GEO-GE02-01` — capacité GE02 | Z02 section GE02 et entités citées. | Z03 ; tests associés Z07/Z08. | `TS-SEFI-GEO-MODEL-01`, éventuellement GE01 si la SFG l'impose. | Règles candidates GE02. | Même critère vertical que GE01. |
| `TS-SEFI-GEO-GE03-01` — capacité GE03 | Z02 section GE03 et entités citées. | Z03 ; tests associés Z07/Z08. | `TS-SEFI-GEO-MODEL-01`, dépendances explicites précédentes. | Règles candidates GE03. | Même critère vertical que GE01. |
| `TS-SEFI-GEO-GE04-01` — capacité GE04 | Z02 section GE04 et entités citées. | Z03 ; tests associés Z07/Z08. | `TS-SEFI-GEO-MODEL-01`, dépendances explicites précédentes. | Règles candidates GE04. | Même critère vertical que GE01. |
| `TS-SEFI-GEO-QUAL-01` — établir obligations et périmètre de qualification géoloc | Z05 art.2-5 ; Z06 p.1-5 ; Z07 tests 1.01-3.04 ; Z08 lignes/cellules correspondantes. | Q03 art.3 p.5 ; B03 ; décision d'opposabilité géoloc à obtenir. | `TS-SEFI-GEO-MODEL-01`, `TS-SEFI-GEO-GE01-01` à `TS-SEFI-GEO-GE04-01`. | Matrice exigence source → test de qualification → preuve attendue. | Dépendance croisée SEFi/géoloc tracée ; conflit test 3.05 ouvert ; aucune règle métier créée par le seul test. |

### 4.8 Repli B2, transport, retours et papier

| LOT-ID / capacité | Sources principales et passages/éléments | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-B2-BASE-01` — fixer la baseline B2 de repli | S04 §2.3.5 pp.76-88, références p.4 ; B01 introduction/version ; B02 p.1 ; B03 p.1. | Package CNDA B2 TS manquant ; archives B10 seulement pour filiation. | `TS-SEFI-PERIM-01`. | Décision documentée sur versions B2/annexes applicables au repli SEFi. | Référence « 2007-AddendumB » réconciliée ou `CONFLIT` ; versions historiques non utilisées sans preuve. |
| `TS-SEFI-B2-T1-01` — produire l'enregistrement type 1 | Partie type 1 de B01 ; lignes S04 §2.3.5 qui projettent ces données. | S01 données B2 correspondantes. | `TS-SEFI-B2-BASE-01`, lots FEL propriétaires. | Mapping FEL → type 1, formats/positions/conditions. | Chaque zone type 1 et sa source FEL sont tracées ; position/format vérifiés sur norme applicable. |
| `TS-SEFI-B2-T2-01` — produire types 2/2S/2E | Parties correspondantes B01 ; projections S04. | B04/B05 lorsque code/droit concerné. | `TS-SEFI-B2-BASE-01`, lots FEL. | Mapping FEL → lignes de prestation. | Tous types et variantes du périmètre sont couverts ; exclusions explicites. |
| `TS-SEFI-B2-T4-01` — produire types 4/4T/4U | B01 types 4 ; B02 pp.2-3 ; B03 champs géoloc ; tableaux S04 pp.87-88. | Lot GEO ; B04 pour codes. | `TS-SEFI-B2-BASE-01`, `TS-SEFI-GEO-MODEL-01`. | Mapping transport/géoloc et dossier de conflit de positions. | Chevauchement S04/B01 exposé sans correction ; chaque zone et annexe applicable tracée. |
| `TS-SEFI-B2-CLOT-01` — produire types 5/6/999 | Parties types 5/6/999 de B01 ; projections S04. | B07/B08 pour transport/retours. | `TS-SEFI-B2-T1-01`, `TS-SEFI-B2-T2-01` et/ou `TS-SEFI-B2-T4-01` selon facture. | Règles de totalisation, lot et clôture B2. | Chaque total/identifiant/fin est relié aux enregistrements sources. |
| `TS-SEFI-B2-DROITS-01` — coder les justificatifs de droits | B05 ; champs/règles S04 et S01 qui consomment ces codes. | `TS-SEFI-RIGHTS-01`. | `TS-SEFI-B2-T2-01` ou `TS-SEFI-B2-T4-01` selon consommateur. | Mapping droit → code justificatif. | Chaque code utilisé est daté et relié à une situation de droit établie. |
| `TS-SEFI-B2-CODES-01` — utiliser les codes actes/prestations | B04 mars 2026 ; champs S04/S01 consommateurs. | Lots tarifaires et prestations. | `TS-SEFI-B2-T2-01` et/ou `TS-SEFI-B2-T4-01`. | Sous-ensemble de codes réellement utilisé par TS/SEFi. | Aucun code non consommé n'est importé ; version/date de l'annexe enregistrée. |
| `TS-SEFI-NOEMIE531-01` — traiter les retours courants | B06 sections référence 531 ; S02 p.17 renvoi NOEMIE ; B08 cinématiques TS applicables. | DICO erreurs/états. | B2 transport émis. | Modèle de retour 531, états et actions. | Tous segments/codes utiles sont tracés ; NOEMIE 580 reste hors baseline courante. |
| `TS-SEFI-NOEMIE900-01` — traiter les rejets techniques | B06 sections 900 ; B08 parties applicables. | B07 pour transport. | B2 transport émis. | Rejets, diagnostics et reprise. | Chaque rejet/action du périmètre est localisé ; 580 n'est pas fusionné. |
| `TS-SEFI-B2-TRANS-01` — transporter et chiffrer les flux | B07 chapitres applicables aux « autres PS » ; B09 tests de chiffrement. | T08/C09 pour certificats si appelés. | `TS-SEFI-B2-BASE-01`, `TS-SEFI-SEC-01`. | Enveloppe, transport, chiffrement et preuve de test. | Seules sections explicitement applicables aux TS sont couvertes ; version de transport fixée ; qualification B2 manquante visible. |
| `TS-SEFI-B2-RETOUR-01` — constituer le fichier logique et recevoir ARL/RSP | B08 sections applicables aux TS ; B06 531/900. | N01/N02 si routage organismes/centres nécessaire. | `TS-SEFI-B2-TRANS-01`. | Cinématique émission/ARL/RSP et identifiants de corrélation. | Applicabilité des passages FIDES/MCO séparée ; chaque flux TS prouvé. |
| `TS-SEFI-PAP-PRESC-01` — prescription/DAP papier | L06 S3138g/S3139h et notices ; règles papier de L01/L04. | S04/FTE02 branche PP ; SCOR pour envoi DAP. | `TS-SEFI-PRESC-DAP-01`. | Données et preuves du parcours papier. | Versions/formulaires datés ; règles de saisie et de PJ tracées ; notice en conflit documentée. |
| `TS-SEFI-PAP-FACT-01` — facture et ASF papier | P04/P05/P08 ; L12 ; passages Ameli P06. | C06/SCOR si numérisation ; transport partagé si refus. | Lots de repli concernés. | Modèles et conditions d'usage facture/ASF. | Références Cerfa contradictoires conservées ; doublons de diffusion non comptés comme sources indépendantes. |

### 4.9 Qualification, contrat et présérie

Les tests Q04-Q13 sont intégrés aux lots fonctionnels qu'ils vérifient. Les lots ci-dessous couvrent uniquement les obligations contractuelles ou le processus de qualification qui ne sont pas la règle fonctionnelle testée.

| LOT-ID / capacité | Sources principales et localisateurs | Compléments / renvois | Dépendances | Résultat attendu | Critères de couverture propres au lot |
|---|---|---|---|---|---|
| `TS-SEFI-CONTRAT-PREREQ-01` — satisfaire les prérequis contractuels | Q03 art.3 p.5 ; P01 ; Z05-Z06 ; conditions des qualifications dépendantes explicitement citées. | T05 WS_BS ; SCOR/B2 si mentionnés. | `GATE-BL-01`. | Matrice prérequis → qualification/autorisation/preuve. | Chaque prérequis a version, autorité et statut ; les dépendances séparées ne sont pas réputées couvertes par SEFi. |
| `TS-SEFI-CONTRAT-MATERIEL-01` — qualifier le matériel/environnement requis | Q03 art.4 p.6. | P01, T08 et environnement CNDA si cité. | `TS-SEFI-CONTRAT-PREREQ-01`. | Obligations matérielles et environnementales. | Tous les matériels/versions explicitement requis sont tracés ; aucune pile technique n'est choisie. |
| `TS-SEFI-CONTRAT-AUTOR-01` — obtenir l'autorisation | Q03 art.5 pp.6-9. | Q02 procédure ; artefacts de campagne. | `TS-SEFI-CONTRAT-PREREQ-01`, `TS-SEFI-CONTRAT-MATERIEL-01`. | États, acteurs, entrées/sorties du processus d'autorisation. | Toutes étapes et preuves sont localisées ; artefacts personnalisés `MISSING` ne sont pas inventés. |
| `TS-SEFI-CONTRAT-CYCLE-01` — maintenir et faire évoluer l'autorisation | Q03 art.6-8 pp.9-10. | Décisions CTLSAM ultérieures si applicables. | `TS-SEFI-CONTRAT-AUTOR-01`. | Cycle de vie de l'autorisation et événements de réévaluation. | Chaque transition/événement/délai est sourcé. |
| `TS-SEFI-CONTRAT-OBLIG-01` — obligations du titulaire | Q03 art.9 pp.11-12. | Lots fonctionnels référencés par l'obligation. | `TS-SEFI-CONTRAT-AUTOR-01`. | Registre des obligations contractuelles du titulaire. | Chaque obligation a sujet, objet, durée et preuve ; pas de mélange avec règle de facturation. |
| `TS-SEFI-CONTRAT-RESP-01` — responsabilités et garanties | Q03 art.10-12 pp.12-13. | Aucun sauf texte expressément cité. | `TS-SEFI-CONTRAT-AUTOR-01`. | Matrice responsabilité/garantie/limite. | Tous articles lus et localisés ; interprétation juridique externe signalée. |
| `TS-SEFI-CONTRAT-PI-CONF-01` — propriété intellectuelle et confidentialité | Q03 art.13-15 pp.13-15. | Politique de diffusion des documents `RESTREINTE`. | `TS-SEFI-CONTRAT-AUTOR-01`. | Obligations de PI/confidentialité applicables au corpus et au produit. | Distinction licence, secret, diffusion et données ; aucune publication de contenu restreint. |
| `TS-SEFI-CONTRAT-DATA-PREUVE-01` — données et preuve | Q03 art.16-18 pp.15-16. | Lots de traces/présérie si renvoi. | `TS-SEFI-CONTRAT-AUTOR-01`, `TS-SEFI-CONTRAT-OBLIG-01`. | Exigences contractuelles sur données, conservation et preuve. | Nature de donnée, responsable, durée et preuve explicitement sourcés ou `INCONNU`. |
| `TS-SEFI-CONTRAT-FIN-01` — durée et fin du contrat | Q03 art.19-21 pp.16-18. | Décision CTLSAM seulement si renvoi pertinent. | `TS-SEFI-CONTRAT-AUTOR-01`. | Conditions de durée, cessation et conséquences. | Chaque événement/effet est localisé ; ne pas extrapoler au droit commun. |
| `TS-SEFI-PRESERIE-01` — préparer, conduire et conclure la présérie | D05 p.1-7 ; D04 p.1-5 ; renvois Q10 pp.77-78 et Q12 p.23. | Q03 articles de processus ; artefacts de campagne lorsque fournis. | `TS-SEFI-CONTRAT-AUTOR-01`, `TS-SEFI-FT2-01`, `TS-SEFI-FT3-01` et lots PJ concernés. | Processus présérie, acteurs, échantillon, traces, critères de bilan et décision. | D04/D05 articulés sans conflit ; chaque trace a propriétaire/format/période ; artefacts absents classés `MISSING`; aucune présérie réelle déclarée sans décision. |

### 4.10 Lots référentiels conditionnels

Ces lots ne sont ouverts que lorsqu'un champ, une règle ou une interface consommatrice est identifié. Cette condition d'ouverture fait partie de leur contrat.

| LOT-ID / capacité | Source principale / éléments à examiner | Compléments / renvois | Dépendance et condition d'ouverture | Résultat attendu | Critères de couverture |
|---|---|---|---|---|---|
| `TS-REF-TOD-01` — codes organismes | N01, ZIP TOD 3.76 et membre `pdt-cdc-011.csv`. | Lot consommateur B2/SEFi. | Champ consommateur nommément identifié ; `GATE-SAFE-01`. | Sous-ensemble versionné des codes consommés. | Livraison/provenance vérifiées ; membre exact et colonnes utilisées localisés ; seules valeurs consommées extraites. |
| `TS-REF-CENTREP-01` — centres payeurs | N02, CSV distinct, en-tête et colonnes consommées. | Lot de routage B2/AMO ; comparaison N01 uniquement pour distinguer les livraisons. | Champ de routage précis identifié. | Référentiel centres payeurs avec provenance propre. | Différence avec le CSV du ZIP TOD expliquée ; autorité/version établies ou `INCONNU`; seules colonnes consommées couvertes. |
| `TS-REF-RPPS-01` — données RPPS | N03, jeux RPPS : schéma et champs requis par le consommateur. | Lots WS_PS ou évolution B2 correspondante. | Interface/champ RPPS explicitement consommateur. | Sous-ensemble de données et fréquence de mise à jour. | Provenance, schéma et date vérifiés ; aucune duplication du service AMO sans besoin. |
| `TS-REF-RPPS-FNPS-01` — correspondances RPPS/FNPS | N04, guide et table : colonnes de correspondance requises. | Lot spécialité/identité ; B12 si évolution B2 RPPS. | Règle de spécialité/identité explicitement consommatrice. | Mapping versionné. | Ancien guide et table 2026 réconciliés ; Avenant 48 non opposable sans ouverture CNDA. |
| `TS-REF-FINESS-01` — structures/activités FINESS+ | N05, flux, schémas et champs requis. | `TS-SEFI-PS3-01` ou autre lot consommateur établi. | Validation locale ou import démontré par une source applicable. | Mapping flux/schéma/champs consommés. | Compatibilité schéma-flux vérifiée sur sources primaires ; alertes d'audit reproduites ou rejetées. |
| `TS-REF-COG-01` — communes | N06, COG 2026 : fichier et colonnes requises. | Lots adresse, trajet ou tarif consommateurs. | Champ INSEE/adresse/tarif explicitement consommateur. | Sous-ensemble versionné des codes commune. | Date/provenance et règle de mise à jour établies ; seules valeurs utiles couvertes. |
| `TS-REF-NOS-01` — nomenclatures NOS | N07, ressource `CodeSystem` expressément nommée. | Lot qui porte l'URI/le code consommateur. | `CodeSystem` et champ consommateur explicitement référencés. | Ressources NOS réellement consommées. | Aucun import massif ; URI, version, valeurs et consommateur tracés. |
| `TS-REF-ANNUAIRE-01` — Annuaire Santé | N08, DSFT/API : opération et champs requis. | Lots PS/RPPS et source qui établit le besoin. | Besoin produit ou interface prouvé ; lot non ouvert pour simple disponibilité du produit. | Contrat/données utiles. | Version, accès, opération/champs et différence avec WS_PS/RPPS établis. |

## 5. Ordre d'analyse corrigé

L'ordre ci-dessous porte sur les capacités et leurs preuves verticales. Il remplace l'ordre documentaire de la carte v0.1. Un test CNDA ou un exemple n'est lu en détail qu'une fois, dans le lot fonctionnel qu'il vérifie ; il n'existe plus de seconde passe `QUAL-*` ou `EX-*` faisant doublon.

| Rang | Lots / capacités | Ordre de lecture interne | Justification de dépendance |
|---|---|---|---|
| 0 — portes | `GATE-BL-01`, `GATE-DOC-01`, `GATE-SAFE-01`, `GATE-TRACE-01` | Notices/décision/catalogue, puis enregistrement des réserves. | Rend l'extraction recevable ; ne produit aucune règle fonctionnelle. |
| 1 — frontière du canal | `TS-SEFI-PERIM-01` | D03 p.1-2 → S02 §2.1 p.7 → seuls renvois DICO autorisés. | Tous les autres lots doivent savoir si leur situation reste dans la FEL/SEFi ou est seulement routée hors périmètre. |
| 2 — socle de lecture | `TS-SEFI-ACT-01`, puis `TS-SEFI-SEC-01`; glossaire/données S01 lus à la demande. | PG/SFG → socle TLSi applicable → contrats de contexte. | Fixe acteurs, objets, états, accès et vocabulaire avant les opérations ; évite de relire tout le DICO. |
| 3 — services sources de données | `TS-SEFI-PS1-01`, `PS3-01`, `PS4-01`, `BS1-01`, `BS2-01`, `PL1-01`, `PEC1-01`. | SFG/guide → WSDL → XSD atteignables hors réseau → DICO → test CNDA rattaché → exemple en dernier. | Ces services alimentent l'acquisition et la FEL. Les sources juridiques ne sont ouvertes que si un concept PEC doit être interprété. |
| 4 — prescription et réalisation | `TS-SEFI-PL2-01`, `PL3-01`, `PRESC-DAP-01`, puis `FAC-ACQ-01`. | Processus fonctionnel et contrats PL → textes officiels applicables → orchestration d'acquisition. | Stabilise les données réalisées et leur provenance avant la constitution détaillée de la FEL. |
| 5 — structure FEL | `TS-SEFI-FEL-MODEL-01`, `FEL-PARTIES-01`, `FEL-PRESC-01`, `FEL-PREST-01`, `FEL-TRAJET-01`. | Modèle commun → groupes `RG_FTE` bornés → données/contrats propriétaires. | Partie structurelle de FTE02 lisible sans présumer encore les droits, contextes ou tarifs. |
| 6 — corpus externes propriétaires | `RIGHTS-01`, `SHARED-01`, `TPMR-01`, `TUPH-NAT-01`, lots tarifaires, `GEO-MODEL-01` et `GEO-GE01-04`; lots référentiels seulement lorsqu'un consommateur les ouvre. | Texte officiel/convention consolidée → consigne d'exploitation → point d'usage SEFi → qualification. | Les règles contextuelles et de valorisation FTE02/FT4 en dépendent ; les traiter ici évite une double interprétation. Les lots territoriaux restent conditionnels. |
| 7 — couverture et valorisation FEL | `FEL-COUV-01`, `FEL-ASSUR-01`, `VAL-BASE-01`, `VAL-AJUST-01`, `VAL-BR-01`, `VAL-FINAL-01`, puis `FT4-01`. | Source métier propriétaire → FTE02 → contrat FT4 → test Q09. | Les montants ne sont étudiés qu'après stabilisation des bases juridiques, conventionnelles, tarifaires et géoloc. |
| 8 — contrôle et cycle FEL | `FT2-01`, `FT3-01`, `REPRISE-FT3-01`, `FT1-01`. | Source de la règle contrôlée → opération/contrat → cas CNDA → exemple. | La recevabilité et la validation vérifient des données désormais établies ; la reprise dépend explicitement de FT3. |
| 9 — PJ, administration et qualification d'exploitation | `PJ-BASE-01`, `PJ-CONTROL-01`, `PJ-LOT-01`, `PJ-EMIS-01`, `PJ-RETOUR-01`, `PJ-SUPERV-01`, puis `ADM-01`, `MULTI-01`, contrats et `PRESERIE-01`. | Socle SCOR → cycle PJ → administration → obligations contractuelles/présérie. | Conserve SCOR comme dépendance séparée et ne confond pas résultat de test, règle fonctionnelle et obligation contractuelle. |
| 10 — replis et résilience | `B2-BASE-01`, lots B2/NOEMIE/transport, `PAP-*`, `DISPONIBILITE-01`. | Baseline B2 à résoudre → mapping/transport/retours → papier → déclencheurs d'indisponibilité. | Le repli détaillé vient après la frontière SEFi et les données FEL sources ; les éditions B2 manquantes peuvent bloquer la clôture, pas l'indexation. |

Les lots `TS-REF-*` et `TS-SEFI-TUPH-LOC-<territoire>` ne reçoivent pas de rang fixe : ils s'insèrent immédiatement avant le premier lot qui établit leur consommateur. Les lots contractuels peuvent être lus en parallèle des rangs 3 à 9, mais leurs obligations ne sont pas utilisées pour inventer une règle fonctionnelle absente des SFG ou des textes métier.

## 6. Premier lot sélectionné

**Premier lot d'extraction : `TS-SEFI-PERIM-01` — Périmètre courant d'élaboration d'une FEL SEFi TS et orientation hors SEFi.**

Il vient en premier parce qu'il fixe la frontière d'applicabilité dont dépendent les services, la constitution de la FEL, le contrôle, la validation et les replis, avec deux sources fonctionnelles principales courtes et sans exiger au préalable la consolidation des tarifs, du droit de la prise en charge, de SCOR, de la géolocalisation ou de B2. Les portes de préparation sont des prérequis de gouvernance et non un premier lot réglementaire.

**État initial du lot : `NOT_REVIEWED`.** D03 p.1-2 et S02 p.7 ont été inspectées pour borner et planifier le lot ; aucune assertion n'a encore été atomisée dans un registre de règles. Leur lecture de cadrage ne vaut donc pas couverture du lot.

## 7. Contrat d'extraction de `TS-SEFI-PERIM-01`

### 7.1 Objectif

Extraire uniquement les assertions atomiques qui déterminent le périmètre courant du système FTE/SEFi pour les transporteurs sanitaires, les restrictions communes aux services en ligne, les données et valeurs utilisées pour ces restrictions, leurs exceptions explicites, le statut temporel du périmètre et l'issue de routage hors SEFi indiquée par les sources.

Le lot ne doit pas conclure à l'admissibilité opérationnelle complète d'un logiciel ou d'une entreprise : cartes, autorisation CNDA, activation, disponibilité réelle par régime et situation contractuelle restent des dimensions séparées.

### 7.2 Périmètre inclus

- profession TS, canal SEFi/FTE, package GIE 3.50, qualification cible CNDA 03.50.00, date de référence 26/09/2026 ;
- restrictions générales du périmètre des services ;
- critères C1.3, C1.4, C2.1 et C2.2, avec toutes leurs lignes et notes ;
- données explicitement désignées comme supports de ces critères ;
- distinctions temporelles explicitement portées par le PG, notamment le courant et les étapes suivantes ;
- frontière de routage vers B2, sans contenu ni règle de constitution B2 ;
- renvois aval rencontrés, enregistrés sans extraction de leur contenu.

### 7.3 Périmètre explicitement exclu

- D03 p.3 : format des heures, double appel/reprise WS_FT3 et disponibilité ;
- S02 p.8 : « Disponibilité des services », « Forçage », tarification différenciée et développement TUPH ; S02 p.9 et suivantes hors contexte strictement nécessaire au bloc p.7 ;
- S02 §2.3 p.11, `RG_FTE099`, cartes, authentification, spécialité et conflit 55/56 ;
- FTE02 : élaboration, contrôle, validation et projection B2 ;
- détail B2, NOEMIE, papier et règles de repli ;
- PEL, PEC, TMR/TPMR, TUPH, transport partagé, tarifs, droits et participation ;
- disponibilité opérationnelle courante des TLSi par régime ;
- qualification CNDA et résultats attendus des tests, dont Q05 ;
- WSDL/XSD, exemples XML, SCOR/PJ, géolocalisation, administration et supervision ;
- tout choix d'architecture ou d'implémentation.

Un renvoi vers un élément exclu est consigné comme dépendance aval, sans être suivi pour produire une règle dans ce lot.

### 7.4 Sources principales

| ID | Chemin / titre | Autorité, version, statut, date | Passages inclus | Réserve |
|---|---|---|---|---|
| D03 | `30_TRANSPORTEURS_SANITAIRES/SEFi/PDT-INF-293v3.07 Périmètre SEFI-FTE Transporteur Sanitaire.pdf` | GIE SESAM-Vitale ; PDT-INF-293 v3.07 ; 02/09/2026 ; fiche de périmètre primaire. | p.1, blocs « Contexte » et « Périmètre pour les services » ; p.2, tableau complet C1.3, C1.4, C2.1, C2.2. | La numérotation commence à C1.3 : C1.1/C1.2 ne seront ni reconstitués ni supposés. P.3 exclue. |
| S02 | `30_TRANSPORTEURS_SANITAIRES/SEFi/Package SEFi TS 3.50/Package SEFi Transporteur Sanitaire 3.50/Spécifications Fonctionnelles et Guides d'intégration/FACT-SFG-030 PG-Présentation Générale du système FTE TS v05.48_avec_MR.pdf` | GIE SESAM-Vitale ; FACT-SFG-030 v05.48 ; 17/07/2026 ; spécification fonctionnelle primaire `RESTREINTE`. | §2.1 p.7, seul bloc « Périmètre du système FTE », y compris « Étape en cours » et « Étapes suivantes ». | Statut `CONFLIT` : couverture `REFERENCE`, corps §1.3 `EN COURS`. Les thèmes métier mentionnés p.7 sont routés vers leurs lots, non extraits ici. |

### 7.5 Sources de provenance/applicabilité et renvois autorisés

Ces sources ne produisent pas de règle fonctionnelle autonome dans ce lot :

- D01, PDT-INF-920 v2, pp.1-3 : provenance, composition et version du package ;
- Q01/Q02, catalogue CNDA 03.50.00, notamment Q02 p.8 : identité et composition du dossier de qualification ;
- décision CTLSAM du 04/09/2026, page officielle consultée le 26/09/2026 : opposabilité selon la situation contractuelle, copie locale `MISSING` ;
- S01/DICO v03.54 uniquement pour localiser et comprendre les données déjà citées par D03 : p.12 (`EF_FTE21`, `EF_FTE22`, `EF_FTE28`), pp.20-21 (`EF_FTE55`, `EF_FTE57`, `EF_FTE62`, `EF_FTE63`) et p.32 (`TB62-02`) si nécessaire.

Aucune règle de gestion découverte dans le DICO ne sera importée dans ce lot. Toute autre source requiert une modification explicite du contrat avant consultation normative.

### 7.6 Types de règles recherchées

- `PERIMETRE_INCLUSION` ;
- `PERIMETRE_EXCLUSION` ;
- `CONDITION_APPLICABILITE` ;
- `VALEUR_ADMISE` ;
- `EXCEPTION_DE_CRITERE` ;
- `ROUTAGE_HORS_SEFI` ;
- `REFERENCE_DE_DONNEE` ;
- `STATUT_TEMPOREL_PERIMETRE`.

Les calculs, tarifs, structures XML, cinématiques d'appel, erreurs, reprises, preuves/PJ, règles de qualification et choix de conception sont interdits dans ce lot.

### 7.7 Dépendances

**Prérequis bloquants à l'ouverture :**

- date de référence maintenue au 26/09/2026 ;
- tuple de baseline D01/D02 + D03 + Q01/Q02 + décision CTLSAM enregistré ;
- situation contractuelle de l'éditeur renseignée ou explicitement `INCONNU` ;
- conflit de statut S02 enregistré et reporté sur chaque candidat qui en dépend ;
- convention confirmée qu'aucun `RULE-ID` canonique ne sera attribué sur la seule base d'un statut documentaire non résolu.

**Dépendances non bloquantes pour la lecture, mais bloquantes pour une conclusion globale d'admissibilité :** accès/spécialité, activation et disponibilité des services, détail du repli B2, corpus TMR/TUPH/transport partagé, et tests CNDA des frontières.

### 7.8 Résultats attendus

- registre de candidats atomiques, sans `RULE-ID` canonique prématuré ;
- matrice `critère → donnée → valeur/condition → exception → issue indiquée` ;
- matrice `source → candidat → contrôle de périmètre/routage` ;
- registre des renvois aval, conflits, réserves et `INCONNU` ;
- couverture mise à jour au niveau page, bloc et ligne/note de tableau ;
- déclaration explicite que le résultat n'est ni une matrice d'admissibilité opérationnelle complète, ni une spécification B2.

### 7.9 Conditions de fin du lot

Le lot pourra passer de `NOT_REVIEWED` à `REVIEWED` pour son périmètre seulement si :

1. chaque paragraphe inclus de D03 p.1 et S02 §2.1 p.7 est extrait ou explicitement routé vers un lot aval ;
2. chaque ligne et chaque note de C1.3, C1.4, C2.1 et C2.2 de D03 p.2 est comptabilisée ;
3. chaque candidat porte qualification, autorité, référence, version, statut, date, page/bloc, applicabilité TS/SEFi et réserve ;
4. chaque donnée citée possède une correspondance DICO vérifiée ou un statut `INCONNU` ;
5. « Étape en cours » et « Étapes suivantes » ne sont jamais fusionnées ;
6. aucun sens absent n'est déduit des numéros C1.1/C1.2 ;
7. toute divergence D03/S02 est classée `CONFLIT` sans préséance inventée ;
8. B2 reste une frontière de routage, sans aucune règle B2 extraite ;
9. les trois blocs de D03 p.3 et les autres exclusions ont un lot propriétaire ou un renvoi aval explicite, sans duplication ;
10. le conflit de statut de S02 reste visible et empêche toute promotion canonique injustifiée ;
11. le registre de couverture est mis à jour selon les passages réellement lus et les sources de renvoi réellement consultées ;
12. aucune architecture, implémentation ou règle provenant d'un domaine exclu n'est introduite.

## 8. Point d'arrêt

Le cadrage corrigé est prêt pour l'ouverture de `TS-SEFI-PERIM-01`. Aucune règle de ce lot n'a été extraite dans cette mission ; l'étape suivante devra exécuter ce seul contrat sans étendre son périmètre.
