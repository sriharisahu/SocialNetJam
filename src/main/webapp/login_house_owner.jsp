<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>House Owner Login</title>
</head>
<body>
<div id="main">
 <form action="user_success.jsp">
<table>
	<thead>House Owner Login</thead>
	<tr>
		<th>User Name</th>
		<td><input type="text" name="userName" id="userName"/></td>
	</tr>
	<tr>
		<th>User Name</th>
		<td><input type="text" name="userName" id="userName"/></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td class="forgot-password"><a href="forgot_password.jsp">Forgot Password</a></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><a class="button" href="user_sign_up.jsp">SignUp</a>&nbsp;<button  type="submit">SignIn</button></td>
	</tr>
</table>
</form>
</div>
</body>
</html>