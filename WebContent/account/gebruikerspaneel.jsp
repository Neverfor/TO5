<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Je account overzicht</h1>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p>Welkom, <s:property value="account.voornaam"/>! </br>

Je gegevens zijn geregistreerd als volgt:
<table>
<tr>
<td>Naam: </td> <td> <s:property value="account.voornaam"/>  </td>
</tr>
<tr>
<td>Adres: </td> <td> <s:property value="account.woonplaats"/>, <s:property value="account.straat"/>, <s:property value="account.huisnummer"/>   </td>
</tr>
<tr>
<td>Postcode: </td> <td> <s:property value="account.postcode"/>, <s:property value="account.huisnummer"/>  </td>
</tr>
<tr>
<td>Email: </td> <td> <s:property value="account.emailadres"/>  </td>
</tr>
<tr>
<td>Telefoonnummer: </td> <td> <s:property value="account.telefoonnummer"/>  </td>
</tr>
</table>

</p>
