package com.Xworkz.Theatre.repository;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Theatre.TheatreDTO;

public interface TheatreRepo {
	public boolean save(TheatreDTO dto);
	public List<TheatreDTO> read();
    public ArrayList<TheatreDTO> findByName(String name);
    public boolean deleteByIndex(int index);
}






