package com.example.miscellaneous;


import java.util.Scanner;

public class MergeSort {
	
	
	public static void merge(int[] arr, int low, int med, int up) {
		int leftArraySize = med-low+1;
		int rightArraySize = up-med;
		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightArraySize];
		for(int i = 0; i <leftArraySize;i++) {
			leftArray[i] = arr[low+i];
		}
		for(int i = 0; i <rightArraySize;i++) {
			rightArray[i] = arr[med+1+i];
		}
		int cli=0,cri = 0,cai=low;
		while(cli<leftArraySize && cri<rightArraySize) {
			if(leftArray[cli] <= rightArray[cri]) {
				arr[cai] = leftArray[cli];
				cli++;cai++;
			}else {
				arr[cai] = rightArray[cri];
				cri++;cai++;
			}
		}
		
		while(cli<leftArraySize) {
			arr[cai] = leftArray[cli];
			cli++;cai++;
		}
		while(cri<rightArraySize) {
			arr[cai] = rightArray[cri];
			cri++;cai++;
		}
		
		
	}
	
	public static void sort(int[] arr,int start, int end ) {
		if(start >=end) {
			return;
		}
		int middle = start+(end-start)/2;
		sort(arr,start,middle);
		sort(arr,middle+1, end);
		
		merge(arr,start,middle,end);
	}
	
	
  public static void main(String args[]) {
	  int[] arr = {1,2,6,3,5,0,9,1,10,8,1000,76};
	  
	  sort(arr,0,arr.length-1);
	  for(int j = 0; j < arr.length ; j++) {
		  System.out.print(arr[j]+" ");
	  }
	  
  }

  
}