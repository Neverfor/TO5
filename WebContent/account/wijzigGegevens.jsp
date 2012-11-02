<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<span class="mijnKopText"> Je account overzicht</span> <br/>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p class="welkomSpan">Hier kunt u uw gegevens wijzigen!</p>

<span class="mijnGrootText"> Je gegevens zijn geregistreerd als volgt: </span>
<tiles:insertDefinition name="accountGegevensForm">
	<tiles:putAttribute name="formAction">wijzigenGegevens</tiles:putAttribute>
</tiles:insertDefinition>
