package com.Xworkz.watch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Xworkz.watch.dto.WatchDto;
import com.Xworkz.watch.service.WatchService;
import com.Xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {

	public static void main(String[] args) {
		
		WatchService service=new WatchServiceImpl();
		
		WatchDto dto2 = new WatchDto(2, "Titan", "golden", "Digital", 2000);
		WatchDto dto3 = new WatchDto(3, "Sonata", "Black", "Analog", 3900);
		WatchDto dto4 = new WatchDto(4, "Fastrack", "Silver", "Wrist watch", 4500);
		WatchDto dto5 = new WatchDto(5, "Tenten", "white", "Wall clock", 3999);
		WatchDto dto6 = new WatchDto(6, "Citizen", "golden", "Digital", 5400);
		WatchDto dto7 = new WatchDto(7, "Avacan", "white", "Wall Clock", 3048);
		WatchDto dto8 = new WatchDto(8, "Ajanta", "Black", "Analog", 7000);
		WatchDto dto9 = new WatchDto(9, "Maxima", "Pink", "Pendulam Watch", 4600);
		WatchDto dto10 = new WatchDto(10, "Fossil", "Blue", "Digital", 8999);
		WatchDto dto11 = new WatchDto(11, "Titan", "golden", "Analog", 2349);
		WatchDto dto12 = new WatchDto(12, "Venz", "Purple", "Analog", 2500);
		WatchDto dto13 = new WatchDto(13, "Samk", "Pink", "Wrist watch", 2599);
		WatchDto dto14 = new WatchDto(14, "Mehano", "golden", "Analog", 1500);
		WatchDto dto15 = new WatchDto(15, "Silicat", "Marron", "Digital", 3000);
		
		
//		service.save(dto10);
//		service.save(dto9);
//		service.save(dto8);
//		service.save(dto7);
//		service.save(dto6);
//		service.save(dto5);
//		service.save(dto4);
//		service.save(dto3);
//		service.save(dto2);
//		service.save(dto11);
		
		List<WatchDto> list=service.read();
		for (WatchDto watchDto : list) {
			System.out.println(watchDto);	
		}
		System.out.println(service.findByBrandnameAndColour("Fossil", "Blue"));
        System.out.println(service.findByIdandType(3, "Analog"));
		
		
		System.out.println(service.updateNameById("delta", 4));
		
		  boolean delete =service.deleteByColourAndType("white", "Wall Clock");
            for (WatchDto watchDto : list) {
            	System.out.println(watchDto);
				
			}
           List<WatchDto> list1=Arrays.asList(dto12,dto13,dto14,dto15);
           service.create(list1);
           
	}
	}


