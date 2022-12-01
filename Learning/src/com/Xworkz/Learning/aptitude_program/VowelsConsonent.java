package com.Xworkz.Learning.aptitude_program;

public class VowelsConsonent {
	public static void main(String[] args) {
	String s="hello good morning umbrella";
    int vc=0,cc=0;
    s=s.toLowerCase();
    for(int i=0; i<s.length(); i++) {
    	if(s.charAt(i)=='a' || s.charAt(i)=='e' || 
    s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
    		vc++;
    	}
    	else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
    		cc++;
    	}}
    	System.out.println("Vowels: "+vc);
    	System.out.println("Consonants: "+cc);
    }
	
    

}
