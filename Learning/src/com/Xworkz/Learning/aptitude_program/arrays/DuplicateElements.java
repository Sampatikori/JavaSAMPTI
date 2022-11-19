package com.Xworkz.Learning.aptitude_program.arrays;

import java.util.Scanner;

public class DuplicateElements {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int size=s1.nextInt();
	int arr[]=new int[size];
	System.out.println("enter "+size+" elements");
	for(int i=0; i<arr.length; i++) {
		arr[i]=s1.nextInt();
	}
		System.out.println("duplicate elements");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
	}
}

