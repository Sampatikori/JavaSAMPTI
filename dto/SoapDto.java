package com.Xworkz.soap.dto;

public class SoapDto {
	private int id;
	private String name;
	private String colour;
	private String fragrance;
	private int weightInGrams;
	private String manufacturedate;
	private String type;
	private int price;
	
	public SoapDto() {
		super();
	}

	public SoapDto(int id, String name, String colour, String fragrance, int weightInGrams, String manufacturedate,
			String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.fragrance = fragrance;
		this.weightInGrams = weightInGrams;
		this.manufacturedate = manufacturedate;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFragrance() {
		return fragrance;
	}

	public void setFragrance(String fragrance) {
		this.fragrance = fragrance;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getManufacturedate() {
		return manufacturedate;
	}

	public void setManufacturedate(String manufacturedate) {
		this.manufacturedate = manufacturedate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SoapDto [id=" + id + ", name=" + name + ", colour=" + colour + ", fragrance=" + fragrance
				+ ", weightInGrams=" + weightInGrams + ", manufacturedate=" + manufacturedate + ", type=" + type
				+ ", price=" + price + "]";
	}
	
	

}
