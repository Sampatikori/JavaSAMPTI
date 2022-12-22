package com.Xworkz.Mall.Repository;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Mall.MallDTO;

public class MallRepoImpl implements MallRepo{
	
   List<MallDTO> list=new ArrayList<MallDTO>();
   
	@Override
	public boolean save(MallDTO dto) {
		System.out.println("data is addede to database");
		list.add(dto);
		return true;
	}

	@Override
	public List<MallDTO> read() {
		
		return list;
	}

	@Override
	public List<MallDTO> findByName(String name) {
		
		return list;
	}

	

	
}