![logo: sesam-vitale](page_1_image_1_v2.jpg)

# <u>Fiche d’information.</u>

---

**Référence** **PDT-INF-937**  **Date** **30/07/2026**
**Objet** **Diffusion package Géolocalisation Taxi DRAFT**

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
    <td>
      Facturation<br />
      [x] CDC Éditeurs<br />
      [ ] CDC OCT<br />
      [ ] FSV agrément<br />
      [ ] FSV exploitation<br />
      [ ] SCOR<br />
      <br />
      Services AMC<br />
      [ ] ROC
    </td>
    <td>
      Référentiels<br />
      [x] Dispositif Intégré<br />
      [ ] Terminal lecteur<br />
      [ ] TLA<br />
      [ ] Lecture Vitale<br />
      [ ] Télémise à jour
    </td>
    <td>
      Produits d’infrastructure<br />
      [ ] ATSAM<br />
      [ ] SrvSVCNAM<br />
      [ ] GALSS<br />
      <br />
      Services en Ligne<br />
      [ ] CDR<br />
      [ ] amelipro
    </td>
    <td>
      Téléservices intégrés<br />
      [ ] AATi<br />
      [ ] ADRi<br />
      [ ] ALDi<br />
      [ ] DMTi<br />
      [ ] HRi<br />
      [ ] IMTi<br />
      [ ] PEC +<br />
      [ ] PEM 2D<br />
      [ ] SEFi<br />
      <br />
      Acquisition des droits<br />
      [ ] API de Lecture Vitale
    </td>
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
    <td>
      [ ] Médecins<br />
      [ ] Sages-femmes<br />
      [ ] Chirurgiens-dentistes<br />
      [ ] Pharmaciens<br />
      [ ] Laboratoires
    </td>
    <td>
      [ ] Auxiliaires médicaux<br />
      [ ] Centres de Santé<br />
      [ ] Fournisseurs<br />
      [ ] Transporteurs sanitaires<br />
      [x] Taxis
    </td>
    <td>
      [ ] Établissements publics<br />
      [ ] Cliniques privées<br />
      [ ] ESPIC
    </td>
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

---

### **Contexte**

La nouvelle convention-cadre des taxis conventionnés entrée en vigueur le 1er novembre 2025 impose l'obligation de géolocalisation des taxis conventionnés au 1er janvier 2027

N.B. Les trajets réalisés pour les assurés de la MSA et de ses régimes hébergés seront concernés par ce dispositif et que des précisions seront apportées ultérieurement.

---

### **Corpus Documentaire**

L’architecture des documents de la géolocalisation est représentée ci‐dessous.

*PDT-INF-937*
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**www.sesam-vitale.fr**

*1 / 2*

![logo: sesam-vitale](page_2_image_1_v2.jpg)

# <u>Fiche d’information.</u>

```mermaid
graph TD
    subgraph Documentation_geolocalisation [Documentation géolocalisation]
        direction TB
        SFG[SFG Constituer et transmettre les traces de géolocalisation]
        XSD[XSD Traces Géolocalisation]
    end

    style Documentation_geolocalisation fill:#F4A47E,stroke:#D35400,stroke-width:2px,color:black,font-weight:bold,font-size:20px
    style SFG fill:#5499C7,stroke:#1B4F72,stroke-width:2px,color:white,font-weight:bold
    style XSD fill:#BDC3C7,stroke:#7F8C8D,stroke-width:2px,color:white,font-weight:bold
```

## **Contenu de la livraison**

La diffusion de la version DRAFT de Géolocalisation Taxi concerne les documents listés ci-dessous :

<table>
  <thead>
    <tr>
      <th>Référence document</th>
      <th>Titre</th>
      <th><b>Version diffusée</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>FACT-SFG-039</b></strong></td>
      <td>Facturation Taxi - Constituer et transmettre les traces de géolocalisation</td>
      <td>1.08 - DRAFT</td>
    </tr>
    <tr>
      <td><strong><b>TraceGeolocalisation</b></strong></td>
      <td>Fichier XSD</td>
      <td>V1</td>
    </tr>
  </tbody>
</table>

## **Support du GIE**

Le support relatif à cette information s’effectue via le [portail Iris](https://portail-support.sesam-vitale.fr/gsvextranet/#/signin)

*PDT-INF-937*

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**www.sesam-vitale.fr**

*2 / 2*