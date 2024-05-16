/*5. Develop a program that performs complex mathematical (may have log, trigonometric and algebraic functions) computations. Handle unchecked NullPointerException gracefully using try-catch block and provide a meaningful error message*/
package errorHandling;

public class Q05 {

	public static void main(String[] args) {
		try {
			double result = computation();
			System.out.println("Result: " + result);
		} catch (NullPointerException e) {
			System.out.println("Error is: " + e.getMessage());
		}
	}

	@SuppressWarnings("null")
	public static double computation() {
		Double value = null;
		double result = Math.sin(value);
		return result;
	}

}
