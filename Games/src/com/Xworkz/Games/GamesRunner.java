package com.Xworkz.Games;

import java.util.Iterator;
import java.util.List;

import com.Xworkz.Games.Service.GamesService;
import com.Xworkz.Games.Service.GamesServiceImpl;

public class GamesRunner {
	public static void main(String[] args) {
		
		GamesService service=new GamesServiceImpl();
		
		GamesDTO cricket=new GamesDTO("Cricket", "Outdoor",11, true, "Bengalore", "7:30 pm");
		GamesDTO football=new GamesDTO("Football", "Outdoor",6, false, "Chennai", "8:30 pm");
		GamesDTO chess=new GamesDTO("Chess", "Indoor",2, true, "Belgavi", "3:00 pm");
		GamesDTO carrom=new GamesDTO("Carrom", "Indoor",4, false, "Kalburagi", "4:00 pm");
		GamesDTO volleyball=new GamesDTO("Volleyball", "Outdoor",6, true, "Mysore", "5:30 pm");
		
		service.save(volleyball);
		service.save(carrom);
		service.save(chess);
		service.save(football);
		
		
	System.out.println(service.save(cricket));
	
	
//	System.out.println(service.read());
		
	List<GamesDTO> list=service.read();
	for (GamesDTO gamesDTO : list) {
		System.out.println(gamesDTO);
		}
	
	service.findByName("Chess");
	
	GamesDTO dto=service.deleteByIndex(2);
	for(GamesDTO gd:list) {
		System.out.println(gd);
	}
	
	
	
		
		
	}

}
