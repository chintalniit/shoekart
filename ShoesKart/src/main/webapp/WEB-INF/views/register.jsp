<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form:form action="registerUser" commandName="reg">
UserName:<form:input path="username"/>
EmailId:<form:input path="emailId"/>
Password:<form:password path="password"/>
<input type="submit" value="Register">
</form:form>
</body>
</html>