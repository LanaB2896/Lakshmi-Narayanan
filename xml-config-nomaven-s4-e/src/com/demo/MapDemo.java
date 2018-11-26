package com.demo;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map testMap = new HashMap<>();
	testMap.put("customer", new Customer());
	testMap.put("product", new Product());
	
	Customer customer = (Customer)testMap.get("customer");
	System.out.println(customer.name);
	
	Product product = (Product)testMap.get("product");
	System.out.println(product.name);
}
}
class Customer{
	public String name = "Balaji";
}
class Product{
	public String name = "Pizza";
}
