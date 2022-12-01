package com.Question2;

public class sequencesOfLowercaseLetters {

	public static void main(String[] args) {
		String s="gauri_gaikwad";
		//checks if the string s contains any lowercase letters
		boolean b=false;
	    //logic for checking sequence of letters
		for(int i=0;i<s.length();i++)      
		{
			if(s.charAt(i)=='_')
			{
				if(Character.isLowerCase(0));
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("matched");
		else
			System.out.println("not matched");

	   }

}
