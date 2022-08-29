package com.nagarro.collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.nagarro.model.Employee;

public class EmployeeListOperation {

	public List<Employee> removeDuplicatesFromList(final List<Employee> employeeList) {

		return employeeList.stream().distinct().collect(Collectors.toList());

	}

	public List<Employee> sortList(final List<Employee> employeeList) {

		// Sorting
		Collections.sort(employeeList, (a, b) -> a.getId() - b.getId());

		return employeeList;
	}

}
