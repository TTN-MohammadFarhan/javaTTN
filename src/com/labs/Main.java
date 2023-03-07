package com.labs;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=EmployeeRepository.getEmployees();
		double sum=emp.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.print("total salary is "+sum);
	}

}
