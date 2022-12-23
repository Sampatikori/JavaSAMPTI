package com.xworkz.highwayrepo;

import java.util.ArrayList;
import java.util.List;

import com.xorkz.highway.HighwayDTO;

public class HighwayRepoImpl implements HighwayRepo {

	List<HighwayDTO> database=new ArrayList<HighwayDTO>();

	@Override
	public boolean save(HighwayDTO dto) {
		database.add(dto);
		System.out.println("data has been added into  database");
		return true;
	}

	
	
	
	

}
