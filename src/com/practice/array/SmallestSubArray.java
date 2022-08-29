package com.practice.array;

//public class SmallestSubArray {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] a = {1, 4, 45, 6, 0, 19};
//		System.out.println(smallestSubWithSum(a,a.length,51));
//	}
//	 public static int smallestSubWithSum(int a[], int n, int x) {
//	        
//	        int start = 0;
//	        int end = n-1;
//	        int sum = 0;
//	        int length = 0;
//	        for(int  i = 0 ; i < n ; i++){
//	            
//	           sum+=a[i];
//	            
//	        }
//	        while(start<=end){
//	            int smallIndex = a[start]<a[end]?start:end;
//	            int largeIndex = a[start]>=a[end]?start:end;
//	            if(sum > x){
//	                if(sum-a[smallIndex] > x){
//	                    if(sum-a[smallIndex]-a[largeIndex] >x){
//	                        start++;
//	                        end--;
//	                    }else{
//	                        start++;
//	                    }
//
//	                }
//	                length = end-start;
//
//	            }else{
//	                    return length;
//	            }
//	        }
//	        return length;
//	    }
//
//}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class SmallestSubArray {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
// 		Scanner sc= new Scanner(System.in);
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());
		
		ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
// 		int n = sc.nextInt();
		while(n > 0){
		  //  String s = sc.nextLine();
		  //  System.out.println(s);
		  //  String[] arr = s.split(" ");
		  //  ArrayList<Integer> sub = new ArrayList<>();
		  //  for(int i = 0 ; i < arr.length ; i++){
		  //      sub.add(Integer.parseInt(arr[i]));
		  //  }
		  //  n--;
		  //  ls.add(sub);
		  String[] str = read.readLine().trim().split(" ");
		    ArrayList<Integer> sub = new ArrayList<>();
		    for(int i = 0 ; i < str.length ; i++){
		        sub.add(Integer.parseInt(str[i]));
		    }
		    n--;
		    ls.add(sub);
		}
		System.out.println(countPath(ls,0));
        
	}
	
	public static int countPath(ArrayList<ArrayList<Integer>> ls, int index){
	    if(index==ls.size()-1){
	        return 1;
	    }
	    if(index!=ls.size()-1 && ls.get(index).size()==1 && ls.get(index).get(0)==-1){
	        return 0;
	    }
	    
	    int numPath = 0;
	    for(int i = 0 ; i < ls.get(index).size(); i++){
	        numPath+=countPath(ls,ls.get(index).get(i));
	    }
	    return numPath;
	}
}