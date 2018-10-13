package com.java.ds.tree;

import java.util.Queue;

//level - 2(l-1)
//root - 2(1-1) = 1
//l=2 - 2(2-1)=2

//Max number of nodes fron height  2(h)-1

// height from Nodes: Log2(N+1)

// minimum no of levels from leaves : ⌈ Log2L ⌉ + 1 

// In Binary tree where every node has 0 or 2 children, number of leaf nodes is always one more than number of internal nodes.

/**
 * Complete Binary tree: All nodes have 0/2 children. n a Full Binary, number of
 * leaf nodes is number of internal nodes plus 1 Full Binary: All internal nodes
 * have 2 children
 * 
 * @author akaush1
 *
 */
public class BinarySearchTree {

	Node root;

	static class Node {
		int data;
		Node right;
		Node left;

		public Node(int key) {
			this.data = key;
			this.right = null;
			this.left = null;
		}
	}


	public Node insertInTree(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.data) {
			current.left = insertInTree(current.left, value);
		} else if (value > current.data) {
			current.right = insertInTree(current.right, value);
		}
		return current;

	}

	public boolean searchInTree(Node current, int value) {
		boolean isFound = false;

		if (current == null) {
			return false;
		}

		if (current.data == value) {
			isFound = true;
		}
		if (value < current.data) {
			searchInTree(current.left, value);
		} else if (value > current.data) {
			searchInTree(current.right, value);
		}
		return isFound;
	}

	public Node deleteNodeFromTree(Node current, int value) {

		if (current == null) {
			return null;
		}

		if (current.data == value) {
			// if nodes have no child
			if (current.left == null && current.right == null) {
				return null;
			} // if 1 node is null
			else if (current.right == null) {
				return current.left;
			} else if (current.left == null) {
				return current.right;
			} // TODO : if none node is null --- find the min number at right and replace current with the min value and delete the min value.
			else if(current.left != null && current.right != null) {
				if(current.data == value) {
					int val = getLowestValue(current.right); // replace the lowest value with the delete node
					current.data = val;
					current.right = deleteNodeFromTree(current.right, val); // delete the right min value
				}
			}
		}

		if (value < current.data) {
			current.left = deleteNodeFromTree(current.left, value);
		} else if (value > current.data) {
			current.right = deleteNodeFromTree(current.right, value);
		}
		return current;
	}

	public int getLowestValue(Node node) {
		return node.left == null? node.data:getLowestValue(node.left);
	}
	
	
	/*
	 * Depth First 
	 * In order : left root right 
	 * per order: root left right 
	 * post order:left right root
	 */

	public void transverseInOrder(Node current) {
		if (current != null) {
			transverseInOrder(current.left);
			System.out.print(current.data + " ");
			transverseInOrder(current.right);
		}
	}

	public void transversePreOrder(Node current) {
		if (current != null) {
			System.out.print(current.data + " ");
			transverseInOrder(current.left);
			transverseInOrder(current.right);
		}
	}

	public void transversePostOrder(Node current) {
		if (current != null) {
			transverseInOrder(current.left);
			transverseInOrder(current.right);
			System.out.print(current.data + " ");
		}
	}

	//Breadth First
	
	public void breadthFirst(Node current) {
		Queue<Node> nodes = new java.util.LinkedList<>();
		nodes.add(current);
		
		while(!nodes.isEmpty()) {
			
			
			Node node = nodes.remove();

			System.out.print(node.data +" ");
			
			if(node.left !=null) {
				nodes.add(node.left);
			}
			if(node.right !=null) {
				nodes.add(node.right);
			}
		}
	}
	
	
	
	public static void main(String[] str) {

		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(5);

		tree.insertInTree(tree.root, 1);
		tree.insertInTree(tree.root, 4);
		tree.insertInTree(tree.root, 6);
		tree.insertInTree(tree.root, 27);
		tree.insertInTree(tree.root, 37);
		tree.insertInTree(tree.root, 7);
		tree.insertInTree(tree.root, 10);
		tree.insertInTree(tree.root, 17);

		tree.transverseInOrder(tree.root);
		tree.deleteNodeFromTree(tree.root,10);
		
		System.out.println("\n after remove 27");
		tree.transverseInOrder(tree.root);
		
		
		System.out.println("\n InOrder Transverse ");
		tree.transverseInOrder(tree.root);
		
		System.out.println("\n PreOder");
		tree.transversePreOrder(tree.root);
		
		System.out.println("\n Post Order");
		tree.transversePostOrder(tree.root);

		boolean found = tree.searchInTree(tree.root, 7);
		if (found) {
			System.out.println("Node not found");
		} else {
			System.out.println("Node  found");
		}

		found = tree.searchInTree(tree.root, 17);
		if (found) {
			System.out.println("Node found");
		} else {
			System.out.println("Node not found");
		}

		tree.breadthFirst(tree.root);
	}

}
