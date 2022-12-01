package com.Question1;
import java.util.Scanner;
public class ReverseNumber {
	
	public void reverseNo()
	{
		//asking the user to enter a number
		System.out.println("enter the number to reverse:"); 
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    int reverse=0;
	    while(number!=0)
	      {
	    	  int remainder=number%10;        
	    	  reverse=reverse*10+remainder;
	    	  number=number/10;
	      }
	    //then prints out the reverse of the given number
	      System.out.println("the reverse of the given no is:"+reverse);
	  }
}
