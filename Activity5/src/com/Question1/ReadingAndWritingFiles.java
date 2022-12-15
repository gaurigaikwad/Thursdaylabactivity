package com.Question1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAndWritingFiles {
	static void readWrite() throws IOException
	{
		System.out.println(" choice 1 for write and choice 2 for read ");
		System.out.println("enter the choice: ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) 
		{
			try 
			{
				FileOutputStream fout = new FileOutputStream("D:gauri\\write.txt");
				String s="hello my name is gauri";
				byte b[]=s.getBytes(); 
				fout.write(b); 
				fout.close();
			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		else if(choice==2)
		{
			try
			{
			FileInputStream fin = new FileInputStream("D:gauri\\read.txt");
			
			while(( choice=fin.read())!=-1) 
			{  
				System.out.print((char)choice);
			}
			fin.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else 
		{
			System.out.println("Invalid!!!!!");
		}
		System.out.println("Done");
	}
	public static void main(String[] args) throws IOException {
		ReadingAndWritingFiles rwf=new ReadingAndWritingFiles() ;
			rwf.readWrite();
		}
	}
