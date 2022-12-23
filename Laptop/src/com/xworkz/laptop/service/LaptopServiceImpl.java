package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.LaptopDTO;
import com.xworkz.laptop.repo.LaptopRepo;
import com.xworkz.laptop.repo.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo=new LaptopRepoImpl();
	
	
	@Override
	public boolean save(LaptopDTO dto) {
		  if(dto!=null) {
			  System.out.println("data is valid");
			  repo.save(dto);
			  System.out.println("data is saved to repo");
			  return true;
		  }
		return false;
	}


	@Override
	public List<LaptopDTO> read() {
		return repo.read();
		
		
	}


	@Override
	public LaptopDTO findByName(String name) {
		List<LaptopDTO> list= repo.read();
		if(list!=null) {
			for (LaptopDTO laptopDTO : list) {
				if(laptopDTO.getName().equals(name)) {
					System.out.println(laptopDTO);
					return laptopDTO;
				}
				
			}
		}
		return null;
	}


	@Override
	public LaptopDTO deleteByIndex(int index) {
		if(index>=0) {
			System.out.println("details is deleted successfully");
			repo.deleteByIndex(index);
		}
		return null;
	}


	@Override
	public LaptopDTO updateNameByIndex(String name, int index) {
       if(name!=null && index>=0) {
    	   System.out.println("data is valid");
    	List<LaptopDTO> dt =repo.read();
    	for (LaptopDTO laptopDTO : dt) {
    		if(laptopDTO.getName().equals(name)) {
    			laptopDTO.setName(name);
    	 return laptopDTO;
			
		}
			
		}
       }
		
		return null;
	}	

}
