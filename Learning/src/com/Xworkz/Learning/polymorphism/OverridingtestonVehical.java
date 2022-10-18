package com.Xworkz.Learning.polymorphism;

public class OverridingtestonVehical {
public static void main(String[] args) {
	Vehical vehical=new Vehical();
	Bike bike=new Bike();
	Bycycle bycycle=new Bycycle();
	System.out.println(vehical.speed());
	System.out.println(bike.speed());
	System.out.println(bycycle.speed())
	;
}
}

