package com.Xworkz.Theatre.service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Theatre.TheatreDTO;
import com.Xworkz.Theatre.repository.TheatreRepo;
import com.Xworkz.Theatre.repository.TheatreRepoImpl;

public class TheatreServiceImpl implements TheatreService {
   TheatreRepo repo=new TheatreRepoImpl();
   
   List<TheatreDTO> list=new ArrayList<TheatreDTO>();

   @Override
   public TheatreDTO save(TheatreDTO dto) {
	   if(dto!=null) {
		   repo.save(dto);
		   System.out.println("data passed to repo");
		   list.add(dto);
		   System.out.println("data added to database");
		   
	   }
   	
   	return dto;
   }

@Override
public TheatreDTO read(TheatreDTO dto) {
	ArrayList<TheatreDTO> td=repo.read(dto);
	for (TheatreDTO theatreDTO : td) {
		System.out.println(theatreDTO);
	}
		return dto;
}

	}

	
 
	
	
	