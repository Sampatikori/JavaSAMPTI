package com.Xworkz.Learning.encapsulation;

public class EncapsulationDemo {
public static void main(String[] args) {
	Student student = new Student();
	student.setName("Sam");
	student.setAge(22);
	student.setCollegeName("PDA");
	student.setUSN("3PD18IP020");
	
	System.out.println( "Student name is :-  "+student.getName());
	System.out.println(student.getAge());
	System.out.println(student.getCollegeName());
	System.out.println(student.getUSN());
	
}
}
