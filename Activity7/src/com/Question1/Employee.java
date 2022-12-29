package com.Question1;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	double salary;
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//compares two employees, and returns a positive number if the first employee is greater than the second
	public int compareTo(Employee e)
	{
		if(salary==e.salary)return 0;
		else if(salary>e.salary)return 1;
		else return-1;
	}
}