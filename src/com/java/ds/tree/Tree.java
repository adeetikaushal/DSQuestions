package com.java.ds.tree;


//  Depth First search: Stack
class Node {

	Node left;
	Node right;
	int key;

	public Node(int key) {
		left=right=null;
		this.key = key;
	}

}

public class Tree {
	
	Node root;
	
	//left-root-right
	void printInOrder(Node node) {
		if(node==null) {
			return;
		}	
			printInOrder(node.left);
			System.out.print(node.key + " ");
			printInOrder(node.right);
	}
	//root-left-right
	void printPreOrder(Node node) {
		if(node==null) {
			return;
		}	
		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	
	}
	//left-right-root
	void printPostOrder(Node node) {
		if(node==null) {
			return;
		}	
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.root =new Node(1);
		tree.root.left =new Node(5);
		tree.root.left.left =new Node(7);
		tree.root.left.right =new Node(9);
		tree.root.left.right.left =new Node(10);
		
		tree.root.right =new Node(4);
		tree.root.right.left =new Node(14);
		tree.root.right.right =new Node(10);
		
		//call inoder

		System.out.println("-----   In Oder \n");
		tree.printInOrder(tree.root);
		System.out.println("\n ----  Pre Oder \n");
		tree.printPreOrder(tree.root);
		System.out.println("\n ----  Post Oder \n");
		tree.printPostOrder(tree.root);
		
		
	}

}
