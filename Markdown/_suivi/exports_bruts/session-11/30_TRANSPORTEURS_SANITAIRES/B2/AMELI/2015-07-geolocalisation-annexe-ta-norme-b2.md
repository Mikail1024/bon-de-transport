<table>
    <tr>
      <td>CNAMTS/DDO/DMOA/DMOP<br />MOAD Rouen-Elbeuf-Dieppe</td>
      <td><strong><b>Géo localisation</b></strong></td>
      <td>Page 1</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td><strong><b>Annexe à la norme B2 - TA</b></strong><br /><strong><b>Version juin 2005-B et supérieures</b></strong></td>
      <td>06/07/2015</td>
    </tr>
</table>

# **MISE EN OEUVRE DE LA GEOLOCALISATION**
# **IMPACTS NORME B2 « TRANSPORTEUR »**

L'avenant 7 à la convention nationale des transporteurs sanitaires privés, publié au journal officiel le 4 juillet 2014, rectifié par nouvel avis ministériel le 5 août 2014, prévoit la création d’une option conventionnelle visant, entre autre, à développer l’équipement en système informatisé de géolocalisation.

Pour ce faire, il est prévu d’intégrer de nouvelles données dans le flux de facturation à destination des régimes d’assurance maladie obligatoire.

Les versions concernées par la présente annexe sont :

*   juin 2005 addenda B
*   juin 2007

Ces données seront également reprises dans la prochaine version de normes B2 en cours d’élaboration.

## **1. Impact sur la structuration de la norme « TA » pour les transports sanitaires**

<table>
        <tr>
            <td><strong><b>Type 000</b></strong></td>
            <td>1 par fichier logique et également 1 par fichier physique en cas de transmission via SMTP en mode chiffré</td>
        </tr>
        <tr>
            <td>    <strong><b>Type 1</b></strong></td>
            <td>1 par lot</td>
        </tr>
        <tr>
            <td>        <strong><b>Type 2 ou 2A</b></strong></td>
            <td>1 par facture</td>
        </tr>
        <tr>
            <td>        <strong><b>Type 2S</b></strong></td>
            <td>1 par facture (Facultatif - obligatoire pour le transport sanitaire en ambulance et VSL)</td>
        </tr>
        <tr>
            <td>        <strong><b>Type 2E</b></strong></td>
            <td>1 par facture (<em>facultatif en attente de mise en œuvre de la numérotation RPPS pour les prescripteurs</em>)</td>
        </tr>
        <tr>
            <td>            <strong><b>Type 4A</b></strong></td>
            <td>1 acte par facture = 1 type 4A par facture pour les Ambulances et VSL.</td>
        </tr>
        <tr>
            <td>            <strong><b>Type 4E</b></strong></td>
            <td>1 par facture (<em>facultatif en attente de mise en œuvre de la numérotation RPPS pour les exécutants</em>)</td>
        </tr>
        <tr>
            <td>            <strong><b>Type 4T</b></strong></td>
            <td>1 par facture, suite du type 4A pour les transports sanitaires.</td>
        </tr>
        <tr>
            <td>            <strong><b>Types 4U</b></strong></td>
            <td>1 à 36 types : décrit chaque transport dans le cadre d’une série de transports, avec détail des dates, des lieux, des personnes et des véhicules.</td>
        </tr>
        <tr>
            <td>        <strong><b>Type 5</b></strong></td>
            <td>1 par facture</td>
        </tr>
        <tr>
            <td>    <strong><b>Type 6</b></strong></td>
            <td>1 par lot</td>
        </tr>
        <tr>
            <td><strong><b>Type 999</b></strong></td>
            <td>1 par fichier</td>
        </tr>
</table>

<table>
    <tr>
      <td>CNAMTS/DDO/DMOA/DMOP<br />MOAD Rouen-Elbeuf-Dieppe</td>
      <td><strong><b>Géo localisation</b></strong></td>
      <td>Page 2</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td><strong><b>Annexe à la norme B2 - TA</b></strong><br /><strong><b>Version juin 2005-B et supérieures</b></strong></td>
      <td>06/07/2015</td>
    </tr>
</table>

## **2. Les données à transmettre**

Dès lors qu’un fichier de traces de géolocalisation contenant chaque trajet facturé est adressé à l’assurance maladie, le flux de facturation correspondant doit être renseigné de certaines données spécifiques au dispositif :

**2.1-** <u>Nouvelle donnée</u> : une nouvelle donnée de niveau facture est ajoutée dans le **type 2S**, afin de transmettre le numéro d’autorisation spécifique à la Géolocalisation.
Ce numéro dédié à la géolocalisation est attribué par le CNDA lors de l’obtention de l’autorisation, au logiciel PS, d’intégrer le service « transmission des données de géolocalisation » :

<table>
  <thead>
    <tr>
      <th>Donnée</th>
      <th>Position</th>
      <th>Format</th>
      <th>Présence</th>
      <th><b>Consignes</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>N° d’autorisation<br />géolocalisation</td>
      <td>45-49</td>
      <td>5 car<br />Alpha-<br />Num</td>
      <td>O</td>
      <td>Numéro d’autorisation spécifique<br />attribué lors de l’obtention de<br />l’autorisation au logiciel PS d’intégrer le<br />service « transmission des données de<br />géolocalisation ».</td>
    </tr>
  </tbody>
</table>

Présence « O » = Obligatoire

**2.2-** <u>Les trois données ajoutées dans le cadre de l’expérimentation débutée en 2010</u> (cf Annexe à la norme B2 TA Version juin 2005-B diffusée le 14/12/2009) sont désormais intégrées à la norme B2 TA et reconduites en l’état :

Dans le type 4U pour chaque transport unitaire :

*   <u>Le nombre de kilomètres réellement parcourus</u> : cette donnée est issue du module de géolocalisation. Elle est transmise pour information, en sus de la donnée actuelle « nombre de kilomètres facturés » qui reste utilisée pour le remboursement.

*   <u>L’utilisation du distancier</u> : indique si le distancier a servi de référence pour la détermination de la distance à facturer, ou pas si le trajet effectué n’y figure pas.

*   <u>Le niveau de certification</u> : Indique le niveau de confiance à accorder aux informations fournies relatives aux transports *(Cf. cahier des charges « Rénovation de la facturation par géo localisation »)*. Par défaut à 1.

<table>
    <tr>
      <td>CNAMTS/DDO/DMOA/DMOP<br />MOAD Rouen-Elbeuf-Dieppe</td>
      <td><strong>Géo localisation</strong></td>
      <td>Page 3</td>
    </tr>
    <tr>
      <td>Comité NORMES B2</td>
      <td><strong>Annexe à la norme B2 - TA</strong><br /><strong>Version juin 2005-B et supérieures</strong></td>
      <td>06/07/2015</td>
    </tr>
</table>

# **Géo localisation**

## **Annexe à la norme B2 - TA**
**Version juin 2005-B et supérieures**

<table>
  <thead>
    <tr>
      <th>Donnée</th>
      <th>Position</th>
      <th>Format</th>
      <th>Présence</th>
      <th><b>Consignes</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Distance<br />réelle<br />parcourue</td>
      <td>113-116</td>
      <td>4 car<br />Num.</td>
      <td>O</td>
      <td>Indique le nombre de kms<br />réellement parcourus, entre le lieu<br />de départ et le lieu d’arrivée. Cette<br />zone est renseignée avec les<br />informations issues du boitier GPS<br />embarqué.</td>
    </tr>
    <tr>
      <td>Utilisation<br />du distancier</td>
      <td>117</td>
      <td>1 car<br />Alpha-<br />Num</td>
      <td>O</td>
      <td>Valeur « <b>D</b> » : la distance facturée a<br />été déterminée sur la base du<br />distancier local négocié avec la<br />profession.<br />Valeur « <b>N</b> » : le distancier n’a pas<br />été utilisé car le trajet effectué n’y<br />figure pas.</td>
    </tr>
    <tr>
      <td>Niveau de<br />certification</td>
      <td>118</td>
      <td>1 car.<br />Num.</td>
      <td>O</td>
      <td>Indique le niveau de confiance à<br />accorder aux informations fournies<br />relatives aux transports :<br /><b>1</b> : non certifié.<br /><b>2</b> : certification des données GPS<br />Uniquement.<br /><b>3</b> : certification des données GPS et<br />de l’identification du véhicule.<br /><b>4</b> : certification des données GPS,<br />de l’identification du véhicule et de<br />l’identifiant de l’assuré.<br /><b>5</b> : certification des données GPS,<br />de l’identification du véhicule, de<br />l’identifiant de l’assuré, du<br />conducteur, et de l’accompagnant le<br />cas échéant.</td>
    </tr>
  </tbody>
</table>

Présence « O » = Obligatoire