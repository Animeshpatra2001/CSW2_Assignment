/*Q1. Create a class BSTNode that contains a member 'info' to store a number, with 'left' referring to the left child and 'right' referring to the right child. Provide the necessary constructor. Additionally, create a method to insert a node into a binary search tree.
Q2. Write a program to add methods to the binary search tree created in Q1 for traversing the tree in pre-order, in-order, and post-order. Invoke the above methods for execution.*/
package dataStructure;

class BSTNode {
	int info;
	BSTNode left;
	BSTNode right;

	public BSTNode(int info) {
		this.info = info;
		this.left = null;
		this.right = null;
	}

	public void insert(int value) {
		if (value < this.info) {
			if (left == null) {
				left = new BSTNode(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new BSTNode(value);
			} else {
				right.insert(value);
			}
		}
	}

	public void preOrderTraversal() {
		System.out.println(this.info + " ");
		if (left != null) {
			left.preOrderTraversal();
		}
		if (right != null) {
			right.preOrderTraversal();
		}
	}

	public void inOrderTraversal() {
		if (left != null) {
			left.inOrderTraversal();
		}
		System.out.println(this.info + " ");
		if (right != null) {
			right.inOrderTraversal();
		}
	}

	public void postOrderTraversal() {
		if (left != null) {
			left.postOrderTraversal();
		}
		if (right != null) {
			right.postOrderTraversal();
		}
		System.out.println(this.info + " ");
	}
}

public class Q01AndQ02 {

	public static void main(String[] args) {
		BSTNode root = new BSTNode(30);
		root.insert(20);
		root.insert(21);
		root.insert(22);
		root.insert(31);
		System.out.println(root.info);
		System.out.println(root.left.info);
		System.out.println(root.left.right.info);
		System.out.println(root.right.info);
		System.out.println("Pre-Order Traversal: ");
		root.preOrderTraversal();
		System.out.println("in-Order Traversal: ");
		root.inOrderTraversal();
		System.out.println("Post-Order Traversal: ");
		root.postOrderTraversal();
	}

}
