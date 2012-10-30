<%@ taglib prefix="s" uri="/struts-tags"%>
<table class=".table">
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