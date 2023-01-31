package com.Xworkz.chocolate.service;

import java.util.List;

import com.Xworkz.chocolate.dto.ChocolateDto;

public interface ChocolateService {
	public boolean create(ChocolateDto dto);
	public List<ChocolateDto> readAll();
	public ChocolateDto findByColourAndWeight(String colour,String weight);
	public ChocolateDto findByPriceAndname(int price,String name);
	public boolean updateWeightByNameAndColour(String weight,String name,String colour);
	public boolean updateNameByIdAndWeight(String name,int id,String weight);
	public boolean deleteByColourAndName(String colour,String name);

}
