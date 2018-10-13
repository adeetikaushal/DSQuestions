package com.java.ds.stackqueue;

//Using array

public class SimpleQueueArray {

	int size;
	int rear;
	int front;
	int[] arr;
	int total;

	public SimpleQueueArray(int s) {
		this.size = s;
		rear = -1;
		total=front= 0;
		arr = new int[s];
	}

	public boolean isFull() {
		return arr.length == total? true:false;
	}
	
	public boolean isEmpty() {
		return arr.length < 0? true:false;
	}

	public void insert(int add) {
		if(isFull()) {
			return;
		}
		this.rear = (this.rear+1)%size;
		this.arr[this.rear]=add;
		//System.out.println("Add :: " + this.rear);
		total++;
	}

	public void remove() {
		if(isEmpty()) {
			return;
		}
		//System.out.print("\n remove " + this.front);
		int item = this.arr[this.front];
		//System.out.println("Test" + item);
		this.front = (this.front + 1)%this.size;	
		total--;
		//System.out.print(" ---- remove " + this.front);
	}
    
	public static void main(String[] arg) {

		// 1 2 3 4 
		//2 3 4 
		// 3 4
		//4 
		// 4 5 6 7 
		//  8
		SimpleQueueArray q = new SimpleQueueArray(5);  
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		System.out.println("Print the values :");
		printArr(q);

		q.remove();
		q.remove();
		q.remove();
		
		System.out.println("\nDelete 3 Print the values : ");
		printArr(q);
		
		q.insert(6);
		q.insert(7);
		q.insert(8);
		System.out.println("\nAdd 3 Print the values :");
		printArr(q);
		
		q.remove();
		q.remove();
		q.remove();
		q.remove();
		System.out.println("\nDelete 4 Print the values :");
		printArr(q);
		
		q.insert(9);
		q.insert(10);
		q.insert(11);
		System.out.println("\nAdd 3 Print the values :");
		printArr(q);
		
	}

	private static void printArr(SimpleQueueArray q) {
		int[] arr = q.arr;
		for(int ii=0; ii<arr.length; ii++) {
		  System.out.print(arr[ii] + " ");
		}
	}
}
