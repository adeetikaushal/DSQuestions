package com.java.ds.linkedList;


public class QuesLinkedList {
	
	Node head;
	Node fast;
	Node middle;
	
	static class Node{
		
		
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	public void getList() {
		
		QuesLinkedList list = new QuesLinkedList();
		list.head = new Node(1);
		
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		
		list.head.next=node2;
		node2.next=node3;	
		node3.next=node4;
		node4.next=node5;
		
	}
	
	 public void printForward() {
		  Node n = this.head;
	 		while(n != null) {
	 			System.out.print(n.data + "  ");
	 			n = n.next;
	 		}
		}
	 
	 public void middleValue() {
		  Node n = this.head;
		  fast=head;
		  middle=head;
		  
	 		while(n != null && this.fast!=null && this.fast.next!=null ) {
	 			this.fast=n.next.next;
	 			this.middle=n;
	 			n = n.next;
	 		}
		}
	
	
	public static void main(String[] arg) {
		QuesLinkedList list = new QuesLinkedList();
		list.head = new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		
		list.head.next=node2;
		node2.next=node3;	
		node3.next=node4;
		node4.next=node5;
		
		
//		System.out.println("Get list");
//		list.getList();
		System.out.println("\n print list");
		list.printForward();
		list.middleValue();
		System.out.println("-- Print : " + list.middle.data );
		
	}
	

}
