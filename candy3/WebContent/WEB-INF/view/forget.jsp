<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forget Password</title>
</head>
<body>

 <form:form action="change" modelAttribute="forget" method="get">
	Email Id :<form:input path="email"/><br><br>
	New Password :<form:input path="password"/><br><br>
	<form:hidden path="username"/>
	<form:hidden path="phone"/>
	<input type="submit" value="Reset">

</form:form>




</body>
</html>