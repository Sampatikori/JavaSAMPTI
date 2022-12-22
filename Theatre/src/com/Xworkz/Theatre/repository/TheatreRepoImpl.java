package com.Xworkz.Theatre.repository;



import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Theatre.TheatreDTO;

public class TheatreRepoImpl implements TheatreRepo {

	ArrayList<TheatreDTO> list=new ArrayList<TheatreDTO>();

	@Override
	public boolean save(TheatreDTO dto) {
		System.out.println("data is added to database");
		list.add(dto);
		return true;
	}

	@Override
	public List<TheatreDTO> read() {
		
		return list;
	}

	@Override
	public ArrayList<TheatreDTO> findByName(String name) {
		
		return list;
	}
	
	
}
