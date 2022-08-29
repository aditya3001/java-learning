package com.practice.String;

public class RecursivelyFormSentence {
	
	static int C=3;
	static int R = 3;

	public static void print(String[][] arr) {

		String[] output = new String[R];
		
		for(int i = 0 ; i < C ; i++) {
			if(arr[0][i]!="") {
				printUtil(arr, 0, i, output);
			}
		}
				
	}
	


	private static void printUtil(String[][] arr, int i, int c2, String[] output) {
		// TODO Auto-generated method stub
		output[i] = arr[i][c2];
		
		
		if(i == R-1) {
			for(int k = 0; k <C;k++) {
				System.out.print(output[k]+" ");
				
			}
			System.out.println();
			return;
		}
		
		for(int j = 0 ; j < C ; j++) {
			if(arr[i+1][j]!="") {
				printUtil(arr,i+1,j,output);
			}
		}
		
	}

	public static void main(String[] args) {
		String[][] arr = { { "you", "we", "" },
							{ "have", "are", "" }, 
							{ "sleep", "eat", "drink" } };
		print(arr);
	}

}
