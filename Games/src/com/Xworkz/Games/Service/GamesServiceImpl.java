package com.Xworkz.Games.Service;

import java.util.List;

import com.Xworkz.Games.GamesDTO;
import com.Xworkz.Games.Repository.GamesRepo;
import com.Xworkz.Games.Repository.GamesRepoImpl;

public class GamesServiceImpl implements GamesService {

	GamesRepo repo=new GamesRepoImpl();
	
	@Override
	public boolean save(GamesDTO dto) {
		if(dto!=null && dto.getGameName().length()>=5) {
			System.out.println("data is valid");
			repo.save(dto);
			System.out.println("data can be saved to repo");
			return true;
		}
		return false;
	}

	@Override
	public List<GamesDTO> read() {
		
		return repo.read();
	}

	@Override
	public GamesDTO findByName(String name) {
		if(name!=null && name.length()>=5) {
			   List<GamesDTO> list= repo.read();
			   for(GamesDTO gd:list) {
				   if(gd.getGameName().equals(name)) {
					   System.out.println(gd);
					   return gd;
				   }
			   }
		}
		return null;
	}

	@Override
	public GamesDTO deleteByIndex(int index) {
		if(index>=0) {
			repo.deleteByIndex(index);
			System.out.println("data is deleted successfully");
		}
		return null;
	}

}
