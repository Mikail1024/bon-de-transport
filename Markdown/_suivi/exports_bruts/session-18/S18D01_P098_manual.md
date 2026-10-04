Cadre d’interopérabilité des TLSi

## 6.7 Assertion Vitale IGEA

```xml
<?xml version="1.0"?>
<saml:Assertion xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 ID="_790a4fc3-5639-4473-90e6-78be4de398e1"
 IssueInstant="2011-06-29T10:40:19Z"
 Version="2.0"
 xsi:schemaLocation="urn:oasis:names:tc:SAML:2.0:assertion http://docs.oasis-open.org/security/saml/v2.0/saml-schema-assertion-2.0.xsd">
  <saml:Issuer>00B1023668</saml:Issuer>
  <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
    <ds:SignedInfo>
      <ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
      <ds:SignatureMethod Algorithm="http://www.sesam-vitale.fr/xmldsig/2011/06/V1IGEA-SHA256/20"/>
      <ds:Reference URI="#_790a4fc3-5639-4473-90e6-78be4de398e1">
        <ds:Transforms>
          <ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/>
          <ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
        </ds:Transforms>
        <ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/>
        <ds:DigestValue>FmybAUWG02pm+gbqzUO7VJvtCjcHk6cP8tOfBo08fxo=</ds:DigestValue>
      </ds:Reference>
    </ds:SignedInfo>
    <ds:SignatureValue>cbkZj4OdaWs=</ds:SignatureValue>
    <ds:KeyInfo>
      <v:KeyInfo xmlns:v="http://www.sesam-vitale.fr/xmldsig/2011/12/vitale">
        <v:Type>V1IGEA</v:Type>
        <v:Nature>R</v:Nature>
        <v:NumSerieLogique>000467107356</v:NumSerieLogique>
      </v:KeyInfo>
    </ds:KeyInfo>
  </ds:Signature>
  <saml:Subject>
    <saml:NameID NameQualifier="VITALE"
SPNameQualifier="CV">000467107356</saml:NameID>
  </saml:Subject>
  <saml:AttributeStatement>
    <saml:Attribute Name="NIR">
      <saml:AttributeValue>2501962643002</saml:AttributeValue>
    </saml:Attribute>
  </saml:AttributeStatement>
</saml:Assertion>

```

Figure 11 – Exemple d’assertion Vitale IGEA

19/12/2025 — 98 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
