package com.Xworkz.Games.Repository;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz.Games.GamesDTO;

public class GamesRepoImpl implements GamesRepo {

	List<GamesDTO> gameslist=new ArrayList<GamesDTO>();
	
	@Override
	public boolean save(GamesDTO dto) {
		gameslist.add(dto);
		System.out.println("data has been added to database");
		return true;
	}

	@Override
	public List<GamesDTO> read() {
		
		return gameslist;
	}

	@Override
	public List<GamesDTO> findByName(String name) {
		
		return gameslist;
	}

	@Override
	public boolean deleteByIndex(int index) {
		gameslist.remove(index);
		return true;
	}

	@Override
	public List<GamesDTO> updateNameByIndex(String name, int index) {
		GamesDTO gd=gameslist.get(index);
		gd.setGameName(name);
		gameslist.set(index, gd);
		return gameslist;
	}

	
	

}
