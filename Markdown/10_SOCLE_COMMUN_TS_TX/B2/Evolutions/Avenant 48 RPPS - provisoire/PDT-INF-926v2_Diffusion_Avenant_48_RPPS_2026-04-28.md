logo: sesam-vitale

# <u>Fiche d’information.</u>

**Référence** **PDT-INF-926v2** **Date** **28/04/2026**
**Objet** **Diffusion de l’Avenant 48 - EV144 - Renseignement des RPPS dans les factures**

<table>
    <tr>
      <td><u>Type</u></td>
      <td>[ ] Technique</td>
      <td>[ ] Pratique</td>
      <td>[ ] Communication</td>
      <td>[x] Livraison</td>
    </tr>
    <tr>
      <td><u>Destinataires</u></td>
      <td>[x] Éditeurs</td>
      <td>[ ] Équipementiers</td>
      <td>[ ] OCT</td>
      <td>[ ] DNS (ex-CIS)</td>
    </tr>
    <tr>
      <td><u>Produits</u></td>
      <td>Facturation<br />[x] CDC Éditeurs<br />[ ] CDC OCT<br />[ ] FSV agrément<br />[ ] FSV exploitation<br />[ ] SCOR<br /><br />Services AMC<br />[ ] ROC</td>
      <td>Référentiels<br />[x] Dispositif Intégré<br />[ ] Terminal lecteur<br />[ ] TLA<br />[ ] Lecture Vitale<br />[ ] Télémise à jour</td>
      <td>Produits d’infrastructure<br />[ ] ATSAM<br />[ ] SrvSVCNAM<br />[ ] GALSS<br /><br />Services en Ligne<br />[ ] CDR<br />[ ] amelipro</td>
      <td>Téléservices intégrés<br />[ ] AATi<br />[ ] ADRi<br />[ ] ALDi<br />[ ] DMTi<br />[ ] HRi<br />[ ] IMTi<br />[ ] PEC +<br />[ ] PEM 2D<br />[ ] SEFi<br /><br />Acquisition des droits<br />[ ] API de Lecture Vitale</td>
    </tr>
    <tr>
      <td><u>Secteur</u></td>
      <td>[x] Libéral</td>
      <td>[ ] Hospitalier</td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><u>Professionnels de Santé concernés</u></td>
      <td>[x] Médecins<br />[x] Sages-femmes<br />[x] Chirurgiens-dentistes<br />[x] Pharmaciens<br />[x] Laboratoires</td>
      <td>[x] Auxiliaires médicaux<br />[x] Centres de Santé<br />[x] Fournisseurs<br />[ ] Transporteurs</td>
      <td>[ ] Établissements publics<br />[ ] Cliniques privées<br />[ ] ESPIC</td>
      <td></td>
    </tr>
    <tr>
      <td>Prise en compte</td>
      <td>[ ] Facultative</td>
      <td>[x] Obligatoire</td>
      <td>[ ] Pour information</td>
      <td></td>
    </tr>
</table>

## Contexte

L’objectif de cette évolution est, pour l’assurance maladie, de disposer, dans les flux de facturation SESAM-Vitale, de chaque identifiant RPPS prévu (RPPS du prescripteur, de l’exécutant, du remplaçant, …).

A ce jour, le renseignement des différents n° RPPS d’un flux de facturation est, pour la plupart, facultatif.

<u>La première diffusion de cet avenant s’adresse à tous les Professionnels de Santé sans prendre en compte le fait que certaines spécialités de fournisseurs ne disposent pas d’un numéro RPPS (spécialités 60 -61 -62). Il s’agit d’un cas particulier qui sera pris en compte dans une seconde version de cet avenant 48. En attendant, cet avenant en l’état **ne s’adresse plus aux fournisseurs.**</u>

## Évolutions

Le présent avenant fait donc évoluer les modalités de renseignement des RPPS pour les rendre obligatoires dans la facture.

➔ Cet avenant est un complément à l’avenant 33 qui rendait obligatoire le renseignement des RPPS des salariés en Centres de Santé.

*PDT-INF-926v2*
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**www.sesam-vitale.fr**
**1 / 3**

logo: sesam-vitale

# <u>Fiche d’information.</u>

---

### **Contenu**

Cette livraison contient l’avenant 48 : EV144 – Renseignement des RPPS dans les factures
Document « PDT-CDC-112_Avenant 48_Renseignement RPPS_v01.42»
Le présent avenant au CDC-Editeurs permet la mise en œuvre des besoins suivants :

*   Identification des salariés de structures de type Centres de Santé
*   Identification des PS dans le cadre de la Télésanté
*   Identification du RPPS du prescripteur
*   Extension des règles de l’avenant 11 à tous les PS hors CD
*   Identification du RPPS de l’exécutant libéral
*   Identification du RPPS de l’exécutant salarié et bénévole
*   Identification du RPPS du remplaçant

Cette livraison contient par ailleurs les documents liés à l’avenant 11 :

*   Le guide d’élaboration du référentiel PS «FACT_GU_001_01.22_ElaborationDuReferentielPS.pdf »
*   TableCorrespondance-SpeAM-SavoirFaireASIP
    *   Table de correspondance entre la spécialité d'un professionnel de santé enregistrée par l'Assurance Maladie et celle présente dans le référentiel RPPS de l'ASIP santé

---

### **Modalités d’agrément et d’homologation**

#### ***Opposabilité***

La prise en compte obligatoire de cet avenant par les éditeurs est applicable 3 mois après la date d’ouverture de l’agrément et de l’homologation de l’avenant (= date de publication des cas de tests par le CNDA).

A compter de cette date, il sera opposable à l’ensemble des éditeurs demandant un nouvel agrément addendum 8, ou une homologation sur la dernière version de référentiel DI :

*   Soit à l’occasion d’un primo-agrément ou une primo-homologation SESAM-Vitale ;
*   Soit à l’occasion de la migration depuis un addendum antérieur ou une version de DI antérieure.

Cet avenant n’est pas opposable :

*   En cas de changement de socle technique de référence pour un logiciel déjà agréé addendum 8 ;

Le palier minimum pour prendre en compte cet avenant est l’addendum 7
Cet avenant fait l’objet d’un agrément ou d’une homologation en fonction du produit.

---

### ***Procédure d’homologation***

➔ Pour les produits homologués conformément à la dernière version de référentiel DI :
Homologation pour prendre en compte la maintenance du produit.

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
*PDT-INF-926v2* **www.sesam-vitale.fr** *2 / 3*

logo: sesam-vitale

# <u>Fiche d’information.</u>

---

➔ Pour les produits homologués conformément à une version antérieure : Conformité logicielle pour les solutions dont l’homologation est arrivée à échéance.

➔ Homologation pour les solutions dont l’homologation est encore valide (avec maintien de la date de fin d’homologation initiale).

L’ouverture de l’agrément et de l’homologation est fixée à la date de parution des cahiers de tests correspondants sur le site web du CNDA.

## **Prérequis**

*   Avenant 33 – Centres de santé RPPS - RPPS Exécutant salarié
*   Avenant 11 - Référentiel PS pour le suivi des Prescriptions Hospitalières Exécutées en Ville (SPHEV) :
    *   Cet avenant 11 a été intégré à cet avenant 48,
    *   Les fonctionnalités de cet avenant 11 sont étendues à tous les PS sauf Chirurgiens-Dentistes,
    *   Et ces fonctionnalités deviennent obligatoires en étant intégrées à ce nouvel avenant 48

## **Support du GIE**

Le support relatif à cette information s’effectue via le [portail Iris](https://portail-support.sesam-vitale.fr/gsvextranet/#/signin)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**www.sesam-vitale.fr**

*PDT-INF-926v2*

*3 / 3*