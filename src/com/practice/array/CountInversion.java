package com.practice.array;

public class CountInversion {
	
	public static int countInversion(int[] arr, int i, int j) {
		if(i >= j) {
			return 0;
		}
		int count = 0;
		int mid = (i+j)/2;
		
		count+=countInversion(arr, i, mid);
		count+=countInversion(arr, mid+1, j);
		count+=mergeAndCount(arr, i , mid , j);
		return count;
		
	}
	
	public static int mergeAndCount(int[] arr, int i , int mid, int j) {
		int count = 0;
		int[] merged = new int[j-i+1];
		int temp1 = i;
		int temp2 = mid+1;
		int temp = 0;
		while(temp1 <= mid && temp2 <=j ) {
			if(arr[temp1] > arr[temp2]) {
				count+=mid-temp1+1;
				merged[temp] = arr[temp2++];
				
			}else {
				merged[temp] = arr[temp1++];
			}
			temp++;
		}
		
		while(temp1 <= mid) {
			merged[temp] = arr[temp1];
			temp++;
			temp1++;
		}
		
		while(temp2 <=j) {
			merged[temp++] = arr[temp2++];
		}
		for(int k = i; k <= j ;k++) {
			arr[k] = merged[k-i];
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2, 3, 4, 5, 6};
		System.out.println(countInversion(arr,0,arr.length-1));

	}

}
