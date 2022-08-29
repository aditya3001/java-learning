package com.practice.dynamicProgramming;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Knapsack01Problem {
	 public static void maximumValue(int knapsackSize, int[] weight, int[] value) {
	        int nItems = weight.length;

	        // matrix[i][j] defines the optimal solution with first i items and total knapsackSize j

	        int[][] matrix = new int[nItems + 1][knapsackSize + 1];

	        for (int i = 1; i <= nItems; i++) { // outer loop iterating through weights

	            for (int j = 1; j <= knapsackSize; j++) {
	                // check if the weight of current item i is less than or equal to the capacity of sack,
	                // take maximum of once including the current item and once not including
	                if (weight[i - 1] <= j) {
	                    matrix[i][j] = Math.max(matrix[i - 1][j], value[i - 1] + matrix[i - 1][j - weight[i - 1]]);
	                } else {
	                    matrix[i][j] = matrix[i - 1][j];
	                }
	            }
	        }
	        System.out.println("Maximum value possible : " + matrix[nItems][knapsackSize]);
	        
	        //BACKTRACKING
	        int j = knapsackSize;
	        int i = nItems;

	        while (i > 0 && j > 0) {
	            if (matrix[i][j] == matrix[i - 1][j]) {
	                i--;
	            } else {
	                System.out.println("Selected item no. " + i + " of Weight: " + weight[i - 1]);
	                //       selected[i - 1] = 1;
	                j = j - weight[i - 1];
	                i--;
	            }
	        }
	    }


	    public static void main(String[] args) {

	        int knapsackSize = 23;
	        int[] weights = {5, 7, 3, 8, 4, 3, 7, 5}, values = {12, 10, 9, 16, 14, 7, 14, 10};
	        maximumValue(knapsackSize, weights, values);
	        
//	        int[] A= {-69, -68, -39, -25, -6, 18, 33, 39, 42, 46, 52, 55, 55, 64, 71};
//	        int [] B = {-97,-92,-90,-90,-87,-85,-82,-77,-77,-77,-75,-71,-67,-64,-60,-59,-58,-52,-49,-48,-48,-47,-47,-46,-41,-36,-35,-29,-28,-26,-25,-20,-19,-14,-13,-13,-11,-10,-6,-4,2,3,9,12,15,17,20,22,23,24,27,29,36,36,37,38,39,42,45,47,48,48,50,52,52,53,57,59,60,63,63,64,64,65,68,70,71,76,76,77,83,83,84,85,86,89,97,97};
//	        int[] C = {-95,-95,-86,-83,-70,-67,-57,-53,-52,-35,-33,-32,-30,-20,-16,-15,-15,-11,-10,-10,-4,0,4,15,18,34,36,37,39,41,43,43,48,49,50,51,58,63,64,67,69,77,79,84,84,94,95,97};
//	        System.out.println(commonElements(A, B, C, A.length, B.length, C.length)); 
	    }
	    
	    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
	    {
	        // code here 
	        LinkedHashSet<Integer> result = new LinkedHashSet<>();
	        int a = 0,b=0,c=0;
	        while(a<n1 && b<n2 && c<n3){
	            if(A[a] < B[b] && A[a] < C[c]){
	                a++;
	            }else if(B[b] < A[a] && B[b] < C[c]){
	                b++;
	            }else if(C[c] < A[a] && C[c] < B[b]){
	                c++;
	            }else if (A[a]==B[b] && B[b]==C[c]){
	                result.add(A[a]);
	                a++;
	                b++;
	                c++;
	            }else if(A[a] == B[b] ){
	                a++;b++;
	            }else if(B[b]== C[c]){
	                b++;c++;
	            }else if(C[c] == A[a]){
	                c++;a++;
	            }
	            
	        }
	        return new ArrayList<>(result);
	    }
}
