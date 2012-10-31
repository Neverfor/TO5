<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Veiling zoeken</h1>
<p>
	Hier kunt u zoeken naar een veiling. <br />
	Vul zoekterm in en klik op de zoek-knop.
</p>
<hr />


<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<s:form action="zoekenDo" cssClass="form-horizontal" theme="bootstrap">
	<s:textfield name="zoekterm" label="Zoeken" />
	<s:select label="Rubriek" 
		headerKey="-1" headerValue="--- Kies rubriek ---"
		list="rubrieken" 
		name="rubriek" listValue="naam" listKey="id" />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>