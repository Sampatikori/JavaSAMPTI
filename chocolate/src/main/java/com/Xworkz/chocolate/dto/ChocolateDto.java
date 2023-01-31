package com.Xworkz.chocolate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="chocolate")
@NamedQuery(name="readAll",query="select dto from ChocolateDto dto")
@NamedQuery(name="findByColourAndWeight",query="select dto from ChocolateDto dto where dto.colour=:clr and dto.weight=:wt")
@NamedQuery(name="findByPriceAndname",query="select dto from ChocolateDto dto where dto.price=:price and dto.name=:name")
@NamedQuery(name="updateWeightByNameAndColour",query="update ChocolateDto dto set dto.weight=:wt where dto.name=:name and dto.colour=:colour")
@NamedQuery(name="updateNameByIdAndWeight",query="update ChocolateDto dto set dto.name=:nm where dto.id=:id and dto.weight=:wt")
@NamedQuery(name="deleteByColourAndName", query="delete ChocolateDto dto where dto.colour=:clr and dto.name=:nm")




public class ChocolateDto {
	@Id
	private int id;
	private String name;
	private int price;
	private String colour;
	private String weight;
	
	public ChocolateDto() {
		super();
	}

	public ChocolateDto(int id, String name, int price, String colour, String weight) {
		super();
		this.id = id;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "ChocolateDto [id=" + id + ", name=" + name + ", price=" + price + ", colour=" + colour + ", weight="
				+ weight + "]";
	}
	
	

}
