package com.example.java8feature;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Job {
	private int jobId;
	private String designation;

	public Job(int jobId, String designation) {
		super();
		this.jobId = jobId;
		this.designation = designation;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

class Employee {
	private String name;
	private int age;
	private Job job;

	public Employee(String name, int age, Job job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Job getJob() {
		return this.job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

}

public class StreamAPIS {

	public static void main(String[] args) {
		final List<Employee> employeeList = new ArrayList<>();

		final Employee employee1 = new Employee("Aditya", 23, new Job(1, "Engineer"));
		final Employee employee2 = new Employee("Amit", 26, new Job(2, "Consultant"));
		final Employee employee3 = new Employee("Shivam", 26, new Job(3, "HR"));

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		System.out.println(employeeList.stream().count());

		// Map - method converts (maps) an element to another object
		System.out.println(employeeList.stream().map((employee) -> {
			return employee.getName().toLowerCase();
		}).collect(Collectors.toList()));

		// Filter
		employeeList.stream().filter((employee) -> {
			return employee.getAge() > 23;
		}).collect(Collectors.toList()).forEach((employee) -> {
			System.out.println(employee.getName());
		});

		// Reduce
		System.out.println(
				"Max Age is " + employeeList.stream().reduce(new Employee("Dummy", 0, null), (employe1, employe2) -> {
					return employe1.getAge() > employe2.getAge() ? employe1 : employe2;
				}).getAge());

		List<String> myList = Stream.of("a", "b").map(String::toUpperCase).collect(Collectors.toList());
		assertEquals(Arrays.asList("A", "B"), myList);

		List<List<String>> list = Arrays.asList(Arrays.asList("a","c"), Arrays.asList("b"));
		System.out.println(list);
		System.out.println(list.stream().map(Collection::stream).map(s->s.sequential()).collect(Collectors.toList()));
		System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));

	}
}
