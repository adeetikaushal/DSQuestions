package com.java.ds.linkedList;

public class CircularLinkedList {
	
	Node head;
	static class  Node {
		Node next = null;
		Node prev = null;
		int data;
		
		public Node(int data) {
			this.data= data;
			this.next= null;
			this.prev = null;
			}
	}
	
	public static void main(String[] str) {
		CircularLinkedList cList = new CircularLinkedList();
		cList.head = new Node(1);
		Node node2= new Node(2);
		Node node3= new Node(3);
		Node node4= new Node(4);
		
		cList.head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = cList.head;
		
		cList.head.prev = node4;
		node2.prev = cList.head;
		node3.prev = node2;
		node4.prev = node3;
		
		cList.printForward(cList);
		
		System.out.println("\n Insert 6 before head");
		cList.insertBeforeHead(new Node(6));
		cList.printForward(cList);
		
	}
	
	public void printForward(CircularLinkedList cList) {
		
		Node head = this.head;
		Node n = this.head;
			while(n!=null) {
				System.out.print(n.data +" ");
				if(n.next == head.prev) {
					System.out.print(n.next.data +" ");
				//	System.out.print(" break " + n.next + " : " + head.prev );
					break;
				}
				n=n.next;
		  
		}
		
	}

	public void insertBeforeHead(Node newNode) {
		Node current;
		Node head = this.head;
		Node n = this.head;
		while(n!=null) {
			if(n.next == head.prev) {
				current=n.next;
				current.next=newNode;
				newNode.next=head;
				newNode.prev=current;
				this.head= newNode;
				break;
			}
			n = n.next;
		}
		
		
	}
	
	
//  public void printBackward(SingleLinklist list) {
//		
//		Node n = list.head;
//		Node p = null;
//		while(n != null) {
//			p=n;
//			//System.out.println("Prev :" + p.data + " : N : " + n.data );
//			n = n.next;
//			if(n!=null)
//			  n.prev=p;
//			
//		}
//		// null:v0:v1 
//		// v0:v2:v3 
//		// v2:v4:v4
//		n=p;
//		while(n != null) {
//			System.out.print(n.data +" ");
//			n = n.prev;
//		}
//		
//		
// }
	
	
}
