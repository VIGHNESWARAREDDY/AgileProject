<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Event Details </h1>
<form:form action="/registration" method="get" modelAttribute="reg">
	<table>
				<tr>
					<td>Name Of Event:</td>
					<td><form:input path="nameOfEvent" id="nameOfEvent" /></td>
					<td><form:errors path="nameOfEvent" /></td>
				</tr>
				<tr>
					<td>Sport Name</td>
					<td><form:input path="sportName" id="sportName" /></td>
					<td><form:errors path="sportName" /></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><form:input path="date" id="date" /></td>
					<td><form:errors path="date" /></td>
				</tr>
				<tr>
					<td>Time</td>
					<td><form:input path="time" id="time" /></td>
					<td><form:errors path="time" /></td>
				</tr>
				<tr>
					<td><form:input path="venue" id="venue" /></td>
					<td><form:errors path="venue" /></td>
				</tr>
				<tr>
					<td><form:input path="text" id="NoOfSlots" /></td>
					<td><form:errors path="NoOfSlots" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register" name="submit" /></td>
					<td><input type="reset" value="Cancel" /></td>
				</tr>
			</table>
</form:form>
</body>
</html>