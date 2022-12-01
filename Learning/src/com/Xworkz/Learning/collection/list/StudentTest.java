package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		Student amar=new Student("Amar","s01","JNNC");
		Student shasi=new Student("Shasi","s02","MPC");
		Student karan=new Student("Karan","s03","RIT");
		Student priya=new Student("Priya","s04","ATME");
		Student diya=new Student("Diya","s05","JNNC");
		
		students.add(amar);
		students.add(shasi);
		students.add(karan);
		students.add(diya);
		students.add(priya);
		
		for(Student s:students) {
			if(s.college.equals("JNNC")){
				System.out.println(s);
				
			}
			}
		System.out.println(students.contains(shasi));
		
	}

}
