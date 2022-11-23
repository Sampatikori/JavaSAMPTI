package com.Xworkz.Learning.strings.stringBuilder;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Javatpoint");
		StringBuilder sd=new StringBuilder("Javatpoint");
		System.out.println(sb==sd);
		System.out.println(sb);
		System.out.println(sb.append(" platform"));
		System.out.println(sb);
		System.out.println(sb.indexOf("f"));
		System.out.println(sb.substring(2));
		System.out.println(sb.charAt(15));
		System.out.println(sb.toString());
		
	}

}
