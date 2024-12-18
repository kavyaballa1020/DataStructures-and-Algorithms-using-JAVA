package Graph;

import java.util.ArrayList;

import Graph.AdjacencyLIst_Graph.edge;

public class Weighted_Graph {
	public class edge {
		int src;
		int des;
		int weight;

		public edge(int src, int des, int weight) {
			this.src = src;
			this.des = des;
			this.weight = weight;
		}
	}

	public void create(ArrayList<edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<edge>();
		}
		graph[0].add(new edge(0,2,10));
		graph[1].add(new edge(1, 2,1));
		graph[1].add(new edge(1, 3,45));
		graph[2].add(new edge(2, 0,-2));
		graph[2].add(new edge(2, 1,6));
		graph[2].add(new edge(2, 3,5));
		graph[3].add(new edge(3, 2,3));
		graph[3].add(new edge(3, 1,-2));
	}

	public static void main(String[] args) {
		Weighted_Graph g=new Weighted_Graph();
		int v = 4;
		ArrayList<edge> graph[] = new ArrayList[v];
		g.create(graph);
		for(int i=0;i<graph[2].size();i++) {
			edge e=graph[2].get(i);
			System.out.println(e.des+" "+e.weight);
		}
	}

}
