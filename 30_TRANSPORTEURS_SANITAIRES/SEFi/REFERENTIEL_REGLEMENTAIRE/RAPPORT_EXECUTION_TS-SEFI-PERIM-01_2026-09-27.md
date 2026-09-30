# Rapport d’exécution — `TS-SEFI-PERIM-01`

**Date d’exécution :** 27 septembre 2026  
**Date de référence :** 26 septembre 2026  
**Profession / canal :** Transporteur sanitaire / SEFi-FTE  
**Baseline :** package GIE SESAM-Vitale 3.50 / qualification CNDA 03.50.00 / PDT-INF-293 v3.07  
**Statut final du lot :** `REVIEWED`

`REVIEWED` atteste uniquement que le contrat canonique du lot a été lu, extrait ou routé selon ses douze conditions de fin. Il ne vaut ni promotion en `RULE-ID`, ni matrice d’admissibilité opérationnelle complète, ni spécification B2, ni architecture fonctionnelle.

## 1. Résultat quantitatif

- 37 candidats atomiques : 23 issus de D03 et 14 issus de S02.
- Qualifications : 33 `ETABLI`, 2 `DEDUIT`, 1 `CONFLIT`, 1 `INCONNU`.
- 2 conflits matériels ouverts.
- 8 questions ouvertes.
- 20 renvois aval : 19 vers un lot canonique identifié et 1 cible non assignée pour le format des heures de D03 p.3.
- Aucun identifiant de règle canonique attribué.

| Type | Nombre |
|---|---:|
| `PERIMETRE_INCLUSION` | 7 |
| `PERIMETRE_EXCLUSION` | 3 |
| `CONDITION_APPLICABILITE` | 4 |
| `VALEUR_ADMISE` | 16 |
| `EXCEPTION_DE_CRITERE` | 2 |
| `ROUTAGE_HORS_SEFI` | 1 |
| `REFERENCE_DE_DONNEE` | 0 |
| `STATUT_TEMPOREL_PERIMETRE` | 4 |

## 2. Passages effectivement couverts

### Sources principales

- D03, PDT-INF-293 v3.07 du 02/09/2026 : p.1, blocs « Contexte » et « Périmètre pour les services »; p.2, totalité des intitulés, notes, lignes et cellules de C1.3, C1.4, C2.1 et C2.2. Les marques de révision de C1.4 ont été vérifiées visuellement.
- S02, FACT-SFG-030 v05.48 du 17/07/2026, `RESTREINTE` : §2.1 p.7, seul bloc « Périmètre du système FTE », avec séparation stricte entre « Étape en cours » et « Étapes suivantes ». Les suppressions et ajouts ont été vérifiés visuellement.

### Renvois autorisés

- S01/DICO v03.54 : p.12, p.20, p.21 et TB62-02 p.32, uniquement pour l’identité ou le sens des données citées par D03.
- D01/PDT-INF-920 v2 : pp.1-3, provenance et composition du package.
- Q01 : inventaire du ZIP officiel de qualification et de ses 11 PDF, comptés comme une livraison logique unique avec l’extraction.
- Q02/SEL-GCONFORM-FTE Package CNDA v3.50.00 : p.1 et p.8, identité du catalogue et liste des dix guides.
- Décision CTLSAM du 04/09/2026 : page officielle consultée le 27/09/2026 pour l’applicabilité temporelle; copie locale toujours `MISSING`.

D03 p.3 et S02 p.8 et suivantes restent `NOT_APPLICABLE` au lot. Ils n’ont produit aucune règle candidate; leurs sujets ont seulement été routés.

## 3. Matrice `critère → donnée → condition → exception → issue`

| Critère | Donnée ou portée | Condition/valeur candidate | Exception/réserve | Issue indiquée |
|---|---|---|---|---|
| Général | Tous services appelables | critères D03 applicables; listes de valeurs annoncées exhaustives pour les critères actifs | C1.4 demeure non résolu | écart sur au moins un critère actif → frontière B2 |
| C1.3 | champ du critère | exclusion courante du transfrontalier | critère limité aux assurés hors catégories explicitement écartées par la note | échec → frontière B2 |
| C1.3 | `FEL/EF_FTE63_10` | deux premiers caractères différents de `99` | correspondance DICO confirmée p.21 | échec → frontière B2 |
| C1.3 | `FEL/EF_FTE63_20` | deux premiers caractères différents de `99` | correspondance DICO `INCONNU` dans les pages autorisées | échec → frontière B2 |
| C1.4 | intitulé et `FEL/EF_FTE62_02` | ancienne exclusion/condition apparente barrée, non promue | `ABG` absente de TB62-02; légende de révision absente | `CONFLIT`, aucun routage actif déduit |
| C1.4 | note non barrée | garde annoncée comme remplacée par TUPH; TUPH dans le périmètre SEFi | date d’effet exacte absente; règles TUPH hors lot | renvoi `TS-SEFI-TUPH-NAT-01` |
| C2.1 | `BS/EF_FTE22_01`, `PEC/EF_FTE28_01`, `FEL/EF_FTE57_04[AMO]` | régimes `01, 02, 04, 05, 06, 07, 08, 10, 90, 99` | sens de `[AMO]` `INCONNU` | échec → frontière B2 |
| C2.1 | `PEC/EF_FTE28_02`, `FEL/EF_FTE57_05[AMO]` | toutes caisses pour les régimes listés hors 99; `609` ou `939` pour 99 | sens de `[AMO]` `INCONNU` | échec → frontière B2 |
| C2.1 | `PEC/EF_FTE28_03`, `FEL/EF_FTE57_06[AMO]` | tous centres | sens de `[AMO]` `INCONNU` | reste dans la matrice C2.1 |
| C2.2 | champ du critère | bénéficiaire migrant hors périmètre courant | S02 le classe séparément dans les étapes suivantes, sans date | échec → frontière B2 |
| C2.2 | `BS/EF_FTE21_01`, `FEL/EF_FTE55_01` | premier caractère différent de `5` et de `6` | divergence de libellé pour EF_FTE55_01 | échec → frontière B2 |

## 4. Matrice `source → candidats → contrôle de périmètre/routage`

| Source et localisateur | Candidats | Fonction dans ce lot |
|---|---|---|
| D03 p.1 | D03-001 à D03-004 | temporalité générale, applicabilité commune, exhaustivité et frontière B2 |
| D03 p.2 C1.3 | D03-005 à D03-008 | exclusion transfrontalière, exception de champ et deux données de trajet |
| D03 p.2 C1.4 | D03-009 à D03-012 | fragments barrés conservés comme `INCONNU`/`CONFLIT`; remplacement et inclusion TUPH |
| D03 p.2 C2.1 | D03-013 à D03-020 | bénéficiaires, régimes, caisses et centres |
| D03 p.2 C2.2 | D03-021 à D03-023 | exclusion courante des migrants et contrôles NIR |
| S02 §2.1 p.7, étape en cours | S02-001 à S02-012 | partenaires, bénéficiaires, types de transport, risques et modes de remboursement |
| S02 §2.1 p.7, étapes suivantes | S02-013 et S02-014 | extensions futures, maintenues séparées du courant |

Les notes DAP/SCOR et TMR ont été lues mais seulement routées. Les fragments CMU-C/ACS et la puce future « garde ambulancière », tous barrés, n’ont produit aucun candidat actif.

## 5. Renvois aval

Les lots destinataires enregistrés sont : `TS-SEFI-DISPONIBILITE-01`, `TS-SEFI-ADM-01`, `TS-SEFI-B2-BASE-01`, `TS-SEFI-FEL-TRAJET-01`, `TS-SEFI-RIGHTS-01`, `TS-SEFI-TUPH-NAT-01`, `TS-SEFI-FEL-PREST-01`, `TS-SEFI-BS1-01`, `TS-SEFI-PEC1-01`, `TS-SEFI-FEL-COUV-01`, `TS-SEFI-FEL-PARTIES-01`, `TS-SEFI-FEL-ASSUR-01`, `TS-SEFI-ACT-01`, `TS-SEFI-PRESC-DAP-01`, `TS-SEFI-PJ-BASE-01`, `TS-SEFI-PJ-EMIS-01`, `TS-SEFI-SHARED-01`, `TS-SEFI-TPMR-01` et `TS-SEFI-REPRISE-FT3-01`.

Le bloc D03 p.3 « format des heures » possède un renvoi explicite à cible non assignée et une question ouverte; son contenu n’a pas été analysé.

## 6. Conflits et `INCONNU`

1. `CONFLICT-TS-SEFI-PERIM-01-001` — S02 porte `REFERENCE` en couverture et `EN COURS` en §1.3. Les 14 candidats S02 restent traçables, mais non promouvables sur cette seule source.
2. `CONFLICT-TS-SEFI-PERIM-01-002` — C1.4 et la frontière garde/TUPH comportent des marques de révision non légendées; la condition apparente `EF_FTE62_02 ≠ ABG` est barrée et `ABG` est absente de TB62-02. Le texte révisé de S02 et la note D03 convergent vers l’inclusion TUPH; ils ne suffisent pas à établir le traitement actif exact de la garde.

Les principaux `INCONNU` concernent la situation contractuelle de l’éditeur au 26/09/2026, le statut/date d’effet exacts de D03, l’acceptation des marques de révision, la correspondance DICO de `EF_FTE63_20`, l’équivalence des libellés de `EF_FTE55_01`, le sens de `[AMO]`, les extensions futures et le propriétaire du bloc « format des heures ».

## 7. Justification du statut final

Les douze conditions de fin du contrat sont satisfaites et documentées dans `lots.json`. Les conflits et questions sont non résolus, mais ne laissent aucun passage inclus non comptabilisé. Ils bloquent les promotions canoniques concernées et toute conclusion globale d’admissibilité, pas la clôture de la lecture de ce lot.

## 8. Registres produits

- `lots.json` — état du lot, critères de fin et renvois aval;
- `regles_candidates.json` — 37 assertions candidates, sans `RULE-ID`;
- `couverture.json` — couverture au niveau page/bloc/ligne/note;
- `conflits.json` — deux conflits ouverts;
- `questions_ouvertes.json` — huit questions ouvertes.

