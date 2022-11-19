package com.Xworkz.Learning.arrays;

public class Assign3Array {
	public static void main(String[] args) {
		String arr[]= {"apple","orange","banana","mango","chiku","jackfruit"};
		String Search="apple";
		int a= 0;
		for(int i=0; i<arr.length; i++) {
			if(Search==arr[i]) {
				System.out.println("At "+ i + " index " + arr[i] + " is present" );
				a++;
			}
			
			if(a==0) {
				System.out.println("not found");
			}
		}
		
		
	}

}
