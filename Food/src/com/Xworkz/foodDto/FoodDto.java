package com.Xworkz.foodDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class FoodDto {
 private int id;
 private String name;
 private String colour;
 private String type;
 private int price;
public FoodDto() {
	super();
}
public FoodDto(int id, String name, String colour, String type, int price) {
	super();
	this.id = id;
	this.name = name;
	this.colour = colour;
	this.type = type;
	this.price = price;
}
}
