<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Veiling plaatsen</h1>
<p>
	Hier kunt u een nieuwe veiling maken die op de site wordt geplaatst <br />
	Vul alle onderstaande velden correct in en klik op de submit-knop.
</p>
<hr />


<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<s:form action="saveveiling" cssClass="form-horizontal" theme="bootstrap">
	<s:hidden name="id" value="%{veiling.id}"/>
	<s:textfield name="veiling.titel" label="Titel" value="%{veiling.titel}"/>
	<s:textfield name="veiling.omschrijving" label="Omschrijving" />
	<s:select label="Rubriek" 
		headerKey="" headerValue="--- Kies rubriek ---"
		list="rubrieken"
		name="rubriek" listValue="naam" listKey="id" value="%{selectedRubriek}" />
	<s:textfield name="veiling.minimumBod" label="Minimum bod" />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>