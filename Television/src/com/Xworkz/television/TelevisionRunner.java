package com.Xworkz.television;

import java.util.List;

import com.Xworkz.television.service.TelevisionService;
import com.Xworkz.television.service.TelevisionServiceImpl;

public class TelevisionRunner {
	public static void main(String[] args) {
		TelevisionService service=new TelevisionServiceImpl();
		
		TelevisionDTO sony=new TelevisionDTO("Sony", "64inch", 40000, "Pink", "LED");
		TelevisionDTO lg=new TelevisionDTO("LG", "52inch", 35000, "Blue", "OLED");
		TelevisionDTO samsung=new TelevisionDTO("Samsung", "75inch", 50000, "Black", "LED");
		TelevisionDTO vizio=new TelevisionDTO("Vizio", "55inch", 40000, "Red", "QLED");
		TelevisionDTO tlc=new TelevisionDTO("TLC", "80inch", 75000, "Blue", "OLED");
		
		service.save(tlc);
		service.save(sony);
		service.save(lg);
		service.save(samsung);
		service.save(vizio);
		
		List<TelevisionDTO> list=service.read();
		for (TelevisionDTO televisionDTO : list) {
			System.out.println(televisionDTO);
			
		}
			
			TelevisionDTO dto2=service.updateSizeByType("80inch", "OLED");
			for (TelevisionDTO televisionDTO : list) {
				System.out.println(televisionDTO);
		}
		
			TelevisionDTO dto3=service.deleteByNameAndColour("LG", "Blue");
			for (TelevisionDTO televisionDTO : list) {
				System.out.println(televisionDTO);
		}
			
			TelevisionDTO dto4=service.findBYNameAndSize("Sony", "64inch");	
			for (TelevisionDTO televisionDTO : list) {
				System.out.println(televisionDTO);
		}
			
			TelevisionDTO dto5=service.findTypeAndColourByIndex("QLED", "Red", 4);
			for (TelevisionDTO televisionDTO : list) {
				System.out.println(televisionDTO);
		}
	}}


