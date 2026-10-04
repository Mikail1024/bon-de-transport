Cadre d’interopérabilité des TLSi

## 6.9 Assertion ApCV

```xml
<?xml version="1.0"?>
<saml:Assertion xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion" ID="_790a4fc3-5639-4473-90e6-78be4de398e1"
IssueInstant="2020-03-03T10:36:53Z" Version="2.0">
  <saml:Issuer>0381044676</saml:Issuer>
  <saml:Subject>
    <saml:NameID NameQualifier="VITALE"
SPNameQualifier="ApCV">000123456789</saml:NameID>
  </saml:Subject>
  <saml:AttributeStatement>
    <saml:Attribute Name="ApCVToken">
      <saml:AttributeValue>APCV_TOKEN</saml:AttributeValue>
    </saml:Attribute>
  </saml:AttributeStatement>
</saml:Assertion>

```

Figure 12 – Exemple d'Assertion ApCV

23/04/2026 — 100 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
