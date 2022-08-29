package com.nagarro.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.nagarro.model.Employee;

public class EmployeeListPrinter {
	
	public void printEmployeeList(final List<Employee> employeeList) {
		List<String> names = Arrays.asList("Rakesh", "Rajesh", "Vikram", "Aman");
		Optional<String> longestString = Optional.ofNullable(names.stream()
		.reduce("tejendra",(name1, name2) -> name1.length() > name2.length() ? name1 : name2));
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		
	}

}
