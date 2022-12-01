package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;

public class XworkzDemo {
	public static void main(String[] args) {
		ArrayList<StudentsOfXworkz> stds=new ArrayList<StudentsOfXworkz>();
		StudentsOfXworkz a=new StudentsOfXworkz("Sanvi","s1","Asha");
		StudentsOfXworkz b=new StudentsOfXworkz("Nisha","s2","Mohan");
		StudentsOfXworkz c=new StudentsOfXworkz("Kati","s3","Omkar");
		StudentsOfXworkz d=new StudentsOfXworkz("Smith","s4","Veena");
		StudentsOfXworkz e=new StudentsOfXworkz("Siri","s5","Asha");
		StudentsOfXworkz f=new StudentsOfXworkz("Shiv","s6","Omkar");
		StudentsOfXworkz g=new StudentsOfXworkz("Maya","s7","Asha");
		
		stds.add(a);
		stds.add(b);
		stds.add(c);
		stds.add(d);
		stds.add(e);
		stds.add(f);
		stds.add(g);
		
		for(StudentsOfXworkz s:stds) {
			if(s.trainername.equals("Asha")) {
				System.out.println(s);
			}
		}
		
		
		
		
		
	}

}
