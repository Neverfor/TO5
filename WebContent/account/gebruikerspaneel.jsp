<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span> </br>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p class="welkomSpan">Welkom, <s:property value="account.voornaam"/>! </br> </br>

<span class="mijnGrootText"> Je gegevens zijn geregistreerd als volgt: </span>
<table class="myborder">
<tr class="mycolor">
<td class="mycolor">Naam: </td> <td> <s:property value="account.voornaam"/>  </td>
</tr>
<tr class="mycolor">
<td class="mycolor">Adres: </td> <td> <s:property value="account.woonplaats"/>, <s:property value="account.straat"/>, <s:property value="account.huisnummer"/>   </td>
</tr class="mycolor">
<tr class="mycolor">
<td class="mycolor">Postcode: </td> <td> <s:property value="account.postcode"/> </td>
</tr>
<tr class="mycolor">
<td class="mycolor">Email: </td> <td> <s:property value="account.emailadres"/>  </td>
</tr>
<tr class="mycolor">
<td class="mycolor">Telefoonnummer: </td> <td> <s:property value="account.telefoonnummer"/>  </td>
</tr>
</table>
</br>
<span class="geldText">Op je rekening staan: <s:property value="account.credits"/> credits! </span>
Niet genoeg? Koop ze hier of start met bieden.
Klopt iets niet bij je gegevens? Dan wijzig ze <a href='<s:url action="wijzigenGegevens" namespace="/gebruiker"/>'>hier</a>.

</p>
