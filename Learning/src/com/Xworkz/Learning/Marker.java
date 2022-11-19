package com.Xworkz.Learning;

public class Marker {
	String brand;
	
	public Marker(String brand) {
		this.brand=brand;
		
	}

	protected void finalize() throws Throwable {
		System.out.println("Finalized method executed.");
	}

	public String toString() {
		return "Marker [brand=" + brand + "]"; 
	}

}
