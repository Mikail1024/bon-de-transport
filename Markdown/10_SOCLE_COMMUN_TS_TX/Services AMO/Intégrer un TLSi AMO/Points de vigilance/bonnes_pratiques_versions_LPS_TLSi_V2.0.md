# **Versions d’autorisations du logiciel à renseigner dans les requêtes TLSi***

icon: thumb up
Chaque requête d’un TLSi contient le numéro de version du **logiciel autorisé** pour le **TLSi considéré**
**La valeur** de cette version **reste identique** tant qu’il n’y a pas eu de **nouvelle autorisation** du logiciel sur le TLSi considéré

icon: magnifying glass
**Exemple 1 :** Logiciel autorisé en **version 1.0** pour AATi. Dans un 2<sup>ème</sup> temps , le logiciel obtient l’autorisation pour HRi en version 2.0

| Correct | Incorrect |
| :--- | :--- |
| Logiciel icon: smiley face | Logiciel icon: frowny face |
| Requête AATi contient la **version « **1.0** »**<br>Requête HRi contient la version « **2.0** » | Requête AATi contient la version ~~« 2.0 »~~<br>Requête HRi contient la version « **2.0** » |

icon: magnifying glass
**Exemple 2 :** Logiciel avec une nouvelle autorisation en **version 3.0** pour AATi et pas de changement d’autorisation sur HRi

| Logiciel icon: smiley face | | Logiciel icon: frowny face |
| :--- | :---: | :--- |
| Requête AATi contient la **version « 3.0 »**<br>Requête HRi contient la **version « 2.0 »** | | Requête AATi contient la **version « 3.0 »**<br>Requête HRi contient la version ~~« 3.0 »~~ |

* Balise &lt;Version&gt; du Contexte LPS

*Novembre 2020 - Contact : relations-industriels@sesam-vitale.fr*


logo: sesam-vitale

# icon: thumb up Si le logiciel a été modifié **sans impact sur les TLSi**, les versions dans les requêtes TLSi **ne doivent pas changer**

**Exemple 3 :** icon: magnifying glass Logiciel agréé SV en version 3.0, autorisé en version 3.0 pour AATi et autorisé en version 2.0 pour HRi.
Dans un 2<sup>ème</sup> temps, mise à jour de l’agrément SV du logiciel en version 4.0 pour une évolution réglementaire sur la facturation.

Logiciel agréé SV en version « **3.0** » icon: smiley face | Logiciel agréé SV en version « 4.0 » icon: smiley face
---|---
Requête AATi contient la **version « 3.0 »** icon: smiley face | Requête AATi contient la version « ~~4.0~~ » icon: sad face
Requête HRi contient la **version « 2.0 »** | Requête HRi contient la version « ~~4.0~~ »

---

# icon: thumb up La version renseignée dans la requête doit être orthographiée **exactement** comme la **version autorisée et déclarée auprès du CNDA**

**Exemple 4 :** icon: magnifying glass Logiciel autorisé en version “02.b2.11” pour AATi

Logiciel icon: smiley face | Logiciel icon: sad face
---|---
Requête AATi contient la **version « 02.b2.11 »** | Requête AATi contient la version « ~~2.B2.11~~ »
| ou Requête AATi contient la version « ~~02.b2~~ »

*Novembre 2020 - Contact : relations-industriels@sesam-vitale.fr* 
logo: sesam-vitale