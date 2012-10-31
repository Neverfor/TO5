<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<h1>Bewerk account #<s:property value="account.id"/> (<s:property value="account.voornaam"/>, 
														<s:property value="account.achternaam"/>)</h1>

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />
<tiles:insertDefinition name="accountGegevensForm">
	<tiles:putAttribute name="formAction">saveAccount</tiles:putAttribute>
</tiles:insertDefinition>
