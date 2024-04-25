/*6. Write a program to create a TreeSet of Integer type and perform the
below 
operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it present in 
the 
list or not.
(c.) Remove an element from tree.*/
package genericsCollection;

import java.util.Scanner;
import java.util.TreeSet;

public class Q06_TreeSetOperations {
	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(25);

		System.out.println("TreeSet: " + treeSet);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number to search: ");
		int searchNumber = scanner.nextInt();

		if (treeSet.contains(searchNumber)) {
			System.out.println("Number " + searchNumber + " is present in the TreeSet.");
		} else {
			System.out.println("Number " + searchNumber + " is not present in the TreeSet.");
		}

		System.out.print("Enter a number to remove: ");
		int removeNumber = scanner.nextInt();
		if (treeSet.remove(removeNumber)) {
			System.out.println("Number " + removeNumber + " removed from the TreeSet.");
			System.out.println("Updated TreeSet: " + treeSet);
		} else {
			System.out.println("Number " + removeNumber + " is not present in the TreeSet.");
		}
	}
}
