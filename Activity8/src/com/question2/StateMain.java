package com.question2;

public class StateMain {

	public static void main(String[] args) {
		State a=new State();
		a.addState("Maharshatra");	
		a.addState("Punjab");
		a.addState("Kerala");
		a.addState("Gujarat");
		System.out.println("details of state:"+a.retriveState("Maharashtra"));		

	}
}
