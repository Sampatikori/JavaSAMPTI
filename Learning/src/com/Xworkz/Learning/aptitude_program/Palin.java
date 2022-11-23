package com.Xworkz.Learning.aptitude_program;

public class Palin {
	public static void main(String[] args) {
	int n=151,sum=0,rem;
	int a=n;
	while(n>0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;}
	if(a==sum) {
	  System.out.println("is palindrome number");
  }
  else {
	  System.out.println("not palindrome number");
  }
}}
