/*22. Create a custom checked exception class named CustomCheckedException. Use this exception in your program to handle a specific error condition and demonstrate its usage using try-catch block.*/
package errorHandling;

@SuppressWarnings("serial")
class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}

public class Q22 {
	public static void main(String[] args) {
		try {
			int result = performOperation(10, 0);
			System.out.println("Result of operation: " + result);
		} catch (CustomCheckedException e) {
			System.err.println("CustomCheckedException caught: " + e.getMessage());
		}
	}

	public static int performOperation(int dividend, int divisor) throws CustomCheckedException {
		if (divisor == 0) {
			throw new CustomCheckedException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
}
