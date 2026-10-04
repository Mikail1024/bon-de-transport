logo: l'Assurance Maladie Caisse nationale

# Consignes de facturation pour les entreprises avec la double spécialité de transporteur sanitaire et de transporteur taxi

Pour facturer en SEFi, le transporteur doit posséder une carte directeur d’établissement CDE ou une carte professionnel d’établissement CPE.

## **Contenu**
*Cas 1 :* L’entreprise de transport possède les 2 spécialités de transporteur sanitaire et de transporteur taxi. 2
*Cas 2 :* L’entreprise A de transport possède les 2 spécialités de transporteur sanitaire et de transporteur taxi, et est également mandataire pour l’entreprise B de transport qui possède également les 2 spécialités de transporteur sanitaire et de transporteur taxi. ............................................................................................ 3

[DDGOS]
**[DSMOI / DSV / MOA SEFi ]**

## <u>***Cas 1 :***</u> L’entreprise de transport possède les **2 spécialités** de transporteur sanitaire et de transporteur taxi.

### **L’entreprise possède déjà une CDE/CPE, obtenue pour sa spécialité de transporteur sanitaire.**

<table>
  <thead>
    <tr>
      <th></th>
      <th colspan="2">Données connues par l'AM</th>
      <th></th>
    </tr>
    <tr>
      <th>ENTREPRISE</th>
      <th>SPECIALITE</th>
      <th>AM</th>
      <th>Commentaire</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Etablissement A (<b><i>Société de transporteur sanitaire</i></b> )</td>
      <td>55</td>
      <td>DDTSAAAAA</td>
      <td>possède carte CDE/CPE pour sa spécialité de TS</td>
    </tr>
    <tr>
      <td>Etablissement A (<b><i>Société de transporteur taxi</i></b> )</td>
      <td>56</td>
      <td>DDTAAAAAA</td>
      <td></td>
    </tr>
  </tbody>
</table>

Dans ce cas, l’entreprise :

*   ***Peut ne pas commander*** **de nouvelle carte** auprès de l’ANS pour sa spécialité de transporteur taxi.
*   *Dès que l’entreprise est équipée d’un logiciel autorisé SEFi taxi, elle peut facturer avec la carte qu’elle possède déjà, à condition que le poste* **soit paramétré de manière à facturer les deux spécialités avec la même carte.**
*   *Le transporteur veille à transmettre dans la facture le numéro AM correspondant à la spécialité à facturer.*
    *   *Le Numéro AM **DDTSAAAAA** correspondant **à la spécialité de transporteur sanitaire (55)** est transmis dans **un flux de facturation transport sanitaire.***
    *   *Le Numéro AM **DDTXAAAAA** correspondant **à la spécialité de transporteur taxi (56)** est transmis dans **un flux de facturation transport taxi.***

> **Si** l’entreprise de transport possède les 2 spécialités :
>
> 1.  de transporteur sanitaire (55) avec le numéro AM correspondant à cette spécialité
> 2.  et de transporteur taxi (56) avec le numéro AM correspondant à cette spécialité.
> **et si** pour ces 2 spécialités, l’entreprise est connu par l’AM
>
> **alors** le poste du transporteur doit être paramétré pour permettre la facturation des deux spécialités avec la même carte en veillant à transmettre dans la facture le numéro AM correspondant à la spécialité à facturer dans le flux adéquat.

[DDGOS]
**[DSMOI / DSV / MOA SEFi ]**

## <u>***Cas 2 :***</u> L’entreprise A de transport possède les **2 spécialités** de transporteur sanitaire et de transporteur taxi, et est également <u>**mandataire**</u> pour l’entreprise B de transport qui possède également les 2 spécialités de transporteur sanitaire et de transporteur taxi.

### **L’entreprise A possède déjà une CDE/CPE, obtenue pour sa spécialité de transporteur sanitaire.**

> ***<u>Rappel :</u>*** la notion de multi-sociétés - *société mandataire* / *mandante* - est gérée dans SEFi, tel que :
>
> *   Identifiant du transporteur facturant (*société mandante*) est véhiculé dans la facture sous l’item Numéro AM origine
> *   Identifiant du transporteur émetteur (*société mandataire*) est véhiculé dans la facture sous l’item identifiant émetteur
> *   Le transporteur émetteur et le transporteur facturant exercent la même spécialité de transporteur.
>
> **Dans le cas de multi-sociétés, le *numéro de la carte utilisée doit être celui de la société qui émet les factures, i.e. celle de la société mandataire.***

<table>
  <thead>
    <tr>
      <th></th>
      <th colspan="2">Données connues par l'AM</th>
      <th></th>
    </tr>
    <tr>
      <th>ENTREPRISE</th>
      <th>SPECIALITE</th>
      <th>AM</th>
      <th>Commentaire</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Etablissement A (<i>Société mandataire = éméttrice de la facture</i> )</td>
      <td>55</td>
      <td>DDTSAAAAA</td>
      <td>possède carte CDE/CPE pour sa spécialité de TS</td>
    </tr>
    <tr>
      <td>Etablissement A (<i>Société mandataire = éméttrice de la facture</i> )</td>
      <td>56</td>
      <td>DDTAAAAAA</td>
      <td></td>
    </tr>
    <tr>
      <td>Etablissement B (<i>société mandante = à l'origine de la facture</i> )</td>
      <td>55</td>
      <td>DDTSBBBBB</td>
      <td></td>
    </tr>
    <tr>
      <td>Etablissement B (<i>société mandante = à l'origine de la facture</i> )</td>
      <td>56</td>
      <td>DDTABBBBB</td>
      <td></td>
    </tr>
  </tbody>
</table>

Pour l’entreprise **B,** qui est la société mandante :

⮚ ***Il n’est pas nécessaire de commander** de carte* auprès de l’ANS puisque ses factures sont transmises via la société mandataire – entreprise A, qui, lui possède une carte CDE/CPE.

⮚ ***Lors de la transmission de la facture d’une spécialité donnée, le transporteur veille à ce que les **identifiants AM origine et émetteur** correspondent à la **même spécialité dans le flux correspondant.***

Le poste de l’entreprise A doit donc être paramétré de manière à facturer les 2 spécialités avec la même carte.

*   ✓ *Le Numéro AM **DDTSAAAAA** correspondant **à la spécialité de transporteur sanitaire (55)** est transmis dans **un flux de facturation transport sanitaire.***
*   ✓ *Le Numéro AM **DDTXAAAAA** correspondant **à la spécialité de transporteur taxi (56)** est transmis dans **un flux de facturation transport taxi.***

[DDGOS]
**[DSMOI / DSV / MOA SEFi ]**

Le poste et les logiciels doivent être paramétrés pour gérer les multi-sociétés tel que :

⮚ **Pour un flux de facturation transport taxi**, l’entreprise A, avec sa carte, émet la facture pour l’entreprise B en veillant à renseigner

✓ l’identifiant émetteur avec ‘DD**TA**AAAAA’ – numéro AM correspondant à spécialité taxi
✓ et l’identifiant origine avec ‘DD**TA**BBBBB’ - numéro AM correspondant à spécialité taxi

⮚ **Et pour un flux de facturation transport sanitaire**, l’entreprise A, avec sa carte, émet la facture pour l’entreprise B en veillant à renseigner

✓ l’identifiant émetteur avec ‘DD**TS**AAAAA’ – numéro AM correspondant à spécialité TS
✓ et l’identifiant origine avec ‘DD**TS**BBBBB’ - numéro AM correspondant à spécialité TS

[DDGOS]
**[DSMOI / DSV / MOA SEFi ]**