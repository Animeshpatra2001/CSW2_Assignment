/*9. Given an array of integers, print the repeating integers in the array with 
the help of a HashSet.*/
package genericsCollection;

import java.util.HashSet;

public class Q09_RepeatedInteger {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 3, 1, 8, 5, 0, 1, 8, 5, 2 };

		HashSet<Integer> numbers = new HashSet<>();
		HashSet<Integer> repeatedNumbers = new HashSet<>();

		for (int element : arr) {
			if (!numbers.add(element)) {
				repeatedNumbers.add(element);
			}
		}
		if (!repeatedNumbers.isEmpty()) {
			System.out.println("Repeated elements are:");
			for (int element : repeatedNumbers) {
				System.out.print(element + " ");
			}
		} else {
			System.out.println("There are no repeated elements present.");
		}

	}
}
