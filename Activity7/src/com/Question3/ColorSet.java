package com.Question3;
import java.util.TreeSet;

public class ColorSet {
	
	    public static void main(String[] args) {
	        // Create a TreeSet to store the colors
	        TreeSet<String> colors=new TreeSet<>();

	        // Add some colors to the set
	        colors.add("Red");
	        colors.add("aqua");
	        colors.add("teal");
	        colors.add("plum");
	        colors.add("Violet");

	        // Print out the tree set
	        System.out.println("Original set: "+colors);
	        System.out.println("-------------------------------");

	        // Create another TreeSet to store additional colors
	        TreeSet<String> moreColors=new TreeSet<>();
	        moreColors.add("Turquoise");
	        moreColors.add("Pink");
	        moreColors.addAll(colors);

	        // Add all the elements of the moreColors set to the colors set
	        colors.addAll(moreColors);
	        System.out.println("After adding more colors: "+colors);
	        System.out.println("-------------------------------");

	        // Create a reverse order view of the elements in the colors set
	        TreeSet<String> reverseOrderColors=(TreeSet<String>) colors.descendingSet();
	        System.out.println("Reverse order view: "+reverseOrderColors);
	        System.out.println("-------------------------------");

	        // Compare two tree sets
	        System.out.println("Comparing the original set with new set : "+colors.equals(moreColors));
	        System.out.println("-------------------------------");

	        // Get the first and last elements in the colors set
	        System.out.println("First color: "+colors.first());
	        System.out.println("Last color: "+colors.last());
	    }
	}
