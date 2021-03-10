<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login page for Sports</h2>
<form:form action="/login" method="post" modelAttribute="log">
 NameOfEvent:
        <form:input path="NameOfEvent" placeholder="Enter the NameOfEvent " id="NameOfEvent"/>
        <form:errors path="NameOfEvent" style="color:red"></form:errors>
       SportName:
        <form:input path="SportName" placeholder="Enter the SportName" id="SportName"/>
        <form:errors path="SportName" style="color:red"></form:errors>
        
        Date:
         <form:input path=" Date" placeholder="Enter the Date" id=" Date"/>
        <form:errors path=" Date" style="color:red"></form:errors>
        Time:
        <form:input path=" Time" placeholder="Enter the Time" id=" Time"/>
        <form:errors path="Time" style="color:red"></form:errors>
        Venue:
         <form:input path=" Venue" placeholder="Enter the Venue" id=" Venue"/>
        <form:errors path=" Venue" style="color:red"></form:errors>
        NoOfSlots:
          <form:input path=" NoOfSlots" placeholder="Enter the NoOfSlots" id=" NoOfSlots"/>
        <form:errors path=" NoOfSlots" style="color:red"></form:errors>
          <input type="submit" value="Login"/>
          </form:form>

</body>
</html>