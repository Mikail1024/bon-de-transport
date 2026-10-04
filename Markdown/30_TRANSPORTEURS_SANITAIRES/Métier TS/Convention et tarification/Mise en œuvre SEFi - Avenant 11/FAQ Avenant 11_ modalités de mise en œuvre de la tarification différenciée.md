*Avenant n°11 – Présentation des nouvelles modalités de mise en œuvre de la tarification différenciée – GT du 27/11/23*

logo: sesam-vitale



# 1 **OBJET DU DOCUMENT**

Ce compte-rendu a pour objet de répondre aux questions posées lors du GT « Avenant n°11 – Présentation des nouvelles modalités de mise en œuvre de la tarification différenciée » du 27 novembre 2023.

# 2 **QUESTIONS**

**Question 1**

Quels éléments sont attendus pour compléter les items « version SEFi et version Dispositif de Géolocalisation » présents dans l’attestation sur l’honneur des éditeurs ?

***Réponse Cnam***

Tous les transporteurs sanitaires n’utilisent pas les mêmes versions de logiciel.

Il est donc demandé aux éditeurs d’indiquer le numéro de version utilisée par son client – les éléments transmis correspondront aux numéros de version tels que ceux indiqués sur le site du CNDA.

**Question 2**

Quelle valeur indiquée pour la donnée de géolocalisation « distance GPS» lorsque le dispositif de géolocalisation n’aura pas fonctionné ?

***Réponse Cnam***

Il convient d’indiquer une valeur à 1.

**Question 3**

Les éditeurs disposent des numéros IMEI des boîtiers GPS fournis à leurs clients pour installation dans leurs véhicules mais n’ont aucune visibilité sur la correspondance pouvant exister entre le numéro d’immatriculation d’un véhicule et le numéro IMEI d’un boîtier GPS. Il est donc difficile pour un éditeur d’engager sa responsabilité, dans une attestation sur l’honneur, sur une information dont ils n’ont pas la possibilité de vérifier la fiabilité ?

***Réponse Cnam***

Ce point va être évoqué avec les fédérations de transporteurs sanitaires.

**Question 4**

De quel type de GPS s’agit-il (portable – fixé dans le véhicule) ?

***Réponse Cnam***

L’article 2.1 de l’annexe 1 de l’avenant n°11 dispose que : « Le couple véhicule-GPS doit être identifié de manière sûre et pérenne: le matériel support du GPS doit être fixé au véhicule et toute intervention doit être tracée. »

*GIE SESAM-Vitale* 
 icon: C•• 1 / 6

Les spécifications fonctionnelles générales « GE - Constituer et transmettre les traces de géolocalisation » (FACT-SFG-039 Facturation Transporteurs – Constituer et transmettre les traces de géolocalisation_1.03) apportent les précisions suivantes sur le boîtier GPS : « Boitier associé au véhicule de transport enregistrant les positions GPS de géolocalisation pendant le transport du bénéficiaire de soins. Il est installé dans le véhicule et le N° de boîtier (IMEI) est référencé dans l’entreprise par le LPS en association avec le véhicule. Il fait partie du système de géolocalisation. »

---

## **Question 5**

Les facturations d'actes de télésurveillance sont réalisées en mode SESAM-Sans Vitale et non en mode Dégradé. La transmission de PJ via SCOR est-elle concernée par ce mode de sécurisation ?

En cas de changement de GPS dans le véhicule, les éditeurs devront en informer la Cnam ?

### ***Réponse Cnam***

En séance, la Cnam a indiqué que ce point serait expertisé.

Après recherches, l’article 2.1 de l’annexe 1 de l’avenant n°11 dispose que : « Le couple véhicule-GPS doit être identifié de manière sûre et pérenne : le matériel support du GPS doit être fixé au véhicule et toute intervention doit être tracée. »

Ainsi, en cas de demande formulée par la caisse de rattachement, le transporteur sanitaire doit être capable de produire un document recensant l’ensemble des interventions réalisées sur le boîtier GPS.

---

## **Question 6**

Le type de flux (SEFi ou B2) n’est pas un élément déclenchant un type de tarification – ainsi la tarification majorée peut-elle être facturée en B2 ?

### ***Réponse Cnam***

La norme B2 ne peut être utilisée que pour des factures établies avec la tarification socle.

Sous réserve du respect des conditions d’éligibilité par le transporteur sanitaire, seul le télé-service SEFi permet d’établir des factures avec la tarification majorée.

La société SCR émet une alerte sur cette nouvelle modalité de tarification qui implique de modifier le moteur de calcul. Une telle évolution présente un risque important de survenue de difficultés diverses.

A noter que le logiciel du professionnel de santé comprend à la fois la norme de facturation B2 et le télé-service SEFi. Il est erroné d’indiquer que le transporteur a la possibilité à partir de son LPS d’utiliser la tarification majorée.

Cette tarification majorée n’est possible uniquement pour les flux SEFi.

Des précisions ont été apportées sur le slide 11 support de présentation du GT du 27 novembre 2023.

---

## **Question 7**

Pour les cas non facturables en SEFi tels que les trajets réalisés par les assurés de la MGEN – la tarification majorée est-elle applicable ?

### ***Réponse CNAM***

Oui mais au stade de la facturation, la facture adressée à la CPAM sera établie avec la tarification socle.

*GIE SESAM-Vitale* 
 icon: icon *2 / 6*

A partir des données dont disposent l’Assurance maladie des régularisations annuelles seront réalisées ultérieurement.

Pour rappel, à l’heure actuelle, les cas exclus de la facturation SEFi sont :

*   les trajets soumis à demande d’accord préalable (transport en série – supérieur à 150km – d’un enfant ou d’un adolescent vers un CAMSP ou dans un CMPP)
*   les transports transfrontaliers
*   les gardes ambulancières
*   les TUPH
*   les bénéficiaires migrants
*   les factures des assurés de la MGEN - de la CRPCEN – de l’Assemblée Nationale et du Sénat

Les transports soumis à DAP présentant une part importante des trajets réalisés par les transporteurs sanitaires, ils seront facturables en SEFi à compter du 15 février 2024.

---

## **Question 8**

Cette évolution permettant la facturation des transports soumis à DAP et notamment les trajets de + de 150 km seront-ils intégrés au cahier de tests du CNDA ?

### ***Réponse Cnam***

Oui ils seront intégrés.

---

## **Question 9**

La certification du CNDA devra-t-elle être sollicitée impérativement avant le 15 février 2024 ?

### ***Réponse Cnam***

En principe, la certification du CNDA devra être sollicitée avant le 15 février 2024.
Le sujet est actuellement en discussion.

---

## **Question 10**

La date de mise en place de la tarification majorée dans SEFi est le 15 février 2024 ? Comment seront gérés les cas des transporteurs qui solliciteront le paramétrage du flux SEFi en tarification majorée à une date ultérieure ?

### ***Réponse Cnam***

La date de mise en place de tarification majorée dans SEFi est le 15 février 2024.

A compter de cette date, tous les transporteurs respectant les conditions d’éligibilité pourront solliciter le paramétrage de SEFi en tarification majorée.

Pour se faire, ils devront adresser à leur CPAM de rattachement, l’attestation sur l’honneur rédigée par leur éditeur et l’attestation sur l’honneur rédigée par leur soin.

Après vérification, la CPAM délivrera au transport un accord autorisant le paramétrage de SEFi en tarification majorée.

Si cet accord intervient postérieurement à la date du 15 février 2024 (ex : le 20 mai 2024) alors la tarification majorée ne pourra s’appliquer qu’aux transports réalisés à compter du 20 mai 2024. Les transports réalisés antérieurement ne pourront être facturés qu’avec des tarifs socles.

*GIE SESAM-Vitale* 
 icon: icon 3 / 6

## **Question 11**

A partir de quelle date les transporteurs vont pouvoir solliciter leurs éditeurs pour obtenir une attestation sur l’honneur ?

### ***Réponse Cnam***

Le télé-service permettant de déclarer le respect des conditions d’éligibilité à la tarification majorée ouvre le 4 décembre.

A compter de cette date, les transporteurs sanitaires commenceront à solliciter leurs éditeurs pour obtenir une attestation sur l’honneur à partir du modèle diffusé par l’Assurance maladie aux transporteurs.

Le paiement de la rémunération compensatrice est prévue début janvier.

---

## **Question 12**

Quelle consigne transmettre aux transporteurs sanitaires en cas d’indisponibilité de SEFi ?

### ***Réponse Cnam***

Pour les transporteurs dont le logiciel SEFi est paramétré avec la tarification majorée, l’indisponibilité de SEFi conduira à un report de facturation dans l’attente du rétablissement du service.

---

## **Question 13**

Quels sont les termes de l’avenant n°11 en matière de facturation des transports partagés ?

### ***Réponse Cnam***

Les conditions relatives à l’application des taux d’abattement préférentiels pour le transport partagé évoluent.

L’article 4.1 de l’avenant n°11 dispose que : « Pour les entreprises dont l’ensemble des véhicules sont équipés d’un système de géolocalisation certifié par l’Assurance maladie tel que défini dans l’annexe 1 et facturant avec le télé-service « SEFi » tel que défini dans l’annexe 2, les taux d’abattement sont les suivants :

*   15 % pour deux patients présents dans le même véhicule, quel que soit le parcours réalisé en commun ;
*   33 % pour trois patients présents dans le même véhicule, au cours du transport, quel que soit le parcours réalisé en commun.

Les autres niveaux d’abattement appliqués par l’Assurance maladie aux entreprises ne sont pas modifiés. L’abattement s’applique à la totalité de la facture comprenant le forfait départemental ou minimum de perception et le tarif kilométrique départemental, majorés le cas échéant, en cas de transport de nuit, de transport le dimanche ou un jour férié. »

Ainsi, depuis le 7 novembre 2023, la condition pour pouvoir bénéficier des taux d’abattement préférentiels n’est plus la signature de l’option conventionnelle prévue dans l’avenant n°7 mais les mêmes conditions permettant aux transporteurs de bénéficier de la tarification majorée.

---

## **Question 14**

Quelles sont les modalités de calcul de la rémunération compensatrice ?

*GIE SESAM-Vitale* 
 icon: icon *4 / 6*

***Réponse Cnam***

Les modalités de calcul définies par les partenaires conventionnels n’impactent pas les éditeurs.

Le calcul sera réalisé à partir des éléments disponibles dans les bases de données de l’Assurance maladie et consistera à établir le delta par facture entre la tarification socle et la tarification majorée.

---

**Question 15**

Comment l’entreprise est-elle identifiée ?

***Réponse Cnam***

Dans les bases de l’Assurance maladie une entreprise de transport sanitaire est identifiée avec un n° AM.

Cet élément doit figurer dans les attestations sur l’honneur rédigées par les éditeurs.

---

**Question 16**

Quel est le montant facturable pour les km réalisés dans le cadre des TUPH ?

***Réponse Cnam***

Pour les TUPH le prix applicable est 2,32 km

Pour les transports programmés le prix applicable est 2,44km.

---

**Question 17**

Est-il prévu que les transports exclus de la facturation SEFi fassent l’objet d’une régularisation et si oui quelles seront les modalités de régularisation annuelle ?

***Réponse Cnam***

La rémunération compensatrice annuelle sur la base des trajets concernés et facturés.

Pour rappel les cas exclus sont :

Pour rappel, à l’heure actuelle, les cas exclus de la facturation SEFi sont :

*   les trajets soumis à demande d’accord préalable (transport en série – supérieur à 150km – d’un enfant ou d’un adolescent vers un CAMSP ou dans un CMPP)
*   les transports transfrontaliers
*   les gardes ambulancières
*   les TUPH
*   les bénéficiaires migrants
*   les factures des assurés de la MGEN - de la CRPCEN – de l’Assemblée Nationale et du Sénat

Les transports soumis à DAP présentant une part importante des trajets réalisés par les transporteurs sanitaires, ils seront facturables en SEFi à compter du 15 février 2024.

*GIE SESAM-Vitale* 
 icon: icon *5 / 6*

## **Question 18**

Dans l’avenant n°11, les suppléments aéroports, SAMU, … ne sont pas mentionnés. Cette absente signifie-t-elle que ces suppléments ne sont plus facturables ? existe-t-il des cas dans lesquels le supplément SAMU est encore facturable ?

### ***Réponse Cnam***

Le supplément aéroport est toujours facturable et le supplément SAMU a été supprimé dans le cadre de la réforme TUPH (avenant 10).

*GIE SESAM-Vitale* icon: icon *6 / 6*