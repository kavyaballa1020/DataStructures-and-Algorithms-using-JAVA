package Graph;

import java.util.*;

public class AdjacencyLIst_Graph {
	class edge {
		int s;
		int d;

		public edge(int s, int d) {
			this.s = s;
			this.d = d;
		}
	}

	public void createGraph(ArrayList<edge> graph[]) {
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

	public static void main(String[] args) {
		AdjacencyLIst_Graph graph = new AdjacencyLIst_Graph();
		int v = 4;
		ArrayList<edge> g[] = new ArrayList[v];
		graph.createGraph(g);
	}

}
