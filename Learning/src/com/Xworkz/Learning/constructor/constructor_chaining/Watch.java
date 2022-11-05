package com.Xworkz.Learning.constructor.constructor_chaining;

public class Watch {
	String name;
	double prize;
	String type;
	
	Watch(){
		this("Sonata",2500.00);
		System.out.println("Iam default constructor");
	}
	Watch(String name, double prize){
		this("Fastrack",4000.00,"digital");
		System.out.println("Iam parameterized constructor");
		this.name=name;
		this.prize=prize;
	}
   Watch(String name, double prize,String type){
	   System.out.println("Iam parameterized constructor");
	   this.name=name;
	   this.prize=prize;
	   this.type=type;
	   
   }
}
