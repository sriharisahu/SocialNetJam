<%@page import="com.grabhouse.codedesign.beans.House"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="init.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOUSE DETAILS</title>
</head>
<body>
<form>
  <table width="800"><thead>HOUSE DETAILS</thead>
    <tr>
      <th>Location Map</th>
      <td><iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.606443573004!2d77.60889981435335!3d12.93299741922459!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae145264029109%3A0x180f6f4303fa85b8!2sUMIYA+Emporium%2C+Hosur+Main+Rd%2C+Kaveri+Layout%2C+Sadduguntepalya%2C+Bengaluru%2C+Karnataka+560029!5e0!3m2!1sen!2sin!4v1446327887760" width="500" height="250" frameborder="0" style="border:0" allowfullscreen></iframe></td>
    </tr>
    <tr>
      <th>Location </th>
      <td>${ house.location }</td>
    </tr>
    <tr>
      <th>House Type </th>
      <td>${ house.houseType }</td>
    </tr>
    <tr>
      <th>Price</th>
      <td>${ house.price }</td>
    </tr>
    <tr>
      <th>Description</th>
      <td>${ house.description }</td>
    </tr>
    <tr>
      <th>Bidding</th>
      <td><input type="text" name="textfield"></td>
    </tr>
    

    <tr>
      <td>&nbsp;</td>
      <td><div align="right"><button type="submit">Submit Bid</button></div></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><div align="right"><a href="user?userName=${ house.userName }&houseId=${ house.houseId }">Contact Detail</a></div></td>
    </tr>
  </table>
</form>



<form>
  
    <table>
      <tr>
        <th valign="top"">Reviews</th>      
        <td> 
			<table>
			  <tr>
				<td colspan="4">This is the user review description</td>
			  </tr>
			  <tr>
				<th>User Id: </th><td>User1 </td><th>Date</th><td>01 Nov 2015 </td>			  
			  </tr>
			  <tr>
				<td colspan="4">This is insanely high rated.</td>
			  </tr>
			  <tr>
				<th>User Id: </th><td>User31 </td><th>Date</th><td>101 Nov 2015 </td>			  
			  </tr>
			</table>
		</td>
      </tr>
    </table>   
</form>

</body>
</html>