package com.Xworkz.Mall.Service;

import java.util.List;

import com.Xworkz.Mall.MallDTO;

public interface MallService {
      public boolean save(MallDTO dto);
      public List<MallDTO> read();
      public MallDTO findByName(String name);
}
