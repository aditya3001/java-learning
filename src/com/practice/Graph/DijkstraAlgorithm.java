package com.practice.Graph;

import java.util.Scanner;

public class DijkstraAlgorithm {

//	Input
//	5 7
//	0 1 4
//	0 2 8
//	1 3 5
//	1 2 2
//	2 3 5
//	2 4 9
//	3 4 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int[][] mat = new int[v][v];
		for(int i = 0 ; i < v; i++) {
			for(int j = 0 ; j < v ; j++) {
				mat[i][j] = -1;
			}
		}
		while(e-->0) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			mat[v1][v2] = sc.nextInt();
		}
		dijkstra(mat);

	}
	
	private static void dijkstra(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean[] visitedArray = new boolean[v];
		int[] distance = new int[v];
		
		distance[0] = 0;
//		visitedArray[0] = true;
		for(int i = 1 ; i < distance.length ; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0 ; i < adjacencyMatrix.length; i++) {
			int minVertex = findMinVertex(visitedArray,distance);
			visitedArray[minVertex] = true;
			for(int j = 0 ; j < v ; j++) {
				if(!visitedArray[j] && adjacencyMatrix[minVertex][j]>0 && distance[minVertex] !=Integer.MAX_VALUE) {
					int newDist = distance[minVertex]+adjacencyMatrix[minVertex][j];
					if(newDist < distance[j]) {
						distance[j] = newDist;
					}
				}
			}
		}
		for(int i = 0 ; i < v ; i++) {
			System.out.println(distance[i]);
		}
	}

	private static int findMinVertex(boolean[] visitedArray, int[] distance) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		// TODO Auto-generated method stub
		for(int i = 0 ; i < distance.length ; i++) {
			if(!visitedArray[i]) {
				if(min != Math.min(min, distance[i])) {
					minIndex = i;
					min = Math.min(min, distance[i]);
				}				
			}
		}
		
		return minIndex	;
	}
	
//	static class Pair{
//		int 
//	}

}
