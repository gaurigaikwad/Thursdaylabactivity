package com.question3;

public class StringBuilderClasses {
	
	public static void main(String[] args) {
		String s1="gauri";
		String s2=s1.concat(" Gaikwad");
		String s3=new String("hi my name is gauri");
		
		//concat() method
        System.out.println("the concatenated string is: "+s2);
        System.out.println("----------------------------------------------");
        
        //Substring() Method
        System.out.println(s3.substring(6));
      	System.out.println("----------------------------------------");
      	
      	//length() Method   
      	System.out.println(s2.length());
      	
	}
}
