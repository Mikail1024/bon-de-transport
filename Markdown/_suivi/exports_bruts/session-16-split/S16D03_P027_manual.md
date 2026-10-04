# Erreur SOAP

```xml
<?xml version="1.0" encoding="UTF-8"?>
<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope">
  <soap:Body>
    <soap:Fault>
      <soap:Code>
        <soap:Value>soap:Sender</soap:Value>
        <soap:Subcode>
          <soap:Value>soap:soap:siram_100</soap:Value>
        </soap:Subcode>
      </soap:Code>
      <soap:Reason>
        <soap:Text xml:lang="fr">L’accès par ce progiciel au service n’est pas autorisé. Contactez l’éditeur du progiciel ou votre responsable informatique.</soap:Text>
      </soap:Reason>
      <soap:Detail>
        <siram:Erreur code="desir_550" severite="erreur" messageID="_fe3b9237-2ef7-4e9e-b2b5-5d17033970fe" xmlns:siram="urn:siram">Numéro d’autorisation du logiciel inconnu</siram:Erreur>
      </soap:Detail>
    </soap:Fault>
  </soap:Body>
</soap:Envelope>
```

Présentation de cadre d'interopérabilité — 15/01/2016 — 27
SESAM-Vitale
