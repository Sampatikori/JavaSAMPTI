package com.Xworkz.Learning.collection.set.service;

import java.util.HashSet;

import com.Xworkz.Learning.collection.set.exception.HospitalException;
import com.Xworkz.Learning.collection.set.model.HospitalDTO;
import com.Xworkz.Learning.collection.set.repository.HospitalRepository;
import com.Xworkz.Learning.collection.set.repository.HospitalRepositoryImpl;

public class HospitalServiceImpl implements HospitalService {

	HospitalRepository hospitalRepository = new HospitalRepositoryImpl();

	public void add(HospitalDTO hospitaldetail) throws HospitalException {
		if (hospitaldetail != null) {
			hospitalRepository.add(hospitaldetail);

		} else {
			throw new HospitalException();
		}

	}

	public HospitalDTO getHospital(String hospitalName) throws HospitalException {
		HashSet<HospitalDTO> hospitals = hospitalRepository.getHospital();
		HospitalDTO hospitaldetail = null;

		for (HospitalDTO hospital : hospitals) {
			if (hospital.getName().equals(hospitalName)) {
				hospitaldetail = hospital;

			}
		}
		if (hospitaldetail == null) {
			throw new HospitalException();
		}
		return hospitaldetail;
	}
}
