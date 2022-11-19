package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class ReversalOfAString {
	public static void main(String[] args) {
		
		System.out.println("Enter a string that has to be reversed");
		Scanner s1=new Scanner(System.in);
	while(true) {
			String s = s1.nextLine();
		String rev=" ";
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);	
		}
		System.out.println(rev);
		
	}
	}
}