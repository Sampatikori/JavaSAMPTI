package com.Xworkz.chocolate.service;

import java.util.List;

import com.Xworkz.chocolate.dto.ChocolateDto;
import com.Xworkz.chocolate.repo.ChocolateRepo;
import com.Xworkz.chocolate.repo.ChocolateRepoImpl;

public class ChocolateServiceImpl implements ChocolateService {
	
	ChocolateRepo repo=new ChocolateRepoImpl();

	public boolean create(List<ChocolateDto> dto) {
		if(dto!=null ) {
			
			for (ChocolateDto li : dto) {
				repo.create(li);
			}
			return true;
		}
		return false;
	}

	public List<ChocolateDto> readAll() {
	
		return repo.readAll();
	}

	public ChocolateDto findByColourAndWeight(String colour, String weight) {
		if(colour!=null && weight!=null) {
			return repo.findByColourAndWeight(colour, weight);
		}
		return null;
	}

	public ChocolateDto findByPriceAndname(int price, String name) {
		if(price>4 && name!=null) {
			return repo.findByPriceAndname(price, name);
		}
		return null;
	}

	public boolean updateWeightByNameAndColour(String weight, String name, String colour) {
		if(weight!=null && name!=null && colour!=null) {
			return repo.updateWeightByNameAndColour(weight, name, colour);
		}
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, String weight) {
		if(name!=null && id>0 && weight!=null) {
			return repo.updateNameByIdAndWeight(name, id, weight);
		}
		return false;
	}

	public boolean deleteByColourAndName(String colour, String name) {
		if(colour!=null && name!=null) {
			return repo.deleteByColourAndName(colour, name);
		}
		return false;
	}

}
