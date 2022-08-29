package com.nagarro.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {

//		HashMap
		final Map<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("vishal", 10);
		hm.put("sachin", 30);
		hm.put("vaibhav", 20);

		// Finding the value for a key
		System.out.println("Value for 1 is " + hm.get("vishal"));

		// Traversing through the HashMap
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

//        LinkedHashMap
		final Map<String, Integer> lhm = new LinkedHashMap<>();

		lhm.put("vishal", 10);
		lhm.put("sachin", 30);
		lhm.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : lhm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

//		TreeMap

		Map<String, Integer> tm = new TreeMap<>();

		tm.put("vishal", 10);
		tm.put("sachin", 30);
		tm.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : tm.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());

		Map<String, Integer> studentMap = new HashMap<String, Integer>();

		studentMap.put("Jyous", 87);
		studentMap.put("Klusener", 82);
		studentMap.put("Xiangh", 91);
		studentMap.put("Lisa", 89);
		studentMap.put("Narayan", 95);
		studentMap.put("Arunkumar", 86);
		Map<String, Integer> sortedStudentMap = studentMap.entrySet().stream()
				.sorted(Entry.comparingByKey((o1, o2) -> o1.length() - o2.length()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("Before Sorting : ");

		System.out.println(studentMap);

		System.out.println("After Sorting : ");

		System.out.println(sortedStudentMap);
		
		
	

	}

}
