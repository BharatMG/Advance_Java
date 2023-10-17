<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>


	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">

					<li class="nav-item"><a class="nav-link active" aria-current="page" href="Register.jsp">Registration</a></li>
				</ul>

				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="readall.jsp">ReadAll</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="readById.jsp">ReadById</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="readByEmail.jsp">ReadByEmail</a></li>
				</ul>

			</div>
			<nav class="navbar bg-body-tertiary">
				<div class="container-fluid">
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</nav>
		</div>
	</nav>


</body>
</html>