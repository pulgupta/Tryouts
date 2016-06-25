package org.study.algos;

import java.util.LinkedList;
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
			int N = in.nextInt(); //Nodes
			int M = in.nextInt(); //Edges
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
					//Being a undirected graph lets put the same weight in the other quadrant as well
					adjMatrix[n2-1][n1-1] = w;
				}
			}
			int s = in.nextInt();
			//At this point we have the input and we have also created an adjacency matrix out of it.
			//I will try to do a BFS and along with that I will also perform the relax operation
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
		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(s);
		int minEdge = s;
		int minWeight = Integer.MAX_VALUE;
		while(!queue.isEmpty()) {
			int node;
//			if(queue.contains(minEdge)){
//				node = queue.remove(minEdge);
//				minEdge = Integer.MAX_VALUE;
//				minWeight = Integer.MAX_VALUE;
//			}
//				
//			else
				node=queue.poll();
				visited[node] = true;
			for(int i=0;i<N;i++) {
				if(adjMatrix[node][i]!=Integer.MAX_VALUE && s!=i) {
					if(!visited[i] && !queue.contains(i))
						queue.add(i);
//					if(adjMatrix[node][i]<minWeight) {
//						minEdge = i;
//						minWeight = adjMatrix[node][i];
//					}
						
					if(d[i]> d[node] + adjMatrix[node][i]) 
						d[i]= d[node] + adjMatrix[node][i];
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
/*
 *
1
28 242
1 24 29
2 5 42
3 24 23
4 5 60
5 24 19
6 13 38
7 14 62
8 22 25
9 27 47
10 7 24
11 18 15
12 10 5
13 24 9
14 8 18
15 27 52
16 14 51
17 12 12
18 13 18
19 15 11
20 14 45
21 7 21
22 21 4
23 2 61
24 5 62
25 6 47
26 7 18
27 12 38
28 10 32
21 18 9
3 19 29
4 22 32
24 12 5
16 13 42
25 7 39
24 21 21
17 26 43
26 14 31
14 9 26
12 3 31
6 17 3
9 12 27
1 22 38
1 20 37
3 20 30
24 12 12
21 10 37
13 27 6
26 13 42
26 14 44
2 3 3
25 19 27
14 24 18
16 8 37
28 12 5
14 15 43
15 18 38
27 24 7
2 6 27
21 25 39
26 14 21
28 11 37
1 8 28
26 3 13
25 23 22
16 21 4
12 1 42
5 8 27
21 10 16
18 22 45
16 8 17
1 15 33
4 27 19
15 14 15
20 3 7
5 18 36
13 21 9
13 18 10
1 6 20
11 2 37
18 12 2
16 6 5
17 22 12
15 19 44
18 1 1
21 9 16
25 14 5
22 18 8
27 28 5
26 25 15
7 23 14
13 12 24
3 7 40
8 2 13
15 16 1
8 15 9
15 17 15
11 6 9
28 16 35
14 2 11
19 23 23
24 16 9
15 18 19
27 1 44
26 23 45
9 20 43
1 24 43
10 17 32
7 17 29
27 12 41
12 13 22
13 14 43
2 1 8
8 15 9
23 26 2
24 13 36
13 9 25
2 23 16
26 24 15
26 8 28
13 16 38
20 19 3
13 14 37
10 20 9
6 10 40
5 21 11
25 16 46
13 28 23
27 15 24
21 1 21
12 8 44
3 12 20
14 22 17
7 15 41
12 19 14
8 18 12
14 19 19
1 15 1
19 23 4
28 24 1
19 21 34
1 14 12
13 9 12
28 6 9
10 1 35
3 16 34
20 12 2
11 24 44
1 16 17
12 22 13
1 6 27
21 6 35
1 2 19
27 26 21
23 26 20
15 4 7
1 2 19
28 12 18
13 25 31
12 9 26
23 8 8
2 3 29
16 25 41
1 24 11
16 22 18
3 4 11
7 14 44
5 10 40
8 26 37
11 4 13
14 4 9
9 7 28
27 23 27
25 1 42
1 2 38
20 27 33
3 16 7
10 14 8
7 9 38
20 28 11
14 12 40
11 16 36
20 19 43
13 9 40
12 4 43
4 16 34
10 1 38
10 18 3
21 18 24
1 14 23
19 5 27
1 23 9
1 6 25
11 17 34
8 18 19
4 27 12
11 1 14
1 8 33
28 3 44
21 5 10
17 20 41
28 16 44
12 10 38
21 18 25
3 5 5
2 1 3
19 21 45
22 21 43
22 1 15
23 6 27
4 5 45
7 27 1
1 17 40
13 15 43
1 23 46
23 4 21
7 17 2
15 11 9
13 16 4
26 3 7
21 1 37
16 15 29
24 1 43
10 23 35
1 20 43
28 4 45
18 3 19
9 21 26
18 11 7
1 15 13
22 8 2
17 7 7
21 2 21
1 22 25
19 7 22
20 26 36
17 21 37
3 13 34
8 9 23
13 9 43
24 26 46
12 5 27
26 16 35
1
3 6 8 11 7 18 10 18 4 8 3 6 12 1 2 16 1 12 13 6 9 9 11 17 11 12 12 
3 6 8 11 7 12 10 18 4 8 3 6 12 1 2 10 1 8 5 6 9 9 8 17 11 12 8
 */