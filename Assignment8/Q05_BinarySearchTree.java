/*Q5. Construct a binary search tree (BST) from the given array of elements: {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}. Include a method called 'CreateTree' to construct the binary search tree from a sorted array. This method takes an array of integers as input and constructs the tree recursively using a binary search algorithm*/
package dataStructure;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Q05_BinarySearchTree {
	public TreeNode createTree(int[] arr) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		return createTreeHelper(arr, 0, arr.length - 1);
	}

	private TreeNode createTreeHelper(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = createTreeHelper(arr, start, mid - 1);
		root.right = createTreeHelper(arr, mid + 1, end);
		return root;
	}

	public static void printInOrder(TreeNode root) {
		if (root != null) {
			printInOrder(root.left);
			System.out.print(root.val + " ");
			printInOrder(root.right);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Q05_BinarySearchTree bst = new Q05_BinarySearchTree();
		TreeNode root = bst.createTree(arr);
		System.out.println("Binary Search Tree constructed from the given array:");
		printInOrder(root);
	}

}