SFG Facturation Transporteur

FACT-SFG-039 — GE - Constituer et transmettre les traces de géolocalisation — Version : 1.05

<table>
<tr><th>Balises XML<br>Gras : élément vide<br><i>Italique : élément avec contenu</i><br><span style="color:darkred">Rouge foncé : attributs</span></th><th>Occurrence</th><th>Format</th><th>Valeurs</th></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp; <b>gpx</b><br>[Namespace : http://www.topografix.com/GPX/1/1]</td><td>1</td><td></td><td></td></tr>
</table>

La structure de la balise gpx du schéma ci-dessus respecte le standard GPX version 1.1. Les éléments utilisés de cette structure standard dans le cadre des traces de géolocalisation sont décrits ci-après :

<table>
<tr><th>Balises XML<br>Gras : élément vide<br><i>Italique : élément avec contenu</i><br><span style="color:darkred">Rouge foncé : attributs</span></th><th>Occurrence</th><th>Format</th><th>Valeurs</th></tr>
<tr><td><b>gpx</b><br>[Namespace : http://www.topografix.com/GPX/1/1]</td><td>1</td><td></td><td></td></tr>
<tr><td>&nbsp; <b><span style="color:darkred">version</span></b></td><td>1</td><td>AN</td><td>« 1.1 »</td></tr>
<tr><td>&nbsp; <b><span style="color:darkred">creator</span></b></td><td>1</td><td>AN</td><td>«»</td></tr>
<tr><td>&nbsp; <b>trk</b></td><td>0..n</td><td></td><td></td></tr>
<tr><td>&nbsp;&nbsp; <b>trkseg</b></td><td>0..n</td><td></td><td></td></tr>
<tr><td>&nbsp;&nbsp;&nbsp; <b>trkpt</b></td><td>0..n</td><td></td><td></td></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp; <b><span style="color:darkred">lat</span></b></td><td>1</td><td>ND</td><td>EF_GE03_01</td></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp; <b><span style="color:darkred">lon</span></b></td><td>1</td><td>ND</td><td>EF_GE03_02</td></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp; <i>time</i></td><td>0..1</td><td>DT</td><td>EF_GE03_03</td></tr>
</table>

### Exemple

Un exemple de fichier XML respectant le schéma xsd ci-dessus est donné ci-après :

```xml
<?xml version="1.0" encoding="UTF-8"?> 
 
<CURMED xmlns="www.cnamts.fr/namespace/EXP/0/0/Transporteur" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" PGMD_Profil="Transporteur" PGMD_Version="8.3" 
Profil_Version="0.3" xsi:schemaLocation="www.cnamts.fr/namespace/EXP/0/0/Transporteur 
TracesGeolocalisation.xsd"> 
 
  <Identification>098765432</Identification> 
  <Emetteur> 
    <Identite_PSAM>123456789</Identite_PSAM> 
  </Emetteur> 
  <ContexteMA> 
    <Nature>TA</Nature> 
    <Transport> 
      <Identifiant>01</Identifiant> 
      <Trajet> 
        <Identifiant>01</Identifiant> 
        <Vehicule>WW123WW</Vehicule> 
        <Conducteur> 
          <Usage>NOMCONDUCTEUR</Usage> 
          <Prenom>PRENOMCONDUCTEUR</Prenom>
```

14/02/2024 — GIE SESAM-Vitale — 37 / 38

Ce document ne peut être diffusé sans l’autorisation d’une personne habilitée au GIE SESAM-Vitale
