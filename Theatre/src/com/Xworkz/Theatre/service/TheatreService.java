package com.Xworkz.Theatre.service;

import java.util.List;

import com.Xworkz.Theatre.TheatreDTO;

public interface TheatreService {
	public boolean save(TheatreDTO dto);
    public List<TheatreDTO> read();
    public TheatreDTO findByName(String name);
//    public TheatreDTO updateNameByIndex(String name,int index);
}


