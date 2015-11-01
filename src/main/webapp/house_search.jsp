<%@page import="com.grabhouse.codedesign.beans.House"%>
<%@page import="java.util.List"%>
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
<form method="post" action="houses">
<input type="hidden" name="cmd" value="houseSearch"/>
  <table><thead>HOUSE SEARCH</thead>
    <tr>
      <td>Location </td>
      <td><input type="text" name="location"></td>
    </tr>
    <tr>
      <td>House Type </td>
      <td><input type="checkbox" name="checkbox" value="">
      All
        <input type="checkbox" name="checkbox2" value="1BHM">
      1 BHK
      <input type="checkbox" name="checkbox3" value="2BHM">
      2 BHK 
      <input type="checkbox" name="checkbox4" value="3BHM">
      3 BHK
      <input type="checkbox" name="checkbox5" value="4BHM">
      4 BHK
      <input type="checkbox" name="checkbox6" value="5BHM">
      5 BHK
      <input type="checkbox" name="checkbox7" value="1Room">
      1 Room</td>
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
      <td> Location </td>
      <td>Price</td>
      <td>Detail</td>
    </tr>
    
    <%
 List<House> houseList = (List<House>)request.getAttribute("houseList");

if(houseList != null && houseList.size()>0) {
	for(House house: houseList) {
%>
    <tr>
      <td><%=house.getHouseType() %></td>
      <td><%= house.getLocation() %>
      <td><%=house.getPrice() %></td>
      <td><a href="houses?houseId=<%=house.getHouseId()%>">Details</a></td>
    </tr>
            <%
	}
}
%>
    
  </table>
</form>
</body>
</html>