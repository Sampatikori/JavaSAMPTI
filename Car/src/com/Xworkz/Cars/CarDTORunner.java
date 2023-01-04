package com.Xworkz.Cars;

import java.util.List;

import com.Xowrkz.Car.Service.CarService;
import com.Xowrkz.Car.Service.CarServiceImpl;

public class CarDTORunner {
	public static void main(String[] args) {
		
	CarService service=new CarServiceImpl();
     
	CarDTO audi =new CarDTO("Audi",187700,"Black","Top",100);
	CarDTO inova =new CarDTO("Inova",1100000,"White","City",80);
	CarDTO indica =new CarDTO("Indica",1300000,"Grey","Top",50);
	CarDTO benz =new CarDTO("Benz",1200000,"Orange","Top",90);
	CarDTO maruti800 =new CarDTO("Maruti800",2000000,"Yellow","Basic",85);
	
	service.save(maruti800);
	service.save(benz);
	service.save(indica);
	service.save(inova);
	service.save(audi);
	
//	System.out.println(service.save(benz));
	  
	     List<CarDTO> list=service.read();
	     for(CarDTO cardto: list) {
	    	 System.out.println(cardto);
	     }
	     
	     service.findByName("Audi");
	     
	     service.deleteByIndex(2);
	     for(CarDTO cd:list) {
	    	 System.out.println(cd);
	    	 
	     }
	  service.updateNameByIndex("Mercedes", 2);
	  for(CarDTO dt:list) {
	    	 System.out.println(dt);
	}
	 service.updateColourByIndex("Black", 2);
	  for(CarDTO cardto:list) {
		  System.out.println(cardto);
	  }
	  
	  CarDTO card=service.updateSpeedByBrand(50, "Benz");
	  for(CarDTO cd:list) {
		  System.out.println(cd);
	  }
	  
	  
	  
}}