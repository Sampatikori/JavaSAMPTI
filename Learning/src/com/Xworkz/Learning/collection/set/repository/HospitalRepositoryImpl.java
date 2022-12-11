package com.Xworkz.Learning.collection.set.repository;

import java.util.HashSet;

import com.Xworkz.Learning.collection.set.model.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository{

	HashSet<HospitalDTO> hospitals=new HashSet<HospitalDTO>();
	
	
	
	public void add(HospitalDTO hospitaldetail) {
		boolean result = hospitals.add(hospitaldetail);
		if(result)
		System.out.println("hospitaldetail detail added successfully");
		
	}
	public HashSet<HospitalDTO> getHospital() {
		
		return hospitals;
	}
	

}
