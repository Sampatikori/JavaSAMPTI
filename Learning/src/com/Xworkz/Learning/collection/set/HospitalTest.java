package com.Xworkz.Learning.collection.set;

import java.util.HashSet;

import com.Xworkz.Learning.collection.set.exception.HospitalException;
import com.Xworkz.Learning.collection.set.model.DoctorDTO;
import com.Xworkz.Learning.collection.set.model.HospitalDTO;
import com.Xworkz.Learning.collection.set.service.HospitalService;
import com.Xworkz.Learning.collection.set.service.HospitalServiceImpl;

public class HospitalTest {
	public static void main(String[] args) {
		HospitalService hospitalService=new HospitalServiceImpl();
		
		DoctorDTO sam=new DoctorDTO();
		sam.setName("sam");
		sam.setSpecialization("dentist");
		HashSet<DoctorDTO> fortisdoctors=new HashSet<DoctorDTO>();
		fortisdoctors.add(sam);
		
		DoctorDTO som=new DoctorDTO();
		som.setName("som");
		som.setSpecialization("dermatologist");
		HashSet<DoctorDTO> apollodoctors=new HashSet<DoctorDTO>();
		apollodoctors.add(som);
		
		HospitalDTO fortis=new HospitalDTO();
		fortis.setName("fortis");
		fortis.setDoctors(fortisdoctors);
		
		HospitalDTO apollo=new HospitalDTO();
		apollo.setName("apollo");
		apollo.setDoctors(apollodoctors);
		
		HospitalDTO ap=new HospitalDTO();
		ap.setName("apollo");
		ap.setDoctors(apollodoctors);
		
		try {
			hospitalService.add(fortis);
			hospitalService.add(apollo);
			hospitalService.add(ap);
		
		}
		catch (HospitalException e) {
			System.out.println(e);
		}
		
			
			try {
				HospitalDTO	fortisehospital = hospitalService.getHospital("fortis");
				System.out.println("details of fortishospital : "+fortisehospital );
			} 
			catch (HospitalException e) {
				System.out.println(e.getMessage());
				
			}
			
		
	}

}
