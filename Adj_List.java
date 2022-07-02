import java.io.*;
import java.util.*;

public class Adj_List {

	static void ad(ArrayList<ArrayList<Integer>> am, int ss, int dd) {
		am.get(ss).add(dd);
		am.get(dd).add(ss);
	}

	static void printGraph(ArrayList<ArrayList<Integer>> am) {
		for (int i = 0; i < am.size(); i++) {
			System.out.println("\nVertex " + i + ":");
			for (int j = 0; j < am.get(i).size(); j++) {
				System.out.print(" -> " + am.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int V = 5;
		    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

		    for (int i = 0; i < V; i++)
		      am.add(new ArrayList<Integer>());

		    // Add edges
		    ad(am, 0, 1);
		    ad(am, 0, 2);
		    ad(am, 0, 3);
		    ad(am, 1, 2);

		    printGraph(am);
		
		
	}

}
