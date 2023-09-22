<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width-device-width, initial-scale=1">
<title>College</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
   
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="read.jsp">read</a>
				</li>
			</ul>
		</div>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
</nav>
<body>

	<h2>College details</h2>
	<form action="click" method="post">
		<div>
			<input type="text" name="name" placeholder="Enter Name">
		</div>
		<div>
			<input type="text" name="location" placeholder="Enter location">
		</div>
		<div>
			<input type="tel" name="noOfStudents"
				placeholder="Enter noOfStudents">
		</div>
		<div>
			<input type="tel" name="noOfStaffs" placeholder="Enter noOfStaffs">
		</div>
		<input type="submit" value="inserting the data">
	</form>
	<hr>
	<%-- <form action="read" method="get">
		<input type="submit" value="Fetch the details">
		<ul>
			<c:forEach items="${d}" var="res">
				<table border="10" text-all>
					<tbody>
						<th>Id</th>
						<th>Name</th>
						<th>Location</th>
						<th>NoOFStudents</th>
						<th>NoOfStaffs</th>

						<tr>
							<td>${res.id}</td>
							<td>${res.name}</td>
							<td>${res.location}</td>
							<td>${res.noOfStudents}</td>
							<td>${res.noOfStaffs}</td>
						</tr>
					</tbody>
				</table>
			</c:forEach>
		</ul>

	</form>
 --%>
 
 </body>
</html>