package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	private static List<Department> dept;
	private static Stream<Map<String, Long>> stream;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1 :: Find out the sum of salary of all employees. 
		List<Employee> emp=EmployeeRepository.getEmployees();
		setDept(EmployeeRepository.getDepartments());
		double sum=emp.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.println("-----------answer 1nd question-----------");
		System.out.println("total salary is "+sum);
		
	    
		//Q2 :: List out department names and count of employees in each department. 
		System.out.println();
		System.out.println("-----------answer 2nd question-----------");
		//Set<String> dp=dept.stream().map(e->e.getDepartmentName()).collect(Collectors.toSet());
		Map<String,Long> mp=emp.stream()
				.filter(e->e.getDepartment()!=null)
				.collect(Collectors.
						groupingBy(e->e.getDepartment().getDepartmentName(),TreeMap::new,Collectors.counting()));
		mp.forEach((department, count) ->
        System.out.println(department + ": " + count));
		
		//Q3 :: Find out the senior most employee of an organization. 
		System.out.println();
		System.out.println("-----------answer 3nd question-----------");
		System.out.println();
		Optional<Employee> name=emp.stream().filter(e->e.getHireDate()!=null)
	    		.collect(Collectors.minBy(Comparator.comparing(e->e.getHireDate())));
		System.out.print(name.get().getFirstName()+" "+name.get().getLastName());
		
		//Q4 :: List employee name and duration of their service in months and days. 
		System.out.println();
		System.out.println("-----------answer 4nd question-----------");
		 List<String> results = emp.stream()
	                .map(e -> String.format("%s: %d months, %d days",
	                        e.getFirstName(),
	                        Period.between(e.getHireDate(), LocalDate.now()).getYears() * 12 + Period.between(e.getHireDate(), LocalDate.now()).getMonths(),
	                        Period.between(e.getHireDate(), LocalDate.now()).getDays()))
	                .collect(Collectors.toList());
		 
        results.forEach(System.out::println);	
        
        // Q5 :: Find out employees without department.
        System.out.println();
		System.out.println("-----------answer 5nd question-----------");
       List<Employee> res=emp.stream().filter(e->e.getDepartment()==null).collect(Collectors.toList());
       for(Employee e:res)
    	   System.out.println(e.getFirstName());
       
       //Q6
//       List<Department> dep=dept.stream().filter(e->e.).collect(Collectors.toList());
//       for(Employee e:res)
//    	   System.out.println(e.getFirstName());
       
       //Q7:: Find departments with highest count of employees.
       System.out.println();
		System.out.println("-----------answer 7nd question-----------");
       setStream(Stream.of(mp));

       long max = mp.values().stream().max(Comparator.naturalOrder()).get();
      String departmentName= mp.entrySet().stream()
       .filter(e -> e.getValue() == max)
       .map(Map.Entry::getKey)
       .collect(Collectors.toList()).get(0);
      System.out.println(departmentName);
//      String mp2=stream.collect(Collectors.maxBy(Long::compareTo));
//		mp2.forEach((department, count) ->
//       System.out.println(department + ": " + count));
       
       
	//	String name=emp.stream().filter(e->e)
		
		
//        mp.forEach(e->{System.out.print});
		
	}

	public static List<Department> getDept() {
		return dept;
	}

	public static void setDept(List<Department> dept) {
		Main.dept = dept;
	}

	public static Stream<Map<String, Long>> getStream() {
		return stream;
	}

	public static void setStream(Stream<Map<String, Long>> stream) {
		Main.stream = stream;
	}

}
