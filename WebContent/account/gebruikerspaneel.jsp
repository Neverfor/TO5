<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Mijn Account Overzicht</h1>

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<p class="welkomSpan">
	Welkom,	<s:property value="account.voornaam" />!<br/>
<hr />
<p class="pull-left"><strong>Overzicht van je gegevens:</strong></p>
<p class="pull-right">
<a href="<s:url action="gotowgegevens" namespace="/gebruiker"/>">
	<button class="btn">Wijzig gegevens</button>
</a>
<a href="<s:url action="gotowijzigpass" namespace="/gebruiker"/>">
	<button class="btn">Wijzig wachtwoord</button>
</a>
</p>
<table class="table">
	<tr>
		<td>Naam:</td>
		<td><s:property value="account.voornaam" /> <s:property
				value="account.achternaam" /></td>
	</tr>
	<tr>
		<td>Adres:</td>
		<td><s:property value="account.straat" /> <s:property
				value="account.huisnummer" />, <s:property
				value="account.woonplaats" /></td>
	</tr>
	<tr>
		<td>Postcode:</td>
		<td><s:property value="account.postcode" /></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><s:property value="account.emailadres" /></td>
	</tr>
	<tr>
		<td>Telefoonnummer:</td>
		<td><s:property value="account.telefoonnummer" /></td>
	</tr>
</table>
<hr />
<h2>
	Op je rekening
	<s:if test="account.credits == 1">
	  staat:
	</s:if>
		<s:else>
	  staan:
	</s:else>
</h2>
<h3>
	<s:if test="account.credits == 0">
		<span class="text-error">geen credits.</span>
	</s:if> 
	<s:elseif test="account.credits == 1">
		<span class="text-warning">1 credit.</span>
	</s:elseif>
	<s:else>
  		<span class="text-success"><s:property value="account.credits"/> credits.</span>
  	</s:else>
</h3>
<a href="<s:url action="gotockopen" namespace="/gebruiker"/>">
	<button class="btn btn-primary">Koop credits!</button>
</a>