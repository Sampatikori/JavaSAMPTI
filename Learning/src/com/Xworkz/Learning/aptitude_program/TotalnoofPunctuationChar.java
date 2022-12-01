package com.Xworkz.Learning.aptitude_program;

public class TotalnoofPunctuationChar {
	public static void main(String[] args) {
		String s="Good?:or bad better;no!worry...!!! ";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='?'|| s.charAt(i)==':'|| 
			s.charAt(i)==';'|| s.charAt(i)=='!'|| s.charAt(i)=='.') {
				count++;
			}
		}
		System.out.println(count);
	}

}
