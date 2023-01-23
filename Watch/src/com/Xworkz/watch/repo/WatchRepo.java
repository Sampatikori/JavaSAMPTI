package com.Xworkz.watch.repo;

import java.util.List;

import com.Xworkz.watch.dto.WatchDto;

public interface WatchRepo {
	public WatchDto save(WatchDto dto);
	public List<WatchDto> read();
	public List<WatchDto> findByBrandnameAndColour(String brandname, String colour);
	public WatchDto findByIdandType(int id,String type);
	public boolean updateNameById(String name , int id);
	public boolean deleteByColourAndType(String colour, String type);
	public boolean create(WatchDto list);
}
