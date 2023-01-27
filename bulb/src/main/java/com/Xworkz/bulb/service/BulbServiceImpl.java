package com.Xworkz.bulb.service;

import java.util.List;

import com.Xworkz.bulb.dto.BulbDto;
import com.Xworkz.bulb.repo.BulbRepo;
import com.Xworkz.bulb.repo.BulbRepoImpl;

public class BulbServiceImpl implements BulbRepo, BulbService {
	
	BulbRepo repo = new BulbRepoImpl();

	public boolean create(BulbDto dto) {
		if(dto!=null) {
			System.out.println("data is valid");
			return repo.create(dto);
		}
		
		return false;
	}

//	public List<BulbDto> readAll() {
//		
//		return repo.readAll();
//	}

	public BulbDto findByName(String name) {
		if(name!=null) {
			System.out.println("data is valid");
			return repo.findByName(name);
		}
		return null;
	}

	public List<BulbDto> readAll() {
		return repo.readAll();
	}

}
