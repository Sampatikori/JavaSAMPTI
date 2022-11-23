package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner s1=new Scanner(System.in);
	while(true){
	int n=s1.nextInt();
	int num=n;
	int i,a=0;
	for(i=2; i<num; i++) {
		if(num%i==0) {
			a=a+1;}}
	if(a>0) {
		System.out.println("given number is not a prime number");
	}
	else {
			
			System.out.println("given number is a prime number");
			
		}
		
	
}
}}
