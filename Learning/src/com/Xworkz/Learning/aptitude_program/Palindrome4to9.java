package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Palindrome4to9 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num = 4;
		
			while (true) {
				num = s1.nextInt();
				int n = num;
				int fact = 1;
				if (num >= 4 && num <= 9) {
				for (int i = 1; i <= n; i++) {
					
					
					fact = fact * i;
				}
				System.out.println(fact);

			}
		}
	}}