<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="mybordertwo">
	<tr>
		<th style="width: 20%">Titel</th>
		<th style="width: 40%">Omschrijving</th>
		<th style="width: 10%">Minimum bod</th>
		<th style="width: 10%">Rubriek</th>
		<!-- <th style="width: 10%">Resterende tijd</th> -->
	</tr>
	<s:iterator value="veilingen">
		<tr>
			<td><a
				href='
					<s:url action="veilingInfo" namespace="/veilingen">
						<s:param name="id">
							<s:property value="id"/>
						</s:param>
					</s:url>'>
					<s:property value="titel" />
			</a></td>
			<td><a
				href='
					<s:url action="veilingInfo" namespace="/veilingen">
						<s:param name="id">
							<s:property value="id"/>
						</s:param>
					</s:url>'>
					<s:property value="omschrijving" />
			</a></td>
			<td><a
				href='
					<s:url action="veilingInfo" namespace="/veilingen">
						<s:param name="id">
							<s:property value="id"/>
						</s:param>
					</s:url>'>
					<s:property value="minimumBod" />
			</a></td>
			<td><a
				href='
					<s:url action="veilingInfo" namespace="/veilingen">
						<s:param name="id">
							<s:property value="rubriek.naam" />
						</s:param>
					</s:url>'>
					<s:property value="minimumBod" />
			</a></td>
		</tr>
	</s:iterator>
</table>