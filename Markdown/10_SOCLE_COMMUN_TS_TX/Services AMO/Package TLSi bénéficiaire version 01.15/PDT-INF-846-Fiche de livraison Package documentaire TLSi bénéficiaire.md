logo: sesam-vitale

# - Fiche **d’information** -

---

**Référence** **PDT-INF-846** **Date** **05/02/2024**
**Objet** **Package TLSi bénéficiaire**

<table>
    <tr>
      <td><u>Type</u></td>
      <td>☐ Technique</td>
      <td>☐ Pratique</td>
      <td>☐ Communication</td>
      <td>☒ Livraison</td>
    </tr>
    <tr>
      <td><u>Destinataires</u></td>
      <td>☒ Editeurs</td>
      <td>☐ Équipementiers</td>
      <td>☐ OCT</td>
      <td>☐ CIS</td>
    </tr>
    <tr>
      <td>Produits</td>
      <td>Facturation<br />☐ CDC Éditeurs<br />☐ CDC OCT<br />☐ FSV agrément<br />☐ FSV exploitation<br />☐ SCOR</td>
      <td>Référentiels<br />☐ Dispositif Intégré<br />☐ Terminal lecteur<br />☐ TLA<br />☐ Lecture Vitale<br />☐ Télémise à jour</td>
      <td>Produits d’infrastructure<br />☐ ATSAM<br />☐ SrvSVCNAM<br />☐ GALSS<br /><br />Services en Ligne<br />☐ CDR<br />☐ Espace pro</td>
      <td>Téléservices intégrés<br />☐ HRi<br />☐ DMTi<br />☐ AATi<br />☐ ALDi<br />☐ IMTi<br />☐ ATMPi<br />☐ ADRi<br />☐ PSEi<br />☐ INSi<br />☒ TLSi bénéficiaire</td>
    </tr>
    <tr>
      <td><u>Secteur</u></td>
      <td>☒ Libéral</td>
      <td>☐ Hospitalier</td>
      <td colspan="2">☐ Médico-social</td>
    </tr>
    <tr>
      <td><u>Professionnels</u> de Santé <u>concernés</u></td>
      <td>☒ Médecins<br />☐ Sages-femmes<br />☐ Chirurgiens-dentistes<br />☐ Pharmaciens<br />☐ Laboratoires</td>
      <td>☐ Auxiliaires médicaux<br />☐ Centres de Santé<br />☐ Fournisseurs<br />☐ Transporteurs</td>
      <td colspan="2">☐ Établissements publics<br />☐ Cliniques privées<br />☐ ESPIC<br />☐ Autres structures médico-sociales</td>
    </tr>
    <tr>
      <td><u>Prise en compte</u></td>
      <td>☐ Facultative</td>
      <td>☒ Obligatoire</td>
      <td colspan="2"></td>
    </tr>
</table>

## **Contexte général**

Le téléservice bénéficiaire, dénommé également WS_BS, permet à un Logiciel d’un professionnel de Santé d’obtenir des informations d’un bénéficiaire de soins issues des référentiels de l’AMO.

Ce service propose 2 opérations :
- WS_BS1 : Identifier un bénéficiaire qui permet de récupérer la liste des bénéficiaires rattachés à un NIR
- WS_BS2 : Acquérir les informations du bénéficiaire qui permet de connaitre les informations de rattachement d’un bénéficiaire (Code régime, code caisse et code centre) et d’identification du bénéficiaire.

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr</u> 
 icon: social media

logo: sesam-vitale


# <u>**- Fiche d’information -.**</u>

---

## **Corpus documentaire**

L’architecture des documents du Téléservice Bénéficiaire v01.15 est représentée ci-dessous :

| Documents communs aux TLSi | Guide d'intégration | WSDL | Exemples |
| :--- | :--- | :--- | :--- |
| •**Cadre **d'intéropérabilité** (CI)** | •**SEL-MP-013_01.15**<br>•WS_BS Services en Ligne Bénéficiaire **avec** MR<br>•WS_BS Services en Ligne Bénéficiaire sans MR | •**CONTRAT_InfoBenef_EXP_1.0.6** | •**EXEMPLES_CONTRAT_InfoBenef_EXP_1.0.5** |

## **Contenu de la livraison du 05/02/2024**

<table>
<tr>
<td>SEL-MP-013_01.15_WS_BS<br />Services en Ligne Bénéficiaire<br />sans MR</td>
<td>Guide d'intégration TLSi Bénéficiaire <strong>sans <b>marques de révision.</b></strong><br /><br />Il décrit les éléments fonctionnels et techniques.<br /><br />Il s'appuie sur le Cadre d'interopérabilité des TLSi AMO.</td>
<td>01.15</td>
<td>-</td>
</tr>
<tr>
<td>CONTRAT_InfoBenef_EXP_1.0.6</td>
<td>Contrat de service TLSi Bénéficiaire à implémenter par le logiciel ou l'équipement.<br /><br />Ce WSDL est compatible JAVA et .NET.</td>
<td>1.0.6</td>
<td>-</td>
</tr>
<tr>
<td>Exemples_CONTRAT_InfoBenef_<br />EXP_1.0.5</td>
<td>Exemples de requête / réponse « Bénéficiaire ».</td>
<td>1.0.5</td>
<td>-</td>
</tr>
</table>

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u> - <u>**centre-de-service@sesam-vitale.fr**</u> icon: social media

2

logo: sesam-vitale


# <u>**- Fiche d’information -.**</u>

---

## **Procédure et modalités d’autorisation au CNDA**

**L’intégration du téléservice TLSi bénéficiaire** est **soumise à la procédure d’autorisation** d'accès aux téléservices en mode intégré. Cette attestation de conformité est **délivrée par le CNDA au logiciel** pour un numéro de version donné **et en autorise la diffusion auprès des professionnels de santé**.
Après passage de la procédure de test et l’obtention de l’autorisation auprès du CNDA, votre solution fera l’objet d’un affichage sur le site web du CNDA et figurera dans le catalogue produits du GIE SESAM-Vitale.

Vous trouverez sur [le site du CNDA](https://cnda.ameli.fr/) toutes les informations concernant cette procédure d’autorisation.

## **Vos questions sur ce package**

**Notre centre de service se tient à votre disposition** pour toute demande d’assistance sur le guide d’intégration TLSi bénéficiaire, les WSDL et les flux exemple, **par mail :** [centre-de-service@sesam-vitale.fr](mailto:centre-de-service@sesam-vitale.fr), ou **par téléphone au 02 43 57 42 88**.

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
**<u>www.sesam-vitale.fr</u> - <u>centre-de-service@sesam-vitale.fr</u>** icon: twitter

3