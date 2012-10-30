<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="nav-collapse collapse">
	<ul class="nav">
	<s:url var="currenturl" escapeAmp="false" />
	<s:url var="url" action="index" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Home</a>
		</li>
		<s:url var="url" namespace='/gebruiker' action="gebruikerspaneel" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Gebruikerspaneel</a>
		</li>
		<s:url var="url" namespace='/veilingen' action="mijn-veilingen" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Mijn Veilingen</a>
		</li>
		<s:url var="url" namespace='/veiling' action="plaatsen" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Veiling Plaatsen</a>
		</li>
	</ul>	

</div>
<!--/.nav-collapse -->