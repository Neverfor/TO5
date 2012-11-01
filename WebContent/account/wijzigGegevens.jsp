<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span> </br>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p class="welkomSpan">Hier kunt u uw gegevens wijzigen! </br> </br>

<span class="mijnGrootText"> Je gegevens zijn geregistreerd als volgt: </span>
<table class="myborder">
	<tr class="mycolor">
		<td class="mycolor">Naam: </td> 
		<td> <s:property value="account.voornaam"/>  </td> 
		<td> </td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Naam: </td> 
		<td> <s:property value="account.achternaam"/>  </td> 
		<td> </td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Adres: </td> 
		<td> <s:property value="account.woonplaats"/>, <s:property value="account.straat"/>, <s:property value="account.huisnummer"/>   </td>
	</tr class="mycolor">
	<tr class="mycolor">
		<td class="mycolor">Postcode: </td> 
		<td> <s:property value="account.postcode"/> </td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Email: </td> 
		<td> <s:property value="account.emailadres"/>  </td>
	</tr>
	<tr class="mycolor">
		<td class="mycolor">Telefoonnummer: </td> 
		<td> <s:property value="account.telefoonnummer"/>  </td>
	</tr>
</table>
</br>

<s:form action="wijzigenGegevens" cssClass="form-horizontal" theme="bootstrap">
	<s:textfield name="em" 		label="Email" /> 
	<s:hidden name="pass" 	label="Wachtwoord" />
	<s:textfield name="vnm" 	label="Voornaam" />
	<s:textfield name="anm" 	label="Achternaam" />	
	<hr/>

	<s:textfield name="tln" 	label="Telefoonnummer" />
	<s:textfield name="pl" 		label="Woonplaats" />
	<s:textfield name="pcode" 	label="Postcode" cssClass="input-small" />
	<s:textfield name="str" 	label="Straat" />
	<s:textfield name="hsn" 	label="Huisnummer" cssClass="input-mini"/>

	<div class="form-actions">
			<s:submit cssClass="btn"/>
	</div>
</s:form>