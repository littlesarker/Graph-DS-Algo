import java.io.*;
import java.util.*;

public class BFS {

	private int vertices;
	private LinkedList<Integer> adj[];

	BFS(int v) {
		vertices = v;
		adj = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();

		}

	}

	void adEdge(int v, int d) {
		adj[v].add(d);
	}

	// BFS ALGO
	void bfs(int ver) {
		boolean vissited[] = new boolean[vertices];

		LinkedList<Integer> q = new LinkedList<>();

		vissited[ver] = true;

		q.add(ver);

		while (q.size() != 0) {
			ver = q.poll();

			System.out.print(ver +" ");

			Iterator<Integer> it = adj[ver].listIterator();

			while (it.hasNext()) {

				int n = it.next();
				if (!vissited[n]) {
					vissited[n] = true;
					q.add(n);
				}

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFS b = new BFS(5);

		b.adEdge(0, 1);
		b.adEdge(0, 2);
		b.adEdge(1, 2);
		b.adEdge(2, 0);
		b.adEdge(2, 3);
		b.adEdge(3, 3);

		b.bfs(0);

	}

}
