package com.Xworkz.treeDto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TreeDto {
	private int id;
	private String name;
	private String colour;
	private String height;
	private String diameter;
	
	
	public TreeDto() {
		super();
	}

	public TreeDto(int id, String name, String colour, String height, String diameter) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.height = height;
		this.diameter = diameter;
	}
}
