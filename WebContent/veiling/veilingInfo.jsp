<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="row-fluid">

	<div class="span12">
		<!-- center/titel -->
		<h1>
			<s:property value="veiling.titel" />
		</h1>
		<div class="row-fluid">

			<div class="span3">
				<!-- left  -->
				<img
					src="<s:url action="ImageAction" namespace="/veilingen">
    <s:param name="id"><s:property value="veiling.id"/></s:param>
	</s:url>"
					class="img-polaroid" />
				</td>
			</div>

			<div class="span9">
				<!-- right  -->
				<p>
					Adverteerder:
					<s:property value="veiling.account.voornaam" />
					<s:property value="veiling.account.achternaam" />
					<br /> Veiling gaat tot:
					<s:property value="veiling.eindDatum" />
					<br /> Huidige bod:
					<s:property value="veiling.biedingen.geld" />
					<br />
				</p>
			</div>
		</div>
		<div class="row-fluid">
			<div class="span5">
			<h3><i>Omschrijving:</i></h3>
			<p><s:property value="veiling.omschrijving" /></p>
			</div>
		</div>
	</div>
	
</div>


<s:form action="biedAction" theme="bootstrap">
	<hr />
	<s:textfield name="gelds" label="Je bod:" />
	<s:hidden name="veilingId" value="%{veiling.id}" />
	<%-- <s:hidden name="id" value="%{account.id}" /> --%>
	<hr />
	<div class="form-actions">
		<s:submit cssClass="btn" />
	</div>
</s:form>
