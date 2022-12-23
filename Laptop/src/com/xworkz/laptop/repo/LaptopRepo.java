package com.xworkz.laptop.repo;

import java.util.List;

import com.xworkz.laptop.LaptopDTO;

public interface LaptopRepo {
   public boolean save(LaptopDTO dto);
   public List<LaptopDTO> read();
   public List<LaptopDTO> findByName(String name);
   public boolean deleteByIndex(int index);
   public List<LaptopDTO> updateNameByIndex(String name,int index);
}
