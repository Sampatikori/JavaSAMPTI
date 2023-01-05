package com.Xworkz.institute.repo;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.institute.InstituteDTO;

public class InstituteRepoImpl implements InstituteRepo {

	List<InstituteDTO> database=new ArrayList<InstituteDTO>();
	
	
	@Override
	public boolean save(InstituteDTO dto) {
		database.add(dto);
		System.out.println("data has been added into database");
		return true;
	}


	@Override
	public List<InstituteDTO> read() {
		
		return database;
	}


	@Override
	public List<InstituteDTO> updateLocationByIndex(String location, int index) {
		InstituteDTO dt=database.get(index);
		dt.setLocation(location);
		database.set(index, dt);
		return database;
	}


	@Override
	public List<InstituteDTO> updateCourseByName(String course, String name) {
		for(int i=0; i<database.size(); i++) {
			InstituteDTO id=database.get(i);
			if(id.getName().equals(name)) {
				id.setName(name);
				id.setCourse(course);
				database.set(i, id);
				return database;
			}
		}
		return null;
	}


	
}
