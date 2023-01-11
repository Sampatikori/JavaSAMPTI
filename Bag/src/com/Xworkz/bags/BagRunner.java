package com.Xworkz.bags;

import com.Xworkz.bags.dto.BagDto;
import com.Xworkz.bags.repo.BagRepo;
import com.Xworkz.bags.repo.BagRepoImpl;

public class BagRunner {

	public static void main(String[] args) {
		BagRepo repo=new BagRepoImpl();
		
		BagDto dto1=new BagDto(2,  "Wildcraft", "Black", 1200, "6kg");
		BagDto dto2=new BagDto(3,  "Wesley", "Red", 600, "4kg");
		BagDto dto3=new BagDto(4,  "Safari Flash", "Pink", 700, "7kg");
		BagDto dto4=new BagDto(5,  "American Tourister", "Silver", 1500, "8kg");
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
		
//		repo.read();
		System.out.println(repo.findByName("American Tourister"));
		System.out.println(repo.findByNameAndId("Wesley", 3));

	}

}
