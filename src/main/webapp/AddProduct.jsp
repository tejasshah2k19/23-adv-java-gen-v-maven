<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 
	<form action="SaveProductServlet" method="post">
		Name : <input type="text" name="name" value="${nameValue}" /> ${nameError} <br>
		<Br> Price :<input type="text" name="price" /><Br>
		<br> Category : <input type="text" name="category" /><br>
		<Br> Qty : <input type="text" name="qty" value="${qtyValue}" />${qtyError}<br>
		<br> <input type="submit" value="Save Product" />

	</form>

</body>
</html>