logo: Agence du Numérique en Santé
logo: GIE SESAM-Vitale

photo: decorative image of a person and abstract shapes

# **Modalités d'accès aux volets transport synchrone des services en santé ou des téléservices de l’Assurance Maladie obligatoire**

*Statut : Publié | Classification : Publique | Version : V0.5*

Agence du Numérique en Santé
9, rue Georges Pitard – 75015 Paris
T. 01 58 45 32 50
esante.gouv.fr


GIE SESAM-Vitale
5, Bd Marie et Alexandre Oyon
72100 Le Mans
sesam-vitale.fr

logo: ANS - AGENCE DU NUMÉRIQUE EN SANTÉ

logo: sesam-vitale

<table>
  <caption>TABLE DES MATIERES</caption>
    <tr>
      <td><strong><em>1.</em></strong></td>
      <td><strong><em>Introduction ............................................................................................................................ 2</em></strong></td>
    </tr>
    <tr>
      <td><strong><em>2.</em></strong></td>
      <td><strong><em>Section d’orientation.............................................................................................................. 3</em></strong></td>
    </tr>
    <tr>
      <td><em>2.1</em></td>
      <td><em>CI TLSi – Volet Transport Synchrone pour les téléservices de l’assurance maladie obligatoire . 3</em></td>
    </tr>
    <tr>
      <td><em>2.2</em></td>
      <td><em>CI-SIS – Volet Transport Synchrone client lourd pour les services en santé................................. 4</em></td>
    </tr>
</table>

Statut : Publié | Classification : Publique | Version V0.5
page 1/4
1/4


Ce document est la copropriété de l’ANS et du GIE SESAM-Vitale.

logo: ANS AGENCE DU NUMÉRIQUE EN SANTÉ

logo: sesam-vitale

## **1. INTRODUCTION**

Issu de la feuille de route MaSanté2022, le volet « accélérer le virage numérique en santé » a pour ambition de mettre le numérique au service du parcours de santé des patients et des professionnels qui les prennent en charge. Ce volet s’articule autour de cinq grandes orientations :

1. renforcer la gouvernance du numérique en santé ;
2. intensifier la sécurité et l’interopérabilité des systèmes d’information en santé ;
3. accélérer le déploiement des services numériques socles ;
4. déployer au niveau national des plateformes numériques de santé ;
5. soutenir l’innovation et favoriser l’engagement des acteurs.

La doctrine technique du numérique en santé sur laquelle s’appuie cette feuille de route pose un cadre de référence et propose une trajectoire à l’ensemble des acteurs de la eSanté en France. Cette doctrine technique se concentre sur l’échange et le partage de données de santé, portant sur les champs sanitaire et médicosocial.

Parmi les actions déclinées dans la doctrine qui sont issues des cinq orientations de la feuille de route, il est convenu de faire converger le cadre d’interopérabilité des téléservices (CI-TLSi) de la Cnam et le cadre d’interopérabilité des systèmes d’information de santé (CI-SIS) de l’ANS (action 8 issue de l’orientation n°2 de la feuille de route) pour simplifier le développement des logiciels de professionnels de santé en bénéficiant pleinement d’une interopérabilité unifiée.

Cette convergence des cadres d’interopérabilité doit se faire graduellement jusqu’à un cadre commun à élaborer. Cependant, afin de simplifier les travaux des éditeurs de logiciels de professionnels de santé et les promoteurs de service de eSanté tout en respectant les logiciels et services déjà mis en œuvre, il a été décidé de mettre en œuvre rapidement une première étape de convergence.

L’enjeu de cette première étape est un accès unifié aux cadres d’interopérabilité des téléservices (CI-TLSi) de la Cnam et des systèmes d’information (CI-SIS) de l’ANS. Il s’agit de simplifier l’accès à l’information et de donner une vision homogène et cohérente des spécifications d’interopérabilité nationales des secteurs sanitaire, médico-social et social. L’appropriation et la mise en œuvre des normes et standards puis la rationalisation des développements, et des formations par les industriels doit s’en trouver facilitée.

La convergence s’appuie donc sur un accès unifié aux cadres d’interopérabilité se traduisant par ce document. Il est positionné comme porte d’entrée au cadre d’interopérabilité des deux sites [(industriels.sesam-vitale.fr](https://industriels.sesam-vitale.fr/) et esante.gouv.fr).

Statut : Publié | Classification : Publique | Version V0.5 page 2/4

*Ce document est la copropriété de l’ANS et du GIE SESAM-Vitale.*

logo: ANS

logo: sesam-vitale

## **2. SECTION D’ORIENTATION**

Le CI-SIS s’adresse aux industriels, souhaitant intégrer dans leur logiciel destiné aux professionnels et établissements de santé, des services en santé, y compris le DMP.

Un volet particulier, précédemment nommé CI-TLSi, s’adresse aux industriels, souhaitant intégrer dans leur logiciel destiné aux professionnels et établissements de santé, des services de l’assurance maladie obligatoire.

### **2.1 CI TLSi – Volet Transport Synchrone pour les téléservices de l’assurance maladie obligatoire**

Depuis 2011, l’Assurance Maladie obligatoire propose aux professionnels de santé (PS) des téléservices intégrés (appelé TLSi) inter-régime. Ces téléservices intégrés ont pour vocation de fournir aux Professionnels et Établissements de Santé des informations provenant de l’Assurance Maladie directement dans leur logiciel (LPS). Ils assistent les PS dans leur exercice quotidien qu’ils soient dans un contexte individuel (par exemple les médecins libéraux) ou collectif (structure hospitalière).

Tous ces téléservices respectent un cadre technique commun stable, précédemment appelé « cadre d’interopérabilité des TLSi AMO » ou en abrégé CI-TLSi.

En 2020, ce document intègre le CI-SIS, dans la section Couche Transport, sous le nom de « Volet Transport Synchrone pour les téléservices de l’assurance maladie obligatoire ».

Il répond aux objectifs suivants :
*   favoriser la standardisation. Le choix de normes et standards à l’état de l’art permet aux différents partenaires de réutiliser des spécifications existantes et donc de limiter les coûts ;
*   être en capacité d’industrialiser l’intégration des services pour réduire les délais et coûts de mise en œuvre. L’adoption de normes et standards communs simplifie les phases de conception et d’intégration tout en favorisant la réutilisation de composants pour la mise en œuvre de nouveaux services ou l’évolution de ceux déjà existants.

Il se présente donc comme un référentiel technique recensant les normes et standards utilisés ainsi que les modalités de mise en œuvre proposées. Tous les téléservices AMO mis en œuvre depuis 2011 se basent sur ce référentiel.

Ce document est disponible sur l’Espace Industriels du GIE SESAM-Vitale en cliquant sur [ce lien](https://industriels.sesam-vitale.fr/group/integrer-tlsi) (un compte est nécessaire pour accéder à cet espace sécurisé : [Procédure pour demander la création d’un compte](https://industriels.sesam-vitale.fr/premiere-connexion?p_p_id=58&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_58_struts_action=%2Flogin%2Fforgot_password)).

Statut : Publié | Classification : Publique | Version V0.5
page 3/4
*Ce document est la copropriété de l’ANS et du GIE SESAM-Vitale.*

logo: logo

logo: sesam-vitale

## **2.2 CI-SIS – Volet Transport Synchrone client lourd pour les services en santé**

Le CI-SIS existe depuis 2009. Il contenait initialement les spécifications utilisées notamment pour les interfaces entre les logiciels des professionnels de santé et le DMP. Puis celles-ci ont été élargies à l’échange de données de santé pour la mise en place des messageries sécurisées de santé (MSSanté).

Depuis 2015, il s’enrichit des cas d’usages métier remontés par des acteurs de santé porteurs de projets (nationaux ou territoriaux) devant échanger et partager de la donnée de santé. Ce cadre s’appuie donc sur des normes et standards internationaux et permet de disposer de modèles d'échanges pérennes.

Ce référentiel documentaire est composé de différents volets organisés en trois couches : métier, service et transport.

La section Couche Transport, sous le nom de « Volet Transport synchrone client lourd pour les services en santé » (précédemment appelé « Volet Transport synchrone pour client lourd ») se présente comme un document technique qui permet aux éditeurs de logiciels de professionnels de santé et aux promoteurs de service de la eSanté d’intégrer à leurs solutions logicielles des services en santé dont le DMP.

Afin de télécharger ce document, il est nécessaire de vous rendre à l’adresse suivante

en cliquant sur [ce lien.](https://esante.gouv.fr/volet-transport-synchrone-pour-client-lourd)

Statut : Publié | Classification : Publique | Version V0.5 page 4/4

*Ce document est la copropriété de l’ANS et du GIE SESAM-Vitale.*