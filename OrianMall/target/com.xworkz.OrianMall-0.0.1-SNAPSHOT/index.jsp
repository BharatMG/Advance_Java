<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orian Mall</title>
</head>
<body>
	<form action="pricebill" method="post">
		<div>
			<input type="text" name="productName" placeholder="User Name"
				required="required"> '
		</div>
		<div>
			<input type="text" name="rating" placeholder="rating"
				required="required">
		</div>
		<div>
			<input type="number" name="price" placeholder="Price "
				required="required">
		</div>
		<div>
			<input type="number" name="quantity" placeholder="quantity "
				required="required">
		</div>
		<div>
			<input type="text" name="reviews" placeholder="reviews"
				required="required">
		</div>

		<input type="submit" value="totalPrice">
		<hr>
	</form>
			<h1>productName:${productName}</h1>
			<h1>rating:${rating}</h1>
			<h1>price:${price}</h1>
			<h1>quantity:${quantity}</h1>
			<h1>reviews:${reviews}</h1>

</body>
</html>