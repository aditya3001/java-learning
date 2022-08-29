package com.practice.array;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(27));

	}
	
	static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        int i = 2;
        while(i <= N){
            int carry = 0;
            int j = 0;
            while(j <result.size()){
                int res = (result.get(j)*i)+carry;
                carry = res/10;
            
                result.set(j,res%10);
                j++;
            }
            if(i>25) {
            	System.out.println("");
            }
            while(carry!= 0) {
            	result.add(carry%10);
            	carry=carry/10;
            }
//            if(carry!=0){
//                result.add(carry);
//            }
            i++;
        }
        
        Collections.reverse(result);
        
        return result;
        
        
    }

}
