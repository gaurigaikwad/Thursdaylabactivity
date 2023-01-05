package com.question3;

public class StringBufferClasses {
	
	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("gauri");
		
		//append() method
		System.out.println(s.append(" gaikwad "));
		
		//insert() method
		System.out.println(s.insert(14,"hello"));
		
		//replace() method
		s.replace(14,19, "hi");
		System.out.println(s.reverse());

	}
}
