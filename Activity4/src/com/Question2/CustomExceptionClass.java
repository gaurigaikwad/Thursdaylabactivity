package com.Question2;
import java.util.Scanner;
class InvalidAgeWeightException extends Throwable
{
	InvalidAgeWeightException(String s)
	{
		super(s);
	}
}
public class CustomExceptionClass {
	
		//class has two variables: age and weight
	     static int age;
		 static int weight;
		 static void validation(int age, int weight) throws InvalidAgeWeightException
		{
				try {
					if(age<18 && weight<50)
					{
						//throws an exception when the age is less than 18
						throw new InvalidAgeWeightException("invalid age weight exception");
					}
					else
					{
						System.out.println("valid age and weight");
					}
				}
				catch (InvalidAgeWeightException e) 
				{
					System.out.println("you have entered invalid age and weight");
					//e.printStackTrace() is used to print details like class name and line number where exception occurred
					e.printStackTrace();
				}
		}
	public static void main(String[] args) throws InvalidAgeWeightException {
		
		//Scanner object to read input from the user
		Scanner sc=new Scanner(System.in);
		
		//asks the user to enter age
		System.out.println("enter the age:");
		int age=sc.nextInt();
		
		//asks the user to enter weight
		System.out.println("enter the weight:");
		int weight =sc.nextInt();
		
		CustomExceptionClass aw=new CustomExceptionClass();
		aw.validation(age, weight);		
	}
}
