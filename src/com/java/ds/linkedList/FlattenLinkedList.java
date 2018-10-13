package com.java.ds.linkedList;

//https://www.geeksforgeeks.org/flattening-a-linked-list/
//https://javarevisited.blogspot.com/2017/07/top-10-linked-list-coding-questions-and.html
	
	
public class FlattenLinkedList {
	
	Node head;
	
	static class Node{
		
		
		Node right;
		Node down;
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
		}
	}
	
	 public void printForward() {
		  Node n = this.head;
	 		while(n != null) {
	 			System.out.print(n.data + "  ");
	 			n = n.next;
	 		}
		}
	 
	 //merge
	 public Node mergeList(Node node1, Node node2) {
	        System.out.println(" --MErge- " );

		  if(node1 == null) {
			  return node2;
		  }else if(node2 == null) {
			  return node1;
		  }
		  Node result;
		  
	        if (node1.data < node2.data)
	        {
	            result = node1;
	            result.down =  mergeList(node1.down, node2);
	        }
	 
	        else
	        {
	            result = node2;
	            result.down = mergeList(node1, node2.down);
	        }
	        
		  return null;
		}
	
	 Node flatten(Node root)
	    {	      
		 System.out.println(" --root- " + root.data);

	   // Base Cases
	        if (root == null || root.right == null)
	            return root;
	        System.out.println("  before--- " + root.right.data);

	        // recur for list on right
	        root.right = flatten(root.right);
	        System.out.println(" --after- " + root.right.data);
	        System.out.println(" --after- " + root.data);
	        
	        // now merge
	        root = mergeList(root, root.right);
	        System.out.println(" --after merge- " + root.data);
	        // return the root
	        // it will be in turn merged with its left
	        return root;
	    }
	 
	 
	 public Node pushNodeDown(Node head, int data) {
		 Node newNode = new Node(data);
		 newNode.down=head;
		 head=newNode;
		 return newNode;
	 }
	 
	public static void main(String[] arg) {
		FlattenLinkedList list = new FlattenLinkedList();
		
		Node head = new Node(5);
		head = list.pushNodeDown(head, 8);
		head =list.pushNodeDown(head, 10);
		head =list.pushNodeDown(head, 12);
		
		head.right = list.pushNodeDown(head.right, 6);
		head.right = list.pushNodeDown(head.right, 9);
		
		head.right.right = list.pushNodeDown(head.right.right, 1);
		head.right.right =list.pushNodeDown(head.right.right, 3);
		head.right.right =list.pushNodeDown(head.right.right, 5);		
		
		head.right.right.right = list.pushNodeDown(head.right.right.right, 7);
		head.right.right.right =list.pushNodeDown(head.right.right.right, 11);
		head.right.right.right =list.pushNodeDown(head.right.right.right, 41);
		head.right.right.right =list.pushNodeDown(head.right.right.right, 72);
		
		list.flatten(head);
		

		System.out.println("\n print list");
		list.printForward();
		
		
		
		
		
		
		
	}
	

}
