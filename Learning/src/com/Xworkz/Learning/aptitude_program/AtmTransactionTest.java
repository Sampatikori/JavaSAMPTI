package com.Xworkz.Learning.aptitude_program;

import java.util.Scanner;

public class AtmTransactionTest {
	public static void main(String[] args) {
	int balance=100000,withdraw,deposit;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Withdraw 2.Deposit 3.Check Balance 4.Exit");
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	while(choice!=4) {
		switch(choice) {
		case 1:
			System.out.println("enter money to be withdraw");
			withdraw=sc.nextInt();
			if(balance>=withdraw) {
			balance=balance-withdraw;
			System.out.println("Transaction successful");
		}
		else { 
			System.out.println("balance insufficient");}
			break;
			
		case 2:
			System.out.println("enter money to be deposited");
			deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.println("money has been successfully deposited");
			break;
		
		case 3:
			System.out.println("Balance : "+balance);
			break;
		}
			System.out.println("thank you");
			
		}
	}
	
	}

