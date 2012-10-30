<%@ taglib prefix="s" uri="/struts-tags"%>
<table class=".table">
<tr>
	<th style="width:5%">Id</th>
	<th style="width:35%">Emailadres</th>
	<th style="width:30%">Achternaam</th>
	<th style="width:30%">Voornaam</th>
</tr>
<s:iterator value="accounts">
  <tr>
      <td><s:property value="id"/></td>
      <td><s:property value="emailadres"/></td>
      <td><s:property value="achternaam"/></td>
      <td><s:property value="voornaam"/></td>
  </tr>
</s:iterator>
</table>