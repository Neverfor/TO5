<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="myborder">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 10%">Minimum bod</th>
		<th style="width: 10%">Rubriek</th>
		<!-- <th style="width: 10%">Resterende tijd</th> -->
		<th style="width: 20%">Bid</th>
	</tr>
	<s:iterator value="veilingen">
		<tr>
			<td><s:property value="titel" /></td>
			<td><s:property value="omschrijving" /></td>
			<td><s:property value="minimumBod" /></td>
			<td><s:property value="rubriek.naam" /></td>
			<td><a href="veilingInfo">Bid</a></td>
		</tr>
	</s:iterator>
</table>


<!--  
<table class="myborder">
	<tr class="mycolor">
		<td class="mycolor">Naam:</td>
		<td><s:property value="account.voornaam" /> <s:property value="account.achternaam" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Adres:</td>
		<td><s:property value="account.woonplaats" />, <s:property
				value="account.straat" />, <s:property value="account.huisnummer" />
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
</table> -->