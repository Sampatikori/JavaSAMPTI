package com.Xworkz.Learning.aptitude_program.arrays;

import java.util.Scanner;

public class LargestElementInArray {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int size=s1.nextInt();
	int arr[]=new int[size];
	System.out.println("enter "+size+" elements");
	for(int i=0; i<arr.length; i++) {
		arr[i]=s1.nextInt();
	}
	int max=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
		max=arr[i];}}
		System.out.println("Largest "+max);
		}
	}
	



