package com.Question1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//creates three Employee objects and adds them to an ArrayList.
		Employee e1=new Employee(6,"gauri",20,30000);
		Employee e2=new Employee(3,"anita",18,45000);
		Employee e3=new Employee(1,"kajal",22,26000);
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);

		//sorts the list of Employees by salary.
		System.out.println("Sort the employees based on their salary");
		Collections.sort(al);
		for(Employee e:al)
		{
			System.out.println(e.id+" "+e.name+" "+e.age+" "+e.salary);
		}
	}
}
