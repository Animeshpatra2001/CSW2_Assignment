/*Q3. Create a class Country containing members for name and population, along with a constructor and necessary methods. Additionally, create a class BNode with a member 'info' to store a country object, 'left' to refer to the left child, and 'right' to refer to the right child. Provide the required constructor. Finally, create another class BST with a member 'root', along with the necessary constructor and a method to insert a node into the binary search tree.
Q4. Extend the BST created in Q3 by adding methods to traverse the tree in level order, find the node with the maximum population (find-max), and find the node with the minimum population (find-min). Invoke these methods for execution.*/
package dataStructure;

import java.util.*;

class Country {
	String name;
	int population;

	public Country(String name, int population) {
		this.name = name;
		this.population = population;
	}
}

class BNode {
	Country info;
	BNode left;
	BNode right;

	public BNode(Country info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}
}

class BST {
	BNode root;

	public void insert(Country country) {
		root = insertNode(root, country);
	}

	private BNode insertNode(BNode node, Country country) {
		if (node == null) {
			return new BNode(country);
		}

		if (country.population < node.info.population) {
			node.left = insertNode(node.left, country);
		} else if (country.population > node.info.population) {
			node.right = insertNode(node.right, country);
		}
		return node;
	}

	public void levelOrderTraversal() {
		if (root == null) {
			return;
		}
		Queue<BNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			BNode current = queue.poll();
			System.out.println(current.info.name + ": " + current.info.population);

			if (current.left != null) {
				queue.offer(current.left);
			}
			if (current.right != null) {
				queue.offer(current.right);
			}
		}
	}

	public BNode findMax() {
		if (root == null) {
			return null;
		}
		BNode current = root;
		while (current.right != null) {
			current = current.right;
		}
		return current;
	}

	public BNode findMin() {
		if (root == null) {
			return null;
		}
		BNode current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

}

public class Q03AndQ04 {

	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(new Country("USA", 123456));
		bst.insert(new Country("India", 12345678));
		bst.insert(new Country("China", 12345));
		bst.insert(new Country("Brazil", 1234567));

		System.out.println("Level Order Traversal: ");
		bst.levelOrderTraversal();

		System.out.println("\nCountry with maximum population: ");
		BNode maxNode = bst.findMax();
		if (maxNode != null) {
			System.out.println(maxNode.info.name + ": " + maxNode.info.population);
		}

		System.out.println("\nCountry with minimum population: ");
		BNode minNode = bst.findMin();
		if (minNode != null) {
			System.out.println(minNode.info.name + ": " + minNode.info.population);
		}
	}

}
