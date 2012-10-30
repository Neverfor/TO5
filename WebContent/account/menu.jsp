<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="nav-collapse collapse">
	<ul class="nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="<s:url namespace='/gebruiker' action='gebruikerspaneel'/>">Gebruikerspaneel</a>	</li>
		<li><a href="<s:url namespace='/veilingen' action='mijn-veilingen' />">Mijn advertenties</a>	</li>
		<li><a href="<s:url namespace='/veiling' action='plaatsen' />">Advertentie plaatsen</a>			</li>
		<li><a href="<s:url namespace='/veilingen' action='alleVeil' />">Bekijk alle veilingen</a>	</li>
	</ul>
</div>
<!--/.nav-collapse -->