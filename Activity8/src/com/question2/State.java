package com.question2;

import java.util.HashSet;
import java.util.Iterator;

public class State {
	HashSet<String> s1=new HashSet<>();
	void addState(String stateName)		
	{
		s1.add(stateName);	
	}
		
	String retriveState(String stateName) {
	Iterator itr=s1.iterator();
	while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(s1.contains(stateName))		
			{
				return stateName;	
			}	
		}
		return null;	
	}
}
