package com.Xworkz.Learning;

public class DownCastingdemo {
	public static void main(String[] args) {
		Tree tree=new Mango();
		Mango mango=(Mango)tree;
	    mango.provideOxygen();
		mango.provideMangoFruits();
	}

}
