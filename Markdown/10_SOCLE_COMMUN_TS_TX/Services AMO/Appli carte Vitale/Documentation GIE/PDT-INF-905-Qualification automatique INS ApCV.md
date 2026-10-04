<u>**- Fiche d’information -.**</u>

logo: sesam-vitale



---

**Référence** **PDT-INF-905v2** **Date** **25.09.2025**
**Objet** **Fiche d’information qualification automatique de l’INS provenant de l’appli carte Vitale**

---

<table>
    <tr>
      <td><u>Type</u></td>
      <td>[ ] Technique</td>
      <td>[ ] Pratique</td>
      <td>[x] Communication</td>
      <td>[ ] Livraison</td>
    </tr>
    <tr>
      <td><u>Destinataires</u></td>
      <td>[x] Editeurs</td>
      <td>[ ] Équipementiers</td>
      <td>[ ] OCT</td>
      <td>[ ] CIS</td>
    </tr>
    <tr>
      <td rowspan="2">Produits</td>
      <td>Facturation<br />[x] CDC Éditeurs<br />[ ] CDC OCT<br />[ ] FSV agrément<br />[ ] FSV exploitation<br />[ ] SCOR</td>
      <td>Référentiels<br />[x] Dispositif Intégré<br />[ ] Terminal lecteur<br />[ ] TLA<br />[ ] Lecture Vitale<br />[ ] Télémise à jour</td>
      <td>Produits d’infrastructure<br />[ ] ATSAM<br />[ ] SrvSVCNAM<br />[ ] GALSS<br /><br />Services en Ligne<br />[ ] CDR<br />[ ] Espace pro</td>
      <td>Téléservices intégrés<br />[ ] HRi<br />[ ] DMTi<br />[ ] AATi<br />[ ] SEFi<br />[x] INSi<br /><br />Acquisition des droits<br />[ ] API de Lecture</td>
    </tr>
    <tr>
      <td>WebServices appli carte Vitale<br />[x] Authentifier un utilisateur<br />[ ] Signer une facture SESAM-Vitale</td>
      <td></td>
      <td></td>
      <td></td>
    </tr>
    <tr>
      <td><u>Secteur</u></td>
      <td>[x] Libéral</td>
      <td>[x] Hospitalier</td>
      <td colspan="2">[x] Médico-social</td>
    </tr>
    <tr>
      <td><u>Professionnels de</u> Santé concernés</td>
      <td>[x] Médecins<br />[x] Sages-femmes<br />[x] Chirurgiens-dentistes<br />[x] Pharmaciens<br />[x] Laboratoires</td>
      <td>[x] Auxiliaires médicaux<br />[x] Centres de Santé<br />[x] Opticiens<br />[x] Fournisseurs*<br />[ ] Transporteurs</td>
      <td colspan="2">[x] Établissements publics<br />[x] Cliniques privées<br />[x] ESPIC<br />[x] Autres structures médico-sociales</td>
    </tr>
    <tr>
      <td>Prise en compte</td>
      <td>[x] Facultative</td>
      <td>[ ] Obligatoire</td>
      <td></td>
      <td></td>
    </tr>
</table>

*Tous professionnels mentionnés à l’article L. 1110-4 du Code de la Santé Publique sont concernés par l’INS. Certaines catégories de fournisseurs peuvent donc être concernées par l’INS si elles sont mentionnées dans l’article.*

---

**Contexte** Ce document vise à fournir aux éditeurs un éclairage sur les évolutions introduites dans la version 3 (décembre 2024) du Guide d’implémentation de l’INS dans les logiciels, publié par l’ANS.

L’appli carte Vitale contient l’INS de l’utilisateur et de ses bénéficiaires. Ces INS sont valorisées lors de l’activation de l’appli carte Vitale et sont fiables (identiques aux données retournées par le téléservice INSi et mis à jour en cas de changement).

Le statut de l’INS n’est pas porté dans l’appli carte Vitale. Néanmoins, **le guide d’implémentation V3 de l’INS décrit les règles de qualification automatique** que doivent implémenter les éditeurs, afin de faciliter la procédure d’identito-vigilance, voir la rendre transparente pour le Professionnel de Santé (dit autrement, plus d’écran dans le logiciel du PS ayant pour objectif de « qualifier » l’INS en demandant une pièce d’identité au patient).

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
~~<u>www.sesam-vitale.fr</u>~~ - <u>centre-de-service@sesam-vitale.fr-</u> 
icon: social media

logo: sesam-vitale


# <u>- **Fiche d’information** -.</u>

La règle [EXI ID 25] précise :

Le RNiV prévoit l’exigence suivante [EXI SI 38] :
« L’INS des ayants droit présente dans l’Appli carte Vitale de l’utilisateur ne porte pas de statut :
chaque professionnel, chaque structure, au regard des risques qu’il identifie selon son activité
(actes à risques), les caractéristiques de sa patientèle (homonymes, usagers nés à l’étranger),
choisit de considérer :
- soit l’identité des ayants droit comme récupérée et de réaliser le contrôle de cohérence des traits de l’INS avec ceux présents sur un dispositif d’identification à haut niveau de confiance ;
- soit l’INS des ayants droit comme qualifiée ».

Par défaut, les identités (ouvrant ou ayant droit) obtenues à partir de l’Appli carte Vitale sont au statut qualifié. Le système d’information doit par paramétrage interne permettre à l’utilisateur d’une structure de définir le statut de l’INS obtenu à partir de l’Appli carte Vitale en statut récupéré.

D’autre part, le ministère de la santé préconise que le paramètre soit positionné par défaut à la qualification automatique. Illustration à travers le programme SEGUR du Numérique en Santé (couloirs vague 2 publiés depuis début 2025) :

# Extrait du REM Vague 2 Médecine de ville (SC.INS.04)

## EXIGENCE

LORSQU'une identité est récupérée à partir de l'Appli carte Vitale, ALORS le système DOIT enregistrer l'identité au statut "Identité qualifiée".

Le système DOIT cocher automatiquement "Appli carte vitale" dans la liste des dispositifs d'identification à haut niveau de confiance.

Conformément au "Guide d'implémentation INS" [INS9] - EXI ID25

## Scénario de conformité

Vérifier la création d'une identité d'un ayant droit au statut "identité qualifiée" à partir de l'Appli carte Vitale

Étapes du scénario :
1. Créer une identité d'un ayant droit non-utilisateur de l'Appli carte Vitale (et non-détenteur de la carte Vitale) dans le système via l'Appli carte vitale
2. Visualiser le statut "identité qualifiée" de l'identité de l'ayant droit
3. Visualiser que l' "Appli carte Vitale" est sélectionnée automatiquement dans la liste des dispositifs à haut niveau de confiance (case cochée,...).

**Implémentation**
**dans les logiciels**

Tirant partie de la valeur ajoutée apportée par l’utilisation de l’appli carte Vitale qui permet de récupérer l’INS (matricule + traits d’identité), puis de la qualifier automatiquement pour les utilisateurs de l’application et, le cas échéant, pour ses ayants droit, **nous recommandons donc **aux éditeurs qui intègrent la lecture de l’appli carte Vitale, que ce soit dans les logiciels** SESAM-**Vitale dans le monde libéral, ou dans les logiciels des établissements de santé, d’implémenter** au plus tôt les règles de qualification automatique de l’INS lu de l’appli carte Vitale.**

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u> - <u>centre-de-service@sesam-vitale.fr</u> icon: twitter

2

logo: sesam-vitale  <u>- Fiche **d’information** -.</u>

***

Veuillez-noter que l'exigence [EXI ID 19] du guide d’implémentation précise la valorisation du justificatif :

- L’« Appli carte Vitale » ou « AppCV ». Cette mention est à sélection par l’utilisateur lorsque l’identité est obtenue à partir de l’Application carte Vitale au statut qualifié. Le logiciel doit automatiquement sélectionnée « Appli carte Vitale » comme moyen d’identification à haut niveau de confiance, lorsque l’identité est récupérée au statut qualifié via l’Application carte Vitale. Aucune action n'est attendue par l'utilisateur quant à la sélection d'un tel type de justificatif. Lorsque ces moyens d'identification ont été utilisés pour obtenir l'identité, le logiciel doit les indiquer automatiquement.

**Support**  *Pour vous accompagner dans votre démarche :*

**Pour toute question technique ou fonctionnelle**
Pour le support sur la documentation industriels
(en phase de développement ou de déploiement) :
**Portail IRIS :** [https://portail-support.sesam-vitale.fr/gsvextranet/#/signin](https://portail-support.sesam-vitale.fr/gsvextranet/#/signin)
**Courriel :** [centre-de-service@sesam-vitale.fr](mailto:centre-de-service@sesam-vitale.fr)
**Téléphone** (du lundi au vendredi) : 02 43 57 42 88
-----------
**Pour toute question sur le déploiement**
[relations-industriels@sesam-vitale.fr](mailto:relations-industriels@sesam-vitale.fr)

**GIE SESAM-Vitale**
**5, boulevard Marie et Alexandre Oyon – 72019 LE MANS Cedex 2**
<u>**www.sesam-vitale.fr**</u> - <u>centre-de-service@sesam-vitale.fr</u>- 
icon: twitter
3