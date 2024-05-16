/*11. Write a Java program that computes the value of the function log(sin(x) + cos(x)) / (tan(x) - cot(x)) for a given value of x. Ensure proper handling of exceptions that may occur due to invalid mathematical operations*/
package errorHandling;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the value of x in radians: ");
			double x = scanner.nextDouble();
			double result = evaluateFunction(x);

			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static double evaluateFunction(double x) throws IllegalArgumentException {
		double sinValue = Math.sin(x);
		double cosValue = Math.cos(x);
		double tanValue = Math.tan(x);
		double cotValue = 1.0 / Math.tan(x); // cot(x) is 1 / tan(x)

		if (Double.isNaN(sinValue) || Double.isNaN(cosValue) || Double.isInfinite(tanValue)
				|| Double.isInfinite(cotValue)) {
			throw new IllegalArgumentException("Invalid mathematical operation. Please provide a valid value of x.");
		}

		double functionValue = Math.log(sinValue + cosValue) / (tanValue - cotValue);
		return functionValue;
	}
}
