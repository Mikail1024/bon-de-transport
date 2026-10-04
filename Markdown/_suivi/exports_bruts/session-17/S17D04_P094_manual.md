Cadre d’interopérabilité des TLSi

## 6.4 Assertion Structure

```xml
<?xml version="1.0"?>
<saml:Assertion xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"
xmlns:samlp="urn:oasis:names:tc:SAML:2.0:protocol"
 ID="_06c6bece-28d6-11e6-86d7-e6618c2586e4"
 Version="2.0"
 IssueInstant="2016-06-02T15:23:58Z">
  <saml:Issuer>urn:interops:180035024:idp:1.0</saml:Issuer>
  <Signature xmlns="http://www.w3.org/2000/09/xmldsig#">
    <SignedInfo>
      <CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
      <SignatureMethod Algorithm="http://www.w3.org/2000/09/xmldsig#rsa-sha256"/>
      <Reference URI="#_06c6bece-28d6-11e6-86d7-e6618c2586e4">
        <Transforms>
          <Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/>
          <Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
        </Transforms>
        <DigestMethod Algorithm="http://www.w3.org/2000/09/xmldsig#sha256"/>
        <DigestValue>dYqpIjE2s1/p5+XInz5aBPz6aSI=</DigestValue>
      </Reference>
    </SignedInfo>
    <SignatureValue>
KLm+k9q13/PWKfKCkiXaSgYRv0wrhBlkJWb4Qh5r0OzCxjS+N7NsDkit/AmvHIItRi7
…
jcUzGa1K2tnU2wDBPbsLx7wjiJcrlWTqpDa88=
    </SignatureValue>
    <KeyInfo>
      <X509Data>
        <X509Certificate>
MIID6DCCAtCgAwIBAgIDAYmjMA0GCSqGSIb3DQEBBQUAME8xGzAZBgNVBAMTEkFDIEN
…
656ml2MpMAmEnHvlPSek/4RRIn3V+QSG5uxlBqH9OxgOmokgwQ/9xJjxE+VALLLK4E=
        </X509Certificate>
      </X509Data>
    </KeyInfo>
  </Signature>
  <saml:Subject>
    <saml:NameID Format="urn:oasis:names:tc:SAML:2.0:nameid-format:persistent">3750100125/1453</saml:NameID>
    <saml:SubjectConfirmation Method="urn:oasis:names:tc:SAML:2.0:cm:sender-vouches">
      <saml:SubjectConfirmationData NotOnOrAfter="2016-06-02T15:38:58Z"
Recipient="urn:interops:180035024:idp:1.0"/>
    </saml:SubjectConfirmation>
  </saml:Subject>
  <saml:Conditions NotBefore="2016-06-02T15:18:58Z" NotOnOrAfter="2016-06-02T15:38:58Z">
    <saml:AudienceRestriction>
      <saml:Audience>urn:interops:service:xxx:xxxxx</saml:Audience>
    </saml:AudienceRestriction>
  </saml:Conditions>
  <saml:AuthnStatement AuthnInstant="2016-06-02T17:23:57Z" SessionIndex="_06c6bece-28d6-11e6-86d7-e6618c2586e4">
    <saml:AuthnContext>
```

23/04/2026 — 94 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
