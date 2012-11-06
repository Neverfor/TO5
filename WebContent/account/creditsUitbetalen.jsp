<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Credits uitbetalen</span>
</br>

${request.requestURL}

<s:actionerror theme="bootstrap" />
<s:actionmessage theme="bootstrap" />

<p class="welkomSpan">
	Hier kun je je credits laten uitbetalen </br> </br> <span class="geldText">Op je
		rekening staan: <s:property value="account.credits" /> credits!
	</span>
	<s:form action="creditsUitbetalen" cssClass="form-horizontal"
		theme="bootstrap">
		<s:textfield label="Credits" name="cNieuw" value="" />
		<s:hidden name="cOud" value="%{account.credits}" />
		
		<div class="form-actions">
			<s:submit cssClass="btn" />
		</div>
	</s:form>
</p>
