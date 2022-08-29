package com.practice.dynamicProgramming;

public class LongestIncreasingSubsequence {
	public static int lis(int[] arr) {
	    int[] lisArray = new int[arr.length];
	    lisArray[0] = 1;
	    int maxLength=0;
	    for (int i=1; i<arr.length; i++) {
	      int maxCount = 0;
	      for(int j=0; j<i; j++) {
	        if (arr[j]<arr[i]) {
	          maxCount = Math.max(maxCount, lisArray[j]);
	        }
	      }
	      lisArray[i] = maxCount+1;
	      maxLength = Math.max(maxLength, lisArray[i]);
	    }
	    return maxLength;
	  }
	
//	public sta

}
