package com.emp.servicetest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.emp.entity.Address;
import com.emp.entity.Employee;
import com.emp.exception.GlobalException;
import com.emp.service.EmployeeService;

@TestMethodOrder(value=OrderAnnotation.class)

public class EmployeeServiceTest1 {
	
	static EmployeeService employeeService;
	static List<Employee> empList;
	
	@BeforeEach
	void setUp() throws Exception
	{
		employeeService=new EmployeeService();
	}
	
	
	@AfterEach
	void tearDown() throws Exception
	{
		employeeService=null;
		System.out.println("objetc is garbage collected !!");	
	}
	
	
	@Test
	@Order(1)										//giving order to the test which we want the test to display	
	@DisplayName("Testing add employee method")
	void testAddEmployee()
	{
		//way 1
		//	employeeService.addEmployee(123,"nancy",25000,"pune","india");
		//	employeeService.addEmployee(124,"Ankita",30000,"pune","india");
		//	assertEquals(2,employeeService.lengthOfList());	
	
		//way 2
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(123).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);
		int length=employeeService.lenghtOfList();
		//employeeService.displayAllEmployee();
		assertThat(length>0).isTrue();
	}
	
	
	@Test
	@Order(3)
	@DisplayName("Testing display employee by Id")
	void testDisplayByEmpId() throws GlobalException
	{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(123).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);
		Employee e=employeeService.displayEmpById(123);
		//assertEquals("Gauri", e.getName());
		assertThat(e.getSalary()).isEqualByComparingTo(25000);
	}
		
	
	@Test
	@Order(2)
	@DisplayName("Testing update employee")
	void testUpdateEmployee()
	{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(123).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);
		Employee e=employeeService.findId(123);
		e.setName("Ankita");
		employeeService.updateEmployee(0, e);		
		//assertEquals("Ankita", e.getName());
		assertThat(e.getName()).isEqualTo("Ankita");	
	}
	
	
	@Test
	@Order(4)
	@DisplayName("removing employee by id")
	void testRemoveById()
	{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(101).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);				
		System.out.println("Id is remove");
		employeeService.removeId(101);
		assertNull(employeeService.findId(101));
	}
	
	
	@Test
	@Order(5)
	@DisplayName("removing all employee by id")
    public void testRemoveAllEmployees() {
        employeeService.removeAllEmployee();
        assertNull(employeeService.findId(101));
        System.out.println("all ID are removed");
    }
	
	@Test
	@Order(6)
	@DisplayName("employee yearly salary")
	void testCalculateYearlySalary()
	{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(102).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);
		double sal =employeeService.calculateYearlySalary(102);
		assertEquals(300000, sal);
	}
	
	@Test
	@Order(7)
	@DisplayName("approval of employee salary")
	void testApperasal()
	{
		Address add=Address.builder().city("pune").country("india").build();
		Employee emp=Employee.builder().empId(103).name("Gauri").salary(25000).adress(add).build();
		employeeService.addEmp(emp);
		double apparasal=employeeService.salaryApparasal(103);
		assertEquals(2500,apparasal);
	}
	
	
	
}