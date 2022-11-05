package com.Xworkz.Learning.constructor.constructor_chaining;

public class ConstructorChainingDemo {
public static void main(String[] args) {
	Plastic plastic=new Plastic("300gm","square");
	System.out.println("plastic weight is "+plastic.weight);
	System.out.println("plastic shape is "+plastic.shape);
	
	Waterbottle waterbottle =new Waterbottle();
	System.out.println("name of waterbottle is"+waterbottle.brand);
	System.out.println("colour of waterbottle is"+waterbottle.colour);
	System.out.println("prize of waterbottle is"+waterbottle.prize);
}
}
