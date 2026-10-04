<table>
    <tr>
      <td><sup>CNAMTS</sup></td>
      <td><strong><b>Annexe à la norme B2 TA</b></strong></td>
      <td>Page: 1</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td></td>
      <td>01/02/2012<br />MAJ : 24/04/2012</td>
    </tr>
</table>

# **EVOLUTION DE LA NORME B2 « TRANSPORTEUR »**

## ***Versions de normes B2 supportées***

Dans l’attente de la publication de la prochaine version de normes B2 (2012), il est demandé de permettre l’envoi des nouvelles données liées à l’avenant 6 à la convention nationale des transports sanitaires privés, paru au J.O. le 21/10/2011, sur les versions de normes B2 suivantes :

- version juin 2005 addenda B
- version juin 2005 addenda D (entreprise en expérimentation géo-localisation)
- version juin 2007 avec errata

## ***Structuration de la norme TA pour les transports sanitaires***

<table>
    <tr>
      <td>Type 000</td>
      <td>1 par fichier logique par organisme destinataire et également 1 par fichier physique en cas de transmission via SMTP en mode chiffré</td>
    </tr>
    <tr>
      <td>    type 1</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td>        type 2 ou 2A</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td>        type 2S</td>
      <td>1 par facture (facultatif)</td>
    </tr>
    <tr>
      <td>        type 2E</td>
      <td>1 par facture (<i>facultatif en attente de mise en œuvre de la numérotation RPPS pour les prescripteurs</i>)</td>
    </tr>
    <tr>
      <td>            type <b>4A</b></td>
      <td>1 acte par facture = 1 type 4A par facture pour les Ambulances et VSL.</td>
    </tr>
    <tr>
      <td>            type 4E</td>
      <td>1 par facture (<i>facultatif en attente de mise en œuvre de la numérotation RPPS pour les exécutants</i>)</td>
    </tr>
    <tr>
      <td>            type <b>4T</b></td>
      <td>1 par facture, suite du type 4A pour les transports sanitaires.</td>
    </tr>
    <tr>
      <td>            types <b>4U</b></td>
      <td>1 à 36 types : décrit chaque trajet dans le cadre d’une série de transports, avec détail des dates, des lieux, des personnes et des véhicules.</td>
    </tr>
    <tr>
      <td>        type 5</td>
      <td>1 par facture</td>
    </tr>
    <tr>
      <td>    type 6</td>
      <td>1 par lot</td>
    </tr>
    <tr>
      <td>Type 999</td>
      <td>1 par fichier</td>
    </tr>
</table>

**CPAM RED / MOD / NORMES B2**

<table>
    <tr>
      <td><sup>CNAMTS</sup></td>
      <td><strong><b>Annexe à la norme B2 TA</b></strong></td>
      <td>Page: 2</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td></td>
      <td>01/02/2012<br />MAJ : 24/04/2012</td>
    </tr>
</table>

## ***Modification de libellé de champ***

Dans le type 4U, position 109-112, le champ « <u>Distance parcourue</u> », qui portait comme consigne : *« *Nombre de km facturés, (déduction faite des km compris dans le forfait )* »,* est renommé en « <u>Nombre de km facturés</u> ».

Il est ajouté une consigne relative à la majoration pour courte distance.

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2"><b>LONGUEUR</b></th>
      <th rowspan="2">PRESENCE</th>
      <th rowspan="2"><b>CONSIGNES DE SAISIE</b><br />DES RUBRIQUES</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Nombre de<br />km facturés</td>
      <td>109-112</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Nombre de km facturés,<br />(déduction faite des km compris<br />dans le forfait).</td>
    </tr>
  </tbody>
</table>

**Remarques :**
- Les 3 premiers km parcourus, inclus dans les forfaits de type 1 et 2, ouvrent droit au règlement de la majoration pour courte distance : dans ce cas le nombre de km facturés est égal à 0.
<mark><u>- Les taux d’abattement pour les transports partagés s’appliquent aux majorations</u> <u>pour courte distance (MAJ du 24/04/2012).</u></mark>

## ***Les nouvelles données à véhiculer dans la norme***

Trois nouvelles données sont ajoutées pour la norme TA.

Une dans le type 4T :
*   <u>Montant global des majorations pour courte distance</u> :
    Cette donnée est le cumul pour la facture, des majorations pour courte distance facturées sur les trajets (types 4U).

Deux dans le type 4U, à indiquer pour chaque trajet :
*   <u>Montant de la majoration pour courte distance</u> :
    Ce montant est facturé sur le trajet (type 4U), si le trajet effectué répond aux conditions prévues par l’avenant 6.
    Le montant de la majoration pour courte distance est soumis aux taux de majoration pour Nuit ou Férié applicables aux trajets inférieurs à 150 km.
*   <u>Indicateur de période de réalisation du trajet</u> :
    Cet indicateur précise si le trajet a été effectué en horaire de jour ou de nuit selon les horaires prévus par la réglementation, ou un dimanche ou un jour férié.
    Il est obligatoire, et n’est pas lié spécifiquement à la facturation d’une majoration pour courte distance.
    Il est cohérent avec la facturation de Nuit ou de Férié:
    *   des forfaits
    *   des km <=150
    *   des km > 150
    *   de la majoration pour courte distance

**CPAM RED / MOD / NORMES B2**

<table>
    <tr>
      <td><sup>CNAMTS</sup></td>
      <td><strong><b>Annexe à la norme B2 TA</b></strong></td>
      <td>Page: 3</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td></td>
      <td>01/02/2012<br />MAJ : 24/04/2012</td>
    </tr>
</table>

## **TYPE 4T : COMPLEMENT LIGNE TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2">LONGUEUR</th>
      <th rowspan="2">PRESENCE</th>
      <th>CONSIGNES DE SAISIE</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Montant global des majorations pour courte distance</td>
      <td>117-123</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td>Obligatoire si la zone des montants des majorations est remplie sur au moins un des types 4U.<br /><br />Somme des montants des majorations des types 4U.</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>124-128</td>
      <td>5</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

## **TYPE 4U : DETAIL TRANSPORT – NORME TA**

<table>
  <thead>
    <tr>
      <th rowspan="2">INFORMATIONS</th>
      <th rowspan="2">POSITIONS</th>
      <th colspan="2">LONGUEUR</th>
      <th rowspan="2">PRESENCE</th>
      <th>CONSIGNES DE SAISIE</th>
    </tr>
    <tr>
      <th>A</th>
      <th>N</th>
      <th>DES RUBRIQUES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>- Nombre de km facturés</td>
      <td>109-112</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td>Nombre de km facturés, (déduction faite des km compris dans le forfait).</td>
    </tr>
    <tr>
      <td></td>
      <td>113-118</td>
      <td></td>
      <td></td>
      <td></td>
      <td>RESERVE POUR L’EXPERIMENTATION « GEOLOCALISATION »</td>
    </tr>
    <tr>
      <td>- Montant de la majoration pour courte distance</td>
      <td>119-124</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td>Montant de la majoration, en fonction du nombre de km facturés et du type de forfait.</td>
    </tr>
    <tr>
      <td>- Indicateur de période de réalisation du trajet</td>
      <td>125</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td>Indique si le trajet a été effectué en horaire de jour ou de nuit ou de dimanche et férié :<br />- J : trajet en horaire de jour<br />- N : trajet en horaire de nuit<br />- F : trajet le dimanche ou un jour férié</td>
    </tr>
    <tr>
      <td>- FILLER</td>
      <td>126-128</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td>Blanc</td>
    </tr>
  </tbody>
</table>

**CPAM RED / MOD / NORMES B2**