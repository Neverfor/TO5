<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- <table class="mybordertwo">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 10%">Minimum bod</th>
		<th style="width: 10%">Rubriek</th>
		<!-- <th style="width: 10%">Resterende tijd</th> 
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
</table> -->


<table class="mybordertwo">
	<tr class="mycolor">
		<td class="mycolor">Verkoper:</td>
		<td><s:property value="veiling.account.voornaam" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Titel:</td>
		<td><s:property value="veiling.titel" /></td>
	</tr class="mycolor">
	<tr class="mycolor">
		<td class="mycolor">Omschrijving:</td>
		<td><s:property value="veiling.omschrijving" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Veiling gaat tot:</td>
		<td><s:property value="veiling.einddatum" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Huidige bod:</td>
		<td><s:property value="veiling.bod.bod" /></td>
	</tr>
</table>

<s:form action="biedAction" theme="bootstrap">
	<hr />
	<s:textfield name="geld" label="Je bodt" />
	<s:hidden name="veilingId" value="%{veiling.id}"/>
	<hr />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>