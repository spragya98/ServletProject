<%@page import="com.cg.service.ShoppingServiceImpl" %>
<%@page import="com.cg.service.ShoppingService" %>
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
<!-- Dynamic include -->
<jsp:include page="banner.jsp"/>
<h1>Welcome to Product Catalog</h1>

<%! ShoppingService service = new ShoppingServiceImpl(); %>
<% List<ProductBean>catalog=service.getCatalog(); %>
<table border="2">
<tr>
<th>Code</th><th>Name</th><th>Price</th>
<% for(ProductBean p:catalog) {%>
<tr><td><a href="Shopping.pn?code=<%=p.getCode() %>">Add to cart</a></td>
<td><%=p.getName() %></td>
<td><%=p.getPrice() %></td>
</tr>
<%} %>

</table>
</body>
</html>
<!-- 

 -->