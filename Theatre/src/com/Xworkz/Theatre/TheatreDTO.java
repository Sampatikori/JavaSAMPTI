package com.Xworkz.Theatre;

public class TheatreDTO {
	private String name;
	private String location;
	private int noOfSeats;
	private int noOfAcs;
	private boolean hasParking;
	private int noOfDoors;
	private int price;
	private int noOfTicketsAvailable;
	private String movieName;
	private String showTimings;
	public String getName() {
		return name;
	}
	public TheatreDTO (){
		System.out.println("I'm default constructor");
	}
	public TheatreDTO(String name, String location, int noOfSeats, int noOfAcs, boolean hasParking, int noOfDoors,
			int price, int noOfTicketsAvailable, String movieName, String showTimings) {
		super();
		this.name = name;
		this.location = location;
		this.noOfSeats = noOfSeats;
		this.noOfAcs = noOfAcs;
		this.hasParking = hasParking;
		this.noOfDoors = noOfDoors;
		this.price = price;
		this.noOfTicketsAvailable = noOfTicketsAvailable;
		this.movieName = movieName;
		this.showTimings = showTimings;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getNoOfAcs() {
		return noOfAcs;
	}
	public void setNoOfAcs(int noOfAcs) {
		this.noOfAcs = noOfAcs;
	}
	public boolean isHasParking() {
		return hasParking;
	}
	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfTicketsAvailable() {
		return noOfTicketsAvailable;
	}
	public void setNoOfTicketsAvailable(int noOfTicketsAvailable) {
		this.noOfTicketsAvailable = noOfTicketsAvailable;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTimings() {
		return showTimings;
	}
	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TheatreDTO [name=" + name + ", location=" + location + ", noOfSeats=" + noOfSeats + ", noOfAcs="
				+ noOfAcs + ", hasParking=" + hasParking + ", noOfDoors=" + noOfDoors + ", price=" + price
				+ ", noOfTicketsAvailable=" + noOfTicketsAvailable + ", movieName=" + movieName + ", showTimings="
				+ showTimings + "]";
	}
	

	
}
