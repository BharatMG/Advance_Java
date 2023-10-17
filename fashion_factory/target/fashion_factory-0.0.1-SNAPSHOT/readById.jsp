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
	<form action="readById" method="get" >
	<input type="search" name="id">
		<input type="submit">

	<h1 class="text-center">Read By Id</h1>
	<table class="table table-bordered">
		<tr>
			<th>Id</th>
			<th>customerName</th>
			<th>emailId</th>
			<th>mobileNumber</th>
			<th>address</th>
			<th>Action</th>
		</tr>
			<tr>
				<td>${dto.id}</td>
				<td>${dto.customerName}</td>
				<td>${dto.emailId}</td>
				<td>${dto.mobileNumber}</td>
				<td>${dto.address}</td>
				<td><a href="update?id=${dto.id}" class="btn btn-sm btn-primary">update</a> 
				<a href="delete?id=${dto.id}" class="btn btn-sm btn-danger">delete</a></td>
			</tr>
	</table>
	</form>
</body>
</html>