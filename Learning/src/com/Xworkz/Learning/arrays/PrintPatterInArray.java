package com.Xworkz.Learning.arrays;

public class PrintPatterInArray {
	public static void main(String[] args) {
		int a[][]=new int [3][3];
		int num=10;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=num;
			num++;
		}}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if((i==j) || (i==0 & j==2) || (i==2 & j==0)){
				System.out.print("* ");
			}
			else {
				System.out.print(a[i][j]+ " ");
			}
		}
		System.out.println();
			

	}}}


