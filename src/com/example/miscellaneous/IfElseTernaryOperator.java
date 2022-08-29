package com.example.miscellaneous;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IfElseTernaryOperator {

	public static void main(String[] args) throws FileNotFoundException {
		int X = 0,Y = 0,heartRate = 0,A = 0,B=0;
		String result = "";
		if (X+Y>30){
			   result="truth";
			}
			else if (A>3 || B<6){

			   result="truth";
			}
			else if (heartRate==70 && X>3){
			   result="truth";
			}
			else {
			   result="lie";
			}
		List<String> ls = new ArrayList<>(Arrays.asList("a"));
//		int i =0;
//		do {
//			i++;
//			System.out.println(i);
//		}while(i<99);
//		
//		result = (X+Y>30) ? "truth" : (A>3 || B<6 ?  "truth" : ( (heartRate==70 && X>3) ? "truth":"lie"));
		int num = 5;
//		for(int i = 0; i < num; i++){
//			for(int l = num-i+1; l >0; l--) {
//				System.out.print("  ");
//			}
//			for(int  j = i+1 ; j <= 2*i+1; j++){
//			System.out.print(j+" ");
//			}
//			for(int  k = 2*i ; k > i; k--){
//				System.out.print(k+" ");
//			}
//			System.out.println();
//			}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = scn.nextInt();
		for(int i = 1; i <=n ; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			for(int l = n; l>i; l--) {
				System.out.print("  ");
			}
			for(int k = i; k>=1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("asd".substring(1,2));
		
//		Scanner scn = new Scanner(new File("C:\\Users\\adityajain\\Desktop\\numbers.java"));
//		int sum = 0;
//		int count = 0;
//		while(scn.hasNext()) {
//			int nom = scn.nextInt();
//			System.out.println(nom);
//			sum+=nom;
//			count++;
//		}
//		System.out.println((double)sum/count);
	}
	
}
