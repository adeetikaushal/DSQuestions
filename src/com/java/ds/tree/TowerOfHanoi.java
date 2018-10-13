package com.java.ds.tree;

//Recursion Problem
//https://www.hackerearth.com/blog/algorithms/tower-hanoi-recursion-game-algorithm-explained/
	

public class TowerOfHanoi {
	
	public void move(int n, char sourceDisc, char destDisc, char auxDisc) {
		
		if(n == 0) {
			return;
		}
		move(n-1,sourceDisc, auxDisc, destDisc );
		
		System.out.printf("Move the disk %d from %c to %c\n", n, sourceDisc, destDisc);
		
		move(n-1,auxDisc, destDisc, sourceDisc);
		
	}

	public static void main(String[] arg) {
		TowerOfHanoi tower = new TowerOfHanoi();
		tower.move(4, 'S', 'D', 'A');
		
		
		/**
Move the disk 1 from S to D
Move the disk 1 from D to A
Move the disk 1 from S to D
Move the disk 1 from A to S

Move the disk 2 from S to A
Move the disk 2 from A to D

Move the disk 3 from S to D

		 */
		
		
	}
	
}
