package com.question3;

public class StringClasses {
	public static void main(String[] args) {
	
		String s1="gauri";
		String s2=s1.concat(" How are you today?");
		String s3="dog";
		String s4=new String("hi my name is gauri");

		//charAt() Method    
		System.out.println(s2.charAt(0));  
		System.out.println("----------------------------------------");

        //compareTo() method
        System.out.println(s1.compareTo(s3));
        System.out.println("----------------------------------------------");

        //concat() method
        System.out.println("the concatenated string is: "+s2);
        System.out.println("----------------------------------------------");

        //IndexOf() Method
      	System.out.println(s1.indexOf('u'));
      	System.out.println("----------------------------------------");

        //replace() Method
      	System.out.println(s4.replace("hi","hello"));
      	System.out.println("----------------------------------------");

        //Substring() Method
        System.out.println(s4.substring(5));
      	System.out.println(s4.substring(0,5));
      	System.out.println("----------------------------------------");

      	//toLowerCase() method
      	System.out.println(s2.toLowerCase());
		
    }
}
