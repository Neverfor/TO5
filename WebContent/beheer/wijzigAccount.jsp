<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<h1>Bewerk account #<s:property value="account.id"/> (<s:property value="account.voornaam"/>, 
														<s:property value="account.achternaam"/>)</h1>

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />
<tiles:insertDefinition name="accountGegevensForm">
	<tiles:putAttribute name="formAction">saveAccount</tiles:putAttribute>
</tiles:insertDefinition>
<h2>Bewerk Rechten</h2>
<s:form action="saveRights" theme="bootstrap" cssClass="form-horizontal">
	<s:hidden name="id" value="%{account.id}"/>
	<s:checkboxlist name="selectedRechten" list="rechten" listKey="id" listValue="beschrijving" value="selectedRechten" label="Selecteer bevoegdheden"></s:checkboxlist>
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>