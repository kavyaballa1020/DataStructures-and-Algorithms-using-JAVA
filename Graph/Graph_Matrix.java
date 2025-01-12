package Graph;
import java.util.Arrays;

class graph{
	private int vertices;
	private int[][] adj_matrix;
	public graph(int vertices) {
		this.vertices=vertices;
		adj_matrix=new int[vertices][vertices];
		for(int i=0;i<vertices;i++) {
			Arrays.fill(adj_matrix[i], 0);
		}
	}
	public void addEdge(int src,int des) {
		adj_matrix[src][des]=1;
		adj_matrix[des][src]=1;
	}
	public void removeEdge(int src,int des) {
		adj_matrix[src][des]=0;
		adj_matrix[des][src]=0;
	}
	public void display() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(adj_matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class Graph_Matrix {

	public static void main(String[] args) {
		int vertices=4;
		graph g=new graph(vertices);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.display();
	}

}
