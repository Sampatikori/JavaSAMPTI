package com.Xworkz.Learning.aptitude_program.arrays;

import java.util.Scanner;

public class ElementsInReverse {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int size=s1.nextInt();
		int a[]=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0; i<a.length; i++) {
			a[i]=s1.nextInt();
			}
		System.out.println("Original elements");//
		for(int i=0; i<a.length; i++ ) {//
			System.out.print(a[i] +" ");//
		}
		System.out.println();
		System.out.println("Reverse of elements");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i] +" ");
			
		}
		
	}

}
