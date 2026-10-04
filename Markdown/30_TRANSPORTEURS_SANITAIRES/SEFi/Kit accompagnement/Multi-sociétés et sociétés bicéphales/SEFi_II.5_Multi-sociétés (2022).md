**Mener à bien le déploiement – II.5**

logo: l'Assurance Maladie SEFi TRANSPORT

# **Multi-sociétés**

icon: transport icon



## **Le contexte multi-sociétés**

Dans un contexte **multi-sociétés** (sociétés organisées en groupement ...), la facturation est généralement réalisée par une des sociétés du groupement appelée dans ce support **« mandataire »**.

La société mandataire reçoit un mandat d’un ou plusieurs autre(s) transporteur(s) (nommées sociétés mandantes dans ce document), pour réaliser la facturation en ligne **en leur nom et pour leur compte.**

Dans cette situation, c’est la carte de la société mandataire qui est utilisée pour s’authentifier et accéder aux services.

La carte de la société mandataire peut être **une CDE ou une CPE nominative**.

Les cartes CDE et CPE ont les mêmes fonctions, elles sont décrites dans l’annexe 3 de l’avenant n°10 de la convention nationale des transporteurs sanitaires privés. En SEFi, il n’y a pas de spécificités quant aux modalités de signature des factures ou des lots comme en SESAM-Vitale. Les cartes CDE et CPE permettent de contrôler :

*   ⮚ l’authentification de l’émetteur
*   ⮚ l’autorisation de l’utilisateur à accéder au service
*   ⮚ l‘habilitation à transmettre une facture pour le compte du facturant

A noter que les factures des sociétés mandantes comportent bien leur propre numéro de facturation Assurance Maladie ainsi que l’identification de l’émetteur.

### **Aspect juridique**

Dans le cas d’un transporteur sanitaire ayant reçu mandat d’un autre transporteur pour réaliser la facturation en ligne en son nom et pour son compte, seul le mandataire est tenu de respecter les termes de l’annexe 3 de l’avenant n°10 de la convention nationale des transporteurs sanitaires privés.

Société mandatée = société mandataire

```mermaid
graph TD
    subgraph Mandatee ["Société mandatée gérant la facturation"]
        M_Icon["icon: computer user"]
        M_Text["Société transport 1Société transport 2Société transport 3"]
        M_CPE["icon: CPE card"]
    end

    subgraph Mandante1 ["Société transport 1"]
        S1_Icon["icon: ambulance and driver"]
        S1_ID["Identifiant facturation1"]
    end

    subgraph Mandante2 ["Société transport 2"]
        S2_Icon["icon: ambulance and driver"]
        S2_ID["Identifiant facturation2"]
        S2_CPE["icon: CPE card"]
    end

    subgraph Mandante3 ["Société transport 3"]
        S3_Icon["icon: ambulance and driver"]
        S3_ID["Identifiant facturation3"]
        S3_CPE["icon: CPE card"]
    end

    AM["icon: buildingAssurance Maladie"]

    Mandante1 --- Mandatee
    Mandatee --> Mandante2
    Mandatee --> Mandante3
    
    Mandatee -- "Flux de facturation" --> AM
```

Sociétés mandantes

SEFi transporteur - kit de déploiement - Cnam - Mai 2022

La santé progresse **avec vous**

1


logo: l'Assurance Maladie Caisse Nationale