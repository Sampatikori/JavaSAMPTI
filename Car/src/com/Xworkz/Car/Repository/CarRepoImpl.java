package com.Xworkz.Car.Repository;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Cars.CarDTO;

public class CarRepoImpl implements CarRepo {

	List<CarDTO> database=new ArrayList<CarDTO>();
	
	
	@Override
	public boolean save(CarDTO dto) {
		database.add(dto);
		System.out.println("data is added to database");
		return true;
	}


	@Override
	public List<CarDTO> read() {
		
		return database;
	}


	@Override
	public List<CarDTO> findByName(String name) {
		
		return database;
	}


	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		
		return true;
	}


	@Override
	public List<CarDTO> updateNameByIndex(String name, int index) {
		CarDTO cd=database.get(index);
		cd.setBrand(name);
		database.set(index, cd);
		database.add(cd);
		
		return database;
	}


	@Override
	public List<CarDTO> updateColourByIndex(String colour, int index) {
		CarDTO cd=database.get(index);
		System.out.println("data has been fetched from the database");
		cd.setColour(colour);
		database.set(index, cd);
		database.add(cd);
		return database;
	}


	@Override
	public List<CarDTO> updateSpeedByBrand(int speed, String brand) {
		for(int i=0; i<database.size(); i++) {
			CarDTO cd1=database.get(i);
			if(cd1.getBrand().equals(brand)) {
				cd1.setSpeed(speed);
				database.set(i, cd1);
				database.add(cd1);
			return database;		
			}
		}
		return null;
	}

}
