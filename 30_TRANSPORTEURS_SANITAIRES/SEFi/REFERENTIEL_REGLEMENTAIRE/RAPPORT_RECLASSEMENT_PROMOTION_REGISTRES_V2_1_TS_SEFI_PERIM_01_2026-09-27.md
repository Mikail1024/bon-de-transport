# Rapport de reclassement de la promotion — schéma 2.1

## Périmètre de la migration

- Lot concerné : `TS-SEFI-PERIM-01`.
- Migration : schéma `2.0` vers `2.1`.
- Opération limitée aux registres persistants : aucune source documentaire relue, aucun candidat réextrait, aucun contenu normatif modifié et aucun `RULE-ID` créé.
- L’ancien état de promotion 2.0 est conservé sous `legacy_promotion_state_v2_0`; il est historique et n’est plus l’état actif.

## Reclassement actif

| État | Nombre | Justification synthétique |
|---|---:|---|
| `ELIGIBLE_FOR_CONSOLIDATION` | 0 | Aucun candidat n’est rendu éligible mécaniquement : les candidats au sens explicite conservent au moins une confirmation documentaire ou de date en attente. |
| `PENDING` | 34 | Le comportement est compréhensible; les réserves portent sur le statut/date de D03, le statut interne de S02 ou, pour `S02-004`, la confirmation d’une marque de révision dont le sens d’inclusion TUPH est corroboré par D03. |
| `BLOCKED` | 3 | Une indétermination touche le comportement lui-même. |

Les trois candidats `BLOCKED` sont :

- `CAND-TS-SEFI-PERIM-01-D03-009` : activité de l’exclusion C1.4 indéterminable ;
- `CAND-TS-SEFI-PERIM-01-D03-010` : condition ABG et activité de la ligne indéterminables ;
- `CAND-TS-SEFI-PERIM-01-S02-011` : activité de l’ajout C2S indéterminable sans acceptation des marques de révision.

Tous les autres candidats sont `PENDING`, dont `CAND-TS-SEFI-PERIM-01-S02-004`. Le conflit C1.4 reste lié à ce dernier comme contexte, mais ne rend pas indéterminable l’inclusion TUPH déjà corroborée dans le registre.

## Séparation des applicabilités

Chaque candidat porte désormais :

- `normative_applicability` : profession, canal, baseline, version source, période d’effet connue ou inconnue et conditions d’opposabilité ;
- `product_applicability` : état `CONDITIONAL`, produit et éditeur non renseignés, date de référence `2026-09-26`, condition contractuelle renvoyant à `QUESTION-TS-SEFI-PERIM-01-001`.

La situation contractuelle de l’éditeur n’apparaît plus dans les blockers actifs de promotion et son `effect_on_consolidation` vaut `NONE`. La même séparation est portée au niveau du lot. Dans le registre de couverture, `coverage[].applicability` est explicitement défini comme une applicabilité documentaire à la baseline, jamais comme une applicabilité produit.

## Conflits et questions

- `CONFLICT-TS-SEFI-PERIM-01-001` reste `OPEN`, mais son effet de promotion devient `PENDING` : il concerne le statut documentaire de S02.
- `CONFLICT-TS-SEFI-PERIM-01-002` reste `OPEN` et `BLOCKED` pour `D03-009` et `D03-010`; `D03-011`, `D03-012` et `S02-004` restent tracés comme contexte.
- `QUESTION-TS-SEFI-PERIM-01-002` porte un effet explicite par candidat : `BLOCKED`, `PENDING` ou `CONTEXT_ONLY`.
- Les huit questions ouvertes sont conservées. `QUESTION-TS-SEFI-PERIM-01-001` agit uniquement sur l’applicabilité produit; `QUESTION-TS-SEFI-PERIM-01-003` produit un état `PENDING`.

## Vérifications d’intégrité

- 37 candidats et 37 identifiants inchangés.
- Qualifications inchangées : 33 `ETABLI`, 2 `DEDUIT`, 1 `CONFLIT`, 1 `INCONNU`.
- Projection du contenu normatif des 37 candidats identique avant/après migration.
- 2 conflits et 8 questions conservés avec leurs identifiants et contenus de preuve.
- Conflit C1.4 toujours visible et non résolu.
- Renvois aval préservés : 56 occurrences dans les candidats et 20 entrées au niveau du lot, dont la cible non assignée déjà existante.
- 55 entrées de couverture conservées à l’identique.
- Aucun `RULE-ID` ni identifiant commençant par `RULE-` créé; tous les indicateurs d’attribution canonique restent à `false`.

## Registres modifiés

- `lots.json`
- `regles_candidates.json`
- `couverture.json`
- `conflits.json`
- `questions_ouvertes.json`

Aucun lot suivant n’a été lancé.
