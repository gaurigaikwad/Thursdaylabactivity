package com.Question1;
import java.util.Scanner;
public class SumOfDigits extends ReverseNumber {
	
	public void SumOfDigit()
	{
		//it asks for input from the user
		System.out.println("enter the number to find sum of digits:");
		//creates an instance of Scanner called sc
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0,digit;
		while(number>0)
		{
			digit=number%10;          
			sum=sum+digit;
			number=number/10;
		}
		//it prints sum of digits
		System.out.println("sum of digits is"+sum);
	}

}
