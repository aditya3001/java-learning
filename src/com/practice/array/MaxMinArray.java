package com.practice.array;

public class MaxMinArray {
	
	static class Pair{
		public int max;
		public int min;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Pair minmax = findMaxMinArray(arr);
		System.out.println("Min: "+ minmax.min+" Max: "+minmax.max);
		
	}
	
	// Run time complexity O(n)
	public static Pair findMaxMinArray(int[] arr) {
		Pair minmax = new Pair();
		if(arr.length==1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
		}else {
			if(arr[1]<arr[0]) {
				minmax.max = arr[0];
				minmax.min = arr[1];
			
			}else {
				minmax.max = arr[1];
				minmax.min = arr[0];
			}
			System.out.println(minmax.min);
			for(int i = 2; i < arr.length; i++) {
				if(arr[i] > minmax.max) {
					minmax.max = arr[i];
				}else if(arr[i] < minmax.min) {
					minmax.min = arr[i];
				}
			}
			
		}
		
		return minmax;

	}
	

}
