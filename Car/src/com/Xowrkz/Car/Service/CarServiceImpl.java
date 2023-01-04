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
	public boolean updateNameByIndex(String name, int index) {
		if(name!=null && index>=0) {
			repo.updateNameByIndex(name, index);
			System.out.println("details updated successfully");
			return true;
		}
		return false;
	}

	@Override
	public boolean updateColourByIndex(String colour, int index) {
		if(colour!=null && index>=0) {
			repo.updateColourByIndex(colour, index);
			System.out.println("data is updated successfully");
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updateSpeedByBrand(int speed, String brand) {
		if(speed>=0 && brand!=null) {
		     System.out.println("data is updated successfully");
		     repo.updateSpeedByBrand(speed, brand);
		return true;
	}
		return false;

	
	}	
}

