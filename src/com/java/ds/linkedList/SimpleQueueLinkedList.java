package com.java.ds.linkedList;

public class SimpleQueueLinkedList {

	Node head;
	int data;

	static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.next = null;
			this.data = data;
		}

	}
	
	public void insertAtEnd(Node addNode) {
		Node head = this.head;
		while(head.next != null) {
			head=head.next;
		}
		head.next = addNode;
	}

	public void deleteFromFront() {
		Node next = this.head.next;
		this.head = next;
	}

	public static void main(String[] a) {
		
		SimpleQueueLinkedList ll = new SimpleQueueLinkedList();
		
		ll.head = new Node(1);
		ll.insertAtEnd(new Node(2));
		ll.insertAtEnd(new Node(3));
		ll.insertAtEnd(new Node(4));
		ll.insertAtEnd(new Node(5));
		System.out.print("Print the Queue : before delete: \n ");
		printValues(ll);
		
		ll.deleteFromFront();
		ll.deleteFromFront();
		ll.deleteFromFront();
		System.out.print("Print the Queue : after delete: \n ");
		printValues(ll);
		
		ll.insertAtEnd(new Node(6));
		ll.insertAtEnd(new Node(7));
		System.out.print("Print the Queue : after delete - add 2values: \n ");
		printValues(ll);
		
		ll.deleteFromFront();
		ll.deleteFromFront();
		System.out.print("Print the Queue : after delete - delete 2: \n ");
		printValues(ll);
		
		
	}

	private static void printValues(SimpleQueueLinkedList ll) {
		Node headp = ll.head;
		while(headp.next != null) {
			System.out.print(headp.data + " ");
			headp= headp.next;
		}
		if(headp.next==null)
			System.out.print(headp.data + " " );
	}

}
