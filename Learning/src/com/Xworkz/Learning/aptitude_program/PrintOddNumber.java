package com.Xworkz.Learning.aptitude_program;
import java.util.Scanner;
public class PrintOddNumber {

		public static void main(String[] args) {
			System.out.println("enter a number");
			Scanner sc=new Scanner(System.in);
			while(true) {
			int n=sc.nextInt();
			int num=n;
			for(int i=1; i<=n; i++) {
				if(i%2==1) {
					System.out.println(i);
				
				}
				}
			}
			
		}}


