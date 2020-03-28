<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  if(request.getParameter("logout")!=null){session.invalidate();} %>
<!--  content of page to another static include-->
<%@ include file="banner.html" %>
<form  action="User.pn">
		<table border="2">
			<tr>
				<td>UserID:</td>
				<td><input type="number" name="userid"></td>
			</tr>

			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<td><button type="submit" name="login">Login</button></td>
			</tr>

		</table>

	</form>
</body>
</html>