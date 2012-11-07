<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionmessage theme="bootstrap"/>
<h1>Populeerste Veilingen</h1>

<table class="table">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 40%">Rubriek</th>
	</tr>
	<s:iterator value="VeilingDBoard.veilingen">
	<tr>
			<td><s:property value="veiling.titel" /></td>
			<td><s:property value="veiling.omschrijving" /></td>
			<td><s:property value="rubriek.naam" /></td>
			</tr>
	</s:iterator>
</table>