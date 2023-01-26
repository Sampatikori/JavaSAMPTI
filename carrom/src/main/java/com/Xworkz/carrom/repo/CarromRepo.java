package com.Xworkz.carrom.repo;

import com.Xworkz.carrom.dto.CarromDto;

public interface CarromRepo {
	public boolean save(CarromDto dto);
	public CarromDto findById(int id);
	public boolean updateNameById(String name,int id);
	public boolean deleteById(int id);

}
