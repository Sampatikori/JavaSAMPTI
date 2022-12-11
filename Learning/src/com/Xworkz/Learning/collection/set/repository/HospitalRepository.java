package com.Xworkz.Learning.collection.set.repository;

import java.util.HashSet;

import com.Xworkz.Learning.collection.set.model.HospitalDTO;

public interface HospitalRepository {
    void add(HospitalDTO hospitaldetail);
    HashSet<HospitalDTO> getHospital();
}

