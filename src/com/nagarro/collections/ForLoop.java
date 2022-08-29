package com.nagarro.collections;

public class ForLoop {

	public static void main(String[] args) {

//		Simple For Loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

//		Enhanced Loop
		int arr[] = { 12, 23, 44, 56, 78 };
// Printing array using for-each loop
		for (int i : arr) {
			i = 10;
		}

		for (int i : arr) {
			System.out.println(i);
		}

		/*
		 * To Traverse the collection object Benefit: it eliminates the possibility of
		 * bugs and makes the code more readable
		 * 
		 */
	}
}
