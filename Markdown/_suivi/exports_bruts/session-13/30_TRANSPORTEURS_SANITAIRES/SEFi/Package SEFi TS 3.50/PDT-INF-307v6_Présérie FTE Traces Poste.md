# Fiche d’information

| | | | |
| :--- | :--- | :--- | :--- |
| **Référence** | N° 307 v6 | **Date** | 12.07.2019 |
| **Objet** | Présérie individuelle du Service SEFi<br>**Remontée des traces depuis le poste de travail du transporteur**<br>**sanitaire** | | |

| | | | |
| :--- | :--- | :--- | :--- |
| **Type** | [x] Technique | [ ] Pratique | [ ] Communication | [ ] Livraison |
| **Destinataires** | [x] Editeur | [ ] Industriel | [ ] OCT | [ ] Etablissements de Santé |
| **Produits** | Facturation :<br>[ ] CDC Editeurs<br>[ ] CDC OCT<br>[ ] FSV agrément<br>[ ] FSV exploitation | Référentiels :<br>[ ] Dispositif Intégré<br>[ ] Terminal lecteur<br>[ ] TLA<br>[ ] Lecture Vitale<br>[ ] Télémise à jour | Services en Ligne :<br>[ ] CDR<br>[ ] PEC+ (Aide à la Prise en Charge)<br>[ ] HRi<br>[x] SEFi | Produits d’infrastructure :<br>[ ] GALSS<br>[ ] CryptoLib-CPS<br>Acquisition des droits :<br>[ ] API de Lecture |
| **Secteur** | [x] Libéral | | [ ] Hospitalier | |
| **Professionnels de Santé concernés** | [ ] Prescripteurs<br>[ ] Pharmaciens<br>[ ] Laboratoires<br>[x] Transporteurs sanitaires | [ ] Auxiliaires médicaux<br>[ ] Centres de Santé<br>[ ] Fournisseurs | [ ] Etablissements publics - ESPIC<br>[ ] Cliniques privées | |
| **Prise en compte** | [ ] Facultative | [x] Obligatoire | | |

**Contexte** Dans le cadre du projet Service Electronique de Facturation intégré, tout nouveau logiciel intégrant le téléservice SEFi transport, et autorisé par l’Assurance Maladie, doit passer par une phase de présérie individuelle, avant d’être déployé à l’ensemble de la clientèle (cf. « conditions et modalités de présérie du SEFi »).

L’objet de cette fiche est de préciser la remontée des informations à fournir à l’Assurance Maladie pendant la phase de présérie afin de suivre au mieux le déploiement de la solution.

Dans ce contexte, le LPS doit fournir deux fichiers de traces de suivi :
* Liste des factures validées
* Traces de l’appel au service contrôle de recevabilité

![logo: sesam-vitale](page_1_image_2_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u>**

**1 / 5** **Réf. : PDT-INF-307**


![logo: l'Assurance Maladie Caisse Nationale](page_1_image_1_v2.jpg)

# Fiche d’information

## **1 - Liste des factures validées**

**<u>Une fois par semaine</u>**
Chaque **lundi**, l’éditeur doit transmettre au GIE SESAM-Vitale la liste **des factures créées la semaine précédente (lundi au dimanche inclus)**,
<mark><u>Les fichiers traces seront **zippés avec mot de passe**</u></mark> et envoyés par courriel à l’adresse suivante :
<u>traces_RI@sesam-vitale.fr</u>

en précisant en objet :

*   [SEFi-t] *<nom éditeur>* - Traces_suivi_SEFi période du <date début période> au <date fin période> : <N° AM>
    Exemple : [SEFi-t] GIE_SV - Traces_suivi_SEFi période du 20170911 au 20170917 : 111111111

**<u>Le nom du fichier</u>** sera de la forme suivante :
SEFi-t_traces-FEL _< nom du logiciel>_<version du logiciel>_<UUID>_<N°AM>_<date de création du fichier>_<incrément>. csv

Où :

*   Nom du logiciel + version : Nom et version déclaré au CNDA lors des tests
*   L’UUID est l’identifiant unique de l’instance du logiciel
*   N° AM du transporteur
*   Date de création du fichier au format YYYYMMDD
*   L’incrément est un numéro d’ordre du fichier (incrémenté de 1 en 1 à chaque nouveau fichier créé)

    ```text
    Exemple :SEFi-t_traces-FEL_ADEMIS_V3_2404a520-e12b-3ad4-a710-
    64562a440120-111111111_20170918_1.csv
    ```

Le fichier comportera les colonnes suivantes :

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Libellé</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><em>EF_FTE52_01</em></strong></td>
      <td>Identifiant de facturation du PS</td>
    </tr>
    <tr>
      <td><strong><em>Identifiant de la requête</em></strong></td>
      <td>MessageID de l’en-tête WS-Addressing de la requête(UUID)</td>
    </tr>
    <tr>
      <td><strong><em>DateHeureRequeteWS_FT3Valider</em></strong></td>
      <td>Horodatage de la requête au moment de l'appel au service par le LPS.<br />Format AAAAMMJJhhmmssxxxxxx, où xxxxxx représente le nombre de micro secondes.</td>
    </tr>
    <tr>
      <td><strong><em>DateHeureReponseWS_FT3Valider</em></strong></td>
      <td>Horodatage de la réponse au moment de la réception par le progiciel.<br />Format AAAAMMJJhhmmssxxxxxx, où xxxxxx représente le nombre de micro secondes.</td>
    </tr>
    <tr>
      <td><strong><em>E70.01</em></strong></td>
      <td>Identifiant de la facture</td>
    </tr>
    <tr>
      <td><strong><em>E70.02</em></strong></td>
      <td>Date de la facture</td>
    </tr>
  </tbody>
</table>

![logo: sesam-vitale](page_2_image_2_v2.jpg)
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u>
**2 / 5** **Réf. : PDT-INF-307**

![logo: L'Assurance Maladie](page_2_image_1_v2.jpg)

# Fiche d’information

<table>
    <tr>
      <td><strong><em>E70.03</em></strong></td>
      <td>N° lot</td>
    </tr>
    <tr>
      <td><strong><em>E70.04</em></strong></td>
      <td>Code régime</td>
    </tr>
    <tr>
      <td><strong><em>E70.05</em></strong></td>
      <td>Caisse gestionnaire</td>
    </tr>
    <tr>
      <td><strong><em>E70.06</em></strong></td>
      <td>Centre gestionnaire</td>
    </tr>
    <tr>
      <td><strong><em>E70.09</em></strong></td>
      <td>Date traitement</td>
    </tr>
    <tr>
      <td><strong><em>Fault/Code/Value/subcode/Value</em></strong></td>
      <td>Valeur de la balise &#x3C;value> du subcode du code de l’erreur de la soap fault.</td>
    </tr>
    <tr>
      <td>Attribut "Code" de<br />Fault/Detail/Erreur</td>
      <td>Valeur de l’attribut « code » du détail de l’erreur de la soap fault.</td>
    </tr>
    <tr>
      <td><strong><em>Nombre de diagnostics</em></strong></td>
      <td>Calculer le nombre de diagnostics reçus</td>
    </tr>
    <tr>
      <td>FACTURE/DIAGNOSTIC/Code</td>
      <td>Valeur de la balise &#x3C;code> du diagnostic de la facture.</td>
    </tr>
    <tr>
      <td>FACTURE/DIAGNOSTIC/Libelle</td>
      <td>Valeur de la balise &#x3C;Libelle> du diagnostic de la facture.</td>
    </tr>
</table>

![logo: sesam-vitale](page_3_image_2_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u>

**3 / 5** **Réf. : PDT-INF-307**


![logo: L'Assurance Maladie Caisse Nationale](page_3_image_1_v2.jpg)

# Fiche d’information

## **2 - Traces de l’appel au service « Contrôle de Recevabilité »**

**<u>Mensuellement</u>**
**Chaque 1ᵉʳ du mois**, l’éditeur doit transmettre au GIE SESAM-Vitale les traces de l’appel au service WS_FT2 « contrôle de recevabilité » **créées dans le mois**.
Les fichiers traces seront **<u>zippés avec mot de passe</u>** et envoyés par courriel à l’adresse suivante : <u>traces_RI@sesam-vitale.fr</u>

en précisant en objet :
*   [SEFi-t] *<nom éditeur>* - Traces_suivi_SEFi_recevabilité période du <date début période> au <date fin période> : <N° AM>
    ```text
    Exemple : [SEFi-t] GIE_SV - Traces_suivi_SEFi_recevabilité période
    du 20170901 au 20170930 : 111111111
    ```

**<u>Le nom du fichier</u>** sera de la forme suivante :
SEFi-t_traces-CR _< nom du logiciel>_<version du logiciel>_<UUID>_<N°AM>_<date de création du fichier>_<incrément>. csv

Où :
*   Nom du logiciel + version : Nom et version déclaré au CNDA lors des tests
*   L’UUID est l’identifiant unique de l’instance du logiciel
*   N° AM du transporteur
*   Date de création du fichier au format YYYYMMDD
*   L’incrément est un numéro d’ordre du fichier (incrémenté de 1 en 1 à chaque nouveau fichier créé)

```text
Exemple :SEFi-t_traces-CR_ADEMIS_V3_2404a520-e12b-3ad4-a710-
64562a440120-111111111_20170930_1.csv
```

Le fichier comportera les colonnes suivantes :

<table>
  <thead>
    <tr>
      <th><b>Référence</b></th>
      <th><b>Libellé</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><i>EF_FTE52_01</i></strong></td>
      <td>Identifiant de facturation</td>
    </tr>
    <tr>
      <td><strong><i>Identifiant de la requête</i></strong></td>
      <td>MessageID de l’en-tête WS-Addressing de la requête(UUID)</td>
    </tr>
    <tr>
      <td><strong><i>IdTraceFTE</i></strong></td>
      <td>No d'ordre de l'enregistrement trace, incrémenté de 1 en 1 pour chaque requête/réponse.</td>
    </tr>
    <tr>
      <td><strong><i>DateHeureDemande</i></strong></td>
      <td>Horodatage du début de la demande de recevabilité faite sur le LPS (action de demander le contrôle de recevabilité).<br />Format AAAAMMJJhhmmssxxxxxx, où xxxxxx représente le nombre de micro secondes.</td>
    </tr>
  </tbody>
</table>

![logo: sesam-vitale](page_4_image_2_v2.jpg)
**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u>**
**4 / 5** **Réf. : PDT-INF-307**

![logo: l'Assurance Maladie](page_4_image_1_v2.jpg)

# Fiche d’information

<table>
    <tr>
      <td><strong><em>DateHeureRequeteWS_FT2Recevabilité</em></strong></td>
      <td>Horodatage de la requête au moment de l'appel au service par le LPS.<br />Format AAAAMMJJhhmmssxxxxxx, où xxxxxx représente le nombre de micro secondes.</td>
    </tr>
    <tr>
      <td><strong><em>DateHeureReponseWS_FT2Recevabilité</em></strong></td>
      <td>Horodatage de la réponse au moment de la réception par le progiciel.<br />Format AAAAMMJJhhmmssxxxxxx, où xxxxxx représente le nombre de micro secondes.</td>
    </tr>
    <tr>
      <td><strong><em>Top Certificat</em></strong></td>
      <td>Top présence certificat Oui (1) /Non (0)</td>
    </tr>
    <tr>
      <td><strong><em>EF_FTE50_11</em></strong></td>
      <td>Total des montants facturés</td>
    </tr>
    <tr>
      <td>Fault/Code/Value/subcode/Value</td>
      <td>Valeur de la balise &#x3C;value> du subcode du code de l’erreur de la soap fault.</td>
    </tr>
    <tr>
      <td>Attribut "Code" de Fault/Detail/Erreur</td>
      <td>Valeur de l’attribut « code » du détail de l’erreur de la soap fault.</td>
    </tr>
    <tr>
      <td><strong><em>Nombre de diagnostics</em></strong></td>
      <td>Calculer le nombre de diagnostics reçus</td>
    </tr>
    <tr>
      <td>FACTURE/DIAGNOSTIC/Code</td>
      <td>Valeur de la balise &#x3C;code> du diagnostic de la facture.</td>
    </tr>
    <tr>
      <td>FACTURE/DIAGNOSTIC/Libelle</td>
      <td>Valeur de la balise &#x3C;Libelle> du diagnostic de la facture.</td>
    </tr>
    <tr>
      <td>TRSP/DIAGNOSTIC/Code</td>
      <td>Valeur de la balise &#x3C;code> du diagnostic du trajet.</td>
    </tr>
    <tr>
      <td>TRSP/DIAGNOSTIC/Libelle</td>
      <td>Valeur de la balise &#x3C;Libelle> du diagnostic du trajet.</td>
    </tr>
</table>

### Exemples de traces :

```text
992500251:82db13db-270c-4ebb-b932-
35ea105a8eed;1;20140626172068000000;20140626172268000000;20140626172270000000;0;;siram_10
;smir_20 ;0;;
992500251;82db13db-270c-4ebb-b932-
35ea105a8eed;2;20140626175050100000;20140626175350100000;20140626175351800000;0;;
;;2;ERR_FT065;ERR_PS_012
992500251;82db13db-270c-4ebb-b932-
35ea105a8eed;3;20140626175001800000;20140626175401800000;20140626175404200000;1;105,55;;;0;
;
```

![logo: sesam-vitale](page_5_image_2_v2.jpg)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u>

**5 / 5**

**Réf. : PDT-INF-307**


![logo: L'Assurance Maladie Caisse Nationale](page_5_image_1_v2.jpg)