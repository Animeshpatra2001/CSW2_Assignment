/*17. Implement a Java program that involves dynamic data structures such as linked lists or trees, where elements are stored in arrays. Introduce scenarios, where accessing elements beyond the bounds of the array backing the data structure results in ArrayIndexOutOfBoundsException. Your task is to implement bounds checking and handle these exceptions effectively while maintaining the integrity of the data structure.*/
package errorHandling;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListExample {
	private Node head;

	public LinkedListExample() {
		this.head = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public int getElementAtIndex(int index) {
		if (head == null || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Index out of bounds");
		}
		Node current = head;
		for (int i = 0; i < index; i++) {
			if (current.next == null) {
				throw new ArrayIndexOutOfBoundsException("Index out of bounds");
			}
			current = current.next;
		}
		return current.data;
	}
}

public class Q17 {
	public static void main(String[] args) {
		LinkedListExample linkedList = new LinkedListExample();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		try {
			System.out.println("Element at index 0: " + linkedList.getElementAtIndex(0));
			System.out.println("Element at index 1: " + linkedList.getElementAtIndex(1));
			System.out.println("Element at index 2: " + linkedList.getElementAtIndex(2));
			System.out.println("Element at index 3: " + linkedList.getElementAtIndex(3));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}
}