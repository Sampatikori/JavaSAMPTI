package com.Xworkz.Learning.collection.set;

public class Doctor {
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", specialization=" + specialization + "]";
	}

	String name;
	String specialization;
	
	public Doctor(String name,String specialization) {
		this.name=name;
		this.specialization=specialization;
		
	}

}
