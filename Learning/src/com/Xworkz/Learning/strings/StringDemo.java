package com.Xworkz.Learning.strings;

public class StringDemo {
	public static void main(String[] args) {
		String s="Xworkz";
		String s1= "Xworkz";
		String s2="java";
		s1="web";
		System.out.println(s==s1);
		
		String str=new String("sql");
		String internofstr =str.intern();
		
		System.out.println(str.equals(internofstr));
		System.out.println(str==internofstr);
		
		String str1="sql";
		System.out.println(str1==internofstr);
		
		String str2=new String("sql");
		System.out.println(str==str2);
		
	}

}
