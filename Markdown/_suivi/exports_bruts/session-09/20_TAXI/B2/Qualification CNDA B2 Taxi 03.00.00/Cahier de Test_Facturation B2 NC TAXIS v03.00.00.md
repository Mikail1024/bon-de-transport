![logo: CNDA](page_1_image_1_v2.jpg)

# Facturation B2
## Nouvelle Convention TAXIS

---

### CAHIER DE TESTS DE CONFORMITE

# **Facturation B2 Nouvelle Convention TAXIS**
## *Cahier de tests de conformité*

<table>
    <tr>
      <td><i>Version</i></td>
      <td>03.00.00</td>
    </tr>
    <tr>
      <td><i>Date</i></td>
      <td>12/02/2026</td>
    </tr>
    <tr>
      <td><i>Référence</i></td>
      <td>CNAM CDC Convention TAXIS V3.0</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th colspan="5"><b>HISTORIQUE DES VERSIONS</b></th>
    </tr>
    <tr>
      <th>DATE</th>
      <th>VERSION CAHIER <b>de TESTS</b></th>
      <th>VERSION CAHIER <b>des CHARGES</b></th>
      <th><b>EVOLUTION DU DOCUMENT</b></th>
      <th><b>REDACTEUR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>29/08/2025</td>
      <td>01.02.00</td>
      <td>V1.2</td>
      <td>Création</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/10/2025</td>
      <td>02.01.00</td>
      <td>V2.1</td>
      <td>Ajout d’information concernant le formulaire de facturation papier (cf. Consignes générales)<br />Ajout coordonnées bénéficiaires (Nom, prénom, adresse postale)<br />Mise à jour formalisme des suppléments forfaitaires<br />Mise à jour montants péages (trajets partagés)<br />Cas 16 : correction de la nature d'assurance : maternité au lieu de maladie<br />Ajout CAS 24<br />Changement NIR et contenu du Test Technique<br />Ajout du Nom prénom du conducteur sur les trajets<br />Ajout du Test « Sécurisation des données de facturation »<br />Ajour de données complémentaires pour les cas de facturation papier (raison sociale, adresse postale, nom prénom prescripteur, N°ADS etc.)</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/10/2025</td>
      <td>02.01.01</td>
      <td>V2.1</td>
      <td><u>Consignes</u> : modification du numéro RPPS du prescripteur et ajout du nom et prénom du prescripteur<br /><u>Mémento</u> : nom et code centre de paiement, nom et prénom prescripteur, raison sociale et adresse de la société de taxi, correction de la clé du N° RPPS, modification des numéros d'ADS<br /><u>Références documentaires</u> : ajout du support de facturation CNAM 606b-09/2025 dans le package<br /><u>Tous les cas</u> :<br />  - suppression de la notion de département d'ADS<br />  - ajout du nom et prénom du conducteur<br /><u>Cas 15, 16, 19, 23, 24</u> : ajout du numéro d'ADS et adresses complètes des lieux de départ et d'arrivée.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/10/2025</td>
      <td>02.01.02</td>
      <td>V2.1</td>
      <td><u>Cas 14</u> : correction du montant péage par patient</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/11/2025</td>
      <td>02.01.03</td>
      <td>V2.1</td>
      <td>Suppression du CP 21 et du CNP 03, renumérotation des cas<br />Consignes pour la constitution et envoi des flux : précision sur la valorisation du <u><b>centre informatique</b></u><br />Mise à jour des « Références documentaires »</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>12/12/2025</td>
      <td>02.01.04</td>
      <td>V2.1</td>
      <td>Consignes concernant le numéro de SIRET prescripteur à utiliser</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>12/02/2026</td>
      <td>03.00.00</td>
      <td>V3.0</td>
      <td>Nouvelle version Cahier des Charges<br />Consignes générales : précisions sur le déroulé de la phase d’examen</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

# <u>**Table des matières**</u>

<table>
    <tr>
      <td><strong><b>CONSIGNES</b> :</strong> ..............................................................................................................................................................................................</td>
      <td>5</td>
    </tr>
    <tr>
      <td><strong><b>MEMENTO</b> :</strong> ……………………………. ................................................................................................................................................................</td>
      <td>7</td>
    </tr>
    <tr>
      <td><strong><b>REFERENCES DOCUMENTAIRES</b> :</strong>................................................................................................................................................................</td>
      <td>8</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><strong><b>CAS PASSANTS DE FACTURATION</b></strong></td>
      <td></td>
    </tr>
    <tr>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td>Cas 01 .......................................................................................................................................................................................................</td>
      <td>10</td>
    </tr>
    <tr>
      <td>Cas 02 : .....................................................................................................................................................................................................</td>
      <td>11</td>
    </tr>
    <tr>
      <td>Cas 03 : .....................................................................................................................................................................................................</td>
      <td>12</td>
    </tr>
    <tr>
      <td>Cas 04 : .....................................................................................................................................................................................................</td>
      <td>13</td>
    </tr>
    <tr>
      <td>Cas 05 : .....................................................................................................................................................................................................</td>
      <td>14</td>
    </tr>
    <tr>
      <td>Cas 06 : .....................................................................................................................................................................................................</td>
      <td>15</td>
    </tr>
    <tr>
      <td>Cas 07 : .....................................................................................................................................................................................................</td>
      <td>16</td>
    </tr>
    <tr>
      <td>Cas 08 : .....................................................................................................................................................................................................</td>
      <td>17</td>
    </tr>
    <tr>
      <td>Cas 09 : .....................................................................................................................................................................................................</td>
      <td>18</td>
    </tr>
    <tr>
      <td>Cas 10 : .....................................................................................................................................................................................................</td>
      <td>19</td>
    </tr>
    <tr>
      <td>Cas 11 : .....................................................................................................................................................................................................</td>
      <td>20</td>
    </tr>
    <tr>
      <td>Cas 12 : .....................................................................................................................................................................................................</td>
      <td>21</td>
    </tr>
    <tr>
      <td>Cas 13 : .....................................................................................................................................................................................................</td>
      <td>22</td>
    </tr>
    <tr>
      <td>Cas 14 .......................................................................................................................................................................................................</td>
      <td>23</td>
    </tr>
</table>

<table>
    <tr>
      <td>Cas 15 : .....................................................................................................................................................................................................</td>
      <td>24</td>
    </tr>
    <tr>
      <td>Cas 15 Bis : ................................................................................................................................................................................................</td>
      <td>26</td>
    </tr>
    <tr>
      <td>Cas 16 : .....................................................................................................................................................................................................</td>
      <td>27</td>
    </tr>
    <tr>
      <td>Cas 17 : .....................................................................................................................................................................................................</td>
      <td>29</td>
    </tr>
    <tr>
      <td>Cas 18 : .....................................................................................................................................................................................................</td>
      <td>30</td>
    </tr>
    <tr>
      <td>Cas 19 : .....................................................................................................................................................................................................</td>
      <td>31</td>
    </tr>
    <tr>
      <td>Cas 20 : .....................................................................................................................................................................................................</td>
      <td>32</td>
    </tr>
    <tr>
      <td>Cas 21 : .....................................................................................................................................................................................................</td>
      <td>33</td>
    </tr>
    <tr>
      <td>Cas 22 : .....................................................................................................................................................................................................</td>
      <td>34</td>
    </tr>
    <tr>
      <td>Cas 23 : .....................................................................................................................................................................................................</td>
      <td>36</td>
    </tr>
    <tr>
      <td colspan="2"><b><b>CAS NON PASSANTS</b></b></td>
    </tr>
    <tr>
      <td>Cas NP 01 : ................................................................................................................................................................................................</td>
      <td>38</td>
    </tr>
    <tr>
      <td>Cas NP 02 : .................................................................................................................................................................................................</td>
      <td>39</td>
    </tr>
    <tr>
      <td>Cas NP 03 : .................................................................................................................................................................................................</td>
      <td>40</td>
    </tr>
    <tr>
      <td colspan="2"><b><b>TEST TECHNIQUE - Gestion des Retours</b></b></td>
    </tr>
    <tr>
      <td>Test Technique : Gestion des Messages de service .....................................................................................................................................</td>
      <td>42</td>
    </tr>
    <tr>
      <td colspan="2"><b><b>SECURISATION des DONNEES de FACTURATION</b></b></td>
    </tr>
    <tr>
      <td>Règles de traçabilité des mises à jour de données .....................................................................................................................................</td>
      <td>44</td>
    </tr>
</table>

# <u>**CONSIGNES**</u> :

## <u>**Consignes générales :**</u>

⇒ Pour tous les <u>cas passants</u> fournir :
* les fichiers B2.
* Et le support de facturation papier (volet destiné à l'organisme de paiement) et, le cas échant son annexe [réf. CNAM 606b-09/2025] pour les tests concernés.

⇒ Pour tous les <u>cas non passants,</u> aucun flux de facturation n’est attendu. Fournir les explications sur les contrôles mis en place par le logiciel et fournir, le cas échéant les copies d’écran des messages d’erreur affichés à l’utilisateur.

⇒ Pour le test technique fournir les éléments mettant en évidence la prise en compte des retours par le logiciel.

⇒ Pour la PHASE de CONFORMITE : lors de cette phase, les factures doivent être saisies, et non préparées à l'avance (hormis, éventuellement, les fiches patients / prescripteurs) de façon à vérifier le bon fonctionnement des méthodes de facturations, au plus proche des conditions réelles des utilisateurs finaux.

## <u>**Consignes saisie des factures :**</u>

⇒ Utiliser le données tarifaires de la [Convention Cadre : https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000052060568](https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000052060568).

⇒ Utiliser le CDC de la norme B2 juin 2007 et Annexe « Facturation Taxis » Norme B2 07/2021 : [https://www.ameli.fr/taxi-conventionne/documentation-technique](https://www.ameli.fr/taxi-conventionne/documentation-technique)

⇒ Utiliser le Régime Caisse Centre [Type 2] : 01 348 9881. Pour les cas de facture papier mentionner « CNDA TESTS » en tant que nom de de centre de paiement.

⇒ Pour les besoins des tests, le rang de naissance est valorisé à 1.

⇒ Utiliser le numéro de PRESCRIPTEUR : 991005000 (spécialité : 01) - RPPS 11111119910 - NOM Prénom : GENE Alain avec une date de prescription au 01/07/2025.

⇒ Utiliser votre numéro de facturation PS (fourni par le CNDA) et les caractéristiques en Memento. Pour les cas de factures papiers mentionner « TAXIS CNDA » en tant que raison sociale de l’entreprise de taxi et comme adresse « 3 place de la gare 38000 Grenoble ».

⇒ Utiliser le numéro de SIRET (fourni par le CNDA dans votre plan de tests personnalisé) pour la structure dans laquelle le PS a prescrit [Type 2E]. Pour les cas de factures papiers, mentionner « L’identifiant structure (n°AM, FINESS ou SIRET) » avec ce numéro.

# <u>**CONSIGNES**</u> :

## <u>**Consignes pour la constitution et envoi des flux :**</u>

⇒ Pour faciliter le traitement de votre dossier il serait souhaitable de transmettre les factures, une par une (i-e une facture, un lot, un fichier)

⇒ Pour la valorisation du numéro de destinataire [Type 0 - position 28-41], veuillez vous reporter au document de Création du Fichier logique de Facturation AMO (cf. ETS-DT-003_Création du fichier logique de facturation AMO et traitement des retours)

* Dans le cadre des **tests CNDA**, le **<u>centre informatique</u>** doit être valorisé à « **<u>000</u>** »

* En **production**, vous devez utiliser la **[table des organismes (TOD)](https://www.sesam-vitale.fr/web/sesam-vitale/tod-table-des-organismes-destinataires-etpt)** présente sur le site du **GIE SESAM-Vitale**

⇒ Pour la valorisation du numéro d’agrément [Type 6 - position 61-72], veuillez-vous reporter au volet technique des tests à distance (cf. références documentaires).

⇒ Transmettre en mode TEST les flux B2 sur la plateforme de test du CNDA, (cf. ETS-DT-001_TransportsFlux_SpecsTechCommune).

⇒ S’assurer que les flux B2 ont reçu un RSP de paiement avant le dépôt de la demande de conformité (le délai de réception est de 48h après émission - jours ouvrés)

⇒ Compléter le Plan de Tests à **chaque nouveau dépôt de dossier** avec les informations (Numéro de facturation PS, numéro de facture, numéro de lot et date de transmission).

# **<u>MEMENTO</u> :**

<table>
  <thead>
    <tr>
      <th colspan="2">ORGANISME<br />d'AFFILIATION des ASSURES</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>REGIME</td>
      <td>01</td>
    </tr>
    <tr>
      <td>CAISSE</td>
      <td>348</td>
    </tr>
    <tr>
      <td>CENTRE</td>
      <td>9881</td>
    </tr>
    <tr>
      <td>NOM CENTRE DE PAIEMENT</td>
      <td>CNDA TEST</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th colspan="2">PRESCRIPTEUR</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>NOM Prénom</td>
      <td>GENE Alain</td>
    </tr>
    <tr>
      <td>Numéro AM</td>
      <td>991005000</td>
    </tr>
    <tr>
      <td>RPPS</td>
      <td>11111119910</td>
    </tr>
    <tr>
      <td>Spécialité</td>
      <td>01</td>
    </tr>
    <tr>
      <td>Date de prescription</td>
      <td>01/07/2025</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th rowspan="2"></th>
      <th colspan="4"><b>SOCIETE DE TAXIS</b></th>
      <th><b>VEHICULE</b></th>
      <th colspan="4"><b>AUTORISATION DE STATIONNEMENT (ADS)</b></th>
      <th>ORGANISME LOCAL D'AM DE L'ADS</th>
    </tr>
    <tr>
      <th>RAISON SOCIALE</th>
      <th>ADRESSE</th>
      <th>SPECIALITE</th>
      <th>CAISSE DE RATTACHEMENT</th>
      <th>NUMERO D'IMMATRICULATION</th>
      <th>NUMERO D'ADS</th>
      <th>CODE COMMUNE D'ADS</th>
      <th>LIBELLE COMMUNE</th>
      <th>DEPARTEMENT D'ADS</th>
      <th>CODE CAISSE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="6">Votre N°<br />AM</td>
      <td rowspan="6">TAXIS CNDA</td>
      <td rowspan="6">3 Pl. de la Gare<br />38000 Grenoble</td>
      <td rowspan="6">56</td>
      <td rowspan="6">381</td>
      <td>AD-001-EF</td>
      <td>381851</td>
      <td>38185</td>
      <td>38-GRENOBLE</td>
      <td>38</td>
      <td>381</td>
    </tr>
    <tr>
      <td>AD-002-FG</td>
      <td>380531</td>
      <td>38053</td>
      <td>38-BOURGOIN-JAILLEU</td>
      <td>38</td>
      <td>381</td>
    </tr>
    <tr>
      <td>AD-003-GH</td>
      <td>385092</td>
      <td>38509</td>
      <td>38-LA-TOUR-DU-PIN</td>
      <td>38</td>
      <td>381</td>
    </tr>
    <tr>
      <td>AD-005-IJ</td>
      <td>384853</td>
      <td>38485</td>
      <td>38-SEYSSINET-PARISET</td>
      <td>38</td>
      <td>381</td>
    </tr>
    <tr>
      <td>BC-006-JK</td>
      <td>691234</td>
      <td>69123</td>
      <td>69-LYON</td>
      <td>69</td>
      <td>691</td>
    </tr>
    <tr>
      <td>CD-007-KL</td>
      <td>263625</td>
      <td>26362</td>
      <td>26-VALENCE</td>
      <td>26</td>
      <td>261</td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><b>TARIF KM</b><br /><b>DE BASE</b><br /><sub>(HORS ALLER</sub> OU RETOUR A VIDE)</th>
      <th>CODE CAISSE<br />ORGANISME LOCAL D'AM DE L'ADS</th>
      <th><b>SEUIL KILOMETRIQUE</b><br />DE <b>TRAJET SEUL</b></th>
      <th>CODE CAISSE<br />ORGANISME LOCAL D'AM DE<br />L'ADS</th>
      <th>SUPPLEMENT<br />FORFAITAIRE TAXI<br /><b>N° 01</b></th>
      <th>SUPPLEMENT<br />FORFAITAIRE TAXI<br /><b>N° 02</b></th>
      <th>SUPPLEMENT<br />FORFAITAIRE TAXI<br /><b>N° 03</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="3">Cf. dernière Convention</td>
      <td>261</td>
      <td>30</td>
      <td>261</td>
      <td>5,81 €</td>
      <td>7,81 €</td>
      <td>9,81 €</td>
    </tr>
    <tr>
      <td>381</td>
      <td>33</td>
      <td>381</td>
      <td>7,11 €</td>
      <td>9,11 €</td>
      <td>11,11 €</td>
    </tr>
    <tr>
      <td>691</td>
      <td>35</td>
      <td>691</td>
      <td>12,11 €</td>
      <td>14,11 €</td>
      <td>16,11 €</td>
    </tr>
  </tbody>
</table>

# <u>**REFERENCES DOCUMENTAIRES**</u> :

## <u>**Documentation sur Ameli :**</u> ( [https://www.ameli.fr/taxi-conventionne/documentation-technique](https://www.ameli.fr/taxi-conventionne/documentation-technique) )

*   CDC à l'attention des éditeurs de logiciels de facturation B2 Taxis
*   Annexe 30
*   [CDC de la norme B2 juin 2007](https://www.ameli.fr/taxi-conventionne/documentation-technique/norme-b2)
*   Annexe « Facturation Taxis » Norme B2 07/2021

## <u>**Documentation sur le site du CNDA dans votre espace personnel :**</u>

*   Package Facturation B2 Nouvelle Convention TAXIS V03.00.00 comprenant :
    *   ◊ Cahier de Tests
    *   ◊ Le volet technique des tests à distance
    *   ◊ Support de facturation papier « FACTURE DE TRANSPORT EN TAXI CONVENTIONNÉ » [réf. CNAM 606b-09/2025]
*   Plan de Tests à compléter et à fournir à chaque dépôt en phase de pré examen

*Pour toutes vos **questions** sur le présent **Cahier de Test** contacter le **support du CNDA** : support.cnda@assurance-maladie.fr*

*Pour toute **autre question** contacter le **support de la MOA de la CNAM** : [equipe-sefi.cnam@assurance-maladie.fr](mailto:equipe-sefi.cnam@assurance-maladie.fr)*

# **CAS PASSANTS DE FACTURATION**

# *<u>**CAS 01**</u>*

[x] **B2** [ ] **Support Papier**

---

## *<u>**Contexte bénéficiaire**</u>* :
**NIR :** 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## *<u>**Référence documentaire**</u>* :
FORFAIT § 2.4.1,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-La-Tour-Du-Pin</td>
      <td>38-Saint-Jean-de-Soudain</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38509</td>
      <td>38401</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>10h05</td>
      <td>DISTANCE PARCOURUE</td>
      <td>2 Km</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-003-GH</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38509</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>SI T PARTAGE : TRAJET SEUL > <strong><b>33 KM</b></strong></td>
      <td>N</td>
    </tr>
  </tbody>
</table>

[x] **B2** [ ] **Support Papier**

# <u>***CAS 02***</u>



## <u>***Contexte bénéficiaire***</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>***Référence documentaire***</u> :

FORFAIT § 2.4.1,
MONTANT KM § 2.4.2,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Seyssinet-Pariset</td>
      <td>38-Grenoble</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38485</td>
      <td>38185</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>10h09</td>
      <td>DISTANCE PARCOURUE</td>
      <td>3 Km</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td colspan="2"><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-005-IJ</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td colspan="2"><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td colspan="2"><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38485</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td colspan="2" rowspan="2"><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td rowspan="2">381 - CPAM de l’ISERE</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <strong><b>33 KM</b></strong></td>
      <td>N</td>
    </tr>
  </tbody>
</table>

[x] **B2** [ ] **Support Papier**

# <u>***CAS 03***</u>

## <u>***Contexte bénéficiaire***</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>***Référence documentaire***</u> :
MONTANT KM § 2.4.2,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>38053</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h07</td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
  </tbody>
</table>

12

# <u>***CAS 04***</u> [x] **B2** [ ] **Support Papier**

## <u>***Contexte bénéficiaire***</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>***Référence documentaire***</u> :
MONTANT KM § 2.4.2,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

[x] **B2** [ ] **Support Papier**

# <u>**CAS 05**</u>

***

## <u>***Contexte bénéficiaire***</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>***Référence documentaire***</u> :
SUPPLEMENT FORFAITAIRE § 2.4.4,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

***

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h51</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38035</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>97 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

[x] **B2** [ ] **Support Papier**

# <u>***CAS 06***</u>

***<u>Contexte bénéficiaire</u> :*** | ***<u>Référence documentaire</u> :***
--- | ---
NIR : 1 79 02 63 220 417 03 | PEAGE § 2.4.6,
Date de naissance : 01/02/1979 | ACTE TARIFANT § 3.1,
Nom : HOPITAL CNDA | COEFFICIENT ACTE TARIFANT B2 § 3.3.6
Prénom : CINQUANTB |
Adresse : 515, AV. G. FRECHE |
              34170 CASTELNAU LE LEZ |



> • Nature d’assurance : Maladie
> • Sans exonération



<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>10h00</td>
      <td>11h21</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38035</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>15.20€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

# <u>***CAS 07***</u> [x] **B2** [ ] **Support Papier**

---

## <u>***Contexte bénéficiaire***</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

• Nature d’assurance : Maladie
• Sans exonération

## <u>***Référence documentaire***</u> :
TPMR § 2.4.7 ,
ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h51</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38035</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>97 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

**<u>*CAS 08*</u>** [x] **B2** [ ] **Support Papier**

---

## **<u>*Contexte bénéficiaire*</u> :**
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## **<u>*Référence documentaire*</u> :**
MAJORATION NU OU DI / JF § 2.4.3, PEAGE § 2.4.6,
TPMR § 2.4.7, ACTE TARIFANT § 3.1,
VALORISATION des TYPES 4 des ACTES TRACEURS §
3.3.6

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>20h00</td>
      <td>21h21</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38035</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>15.20€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

17

[x] **B2** [ ] **Support Papier**

# <u>*CAS 09*</u>



## <u>*Contexte bénéficiaire*</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ



• Nature d’assurance : Maladie
• Sans exonération



## <u>*Référence documentaire*</u> :
MAJORATION NU OU DI / JF § 2.4.3, PEAGE § 2.4.6,
TPMR § 2.4.7, ACTE TRACEUR § 3.2, VALORISATION
des TYPES 4 des ACTES TRACEURS § 3.3.6



<table>
  <thead>
    <tr>
      <th><u><strong>TRAJET</strong></u></th>
      <th><strong><b>DEPART</b></strong></th>
      <th><strong><b>ARRIVEE</b></strong></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h21</td>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-002-FG</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>15.20€</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38035</td>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>SI T PARTAGE : TRAJET SEUL > <strong><b>33 KM</b></strong></td>
      <td>N</td>
    </tr>
  </tbody>
</table>

# *<u>**CAS 10**</u>* [x] **B2** [ ] **Support Papier**

## *<u>**Contexte bénéficiaire**</u>* :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

• Nature d’assurance : Maladie
• Sans exonération

## *<u>**Référence documentaire**</u>* :
COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6, TPMR § 2.4.7, ACTE TRACEUR § 3.2,
VALORISATION des TYPES 4 des ACTES TRACEURS §
3.3.6

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h21</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38035</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>2</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>7.60€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

[x] **B2** [ ] **Support Papier**

# <u>CAS 11</u>



---



## <u>*Contexte bénéficiaire*</u> :
NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ



> • Nature d’assurance : Maladie
> • Sans exonération

## *<u>Référence documentaire</u>* :
COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6, TPMR § 2.4.7, ACTE TRACEUR § 3.2,
VALORISATION des TYPES 4 des ACTES TRACEURS §
3.3.6



---



<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>69-Lyon</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>69123</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h16</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
<tr>
<td>REFUS TRANSPORT PARTAGE</td>
<td>N</td>
</tr>
<tr>
<td>TIERS PAYANT</td>
<td>TP AMO SEUL</td>
</tr>
<tr>
<td>DISTANCE PARCOURUE</td>
<td>106 Km</td>
</tr>
<tr>
<td>NOMBRE DE MALADES</td>
<td>4</td>
</tr>
<tr>
<td>N° SUPPLEMENT FORFAITAIRE</td>
<td>01 - 03</td>
</tr>
<tr>
<td>PEAGE (MONTANT PAR PATIENT)</td>
<td>3.40€</td>
</tr>
<tr>
<td>TPMR</td>
<td>O</td>
</tr>
<tr>
<td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
<td>O</td>
</tr>
<tr>
<td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
<td>N</td>
</tr>
</table>

<u>**_CAS 12_**</u> [x] **B2** [ ] **Support Papier**

<u>**_Contexte bénéficiaire_**</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d'assurance : Maladie
* Sans exonération

<u>**_Référence documentaire_**</u> :

COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6, TPMR § 2.4.7, ACTE TRACEUR § 3.2,
VALORISATION des TYPES 4 des ACTES TRACEURS §
3.3.6

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>LIEU</b></b></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><b><b>Code INSEE</b></b></td>
      <td>38053</td>
      <td>26362</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b><b>DATE</b></b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><b><b>HEURE</b></b></td>
      <td>10h00</td>
      <td>11h21</td>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td colspan="3" rowspan="2"></td>
      <td>NOMBRE DE MALADES</td>
      <td>3</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td></td>
      <td><b><b>N° IMMATRICULATION VEHICULE</b></b></td>
      <td>AD-002-FG</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>5.07€</td>
    </tr>
    <tr>
      <td></td>
      <td><b><b>NOM Prénom CONDUCTEUR</b></b></td>
      <td>MARTIN Jean</td>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td></td>
      <td><b><b>COMMUNE d’ADS</b></b></td>
      <td>38035</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><b><b>ORGANISME LOCAL d’ADS</b></b></td>
      <td>381 - CPAM de l’ISERE</td>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>O</td>
    </tr>
  </tbody>
</table>

# <u>***CAS 13***</u> [x] **B2** [ ] **Support Papier**

***<u>Contexte bénéficiaire</u> :*** | ***<u>Référence documentaire</u> :***
:--- | :---
NIR : 1 79 02 63 220 417 03 | MAJORATION NU OU DI / JF § 2.4.3, COEFFICIENT
Date de naissance : 01/02/1979 | ABATTEMENT T partagé § 2.4.5, PEAGE § 2.4.6, TPMR §
Nom : HOPITAL CNDA | 2.4.7, ACTE TRACEUR § 3.2, VALORISATION des TYPES
Prénom : CINQUANTB | 4 des ACTES TRACEURS § 3.3.6
Adresse : 515, AV. G. FRECHE | &bull; Nature d'assurance : Maladie
              34170 CASTELNAU LE LEZ | &bull; Sans exonération

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
      <td rowspan="2"></td>
      <td rowspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>20h00</td>
      <td>21h21</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td colspan="3" rowspan="6"></td>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>3</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>5.07€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-002-FG</td>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td colspan="2" rowspan="3"></td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38035</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
  </tbody>
</table>

[x] **B2** [ ] **Support Papier**

# <u>**CAS 14**</u>

---

## <u>***Contexte bénéficiaire***</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

• Nature d’assurance : Maladie
• Sans exonération

## <u>***Référence documentaire***</u> :

MAJORATION NU OU DI / JF § 2.4.3,
COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6,
TPMR § 2.4.7,

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>69-Lyon</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>69123</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h16</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>106 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>4</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01 - 03</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>3.40€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>O</td>
    </tr>
</table>

[x] **B2** [x] **Support Papier**

# <u>**CAS 15** - **3 Trajets**</u>

## <u>***Contexte bénéficiaire***</u> :

NIR : 2 75 12 26 220 075 01
Date de naissance : 21/12/1975
Nom : HOPITAL CNDA
Prénom : ONZE
Adresse : 515, CHE. DU MAS DE ROCHET
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération
* C2S

## <u>***Référence documentaire***</u> :

MAJORATION NU OU DI / JF § 2.4.3,
COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6, TPMR § 2.4.7, MODALITES
REMPLISSAGE FORMULAIRE PAPIER ET ANNEXE §5,
ZONE "TRANSPORT EFFECTUE" §5.1.4

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°1</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <td>CH de Valence<br />179 Bd Maréchal Juin<br />26000 Valence</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h51</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td>380531</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>97 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b><b>33 KM</b></b></td>
      <td>N</td>
    </tr>
</table>

# <u>**TRAJET N°2**</u>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°2</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>LIEU</strong></td>
      <td>CH de Valence<br />179 Bd Maréchal Juin<br />26000 Valence</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><strong>Code INSEE</strong></td>
      <td>26362</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong>DATE</strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong>HEURE</strong></td>
      <td>20h00</td>
      <td>21h21</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong>N° IMMATRICULATION VEHICULE</strong></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><strong>NOM Prénom CONDUCTEUR</strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong>COMMUNE d’ADS</strong></td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong>N°ADS</strong></td>
      <td>380531</td>
    </tr>
    <tr>
      <td><strong>ORGANISME LOCAL d’ADS</strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>3</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>5.07€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

***

# <u>**TRAJET N°3**</u>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°3</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>LIEU</th>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <td>CH de Valence<br />179 Bd Maréchal Juin<br />26000 Valence</td>
    </tr>
    <tr>
      <th>Code INSEE</th>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <th>DATE</th>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
    </tr>
    <tr>
      <th>HEURE</th>
      <td>10h00</td>
      <td>11h21</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <th>N° IMMATRICULATION VEHICULE</th>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <th>NOM Prénom CONDUCTEUR</th>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <th>COMMUNE d’ADS</th>
      <td>38053</td>
    </tr>
    <tr>
      <th>N°ADS</th>
      <td>380531</td>
    </tr>
    <tr>
      <th>ORGANISME LOCAL d’ADS</th>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>4</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>3.80€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>O</td>
    </tr>
</table>

# <u>***CAS 15 BIS***</u> [x] **B2** [ ] **Support Papier**

---

## <u>***Contexte bénéficiaire***</u> :
NIR : 2 75 12 26 220 075 01
Date de naissance : 21/12/1975
Nom : HOPITAL CNDA
Prénom : ONZE
Adresse : 515, CHE. DU MAS DE ROCHET
         34170 CASTELNAU LE LEZ

* [x] Nature d’assurance : Maladie
* [x] Sans exonération
* [x] C2S

## <u>***Référence documentaire***</u> :
MONTANT KM § 2.4.2,
SUPPLEMENT FORFAITAIRE § 2.4.4

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>26-Valence</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>26362</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h51</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>97 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>30 KM</b></td>
      <td>N</td>
    </tr>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>CD-007-KL</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>261 - CPAM de la DRÔME</td>
    </tr>
</table>

[x] **B2** [x] **Support Papier**

# <u>**CAS 16** </u> - <u>**5 Trajets** </u>

## <u>***Contexte bénéficiaire***</u> :
NIR : 2 74 03 26 220 056 22
Date de naissance : 15/03/1974
Nom : HOPITAL CNDA
Prénom : DEUX
Adresse : 515, CHE. DU MAS DE ROCHET
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maternité
* Date de maternité (DPG) : 01/02/2025

## <u>***Référence documentaire***</u> :
MAJORATION NU OU DI / JF § 2.4.3,
COEFFICIENT ABATTEMENT T partagé § 2.4.5,
PEAGE § 2.4.6, TPMR § 2.4.7, MODALITES
REMPLISSAGE FORMULAIRE PAPIER ET ANNEXE
§5, ZONE "TRANSPORT EFFECTUE" §5.1.4

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°1</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>LIEU</td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Centre Léon Bérard,<br />28 Rue Laënnec - 69008 Lyon</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>Code INSEE</td>
      <td>38185</td>
      <td>69123</td>
      <td>DISTANCE PARCOURUE</td>
      <td>106 Km</td>
    </tr>
    <tr>
      <td>DATE</td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>2</td>
    </tr>
    <tr>
      <td>HEURE</td>
      <td>10h00</td>
      <td>11h16</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>N° IMMATRICULATION VEHICULE</td>
      <td colspan="2">AD-001-EF</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>6.80€</td>
    </tr>
    <tr>
      <td>NOM Prénom CONDUCTEUR</td>
      <td colspan="2">MARTIN Jean</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>COMMUNE d’ADS</td>
      <td colspan="2">38185</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>N°ADS</td>
      <td colspan="2">381851</td>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>O</td>
    </tr>
    <tr>
      <td>ORGANISME LOCAL d’ADS</td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°2</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>LIEU</th>
      <td>Centre Léon Bérard<br />28 Rue Laënnec - 69008 Lyon</td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <th>TIERS PAYANT</th>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <th>Code INSEE</th>
      <td>69123</td>
      <td>38185</td>
      <th>DISTANCE PARCOURUE</th>
      <td>106 Km</td>
    </tr>
    <tr>
      <th>DATE</th>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
      <th>NOMBRE DE MALADES</th>
      <td>2</td>
    </tr>
    <tr>
      <th>HEURE</th>
      <td>10h00</td>
      <td>11h16</td>
      <th>N° SUPPLEMENT FORFAITAIRE</th>
      <td>01 - 03</td>
    </tr>
    <tr>
      <th colspan="3"></th>
      <th>PEAGE (MONTANT PAR PATIENT)</th>
      <td>6.80€</td>
    </tr>
    <tr>
      <th>N° IMMATRICULATION VEHICULE</th>
      <td colspan="2">AD-001-EF</td>
      <th>TPMR</th>
      <td>N</td>
    </tr>
    <tr>
      <th>NOM Prénom CONDUCTEUR</th>
      <td colspan="2">MARTIN Jean</td>
      <th>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</th>
      <td>N</td>
    </tr>
    <tr>
      <th>COMMUNE d’ADS</th>
      <td colspan="2">38185</td>
      <th>SI T PARTAGE : TRAJET SEUL > 33 KM</th>
      <td>N</td>
    </tr>
    <tr>
      <th>N°ADS</th>
      <td colspan="2">381851</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <th>ORGANISME LOCAL d’ADS</th>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td colspan="2"></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°3</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Centre Léon Bérard<br />28 Rue Laënnec - 69008 Lyon</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>69123</td>
      <td>DISTANCE PARCOURUE</td>
      <td>106 Km</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>2</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>17h00</td>
      <td>18h16</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01 - 03</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>6.80€</td>
    </tr>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td colspan="2">AD-001-EF</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td colspan="2">MARTIN Jean</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td colspan="2">38185</td>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td colspan="2">381851</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td colspan="2"></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°4</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>LIEU</th>
      <td>Centre Léon Bérard<br />28 Rue Laënnec - 69008 Lyon</td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <th>TIERS PAYANT</th>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <th>Code INSEE</th>
      <td>69123</td>
      <td>38185</td>
      <th>DISTANCE PARCOURUE</th>
      <td>106 Km</td>
    </tr>
    <tr>
      <th>DATE</th>
      <td>15/07/2025</td>
      <td>15/07/2025</td>
      <th>NOMBRE DE MALADES</th>
      <td>4</td>
    </tr>
    <tr>
      <th>HEURE</th>
      <td>10h00</td>
      <td>11h16</td>
      <th>N° SUPPLEMENT FORFAITAIRE</th>
      <td>01 - 03</td>
    </tr>
    <tr>
      <th>N° IMMATRICULATION VEHICULE</th>
      <td colspan="2">AD-001-EF</td>
      <th>PEAGE (MONTANT PAR PATIENT)</th>
      <td>3.40€</td>
    </tr>
    <tr>
      <th>NOM Prénom CONDUCTEUR</th>
      <td colspan="2">MARTIN Jean</td>
      <th>TPMR</th>
      <td>N</td>
    </tr>
    <tr>
      <th>COMMUNE d’ADS</th>
      <td colspan="2">38185</td>
      <th>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</th>
      <td>O</td>
    </tr>
    <tr>
      <th>N°ADS</th>
      <td colspan="2">381851</td>
      <th>SI T PARTAGE : TRAJET SEUL > 33 KM</th>
      <td>O</td>
    </tr>
    <tr>
      <th>ORGANISME LOCAL d’ADS</th>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°5</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Centre Léon Bérard<br />28 Rue Laënnec, 69008 Lyon</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>69123</td>
      <td>DISTANCE PARCOURUE</td>
      <td>97 Km</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>15/07/2025</td>
      <td>15/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>20h00</td>
      <td>21h51</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>01 - 03</td>
    </tr>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td colspan="2">AD-001-EF</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td colspan="2">MARTIN Jean</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td colspan="2">38185</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td colspan="2">381851</td>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

# ***<u>CAS 17</u>*** [x] **B2** [ ] **Support Papier**

---

### ***<u>Contexte bénéficiaire</u> :***

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

---

### ***<u>Référence documentaire</u> :***

TIERS PAYANT CONTRE TRP partagé § 4.1, ACTE
TRACEUR TPR B2 § 4.2.2, COEFFICIENT ACTE TRACEUR
TRP § 4.2, DESTINATAIRE DE REGLEMENT FACTURE
TRP B2 § 4.2.2 , NORME B2 ORDRE TYPE 4A TPR
TRACEUR § 4.2.1

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>10h00</td>
      <td>11h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

[x] **B2** [ ] **Support Papier**

# *<u>**CAS 18**</u>*



## *<u>**Contexte bénéficiaire**</u>* :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

• Nature d’assurance : Maladie
• Sans exonération

## *<u>**Référence documentaire**</u>* :

TIERS PAYANT CONTRE TRP partagé § 4.1,
ACTE TRACEUR TPR B2 § 4.2.2, COEFFICIENT ACTE
TRACEUR TRP § 4.2, NORME B2 ORDRE TYPE 4A TPR
TRACEUR § 4.2.1,

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b><b>LIEU</b></b></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b><b>Code INSEE</b></b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b><b>DATE</b></b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b><b>HEURE</b></b></td>
      <td>20h00</td>
      <td>20h45</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>65 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>02</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>7.10€</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 <b>KM</b></td>
      <td>N</td>
    </tr>
</table>

<u>**CAS 19**</u> - <u>**2 Trajets**</u> [x] **B2** [x] **Support Papier**

<u>***Contexte bénéficiaire***</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

[x] Nature d’assurance : Maladie
[x] Sans exonération

<u>***Référence documentaire***</u> :

TIERS PAYANT CONTRE TRP partagé § 4.1,
ACTE TRACEUR TPR B2 § 4.2.2, COEFFICIENT ACTE
TRACEUR TRP § 4.2, NORME B2 ORDRE TYPE 4A TPR
TRACEUR § 4.2.1, DESTINATAIRE DE REGLEMENT
FACTURE TRP B2 § 4.2.2, MODALITES REMPLISSAGE
FORMULAIRE PAPIER ET ANNEXE §5, ZONE
"TRANSPORT EFFECTUE" §5.1.4

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°1</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>O</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
      <td>DISTANCE PARCOURUE</td>
      <td>65 Km</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>20h00</td>
      <td>20h45</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>02</td>
    </tr>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td colspan="2">AD-001-EF</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>7.10€</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td colspan="2">MARTIN Jean</td>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td colspan="2">38185</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td colspan="2">381851</td>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td></td>
      <td></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°2</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>O</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>LIEU</strong></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td><strong>Code INSEE</strong></td>
      <td>38185</td>
      <td>38053</td>
      <td>DISTANCE PARCOURUE</td>
      <td>65 Km</td>
    </tr>
    <tr>
      <td><strong>DATE</strong></td>
      <td>14/07/2025</td>
      <td>14/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td><strong>HEURE</strong></td>
      <td>10h00</td>
      <td>10h45</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>02</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>7.10€</td>
    </tr>
    <tr>
      <td><strong>N° IMMATRICULATION VEHICULE</strong></td>
      <td colspan="2">AD-001-EF</td>
      <td>TPMR</td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong>NOM Prénom CONDUCTEUR</strong></td>
      <td colspan="2">MARTIN Jean</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>O</td>
    </tr>
    <tr>
      <td><strong>COMMUNE d’ADS</strong></td>
      <td colspan="2">38185</td>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong>N°ADS</strong></td>
      <td colspan="2">381851</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong>ORGANISME LOCAL d’ADS</strong></td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td colspan="2"></td>
    </tr>
  </tbody>
</table>

<u>**_CAS 20_**</u> [x] **B2** [ ] **Support Papier**

## <u>**_Contexte bénéficiaire_**</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>**_Référence documentaire_**</u> :

TIERS PAYANT CONTRE TRP partagé § 4.1,
ACTE TRACEUR TPR B2 § 4.2.2, COEFFICIENT ACTE
TRACEUR TRP § 4.2, NORME B2 ORDRE TYPE 4A TPR
TRACEUR § 4.2.1, DESTINATAIRE DE REGLEMENT
FACTURE TRP B2 § 4.2.2

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th colspan="2"></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>38053</td>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h07</td>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td colspan="3"></td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td></td>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
      <td>SI T PARTAGE : TRAJET SEUL > <strong><b>33 KM</b></strong></td>
      <td>N</td>
    </tr>
  </tbody>
</table>

[x] **B2** [ ] **Support Papier**

# <u>**CAS 21**</u>



---

## <u>***Contexte bénéficiaire***</u> :

NIR : 2 75 12 26 220 075 01
Date de naissance : 21/12/1975
Nom : HOPITAL CNDA
Prénom : ONZE
Adresse : 515, CHE. DU MAS DE ROCHET
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération
* C2S

## <u>***Référence documentaire***</u> :

TIERS PAYANT CONTRE TRP partagé § 4.1

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong><b>LIEU</b></strong></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><strong><b>Code INSEE</b></strong></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong><b>DATE</b></strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong><b>HEURE</b></strong></td>
      <td>10h00</td>
      <td>11h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong><b>N° IMMATRICULATION VEHICULE</b></strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong><b>NOM Prénom CONDUCTEUR</b></strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong><b>COMMUNE d’ADS</b></strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong><b>ORGANISME LOCAL d’ADS</b></strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO &#x26; TP AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></td>
      <td>N</td>
    </tr>
</table>

[x] B2 [x] Support Papier

# <u>***CAS 22 - 4 Trajets***</u>

## <u>***Contexte bénéficiaire***</u> :
NIR : 2 75 12 26 220 075 01
Date de naissance : 21/12/1975
Nom : HOPITAL CNDA
Prénom : ONZE
Adresse : 515, CHE. DU MAS DE ROCHET
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération
* C2S

## <u>***Référence documentaire***</u> :
MAJORATION NU OU DI/JF § 2.4.3,
MODALITES REMPLISSAGE FORMULAIRE PAPIER ET
ANNEXE §5, ZONE "TRANSPORT EFFECTUE" §5.1.4

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°1</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th rowspan="2">LIEU</th>
      <td>3 Rue de la Liberté</td>
      <td>Rue de la Gare</td>
      <th>TIERS PAYANT</th>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>38000 Grenoble</td>
      <td>38300 Bourgoin-Jallieu</td>
      <th>DISTANCE PARCOURUE</th>
      <td>68 Km</td>
    </tr>
    <tr>
      <th>Code INSEE</th>
      <td>38185</td>
      <td>38053</td>
      <th>NOMBRE DE MALADES</th>
      <td>1</td>
    </tr>
    <tr>
      <th>DATE</th>
      <td>SAMEDI 05/07/2025</td>
      <td>SAMEDI 05/07/2025</td>
      <th>N° SUPPLEMENT FORFAITAIRE</th>
      <td>N</td>
    </tr>
    <tr>
      <th>HEURE</th>
      <td>19h00</td>
      <td>20h07</td>
      <th>PEAGE (MONTANT PAR PATIENT)</th>
      <td>N</td>
    </tr>
    <tr>
      <th>N° IMMATRICULATION VEHICULE</th>
      <td colspan="2">AD-001-EF</td>
      <th>TPMR</th>
      <td>N</td>
    </tr>
    <tr>
      <th>NOM Prénom CONDUCTEUR</th>
      <td colspan="2">MARTIN Jean</td>
      <th>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</th>
      <td>N</td>
    </tr>
    <tr>
      <th>COMMUNE d’ADS</th>
      <td colspan="2">38185</td>
      <th>SI T PARTAGE : TRAJET SEUL > 33 KM</th>
      <td>N</td>
    </tr>
    <tr>
      <th>N°ADS</th>
      <td colspan="2">381851</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <th>ORGANISME LOCAL d’ADS</th>
      <td colspan="2">381 - CPAM de l’ISERE</td>
      <td colspan="2"></td>
    </tr>
  </tbody>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°2</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>SAMEDI 12/07/2025</td>
      <td>SAMEDI 12/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>19h50</td>
      <td>20h57</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td>381851</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°3</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>LIEU</strong></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><strong>Code INSEE</strong></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong>DATE</strong></td>
      <td>DIMANCHE 20/07/2025</td>
      <td>DIMANCHE 20/07/2025</td>
    </tr>
    <tr>
      <td><strong>HEURE</strong></td>
      <td>07h00</td>
      <td>08h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

<table>
    <tr>
      <td><strong>N° IMMATRICULATION VEHICULE</strong></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><strong>NOM Prénom CONDUCTEUR</strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong>COMMUNE d’ADS</strong></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><strong>N°ADS</strong></td>
      <td>381851</td>
    </tr>
    <tr>
      <td><strong>ORGANISME LOCAL d’ADS</strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
  <thead>
    <tr>
      <th><u>TRAJET N°4</u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>3 Rue de la Liberté<br />38000 Grenoble</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <td>TIERS PAYANT</td>
      <td>TP AMO/AMC</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>DIMANCHE 27/07/2025</td>
      <td>DIMANCHE 27/07/2025</td>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>07h50</td>
      <td>08h57</td>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td colspan="3" rowspan="2"></td>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td colspan="2">AD-001-EF</td>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td colspan="2">MARTIN Jean</td>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td colspan="2">38185</td>
      <td colspan="2" rowspan="3"></td>
    </tr>
    <tr>
      <td><b>N°ADS</b></td>
      <td colspan="2">381851</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td colspan="2">381 - CPAM de l’ISERE</td>
    </tr>
  </tbody>
</table>

<u>***CAS 23***</u> [x] **B2** [x] **Support Papier**

---

## <u>*Contexte bénéficiaire*</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>*Référence documentaire*</u> :

MONTANT KM § 2.4.2, ACTE TARIFANT § 3.1,
COEFFICIENT ACTE TARIFANT B2 § 3.3.6, ACTE
TRACEUR TPR B2 § 4.2.2, MODALITES REMPLISSAGE
FORMULAIRE PAPIER ET ANNEXE §5, ZONE
"TRANSPORT EFFECTUE" §5.1.4

---

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
      <th>REFUS TRANSPORT PARTAGE</th>
      <td>N</td>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th rowspan="2"><b>LIEU</b></th>
      <td>Hôpital Fictif<br />160 Rue Léon Blum<br />69100 Villeurbanne</td>
      <td>Rue de la Gare<br />38300 Bourgoin-Jallieu</td>
      <th>TIERS PAYANT</th>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>FINESS 690123456<br /><i>Eligible Forfait Grande Ville</i></td>
      <td></td>
      <th>DISTANCE PARCOURUE</th>
      <td>44 Km</td>
    </tr>
    <tr>
      <th><b>Code INSEE</b></th>
      <td>69266</td>
      <td>38053</td>
      <th>NOMBRE DE MALADES</th>
      <td>1</td>
    </tr>
    <tr>
      <th><b>DATE</b></th>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
      <th>N° SUPPLEMENT FORFAITAIRE</th>
      <td>N</td>
    </tr>
    <tr>
      <th rowspan="4"><b>HEURE</b></th>
      <td rowspan="4">10h00</td>
      <td rowspan="4">10h40</td>
      <th>PEAGE (MONTANT PAR PATIENT)</th>
      <td>N</td>
    </tr>
    <tr>
      <th>TPMR</th>
      <td>N</td>
    </tr>
    <tr>
      <th>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</th>
      <td>N</td>
    </tr>
    <tr>
      <th>SI T PARTAGE : TRAJET SEUL > <b>33 KM</b></th>
      <td>N</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <th><b>N° IMMATRICULATION VEHICULE</b></th>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <th><b>NOM Prénom CONDUCTEUR</b></th>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <th><b>COMMUNE d’ADS</b></th>
      <td>38185</td>
    </tr>
    <tr>
      <th><b>N°ADS</b></th>
      <td>381851</td>
    </tr>
    <tr>
      <th><b>ORGANISME LOCAL d’ADS</b></th>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

# **CAS NON PASSANTS**

# <u>**_Cas NP 01 - 2 Trajets_**</u>

---

## <u>**_Contexte bénéficiaire_**</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>**_Référence documentaire_**</u> :

FORFAIT § 2.4.1,
ACTE TARIFANT § 3.1

---

<table>
  <thead>
    <tr>
      <th><u><strong>TRAJET N°1</strong></u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>LIEU</strong></td>
      <td>38-Bourgoin-Jallieu</td>
      <td>26-Valence</td>
    </tr>
    <tr>
      <td><strong>Code INSEE</strong></td>
      <td>38053</td>
      <td>26362</td>
    </tr>
    <tr>
      <td><strong>DATE</strong></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><strong>HEURE</strong></td>
      <td>10h00</td>
      <td>11h16</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><strong>N° IMMATRICULATION VEHICULE</strong></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><strong>NOM Prénom CONDUCTEUR</strong></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><strong>COMMUNE d’ADS</strong></td>
      <td>38053</td>
    </tr>
    <tr>
      <td><strong>ORGANISME LOCAL d’ADS</strong></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>125 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

---

<table>
  <thead>
    <tr>
      <th><u><b>TRAJET N°2</b></u></th>
      <th>DEPART</th>
      <th>ARRIVEE</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>17h00</td>
      <td>18h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-002-FG</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

# <u>*Cas NP 02*</u>

***

## <u>*Contexte bénéficiaire*</u> :

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

## <u>*Référence documentaire*</u> :

TIERS PAYANT CONTRE TRP partagé § 4.1,
ACTE TRACEUR TPR B2 § 4.2.2,
DESTINATAIRE DE REGLEMENT FACTURE TRP B2 § 4.2.2

***

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>10h00</td>
      <td>11h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>TP AMO SEUL</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>1</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

# <u>***Cas NP 03***</u>

***<u>Contexte bénéficiaire</u> :***

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
34170 CASTELNAU LE LEZ

* Nature d’assurance : Maladie
* Sans exonération

***<u>Référence documentaire</u> :***

TIERS PAYANT CONTRE TRP partagé § 4.1,
NORME B2 ORDRE TYPE 4A TPR TRACEUR § 4.2.1,
ACTE TRACEUR TPR B2 § 4.2.2

<table>
  <thead>
    <tr>
      <th><u>TRAJET</u></th>
      <th><b>DEPART</b></th>
      <th><b>ARRIVEE</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>LIEU</b></td>
      <td>38-Grenoble</td>
      <td>38-Bourgoin-Jallieu</td>
    </tr>
    <tr>
      <td><b>Code INSEE</b></td>
      <td>38185</td>
      <td>38053</td>
    </tr>
    <tr>
      <td><b>DATE</b></td>
      <td>01/07/2025</td>
      <td>01/07/2025</td>
    </tr>
    <tr>
      <td><b>HEURE</b></td>
      <td>10h00</td>
      <td>11h07</td>
    </tr>
  </tbody>
</table>

<table>
    <tr>
      <td>REFUS TRANSPORT PARTAGE</td>
      <td>O</td>
    </tr>
    <tr>
      <td>TIERS PAYANT</td>
      <td>HTP</td>
    </tr>
    <tr>
      <td>DISTANCE PARCOURUE</td>
      <td>68 Km</td>
    </tr>
    <tr>
      <td>NOMBRE DE MALADES</td>
      <td>2</td>
    </tr>
    <tr>
      <td>N° SUPPLEMENT FORFAITAIRE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>PEAGE (MONTANT PAR PATIENT)</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TPMR</td>
      <td>N</td>
    </tr>
    <tr>
      <td>TRAJET EN LIEN AVEC HOSPITALISATION ET ALLER OU RETOUR A VIDE</td>
      <td>N</td>
    </tr>
    <tr>
      <td>SI T PARTAGE : TRAJET SEUL > 33 KM</td>
      <td>N</td>
    </tr>
</table>

<table>
    <tr>
      <td><b>N° IMMATRICULATION VEHICULE</b></td>
      <td>AD-001-EF</td>
    </tr>
    <tr>
      <td><b>NOM Prénom CONDUCTEUR</b></td>
      <td>MARTIN Jean</td>
    </tr>
    <tr>
      <td><b>COMMUNE d’ADS</b></td>
      <td>38185</td>
    </tr>
    <tr>
      <td><b>ORGANISME LOCAL d’ADS</b></td>
      <td>381 - CPAM de l’ISERE</td>
    </tr>
</table>

# TEST TECHNIQUE

## GESTION DES RETOURS

# **<u>Test Technique</u>** : *Gestion des messages de service*

---

## **<u>Contexte bénéficiaire :</u>**

NIR : 1 79 02 63 220 417 03
Date de naissance : 01/02/1979
Nom : HOPITAL CNDA
Prénom : CINQUANTB
Adresse : 515, AV. G. FRECHE
         34170 CASTELNAU LE LEZ

*   Nature d’assurance : Maladie
*   Sans exonération

## **<u>Référence documentaire :</u>**

ETS-DT-001_TransportsFlux_SpecsTechCommune

ETS-DT-003_Création du fichier logique de facturation AMO
              et traitement des retours

VOLET TECHNIQUE des TESTS à Distance

---

## **<u>Informations de facturation :</u>**

*   Réaliser une facture.
*   La mettre en lot et en fichier.
*   Modifier le numéro d’émetteur (Type 0 Pos.6-19) en le remplaçant par « *XXXXXXXXXXXXXX* »
*   Transmettre le flux.
*   Récupérer dans la BAL de l’émetteur le message de service de type 2111 retourné.
*   Fournir la copie écran montrant la récupération de ce message et son intégration dans le logiciel .
*   Expliquer la gestion de ce type de retour.

# SÉCURISATION DES DONNÉES
# DE FACTURATION

# <u>***Règles de traçabilité des mises à jour de données***</u>

<u>*Référence documentaire*</u> : § 2.7 SECURISATION des DONNEES de FACTURATION

**Pour les mises à jour de données unitaires de références suivantes, fournir les explications de leur mode de gestion et les copies écran associées.**

## **Les données en fonction du département d’ADS de la société de Taxi**
* Tarif kilométrique

## **Les données en fonction de l’organisme local d’Assurance Maladie dont dépend l’ADS d’un véhicule exploité par la société de Taxi**
* Type et montant des suppléments forfaitaires
* Seuil kilométrique de trajet seul

## **Les données nationales**
* Type de forfait
* Tarif du forfait
* Distance minimale couverte par le forfait
* Coefficient aller ou retour à vide en fonction de la plage de distance
* Seuil n°1 KM aller ou retour à vide
* Coefficient de majoration nuit ou dimanche / jour férié
* % d’abattement en fonction du nombre de malades transportés
* Tarif de supplément TMPR

## **Historisation**
* Historique sur 27 mois
* Impossibilité de modifier les données historisées