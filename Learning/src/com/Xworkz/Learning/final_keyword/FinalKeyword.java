package com.Xworkz.Learning.final_keyword;

public class FinalKeyword {
	int add() {
		final int A=20;
		final int B=30;
		return A+B;
	}
	public static void main(String[] args) {
		FinalKeyword fk=new FinalKeyword();
		System.out.println(fk.add());
	}

}
