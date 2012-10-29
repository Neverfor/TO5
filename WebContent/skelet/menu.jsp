<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="nav-collapse collapse">
	<ul class="nav">
		<s:url var="currenturl" escapeAmp="false" />
		<s:url var="url" action="index" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)"> class="active"</s:if>><a
			href="<s:property value="#url"/>"> Home</a></li>
		<li><a href="registreren">Registreren</a></li>
		<li><a href="login">Login</a></li>
		<li><a href="#">Advertenties</a></li>
		<li><a href="#">Contact</a></li>
	</ul>
	<s:form action="loginDo" cssClass="navbar-form pull-right"
		theme="simple">
		<s:textfield name="emailadres" cssClass="span2"
			placeholder="getText('emailadres')" />
		<s:password name="wachtwoord" cssClass="span2"
			placeholder="getText('wachtwoord')" />
		<button class="btn" type="submit">Sign in</button>
	</s:form>
</div>
<!--/.nav-collapse -->