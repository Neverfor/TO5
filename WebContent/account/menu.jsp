<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="nav-collapse collapse">
	<ul class="nav">

		<s:url var="currenturl" escapeAmp="false" />
		<s:url var="url" action="index" escapeAmp="false" />
		<s:url var="url" namespace='/gebruiker' action="gebruikerspaneel"
			escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
			<a href="<s:property value="#url"/>">Gebruikerspaneel</a>
		</li>
		<s:url var="url" namespace='/veilingen' action="mijn-veilingen"
			escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
			<a href="<s:property value="#url"/>">Mijn Veilingen</a>
		</li>
		<s:url var="url" namespace='/veiling' action="plaatsen"
			escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
			<a href="<s:property value="#url"/>">Veiling Plaatsen</a>
		</li>
		<s:url var="url" namespace='/veilingen' action="alleVeil"
			escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
			<a href="<s:property value="#url"/>">Bekijk alle veilingen</a>
		</li>
		<s:url var="url" namespace='/veilingen' action="zoeken"
			escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
			<a href="<s:property value="#url"/>">Zoeken</a>
		</li>
	</ul>

	<ul class="nav pull-right">
		<li class="dropdown">
			<a href="#" class="dropdown-toggle" data-toggle="dropdown">
				<s:property value="#session['account'].emailadres"/>
				<b class="caret"></b>
		</a>
			<ul class="dropdown-menu">
				<li><a href="<s:url action="logout" namespace="/"/>">Uitloggen</a>
			</ul>
		</li>
	</ul>
</div>
<!--/.nav-collapse -->
