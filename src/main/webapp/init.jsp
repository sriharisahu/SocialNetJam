<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/open_house.css" media="screen" />
</head>
<body>
<div><a href="${pageContext.request.contextPath }"><h1>SocialJam</h1></a></div>
<% if(session.getAttribute("userName")!=null){ %>
<div style="float:right; margin-right:20px; display:inline-block;"><span>Welcome ${userName }</span><a href="logout"><h2>Logout</h2></a></div>
<%} %>

</body>
</html>