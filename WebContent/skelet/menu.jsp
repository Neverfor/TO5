<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="nav-collapse collapse">
	<ul class="nav">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="#about">About</a></li>
		<li><a href="#contact">Contact</a></li>
	</ul>	
	<s:form action="CheckLogin" cssClass="navbar-form pull-right" theme="simple">
		<s:textfield name="email" cssClass="span2" placeholder="Email"/>
		<s:textfield name="wachtwoord" cssClass="span2" placeholder="Wachtwoord"/>
		<button class="btn" type="submit">Sign in</button>
	</s:form>
</div>
<!--/.nav-collapse -->