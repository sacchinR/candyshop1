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

 <form:form action="storeuser" modelAttribute="reg" method="get">
	User Name:<form:input path="username"/><br><br>
	Email Id :<form:input path="email"/><br><br>
	Phone No :<form:input path="phone"/><br><br>
	Password :<form:input path="password"/><br>
	<input type="submit" value="Reg">

</form:form>


</body>
</html>