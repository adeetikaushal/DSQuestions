package com.java.ds.linkedList;

public class CircularDoubleEndedQueue {
	
	int[] arr = null;
	int front;
	int rare;
	int size;
	int arrSize;
	
	public  CircularDoubleEndedQueue(int arrSize) {
		this.front = -1;
		this.rare = 0;
		this.size=0;
		this.arrSize=arrSize;
		arr = new int[arrSize];
	}
	
	void insertFront(int data) {
		
		if(isFull()) {
			System.out.println("Overflow");
		}
		if(isEmpty()) {
			this.front=0;
			this.rare=0;
		}else if(this.front == 0) {
			front = size-1;
		}else {
			front=front-1;
		}
		arr[front]=data;
	}
	void insertRare(int data) {
		if(isFull()) {
			System.out.println("Overflow");
		}
		if(isEmpty()) {
			this.front=0;
			this.rare=0;
		}else if(rare == size-1) {
			rare = 0;
		}else {
			rare=rare+1;
		}
		arr[rare]=data;
	}
	void deletFront() {
		
	}
	void deleteRare() {
		
	}
	
	int getFront() {
		return arr[this.front];
	}
	int getRare() {
		return arr[this.rare];
	}
	boolean isEmpty() {
		return front==-1?true:false;
		
	}
	boolean isFull() {
		return size==arrSize?true:false;
	}
	

	public static void main(String[] args) {

		CircularDoubleEndedQueue queue = new CircularDoubleEndedQueue(5);
		queue.insertFront(4);
		queue.insertRare(2);
		
		System.out.println("Print");
	}

}
