package com.Xworkz.cake;

import com.Xworkz.cake.dto.CakeDto;
import com.Xworkz.cake.service.CakeService;
import com.Xworkz.cake.service.CakeServiceImpl;

public class CakeTester {

	public static void main(String[] args) {
		CakeService service = new CakeServiceImpl();
		
		CakeDto dto1 = new CakeDto(1, "Blackforest", 900,"Black", "1000g");
		CakeDto dto2 = new CakeDto(2, "Blackcurrent", 450,"Black", "500g");
		CakeDto dto3 = new CakeDto(3, "Redvalvet", 400,"Red", "500g");
		CakeDto dto4 = new CakeDto(4, "Chocolate", 300,"Black", "500g");
		CakeDto dto5 = new CakeDto(5, "Vanilla", 350,"White", "500g");
		CakeDto dto6 = new CakeDto(6, "FruitCake", 500,"White", "400g");
		CakeDto dto7 = new CakeDto(7, "CupCake", 200,"golden", "100g");
		CakeDto dto8 = new CakeDto(8, "AppleCake", 10,"Black", "100g");
		
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
//		service.save(dto7);
//		service.save(dto8);
		
//		System.out.println(service.findById(5));
//		service.updateNameById("Bluecurrent", 2);
		service.deleteById(7);

	}

}
