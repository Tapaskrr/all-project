<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String errmsg = (String) request.getAttribute("errmsg");
%>
<%
String msg = (String) request.getAttribute("msg");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (errmsg != null) {
	%>
	<%=errmsg%>
	<%
	}
	%>
	<%
	if (msg != null) {
		out.print(msg);
	}
	%>
</body>
</html>