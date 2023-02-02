package com.emp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
	
	private long empId;
	private String name;
	private int salary;
	
	//entity reference
	Address adress; //HAS-A relationship
}
