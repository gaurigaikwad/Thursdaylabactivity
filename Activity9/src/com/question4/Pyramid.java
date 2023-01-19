//program that prints a pyramid of stars(*)
package com.question4;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;++i) {
            for(int j=1;j<=5-i;++j) 
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; ++j) 
            {
                System.out.print("* ");
            }
            System.out.println();
		}
	}

}
