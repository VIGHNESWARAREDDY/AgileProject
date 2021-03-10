<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h1>Create Event Details</h1>
<form action="/registration" method="get" modelAttribute="reg">>
Name of Event<input type="text" name="name"><br>
Sports Name  <input type="text" name="sportsname"><br>
Date         <input type="date" name="date"><br>
Time         <input type="time" name="time"><br>
Venue        <input type="text" name="venuename"><br>
No of Slots  <input type="number" name="noofslots"><br>
<input type="submit">
</center>

</form>
</body>
</html>