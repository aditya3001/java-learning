package com.example.leetcode;

import java.util.Scanner;

/*
 * 1,5,3,-1,6
 * 
 * target sum  = 7
 * 
 * ans - [5,3,-1]
 */
public class GreaterSubArraySum {
	
	public static void getSubArray(int[] arr, int n, int cur) {
		
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER NUMBER OF ARRAY ELEMENTS : ");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) {
			arr[i] = scn.nextInt();
		}
		getSubArray(arr,n,0);

	}

}
