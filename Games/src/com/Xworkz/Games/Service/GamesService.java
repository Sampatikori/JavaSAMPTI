package com.Xworkz.Games.Service;

import java.util.List;

import com.Xworkz.Games.GamesDTO;

public interface GamesService {
 public boolean save(GamesDTO dto);
 public List<GamesDTO> read();
 public GamesDTO findByName(String name);
 public GamesDTO deleteByIndex(int index);
 public GamesDTO updateNameByIndex(String name, int index);
 public GamesDTO updateNoOfPlayersByName(int noOfPlayer,String name);
 public GamesDTO deleteLocationByName(String location,String name);
}
