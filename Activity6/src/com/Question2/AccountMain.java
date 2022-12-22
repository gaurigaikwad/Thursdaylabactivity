package com.Question2;

public class AccountMain {
	public static void main(String[] args) {
		Account a=new Account();		
		a.deposite();			
		try
		{
			//trying to withdraw money from an account
			a.withdraw();		
		}
		catch(InSufficientBalancedException e)		
		{
			//throwing an exception because the balance of the account is not enough to cover the withdrawal.
			e.printStackTrace();
		} 
	}
}