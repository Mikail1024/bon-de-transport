Cadre d’interopérabilité des TLSi

## 6.8 Assertion Vitale V2

```xml
<?xml version="1.0"?>
<saml:Assertion xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 ID="_790a4fc3-5639-4473-90e6-78be4de398e1"
 IssueInstant="2011-06-29T10:34:03Z"
 Version="2.0">
  <saml:Issuer>00B1023668</saml:Issuer>
  <ds:Signature xmlns:ds="http://www.w3.org/2000/09/xmldsig#">
    <ds:SignedInfo>
      <ds:CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
      <ds:SignatureMethod Algorithm="http://www.sesam-vitale.fr/xmldsig/2011/06/V2-SHA256"/>
      <ds:Reference URI="#_790a4fc3-5639-4473-90e6-78be4de398e1">
        <ds:Transforms>
          <ds:Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/>
          <ds:Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
        </ds:Transforms>
        <ds:DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/>
        <ds:DigestValue>/IIvcn1QXN4eYUgh3O3ze6Q6VQ/6pmrBse+5IQFG2FA=</ds:DigestValue>
      </ds:Reference>
    </ds:SignedInfo>
    <ds:SignatureValue>1HXqB7om6fw=</ds:SignatureValue>
    <ds:KeyInfo>
      <v:KeyInfo xmlns:v="http://www.sesam-vitale.fr/xmldsig/2011/12/vitale">
        <v:Type>V2</v:Type>
        <v:Nature>R</v:Nature>
        <v:NumSerieLogique>000467107356</v:NumSerieLogique>
        <v:CleMere>T2.M.SK.VI.AMO.SG.466</v:CleMere>
      </v:KeyInfo>
    </ds:KeyInfo>
  </ds:Signature>
  <saml:Subject>
    <saml:NameID NameQualifier="VITALE"
SPNameQualifier="CV">000467107356</saml:NameID>
  </saml:Subject>
  <saml:AttributeStatement>
    <saml:Attribute Name="NIR">
      <saml:AttributeValue>1550672000106</saml:AttributeValue>
    </saml:Attribute>
  </saml:AttributeStatement>
</saml:Assertion>

```

Figure 12 – Exemple d’assertion Vitale V2

19/12/2025 — 99 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
