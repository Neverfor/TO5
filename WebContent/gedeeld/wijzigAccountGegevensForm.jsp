<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:importAttribute name="formAction"/>
<s:form action="%{#attr['formAction']}" cssClass="form-horizontal" theme="bootstrap">
	<s:hidden name="id" value="%{account.id}"/>
	<s:textfield key="account.emailadres" 		label="Email" 			value="%{account.emailadres}"/>
	<tiles:insertAttribute name="wachtwoordVelden"/> 
	<s:textfield name="account.voornaam" 		label="Voornaam"  		value="%{account.voornaam}"/>
	<s:textfield name="account.achternaam" 		label="Achternaam"  	value="%{account.achternaam}"/>	
	<s:textfield name="account.telefoonnummer" 	label="Telefoonnummer"	value="%{account.telefoonnummer}"/>
	<s:textfield name="account.woonplaats" 		label="Woonplaats"  	value="%{account.woonplaats}"/>
	<s:textfield name="account.postcode" 		label="Postcode" 		value="%{account.postcode}" cssClass="input-small" />
	<s:textfield name="account.straat" 			label="Straat"  		value="%{account.straat}"/>
	<s:textfield name="account.huisnummer" 		label="Huisnummer" 		value="%{account.huisnummer}" cssClass="input-mini" />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>