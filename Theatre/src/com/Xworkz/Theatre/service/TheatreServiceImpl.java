package com.Xworkz.Theatre.service;

import java.util.ArrayList;

import com.Xworkz.Theatre.TheatreDTO;
import com.Xworkz.Theatre.repository.TheatreRepo;
import com.Xworkz.Theatre.repository.TheatreRepoImpl;

public class TheatreServiceImpl implements TheatreService {
   TheatreRepo repo=new TheatreRepoImpl();
	@Override
	public void save(TheatreDTO dto) {
		
	
		if(dto!=null) {
			repo.save(dto);
			System.out.println("dto is not null");
			
		}
		else {
			System.out.println(" dto is null");
		}
		
		
		
		
		
	}
	@Override
	public TheatreDTO read(TheatreDTO dto) {
		ArrayList<TheatreDTO> theatrelist=repo.save(dto);
		for (TheatreDTO theatreDTO : theatrelist) {
			System.out.println(theatreDTO);
			
		}
		return dto;
		
	}

}
