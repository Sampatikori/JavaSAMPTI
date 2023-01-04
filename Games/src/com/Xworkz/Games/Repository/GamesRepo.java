package com.Xworkz.Games.Repository;

import java.util.List;


import com.Xworkz.Games.GamesDTO;

public interface GamesRepo {
   public boolean save(GamesDTO dto);
   public List<GamesDTO> read();
  public List<GamesDTO> findByName(String name); 
  public boolean deleteByIndex(int index);
//   public List<GamesDTO> updateNameByIndex(String name , int index);
}
