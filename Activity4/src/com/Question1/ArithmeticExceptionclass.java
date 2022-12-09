package com.Question1;
import java.util.Scanner;

public class ArithmeticExceptionclass {

	public static void main(String[] args) throws Exception {
		
			// declare and initialize here
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			
			//  asks the user to input two numbers
			System.out.println("Enter 1st number : ");
			a=sc.nextInt();
			
			System.out.println("Enter 2nd number : ");
			b=sc.nextInt();	
			
			if(a==0 && b==0)
			{
				 throw new Exception("invalid numbers!!!!!");
			}
			else
			{
				try
				{
					//first number is then divided by the second number and display the result on screen
					c=a/b;
					System.out.println("Result:"+c);
				}
				catch(ArithmeticException e)
				{
					//Arithmetic Exception is thrown when user try to divide by zero
					System.out.println("Arithmetic Exception occured");
					e.printStackTrace();
				}	
			}
	}
}
