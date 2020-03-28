
<%@page import="com.cg.bean.ProductBean" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="banner.jsp"/>
<h1>Welcome to Shopping cart</h1>

<% List<ProductBean> cart= (List<ProductBean>)session.getAttribute("CART"); %>
<%double total=0; %>
<table border="2">
<tr>
<th>Code</th><th>Name</th><th>Price</th>
<% for(ProductBean p:cart ) {%>
<tr><td><%=p.getCode() %></td>
<td><%=p.getName() %></td>
<td><%=p.getPrice() %></td>
</tr>
<%total +=p.getPrice(); 
} %>
<tr><td colspan="3">Cart Total:<%=total %></td>
</tr>

</table>
<a href="catalog.jsp">Continue shopping</a>
</body>

</body>
</html>