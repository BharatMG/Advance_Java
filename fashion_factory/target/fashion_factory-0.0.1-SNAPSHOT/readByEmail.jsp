<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="Navbar.jsp"%>
	<form action="readByEmail" method="get">
		<div class="text-center">
			<input type="search" placeholder="search" name="emailId">
		</div>
		<div>
			<input type="submit">
		</div>
	</form>
	<h1 class="text-center">Search by Email</h1>
	<table class="table table-bordered">
		<tbody>
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
					<td><a href="update?id=${dto.id}" class="btn btn-sm btn-primary">update</a> <a href="delete/${dto.id}" class="btn btn-sm btn-danger">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>