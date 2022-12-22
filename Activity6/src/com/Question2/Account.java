package com.Question2;

import java.util.Scanner;

class InSufficientBalancedException extends Exception {
	  public InSufficientBalancedException(String message) 
	  {
	    super(message);
	  }
	}
 public class Account {
	 double balance=0;
	 double totalbalance=0;
	 double amount;
	 double totalbalance1;
		
		Scanner sc=new Scanner(System.in);
		//method deposit() takes in an amount of money to be deposited.
		public void deposite()
		{
			System.out.println("enter the current balance of your account :");		
			balance=sc.nextFloat();
			System.out.println("enter the amount to deposite money :");
			amount=sc.nextFloat();	
			// It then calculates the total balance of the account after adding that amount.
			totalbalance=balance+amount;
			System.out.println("Total balance of your account is :"+totalbalance);		
		}
		// method withdraw() takes in an amount to be withdrawn from the account and checks if there is sufficient fund available
		//before proceeding with the operation.
		public void withdraw() throws InSufficientBalancedException 
		{
			float withdraw;
			System.out.println("enter the amount to be withdraw :");
			withdraw=sc.nextFloat();			
			if(totalbalance<withdraw)			
			{
				//If not, it throws InSufficientBalancedException("NO sufficient fund to withdraw!!!!!!!!!").
				throw new InSufficientBalancedException("NO sufficient fund to withdraw!!!!!!!!!");
			}
			else 
			{
				System.out.println("please take money :)");
			}
			//Otherwise, it subtracts that amount from total balance and prints
			totalbalance1=totalbalance-withdraw;
			System.out.println("Total balance of your account after withdraw is :"+totalbalance1);
		}
	}