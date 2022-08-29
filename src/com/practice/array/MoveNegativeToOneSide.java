package com.practice.array;

public class MoveNegativeToOneSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-1,2,-3,4,-1};
		moveNegative(arr);
		for(int i= 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		

	}
	// Dutch flag algorithm
	public static void moveNegative(int[] arr) {
		int start = 0;
		int current = 0;
		
		while(start <arr.length) {
			
			if(arr[start] >= 0) {
				start++;
			}else {
				int temp = arr[start];
				arr[start] = arr[current];
				arr[current] = temp;
				start++;
				current++;
			}
		}
		
	}

}
