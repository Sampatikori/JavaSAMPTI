package com.Xworkz.Learning.constructor.constructor_chaining;

public class Waterbottle extends Plastic {
	String brand;
	String colour;
	double prize;
	
	Waterbottle(){
		this("Milton","Silver",50.00);
		System.out.println("Iam default constructor");
	}
	Waterbottle(String brand, String colour,double prize){
		super("300gm","square");
		System.out.println("Iam prameterized constructor");
		this.brand=brand;
		this.colour=colour;
		this.prize=prize;
		this.weight=weight;
		this.shape= shape;
	}

}
