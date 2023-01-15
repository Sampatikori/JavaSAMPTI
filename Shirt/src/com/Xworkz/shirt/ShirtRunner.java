package com.Xworkz.shirt;

import java.util.List;

import com.Xworkz.shirt.dto.ShirtDto;
import com.Xworkz.shirt.repo.ShirtRepo;
import com.Xworkz.shirt.repo.ShirtRepoImpl;

public class ShirtRunner {
	public static void main(String[] args) {
		ShirtRepo repo=new ShirtRepoImpl();
		
		ShirtDto puma = new ShirtDto(2,"puma","pink","XL",true);
		ShirtDto Addidas = new ShirtDto(3,"Addidas","red","L",false);
		ShirtDto Mafti = new ShirtDto(4,"Mafti","White","S",true);
		ShirtDto peter = new ShirtDto(5,"Peter england","Orange","XXL",false);
		ShirtDto Alled = new ShirtDto(6,"Allen solly","blue","XS",false);
		
//		repo.save(Alled);
//		repo.save(peter);
//		repo.save(Mafti);
//		repo.save(Addidas);
//		repo.save(puma)
		
//		List<ShirtDto> list=repo.read();
//		for (ShirtDto shirtDto : list) {
//			System.out.println(shirtDto);
//			}
		
//		System.out.println(repo.findNameAndId("Peter england",5));
//		System.out.println(repo.findNameAndId("Mafti", 4));
		
		repo.updateSizeByName("XL", "Mafti");
//		List<ShirtDto> list=repo.read();
//		for (ShirtDto shirtDto : list) {
//			System.out.println(shirtDto);
//			}
		
		System.out.println(repo.deleteByColour("red"));
//		List<ShirtDto> list=repo.read();
//		for (ShirtDto shirtDto : list) {
//			System.out.println(shirtDto);
//			}
		System.out.println(repo.deleteBySizeAndName("XL", "Mafti"));
		List<ShirtDto> list=repo.read();
		for (ShirtDto shirtDto : list) {
			System.out.println(shirtDto);
			}
	}

}
