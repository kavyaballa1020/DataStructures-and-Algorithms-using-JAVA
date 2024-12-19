package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph {
	class edge {
		int src;
		int des;

		public edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}

	public void create(ArrayList<edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<edge>();
		}
		graph[0].add(new edge(0, 2));
		graph[1].add(new edge(1, 2));
		graph[1].add(new edge(1, 3));
		graph[2].add(new edge(2, 0));
		graph[2].add(new edge(2, 1));
		graph[2].add(new edge(2, 3));
		graph[3].add(new edge(3, 2));
		graph[3].add(new edge(3, 1));
	}

	public void bfs(ArrayList<edge> graph[], int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[v];
		q.add(0);
		while (!q.isEmpty()) {
			int current = q.remove();
			if (visited[current] == false) {
				System.out.print(current + " ");
				visited[current] = true;
				for (int i = 0; i < graph[current].size(); i++) {
					edge e=graph[current].get(i);
					q.add(e.des);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS_Graph g = new BFS_Graph();
		int v = 4;
		ArrayList<edge> graph[] = new ArrayList[v];
		g.create(graph);
		g.bfs(graph, v);
	}

}
