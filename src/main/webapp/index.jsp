<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="init.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<%
String role = (String) session.getAttribute("userType");
if("House Owner".equals(role)) {
	request.getRequestDispatcher("owner_home.jsp").forward(request, response);
} else if("House Seeker".equals(role)) {
	request.getRequestDispatcher("seeker_home.jsp").forward(request, response);
}
%>
<div id="main">
 <form action="login" method="post">
<table>

	<div class="error">${message }</div>
	
	<thead>Login</thead>
	<tr>
		<th>User Name</th>
		<td><input type="text" name="userName" id="userName" required="required"/></td>
	</tr>
	<tr>
		<th style="border: 1px solid;">Password</th>
		<td><input  type="password"  name="password" id="password" required="required"/></td>
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