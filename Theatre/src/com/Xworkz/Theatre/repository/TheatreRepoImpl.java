package com.Xworkz.Theatre.repository;

import java.util.ArrayList;

import com.Xworkz.Theatre.TheatreDTO;

public class TheatreRepoImpl implements TheatreRepo {
    ArrayList<TheatreDTO> theatre=new ArrayList<TheatreDTO>();
	@Override
	public ArrayList<TheatreDTO> save(TheatreDTO dto) {
		System.out.println("save method in repository");
		return theatre;
				
	}

	@Override
	public ArrayList<TheatreDTO> read(TheatreDTO dto) {
		System.out.println("read method in repository");
		return theatre;
		
	}

}
