package com.Xworkz.Learning.aptitude_program;

public class Reverseofnum {
	public static void main(String[] args) {
		int n=1234,rev=0,r;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
		
	}

}
