package com.practice.array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,6,8,9,13,14,16};
		System.out.println(binarySearch(arr, 0, arr.length-1, 9));

	}
	
	public static int binarySearch(int[] arr , int start, int end, int num) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = start+(end-start)/2;
		if(arr[mid] == num) {
			return mid;
		}else if(arr[mid] > num) {
			return binarySearch(arr, start, mid-1, num);
		}else {
			return binarySearch(arr, mid+1, end, num);
		}
		}

}
