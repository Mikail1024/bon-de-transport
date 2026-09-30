# Évolutions transversales du CDC SESAM-Vitale applicables au périmètre B2 TS

Vérification effectuée le 26 septembre 2026 dans le navigateur intégré Codex, à partir du catalogue public GIE, de l'espace industriel GIE et du site CNDA. Aucune demande ni aucun dossier externe n'a été modifié.

## Avenant 48 — EV144 — Renseignement des RPPS dans les factures

- Spécification : `PDT-CDC-112`, version `01.42`, datée du 18 mars 2026, 24 pages.
- Fiche de diffusion : `PDT-INF-926v2`, datée du 28 avril 2026, 3 pages.
- Socle de référence : CDC SESAM-Vitale 1.40, Addendum 8-2025 ; palier minimum annoncé : Addendum 7.
- Source publique : <https://www.sesam-vitale.fr/documents/d/sesam-vitale/pdt-cdc-112_avenant-48_renseignement-rpps_v01-42_cdc>
- Décision CVH : <https://cnda.ameli.fr/editeurs/decisions-cvh/decision-cvh-du-27-03-2026-avenant-48-renseignement-identifiant-rpps/>
- SHA-256 de la spécification : `6cf8df42865457b332ae16d95bdbd8a82cf0aad934dbcf930293644eda2efe0e`.
- SHA-256 de la fiche : `b078c20ae1f4fb2b5303cbd07347e46ffec410d944df5c7cc490cbee60b43cb1`.

Les deux PDF ont été lus intégralement et toutes leurs pages ont été contrôlées visuellement.

### Portée à retenir

L'avenant annonce les « PS concernés : Tous » et les matrices du CDC présentent le profil `TR`. Il rend obligatoires les RPPS prévus dans la facture, notamment pour le prescripteur, le remplaçant et certains exécutants, et modifie les groupes A1-A0 `1151`, `1211`, `1213`, `1214` et `1870`, ainsi que le type `4S`.

La mise à jour CNDA du 27 avril 2026 retire temporairement les fournisseurs 60/61/62 ; elle ne cite pas les transporteurs parmi les exclusions. Le document reste donc conservé dans le socle commun B2 TS, sans en faire une règle tarifaire propre aux transports.

### Statut et opposabilité

Le PDF porte les mentions `PROVISOIRE` et `RESTREINTE`. La fiche précise que l'obligation ne commence que trois mois après l'ouverture de l'agrément/homologation, elle-même matérialisée par la publication des cas de tests CNDA. Aucun package/cahier de tests Avenant 48 n'a été identifié dans le catalogue CNDA consulté au 26 septembre 2026.

En conséquence :

- anticiper et tester l'évolution sous drapeau de fonctionnalité ;
- ne pas la déclarer encore opposable en production sans la date d'ouverture CNDA ;
- conserver l'original sans correction locale ;
- surveiller la publication du package de tests et calculer alors la date d'opposabilité à `publication + 3 mois`.

