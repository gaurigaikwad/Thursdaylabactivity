
package com.Question3;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
		 // ask users to enter rows number
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) 
        {
            int num = i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                 
                num = num+rows-j;
            }
             
            System.out.println();
        }sc.close();
         
       
    }


	}


