package com.Question3;
import java.util.Scanner;
public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		String s="your cat is so cute";
		System.out.println(s);
		System.out.println("Enter the string");

		String s2=sc.nextLine();
		//trying to remove duplicate characters
		System.out.println("After removing the duplicate characters:"); 
		  for(int i=0;i<s.length();i++)
		    {
		    boolean b=false;
		    //to remove duplicate characters from a string
		    	for(int j=0;j<s2.length();j++) 
		    	{
		    		if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s2.charAt(j)))
		    		{	
		    			b=true;
		    			break;	
		             }
		         }
		    	if(b==false)
		    		System.out.print(s.charAt(i));
		}
	}

}

