package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class CheckPerfectSqure1 {
	static boolean checkperfectsqare(double number) {
		double sqrt=Math.sqrt(number);
		return(sqrt-Math.floor(sqrt) == 0);	
	}
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		double number=sc.nextDouble();
		if(checkperfectsqare(number)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
