package com.nagarro.oopConcept;

//POLYMORPHISM
class Employee{
	
	double salary = 1000.0;
	
	Employee(){
		System.out.println("In Employee");
	}
	
	public double getSalary() {
		return salary;
	}
}

class User extends Employee{
	double salary = 500.0;
	
//	Example of Constructor Overloading
	User(){
		System.out.println("In User");
	}
	
	User(String arg){
		System.out.println("Invoked "+arg);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void print() {
		System.out.println("Printed");
	}
}


public class Main {

	public static void main(String[] args) {
		
		User u = new User();
		System.out.println(u.salary);
		System.out.println(u.getSalary());
		
		Employee e = new User();
		System.out.println(e.salary);
		// Example of Overriding
		System.out.println(e.getSalary());

		
		Employee emp = new Employee();
		System.out.println(emp.salary);
		System.out.println(emp.getSalary());


//		Instatiating Using new Keyword
		new User("const");
	}

}
