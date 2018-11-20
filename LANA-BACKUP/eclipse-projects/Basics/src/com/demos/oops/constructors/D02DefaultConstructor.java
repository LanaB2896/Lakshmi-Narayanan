package com.demos.oops.constructors;
public class D02DefaultConstructor {
	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		//Plant 1
		Plant plant = null;
		plant = new Plant();

		System.out.println(plant.commonName);
		System.out.println(plant.height);
		System.out.println(plant.difficulty);
		System.out.println(plant.color);	
				
	}
}

