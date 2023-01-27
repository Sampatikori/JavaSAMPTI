package com.Xworkz.bulb.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="bulb")
@NamedQuery(name="bulbname",query="select bulb from BulbDto bulb where bulb.brandName=:bn")
@NamedQuery(name="readAll", query="select read from BulbDto read")
public class BulbDto {
	@Id
	private int id;
	private String brandName;
	private int volt;
	private String colour;
	private String type;

	public BulbDto() {
		super();
	}

	public BulbDto(int id, String brandName, int volt, String colour, String type) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.volt = volt;
		this.colour = colour;
		this.type = type;
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

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
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
		return "BulbDto [id=" + id + ", brandName=" + brandName + ", volt=" + volt + ", colour=" + colour + ", type="
				+ type + "]";
	}

}
