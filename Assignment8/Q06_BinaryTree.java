/*Q6. Determine if a given binary tree is a binary search tree. You will use an 'isBST()' method, which takes the maximum and minimum range of the values of the nodes.*/
package dataStructure;

class Tree {
	int val;
	Tree left;
	Tree right;

	public Tree(int val) {
		this.val = val;
	}
}

public class Q06_BinaryTree {
	public boolean isBST(Tree root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBSTUtil(Tree node, int min, int max) {
		if (node == null)
			return true;
		if (node.val <= min || node.val >= max)
			return false;
		return isBSTUtil(node.left, min, node.val) && isBSTUtil(node.right, node.val, max);
	}

	public static void main(String[] args) {
		Q06_BinaryTree tree = new Q06_BinaryTree();
		Tree root = new Tree(4);
		root.left = new Tree(2);
		root.right = new Tree(5);
		root.left.right = new Tree(3);
		root.left.left = new Tree(1);
		if (tree.isBST(root)) {
			System.out.println("This tree is a binary search tree.");
		} else {
			System.out.println("This tree is not a binary search tree.");
		}
	}

}
