package com.Xworkz.ac.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "ac")
public class AcDto {
	
	@Id
	private int id;
	private String brandName;
	private String weight;
	private int price;
	private String colour;
	
	public AcDto() {
		super();
	}
	public AcDto(int id, String brandName, String weight, int price, String colour) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
		this.colour = colour;
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
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
	@Override
	public String toString() {
		return "AcDto [id=" + id + ", brandName=" + brandName + ", weight=" + weight + ", price=" + price + ", colour="
				+ colour + "]";
	}
	
	

}
