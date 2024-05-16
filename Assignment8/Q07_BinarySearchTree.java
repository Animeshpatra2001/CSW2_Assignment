/*Q7. Remove node x from the binary search tree and reorganize the nodes to maintain its necessary properties.
There are three cases in the deletion process. Let us denote the node that needs to be deleted as
x:
Case 1: Node x has no children.
Case 2: Node x has one child.
Case 3: Node x has two children. */
package dataStructure;

class Node {
	int value;
	Node left, right;

	Node(int item) {
		value = item;
		left = right = null;
	}
}

class BinarySearchTree {
	Node root;

	BinarySearchTree() {
		root = null;
	}

	void delete(int value) {
		root = deleteRec(root, value);
	}

	Node deleteRec(Node root, int value) {
		if (root == null) {
			return root;
		}

		if (value < root.value) {
			root.left = deleteRec(root.left, value);
		} else if (value > root.value) {
			root.right = deleteRec(root.right, value);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}

			root.value = minValue(root.right);
			root.right = deleteRec(root.right, root.value);
		}
		return root;
	}

	int minValue(Node node) {
		int minv = node.value;
		while (node.left != null) {
			minv = node.left.value;
			node = node.left;
		}
		return minv;
	}

	void insert(int value) {
		root = insertRec(root, value);
	}

	Node insertRec(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		if (value < root.value) {
			root.left = insertRec(root.left, value);
		} else if (value > root.value) {
			root.right = insertRec(root.right, value);
		}

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.value + " ");
			inorderRec(root.right);
		}
	}
}

public class Q07_BinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		System.out.println("Inorder traversal of the given tree:");
		tree.inorder();

		System.out.println("\n\nDelete 20:");
		tree.delete(20);
		System.out.println("Inorder traversal of the modified tree:");
		tree.inorder();

		System.out.println("\n\nDelete 30:");
		tree.delete(30);
		System.out.println("Inorder traversal of the modified tree:");
		tree.inorder();

		System.out.println("\n\nDelete 50:");
		tree.delete(50);
		System.out.println("Inorder traversal of the modified tree:");
		tree.inorder();
	}
}
