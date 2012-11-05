<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<h1>Registreren</h1>
<p>
	Hier kunt u zich registreren voor het (aan)bieden op de Veilingsite. <br />
	Vul alle onderstaande velden correct in en klik op de submit-knop. U
	krijgt van ons een bevestigingsemail. <br /> Na het bevestigen van u
	e-mailadres kunt u beginnen met het plaatsen van biedingen of
	advertenties.
</p>
<hr />


<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<tiles:insertDefinition name="regForm">
	<tiles:putAttribute name="formAction">registrerenDo</tiles:putAttribute>
	<tiles:putAttribute name="wachtwoordVelden" value="/gedeeld/wachtwoordVelden.jsp"/>
</tiles:insertDefinition>
