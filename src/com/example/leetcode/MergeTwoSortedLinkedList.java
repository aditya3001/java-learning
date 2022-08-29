package com.example.leetcode;

class Node
{
    int data;
    Node next;
    Node(int data) {this.data = data;
                 next = null;}
}
public class MergeTwoSortedLinkedList {
	private static class a{
		
	}
	
	public static void main(String[] args) {
		//List 1
		Node head1 = new Node(2);
		head1.next=new Node(5);
		head1.next.next = new Node(7);
		
		Node head2 = new Node(1);
		head2.next=new Node(3);
		head2.next.next = new Node(6);
//		Iterative
//		mergeLists(head1, head2);
//		Recursive
		Node dummy = sortedMerge(head1, head2);
		while(dummy != null) {
			System.out.print(dummy.data+" ");
			dummy = dummy.next;
		}

	}

	private static void mergeLists(Node head1, Node head2) {
		// TODO Auto-generated method stub
		
		Node dummy = null;
		Node tail = null;
		
		Node a = head1;
		Node b = head2;
		while(a != null && b != null) {
//			System.out.println(a.data +" "+b.data);
			if(a.data<b.data) {
				if(dummy==null) {
					dummy = a;
					tail = a;
				}else {
					tail.next = a;
					tail = tail.next;

				}
				
				a = a.next;
				tail.next = null;
				
				
			}else {
				if(dummy==null) {
					dummy = b;
					tail = b;
				}else {
					tail.next = b;
					tail = tail.next;
				}
				b = b.next;
				
				tail.next = null;
			}
		}
		
		if(a != null) {
			tail.next = a;
		}
		
		if(b != null) {
			tail.next = b;
		}
		
		
		while(dummy != null) {
			System.out.print(dummy.data+" ");
			dummy = dummy.next;
		}
		
	}
	
	
	public static Node sortedMerge(Node a, Node b) {
		if(a==null && b ==null) {
			return null;
		}
		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		if(a.data < b.data) {
			a.next = sortedMerge(a.next,b);
			return a;
		}else {
			b.next = sortedMerge(a, b.next);
			return b;
		}
	}

}
