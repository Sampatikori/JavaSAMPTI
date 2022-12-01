package com.Xworkz.Learning.exception.uncheckedException;

public class CallStackdemo {
	static int divide(int a, int b) {
		return a/b;
	}
	static int computeDivision(int a, int b) {
		int result=0;
		try {
			result=divide(a,b);
		}
		catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
		}
		return result;
	}
	public static void main(String[] args) {
		try {
		System.out.println(computeDivision(20,0));
	}
		catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
			
		}

	}}
