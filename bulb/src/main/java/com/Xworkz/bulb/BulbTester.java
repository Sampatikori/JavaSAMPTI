package com.Xworkz.bulb;

import java.util.List;

import com.Xworkz.bulb.dto.BulbDto;
import com.Xworkz.bulb.service.BulbService;
import com.Xworkz.bulb.service.BulbServiceImpl;

public class BulbTester {

	public static void main(String[] args) {
		BulbService service = new BulbServiceImpl();

		BulbDto dto = new BulbDto(1, "Nippo", 3, "White", "LED");
		BulbDto dto1 = new BulbDto(2, "Philips", 120, "Yellow", "CFL");
		BulbDto dto2 = new BulbDto(3, "Panasonic", 25, "White", "FLB");
		BulbDto dto3 = new BulbDto(4, "Halonix", 50, "Blue", "halogen");
		BulbDto dto4 = new BulbDto(5, "Crompton", 30, "White", "incandescent");
		BulbDto dto5 = new BulbDto(6, "Errol", 2, "Green", "LED");
		BulbDto dto6 = new BulbDto(7, "Havells", 100, "White", "CFL");
		BulbDto dto7 = new BulbDto(8, "Citra", 15, "RED", "LED");

//		service.create(dto);
//		service.create(dto1);
//		service.create(dto2);
//		service.create(dto3);
//		service.create(dto4);
//		service.create(dto5);
//		service.create(dto6);
//		service.create(dto7);

//		System.out.println(service.readAll());
//		List<BulbDto> list = service.readAll();
//		for (BulbDto bulbDto : list) {
//			System.out.println(bulbDto);
//		}

//		BulbDto bulbdto=service.findByName("Citra");
//		System.out.println(bulbdto);



	List<BulbDto> list =service.readAll();
	for (BulbDto bulbDto : list) {
		System.out.println(bulbDto);
	}
		
	}
	}
