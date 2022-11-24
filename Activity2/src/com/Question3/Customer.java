package com.Question3;
import java.util.Scanner;

public class Customer {
	// class has three private variables: accountNumber, accountName, and accountBalance
	private int  accountNumber;
	private String accountName;
	private long accountBalance;
	//declares a Scanner object named sc
	Scanner sc=new Scanner(System.in);
	 
	public void createAccount()
	{
		//code will ask the user to enter no
		System.out.println("Enter account no:");
		accountNumber=sc.nextInt();
		//code will ask the user to enter name
		System.out.println("Enter name");
		accountName=sc.next();
		//code will ask the user to enter balance
		System.out.println("Enter account balance");
		accountBalance=sc.nextLong();
	}
	public void withDrawAmount()
	{
		long amt;
		//then asks for a withdrawal amount
		System.out.println("Enter the amount you want to withdraw ");
		amt=sc.nextLong();
		if(accountBalance >= amt)
		{
			accountBalance=accountBalance-amt;
			//it subtracts the withdrawal amount from the balance and print the total balance
			System.out.println("Balance after withdrawal: "+accountBalance);
		}
		else
		{
			System.out.println("your balance is less than"+amt+"transaction Failed......!");
		}
	}    
}