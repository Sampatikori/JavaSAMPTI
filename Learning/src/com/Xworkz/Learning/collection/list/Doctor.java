package com.Xworkz.Learning.collection.list;

public class Doctor {
	String name;
	String specialists;
	
	public Doctor(String name,String specialists) {
		this.name=name;
		this.specialists=specialists;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialists=" + specialists + "]";
	}
	
	

}
