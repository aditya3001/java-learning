package com.practice.array;

public class Sort012Array {

	public static void main(String[] args) {
		int[] arr = {1,1,1,0,2,0,2,0,1};
		sortArray(arr,arr.length);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void sortArray(int[] arr, int n) {
		int low = 0;
		int high = n-1;
		int mid = 0;
		
		while(mid <= high) {
			switch(arr[mid]) {
			case 0 : {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				mid++;
				low++;
				break;
			}
			
			case 1 : {
				mid++;
				break;
			}
			case 2 : {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			}
			
		}
		
		return;
	}

}
