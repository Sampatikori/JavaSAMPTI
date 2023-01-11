package com.Xworkz.bags.dto;

public class BagDto {
	private int id;
	private String brandName;
	private String colour;
	private int price;
	private String capacity;
	
	public BagDto() {
		super();
	}

	public BagDto(int id, String brandName, String colour, int price, String capacity) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.colour = colour;
		this.price = price;
		this.capacity = capacity;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "BagDto [id=" + id + ", brandName=" + brandName + ", colour=" + colour + ", price=" + price
				+ ", capacity=" + capacity + "]";
	}
	
	

}
