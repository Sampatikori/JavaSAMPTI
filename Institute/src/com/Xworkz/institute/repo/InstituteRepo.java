package com.Xworkz.institute.repo;

import java.util.List;

import com.Xworkz.institute.InstituteDTO;

public interface InstituteRepo {
	public boolean save(InstituteDTO dto);
    public List<InstituteDTO> read();
    public List<InstituteDTO> updateLocationByIndex(String location,int index);
    public List<InstituteDTO> updateCourseByName(String course,String name);
    public 
}
