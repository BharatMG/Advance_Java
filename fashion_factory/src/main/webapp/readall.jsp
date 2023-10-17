<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
</head>
<body>
	<%@include file="Navbar.jsp"%>
	<h1>${success}</h1>
	<h1>${unsuccess}</h1>
	<form action="read" method="get">
		<input type="submit">
	</form>
	<h1 class="text-center">Reading All Data</h1>
	<table class="table table-bordered">
		<tr>
			<th>Id</th>
			<th>customerName</th>
			<th>emailId</th>
			<th>mobileNumber</th>
			<th>address</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${dto}" var="dto">
			<tr>
				<td>${dto.id}</td>
				<td>${dto.customerName}</td>
				<td>${dto.emailId}</td>
				<td>${dto.mobileNumber}</td>
				<td>${dto.address}</td>
				<td><a href="update?id=${dto.id}" class="btn btn-sm btn-primary">update</a> <a href="delete?id=${dto.id}" class="btn btn-sm btn-danger">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>