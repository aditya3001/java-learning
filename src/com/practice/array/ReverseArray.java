package com.practice.array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
//		reverseArray(arr);
		arr = reverseArrayRecursive(arr,0,arr.length-1);
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	// Runtime complexity - O(n)
	// Space complexity - O(1)
	// Iterative
	public static void reverseArray(int[] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		
		for(int i = 0 ; i < n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] reverseArrayRecursive(int[] arr, int start, int end) {
		if(start >= end) {
			return arr;
		}
		
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		return reverseArrayRecursive(arr,start+1,end-1);
		
		
	}
	

}
