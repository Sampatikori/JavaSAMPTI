package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.LaptopDTO;

public interface LaptopService {
	
	public boolean save(LaptopDTO dto);
	public List<LaptopDTO> read();
    public LaptopDTO findByName(String name);
    public LaptopDTO deleteByIndex(int index);
    public boolean updateNameByIndex(String name,int index);
}
