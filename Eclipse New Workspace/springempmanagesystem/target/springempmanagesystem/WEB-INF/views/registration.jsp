<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
String msg = (String) request.getAttribute("msg");
%>
<%
String errmsg = (String) request.getAttribute("errmsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	if (msg != null) {
	%>
	<%=msg%>
	<%
	}
	%>
	
	<% if(errmsg!=null){
	%>
	<%=errmsg %>
	<%
	}
	%>
	




	<fieldset>
		<legend>create your account</legend>
		<form action="./dataregister" method="post">
			<table>
				<tr>
					<td>enter your name:</td>
					<td><input type="text" name="empName">
				</tr>

				<tr>
					<td>enter your password</td>
					<td><input type="text" name="empPwd">
				</tr>
			</table>
			<br> <input type="submit" value="submitform">
		</form>
		<br>

	</fieldset>

	<h4>
		have account,plz <a href="./login">login</a>
	</h4>
</body>
</html>