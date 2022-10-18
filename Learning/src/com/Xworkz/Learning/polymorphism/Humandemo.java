package com.Xworkz.Learning.polymorphism;

public class Humandemo {
public static void main(String[] args) {
	Human sam=new Human();
	Unknown unknown=new Unknown();
	Friend friend=new Friend();
	
	sam.speak(friend);
	sam.speak(unknown);
	
	
}
}
