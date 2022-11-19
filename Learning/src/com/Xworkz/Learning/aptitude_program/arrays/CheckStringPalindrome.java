package com.Xworkz.Learning.aptitude_program.arrays;

import java.util.Scanner;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		System.out.println("enter a string to be checked for Palindrome");
	Scanner s1=new Scanner(System.in);
	String s=s1.nextLine();
	String rev="";
    for(int i=s.length()-1; i>=0; i--) {
    	rev=rev+s.charAt(i);
    }
 if(rev.equals(s)){
	 System.out.println("is palindrome");
 }
 else {
	 System.out.println("not a palindrome");
 }}}

