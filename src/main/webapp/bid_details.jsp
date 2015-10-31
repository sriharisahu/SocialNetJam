<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BID DETAILS</title>
</head>
<body>
<form>
  <table><thead>BID SEARCH</thead>
    <tr>
      <td>Bid Price </td>
      <td><input type="text" name="textfield"></td>
    </tr>
    <tr>
      <td>View Count </td>
      <td><input type="text" name="textfield"></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>
      <button type="submit">Search</button></td>
    </tr>
  </table>
</form>
<form>
  <table width="0" border="0" cellspacing="0" cellpadding="0">
    <caption>
      BID DETAILS
    </caption>
    <tr>
      <td>Seeker User Name </td>
      <td>Email</td>
      <td>Phone Number</td>
      <td>Biding Price</td>
      <td>View Count</td>
    </tr>
    <tr>
      <td>Seeker1</td>
      <td>seeker1@grabhouse.com</td>
      <td>4678765467</td>
      <td>Rs. 6000/- </td>
      <td>15</td>
    </tr>
   <tr>
      <td>Seeker2</td>
      <td>seeker2@grabhouse.com</td>
      <td>9678765467</td>
      <td>Rs. 6000/- </td>
      <td>5</td>
    </tr>
  </table>
</form>
</body>
</html>