package com.Xworkz.carrom.service;

import com.Xworkz.carrom.dto.CarromDto;

public interface CarromService {
	public boolean save(CarromDto dto);
	public CarromDto findById(int id);
	public boolean updateNameById(String name,int id);
	public boolean deleteById(int id);

}
