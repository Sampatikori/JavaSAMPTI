package com.Xworkz.Learning.arrays;

public class Student {
	String name;
	int Rollno;
	String branch;
	String clg;
	
	Student(String name,int Rollno,String branch,String clg){
		this.name=name;
		this.Rollno=Rollno;
		this.branch=branch;
		this.clg=clg;
		
	}

	public String toString() {
		return "Student [name=" + name + ", Rollno=" + Rollno + ", branch=" + branch + ", clg=" + clg + "]";
	}

}
