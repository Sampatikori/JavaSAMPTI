package com.Xworkz.Learning.constructor.constructor_overloading;

public class ConstructorOverloadingDemo {
public static void main(String[] args) {
	Madicine madicine=new Madicine();
	System.out.println("Madicine name :- "+madicine.name);
	System.out.println("Madicine prize :- "+madicine.prize);
	System.out.println("Madicine dose :- "+madicine.dose);
	
	Madicine paracetemol =new Madicine("Paracetemol",25.12,"52mg");
	System.out.println("Madicine name :- "+paracetemol.name);
	System.out.println("Madicine name :- "+paracetemol.prize);
	System.out.println("Madicine name :- "+paracetemol.dose);
	
	Madicine dolo = new Madicine("Dolo",20.55);
	System.out.println("Madicine name :- "+dolo.name);
	System.out.println("Madicine name :- "+dolo.prize);
			
}
}
