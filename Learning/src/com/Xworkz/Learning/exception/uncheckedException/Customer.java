package com.Xworkz.Learning.exception.uncheckedException;

public class Customer {
	public static void main(String[] args) {
		Dmart dmart=new Dmart();
		try {
			dmart.search(new Product("book",30.00));
		}
		catch(DmartException e) {
			System.out.println(e);
		}
	}

}
