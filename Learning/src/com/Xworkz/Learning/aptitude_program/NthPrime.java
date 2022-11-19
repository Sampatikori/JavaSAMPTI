package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class NthPrime {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1, count=0,i;
		while(count <n) {
			num=num+1;
			for(i=2; i<=num; i++)
				if(num%i==0)
					break;
			if(i==num)
				count++;
		}
		System.out.println(num);
		
	}

}
