package com.Xworkz.Learning.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class PediatricianList {
	public static void main(String[] args) {
		ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
		Doctor madhu = new Doctor("Madhu", "Pediatrician");
		Doctor sneha = new Doctor("Sneha", "Psychiatrist");
		Doctor megha = new Doctor("Megha", "Pediatrician");
		Doctor dev = new Doctor("Dev", "Cardiologist");
		Doctor shree = new Doctor("Shree", "Neurologist");
		Doctor sara = new Doctor("Sara", "Gynecologist");
		Doctor meera = new Doctor("Meera", "Pediatrician");
		
		doctorlist.add(meera);
		doctorlist.add(shree);
		doctorlist.add(dev);
		doctorlist.add(megha);
		doctorlist.add(sneha);
		doctorlist.add(sara);
		doctorlist.add(madhu);		

		ArrayList<Doctor> esicdoctorlist = new ArrayList<Doctor>();
		esicdoctorlist.add(meera);
		esicdoctorlist.add(shree);
		esicdoctorlist.add(dev);

		ArrayList<Doctor> jaidevdoctorlist = new ArrayList<Doctor>();
		jaidevdoctorlist.add(madhu);
		jaidevdoctorlist.add(sneha);

		ArrayList<Doctor> mrmcdoctorlist = new ArrayList<Doctor>();
		mrmcdoctorlist.add(sara);
		mrmcdoctorlist.add(megha);

		Hospital esic = new Hospital("ESIC", esicdoctorlist);
		Hospital jaidev = new Hospital("JAIDEV", jaidevdoctorlist);
		Hospital mrmc = new Hospital("MRMC", mrmcdoctorlist);

		ArrayList<Hospital> hospital = new ArrayList<Hospital>();
		hospital.add(jaidev);
		hospital.add(esic);
		hospital.add(mrmc);

		ListIterator<Doctor> listitr = doctorlist.listIterator();
		System.out.println("these are the doctors who are specialised as pediatrician : ");
		while (listitr.hasNext()) {
			Doctor hp =listitr.next();
			if(hp.specialists.equals("Pediatrician")) {
				System.out.println(hp);
			}
		}

	}

}
