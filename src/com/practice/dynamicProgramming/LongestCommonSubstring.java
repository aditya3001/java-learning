package com.practice.dynamicProgramming;

public class LongestCommonSubstring {
	
	public static void LIS(char[] arr1, char[] arr2) {
		int[][] dp = new int[arr1.length+1][arr2.length+1];
		for(int i = 0 ; i <= arr1.length;i++) {
			for(int j = 0 ; j <= arr2.length ;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}else if(arr1[i-1]==arr2[j-1]) {
					dp[i][j] = 1+dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[arr1.length][arr2.length]);
		
		
		//BACKTRACKING
		int i = arr1.length;
		int j = arr2.length;
		while(i>=1 && j>=1) {
			if(dp[i][j] == 1+dp[i-1][j-1] && arr1[i-1]==arr2[j-1]) {
				System.out.print(arr1[i-1]+" ");
				i--;
				j--;
			}else {
				if(dp[i-1][j]>dp[i][j-1]) {
					i--;
				}else {
					j--;
				}
				
			}
		
		}
	}
	
	public static void LISSpaceOptimized(char[] arr1, char[] arr2) {
		int[][] dp = new int[2][arr2.length+1];
		for(int i = 0 ; i <= arr1.length;i++) {
			for(int j = 0 ; j <= arr2.length ;j++) {
				if(i==0 || j==0) {
					dp[i%2][j]=0;
				}else if(arr1[i-1]==arr2[j-1]) {
					dp[i%2][j] = 1+dp[(i%2)^1][j-1];
				}else {
					dp[i%2][j] = Math.max(dp[(i%2)^1][j], dp[i%2][j-1]);
				}
			}
		}
		System.out.println(dp[arr1.length%2][arr2.length]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "ataatctgtactttcgcgcgcgatacagttgctcaagtagccattcgggtgcctgacggcatgacatgtatgccactttcaccaaagtaatcatcttaac";
//		String s2 = "ggtaataaaaggctcgcccaccccgaccctgaagtgaagaagtaacgttgttcatgatcgacccgcatgaattcatagcaacgccgactgatctactccc";
		String s1 = "abcdeqfghijk";
		String s2 = "defghijklm";
		LISSpaceOptimized(s1.toCharArray(),s2.toCharArray());

	}

}
