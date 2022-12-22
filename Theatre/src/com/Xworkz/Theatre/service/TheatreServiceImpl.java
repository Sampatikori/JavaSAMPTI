package com.Xworkz.Theatre.service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Theatre.TheatreDTO;
import com.Xworkz.Theatre.repository.TheatreRepo;
import com.Xworkz.Theatre.repository.TheatreRepoImpl;

public class TheatreServiceImpl implements TheatreService {
   TheatreRepo repo=new TheatreRepoImpl();

@Override
public boolean save(TheatreDTO dto) {
	  if(dto!=null) {
		  if(dto.getName().length()>=3) {
			  System.out.println("data can be passed to repo");
			  repo.save(dto);
			  return true;
		  }
	  }
	return false;
}

@Override
public List<TheatreDTO> read() {
	
	return repo.read();
}

@Override
public TheatreDTO findByName(String name) {
	List<TheatreDTO> dt=repo.read();
	if(dt!=null) {
	for (TheatreDTO theatreDTO : dt) 
		if(theatreDTO.getName().equals(name)) {
			System.out.println(theatreDTO);
		}
	}

	return null;
	
	
}
}

   

  

	

	
 
	
	
	