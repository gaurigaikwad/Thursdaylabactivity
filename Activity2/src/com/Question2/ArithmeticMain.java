package com.Question2;

public class ArithmeticMain {
	
	public static void main(String[] args) {
		//creating instance of Adder class 
		Adder a=new Adder();
		//then prints out "My superclass name is:class name"
		System.out.println("My superclass name is:"+a.getClass().getSuperclass().getName());
		//adds 300 to 50
		System.out.print(a.add(300,50)+" ");

	}

}
