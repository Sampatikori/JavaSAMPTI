package com.Xworkz.shoes.dto;

public class ShoeDto {
	private int id;
	private String brandName;
	private int size;
	private String colour;
	private int price;
	
	public ShoeDto() {
		super();
	}

	public ShoeDto(int id, String brandName, int size, String colour, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.size = size;
		this.colour = colour;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	@Override
	public String toString() {
		return "ShoeDto [id=" + id + ", brandName=" + brandName + ", size=" + size + ", colour=" + colour + ", price="
				+ price + "]";
	}
	

}
