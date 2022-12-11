package com.Xworkz.Learning.collection.list;

public class Student {
	String name;
	String id;
	String college;
	
	public Student(String name,String id,String college){
		this.name=name;
		this.id=id;
		this.college=college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", college=" + college + "]";
	}

	

}
