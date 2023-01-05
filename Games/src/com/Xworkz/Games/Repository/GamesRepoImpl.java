package com.Xworkz.Games.Repository;

import java.util.ArrayList;
import java.util.Iterator;
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

	@Override
	public List<GamesDTO> updateNoOfPlayersByName(int noOfPlayer, String name) {
		  for(int i=0; i<gameslist.size(); i++) {
			  GamesDTO gd=gameslist.get(i);
			  if(gd.getGameName().equals(name)) {
				  gd.setGameName(name);
				  gd.setNoOfPlayer(noOfPlayer);
				  gameslist.set(i, gd);
				  return gameslist;
			  }
		  }
		return null;
	}

	@Override
	public List<GamesDTO> deleteLocationByName(String location, String name) {
		Iterator<GamesDTO> itr=gameslist.iterator();
		while(itr.hasNext()) {
			GamesDTO dto=itr.next();
			if(dto.getGameName().equals(name)) {
				gameslist.remove(dto);
			return gameslist;
			}
		}
		return null;
	}

	
	

}
