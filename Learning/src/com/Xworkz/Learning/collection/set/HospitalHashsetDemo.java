package com.Xworkz.Learning.collection.set;

import java.util.HashSet;

import com.Xworkz.Learning.collection.set.Doctor;

public class HospitalHashsetDemo {
	public static void main(String[] args) {
		HashSet<Doctor> doctors=new HashSet<Doctor>();
		Doctor madhu = new Doctor("Madhu", "Pediatrician");
		Doctor sneha = new Doctor("Sneha", "Psychiatrist");
		Doctor megha = new Doctor("Megha", "Pediatrician");
		Doctor dev = new Doctor("Dev", "Cardiologist");
		Doctor shree = new Doctor("Shree", "Neurologist");
		Doctor sara = new Doctor("Sara", "Gynecologist");
		Doctor meera = new Doctor("Meera", "Psychiatrist");
		doctors.add(meera);
		doctors.add(shree);
		doctors.add(dev);
		doctors.add(megha);
		doctors.add(sneha);
		doctors.add(sara);
		doctors.add(madhu);

		HashSet<Doctor> fortisdoctors=new HashSet<Doctor>();
		fortisdoctors.add(madhu);
		fortisdoctors.add(sneha);
		fortisdoctors.add(megha);
		
		HashSet<Doctor> jaidevdoctors=new HashSet<Doctor>();
		jaidevdoctors.add(dev);
		jaidevdoctors.add(shree);
		
		HashSet<Doctor> esicdoctors=new HashSet<Doctor>();
		esicdoctors.add(meera);
		esicdoctors.add(sara);
		
		Hospital fortis=new Hospital("fortis",fortisdoctors);
		Hospital jaidev=new Hospital("jaidev",jaidevdoctors);
		Hospital esic=new Hospital("esic",esicdoctors);
		
		HashSet<Hospital> hospital=new HashSet<Hospital>();
		hospital.add(esic);
		hospital.add(jaidev);
		hospital.add(fortis);
		
		for(Doctor doc:doctors) {
			if(doc.specialization.equals("Psychiatrist")) {
				System.out.println(doc);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
