<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionmessage theme="bootstrap"/>
<h1>Beheer Veilingen</h1>
<table class="table">
	<tr>
		<th style="width: 10%"></th>
		<th style="width: 5%">Id</th>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 10%">Minimum bod</th>
		<th style="width: 10%">Rubriek</th>
	</tr>
	<s:iterator value="veilingen">
		<s:url var="editurl" action='veiling' namespace='/beheer'>
			<s:param name="id">
				<s:property value="id" />
			</s:param>
		</s:url>
		<s:url var="deleteurl" action='deleteveiling' namespace='/beheer' >
			<s:param name="id">
				<s:property value="id" />
			</s:param>
		</s:url>
		<tr>
			<td>
				<a href="<s:property value='editurl'/>">
					<button	class="btn btn-small">
							<i class="icon-pencil"></i>
					</button> 
				</a> 
				<a href="<s:property value='deleteurl'/>">
					<button	class="btn btn-small btn-warning">
							<i class="icon-remove"></i>
					</button> 
				</a> 
			<td><s:property value="id" /></td>
			<td><s:property value="titel" /></td>
				<td><s:property value="omschrijving" /></td>
			<td><s:property value="minimumBod" /></td>
			<td><s:property value="rubriek.naam" /></td>
		</tr>
	</s:iterator>
</table>