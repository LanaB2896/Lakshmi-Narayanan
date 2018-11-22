package com.techizzobuy.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techizzobuy.model.Product;
import com.techizzobuy.repository.CartDAO;

@WebServlet("/cartController")
public class CartController extends HttpServlet {
	PrintWriter out = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("delete:doGet");
		out = response.getWriter();
		//out.println("<html><body>");
//		if ("delete".equals(request.getParameter("flag"))) {
			int rowsDeleted = CartDAO.deleteProduct(request.getParameter("productId"));
			if (rowsDeleted > 0) {
				out.println("DELETED PRODUCT SUCCESSFULLY!");
				response.sendRedirect("viewCart.jsp");
			} else {
				out.println("FAILED DELETING PRODUCT!");
			}
//		}
		
//		out.println("<a href='addProduct.html'>Add Product</a>");
//		out.println("<a href='viewCart.jsp'>View Cart</a>");
//		out.println("</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		out = response.getWriter();
		out.println("<html><body>");
		System.out.println("CartController:doPost");
		// Fetch the parameters and store in the Db.
		if (request.getParameter("flag").equals("save")) {
			String name = request.getParameter("name");
			String description = request.getParameter("description");
			String price = request.getParameter("price");
			int rowsInserted = CartDAO.saveProduct(new Product(null, name, description, Float.parseFloat(price)));
			if (rowsInserted > 0) {
				out.println("PRODUCT ADDED SUCCESSFULLY!");
				// out.println("<a href='viewPlants.jsp'>View Plants</a>");
			} else {
				out.println("FAILED ADDING PRODUCT!");
			}
		}
		if (request.getParameter("flag").equals("edit")) {
			String productId = request.getParameter("productId");
			String name = request.getParameter("name");
			String description = request.getParameter("description");
			String price = request.getParameter("price");
			int rowsUpdated = CartDAO.updateProduct(new Product(productId, name, description, Float.parseFloat(price)));
			if (rowsUpdated > 0) {
				out.println("PRODUCT UPDATED SUCCESSFULLY!");
				response.sendRedirect("viewCart.jsp");
			} else {
				out.println("FAILED UPDATING PRODUCT!");
			}
		}
		out.println("<a href='addProduct.html'>Add Product</a>");
		out.println("<a href='viewCart.jsp'>View Cart</a>");
		out.println("</body></html>");
	}
}
