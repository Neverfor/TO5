<%@ taglib prefix="s" uri="/struts-tags"%>
<s:actionmessage theme="bootstrap"/>
<h1>Beheer Accounts</h1>
<table class="table">
	<tr>
		<th style="width: 10%"></th>
		<th style="width: 5%">Id</th>
		<th style="width: 25%">Emailadres</th>
		<th style="width: 25%">Achternaam</th>
		<th style="width: 25%">Voornaam</th>
	</tr>
	<s:iterator value="accounts">
		<s:url var="editurl" action='account' namespace='/beheer'>
			<s:param name="id">
				<s:property value="id" />
			</s:param>
		</s:url>
		<s:url var="deleteurl" action='deleteaccount' namespace='/beheer'>
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
			<td><s:property value="emailadres" /></td>
			<td><s:property value="achternaam" /></td>
			<td><s:property value="voornaam" /></td>
		</tr>
	</s:iterator>
</table>