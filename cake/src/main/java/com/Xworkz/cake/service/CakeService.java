package com.Xworkz.cake.service;

import java.util.List;

import com.Xworkz.cake.dto.CakeDto;

public interface CakeService {
	public boolean save(CakeDto dto);
	public CakeDto findById(int id);
	public boolean updateNameById(String name,int id);
    public boolean deleteById(int id);	

}
