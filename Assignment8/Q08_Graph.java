/*Q8. Write a program to implement the graph using adjacency matrix representation and adjacency list representation. Create methods to display the adjacency matrix and adjacency list of the graph.*/
package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q08_Graph {
	private int vertices;
	private int[][] adjacencyMatrix;
	private List<List<Integer>> adjacencyList;

	public Q08_Graph(int vertices) {
		this.vertices = vertices;
		adjacencyMatrix = new int[vertices][vertices];
		adjacencyList = new ArrayList<>(vertices);
		for (int i = 0; i < vertices; i++) {
			adjacencyList.add(new LinkedList<>());
		}
	}

	public void addEdge(int source, int destination) {

		adjacencyMatrix[source][destination] = 1;
		adjacencyMatrix[destination][source] = 1;

		adjacencyList.get(source).add(destination);
		adjacencyList.get(destination).add(source);
	}

	public void displayAdjacencyMatrix() {
		System.out.println("Adjacency Matrix:");
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void displayAdjacencyList() {
		System.out.println("Adjacency List:");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + ": ");
			for (Integer node : adjacencyList.get(i)) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q08_Graph graph = new Q08_Graph(5);

		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		graph.displayAdjacencyMatrix();
		graph.displayAdjacencyList();
	}
}