package com.java.ds.misc;

import java.util.Arrays;

public class MaxProductValue {
	
	public int maxProduct(int[] arr) {
		int size =arr.length;
		Arrays.sort(arr);
		return arr[size-1]*arr[size-2]*arr[size-3];
	}
	
	public static void main(String[] a) {
		MaxProductValue vision = new MaxProductValue();
		int[] i = {10,20,40,9,2,1};
		System.out.println("Max product : " + vision.maxProduct(i));
		
	}
}