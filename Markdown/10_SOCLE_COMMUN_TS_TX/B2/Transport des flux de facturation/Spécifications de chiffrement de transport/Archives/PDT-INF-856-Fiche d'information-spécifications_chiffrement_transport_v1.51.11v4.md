logo: sesam-vitale

logo: <u>- Fiche d’information -.</u>

---

**Référence** **PDT-INF-856** **Date** **26.03.2024**
**Objet** **Evolution - Spécifications de Transport des flux de facturation**
**par messagerie SMTP et chiffrement de transport V1.51.11**

<table>
    <tr>
      <td><u>Type</u></td>
      <td>☒ Technique</td>
      <td>☐ Pratique</td>
      <td>☐ Communication</td>
      <td>☒ Livraison</td>
    </tr>
    <tr>
      <td><u>Destinataires</u></td>
      <td>☒ Éditeurs</td>
      <td>☐ Équipementiers</td>
      <td>☐ OCT</td>
      <td>☐ CIS</td>
    </tr>
    <tr>
      <td><u>Produits</u></td>
      <td>Facturation<br />☐ CDC Éditeurs<br />SESAM-Vitale<br />☐ CDC OCT<br />☐ FSV agrément<br />☐ FSV exploitation<br />☐ SCOR<br />☐ CDC FIDES ACE<br />☒ Spécifications de<br />chiffrement de<br />transport</td>
      <td>Référentiels<br />☐ Dispositif Intégré<br />☐ Terminal lecteur<br />☐ TLA<br />☐ Lecture Vitale<br />☐ Télémise à jour</td>
      <td>Produits d’infrastructure<br />☐ ATSAM<br />☐ SrvSVCNAM<br />☐ GALSS<br /><br />Services en Ligne<br />☐ CDR<br />☐ Espace pro</td>
      <td>Téléservices intégrés<br />☐ AATi<br />☐ ADRi<br />☐ ALDi<br />☐ CDRi<br />☐ DMTi<br />☐ HRi<br />☐ IMTi<br />☐ PEC +<br />☐ PEM 2D<br />☐ SEFi<br />☐ SPEi<br /><br />Acquisition des droits<br />☐ API de Lecture<br />Vitale</td>
    </tr>
    <tr>
      <td><u>Secteur</u></td>
      <td>☐ Libéral</td>
      <td>☒ Hospitalier</td>
      <td colspan="2"></td>
    </tr>
    <tr>
      <td><u>Professionnels</u><br /><u>de Santé</u><br /><u>concernés</u></td>
      <td>☐ Médecins<br />☐ Sages-femmes<br />☐ Chirurgiens-dentistes<br />☐ Pharmaciens<br />☐ Laboratoires</td>
      <td>☐ Auxiliaires médicaux<br />☐ Centres de Santé<br />☐ Fournisseurs<br />☒ Transporteurs</td>
      <td>☒ Établissements publics<br />☒ Cliniques privées<br />☒ ESPIC(PNL)<br />☒ HIA</td>
      <td></td>
    </tr>
    <tr>
      <td><u>Prise en compte</u></td>
      <td>☐ Facultative</td>
      <td>☒ Obligatoire</td>
      <td colspan="2"></td>
    </tr>
</table>

## **Contexte**
Compte tenu de la confidentialité des informations qu’ils contiennent, les flux de facturation échangés entre d’une part les professionnels de santé hors périmètre SESAM-Vitale et, d’autre part les régimes d’Assurances Maladie (AMO et AMC) doivent être chiffrés.

Les établissements de santé mentionnés aux a), b), c), d) de [l’article L162-22-6 du code de la Sécurité Sociale](https://www.legifrance.gouv.fr/affichCodeArticle.do?cidTexte=LEGITEXT000006073189&idArticle=LEGIARTI000006740658)</u>, les établissements médico-sociaux relevant du code de l’action sociale et des familles et les transporteurs doivent donc suivre les règles décrites dans les spécifications de « Transport des flux de facturation par messagerie SMTP et chiffrement de transport », rédigées par le GIE SESAM-Vitale.

## **Évolutions**
<mark><u>**La présente évolution concerne les éditeurs qui ont pour clients des établissements qui</u> <u>fonctionnent avec un logiciel de facturation et un logiciel de chiffrement de transport</u> <u>distincts.**</u></mark>

<mark><u>**Cette nouvelle version, V1.51.11 permet d’adapter les spécifications de chiffrement de</u> <u>transport pour que le logiciel de facturation puisse réaliser le rapprochement des retours</u> <u>des AMO ou des AMC qui lui sont destinés, avec le fichier de factures qu’il a initialement</u> <u>transmis au logiciel de chiffrement.**</u></mark>

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
~~<u>www.sesam-vitale.fr</u>~~ - <u>centre-de-service@sesam-vitale.fr</u> icon: twitter

1

logo: sesam-vitale


# - Fiche **d’information** -

<u>Cette évolution entraîne également une adaptation :</u>
- du fichier « [création fichier logique AMO](https://industriels.sesam-vitale.fr/documents/d/industriels/ets-dt-003_creation-du-fichier-logique-de-facturation-amo-et-traitement-des-retours_v02-10-10?) »
- du fichier « [création fichier logique AMC](https://industriels.sesam-vitale.fr/documents/d/industriels/ets-dt-004_creation-du-fichier-logique-de-facturation-amc-et-traitement-des-retours_v02-50-11?) »

**<u>Délai de mise en place :</u>**
<u>Les éditeurs doivent se mettre en conformité **avant le 30/06/2025.**</u>

<u>Les éditeurs doivent se conformer pour **l’ensemble des flux AMO et AMC en une seule fois**</u> (pas de dissociation possible).
<u>Les éditeurs de GAP qui utilisent plusieurs solutions de chiffrement doivent se conformer pour</u> <u>l’ensemble des solutions de chiffrements utilisées (pas de dissociation possible).</u>

## **Processus de vérification de la mise en place de cette évolution**

**<u>Côté éditeurs de chiffrement :</u>**
Les éditeurs de chiffrement de transport devront compléter 2 pages sur [le formulaire de demande de tests](https://industriels.sesam-vitale.fr/documents/331385/6675569/ETS-FDC-002_Formulaire+de+demande+de+tests+de+chiffrement+de+transport_3.2vfinale.pdf/f0d35a6f-94d0-e029-8696-763ab3914e05?) :
*   **la page 1 en cochant**
    *   *o Ce formulaire est destiné à enregistrer :*
    *   [ ] *<u>Votre déclaration sur l’honneur quant à la bonne intégration des évolutions pour le rapprochement des retours AMO et AMC avec le logiciel de facturation</u>*
    *   <u>Et en remplissant uniquement la partie « votre société »</u>

*   <u>**la page 2 :** en complétant la partie « Identification de votre logiciel effectuant le</u> <u>chiffrement de transport des flux de facturation »</u>

<u>Envoyez ensuite les 2 pages du formulaire au centre de service</u> :
[centre-de-service@sesam-vitale.fr.](mailto:centre-de-service@sesam-vitale.fr)

**<u>Côté éditeurs de GAP :</u>**
<u>Lors d’un prochain passage au CNDA, vous déclarerez l’implémentation de la modification.</u>

## **RAPPEL [Offre de test**](https://industriels.sesam-vitale.fr/documents/331385/6675569/VALID-PTV-001-v01.05+-+Tests+de+chiffrement+des+flux.pdf/5542b1a2-08cc-4db9-ba16-ac40af8629cf?)

**La prise en compte du chiffrement AES par les éditeurs de logiciels pour établissements de santé est obligatoire. Le GIE SESAM Vitale propose une ~~offre de test~~ aux éditeurs développant une solution de chiffrement.**

**A la fin des tests, il vous délivrera un n° d’identifiant du logiciel que vous devrez intégrer dans les messages SMTP.**

icon: arrow Pour cela, une fois les modifications apportées dans votre logiciel, nous vous invitons à nous renvoyer le [formulaire de demande de tests.](https://industriels.sesam-vitale.fr/documents/331385/6675569/ETS-FDC-002_Formulaire+de+demande+de+tests+de+chiffrement+de+transport_3.2vfinale.pdf/f0d35a6f-94d0-e029-8696-763ab3914e05?)
Nous vous recontacterons ensuite pour dérouler les jeux de tests avec vous, basés sur le cahier de tests.
Nous vous fournirons ensuite un identifiant votre logiciel de chiffrement.

## **Accès à la documentation**

Vous trouverez sur [l’espace Industriels](https://industriels.sesam-vitale.fr/group/facturation-b2) du GIE SESAM-Vitale :

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr</u>** 
 icon: twitter
2

logo: sesam-vitale

icon: <u>**- Fiche d’information -.**</u>

*   Les spécifications de transport des flux de facturation par messagerie SMTP et chiffrement de transport ;
*   Le cahier de tests ;
*   Le formulaire de demande de test

*Si vous ne disposez pas de compte, merci de remplir ce [formulaire](https://industriels.sesam-vitale.fr/demandes?ajouterDemande=ContratAcces) de création/renouvellement de compte.*

## **Contacts**

Pour toute question sur des aspects technique ou liés aux tests :
*   02 43 57 42 88
*   [centre-de-service@sesam-vitale.fr](mailto:centre-de-service@sesam-vitale.fr)

Pour toute question sur les démarches et sur le déploiement :
*   <u>relations-industriels@sesam-vitale.fr</u>

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr</u>** 
 icon: twitter
3