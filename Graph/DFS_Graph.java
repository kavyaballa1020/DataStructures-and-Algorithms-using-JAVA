package Graph;

import java.util.ArrayList;
public class DFS_Graph {
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

	public void dfs(ArrayList<edge> graph[], int current, boolean visited[]) {
		System.out.print(current + " ");
		visited[current] = true;
		for (int i = 0; i < graph[current].size(); i++) {
			edge e = graph[current].get(i);
			if (visited[e.des] == false) {
				dfs(graph, e.des, visited);
			}
		}
	}

	public static void main(String[] args) {
		DFS_Graph g = new DFS_Graph();
		int v = 4;
		int current = 0;
		ArrayList<edge> graph[] = new ArrayList[v];
		boolean visited[] = new boolean[v];
		g.create(graph);
		g.dfs(graph, 0, visited);
	}

}
