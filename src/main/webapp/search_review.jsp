<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REVIEW SEARCH</title>
</head>
<body>
<form>
  <table><thead>REVIEW SEARCH</thead>
    <tr>
      <td>Location </td>
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
      House List
    </caption>
    <tr>
      <td>House Type </td>
      <td>Price</td>
      <td>Location</td>
      <td>Detail</td>
      <td>Bid Detail</td>
    </tr>
    <tr>
      <td>1BHK</td>
      <td>Rs. 6000/-</td>
      <td>Agra</td>
      <td><a href="house_details.jsp">Details</a></td>
      <td><a href="bid_details.jsp">Bid Details</a></td>
    </tr>
    <tr>
      <td>2BHK</td>
      <td>Rs. 12000/- </td>
      <td>HSR Layout</td>
      <td><a href="house_details.jsp">Details</a></td>
      <td><a href="bid_details.jsp">Bid Details</a></td>
    </tr>
  </table>
</form>
</body>
</html>