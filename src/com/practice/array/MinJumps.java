package com.practice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinJumps {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
			int size = Integer.parseInt(br.readLine());
			String[] s = ((String)br.readLine()).split("\\s+");
			int[] arr = new int[size];
			for(int i = 0 ; i < size ; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}
//			System.out.println(new MinJumps().minJumps(arr));
			System.out.println(MinJumps.minJumpsEfficient(arr));
	}
	
	// DP solution - O(n^2)
	public static int minJumps(int[] arr) {
		int n = arr.length;
		int[] jumps = new int[n];
		if(n == 0 || arr[0]==0) {
			return -1;
		}
		jumps[0] = 0;
		for(int i = 1; i < n ; i++) {
			jumps[i] = Integer.MAX_VALUE;
			for(int j = 0; j < i ; j++) {
				if(j+arr[j] >= i && jumps[j] != Integer.MAX_VALUE) {
						jumps[i] = Math.min(jumps[i],jumps[j]+arr[j] );
				}
			}
		}
		
		if(jumps[n-1]==Integer.MAX_VALUE) {
			return -2;
		}
		return jumps[n-1];
	}
	
	// O(n) solution
	public static int minJumpsEfficient(int[] arr) {
	
		if(arr.length <= 1) {
			return -1;
		}
		if(arr[0]==0) {
			return -1;
		}
		int maxReachable = arr[0];
		int jumps = 1;
		int step = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(i==arr.length-1) {
				return jumps;
			}
			
			maxReachable = Math.max(maxReachable, i+arr[i]);
			step--;
			if(step == 0) {
				jumps++;
				if(i >maxReachable) {
					return -1;
				}
				step = maxReachable-i;
			}
			
		}
		return -1;
	}

}
