package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class SumOfNnumbers {
	public static void main(String[] args) {
		System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++) {
		sum=sum+i;
	}
	System.out.println("sum of n numbers "+ sum);
	}

}
