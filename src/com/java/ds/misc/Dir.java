package com.java.ds.misc;

import java.util.Stack;


public class Dir {
	
	
	public void pop() {
		
	}
	
	public void push() {
		
	}
	
	public String validatePath(String s) {
		Stack<String> q = new Stack<String>();
		String[] str = s.substring(1, s.length()).split("/");
		
		if(!s.startsWith("/") || s.contains(" ")) {
			return "Invalid String";
		}
//		}else if(s.endsWith("/")){
//			return s.substring(0,s.length()-1);
//		}
		for(String string :  str) {
			if(string.equals("..") ) {
				if(!q.isEmpty())
				  q.pop();
			}else if(!string.equals(".")) {
				q.push(string);
			}
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("/");
		for(String s1: q) {
			builder.append(s1);
			if(!s1.isEmpty()) builder.append("/");
			
		}
		String str1 =  builder.toString();
		return str1.length() ==1? str1:str1.substring(0,str1.length()-1);
	}
	
	public static void main(String[] str) {
		Dir dir = new Dir();
		System.out.println("print /home - " + dir.validatePath("/home1"));
		System.out.println("print /home /QW - " +dir.validatePath("/home1 /QW/"));
		System.out.println("print /home//QW - " +dir.validatePath("/home1//QW/"));
		System.out.println("print /home/QW/../C - " +dir.validatePath("/home1/QW/../c"));
		System.out.println("print /home/QW/./dfs/../ - " +dir.validatePath("/home1/QW/./dfs/../"));
		System.out.println("print /home/QW/./dfs/.. - " +dir.validatePath("/home1/QW/./dfs/.."));
		System.out.println("print /home/QW/./dfs/.. - " +dir.validatePath("/home1/QW/./dfs/.."));
		System.out.println("print /home/QW/./ds/../../.. - " +dir.validatePath("/home1/QW/./dfs/../../.."));
		System.out.println("print /../" + dir.validatePath("/../")); 
		
		
		
	}

}
