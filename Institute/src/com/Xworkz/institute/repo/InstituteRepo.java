package com.Xworkz.institute.repo;

import java.util.List;

import com.Xworkz.institute.InstituteDTO;

public interface InstituteRepo {
	public boolean save(InstituteDTO dto);
    public List<InstituteDTO> read();
    public InstituteDTO updateLocationByIndex(String location,int index);
    public InstituteDTO updateCourseByName(String course,String name);
    public InstituteDTO findByNameAndCourse(String name,String course);
}
