package com.Xworkz.Learning.collection.set.treeSet;

public class Student implements Comparable<Student> {
	private String name;
	private Integer id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int compareTo(Student o) {
		
//		return this.name.compareToIgnoreCase(o.getName());
		return this.id.compareTo(o.id);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	

}
