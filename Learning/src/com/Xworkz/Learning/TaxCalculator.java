package com.Xworkz.Learning;

public class TaxCalculator implements StateTax,CentralTax {

	public void incomeTax() {
		System.out.println("income tax is 2000Rs/-");
		
	}

	public void electricityTax() {
		System.out.println("electricity tax is 200Rs/-");
		
	}

}
