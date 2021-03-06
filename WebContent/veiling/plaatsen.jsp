<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Veiling plaatsen</h1>
<p>
	Hier kunt u een nieuwe veiling maken die op de site wordt geplaatst <br />
	Vul alle onderstaande velden correct in en klik op de submit-knop.
</p>
<hr />


<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<s:form action="plaatsenDo" enctype="multipart/form-data" cssClass="form-horizontal" theme="bootstrap">
	<s:textfield name="titel" label="Titel" />
	<s:textarea name="omschrijving" label="Omschrijving" />
	<s:select label="Rubriek" 
		headerKey="" headerValue="--- Kies rubriek ---"
		list="rubrieken" 
		name="rubriek" listValue="naam" listKey="id" />
	<s:radio name="veilingDuur" label="Veiling Duur" 
		list="#{'3' : '3 Dagen', '5' : '5 Dagen', '7' : '7 Dagen'}"  value="%{3}" />
	<s:file name="img" label="Selecteer foto" />
	<s:textfield name="minimumBod" label="Minimum bod" />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>