/*15. Demonstration of use nested try-catch block. Write a Java program to handle NumberFormatException in outer try-catch block and ArithmeticException inside the inner try-catch block*/
package errorHandling;

import java.util.Scanner;

public class Q15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a number:");
			String input = scanner.nextLine();
			try {
				int number = Integer.parseInt(input);
				try {
					int result = divideByNumber(number);
					System.out.println("Result: " + result);
				} catch (ArithmeticException e) {
					System.err.println("ArithmeticException: " + e.getMessage());
				}
			} catch (NumberFormatException e) {
				System.err.println("NumberFormatException: Invalid input. Please enter a valid integer.");
			}
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}

	public static int divideByNumber(int number) throws ArithmeticException {
		if (number == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return 100 / number;
	}
}
