# Extractions RPPS — provenance et contrôle

Jeu officiel : [Annuaire Santé — extractions des données en libre accès des professionnels intervenant dans le système de santé](https://www.data.gouv.fr/datasets/annuaire-sante-extractions-des-donnees-en-libre-acces-des-professionnels-intervenant-dans-le-systeme-de-sante-rpps/), publié par l'Agence du Numérique en Santé.

La page source indiquait une fréquence quotidienne et une mise à jour des trois ressources le 19 septembre 2026. Les fichiers ont été récupérés le 25 septembre 2026 puis lus et contrôlés intégralement.

| Fichier local | Ressource officielle stable | Taille | Lignes de données | Colonnes constantes | SHA-256 local |
|---|---|---:|---:|---:|---|
| `ps-libreacces-personne-activite.txt` | <https://www.data.gouv.fr/api/1/datasets/r/fffda7e9-0ea2-4c35-bba0-4496f3af935d> | 820 762 944 octets | 2 292 725 | 56 | `174a1cba10c4ad5b078cd00df675adf2c13f5ae9f7d43d313d9c3b9c41da6fc4` |
| `ps-libreacces-dipl-autexerc.txt` | <https://www.data.gouv.fr/api/1/datasets/r/41ae70ac-90c8-4c4e-8644-4ef1b100f045> | 277 411 482 octets | 2 241 520 | 13 | `b2a5e217a68383b9f9da108f0137cb4e01e040d8c6c7d4b9257c9e9fc5685f20` |
| `ps-libreacces-savoirfaire.txt` | <https://www.data.gouv.fr/api/1/datasets/r/fb55f15f-bd61-4402-b551-51ef387f2fab> | 52 059 819 octets | 433 940 | 13 | `1e0295a174f0376bb2ff0bfdd48955b298a62416241142c9c108f272c046550b` |

Contrôles réalisés : encodage UTF-8 valide, présence de l'en-tête, nombre de champs constant sur chaque ligne, aucun champ structurel manquant et terminaison correcte de chaque fichier.

## Politique d'import recommandée

- mise à jour quotidienne, ou au minimum avant chaque livraison réglementaire ;
- téléchargement dans une zone temporaire puis contrôle de l'encodage, de l'en-tête, du nombre de colonnes et du hash avant bascule ;
- conservation de la dernière version validée et de sa date d'effet ;
- refus de remplacer la version active si le nouveau fichier est incomplet ou structurellement invalide ;
- ne pas utiliser le RPPS comme substitut à FINESS, au TOD ou aux centres payeurs : les périmètres sont distincts.
