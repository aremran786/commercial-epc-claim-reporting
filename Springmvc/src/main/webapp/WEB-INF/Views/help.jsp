<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modeland views</title>
</head>
<body>
<h1> first videos in the odel and view</h1>



<%
String name=(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber");

LocalDateTime time=(LocalDateTime)request.getAttribute("time");


%>
<h1> very name is <%=name %></h1>
<h1>   rollnumber is <%=rollnumber %></h1>
<h1>date time is <%=time.toString()%></h1>

</body>
</html>