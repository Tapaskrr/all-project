<%@page import="com.te.springmvcdemo.pojo.Employee"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% String userName= (String)request.getAttribute("name1"); %>
<%--     <% Employee employee=(Employee)request.getAttribute("name1"); %> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- map attribute must be same as request attribute -->
<%-- <h1>welcome <%=request.getAttribute("name1") %>  welcome</h1> --%>
<h1>welcome welcome</h1>

</body>
</html>