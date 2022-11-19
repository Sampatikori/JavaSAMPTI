package com.Xworkz.Learning;

public class WheelTestDemo {
	public static void main(String[] args) {
		WheelTest carWheel = new WheelTest();
		int carWheelHashcode=carWheel.hashCode();
		
		System.out.println("Hash code of car wheel : "+ carWheelHashcode);
	
	WheelTest bikeWheel=new WheelTest();
	int bikeWheelHashcode=bikeWheel.hashCode();
	System.out.println("Hash code of bike : "+ bikeWheelHashcode);
	
	
	}
}
