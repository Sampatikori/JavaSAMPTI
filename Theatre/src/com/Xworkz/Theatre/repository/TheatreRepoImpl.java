package com.Xworkz.Theatre.repository;



import java.util.ArrayList;

import com.Xworkz.Theatre.TheatreDTO;

public class TheatreRepoImpl implements TheatreRepo {
    
	@Override
	public TheatreDTO save(TheatreDTO dto) {
		System.out.println("save method in repository");
		return dto;
				
	}
	@Override
	public TheatreDTO read(TheatreDTO dto) {
		System.out.println("read method in repository");
		return dto;
		
	}

}
