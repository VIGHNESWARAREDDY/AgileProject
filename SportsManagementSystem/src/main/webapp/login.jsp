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
<h2>Login Page for Organizer</h2>
<form:form action="/login" method="post" modelAttribute="log">
 User Id:
        <form:input path="UserId" placeholder="Enter the UserId" id="UserId"/>
        <form:errors path="UserId" style="color:red"></form:errors>
        Password: 
        <form:input path="Password" placeholder="Enter the Password" id="Password"/>
        <form:errors path="Password" style="color:red"></form:errors>
        <input type="submit" value="Login"/>
        
</form:form>
</body>
</html>