package com.Xworkz.watch.service;

import java.util.List;

import com.Xworkz.watch.dto.WatchDto;

public interface WatchService {
	public WatchDto save(WatchDto dto);
	public List<WatchDto> read();
	public List<WatchDto> findByBrandnameAndColour(String brandname, String colour);
	public WatchDto findByIdandType(int id,String type);
	public boolean updateNameById(String name , int id);
	public boolean deleteByColourAndType(String colour, String type);
	public boolean create(List<WatchDto> list);
}
