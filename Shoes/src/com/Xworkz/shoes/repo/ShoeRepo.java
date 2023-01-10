package com.Xworkz.shoes.repo;

import com.Xworkz.shoes.dto.ShoeDto;

public interface ShoeRepo {
	public boolean save(ShoeDto dto);
	public ShoeDto read();
	public ShoeDto findByName(String name);

}
