package com.xorkz.highway;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class HighwayDTO {
	private String name;
	private int size;
	private int average;
	private boolean connection;
	private int noOfTolls;

}
