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
<form enctype="multipart/form-data">
<table width="0" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>Locaiton Name </td>
    <td><input type="text" name="textfield"/></td>
  </tr>
  <tr>
    <td>LocationX</td>
    <td>LocatioY</td>
  </tr>
  <tr>
    <td>Price</td>
    <td><input type="text" name="textfield2"/></td>
  </tr>
  <tr>
    <td>Description</td>
    <td><input type="text" name="textfield3"/></td>
  </tr>
  <tr>
    <td>Photo</td>
    <td><input type="file" name="file"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><button  type="submit">Submit</button></td>
  </tr>
</table>
</form>
</body>
</html>