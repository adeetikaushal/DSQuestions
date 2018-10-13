package com.java.ds.tree;

public class LeftViewTree {
	
	Node root;
	
	static class Node{
		
		Node right;
		Node left;
		int value;
		
		public  Node(int value) {
			this.left=this.right=null;
			this.value=value;
		}
	}
	
	
	public void leftViewOfLeftTree(Node root) {
		if(root != null ) {
			System.out.println(root.value);
			
			if(root.left !=null)
			  leftViewOfLeftTree(root.left);
	    	 
			if(root.right !=null && root.right.left !=null)
			   leftViewOfLeftTree(root.right.left);
		    }	
	 }


	public static void main(String[] args) {
		
		LeftViewTree tree = new LeftViewTree();
		    tree.root = new Node(12); 
	        tree.root.left = new Node(10); 
	        tree.root.right = new Node(30); 
	        tree.root.right.left = new Node(25); 
	        tree.root.right.right = new Node(40); 
	        
	        tree.leftViewOfLeftTree(tree.root);
		

	}

}
