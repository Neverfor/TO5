<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="nav-collapse collapse">
	<ul class="nav">
		<s:url var="currenturl" escapeAmp="false" />
		
		<s:url var="url" action="index" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Home</a>
		</li>
		<s:url var="url" action="registreren" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Registreren</a>
		</li>
		<s:url var="url" action="advertenties" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Advertenties</a>
		</li>
		<s:url var="url" action="contact" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Contact</a>
		</li>
		<s:url var="url" namespace='/veilingen' action="zoeken" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Zoeken</a>
		</li>
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