//program to search an element in an array
package com.question6;

public class SearchArray {

	public static void main(String[] args) {
		int[] myArray={1, 2, 3, 4, 5};
        int searchValue=3;
        boolean found=false;

        for (int i=0;i<myArray.length;i++) 
        {
            if (myArray[i]==searchValue) 
            {
                found=true;
                break;
            }
        }

        if (found) 
        {
            System.out.println(searchValue+" was found in the array");
        } 
        else 
        {
            System.out.println(searchValue+" was not found in the array");
        }
	}

}
