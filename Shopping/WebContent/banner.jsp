<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center"> Shopping Application</h1>
<div align="center">Best online Application</div>
Hello <%= session.getAttribute("USER") %>
<a href = "login.jsp?logout=yes">Logout</a>
<hr>
</body>
</html>