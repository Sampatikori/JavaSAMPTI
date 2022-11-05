package com.Xworkz.Learning.constructor.parameterized_constructor;

public class ParameterizedConstructorDemo {
	public static void main(String[] args) {
		Television television = new Television();
		
		Television sam = new Television("Samsung",5000.00);
		System.out.println("Television brand " + sam.brand);
		System.out.println("Television prize " + sam.prize);
	}

}
