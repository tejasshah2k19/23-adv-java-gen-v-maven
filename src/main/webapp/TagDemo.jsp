<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int x=10;
	%>
	<%
		if(x % 10 ==0){
			out.print("X is EVEN");
		}
	%>
	<br>
	<c:set var="a" value="10" ></c:set>

	<c:if test="${a%2==0}">
		A is EVEN 
	</c:if>


	<br>
	${a}
</body>
</html>