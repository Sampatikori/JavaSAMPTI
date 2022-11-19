package com.Xworkz.Learning.arrays;

public class Student1Demo {
	public static void main(String[] args) {
		Student1 s1=new Student1("Sania",01,"CSE","PDA");
		Student1 s2=new Student1("Suchi",02,"ISE","PDA");
		Student1 s3=new Student1("Sima",03,"EEE","JNINCE");
		Student1 s4=new Student1("Shreya",04,"CVIL","Agadi");
		
		Student1 student[] = {s1 ,s2 ,s3 ,s4 };
		int count=0;
		for (int i = 0; i < student.length; i++) {
			if(student[i].clg.equals("PDA")) {
				System.out.println("Student from PDA college are : "+ student[i].name);
				count++;
			}}
		if(count==0) {
			System.out.println("not available in the list");

}
}
}