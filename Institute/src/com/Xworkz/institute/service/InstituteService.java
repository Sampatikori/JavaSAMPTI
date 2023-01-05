package com.Xworkz.institute.service;

import java.util.List;

import com.Xworkz.institute.InstituteDTO;

public interface InstituteService {
	public boolean save(InstituteDTO dto);
	public List<InstituteDTO> read();
	public InstituteDTO updateLocationByIndex(String location,int index);
	public InstituteDTO updateCourseByName(String course,String name);
}
