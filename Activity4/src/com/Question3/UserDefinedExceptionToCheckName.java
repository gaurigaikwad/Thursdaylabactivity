package com.Question3;
import java.util.Scanner;
import javax.naming.InvalidNameException;

public class UserDefinedExceptionToCheckName extends Throwable {
	
	void validateName(String name) throws InvalidNameException { 
		
		String[] names = { "Prathmesh", "Gauri", "Rudra", "Pranjal","Sachi","Anita"};
        boolean found= false;
        
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("Valid Name");
        } 
        else 
        {
            throw new InvalidNameException("Try Again!!!!!");
        }
    }
	public static void main(String[] args) {
		 
	        UserDefinedExceptionToCheckName ck=new UserDefinedExceptionToCheckName();
	        
	        Scanner sc=new Scanner(System.in);
	        
	        //asks for input from the user
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        
	        try
	        {
	            ck.validateName(name);
	        }
	        catch(InvalidNameException e) 
	        {
	        	// exception will be thrown if the name entered doesn't match
	            System.out.println("Invalid Name " +e);
	        }
	}
}
