package com.Question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
	public String findLongestWords() throws FileNotFoundException {
		String longest_word =" ";
		String current;
		//Scanner object to read text from file
		Scanner sc=new Scanner(new File("D:gauri\\longestword.txt"));
		//starts looping through each line in this file until end of file has been reached
		while (sc.hasNext()) 
		{
			current=sc.next();
		if (current.length()>longest_word.length())
			{
				longest_word=current;
			}
		}
	System.out.println(longest_word);
	return longest_word;
   }
	
	public static void main(String[] args) throws FileNotFoundException {
		new LongestWord().findLongestWords();
    }
}