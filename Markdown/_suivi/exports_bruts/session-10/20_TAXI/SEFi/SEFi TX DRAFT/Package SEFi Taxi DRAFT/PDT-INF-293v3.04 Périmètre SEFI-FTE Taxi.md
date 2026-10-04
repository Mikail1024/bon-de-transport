# Fiche d’information

<table>
    <tr>
      <td><strong>Référence</strong></td>
      <td><strong>N° 293 TX v3.04</strong></td>
      <td><strong>Date</strong></td>
      <td><strong>09/07/2026</strong></td>
    </tr>
    <tr>
      <td><strong><b>Objet</b></strong></td>
      <td colspan="3"><strong><b>SEFI-FTE : Périmètre d’élaboration d’une FEL : restriction par</b><br /><b>rapport aux SFG Taxi</b></strong></td>
    </tr>
</table>

<table>
    <tr>
      <td><strong><b>Type</b></strong></td>
      <td>[ ] Technique</td>
      <td>[x] Pratique</td>
      <td>[ ] Communication</td>
      <td>[ ] Livraison</td>
    </tr>
    <tr>
      <td><strong><b>Destinataires</b></strong></td>
      <td>[x] Éditeurs</td>
      <td>[x] Équipementiers</td>
      <td>[ ] OCT</td>
      <td>[ ] CIS</td>
    </tr>
    <tr>
      <td><strong>Produits</strong></td>
      <td>Facturation :<br />[ ] CDC Editeurs<br />[ ] CDC OCT<br />[ ] FSV agrément<br />[ ] FSV exploitation<br />[ ] SCOR</td>
      <td>Référentiels :<br />[ ] Dispositif Intégré<br />[ ] Terminal lecteur<br />[ ] TLA<br />[ ] Lecture Vitale<br />[ ] Télémise à jour</td>
      <td>Produits d’infrastructure :<br />[ ] ATSAM<br />[ ] SrvSVC NAM<br />[ ] GALSS<br /><br />Services en Ligne :<br />[ ] CDR<br />[ ] Espace pro</td>
      <td>Téléservices intégrés :<br />[ ] HRi<br />[ ] DMTi<br />[ ] AATi<br />[x] SEFi-FTE<br /><br />Acquisition des droits :<br />[ ] API de Lecture</td>
    </tr>
    <tr>
      <td><strong><b>Secteur</b></strong></td>
      <td colspan="2">[x] Libéral</td>
      <td colspan="2">[ ] Hospitalier</td>
    </tr>
    <tr>
      <td rowspan="5"><strong><b>Professionnels</b><br />de Santé<br /><b>concernés</b></strong></td>
      <td>[ ] Médecins</td>
      <td>[ ] Auxiliaires médicaux</td>
      <td colspan="2">[ ] Établissements publics</td>
    </tr>
    <tr>
      <td>[ ] Sages-femmes</td>
      <td>[ ] Centres de Santé</td>
      <td colspan="2">[ ] Cliniques privées</td>
    </tr>
    <tr>
      <td>[ ] Chirurgiens-dentistes</td>
      <td>[ ] Fournisseurs</td>
      <td colspan="2">[ ] ESPIC</td>
    </tr>
    <tr>
      <td>[ ] Pharmaciens</td>
      <td rowspan="2">[ ] Transporteurs<br />sanitaires<br />[x] Taxis</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td>[ ] Laboratoires</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Prise en compte</b></strong></td>
      <td>[ ] Facultative</td>
      <td>[x] Obligatoire</td>
      <td colspan="2"></td>
    </tr>
</table>

***

**Contexte**
Dans le cadre du projet de SEFi-Taxi (« Facturation Transport Etendue »), les services en ligne sont ouverts progressivement.

L’objet de cette fiche est de préciser les restrictions de périmètre des informations utilisées par les services en ligne par rapport aux Spécifications Fonctionnelles Générales de FTE contenues dans le corpus documentaire.

**Périmètre pour les services**
Le tableau ci-après regroupe l’ensemble des critères exprimés en termes métier et référencés de Cx.y.

Pour chaque critère est spécifiée la liste des données concernées, et pour chaque donnée la liste **exhaustive** des valeurs acceptées par les services en ligne.

Ces critères concernent tous les services en ligne pouvant être appelés dans le cadre de SEFi-Taxi.



VERSION DE TRAVAIL

![logo: sesam-vitale](page_1_image_1_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> – <u>centre-de-service@sesam-vitale.fr</u>**

**Réf. : PDT-INF-293 TX v3.04** Page *1 / 3*

# Fiche d’information

![icon: warning](page_2_image_1_v2.jpg)

> **Si la valeur <u>d’au moins un</u> des critères ne correspond pas à celles spécifiées dans le tableau, il convient d’effectuer une facture B2.**

<table>
  <thead>
    <tr>
      <th></th>
      <th>Donnée concernée</th>
      <th>Référence donnée</th>
      <th colspan="2">Valeur pour la présérie</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>C1.1</b></b></td>
      <td colspan="4"><s>Pas de Transport soumis à accord préalable</s></td>
    </tr>
    <tr>
      <td></td>
      <td><s>Code demande accord préalable</s></td>
      <td><s>FEL</s> <s>EF_FTE50_06</s></td>
      <td colspan="2"><s>Non renseigné</s></td>
    </tr>
    <tr>
      <td></td>
      <td><s>Code accord préalable</s></td>
      <td><s>FEL</s> <s>EF_FTE50_07</s></td>
      <td colspan="2"><s>Non renseigné</s></td>
    </tr>
    <tr>
      <td></td>
      <td><s>Date de l'accord préalable</s></td>
      <td><s>FEL</s> <s>EF_FTE50_08</s></td>
      <td colspan="2"><s>Non renseigné</s></td>
    </tr>
    <tr>
      <td><b><b>C1.3</b></b></td>
      <td colspan="4"><i>Pas de Transport transfrontalier</i> pour des assurés ne relevant ni du régime général (code régime 01)<br /><i>ni de ses régimes partenaires (codes régime 06, 07, 08, 10, 90, 93; caisses 609 et 939 pour le code</i><br /><i>régime 99)</i></td>
    </tr>
    <tr>
      <td></td>
      <td>Code INSEE lieu départ</td>
      <td>FEL EF_FTE63_10</td>
      <td colspan="2"><b>2 premiers caractères différents de 99</b></td>
    </tr>
    <tr>
      <td></td>
      <td>Code INSEE lieu d'arrivée</td>
      <td>FEL EF_FTE63_20</td>
      <td colspan="2"><b>2 premiers caractères différents de 99</b></td>
    </tr>
    <tr>
      <td><b><b>C2.0</b></b></td>
      <td colspan="4"><i>Bénéficiaire du régime général (01)</i> <s>sauf CPRPF-RG, de la MSA (02)</s></td>
    </tr>
    <tr>
      <td></td>
      <td>Code régime d’affiliation maladie</td>
      <td>BS EF_FTE22_01</td>
      <td rowspan="3"><b>01</b></td>
      <td rowspan="3"><s>02</s></td>
    </tr>
    <tr>
      <td></td>
      <td>Code régime de prise en charge</td>
      <td>PEC EF_FTE28_01</td>
    </tr>
    <tr>
      <td></td>
      <td>Code régime de la FEL</td>
      <td>FEL EF_FTE57_04<sub>[AMO]</sub></td>
    </tr>
    <tr>
      <td></td>
      <td>Code caisse de prise en charge</td>
      <td>PEC EF_FTE28_02</td>
      <td rowspan="2"><b>Toutes <s>sauf 908</s></b></td>
      <td rowspan="2"><s>Toutes</s></td>
    </tr>
    <tr>
      <td></td>
      <td>Code caisse gestionnaire de la FEL</td>
      <td>FEL EF_FTE57_05<sub>[AMO]</sub></td>
    </tr>
    <tr>
      <td></td>
      <td>Code centre de prise en charge</td>
      <td>PEC EF_FTE28_03</td>
      <td rowspan="2"><b>Toutes</b></td>
      <td rowspan="2"><s>Toutes</s></td>
    </tr>
    <tr>
      <td></td>
      <td>Code centre gestionnaire de la FEL</td>
      <td>FEL EF_FTE57_06<sub>[AMO]</sub></td>
    </tr>
    <tr>
      <td></td>
      <td>NIR de l’ouvrant droit</td>
      <td>FEL EF_FTE55_01</td>
      <td colspan="2"></td>
    </tr>
  </tbody>
</table>

<u>(Les éléments ci-dessous ont été intégrés aux SFG et aux guides d’intégration du corpus SEFi.)</u>

## <u>**Format des données**</u>

### <u>**Heures**</u>
<u>**Heures**</u> <u>~~Le format ‘T’ (TIME) défini dans les guides d’intégration est utilisé pour les champs définissant des heures.~~</u>

<u>~~Le format spécifié pour les heures locales est de type hh :mm :ss±hh :mm : +hh :mm/-hh :mm correspondant au décalage par rapport à l’heure UTC.~~</u>

<u>~~Il est demandé de ne pas indiquer le décalage par rapport à l’heure UTC.~~</u>

<u>~~Par exemple, pour une heure locale de 15h27, indiquer dans le flux « 15 :27 :00 » au lieu de « 15 :27 :00+2 :00 ».~~</u>

### <u>**Taux**</u>
<u>**Taux**</u> <u>~~Concernant les différents champs de taux de prise en charge, il convient de ne pas renseigner les décimales non significatives.~~</u>

<u>~~Par exemple le taux de remboursement est valorisé avec 65 et non avec 65.00.~~</u>



VERSION DE TEST

![logo: sesam-vitale](page_2_image_2_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> – <u>centre-de-service@sesam-vitale.fr</u>**

**Réf. : PDT-INF-293 TX v3.04** Page 2 / *3*

# Fiche d’information

<u>Cette remarque concerne uniquement les messages SEFi-TX</u>

**<u>Double appel</u>**
**au service**
**<u>WS_FT3</u>**

<u>En cas de réception de l’erreur technique : siram_40 - desir_1020 en retour d’un appel</u>
<u>au service WS_FT3 "valider une FEL", le LPS doit présenter à nouveau</u>
<u>automatiquement, i.e. de façon transparente pour le Transporteur, cette FEL au service</u>
**<u>sans modification du N° de facture ni du n° de lot.</u>**

<u>En fonction de la réponse du service pour ce deuxième appel :</u>

*   <u>si le service retourne l'erreur *ERR_FT_015*, alors la FEL est réputée validée : le</u>
    <u>LPS doit passer la FEL au statut "validé".</u>

    *   *<u>ERR_FT_015 correspond au message « Veuillez contacter votre éditeur : le</u>
        <u>numéro de la facture est déjà utilisé »</u>*

*   <u>si le service retourne une erreur technique ou fonctionnelle : le LPS se conforme</u>
    <u>à la gestion prévue : affichage de l'erreur sans traitement automatique par le LPS.</u>

**Disponibilité**
**du service**
**pour la**
**<u>validation des</u>**
**<u>factures</u>**

L’appel à l’ensemble des services peut être effectué à tout moment sans contrainte
d’horaire.



VERSION DE TRAVAIL

![logo: sesam-vitale](page_3_image_1_v2.jpg)
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> – <u>centre-de-service@sesam-vitale.fr</u>**

**Réf. : PDT-INF-293 TX v3.04** Page **3 / 3**