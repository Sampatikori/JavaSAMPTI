package com.Xworkz.Learning.constructor.constructor_overloading;

public class Madicine {
String name;
double prize;
String dose;

Madicine(){
	System.out.println("Iam a default constructor");
	 name="vicks";
	 prize=40.55;
	 dose="15ml";
}
Madicine(String name, double prize, String dose){
	System.out.println("Iam a parameterized constructor");
	this.name=name;
	this.prize=prize;
	this.dose=dose;
}
Madicine(String name,double prize){
	System.out.println("Iam a parameterized constructor");
	this.name=name;
	this.prize=prize;
}
}
