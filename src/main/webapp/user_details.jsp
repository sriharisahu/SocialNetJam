<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER DETAILS</title>
</head>
<body>
<div id="main">
 <form>
<table>
	<thead>USER DETAILS</thead>
	<tr>
		<th>User Name</th>
		<td>${ user.name }</td>
	</tr>
	<tr>
		<th>User Email</th>
		<td>${ user.emailId }</td>
	</tr>
	<tr>
		<th>Phone No</th>
		<td>${ user.phoneNumber }</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><a class="button" href="houses?houseId=${houseId }">Back</a></td>
	</tr>
</table>
</form>
</div>
</body>
</html>