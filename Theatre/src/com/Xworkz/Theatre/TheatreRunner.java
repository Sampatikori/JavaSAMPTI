package com.Xworkz.Theatre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.Xworkz.Theatre.service.TheatreService;
import com.Xworkz.Theatre.service.TheatreServiceImpl;

public class TheatreRunner {
	public static void main(String[] args) {
		
	
	TheatreService service=new TheatreServiceImpl();

	TheatreDTO miraz=new TheatreDTO();
	miraz.setName("Miraz");
	miraz.setLocation("Kalaburagi");
	miraz.setMovieName("KGF2");
	miraz.setNoOfAcs(10);
	miraz.setNoOfSeats(150);
	miraz.setHasParking(true);
	miraz.setNoOfDoors(2);
	miraz.setPrice(150);
	miraz.setNoOfTicketsAvailable(150);
	miraz.setShowTimings("1pm to 4pm");
	
	TheatreDTO shalini=new TheatreDTO();
	shalini.setName("Shalini");
	shalini.setLocation("Kalaburagi");
	shalini.setMovieName("VIP");
	shalini.setNoOfAcs(10);
	shalini.setNoOfSeats(160);
	shalini.setHasParking(true);
	shalini.setNoOfDoors(2);
	shalini.setPrice(200);
	shalini.setNoOfTicketsAvailable(160);
	shalini.setShowTimings("6pm to 9pm");
	
	TheatreDTO mohini=new TheatreDTO();
	mohini.setName("Mohini");
	mohini.setLocation("Kalaburagi");
	mohini.setMovieName("KGF1");
	mohini.setNoOfAcs(15);
	mohini.setNoOfSeats(120);
	mohini.setHasParking(true);
	mohini.setNoOfDoors(2);
	mohini.setPrice(250);
	mohini.setNoOfTicketsAvailable(120);
	mohini.setShowTimings("6pm to 9pm");
    
	TheatreDTO ionox=new TheatreDTO();
	ionox.setName("Ionox");
	ionox.setLocation("Kalaburagi");
	ionox.setMovieName("Vikranth Rona");
	ionox.setNoOfAcs(10);
	ionox.setNoOfSeats(300);
	ionox.setHasParking(true);
	ionox.setNoOfDoors(4);
	ionox.setPrice(300);
	ionox.setNoOfTicketsAvailable(300);
	ionox.setShowTimings("12pm to 3pm");
    
	TheatreDTO shetty=new TheatreDTO();
	shetty.setName("Shetty");
	shetty.setLocation("Kalaburagi");
	shetty.setMovieName("Veeram");
	shetty.setNoOfAcs(10);
	shetty.setNoOfSeats(200);
	shetty.setHasParking(true);
	shetty.setNoOfDoors(4);
	shetty.setPrice(200);
	shetty.setNoOfTicketsAvailable(200);
	shetty.setShowTimings("3pm to 6pm");
	
	ArrayList<TheatreDTO> td=new ArrayList<TheatreDTO>();
	TheatreDTO sangam=new TheatreDTO("Sangam","kalburagi",200,10,true,4,200,200,"Brhamastra","12.30pm to 3.30pm");
	TheatreDTO shilpa=new TheatreDTO("Shilpa","Belgaum",100,15,false,2,150,100,"Jaanu","6pm to 9pm");
	TheatreDTO meenakshi=new TheatreDTO("Meenakshi","Gadag",200,10,true,4,200,200,"Badava Rascal","12.30pm to 3.30pm");
	TheatreDTO mukta=new TheatreDTO("Mukta","Benglore",180,8,true,4,250,180,"Love Moktail","12.30pm to 3.30pm");
	TheatreDTO vishnu=new TheatreDTO("Vishnu","Mysore",200,10,true,4,280,200,"Sita Ramam","2pm to 5pm");
	TheatreDTO sara=new TheatreDTO("Sara","Koppala",200,15,true,6,300,200,"Vikram Vedam","12.30pm to 3.30pm");
	TheatreDTO ciniplex=new TheatreDTO("Ciniplex","Bidar",150,5,false,2,150,150,"Diya","12.30pm to 3.30pm");
	TheatreDTO pvr=new TheatreDTO("PVR","Hasan",200,10,true,4,200,200,"Fida","1pm to 4pm");
	TheatreDTO esqare=new TheatreDTO("Esqure","Mandya",250,10,true,6,300,250,"Pailwan","12.30pm to 3.30pm");
	TheatreDTO bigcinemas=new TheatreDTO("Bigcinemas","pune",200,10,true,4,180,200,"Sooryawanshi","12.30pm to 3.30pm");
	
	service.save(bigcinemas);
	service.save(esqare);
	service.save(pvr);
	service.save(ciniplex);
	service.save(sara);
	service.save(vishnu);
	service.save(mukta);
	service.save(meenakshi);
	service.save(shilpa);
	service.save(sangam);
	service.save(shetty);
	service.save(ionox);
	service.save(shalini);
	service.save(mohini);
	service.save(miraz);
	
//ArrayList<TheatreDTO> theatrelist=new ArrayList<TheatreDTO>();
//	theatrelist.add(bigcinemas);
//    theatrelist.add(esqare);
//	theatrelist.add(pvr);
//	theatrelist.add(ciniplex);
//	theatrelist.add(sara);
//    theatrelist.add(vishnu);
//	theatrelist.add(mukta);
//	theatrelist.add(meenakshi);
//	theatrelist.add(shilpa);
//	theatrelist.add(sangam);
//	theatrelist.add(shetty);
//	
//	theatrelist.add(ionox);
//	theatrelist.add(shalini);
//	theatrelist.add(mohini);
//	theatrelist.add(miraz);
		
	System.out.println(service.save(bigcinemas));
	
	     List<TheatreDTO> read =service.read();
	     for (TheatreDTO theatreDTO : read) {
			System.out.println(theatreDTO);
	
	}
	
	service.findByName("Mohini");  

	             TheatreDTO th=service.deleteByIndex(2);
	             for(TheatreDTO theatredto: read) {
	            	 System.out.println(theatredto);
	             }
	
	
	}
	
}
