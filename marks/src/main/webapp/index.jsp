<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marks</title>
</head>
<body>
	<form action="save" method="post">

		<div>
			<input type="text" name="candidateName" placeholder="candidate Name"
				required="required"> '
		</div>
		<div>
			<input type="number" name="kannada" placeholder="kannada"
				required="required"> '
		</div>
		<div>
			<input type="number" name="english" placeholder="english"
				required="required"> '
		</div>
		<div>
			<input type="number" name="hindi" placeholder="hindi"
				required="required"> '
		</div>
		<div>
			<input type="number" name="science" placeholder="science"
				required="required"> '
		</div>
		<div>
			<input type="number" name="mathematics" placeholder="mathematics"
				required="required"> '
		</div>
		<div>
			<input type="number" name="socialScience" placeholder="socialScience"
				required="required"> '
		</div>
		<input type="submit">
	</form>
	<table border="1" margin="centre">
		<tbody>
			<tr>
				<th>CandidateName</th>
				<th>Kannada</th>
				<th>English</th>
				<th>Hindi</th>
				<th>Sciencce</th>
				<th>Mathematices</th>
				<th>SocialScience</th>
				<th>Total:</th>
				<th>Percentage</th>
				<th>HighestScore</th>
				<th>LowestScore</th>
			</tr>
<%-- 			<c:forEach
				items="${name},${kannada},${english},${hindi},${science},${mathematics},
${socialScience},${total},${Percentage}" var="c[]"> --%>

				<tr>
					<td><h1>${name}</h1></td>
					<td><h1>${kannada}</h1></td>
					<td><h1>${english}</h1></td>
					<td><h1>${hindi}</h1></td>
					<td><h1>${science}</h1></td>
					<td><h1>${mathematics}</h1></td>
					<td><h1>${socialScience}</h1></td>
					<td><h1>${total}</h1></td>
					<td><h1>${percent}</h1></td>
					<td><h1>${large}</h1></td>
					<td><h1>${lowest}</h1></td>
				</tr>
		</tbody>
	</table>
</body>
</html>