<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Election-Form</title>
</head>
<body>
<a href="Read.jsp"><h1>readAll</h1></a><hr>


<form action="save" method="post">

<input type="text" name="name" placeholder="name" required="required"><hr>
<input type="tel" name="phoneNumber" placeholder="Phone Number" required="required"><hr>
<input type="number" name="age" placeholder="Age" required="required"><hr>
<input type="text" name="address" placeholder="Address" required="required"><hr>
<input type="number" name="pincode" placeholder="pincode" required="required"><hr>

<input type="submit" value="saving" >

</form>
<h1>Name:${d1.name}</h1>
<h1>phoneNumber:${d1.phoneNumber}</h1>
<h1>age:${d1.age}</h1>
<h1>address:${d1.address}</h1>
<h1>pincode:${d1.pincode}</h1>

</body>
</html>