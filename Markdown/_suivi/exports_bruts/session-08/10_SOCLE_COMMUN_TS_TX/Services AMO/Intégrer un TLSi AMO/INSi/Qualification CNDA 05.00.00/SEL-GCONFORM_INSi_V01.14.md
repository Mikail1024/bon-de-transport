*SEL-GCONFORM-INSi* <mark>Version : 1.14</mark>

![logo: CNDA Centre National de Dépôt et d'Agrément](page_1_image_2_v2.jpg)

# **Service en Ligne/Service PS**

## **GUIDE DE TESTS DE CONFORMITE**

### **Téléservice Identifiant National de Santé (INS) intégré aux LPS**

#### **Guide de tests de conformité**

![logo: l'Assurance Maladie INSi](page_1_image_1_v2.jpg)

<table>
<tr>
<td><i>Version</i></td>
<td>1.14</td>
</tr>
<tr>
<td><i>Date</i></td>
<td>11/08/2025</td>
</tr>
<tr>
<td><i>Référence</i></td>
<td><i>SEL-GCONFORM-INS</i></td>
</tr>
</table>

*11/08/2025 Guide de tests de conformité INSi 1 / 42*

*SEL-GCONFORM-INSi* *Version : 1.14*

<table>
  <thead>
    <tr>
      <th colspan="5"><b>HISTORIQUE DES VERSIONS</b></th>
    </tr>
    <tr>
      <th>DATE</th>
      <th>VERSION <b>GUIDE</b> DE <b>TESTS</b></th>
      <th>VERSION <b>PACKAGE</b> <b>DOCUMENTAIRE</b></th>
      <th><b>EVOLUTION DU DOCUMENT</b></th>
      <th><b>REDACTEUR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>07/02/2020</td>
      <td>1.00</td>
      <td>01.00</td>
      <td>Création du document</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>06/03/2020</td>
      <td>1.01</td>
      <td>01.00</td>
      <td>Tests 1.09 et 2.04 : Modification du résultat attendu.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/03/2020</td>
      <td>1.02</td>
      <td>01.00</td>
      <td>Test 2.03 cas 2 : correction du nom de naissance.<br />Test 2.07 : Ajout d’une précision.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>/06/2020</td>
      <td>1.03</td>
      <td>1.00.02</td>
      <td>Test 1.05 : Ajout d’une précision.<br />Test 1.06 : Ajout d’une précision.<br />Test 1.07 : Suppression de la référence à un fichier xml à injecter incorrect.<br />Test 2.02 : Ajout d’une vérification.<br />Test 2.03 : Ajout de vérifications.<br />Test 2.04 : Ajout d’une vérification<br />Test 2.05 : Changement du bénéficiaire utilisé dans le test.<br />Test 2.08 : Ajout d’une vérification.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>09/07/2020</td>
      <td>1.04</td>
      <td>2.00.00</td>
      <td>Tests 3.01 à 3.05 : Création des tests relatifs à la vérification unitaire.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>04/12/2020</td>
      <td>1.05</td>
      <td>3.00.00</td>
      <td>Tests 1.02 et 1.05 : Ajout de précisions.<br />Test 2.03 cas 3 : Ajout d’une précision sur la vérification attendu.<br />Test 2.08 : Ajout d’une vérification.<br />Tests 3.01, 3.03, 3.04 : ajout de précisions.<br />Tests 4.01 à 4.06 : Création des tests relatifs à la vérification en masse.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>20/07/2020</td>
      <td>1.06</td>
      <td>4.00.00</td>
      <td>Création des tests 2.02BIS, 3.02BIS et 4.02BIS relatifs à l’authentification mutuelle TLS.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>31/03/2022</td>
      <td>1.07</td>
      <td>4.00.01</td>
      <td>Tests 3.03 et 4.05 : maintenance.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>02/11/2022</td>
      <td>1.08</td>
      <td>4.00.01</td>
      <td>Prise en compte Fiche information 779</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/04/2023</td>
      <td>1.09</td>
      <td>4.00.01</td>
      <td>Test 2.01 : Modification du nom de naissance du bénéficiaire.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>03/07/2023</td>
      <td>1.10</td>
      <td>4.00.01</td>
      <td>Test 0.01 : Suppression du test.</td>
      <td>CNDA</td>
    </tr>
  </tbody>
</table>

*11/08/2025* *Guide de tests de conformité INSi* 2 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

<table>
  <thead>
    <tr>
      <th colspan="5"><b>HISTORIQUE DES VERSIONS</b></th>
    </tr>
    <tr>
      <th>DATE</th>
      <th>VERSION <b>GUIDE</b> DE <b>TESTS</b></th>
      <th>VERSION <b>PACKAGE</b> <b>DOCUMENTAIRE</b></th>
      <th><b>EVOLUTION DU DOCUMENT</b></th>
      <th><b>REDACTEUR</b></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>11/12/2023</td>
      <td>1.11</td>
      <td>4.00.01</td>
      <td>Modification de « Précisions sur l’environnement éditeurs »<br /><br />Test 2.03 : Modification des données d’un bénéficiaire.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>22/01/2024</td>
      <td>1.12</td>
      <td>4.00.01</td>
      <td>Modification de « Précisions sur l’environnement éditeurs »<br /><br />Test 2.03 : Modification des données d’un bénéficiaire.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td>05/04/2024</td>
      <td>1.13</td>
      <td>4.00.07</td>
      <td>Test 2.03 : Changement d’un bénéficiaire pour ce test.<br /><br />Tests 3.03 : Changements de bénéficiaires pour ce test.</td>
      <td>CNDA</td>
    </tr>
    <tr>
      <td><mark>11/08/2025</mark></td>
      <td><mark>1.14</mark></td>
      <td><mark>5.00.00</mark></td>
      <td><mark>Tests 2.02Ter, 3.02Ter et 4.02Ter : Création des tests.</mark><br /><br /><mark>Prise en compte authentification par Pro Santé Connect.</mark></td>
      <td><mark>CNDA</mark></td>
    </tr>
  </tbody>
</table>

*11/08/2025* *Guide de tests de conformité INSi* *3 / 42*

*SEL-GCONFORM-INSi* Version : 1.14

# **TABLE DES MATIERES**

<table>
    <tr>
      <td><strong><b>1 CAS DE TESTS...................................................................................................................................................9</b></strong></td>
      <td><strong>9</strong></td>
    </tr>
    <tr>
      <td>1 RECHERCHE PAR CARTE VITALE : IMPLEMENTATION OPTIONNELLE .................................................9</td>
      <td>9</td>
    </tr>
    <tr>
      <td>TEST 1.01 – GENERATION ASSERTION VITALE ...................................................................................9</td>
      <td>9</td>
    </tr>
    <tr>
      <td>TEST 1.02 – OBSOLESCENCE ASSERTION VITALE .............................................................................10</td>
      <td>10</td>
    </tr>
    <tr>
      <td>TEST 1.03 – COHERENCE BENEFICIAIRE REQUETE ET CARTE VITALE.............................................11</td>
      <td>11</td>
    </tr>
    <tr>
      <td>TEST 1.04 – NOM USUEL ....................................................................................................................12</td>
      <td>12</td>
    </tr>
    <tr>
      <td>TEST 1.05 – GESTION NOM USUEL/NOM PATRONYMIQUE................................................................13</td>
      <td>13</td>
    </tr>
    <tr>
      <td>TEST 1.06 – MATRICULES CORSES ....................................................................................................14</td>
      <td>14</td>
    </tr>
    <tr>
      <td>TEST 1.07 – GESTION NOM USUEL/NOM PATRONYMIQUE................................................................15</td>
      <td>15</td>
    </tr>
    <tr>
      <td>TEST 1.08 – PATIENT SANS NOM USUEL/PATRONYMIQUE ..............................................................16</td>
      <td>16</td>
    </tr>
    <tr>
      <td>TEST 1.09 – INS HISTORISEES ...........................................................................................................17</td>
      <td>17</td>
    </tr>
    <tr>
      <td>2 RECHERCHE PAR TRAITS D’IDENTITE ...............................................................................................18</td>
      <td>18</td>
    </tr>
    <tr>
      <td>TEST 2.01 – OBSOLESCENCE ASSERTION PS.....................................................................................18</td>
      <td>18</td>
    </tr>
    <tr>
      <td>TEST 2.02 – DETAIL ASSERTION PS...................................................................................................19</td>
      <td>19</td>
    </tr>
    <tr>
      <td>TEST 2.02 BIS– AUTHENTIFICATION MUTUELLE TLS .....................................................................20</td>
      <td>20</td>
    </tr>
    <tr>
      <td><mark><u>TEST 2.02 TER– AUTHENTIFICATION PRO SANTE CONNECT</u></mark> ..........................................................21</td>
      <td>21</td>
    </tr>
    <tr>
      <td>TEST 2.03 – TRAITS D ’IDENTITE........................................................................................................22</td>
      <td>22</td>
    </tr>
    <tr>
      <td>TEST 2.04 – INS HISTORISEES ...........................................................................................................23</td>
      <td>23</td>
    </tr>
    <tr>
      <td>TEST 2.05 – NIA RETOURNE PAR LE SERVICE ..................................................................................24</td>
      <td>24</td>
    </tr>
    <tr>
      <td>TEST 2.06 – PLUSIEURS RESULTATS ..................................................................................................25</td>
      <td>25</td>
    </tr>
    <tr>
      <td>TEST 2.07 – PLUSIEURS PRENOMS .....................................................................................................26</td>
      <td>26</td>
    </tr>
    <tr>
      <td>TEST 2.08 – ACQUISITION INS BENEFICIAIRES HORS REGIME GENERAL ET REGIMES HEBERGES 27</td>
      <td>27</td>
    </tr>
    <tr>
      <td>3 VERIFICATION UNITAIRE DE L’INS ET DES TRAITS D’IDENTITE ........................................................28</td>
      <td>28</td>
    </tr>
    <tr>
      <td>TEST 3.01 – OBSOLESCENCE ASSERTION PS.....................................................................................28</td>
      <td>28</td>
    </tr>
    <tr>
      <td>TEST 3.02 – DETAIL ASSERTION PS...................................................................................................29</td>
      <td>29</td>
    </tr>
    <tr>
      <td>TEST 3.02 BIS– AUTHENTIFICATION MUTUELLE TLS .....................................................................30</td>
      <td>30</td>
    </tr>
    <tr>
      <td><mark><u>TEST 3.02 TER– AUTHENTIFICATION PRO SANTE CONNECT</u></mark> ..........................................................31</td>
      <td>31</td>
    </tr>
    <tr>
      <td>TEST 3.03 – MISE EN ŒUVRE DE LA VERIFICATION UNITAIRE ........................................................32</td>
      <td>32</td>
    </tr>
    <tr>
      <td>TEST 3.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE ......................................................33</td>
      <td>33</td>
    </tr>
    <tr>
      <td>TEST 3.05 – COMPTE-RENDU 01 : ECHEC DE LA VERIFICATION ......................................................34</td>
      <td>34</td>
    </tr>
    <tr>
      <td>4 VERIFIER L'INS ET LES TRAITS D'IDENTITE DE PLUSIEURS PATIENTS (VERIFICATION EN MASSE) ....35</td>
      <td>35</td>
    </tr>
    <tr>
      <td>TEST 4.01 – OBSOLESCENCE ASSERTION PS.....................................................................................35</td>
      <td>35</td>
    </tr>
    <tr>
      <td>TEST 4.02 – DETAIL ASSERTION PS...................................................................................................36</td>
      <td>36</td>
    </tr>
    <tr>
      <td>TEST 4.02 BIS– AUTHENTIFICATION MUTUELLE TLS .....................................................................37</td>
      <td>37</td>
    </tr>
    <tr>
      <td><mark><u>TEST 4.02 TER– AUTHENTIFICATION PRO SANTE CONNECT</u></mark> ..........................................................38</td>
      <td>38</td>
    </tr>
    <tr>
      <td>TEST 4.03 – DEPOT ET RETRAIT D ’UN LOT AVEC CR « 00 » ...........................................................39</td>
      <td>39</td>
    </tr>
    <tr>
      <td>TEST 4.04 – DEPOT ET RETRAIT D ’UN LOT AVEC CR « 01 » ...........................................................40</td>
      <td>40</td>
    </tr>
    <tr>
      <td>TEST 4.05 – DEPOT ET RETRAIT D ’UN LOT AVEC CR « 02 » ...........................................................41</td>
      <td>41</td>
    </tr>
    <tr>
      <td>TEST 4.06 – PARAMETRAGE DU NOMBRE DE VERIFICATIONS POUR UN LOT ..................................42</td>
      <td>42</td>
    </tr>
</table>

*11/08/2025 Guide de tests de conformité INSi* 4 / 42

*SEL-GCONFORM-INSi* <mark>Version : 1.14</mark>

## **CONSEIL D’IMPRESSION**

![image: illustration of booklet printing](page_5_image_1_v2.jpg) Le document a été réalisé pour être imprimé en mode Livret, format A4 paysage, avec reliure à gauche.

---

## <u>**Précisions sur l’environnement de tests éditeurs :**</u>

Des erreurs « insi_101 » et « desir_1020 » en sortie des opérations de recherche vont être restituées lors du déroulement des tests en environnement éditeurs.

L'environnement de tests éditeurs ne gère qu'une base de tests RFI (régime général et régimes hébergés) mais pas de base SNGI (autres régimes : pour plus de détail voir le Guide d'intégration).

Le service effectue une première recherche vers le RFI :

- si le patient est trouvé, l'INS et les informations associées sont restitués : les cas passants que vous observez
- si le patient n'est pas trouvé, le service effectue une recherche au SNGI avec les données de la requête. Comme en environnement de tests éditeurs il n'y a pas de branche SNGI, la recherche est en échec et l'erreur « insi_101 » ou « desir_1020 » (selon l’opération) est restituée (il s'agit d'une erreur technique : branche SNGI indisponible), un code CR01 ne peut être restitué.

Dans la configuration actuelle de l'environnement de tests, il n'est pas possible d'obtenir un CR01, c'est pour cela (et pour tester les cinématiques attendues dans le Guide d'intégration) que dans le package de tests sont fournis des fichiers xml à injecter dans le LPS, pour simuler les réponses du service que l'on ne peut obtenir dans notre environnement. En environnement de production, lorsqu’un INS ne sera pas trouvé c’est bien un CR01 qui sera restitué.

<mark><u>De même dans certaines vérifications une erreur « insi_105 » : « L'appel au service de recherche </u></mark>
<mark><u>renvoie une erreur technique. » à la place d’un retour « CR 01 » : « KO INS non vérifié, veuillez </u></mark>
<mark><u>renouveler votre recherche ».</u></mark>

*11/08/2025* *Guide de tests de conformité INSi* 5 / 42

*SEL-GCONFORM-INSi* <mark>Version : 1.14</mark>

## **Tableaux récapitulatifs du ou des modes d’authentification à appliquer pour chaque test lors d’une certification initiale**

<table>
  <thead>
    <tr>
      <th></th>
      <th><b>Authentification<br /><b>CPX seule</b></b></th>
      <th><b>Authentification<br /><b>mutuelle seule</b></b></th>
      <th><mark><b>Authentification<br /><b>Pro Santé Connect</b><br /><b>seul</b></b></mark></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Recherche par Carte<br />Vitale</td>
      <td>1.01, Assertion PS<br />1.02, Assertion PS<br />1.03, Assertion PS<br />1.04, Assertion PS<br />1.05, Assertion PS<br />1.06, Assertion PS<br />1.07, Assertion PS<br />1.08, Assertion PS<br />1.09, Assertion PS</td>
      <td>1.01, INSI<br />1.02, INSI<br />1.03, INSI<br />1.04, INSI-AUTO<br />1.05, INSI-AUTO<br />1.06, INSI-MANU<br />1.07, INSI-MANU<br />1.08, INSI<br />1.09, INSI</td>
      <td><mark>1.01, PSC</mark><br /><mark>1.02, PSC</mark><br /><mark><u>1.03, PSC</u></mark><br /><mark><u>1.04, PSC</u></mark><br /><mark><u>1.05, PSC</u></mark><br /><mark><u>1.06, PSC</u></mark><br /><mark>1.07, PSC</mark><br /><mark>1.08, PSC</mark><br /><mark>1.09, PSC</mark></td>
    </tr>
    <tr>
      <td>Recherche par Trait<br />d’identité</td>
      <td>2.01, Assertion PS<br />2.02, Assertion PS<br />2.03, Assertion PS<br />2.04, Assertion PS<br />2.05, Assertion PS<br />2.06, Assertion PS<br />2.07, Assertion PS<br />2.08, Assertion PS</td>
      <td><br /><br />2.03, INSI-AUTO<br />2.04, INSI<br />2.05, INSI<br />2.06, INSI-MANU<br />2.07, INSI<br />2.08, INSI</td>
      <td><mark>2.02Ter : PSC</mark><br /><mark>2.03, PSC</mark><br /><mark><u>2.04, PSC</u></mark><br /><mark><u>2.05, PSC</u></mark><br /><mark><u>2.06, PSC</u></mark><br /><mark>2.07, PSC</mark><br /><mark>2.08, PSC</mark></td>
    </tr>
    <tr>
      <td>Vérification unitaire</td>
      <td>3.01, Assertion PS<br />3.02, Assertion PS<br />3.03, Assertion PS<br />3.04, Assertion PS<br />3.05, Assertion PS</td>
      <td><br /><br />3.03, INSI-AUTO 1 à 5<br />INSI-MANU 6 à 11<br /><br />3.04, INSI<br />3.05, INSI</td>
      <td><mark>3.02Ter : PSC</mark><br /><mark>3.03, PSC</mark><br /><mark>3.04, PSC</mark><br /><mark>3.05 PSC</mark></td>
    </tr>
    <tr>
      <td>Vérification de<br />masse</td>
      <td>4.01, Assertion PS<br />4.02, Assertion PS<br />4.03, Assertion PS<br />4.04, Assertion PS<br />4.05, Assertion PS<br />4.06, Assertion PS</td>
      <td><br /><br />4.03, INSI-AUTO<br />4.04, INSI-MANU<br />4.05, INSI<br />4.06, INSI</td>
      <td><mark>4.02Ter : PSC</mark><br /><mark>4.03, PSC</mark><br /><mark><u>4.04, PSC</u></mark><br /><mark>4.05, PSC</mark><br /><mark>4.06, PSC</mark></td>
    </tr>
  </tbody>
</table>

*11/08/2025* *Guide de tests de conformité INSi* *6 / 42*

*SEL-GCONFORM-INSi* *Version : 1.14*

<table>
  <thead>
    <tr>
      <th></th>
      <th><strong>Authentification par CPX et mutuelle</strong></th>
      <th><strong>Authentification <b>par CPX et Pro</b> Santé Connect</strong></th>
      <th><strong>Authentification mutuelle et Pro Santé Connect</strong></th>
      <th><strong>Authentification par <b>CPX, mutuelle et</b> Pro Santé Connect</strong></th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td rowspan="9">Recherche par Carte Vitale</td>
      <td>1.01, Assertion PS</td>
      <td>1.01, Assertion PS</td>
      <td>1.01, PSC</td>
      <td>1.01, Assertion PS</td>
    </tr>
    <tr>
      <td>1.02, Assertion PS</td>
      <td>1.02, Assertion PS</td>
      <td>1.02, PSC</td>
      <td>1.02, PSC</td>
    </tr>
    <tr>
      <td>1.03, Assertion PS</td>
      <td>1.03, Assertion PS</td>
      <td>1.03, PSC</td>
      <td>1.03, Assertion PS</td>
    </tr>
    <tr>
      <td>1.04, INSI-AUTO</td>
      <td>1.04, PSC</td>
      <td>1.04, INSI-AUTO</td>
      <td>1.04, INSI-AUTO</td>
    </tr>
    <tr>
      <td>1.05, INSI-AUTO</td>
      <td>1.05, PSC</td>
      <td>1.05, INSI-AUTO</td>
      <td>1.05, INSI-AUTO</td>
    </tr>
    <tr>
      <td>1.06, INSI-MANU</td>
      <td>1.06, PSC</td>
      <td>1.06, INSI-MANU</td>
      <td>1.06, INSI-MANU</td>
    </tr>
    <tr>
      <td>1.07, INSI-MANU</td>
      <td>1.07, PSC</td>
      <td>1.07, INSI-MANU</td>
      <td>1.07, Assertion PS</td>
    </tr>
    <tr>
      <td>1.08, Assertion PS</td>
      <td>1.08, Assertion PS</td>
      <td>1.08, PSC</td>
      <td>1.08, PSC</td>
    </tr>
    <tr>
      <td>1.09, Assertion PS</td>
      <td>1.09, Assertion PS</td>
      <td>1.09, PSC</td>
      <td>1.09, PSC</td>
    </tr>
    <tr>
      <td rowspan="9">Recherche par Trait d’identité</td>
      <td>2.01, Assertion PS</td>
      <td>2.01, Assertion PS</td>
      <td>2.02Ter : PSC</td>
      <td>2.01, Assertion PS</td>
    </tr>
    <tr>
      <td>2.02, Assertion PS</td>
      <td>2.02, Assertion PS</td>
      <td>2.03, INSI-AUTO</td>
      <td>2.02, Assertion PS</td>
    </tr>
    <tr>
      <td>2.03, INSI-AUTO</td>
      <td>2.02Ter : PSC</td>
      <td>2.04, PSC</td>
      <td>2.02Ter : PSC</td>
    </tr>
    <tr>
      <td>2.04, Assertion PS</td>
      <td>2.03, PSC</td>
      <td>2.05, PSC</td>
      <td>2.03, INSI-AUTO</td>
    </tr>
    <tr>
      <td>2.05, Assertion PS</td>
      <td>2.04, Assertion PS</td>
      <td>2.06, INSI-MANU</td>
      <td>2.04, PSC</td>
    </tr>
    <tr>
      <td>2.06, INSI-MANU</td>
      <td>2.05, Assertion PS</td>
      <td>2.07, PSC</td>
      <td>2.05, Assertion PS</td>
    </tr>
    <tr>
      <td>2.07, Assertion PS</td>
      <td>2.06, PSC</td>
      <td>2.08, PSC</td>
      <td>2.06, INSI-MANU</td>
    </tr>
    <tr>
      <td>2.08, Assertion PS</td>
      <td>2.07, Assertion PS</td>
      <td></td>
      <td>2.07, PSC</td>
    </tr>
    <tr>
      <td></td>
      <td>2.08, Assertion PS</td>
      <td></td>
      <td>2.08, Assertion PS</td>
    </tr>
    <tr>
      <td rowspan="6">Vérification unitaire</td>
      <td>3.01, Assertion PS</td>
      <td>3.01, Assertion PS</td>
      <td>3.02Ter : PSC</td>
      <td>3.01, Assertion PS</td>
    </tr>
    <tr>
      <td>3.02, Assertion PS</td>
      <td>3.02, Assertion PS</td>
      <td>3.03, INSI-AUTO 1 à 6</td>
      <td>3.02, Assertion PS</td>
    </tr>
    <tr>
      <td>3.03, INSI-AUTO 1 à 3</td>
      <td>3.02Ter : PSC</td>
      <td></td>
      <td>3.02Ter : PSC</td>
    </tr>
    <tr>
      <td>INSI-MANU 4 à 6</td>
      <td>3.03, PSC 1 à 6</td>
      <td>PSC 7 à 11</td>
      <td>3.03, INSI-AUTO 1 à 3</td>
    </tr>
    <tr>
      <td>Assertion PS 7 à 11</td>
      <td>Assertion PS 7 à 11</td>
      <td>3.04, PSC</td>
      <td>INSI-MANU 4 à 6</td>
    </tr>
    <tr>
      <td>3.04, Assertion PS</td>
      <td>3.04, Assertion PS</td>
      <td>3.05 PSC</td>
      <td>PSC 7 à 11</td>
    </tr>
    <tr>
      <td></td>
      <td>3.05 Assertion PS</td>
      <td>3.05 Assertion PS</td>
      <td></td>
      <td>3.04, Assertion PS</td>
    </tr>
    <tr>
      <td></td>
      <td></td>
      <td></td>
      <td></td>
      <td>3.05 Assertion PS</td>
    </tr>
    <tr>
      <td rowspan="8">Vérification de masse</td>
      <td>4.01, Assertion PS</td>
      <td>4.01, Assertion PS</td>
      <td>4.02Ter : PSC</td>
      <td>4.01, Assertion PS</td>
    </tr>
    <tr>
      <td>4.02, Assertion PS</td>
      <td>4.02, Assertion PS</td>
      <td>4.03, INSI-AUTO</td>
      <td>4.02, Assertion PS</td>
    </tr>
    <tr>
      <td>4.03, INSI-AUTO</td>
      <td>4.02Ter : PSC</td>
      <td>PSC</td>
      <td>4.02Ter : PSC</td>
    </tr>
    <tr>
      <td>Assertion PS</td>
      <td>4.03, PSC</td>
      <td>4.04, INSI-MANU</td>
      <td>4.03, INSI-AUTO et</td>
    </tr>
    <tr>
      <td>4.04, INSI-MANU</td>
      <td>Assertion PS</td>
      <td>4.05, PSC</td>
      <td>Assertion PS</td>
    </tr>
    <tr>
      <td>4.05, Assertion PS</td>
      <td>4.04, PSC</td>
      <td>4.06, PSC</td>
      <td>4.04, PSC</td>
    </tr>
    <tr>
      <td>4.06, Assertion PS</td>
      <td>4.05, Assertion PS</td>
      <td></td>
      <td>4.05, Assertion PS</td>
    </tr>
    <tr>
      <td></td>
      <td>4.06, Assertion PS</td>
      <td></td>
      <td>4.06, Assertion PS</td>
    </tr>
  </tbody>
</table>

## **Tableau des tests à réaliser lors d’une certification différentielle pour l’implémentation de l’authentification mutuelle**

<table>
  <thead>
    <tr>
      <th></th>
      <th>Différentiel pour authentification mutuelle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Recherche par Carte Vitale</td>
      <td>1.05, INSI-AUTO<br />1.06, INSI-MANU</td>
    </tr>
    <tr>
      <td>Recherche par Trait d’identité</td>
      <td>2.03, INSI-AUTO<br />2.06, INSI-MANU</td>
    </tr>
    <tr>
      <td>Vérification unitaire</td>
      <td>3.03, INSI-AUTO cas 1 et 3<br />INSI-MANU cas 7 et 10</td>
    </tr>
    <tr>
      <td>Vérification de masse</td>
      <td>4.03, INSI-AUTO<br />4.04, INSI-MANU</td>
    </tr>
  </tbody>
</table>

*11/08/2025* *Guide de tests de conformité INSi* *7 / 42*

*SEL-GCONFORM-INSi Version : 1.14*

## <u>**Tableau des tests à réaliser lors d’une certification différentielle pour l’implémentation de</u> l’authentification avec Pro Santé Connect**

<table>
  <thead>
    <tr>
      <th></th>
      <th>Différentiel pour authentification Pro Santé Connect</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Recherche par Carte Vitale</td>
      <td>1.05,<br />1.06,</td>
    </tr>
    <tr>
      <td>Recherche par Trait d’identité</td>
      <td>2.02Ter<br />2.03,<br />2.06,</td>
    </tr>
    <tr>
      <td>Vérification unitaire</td>
      <td>3.02Ter<br />3.03, cas 1, 3, 7 et 10</td>
    </tr>
    <tr>
      <td>Vérification de masse</td>
      <td>4.02Ter<br />4.03,<br />4.04,</td>
    </tr>
  </tbody>
</table>

*11/08/2025 Guide de tests de conformité INSi 8 / 42*

*SEL-GCONFORM-INSi* *Version : 1.14*

# **1 Cas de Tests**

## **1 Recherche par Carte Vitale : Implémentation optionnelle**

### **TEST 1.01 – GENERATION ASSERTION VITALE**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.4 « Authentification de la carte vitale»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Carte vitale INSi 01 : DE VINCI Ruth</td>
    </tr>
</table>

<table>
    <tr>
      <td>Description détaillée du test</td>
    </tr>
    <tr>
      <td>Effectuer l’opération « Recherche avec CV » avec la patiente <b>Ruth</b>.</td>
    </tr>
    <tr>
      <td>À vérifier</td>
    </tr>
    <tr>
      <td>En présence de la carte vitale une assertion vitale est impérativement générée.</td>
    </tr>
    <tr>
      <td>Résultat à fournir</td>
    </tr>
    <tr>
      <td>Fournir les traces de la requête et réponse SOAP.</td>
    </tr>
</table>

*11/08/2025* *Guide de tests de conformité INSi* 9 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 1.02 – OBSOLESCENCE ASSERTION VITALE**

<table>
    <tr>
      <th colspan="2">Références au guide d’intégration</th>
      <td colspan="2">Guide d’intégration §3.1 « Mise en œuvre »<br />Cadre d’interopérabilité des TLSi AMO §3.4 « Authentification de la carte vitale»</td>
    </tr>
    <tr>
      <th>État du test</th>
      <td>Actif</td>
      <th>Informations patient</th>
      <td>Carte vitale INSi 01 : DE VINCI Ruth<br />Carte vitale INSi 01 : DE VINCI Donatello</td>
    </tr>
</table>

## Description détaillée du test

**Cas 1** : Lancez l’opération « Recherche avec CV » avec la patiente **Ruth**, une fois l’accusé réceptionné. Attendre 20 minutes, lancer une nouvelle recherche pour le bénéficiaire **Donatello** (sans arrachage de la carte vitale entre temps).

**Cas 2** : **( <u>Si le logiciel génère l’assertion vitale à la lecture de la carte vitale ou à la sélection du</u> <u>bénéficiaire).</u>** Sélection du bénéficiaire **Donatello** (génération de l’assertion vitale à la lecture de la carte vitale et mise en forme de la requête) attendre plus de 20 minutes et transmettre la requête.

## À vérifier

Avant tout transmission de la requête, le logiciel doit vérifier que la carte vitale est inchangée et que l’assertion vitale n’est pas obsolète (niveau de contrôle de l’assertion vitale de type « 2 »).

Le LPS peut également gérer l’assertion vitale en contrôle de type « 1 » : génération de l’assertion lors de l’émission du flux (après avoir vérifié que la carte vitale dans le lecteur est bien celle qui a permis l’acquisition du patient).

Dans les deux cas, l’assertion étant obsolète, le logiciel doit en générer une nouvelle.

## Résultat à fournir

Décrire la cinématique mise en œuvre.
Fournir les traces des requêtes et réponses SOAP pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* 10 / 42

*SEL-GCONFORM-INSi* <span style="float: right;">*Version : 1.14*</span>

# **TEST 1.03 – COHERENCE BENEFICIAIRE REQUETE ET CARTE VITALE**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.1.4 « Niveau de contrôle des assertions »</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Carte vitale INSi 01 : DE VINCI Ruth<br />Carte vitale INSi 04</td>
    </tr>
</table>

## Description détaillée du test

Utilisez la carte vitale **INSi 01**. Après sélection de la patiente **Ruth** (constitution de la requête) retirer la carte vitale du lecteur et insérer la carte **INSi 04**.

Tenter de lancer l’opération « Recherche avec CV ».

## À vérifier

Avant tout envoi d’une requête, le logiciel doit contrôler que la carte présente dans le lecteur est celle ayant permis la sélection du bénéficiaire (et l’alimentation de la requête : assertion vitale, contexte BAM et corps de la requête).

La carte étant différente, le logiciel doit avertir l‘utilisateur et empêcher toute demande d’accès au service.

## Résultat à fournir

Décrire le contrôle et fournir une copie d’écran du message d’erreur.

*11/08/2025* <span style="margin-left: 200px;">*Guide de tests de conformité INSi*</span> <span style="float: right;">*11 / 42*</span>

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 1.04 – NOM USUEL**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td><strong>[RG_INS120]</strong></td>
      <td>Acquérir les données d’appel du web service<br />« Récupérer INS avec carte Vitale » (WS_INS1)</td>
    </tr>
    <tr>
      <td colspan="2"></td>
      <td><strong>[RG_INS160]</strong></td>
      <td>Acquérir le nom usuel du patient</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td><strong>Cas 1</strong><br />Carte vitale INSi 01 : DE VINCI Ruth<br /><br /><strong>Cas 2</strong><br />Carte vitale INSi 01 : DE VINCI Donatello</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

<u>Unicité du patient : obligation du choix du patient par le PS.</u>

**Cas 1** : Lancez l’opération « Recherche avec CV » pour la patiente **Ruth**, ayant uniquement un Nom Usuel en CV (ouvrant-droit).

**Cas 2** : Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Donatello**, ayant uniquement un Nom Usuel en CV (ayant-droit).

## À vérifier

Le LPS doit alimenter la requête avec les seules données disponibles en Carte Vitale. Le Nom Patronymique étant absent en carte vitale, la balise <Nom de Naissance> est absente dans la requête. Et, en l’absence de NIR bénéficiaire en CV, cette information n’est pas renseignée dans la requête (contexte BAM et body).

La clé du NIR n’est pas renseignée dans la requête SOAP, tant dans le contexte BAM (ContexteBAM/COUVERTURE/ASSURE/Id/Cle : <u>**non renseignée)**</u> que dans le corps du flux (Body/RECVITALE/MatriculeOD/Cle : <u>**non renseignée**</u>).

## Résultat à fournir

Décrire le mode de sélection du bénéficiaire et présenter une copie d’écran de cette sélection dans l’interface du LPS.

<u>Fournir les traces des requêtes et réponses SOAP</u> <mark><u>(ainsi que les Access token du Jeton AM correspondants en cas d'authentification par Pro Santé Connect).</u></mark>
Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* 12 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 1.05 – GESTION NOM USUEL/NOM PATRONYMIQUE**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td><b>[RG_INS120]</b></td>
      <td>Acquérir les données d’appel du web service<br />« Récupérer INS avec carte Vitale »</td>
    </tr>
    <tr>
      <td colspan="2"></td>
      <td><b>[RG_INS140]</b></td>
      <td>Appeler le web service « Récupérer INS avec<br />carte Vitale » (WS_INS1) avec le nom de famille<br />du porteur de la carte Vitale</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td><b>Cas 1</b><br />Carte vitale INSi 02 : NESSI Ruth<br /><br /><b>Cas 2</b><br />Carte vitale INSi 02 : NESSI Leonardo</td>
    </tr>
</table>

## Description détaillée du test

En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).

**Cas 1** : Lancez l’opération « Recherche avec CV » pour la patiente **Ruth**, ayant un Nom Usuel et un Nom Patronymique en CV (ouvrant-droit).

**Cas 2** : Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Leonardo**, ayant un Nom Usuel et un Nom Patronymique (celui du porteur de la carte vitale) en CV (ayant-droit).

## À vérifier

Le LPS doit alimenter la requête avec toutes les données disponibles en Carte Vitale.

Pour les deux **cas**, le NIR individu renseigné en carte vitale alimentera le contexte BAM (ContexteBAM/COUVERTURE/BENEFICIAIRE/Nir/Num) ainsi que le corps du flux (Body/RECVITALE/MatriculeIndividu/ NumIdentifiant).

La clé du NIR individu n’est pas renseignée dans la requête SOAP, tant dans le contexte BAM (ContexteBAM/COUVERTURE/BENEFICIAIRE/Nir/Cle : **<u>non renseignée</u>**) que dans le corps du flux (Body/RECVITALE/MatriculeIndividu/Cle : **<u>non renseignée).</u>**

Le nom patronymique renseigné en carte vitale (**<u>nom patronymique du porteur de la carte</u>**) alimente la balise <NomNaissance> dans la requête INSi pour les deux cas.

## Résultat à fournir

<u>Fournir les traces des requêtes et réponses SOAP</u> <u>(ainsi que les Access token du Jeton AM</u> <u>correspondants en cas d'authentification par Pro Santé Connect).</u>

Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* 13 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 1.06 – MATRICULES CORSES**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td colspan="2"><b>[RG_INS120]</b> Acquérir les données d’appel du web service<br />« Récupérer INS avec carte Vitale » (WS_INS1)</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td><b>Cas 1</b><br />Carte vitale INSi 04 : ADRTROIS Toussaint<br /><br /><b>Cas 2</b><br />Carte vitale INSi 04 : ADRTROIS Dominique</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

**Cas 1** : Lancez l’opération « Recherche avec CV » pour le patient **Toussaint** (ouvrant-droit).

**Cas 2** : Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Dominique** (ayant-droit).

## À vérifier

Le LPS doit alimenter la requête avec toutes les données disponibles en Carte Vitale.

## Résultat à fournir

<u>Fournir les traces des</u> <u>requêtes et réponses SOAP</u> <mark><u>(ainsi que les Access token du Jeton AM</u> <u>correspondants en cas d'authentification par Pro Santé Connect).</u></mark>
Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* *14 / 42*

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 1.07 – GESTION NOM USUEL/NOM PATRONYMIQUE**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td><strong>[RG_INS140]</strong></td>
      <td>Appeler le web service « Récupérer INS avec carte Vitale » (WS_INS1) avec le nom de famille du porteur de la carte Vitale</td>
    </tr>
    <tr>
      <td colspan="2"></td>
      <td><strong>[RG_INS180]</strong></td>
      <td>Appeler le web service « Récupérer INS avec carte Vitale » (WS_INS1) avec le nom usuel du patient</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Carte vitale INSi 03 : NESSI Lionel<br />Carte vitale INSi 03 : DE VINCI Léonard<br />Carte vitale INSi 03 : NESSI Damien</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

**Cas 1** : Lancez l’opération « Recherche avec CV » pour le patient **Lionel**, avec Nom Usuel et Patronymique identiques en CV. **Injection du fichier** (simulant une réponse du service).

**Cas 2** : Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Léonard**, avec Nom Usuel et Patronymique différents en CV.

**Cas 3** : Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Damien**, avec Nom Usuel absent en CV.

<u>A noter</u> : Les bénéficiaires de cette carte sont volontairement non connus au RFI pour tester la cinématique dans ce test.

Pour les trois cas **Injection du fichier** (simulant une réponse du service) : **REP_CR01.xml**.

## À vérifier

Le LPS doit alimenter la requête avec toutes les données disponibles en Carte Vitale.

**Cas 1** : Le résultat de l’appel avec le Nom Patronymique aboutit à un code retour (CR) différent de « 00 ». Le Nom Usuel étant identique au Nom Patronymique, le LPS <u>n’a pas</u> à lancer une nouvelle requête.

**Cas 2** : Le résultat de l’appel avec le Nom Patronymique aboutit à un code retour (CR) différent de « 00 ». Le LPS <u>doit</u> lancer une nouvelle requête avec le Nom Usuel. **Une deuxième injection du fichier** (simulant une réponse du service) : **REP_CR01.xml** est à effectuer.

**Cas 3** : Le résultat de l’appel avec le Nom Patronymique aboutit à un code retour (CR) différent de « 00 ». Le Nom Usuel étant absent en carte vitale, le LPS <u>ne peut</u> lancer de nouvelle requête.

L’information « Le patient est inconnu » (CR à « 01 ») est affichée à l’utilisateur dans chacun des cas.

## Résultat à fournir

<u>**Fournir les traces des requêtes et réponses SOAP**</u> <mark><u>**(ainsi que les Access token**</u> <u>**du Jeton AM**</u> <u>**correspondants en cas d'authentification par Pro Santé Connect).**</u></mark>
Décrire la cinématique mise en œuvre.
Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* 15 / 42

SEL-GCONFORM-INSi | Version : 1.14

# **TEST 1.08 – PATIENT SANS NOM USUEL/PATRONYMIQUE**

<table>
    <tr>
      <td colspan="2">Références au guide d’intégration</td>
      <td colspan="2"><strong>[RG_INS180]</strong> Appeler le web service « Récupérer INS avec carte Vitale » (WS_INS1) avec le nom usuel du patient.</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Carte vitale INSi 01 : Michelangelo</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Michelangelo**, n’ayant pas de Nom Usuel/Patronymique en CV.

## À vérifier

Nom Patronymique étant absent en carte vitale, la balise &lt;Nom de Naissance&gt; est absente dans la requête.

## Résultat à fournir

Fournir les traces des requêtes et réponses SOAP <mark><u>(ainsi que les Access token du Jeton AM correspondants en cas d'authentification par Pro Santé Connect).</u></mark>
Fournir les copies d’écran du retour du service dans l’interface du logiciel.

*11/08/2025* | *Guide de tests de conformité INSi* | 16 / 42

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 1.09 – INS HISTORISEES**

<table>
    <tr>
      <td>Références au guide d’intégration</td>
      <td colspan="3"><strong>[RG_INS120]</strong> Acquérir les données d’appel du web service<br />« Récupérer INS avec carte Vitale » (WS_INS1)</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Carte vitale INSi 02 : ECETINSI Pierre-Alain</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec CV » pour le bénéficiaire **Pierre-Alain**.

## À vérifier

Le LPS doit alimenter la requête avec toutes les données disponibles en Carte Vitale.

Le LPS doit acquérir l’INS actif et le ou les INS historisées.

## Résultat à fournir

Fournir les traces des requêtes et réponses SOAP <mark><u>(ainsi que les Access token correspondants en cas d'authentification par Pro Santé Connect).</u></mark>
Fournir les copies d’écran du retour du service dans l’interface du logiciel.

*11/08/2025 Guide de tests de conformité INSi* 17 / 42

*SEL-GCONFORM-INSi* Version : 1.14

# **2 Recherche par Traits d’Identité**

## **TEST 2.01 – OBSOLESCENCE ASSERTION PS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Nom: <mark>ADRDEUX</mark><br />Prénom : <mark>Laurent</mark><br />Sexe : <mark>M</mark><br />Date de naissance : <mark>01/01/1981</mark></td>
    </tr>
</table>

### Description détaillée du test

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté.</u>

**Cas 1** : Lancez l’opération « Recherche avec Trait d’Identité » avec <mark>le patient ADRDEUX</mark>, attendre une heure et relancer une requête.

**Cas 2** : Lancez l’opération « Recherche avec Trait d’Identité » avec <mark>le patient ADRDEUX</mark>, retirer la CPS du lecteur et relancer une requête.

### À vérifier

Avant tout lancement de requête, le logiciel doit vérifier que l’assertion PS n’est pas obsolète.

**Cas 1** : L’assertion étant obsolète, le logiciel doit automatiquement en générer une nouvelle (niveau de contrôle de l’assertion PS de type « 2 »).

**Cas 2** : Le logiciel ayant détecté l’absence de CPS, le logiciel ne doit pas permettre de lancer la requête.
Dans ce cas, le LPS doit :
- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte
- Demander la saisie du code porteur de la CPS.

### Résultat à fournir

**Cas 1** : Fournir les traces des requêtes et réponses SOAP.

**Cas 2** : Fournir les copies d’écran de l’interface informant de l’absence de la CPS et la nécessité de saisir à nouveau le code porteur.

*11/08/2025 Guide de tests de conformité INSi 18 / 42*

*SEL-GCONFORM-INSi Version : 1.14*

# **TEST 2.02 – DETAIL ASSERTION PS**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté</u>.

Suite du test précédent.

## À vérifier

Dans l’assertion PS une balise `<AttributeStatement>` est bien renseignée avec :
`<identifiantFacturation>`, `<codeSpecialite>` et `<secteurActivite>`.

L’attribut `<codeSpecialite>` ne sera renseigné qu’en présence d’une CPS/CPF médecin/médecin en formation.

**En l’absence de carte vitale, il n’y a pas d’assertion vitale attendue dans l’en-tête de la requête **SOAP**.**

## Résultat à fournir

Décrire la cinématique mise en œuvre concernant la gestion du niveau de sécurité 2 de l’assertion PS.
Présenter les éléments mettant en évidence que les attributs de l’assertion PS sont issus de la CPX.

*11/08/2025 Guide de tests de conformité INSi* 19 / 42

<table>
    <tr>
      <td><i>SEL-GCONFORM-INSi</i></td>
      <td></td>
      <td><mark>Version : 1.14</mark></td>
    </tr>
</table>

# **TEST 2.02 BIS– AUTHENTIFICATION MUTUELLE TLS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Guide d’intégration SEL-MP-043<br />ANNEXE 3 : Authentification TLS mutuelle par certificat logiciel.<br /><br />Fiche d’information du GIE SESAM-Vitale : PDT-INF-743</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si l’Authentification Mutuelle est implémentée</u>

Réaliser les tests suivant en Authentification Mutuelle par certificat logiciel :

Utilisation du certificat dont le CN est égal à « INSI-AUTO » :
*   Tests 1.04 et 1.05 si la fonction de recherche par carte vitale est implémentée
*   Test 2.03

Utilisation du certificat dont le CN est égal à « INSI-MANU » :
*   Tests 1.06 et 1.07 si la fonction de recherche par carte vitale est implémentée
*   Test 2.06

Pour les autres tests ils seront réalisés en authentification mutuelle (certificat « INSI-AUTO » ou « INSI-MANU ») si l’authentification par carte CPX n’est pas implémentée.

<u>Dans le cadre d’un différentiel consistant à l’implémentation de l’authentification mutuelle (LPS déjà certifié pour cette opération) seuls les tests suivants doivent être réalisés</u> :

Utilisation du certificat dont le CN est égal à « INSI-AUTO » :
*   Test 1.05 si la fonction de recherche par carte vitale est implémentée
*   Test 2.03

Utilisation du certificat dont le CN est égal à « INSI-MANU » :
*   Test 1.06 si la fonction de recherche par carte vitale est implémentée
*   Test 2.06

## À vérifier

Le LPS, après avoir établi une liaison sécurisée TLS 1.2, permet d’émettre un flux avec un certificat X.509 serveur issu d’une autorité de certification de l'ANS dont les Common Name sont « INSI -AUTO » ou « INSI-MANU ».

L’URL d’appel pour l'authentification par carte CPX reste : https://qualiflps.services-ps.ameli.fr/lps pour l'environnement de tests et : https://services-ps.ameli.fr/lps pour l'environnement de production.

## Résultat à fournir

Fournir les traces des requêtes et réponses SOAP.
Présenter les éléments mettant en évidence (par tous les moyens) que les deux certificats (« INSI-AUTO » /« INSI-MANU ») ont bien été utilisés respectivement dans les tests mentionnés dans la description de ce test.

<table>
    <tr>
      <td>11/08/2025</td>
      <td>Guide de tests de conformité INSi</td>
      <td>20 / 42</td>
    </tr>
</table>

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 2.02 TER– AUTHENTIFICATION PRO SANTE CONNECT**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Guide d’intégration SEL-MP-043 §3.2 Description technique<br />Cadre d’interopérabilité CI_TLSI_AMO § 3.2.3 Accès direct avec<br />Pro Santé Connect</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si l’Authentification avec Pro Santé Connect est implémentée</u>

<u>Après avoir obtenu le jeton d’accès PSC et le jeton d’accès AM appeler l’opération :</u>
<u><ServiceIdentiteCertifiee:1.0.0:rechercherInsAvecTraitsIdentite>.</u>

<u>Remarque : Seuls les acteurs disposant d'un ordre professionnel et éligibles à une carte CPS sont</u>
<u>autorisés à utiliser le mode d’authentification Pro Santé Connect.</u>

## À vérifier

<u>L’attribut</u> <u><Subject><NameID@NameQualifier></u> <u>est</u> <u>renseigné</u> <u>à</u> <u>« PSC »</u> <u>et</u> <u>l’attribut</u>
<u><Subject><NameID> est renseigné avec l’identifiant national du partenaire de santé.</u>

<u>Dans l’assertion PS non signée dans la balise <AttributeStatement> :</u>

- L’attribut <IdentifiantFacturation> est renseigné avec le N°AM/FINESS Géographique/SIRET correspondant à la situation utilisée (en cas de multi-situations).
- Si le partenaire de santé dispose de plusieurs situations, l’attribut <gipProfessionCode> sera renseigné avec le codeProfession correspondant à la situation sélectionnée.
- L’attribut <SecteurActivite> est présent et renseigné avec le code secteur d’activité lié à la situation d’exercice sélectionnée du partenaire de santé.
- L’attribut <codeSpecialite> sera présent si le partenaire de santé est un médecin

<u>L’assertion PS non signée est valable 1 heure mais il est recommandé d’en générer une nouvelle à</u>
<u>chaque appel.</u>

## Résultat à fournir

<u>Présenter les éléments relatifs à la gestion des partenaires de santé multi-situations.</u>
Présenter les éléments relatifs à la gestion de la durée de vie de l’assertion PS.
<u>Fournir les requêtes/réponses soap. Fournir les Access Token des jetons AM correspondants.</u>

*11/08/2025* *Guide de tests de conformité INSi* 21 / 42

*SEL-GCONFORM-INSi* <span style="float: right;">*Version : 1.14*</span>

## **TEST 2.03 – TRAITS D’IDENTITE**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">Guide d’intégration §2.1 Introduction - Limitations du service<br /><b>[RG_INS210]</b> Acquérir les données d’appel du web service « Récupérer INS sans carte Vitale » (WS_INS2)<br /><b>[RG_INS230]</b> Acquérir la donnée prénom pour l’appel du web service « Récupérer INS sans carte Vitale » (WS_INS2)</td>
    </tr>
    <tr>
      <td colspan="2"></td>
      <td colspan="2">Fiche d’information du GIE SESAM-Vitale : PDT-INF-779</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

### **Description détaillée du test**

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » pour les patients ci-dessous avec toutes les données présentées :

**Cas 1 :**
Nom : D'ARTAGNAN DE L'HERAULT/ Prénom : Pierre-Alain
Sexe : M
Date de naissance : 14/04/1990

**Cas 2 :**                                      **Cas 3 :**
Nom : CORSE / Prénom : JOSEPH             Nom : D’ÆION / Prénom : Cœur
Sexe : M                                     Sexe : M
Date de naissance : 01/01/1999                Date de naissance : 01/01/1987
Code commune de naissance : 2A019             Code commune de naissance : 2B020

### À vérifier

**Cas 1 et 2 :** Le service retourne l’INS du patient et ses trais d’identités.

**Cas 3 :** Le LPS ne doit pas permettre d’émettre un flux dont une donnée ne respecte pas le format défini dans le guide d’intégration ou une donnée obligatoire manquante. Les nom et prénom doivent respecter les règles syntaxiques suivantes : lettres en majuscules et seulement les caractères spéciaux tiret et apostrophe autorisées. Si un nom/prénom est transmis avec une ligature, une erreur insi_27 sera restituée : erreur de format du champ prénom. Si le LPS effectue une correction des ligatures, une erreur desir_1020 sera restituée (patient non trouvé car non connu : restitution d’un CR 01 en production).

### Résultat à fournir

<u>Fournir les traces des requêtes et réponses SOAP</u> <u>(ainsi que les Access token du jeton AM</u> <u>correspondants en cas d'authentification par Pro Santé Connect).</u>
Fournir les copies d’écran du retour du service dans l’interface du logiciel. Décrire les contrôles mis en place pour empêcher l’émission d’un flux avec une donnée obligatoire manquante, une donnée avec un format non prévu dans le guide d’intégration.

*11/08/2025* *Guide de tests de conformité INSi* <span style="float: right;">*22 / 42*</span>
22

*SEL-GCONFORM-INSi* <span style="float:right">*Version : 1.14*</span>

# **TEST 2.04 – INS HISTORISEES**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Nom de naissance : ECETINSI<br />Prénoms : Pierre-Alain<br />Sexe : M<br />Date de naissance : 14/07/2009</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » avec le patient **Pierre-Alain.**

**Cas 1** : Interrogez le service INSi.

**Cas 2** : Injection du fichier (simulant une réponse du service) : TEST_2.04_cas2.xml.

## À vérifier

Dans la requête, le contexte BAM doit être présent et ne doit contenir que les données obligatoires définies dans le cadre d’interopérabilité et une balise COUVERTURE vide (<COUVERTURE />).

Le LPS doit acquérir l’INS actif et le ou les INS historisées.

**Cas 1** : La recherche aboutit : le service retourne l’INS actuel du patient ainsi que son INS historisée.

**Cas 2** : La recherche aboutit : le service retourne l’INS actuel du patient ainsi que ses INS historisées.
L’historique des INS d’un patient peut restituer jusqu’à 10 changements.

## Résultat à fournir

<u>Fournir les traces de la requête et la réponse SOAP (ainsi que les Access token du jeton AM correspondants en cas d'authentification par Pro Santé Connect).</u>

*11/08/2025* <span style="margin-left: 200px;">*Guide de tests de conformité INSi*</span> <span style="float:right">23 / 42</span>

*SEL-GCONFORM-INSi* <span style="float:right">*Version : 1.14*</span>

# **TEST 2.05 – NIA RETOURNE PAR LE SERVICE**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3"></td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Nom de naissance : PROVISOIRE<br />Prénoms : Matricule<br />Sexe : M<br />Date de naissance : 01/07/2009</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » pour le patient **Matricule**.

**Injection du fichier** (simulant une réponse du service) : **TEST_2.05.xml**.

## À vérifier

La recherche aboutit : le service retourne un INS de type NIA.

Le LPS doit afficher dans son interface le caractère non définitif de l’INS du patient.

## Résultat à fournir

Fournir les copies d’écran du retour du service dans l’interface du logiciel.

*11/08/2025* <span style="margin-left: 200px;">*Guide de tests de conformité INSi*</span> <span style="float:right">*24 / 42*</span>

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 2.06 – PLUSIEURS RESULTATS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3"><b>[RG_INS240]</b> Appeler le web service « Récupérer INS sans carte Vitale » (WS_INS2) avec un prénom du patient</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Nom : DE VINCI<br />Prénoms : Leonardo<br />Sexe : M<br />Date de naissance : 01/02/2014</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » pour le patient ci-dessus.

**Cas 1** : Interrogez le téléservice.

**Cas 2** : Interrogez le téléservice avec l’information Lieu de Naissance renseignée à « 63220 ».

## À vérifier

**Cas 1** : Plusieurs identités sont trouvées (CR à « 02 »). Le LPS doit afficher l’information à l’utilisateur.

**Cas 2** : <u>Le lieu de naissance étant connu, deux appels sont effectués,</u> le service retourne une seule identité (CR à « 00 »). L’information est affichée dans l’interface.

## Résultat à fournir

<mark><u>Fournir les traces de la requête et réponse SOAP (ainsi que les Access token du jeton AM correspondants en cas d'authentification par Pro Santé Connect).</u></mark>
Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025 Guide de tests de conformité INSi* 25 / 42

*SEL-GCONFORM-INSi Version : 1.14*

# **TEST 2.07 – PLUSIEURS PRENOMS**

<table>
    <tr>
      <td rowspan="2">Référence au guide d’intégration</td>
      <td><strong>[RG_INS230]</strong></td>
      <td colspan="2">Acquérir la donnée prénom pour l’appel du web service « Récupérer INS sans carte Vitale » (WS_INS2)</td>
    </tr>
    <tr>
      <td><strong>[RG_INS260]</strong></td>
      <td colspan="2">Appeler le web service « Récupérer INS sans carte Vitale » (WS_INS2) avec tous les prénoms du patient</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » pour les patients ci-dessous :

**Cas 1**
Nom de naissance : <mark>CORSE</mark>
Prénoms : <mark><u>Joseph Doume Pierre</u></mark>
Sexe : <mark><u>M</u></mark>
Date de naissance : <mark><u>01/01/1960</u></mark>

**Cas 2**
Nom de naissance : HOUILLES
Prénoms : Pierre Paul Jacques
Sexe : M
Date de naissance : 27/01/1993

**Cas 1** : Uniquement après le premier appel, injection du fichier (simulant une réponse du service) : **REP_**CR01.xml. <mark><u>(dans le cas où un CR 01 n’est pas restitué par le service)</u></mark>.

<u>**Cas 2 :** Après chaque appel, injection du fichier (simulant</u> une réponse du service) **: REP_CR01.xml.** <mark><u>(dans le cas où un CR 01 n’est pas restitué par le service)</u></mark>.

## À vérifier

Le LPS permet d’acquérir plusieurs prénoms.

Le LPS doit effectuer de multiples recherches lorsque plusieurs prénoms sont renseignés : un appel avec chacun des prénoms et un appel avec tous.

**Cas 1** : La recherche avec le deuxième prénom aboutit (<mark>Joseph</mark>). La recherche se termine, le résultat est affiché à l’utilisateur. 2 flux ont été générés.

**Cas 2** : La recherche n’aboutit pas. Que ce soit avec chacun des prénoms ou bien tous. Le résultat est affiché à l’utilisateur. 4 flux ont été générés.

## Résultat à fournir

<u>Fournir les traces des requêtes et réponses SOAP (2 flux pour le Cas 1 / 4 flux pour le Cas 2) - <mark>(ainsi que les Access token du jeton AM correspondants en cas d'authentification par Pro Santé Connect).</mark></u>
Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025 Guide de tests de conformité INSi 26 / 42*

SEL-GCONFORM-INSi Version : 1.14

# **TEST 2.08 – ACQUISITION INS BENEFICIAIRES HORS REGIME GENERAL ET REGIMES HEBERGES**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3"><b>[RG_INS230]</b> Acquérir la donnée prénom pour l’appel du web service « Récupérer INS sans carte Vitale » (WS_INS2)</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Recherche avec Traits d’Identité » pour les patients ci-dessous :

**Cas 1**
Nom de naissance : CORSE
Prénoms : Anthony
Sexe : M
Date de naissance : 02/03/1980

**Cas 2**
Nom de naissance : HERMAN
Prénoms : Gatien
Sexe : M
Date de naissance : 24/03/1981

**Cas 1** : Injection du fichier (simulant une réponse du service) : **TEST_2.08_cas1.xml**.

**Cas 2** : Injection du fichier (simulant une réponse du service) : **TEST_2.08_cas2.xml**.

## À vérifier

Pour les deux cas, le LPS acquiert l’INS du patient.

**Cas 1** : le LPS permet d’acquérir en sortie du service un code lieu de naissance avec un caractère alpha.

**<u>Remarque</u>** : Dans les réponses obtenues en environnement de tests pour l’opération « Recherche avec Traits d’Identité », les éléments liés à l’espace de nommage [http://www.cnamts.fr/INSiResultat](http://www.cnamts.fr/INSiResultat) n’ont pas de préfixe. Par contre, dans les fichiers à injecter pour simuler une réponse du service, les éléments lié à l’espace de nommage http://www.cnamts.fr/INSiResultati ont un préfixe « ns2 », (xmlns : ns2=[http://www.cnamts.fr/INSiResultat](http://www.cnamts.fr/INSiResultat)).

Comme indiqué dans le cadre d’interopérabilité (§2.2 Espace de noms) : « Le préfixe est une facilité pour associer un élément et un espace de nommage dans le message XML. Il peut prendre n’importe quelle valeur. En conséquence, un progiciel doit donc pouvoir interpréter et exploiter les messages XML sans présupposer la valeur du préfixe. Le choix de ces préfixes est arbitraire et n’est pas signifiant. ».

## Résultat à fournir

Fournir les copies d’écran du retour du service dans l’interface du logiciel pour chacun des cas de test.

*11/08/2025* *Guide de tests de conformité INSi* *27 / 42*

*SEL-GCONFORM-INSi* *Version : 1.14*

# **3 Vérification unitaire de l’INS et des traits d’identité**

## **TEST 3.01 – OBSOLESCENCE ASSERTION PS**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Cas 1 du fichier<br />« INS_A_VERIFIER_Vx.xx.xlsx »</td>
    </tr>
</table>

### Description détaillée du test

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté.</u>

**Cas 1** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » avec le cas 1 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire», attendre une heure et relancer une requête.

**Cas 2** : Lancez l’opération « Vérification unitaire» avec le cas 1 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet «Vérification unitaire», retirer la CPS du lecteur et relancer une requête.

### À vérifier

Avant tout lancement de requête, le logiciel doit vérifier que l’assertion PS n’est pas obsolète.

**Cas 1** : L’assertion étant obsolète, le logiciel doit automatiquement en générer une nouvelle (niveau de contrôle de l’assertion PS de type « 2 »).

**Cas 2** : Le logiciel ayant détecté l’absence de CPS, le logiciel ne doit pas permettre de lancer la requête.
Dans ce cas, le LPS doit :
- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la CPS.

### Résultat à fournir

**Cas 1** : Fournir les traces des requêtes et réponses SOAP.

**Cas 2** : Fournir les copies d’écran de l’interface informant de l’absence de la CPS et la nécessité de saisir à nouveau le code porteur.

*11/08/2025* *Guide de tests de conformité INSi* 28 / 42

*SEL-GCONFORM-INSi* <mark>Version : 1.14</mark>

# **TEST 3.02 – DETAIL ASSERTION PS**

<table>
    <tr>
      <th colspan="2">Référence au guide d’intégration</th>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <th>État du test</th>
      <td>Actif</td>
      <th>Informations<br />patient</th>
      <td></td>
    </tr>
</table>

## **Description détaillée du test**

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté.</u>

Suite du test précédent.

## **À vérifier**

Dans l’assertion PS une balise `<AttributeStatement>` est bien renseignée avec : `<identifiantFacturation>`, `<codeSpecialite>` et `<secteurActivite>`.

L’attribut `<codeSpecialite>` ne sera renseigné qu’en présence d’une CPS/CPF médecin/médecin en formation.

## **Résultat à fournir**

Décrire la cinématique mise en œuvre concernant la gestion du niveau de sécurité 2 de l’assertion PS.
Présenter les éléments mettant en évidence que les attributs de l’assertion PS sont issus de la CPX.

*11/08/2025* *Guide de tests de conformité INSi* 29 / 42

*SEL-GCONFORM-INSi* <span style="float:right">*Version : 1.14*</span>

# **TEST 3.02 BIS– AUTHENTIFICATION MUTUELLE TLS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Guide d’intégration SEL-MP-043<br />ANNEXE 3 : Authentification TLS mutuelle par certificat logiciel.<br /><br />Fiche d’information du GIE SESAM-Vitale : PDT-INF-743</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si l’Authentification Mutuelle est implémentée</u>

Réaliser les cas définis dans le test 3.03 selon le type de certification demandée.

Pour les autres tests ils seront réalisés en authentification mutuelle (certificat « INSI-AUTO » ou « INSI-MANU ») si l’authentification par carte CPX n’est pas implémentée.

## À vérifier

Le LPS, après avoir établi une liaison sécurisée TLS 1.2, permet d’émettre un flux avec un certificat X.509 serveur issu d’une autorité de certification de l'ANS dont les Common Name sont « INSI -AUTO » ou « INSI-MANU ».

L’URL d’appel pour l'authentification par carte CPX reste : https://qualiflps.services-ps.ameli.fr/lps pour l'environnement de tests et : https://services-ps.ameli.fr/lps pour l'environnement de production.

## Résultat à fournir

Fournir les traces des requêtes et réponses SOAP.

Présenter les éléments mettant en évidence (par tous les moyens) que les deux certificats (« INSI-AUTO » /« INSI-MANU ») ont bien été utilisés respectivement dans les tests mentionnés dans la description de ce test.

*11/08/2025* <span style="margin-left: 200px;">*Guide de tests de conformité INSi*</span> <span style="float:right">*30 / 42*</span>

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 3.02 TER– AUTHENTIFICATION PRO SANTE CONNECT**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">Guide d’intégration SEL-MP-043 §3.2 Description technique<br />Cadre d’interopérabilité CI_TLSI_AMO § 3.2.3 Accès direct avec<br />Pro Santé Connect</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

### <mark>Description détaillée du test</mark>

<u><mark>Test à réaliser uniquement si l’Authentification avec Pro Santé Connect est implémentée</mark></u>

<mark><u>Après avoir obtenu le jeton d’accès PSC et le jeton d’accès AM appeler l’opération</u> :</mark>
<mark>\<u><ServiceVerificationIdentiteCertifiee:1.0.0:verifierInsAvecTraitsIdentite>.</u></mark>

<mark>Remarque : <u>Seuls les acteurs disposant d'un ordre professionnel et éligibles à une carte CPS sont</u></mark>
<u><mark>autorisés à utiliser le mode d’authentification Pro Santé Connect.</mark></u>

### <mark>À vérifier</mark>

<mark>L’attribut \<Subject>\<NameID@NameQualifier> est renseigné à <u>« PSC »</u> et l’attribut</mark>
<mark>\<Subject>\<NameID> est renseigné avec l’identifiant national du partenaire de santé.</mark>

<mark>Dans l’assertion PS non signée dans la balise \<AttributeStatement> :</mark>

- <mark>L’attribut \<IdentifiantFacturation> est renseigné avec le N°AM/FINESS</mark>
  <mark>Géographique/SIRET correspondant à la situation utilisée (en cas de multi-situations).</mark>
- <mark>Si le partenaire de santé dispose de plusieurs situations, l’attribut \<gipProfessionCode></mark>
  <mark>sera renseigné avec le codeProfession correspondant à la situation sélectionnée.</mark>
- <mark>L’attribut \<SecteurActivite> est présent et renseigné avec le code secteur d’activité lié à</mark>
  <mark>la situation d’exercice sélectionnée du partenaire de santé.</mark>
- <mark>L’attribut \<codeSpecialite> sera présent si le partenaire de santé est un médecin</mark>

<mark><u>L’assertion PS non signée est valable 1 heure mais il est recommandé d’en générer une nouvelle à</u></mark>
<mark><u>chaque appel.</u></mark>

### <mark>Résultat à fournir</mark>

<mark><u>Présenter les éléments relatifs à la gestion des partenaires de santé multi-situations.</u></mark>
<mark>Présenter les éléments relatifs à la gestion de la durée de vie de l’assertion PS.</mark>
<mark><u>Fournir les requêtes/réponses soap. Fournir les Access Token des jetons AM correspondants.</u></mark>

*11/08/2025* *Guide de tests de conformité INSi* *31 / 42*

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 3.03 – MISE EN ŒUVRE DE LA VERIFICATION UNITAIRE**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2"><strong>[RG_INS310]</strong> "Acquérir les données d’appel du web service «<br />vérifier l’INS et les traits d’identité d’un patient "<br />(WS_INS3).<br /><strong>[RG_INS320]</strong> Appeler le web service « vérifier l’INS et les traits<br />d’identité d’un patient » (WS_INS3)<br />3.4.1 Description fonctionnelle des données</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Cas 1 à 10 du fichier<br />« INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour les cas 1 à 10 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

•

### À vérifier

Le contexte BAM doit être présent et ne doit contenir que les données obligatoires définies dans le cadre d’interopérabilité et une balise COUVERTURE autofermante (<COUVERTURE />).

La balise \<Prenom> ne doit pas être présente dans le corps de la requête (Body/ RequeteUnitaire/ IndividuVerifie/ TraitsIdentiteIndividu/ Prenom). Le/les prénoms doivent être renseigné(s) dans la balise \<ListePrenoms>.

Le format de la liste des prénoms d’état civil et du nom de naissance doit être conforme au format décrit dans le guide d’intégration (et celui obtenu en sortie des opérations de recherche) : Lettres majuscules non accentuées (A à Z), espace, et caractères spéciaux apostrophe « ' » (code ASCII 39), tiret « - » (code ASCII 45), et uniquement pour le nom de naissance, le double tiret « -- » (code ASCII45). Le 1er caractère doit être différent de blanc (espace) et de tiret, et peut être égal à l’apostrophe. Blanc (espace) et apostrophe ne peuvent être doublés ou combinés.

Le LPS doit indiquer dans son interface que la vérification a été effectuée avec succès : CR « 00 » en sortie du service.

### Résultat à fournir

Fournir les traces de la requête et réponse SOAP <mark><u>(ainsi que les Access token du jeton AM correspondants en cas d'authentification par Pro Santé Connect)</u></mark> pour les cas 1, 3, 7 et 10. Fournir les copies d’écran, pour l’ensemble des cas, du retour du service dans l’interface du logiciel. Présenter la copie d’écran de l’interface du LPS mettant en évidence que la vérification a été effectuée avec succès. Présenter le contrôle effectué sur le format des données en entrée du service.

*11/08/2025 Guide de tests de conformité INSi* 32 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 3.04 – DONNEES OBLIGATOIRES EN ENTREE DU SERVICE**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2"><strong>[RG_INS310]</strong> "Acquérir les données d’appel du web service<br />vérifier l’INS et les traits d’identité d’un patient "<br />(WS_INS3).<br /><br />3.4.1 Description fonctionnelle des données</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Cas 12 à 13 du fichier<br />« INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

**Cas 1** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour le cas 12 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

**Cas 2** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour le cas 13 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

## À vérifier

**Cas 1** : Le LPS ne doit pas permettre d’émettre un flux avec une donnée obligatoire manquante : `<NumIdentifiant>`, `<Cle>`, `<OID>`, `<NomNaissance>`, `<ListePrenom>`, `<Sexe>`, `<DateNaissance>`.

**Cas 2** : Le LPS peut ne pas transmettre dans le flux la donnée optionnelle `<LieuNaissance>` (le LPS peut également systématiquement transmettre cette données dans la mesure où elle aura été acquise en sorties des opérations de recherche avec carte vitale ou avec les traits d’identité).

## Résultat à fournir

**Cas 1** : Présenter les éléments mettant en évidence qu’un flux ne peut être émis en l’absence d’une donnée obligatoire (balise absente ou auto-fermante).

**Cas 2** : Présenter le traitement effectué sur la donnée optionnelle du lieu de naissance.

*11/08/2025* *Guide de tests de conformité INSi* 33 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 3.05 – COMPTE-RENDU 01 : ECHEC DE LA VERIFICATION**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3"><b>[RG_INS320]</b> Appeler le web service « vérifier l’INS et les traits<br />d’identité d’un patient » (WS_INS3)</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>Cas 2, 14 et 15 du fichier<br />« INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

**Cas 1** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour le cas 2 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

**Cas 2** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour le cas 14 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

<u>Remarque</u> : pour les LPS implémentant les opérations de recherche de l’INS, il est possible d’injecter le fichier (simulant une réponse du service) : TEST_2.05.xml (se trouvant dans le fichier « Fichiers .XML à injecter v1.xx » du package de tests).

**Cas 3** : Lancez l’opération « Vérifier l'INS et les traits d'identité d'un patient (vérification unitaire) » pour le cas 15 du fichier « INS_A_VERIFIER_V1.xx », onglet «Vérification unitaire».

## À vérifier

**Cas 1** : Le LPS doit permettre d’envoyer un code lieu de naissance alphanumérique acquis en sortie des opérations de recherche.

**Cas 2** : L’OID 1.2.250.1.213.1.4.9 (NIA) doit être transmis dans la requête (**erreur insi_105 obtenue en sortie de la vérification**).

**Cas 3** : Le LPS doit indiquer dans son interface que la vérification a échoué : CR « 01 » en sortie du service.

## Résultat à fournir

<mark><u>Pour les trois cas, fournir les traces des requêtes et réponses SOAP (ainsi que les Access token du jeton AM correspondants en cas d'authentification par Pro Santé Connect).</u></mark>, ainsi qu’une copie d’écran de l’interface indiquant que la vérification est en échec pour le cas 3.

*11/08/2025* *Guide de tests de conformité INSi* 34 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **4 Vérifier l'INS et les traits d'identité de plusieurs patients (vérification en masse)**

## **TEST 4.01 – OBSOLESCENCE ASSERTION PS**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td>lot1 du fichier<br />« INS_A_VERIFIER_Vx.xx.xlsx »</td>
    </tr>
</table>

### Description détaillée du test

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté.</u>

**Cas 1** : Lancez l’opération « Déposer un lot à vérifier » (opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotDepot>`) avec le lot 1 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse », attendre une heure et relancer une requête.

**Cas 2** : Lancez l’opération « Déposer un lot à vérifier » avec le lot 1 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse », retirer la CPS du lecteur et relancer une requête.

### À vérifier

Avant tout lancement de requête, le logiciel doit vérifier que l’assertion PS n’est pas obsolète.

**Cas 1** : L’assertion étant obsolète, le logiciel doit automatiquement en générer une nouvelle (niveau de contrôle de l’assertion PS de type « 2 »).

**Cas 2** : Le logiciel ayant détecté l’absence de CPS, le logiciel ne doit pas permettre de lancer la requête.
Dans ce cas, le LPS doit :
- Afficher un message à l’utilisateur l’invitant à réintroduire sa carte,
- Demander la saisie du code porteur de la CPS.

### Résultat à fournir

**Cas 1** : Fournir les traces des requêtes et réponses SOAP.

**Cas 2** : Fournir les copies d’écran de l’interface informant de l’absence de la CPS et la nécessité de saisir à nouveau le code porteur.

*11/08/2025* *Guide de tests de conformité INSi* 35 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 4.02 – DETAIL ASSERTION PS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Cadre d’interopérabilité des TLSi AMO §3.2.2 « Assertion PS»</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si le mode d’authentification par carte CPX Assertion PS est implémenté.</u>

Suite du test précédent.

## À vérifier

Dans l’assertion PS, une balise `<AttributeStatement>` est bien renseignée avec : `<identifiantFacturation>`, `<codeSpecialite>` et `<secteurActivite>`.

L’attribut `<codeSpecialite>` ne sera renseigné qu’en présence d’une CPS/CPF médecin/médecin en formation.

## Résultat à fournir

Décrire la cinématique mise en œuvre concernant la gestion du niveau de sécurité 2 de l’assertion PS.
Présenter les éléments mettant en évidence que les attributs de l’assertion PS sont issus de la CPX.

*11/08/2025* *Guide de tests de conformité INSi* *36 / 42*

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 4.02 BIS– AUTHENTIFICATION MUTUELLE TLS**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Guide d’intégration SEL-MP-043<br /><br />ANNEXE 3 AUTHENTIFICATION TLS MUTUELLE PAR CERTIFICAT LOGICIEL</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si l’Authentification Mutuelle est implémentée</u>

Réaliser les tests suivant en Authentification Mutuelle par certificat logiciel :

- Utilisation du certificat dont le CN est égal à « INSI-AUTO » et refaire le cas en assertion PS: Test 4.03
- Utilisation du certificat dont le CN est égal à « INSI-MANU » : Test 4.04

Pour les autres tests ils seront réalisés en authentification mutuelle (certificat « INSI-AUTO » ou « INSI-MANU ») si l’authentification par carte CPX n’est pas implémentée.

<u>Dans le cadre d’un différentiel consistant à l’implémentation de l’authentification mutuelle (LPS déjà certifié pour cette opération) seuls les tests suivants doivent être réalisés : </u>

- Utilisation du certificat dont le CN est égal à « INSI-AUTO » : Test 4.03
- Utilisation du certificat dont le CN est égal à « INSI-MANU » : Test 4.04

## À vérifier

Le LPS, après avoir établi une liaison sécurisée TLS 1.2, permet d’émettre un flux avec un certificat X.509 serveur issu d’une autorité de certification de l'ANS dont les Common Name sont « INSI-AUTO » ou « INSI-MANU ».

L’URL d’appel pour l'authentification par carte CPX reste : https://qualiflps.services-ps.ameli.fr/lps pour l'environnement de tests et : https://services-ps.ameli.fr/lps pour l'environnement de production.

## Résultat à fournir

Fournir les traces des requêtes et réponses SOAP.

Présenter les éléments mettant en évidence (par tous les moyens) que les deux certificats (« INSI-AUTO » /« INSI-MANU ») ont bien été utilisés respectivement dans les tests mentionnés dans la description de ce test.

*11/08/2025* *Guide de tests de conformité INSi* 37 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 4.02 TER– AUTHENTIFICATION PRO SANTE CONNECT**

<table>
    <tr>
      <td>Référence au guide d’intégration</td>
      <td colspan="3">Guide d’intégration SEL-MP-043 §3.2 Description technique<br />Cadre d’interopérabilité CI_TLSI_AMO § 3.2.3 Accès direct avec<br />Pro Santé Connect</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations<br />patient</td>
      <td></td>
    </tr>
</table>

## Description détaillée du test

<u>Test à réaliser uniquement si l’Authentification avec Pro Santé Connect est implémentée</u>

<u>Après avoir obtenu le jeton d’accès PSC et le jeton d’accès AM appeler l’opération</u> :
`<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotDepot>`.

<u>Remarque : Seuls les acteurs disposant d'un ordre professionnel et éligibles à une carte CPS sont</u> <u>autorisés à utiliser le mode d’authentification Pro Santé Connect.</u>

## À vérifier

L’attribut `<u><Subject><NameID@NameQualifier></u>` est renseigné à <u>« PSC »</u> et l’attribut `<Subject><NameID>` est renseigné avec l’identifiant national du partenaire de santé.

Dans l’assertion PS non signée dans la balise `<AttributeStatement>` :

- L’attribut `<IdentifiantFacturation>` est renseigné avec le N°AM/FINESS Géographique/SIRET correspondant à la situation utilisée (en cas de multi-situations).
- Si le partenaire de santé dispose de plusieurs situations, l’attribut `<gipProfessionCode>` sera renseigné avec le codeProfession correspondant à la situation sélectionnée.
- L’attribut `<SecteurActivite>` est présent et renseigné avec le code secteur d’activité lié à la situation d’exercice sélectionnée du partenaire de santé.
- L’attribut `<codeSpecialite>` sera présent si le partenaire de santé est un médecin

<u>L’assertion PS non signée est valable 1 heure mais il est recommandé d’en générer une nouvelle à</u> <u>chaque appel.</u>

## Résultat à fournir

<u>Présenter les éléments relatifs à la gestion des partenaires de santé multi-situations.</u>
Présenter les éléments relatifs à la gestion de la durée de vie de l’assertion PS.
<u>Fournir les requêtes/réponses soap. Fournir les Access Token des jetons AM correspondants.</u>

*11/08/2025* *Guide de tests de conformité INSi* 38 / 42

*SEL-GCONFORM-INSi* *Version : 1.14*

# **TEST 4.03 – DEPOT ET RETRAIT D’UN LOT AVEC CR « 00 »**

<table>
    <tr>
      <td rowspan="3">Référence au guide d’intégration</td>
      <td><b>[RG_INS410]</b> Acquérir les données du lot de patients dont l’INS est à vérifier.</td>
    </tr>
    <tr>
      <td><b>[RG_INS420]</b> Appeler le web service « Déposer un lot à vérifier » (WS_INS4).</td>
    </tr>
    <tr>
      <td><b>[RG_INS430]</b> Appeler le web service « Récupérer le résultat de la vérification d’un lot » (WS_INS5) 3.4.1 Description fonctionnelle des données.</td>
    </tr>
</table>
<table>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Lot 2 fichier « INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

### Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Déposer un lot à vérifier » (opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotDepot>`) avec le lot 2 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse ».

Après avoir obtenu le N° de lot (`<IdLot>`) et une estimation du délai de traitement (`<EstimDelai>`) en sortie de l’opération « Déposer un lot à vérifier », appeler l’opération «Récupérer le résultat de la vérification d’un lot» (opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotRetrait>`).

### À vérifier

Le LPS ne permet pas d’appeler l’opération «Récupérer le résultat de la vérification d’un lot» tant que l’estimation du délai de traitement (`<EstimDelai>`) n’est pas expirée.

Le LPS doit indiquer dans son interface que la vérification a été effectuée avec succès : CR « 00 » en sortie du service, la vérification a été effectuée avec succès pour l’ensemble des INS du lot.

Dans le lot déposé, la balise `<Prenom>` ne doit pas être présente dans le corps de la requête (`/Body/LotDeRequetes/ReqUnitaire/IndividuVerifie/TraitsIdentiteIndividu/Prenom`). Le/les prénoms doivent être renseigné(s) dans la balise **`**<ListePrenoms>.**`**

Le format de la liste des prénoms d’état civil et du nom de naissance doit être conforme au format décrit dans le guide d’intégration (et celui obtenu en sortie des opérations de recherche) : Lettres majuscules non accentuées (A à Z), espace, et caractères spéciaux apostrophe « ' » (code ASCII 39), tiret « - » (code ASCII 45), double tiret « -- » (deux codes ASCII 45). Le 1er caractère doit être différent de blanc (espace) et de tiret, et peut être égal à l’apostrophe. Blanc (espace) et apostrophe ne peuvent être doublés ou combinés.

### Résultat à fournir

<u>Fournir les traces de la requête et réponse SOAP <mark>(ainsi que l’Access token du jeton AM correspondant en cas d'authentification par Pro Santé Connect).</mark></u> . Présenter la copie d’écran de l’interface du LPS mettant en évidence que la vérification a été effectuée avec succès pour l’ensemble des INS du lot. Présenter le contrôle mis en œuvre pour vérifier le bon format des données en entrée de l’opération `<verifierInsLotDepot>`.

Présenter les éléments mettant en évidence que le LPS ne permet pas d’appeler l’opération « Récupérer le résultat de la vérification d’un lot» tant que le délai de traitement estimé (`<EstimDelai>`) n’est pas expiré.

*11/08/2025* *Guide de tests de conformité INSi* 39 / 42

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 4.04 – DEPOT ET RETRAIT D’UN LOT AVEC CR « 01 »**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2"><strong>[RG_INS410]</strong> Acquérir les données du lot de patients dont l’INS est à vérifier.<br /><strong>[RG_INS420]</strong> Appeler le web service « Déposer un lot à vérifier » (WS_INS4).<br /><strong>[RG_INS430]</strong> Appeler le web service « Récupérer le résultat de la vérification d’un lot » (WS_INS5) 3.4.1 Description fonctionnelle des données.</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Lot 1 fichier « INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Lancez l’opération « Déposer un lot à vérifier » (opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotDepot>`) avec le lot 1 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse ».

Après avoir obtenu le N° de lot (`<IdLot>`) et une estimation du délai de traitement (`<EstimDelai>`) en sortie de l’opération « Déposer un lot à vérifier », appeler l’opération « Récupérer le résultat de la vérification d’un lot » (opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotRetrait>`).

<u>Remarque</u> : pour les bénéficiaires CORSE Anthony et PROVISOIRE Matricule et pour les LPS implémentant les opérations de recherche de l’INS, il est possible d’injecter le fichier (simulant une réponse du service) : TEST_2.08_cas1.xml et TEST_2.05.xml (se trouvant dans le fichier « Fichiers .XML à injecter v1.xx » du package de tests).

## À vérifier

Le LPS doit indiquer dans son interface que la vérification a échoué pour au moins un INS du lot : CR « 01 » en sortie du service.

Le LPS ne doit pas permettre d’émettre un flux avec une donnée obligatoire manquante pour l’une des vérifications du lot dans l’opération `<verifierInsLotDepot>` : `<NumIdentifiant>`, `<Cle>`, `<OID>`, `<NomNaissance>`, `<ListePrenom>`, `<Sexe>`, `<DateNaissance>`, même si l’une de ces données a été restituée vide en sortie de recherche. A défaut, une erreur SOAP sera restituée (erreur de type insi_19 « Le champ nom de naissance est obligatoire »…) empêchant le dépôt du lot.

Le LPS peut ne pas transmettre dans le flux la donnée optionnelle `<LieuNaissance>` (le LPS peut également systématiquement transmettre cette donnée dans la mesure où elle aura été acquise en sortie des opérations de recherche avec carte vitale ou avec les traits d’identité).

## Résultat à fournir

<u>Fournir les traces de la requête et réponse SOAP</u> <mark><u>(ainsi que l’Access token du jeton AM correspondant en cas d'authentification par Pro Santé Connect).</u></mark> pour les deux opérations. Présenter la copie d’écran de l’interface du LPS mettant en évidence que la vérification a échoué pour au moins l’un des INS du lot.

Présenter les éléments mettant en évidence qu’un flux pour l’opération `<verifierInsLotDepot>` ne peut être émis en l’absence d’une donnée obligatoire (balise absente).

Présenter le traitement effectué sur la donnée optionnelle du lieu de naissance.

*11/08/2025 Guide de tests de conformité INSi* 40 / 42

*SEL-GCONFORM-INSi* <span style="float: right;">*Version : 1.14*</span>

## **TEST 4.05 – DEPOT ET RETRAIT D’UN LOT AVEC CR « 02 »**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2"><b>[RG_INS410]</b> Acquérir les données du lot de patients dont l’INS est à vérifier.<br /><b>[RG_INS420]</b> Appeler le web service « Déposer un lot à vérifier » (WS_INS4).<br /><b>[RG_INS430]</b> Appeler le web service « Récupérer le résultat de la vérification d’un lot » (WS_INS5) 3.4.1 Description fonctionnelle des données.</td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Lot 2 fichier<br />« INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

### Description détaillée du test

En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).

Lancez l’opération «Déposer un lot à vérifier» avec le lot 2 du fichier « INS_A_VERIFIER_Vx.xx.xlsx » onglet, « Vérification en masse »,

Après avoir obtenu le N° de lot en sortie de l’opération « Déposer un lot à vérifier », appeler l’opération « Récupérer le résultat de la vérification d’un lot » et injecter le fichier REP_CR02.xml pour simuler une réponse du service (après avoir modifié dans ce dernier le contenu de la balise `<ns1:IdLot>XXXX</ns1:IdLot>` avec le numéro de lot obtenu en sortie de l’opération : `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotDepot>`, pour assurer une cohérence).

Appeler l’opération « Récupérer le résultat de la vérification d’un lot » (sans injecter de fichier).

### À vérifier

Après avoir obtenu un CR 02 et une estimation du délai de fin de traitement de lot (`<ns1:EstimDelai>00:03:00</ns1:EstimDelai>`), le LPS rappelle « Récupérer le résultat de la vérification d’un lot ».

Le LPS ne doit pas permettre d’appeler l’opération « Récupérer le résultat de la vérification d’un lot » tant que le délai estimé restitué n’est pas expiré (à partir de la réception du CR02).

Le LPS acquiert le lot traité et le résultat de la vérification des INS du lot.

### Résultat à fournir

Décrire la cinématique mise en œuvre en cas de restitution d’un CR02 en sortie de l’opération « Récupérer le résultat de la vérification d’un lot ».

Présenter les éléments mettant en évidence qu’un appel à l’opération `<ServiceVerificationIdentiteCertifieeLot:1.0.0:verifierInsLotRetrait>` n’est pas possible tant que le délai estimé n’est pas expiré.

*11/08/2025* <span style="margin-left: 200px;">*Guide de tests de conformité INSi*</span> <span style="float: right;">*41 / 42*</span>

*SEL-GCONFORM-INSi* Version : 1.14

# **TEST 4.06 – PARAMETRAGE DU NOMBRE DE VERIFICATIONS POUR UN LOT**

<table>
    <tr>
      <td colspan="2">Référence au guide d’intégration</td>
      <td colspan="2">
        <strong>[RG_INS410]</strong> Acquérir les données du lot de patients dont l’INS est à vérifier.<br />
        <strong>[RG_INS420]</strong> Appeler le web service « Déposer un lot à vérifier » (WS_INS4).<br />
        <strong>[RG_INS430]</strong> Appeler le web service « Récupérer le résultat de la vérification d’un lot » (WS_INS5) 3.4.1 Description fonctionnelle des données.
      </td>
    </tr>
    <tr>
      <td>État du test</td>
      <td>Actif</td>
      <td>Informations patient</td>
      <td>Lots 2 et 3 fichier « INS_A_VERIFIER_V1.xx »</td>
    </tr>
</table>

## Description détaillée du test

<mark>En cas d’implémentation de plusieurs modes d’authentification ou dans le cadre de l’ajout d’un ou deux modes d’authentification sur une ou plusieurs opérations déjà certifiée, pour connaître le mode d’authentification à appliquer au test, se reporter au plan de tests personnalisé fourni en retour de contractualisation (récapitulatif fourni également en préambule du présent guide de tests).</mark>

Modifier le paramétrage du nombre de vérifications possibles par lot :
- Minimum 5 vérifications
- Maximum 10 vérifications

**Cas 1** : Lancez l’opération « Déposer un lot à vérifier» avec le lot 2 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse ».

**Cas 2** : Lancez l’opération « Déposer un lot à vérifier» avec le lot 3 du fichier « INS_A_VERIFIER_Vx.xx.xlsx », onglet « Vérification en masse ».

## À vérifier

Pour les cas 1 et 2, le LPS ne doit pas permettre de déposer un lot : le nombre minimum ou maximum de vérifications paramétrées n’étant pas respecté.

Le LPS implémente un paramétrage du nombre de vérifications par lot.

Cette modification du paramétrage du nombre de vérifications ne peut être mise en œuvre que par l’éditeur (pas de modification possible par le PS).

## Résultat à fournir

Présenter les éléments mettant en évidence qu’actuellement le paramétrage du nombre de vérifications est : minimum : 1 et maximum 100.

Présenter les éléments mettant en évidence qu’un paramétrage du nombre minimum/maximum de vérifications est implémenté et qu’il ne peut être modifié que par l’éditeur.

*11/08/2025 Guide de tests de conformité INSi* 42 / 42