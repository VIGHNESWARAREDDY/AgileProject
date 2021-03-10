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
<center>
<h2>Organizer Registration Page</h2><br><br>
<form:form action="/registration" method="get" modelAttribute="reg">
First Name: <form:input path="FirstName" placeholder="Enter Your FirstName" id="FirstName" minlength="4" maxlength="50"/>
<form:errors path="FirstName" style="color:red"></form:errors>
Last Name: <form:input path="LastName" placeholder="Enter Your LastName" id="LastName" minlength="4" maxlength="50"/>
<form:errors path="LastName" style="color:red"></form:errors>
Gender: <form:radiobutton path="Gender" value="Male"/>Male
        <form:radiobutton path="Gender" value="Female"/>Female
Contact Number: 
        <form:input path="ContactNumber" placeholder="Enter the contact number" id="ContactNumber"/>
        <form:errors path="ContactNumber" style="color:red"></form:errors>
        User Id:
        <form:input path="UserId" placeholder="Enter the UserId" id="UserId"/>
        <form:errors path="UserId" style="color:red"></form:errors>
        Password: 
        <form:input path="Password" placeholder="Enter the Password" id="Password"/>
        <form:errors path="Password" style="color:red"></form:errors>
<input type="submit" value="Register"/>
</form:form>
</center>
</body>
</html>