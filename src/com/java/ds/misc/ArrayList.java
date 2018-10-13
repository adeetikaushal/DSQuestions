package com.java.ds.misc;

public class ArrayList {
	
	
	public void rotateLeft(int[] arrInt, int times) {

		while(times > 0) {
		 int temp = arrInt[0];
			for(int i=0; i<arrInt.length-1; i++) {
				arrInt[i] = arrInt[i+1];
			}
			times--;
			arrInt[arrInt.length-1]= temp;
		}
		
	}
	
	public void printArray(int[] arrInt) {
		
		for(int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i] +" ");
		}
	}
	
	public static void main(String[] arg) {
		
		int[] arrInt = {1,2,3,4,5};
		
		
		ArrayList list = new ArrayList();
		list.rotateLeft(arrInt,3);
		list.printArray(arrInt);
	}

}
