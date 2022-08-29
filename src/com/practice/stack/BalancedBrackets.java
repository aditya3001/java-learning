package com.practice.stack;

import java.util.*;

public class BalancedBrackets {

   public static void main(String[] args) {
	   Stack<Character> stack=new Stack<>();
       Scanner in=new Scanner(System.in);
       String inputString=in.nextLine();
       for(int k=1;k<inputString.length()-1;k++) {
           stack.push(inputString.charAt(k+1));
           if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
               stack.pop();
           if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
               stack.pop();
       }
       while (!stack.isEmpty()){
           System.out.print(stack.peek());
           stack.pop();
       }
       
       
       Queue<Integer> q = new LinkedList<Integer>();

       q.add(3); // Inserts the element passed as parameter to the end of the queue
       q.add(2);
       q.add(6);
       q.add(4);
       q.add(5);
       int val = q.peek(); //returns the element at the front of queue
       for (int i = 0; i < q.size(); i++) {
           int del = q.remove(); // returns and removes the element at the front of queue
           if (val < del) {
               val = del;
           }
           q.add(del); 
       }
       System.out.println(val);
   }
}
