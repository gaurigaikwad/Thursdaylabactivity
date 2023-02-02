package com.emp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.emp.entity.Address;
import com.emp.entity.Employee;
import com.emp.exception.GlobalException;

public class EmployeeService {

	private static List<Employee> employee = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	
	//method to add employee details in array list
	public void addEmployee(long empId, String name, int salary, String city, String country)
	{
		Address address = new Address(city, country);
		employee.add(new Employee(empId, name, salary, address));
	}
	
	//for testing using builder annotation
	public void addEmp(Employee emp)
	{
		employee.add(emp);
	}
	
	//method to display all employee details
	public void displayAllEmployee()
	{
		for(Employee emp: employee)
		{
			System.out.println("Empoyee ID: "+emp.getEmpId());
			System.out.println("Empoyee name: "+emp.getName());
			System.out.println("Empoyee salary: "+emp.getSalary());
			System.out.println("Empoyee address: "+emp.getAdress().getCity()+", "+emp.getAdress().getCountry());
		}
	}
	
	public Employee displayEmpById(int id) throws GlobalException
	{
		for(int i=0; i<employee.size(); i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				return employee.get(i);
			}
			else 
			{
				throw new GlobalException("Employee ID not found!!!!!");
			}
		}
		return null;
	}
	
	//update employee
	public Employee updateEmployee(int index, Employee emp)
	{
		return employee.set(index, emp);
	}
	
	public Employee findId(int id)
	{
		Employee emp= null;
		for (int  i=0; i<employee.size(); i++)
		{
			if (employee.get(i).getEmpId()==id)
			{
				emp = employee.get(i);
			}
		}
		return emp;
	}
	
	//lenght of list
	public int lenghtOfList()
	{
		return employee.size();
	}
	
	public void removeId(int id)
	{
		for (int i = 0; i <employee.size(); i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				employee.remove(i);
			}
		}
	}
	
	public void removeAllEmployee() 
	{
		employee.clear();
	}
	
	public double calculateYearlySalary(int id)
	{
		double yearlySalary =0.0;
		for (int i=0; i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				yearlySalary = employee.get(i).getSalary()*12;
			}
		}
		return yearlySalary;
	}
	
	
	public double salaryApparasal(int id)
	{
		double apparasal=0.0;
		
		for(int i=0;i<employee.size();i++)
		{
			if(employee.get(i).getEmpId()==id)
			{
				if(employee.get(i).getSalary()<10000)
				{
					apparasal=1000;	
					
				}
				else if((employee.get(i).getSalary()>10000) && (employee.get(i).getSalary()<20000))
				//else
				{
					apparasal=2000;	
				}
				else
				{
					apparasal=2500;
				}
			}
		}
		return apparasal;
	}	
}