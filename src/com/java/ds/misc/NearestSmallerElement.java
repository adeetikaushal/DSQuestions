package com.java.ds.misc;

import java.util.Stack;
public class NearestSmallerElement {
	
	
	
	public int[] findSmallest(int[] arr) {
		int temp =0;
		Stack<Integer> s = new Stack<Integer>();
		int[] returnArr = null;
		returnArr = new int[arr.length];
		for(int ii=0; ii<arr.length; ii++) {
			if(s.isEmpty()) {
				s.push(arr[ii]);
				returnArr[ii] = -1;
				temp=arr[ii];
				
			}else {
				if(s.peek() > arr[ii]) {  
					s.pop();
					s.push(arr[ii]);
					returnArr[ii] = -1;
				}else {
					if(s.peek() < arr[ii]){ 
						if(temp < arr[ii]) 
							returnArr[ii] = temp;
						else
							returnArr[ii] = s.peek();
					}else {
					    returnArr[ii] = -1;
					}
			   }
			
		   }
			temp=arr[ii];
		}
		
		return returnArr;
	}
	
	public int[] findSmaller(int[] arr) {
		int temp = -1;
		Stack<Integer> s = new Stack<Integer>();
		int[] returnArr = null;
		returnArr = new int[arr.length];
		if(arr.length==1) {
			returnArr[0]=-1;
			return returnArr;
		}
		for(int ii=0; ii<arr.length; ii++) {
			for(int jj=ii; jj>=0; jj--) {
				//System.out.println("---> i "+ ii + " jj = " +  jj);

				if(arr[jj] < arr[ii]) {
					returnArr[ii]=arr[jj];
					break;
				}else if(arr[jj] > arr[ii]) {
					if(jj == 0) {
						returnArr[ii]=-1;
					}
				}else {
					returnArr[ii]=-1;
				}
				
			}
			
		}
		return returnArr;
	}
	
	
	public void printArray(int[] returnArr) {
		for(int i: returnArr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void main(String[] a) {
		NearestSmallerElement element = new NearestSmallerElement();
		int[] arr = {34, 35, 27, 42, 5, 28, 39, 20, 28};
		element.printArray(arr);
		System.out.println(" ");
		element.printArray(element.findSmaller(arr));
		
		int[] arr1 = {1};
		System.out.println(" ");
		element.printArray(element.findSmaller(arr1));
		
	}

}
