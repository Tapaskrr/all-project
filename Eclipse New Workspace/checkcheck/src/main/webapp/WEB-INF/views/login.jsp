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
	<fieldset>
		<legend>Login</legend>

		<form action="./loginPage" method="post">

			<h5>
				enter email Id or employee Id : <input type="text" name="empId">
			</h5>


			<h5>
				enter email Id or employee Id : <input type="text" name="empPwd">
			</h5>


			<h5>
				<input type="submit" name="userSubmit">
			</h5>




		</form>



	</fieldset>
</body>
</html>