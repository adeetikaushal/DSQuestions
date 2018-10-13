package com.java.ds.tree;

public class BinaryTree {

	public Node head = null;

	public static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}

	}

	public Node insertAnyPosition(Node current, int data) {
		if (current.left != null) {
			return insertAnyPosition(current.left, data);
		}
		if (current.left == null) {
			current.left = new Node(data);
		}
		return null;
	}

	public void printInOrder(Node current) {
		//100 9 8 10 7 25 22 
		if (current != null) {
			printInOrder(current.left);
			System.out.print(current.data + " ");
			printInOrder(current.right);
		}
	}
	
	public void printPreOrder(Node current) {
		// 7 100 9 8 10 25 22  
		if (current != null) {
			System.out.print(current.data + " ");
			printInOrder(current.left);
			printInOrder(current.right);
		}

	}
	
	public void printPostOrder(Node current) {
		//100 9 8 10 25 22 7 
		if (current != null) {
			printInOrder(current.left);
			printInOrder(current.right);
			System.out.print(current.data + " ");

		}

	}
	
/**	       7
	   8       22
	 9  10   25
  100	 
**/
	public static void main(String[] arg) {

		BinaryTree tree = new BinaryTree();
		tree.head = new Node(7);
		tree.head.left = new Node(8);
		tree.head.right = new Node(22);
		tree.head.left.left = new Node(9);
		tree.head.left.right = new Node(10);
		tree.head.right.left = new Node(25);

		tree.insertAnyPosition(tree.head, 100);
		System.out.print("In => ");
		tree.printInOrder(tree.head);
		
		System.out.print("\n Pre => ");
		tree.printPreOrder(tree.head);
		
		System.out.print("\n Post => ");
		tree.printPostOrder(tree.head);

	}

}
