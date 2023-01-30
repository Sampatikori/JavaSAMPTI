package com.Xworkz.specs.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="specs")
@NamedQuery(name="read",query="select dto from SpecsDto dto")
@NamedQuery(name="findByShapeAndPrice",query="select dto from SpecsDto dto where dto.shape=:sh and dto.price=:pr")
@NamedQuery(name="updatePriceByName",query="update  SpecsDto dto set dto.price=:price where dto.name=:name")
@NamedQuery(name="updateColorByPriceAndShape",query="update SpecsDto dto set dto.colour=:colour where dto.price=:price and dto.shape=:shape")
@NamedQuery(name="deleteByPriceAndColor",query="delete SpecsDto dto where dto.price=:pr and dto.colour=:clr")
@NamedQuery(name="deleteByNameandId",query="delete SpecsDto dt where dt.name=:nm and dt.id=:id")
public class SpecsDto {

	 @Id
	 private int id;
	 private String name;
	 private String colour;
	 private String shape;
	 private int price;
	 
	public SpecsDto() {
		super();
	}

	public SpecsDto(int id, String name, String colour, String shape, int price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.shape = shape;
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SpecsDto [id=" + id + ", name=" + name + ", colour=" + colour + ", shape=" + shape + ", price=" + price
				+ "]";
	}
	 
	 
}
