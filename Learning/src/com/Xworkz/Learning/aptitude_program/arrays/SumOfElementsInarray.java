package com.Xworkz.Learning.aptitude_program.arrays;

import java.util.Scanner;

public class SumOfElementsInarray {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int size=s1.nextInt();
		int arr[]=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=s1.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			}
		System.out.println("Sum "+sum);
	}}
		
	





