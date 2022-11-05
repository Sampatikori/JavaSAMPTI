package com.Xworkz.Learning.constructor.parameterized_constructor;

public class Television {
 String brand;
 double prize;
 
 Television(){
	 System.out.println("I am default constructor");
 }
 Television(String brand,double prize){
	 System.out.println("I am a parameterized constructor");
	 this.brand=brand;
	 this.prize=prize;
	 
 }
}
