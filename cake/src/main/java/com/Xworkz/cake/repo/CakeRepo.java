package com.Xworkz.cake.repo;

import com.Xworkz.cake.dto.CakeDto;

public interface CakeRepo {
	public boolean save(CakeDto dto);
	public CakeDto findById(int id);
	public boolean updateNameById(String name,int id);
	public boolean deleteById(int id);

}
