package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;

public class Trainer {
	String name;
	ArrayList<Student> students;

	public Trainer(String name,ArrayList<Student> students) {
		this.name=name;
		this.students=students;
	}

	@Override
	public String toString() {
		return "Trainer [name=" + name + ", students=" + students + "]";
	}
}
