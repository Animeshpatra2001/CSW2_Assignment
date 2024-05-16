/*Q9. Create a class Graph with a linked list member to represent N number of vertices.Implement the required constructor. Add a method to the Graph class for reading a graph and storing it in an adjacency list representation. Include a depth-first search (DFS) method in the Graph class to traverse the vertices of the graph, and a main method to invoke all the methods.*/
package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

class Graph {
	private int vertices;
	private LinkedList<Integer>[] adjacencyList;

	@SuppressWarnings("unchecked")
	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		adjacencyList[source].add(destination);
		adjacencyList[destination].add(source);
	}

	public void displayAdjacencyList() {
		System.out.println("Adjacency List:");
		for (int i = 0; i < vertices; i++) {
			System.out.print(i + ": ");
			for (Integer node : adjacencyList[i]) {
				System.out.print(node + " ");
			}
			System.out.println();
		}
	}

	public void DFS(int startVertex) {
		boolean[] visited = new boolean[vertices];
		DFSUtil(startVertex, visited);
	}

	private void DFSUtil(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print(vertex + " ");

		for (Integer adj : adjacencyList[vertex]) {
			if (!visited[adj]) {
				DFSUtil(adj, visited);
			}
		}
	}
}

public class Q09 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of vertices: ");
		int vertices = scanner.nextInt();
		Graph graph = new Graph(vertices);

		System.out.print("Enter the number of edges: ");
		int edges = scanner.nextInt();

		System.out.println("Enter the edges (source and destination): ");
		for (int i = 0; i < edges; i++) {
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			graph.addEdge(source, destination);
		}

		graph.displayAdjacencyList();

		System.out.print("Enter the starting vertex for DFS: ");
		int startVertex = scanner.nextInt();

		System.out.println("DFS starting from vertex " + startVertex + ":");
		graph.DFS(startVertex);
	}
}
