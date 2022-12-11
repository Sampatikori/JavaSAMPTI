package com.Xworkz.Learning.collection.set;

import java.util.HashSet;

public class Hospital {
	String name;
	HashSet<Doctor> doctors;
	
	public Hospital(String name,HashSet<Doctor> doctors) {
		this.name=name;
		this.doctors=doctors;
	}

}
