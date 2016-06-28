package org.study.algos;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * INPUT FORMAT 
1
4 4
1 2 24
1 4 20
3 1 3
4 3 12
1
 * @author pulgupta
 */
class Distance implements Comparable<Distance>{
	int node;
	int distance;
	
	public Distance(int node, int distance) {
		super();
		this.node = node;
		this.distance = distance;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + node;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Distance))
			return false;
		Distance other = (Distance) obj;
		if (node != other.node)
			return false;
		return true;
	}


	@Override
	public int compareTo(Distance o) {
		return this.distance - o.distance;
	}
}

public class Dijkstra {

	//It will contain the final shortest paths
	private static int[] d;
	private static int[][] adjMatrix;
	private static boolean[] visited;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		//Execute a loop for each test case
		for(int t=0;t<T;t++){
			int N = in.nextInt(); 	//Nodes
			int M = in.nextInt(); 	//Edges
			adjMatrix = new int[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					adjMatrix[i][j] = Integer.MAX_VALUE; 
				}
			}
			
			for(int m=0;m<M;m++) {
				int n1 = in.nextInt();
				int n2 = in.nextInt();
				int w = in.nextInt();
				if(adjMatrix[n1-1][n2-1] > w) {
					adjMatrix[n1-1][n2-1] = w;
					adjMatrix[n2-1][n1-1] = w;
				}
			}
			
			int s = in.nextInt();
			d = new int[N];
			visited = new boolean[N];
			dijkstra(s-1, N);
		}
	}
	public static void dijkstra(int s, int N){
		for (int i=0;i<N;i++) {
			d[i] = Integer.MAX_VALUE;
		}
		d[s] = 0;
		Queue<Distance> queue = new PriorityQueue<>();
		queue.offer(new Distance(s,0));
		
		while(!queue.isEmpty()) {
			int node;
			node=queue.poll().node;
			visited[node] = true;
			
			for(int i=0;i<N;i++) {
				if(adjMatrix[node][i]!=Integer.MAX_VALUE && s!=i) {

					if(d[i]> d[node] + adjMatrix[node][i]) 
						d[i]= d[node] + adjMatrix[node][i];
					
					if(!visited[i] && !queue.contains(new Distance(i, d[i])))
						queue.add(new Distance(i, d[i]));
				}
			}
		}
		
		for (int i=0;i<N;i++) {
			if(i!=s) {
				if(d[i]!=Integer.MAX_VALUE)
					System.out.print(d[i] + " ");
				else
					System.out.print(" " + -1 + " ");
			}
			
		}
		System.out.println();
	}
}

