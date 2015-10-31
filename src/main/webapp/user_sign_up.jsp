<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
  <table >
    <tr>
      <td>Name</td>
      <td><input type="text" name="name"></td>
    </tr>
    <tr>
      <td>User Name </td>
      <td><input type="text" name="textfield2"></td>
    </tr>
    <tr>
      <td>Name</td>
      <td><input type="text" name="textfield3"></td>
    </tr>
    <tr>
      <td>Email</td>
      <td><input type="text" name="textfield4"></td>
    </tr>
    <tr>
      <td>Phone</td>
      <td><input type="text" name="textfield5"></td>
    </tr>
     <tr>
      <td>User Type</td>
      <td><select name="userType" id="userType"><option value="House Seeker">House Seeker</option><option value="House Owner">House Owner</option></select></td>
    </tr>
	 <tr>
      <td>&nbsp;</td>
      <td><button  type="submit" >SignUp</button></td>
	 </tr>
  </table>
</form>
</body>
</html>