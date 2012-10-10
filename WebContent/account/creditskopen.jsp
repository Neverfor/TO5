<%@ taglib prefix="s" uri="/struts-tags"%>

<span class="mijnKopText"> Je account overzicht</span> </br>

${request.requestURL}

<s:actionerror theme="bootstrap"/>
<s:actionmessage theme="bootstrap"/>

<p class="welkomSpan">Hier kun je credits kopen </br> </br>
<span class="geldText">Op je rekening staan: <s:property value="account.credits"/> credits! </span>

<select>
  <option value="100">100</option>
  <option value="200">200</option>
  <option value="350">350</option>
  <option value="500">500</option>
</select> 

<div >
			<s:submit cssClass="btn"/>
	</div>
</p>
