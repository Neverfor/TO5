<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Login</h1>
<p>
	Log hier in met u emailadres en wachtwoord.<br/>
	Wanneer u nog geen account heeft klik dan <s:a href="registreren" >hier</s:a>
</p>
<hr/>
${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<s:property value="account.voornaam"/>
