package com.Xworkz.Learning.exception.checkedException;

public class Customer {
	public static void main(String[] args) {
		int amount=50000;
		ATMMachine atm=new ATMMachine();
		try {
			atm.draw(amount);
		}
		catch(AtmException e)
		{
			if(amount%100!=0) {
				System.out.println(e);
			}
			else System.out.println(e.getMessage());
		}
			
		}
			
		}
		
	


