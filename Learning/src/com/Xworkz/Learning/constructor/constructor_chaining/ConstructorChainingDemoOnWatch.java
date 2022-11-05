package com.Xworkz.Learning.constructor.constructor_chaining;

public class ConstructorChainingDemoOnWatch {
	public static void main(String[] args) {
		Watch watch=new Watch();
		System.out.println("watch name " +watch.name);
		System.out.println("watch prize " +watch.prize);
		
		Watch fastrack=new Watch("Fastrack",4000.00,"Digital");
		System.out.println("watch name " +fastrack.name);
		System.out.println("watch prize " +fastrack.prize);
		System.out.println("watch type " +fastrack.type);
	}

}
