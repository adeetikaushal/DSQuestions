package com.java.ds.linkedList;

public class SingleLinklist {
	
	Node head;	
	
	static class Node{
		
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			this.next =null;

		}
	}

	public static void main(String[] args) {
		
		SingleLinklist slist = new SingleLinklist();
		slist.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		//link the nodes
		
		slist.head.next = node2;
		node2.next = node3;
		System.out.println("List ");
		slist.printForward(slist);
		
		slist.insert(slist, new Node(4));
		System.out.println("\n After insert 4 at the end: ");
		slist.printForward(slist);
		
		
		slist.insert(slist, new Node(21), 2);
		System.out.println("\n Insert after 2 ");
		slist.printForward(slist);
		
		slist.delete(slist, new Node(2));
		System.out.println("\n delete node 2 ");
		slist.printForward(slist);
		
		System.out.println("\n Print data backward");
		slist.printForward(slist.reverse(slist));

	}
    
	 public void printForward(Node n) {
 		while(n != null) {
 			System.out.print(n.data + "  ");
 			n = n.next;
 		}
	}
	 
    public void printForward(SingleLinklist list) {
		
    		Node n = list.head;
    		while(n != null) {
    			System.out.print(n.data + "  ");
    			n = n.next;
    		}
	}
    // Insert Node at end
    public void insert(SingleLinklist list , Node n) {
		Node n1= list.head;
		
		while(n1.next != null) {
			n1 = n1.next;
		}
		n1.next = n;
		
    }
    //insert after data =2
    public void insert(SingleLinklist list , Node n, int data) {
		Node n1= list.head;
		
		while(n1.data!=data) {
		 	n1 = n1.next;
		}
		Node nprev = n1.next;
		n1.next = n;
		n.next = nprev;		
    }

    //delete node
    public void delete(SingleLinklist list , Node n) {
		Node n1= list.head;
		Node prev = null;
		
		while(n1.data!=n.data) {
			prev = n1;
		 	n1 = n1.next;
		}
		
		prev.next = n1.next;
    }
    
    public Node reverse(SingleLinklist list) {
		Node n = list.head;
		Node prev = null;
		Node next = null;
		
		while(n != null) {
			next = n.next;   // n =1, next=2, n.next= null , n=2, next =3, n.next=1
			n.next = prev;	
			prev = n;
			n=next;
		}
		n = prev;
		return n;	
   }
}
