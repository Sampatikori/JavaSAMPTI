package com.Xworkz.Learning.final_keyword;

public class Blocks {
	{
		System.out.println("Iam IIBM");
	}
	static {
		System.out.println("Iam SIBM");
	}
	Blocks(){
		System.out.println("Iam constructor");
	}
public static void main(String[] args) {
	Blocks blk=new Blocks();
	
}
}
