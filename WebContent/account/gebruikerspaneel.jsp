<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span>
</br>

${request.requestURL}

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<p class="welkomSpan">
	Welkom,
	<s:property value="account.voornaam" />
	! </br> </br> <span class="mijnGrootText"> Je gegevens zijn geregistreerd
		als volgt: </span>
<table class="myborder">
	<tr class="mycolor">
		<td class="mycolor">Naam:</td>
		<td><s:property value="account.voornaam" /> <s:property value="account.achternaam" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Adres:</td>
		<td>
			<s:property value="account.straat" /> <s:property value="account.huisnummer" />, <s:property value="account.woonplaats" />
		</td>
	</tr class="mycolor">
	<tr class="mycolor">
		<td class="mycolor">Postcode:</td>
		<td><s:property value="account.postcode" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Email:</td>
		<td><s:property value="account.emailadres" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Telefoonnummer:</td>
		<td><s:property value="account.telefoonnummer" /></td>
	</tr>
</table>
</br>
<span class="geldText">Op je rekening <s:if test="account.credits == 1">
  staat:
</s:if>
<s:else>
  staan:
</s:else>
<s:if test="account.credits == 0">
geen
</s:if>
<s:else>
<s:property value="account.credits"/> 
</s:else>
<s:if test="account.credits == 1">
  credit.
</s:if>
<s:else>
  credits.
</s:else> </span>

Niet genoeg? Koop ze <a href='<s:url action="gotockopen" namespace="/gebruiker"/>'>hier</a> of start met bieden. </br>
Klopt iets niet bij je gegevens? Dan wijzig ze <a href='<s:url action="gotowgegevens" namespace="/gebruiker"/>'>hier</a>.</br>
Wachtwoord wijzigen kan <a href='<s:url action="gotowijzigpass" namespace="/gebruiker"/>'>hier</a>.
</p>
