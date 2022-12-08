package com.Question2;
import java.util.Scanner;
class InvalidAgeWeightException extends Throwable
{
	InvalidAgeWeightException(String s)
	{
		
	}
}
public class CustomExceptionClass {
	//class has two variables: age and weight
	     static int age;
		 static int weight;
		 static void validation(int age, int weight) throws InvalidAgeWeightException
		{
				try {
					if(age<18)
					{
						//throws an exception when the age is less than 18
						throw new InvalidAgeWeightException("invalid age");
					}
					else
					{
						System.out.println("valid age");
					}
				}
				catch (InvalidAgeWeightException e) 
				{
					//e.printStackTrace() is used to print details like class name and line number where exception occurred
					e.printStackTrace();
				}
				try 
				{
					if(weight<50)
					{
						//throws an exception when the weight is less than 50
						throw new InvalidAgeWeightException("invalid weight");
					}
					else
					{
						System.out.println("valid weight");
					}
				} 
				catch (InvalidAgeWeightException e)
				{
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
