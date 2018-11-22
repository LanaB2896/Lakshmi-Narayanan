<%-- The directive tag <%@ %> --%>
<%@page import="com.techizzobuy.repository.CartDAO"%>
<%@page import="com.techizzobuy.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Cart</title>
</head>
<body>
<% List <Product> productList  = CartDAO.getProducts(); %>
<table>
    <thead>
        <tr>
            <th>Product Id</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
        </tr>
    </thead>
    <tbody>
        <% for(int ctr=0; ctr<productList.size();ctr++) {
        Product product = productList.get(ctr);
        %>
	
        <tr>
            <td><%= product.getProductId() %></td>
            <td><%= product.getName() %></td>
            <td><%= product.getDescription() %></td>
            <td><%= product.getPrice() %></td>
            <td><a href="editProduct.jsp?productId=<%= product.getProductId()%>">Edit</a></td>
            <td><a href="cartController?flag=delete&productId=<%= product.getProductId()%>">Delete</a></td>
        </tr>
        <% } %>
    </tbody>
</table>
</body>
</html>