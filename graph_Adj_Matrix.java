import java.io.*;
import java.util.*;

public class graph_Adj_Matrix {

	private boolean adj[][];
	private int Vertices;

	// Initialize the matrix
	public graph_Adj_Matrix(int Vertices) {
		this.Vertices = Vertices;
		adj = new boolean[Vertices][Vertices];
	}

	// Add edges
	public void add(int i, int j) {
		adj[i][j] = true;
		adj[j][i] = true;
	}

	// Remove edges
	public void remove(int i, int j) {
		adj[i][j] = false;
		adj[j][i] = false;
	}

	// Print the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < Vertices; i++) {
			s.append(i + ": ");
			for (boolean j : adj[i]) {
				s.append((j ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		graph_Adj_Matrix g = new graph_Adj_Matrix(4);

		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 2);
		g.add(2, 0);
		g.add(2, 3);

		//you can remove by g.remove
		
		System.out.print(g.toString());

	}

}
