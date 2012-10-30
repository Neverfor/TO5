<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="nav-collapse collapse">
	<ul class="nav">
		<li class="active"><a href="/beheer">Home</a></li>
		<li><a href="<s:url namespace='/beheer' action='accounts'/>">Beheer Accounts</a></li>
		<li><a href="<s:url namespace='/beheer' action='veilingen' />">Beheer Veilingen</a></li>
		<li><a href="<s:url namespace='/beheer' action='rubrieken' />">Beheer Rubrieken</a></li>
	</ul>	
</div>
<!--/.nav-collapse -->