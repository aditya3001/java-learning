package com.example.miscellaneous;

public class TryCatch {
	   public static void main(String args[]) {
	       fun1(50);
	       System.out.println("In main");
	   }
	   static void fun1(int n){
	       try {
	           fun2(n);
	       }
	       catch (Exception e) {
	           System.out.println(e);
	       }
	       System.out.println("In fun1");
	   }
	   static void fun2(int n){
	       fun3(n);
	       System.out.println("In fun2");
	   }
	   static void fun3(int n) {
	       if (n < 60)
	           throw new ArithmeticException("Not Eligible");
	       else
	           System.out.println("Eligible for pension");
	   }
	}
