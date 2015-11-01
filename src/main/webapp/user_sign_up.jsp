<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User sign up form</title>
</head>
<body>

<form method="post" action="user">
<div class="error">${message }</div>
  <table >

    <tr>
      <td>User Name </td>
      <td><input type="text" name="userName"></td>
    </tr>
    <tr>
          <td>Password</td>
          <td><input type="password" name="password"></td>
        </tr>
    <tr>
      <td>Name</td>
      <td><input type="text" name="name"></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="email" name="emailId"></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><input type="text" name="phone"></td>
    </tr>
     <tr>
      <td>User Type</td>
      <td><select name="userType" id="userType"><option value="House Seeker">House Seeker</option><option value="House Owner">House Owner</option></select></td>
    </tr>
	 <tr>
      <td>&nbsp;</td>
      <td><button  type="reset" >Reset</button><button  type="submit" >SignUp</button></td>
	 </tr>
  </table>
</form>
</body>
</html>