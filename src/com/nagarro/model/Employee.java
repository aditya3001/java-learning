package com.nagarro.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private String employeeName;
	private String employeeDesignation;

	public Employee() {
	}

	/**
	 * @param id
	 * @param employeeName
	 * @param employeeDesignation
	 */
	public Employee(int id, String employeeName, String employeeDesignation) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (other.id != this.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.id + " " + this.employeeName + " " + this.employeeDesignation;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
