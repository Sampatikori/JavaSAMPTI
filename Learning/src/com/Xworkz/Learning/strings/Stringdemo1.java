package com.Xworkz.Learning.strings;

public class Stringdemo1 {
	public static void main(String[] args) {
		String s=new String("Good");
		String str=new String(" morning");
		System.out.println(s.concat(str));
		System.out.println(s);
		System.out.println(str);
		
		String str1="Javatpoint";
		char ch=str1.charAt(4);
		System.out.println(ch);
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
		 
		String s6="hello";  
		String s7="";  //empty String
		String s8="me";  
		System.out.println(s6.compareTo(s7));  
		System.out.println(s7.compareTo(s8)); 
		
		String name="what do you know about me";  //contains eg
		System.out.println(name.contains("do you know"));  //true
		System.out.println(name.contains("about")); //true 
		System.out.println(name.contains("hello")); //false 
		
		String s9="java by javatpoint";  
		System.out.println(s9.endsWith("t")); //true 
		System.out.println(s9.endsWith("point")); //true
		
		String s10 = "Welcome to JavaTpoint";  
		  
		// prints true  
		System.out.println(str.endsWith(""));  
		  
		// prints false as there is no white space after the string  
		System.out.println(str.endsWith(" "));  
		  
		String s11="javatpoint";  
		String s12="javatpoint";  
		String s13="JAVATPOINT";  
		String s14="python";  
		System.out.println(s11.equalsIgnoreCase(s12));//true because content and case both are same  
		System.out.println(s11.equalsIgnoreCase(s13));//true because case is ignored  
		System.out.println(s11.equalsIgnoreCase(s14));//false because content is not same 
		
     String st="ABCDEFG";
     byte[] barr=st.getBytes();
     for(int i=0; i<barr.length; i++) {
     System.out.println(barr[i]);
		
     String s15=new String("hello");  
     String s16="hello";  
     String s17=s1.intern();//returns string from pool, now it will be same as s2  
     System.out.println(s15==s16);//false because reference variables are pointing to different instance  
     System.out.println(s16==s17);//true because reference variables are pointing to same instance  	
		
     String s21="";    
     String s22="Javatpoint";             
     // Either length is zero or isEmpty is true  
     if(s21.length()==0 || s21.isEmpty())  
         System.out.println("String s21 is empty");  
     else System.out.println("s21");        
     if(s22.length()==0 || s22.isEmpty())  
         System.out.println("String s22 is empty");  
     else System.out.println(s22); 
     
     System.out.println("string length is : "+s22.length());//string length
	
     String replacestring=s22.replace('a', 'e');// replacestring
     System.out.println(replacestring);
     
     System.out.println(s22.startsWith("Java"));//startswith
     System.out.println(s22.substring(1, 2));
     
     String sa = "Welcome to Javatpoint";  
     char[] c1=sa.toCharArray();
     int len=c1.length;
     System.out.println("Char Array length: " + len);  
     System.out.println("Char Array elements: ");  
     for (int j = 0; j < len; j++) {  
         System.out.print(c1[j]);    //toCharArray
    
         String s51="  hello string   ";  
         System.out.println(s51+"javatpoint");//without trim() ( hello string   javatpoint)
         System.out.println(s51.trim()+"javatpoint");//with trim() (hello stringjavatpoint)
     
     
     
		
	}

	}}
}