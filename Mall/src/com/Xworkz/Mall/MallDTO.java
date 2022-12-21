package com.Xworkz.Mall;

public class MallDTO {
private String name;
private String location;
private int no_of_flors;
private int no_of_shops;
private boolean hasParking;

public MallDTO() {
	System.out.println("iam default constructor");
}

public MallDTO(String name, String location, int no_of_flors, int no_of_shops, boolean hasParking) {
	super();
	System.out.println("iam parameterized constructor");
	this.name = name;
	this.location = location;
	this.no_of_flors = no_of_flors;
	this.no_of_shops = no_of_shops;
	this.hasParking = hasParking;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getNo_of_flors() {
	return no_of_flors;
}
public void setNo_of_flors(int no_of_flors) {
	this.no_of_flors = no_of_flors;
}
public int getNo_of_shops() {
	return no_of_shops;
}
public void setNo_of_shops(int no_of_shops) {
	this.no_of_shops = no_of_shops;
}
public boolean isHasParking() {
	return hasParking;
}
public void setHasParking(boolean hasParking) {
	this.hasParking = hasParking;
}

@Override
public String toString() {
	return "MallDTO [name=" + name + ", location=" + location + ", no_of_flors=" + no_of_flors + ", no_of_shops="
			+ no_of_shops + ", hasParking=" + hasParking + "]";
}

}
