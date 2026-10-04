SFG - Facturation Taxi

FACT-SFG-039 — GE - Constituer et transmettre les traces de géolocalisation — Version : 1.08

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
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" PGMD_Profil="Transporteur" 
PGMD_Version="8.3" Profil_Version="0.3" 
xsi:schemaLocation="www.cnamts.fr/namespace/EXP/0/0/Transporteur 
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
        </Conducteur> 
        <Distance Q="reel">1234</Distance> 
        <BoitierGPS Q="1">AB123456789CDEF</BoitierGPS> 
        <gpx xmlns="http://www.topografix.com/GPX/1/1" version="1.1" creator=""> 
          <trk> 
            <trkseg> 
              <trkpt lat="43.387138" lon="5.169208"> 
                <time>2014-09-19T07:15:53Z</time> 
              </trkpt> 
              <trkpt lat="43.387105" lon="5.16919"> 
                <time>2014-09-19T07:16:53Z</time> 
              </trkpt> 
              <trkpt lat="43.387115" lon="5.169197"> 
                <time>2014-09-19T07:17:53Z</time> 
              </trkpt>
```

VERSION DE TRAVAIL (filigrane)

16/07/2026 — 35 / 36

Ce document à diffusion restreinte ne peut être diffusé sans l’autorisation d’une personne habilitée
