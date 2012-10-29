<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span>
</br>

${request.requestURL}

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<p class="welkomSpan">
	Hier kunt u uw gegevens wijzigen! </br> </br>

	<!--<span class="mijnGrootText"> Je gegevens zijn geregistreerd als volgt: </span>-->
	</br>
	<s:property value="account.voornaam" />
	<s:form action="wijzigenGegevens" cssClass="form-horizontal"
		theme="bootstrap">
		<s:textfield key="account.email" label="Email"
			value="%{account.emailadres}" />
		<s:password name="account.wacthwoord" label="Wachtwoord"
			value="%{account.wachtwoord}" />
		<s:textfield name="account.voornaam" label="Voornaam"
			value="%{account.voornaam}" />
		<s:textfield name="account.achternaam" label="Achternaam"
			value="%{account.achternaam}" />
		<s:textfield name="account.telefoonnummer" label="Telefoonnummer"
			value="%{account.telefoonnummer}" />
		<s:textfield name="account.woonplaats" label="Woonplaats"
			value="%{account.woonplaats}" />
		<s:textfield name="account.postcode" label="Postcode"
			cssClass="input-small" value="%{account.postcode}" />
		<s:textfield name="account.straat" label="Straat"
			value="%{account.straat}" />
		<s:textfield name="account.huisnummer" label="Huisnummer"
			cssClass="input-mini" value="%{account.huisnummer}" />

		<div class="form-actions">
			<s:submit cssClass="btn" />
		</div>
	</s:form>

</p>
