package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args) {
	int i,n,a=0;
	System.out.println("enter a number");
	Scanner s1=new Scanner(System.in);
	n=s1.nextInt();
	for(i=2; i<n-1; i++) {
		if(n%i==0) {
			a=a+1;}}
	if(a>0) {
		System.out.println("given number is not a prime number");
	}
	else {
			
			System.out.println("given number is a prime number");
			
		}
		
}
}
