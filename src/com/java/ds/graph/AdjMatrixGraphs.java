package com.java.ds.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Adj matrix:
 * 
 * @author akaush1
 *
 */
public class AdjMatrixGraphs {

	int vertices;
	boolean edge[][];

	public AdjMatrixGraphs(int n) {
		vertices = n;
		edge = new boolean[n][n];
	}

	public void addEdge(int i, int j) {
		edge[i][j] = true;
	}

	public void removeEdge(int i, int j) {
		edge[i][j] = false;
	}

	public boolean hasEdge(int i,int j) {
		return edge[i][j]==true?true:false;
	}

	public List<Integer> inEdges(int i) {
		List<Integer> edges = new ArrayList<>();
		
		for(int j=0; j<vertices; j++) {
			if (edge[i][j]) edges.add(j);
		}
		return edges;
	}
	
	public List<Integer> outEdges(int i) {
		List<Integer> edges = new ArrayList<>();
		
		for(int j=0;j<vertices;j++){
			if(edge[j][i]) edges.add(j);
		}
		return edges;
	}
	
	
	public static void main(String[] args) {
		
		AdjMatrixGraphs graphs = new AdjMatrixGraphs(2);
		graphs.addEdge(0, 0);
		graphs.addEdge(0, 1);
		
		System.out.println(graphs.inEdges(1).size());
		System.out.println(graphs.outEdges(1).size());

	}
}
