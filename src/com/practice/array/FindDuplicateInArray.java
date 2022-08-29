package com.practice.array;

import java.util.Arrays;

public class FindDuplicateInArray {

	// Using XOR operator(^)
	public static void main(String[] args) {
		int[] arr = {5,4,2,3,1,5};
		int xor1 = 0;
		int xor2 = 0;
		for(int i = 1 ; i<=arr.length-1;i++) {
			xor1 = xor1^i;
		}
		for(int i = 0 ; i<arr.length;i++) {
			xor2 = xor2^arr[i];
		}
		System.out.println(xor1^xor2);

	}

}
