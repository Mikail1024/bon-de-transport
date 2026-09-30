# Rapport de migration des registres — schéma 2.0

**Lot concerné :** `TS-SEFI-PERIM-01`  
**Migration :** `MIG-TS-SEFI-REGISTRIES-2.0-2026-09-27`  
**Date :** 27 septembre 2026

## Périmètre de la migration

La migration porte uniquement sur le modèle de données des cinq registres persistants. Aucun document source n’a été relu, aucun passage n’a été réextrait et aucun contenu normatif de candidat n’a été modifié.

Les identifiants sont intégralement conservés : 37 candidats, 2 conflits, 8 questions et 20 renvois aval au niveau du lot.

## Couverture multidimensionnelle

L’ancien `review_status` surchargé a été remplacé par quatre dimensions indépendantes :

| Dimension | Répartition après migration |
|---|---|
| `review_status` | 47 `REVIEWED`, 2 `PARTIALLY_REVIEWED`, 6 `NOT_REVIEWED` |
| `lot_scope` | 47 `IN_SCOPE`, 7 `ROUTED`, 1 `OUT_OF_SCOPE` |
| `availability` | 53 `PRESENT`, 1 `UNKNOWN`, 1 `MISSING` |
| `applicability` | 6 `APPLICABLE`, 2 `NOT_APPLICABLE`, 47 `UNKNOWN` |

Corrections principales :

- les cinq anciens `NOT_APPLICABLE` signifiant seulement une exclusion du lot sont désormais `ROUTED` ou `OUT_OF_SCOPE`, sans déclarer la baseline non applicable ;
- les notes DAP/SCOR, TMR et garde barrée déjà lues mais propriétaires d’autres lots sont également `ROUTED` ;
- `COV-S01-EF63-20` devient `PARTIALLY_REVIEWED / IN_SCOPE / UNKNOWN / UNKNOWN`, car l’information peut exister hors des pages autorisées ;
- `COV-CTLSAM-LOCAL` reste le seul véritable cas `availability=MISSING` ;
- les deux éléments explicitement placés dans les « Étapes suivantes » de S02 sont les seuls `applicability=NOT_APPLICABLE` à la date de coupure.

Chaque entrée conserve son ancien état dans `legacy_state`, en complément de l’historique de migration racine.

## Preuve et promotion canonique

Les qualifications probatoires restent inchangées : 33 `ETABLI`, 2 `DEDUIT`, 1 `CONFLIT` et 1 `INCONNU`.

Chaque candidat porte désormais `promotion_eligibility` et `promotion_blockers`. La migration n’a rendu aucun candidat automatiquement éligible :

- 0 `ELIGIBLE_FOR_CONSOLIDATION` ;
- 0 `PENDING` ;
- 37 `BLOCKED`.

Ces blocages proviennent exclusivement des questions et conflits déjà enregistrés, notamment le statut/date d’effet de D03, l’applicabilité temporelle selon la situation contractuelle de l’éditeur, le conflit de statut de S02 et le conflit C1.4. La valeur `ETABLI` n’a donc aucun effet automatique sur l’éligibilité canonique.

## Regroupement et classe sémantique

Les 37 candidats restent séparés et reçoivent 14 `group_key` stables. Les groupes D03 comprennent notamment `D03:C1.3`, `D03:C1.4`, `D03:C2.1` et `D03:C2.2`.

Répartition des classes :

- 19 `BUSINESS_SCOPE` ;
- 13 `DATA_CONSTRAINT` ;
- 4 `TEMPORAL_SCOPE` ;
- 1 `ROUTING` ;
- 0 `INTERFACE_CONSTRAINT` et 0 `OTHER`.

Le `rule_type` existant est conservé sans modification.

## Vérifications d’intégrité

- 37 identifiants candidats exacts et uniques : D03-001 à D03-023 et S02-001 à S02-014 ;
- aucun candidat ajouté, supprimé, fusionné ou renommé ;
- 2 conflits et 8 questions toujours ouverts et reliés au lot ;
- 20 renvois aval préservés : 19 lots identifiés et une cible non assignée pour le format des heures ;
- 56 relations candidat-vers-lot aval, vers 15 cibles distinctes, préservées ;
- tous les candidats restent reliés à la couverture et aucune référence croisée n’est orpheline ;
- aucun `MISSING` ne représente une simple exclusion de lot ;
- aucun `NOT_APPLICABLE` ne représente une simple exclusion de lot ;
- aucun `RULE-ID` canonique n’a été créé.

Le lot conserve `review_status=REVIEWED`, tandis que son `applicability` globale reste `UNKNOWN`. Aucun lot suivant n’a été ouvert.

