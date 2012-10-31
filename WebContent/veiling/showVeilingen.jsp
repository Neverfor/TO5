<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="mybordertwo">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 10%">Minimum bod</th>
		<th style="width: 10%">Rubriek</th>
		<!-- <th style="width: 10%">Resterende tijd</th> -->
		<th style="width: 20%"></th>
	</tr>
	<s:iterator value="veilingen">
		<tr>
			<td><s:property value="titel" /></td>
			<td><s:property value="omschrijving" /></td>
			<td><s:property value="minimumBod" /></td>
			<td><s:property value="rubriek.naam" /></td>
			<td><!--  <a href="veilingInfo?id=<s:property value="id"/>">Bied</a> -->
			<a href='<s:url action="veilingInfo" namespace="/veilingen">
			<s:param name="id"><s:property value="id"/></s:param>
			</s:url>'>Toon Info</a></td>
		</tr>
	</s:iterator>
</table>