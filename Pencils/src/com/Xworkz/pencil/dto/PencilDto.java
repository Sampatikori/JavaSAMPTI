package com.Xworkz.pencil.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@NoArgsConstructor
@Table(name = "PencilDto")
@ToString

public class PencilDto {
	
	private int id;
	private String name;
	private int price;
	private String type;
	private String size;
	
	public PencilDto(int id, String name, int price, String type, String size) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.size = size;
	}
	

}
