<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="mybordertwo">
	<tr>
		<th style="width: 30%">Titel</th>
	</tr>
		<tr>
			<td><a
				href='
					<s:url action="zoekenDo" namespace="/veilingen">
						<s:param name="rubriek">
							-1
						</s:param>
					</s:url>'>
					Alle rubrieken
			</a></td>
	<s:iterator value="rubrieken">
		<tr>
			<td><a
				href='
					<s:url action="zoekenDo" namespace="/veilingen">
						<s:param name="rubriek">
							<s:property value="id"/>
						</s:param>
					</s:url>'>
					<s:property value="naam" />
			</a></td>
	</s:iterator>
</table>