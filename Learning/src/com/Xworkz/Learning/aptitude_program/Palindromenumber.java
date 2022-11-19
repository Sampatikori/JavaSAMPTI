package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class Palindromenumber {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value");
		while (true) {
			int n = s1.nextInt(); 
		
int num = n;
int n1 = num;
int sum =0;
int rem;
while (n1 !=0) {
	rem = n1%10;
	sum= sum *10+rem;
	n1 = n1/10;
}
if (num==sum) {
	System.out.println(num +" is palindrome");
}
else {
	System.out.println(num +" is  not palindrome");
}
}


	}
}

