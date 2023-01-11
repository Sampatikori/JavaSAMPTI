package com.Xworkz.soap;

import java.util.List;

import com.Xworkz.soap.dto.SoapDto;
import com.Xworkz.soap.repo.SoapRepo;
import com.Xworkz.soap.repo.SoapRepoImpl;
public class SoapRunner {

	public static void main(String[] args) {
		SoapRepo repo=new SoapRepoImpl();
		
		SoapDto dto1=new SoapDto(2, "Santoor", "White", "Sandal", 30, "20/2021", "Humans", 49);
		SoapDto dto2=new SoapDto(3, "Dove", "White", "Milk", 25, "10/2020", "Humans", 60);
		SoapDto dto3=new SoapDto(4, "Wheel", "Green", "Jasmine", 40, "11/2019", "Cleaning", 50);
		SoapDto dto4=new SoapDto(5, "Vim", "Dark Green", "Neem",20, "20/2021", "Cleaning", 20);
		SoapDto dto5=new SoapDto(6, "Liril", "Black", "Lilly", 25, "15/2019", "Humans", 60);
		SoapDto dto6=new SoapDto(7, "Pears", "Blue", "Sandal", 25, "22/2023", "Humans", 50);
		SoapDto dto7=new SoapDto(8, "Medimix", "Brown", "Alovera", 35, "19/2020", "Humans", 15);
		SoapDto dto8=new SoapDto(9, "Castile", "white", "natural", 25, "28/2022", "Dogs", 30);
		SoapDto dto9=new SoapDto(10, "Iilio", "Orange", "Glycerine", 20, "30/2024", "Dogs", 20);
		SoapDto dto10=new SoapDto(11, "No.1", "Red", "Jasmine", 25, "10/2020", "Humans", 50);
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
//		repo.save(dto10);
		
		List<SoapDto> list=repo.readAll();
		for (SoapDto soapDto : list) {
			System.out.println(soapDto);
			}
		
		
		System.out.println(repo.findByNameAndPrice("Dove",60));
		
		System.out.println(repo.updateNameByPrice("Lifeboy", 15));
		
		System.out.println(repo.updateColourAndFragranceByName("White", "Rose", "Pears"));
		
		System.out.println(repo.updateTypeById("ClothsCleaning", 5));


		
		

		

	}

}
