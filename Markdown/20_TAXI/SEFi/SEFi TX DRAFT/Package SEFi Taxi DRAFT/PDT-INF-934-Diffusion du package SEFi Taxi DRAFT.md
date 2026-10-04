icon: sesam-vitale


# <u>Fiche d’information.</u>

| **Référence** | PDT-INF-934 | **Date** | 10.07.2026 |
| :--- | :--- | :--- | :--- |
| **Objet** | **Diffusion du package SEFi**‐**Taxi DRAFT** | | |

| <u>Type</u> | [ ] Technique [ ] Pratique [ ] Communication [x] Livraison |
| :--- | :--- |
| <u>Destinataires</u> | [x] Éditeurs [ ] Équipementiers [ ] OCT [ ] CIS |
| <u>Produits</u> | **Facturation**<br>[ ] CDC Éditeurs<br>[ ] CDC OCT<br>[ ] FSV agrément<br>[ ] FSV exploitation<br>[ ] SCOR<br><br>**Services AMC**<br>[ ] TP Complémentaire | **Référentiels**<br>[ ] Dispositif Intégré<br>[ ] Terminal lecteur<br>[ ] TLA<br>[ ] Lecture Vitale<br>[ ] Télémise à jour | **Produits d’infrastructure**<br>[ ] ATSAM<br>[ ] SrvSVCNAM<br>[ ] GALSS<br><br>**Services en Ligne**<br>[ ] CDR<br>[ ] amelipro | **Téléservices intégrés**<br>[ ] AATi<br>[ ] ADRi<br>[ ] ALDi<br>[ ] DMTi<br>[ ] HRi<br>[ ] IMTi<br>[ ] PEC +<br>[ ] PEM 2D<br>[x] SEFi<br><br>**Acquisition des droits**<br>[ ] API de Lecture Vitale |
| <u>Secteur</u> | [x] Libéral [ ] Hospitalier | |
| <u>Professionnels </u> <u>de Santé </u> <u>concernés</u> | [ ] Médecins<br>[ ] Sages-femmes<br>[ ] Chirurgiens-dentistes<br>[ ] Pharmaciens<br>[ ] Laboratoires | [ ] Auxiliaires médicaux<br>[ ] Centres de Santé<br>[ ] Fournisseurs<br>[ ] Transporteurs sanitaire<br>[x] Taxis | [ ] Établissements publics<br>[ ] Cliniques privées<br>[ ] ESPIC |
| **Prise en compte** | [ ] Facultative [ ] Obligatoire [x] Pour information | |

***

**Contexte** 
Le service SEFi Transport en Intégré LPS permet l’élaboration d’une facture en ligne (FEL), et une dématérialisation des pièces justificatives.

Le système SEFi Transport a pour objectifs :

*   La fiabilisation et la simplification des échanges entre les taxis conventionnés (spécialité 56) et l’Assurance Maladie,
*   La simplification des tâches administratives avec, entre autres, la suppression des échanges papier entre les taxis conventionnés et l’Assurance Maladie.

Il s’appuie sur les services en ligne de l’Assurance Maladie pour réserver des prestations puis élaborer et valider la FEL correspondante.

Sa généralisation pour les taxis conventionnés est prévue pour le 1<sup>er</sup> janvier 2027.

A ce jour, les opérations dont les développements sont attendus au 01/01/2027 sont :

*   Acquérir les informations du bénéficiaire
*   Consulter les modalités de prise en charge (PEC+)
*   Contrôler la recevabilité de la proposition de facture
*   Valider une facture en ligne
*   La transmission des fichiers via SCOR contenant les Pièces Justificatives est réalisée par messagerie sécurisée (chiffrement de transport) sur le protocole SMTP

<hr>
*PDT-INF-934*

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr-</u>** icon: twitter


**1 / 3**

# <u>Fiche d’information.</u>

icon: sesam-vitale



**Contenu de la**
**livraison**

Cette première livraison est une **version DRAFT dédiée aux taxis conventionnés.**
Elle correspond à la convention taxi 2025-2029.

## 1. Spécifications Fonctionnelles et Guides d'intégration

<table>
  <thead>
    <tr>
      <th>Document de référence</th>
      <th>Titre</th>
      <th>Version diffusée</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>FACT-SFG-029</td>
      <td>DICO-Dictionnaire du système<br />FTE</td>
      <td>V03.53</td>
    </tr>
    <tr>
      <td>FACT-SFG-030</td>
      <td>PG-Présentations Générale du<br />système FTE</td>
      <td>V05.47</td>
    </tr>
    <tr>
      <td>FACT-SFG-031</td>
      <td>FTE01-Executer des Prestations<br />d’une prescription</td>
      <td>V03.17</td>
    </tr>
    <tr>
      <td>FACT-SFG-032</td>
      <td>FTE02-Facturer des Prestations</td>
      <td>V03.57</td>
    </tr>
    <tr>
      <td>FACT-SFG-033</td>
      <td>FTE03-Contrôler et Transmettre<br />les PJ</td>
      <td>V03.20</td>
    </tr>
    <tr>
      <td>FACT-SFG-034</td>
      <td>FTE04-Consulter les référentiels<br />de l'AMO</td>
      <td>V03.17</td>
    </tr>
    <tr>
      <td>FACT-SFG-035</td>
      <td>FTE05-Paramétrer le poste PS</td>
      <td>V03.44</td>
    </tr>
    <tr>
      <td>FACT-SFG-060</td>
      <td>FTE06-Superviser le poste PS</td>
      <td>V03.36</td>
    </tr>
    <tr>
      <td>SEL-MP-012</td>
      <td>Guide d'Intégration du service<br />Partenaire de Santé (WS_PS)</td>
      <td>V02.19</td>
    </tr>
    <tr>
      <td>SEL-MP-014</td>
      <td>Guide d'Intégration du service<br />Prescription en Ligne (WS_PL)</td>
      <td>V03.16</td>
    </tr>
    <tr>
      <td>SEL-MP-015</td>
      <td>Guide d'Intégration du service<br />‘Facture’ (WS_FT)</td>
      <td>V03.50</td>
    </tr>
    <tr>
      <td>SEL-MP-016</td>
      <td>Guide d'Intégration du service<br />‘Prise en charge’ (WS_PEC)</td>
      <td>V03.39</td>
    </tr>
  </tbody>
</table>

## 2. Autres éléments du package
### • WSDL - SEFi Taxi DRAFT

<table>
  <thead>
    <tr>
      <th>Document de référence</th>
      <th>Titre</th>
      <th>Version diffusée</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>SEMaFELTransport_EXP<br />N.B. pour les services contrôler<br />recevabilité et valider voir<br />SFTR_EXP_ServiceAccueilSEFiTransport</td>
      <td>WSDL et XSD du service<br />SEFi transport (commun à<br />transporteur sanitaire et taxi)</td>
      <td>1.1.0</td>
    </tr>
    <tr>
      <td>SFTR_EXP_ServiceAccueilSEFiTransport</td>
      <td>WSDL et XSD du service<br />ServiceAccueilTaxi</td>
      <td>DRAFT</td>
    </tr>
    <tr>
      <td>ServicePEC_EXP</td>
      <td>WSDL et XSD du service<br />Prise en charge (WS_PEC)</td>
      <td>1.0.4</td>
    </tr>
    <tr>
      <td>CONTRAT_InfoPS_EXP</td>
      <td>WSDL et XSD du service<br />Partenaire de santé<br />(WS_PS)</td>
      <td>2.0.6</td>
    </tr>
    <tr>
      <td>PELTransp_EXP</td>
      <td>WSDL et XSD du service<br />Prescription en Ligne<br />(WS_PL)</td>
      <td>2.2.1</td>
    </tr>
  </tbody>
</table>

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
*PDT-INF-934*
[<u>www.sesam-vitale.fr</u>](http://www.sesam-vitale.fr) - [<u>centre-de-service@sesam-vitale.fr-</u>](mailto:centre-de-service@sesam-vitale.fr-) 
 icon: twitter
*2 / 3*

icon: sesam-vitale

## <u>Fiche d’information.</u>

***

### • Fiches d'informations liés au package SEFi Taxi DRAFT

<table>
  <thead>
    <tr>
      <th>Document de référence</th>
      <th>Titre</th>
      <th>Version diffusée</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>PDT-INF-293</td>
      <td>Périmètre SEFi-FTE Taxi</td>
      <td>V3.04</td>
    </tr>
  </tbody>
</table>

#### **Package TLSi service transverse "bénéficiaire" (téléservice autonome)**

Ce package est disponible sur [l’espace Industriels](https://industriels.sesam-vitale.fr/group/tlsi-beneficiaire/accueil?p_p_id=fr_sesamvitale_portail_Explorateur_Document_web&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_fr_sesamvitale_portail_Explorateur_Document_web_pageToDisplay=TREE_FOLDER&_fr_sesamvitale_portail_Explorateur_Document_web_folderId=8812221).

**Support du GIE SV** Le support relatif à cette information s’effectue via le portail [IRIS.](https://portail-support.sesam-vitale.fr/gsvextranet/#/signin)

*PDT-INF-934*
GIE SESAM-Vitale
5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2
<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr-</u>icon: twitter

*3 / 3*