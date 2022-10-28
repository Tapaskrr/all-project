<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<%
String errmsg = (String) request.getAttribute("errmsg");
%>

<%
if (msg != null) {
%>
<%=msg%>
<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>login successfull</h3>
</body>
</html>