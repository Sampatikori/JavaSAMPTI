package com.Xworkz.television;

public class TelevisionDTO {
	private String brandname;
	private String size;
	private int price;
	private String colour;
	private String type;
	
	
	public TelevisionDTO() {
		super();
	}


	public TelevisionDTO(String brandname, String size, int price, String colour, String type) {
		super();
		this.brandname = brandname;
		this.size = size;
		this.price = price;
		this.colour = colour;
		this.type = type;
	}


	public String getBrandname() {
		return brandname;
	}


	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TelevisionDTO [brandname=" + brandname + ", size=" + size + ", price=" + price + ", colour=" + colour
				+ ", type=" + type + "]";
	}
	
	
	
	

}
