package com.demos.oops.constructors;
public class D01CreatingTwoObjects {
	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		//Plant 1
		Plant moneyPlant = null;
		moneyPlant = new Plant();
		moneyPlant.commonName = "Devil's vine";
		moneyPlant.height = 20f;
		moneyPlant.difficulty = "easy";
		moneyPlant.color = "Greenish-colored spathe";

		System.out.println(moneyPlant.commonName);
		System.out.println(moneyPlant.height);
		System.out.println(moneyPlant.difficulty);
		System.out.println(moneyPlant.color);
		
		//Plant 2
		Plant tulsiPlant = null;
		tulsiPlant = new Plant();
		tulsiPlant.commonName = "Holy basil";
		tulsiPlant.height = 1.5f;
		tulsiPlant.difficulty = "easy";
		tulsiPlant.color = "Magenta";

		System.out.println(tulsiPlant.commonName);
		System.out.println(tulsiPlant.height);
		System.out.println(tulsiPlant.difficulty);
		System.out.println(tulsiPlant.color);
				
	}
}

