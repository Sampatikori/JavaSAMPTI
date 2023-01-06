package com.Xworkz.television.service;

import java.util.Iterator;
import java.util.List;

import com.Xworkz.television.TelevisionDTO;
import com.Xworkz.television.repository.TelevisionRepo;
import com.Xworkz.television.repository.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {

	TelevisionRepo repo=new TelevisionRepoImpl();
	
	
	@Override
	public boolean save(TelevisionDTO dto) {
		if(dto!=null && dto.getBrandname()!=null && dto.getSize()!=null && dto.getPrice()>=0) {
			System.out.println("data is valid");
			repo.save(dto);
			System.out.println("data is saved to repo");
		}
		return false;
	}


	@Override
	public List<TelevisionDTO> read() {
		return repo.read();
		
	}


	@Override
	public TelevisionDTO updateSizeByType(String size, String type) {
		if(type!=null && size!=null) {
			System.out.println("updated data size by type");
			repo.updateSizeByType(size, type);
		}
		return null;
	}


	@Override
	public TelevisionDTO deleteByNameAndColour(String brandname, String colour) {
		if(colour!=null) {
			System.out.println("data has been removed by name and colour");
			repo.deleteByNameAndColour(brandname, colour);
		}
		return null;
	}


	@Override
	public TelevisionDTO findBYNameAndSize(String brandname, String size) {
		if(size!=null) {
			System.out.println("found data by name and size");
			repo.findBYNameAndSize(brandname, size);
			
		}
			
		
				
			
		
		return null;
	}


	@Override
	public TelevisionDTO findTypeAndColourByIndex(String type, String colour, int index) {
		if(index>=0) {
			System.out.println("data has been found by index");
			repo.findTypeAndColourByIndex(type, colour, index);
		}
		return null;
	}



}
