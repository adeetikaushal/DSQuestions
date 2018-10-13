package com.java.ds.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	
	TrieNode head = new TrieNode();
	
	static class TrieNode{
		
		Map<Character, TrieNode> map;
		boolean isLast = false;
		
		public TrieNode() {
			isLast = false;
			map = new HashMap<>();
		}
	}
	
	public void insertIntoTrie(String s, TrieNode node) {
		char[] charArr = s.toCharArray();
		for(int i =0; i<charArr.length; i++) {
			if(i==charArr.length-1)
				node = insert(charArr[i], node, false);
			else
				node = insert(charArr[i], node, true);
		}
	}
	
	public TrieNode insert(Character c, TrieNode node, boolean isLast) {
		TrieNode n = null;
		if(node.map.containsKey(c)) {
			 n = node.map.get(c);
			 TrieNode newNode = new TrieNode();
			n.map.put(c, newNode);
			if(isLast) {
				newNode.isLast=true;
			}
		}else {
			n= new TrieNode();
			node.map.put(c, n);
		} 
		return n;
	}
//prefixSearch
	//WholeWordSearch
	
	public void isPrefixFound(String search, TrieNode node) {
		char[] charArray = search.toCharArray();
		for(char c : charArray) {
			node = searchChar(c, node);
		}
		if(node !=null) {
			System.out.println("Prefix found");
		}else {
			System.out.println("Prefix not found");
		}
	}
	
	
	public TrieNode searchChar(char c , TrieNode n) {
		if(n == null) return null;
			
		if(n.map.containsKey(c)) {
			TrieNode node =  n.map.get(c);
			return node;
		} else if(n.isLast) {
			return n;
		} else {
			return null;
		}
		
	}
	public static void main(String[] args) {
		
		Trie trie = new Trie();
		trie.insertIntoTrie("at", trie.head);
		trie.insertIntoTrie("ate", trie.head);
		trie.insertIntoTrie("dfsda", trie.head);
		System.out.println("test");
		
		
		trie.isPrefixFound("at", trie.head);
		trie.isPrefixFound("df", trie.head);
		trie.isPrefixFound("atf", trie.head);
		trie.isPrefixFound("a", trie.head);
		trie.isPrefixFound("ate", trie.head);

	}
}
