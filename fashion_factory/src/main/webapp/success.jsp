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
<%-- <h2>${msg.interpolatedMessage}</h2> --%>



<h1>Registration completed........</h1>
	<table class="table table-bordered">
		<tr>
			<th>customerName</th>
			<th>emailId</th>
			<th>mobileNumber</th>
			<th>address</th>
		</tr>
		<tr>	
			<td>${dto.customerName}</td>
			<td>${dto.emailId}</td>
			<td>${dto.mobileNumber}</td>
			<td>${dto.address}</td>
		</tr>
	</table>
</body>
</html>