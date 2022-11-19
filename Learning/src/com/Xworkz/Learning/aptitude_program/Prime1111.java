package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Prime1111 {
	static boolean checkprime(int num) {
		for(int i=2; i<num; i++) {
			if(num %i==0) {
				return false;
			}
		}
			return true;
	}
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(checkprime(a)) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
	
	}	
	}

}
