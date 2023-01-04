package com.Xworkz.Learning;

public class RadioTest {
	public static void main(String[] args) {
		Radio sony=new Radio("sony",10000.00, null);
		try {
			
			Radio copyofsony = (Radio)sony.clone();
			System.out.println("details of sony : "+ sony);
			System.out.println("details of copyofsony : "+ copyofsony);
			copyofsony.price = 20000.00;
			sony.price = 30000.00;
			System.out.println("After a change:----------");
			System.out.println("details of Sony : "+ sony);
			System.out.println("details of copyofsony : "+ copyofsony);
			
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
