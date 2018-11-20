package com.demos.oops.constructors;
public class D03ParameterizedConstructor {
	public static void main(String[] args) {
		System.out.println("Welcome!");		
		//Plant 2
		Plant tulsiPlant = null;
		tulsiPlant = new Plant("Holy basil",1.5f,"easy","Magenta");
		tulsiPlant.displayDetails();			
	}
}

