package com.Xworkz.soap.repo;

import java.util.List;

import com.Xworkz.soap.dto.SoapDto;

public interface SoapRepo {
	public boolean save(SoapDto dto);
	public List<SoapDto> readAll();
	public SoapDto findByNameAndPrice(String name,int price);
	public boolean updateNameByPrice(String name,int price);
	public boolean updateColourAndFragranceByName(String colour,String fragrance,String name);
    public boolean updateTypeById(String type,int id);
}
