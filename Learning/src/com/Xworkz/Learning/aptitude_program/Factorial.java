package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("enter a number");
		Scanner s1=new Scanner(System.in);
		while(true) {
		int n=s1.nextInt();
		int f=1,i;
		int num =n;
		
		for(i=1; i<=num; i++) {
			f=f*i;
		}
		System.out.println("Factorial of a given number= "+ f);
	}

}}
