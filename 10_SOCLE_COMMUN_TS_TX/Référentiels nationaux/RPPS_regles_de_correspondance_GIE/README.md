# Construction du référentiel PS/RPPS — documents GIE

Documents récupérés le 26 septembre 2026 depuis l'espace industriel officiel du GIE SESAM-Vitale. Ils ont été lus intégralement ; les 9 pages du guide et les 82 lignes du classeur ont été contrôlées. Le classeur a également été rendu visuellement sur 8 pages.

## Guide FACT-GU-001

- Référence : `FACT-GU-001`, version `1.22`, date du 5 avril 2016.
- Fichier : `FACT-GU-001_v1.22_Guide_referentiel_PS_2016-04-05.pdf`.
- SHA-256 : `aadf184e0f4eccbfe8e32aaa69f1f34a861956eae5bac6d6b1b1922bc6afadca`.
- Usage : construire le référentiel PS à partir de l'extraction RPPS et de la table de correspondance des spécialités ; diffuser régulièrement les mises à jour et pouvoir afficher leur date.

Le guide est ancien dans sa terminologie (`ASIP Santé`), mais il a été rediffusé avec l'Avenant 48 en 2026. Les flux ANS actuels et leur contrat local v3.1 priment pour le format d'entrée ; la logique de correspondance FNPS reste fournie par le GIE.

## Table de correspondance mars 2026

- Fichier : `TableCorrespondance_SpeAM_SavoirFaire_RPPS_2026-03.xlsx`.
- Version publiée : `2026-03`.
- SHA-256 : `a5bee9fc11cb53d06b6e8b9231296b398f77a74e041fd35a6dba8da3fa761e3b`.
- Structure contrôlée : une feuille visible, 82 lignes, 7 colonnes, aucune formule ni feuille cachée.
- Usage : convertir le couple `Code profession RPPS` / `Code savoir-faire RPPS` en `code spécialité FNPS` attendu dans la facturation.

La table comporte des lignes sans code savoir-faire. Elles ne forment toutefois pas toujours un repli univoque :

- le code profession RPPS `10` apparaît sans savoir-faire pour les spécialités FNPS `1`, `81`, `82`, `83`, `84` et `85` ;
- le code profession RPPS `60` apparaît sans savoir-faire pour les spécialités FNPS `24` et `86`.

Le moteur doit appliquer en priorité une correspondance exacte `profession + savoir-faire`, conserver la version de table utilisée avec la facture et **ne jamais choisir silencieusement** entre plusieurs lignes de profession seule. Une correspondance non déterministe doit être mise en quarantaine et soumise à clarification GIE.

## Gouvernance

- importer le classeur comme donnée versionnée, jamais comme code en dur ;
- valider l'unicité et les priorités de correspondance avant activation ;
- bloquer ou mettre en quarantaine tout repli profession seule non univoque ;
- mettre à jour l'extraction RPPS quotidiennement ;
- vérifier le portail GIE à chaque notification de changement de la table ;
- activer les nouvelles données atomiquement et conserver le snapshot précédent en cas d'échec.
