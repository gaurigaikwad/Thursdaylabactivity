package com.Question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordGeneration {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//asks the user to enter a security code
	        System.out.println("generate a security code :");
	        //scanner to read the input and converts it into a string.
	        String code = sc.next();
	        String regex = "[Gaurig*24]{8}";
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(code);
	        boolean matchFound = m.find();
	        if(matchFound)
	        System.out.println("Security Code Generated Successfully");
	        else
	        System.out.println("Invalid Security Code, Try Again!!!!!");
	}
}
