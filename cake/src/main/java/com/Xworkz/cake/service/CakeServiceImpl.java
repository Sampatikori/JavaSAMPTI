package com.Xworkz.cake.service;

import com.Xworkz.cake.dto.CakeDto;
import com.Xworkz.cake.repo.CakeRepo;
import com.Xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {

	CakeRepo repo = new CakeRepoImpl();

	public boolean save(CakeDto dto) {
		if (dto != null) {
			if (dto.getId() > 0) {
				System.out.println("data is valid");
				repo.save(dto);
				System.out.println("data is saved to repo");
				return true;

			}
		}
		return false;
	}

	public CakeDto findById(int id) {
		if(id>0) {
			System.out.println("id is valid");
			return repo.findById(id);
		}
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if(name.length()>=3 && id>0) {
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
