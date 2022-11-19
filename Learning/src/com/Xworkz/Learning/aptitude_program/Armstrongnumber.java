package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
	
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a number");
		
		while(true) {
		int num=s1.nextInt();
		
		int n=num,reminder,a;
		int sum=0;
	
		a=n;
		while(a!=0) {
			reminder=a%10;
		    sum+=Math.pow(reminder, 3);
		
		    a/=10;
		}
		        
		if(sum==n) {
			System.out.println(n +" is  an armstrong number");
		}
		else {
			System.out.println(n+" is not an armstrong number");
		}
		
}
}
}
