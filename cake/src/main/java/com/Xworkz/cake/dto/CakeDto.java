package com.Xworkz.cake.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cake")
public class CakeDto {
	@Id
	private int id;
	private String flavourName;
	private int price;
	private String colour;
	private String weight;

	public CakeDto() {
		super();
	}

	public CakeDto(int id, String flavourName, int price, String colour, String weight) {
		super();
		this.id = id;
		this.flavourName = flavourName;
		this.price = price;
		this.colour = colour;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlavourName() {
		return flavourName;
	}

	public void setFlavourName(String flavourName) {
		this.flavourName = flavourName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "CakeDto [id=" + id + ", flavourName=" + flavourName + ", price=" + price + ", colour=" + colour
				+ ", weight=" + weight + "]";
	}

}
