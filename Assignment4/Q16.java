/*16. Create a Java program to handle ArrayIndexOutOfBoundsException.*/
package errorHandling;

import java.util.Scanner;

public class Q16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = scanner.nextInt();
		int[] array = new int[size];
		try {
			System.out.println("Enter the index to access:");
			int index = scanner.nextInt();
			int value = array[index];
			System.out.println("Value at index " + index + ": " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds: " + e.getMessage());
		}
	}
}
