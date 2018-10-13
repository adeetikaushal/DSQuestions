package com.java.ds.linkedList;

public class SinglelyCircular {
	
	Node head;

	static class Node {
		Node next = null;
		Node prev = null;
		int data;

		public Node(int data) {
			this.next = null;
			this.prev = null;
			this.data = data;
		}
	}

	public static void main(String[] str) {
		SinglelyCircular clist = new SinglelyCircular();

		clist.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);

		clist.head.next = node2;
		node2.next = node3;
		node3.next = node4;

		clist.head.prev = null;
		node2.prev = clist.head;
		node3.prev = node2;
		node4.prev = node3;

		node4.next = null;

		System.out.println("Print Fwd");
		clist.printFwd(clist);
		System.out.println("\n Print Backward");
		clist.printBwd(clist);
		
		System.out.println("\n Insert:After ");
		clist.insertNodeAfterHead(clist, new Node(6));
		System.out.println("Print Fwd and Backward");
		clist.printFwd(clist);
	//	System.out.print("- ");
//		clist.printBwd(clist);
		clist.insertNodeBeforeHead(clist, new Node(7));
		System.out.println("\n Insert: Before");
		System.out.println("Print Fwd and Backward");
		clist.printFwd(clist);
	//	System.out.print("- ");
	//	clist.printBwd(clist);
		
		

	}

	public void printFwd(SinglelyCircular sclist) {

		Node n = head;
		Node p = null;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public void printBwd(SinglelyCircular sclist) {

		Node n = head;
		Node p = null;
		while (n != null) {
			p = n;
			n = n.next;
		}
		n = p;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.prev;
		}
	}
	//insert at head
	public void insertNodeAfterHead(SinglelyCircular sclist, Node node) {
		Node current = sclist.head;
		Node next = null;
		if (current.prev == null) {
			next = current.next;
			current.next = node;
			node.next = next;
			node.prev = current;
			}
	}

	//insert at head
	public void insertNodeBeforeHead(SinglelyCircular sclist, Node node) {
		Node current = head;
		Node prev;
		if (current.prev == null) {
			prev = current;
			current.prev = node;
			node.next = prev;
			node.prev = null;
		}
		sclist.head=node;
	}

	// public void printBackward(SinglelyCircular sclist) {
	//
	// Node n = sclist.head;
	// Node p = null;
	// while(n != null) {
	// p=n;
	// //System.out.println("Prev :" + p.data + " : N : " + n.data );
	// n = n.next;
	// if(n!=null)
	// n.prev=p;
	//
	// }
	// // null:v0:v1
	// // v0:v2:v3
	// // v2:v4:v4
	// n=p;
	// while(n != null) {
	// System.out.print(n.data +" ");
	// n = n.prev;
	// }
	//
	//
	// }
	//

}
