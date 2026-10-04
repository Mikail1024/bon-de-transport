Cadre d’interopérabilité des TLSi

Le contenu de la réponse :

- le access_token contient le nouveau jeton d’accès AM encodé en base64.
- le issued_token_type contient le type du jeton d’accès AM.
- le token_type contient la méthode pour utiliser le jeton d’accès AM.
- le expires_in contient la durée d’expiration du jeton d’accès AM (c’est-à-dire 1 heure)
- le scope contient le scope demandé, "all" pour tous les TLSi.

### Réponse en échec

Exemple :

```http
HTTP/1.1 400 Bad Request
Content-Type: application/json;charset=UTF-8
Cache-Control: no-store
Pragma: no-cache

{
 "error": "invalid_request",
 "error_description": "The request is missing a required parameter."
}
```

La liste des erreurs est spécifiée dans le CI-SIS.

### Requête vers les TLSi

Cette requête donne lieu à une authentification mutuelle TLS entre le proxy du SI-PS et le service de l’Assurance Maladie.

```http
POST [URL] HTTP/1.1
Host: [host]
Content-Type: text/xml;charset=UTF-8
Content-Length: [length]
Authorization: Bearer <access_token_tlsi>

<?xml version="1.0" encoding="UTF-8"?>
<soap:Envelope
…
</soap:Envelope>
```

Avec : access_token_tlsi : Le jeton d’accès AM.

L’URL et le HOST dépendent du TLSi et sont spécifiés dans le guide d’intégration.

19/12/2025 — 32 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
