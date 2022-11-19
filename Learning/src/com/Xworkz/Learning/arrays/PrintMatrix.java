package com.Xworkz.Learning.arrays;

public class PrintMatrix {
public static void main(String[] args) {
	int a[][]=new int [3][3];
	int num=10;
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++) {
		a[i][j]=num;
		num++;
		System.out.print(" "+a[i][j]);}
	System.out.println();
}
}
}
