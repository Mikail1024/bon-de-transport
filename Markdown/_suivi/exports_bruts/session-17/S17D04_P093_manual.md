Cadre d’interopérabilité des TLSi

## 6.3 Assertion PS signée

```xml
<?xml version="1.0"?>
<saml:Assertion xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
ID="_431f08db-5e4c-49ef-95c6-909131aab423"
IssueInstant="2012-04-23T12:29:44.440Z"
Version="2.0">
  <saml:Issuer Format="urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName">
  CN=0991092560,OID.2.5.4.4=BIDE,OID.2.5.4.42=Jean,OU=Medecin,O=GIP-CPS-TEST,C=FR</saml:Issuer>
  <Signature xmlns="http://www.w3.org/2000/09/xmldsig#">
    <SignedInfo>
      <CanonicalizationMethod Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
      <SignatureMethod Algorithm="http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"/>
      <Reference URI="#_431f08db-5e4c-49ef-95c6-909131aab423">
        <Transforms>
          <Transform Algorithm="http://www.w3.org/2000/09/xmldsig#enveloped-signature"/>
          <Transform Algorithm="http://www.w3.org/2001/10/xml-exc-c14n#"/>
        </Transforms>
        <DigestMethod Algorithm="http://www.w3.org/2001/04/xmlenc#sha256"/>
        <DigestValue>imHS1md8AeIcdr9RY2clqvUzp0Y=</DigestValue>
      </Reference>
    </SignedInfo>
    <SignatureValue>
NnXRPjZBjeqBIgRf7wDPfLYQgTAlcN/q6XaXi6gQv+aWvf4pSqIcIMQHj7frifj5
…
BBxnuFdTUyigapJPzUTKEGXR0KkzavUOX0iSI5SsQOM=
    </SignatureValue>
    <KeyInfo>
      <X509Data>
        <X509Certificate>
MIID3jCCAsagAwIBAgIGAJAAAmghMA0GCSqGSIb3DQEBBQUAMFgxCzAJBgNVBAYT
…
MtVEVTVDEQMA4GA1UECxQHTelkZWNpbjBNMAsGA1UEKhME2TxhgoGoQ==
                </X509Certificate>
      </X509Data>
    </KeyInfo>
  </Signature>
  <saml:Subject>
    <saml:NameID NameQualifier="CPS">0991092560</saml:NameID>
  </saml:Subject>
</saml:Assertion>
```

23/04/2026 — 93 / 102

Ce document à diffusion restreinte ne peut être diffusé sans l'autorisation d'une personne habilitée au GIE SESAM-Vitale
