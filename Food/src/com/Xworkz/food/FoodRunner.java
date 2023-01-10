package com.Xworkz.food;

import com.Xworkz.foodDto.FoodDto;
import com.Xworkz.foodRepo.FoodRepo;
import com.Xworkz.foodRepo.FoodRepoImpl;

public class FoodRunner {

	public static void main(String[] args) {
		FoodRepo repo=new FoodRepoImpl();
		
		FoodDto dto=new FoodDto(1, "Dosa", "Gold", "Veg", 30);
		repo.save(dto);

	}

}
