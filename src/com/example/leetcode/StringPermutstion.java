package com.example.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPermutstion {
	
	public static int factorial(int val) {
		int fact=1;
		for(int i =1; i<=val;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void permutations(String str) {
		int len = str.length();
		int numPermutation = factorial(len);
		int temp;
		for(int i = 0; i<numPermutation; i++) {
			StringBuilder a = new StringBuilder(str);
			temp = i;
			for(int j = len; j>=1; j--) {
				int quo = temp/j;
				int rem = temp%j;
				System.out.print(a.charAt(rem));
				a.deleteCharAt(rem);
				temp = quo;
			}
			System.out.println();
		}
	}
	
	public static void permutationsRec(String str, int left, int right) {
//		System.out.println("before swapping "+str+left+right);
		if(left==right) {
			System.out.println(str);
			return;
		}
		
		for(int i = left; i<=right; i++) {
			str = swap(str,left,i);
//			System.out.println("after swapping "+left+i+str);
			permutationsRec(str,left+1,right);
			str = swap(str,i,left);
		}
		return;
	}
	
	public static String swap(String s, int l, int r) {
		
		char[] arr = s.toCharArray();
		char temp =arr[l];

		arr[l] =arr[r];
		arr[r] = temp;
		return String.copyValueOf(arr);
	}
	public static void powerSet(String str, int i, String current) {
		
		if(i>=str.length()) {
			System.out.println(current);
			return;
		}
		powerSet(str,i+1, current);
		powerSet(str,i+1,current+str.charAt(i));
		return;
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String val = br.readLine();
		
		permutations(val);
		
//		powerSet(val,0,"");
//		val = swap(val,1,2);
//		System.out.println(val);
//		permutationsRec(val,0,val.length()-1);
		
//		int a = 3;
//		int b = 2;
//		double c = a/b;
//		
//		char d = (char)a;
//		System.out.println(d);
		
	}

}
