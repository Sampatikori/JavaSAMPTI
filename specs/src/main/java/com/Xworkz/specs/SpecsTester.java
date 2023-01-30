package com.Xworkz.specs;

import java.util.List;

import com.Xworkz.specs.dto.SpecsDto;
import com.Xworkz.specs.service.SpecsService;
import com.Xworkz.specs.service.SpecsServiceImpl;

public class SpecsTester {

	public static void main(String[] args) {
		
		SpecsService service=new SpecsServiceImpl();
		
		SpecsDto dto=new SpecsDto(1, "Lenskart", "White", "round", 800);
		SpecsDto dto1=new SpecsDto(2, "Fastrack", "Black", "Square", 1000);
		SpecsDto dto2=new SpecsDto(3, "Polaroid", "Blue", "ovel", 600);
		SpecsDto dto3=new SpecsDto(4, "Prada", "Gray", "rectangle", 1200);
		SpecsDto dto4=new SpecsDto(5, "Carrera", "Gold", "hexagon", 900);
		
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto);
		
//		List list=service.read();
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		System.out.println(service.findByShapeAndPrice("Square", 1000));
//		boolean status=service.updatePriceByName(1500, "Lenskart");
//		System.out.println(status);
//		boolean status=service.updateColorByPriceAndShape("Red", 900, "Gold");
//		System.out.println(status);
		
//		boolean status=service.deleteByPriceAndColor(600, "Blue");
//		System.out.println(status);
		
		boolean status=service.deleteByNameAndId("Fastrack", 2);
		System.out.println(status);
	}

}
