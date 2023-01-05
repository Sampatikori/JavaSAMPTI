package com.Xworkz.institute.service;

import java.util.List;

import com.Xworkz.institute.InstituteDTO;
import com.Xworkz.institute.repo.InstituteRepo;
import com.Xworkz.institute.repo.InstituteRepoImpl;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepo repo=new InstituteRepoImpl();
	
	@Override
	public boolean save(InstituteDTO dto) {
		if(dto!=null) {
			System.out.println("data is valid");
			repo.save(dto);
			System.out.println("data has been saved to repo");
			return true;
		}
		return false;
	}

	@Override
	public List<InstituteDTO> read() {
		
		return repo.read();
	}

	@Override
	public InstituteDTO updateLocationByIndex(String location, int index) {
		if(location!=null) {
			repo.updateLocationByIndex(location, index);
			System.out.println("location has been updated by index successfully");
		}
		return null;
	}

	@Override
	public InstituteDTO updateCourseByName(String course, String name) {
		if(name!=null) {
			repo.updateCourseByName(course, name);
			System.out.println("course has been updated by name successfully");
		}
		return null;
	}

	

}
