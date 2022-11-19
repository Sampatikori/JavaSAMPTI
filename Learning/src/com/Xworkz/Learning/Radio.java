package com.Xworkz.Learning;

public class Radio implements Cloneable {
	String brand;
	double price;
	Battery battery;
	
	Radio(String brand,double price,Battery battery){
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}

	public Object clone() throws CloneNotSupportedException {  
		return super.clone();
	}

	public String toString() {
		return "Radio [brand=" + brand + ", price=" + price + ", battery=" + battery + "]";
	}}

