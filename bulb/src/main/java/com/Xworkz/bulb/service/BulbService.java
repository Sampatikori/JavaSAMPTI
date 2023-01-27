package com.Xworkz.bulb.service;

import java.util.List;

import com.Xworkz.bulb.dto.BulbDto;

public interface BulbService {
	public boolean create (BulbDto dto);
//	public List<BulbDto> readAll();
	public BulbDto findByName(String name);
	public List<BulbDto> readAll();
	

}
