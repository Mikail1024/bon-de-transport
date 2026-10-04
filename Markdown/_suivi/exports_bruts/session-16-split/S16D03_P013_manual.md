# WS-Security

**Assertion SAML**

**Identifiants login/mot de passe**

```text
env:envelope
├── env:header
│   ├── WS-Addressing
│   ├── WS-Security
│   │   └── Assertion/pwd
│   └── Contextes techniques
└── env:body
    └── metier
```

Flèche du schéma vers WS-Security.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<env:Envelope xmlns:env="http://www.w3.org/2003/05/soap-envelope"
xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wss="
http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">
  <env:Header>
    <wsa:Action>urn:aat:4.1.0:GetVersionsReferentiel</wsa:Action>
    <wsa:MessageID>uuid:f02701b1-0f18-4502-a4bb-b1c5516c0a54</wsa:MessageID>
    <wss:Security>
      <saml:Assertion xmlns:saml="..."
      <!-- etc.-->
      </saml:Assertion>
      <!-- Ou.-->
      <wsse:UsernameToken>
        <wsse:Username>Dupont</wsse:Username>
        <wsse:Password>motdepasse</wsse:Password>
      </wsse:UsernameToken>
    </wss:Security>
  </env:Header>
  <env:Body>
  </env:Body>
</env:Envelope>
```

Les balises saml:Assertion et wsse:UsernameToken sont surlignées en jaune.

Présentation de cadre d'interopérabilité — 15/01/2016 — 13
SESAM-Vitale
