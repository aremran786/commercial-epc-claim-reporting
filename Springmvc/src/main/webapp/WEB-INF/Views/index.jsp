<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>  home page</title>
</head>
<body>
<h4> this is home page</h1>
<h3> called by home  controller</h1>
<h2> url/home</h1>




 <%  
  String name=(String)request.getAttribute("name");
 
 Integer id=(Integer)request.getAttribute("id");
 
 
 List<String> friends= (List<String>) request.getAttribute("f");
   %>
   
   
   
   <%
   for(String s:friends)
   {
	   out.println(s);
   }
   
   
   %>
   
   
   <%
   for(String s:friends){
   %>
   <h1> <%=s %></h1>
   
   <%
   }
   %>
   
   
   
   
   
   
   
   
   
   
   
   
   

 <h1> name is <%=name%></h1>
 <h1>  Id is <%=id %></h1>

</body>
</html>
