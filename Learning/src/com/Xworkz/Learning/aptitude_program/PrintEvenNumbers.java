package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			
			}
			}
		}
		
	}

