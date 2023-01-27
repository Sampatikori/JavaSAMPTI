package com.Xworkz.bulb.repo;

import java.util.List;

import com.Xworkz.bulb.dto.BulbDto;

public interface BulbRepo {
	public boolean create(BulbDto dto);
//	public List<BulbDto> readAll();
	public BulbDto findByName(String name);
	public List<BulbDto> readAll();
}
