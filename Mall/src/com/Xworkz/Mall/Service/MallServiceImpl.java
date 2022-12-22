package com.Xworkz.Mall.Service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Mall.MallDTO;
import com.Xworkz.Mall.Repository.MallRepo;
import com.Xworkz.Mall.Repository.MallRepoImpl;

public class MallServiceImpl implements MallService {
   MallRepo repo=new MallRepoImpl();
   
	@Override
	public boolean save(MallDTO dto) {
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
	public List<MallDTO> read() {
	
		return repo.read();
	}

	@Override
	public String findByName(String name) {
		ArrayList<MallDTO> list=repo.findByName(name){
			
		}
		
		return dto;
	}

	
}  
	