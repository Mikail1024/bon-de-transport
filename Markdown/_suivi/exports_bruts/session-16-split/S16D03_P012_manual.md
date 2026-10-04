# WS-Addressing

**préciser l’opération**

et

**identifier la requête**

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

Flèche du schéma vers WS-Addressing.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<env:Envelope xmlns:env="http://www.w3.org/2003/05/soap-envelope"
xmlns:wsa="http://www.w3.org/2005/08/addressing">
  <env:Header>
    <wsa:Action>urn:ServicePriseenChargeB2_SI:4.0.0:Calculer</wsa:Action>
    <wsa:MessageID>uuid:f02701b1-0f18-4502-a4bb-b1c5516c0a54</wsa:MessageID>
  </env:Header>
  <env:Body>
  </env:Body>
</env:Envelope>
```

Les valeurs Action et MessageID sont surlignées en jaune.

Présentation de cadre d'interopérabilité — 15/01/2016 — 12
SESAM-Vitale
