<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span> </br>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p class="welkomSpan">Hier kunt u uw wachtwoord wijzigen! </br> </br>

<!--<span class="mijnGrootText"> Je gegevens zijn geregistreerd als volgt: </span>-->
</br>
 <s:property value="voornaam"/>
<s:form action="wijzigenPp" cssClass="form-horizontal" theme="bootstrap">
	<!--<s:hidden	 key="email" 					label="Email" 			value="%{emailadres}"/> -->
	<s:password  name="wachtwoord" 				label="Wachtwoord" 					value="%{wachtwoord}"/>
	<s:password  name="wachtwoordBevestiging" 	label="wachtwoordBevestiging" 		value="%{wachtwoord}"/>
	<!--<s:hidden	 name="voornaam" 			label="Voornaam"  		value="%{voornaam}"/>
	<s:hidden 	 name="achternaam" 				label="Achternaam"  	value="%{achternaam}"/>	
	<s:hidden  	 name="telefoonnummer" 			label="Telefoonnummer"	value="%{telefoonnummer}"/>
	<s:hidden 	 name="woonplaats" 				label="Woonplaats"  	value="%{woonplaats}"/>
	<s:hidden 	 name="postcode" 				label="Postcode" 		value="%{postcode}" cssClass="input-small" />
	<s:hidden 	 name="straat" 					label="Straat"  		value="%{straat}"/>
	<s:hidden 	 name="huisnummer" 				label="Huisnummer" 		value="%{huisnummer}" cssClass="input-mini" />-->

	<div class="form-actions">
			<s:submit cssClass="btn"/>
	</div>
</s:form>

</p>
