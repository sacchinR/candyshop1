<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form:form action="checklogin" modelAttribute="login" method="get">
	Email Id :<form:input path="email"/><br><br>
	Password :<form:input path="password"/><br><br>
	<a href="forget">Forget Password</a><br><br>
	<input type="submit" value="login">

</form:form>


</body>
</html>