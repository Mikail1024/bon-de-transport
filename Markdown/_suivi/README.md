# Suivi des conversions PDF vers Markdown

## Méthode

- Sources originales conservées. Écriture uniquement sous Markdown/.
- Ordre : chemins sources triés alphabétiquement.
- LlamaParse Agentic Plus : 45 crédits/page ; cost optimizer désactivé.
- Transcription intégrale sans résumé ; tableaux HTML, révisions, liens, petits caractères et images conservés.
- Chaque document conserve son nom et son arborescence, extension .md.
- Images dans un dossier portant le nom du document suivi de _images ; liens locaux adaptés.
- Un statut completed signifie téléchargement complet avec images résolues, pas certification manuelle de chaque caractère.

## Reprise

Lire inventaire.json et les fichiers session-*.json. Ne pas reconvertir un document completed. Pour submitted/downloaded, reprendre le résultat existant depuis son job_id avant de relancer. Vérifier le solde et le coût du document suivant avant toute conversion.

## Session du 2 octobre 2026

Agentic Plus, 205 pages, 9 225 crédits consommés, 775 crédits restants (solde vérifié dans Brave).

| Source | Pages | Statut | Crédits |
|---|---:|---|---:|
| 10_SOCLE_COMMUN_TS_TX/B2/Evolutions/Avenant 48 RPPS - provisoire/PDT-CDC-112_Avenant_48_RPPS_v01.42_2026-03-18_PROVISOIRE.pdf | 24 | completed | 1080 |
| 10_SOCLE_COMMUN_TS_TX/B2/Evolutions/Avenant 48 RPPS - provisoire/PDT-INF-926v2_Diffusion_Avenant_48_RPPS_2026-04-28.pdf | 3 | completed | 135 |
| 10_SOCLE_COMMUN_TS_TX/B2/Normes communes/2007-06-cdc-errata-norme-b2.pdf | 178 | completed | 8010 |

## Prochain document

10_SOCLE_COMMUN_TS_TX/B2/Normes communes/2016-06-cdc-ps-norme-noemie.pdf

137 pages ; 6 165 crédits nécessaires à 45 crédits/page. Arrêt avant conversion, solde insuffisant.

## Contrôles

- Empreintes SHA-256 des 190 PDF sources inchangées.
- 3 Markdown complets téléchargés depuis Brave.
- 529 images récupérées au total ; toutes les références locales des Markdown sont résolues.
- Tableaux HTML et marques de révision conservés. Aucun nettoyage ni résumé appliqué.
- La fidélité caractère par caractère n’a pas été auditée manuellement.
- Reprendre les paramètres de session-2026-10-02.json ; le premier document utilisait OCR fr/en, les suivants le défaut en.
- Downloads contient encore les exports bruts et les archives téléchargées.
