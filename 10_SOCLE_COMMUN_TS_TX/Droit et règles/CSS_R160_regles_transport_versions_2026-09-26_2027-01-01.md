# Code de la sécurité sociale — règles R. 160 ciblées pour le transport

Transcription de travail vérifiée le 26 septembre 2026 sur Légifrance. Les articles sources ont été lus intégralement ; seuls les passages ayant un effet direct sur la participation aux frais de transport ou sur une exonération exploitable par le domaine transport sont reproduits ci-dessous.

Ce fichier ne doit pas servir à recalculer à lui seul les droits d'un bénéficiaire. En B2 TS et SEFi TS, les données de droits et les spécifications opposables restent la source opérationnelle pour le taux et la justification d'exonération. Les extraits ci-dessous servent à versionner les règles juridiques, à contrôler le paramétrage et à expliquer les décisions du moteur.

## Sources officielles

- sous-section R. 160-5 à R. 160-20 au 26 septembre 2026 : <https://www.legifrance.gouv.fr/codes/section_lc/LEGITEXT000006073189/LEGISCTA000031795491/2026-09-26> ;
- même sous-section au 1er octobre 2026 : <https://www.legifrance.gouv.fr/codes/section_lc/LEGITEXT000006073189/LEGISCTA000031795491/2026-10-01> ;
- même sous-section au 1er janvier 2027 : <https://www.legifrance.gouv.fr/codes/section_lc/LEGITEXT000006073189/LEGISCTA000031795491/2027-01-01> ;
- décret n° 2026-812 du 21 août 2026 : <https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000054733611> ;
- décision UNCAM du 18 juillet 2023 fixant la participation transport à 45 % : <https://www.legifrance.gouv.fr/jorf/id/JORFTEXT000047911778>.

## Chronologie à implémenter

| Date d'exécution du transport | Règle de droit commun |
|---|---|
| du 1er août 2023 au 31 décembre 2026 | participation de 45 % fixée par la décision UNCAM du 18 juillet 2023, soit prise en charge AMO de 55 % |
| à partir du 1er janvier 2027 | l'article R. 160-5 autorise une participation comprise entre 50 % et 60 % ; le taux effectif dépend d'une nouvelle décision UNCAM à publier |

La décision UNCAM de 2023 ne peut pas être prolongée telle quelle après le 31 décembre 2026 : son taux de 45 % sort de la nouvelle fourchette réglementaire. Le logiciel doit donc prévoir une valeur réglementaire versionnée et bloquer toute mise en production 2027 tant que le nouveau taux officiel n'a pas été intégré.

Une seconde rupture intervient le 1er octobre 2026 dans l'article R. 160-10 : l'exonération des rentiers visés par l'article L. 371-1 cesse de viser leurs ayants droit et ne concerne plus que les frais engagés pour eux-mêmes.

## Article R. 160-5, 9° — borne réglementaire du taux transport

### Version en vigueur du 19 avril 2026 au 1er janvier 2027

Identifiant Légifrance : `LEGIARTI000053912456`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000053912456/2026-09-26>.

La participation de l'assuré prévue au I de l'article L. 160-13 est fixée par le conseil de l'Union nationale des caisses d'assurance maladie dans les limites suivantes :

9° de 45 à 55 % pour les frais de transport prévus au 2° de l'article L. 160-8 ;

### Version en vigueur à partir du 1er janvier 2027

Identifiant Légifrance : `LEGIARTI000054739003`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000054739003/2027-01-01>.

La participation de l'assuré prévue au I de l'article L. 160-13 est fixée par le conseil de l'Union nationale des caisses d'assurance maladie dans les limites suivantes :

9° de 50 à 60 % pour les frais de transport prévus au 2° de l'article L. 160-8 ;

Nota officiel utile : conformément à l'article 2 du décret n° 2026-812 du 21 août 2026, ces dispositions, dans leur rédaction résultant du 1° de l'article 1er dudit décret, entrent en vigueur le 1er janvier 2027.

## Article R. 160-8 — exonérations propres à certains transports

Version en vigueur depuis le 1er septembre 2024. Identifiant Légifrance : `LEGIARTI000049902774`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000049902774/2026-09-26>.

La participation de l'assuré en ce qui concerne les frais de transport n'est pas due lorsque l'état du bénéficiaire hospitalisé dans un établissement de soins nécessite son transfert vers un autre établissement d'hospitalisation en vue d'un traitement mieux adapté à cet état. Toutefois, cette disposition dérogatoire n'est pas applicable aux transports vers une maison de repos ou de convalescence, présentant les caractéristiques techniques définies à l'article premier de l'annexe XIX du décret n° 56-284 du 9 mars 1956.

La participation de l'assuré est supprimée pour les frais de transport mentionnés au 19° de l'article L. 160-14.

Impact : exonération pour le transfert vers un établissement mieux adapté, hors maison de repos ou de convalescence, et pour les transports CAMSP/CMPP visés au 19° de l'article L. 160-14.

## Article R. 160-9 — bénéficiaires d'un avantage de vieillesse visé par le texte

Version en vigueur depuis le 1er janvier 2016. Identifiant Légifrance : `LEGIARTI000031796366`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000031796366/2026-09-26>.

Extrait transport :

En matière de frais de transport, ces assurés sont exonérés de toute participation.

Le pronom « ces assurés » renvoie, dans le même article, aux assurés titulaires, au titre d'un avantage de vieillesse, de l'allocation supplémentaire prévue à l'article L. 815-2 dans sa rédaction antérieure à l'ordonnance n° 2004-605 du 24 juin 2004, ou de l'allocation de solidarité aux personnes âgées instituée par l'article L. 815-1.

## Article R. 160-10 — invalidité, rentes et pension de réversion

### Version en vigueur du 1er janvier 2026 au 1er octobre 2026

Identifiant Légifrance : `LEGIARTI000053335382`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000053335382/2026-09-26>.

Les titulaires d'une pension d'invalidité et les bénéficiaires des articles L. 341-15 et L. 341-16 sont exonérés de la participation prévue au I de l'article L. 160-13 en ce qui concerne les frais engagés pour eux-mêmes.

Les rentiers mentionnés à l'article L. 371-1 sont exonérés de la participation prévue au I de l'article L. 160-13 en ce qui concerne les frais engagés pour eux-mêmes et pour leurs ayants droit.

Les titulaires d'une pension de réversion qui se trouvent atteints entre cinquante-cinq ans et l'âge prévu par l'article L. 351-1-5 et par le IV des articles L. 643-3 et L. 653-2 d'une invalidité permanente satisfaisant aux conditions exigées pour ouvrir droit à une pension d'invalidité sont également exonérés de la participation prévue au I de l'article L. 160-13, en ce qui concerne les frais engagés pour eux-mêmes.

Nota officiel : se reporter aux modalités d'application prévues au II de l'article 2 du décret n° 2025-1409 du 31 décembre 2025.

### Version en vigueur à partir du 1er octobre 2026

Identifiant Légifrance : `LEGIARTI000053908752`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000053908752/2026-10-01>.

Les titulaires d'une pension d'invalidité et les bénéficiaires des articles L. 341-15 et L. 341-16 sont exonérés de la participation prévue au I de l'article L. 160-13 en ce qui concerne les frais engagés pour eux-mêmes.

Les rentiers mentionnés à l'article L. 371-1 sont exonérés de la participation prévue au I de l'article L. 160-13 en ce qui concerne les frais engagés pour eux-mêmes.

Les titulaires d'une pension de réversion qui se trouvent atteints entre cinquante-cinq ans et l'âge prévu par l'article L. 351-1-5 et par le IV des articles L. 643-3 et L. 653-2 d'une invalidité permanente satisfaisant aux conditions exigées pour ouvrir droit à une pension d'invalidité sont également exonérés de la participation prévue au I de l'article L. 160-13, en ce qui concerne les frais engagés pour eux-mêmes.

Nota officiel : conformément à l'article 2 du décret n° 2026-285 du 16 avril 2026, ces dispositions, dans leur rédaction issue de l'article 1er dudit décret, entrent en vigueur le 1er octobre 2026.

## Article R. 160-11 — ALD et protocole de soins

Version en vigueur depuis le 15 octobre 2016. Identifiant Légifrance : `LEGIARTI000033240403`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000033240403/2026-09-26>.

La participation de l'assuré prévue au I de l'article L. 160-13 est supprimée lorsque le malade est dans l'un des cas définis au 3° ou au 4° de l'article L. 160-14, pour les actes, prestations et traitements prévus par le protocole de soins mentionné à l'article L. 324-1.

Le directeur de l'organisme servant les prestations prend la décision prononçant la suppression de cette participation après avis du service du contrôle médical. Elle est valable pour la durée du protocole mentionné à l'article L. 324-1.

A l'expiration de cette période, dans le cas où le malade est toujours atteint d'une ou des affections mentionnées au 3° ou au 4° de l'article L. 160-14, la durée du protocole de soins mentionnée à l'article L. 324-1 peut être prolongée et la décision d'exonération peut être renouvelée dans les mêmes conditions.

A défaut de durée mentionnée sur le protocole, la décision indique sa propre durée.

Lorsqu'un assuré change d'organisme gestionnaire au cours de la période de validité du protocole de soins, ce changement est sans incidence sur la durée pendant laquelle il bénéficie de la suppression de sa participation.

Impact transport : cet article fixe l'exonération ALD ; la prise en charge même du transport reste soumise aux conditions spécifiques de l'article R. 322-10 et, à partir du 1er octobre 2026, à son renvoi explicite aux 3° et 4° de l'article L. 160-14.

## Article R. 160-16 — transport d'urgence lié à une hospitalisation avec acte coûteux

Version en vigueur depuis le 1er avril 2026. Identifiant Légifrance : `LEGIARTI000053741731`.

Source directe : <https://www.legifrance.gouv.fr/codes/article_lc/LEGIARTI000053741731/2026-09-26>.

Passages nécessaires pour comprendre le renvoi du II, 2 :

I.-La participation de l'assuré aux tarifs servant de base au calcul de la prise en charge des frais de santé en cas de maladie est plafonnée à 32 euros dans les cas suivants :

2. Pour l'ensemble des frais intervenant au cours d'une hospitalisation dans un établissement de santé, lorsqu'il est effectué un acte thérapeutique ou un acte diagnostique dont la réalisation en établissement de santé est nécessaire à la sécurité des soins, affecté d'un coefficient égal ou supérieur à 60 ou d'un tarif égal ou supérieur à 120 euros.

3. Pour l'ensemble des frais intervenant au cours d'une hospitalisation consécutive à une hospitalisation répondant aux conditions mentionnées au 2 et en lien direct avec elle.

II.-La participation de l'assuré est supprimée :

2. Pour les frais de transport d'urgence entre le lieu de prise en charge de la personne et l'établissement de santé, en cas d'hospitalisation mentionnée au 2 du I ainsi que, en cas d'hospitalisation mentionnée au 3, pour les frais de transport entre les deux établissements ou entre l'établissement et le domicile en cas d'hospitalisation à domicile.

## Règles d'implémentation

- sélectionner la version selon la date d'exécution du transport, pas selon la date d'envoi de la facture ;
- séparer la borne réglementaire de l'article R. 160-5 du taux effectif fixé par décision UNCAM ;
- ne jamais transformer automatiquement la fourchette 2027 en un taux précis ;
- utiliser les droits acquis via les mécanismes opposables pour déterminer l'exonération et le taux ; ces extraits servent de contrôle juridique, pas de substitut au service de droits ;
- conserver l'identifiant Légifrance, la date d'effet et la source de chaque règle dans la configuration du moteur ;
- revalider les versions Légifrance et la décision UNCAM avant toute livraison couvrant des transports exécutés à partir du 1er janvier 2027.
