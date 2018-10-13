package com.java.ds.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {
	
	
	Queue<Integer> queue =  new LinkedList<Integer>();

	
	public void push(int val) {
		int size =queue.size();
		queue.add(val); 
			
		int recVal;
		for(int ii=0;ii<size;ii++) {
			recVal = queue.remove();
			queue.add(recVal);
		}
	}
	
	public void pop() {
		queue.remove();
		
	}
	
	
	public static void main(String[] arg) {

		StackUsing1Queue stackUsing1Queue  = new StackUsing1Queue();
		stackUsing1Queue.push(1);
		stackUsing1Queue.push(2);
		stackUsing1Queue.push(3);
		stackUsing1Queue.push(4);
		
		System.out.println("After processing \n ");
		stackUsing1Queue.printValues();

	}

	private  void printValues() {
		int size = queue.size();
		for(int ii=0; ii<size; ii++) {
			int val = queue.remove();
			System.out.print(val + " ");
		}
	}

}
