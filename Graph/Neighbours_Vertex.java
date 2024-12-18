package Graph;

import java.util.ArrayList;

public class Neighbours_Vertex {
	public class edge {
		int src;
		int des;

		public edge(int src, int des) {
			this.src = src;
			this.des = des;
		}
	}
	public void create(ArrayList<edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<edge>();
		}
		graph[0].add(new edge(0,2));
		graph[1].add(new edge(1,2));
		graph[1].add(new edge(1, 3));
		graph[2].add(new edge(2, 0));
		graph[2].add(new edge(2, 1));
		graph[2].add(new edge(2, 3));
		graph[3].add(new edge(3, 2));
		graph[3].add(new edge(3, 1));
	}

	public static void main(String[] args) {
		Neighbours_Vertex g = new Neighbours_Vertex();
		int v=4;
		ArrayList<edge> graph[]=new ArrayList[v];
		g.create(graph);
		for(int i=0;i<graph[3].size();i++) {
			edge e=graph[3].get(i);
			System.out.println(e.des);
		}
	}

}
