# Transport urgent pré-hospitalier (TUPH) — relevé de la page Ameli

Source officielle consultée intégralement le 26 septembre 2026 :
<https://www.ameli.fr/transporteur-sanitaire/exercice-professionnel/vie-entreprise/tuph-modalites-et-demarches>

Date affichée par la page : 30 janvier 2025.

## Portée

L'avenant 10 à la convention nationale, applicable depuis le 8 mars 2021, a créé le TUPH en remplacement de la garde ambulancière. Les rémunérations conventionnelles s'appliquent lorsque les transports respectent à la fois :

- la réglementation nationale ;
- le cahier des charges départemental défini par l'ARS ;
- l'instruction interministérielle DGOS/R2/DSS/DGSCGC/2022/144 du 13 mai 2022, publiée au Bulletin officiel Santé 2022/12 du 31 mai 2022.

L'instruction est publiée dans le bulletin officiel complet :
<https://sante.gouv.fr/fichiers/bo/2022/2022.12.sante.pdf>

Le bulletin complet n'est pas dupliqué dans le corpus local : il rassemble de nombreux textes sans rapport avec le projet. La pièce applicable à l'entreprise reste en outre le cahier des charges de son département.

## Transports concernés

Les TUPH sont les interventions et transports réalisés en ambulance à la demande du SAMU-centre 15. Ce sont des transports primaires effectués en vue de l'admission d'un patient dans un établissement de santé.

Ne relèvent pas du dispositif :

- les transports urgents prescrits par un médecin libéral ;
- les transports entre deux établissements de santé, que le patient soit hospitalisé ou non.

Pour un transfert inter-établissements, l'établissement prescripteur appelle directement l'entreprise de transport ; il ne sollicite pas le SAMU et n'immobilise pas l'ambulance de garde.

## Rémunération nationale affichée

- forfait de 150 euros par trajet, incluant les 20 premiers kilomètres ;
- 2,32 euros par kilomètre à compter du 21e kilomètre ;
- sortie blanche : 80 euros ;
- revenu minimal garanti : 64 euros par heure, complété lorsque l'activité et les sorties blanches n'atteignent pas ce niveau.

Le calcul du revenu complémentaire prend en compte le nombre d'heures par moyen de garde, l'activité, les sorties blanches et les interventions demandées par le SAMU mais non exécutées du fait du transporteur inscrit au tableau de garde.

Depuis le 7 novembre 2023, l'avenant 11 porte la minoration pour une intervention non exécutée de 123 à 150 euros.

## Gouvernance logicielle

Le moteur ne doit pas traiter le TUPH comme un tarif B2 ordinaire isolé. Il faut versionner au minimum :

- l'avenant conventionnel applicable ;
- le cahier des charges ARS du département ;
- le secteur et le tableau de garde ;
- la demande du SAMU-centre 15 ;
- les heures et moyens mis à disposition ;
- les interventions, sorties blanches et non-exécutions ;
- la période de calcul du revenu minimal garanti.

Le cahier des charges départemental et ses éventuels arrêtés modificatifs doivent être obtenus pour chaque territoire effectivement déployé. Ils ne peuvent pas être remplacés par un exemple pris dans un autre département.

## Anomalie éditoriale repérée

La page Ameli indique que l'avenant 11, signé le 13 avril 2023, aurait été publié au Journal officiel le « 6 mars 2023 ». La copie officielle locale et la chronologie établissent une publication au 6 mai 2023. Le logiciel ne doit pas reprendre la date incohérente de mars.
