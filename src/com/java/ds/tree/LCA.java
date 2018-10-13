package com.java.ds.tree;

public class LCA {

	Node root;

	static class Node {

		Node right;
		Node left;
		int value;

		public Node(int value) {
			right = left = null;
			this.value = value;

		}

	}

	public Node insert(Node node, int value) {

		if (node == null) {
			return new Node(value);
		}

		if (node.value < value) {
			node.right = insert(node.right, value);
		} else if (node.value > value) {
			node.left = insert(node.left, value);
		}
		return node;
	}

	public void searchParent(Node node, int a, java.util.ArrayList<Integer> list) {
		if (node != null && node.value != a) {
			if (node.value < a) {
				list.add(node.value);
				searchParent(node.right, a, list);
			} else if (node.value > a) {
				list.add(node.value);
				searchParent(node.left, a, list);
			}
		}
	}

	public void findLCA(int a, int b) {

	}

	public static void main(String[] args) {

		LCA lca = new LCA();
		java.util.ArrayList<Integer> list1= new java.util.ArrayList<Integer>();
		java.util.ArrayList<Integer> list2= new java.util.ArrayList<Integer>();
		
		

		lca.root = new Node(10);
		lca.insert(lca.root, 8);
		lca.insert(lca.root, 4);
		lca.insert(lca.root, 6);
		lca.insert(lca.root, 12);
		lca.insert(lca.root, 11);
		lca.insert(lca.root, 14);

		
//		lca.root.right = new Node(3);
//		lca.root.left = new Node(2);
//
//		lca.root.right.left = new Node(6);
//		lca.root.right.right = new Node(7);
//
//		lca.root.left.right = new Node(5);
//		lca.root.left.left = new Node(4);

		lca.searchParent(lca.root, 4, list1);
		lca.searchParent(lca.root, 11, list2);

		System.out.println(".PArent 1.. " + list1.size());
		System.out.println(".PArent 2.. " + list2.size());

		for(int ii = 0; ii<list1.size() && ii<list2.size(); ii++) {
			if(list1.get(ii) != list2.get(ii)) {
				System.out.println(list1.get(ii-1));
			}else {
				System.out.println(list1.get(ii) + "  " +  list2.get(ii));
			}
		
		}

		// lca.findLCA(4,5);

	}

}
