/*20. Develop a recursive algorithm implemented in Java that traverses or manipulates arrays. Introduce scenarios where the recursion reaches beyond the bounds of the array, resulting in ArrayIndexOutOfBoundsException. Your task is to handle these exceptions within the recursive algorithm and ensure proper termination of recursion.*/
package errorHandling;

public class Q20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		traverseArray(array, 0);
	}

	public static void traverseArray(int[] array, int index) {
		if (index >= array.length) {
			System.out.println("End of array reached. Recursion terminated.");
			return;
		}
		try {
			System.out.println("Element at index " + index + ": " + array[index]);
			traverseArray(array, index + 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			traverseArray(array, index + 1);
		}
	}
}
