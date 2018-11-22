<%@ page language="java"%>
<%-- <%@page import="com.techizzobuy.repository.CartDAO,com.techizzobuy.model.Product"%> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edit product</title>
</head>
<body>
	<%@page import="com.techizzobuy.repository.CartDAO"%>
	<%@page import="com.techizzobuy.model.Product"%>
	<%
		Product product = CartDAO.getProduct(request.getParameter("productId"));
	%>
	<form action="cartController" method="post">
		<input type="hidden" name="flag" value="edit" /> <input type="hidden"
			value="<%=product.getProductId()%>" name="productId" />
		<table>

			<tr>
				<td>Product Name :</td>
				<td><select name="name" style="width: 155px">
						<option
							<%if ("Mobile".equals(product.getName().trim())) out.print(" selected");%>>Mobile</option>
						<option
							<%if ("Laptop".equals(product.getName().trim())) out.print(" selected");%>>Laptop</option>
						<option
							<%if ("Smart Tv".equals(product.getName().trim())) out.print(" selected");%>>Smart	Tv</option>
						<option
							<%if ("Fridge".equals(product.getName().trim())) out.print(" selected");%>>Fridge</option>
				</select></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="description"
					value="<%=product.getDescription()%>" /></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"
					value="<%=product.getPrice()%>" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save Product" /></td>
			</tr>
		</table>
	</form>
</body>
</html>