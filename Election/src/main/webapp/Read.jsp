<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read</title>
<style>
table,th,td{
    text-align:center;
    color:brown;
}
</style>
</head>
<body style="text-align:center;">

	<h1>Data Saved SuccessFully</h1>
	<div style="text-align:center;">
	<form action="read" method="get">

		<input type="submit">
	</form>
	<table border="5";style="text-align:center;">
		<tbody>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>phoneNumber</th>
				<th>age</th>
				<th>address</th>
				<th>pincode</th>
			</tr>
			<c:forEach items="${d}" var="res">
				<tr>
					<td>${res.id}</td>
					<td>${res.name}</td>
					<td>${res.phoneNumber}</td>
					<td>${res.age}</td>
					<td>${res.address}</td>
					<td>${res.pincode}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>