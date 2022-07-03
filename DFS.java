import java.io.*;
import java.util.*;

public class DFS {

	private LinkedList<Integer> adj[];

	private boolean visited[];

	DFS(int v) {
		adj = new LinkedList[v];
		visited = new boolean[v];

		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int src, int dest) {
		adj[src].add(dest);
	}

	void DFS(int vertex) {
		visited[vertex] = true;
		System.out.println(vertex + " ");

		Iterator<Integer> it = adj[vertex].listIterator();

		while (it.hasNext()) {
			int adj = it.next();
			if (!visited[adj])
				DFS(adj);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DFS gg = new DFS(5);

		gg.addEdge(0, 1);
		gg.addEdge(0, 2);
		gg.addEdge(1, 0);
		gg.addEdge(1, 3);
		gg.addEdge(2, 0);

		gg.DFS(0);

	}

}
