package com.practice.binarytree;

class Node{
	int data;
	Node right = null, left = null;
	
	Node(int data){
		this.data = data;
	}
}


public class ConstructBTFromPreorderInorder {
	
	static int preIndex = 0;
	public static Node buildTree(int[] pre, int[] in,int start , int end) {
		
		if(start > end) {
			return null;
		}
		Node node = new Node(pre[preIndex++]);
		if(start == end) {
			return node;
		}
		int index = search(in,node.data,start,end);
		node.left = buildTree(pre,in, start, index-1);
		node.right = buildTree(pre,in, index+1, end);
		
		return node;
		
	}
	
	public static int search(int[] arr, int value, int start, int end) {
		
		for(int i = start; i <= end ; i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return 0;
		
	}
	
	// preOrder = 4 2 1 3 6 5    ->  Implies that root = 4
	// inOrder = 1 2 3 4 5 6
	// 
	// postorder = 1 3 2 5 6 4
	public static void main(String[] args) {
		int[] in = {1,2,3,4,5,6 };
		int[] pre = {4,2,1,3,6,5 };
		
		Node node = buildTree(pre, in, 0, in.length-1);
		postOrderTraversal(node);
	}
	
	public static void postOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");

	}
}
