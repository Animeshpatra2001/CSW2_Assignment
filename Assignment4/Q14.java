/*14. Implement a Java application that computes the value of the expression log(abs(sin(x) + cos(x))) / (tan(x) - cot(x)) for a given value of x. Ensure proper error handling for potential arithmetic exceptions and negative values inside the logarithmic function.*/
package errorHandling;

import java.util.Scanner;

public class Q14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		double x = scanner.nextDouble();
		try {
			double result = calculateExpression(x);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static double calculateExpression(double x) throws ArithmeticException {
		double sinX = Math.sin(x);
		double cosX = Math.cos(x);
		double tanX = Math.tan(x);
		double cotX = 1.0 / tanX;
		double expressionNumerator = Math.log(Math.abs(sinX + cosX));
		double expressionDenominator = tanX - cotX;
		if (Double.isNaN(expressionNumerator) || Double.isNaN(expressionDenominator)) {
			throw new ArithmeticException("Invalid input: Math operation resulted in NaN (Not-a-Number).");
		}
		if (expressionDenominator == 0) {
			throw new ArithmeticException("Invalid input: Division by zero.");
		}
		if (expressionNumerator < 0) {
			throw new ArithmeticException("Invalid input: Logarithm of a negative number is not defined.");
		}
		return expressionNumerator / expressionDenominator;
	}
}
