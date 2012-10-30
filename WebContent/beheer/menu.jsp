<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="nav-collapse collapse">
	<ul class="nav">
		<s:url var="currenturl" escapeAmp="false" />
		<s:url var="url" action="index" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Home</a>
		</li>
		<s:url var="url" action="accounts" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Beheer Accounts</a>
		</li>
		<s:url var="url" action="veilingen" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Beheer Veilingen</a>
		</li>
		<s:url var="url" action="rubrieken" escapeAmp="false" />
		<li <s:if test="#url.startsWith(#currenturl)">class="active"</s:if> >
			<a href="<s:property value="#url"/>">Beheer Rubrieken</a>
		</li>
	</ul>	
</div>
<!--/.nav-collapse -->