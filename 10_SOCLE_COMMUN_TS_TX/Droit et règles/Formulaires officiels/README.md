# Formulaires officiels de prescription des transports

Vérification effectuée le 26 septembre 2026 à partir des pages publiques Ameli et Service-Public. Les deux PDF ont été lus intégralement et leurs quatre pages ont été contrôlées visuellement.

## S3138g - Prescription médicale de transport

- Cerfa : `11574*07`
- Notice incluse dans le même PDF : `50742#07` (pages 1 et 2)
- Volets : volet 1 contrôle médical et volet 2 remboursement (pages 3 et 4)
- Source Ameli : https://www.ameli.fr/sites/default/files/formulaires/S3138-formulaire-prescription-medicale-transport.pd_.pdf
- Page métier Ameli : https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/prescription-prise-charge/prescription-medicale-transport
- Fiche Service-Public : https://www.service-public.gouv.fr/particuliers/vosdroits/R15649
- Modification interne du PDF Ameli : 12 février 2026
- SHA-256 : `3c39537f07606307632ab3e356e686a6036ae2f9ea60f9dce67b14a15a73b85b`

## S3139h - Demande d'accord préalable valant prescription médicale

- Cerfa : `11575*08`
- Notice incluse dans le même PDF : `50743#08` (page 1)
- Volets : volet 1 médical, volet 2 administratif et volet 3 remboursement (pages 2 à 4)
- Source Ameli : https://www.ameli.fr/sites/default/files/formulaires/S3139-DAP-prescription-medicale-transport.pdf
- Page métier Ameli : https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/prescription-prise-charge/demande-accord-prealable
- Fiche Service-Public : https://www.service-public.gouv.fr/particuliers/vosdroits/R62614
- Modification interne du PDF Ameli : 12 février 2026
- SHA-256 : `cb71e9b845d1ffcb2ac642745567b7b9160848ec12834c915c67a3143cf8eaad`

## Statut et précautions

- Ces deux références sont actives et nécessaires pour modéliser le parcours papier/de secours d'un logiciel B2 de transport sanitaire. La prescription électronique (SPE) est une alternative, elle ne rend pas le S3138 papier obsolète pour tous les parcours.
- Les fichiers publics portent le filigrane `SPECIMEN`. Service-Public précise que le formulaire original remis par le professionnel de santé doit être utilisé pour la démarche : ne pas éditer automatiquement le spécimen comme s'il constituait l'original opposable.
- Les anciennes versions `11574*04`, `11574*06` et antérieures à `11575*08` sont historiques et ne doivent pas constituer la référence active.
- La fiche Service-Public du S3138 indique encore une notice `50742#06`, alors que le PDF Ameli daté du 12 février 2026 contient la notice `50742#07`. Les PDF directs de Service-Public sont datés du 30 septembre 2025 et diffèrent des PDF Ameli du 12 février 2026 ; les présents fichiers Ameli sont donc retenus.
- Le S3140 concerne le remboursement par l'assuré d'un véhicule personnel ou des transports en commun. Il n'est pas un formulaire de facturation B2 d'un VSL ou d'une ambulance et n'a pas été ajouté à ce dossier.
