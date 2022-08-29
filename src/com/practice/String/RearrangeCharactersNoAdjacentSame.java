package com.practice.String;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static class Key{
        char val;
        int frequency;
        Key(char val, int frequency){
            this.val = val;
            this.frequency = frequency;
        }
    } 
    static class MyComparator implements Comparator<Key>{
        public int compare(Key k1, Key k2){
            if(k1.frequency < k2.frequency){
                return 1;
            }else if(k2.frequency < k1.frequency){
                return -1;
            }else{
                return 0;
            }
        }
    }
	public static void main (String[] args) throws IOException{
		
		//INPUT 
//		2
//		aaa
//		aaabb
//		OUTPUT
//		0
//		1
		
		//code
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(b.readLine());
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++){
		    s[i] = b.readLine();
		}
		
		for(int i = 0 ; i < n ; i++){
		    System.out.println(arrange(s[i]));
		}
	}
	
	public static int arrange(String str){
	   int l = str.length();
	    int[] count = new int[26];
	    for(int i = 0 ; i < l ; i++){
	        count[str.charAt(i) - 'a']++;
	    }
	    // g -2 , e - 4, k -2 ,s -2, f -1, o -1 , r -1
	    PriorityQueue<Key> q = new PriorityQueue<>(new MyComparator());
	    String result = "";
	    for(char c = 'a' ; c <= 'z';c++){
	        if(count[c-'a']!=0){
	            q.add(new Key(c,count[c-'a']));
	        } 
	    }
	    Key prev = new Key('@',-1);
	    while(q.size() > 0){
	        
	        Key temp = q.peek();
	        q.poll();
	        result = result+temp.val;
	        temp.frequency--;
	        if(prev.frequency > 0){
	            q.add(prev);
	        }
	        prev = temp;
	        
	    }
	   // System.out.println(result);
	    if(result.length()!=str.length()){
	        return 0;
	    }else{
	        return 1;
	    }
	    
	}
}