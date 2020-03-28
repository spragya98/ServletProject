<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="banner.html" %>

<form action="User.pn">
		<table border="2">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" placeholder="Enter name" pattern="[a-zA-z]{2,)" required></td>
			</tr>

			<tr>
				<td>UserId:</td>
				<td><input type="number" name="userid" placeholder="Enter userId" pattern="[0-9]{2,)" required></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" placeholder="Enter password" pattern="[a-zA-z0-9]{3,)"></td>
			</tr>
			
			<tr>
				<td>City:</td>
				<td><% String[] cts={"Mumbai","Pune","Nashik","Goa"}; %>
				<select name="city">
					<% for(String ct:cts) { %>
						<option value="<%=ct%>" > <%=ct%>
					<% } %>
				</select>
				</td>
				
			</tr>
			
			<tr>
				<td>Mobile:</td>
				<td><input type="number" name="mobile" placeholder="Enter mobile no" pattern="[0-9]{10)" required></td>
			</tr>
			
			<tr>
				<td>Email Id:</td>
				<td><input type="text" name="email" placeholder="Enter EmailId" pattern="[0-9]{2,)" required></td>
			</tr>

			<tr>
				<td><button type="submit" name="register">Register</button></td>
			</tr>

		</table>

	</form>

</body>
</html>