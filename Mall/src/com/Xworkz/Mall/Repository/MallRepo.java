package com.Xworkz.Mall.Repository;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Mall.MallDTO;

public interface MallRepo {
   public  boolean save(MallDTO dto);
   public List<MallDTO> read();
   public List<MallDTO> findByName(String name);


}
