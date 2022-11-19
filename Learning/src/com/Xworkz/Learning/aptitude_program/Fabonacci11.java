package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Fabonacci11 {
	public static void main(String[] args) {
		System.out.println("enter the number of terms");
		Scanner s1 = new Scanner(System.in);
		while (true) {
			int number = s1.nextInt();
			int sam=number;
			int first = 0, second = 1, next = 0, i;
			System.out.print(first+" "+second);
		
			for (i = 2; i < sam; i++) {
			
					next = first + second;
					System.out.print(" "+next);
					first = second;
					second = next;
				}
				
			}

		}

	}


