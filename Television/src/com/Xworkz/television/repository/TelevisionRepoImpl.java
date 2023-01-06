package com.Xworkz.television.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Xworkz.television.TelevisionDTO;

public class TelevisionRepoImpl implements TelevisionRepo {

	List<TelevisionDTO> database=new ArrayList<TelevisionDTO>();
	
	@Override
	public boolean save(TelevisionDTO dto) {
		database.add(dto);
		System.out.println("data has been added into database");
		return true;
	}

	@Override
	public List<TelevisionDTO> read() {
		
		return database;
	}

	

	@Override
	public TelevisionDTO updateSizeByType(String size, String type) {
		for(int i=0; i<database.size(); i++) {
			TelevisionDTO dto=database.get(i);
			if(dto.getType().equals(type)) {
			dto.setType(type);
			dto.setSize(size);
			database.set(i, dto);
			return dto;
		}
		}
		return null;
	}

	@Override
	public TelevisionDTO deleteByNameAndColour(String brandname, String colour) {
		Iterator<TelevisionDTO> itr=database.iterator();
		while(itr.hasNext()) {
			TelevisionDTO dto=itr.next();
			if(dto.getBrandname().equals(brandname)&& dto.getColour().equals(colour)) {
				itr.remove();
			}
		}
		return null;
	}

	@Override
	public TelevisionDTO findBYNameAndSize(String brandname, String size) {
		for (TelevisionDTO televisionDTO : database) {
			if(televisionDTO.getBrandname().equals(brandname)&& televisionDTO.getSize().equals(size)) {
				System.out.println(televisionDTO);
			}
			
		}
		return null;
	}

	@Override
	public TelevisionDTO findTypeAndColourByIndex(String type, String colour, int index) {
		database.get(index).equals(index);
		for (TelevisionDTO dto : database) {
		if(dto.getType().equals(type)&&dto.getColour().equals(colour)) {
			System.out.println(dto);
		}
		}
		return null;
	}

	
}
