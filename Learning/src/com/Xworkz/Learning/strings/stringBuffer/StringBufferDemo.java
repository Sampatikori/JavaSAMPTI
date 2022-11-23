package com.Xworkz.Learning.strings.stringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sc=new StringBuffer("Good");
	
		System.out.println(sb.reverse());
		System.out.println(sb.insert(4, 'w'));
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(4));
		System.out.println(sb.equals(sc));
		System.out.println(sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("H"));
		System.out.println(sb.length());
		System.out.println(sb.append(" friend"));
		
	}

}
