package com.xworkz.laptop.repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop.LaptopDTO;

public class LaptopRepoImpl implements LaptopRepo {

	List<LaptopDTO> database=new ArrayList<LaptopDTO>();

	@Override
	public boolean save(LaptopDTO dto) {
		database.add(dto);
		System.out.println("data has been added to database");
		return true;
	}

	@Override
	public List<LaptopDTO> read() {
		
		return database;
	}

	@Override
	public List<LaptopDTO> findByName(String name) {
		
		return database;
	}

	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		return true;
	}

	@Override
	public List<LaptopDTO> updateNameByIndex(String name, int index) {
		return database;
		
		
					}	
}
