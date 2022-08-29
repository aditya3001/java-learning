package com.practice.array;

public class MinMergingOperationToMakeArrayPallindrome {

	public static void main(String[] args) {
		int[] arr = {1,5,3,4,8,1};
		System.out.println(findNumOperation(arr));
	}

	private static int findNumOperation(int[] arr) {
		int numOps = 0;
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i]==arr[j]) {
				i++;
				j--;
			}else if(arr[i] < arr[j]) {
				if(i+1 < j) {
					
					numOps++;
					arr[i+1]+=arr[i];
					i++;
					
				}else if(i+1==j) {
					numOps++;
					i++;
				}
			}else if(arr[i] > arr[j]) {
				if(i< j-1) {
					numOps++;
					arr[j-1]+=arr[j];
					j--;
				}else if(i==j-1) {
					numOps++;
					j--;
				}
			}
		}
		return numOps;
	}
	
	

}
