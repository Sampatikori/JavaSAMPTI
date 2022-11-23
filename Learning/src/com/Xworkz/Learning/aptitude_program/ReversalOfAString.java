package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class ReversalOfAString {
	public static void main(String[] args) {
		
		System.out.println("Enter a name");
		Scanner s1=new Scanner(System.in);
	while(true) {
			String s = s1.nextLine();
		String name = s;
		String rev="";
		int length = s.length();
		for(int i=length-1; i>=0; i--) {
			rev=rev+s.charAt(i);	
		}
		if(s.equals(rev)) 
			System.out.println(s+ " is palindrome");
		
		else 
			System.out.println(s+ " is not palindrome");
		
	}
	
	}
	}
