SESAM-Vitale

# Table des erreurs du SIR

*Note technique SEL-INF-032 V1.2*

## 1 INTRODUCTION

Document listant les erreurs SOAP du SIR

Cette liste des erreurs est à usage informatif et non exhaustive.

## 2 FORMAT DE L’ERREUR SOAP

```xml
<?xml version="1.0"?>
<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
  <soap:Body>
    <soap:Fault>
      <soap:Code>
        <soap:Value>soap:[Code Value]</soap:Value>
        <soap:Subcode>
          <soap:Value>soap:[SubCode Value]</soap:Value>
        </soap:Subcode>
      </soap:Code>
      <soap:Reason>
        <soap:Text>[Reason]</soap:Text>
      </soap:Reason>
      <soap:Detail>
        <siram:Erreur xmlns:siram="urn:siram"
                      code="[code] "
                      severite="[Severite] "
                      messageID="...">
          [Erreur]
        </siram:Erreur>
      </soap:Detail>
    </soap:Fault>
  </soap:Body>
</soap:Envelope>
```

GIE SESAM-Vitale — 1 / 9
