# Fiche d’information

| **Référence** | N° 293 Transporteur Sanitaire v3.07 | **Date** | 02/09/2026 |
| :--- | :--- | :--- | :--- |
| **Objet** | **SEFI-FTE : Périmètre d’élaboration d’une FEL : restriction par** **rapport aux SFG Transporteur Sanitaire** | | |

<table>
  <tr>
    <th><b>Type</b></th>
    <td>[ ] Technique</td>
    <td>[checked] Pratique</td>
    <td>[ ] Communication</td>
    <td>[ ] Livraison</td>
  </tr>
  <tr>
    <th><b>Destinataires</b></th>
    <td>[checked] Éditeurs</td>
    <td>[checked] Équipementiers</td>
    <td>[ ] OCT</td>
    <td>[ ] CIS</td>
  </tr>
  <tr>
    <th>Produits</th>
    <td>Facturation :<br />
      [ ] CDC Editeurs<br />
      [ ] CDC OCT<br />
      [ ] FSV agrément<br />
      [ ] FSV exploitation<br />
      [ ] SCOR</td>
    <td>Référentiels :<br />
      [ ] Dispositif Intégré<br />
      [ ] Terminal lecteur<br />
      [ ] TLA<br />
      [ ] Lecture Vitale<br />
      [ ] Télémise à jour</td>
    <td>Produits d’infrastructure :<br />
      [ ] ATSAM<br />
      [ ] SrvSVCNAM<br />
      [ ] GALSS<br />
      Services en Ligne :<br />
      [ ] CDR<br />
      [ ] Espace pro</td>
    <td>Téléservices intégrés :<br />
      [ ] HRi<br />
      [ ] DMTi<br />
      [ ] AATi<br />
      [checked] SEFi-FTE<br />
      Acquisition des droits :<br />
      [ ] API de Lecture</td>
  </tr>
  <tr>
    <th><b>Secteur</b></th>
    <td colspan="2">[checked] Libéral</td>
    <td colspan="2">[ ] Hospitalier</td>
  </tr>
  <tr>
    <th><b>Professionnels</b> de Santé <b>concernés</b></th>
    <td>[ ] Médecins<br />
      [ ] Sages-femmes<br />
      [ ] Chirurgiens-dentistes<br />
      [ ] Pharmaciens<br />
      [ ] Laboratoires</td>
    <td>[ ] Auxiliaires médicaux<br />
      [ ] Centres de Santé<br />
      [ ] Fournisseurs<br />
      [checked] Transporteurs sanitaires<br />
      [ ] Taxis</td>
    <td colspan="2">[ ] Établissements publics<br />
      [ ] Cliniques privées<br />
      [ ] ESPIC</td>
  </tr>
  <tr>
    <th><b>Prise en compte</b></th>
    <td colspan="2">[ ] Facultative</td>
    <td colspan="2">[checked] Obligatoire</td>
  </tr>
</table>

***

**Contexte** Dans le cadre du projet de SEFi-Transport (« Facturation Transport Etendue »), les services en ligne sont ouverts progressivement.

L’objet de cette fiche est de préciser les restrictions de périmètre des informations utilisées par les services en ligne par rapport aux Spécifications Fonctionnelles Générales de FTE contenues dans le corpus documentaire.

**Périmètre pour les services** Le tableau ci-après regroupe l’ensemble des critères exprimés en termes métier et référencés de Cx.y.

Pour chaque critère est spécifiée la liste des données concernées, et pour chaque donnée la liste **exhaustive** des valeurs acceptées par les services en ligne.

Ces critères concernent tous les services en ligne pouvant être appelés dans le cadre de SEFi-Transport.

> > ![icon: warning](page_1_image_2_v2.jpg) **Si la valeur <u>d’au moins un</u> des critères ne correspond pas à celles spécifiées dans le tableau, il convient d’effectuer une facture B2.**

![logo: sesam-vitale](page_1_image_1_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u>**

**Réf. : PDT-INF-293 v3.07** **Page *1 / 3***

# Fiche d’information

<table>
  <thead>
    <tr>
      <th></th>
      <th>Donnée concernée</th>
      <th colspan="2">Référence donnée</th>
      <th colspan="10"><b>Valeur</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th rowspan="3"><i>C1.3</i></th>
      <td colspan="13"><i>Pas de Transport transfrontalier</i><br /><br /><mark><i>NB : ce critère ne s’applique que pour les assurés ne relevant ni du régime général (code régime 01) ni de ses régimes partenaires (codes régime 06, 07, 08, 10, 90, 93; caisses 609 et 939 pour le code régime 99) ni de la MSA, ni de ses régimes partenaires (CPR, CCAS)</i></mark></td>
    </tr>
    <tr>
      <td>Code INSEE lieu départ</td>
      <td>FEL</td>
      <td>EF_FTE63_10</td>
      <td colspan="10"><b>2 premiers caractères différents de 99</b></td>
    </tr>
    <tr>
      <td>Code INSEE lieu d'arrivée</td>
      <td>FEL</td>
      <td>EF_FTE63_20</td>
      <td colspan="10"><b>2 premiers caractères différents de 99</b></td>
    </tr>
    <tr>
      <th rowspan="2"><i><mark>C1.4</mark></i></th>
      <td colspan="13"><mark><s><i>Pas de Garde ambulancière</i></s></mark><br /><br /><mark><i>Note : le système de facturation de la garde ambulancière est désormais remplacé par le système du Transport Urgent Pré-Hospitalier (TUPH) qui fait partie du périmètre SEFi. Cf. document FACT-SFG-030 pour plus d’informations.</i></mark></td>
    </tr>
    <tr>
      <td><mark><s>Nature de prestation</s></mark></td>
      <td><mark><s>FEL</s></mark></td>
      <td><mark><s>EF_FTE62_02</s></mark></td>
      <td colspan="10"><b><mark><s>Différent de ABG</s></mark></b></td>
    </tr>
    <tr>
      <th><i>C2.1</i></th>
      <td colspan="13"><i>Bénéficiaire du régime général (01), de la MSA (02), de la CPRPF-RS (04), de la RATP (05), de l’ENIM (06), de la CANSSM (07), de la CNMSS (08), <mark>de la CRPCEN (10)</mark>, de la CAVIMAC (90), d’Intériale (99 – caisse 609 ) et de la CAMIEG (99 – caisse 939)</i></td>
    </tr>
    <tr>
      <th rowspan="6"></th>
      <td>Code régime d’affiliation maladie</td>
      <td>BS</td>
      <td>EF_FTE22_01</td>
      <td rowspan="3"><b>01</b></td>
      <td rowspan="3"><b>02</b></td>
      <td rowspan="3"><b>04</b></td>
      <td rowspan="3"><b>05</b></td>
      <td rowspan="3"><b>06</b></td>
      <td rowspan="3"><b>07</b></td>
      <td rowspan="3"><b>08</b></td>
      <td rowspan="3"><b><mark>10</mark></b></td>
      <td rowspan="3"><b>90</b></td>
      <td rowspan="3"><b>99</b></td>
    </tr>
    <tr>
      <td>Code régime de prise en charge</td>
      <td>PEC</td>
      <td>EF_FTE28_01</td>
    </tr>
    <tr>
      <td>Code régime de la FEL</td>
      <td>FEL</td>
      <td>EF_FTE57_04<sub>[AMO]</sub></td>
    </tr>
    <tr>
      <td>Code caisse de prise en charge</td>
      <td>PEC</td>
      <td>EF_FTE28_02</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2"><mark>Toutes</mark></td>
      <td rowspan="2">Toutes</td>
      <td rowspan="2"><b>609 et 939</b></td>
    </tr>
    <tr>
      <td>Code caisse gestionnaire de la FEL</td>
      <td>FEL</td>
      <td>EF_FTE57_05<sub>[AMO]</sub></td>
    </tr>
    <tr>
      <td>Code centre de prise en charge<br />Code centre gestionnaire de la FEL</td>
      <td>PEC<br /><br />FEL</td>
      <td>EF_FTE28_03<br /><br />EF_FTE57_06<sub>[AMO]</sub></td>
      <td colspan="10"><b>Toutes</b></td>
    </tr>
    <tr>
      <th rowspan="3"><i>C2.2</i></th>
      <td colspan="13"><i>Pas de Bénéficiaire migrant</i></td>
    </tr>
    <tr>
      <td>NIR de l’ouvrant droit</td>
      <td>BS</td>
      <td>EF_FTE21_01</td>
      <td colspan="10" rowspan="2"><b>1<sup>er</sup> caractère différent de 5, et de 6 ;</b></td>
    </tr>
    <tr>
      <td>NIR de l’ouvrant droit</td>
      <td>FEL</td>
      <td>EF_FTE55_01</td>
    </tr>
  </tbody>
</table>

![logo: sesam-vitale](page_2_image_1_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u>

**Réf. : PDT-INF-293 v3.07** **Page 2 / 3**

# Fiche d’information

<u>(Les éléments ci-dessous ont été intégrés aux SFG et aux guides d’intégration du corpus SEFi.)</u>

**<u>Format des données</u>**

*   **<u>*Heures*</u>** <u>Le format ‘T’ (TIME) défini dans les guides d’intégration est utilisé pour les champs définissant des heures.</u>
    <u>Le format spécifié pour les heures locales est de type hh :mm :ss±hh :mm : +hh :mm/-hh :mm correspondant au décalage par rapport à l’heure UTC.</u>
    <u>Il est demandé de ne pas indiquer le décalage par rapport à l’heure UTC.</u>
    <u>Par exemple, pour une heure locale de 15h27, indiquer dans le flux « 15 :27 :00 » au lieu de « 15 :27 :00+2 :00 ».</u>

**<u>Double appel au service WS_FT3</u>**

<u>En cas de réception de l’erreur technique : siram_40 - desir_1020 en retour d’un appel au service WS_FT3 "valider une FEL", le LPS doit présenter à nouveau automatiquement, i.e. de façon transparente pour le Transporteur, cette FEL au service **sans modification du N° de facture ni du n° de lot.**</u>

<u>En fonction de la réponse du service pour ce deuxième appel :</u>

*   <u>si le service retourne l'erreur *ERR_FT_015*, alors la FEL est réputée validée : le LPS doit passer la FEL au statut "validé".</u>
    *   <u>*ERR_FT_015* correspond au message « *Cette facture existe déjà* »</u>

*   <u>si le service retourne une erreur technique ou fonctionnelle : le LPS se conforme à la gestion prévue : affichage de l'erreur sans traitement automatique par le LPS.</u>

**<u>Disponibilité du service pour la validation des factures</u>**

L’appel à l’ensemble des services peut être effectué à tout moment sans contrainte d’horaire.

**Contexte** Le support relatif à cette information s’effectue via le portail [Iris](https://portail-support.sesam-vitale.fr/gsvextranet/#/signin)

![logo: sesam-vitale](page_3_image_1_v2.jpg)
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u>**

**Réf. : PDT-INF-293 v3.07** **Page 3 / 3**