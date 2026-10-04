<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 1</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

La norme de télétransmission B2 TA a été adaptée pour les taxis afin de pouvoir véhiculer les informations suivantes :

*   Date de départ,
*   Heure de départ,
*   Lieu de départ,
*   Numéro minéralogique du véhicule,
*   Nom du conducteur,
*   Prénom du conducteur,
*   Date d’arrivée,
*   Heure d’arrivée,
*   Lieu d’arrivée,
*   Nombre de malades transportés dans le véhicule,
*   Distance réellement parcourue.

Les versions concernées par la présente annexe sont :

*   juin 2005 addenda B
*   juin 2007

Cette évolution sera également reprise dans la prochaine version de normes B2 en cours d’élaboration.

*NB : Afin de permettre aux éditeurs d’adapter leurs logiciels, la nouvelle et l’ancienne facturation vont cohabiter pendant une période transitoire.*

<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 2</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

## <u>**Formatage d’une facture taxi en norme B2 TA adaptée**</u>

Le type 4 A doit se substituer au type 4 et être suivi obligatoirement des types 4T et 4U.
Conformément aux dispositions générales de la norme B2, le type 4A regroupe également le montant total à rembourser.
Il est suivi d’un enregistrement de type 4T et d’autant de types 4U **que** de trajets (16 trajets maximum dans une facture).

### **Le TYPE 4 A**

Complément de type 36 (1) : valeur **A** (obligatoire)

<table>
  <thead>
    <tr>
      <th>INFORMATIONS</th>
      <th>POSITIONS</th>
      <th>Alphanumérique</th>
      <th>Numérique</th>
      <th>PRESENCE</th>
      <th>DONNEES A RENSEIGNER</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td></td>
      <td>2-35</td>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>Idem type 4 actuel</strong></td>
    </tr>
    <tr>
      <td>Complément du type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td><strong>A</strong></td>
    </tr>
    <tr>
      <td>- Dénombrement</td>
      <td>87-88</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><u>Transports</u> : nombre de trajets<br />(types 4U) facturés (de 01 à 16)</td>
    </tr>
    <tr>
      <td></td>
      <td>37- 128</td>
      <td></td>
      <td></td>
      <td></td>
      <td><strong>Idem type 4 actuel</strong></td>
    </tr>
  </tbody>
</table>

### **Le TYPE 4 T**

Le type 4T ne subit pas de modification. Seules les consignes de saisie des rubriques devront prendre en compte la spécificité de la facturation de taxi.

<table>
  <thead>
    <tr>
      <th>INFORMATIONS</th>
      <th>POSITIONS</th>
      <th>Alphanumérique</th>
      <th>Numérique</th>
      <th>PRESENCE</th>
      <th>DONNEES A RENSEIGNER</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td>N° partenaire de santé<br />Filler<br />N° immatriculation assuré<br />Clé du n° immatriculation<br />N° de facture</td>
      <td>2-35</td>
      <td></td>
      <td></td>
      <td></td>
      <td><strong><b>Idem type 4 A</b></strong></td>
    </tr>
    <tr>
      <td>Complément du type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td><strong>T</strong></td>
    </tr>
    <tr>
      <td>Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><strong><b>Un seul enregistrement numéroté 01.</b></strong></td>
    </tr>
    <tr>
      <td>Filler</td>
      <td>39-45</td>
      <td>7</td>
      <td></td>
      <td></td>
      <td><strong><b>Blanc</b></strong></td>
    </tr>
    <tr>
      <td>Série (au sens du décret du 6/5/88)</td>
      <td>46</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>Transport lié à une hospitalisation</td>
      <td>47</td>
      <td></td>
      <td>1</td>
      <td></td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>Longue distance</td>
      <td>48</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td><strong>0</strong></td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 3</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

<table>
    <tr>
      <td>Filler</td>
      <td>49</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Forfait - type de forfait</td>
      <td>50</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td><strong><b>0 (pas de forfait)</b></strong></td>
    </tr>
    <tr>
      <td>Prix unitaire du forfait non majoré</td>
      <td>51-56</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>Quantité forfaits</td>
      <td>57-58</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>Quantité forfaits majoration de nuit</td>
      <td>59-60</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>Quantité forfaits majoration<br />dimanche ou fériés</td>
      <td>61-62</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>Prix unitaire du kilomètre non<br />réduit.</td>
      <td>63-68</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>SANS MAJORATION :<br />    Quantité &#x3C;ou=150 km</td>
      <td>69-72</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>    Quantité >150 km</td>
      <td>73-76</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>MAJORATION NUIT :<br />    Quantité &#x3C;ou=150 km</td>
      <td>77-80</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>    Quantité >150 km</td>
      <td>81-84</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>MAJORATION<br />DIMANCHE/FERIE :<br />    Quantité &#x3C;ou=150 km</td>
      <td>85-88</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>    Quantité >150 km</td>
      <td>89 à 92</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>SUPPLEMENT :<br />    Type supplément</td>
      <td>93</td>
      <td></td>
      <td>1</td>
      <td>F</td>
      <td><strong>0</strong></td>
    </tr>
    <tr>
      <td>    Quantité</td>
      <td>94-95</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>    Montant</td>
      <td>96-101</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>PEAGE ET VOIES D’EAU :</td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>    Quantité</td>
      <td>102-103</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>    Montant</td>
      <td>104-109</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>Montant global des abattements</td>
      <td>110-116</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td><strong>0000000</strong></td>
    </tr>
    <tr>
      <td>Montant global des majorations<br />pour courte distance</td>
      <td>117-123</td>
      <td></td>
      <td>5+2</td>
      <td>F</td>
      <td><strong>0000000</strong></td>
    </tr>
    <tr>
      <td>Filler</td>
      <td>124-128</td>
      <td>5</td>
      <td></td>
      <td></td>
      <td><strong>Blanc</strong></td>
    </tr>
</table>

## **Le TYPE 4 U**

La distance réellement parcourue sera transmise dans le champ existant du type 4U actuellement réservé aux transporteurs sanitaires dans le cadre de la géolocalisation.

Les champs « Utilisation du distancier », « Niveau de certification » actuellement obligatoires pour la géolocalisation des transporteurs sanitaires, seront rendus facultatifs pour les taxis.

Le champ « Indicateur de période de réalisation du trajet », actuellement obligatoire pour la norme B2 TA sera rendu facultatif pour les taxis.

<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 4</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th><b>INFORMATIONS</b></th>
      <th>POSITIONS</th>
      <th>Alphanumérique</th>
      <th>Numérique</th>
      <th>PRESENCE</th>
      <th>DONNEES A RENSEIGNER</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Type d’enregistrement</td>
      <td>1</td>
      <td></td>
      <td>1</td>
      <td></td>
      <td><strong>4</strong></td>
    </tr>
    <tr>
      <td>N° partenaire<br />de santé<br />FILLER<br />N° immatriculation assuré<br />Clé du numéro<br />immatriculation<br />N° de facture</td>
      <td>2-35</td>
      <td></td>
      <td></td>
      <td></td>
      <td><strong><b>Idem type 4A</b></strong></td>
    </tr>
    <tr>
      <td>Complément du type</td>
      <td>36</td>
      <td>1</td>
      <td></td>
      <td>O</td>
      <td><strong>U</strong></td>
    </tr>
    <tr>
      <td>Séquence</td>
      <td>37-38</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td><strong><b>= de 01 à 16</b></strong></td>
    </tr>
    <tr>
      <td>Date départ</td>
      <td>39-44</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td><strong>AAMMJJ</strong></td>
    </tr>
    <tr>
      <td>Heure départ</td>
      <td>45-48</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td><strong><b>HHMM de 00 à 23H - de 00 à 59Mn</b></strong></td>
    </tr>
    <tr>
      <td>Lieu départ département</td>
      <td>49-50</td>
      <td></td>
      <td>2</td>
      <td>O</td>
      <td rowspan="2"><strong><b>Code INSEE des communes et des</b> <b>départements, 99999 si hors de</b> <b>France</b></strong></td>
    </tr>
    <tr>
      <td>commune</td>
      <td>51-53</td>
      <td></td>
      <td>3</td>
      <td>O</td>
    </tr>
    <tr>
      <td>N° véhicule</td>
      <td>54-62</td>
      <td>9</td>
      <td></td>
      <td>O</td>
      <td><strong><b>Numéro minéralogique</b></strong></td>
    </tr>
    <tr>
      <td>Nom conducteur</td>
      <td>63-70</td>
      <td>8</td>
      <td></td>
      <td>O</td>
      <td><strong><b>8 premiers caractères nom</b></strong></td>
    </tr>
    <tr>
      <td>Prénom conducteur</td>
      <td>71-73</td>
      <td>3</td>
      <td></td>
      <td>O</td>
      <td><strong><b>3 premiers caractères prénom</b></strong></td>
    </tr>
    <tr>
      <td>Nom accompagnateur</td>
      <td>74-81</td>
      <td>8</td>
      <td></td>
      <td>F</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Prénom accompagnateur</td>
      <td>82-84</td>
      <td>3</td>
      <td></td>
      <td>F</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Date arrivée</td>
      <td>85-90</td>
      <td></td>
      <td>6</td>
      <td>O</td>
      <td><strong>AAMMJJ</strong></td>
    </tr>
    <tr>
      <td>Heure arrivée</td>
      <td>92-94</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td><strong><b>HHMM 00 à 23H - 00 à 59 Mn.</b></strong></td>
    </tr>
    <tr>
      <td>Lieu d’arrivée</td>
      <td>95-99</td>
      <td></td>
      <td>5</td>
      <td>O</td>
      <td><strong><b>Idem lieu de départ.</b></strong></td>
    </tr>
    <tr>
      <td>Nombre malades</td>
      <td>100</td>
      <td></td>
      <td>1</td>
      <td>O</td>
      <td><strong><b>Transportés dans véhicule = 1</b></strong></td>
    </tr>
    <tr>
      <td>% abattement</td>
      <td>101-102</td>
      <td></td>
      <td>2</td>
      <td>F</td>
      <td><strong>00</strong></td>
    </tr>
    <tr>
      <td>Montant abattement</td>
      <td>103-108</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>Nombre de km facturés</td>
      <td>109-112</td>
      <td></td>
      <td>4</td>
      <td>F</td>
      <td><strong>0000</strong></td>
    </tr>
    <tr>
      <td>Distance réelle parcourue</td>
      <td>113-116</td>
      <td></td>
      <td>4</td>
      <td>O</td>
      <td><strong><b>Indique le nombre de kms</b> <b>réellement parcourus, entre le lieu</b> <b>de départ et le lieu d’arrivée</b></strong></td>
    </tr>
    <tr>
      <td>Utilisation du distancier</td>
      <td>117</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Niveau de certification</td>
      <td>118</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Montant de la majoration pour courte distance</td>
      <td>119-124</td>
      <td></td>
      <td>4+2</td>
      <td>F</td>
      <td><strong>000000</strong></td>
    </tr>
    <tr>
      <td>Indicateur de période de réalisation du trajet</td>
      <td>125</td>
      <td>1</td>
      <td></td>
      <td>F</td>
      <td><strong>Blanc</strong></td>
    </tr>
    <tr>
      <td>Filler</td>
      <td>126-128</td>
      <td></td>
      <td></td>
      <td></td>
      <td><strong><b>blanc</b></strong></td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 5</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

## **<u>Structuration de la norme TA pour les transports taxi</u>**

# Type 000

    type 1                                      1 par lot

        type 2 ou 2A                      1 par facture
        type 2S                              1 par facture (facultatif)
        type 2E                              1 par facture (facultatif)

    1          type 4A                      1 par acte (1 par facture)
0 à 1          type 4E                      facultatif sauf si les informations qu’il contient sont
                                                 obligatoires
    1          type 4T                      1 par type 4A
    n          type 4U                      jusqu’à 16 trajets

...
0 à 16      type 4                          1 par supplément TMR (le cas échéant)

        type 5                              1 par facture

    type 6                                  1 par lot

# Type 999

## **<u>Points d’attention</u>**

*   **<u>Les données obligatoire pour les transports mais positionnées à « 0 » pour les taxis devront être forcées à « 0 »</u>**

<table>
    <tr>
      <td>CNAM/DDO/DOPP/DPPM<br />MOAD Rouen-Elbeuf-<br />Dieppe</td>
      <td>Annexe 29 à la norme B2 TA (Taxis)</td>
      <td>Page 6</td>
    </tr>
    <tr>
      <td>NORME B2</td>
      <td></td>
      <td>21/07/2021</td>
    </tr>
</table>

## **<u>Exemple :</u>**

## **<u>Pour une facture transport composée d’un aller-retour, la structure de la norme transmise est la suivante :</u>**

Type 000
Type 1
Type 2 ou 2A
Type 2S

Type 4A
Type 4E
Type 4T
Type 4U 1<sup>er</sup> trajet
Type 4U 2<sup>ème</sup> trajet … etc (jusqu’à 16 trajets maximum par facture)

Type 5
Type 6
Type 999