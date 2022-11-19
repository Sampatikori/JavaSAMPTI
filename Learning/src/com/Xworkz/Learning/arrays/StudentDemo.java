package com.Xworkz.Learning.arrays;

public class StudentDemo {
public static void main(String[] args) {
	Student s1=new Student("Somya",01,"CSE","PDA");
	Student s2=new Student("Sampati",02,"ISE","PDA");
	Student s3=new Student("Smita",03,"EEE","JNINCE");
	Student s4=new Student("Sunita",04,"CVIL","Agadi");
	
	Student student[] = {s1 ,s2 ,s3 ,s4 };
	int count=0;
	for (int i = 0; i < student.length; i++) {
	if(student[i].name.equals("Sampati")) {
		System.out.println("Sampati is studied in the college : "+ student[i].clg);
		count++;
	}
	}
	if(count==0) {
		System.out.println("Sampati is not available in the list");
	}
	
	}
}

