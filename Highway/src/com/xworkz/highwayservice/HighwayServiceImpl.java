package com.xworkz.highwayservice;

import com.xorkz.highway.HighwayDTO;
import com.xworkz.highwayrepo.HighwayRepo;
import com.xworkz.highwayrepo.HighwayRepoImpl;

public class HighwayServiceImpl implements HighwayService {
      
	HighwayRepo repo=new HighwayRepoImpl();

	@Override
	public boolean save(HighwayDTO dto) {
		if(dto!=null) {
			System.out.println("data is valid");
			repo.save(dto);
			System.out.println("data is saved to repo");
		}
		return false;
	}
	
	
	

}