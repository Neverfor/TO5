<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="mybordertwo">
	<tr class="mycolor">
		<td class="mycolor">Verkoper:</td>
		<td><s:property value="veiling.account.voornaam" /></td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Titel:</td>
		<td><s:property value="veiling.titel" /></td>
	</tr>
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
		<td><s:property value="veiling.bod.geld" /></td>
	</tr>
</table>

<s:form action="biedAction" theme="bootstrap">
	<hr />
	<s:textfield name="gelds" label="Je bod:" />
	<s:hidden name="veilingId" value="%{veiling.id}"/>
<%-- 	<s:hidden name="id" value="%{veiling.id}"/> --%>
	<hr />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>