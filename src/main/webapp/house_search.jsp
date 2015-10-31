<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOUSE SEARCH</title>

</head>
<body>
<form>
  <table><thead>HOUSE SEARCH</thead>
    <tr>
      <td>Location </td>
      <td><input type="text" name="textfield"></td>
    </tr>
    <tr>
      <td>House Type </td>
      <td><input type="checkbox" name="checkbox" value="checkbox">
      All
        <input type="checkbox" name="checkbox2" value="checkbox">
      1 BHK
      <input type="checkbox" name="checkbox3" value="checkbox">
      2 BHK 
      <input type="checkbox" name="checkbox4" value="checkbox">
      3 BHK
      <input type="checkbox" name="checkbox5" value="checkbox">
      4 BHK
      <input type="checkbox" name="checkbox6" value="checkbox">
      5 BHK
      <input type="checkbox" name="checkbox7" value="checkbox">
      1 Room</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>
      <button type="submit">Search</button></td>
    </tr>
  </table>
</form>
<form name="form2" method="post" action="">
  <table width="0" border="0" cellspacing="0" cellpadding="0">
    <caption>
      House List
    </caption>
    <tr>
      <td>House Type </td>
      <td>Price</td>
      <td>Detail</td>
    </tr>
    <tr>
      <td>1BHK</td>
      <td>Rs. 6000/-</td>
      <td><a href="house_details.jsp">Details</a></td>
    </tr>
    <tr>
      <td>2BHK</td>
      <td>Rs. 12000/- </td>
      <td><a href="house_details.jsp">Details</a></td>
    </tr>
  </table>
</form>
</body>
</html>