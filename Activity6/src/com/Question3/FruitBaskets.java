package com.Question3;
import java.util.ArrayList;
import java.util.Collections;

public class FruitBaskets {
	
	    public static void main(String[] args) {
	        // Create the first fruit basket
	        ArrayList<String> firstBasket = new ArrayList<>();
	        firstBasket.add("apple");
	        firstBasket.add("banana");
	        firstBasket.add("cherry");
	        firstBasket.add("mango");
	        // Create the second fruit basket
	        ArrayList<String> secondBasket = new ArrayList<>();
	        secondBasket.add("orange");
	        secondBasket.add("kiwi");
	        secondBasket.add("grape");
	        // Add all the fruits from the first basket to the second basket
	        secondBasket.addAll(firstBasket);
	        // Check if the fruit "cherry" is present in the second basket
	        if (secondBasket.contains("cherry")) 
	        {
	            System.out.println("Cherry is present in the 2nd basket");
	            System.out.println("-----------------------------------------------------------------------");
	        } 
	        else 
	        {
	            System.out.println("Cherry is not present in the 2nd basket");
	            System.out.println("-----------------------------------------------------------------------");
	        }
	        // Check if the first basket is empty
	        if (firstBasket.isEmpty()) 
	        {
	            System.out.println("The 1st basket is empty");
	            System.out.println("-----------------------------------------------------------------------");
	        } 
	        else 
	        {
	            System.out.println("The 1st basket is not empty");
	            System.out.println("-----------------------------------------------------------------------");
	        }
	        // Sort the fruits in the first basket in ascending order
	        Collections.sort(firstBasket);
	        System.out.println("Fruits in the 1st basket (sorted in ascending order):"+firstBasket);
	        System.out.println("-----------------------------------------------------------------------");
	        // Sort the fruits in the second basket in descending order
	        Collections.sort(secondBasket, Collections.reverseOrder());
	        System.out.println("Fruits in the 2nd basket (sorted in descending order):"+secondBasket);
	        System.out.println("-----------------------------------------------------------------------");
	        // Remove the fruit at index 2 from the first basket
	        firstBasket.remove(2);
	        System.out.println("Fruits in the 1st basket after removing the fruit at index 2:"+firstBasket);
	    }
	}
