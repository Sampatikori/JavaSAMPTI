package com.Xworkz.bags.repo;

import com.Xworkz.bags.dto.BagDto;

public interface BagRepo {
	public boolean save(BagDto dto);
	public BagDto read();
	public BagDto findByName(String name);
	public BagDto findByNameAndId(String name,int id);


}
