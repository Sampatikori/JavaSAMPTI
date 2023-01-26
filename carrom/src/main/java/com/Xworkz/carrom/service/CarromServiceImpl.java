package com.Xworkz.carrom.service;

import com.Xworkz.carrom.dto.CarromDto;
import com.Xworkz.carrom.repo.CarromRepo;
import com.Xworkz.carrom.repo.CarromRepoImpl;

public class CarromServiceImpl implements CarromService {

	CarromRepo repo = new CarromRepoImpl();

	public boolean save(CarromDto dto) {
		if (dto != null && dto.getBrandName().length() > 2) {
			System.out.println("data is valid");
			System.out.println("data has been sent to repo");
			repo.save(dto);
			return true;
		}

		return false;
	}

	public CarromDto findById(int id) {
		if(id>0) {
			System.out.println("data is valid");
			return repo.findById(id);
		}
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if(name!=null && id>0) {
			System.out.println("data is valid");
			return repo.updateNameById(name, id);
		}
		return false;
	}

	public boolean deleteById(int id) {
		if(id>0) {
			System.out.println("data is valid");
			return repo.deleteById(id);
		}
		return false;
	}

}
