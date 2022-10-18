package com.Xworkz.Learning.polymorphism;

public class OverloadingtestonFacebook {
public static void main(String[] args) {
	Facebook facebook=new Facebook();
	Name name=new Name();
	Cellnumber cellnumber=new Cellnumber();
	facebook.search(name);
	facebook.search(cellnumber);
	
}
}
