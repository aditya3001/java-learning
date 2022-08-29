package com.example.leetcode;

import java.time.LocalDate;
import java.util.Calendar;

class School {
	public String name;
	public int numStudents;
	public  int CODE = 1;

	public School(String name, int numStudents) {
		System.out.println("IN SCHOOL CONSTRUCTOR");
		this.name = name;
		this.numStudents = numStudents;
	}

	public String getName() {
		return this.name;
	}

	public int getNumStudents() {
		return this.numStudents;
	}
}

class University extends School {
	private final String type = "University";
	private boolean isPublic;
	public  int CODE = 2;

	public University(String name, int numStudents, boolean isPublic) {
		super(name, numStudents);
		this.name = name;
		this.numStudents = numStudents;
		this.isPublic = isPublic;
		System.out.println("IN UNIVERSITY CONSTRUCTOR");

	}

	public boolean getIsPublic() {
		return this.isPublic;
	}
}

public class Inheritence {
	public static void main(String[] args) {
		School u = new University("ABC", 1000, true);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.MONTH) - 3);
		c.get(Calendar.DST_OFFSET);

		LocalDate now = LocalDate.now();
		System.out.println(now.getMonthValue());
		System.out.println(now.minusMonths(3).getYear());

	}
}
