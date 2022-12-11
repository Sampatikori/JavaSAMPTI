package com.Xworkz.Learning.collection.set.treeSet;

import java.util.TreeSet;

public class StudentSet {
	public static void main(String[] args) {
		Student sampi=new Student();
		sampi.setName("sampi");
		sampi.setId(40);
		
		Student vaish=new Student();
		vaish.setName("vaish");
		vaish.setId(45);
		
		Student smita=new Student();
		smita.setName("smita");
		smita.setId(35);
		
		Student somu=new Student();
		somu.setName("somu");
		somu.setId(50);
		
		TreeSet<Student> students=new TreeSet<Student>(new StudentComparator());
		students.add(somu);
		students.add(smita);
		students.add(sampi);
		students.add(vaish);
		
		System.out.println(students);
		
		
	}

}
