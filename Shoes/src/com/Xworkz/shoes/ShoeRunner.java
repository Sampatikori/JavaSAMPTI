package com.Xworkz.shoes;

import com.Xworkz.shoes.dto.ShoeDto;
import com.Xworkz.shoes.repo.ShoeRepo;
import com.Xworkz.shoes.repo.ShoeRepoImpl;

public class ShoeRunner {

	public static void main(String[] args) {
		
		ShoeRepo repo=new ShoeRepoImpl();
		
		ShoeDto dto1=new ShoeDto(3, "Nike", 9, "Blue", 2000);
		ShoeDto dto2=new ShoeDto(4, "Fila", 5, "Brown", 1200);
		ShoeDto dto3=new ShoeDto(5, "Bata", 11, "Green", 500);
		ShoeDto dto4=new ShoeDto(6, "Rebock", 10, "Pink", 600);
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);

//		repo.read();
		System.out.println(repo.findByName("Fila"));
		System.out.println(repo.findByNameAndId("Bata", 13));
	}

}
