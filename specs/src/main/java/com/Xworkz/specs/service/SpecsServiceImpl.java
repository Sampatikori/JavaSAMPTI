package com.Xworkz.specs.service;

import java.util.List;

import com.Xworkz.specs.dto.SpecsDto;
import com.Xworkz.specs.repo.SpecsRepo;
import com.Xworkz.specs.repo.SpecsRepoImpl;

public class SpecsServiceImpl implements SpecsService {
	
	SpecsRepo repo=new SpecsRepoImpl();

	public boolean create(SpecsDto dto) {
		if(dto!=null && dto.getColour().length()>2) {
			System.out.println("data is valid");
			return repo.create(dto);
		}
		return false;
	}

	public List<SpecsDto> read() {
		
		return repo.read();
	}

	
	public SpecsDto findByShapeAndPrice(String shape, int price) {
		if(shape!=null && price>500) {
			System.out.println("data is valid");
			return repo.findByShapeAndPrice(shape, price);
		}
		return null;
	}
	public boolean updatePriceByName(int price, String name) {
		if(price>500 && name!=null) {
			System.out.println("data is valid");
			return repo.updatePriceByName(price, name);
			
		}
		return false;
	}

  public boolean updateColorByPriceAndShape(String colour, int price, String shape) {
	  if(colour!=null && price>500 && shape!=null) {
		  System.out.println("data is valid");
		  return repo.updateColorByPriceAndShape(colour, price, shape);
	  }
	return false;
}

public boolean deleteByPriceAndColor(int price, String colour) {
	if(price>500 && colour!=null) {
		return repo.deleteByPriceAndColor(price, colour);
	}
	return false;
}

public boolean deleteByNameAndId(String name, int id) {
	if(name!=null && id>0) {
		return repo.deleteByNameAndId(name, id);
	}
	return false;
}
  
	


}
