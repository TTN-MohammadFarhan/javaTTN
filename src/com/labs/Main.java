package com.labs;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=EmployeeRepository.getEmployees();
		List<Department> dept=EmployeeRepository.getDepartments();
		double sum=emp.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.print("total salary is "+sum);
	    
		//Q2
		//Set<String> dp=dept.stream().map(e->e.getDepartmentName()).collect(Collectors.toSet());
		Map<String,Long> mp=emp.stream()
				.filter(e->e.getDepartment()!=null)
				.collect(Collectors.groupingBy(e->e.getDepartment().getDepartmentName(),TreeMap::new,Collectors.counting()));
		mp.forEach((department, count) ->
        System.out.println(department + ": " + count));
		
		//Q3
		
		
//        mp.forEach(e->{System.out.print});
		
	}

}
