<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="a" value="10"></c:set>

	<c:out value="${a}"></c:out>
	<br>
	<c:if test="${a==10}">
		A ==  10 
	</c:if>

	<c:if test="${a!=10}">
		A  !=  10 
	</c:if>
	<br>

	<%-- 	<c:remove var="a"/>
 --%>

	<c:forEach var="i" begin="1" end="10" step="1"> 
		${i}
	</c:forEach>

	<c:if test="${a gt 13 }">
		<c:redirect url="http://www.google.com"></c:redirect>
	</c:if>




</body>
</html>