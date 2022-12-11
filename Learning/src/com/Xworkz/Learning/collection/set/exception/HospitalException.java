package com.Xworkz.Learning.collection.set.exception;

public class HospitalException extends Exception{

	@Override
	public String toString() {
		return "no content found in Hospital detail in request";
	}

	@Override
	public String getMessage() {
		
		return "Hospital not found";
	}
	

}
