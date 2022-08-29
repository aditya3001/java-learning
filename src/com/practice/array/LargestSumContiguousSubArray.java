package com.practice.array;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -6, 6, 1, -2, 4, -2 };
		findSum(arr);
		findSumDP(arr);
		findSubArray(arr);
	}

	// KADANE's ALGORITHM
	public static void findSum(int[] arr) {
		int maxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}

		System.out.println(maxSum);
	}

	// DP
	public static void findSumDP(int[] arr) {
		int max_so_far = arr[0];
		int curr_max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			curr_max = Math.max(arr[i], curr_max + arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		System.out.println(max_so_far);
	}

	// To print the largest sum subarray
	public static void findSubArray(int[] arr) {
		int max_ending_here = 0;
		int start = 0;
		int end = 0;
		int s = 0;
		int max_so_far = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here += arr[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_so_far < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
			
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
