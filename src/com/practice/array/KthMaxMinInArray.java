package com.practice.array;

import java.util.PriorityQueue;

import com.practice.array.MaxMinArray.Pair;

public class KthMaxMinInArray {

	static class Pair{
		public int max;
		public int min;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int max = findKthMaxArray(arr, 3);
		System.out.println("Max: "+max);
		System.out.println(-7>>1);
		
	}
	
	// Use PriorityQueue that implements MinHeap
	// Adding in PriorityQueue takes O(logn)
	public static int findKthMaxArray(int[] arr, int k) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i = 0 ; i < k ; i++) {       //O(klog(n)) for this loop because of add operation
			q.add(arr[i]);                    // O(log(n))
		}
		
		for(int i = k ; i < arr.length ; i++) {  // O((n-k)log(n))
			if(q.peek()  < arr[i]) {
				q.poll();
				q.add(arr[i]);
			}
		}
		
		return q.peek();
		
		
	}

}
