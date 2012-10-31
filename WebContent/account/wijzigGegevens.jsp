<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span>

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<p class="welkomSpan">
	Hier kunt u uw gegevens wijzigen! </br> </br>
</p>
<tiles:insertDefinition name="accountGegevensForm"/>