<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </head>
<body>
	<%@include file="Navbar.jsp"%>

	<div class="container p-4" style="color: blue;">
		<div class="col-md-6 offset-md-3 card card-body">
			<h1>Registration-Form</h1>
			<form action="save" method="post" class="row g-3">

				<div class="col-md-6">
				<c:forEach items="${validator}" var="e">
					<h6>${e.message}</h6>
				</c:forEach>
					<br> <input type="text" name="customerName" placeholder="enter customerName" required="required">
				</div>
				<div class="col-md-6">
					<br> <input type="email" name="emailId" placeholder="enter  emailId" required="required">
				</div>
				<div class="col-md-6">
					<br> <input type="tel" name="mobileNumber" placeholder="enter mobileNumber" required="required">
				</div>
				<div class="col-md-6">
				<c:forEach items="${validator}" var="er">
					<h6>${er.message}</h6>
				</c:forEach>
					<br> <input type="text" name="address" placeholder="enter address" required="required">			
				</div>
				<div>
					<input type="submit" class="btn btn-success col-md-4"> <input type="reset" class="btn btn-dark col-md-4">
					<!-- <a class="nav-link" input type="submit" href="index.jsp">cancel</a> -->
				</div>

			</form>
		</div>
	</div>
</body>
</html>