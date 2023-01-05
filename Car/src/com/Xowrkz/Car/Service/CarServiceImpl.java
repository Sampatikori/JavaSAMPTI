package com.Xowrkz.Car.Service;

import java.util.List;

import com.Xworkz.Car.Repository.CarRepo;
import com.Xworkz.Car.Repository.CarRepoImpl;
import com.Xworkz.Cars.CarDTO;

public class CarServiceImpl implements CarService {

	CarRepo repo=new CarRepoImpl();
	
	@Override
	public boolean save(CarDTO dto) {
		if(dto!=null && dto.getBrand().length()>=3) {
			System.out.println("data is valid");
			repo.save(dto);
			System.out.println("data is saved to repo");
			return true;
		}
		return false;
	}

	@Override
	public List<CarDTO> read() {
		
		return repo.read();
	}

	@Override
	public CarDTO findByName(String name) {
		if(name!=null) {
			List<CarDTO> list=repo.read();
			for(CarDTO cardto:list) {
				if(cardto.getBrand().equals(name)) {
					System.out.println(cardto);
					return cardto;
				}
			}
		}
		return null;
	}

	@Override
	public CarDTO deleteByIndex(int index) {
		if(index>=0) {
		repo.deleteByIndex(index);
		System.out.println("details is deleted successfully");
	}
		return null;

	

	}

	@Override
	public CarDTO updateNameByIndex(String name, int index) {
		if(name!=null && index>=0) {
			repo.updateNameByIndex(name, index);
			System.out.println("details updated successfully");
		
		}
		return null;
	}

	@Override
	public CarDTO updateColourByIndex(String colour, int index) {
		if(colour!=null) {
			repo.updateColourByIndex(colour, index);
			System.out.println("data is updated successfully");
	
		}
		return null;
		
	}

	@Override
	public CarDTO updateSpeedByBrand(int speed, String brand) {
		if(brand!=null) {
		     repo.updateSpeedByBrand(speed, brand);
		     System.out.println("speed is updated successfully");
	}
		return null;

	
	}

	@Override
	public CarDTO updatePriceByType(int price, String type) {
		if(type!=null) {
			repo.updatePriceByType(price, type);
			System.out.println("price is updated successfully");
		}
		return null;
	}

	@Override
	public CarDTO deleteBrandByColour(String brand, String colour) {
		if(colour!=null) {
			repo.deleteBrandByColour(brand, colour);
			System.out.println("brand has been deleted by colour");
		}
		return null;
	}	
}

