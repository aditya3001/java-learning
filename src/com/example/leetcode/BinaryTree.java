package com.example.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BinaryTree {
	
	public static class Node{
		Integer val;
		Node left, right;
		public Node() {
			val = null;
			this.left = this.right = null;
		}
		
		public Node (Integer val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public static class Pair{
		int state;
		Node node;
		
		public Pair() {
			
		}
		
		public Pair(Node node, int state) {
			this.state = state;
			this.node = node;
		}
	}
	
	public static Node construct(Integer[] arr) {
		Stack<Pair> stack = new Stack<>();
		Node root = new Node(arr[0],null,null);
		Pair rp = new Pair(root, 1);
		
		stack.push(rp);
		int currentIndex = 0;
		while(stack.size()>0) {
			Pair p = stack.peek();
			if(p.state == 1) {
				currentIndex++;
				if(arr[currentIndex] != null) {
					Node nd = new Node(arr[currentIndex], null, null);
					p.node.left = nd;
					Pair lp = new Pair(nd,1);
					stack.push(lp);
				}
				p.state+=1;
			}else if(p.state == 2) {
				currentIndex++;
				if(arr[currentIndex] != null) {
					Node nd = new Node(arr[currentIndex], null, null);
					p.node.right = nd;
					Pair rp1 = new Pair(nd,1);
					stack.push(rp1);
				}
				p.state+=1;
			}else {
				stack.pop();
			}
			
		}
		
		
		return root;
		
	}
	
	public static int maxDepth(Node root) {
		if(root==null) {
			return 0;
		}
		
		return maxDepth(root.right)+maxDepth(root.left)+1;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		
		
	}

}
