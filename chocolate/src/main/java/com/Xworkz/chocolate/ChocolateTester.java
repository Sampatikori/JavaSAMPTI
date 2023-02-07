package com.Xworkz.chocolate;

import java.util.Arrays;
import java.util.List;

import com.Xworkz.chocolate.dto.ChocolateDto;
import com.Xworkz.chocolate.service.ChocolateService;
import com.Xworkz.chocolate.service.ChocolateServiceImpl;

public class ChocolateTester {

	public static void main(String[] args) {
		
		ChocolateService service=new ChocolateServiceImpl();
		
		ChocolateDto dto=new ChocolateDto(1, "DairyMilk", 10, "Brown", "180g");
		ChocolateDto dto1=new ChocolateDto(2, "Milkybar", 20, "White", "160g");
		ChocolateDto dto2=new ChocolateDto(3, "5Star", 10, "DarkBrown", "200g");
		ChocolateDto dto3=new ChocolateDto(4, "Munch", 5, "Brown", "150g");
		ChocolateDto dto4=new ChocolateDto(5, "Kitkat", 10, "LightBrown", "120g");
		ChocolateDto dto5=new ChocolateDto(6, "3Star", 10, "DarkBrown", "200g");
		ChocolateDto dto6=new ChocolateDto(7, "cunch", 5, "Brown", "150g");
		ChocolateDto dto7=new ChocolateDto(8, "tkat", 10, "LightBrown", "120g");
		
		
		List<ChocolateDto> lis =Arrays.asList(dto5,dto6,dto7);
//		service.create(lis);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto);
		
//		List<ChocolateDto> list=service.readAll();
//		for (ChocolateDto chocolateDto : list) {
//			System.out.println(chocolateDto);
//			
//		}
		
//       System.out.println(service.findByColourAndWeight("LightBrown", "120g"));
//		System.out.println(service.findByPriceAndname(10, "5Star"));
//		System.out.println(service.updateWeightByNameAndColour("140g", "Kitkat", "LightBrown"));
//		System.out.println(service.updateNameByIdAndWeight("Crunch", 4, "150g"));
//		
		System.out.println(service.deleteByColourAndName("White", "Milkybar"));
		
	}

}
