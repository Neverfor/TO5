<%@ taglib prefix="s" uri="/struts-tags"%>

<h1>Registreren</h1>
<p>
	Hier kunt u zich registreren voor het (aan)bieden op de Veilingsite. <br />
	Vul alle onderstaande velden correct in en klik op de submit-knop. U
	krijgt van ons een bevestigingsemail. <br /> Na het bevestigen van u
	e-mailadres kunt u beginnen met het plaatsen van biedingen of
	advertenties.
</p>
<hr />


<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<s:form action="registrerenDo" cssClass="form-horizontal"
	theme="bootstrap">
	<s:textfield name="emailadres" label="Email" />
	<s:password name="wachtwoord" label="Wachtwoord" />
	<s:password name="wachtwoordBevestiging" label="Wachtwoord bevestiging" />
	<hr />
	<s:textfield name="voornaam" label="Voornaam" />
	<s:textfield name="tussenvoegsel" label="Tussenvoegsel" />
	<s:textfield name="achternaam" label="Achternaam" />
	<hr />
	<s:textfield name="telefoonnummer" label="Telefoonnummer" />
	<hr />
	<s:textfield name="woonplaats" label="Woonplaats" />
	<s:textfield name="postcode" label="Postcode" cssClass="input-small" />
	<s:textfield name="straat" label="Straat" />
	<s:textfield name="huisnummer" label="Huisnummer" cssClass="input-mini" />


	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>