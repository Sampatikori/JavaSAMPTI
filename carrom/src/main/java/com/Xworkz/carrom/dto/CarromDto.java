package com.Xworkz.carrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrom")
public class CarromDto {
	@Id
	private int id;
	private String brandName;
	private String size;
	private String colour;
	private int noOfBlackCoins;
	private int noOfWhiteCoins;
	private int noOfStrigers;
	private int price;

	public CarromDto() {
		super();
	}

	public CarromDto(int id, String brandName, String size, String colour, int noOfBlackCoins, int noOfWhiteCoins,
			int noOfStrigers, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.size = size;
		this.colour = colour;
		this.noOfBlackCoins = noOfBlackCoins;
		this.noOfWhiteCoins = noOfWhiteCoins;
		this.noOfStrigers = noOfStrigers;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfBlackCoins() {
		return noOfBlackCoins;
	}

	public void setNoOfBlackCoins(int noOfBlackCoins) {
		this.noOfBlackCoins = noOfBlackCoins;
	}

	public int getNoOfWhiteCoins() {
		return noOfWhiteCoins;
	}

	public void setNoOfWhiteCoins(int noOfWhiteCoins) {
		this.noOfWhiteCoins = noOfWhiteCoins;
	}

	public int getNoOfStrigers() {
		return noOfStrigers;
	}

	public void setNoOfStrigers(int noOfStrigers) {
		this.noOfStrigers = noOfStrigers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarromDto [id=" + id + ", brandName=" + brandName + ", size=" + size + ", colour=" + colour
				+ ", noOfBlackCoins=" + noOfBlackCoins + ", noOfWhiteCoins=" + noOfWhiteCoins + ", noOfStrigers="
				+ noOfStrigers + ", price=" + price + "]";
	}

}
