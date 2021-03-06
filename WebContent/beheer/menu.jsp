<%@ taglib prefix="s" uri="/struts-tags"%>
<ul class="nav pull-right">
	<li class="dropdown"><a href="#" class="dropdown-toggle"
		data-toggle="dropdown">Beheerdersmenu<b class="caret"></b>
	</a> <s:url var="currenturl" escapeAmp="false" /> <s:url var="url"
			action="index" escapeAmp="false" />

		<ul class="dropdown-menu">
			<s:url var="url" action="accounts" namespace='/beheer' escapeAmp="false" />
			<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
				<a href="<s:property value="#url"/>">Beheer Accounts</a>
			</li>
			<s:url var="url" action="veilingen" namespace='/beheer' escapeAmp="false" />
			<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
				<a href="<s:property value="#url"/>">Beheer Veilingen</a>
			</li>
			<s:url var="url" action="rubrieken" namespace='/beheer' escapeAmp="false" />
			<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
				<a href="<s:property value="#url"/>">Beheer Rubrieken</a>
			</li>
			<s:url var="url" action="showPopularVeilingen" namespace='/beheer' escapeAmp="false" />
			<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if>>
				<a href="<s:property value="#url"/>">Veilingen Dashboard</a>
			</li>
		</ul></li>
</ul>
<!--/.nav-collapse -->
