<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="Navbar.jsp"%>
	<h1>${message}</h1>
	<h1>Update-Form</h1>
	<form action="update" method="post">

		<div class="mb-3">
			<br> <input type="number" name="id" placeholder="enter id" readonly value="${dto.id}" required="required">
		</div>

		<div class="mb-3">
			<br> <input type="text" name="customerName" placeholder="enter customerName" value="${dto.customerName}" required="required">
		</div>
		<div class="mb-3">
			<br> <input type="email" name="emailId" placeholder="enter  emailId" value="${dto.emailId}" required="required">
		</div>
		<div class="mb-3">
			<br> <input type="tel" name="mobileNumber" placeholder="enter mobileNumber" value="${dto.mobileNumber}" required="required">
		</div>
		<div class="mb-3">
			<br> <input type="text" name="address" placeholder="enter address" value="${dto.address}" required="required">
		</div>
		<div>
			<input type="submit" class="btn btn-success"> <input type="reset" class="btn btn-dark"> <a class="nav-link" input type="button" href="index.jsp">cancel</a>
		</div>
	</form>
</body>
</html>