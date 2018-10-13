package com.java.ds.graph;

import java.util.LinkedList;

public class AdjListGraphs {
	
	int vertex;
	LinkedList<Integer>[] array;
	
	public AdjListGraphs(int n) {
		vertex = n;
		array = new LinkedList[n];
		for(int i=0;i<n;i++) {
			array[i] = new LinkedList<>();
		}
	}
	
	public void addEdges(int i, int toInsert) {
		LinkedList l = array[i];
		l.addFirst(toInsert);
	}
	

	public void printValues() {
		for(int i=0;i<vertex;i++) {
			for(Integer values : array[i]) {
			System.out.print(values.intValue() + " ");
			}
			System.out.println(" - ");
		}
	}
	
	public static void main(String[] args) {
		AdjListGraphs graphs = new AdjListGraphs(5);
		
		graphs.addEdges(0, 4);
		graphs.addEdges(0, 2);
		graphs.addEdges(0, 3);
		graphs.addEdges(1, 1);
		graphs.addEdges(1, 2);
		graphs.addEdges(2, 3);
		graphs.addEdges(2, 3);
		
		graphs.printValues();
		
	}

}
