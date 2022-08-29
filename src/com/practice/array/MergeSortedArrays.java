package com.practice.array;

import java.util.Arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,4,6,8};
		int[] arr2 = {2,3,5,7,9};
		merge(arr1,arr2);
		for(int i = 0 ; i < arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for(int i = 0 ; i < arr2.length;i++) {
			System.out.print(arr2[i]);
		}

	}
	
	public static void merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = arr1.length-1;
		while(i <k && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				i++;
			}else {
				int temp = arr2[j];
				arr2[j] =arr1[k];
				arr1[k] = temp;
				k--;
				j++;
			}
			
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
	}

}
