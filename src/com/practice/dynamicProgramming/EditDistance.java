package com.practice.dynamicProgramming;

public class EditDistance {

	public static void editDistance(char[] str1, char[] str2) {
		
		int[][] dp = new int[str1.length+1][str2.length+1];
		
		for(int i = 0 ; i <= str1.length ; i++) {
			for(int j = 0 ; j<=str2.length ; j++) {
				if(i==0) {
					dp[i][j] = j;
				}else if(j==0) {
					dp[i][j] = i;
				}else {
					int cost = str1[i-1]==str2[j-1]?0:1;
					dp[i][j] = Math.min(dp[i][j-1]+1, Math.min(dp[i-1][j-1]+cost,dp[i-1][j]+1));
				}
				
			}
		}
		System.out.println(dp[str1.length][str2.length]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "snack";
		String s2 = "snap";
		editDistance(s1.toCharArray(),s2.toCharArray());
		

	}

}
