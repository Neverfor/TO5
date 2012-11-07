<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionmessage theme="bootstrap"/>
<h1>Populeerste Veilingen</h1>

<table class="table">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 20%">Rubriek</th>
		<th style="width: 20%">Aantal biedingen</th>
	</tr>
	<s:iterator value="veilingen">
	<tr>
			<td><s:property value="titel" /></td>
			<td><s:property value="omschrijving" /></td>
			<td><s:property value="rubriek.naam" /></td>
			<td><s:property value="biedingen.size" /></td>
			</tr>
	</s:iterator>
</table>