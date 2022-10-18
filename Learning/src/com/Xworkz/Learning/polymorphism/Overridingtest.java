package com.Xworkz.Learning.polymorphism;

public class Overridingtest {
public static void main(String[] args) {
	Rbi rbi=new Rbi();
	Sbi sbi=new Sbi();
	Hdfc hdfc=new Hdfc();
	System.out.println(rbi.getInterestRate());
	System.out.println(sbi.getInterestRate());
	System.out.println(hdfc.getInterestRate());
	
}
}
