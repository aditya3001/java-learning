package com.nagarro.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.nagarro.model.Employee;

public class Hashing {

	public static void main(String[] args) {
		

		/*
		 * Hashing is designed to solve the problem of needing to efficiently find or store an item in a collection.
		 Hashing means using some function or algorithm to map object data to some representative integer value. 
		 This so-called hash code (or simply hash) can then be used as a way to narrow down our search when looking 
		 for the item in the map.
		 */
		
		Map<String, Integer> map = new HashMap<>();  
		map.put("Sunny", 2); 
		map.put("Xunny", 2); 
		map.put("Aman", 19); 
		map.put("Ritesh", 39); 
		
		
		System.out.println(map.get("Xunny"));
		
		
		Map<Employee, Integer> eMap = new HashMap<>();  
		eMap.put(new Employee(1, "Adi", "Engin"), 1); 
		eMap.put(new Employee(2, "Adit", "Engine"), 2); 
		eMap.put(new Employee(4, "Adit", "Engine"), 3); 
		eMap.put(new Employee(3, "Adity", "Enginee"), 7); 
		eMap.put(new Employee(4, "Aditya", "Engineer"), 4); 
		
		System.out.println(eMap.get(new Employee(3, "Aditya", "Engineer")));

	}

}
