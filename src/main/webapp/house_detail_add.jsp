<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>House Detail Add</title>
</head>
<body>
<!-- form enctype="multipart/form-data" method="post" action="houses" -->
<form method="post" action="houses">
<div class="error">${ message }</div>
<table width="0" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>Location Name </td>
    <td><input type="text" name="location"/></td>
  </tr>
  <!-- tr>
    <td>LocationX</td>
    <td>LocatioY</td>
  </tr-->
  <tr>
  	<td>House Type</td>
  	<td><select name="houseType">
  		<option value="1BHK">1 BHK</option>
  		<option value="2BHK">2 BHK</option>
  		<option value="3BHK">3 BHK</option>
  		<option value="4BHK">4 BHK</option>
  		<option value="5BHK">5 BHK</option>
  		<option value="1Room">1 Room</option>
  	</select></td>
  </tr>
  <tr>
    <td>Price</td>
    <td><input type="tel" name="price"/></td>
  </tr>
  <tr>
    <td>Description</td>
    <td><input type="text" name="description"/></td>
  </tr>
  <tr>
    <td>Photo</td>
    <td><input type="file" name="photo"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><button  type="submit">Submit</button></td>
  </tr>
</table>
</form>
</body>
</html>