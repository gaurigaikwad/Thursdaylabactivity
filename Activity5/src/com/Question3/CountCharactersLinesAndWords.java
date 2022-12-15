package com.Question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountCharactersLinesAndWords {
	static int lines=0,chars=0,words=0;
	static int content=0;
	public static void totalCount(FileInputStream fin) throws IOException
	{
		while(fin.available()!=0)
		{
			content=fin.read();
			if(content!=10)
			chars++;
			if(content==32)
			words++;
			if(content==13)
			{
				lines++;
				words++;
			}
		}
		System.out.println("Number of characters : "+chars);
		System.out.println("Number of words : "+(words+1));
		System.out.println("Number of lines : "+(lines+1));
		fin.close();
	}	
	public static void main(String[] args) {
		try
		{
			FileInputStream fin=new FileInputStream("D:gauri\\testfile.txt");
			totalCount(fin);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the file!!!!!!!");
		}
		catch(IOException i)
		{
			System.out.println("unable to read file!!!!!");
		}
	}
}
