package com.techizzobuy.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techizzobuy.model.Product;

public class CartDAO {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

	public static int saveProduct(Product product) {
		int noOfRowsInserted = 0;
		try {
			Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into cart values(?,?,?,?)");

			preparedStatement.setString(1, autoGenerateId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getDescription());
			preparedStatement.setFloat(4, product.getPrice());
			noOfRowsInserted = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERR : saving product" + e);
		}
		return noOfRowsInserted;
	}

	public static Product getProduct(String productId) {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from cart where product_id = '" + productId + "'");
			while (resultSet.next()) {
				productId = resultSet.getString("PRODUCT_ID");
				String name = resultSet.getString("PRODUCT_NAME");
				String description = resultSet.getString("PRODUCT_DESCRIPTION");
				Float price = Float.parseFloat(resultSet.getString("PRICE"));
				return new Product(productId, name, description, price);
			}
		} catch (Exception e) {
			System.out.println("Err getProduct(String productId):  " + e);
		}
		return null;
	}

	
	public static List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();
		try {

			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from cart order by product_id");
			while (resultSet.next()) {
				String productId = resultSet.getString("PRODUCT_ID");
				String name = resultSet.getString("PRODUCT_NAME");
				String description = resultSet.getString("PRODUCT_DESCRIPTION");
				Float price = Float.parseFloat(resultSet.getString("PRICE"));
				productList.add(new Product(productId, name, description, price));
			}
		} catch (Exception e) {
			System.out.println("Err getProducts():  " + e);
		}
		System.out.println("Product List : " + productList);
		return productList;
	}

	public static String autoGenerateId() {
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select max(product_id) from cart");
			resultSet.next();
			if (resultSet.getString(1) == null) {
				return "P001";
			} else {
				String productId = String.valueOf(Integer.parseInt(resultSet.getString(1).substring(1, 4)) + 1);
				// itemId = ((Integer)(Integer.parseInt(itemId.substring(1, 4)) +
				// 1)).toString();
				if (productId.length() == 1) {
					productId = "P00" + productId;
				} else if (productId.length() == 2) {
					productId = "P0" + productId;
				} else if (productId.length() == 3) {
					productId = "P" + productId;
				}
				System.out.println("autoGenerateId : " + productId);
				return productId;

			}
		} catch (Exception e) {
			System.out.println("ERR : saving product" + e);
		}
		return null;
	}

	public static int deleteProduct(String productId) {
		int recordsAffected = 0;
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			String deleteQuery = "delete from cart where product_id ='" + productId + "'";
			System.out.println("deleteProduct(String productId) : " + deleteQuery);
			recordsAffected = statement.executeUpdate(deleteQuery);
		} catch (Exception e) {
			System.out.println("ERROR DELETING PRODUCT : " + e);
		}

		return recordsAffected;
	}

	public static int updateProduct(Product product) {
		int recordsAffected = 0;
		try {
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			String updateQuery = "update cart set PRODUCT_NAME = '"
					+ product.getName()+ "', PRODUCT_DESCRIPTION='"
					+ product.getDescription()+ "',PRICE="
					+ product.getPrice()
					 + "where product_id ='" + product.getProductId() + "'";
			System.out.println("updateProduct(Product product) : " + updateQuery);
			recordsAffected = statement.executeUpdate(updateQuery);
		} catch (Exception e) {
			System.out.println("ERROR UPDATING PRODUCT : " + e);
		}
		return recordsAffected;
	}
}
