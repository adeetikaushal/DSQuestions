package com.java.ds.misc;

import com.java.ds.misc.TestRevision.Tree;

public class TestRevision {

	public Tree root;
	
	static class Tree{
		
		Tree right;
		Tree left;
		int value;
		
		public Tree(int value) {
			right = null;
			left	 = null;
			this.value= value;
		}
		
	} 
	
	
	public Tree insert(Tree tree, int val) {
		
		if(tree == null) {
			return new Tree(val);
		}
		
			if(tree.value > val) {
				tree.left = insert(tree.left, val);
			}else if(tree.value < val) {
				tree.right = insert(tree.right, val);
			}
		return tree;
		
	}
	
	
   public Tree insertAtLeaf(Tree tree, int val) {
		
		if(tree.left == null) {
			tree.left = new Tree(val);
		}else {
			tree.left = insert(tree.left, val);
		}
		return tree;
		
	}
	
	// In order -- left  root right
	// pre -root left right 
	//post -- lrft right root
	
	public void inOrder(Tree current) {
	 if(current != null) {
		inOrder(current.left);
		System.out.print(current.value + " ");
		inOrder(current.right);
	 }		
	}
	
	
	
	public static void main(String[] args) {
		TestRevision rev = new TestRevision();
		rev.root = new Tree(10);
		
		rev.insert(rev.root, 5);
		rev.insert(rev.root, 11);
		rev.insert(rev.root, 7);
		rev.insert(rev.root, 3);
		rev.insert(rev.root, 9);
		rev.insert(rev.root, 71);
		rev.insert(rev.root, 90);
		rev.insert(rev.root, 70);
		rev.inOrder(rev.root) ;
		
		System.out.println("----- add 1000");
		
		rev.insertAtLeaf(rev.root, 1000);
		
		rev.inOrder(rev.root) ;

		
	}
		
	
	
}
