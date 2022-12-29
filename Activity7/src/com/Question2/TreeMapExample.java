package com.Question2;
import java.util.TreeMap;

public class TreeMapExample {
	
	 public static void main(String[] args) {
		// Create a TreeMap to store key-value pairs where the keys are integers from 1 to 20
		// and the values are the squares of the keys
		TreeMap<Integer, Integer> map=new TreeMap<>();
		  for(int i=1;i<=20;i++) 
		  {
		     map.put(i,i*i);
		  }
		  // Print the squares of the keys from 1 to 20
		  System.out.println("Original TreeMap with squares of keys from 1 to 20:");
		  for(int key:map.keySet()) 
		  {
		      System.out.println(key+" = "+map.get(key));
		  }
		  System.out.println("-------------------");
		  
		  // Copy the content of the TreeMap to another TreeMap
		  TreeMap<Integer,Integer>copy=new TreeMap<>();
		  copy.putAll(map);
		  System.out.println("Copy of TreeMap : "+copy);
		  System.out.println("-------------------");
		  
		  // Search for a key in the TreeMap
		  System.out.println("Key 15 found in TreeMap : "+copy.containsKey(15));
		  System.out.println("-------------------");
		  System.out.println("Value 256 found in TreeMap : "+copy.containsValue(256));
		  System.out.println("-------------------");
		  
		  // Get the greatest key less than or equal to a given key
		  System.out.println("Greatest key less than or equal to 2 is : "+copy.higherKey(2));
		  System.out.println("-------------------");
		  
		  // Remove and get the key-value mapping associated with the least key in the map
		  System.out.println("Removed key-value pair with least key: "+copy.pollFirstEntry());
		  System.out.println("-------------------");
		  
		  // Remove and get the key-value mapping associated with the greatest key in the map
		  System.out.println("Removed key-value pair with greatest key: "+copy.pollLastEntry());
		  
		  }
	}
