/*Q10. Write a Java program to traverse a Graph1 using breadth-first search (BFS) and provide the final output of the code. (Use the ArrayDeque collection.)*/
package dataStructure;

import java.util.*;

class Graph1 {
	private int vertices;
	private LinkedList<Integer>[] adjacencyList;

	@SuppressWarnings("unchecked")
	public Graph1(int vertices) {
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

	public void BFS(int startVertex) {
		boolean[] visited = new boolean[vertices];
		ArrayDeque<Integer> queue = new ArrayDeque<>();

		visited[startVertex] = true;
		queue.add(startVertex);

		System.out.println("BFS starting from vertex " + startVertex + ":");

		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.print(vertex + " ");

			for (Integer adj : adjacencyList[vertex]) {
				if (!visited[adj]) {
					visited[adj] = true;
					queue.add(adj);
				}
			}
		}
	}
}

public class Q10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of vertices: ");
		int vertices = scanner.nextInt();
		Graph1 Graph1 = new Graph1(vertices);

		System.out.print("Enter the number of edges: ");
		int edges = scanner.nextInt();

		System.out.println("Enter the edges (source and destination): ");
		for (int i = 0; i < edges; i++) {
			int source = scanner.nextInt();
			int destination = scanner.nextInt();
			Graph1.addEdge(source, destination);
		}

		Graph1.displayAdjacencyList();

		System.out.print("Enter the starting vertex for BFS: ");
		int startVertex = scanner.nextInt();

		Graph1.BFS(startVertex);
	}
}