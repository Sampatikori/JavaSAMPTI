package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class CheckPerfectSquare2 {
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		double number=sc.nextDouble();
		if(checkperfectsqare(number)) { 
			System.out.println("true");}
		else { 
			System.out.println("false");
		}}
	static boolean checkperfectsqare(double number) {
		for(int i=1; i*i<=number; i++) {
			if((number%i==0) && (number/i==i)) {
				return true;
		}		
	}
		return false;
	}
}
		
