//Program to print max and min element of an array
package com.question2;

import java.util.Arrays;

public class MinMaxArray {
	
	 public static void main(String[] args) {
		 int[] array={3, 4, 1, 7, 9, 2, 5, 8, 6};
	     int min=array[0];
	     int max=array[0];
	     for (int i=1;i<array.length;i++)
	     {
	    	 if (array[i]>max)
	    	 {
	    		 max=array[i];
	         }
	    	 if (array[i]<min) 
	    	 {
	    		 min=array[i];
	         }
	     }
	     System.out.println("The minimum element in the array is: "+min);
	     System.out.println("The maximum element in the array is: "+max);
	 }
}