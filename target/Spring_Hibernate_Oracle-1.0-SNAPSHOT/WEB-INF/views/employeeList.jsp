<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees in the Company</title>
</head>
<body>
<center style="margin-top: 150px">
	<h1>Employees in the Company</h1>
	<table>
		<tr>
			<td>id</td><td>First Name</td> <td>Last Name</td> <td>Salary</td>
		</tr>
	<c:forEach var="employee" items="${employees}">
	<tr>
		<td>${employee.id}</td>
		<td>${employee.firstName}</td>
		<td>${employee.lastname}</td>
		<td>${employee.salary}</td>
		<td><a href="employees/${employee.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>

	<spring:url var="homeUrl" htmlEscape="true" value="/"/>

	<a href="${homeUrl}addEmployee"> Add Employee</a>

	<a href="${homeUrl}testedi"> Test EDI</a>
	
	</center>
</body>
</html>