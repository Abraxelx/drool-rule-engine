# drool-rule-engine 
		A rule engine on a web service with Drool Java

Heroku Link: https://drools-rule-engine.herokuapp.com/

<h2> Test Scenerio </h2><br/>

```
  rule "AcceptedPayroll"

when
orderObject : PayrollEntity(netUcret>0 && calismayaTabiGunSayisi > 0);
then
orderObject.setErrorResponse("PAYROLL HESAPLANABİLİR");
end;

  rule "RejectedtedPayroll"

when
orderObject : PayrollEntity(netUcret <= 0 && calismayaTabiGunSayisi <= 0);
then
orderObject.setErrorResponse("PAYROLL HESAPLANAMAZ");
end;
```
<h2>Query Example</h2><br/>
<b>LINK:</b> <h3><a href="https://drools-rule-engine.herokuapp.com/payroll">Click Here For Connecting Service URL</a></h3>
<b>QUERY EXAMPLE (Post Request):</b><br/>

```
{
    "netUcret": 20,
    "calismayaTabiGunSayisi": 30,
    "errorResponse": "PAYROLL HESAPLANABİLİR"
}
```
halil.sahin
