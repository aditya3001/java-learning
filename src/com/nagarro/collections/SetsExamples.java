package com.nagarro.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

//		HashSet

		final Set<String> hs = new HashSet<String>();

		hs.add("This");
		hs.add("Is");
		hs.add("The");
		hs.add("Order");
		hs.add("The");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		Linked HashSet

		Set<String> lhs = new LinkedHashSet<String>();

		lhs.add("This");
		lhs.add("Is");
		lhs.add("The");
		lhs.add("Order");
		lhs.add("This");

		// Traversing elements
		itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Set<String> ts = new TreeSet<String>();

		ts.add("This");
		ts.add("Is");
		ts.add("The");
		ts.add("Order");
		ts.add("The");

		// Traversing elements
		itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
