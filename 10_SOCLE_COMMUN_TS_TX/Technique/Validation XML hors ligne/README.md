# Validation XML hors ligne

Ce catalogue empêche les outils XML de récupérer silencieusement des schémas OASIS ou W3C sur Internet. Il pointe vers des copies figées déjà livrées dans le corpus local.

## Utilisation

Avec libxml2 (`xmllint`, `xmlcatalog`) :

```sh
CORPUS_ROOT="/chemin/vers/Bon de transport"
export XML_CATALOG_FILES="$CORPUS_ROOT/10_SOCLE_COMMUN_TS_TX/Technique/Validation XML hors ligne/catalog.xml"
xmllint --catalogs --noout fichier.xml
```

Les chemins du catalogue sont relatifs à ce dossier et restent donc valides si les dossiers `10_SOCLE_COMMUN_TS_TX`, `20_TAXI` et `30_TRANSPORTEURS_SANITAIRES` sont déplacés ensemble.

## Règles de maintenance

- ne jamais résoudre les imports par le seul nom de fichier : plusieurs `ws-addr.xsd` et `xml.xsd` du corpus ont des contenus différents ;
- ajouter une entrée par URL ou espace de noms attendu et conserver l'empreinte SHA-256 de la copie choisie ;
- ne remplacer une copie que lors d'un changement explicite de baseline ;
- ce catalogue est un outil de build, pas un document officiel GIE/CNDA.

Le présent catalogue couvre les trois URL distantes actuellement rencontrées dans les WSDL/XSD SEFi TS 3.50 et Taxi DRAFT. Les imports relatifs internes continuent d'être résolus depuis le package qui contient chaque schéma.
