<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirConditioner</title>
</head>
<body>

	<form action="getDTO" method="get">
		<input type="submit">
		<hr>
<!-- 		<table>
			<tbody>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Location</th>
					<th>NoOFStudents</th>
					<th>NoOfStaffs</th>
				</tr> -->
					<c:forEach items="${airDto}" var="item">
					<ul>${item}</ul>
<%-- 						<tr>
							<td>${airDto.id}</td>
							<td>${airDto.name}</td>
							<td>${airDto.location}</td>
							<td>${airDto.noOfStudents}</td>
							<td>${airDto.noOfStaffs}</td>
							</tr>
							
					</c:forEach>
					
					</tbody>
					</table> --%>
					</c:forEach>
	</form>
</body>
</html>