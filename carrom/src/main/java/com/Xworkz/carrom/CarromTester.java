package com.Xworkz.carrom;

import com.Xworkz.carrom.dto.CarromDto;
import com.Xworkz.carrom.service.CarromService;
import com.Xworkz.carrom.service.CarromServiceImpl;

public class CarromTester {

	public static void main(String[] args) {
		
		CarromService service=new CarromServiceImpl();
		
		CarromDto dto1=new CarromDto(1, "Spider", "40cm", "White", 10, 10, 2, 900);
		CarromDto dto2=new CarromDto(2, "Camelin", "55cm", "White", 12, 12, 3, 1000);
		CarromDto dto3=new CarromDto(3, "HVSports", "52cm", "Brown", 10, 10, 2, 1100);
		CarromDto dto4=new CarromDto(4, "Zoom", "45cm", "Cream", 9, 9, 2, 1000);
		CarromDto dto5=new CarromDto(5, "YDMC", "32cm", "Brown", 10, 10, 2, 1500);
		CarromDto dto6=new CarromDto(6, "Liger", "50cm", "White", 11, 11, 1, 1300);
		
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
		
//		System.out.println(service.findById(4));
		
//		System.out.println(service.updateNameById("Meta", 6));
		
		System.out.println(service.deleteById(3));
	}

}
