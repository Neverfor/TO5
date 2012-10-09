<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Veiling plaatsen</h1>
<p>
	Hier kunt u een nieuwe veiling maken die op de site wordt geplaatst <br/>
	Vul alle onderstaande velden correct in en klik op de submit-knop. 
</p>
<hr/>


<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<s:form action="plaatsenDo" cssClass="form-horizontal" theme="bootstrap">
	<s:textfield name="titel" label="Titel" />
	<s:textfield name="omschrijving" label="Omschrijving" />
	<s:combobox
    label="Rubriek"
    name="rubriek"
    list="{'auto','televisie','laptop','smartphone'}"
    headerKey="-1"
    headerValue="--- Kies een rubriek ---"
    value="" />
	<hr/>
	<s:textfield name="minimumBod" label="Minimum bod" />
	<div class="form-actions">
			<s:submit cssClass="btn"/>
	</div>
</s:form>