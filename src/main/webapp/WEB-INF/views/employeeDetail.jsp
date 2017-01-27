<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee</title>
</head>
<body>
<center style="margin-top: 150px">
	<form action="../employees/${employee.id}" method="post">
	<table>
		<tr>
			<td>Firstname:</td>
			<td><input type="text" name="firstName" value="${employee.firstName}"/> </td>
		</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="lastname" value="${employee.lastname}"/> </td>
		</tr>
		<tr>
			<td>Salary:</td>
			<td><input type="text" name="salary" value="${employee.salary}"/> </td>
		</tr>
	</table>
	<input type="submit" value="update"/></form><form action="delete?employeeId=${employee.id}" method="post">
		<button type="submit">Delete</button>
	</form>
	
	</center">
</body>
</html>