<%@ taglib prefix="s" uri="/struts-tags"%>
<table class=".table">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 20%">Minimum bod</th>
		<th style="width: 20%">Rubriek</th>
	</tr>
	<s:iterator value="veilingen">
		<tr>
			<td><s:property value="titel" /></td>
			<td><s:property value="omschrijving" /></td>
			<td><s:property value="minimumBod" /></td>
			<td><s:property value="rubriek.naam" /></td>
		</tr>
	</s:iterator>
</table>