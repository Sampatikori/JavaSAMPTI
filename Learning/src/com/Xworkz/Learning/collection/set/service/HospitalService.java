package com.Xworkz.Learning.collection.set.service;

import com.Xworkz.Learning.collection.set.exception.HospitalException;
import com.Xworkz.Learning.collection.set.model.HospitalDTO;

public interface HospitalService {
	void add(HospitalDTO hospitaldetail) throws HospitalException;
	HospitalDTO getHospital(String hospitalName) throws HospitalException;

}

