package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class XworkzStudents {
	public static void main(String[] args) {
		
		Student amar=new Student("Amar","s01","JNNC");
		Student shasi=new Student("Shasi","s02","MPC");
		Student karan=new Student("Karan","s03","RIT");
		Student priya=new Student("Priya","s04","ATME");
		Student diya=new Student("Diya","s05","JNNC");
		
		ArrayList<Student> ashastudentList=new ArrayList<Student>();
		ashastudentList.add(diya);
		ashastudentList.add(amar);
		ashastudentList.add(shasi);
		
		ArrayList<Student> omkarstudentList=new ArrayList<Student>();
		omkarstudentList.add(priya);
		omkarstudentList.add(karan);
		
		Trainer asha=new Trainer("Asha",ashastudentList);
		Trainer omkar=new Trainer("Omkar",omkarstudentList);
		
	    ArrayList<Trainer> trainerList=new ArrayList<Trainer>();
	    trainerList.add(omkar);
	    trainerList.add(asha);
	    
	  ListIterator<Trainer>  itr=trainerList.listIterator();
	    
	  while(itr.hasNext()) {
		  Trainer trainer=itr.next();
		  if(trainer.name.equals("Asha")) {
			  System.out.println("Asha's student details : ");
			  ArrayList<Student> students=trainer.students;
			  System.out.println(students);
			  
		  }
	  }	
	}
}
