<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Login</h1>
<p>
	Log hier in met u emailadres en wachtwoord.<br /> Wanneer u nog geen
	account heeft klik dan
	<s:a href="registreren">hier</s:a>
</p>
<hr />
${request.requestURL}

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<s:form action="loginDo" cssClass="form-horizontal" theme="bootstrap">
	<s:textfield key="emailadres" />
	<s:password key="wachtwoord" />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>