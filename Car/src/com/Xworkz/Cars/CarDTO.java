package com.Xworkz.Cars;

public class CarDTO {
	private String Brand;
	private int Price;
	private String colour;
	private String Type;
	private int Speed;
	
	
	public CarDTO(String brand, int price, String colour, String type, int speed) {
		super();
		Brand = brand;
		Price = price;
		this.colour = colour;
		Type = type;
		Speed = speed;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getType() {
		return Type;
	}


	public void setType(String type) {
		Type = type;
	}


	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}


	@Override
	public String toString() {
		return "CarDTO [Brand=" + Brand + ", Price=" + Price + ", colour=" + colour + ", Type=" + Type + ", Speed="
				+ Speed + "]";
	}
	
	
	
	

}
