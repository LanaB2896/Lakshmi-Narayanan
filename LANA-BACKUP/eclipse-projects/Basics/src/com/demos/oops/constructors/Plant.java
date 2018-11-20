package com.demos.oops.constructors;

class Plant {
	//member variables
	 String commonName;
	 float height;
	 String difficulty;
	 String color;
	 
	 //constructor
	 //same name as class
	 //used to initialize default values

	 Plant(){
		 commonName = "Plant";
			height = 0.0f;
			difficulty = "easy";
			color = "Not mentioned";
	 }
	 
     //parameterized constructor
	 Plant(String pcommonName,	 float pheight,	 String pdifficulty,	 String pcolor){
		 commonName = pcommonName;
			height = pheight;
			difficulty = pdifficulty;
			color = pcolor;
	 }
	 
	 void displayDetails(){
			System.out.println(commonName);
			System.out.println(height);
			System.out.println(difficulty);
			System.out.println(color);
	 }
}