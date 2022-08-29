package com.nagarro.collections;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.model.Employee;

public class EmployeeManipulationExample {

	public static void main(String[] args) {

		final List<Employee> employeeList = new ArrayList<>();
		final EmployeeListOperation employeeListOperation = new EmployeeListOperation();
		final EmployeeListPrinter employeeListPrinter = new EmployeeListPrinter();

		employeeList.add(new Employee(1, "Aditya", "Engineer"));
		employeeList.add(new Employee(4, "Anurag", "Engineer"));
		employeeList.add(new Employee(4, "Anurag", "Engineer"));
		employeeList.add(new Employee(2, "Ajit", "Engineer"));
		employeeList.add(new Employee(2, "AjitDuplicate", "Engineer"));
		employeeList.add(new Employee(3, "Abhishek", "Engineer"));
		
//		final Employee e1 = new Employee(1, "Aditya", "Engineer");
//		final Employee e2 = new Employee(1, "Aditya", "Engineer");
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e1.equals(e2));

		System.out.println("ARRAYLIST BEFORE SORTING");
		employeeListPrinter.printEmployeeList(employeeList);

//		Sort List
		final List<Employee> sortedList = employeeListOperation.sortList(employeeList);

		System.out.println("ARRAYLIST AFTER SORTING");
		employeeListPrinter.printEmployeeList(sortedList);

//		Remove Duplicates
		final List<Employee> employeeListWithoutDuplicates = employeeListOperation
				.removeDuplicatesFromList(employeeList);

		System.out.println("ARRAYLIST AFTER REMOVING DUPLICATES");
		employeeListPrinter.printEmployeeList(employeeListWithoutDuplicates);

	}

}
